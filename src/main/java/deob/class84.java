package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ct")
public class class84 {

    @ObfuscatedName("ct.h")
    public static int[] field1345 = new int[5];

    @ObfuscatedName("ct.t")
    public static int[][] field1342 = new int[5][5000];

    @ObfuscatedName("ct.p")
    public static int[] field1338 = new int[1000];

    @ObfuscatedName("ct.n")
    public static String[] field1344 = new String[1000];

    @ObfuscatedName("ct.o")
    public static int field1347 = 0;

    @ObfuscatedName("ct.q")
    public static class63[] field1346 = new class63[50];

    @ObfuscatedName("ct.e")
    public static Calendar field1350 = Calendar.getInstance();

    @ObfuscatedName("ct.r")
    public static final String[] field1348 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ct.y")
    public static int field1349 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.s(Lbg;B)V")
    public static void method152(class70 arg0) {
        method998(arg0, 200000);
    }

    @ObfuscatedName("be.c(Lbg;II)V")
    public static void method998(class70 arg0, int arg1) {
        Object[] var2 = arg0.field838;
        class100 var12;
        if (class223.method2703(arg0.field833)) {
            Statics.field807 = (class48) var2[0];
            class246 var3 = Statics.field3305[Statics.field807.field595];
            class223 var4 = arg0.field833;
            int var5 = var3.field3319;
            int var6 = var3.field3325;
            int var7 = class228.method3924(var5, var4);
            class100 var8 = Statics.method4135(var7, var4);
            class100 var9;
            if (var8 == null) {
                int var10 = Statics.method23(var6, var4);
                class100 var11 = Statics.method4135(var10, var4);
                if (var11 == null) {
                    var9 = null;
                } else {
                    var9 = var11;
                }
            } else {
                var9 = var8;
            }
            var12 = var9;
        } else {
            int var13 = (Integer) var2[0];
            var12 = class100.method2694(var13);
        }
        if (var12 == null) {
            return;
        }
        Statics.field424 = 0;
        Statics.field282 = 0;
        int var14 = -1;
        int[] var15 = var12.field1530;
        int[] var16 = var12.field1523;
        byte var17 = -1;
        field1347 = 0;
        try {
            Statics.field1340 = new int[var12.field1524];
            int var18 = 0;
            Statics.field1766 = new String[var12.field1526];
            int var19 = 0;
            for (int var20 = 1; var20 < var2.length; var20++) {
                if (var2[var20] instanceof Integer) {
                    int var21 = (Integer) var2[var20];
                    if (var21 == -2147483647) {
                        var21 = arg0.field827;
                    }
                    if (var21 == -2147483646) {
                        var21 = arg0.field831;
                    }
                    if (var21 == -2147483645) {
                        var21 = arg0.field830 == null ? -1 : arg0.field830.field2668;
                    }
                    if (var21 == -2147483644) {
                        var21 = arg0.field832;
                    }
                    if (var21 == -2147483643) {
                        var21 = arg0.field830 == null ? -1 : arg0.field830.field2669;
                    }
                    if (var21 == -2147483642) {
                        var21 = arg0.field829 == null ? -1 : arg0.field829.field2668;
                    }
                    if (var21 == -2147483641) {
                        var21 = arg0.field829 == null ? -1 : arg0.field829.field2669;
                    }
                    if (var21 == -2147483640) {
                        var21 = arg0.field834;
                    }
                    if (var21 == -2147483639) {
                        var21 = arg0.field835;
                    }
                    Statics.field1340[var18++] = var21;
                } else if (var2[var20] instanceof String) {
                    String var22 = (String) var2[var20];
                    if (var22.equals("event_opbase")) {
                        var22 = arg0.field836;
                    }
                    Statics.field1766[var19++] = var22;
                }
            }
            int var23 = 0;
            field1349 = arg0.field837;
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
                                                                                                                label1532: while (true) {
                                                                                                                    var23++;
                                                                                                                    if (var23 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var14++;
                                                                                                                    int var300 = var15[var14];
                                                                                                                    if (var300 >= 100) {
                                                                                                                        boolean var72;
                                                                                                                        if (var12.field1523[var14] == 1) {
                                                                                                                            var72 = true;
                                                                                                                        } else {
                                                                                                                            var72 = false;
                                                                                                                        }
                                                                                                                        int var73;
                                                                                                                        if (var300 < 1000) {
                                                                                                                            var73 = method1752(var300, var12, var72);
                                                                                                                        } else if (var300 < 1100) {
                                                                                                                            var73 = method1388(var300, var12, var72);
                                                                                                                        } else if (var300 < 1200) {
                                                                                                                            var73 = method2847(var300, var12, var72);
                                                                                                                        } else if (var300 < 1300) {
                                                                                                                            var73 = method713(var300, var12, var72);
                                                                                                                        } else if (var300 < 1400) {
                                                                                                                            var73 = method50(var300, var12, var72);
                                                                                                                        } else if (var300 < 1500) {
                                                                                                                            var73 = method20(var300, var12, var72);
                                                                                                                        } else if (var300 < 1600) {
                                                                                                                            var73 = method902(var300, var12, var72);
                                                                                                                        } else if (var300 < 1700) {
                                                                                                                            class220 var74 = var72 ? Statics.field1542 : Statics.field813;
                                                                                                                            byte var75;
                                                                                                                            if (var300 == 1600) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2694;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1601) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2690;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1602) {
                                                                                                                                field1344[++Statics.field282 - 1] = var74.field2728;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1603) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2691;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1604) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2748;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1605) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2782;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1606) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2719;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1607) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2738;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1608) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2720;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1609) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2699;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1610) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2700;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1611) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2798;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1612) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2735;
                                                                                                                                var75 = 1;
                                                                                                                            } else if (var300 == 1613) {
                                                                                                                                field1338[++Statics.field424 - 1] = var74.field2698.method16();
                                                                                                                                var75 = 1;
                                                                                                                            } else {
                                                                                                                                var75 = 2;
                                                                                                                            }
                                                                                                                            var73 = var75;
                                                                                                                        } else if (var300 < 1800) {
                                                                                                                            class220 var79 = var72 ? Statics.field1542 : Statics.field813;
                                                                                                                            byte var80;
                                                                                                                            if (var300 == 1700) {
                                                                                                                                field1338[++Statics.field424 - 1] = var79.field2788;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var300 == 1701) {
                                                                                                                                if (var79.field2788 == -1) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var79.field2672;
                                                                                                                                }
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var300 == 1702) {
                                                                                                                                field1338[++Statics.field424 - 1] = var79.field2669;
                                                                                                                                var80 = 1;
                                                                                                                            } else {
                                                                                                                                var80 = 2;
                                                                                                                            }
                                                                                                                            var73 = var80;
                                                                                                                        } else if (var300 < 1900) {
                                                                                                                            class220 var81 = var72 ? Statics.field1542 : Statics.field813;
                                                                                                                            byte var82;
                                                                                                                            if (var300 == 1800) {
                                                                                                                                field1338[++Statics.field424 - 1] = class221.method95(client.method1955(var81));
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var300 == 1801) {
                                                                                                                                int var83 = field1338[--Statics.field424];
                                                                                                                                int var301 = var83 - 1;
                                                                                                                                if (var81.field2712 == null || var301 >= var81.field2712.length || var81.field2712[var301] == null) {
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1344[++Statics.field282 - 1] = var81.field2712[var301];
                                                                                                                                }
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var300 == 1802) {
                                                                                                                                if (var81.field2687 == null) {
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1344[++Statics.field282 - 1] = var81.field2687;
                                                                                                                                }
                                                                                                                                var82 = 1;
                                                                                                                            } else {
                                                                                                                                var82 = 2;
                                                                                                                            }
                                                                                                                            var73 = var82;
                                                                                                                        } else if (var300 < 2000) {
                                                                                                                            var73 = method990(var300, var12, var72);
                                                                                                                        } else if (var300 < 2100) {
                                                                                                                            var73 = method1388(var300, var12, var72);
                                                                                                                        } else if (var300 < 2200) {
                                                                                                                            var73 = method2847(var300, var12, var72);
                                                                                                                        } else if (var300 < 2300) {
                                                                                                                            var73 = method713(var300, var12, var72);
                                                                                                                        } else if (var300 < 2400) {
                                                                                                                            var73 = method50(var300, var12, var72);
                                                                                                                        } else if (var300 < 2500) {
                                                                                                                            var73 = method20(var300, var12, var72);
                                                                                                                        } else if (var300 < 2600) {
                                                                                                                            var73 = method24(var300, var12, var72);
                                                                                                                        } else if (var300 < 2700) {
                                                                                                                            var73 = method2428(var300, var12, var72);
                                                                                                                        } else if (var300 < 2800) {
                                                                                                                            var73 = method2892(var300, var12, var72);
                                                                                                                        } else if (var300 < 2900) {
                                                                                                                            var73 = method549(var300, var12, var72);
                                                                                                                        } else if (var300 < 3000) {
                                                                                                                            var73 = method990(var300, var12, var72);
                                                                                                                        } else if (var300 < 3200) {
                                                                                                                            byte var85;
                                                                                                                            if (var300 == 3100) {
                                                                                                                                String var84 = field1344[--Statics.field282];
                                                                                                                                class99.method968(0, "", var84);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3101) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                client.method948(Statics.field300, field1338[Statics.field424], field1338[Statics.field424 + 1]);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3103) {
                                                                                                                                client.method1747();
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3104) {
                                                                                                                                String var86 = field1344[--Statics.field282];
                                                                                                                                int var87 = 0;
                                                                                                                                if (class274.method2906(var86)) {
                                                                                                                                    int var88 = class274.method3810(var86, 10, true);
                                                                                                                                    var87 = var88;
                                                                                                                                }
                                                                                                                                client.field958.method3195(103);
                                                                                                                                client.field958.method2953(var87);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3105) {
                                                                                                                                String var89 = field1344[--Statics.field282];
                                                                                                                                client.field958.method3195(53);
                                                                                                                                client.field958.method3129(var89.length() + 1);
                                                                                                                                client.field958.method2956(var89);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3106) {
                                                                                                                                String var90 = field1344[--Statics.field282];
                                                                                                                                client.field958.method3195(168);
                                                                                                                                client.field958.method3129(var90.length() + 1);
                                                                                                                                client.field958.method2956(var90);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3107) {
                                                                                                                                int var91 = field1338[--Statics.field424];
                                                                                                                                String var92 = field1344[--Statics.field282];
                                                                                                                                client.method667(var91, var92);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3108) {
                                                                                                                                Statics.field424 -= 3;
                                                                                                                                int var93 = field1338[Statics.field424];
                                                                                                                                int var94 = field1338[Statics.field424 + 1];
                                                                                                                                int var95 = field1338[Statics.field424 + 2];
                                                                                                                                class220 var96 = class220.method2339(var95);
                                                                                                                                client.method359(var96, var93, var94);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3109) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var97 = field1338[Statics.field424];
                                                                                                                                int var98 = field1338[Statics.field424 + 1];
                                                                                                                                class220 var99 = var72 ? Statics.field1542 : Statics.field813;
                                                                                                                                client.method359(var99, var97, var98);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3110) {
                                                                                                                                Statics.field242 = field1338[--Statics.field424] == 1;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3111) {
                                                                                                                                field1338[++Statics.field424 - 1] = Statics.field1375.field1314 ? 1 : 0;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3112) {
                                                                                                                                Statics.field1375.field1314 = field1338[--Statics.field424] == 1;
                                                                                                                                class82.method221();
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3113) {
                                                                                                                                String var100 = field1344[--Statics.field282];
                                                                                                                                boolean var101 = field1338[--Statics.field424] == 1;
                                                                                                                                class57.method116(var100, var101, "openjs", false);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3115) {
                                                                                                                                int var102 = field1338[--Statics.field424];
                                                                                                                                client.field958.method3195(222);
                                                                                                                                client.field958.method2951(var102);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var300 == 3116) {
                                                                                                                                int var103 = field1338[--Statics.field424];
                                                                                                                                Statics.field282 -= 2;
                                                                                                                                String var104 = field1344[Statics.field282];
                                                                                                                                String var105 = field1344[Statics.field282 + 1];
                                                                                                                                if (var104.length() > 500) {
                                                                                                                                    var85 = 1;
                                                                                                                                } else if (var105.length() > 500) {
                                                                                                                                    var85 = 1;
                                                                                                                                } else {
                                                                                                                                    client.field958.method3195(161);
                                                                                                                                    client.field958.method2951(1 + class177.method2707(var104) + class177.method2707(var105));
                                                                                                                                    client.field958.method3129(var103);
                                                                                                                                    client.field958.method2956(var105);
                                                                                                                                    client.field958.method2956(var104);
                                                                                                                                    var85 = 1;
                                                                                                                                }
                                                                                                                            } else if (var300 == 3117) {
                                                                                                                                client.field1064 = field1338[--Statics.field424] == 1;
                                                                                                                                var85 = 1;
                                                                                                                            } else {
                                                                                                                                var85 = 2;
                                                                                                                            }
                                                                                                                            var73 = var85;
                                                                                                                        } else if (var300 < 3300) {
                                                                                                                            var73 = method165(var300, var12, var72);
                                                                                                                        } else if (var300 < 3400) {
                                                                                                                            byte var106;
                                                                                                                            if (var300 == 3300) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.field948;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3301) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var107 = field1338[Statics.field424];
                                                                                                                                int var108 = field1338[Statics.field424 + 1];
                                                                                                                                int[] var109 = field1338;
                                                                                                                                int var110 = ++Statics.field424 - 1;
                                                                                                                                class64 var111 = (class64) class64.field775.method3339((long) var107);
                                                                                                                                int var112;
                                                                                                                                if (var111 == null) {
                                                                                                                                    var112 = -1;
                                                                                                                                } else if (var108 >= 0 && var108 < var111.field774.length) {
                                                                                                                                    var112 = var111.field774[var108];
                                                                                                                                } else {
                                                                                                                                    var112 = -1;
                                                                                                                                }
                                                                                                                                var109[var110] = var112;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3302) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var113 = field1338[Statics.field424];
                                                                                                                                int var114 = field1338[Statics.field424 + 1];
                                                                                                                                int[] var115 = field1338;
                                                                                                                                int var116 = ++Statics.field424 - 1;
                                                                                                                                class64 var117 = (class64) class64.field775.method3339((long) var113);
                                                                                                                                int var118;
                                                                                                                                if (var117 == null) {
                                                                                                                                    var118 = 0;
                                                                                                                                } else if (var114 >= 0 && var114 < var117.field772.length) {
                                                                                                                                    var118 = var117.field772[var114];
                                                                                                                                } else {
                                                                                                                                    var118 = 0;
                                                                                                                                }
                                                                                                                                var115[var116] = var118;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3303) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var119 = field1338[Statics.field424];
                                                                                                                                int var120 = field1338[Statics.field424 + 1];
                                                                                                                                int[] var121 = field1338;
                                                                                                                                int var122 = ++Statics.field424 - 1;
                                                                                                                                class64 var123 = (class64) class64.field775.method3339((long) var119);
                                                                                                                                int var124;
                                                                                                                                if (var123 == null) {
                                                                                                                                    var124 = 0;
                                                                                                                                } else if (var120 == -1) {
                                                                                                                                    var124 = 0;
                                                                                                                                } else {
                                                                                                                                    int var125 = 0;
                                                                                                                                    for (int var126 = 0; var126 < var123.field772.length; var126++) {
                                                                                                                                        if (var123.field774[var126] == var120) {
                                                                                                                                            var125 += var123.field772[var126];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var124 = var125;
                                                                                                                                }
                                                                                                                                var121[var122] = var124;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3304) {
                                                                                                                                int var127 = field1338[--Statics.field424];
                                                                                                                                field1338[++Statics.field424 - 1] = class244.method3816(var127).field3296;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3305) {
                                                                                                                                int var128 = field1338[--Statics.field424];
                                                                                                                                field1338[++Statics.field424 - 1] = client.field1050[var128];
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3306) {
                                                                                                                                int var129 = field1338[--Statics.field424];
                                                                                                                                field1338[++Statics.field424 - 1] = client.field993[var129];
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3307) {
                                                                                                                                int var130 = field1338[--Statics.field424];
                                                                                                                                field1338[++Statics.field424 - 1] = client.field1052[var130];
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3308) {
                                                                                                                                int var131 = Statics.field2342;
                                                                                                                                int var132 = (Statics.field300.field1282 >> 7) + Statics.field590;
                                                                                                                                int var133 = (Statics.field300.field1225 >> 7) + Statics.field617;
                                                                                                                                field1338[++Statics.field424 - 1] = (var131 << 28) + (var132 << 14) + var133;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3309) {
                                                                                                                                int var134 = field1338[--Statics.field424];
                                                                                                                                field1338[++Statics.field424 - 1] = var134 >> 14 & 0x3FFF;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3310) {
                                                                                                                                int var135 = field1338[--Statics.field424];
                                                                                                                                field1338[++Statics.field424 - 1] = var135 >> 28;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3311) {
                                                                                                                                int var136 = field1338[--Statics.field424];
                                                                                                                                field1338[++Statics.field424 - 1] = var136 & 0x3FFF;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3312) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.field1136 ? 1 : 0;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3313) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var137 = field1338[Statics.field424] + 32768;
                                                                                                                                int var138 = field1338[Statics.field424 + 1];
                                                                                                                                field1338[++Statics.field424 - 1] = class64.method489(var137, var138);
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3314) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var139 = field1338[Statics.field424] + 32768;
                                                                                                                                int var140 = field1338[Statics.field424 + 1];
                                                                                                                                int[] var141 = field1338;
                                                                                                                                int var142 = ++Statics.field424 - 1;
                                                                                                                                class64 var143 = (class64) class64.field775.method3339((long) var139);
                                                                                                                                int var144;
                                                                                                                                if (var143 == null) {
                                                                                                                                    var144 = 0;
                                                                                                                                } else if (var140 >= 0 && var140 < var143.field772.length) {
                                                                                                                                    var144 = var143.field772[var140];
                                                                                                                                } else {
                                                                                                                                    var144 = 0;
                                                                                                                                }
                                                                                                                                var141[var142] = var144;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3315) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var145 = field1338[Statics.field424] + 32768;
                                                                                                                                int var146 = field1338[Statics.field424 + 1];
                                                                                                                                int[] var147 = field1338;
                                                                                                                                int var148 = ++Statics.field424 - 1;
                                                                                                                                class64 var149 = (class64) class64.field775.method3339((long) var145);
                                                                                                                                int var150;
                                                                                                                                if (var149 == null) {
                                                                                                                                    var150 = 0;
                                                                                                                                } else if (var146 == -1) {
                                                                                                                                    var150 = 0;
                                                                                                                                } else {
                                                                                                                                    int var151 = 0;
                                                                                                                                    for (int var152 = 0; var152 < var149.field772.length; var152++) {
                                                                                                                                        if (var149.field774[var152] == var146) {
                                                                                                                                            var151 += var149.field772[var152];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var150 = var151;
                                                                                                                                }
                                                                                                                                var147[var148] = var150;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3316) {
                                                                                                                                if (client.field1083 >= 2) {
                                                                                                                                    field1338[++Statics.field424 - 1] = client.field1083;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                }
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3317) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.field933;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3318) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.field1007;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3321) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.field984;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3322) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.field1015;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3323) {
                                                                                                                                if (client.field1081) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                }
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3324) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.field950;
                                                                                                                                var106 = 1;
                                                                                                                            } else if (var300 == 3325) {
                                                                                                                                Statics.field424 -= 4;
                                                                                                                                int var153 = field1338[Statics.field424];
                                                                                                                                int var154 = field1338[Statics.field424 + 1];
                                                                                                                                int var155 = field1338[Statics.field424 + 2];
                                                                                                                                int var156 = field1338[Statics.field424 + 3];
                                                                                                                                int var157 = (var154 << 14) + var153;
                                                                                                                                int var158 = (var155 << 28) + var157;
                                                                                                                                int var159 = var156 + var158;
                                                                                                                                field1338[++Statics.field424 - 1] = var159;
                                                                                                                                var106 = 1;
                                                                                                                            } else {
                                                                                                                                var106 = 2;
                                                                                                                            }
                                                                                                                            var73 = var106;
                                                                                                                        } else if (var300 < 3500) {
                                                                                                                            var73 = method82(var300, var12, var72);
                                                                                                                        } else if (var300 < 3700) {
                                                                                                                            byte var160;
                                                                                                                            if (var300 == 3600) {
                                                                                                                                if (client.field1142 == 0) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -2;
                                                                                                                                } else if (client.field1142 == 1) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = client.field1181;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3601) {
                                                                                                                                int var161 = field1338[--Statics.field424];
                                                                                                                                if (client.field1142 == 2 && var161 < client.field1181) {
                                                                                                                                    field1344[++Statics.field282 - 1] = client.field1183[var161].field791;
                                                                                                                                    field1344[++Statics.field282 - 1] = client.field1183[var161].field790;
                                                                                                                                } else {
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3602) {
                                                                                                                                int var162 = field1338[--Statics.field424];
                                                                                                                                if (client.field1142 == 2 && var162 < client.field1181) {
                                                                                                                                    field1338[++Statics.field424 - 1] = client.field1183[var162].field792;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3603) {
                                                                                                                                int var163 = field1338[--Statics.field424];
                                                                                                                                if (client.field1142 == 2 && var163 < client.field1181) {
                                                                                                                                    field1338[++Statics.field424 - 1] = client.field1183[var163].field801;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3604) {
                                                                                                                                String var164 = field1344[--Statics.field282];
                                                                                                                                int var165 = field1338[--Statics.field424];
                                                                                                                                client.method984(var164, var165);
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3605) {
                                                                                                                                String var166 = field1344[--Statics.field282];
                                                                                                                                client.method478(var166);
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3606) {
                                                                                                                                String var167 = field1344[--Statics.field282];
                                                                                                                                if (var167 != null) {
                                                                                                                                    String var168 = class271.method3664(var167, Statics.field3218);
                                                                                                                                    if (var168 != null) {
                                                                                                                                        for (int var169 = 0; var169 < client.field1181; var169++) {
                                                                                                                                            class66 var170 = client.field1183[var169];
                                                                                                                                            String var171 = var170.field791;
                                                                                                                                            String var172 = class271.method3664(var171, Statics.field3218);
                                                                                                                                            if (class281.method146(var167, var168, var171, var172)) {
                                                                                                                                                client.field1181--;
                                                                                                                                                for (int var173 = var169; var173 < client.field1181; var173++) {
                                                                                                                                                    client.field1183[var173] = client.field1183[var173 + 1];
                                                                                                                                                }
                                                                                                                                                client.field1109 = client.field1101;
                                                                                                                                                client.field958.method3195(194);
                                                                                                                                                client.field958.method3129(class177.method2707(var167));
                                                                                                                                                client.field958.method2956(var167);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3607) {
                                                                                                                                String var174 = field1344[--Statics.field282];
                                                                                                                                if (var174 != null) {
                                                                                                                                    if ((client.field919 < 100 || client.field1164 == 1) && client.field919 < 400) {
                                                                                                                                        String var175 = class271.method3664(var174, Statics.field3218);
                                                                                                                                        if (var175 != null) {
                                                                                                                                            int var176 = 0;
                                                                                                                                            label1267: while (true) {
                                                                                                                                                if (var176 >= client.field919) {
                                                                                                                                                    for (int var180 = 0; var180 < client.field1181; var180++) {
                                                                                                                                                        class66 var181 = client.field1183[var180];
                                                                                                                                                        String var182 = class271.method3664(var181.field791, Statics.field3218);
                                                                                                                                                        if (var182 != null && var182.equals(var175)) {
                                                                                                                                                            class99.method968(31, "", class229.field3045 + var174 + class229.field3046);
                                                                                                                                                            break label1267;
                                                                                                                                                        }
                                                                                                                                                        if (var181.field790 != null) {
                                                                                                                                                            String var183 = class271.method3664(var181.field790, Statics.field3218);
                                                                                                                                                            if (var183 != null && var183.equals(var175)) {
                                                                                                                                                                class99.method968(31, "", class229.field3045 + var174 + class229.field3046);
                                                                                                                                                                break label1267;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (class271.method3664(Statics.field300.field891, Statics.field3218).equals(var175)) {
                                                                                                                                                        class99.method968(31, "", class229.field3042);
                                                                                                                                                    } else {
                                                                                                                                                        client.field958.method3195(121);
                                                                                                                                                        client.field958.method3129(class177.method2707(var174));
                                                                                                                                                        client.field958.method2956(var174);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class71 var177 = client.field917[var176];
                                                                                                                                                String var178 = class271.method3664(var177.field842, Statics.field3218);
                                                                                                                                                if (var178 != null && var178.equals(var175)) {
                                                                                                                                                    class99.method968(31, "", var174 + class229.field3040);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var177.field841 != null) {
                                                                                                                                                    String var179 = class271.method3664(var177.field841, Statics.field3218);
                                                                                                                                                    if (var179 != null && var179.equals(var175)) {
                                                                                                                                                        class99.method968(31, "", var174 + class229.field3040);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var176++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class99.method968(31, "", class229.field2905);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3608) {
                                                                                                                                String var184 = field1344[--Statics.field282];
                                                                                                                                if (var184 != null) {
                                                                                                                                    String var185 = class271.method3664(var184, Statics.field3218);
                                                                                                                                    if (var185 != null) {
                                                                                                                                        for (int var186 = 0; var186 < client.field919; var186++) {
                                                                                                                                            class71 var187 = client.field917[var186];
                                                                                                                                            String var188 = var187.field842;
                                                                                                                                            String var189 = class271.method3664(var188, Statics.field3218);
                                                                                                                                            if (class281.method146(var184, var185, var188, var189)) {
                                                                                                                                                client.field919--;
                                                                                                                                                for (int var190 = var186; var190 < client.field919; var190++) {
                                                                                                                                                    client.field917[var190] = client.field917[var190 + 1];
                                                                                                                                                }
                                                                                                                                                client.field1109 = client.field1101;
                                                                                                                                                client.field958.method3195(104);
                                                                                                                                                client.field958.method3129(class177.method2707(var184));
                                                                                                                                                client.field958.method2956(var184);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3609) {
                                                                                                                                String var191 = field1344[--Statics.field282];
                                                                                                                                class234[] var192 = class234.method531();
                                                                                                                                for (int var193 = 0; var193 < var192.length; var193++) {
                                                                                                                                    class234 var194 = var192[var193];
                                                                                                                                    if (var194.field3198 != -1 && var191.startsWith(class89.method3799(var194.field3198))) {
                                                                                                                                        var191 = var191.substring(6 + Integer.toString(var194.field3198).length());
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1338[++Statics.field424 - 1] = client.method470(var191, false) ? 1 : 0;
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3611) {
                                                                                                                                if (client.field1141 == null) {
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    String[] var195 = field1344;
                                                                                                                                    int var196 = ++Statics.field282 - 1;
                                                                                                                                    String var197 = client.field1141;
                                                                                                                                    long var198 = 0L;
                                                                                                                                    int var200 = var197.length();
                                                                                                                                    for (int var201 = 0; var201 < var200; var201++) {
                                                                                                                                        var198 *= 37L;
                                                                                                                                        char var202 = var197.charAt(var201);
                                                                                                                                        if (var202 >= 'A' && var202 <= 'Z') {
                                                                                                                                            var198 += (long) (var202 + 1 - 65);
                                                                                                                                        } else if (var202 >= 'a' && var202 <= 'z') {
                                                                                                                                            var198 += (long) (var202 + 1 - 97);
                                                                                                                                        } else if (var202 >= '0' && var202 <= '9') {
                                                                                                                                            var198 += (long) (var202 + 27 - 48);
                                                                                                                                        }
                                                                                                                                        if (var198 >= 177917621779460413L) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    while (var198 % 37L == 0L && var198 != 0L) {
                                                                                                                                        var198 /= 37L;
                                                                                                                                    }
                                                                                                                                    String var205 = class272.method1730(var198);
                                                                                                                                    if (var205 == null) {
                                                                                                                                        var205 = "";
                                                                                                                                    }
                                                                                                                                    var195[var196] = var205;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3612) {
                                                                                                                                if (client.field1141 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = Statics.field15;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3613) {
                                                                                                                                int var207 = field1338[--Statics.field424];
                                                                                                                                if (client.field1141 == null || var207 >= Statics.field15) {
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1344[++Statics.field282 - 1] = Statics.field747[var207].field910;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3614) {
                                                                                                                                int var208 = field1338[--Statics.field424];
                                                                                                                                if (client.field1141 == null || var208 >= Statics.field15) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = Statics.field747[var208].field908;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3615) {
                                                                                                                                int var209 = field1338[--Statics.field424];
                                                                                                                                if (client.field1141 == null || var209 >= Statics.field15) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = Statics.field747[var209].field915;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3616) {
                                                                                                                                field1338[++Statics.field424 - 1] = Statics.field2520;
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3617) {
                                                                                                                                String var210 = field1344[--Statics.field282];
                                                                                                                                client.method55(var210);
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3618) {
                                                                                                                                field1338[++Statics.field424 - 1] = Statics.field616;
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3619) {
                                                                                                                                String var211 = field1344[--Statics.field282];
                                                                                                                                if (!var211.equals("")) {
                                                                                                                                    client.field958.method3195(241);
                                                                                                                                    client.field958.method3129(class177.method2707(var211));
                                                                                                                                    client.field958.method2956(var211);
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3620) {
                                                                                                                                client.field958.method3195(241);
                                                                                                                                client.field958.method3129(0);
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3621) {
                                                                                                                                if (client.field1142 == 0) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = client.field919;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3622) {
                                                                                                                                int var212 = field1338[--Statics.field424];
                                                                                                                                if (client.field1142 == 0 || var212 >= client.field919) {
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1344[++Statics.field282 - 1] = client.field917[var212].field842;
                                                                                                                                    field1344[++Statics.field282 - 1] = client.field917[var212].field841;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3623) {
                                                                                                                                String var213 = field1344[--Statics.field282];
                                                                                                                                String var215 = "<img=0>";
                                                                                                                                if (var213.startsWith(var215) || var213.startsWith(class89.method3799(1))) {
                                                                                                                                    var213 = var213.substring(7);
                                                                                                                                }
                                                                                                                                field1338[++Statics.field424 - 1] = client.method4625(var213) ? 1 : 0;
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3624) {
                                                                                                                                int var216 = field1338[--Statics.field424];
                                                                                                                                if (Statics.field747 == null || var216 >= Statics.field15 || !Statics.field747[var216].field910.equalsIgnoreCase(Statics.field300.field891)) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = 1;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else if (var300 == 3625) {
                                                                                                                                if (client.field964 == null) {
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    String[] var217 = field1344;
                                                                                                                                    int var218 = ++Statics.field282 - 1;
                                                                                                                                    String var219 = client.field964;
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
                                                                                                                                    String var227 = class272.method1730(var220);
                                                                                                                                    if (var227 == null) {
                                                                                                                                        var227 = "";
                                                                                                                                    }
                                                                                                                                    var217[var218] = var227;
                                                                                                                                }
                                                                                                                                var160 = 1;
                                                                                                                            } else {
                                                                                                                                var160 = 2;
                                                                                                                            }
                                                                                                                            var73 = var160;
                                                                                                                        } else if (var300 < 4000) {
                                                                                                                            var73 = method989(var300, var12, var72);
                                                                                                                        } else if (var300 < 4100) {
                                                                                                                            var73 = Statics.method1474(var300, var12, var72);
                                                                                                                        } else if (var300 < 4200) {
                                                                                                                            var73 = method983(var300, var12, var72);
                                                                                                                        } else if (var300 < 4300) {
                                                                                                                            var73 = method665(var300, var12, var72);
                                                                                                                        } else if (var300 < 5100) {
                                                                                                                            var73 = method659(var300, var12, var72);
                                                                                                                        } else if (var300 < 5400) {
                                                                                                                            byte var232;
                                                                                                                            if (var300 == 5306) {
                                                                                                                                int[] var229 = field1338;
                                                                                                                                int var230 = ++Statics.field424 - 1;
                                                                                                                                int var231 = client.field1130 ? 2 : 1;
                                                                                                                                var229[var230] = var231;
                                                                                                                                var232 = 1;
                                                                                                                            } else if (var300 == 5307) {
                                                                                                                                int var233 = field1338[--Statics.field424];
                                                                                                                                if (var233 == 1 || var233 == 2) {
                                                                                                                                    client.method2698(var233);
                                                                                                                                }
                                                                                                                                var232 = 1;
                                                                                                                            } else if (var300 == 5308) {
                                                                                                                                field1338[++Statics.field424 - 1] = Statics.field1375.field1316;
                                                                                                                                var232 = 1;
                                                                                                                            } else if (var300 == 5309) {
                                                                                                                                int var234 = field1338[--Statics.field424];
                                                                                                                                if (var234 == 1 || var234 == 2) {
                                                                                                                                    Statics.field1375.field1316 = var234;
                                                                                                                                    class82.method221();
                                                                                                                                }
                                                                                                                                var232 = 1;
                                                                                                                            } else {
                                                                                                                                var232 = 2;
                                                                                                                            }
                                                                                                                            var73 = var232;
                                                                                                                        } else if (var300 < 5600) {
                                                                                                                            var73 = method180(var300, var12, var72);
                                                                                                                        } else if (var300 < 5700) {
                                                                                                                            var73 = method132(var300, var12, var72);
                                                                                                                        } else if (var300 < 6300) {
                                                                                                                            var73 = method249(var300, var12, var72);
                                                                                                                        } else if (var300 < 6600) {
                                                                                                                            var73 = method460(var300, var12, var72);
                                                                                                                        } else if (var300 < 6700) {
                                                                                                                            byte var238;
                                                                                                                            if (var300 == 6600) {
                                                                                                                                int var235 = Statics.field2342;
                                                                                                                                int var236 = (Statics.field300.field1282 >> 7) + Statics.field590;
                                                                                                                                int var237 = (Statics.field300.field1225 >> 7) + Statics.field617;
                                                                                                                                client.method493().method4907(var235, var236, var237, true);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6601) {
                                                                                                                                int var239 = field1338[--Statics.field424];
                                                                                                                                String var240 = "";
                                                                                                                                class33 var241 = client.method493().method5001(var239);
                                                                                                                                if (var241 != null) {
                                                                                                                                    var240 = var241.method261();
                                                                                                                                }
                                                                                                                                field1344[++Statics.field282 - 1] = var240;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6602) {
                                                                                                                                int var242 = field1338[--Statics.field424];
                                                                                                                                client.method493().method4914(var242);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6603) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method4920();
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6604) {
                                                                                                                                int var243 = field1338[--Statics.field424];
                                                                                                                                client.method493().method4917(var243);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6605) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method4958() ? 1 : 0;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6606) {
                                                                                                                                class216 var244 = new class216(field1338[--Statics.field424]);
                                                                                                                                client.method493().method4966(var244.field2626, var244.field2632);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6607) {
                                                                                                                                class216 var245 = new class216(field1338[--Statics.field424]);
                                                                                                                                client.method493().method4924(var245.field2626, var245.field2632);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6608) {
                                                                                                                                class216 var246 = new class216(field1338[--Statics.field424]);
                                                                                                                                client.method493().method4925(var246.field2631, var246.field2626, var246.field2632);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6609) {
                                                                                                                                class216 var247 = new class216(field1338[--Statics.field424]);
                                                                                                                                client.method493().method4926(var247.field2631, var247.field2626, var247.field2632);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6610) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method4927();
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method4928();
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6611) {
                                                                                                                                int var248 = field1338[--Statics.field424];
                                                                                                                                class33 var249 = client.method493().method5001(var248);
                                                                                                                                if (var249 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var249.method305().method3682();
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6612) {
                                                                                                                                int var250 = field1338[--Statics.field424];
                                                                                                                                class33 var251 = client.method493().method5001(var250);
                                                                                                                                if (var251 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = (var251.method265() - var251.method307() + 1) * 64;
                                                                                                                                    field1338[++Statics.field424 - 1] = (var251.method267() - var251.method263() + 1) * 64;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6613) {
                                                                                                                                int var252 = field1338[--Statics.field424];
                                                                                                                                class33 var253 = client.method493().method5001(var252);
                                                                                                                                if (var253 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var253.method307() * 64;
                                                                                                                                    field1338[++Statics.field424 - 1] = var253.method263() * 64;
                                                                                                                                    field1338[++Statics.field424 - 1] = var253.method265() * 64 + 64 - 1;
                                                                                                                                    field1338[++Statics.field424 - 1] = var253.method267() * 64 + 64 - 1;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6614) {
                                                                                                                                int var254 = field1338[--Statics.field424];
                                                                                                                                class33 var255 = client.method493().method5001(var254);
                                                                                                                                if (var255 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var255.method275();
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6615) {
                                                                                                                                class216 var256 = client.method493().method4929();
                                                                                                                                if (var256 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var256.field2626;
                                                                                                                                    field1338[++Statics.field424 - 1] = var256.field2632;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6616) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method5055();
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6617) {
                                                                                                                                class216 var257 = new class216(field1338[--Statics.field424]);
                                                                                                                                class33 var258 = client.method493().method4910();
                                                                                                                                if (var258 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                    var238 = 1;
                                                                                                                                } else {
                                                                                                                                    int[] var259 = var258.method250(var257.field2631, var257.field2626, var257.field2632);
                                                                                                                                    if (var259 == null) {
                                                                                                                                        field1338[++Statics.field424 - 1] = -1;
                                                                                                                                        field1338[++Statics.field424 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1338[++Statics.field424 - 1] = var259[0];
                                                                                                                                        field1338[++Statics.field424 - 1] = var259[1];
                                                                                                                                    }
                                                                                                                                    var238 = 1;
                                                                                                                                }
                                                                                                                            } else if (var300 == 6618) {
                                                                                                                                class216 var260 = new class216(field1338[--Statics.field424]);
                                                                                                                                class33 var261 = client.method493().method4910();
                                                                                                                                if (var261 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                    var238 = 1;
                                                                                                                                } else {
                                                                                                                                    class216 var262 = var261.method256(var260.field2626, var260.field2632);
                                                                                                                                    if (var262 == null) {
                                                                                                                                        field1338[++Statics.field424 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1338[++Statics.field424 - 1] = var262.method3682();
                                                                                                                                    }
                                                                                                                                    var238 = 1;
                                                                                                                                }
                                                                                                                            } else if (var300 == 6619) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var263 = field1338[Statics.field424];
                                                                                                                                class216 var264 = new class216(field1338[Statics.field424 + 1]);
                                                                                                                                method2431(var263, var264, false);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6620) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var265 = field1338[Statics.field424];
                                                                                                                                class216 var266 = new class216(field1338[Statics.field424 + 1]);
                                                                                                                                method2431(var265, var266, true);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6621) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var267 = field1338[Statics.field424];
                                                                                                                                class216 var268 = new class216(field1338[Statics.field424 + 1]);
                                                                                                                                class33 var269 = client.method493().method5001(var267);
                                                                                                                                if (var269 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = 0;
                                                                                                                                    var238 = 1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var269.method271(var268.field2631, var268.field2626, var268.field2632) ? 1 : 0;
                                                                                                                                    var238 = 1;
                                                                                                                                }
                                                                                                                            } else if (var300 == 6622) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method4906();
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method4931();
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6623) {
                                                                                                                                class216 var270 = new class216(field1338[--Statics.field424]);
                                                                                                                                class33 var271 = client.method493().method4941(var270.field2631, var270.field2626, var270.field2632);
                                                                                                                                if (var271 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var271.method258();
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6624) {
                                                                                                                                client.method493().method4932(field1338[--Statics.field424]);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6625) {
                                                                                                                                client.method493().method4933();
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6626) {
                                                                                                                                client.method493().method4934(field1338[--Statics.field424]);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6627) {
                                                                                                                                client.method493().method4935();
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6628) {
                                                                                                                                boolean var272 = field1338[--Statics.field424] == 1;
                                                                                                                                client.method493().method4936(var272);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6629) {
                                                                                                                                int var273 = field1338[--Statics.field424];
                                                                                                                                client.method493().method4982(var273);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6630) {
                                                                                                                                int var274 = field1338[--Statics.field424];
                                                                                                                                client.method493().method4938(var274);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6631) {
                                                                                                                                client.method493().method4939();
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6632) {
                                                                                                                                boolean var275 = field1338[--Statics.field424] == 1;
                                                                                                                                client.method493().method4940(var275);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6633) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var276 = field1338[Statics.field424];
                                                                                                                                boolean var277 = field1338[Statics.field424 + 1] == 1;
                                                                                                                                client.method493().method5043(var276, var277);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6634) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var278 = field1338[Statics.field424];
                                                                                                                                boolean var279 = field1338[Statics.field424 + 1] == 1;
                                                                                                                                client.method493().method4942(var278, var279);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6635) {
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method5000() ? 1 : 0;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6636) {
                                                                                                                                int var280 = field1338[--Statics.field424];
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method4944(var280) ? 1 : 0;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6637) {
                                                                                                                                int var281 = field1338[--Statics.field424];
                                                                                                                                field1338[++Statics.field424 - 1] = client.method493().method4965(var281) ? 1 : 0;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6638) {
                                                                                                                                Statics.field424 -= 2;
                                                                                                                                int var282 = field1338[Statics.field424];
                                                                                                                                class216 var283 = new class216(field1338[Statics.field424 + 1]);
                                                                                                                                class216 var284 = client.method493().method4948(var282, var283);
                                                                                                                                if (var284 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var284.method3682();
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6639) {
                                                                                                                                class40 var285 = client.method493().method4950();
                                                                                                                                if (var285 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var285.field534;
                                                                                                                                    field1338[++Statics.field424 - 1] = var285.field524.method3682();
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6640) {
                                                                                                                                class40 var286 = client.method493().method4951();
                                                                                                                                if (var286 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var286.field534;
                                                                                                                                    field1338[++Statics.field424 - 1] = var286.field524.method3682();
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6693) {
                                                                                                                                int var287 = field1338[--Statics.field424];
                                                                                                                                class246 var288 = Statics.field3305[var287];
                                                                                                                                if (var288.field3311 == null) {
                                                                                                                                    field1344[++Statics.field282 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1344[++Statics.field282 - 1] = var288.field3311;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6694) {
                                                                                                                                int var289 = field1338[--Statics.field424];
                                                                                                                                class246 var290 = Statics.field3305[var289];
                                                                                                                                field1338[++Statics.field424 - 1] = var290.field3313;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6695) {
                                                                                                                                int var291 = field1338[--Statics.field424];
                                                                                                                                class246 var292 = Statics.field3305[var291];
                                                                                                                                if (var292 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var292.field3325;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6696) {
                                                                                                                                int var293 = field1338[--Statics.field424];
                                                                                                                                class246 var294 = Statics.field3305[var293];
                                                                                                                                if (var294 == null) {
                                                                                                                                    field1338[++Statics.field424 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1338[++Statics.field424 - 1] = var294.field3309;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6697) {
                                                                                                                                field1338[++Statics.field424 - 1] = Statics.field807.field595;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6698) {
                                                                                                                                field1338[++Statics.field424 - 1] = Statics.field807.field593.method3682();
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var300 == 6699) {
                                                                                                                                field1338[++Statics.field424 - 1] = Statics.field807.field592.method3682();
                                                                                                                                var238 = 1;
                                                                                                                            } else {
                                                                                                                                var238 = 2;
                                                                                                                            }
                                                                                                                            var73 = var238;
                                                                                                                        } else {
                                                                                                                            var73 = 2;
                                                                                                                        }
                                                                                                                        switch(var73) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var300 == 0) {
                                                                                                                        field1338[++Statics.field424 - 1] = var16[var14];
                                                                                                                    } else if (var300 == 1) {
                                                                                                                        int var24 = var16[var14];
                                                                                                                        field1338[++Statics.field424 - 1] = class215.field2623[var24];
                                                                                                                    } else if (var300 == 2) {
                                                                                                                        int var25 = var16[var14];
                                                                                                                        class215.field2623[var25] = field1338[--Statics.field424];
                                                                                                                        client.method3796(var25);
                                                                                                                    } else if (var300 == 3) {
                                                                                                                        field1344[++Statics.field282 - 1] = var12.field1521[var14];
                                                                                                                    } else if (var300 == 6) {
                                                                                                                        var14 += var16[var14];
                                                                                                                    } else if (var300 == 7) {
                                                                                                                        Statics.field424 -= 2;
                                                                                                                        if (field1338[Statics.field424] != field1338[Statics.field424 + 1]) {
                                                                                                                            var14 += var16[var14];
                                                                                                                        }
                                                                                                                    } else if (var300 == 8) {
                                                                                                                        Statics.field424 -= 2;
                                                                                                                        if (field1338[Statics.field424] == field1338[Statics.field424 + 1]) {
                                                                                                                            var14 += var16[var14];
                                                                                                                        }
                                                                                                                    } else if (var300 == 9) {
                                                                                                                        Statics.field424 -= 2;
                                                                                                                        if (field1338[Statics.field424] < field1338[Statics.field424 + 1]) {
                                                                                                                            var14 += var16[var14];
                                                                                                                        }
                                                                                                                    } else if (var300 == 10) {
                                                                                                                        Statics.field424 -= 2;
                                                                                                                        if (field1338[Statics.field424] > field1338[Statics.field424 + 1]) {
                                                                                                                            var14 += var16[var14];
                                                                                                                        }
                                                                                                                    } else if (var300 == 21) {
                                                                                                                        if (field1347 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var26 = field1346[--field1347];
                                                                                                                        var12 = var26.field771;
                                                                                                                        var15 = var12.field1530;
                                                                                                                        var16 = var12.field1523;
                                                                                                                        var14 = var26.field766;
                                                                                                                        Statics.field1340 = var26.field765;
                                                                                                                        Statics.field1766 = var26.field768;
                                                                                                                    } else if (var300 == 25) {
                                                                                                                        int var27 = var16[var14];
                                                                                                                        field1338[++Statics.field424 - 1] = class215.method2427(var27);
                                                                                                                    } else if (var300 == 27) {
                                                                                                                        int var28 = var16[var14];
                                                                                                                        int var29 = field1338[--Statics.field424];
                                                                                                                        class254 var30 = (class254) class254.field3397.method3319((long) var28);
                                                                                                                        class254 var31;
                                                                                                                        if (var30 == null) {
                                                                                                                            byte[] var32 = Statics.field3396.method3840(14, var28);
                                                                                                                            class254 var33 = new class254();
                                                                                                                            if (var32 != null) {
                                                                                                                                var33.method4147(new class177(var32));
                                                                                                                            }
                                                                                                                            class254.field3397.method3315(var33, (long) var28);
                                                                                                                            var31 = var33;
                                                                                                                        } else {
                                                                                                                            var31 = var30;
                                                                                                                        }
                                                                                                                        int var35 = var31.field3395;
                                                                                                                        int var36 = var31.field3398;
                                                                                                                        int var37 = var31.field3393;
                                                                                                                        int var38 = class215.field2622[var37 - var36];
                                                                                                                        if (var29 < 0 || var29 > var38) {
                                                                                                                            var29 = 0;
                                                                                                                        }
                                                                                                                        int var39 = var38 << var36;
                                                                                                                        class215.field2623[var35] = class215.field2623[var35] & ~var39 | var29 << var36 & var39;
                                                                                                                    } else if (var300 == 31) {
                                                                                                                        Statics.field424 -= 2;
                                                                                                                        if (field1338[Statics.field424] <= field1338[Statics.field424 + 1]) {
                                                                                                                            var14 += var16[var14];
                                                                                                                        }
                                                                                                                    } else if (var300 == 32) {
                                                                                                                        Statics.field424 -= 2;
                                                                                                                        if (field1338[Statics.field424] >= field1338[Statics.field424 + 1]) {
                                                                                                                            var14 += var16[var14];
                                                                                                                        }
                                                                                                                    } else if (var300 == 33) {
                                                                                                                        field1338[++Statics.field424 - 1] = Statics.field1340[var16[var14]];
                                                                                                                    } else if (var300 == 34) {
                                                                                                                        Statics.field1340[var16[var14]] = field1338[--Statics.field424];
                                                                                                                    } else if (var300 == 35) {
                                                                                                                        field1344[++Statics.field282 - 1] = Statics.field1766[var16[var14]];
                                                                                                                    } else if (var300 == 36) {
                                                                                                                        Statics.field1766[var16[var14]] = field1344[--Statics.field282];
                                                                                                                    } else if (var300 == 37) {
                                                                                                                        int var40 = var16[var14];
                                                                                                                        Statics.field282 -= var40;
                                                                                                                        String[] var41 = field1344;
                                                                                                                        int var42 = Statics.field282;
                                                                                                                        String var43;
                                                                                                                        if (var40 == 0) {
                                                                                                                            var43 = "";
                                                                                                                        } else if (var40 == 1) {
                                                                                                                            String var44 = var41[var42];
                                                                                                                            if (var44 == null) {
                                                                                                                                var43 = "null";
                                                                                                                            } else {
                                                                                                                                var43 = var44.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var45 = var40 + var42;
                                                                                                                            int var46 = 0;
                                                                                                                            for (int var47 = var42; var47 < var45; var47++) {
                                                                                                                                String var48 = var41[var47];
                                                                                                                                if (var48 == null) {
                                                                                                                                    var46 += 4;
                                                                                                                                } else {
                                                                                                                                    var46 += var48.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var49 = new StringBuilder(var46);
                                                                                                                            for (int var50 = var42; var50 < var45; var50++) {
                                                                                                                                String var51 = var41[var50];
                                                                                                                                if (var51 == null) {
                                                                                                                                    var49.append("null");
                                                                                                                                } else {
                                                                                                                                    var49.append(var51);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var43 = var49.toString();
                                                                                                                        }
                                                                                                                        field1344[++Statics.field282 - 1] = var43;
                                                                                                                    } else if (var300 == 38) {
                                                                                                                        Statics.field424--;
                                                                                                                    } else if (var300 == 39) {
                                                                                                                        Statics.field282--;
                                                                                                                    } else if (var300 == 40) {
                                                                                                                        int var53 = var16[var14];
                                                                                                                        class100 var54 = class100.method2694(var53);
                                                                                                                        int[] var55 = new int[var54.field1524];
                                                                                                                        String[] var56 = new String[var54.field1526];
                                                                                                                        for (int var57 = 0; var57 < var54.field1525; var57++) {
                                                                                                                            var55[var57] = field1338[Statics.field424 - var54.field1525 + var57];
                                                                                                                        }
                                                                                                                        for (int var58 = 0; var58 < var54.field1528; var58++) {
                                                                                                                            var56[var58] = field1344[Statics.field282 - var54.field1528 + var58];
                                                                                                                        }
                                                                                                                        Statics.field424 -= var54.field1525;
                                                                                                                        Statics.field282 -= var54.field1528;
                                                                                                                        class63 var59 = new class63();
                                                                                                                        var59.field771 = var12;
                                                                                                                        var59.field766 = var14;
                                                                                                                        var59.field765 = Statics.field1340;
                                                                                                                        var59.field768 = Statics.field1766;
                                                                                                                        field1346[++field1347 - 1] = var59;
                                                                                                                        var12 = var54;
                                                                                                                        var15 = var54.field1530;
                                                                                                                        var16 = var54.field1523;
                                                                                                                        var14 = -1;
                                                                                                                        Statics.field1340 = var55;
                                                                                                                        Statics.field1766 = var56;
                                                                                                                    } else if (var300 == 42) {
                                                                                                                        field1338[++Statics.field424 - 1] = Statics.field236.method1675(var16[var14]);
                                                                                                                    } else if (var300 == 43) {
                                                                                                                        Statics.field236.method1711(var16[var14], field1338[--Statics.field424]);
                                                                                                                    } else if (var300 == 44) {
                                                                                                                        int var60 = var16[var14] >> 16;
                                                                                                                        int var61 = var16[var14] & 0xFFFF;
                                                                                                                        int var62 = field1338[--Statics.field424];
                                                                                                                        if (var62 >= 0 && var62 <= 5000) {
                                                                                                                            field1345[var60] = var62;
                                                                                                                            byte var63 = -1;
                                                                                                                            if (var61 == 105) {
                                                                                                                                var63 = 0;
                                                                                                                            }
                                                                                                                            int var64 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var64 >= var62) {
                                                                                                                                    continue label1532;
                                                                                                                                }
                                                                                                                                field1342[var60][var64] = var63;
                                                                                                                                var64++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var300 == 45) {
                                                                                                                        int var65 = var16[var14];
                                                                                                                        int var66 = field1338[--Statics.field424];
                                                                                                                        if (var66 < 0 || var66 >= field1345[var65]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1338[++Statics.field424 - 1] = field1342[var65][var66];
                                                                                                                    } else if (var300 == 46) {
                                                                                                                        int var67 = var16[var14];
                                                                                                                        Statics.field424 -= 2;
                                                                                                                        int var68 = field1338[Statics.field424];
                                                                                                                        if (var68 < 0 || var68 >= field1345[var67]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1342[var67][var68] = field1338[Statics.field424 + 1];
                                                                                                                    } else if (var300 == 47) {
                                                                                                                        String var69 = Statics.field236.method1687(var16[var14]);
                                                                                                                        if (var69 == null) {
                                                                                                                            var69 = "null";
                                                                                                                        }
                                                                                                                        field1344[++Statics.field282 - 1] = var69;
                                                                                                                    } else if (var300 == 48) {
                                                                                                                        Statics.field236.method1707(var16[var14], field1344[--Statics.field282]);
                                                                                                                    } else if (var300 == 60) {
                                                                                                                        class190 var70 = var12.field1529[var16[var14]];
                                                                                                                        class202 var71 = (class202) var70.method3283((long) field1338[--Statics.field424]);
                                                                                                                        if (var71 != null) {
                                                                                                                            var14 += var71.field2501;
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
        } catch (Exception var299) {
            StringBuilder var297 = new StringBuilder(30);
            var297.append("").append(var12.field2487).append(" ");
            for (int var298 = field1347 - 1; var298 >= 0; var298--) {
                var297.append("").append(field1346[var298].field771.field2487).append(" ");
            }
            var297.append("").append(var17);
            class154.method1971(var297.toString(), var299);
        }
    }

    @ObfuscatedName("ca.f(ILcq;ZB)I")
    public static int method1752(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field424 -= 3;
            int var3 = field1338[Statics.field424];
            int var4 = field1338[Statics.field424 + 1];
            int var5 = field1338[Statics.field424 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class220 var6 = class220.method2339(var3);
            if (var6.field2770 == null) {
                var6.field2770 = new class220[var5 + 1];
            }
            if (var6.field2770.length <= var5) {
                class220[] var7 = new class220[var5 + 1];
                for (int var8 = 0; var8 < var6.field2770.length; var8++) {
                    var7[var8] = var6.field2770[var8];
                }
                var6.field2770 = var7;
            }
            if (var5 > 0 && var6.field2770[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class220 var9 = new class220();
            var9.field2670 = var4;
            var9.field2693 = var9.field2668 = var6.field2668;
            var9.field2669 = var5;
            var9.field2667 = true;
            var6.field2770[var5] = var9;
            if (arg2) {
                Statics.field1542 = var9;
            } else {
                Statics.field813 = var9;
            }
            client.method1456(var6);
            return 1;
        } else if (arg0 == 101) {
            class220 var10 = arg2 ? Statics.field1542 : Statics.field813;
            class220 var11 = class220.method2339(var10.field2668);
            var11.field2770[var10.field2669] = null;
            client.method1456(var11);
            return 1;
        } else if (arg0 == 102) {
            class220 var12 = class220.method2339(field1338[--Statics.field424]);
            var12.field2770 = null;
            client.method1456(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field424 -= 2;
            int var13 = field1338[Statics.field424];
            int var14 = field1338[Statics.field424 + 1];
            class220 var15 = class220.method2938(var13, var14);
            if (var15 == null || var14 == -1) {
                field1338[++Statics.field424 - 1] = 0;
            } else {
                field1338[++Statics.field424 - 1] = 1;
                if (arg2) {
                    Statics.field1542 = var15;
                } else {
                    Statics.field813 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class220 var16 = class220.method2339(field1338[--Statics.field424]);
            if (var16 == null) {
                field1338[++Statics.field424 - 1] = 0;
            } else {
                field1338[++Statics.field424 - 1] = 1;
                if (arg2) {
                    Statics.field1542 = var16;
                } else {
                    Statics.field813 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ba.m(ILcq;ZS)I")
    public static int method1388(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class220 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1338[--Statics.field424];
            var4 = class220.method2339(var3);
        } else {
            var4 = arg2 ? Statics.field1542 : Statics.field813;
        }
        if (arg0 == 1000) {
            Statics.field424 -= 4;
            var4.field2692 = field1338[Statics.field424];
            var4.field2678 = field1338[Statics.field424 + 1];
            var4.field2673 = field1338[Statics.field424 + 2];
            var4.field2772 = field1338[Statics.field424 + 3];
            client.method1456(var4);
            Statics.field336.method1059(var4);
            if (var3 != -1 && var4.field2670 == 0) {
                client.method2902(Statics.field2627[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field424 -= 4;
            var4.field2679 = field1338[Statics.field424];
            var4.field2680 = field1338[Statics.field424 + 1];
            var4.field2675 = field1338[Statics.field424 + 2];
            var4.field2701 = field1338[Statics.field424 + 3];
            client.method1456(var4);
            Statics.field336.method1059(var4);
            if (var3 != -1 && var4.field2670 == 0) {
                client.method2902(Statics.field2627[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1338[--Statics.field424] == 1;
            if (var4.field2746 != var5) {
                var4.field2746 = var5;
                client.method1456(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2688 = field1338[--Statics.field424] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2802 = field1338[--Statics.field424] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fw.h(ILcq;ZI)I")
    public static int method2847(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class220 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1338[--Statics.field424];
            var4 = class220.method2339(var3);
        } else {
            var4 = arg2 ? Statics.field1542 : Statics.field813;
        }
        if (arg0 == 1100) {
            Statics.field424 -= 2;
            var4.field2694 = field1338[Statics.field424];
            if (var4.field2694 > var4.field2691 - var4.field2683) {
                var4.field2694 = var4.field2691 - var4.field2683;
            }
            if (var4.field2694 < 0) {
                var4.field2694 = 0;
            }
            var4.field2690 = field1338[Statics.field424 + 1];
            if (var4.field2690 > var4.field2748 - var4.field2684) {
                var4.field2690 = var4.field2748 - var4.field2684;
            }
            if (var4.field2690 < 0) {
                var4.field2690 = 0;
            }
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2798 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2697 = field1338[--Statics.field424] == 1;
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2699 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2799 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2703 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2721 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2706 = field1338[--Statics.field424] == 1;
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2711 = 1;
            var4.field2767 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field424 -= 6;
            var4.field2717 = field1338[Statics.field424];
            var4.field2718 = field1338[Statics.field424 + 1];
            var4.field2719 = field1338[Statics.field424 + 2];
            var4.field2720 = field1338[Statics.field424 + 3];
            var4.field2738 = field1338[Statics.field424 + 4];
            var4.field2782 = field1338[Statics.field424 + 5];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1338[--Statics.field424];
            if (var4.field2715 != var5) {
                var4.field2715 = var5;
                var4.field2741 = 0;
                var4.field2709 = 0;
                client.method1456(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2792 = field1338[--Statics.field424] == 1;
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1344[--Statics.field282];
            if (!var6.equals(var4.field2728)) {
                var4.field2728 = var6;
                client.method1456(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2734 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field424 -= 3;
            var4.field2731 = field1338[Statics.field424];
            var4.field2732 = field1338[Statics.field424 + 1];
            var4.field2730 = field1338[Statics.field424 + 2];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2733 = field1338[--Statics.field424] == 1;
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2801 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2708 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2793 = field1338[--Statics.field424] == 1;
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2710 = field1338[--Statics.field424] == 1;
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field424 -= 2;
            var4.field2691 = field1338[Statics.field424];
            var4.field2748 = field1338[Statics.field424 + 1];
            client.method1456(var4);
            if (var3 != -1 && var4.field2670 == 0) {
                client.method2902(Statics.field2627[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method627(var4.field2668, var4.field2669);
            client.field1080 = var4;
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2704 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2735 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2700 = field1338[--Statics.field424];
            client.method1456(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1338[--Statics.field424];
            class287 var8 = (class287) class172.method1577(class287.method1982(), var7);
            if (var8 != null) {
                var4.field2698 = var8;
                client.method1456(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1338[--Statics.field424] == 1;
            var4.field2702 = var9;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.t(ILcq;ZI)I")
    public static int method713(int arg0, class100 arg1, boolean arg2) {
        class220 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class220.method2339(field1338[--Statics.field424]);
        } else {
            var3 = arg2 ? Statics.field1542 : Statics.field813;
        }
        client.method1456(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field424 -= 2;
            int var4 = field1338[Statics.field424];
            int var5 = field1338[Statics.field424 + 1];
            var3.field2788 = var4;
            var3.field2672 = var5;
            class260 var6 = class260.method3655(var4);
            var3.field2719 = var6.field3518;
            var3.field2720 = var6.field3519;
            var3.field2738 = var6.field3520;
            var3.field2717 = var6.field3521;
            var3.field2718 = var6.field3500;
            var3.field2782 = var6.field3534;
            if (arg0 == 1205) {
                var3.field2726 = 0;
            } else if (arg0 == 1212 | var6.field3523 == 1) {
                var3.field2726 = 1;
            } else {
                var3.field2726 = 2;
            }
            if (var3.field2783 > 0) {
                var3.field2782 = var3.field2782 * 32 / var3.field2783;
            } else if (var3.field2679 > 0) {
                var3.field2782 = var3.field2782 * 32 / var3.field2679;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2711 = 2;
            var3.field2767 = field1338[--Statics.field424];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2711 = 3;
            var3.field2767 = Statics.field300.field898.method3704();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.p(ILcq;ZI)I")
    public static int method50(int arg0, class100 arg1, boolean arg2) {
        class220 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class220.method2339(field1338[--Statics.field424]);
        } else {
            var3 = arg2 ? Statics.field1542 : Statics.field813;
        }
        if (arg0 == 1300) {
            int var4 = field1338[--Statics.field424] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3753(var4, field1344[--Statics.field282]);
                return 1;
            } else {
                Statics.field282--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field424 -= 2;
            int var5 = field1338[Statics.field424];
            int var6 = field1338[Statics.field424 + 1];
            var3.field2743 = class220.method2938(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2725 = field1338[--Statics.field424] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2744 = field1338[--Statics.field424];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2745 = field1338[--Statics.field424];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2687 = field1344[--Statics.field282];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2747 = field1344[--Statics.field282];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2712 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.d(ILcq;ZI)I")
    public static int method20(int arg0, class100 arg1, boolean arg2) {
        class220 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class220.method2339(field1338[--Statics.field424]);
        } else {
            var3 = arg2 ? Statics.field1542 : Statics.field813;
        }
        String var4 = field1344[--Statics.field282];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1338[--Statics.field424];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1338[--Statics.field424];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1344[--Statics.field282];
            } else {
                var7[var8] = Integer.valueOf(field1338[--Statics.field424]);
            }
        }
        int var9 = field1338[--Statics.field424];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2750 = var7;
        } else if (arg0 == 1401) {
            var3.field2755 = var7;
        } else if (arg0 == 1402) {
            var3.field2752 = var7;
        } else if (arg0 == 1403) {
            var3.field2789 = var7;
        } else if (arg0 == 1404) {
            var3.field2723 = var7;
        } else if (arg0 == 1405) {
            var3.field2757 = var7;
        } else if (arg0 == 1406) {
            var3.field2760 = var7;
        } else if (arg0 == 1407) {
            var3.field2657 = var7;
            var3.field2762 = var5;
        } else if (arg0 == 1408) {
            var3.field2736 = var7;
        } else if (arg0 == 1409) {
            var3.field2768 = var7;
        } else if (arg0 == 1410) {
            var3.field2758 = var7;
        } else if (arg0 == 1411) {
            var3.field2751 = var7;
        } else if (arg0 == 1412) {
            var3.field2696 = var7;
        } else if (arg0 == 1414) {
            var3.field2763 = var7;
            var3.field2764 = var5;
        } else if (arg0 == 1415) {
            var3.field2765 = var7;
            var3.field2766 = var5;
        } else if (arg0 == 1416) {
            var3.field2759 = var7;
        } else if (arg0 == 1417) {
            var3.field2769 = var7;
        } else if (arg0 == 1418) {
            var3.field2742 = var7;
        } else if (arg0 == 1419) {
            var3.field2771 = var7;
        } else if (arg0 == 1420) {
            var3.field2753 = var7;
        } else if (arg0 == 1421) {
            var3.field2773 = var7;
        } else if (arg0 == 1422) {
            var3.field2774 = var7;
        } else if (arg0 == 1423) {
            var3.field2761 = var7;
        } else if (arg0 == 1424) {
            var3.field2776 = var7;
        } else if (arg0 == 1425) {
            var3.field2778 = var7;
        } else if (arg0 == 1426) {
            var3.field2791 = var7;
        } else if (arg0 == 1427) {
            var3.field2777 = var7;
        } else {
            return 2;
        }
        var3.field2729 = true;
        return 1;
    }

    @ObfuscatedName("bs.n(ILcq;ZI)I")
    public static int method902(int arg0, class100 arg1, boolean arg2) {
        class220 var3 = arg2 ? Statics.field1542 : Statics.field813;
        if (arg0 == 1500) {
            field1338[++Statics.field424 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 1501) {
            field1338[++Statics.field424 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 1502) {
            field1338[++Statics.field424 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 1503) {
            field1338[++Statics.field424 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 1504) {
            field1338[++Statics.field424 - 1] = var3.field2746 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1338[++Statics.field424 - 1] = var3.field2693;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bb.z(ILcq;ZI)I")
    public static int method990(int arg0, class100 arg1, boolean arg2) {
        class220 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class220.method2339(field1338[--Statics.field424]);
        } else {
            var3 = arg2 ? Statics.field1542 : Statics.field813;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1349 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2777 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field830 = var3;
            var4.field838 = var3.field2777;
            var4.field837 = field1349 + 1;
            client.field1115.method3394(var4);
            return 1;
        }
    }

    @ObfuscatedName("p.o(ILcq;ZB)I")
    public static int method24(int arg0, class100 arg1, boolean arg2) {
        class220 var3 = class220.method2339(field1338[--Statics.field424]);
        if (arg0 == 2500) {
            field1338[++Statics.field424 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 2501) {
            field1338[++Statics.field424 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 2502) {
            field1338[++Statics.field424 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 2503) {
            field1338[++Statics.field424 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 2504) {
            field1338[++Statics.field424 - 1] = var3.field2746 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1338[++Statics.field424 - 1] = var3.field2693;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.u(ILcq;ZI)I")
    public static int method2428(int arg0, class100 arg1, boolean arg2) {
        class220 var3 = class220.method2339(field1338[--Statics.field424]);
        if (arg0 == 2600) {
            field1338[++Statics.field424 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 2601) {
            field1338[++Statics.field424 - 1] = var3.field2690;
            return 1;
        } else if (arg0 == 2602) {
            field1344[++Statics.field282 - 1] = var3.field2728;
            return 1;
        } else if (arg0 == 2603) {
            field1338[++Statics.field424 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 2604) {
            field1338[++Statics.field424 - 1] = var3.field2748;
            return 1;
        } else if (arg0 == 2605) {
            field1338[++Statics.field424 - 1] = var3.field2782;
            return 1;
        } else if (arg0 == 2606) {
            field1338[++Statics.field424 - 1] = var3.field2719;
            return 1;
        } else if (arg0 == 2607) {
            field1338[++Statics.field424 - 1] = var3.field2738;
            return 1;
        } else if (arg0 == 2608) {
            field1338[++Statics.field424 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 2609) {
            field1338[++Statics.field424 - 1] = var3.field2699;
            return 1;
        } else if (arg0 == 2610) {
            field1338[++Statics.field424 - 1] = var3.field2700;
            return 1;
        } else if (arg0 == 2611) {
            field1338[++Statics.field424 - 1] = var3.field2798;
            return 1;
        } else if (arg0 == 2612) {
            field1338[++Statics.field424 - 1] = var3.field2735;
            return 1;
        } else if (arg0 == 2613) {
            field1338[++Statics.field424 - 1] = var3.field2698.method16();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fl.r(ILcq;ZB)I")
    public static int method2892(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class220 var3 = class220.method2339(field1338[--Statics.field424]);
            field1338[++Statics.field424 - 1] = var3.field2788;
            return 1;
        } else if (arg0 == 2701) {
            class220 var4 = class220.method2339(field1338[--Statics.field424]);
            if (var4.field2788 == -1) {
                field1338[++Statics.field424 - 1] = 0;
            } else {
                field1338[++Statics.field424 - 1] = var4.field2672;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1338[--Statics.field424];
            class69 var6 = (class69) client.field1077.method3339((long) var5);
            if (var6 == null) {
                field1338[++Statics.field424 - 1] = 0;
            } else {
                field1338[++Statics.field424 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1338[++Statics.field424 - 1] = client.field1076;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ah.l(ILcq;ZB)I")
    public static int method549(int arg0, class100 arg1, boolean arg2) {
        class220 var3 = class220.method2339(field1338[--Statics.field424]);
        if (arg0 == 2800) {
            field1338[++Statics.field424 - 1] = class221.method95(client.method1955(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1338[--Statics.field424];
            int var5 = var4 - 1;
            if (var3.field2712 == null || var5 >= var3.field2712.length || var3.field2712[var5] == null) {
                field1344[++Statics.field282 - 1] = "";
            } else {
                field1344[++Statics.field282 - 1] = var3.field2712[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2687 == null) {
                field1344[++Statics.field282 - 1] = "";
            } else {
                field1344[++Statics.field282 - 1] = var3.field2687;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.y(ILcq;ZI)I")
    public static int method165(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field424 -= 3;
            int var3 = field1338[Statics.field424];
            int var4 = field1338[Statics.field424 + 1];
            int var5 = field1338[Statics.field424 + 2];
            if (client.field1154 != 0 && var4 != 0 && client.field1045 < 50) {
                client.field1157[client.field1045] = var3;
                client.field1087[client.field1045] = var4;
                client.field1159[client.field1045] = var5;
                client.field1161[client.field1045] = null;
                client.field1160[client.field1045] = 0;
                client.field1045++;
            }
            return 1;
        } else if (arg0 == 3201) {
            int var6 = field1338[--Statics.field424];
            if (var6 == -1 && !client.field1119) {
                class207.method2821();
            } else if (var6 != -1 && client.field1152 != var6 && client.field1151 != 0 && !client.field1119) {
                class241 var7 = Statics.field666;
                int var8 = client.field1151;
                class207.field2523 = 1;
                Statics.field3408 = var7;
                Statics.field1408 = var6;
                Statics.field3684 = 0;
                Statics.field2526 = var8;
                Statics.field353 = false;
                Statics.field2525 = 2;
            }
            client.field1152 = var6;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field424 -= 2;
            int var9 = field1338[Statics.field424];
            int var10 = field1338[Statics.field424 + 1];
            if (client.field1151 != 0 && var9 != -1) {
                class207.method1045(Statics.field306, var9, 0, client.field1151, false);
                client.field1119 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("e.w(ILcq;ZI)I")
    public static int method82(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field424 -= 2;
            int var3 = field1338[Statics.field424];
            int var4 = field1338[Statics.field424 + 1];
            class257 var5 = (class257) class257.field3413.method3319((long) var3);
            class257 var6;
            if (var5 == null) {
                byte[] var7 = Statics.field3415.method3840(8, var3);
                class257 var8 = new class257();
                if (var7 != null) {
                    var8.method4196(new class177(var7));
                }
                class257.field3413.method3315(var8, (long) var3);
                var6 = var8;
            } else {
                var6 = var5;
            }
            class257 var9 = var6;
            if (var6.field3412 != 's') {
            }
            for (int var10 = 0; var10 < var9.field3418; var10++) {
                if (var9.field3419[var10] == var4) {
                    field1344[++Statics.field282 - 1] = var9.field3421[var10];
                    var9 = null;
                    break;
                }
            }
            if (var9 != null) {
                field1344[++Statics.field282 - 1] = var9.field3416;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field424 -= 4;
            int var11 = field1338[Statics.field424];
            int var12 = field1338[Statics.field424 + 1];
            int var13 = field1338[Statics.field424 + 2];
            int var14 = field1338[Statics.field424 + 3];
            class257 var15 = (class257) class257.field3413.method3319((long) var13);
            class257 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field3415.method3840(8, var13);
                class257 var18 = new class257();
                if (var17 != null) {
                    var18.method4196(new class177(var17));
                }
                class257.field3413.method3315(var18, (long) var13);
                var16 = var18;
            } else {
                var16 = var15;
            }
            class257 var19 = var16;
            if (var16.field3414 != var11 || var16.field3412 != var12) {
                if (var12 == 115) {
                    field1344[++Statics.field282 - 1] = "null";
                } else {
                    field1338[++Statics.field424 - 1] = 0;
                }
                return 1;
            }
            for (int var20 = 0; var20 < var19.field3418; var20++) {
                if (var19.field3419[var20] == var14) {
                    if (var12 == 115) {
                        field1344[++Statics.field282 - 1] = var19.field3421[var20];
                    } else {
                        field1338[++Statics.field424 - 1] = var19.field3420[var20];
                    }
                    var19 = null;
                    break;
                }
            }
            if (var19 != null) {
                if (var12 == 115) {
                    field1344[++Statics.field282 - 1] = var19.field3416;
                } else {
                    field1338[++Statics.field424 - 1] = var19.field3417;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bb.i(ILcq;ZB)I")
    public static int method989(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = client.field967[var3].method100();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = client.field967[var4].field318;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = client.field967[var5].field314;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = client.field967[var6].field315;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = client.field967[var7].field316;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = client.field967[var8].field317;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1338[--Statics.field424];
            int var10 = client.field967[var9].method102();
            field1338[++Statics.field424 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1338[--Statics.field424];
            int var12 = client.field967[var11].method102();
            field1338[++Statics.field424 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1338[--Statics.field424];
            int var14 = client.field967[var13].method102();
            field1338[++Statics.field424 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1338[--Statics.field424];
            int var16 = client.field967[var15].method102();
            field1338[++Statics.field424 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1338[--Statics.field424] == 1;
            if (Statics.field1780 != null) {
                Statics.field1780.method65(class14.field287, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1338[--Statics.field424] == 1;
            if (Statics.field1780 != null) {
                Statics.field1780.method65(class14.field286, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field424 -= 2;
            boolean var19 = field1338[Statics.field424] == 1;
            boolean var20 = field1338[Statics.field424 + 1] == 1;
            if (Statics.field1780 != null) {
                Statics.field1780.method65(new class96(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1338[--Statics.field424] == 1;
            if (Statics.field1780 != null) {
                Statics.field1780.method65(class14.field288, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1338[--Statics.field424] == 1;
            if (Statics.field1780 != null) {
                Statics.field1780.method65(class14.field290, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1338[++Statics.field424 - 1] = Statics.field1780 == null ? 0 : Statics.field1780.field285.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1338[--Statics.field424];
            class15 var24 = (class15) Statics.field1780.field285.get(var23);
            field1338[++Statics.field424 - 1] = var24.field299;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1338[--Statics.field424];
            class15 var26 = (class15) Statics.field1780.field285.get(var25);
            field1344[++Statics.field282 - 1] = var26.method75();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1338[--Statics.field424];
            class15 var28 = (class15) Statics.field1780.field285.get(var27);
            field1344[++Statics.field282 - 1] = var28.method83();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1338[--Statics.field424];
            class15 var30 = (class15) Statics.field1780.field285.get(var29);
            long var31 = class179.method3585() - Statics.field406 - var30.field295;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1344[++Statics.field282 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1338[--Statics.field424];
            class15 var38 = (class15) Statics.field1780.field285.get(var37);
            field1338[++Statics.field424 - 1] = var38.field305.field315;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1338[--Statics.field424];
            class15 var40 = (class15) Statics.field1780.field285.get(var39);
            field1338[++Statics.field424 - 1] = var40.field305.field314;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1338[--Statics.field424];
            class15 var42 = (class15) Statics.field1780.field285.get(var41);
            field1338[++Statics.field424 - 1] = var42.field305.field318;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.a(ILcq;ZI)I")
    public static int method983(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1344[--Statics.field282];
            int var4 = field1338[--Statics.field424];
            field1344[++Statics.field282 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field282 -= 2;
            String var5 = field1344[Statics.field282];
            String var6 = field1344[Statics.field282 + 1];
            field1344[++Statics.field282 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1344[--Statics.field282];
            int var8 = field1338[--Statics.field424];
            field1344[++Statics.field282 - 1] = var7 + class274.method4402(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1344[--Statics.field282];
            field1344[++Statics.field282 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1338[--Statics.field424];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1350.setTime(new Date(var11));
            int var13 = field1350.get(5);
            int var14 = field1350.get(2);
            int var15 = field1350.get(1);
            field1344[++Statics.field282 - 1] = var13 + "-" + field1348[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field282 -= 2;
            String var16 = field1344[Statics.field282];
            String var17 = field1344[Statics.field282 + 1];
            if (Statics.field300.field898 != null && Statics.field300.field898.field2637) {
                field1344[++Statics.field282 - 1] = var17;
            } else {
                field1344[++Statics.field282 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1338[--Statics.field424];
            field1344[++Statics.field282 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field282 -= 2;
            int[] var19 = field1338;
            int var20 = ++Statics.field424 - 1;
            String var21 = field1344[Statics.field282];
            String var22 = field1344[Statics.field282 + 1];
            int var23 = client.field1129;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            byte var28 = 0;
            byte var29 = 0;
            int var38;
            label241: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class168.method1387(var36, var23) - class168.method1387(var37, var23);
                                break label241;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class168.method1387(var41, var23) - class168.method1387(var42, var23);
                                break label241;
                            }
                        }
                        var38 = 0;
                    } else {
                        var38 = var39;
                    }
                    break;
                }
                if (var26 - var28 >= var24) {
                    var38 = -1;
                    break;
                }
                if (var27 - var29 >= var25) {
                    var38 = 1;
                    break;
                }
                char var43;
                if (var28 == 0) {
                    var43 = var21.charAt(var26++);
                } else {
                    var43 = (char) var28;
                    boolean var44 = false;
                }
                char var45;
                if (var29 == 0) {
                    var45 = var22.charAt(var27++);
                } else {
                    var45 = (char) var29;
                    boolean var46 = false;
                }
                byte var47;
                if (var43 == 198) {
                    var47 = 69;
                } else if (var43 == 230) {
                    var47 = 101;
                } else if (var43 == 223) {
                    var47 = 115;
                } else if (var43 == 338) {
                    var47 = 69;
                } else if (var43 == 339) {
                    var47 = 101;
                } else {
                    var47 = 0;
                }
                var28 = var47;
                byte var48;
                if (var45 == 198) {
                    var48 = 69;
                } else if (var45 == 230) {
                    var48 = 101;
                } else if (var45 == 223) {
                    var48 = 115;
                } else if (var45 == 338) {
                    var48 = 69;
                } else if (var45 == 339) {
                    var48 = 101;
                } else {
                    var48 = 0;
                }
                var29 = var48;
                char var49 = class168.method986(var43, var23);
                char var50 = class168.method986(var45, var23);
                if (var49 != var50 && Character.toUpperCase(var49) != Character.toUpperCase(var50)) {
                    char var51 = Character.toLowerCase(var49);
                    char var52 = Character.toLowerCase(var50);
                    if (var51 != var52) {
                        var38 = class168.method1387(var51, var23) - class168.method1387(var52, var23);
                        break;
                    }
                }
            }
            var19[var20] = class274.method2935(var38);
            return 1;
        } else if (arg0 == 4108) {
            String var53 = field1344[--Statics.field282];
            Statics.field424 -= 2;
            int var54 = field1338[Statics.field424];
            int var55 = field1338[Statics.field424 + 1];
            byte[] var56 = Statics.field615.method3840(var55, 0);
            class267 var57 = new class267(var56);
            field1338[++Statics.field424 - 1] = var57.method4485(var53, var54);
            return 1;
        } else if (arg0 == 4109) {
            String var58 = field1344[--Statics.field282];
            Statics.field424 -= 2;
            int var59 = field1338[Statics.field424];
            int var60 = field1338[Statics.field424 + 1];
            byte[] var61 = Statics.field615.method3840(var60, 0);
            class267 var62 = new class267(var61);
            field1338[++Statics.field424 - 1] = var62.method4484(var58, var59);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field282 -= 2;
            String var63 = field1344[Statics.field282];
            String var64 = field1344[Statics.field282 + 1];
            if (field1338[--Statics.field424] == 1) {
                field1344[++Statics.field282 - 1] = var63;
            } else {
                field1344[++Statics.field282 - 1] = var64;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var65 = field1344[--Statics.field282];
            field1344[++Statics.field282 - 1] = class268.method4486(var65);
            return 1;
        } else if (arg0 == 4112) {
            String var66 = field1344[--Statics.field282];
            int var67 = field1338[--Statics.field424];
            field1344[++Statics.field282 - 1] = var66 + (char) var67;
            return 1;
        } else if (arg0 == 4113) {
            int var68 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = class274.method84((char) var68) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var69 = field1338[--Statics.field424];
            int[] var70 = field1338;
            int var71 = ++Statics.field424 - 1;
            char var72 = (char) var69;
            boolean var73 = var72 >= '0' && var72 <= '9' || var72 >= 'A' && var72 <= 'Z' || var72 >= 'a' && var72 <= 'z';
            var70[var71] = var73 ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var74 = field1338[--Statics.field424];
            int[] var75 = field1338;
            int var76 = ++Statics.field424 - 1;
            char var77 = (char) var74;
            boolean var78 = var77 >= 'A' && var77 <= 'Z' || var77 >= 'a' && var77 <= 'z';
            var75[var76] = var78 ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var79 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = class274.method875((char) var79) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var80 = field1344[--Statics.field282];
            if (var80 == null) {
                field1338[++Statics.field424 - 1] = 0;
            } else {
                field1338[++Statics.field424 - 1] = var80.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var81 = field1344[--Statics.field282];
            Statics.field424 -= 2;
            int var82 = field1338[Statics.field424];
            int var83 = field1338[Statics.field424 + 1];
            field1344[++Statics.field282 - 1] = var81.substring(var82, var83);
            return 1;
        } else if (arg0 == 4119) {
            String var84 = field1344[--Statics.field282];
            StringBuilder var85 = new StringBuilder(var84.length());
            boolean var86 = false;
            for (int var87 = 0; var87 < var84.length(); var87++) {
                char var88 = var84.charAt(var87);
                if (var88 == '<') {
                    var86 = true;
                } else if (var88 == '>') {
                    var86 = false;
                } else if (!var86) {
                    var85.append(var88);
                }
            }
            field1344[++Statics.field282 - 1] = var85.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var89 = field1344[--Statics.field282];
            int var90 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = var89.indexOf(var90);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field282 -= 2;
            String var91 = field1344[Statics.field282];
            String var92 = field1344[Statics.field282 + 1];
            int var93 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = var91.indexOf(var92, var93);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.x(ILcq;ZI)I")
    public static int method665(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1338[--Statics.field424];
            field1344[++Statics.field282 - 1] = class260.method3655(var3).field3512;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field424 -= 2;
            int var4 = field1338[Statics.field424];
            int var5 = field1338[Statics.field424 + 1];
            class260 var6 = class260.method3655(var4);
            if (var5 < 1 || var5 > 5 || var6.field3526[var5 - 1] == null) {
                field1344[++Statics.field282 - 1] = "";
            } else {
                field1344[++Statics.field282 - 1] = var6.field3526[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field424 -= 2;
            int var7 = field1338[Statics.field424];
            int var8 = field1338[Statics.field424 + 1];
            class260 var9 = class260.method3655(var7);
            if (var8 < 1 || var8 > 5 || var9.field3527[var8 - 1] == null) {
                field1344[++Statics.field282 - 1] = "";
            } else {
                field1344[++Statics.field282 - 1] = var9.field3527[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = class260.method3655(var10).field3524;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = class260.method3655(var11).field3523 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1338[--Statics.field424];
            class260 var13 = class260.method3655(var12);
            if (var13.field3536 == -1 && var13.field3554 >= 0) {
                field1338[++Statics.field424 - 1] = var13.field3554;
            } else {
                field1338[++Statics.field424 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1338[--Statics.field424];
            class260 var15 = class260.method3655(var14);
            if (var15.field3536 >= 0 && var15.field3554 >= 0) {
                field1338[++Statics.field424 - 1] = var15.field3554;
            } else {
                field1338[++Statics.field424 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = class260.method3655(var16).field3525 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1338[--Statics.field424];
            class260 var18 = class260.method3655(var17);
            if (var18.field3556 == -1 && var18.field3533 >= 0) {
                field1338[++Statics.field424 - 1] = var18.field3533;
            } else {
                field1338[++Statics.field424 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1338[--Statics.field424];
            class260 var20 = class260.method3655(var19);
            if (var20.field3556 >= 0 && var20.field3533 >= 0) {
                field1338[++Statics.field424 - 1] = var20.field3533;
            } else {
                field1338[++Statics.field424 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1344[--Statics.field282];
            int var22 = field1338[--Statics.field424];
            boolean var24 = var22 == 1;
            String var25 = var21.toLowerCase();
            short[] var26 = new short[16];
            int var27 = 0;
            int var28 = 0;
            while (true) {
                if (var28 >= Statics.field2211) {
                    Statics.field3250 = var26;
                    Statics.field342 = 0;
                    Statics.field356 = var27;
                    String[] var32 = new String[Statics.field356];
                    for (int var33 = 0; var33 < Statics.field356; var33++) {
                        var32[var33] = class260.method3655(var26[var33]).field3512;
                    }
                    class174.method630(var32, Statics.field3250);
                    break;
                }
                class260 var29 = class260.method3655(var28);
                if ((!var24 || var29.field3552) && var29.field3536 == -1 && var29.field3512.toLowerCase().indexOf(var25) != -1) {
                    if (var27 >= 250) {
                        Statics.field356 = -1;
                        Statics.field3250 = null;
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
            field1338[++Statics.field424 - 1] = Statics.field356;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field3250 == null || Statics.field342 >= Statics.field356) {
                field1338[++Statics.field424 - 1] = -1;
            } else {
                field1338[++Statics.field424 - 1] = Statics.field3250[++Statics.field342 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field342 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.j(ILcq;ZB)I")
    public static int method659(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1338[++Statics.field424 - 1] = client.field943;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field424 -= 3;
            client.field943 = field1338[Statics.field424];
            int var3 = field1338[Statics.field424 + 1];
            class280[] var4 = new class280[] { class280.field3744, class280.field3742, class280.field3743 };
            class280[] var5 = var4;
            int var6 = 0;
            class280 var8;
            while (true) {
                if (var6 >= var5.length) {
                    var8 = null;
                    break;
                }
                class280 var7 = var5[var6];
                if (var7.field3745 == var3) {
                    var8 = var7;
                    break;
                }
                var6++;
            }
            Statics.field451 = var8;
            if (Statics.field451 == null) {
                Statics.field451 = class280.field3742;
            }
            client.field1133 = field1338[Statics.field424 + 2];
            client.field958.method3195(42);
            client.field958.method3129(client.field943);
            client.field958.method3129(Statics.field451.field3745);
            client.field958.method3129(client.field1133);
            return 1;
        } else if (arg0 == 5002) {
            String var9 = field1344[--Statics.field282];
            Statics.field424 -= 2;
            int var10 = field1338[Statics.field424];
            int var11 = field1338[Statics.field424 + 1];
            client.field958.method3195(254);
            client.field958.method3129(class177.method2707(var9) + 2);
            client.field958.method2956(var9);
            client.field958.method3129(var10 - 1);
            client.field958.method3129(var11);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field424 -= 2;
            int var12 = field1338[Statics.field424];
            int var13 = field1338[Statics.field424 + 1];
            class73 var14 = class99.method27(var12, var13);
            if (var14 == null) {
                field1338[++Statics.field424 - 1] = -1;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
                field1344[++Statics.field282 - 1] = "";
                field1344[++Statics.field282 - 1] = "";
            } else {
                field1338[++Statics.field424 - 1] = var14.field863;
                field1338[++Statics.field424 - 1] = var14.field858;
                field1344[++Statics.field282 - 1] = var14.field868 == null ? "" : var14.field868;
                field1344[++Statics.field282 - 1] = var14.field857 == null ? "" : var14.field857;
                field1344[++Statics.field282 - 1] = var14.field862 == null ? "" : var14.field862;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var15 = field1338[--Statics.field424];
            class73 var16 = (class73) class99.field1515.method3283((long) var15);
            if (var16 == null) {
                field1338[++Statics.field424 - 1] = -1;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
                field1344[++Statics.field282 - 1] = "";
                field1344[++Statics.field282 - 1] = "";
            } else {
                field1338[++Statics.field424 - 1] = var16.field859;
                field1338[++Statics.field424 - 1] = var16.field858;
                field1344[++Statics.field282 - 1] = var16.field868 == null ? "" : var16.field868;
                field1344[++Statics.field282 - 1] = var16.field857 == null ? "" : var16.field857;
                field1344[++Statics.field282 - 1] = var16.field862 == null ? "" : var16.field862;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field451 == null) {
                field1338[++Statics.field424 - 1] = -1;
            } else {
                field1338[++Statics.field424 - 1] = Statics.field451.field3745;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var18 = field1344[--Statics.field282];
            int var19 = field1338[--Statics.field424];
            String var20 = var18.toLowerCase();
            byte var21 = 0;
            if (var20.startsWith(class229.field3047)) {
                var21 = 0;
                var18 = var18.substring(class229.field3047.length());
            } else if (var20.startsWith(class229.field2987)) {
                var21 = 1;
                var18 = var18.substring(class229.field2987.length());
            } else if (var20.startsWith(class229.field3131)) {
                var21 = 2;
                var18 = var18.substring(class229.field3131.length());
            } else if (var20.startsWith(class229.field3053)) {
                var21 = 3;
                var18 = var18.substring(class229.field3053.length());
            } else if (var20.startsWith(class229.field3055)) {
                var21 = 4;
                var18 = var18.substring(class229.field3055.length());
            } else if (var20.startsWith(class229.field3057)) {
                var21 = 5;
                var18 = var18.substring(class229.field3057.length());
            } else if (var20.startsWith(class229.field3059)) {
                var21 = 6;
                var18 = var18.substring(class229.field3059.length());
            } else if (var20.startsWith(class229.field3061)) {
                var21 = 7;
                var18 = var18.substring(class229.field3061.length());
            } else if (var20.startsWith(class229.field2912)) {
                var21 = 8;
                var18 = var18.substring(class229.field2912.length());
            } else if (var20.startsWith(class229.field3065)) {
                var21 = 9;
                var18 = var18.substring(class229.field3065.length());
            } else if (var20.startsWith(class229.field3035)) {
                var21 = 10;
                var18 = var18.substring(class229.field3035.length());
            } else if (var20.startsWith(class229.field3069)) {
                var21 = 11;
                var18 = var18.substring(class229.field3069.length());
            } else if (client.field1129 != 0) {
                if (var20.startsWith(class229.field3048)) {
                    var21 = 0;
                    var18 = var18.substring(class229.field3048.length());
                } else if (var20.startsWith(class229.field2946)) {
                    var21 = 1;
                    var18 = var18.substring(class229.field2946.length());
                } else if (var20.startsWith(class229.field3052)) {
                    var21 = 2;
                    var18 = var18.substring(class229.field3052.length());
                } else if (var20.startsWith(class229.field3121)) {
                    var21 = 3;
                    var18 = var18.substring(class229.field3121.length());
                } else if (var20.startsWith(class229.field3056)) {
                    var21 = 4;
                    var18 = var18.substring(class229.field3056.length());
                } else if (var20.startsWith(class229.field3058)) {
                    var21 = 5;
                    var18 = var18.substring(class229.field3058.length());
                } else if (var20.startsWith(class229.field3060)) {
                    var21 = 6;
                    var18 = var18.substring(class229.field3060.length());
                } else if (var20.startsWith(class229.field3062)) {
                    var21 = 7;
                    var18 = var18.substring(class229.field3062.length());
                } else if (var20.startsWith(class229.field3064)) {
                    var21 = 8;
                    var18 = var18.substring(class229.field3064.length());
                } else if (var20.startsWith(class229.field3066)) {
                    var21 = 9;
                    var18 = var18.substring(class229.field3066.length());
                } else if (var20.startsWith(class229.field2917)) {
                    var21 = 10;
                    var18 = var18.substring(class229.field2917.length());
                } else if (var20.startsWith(class229.field3070)) {
                    var21 = 11;
                    var18 = var18.substring(class229.field3070.length());
                }
            }
            String var22 = var18.toLowerCase();
            byte var23 = 0;
            if (var22.startsWith(class229.field3071)) {
                var23 = 1;
                var18 = var18.substring(class229.field3071.length());
            } else if (var22.startsWith(class229.field3073)) {
                var23 = 2;
                var18 = var18.substring(class229.field3073.length());
            } else if (var22.startsWith(class229.field3075)) {
                var23 = 3;
                var18 = var18.substring(class229.field3075.length());
            } else if (var22.startsWith(class229.field3077)) {
                var23 = 4;
                var18 = var18.substring(class229.field3077.length());
            } else if (var22.startsWith(class229.field3083)) {
                var23 = 5;
                var18 = var18.substring(class229.field3083.length());
            } else if (client.field1129 != 0) {
                if (var22.startsWith(class229.field2933)) {
                    var23 = 1;
                    var18 = var18.substring(class229.field2933.length());
                } else if (var22.startsWith(class229.field3074)) {
                    var23 = 2;
                    var18 = var18.substring(class229.field3074.length());
                } else if (var22.startsWith(class229.field3076)) {
                    var23 = 3;
                    var18 = var18.substring(class229.field3076.length());
                } else if (var22.startsWith(class229.field2883)) {
                    var23 = 4;
                    var18 = var18.substring(class229.field2883.length());
                } else if (var22.startsWith(class229.field3080)) {
                    var23 = 5;
                    var18 = var18.substring(class229.field3080.length());
                }
            }
            client.field958.method3195(116);
            client.field958.method3129(0);
            int var24 = client.field958.field2402;
            client.field958.method3129(var19);
            client.field958.method3129(var21);
            client.field958.method3129(var23);
            Statics.method179(client.field958, var18);
            client.field958.method2954(client.field958.field2402 - var24);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field282 -= 2;
            String var25 = field1344[Statics.field282];
            String var26 = field1344[Statics.field282 + 1];
            client.field958.method3195(54);
            client.field958.method2951(0);
            int var27 = client.field958.field2402;
            client.field958.method2956(var25);
            Statics.method179(client.field958, var26);
            client.field958.method2961(client.field958.field2402 - var27);
            return 1;
        } else if (arg0 == 5015) {
            String var28;
            if (Statics.field300 == null || Statics.field300.field891 == null) {
                var28 = "";
            } else {
                var28 = Statics.field300.field891;
            }
            field1344[++Statics.field282 - 1] = var28;
            return 1;
        } else if (arg0 == 5016) {
            field1338[++Statics.field424 - 1] = client.field1133;
            return 1;
        } else if (arg0 == 5017) {
            int var29 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = class99.method3929(var29);
            return 1;
        } else if (arg0 == 5018) {
            int var30 = field1338[--Statics.field424];
            int[] var31 = field1338;
            int var32 = ++Statics.field424 - 1;
            class73 var33 = (class73) class99.field1515.method3283((long) var30);
            int var34;
            if (var33 == null) {
                var34 = -1;
            } else if (class99.field1516.field2506 == var33.field2492) {
                var34 = -1;
            } else {
                var34 = ((class73) var33.field2492).field863;
            }
            var31[var32] = var34;
            return 1;
        } else if (arg0 == 5019) {
            int var35 = field1338[--Statics.field424];
            field1338[++Statics.field424 - 1] = class99.method3926(var35);
            return 1;
        } else if (arg0 == 5020) {
            String var36 = field1344[--Statics.field282];
            client.method615(var36);
            return 1;
        } else if (arg0 == 5021) {
            client.field1134 = field1344[--Statics.field282].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1344[++Statics.field282 - 1] = client.field1134;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.v(ILcq;ZI)I")
    public static int method180(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field424 -= 2;
            int var3 = field1338[Statics.field424];
            int var4 = field1338[Statics.field424 + 1];
            if (!client.field1162) {
                client.field971 = var3;
                client.field1000 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1338[++Statics.field424 - 1] = client.field971;
            return 1;
        } else if (arg0 == 5506) {
            field1338[++Statics.field424 - 1] = client.field1000;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1338[--Statics.field424];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field1058 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1338[++Statics.field424 - 1] = client.field1058;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.ap(ILcq;ZB)I")
    public static int method132(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field1095 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.ar(ILcq;ZI)I")
    public static int method249(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field424 -= 2;
            client.field1168 = (short) field1338[Statics.field424];
            if (client.field1168 <= 0) {
                client.field1168 = 256;
            }
            client.field1038 = (short) field1338[Statics.field424 + 1];
            if (client.field1038 <= 0) {
                client.field1038 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field424 -= 2;
            client.field1170 = (short) field1338[Statics.field424];
            if (client.field1170 <= 0) {
                client.field1170 = 256;
            }
            client.field1171 = (short) field1338[Statics.field424 + 1];
            if (client.field1171 <= 0) {
                client.field1171 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field424 -= 4;
            client.field974 = (short) field1338[Statics.field424];
            if (client.field974 <= 0) {
                client.field974 = 1;
            }
            client.field1173 = (short) field1338[Statics.field424 + 1];
            if (client.field1173 <= 0) {
                client.field1173 = 32767;
            } else if (client.field1173 < client.field974) {
                client.field1173 = client.field974;
            }
            client.field1174 = (short) field1338[Statics.field424 + 2];
            if (client.field1174 <= 0) {
                client.field1174 = 1;
            }
            client.field928 = (short) field1338[Statics.field424 + 3];
            if (client.field928 <= 0) {
                client.field928 = 32767;
            } else if (client.field928 < client.field1174) {
                client.field928 = client.field1174;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1088 == null) {
                field1338[++Statics.field424 - 1] = -1;
                field1338[++Statics.field424 - 1] = -1;
            } else {
                client.method705(0, 0, client.field1088.field2683, client.field1088.field2684, false);
                field1338[++Statics.field424 - 1] = client.field1178;
                field1338[++Statics.field424 - 1] = client.field1179;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1338[++Statics.field424 - 1] = client.field1170;
            field1338[++Statics.field424 - 1] = client.field1171;
            return 1;
        } else if (arg0 == 6205) {
            field1338[++Statics.field424 - 1] = client.field1168;
            field1338[++Statics.field424 - 1] = client.field1038;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.am(ILcq;ZI)I")
    public static int method460(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1338[++Statics.field424 - 1] = class81.method1641() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = class81.method821();
            if (var3 == null) {
                field1338[++Statics.field424 - 1] = -1;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
                field1338[++Statics.field424 - 1] = 0;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
            } else {
                field1338[++Statics.field424 - 1] = var3.field1303;
                field1338[++Statics.field424 - 1] = var3.field1300;
                field1344[++Statics.field282 - 1] = var3.field1304;
                field1338[++Statics.field424 - 1] = var3.field1308;
                field1338[++Statics.field424 - 1] = var3.field1305;
                field1344[++Statics.field282 - 1] = var3.field1311;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4;
            if (class81.field1298 < class81.field1299) {
                var4 = Statics.field1294[++class81.field1298 - 1];
            } else {
                var4 = null;
            }
            if (var4 == null) {
                field1338[++Statics.field424 - 1] = -1;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
                field1338[++Statics.field424 - 1] = 0;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
            } else {
                field1338[++Statics.field424 - 1] = var4.field1303;
                field1338[++Statics.field424 - 1] = var4.field1300;
                field1344[++Statics.field282 - 1] = var4.field1304;
                field1338[++Statics.field424 - 1] = var4.field1308;
                field1338[++Statics.field424 - 1] = var4.field1305;
                field1344[++Statics.field282 - 1] = var4.field1311;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var6 = field1338[--Statics.field424];
            class81 var7 = null;
            for (int var8 = 0; var8 < class81.field1299; var8++) {
                if (Statics.field1294[var8].field1303 == var6) {
                    var7 = Statics.field1294[var8];
                    break;
                }
            }
            if (var7 == null) {
                field1338[++Statics.field424 - 1] = -1;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
                field1338[++Statics.field424 - 1] = 0;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
            } else {
                field1338[++Statics.field424 - 1] = var7.field1303;
                field1338[++Statics.field424 - 1] = var7.field1300;
                field1344[++Statics.field282 - 1] = var7.field1304;
                field1338[++Statics.field424 - 1] = var7.field1308;
                field1338[++Statics.field424 - 1] = var7.field1305;
                field1344[++Statics.field282 - 1] = var7.field1311;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field424 -= 4;
            int var9 = field1338[Statics.field424];
            boolean var10 = field1338[Statics.field424 + 1] == 1;
            int var11 = field1338[Statics.field424 + 2];
            boolean var12 = field1338[Statics.field424 + 3] == 1;
            if (Statics.field1294 != null) {
                class81.method2900(0, Statics.field1294.length - 1, var9, var10, var11, var12);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var13 = field1338[--Statics.field424];
            if (var13 >= 0 && var13 < class81.field1299) {
                class81 var14 = Statics.field1294[var13];
                field1338[++Statics.field424 - 1] = var14.field1303;
                field1338[++Statics.field424 - 1] = var14.field1300;
                field1344[++Statics.field282 - 1] = var14.field1304;
                field1338[++Statics.field424 - 1] = var14.field1308;
                field1338[++Statics.field424 - 1] = var14.field1305;
                field1344[++Statics.field282 - 1] = var14.field1311;
            } else {
                field1338[++Statics.field424 - 1] = -1;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
                field1338[++Statics.field424 - 1] = 0;
                field1338[++Statics.field424 - 1] = 0;
                field1344[++Statics.field282 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1062 = field1338[--Statics.field424] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field424 -= 2;
            int var15 = field1338[Statics.field424];
            int var16 = field1338[Statics.field424 + 1];
            class255 var17 = class255.method3819(var16);
            if (var17.method4158()) {
                field1344[++Statics.field282 - 1] = class262.method4152(var15).method4393(var16, var17.field3404);
            } else {
                field1338[++Statics.field424 - 1] = class262.method4152(var15).method4385(var16, var17.field3400);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field424 -= 2;
            int var18 = field1338[Statics.field424];
            int var19 = field1338[Statics.field424 + 1];
            class255 var20 = class255.method3819(var19);
            if (var20.method4158()) {
                field1344[++Statics.field282 - 1] = class259.method653(var18).method4248(var19, var20.field3404);
            } else {
                field1338[++Statics.field424 - 1] = class259.method653(var18).method4250(var19, var20.field3400);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field424 -= 2;
            int var21 = field1338[Statics.field424];
            int var22 = field1338[Statics.field424 + 1];
            class255 var23 = class255.method3819(var22);
            if (var23.method4158()) {
                field1344[++Statics.field282 - 1] = class260.method3655(var21).method4307(var22, var23.field3404);
            } else {
                field1338[++Statics.field424 - 1] = class260.method3655(var21).method4306(var22, var23.field3400);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field424 -= 2;
            int var24 = field1338[Statics.field424];
            int var25 = field1338[Statics.field424 + 1];
            class255 var26 = class255.method3819(var25);
            if (var26.method4158()) {
                field1344[++Statics.field282 - 1] = class256.method2237(var24).method4179(var25, var26.field3404);
            } else {
                field1338[++Statics.field424 - 1] = class256.method2237(var24).method4178(var25, var26.field3400);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.ab(IB)V")
    public static void method56(int arg0) {
        if (arg0 == -1 || !class220.method4620(arg0)) {
            return;
        }
        class220[] var1 = Statics.field2627[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class220 var3 = var1[var2];
            if (var3.field2749 != null) {
                class70 var4 = new class70();
                var4.field830 = var3;
                var4.field838 = var3.field2749;
                method998(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("ev.af(ILhp;ZI)V")
    public static void method2431(int arg0, class216 arg1, boolean arg2) {
        class33 var3 = client.method493().method5001(arg0);
        int var4 = Statics.field300.field894;
        int var5 = (Statics.field300.field1282 >> 7) + Statics.field590;
        int var6 = (Statics.field300.field1225 >> 7) + Statics.field617;
        class216 var7 = new class216(var4, var5, var6);
        client.method493().method4913(var3, var7, arg1, arg2);
    }
}
