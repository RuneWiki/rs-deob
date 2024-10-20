package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ch")
public class class84 {

    @ObfuscatedName("ch.d")
    public static int[] field1343 = new int[5];

    @ObfuscatedName("ch.b")
    public static int[][] field1344 = new int[5][5000];

    @ObfuscatedName("ch.k")
    public static int[] field1350 = new int[1000];

    @ObfuscatedName("ch.j")
    public static String[] field1356 = new String[1000];

    @ObfuscatedName("ch.h")
    public static int field1347 = 0;

    @ObfuscatedName("ch.i")
    public static class63[] field1346 = new class63[50];

    @ObfuscatedName("ch.c")
    public static Calendar field1349 = Calendar.getInstance();

    @ObfuscatedName("ch.v")
    public static final String[] field1345 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ch.w")
    public static int field1348 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.e(Lbg;I)V")
    public static void method2456(class70 arg0) {
        method9(arg0, 200000);
    }

    @ObfuscatedName("d.o(Lbg;IB)V")
    public static void method9(class70 arg0, int arg1) {
        Object[] var2 = arg0.field836;
        class220 var3 = arg0.field841;
        boolean var4 = class220.field2781 == var3 || class220.field2773 == var3 || class220.field2785 == var3 || class220.field2772 == var3 || class220.field2776 == var3 || class220.field2777 == var3 || class220.field2778 == var3 || class220.field2779 == var3;
        class100 var6;
        if (var4) {
            Statics.field3659 = (class48) var2[0];
            class243 var5 = Statics.field477[Statics.field3659.field608];
            var6 = class100.method1376(arg0.field841, var5.field3284, var5.field3265);
        } else {
            int var7 = (Integer) var2[0];
            var6 = class100.method434(var7);
        }
        if (var6 == null) {
            return;
        }
        Statics.field308 = 0;
        Statics.field658 = 0;
        int var8 = -1;
        int[] var9 = var6.field1534;
        int[] var10 = var6.field1535;
        byte var11 = -1;
        field1347 = 0;
        try {
            Statics.field1342 = new int[var6.field1537];
            int var12 = 0;
            Statics.field1766 = new String[var6.field1539];
            int var13 = 0;
            for (int var14 = 1; var14 < var2.length; var14++) {
                if (var2[var14] instanceof Integer) {
                    int var15 = (Integer) var2[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field833;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field834;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field832 == null ? -1 : arg0.field832.field2637;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field835;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field832 == null ? -1 : arg0.field832.field2759;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field840 == null ? -1 : arg0.field840.field2637;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field840 == null ? -1 : arg0.field840.field2759;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field837;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field838;
                    }
                    Statics.field1342[var12++] = var15;
                } else if (var2[var14] instanceof String) {
                    String var16 = (String) var2[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg0.field839;
                    }
                    Statics.field1766[var13++] = var16;
                }
            }
            int var17 = 0;
            field1348 = arg0.field830;
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
                                                                                                                label1771: while (true) {
                                                                                                                    var17++;
                                                                                                                    if (var17 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var8++;
                                                                                                                    int var354 = var9[var8];
                                                                                                                    if (var354 >= 100) {
                                                                                                                        boolean var55;
                                                                                                                        if (var6.field1535[var8] == 1) {
                                                                                                                            var55 = true;
                                                                                                                        } else {
                                                                                                                            var55 = false;
                                                                                                                        }
                                                                                                                        int var56;
                                                                                                                        if (var354 < 1000) {
                                                                                                                            var56 = method459(var354, var6, var55);
                                                                                                                        } else if (var354 < 1100) {
                                                                                                                            var56 = method223(var354, var6, var55);
                                                                                                                        } else if (var354 < 1200) {
                                                                                                                            var56 = method309(var354, var6, var55);
                                                                                                                        } else if (var354 < 1300) {
                                                                                                                            var56 = method3747(var354, var6, var55);
                                                                                                                        } else if (var354 < 1400) {
                                                                                                                            var56 = method125(var354, var6, var55);
                                                                                                                        } else if (var354 < 1500) {
                                                                                                                            var56 = method1001(var354, var6, var55);
                                                                                                                        } else if (var354 < 1600) {
                                                                                                                            var56 = method2174(var354, var6, var55);
                                                                                                                        } else if (var354 < 1700) {
                                                                                                                            var56 = method1558(var354, var6, var55);
                                                                                                                        } else if (var354 < 1800) {
                                                                                                                            class217 var60 = var55 ? Statics.field2420 : Statics.field442;
                                                                                                                            byte var61;
                                                                                                                            if (var354 == 1700) {
                                                                                                                                field1350[++Statics.field308 - 1] = var60.field2753;
                                                                                                                                var61 = 1;
                                                                                                                            } else if (var354 == 1701) {
                                                                                                                                if (var60.field2753 == -1) {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = var60.field2754;
                                                                                                                                }
                                                                                                                                var61 = 1;
                                                                                                                            } else if (var354 == 1702) {
                                                                                                                                field1350[++Statics.field308 - 1] = var60.field2759;
                                                                                                                                var61 = 1;
                                                                                                                            } else {
                                                                                                                                var61 = 2;
                                                                                                                            }
                                                                                                                            var56 = var61;
                                                                                                                        } else if (var354 < 1900) {
                                                                                                                            class217 var62 = var55 ? Statics.field2420 : Statics.field442;
                                                                                                                            byte var63;
                                                                                                                            if (var354 == 1800) {
                                                                                                                                field1350[++Statics.field308 - 1] = class218.method2678(client.method1045(var62));
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var354 == 1801) {
                                                                                                                                int var64 = field1350[--Statics.field308];
                                                                                                                                int var355 = var64 - 1;
                                                                                                                                if (var62.field2677 == null || var355 >= var62.field2677.length || var62.field2677[var355] == null) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = var62.field2677[var355];
                                                                                                                                }
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var354 == 1802) {
                                                                                                                                if (var62.field2671 == null) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = var62.field2671;
                                                                                                                                }
                                                                                                                                var63 = 1;
                                                                                                                            } else {
                                                                                                                                var63 = 2;
                                                                                                                            }
                                                                                                                            var56 = var63;
                                                                                                                        } else if (var354 < 2000) {
                                                                                                                            var56 = method195(var354, var6, var55);
                                                                                                                        } else if (var354 < 2100) {
                                                                                                                            var56 = method223(var354, var6, var55);
                                                                                                                        } else if (var354 < 2200) {
                                                                                                                            var56 = method309(var354, var6, var55);
                                                                                                                        } else if (var354 < 2300) {
                                                                                                                            var56 = method3747(var354, var6, var55);
                                                                                                                        } else if (var354 < 2400) {
                                                                                                                            var56 = method125(var354, var6, var55);
                                                                                                                        } else if (var354 < 2500) {
                                                                                                                            var56 = method1001(var354, var6, var55);
                                                                                                                        } else if (var354 < 2600) {
                                                                                                                            class217 var65 = class217.method577(field1350[--Statics.field308]);
                                                                                                                            byte var66;
                                                                                                                            if (var354 == 2500) {
                                                                                                                                field1350[++Statics.field308 - 1] = var65.field2646;
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var354 == 2501) {
                                                                                                                                field1350[++Statics.field308 - 1] = var65.field2662;
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var354 == 2502) {
                                                                                                                                field1350[++Statics.field308 - 1] = var65.field2625;
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var354 == 2503) {
                                                                                                                                field1350[++Statics.field308 - 1] = var65.field2649;
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var354 == 2504) {
                                                                                                                                field1350[++Statics.field308 - 1] = var65.field2739 ? 1 : 0;
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var354 == 2505) {
                                                                                                                                field1350[++Statics.field308 - 1] = var65.field2652;
                                                                                                                                var66 = 1;
                                                                                                                            } else {
                                                                                                                                var66 = 2;
                                                                                                                            }
                                                                                                                            var56 = var66;
                                                                                                                        } else if (var354 < 2700) {
                                                                                                                            var56 = method1050(var354, var6, var55);
                                                                                                                        } else if (var354 < 2800) {
                                                                                                                            var56 = method714(var354, var6, var55);
                                                                                                                        } else if (var354 < 2900) {
                                                                                                                            class217 var67 = class217.method577(field1350[--Statics.field308]);
                                                                                                                            byte var68;
                                                                                                                            if (var354 == 2800) {
                                                                                                                                field1350[++Statics.field308 - 1] = class218.method2678(client.method1045(var67));
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var354 == 2801) {
                                                                                                                                int var69 = field1350[--Statics.field308];
                                                                                                                                int var356 = var69 - 1;
                                                                                                                                if (var67.field2677 == null || var356 >= var67.field2677.length || var67.field2677[var356] == null) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = var67.field2677[var356];
                                                                                                                                }
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var354 == 2802) {
                                                                                                                                if (var67.field2671 == null) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = var67.field2671;
                                                                                                                                }
                                                                                                                                var68 = 1;
                                                                                                                            } else {
                                                                                                                                var68 = 2;
                                                                                                                            }
                                                                                                                            var56 = var68;
                                                                                                                        } else if (var354 < 3000) {
                                                                                                                            var56 = method195(var354, var6, var55);
                                                                                                                        } else if (var354 < 3200) {
                                                                                                                            byte var71;
                                                                                                                            if (var354 == 3100) {
                                                                                                                                String var70 = field1356[--Statics.field658];
                                                                                                                                class99.method3(0, "", var70);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3101) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                Statics.method978(Statics.field3209, field1350[Statics.field308], field1350[Statics.field308 + 1]);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3103) {
                                                                                                                                client.method3096();
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3104) {
                                                                                                                                String var72 = field1356[--Statics.field658];
                                                                                                                                int var73 = 0;
                                                                                                                                if (class271.method62(var72)) {
                                                                                                                                    var73 = class271.method311(var72);
                                                                                                                                }
                                                                                                                                client.field963.method3121(67);
                                                                                                                                client.field963.method3055(var73);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3105) {
                                                                                                                                String var74 = field1356[--Statics.field658];
                                                                                                                                client.field963.method3121(138);
                                                                                                                                client.field963.method2876(var74.length() + 1);
                                                                                                                                client.field963.method2936(var74);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3106) {
                                                                                                                                String var75 = field1356[--Statics.field658];
                                                                                                                                client.field963.method3121(48);
                                                                                                                                client.field963.method2876(var75.length() + 1);
                                                                                                                                client.field963.method2936(var75);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3107) {
                                                                                                                                int var76 = field1350[--Statics.field308];
                                                                                                                                String var77 = field1356[--Statics.field658];
                                                                                                                                client.method3755(var76, var77);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3108) {
                                                                                                                                Statics.field308 -= 3;
                                                                                                                                int var78 = field1350[Statics.field308];
                                                                                                                                int var79 = field1350[Statics.field308 + 1];
                                                                                                                                int var80 = field1350[Statics.field308 + 2];
                                                                                                                                class217 var81 = class217.method577(var80);
                                                                                                                                client.method2664(var81, var78, var79);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3109) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var82 = field1350[Statics.field308];
                                                                                                                                int var83 = field1350[Statics.field308 + 1];
                                                                                                                                class217 var84 = var55 ? Statics.field2420 : Statics.field442;
                                                                                                                                client.method2664(var84, var82, var83);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3110) {
                                                                                                                                Statics.field264 = field1350[--Statics.field308] == 1;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3111) {
                                                                                                                                field1350[++Statics.field308 - 1] = Statics.field527.field1313 ? 1 : 0;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3112) {
                                                                                                                                Statics.field527.field1313 = field1350[--Statics.field308] == 1;
                                                                                                                                class82.method1400();
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3113) {
                                                                                                                                String var85 = field1356[--Statics.field658];
                                                                                                                                boolean var86 = field1350[--Statics.field308] == 1;
                                                                                                                                class57.method2717(var85, var86, false);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3115) {
                                                                                                                                int var87 = field1350[--Statics.field308];
                                                                                                                                client.field963.method3121(66);
                                                                                                                                client.field963.method2877(var87);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var354 == 3116) {
                                                                                                                                int var88 = field1350[--Statics.field308];
                                                                                                                                Statics.field658 -= 2;
                                                                                                                                String var89 = field1356[Statics.field658];
                                                                                                                                String var90 = field1356[Statics.field658 + 1];
                                                                                                                                if (var89.length() > 500) {
                                                                                                                                    var71 = 1;
                                                                                                                                } else if (var90.length() > 500) {
                                                                                                                                    var71 = 1;
                                                                                                                                } else {
                                                                                                                                    client.field963.method3121(211);
                                                                                                                                    client.field963.method2877(1 + class174.method2750(var89) + class174.method2750(var90));
                                                                                                                                    client.field963.method2936(var89);
                                                                                                                                    client.field963.method2915(var88);
                                                                                                                                    client.field963.method2936(var90);
                                                                                                                                    var71 = 1;
                                                                                                                                }
                                                                                                                            } else if (var354 == 3117) {
                                                                                                                                client.field1069 = field1350[--Statics.field308] == 1;
                                                                                                                                var71 = 1;
                                                                                                                            } else {
                                                                                                                                var71 = 2;
                                                                                                                            }
                                                                                                                            var56 = var71;
                                                                                                                        } else if (var354 < 3300) {
                                                                                                                            byte var91;
                                                                                                                            if (var354 == 3200) {
                                                                                                                                Statics.field308 -= 3;
                                                                                                                                client.method3593(field1350[Statics.field308], field1350[Statics.field308 + 1], field1350[Statics.field308 + 2]);
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var354 == 3201) {
                                                                                                                                Statics.method469(field1350[--Statics.field308]);
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var354 == 3202) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                client.method6(field1350[Statics.field308], field1350[Statics.field308 + 1]);
                                                                                                                                var91 = 1;
                                                                                                                            } else {
                                                                                                                                var91 = 2;
                                                                                                                            }
                                                                                                                            var56 = var91;
                                                                                                                        } else if (var354 < 3400) {
                                                                                                                            var56 = Statics.method1559(var354, var6, var55);
                                                                                                                        } else if (var354 < 3500) {
                                                                                                                            byte var96;
                                                                                                                            if (var354 == 3400) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var92 = field1350[Statics.field308];
                                                                                                                                int var93 = field1350[Statics.field308 + 1];
                                                                                                                                class254 var94 = class254.method1907(var92);
                                                                                                                                if (var94.field3378 != 's') {
                                                                                                                                }
                                                                                                                                for (int var95 = 0; var95 < var94.field3384; var95++) {
                                                                                                                                    if (var94.field3377[var95] == var93) {
                                                                                                                                        field1356[++Statics.field658 - 1] = var94.field3386[var95];
                                                                                                                                        var94 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var94 != null) {
                                                                                                                                    field1356[++Statics.field658 - 1] = var94.field3381;
                                                                                                                                }
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var354 == 3408) {
                                                                                                                                Statics.field308 -= 4;
                                                                                                                                int var97 = field1350[Statics.field308];
                                                                                                                                int var98 = field1350[Statics.field308 + 1];
                                                                                                                                int var99 = field1350[Statics.field308 + 2];
                                                                                                                                int var100 = field1350[Statics.field308 + 3];
                                                                                                                                class254 var101 = class254.method1907(var99);
                                                                                                                                if (var101.field3379 == var97 && var101.field3378 == var98) {
                                                                                                                                    for (int var102 = 0; var102 < var101.field3384; var102++) {
                                                                                                                                        if (var101.field3377[var102] == var100) {
                                                                                                                                            if (var98 == 115) {
                                                                                                                                                field1356[++Statics.field658 - 1] = var101.field3386[var102];
                                                                                                                                            } else {
                                                                                                                                                field1350[++Statics.field308 - 1] = var101.field3385[var102];
                                                                                                                                            }
                                                                                                                                            var101 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var101 != null) {
                                                                                                                                        if (var98 == 115) {
                                                                                                                                            field1356[++Statics.field658 - 1] = var101.field3381;
                                                                                                                                        } else {
                                                                                                                                            field1350[++Statics.field308 - 1] = var101.field3382;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var96 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var98 == 115) {
                                                                                                                                        field1356[++Statics.field658 - 1] = "null";
                                                                                                                                    } else {
                                                                                                                                        field1350[++Statics.field308 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var96 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var96 = 2;
                                                                                                                            }
                                                                                                                            var56 = var96;
                                                                                                                        } else if (var354 < 3700) {
                                                                                                                            byte var103;
                                                                                                                            if (var354 == 3600) {
                                                                                                                                if (client.field1188 == 0) {
                                                                                                                                    field1350[++Statics.field308 - 1] = -2;
                                                                                                                                } else if (client.field1188 == 1) {
                                                                                                                                    field1350[++Statics.field308 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = client.field1067;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3601) {
                                                                                                                                int var104 = field1350[--Statics.field308];
                                                                                                                                if (client.field1188 == 2 && var104 < client.field1067) {
                                                                                                                                    field1356[++Statics.field658 - 1] = client.field1120[var104].field801;
                                                                                                                                    field1356[++Statics.field658 - 1] = client.field1120[var104].field800;
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3602) {
                                                                                                                                int var105 = field1350[--Statics.field308];
                                                                                                                                if (client.field1188 == 2 && var105 < client.field1067) {
                                                                                                                                    field1350[++Statics.field308 - 1] = client.field1120[var105].field796;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3603) {
                                                                                                                                int var106 = field1350[--Statics.field308];
                                                                                                                                if (client.field1188 == 2 && var106 < client.field1067) {
                                                                                                                                    field1350[++Statics.field308 - 1] = client.field1120[var106].field805;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3604) {
                                                                                                                                String var107 = field1356[--Statics.field658];
                                                                                                                                int var108 = field1350[--Statics.field308];
                                                                                                                                client.method685(var107, var108);
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3605) {
                                                                                                                                String var109 = field1356[--Statics.field658];
                                                                                                                                if (var109 != null) {
                                                                                                                                    if ((client.field1067 < 200 || client.field1043 == 1) && client.field1067 < 400) {
                                                                                                                                        String var110 = class268.method4330(var109, Statics.field529);
                                                                                                                                        if (var110 != null) {
                                                                                                                                            int var111 = 0;
                                                                                                                                            label1571: while (true) {
                                                                                                                                                if (var111 >= client.field1067) {
                                                                                                                                                    for (int var115 = 0; var115 < client.field1191; var115++) {
                                                                                                                                                        class71 var116 = client.field1192[var115];
                                                                                                                                                        String var117 = class268.method4330(var116.field843, Statics.field529);
                                                                                                                                                        if (var117 != null && var117.equals(var110)) {
                                                                                                                                                            class99.method3(30, "", class226.field3006 + var109 + class226.field3007);
                                                                                                                                                            break label1571;
                                                                                                                                                        }
                                                                                                                                                        if (var116.field842 != null) {
                                                                                                                                                            String var118 = class268.method4330(var116.field842, Statics.field529);
                                                                                                                                                            if (var118 != null && var118.equals(var110)) {
                                                                                                                                                                class99.method3(30, "", class226.field3006 + var109 + class226.field3007);
                                                                                                                                                                break label1571;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (class268.method4330(Statics.field3209.field895, Statics.field529).equals(var110)) {
                                                                                                                                                        class99.method3(30, "", class226.field3033);
                                                                                                                                                    } else {
                                                                                                                                                        client.field963.method3121(85);
                                                                                                                                                        client.field963.method2876(class174.method2750(var109));
                                                                                                                                                        client.field963.method2936(var109);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class66 var112 = client.field1120[var111];
                                                                                                                                                String var113 = class268.method4330(var112.field801, Statics.field529);
                                                                                                                                                if (var113 != null && var113.equals(var110)) {
                                                                                                                                                    class99.method3(30, "", var109 + class226.field2931);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var112.field800 != null) {
                                                                                                                                                    String var114 = class268.method4330(var112.field800, Statics.field529);
                                                                                                                                                    if (var114 != null && var114.equals(var110)) {
                                                                                                                                                        class99.method3(30, "", var109 + class226.field2931);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var111++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class99.method3(30, "", class226.field3000);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3606) {
                                                                                                                                String var119 = field1356[--Statics.field658];
                                                                                                                                client.method3992(var119);
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3607) {
                                                                                                                                String var120 = field1356[--Statics.field658];
                                                                                                                                if (var120 != null) {
                                                                                                                                    if ((client.field1191 < 100 || client.field1043 == 1) && client.field1191 < 400) {
                                                                                                                                        String var121 = class268.method4330(var120, Statics.field529);
                                                                                                                                        if (var121 != null) {
                                                                                                                                            int var122 = 0;
                                                                                                                                            label1605: while (true) {
                                                                                                                                                if (var122 >= client.field1191) {
                                                                                                                                                    for (int var126 = 0; var126 < client.field1067; var126++) {
                                                                                                                                                        class66 var127 = client.field1120[var126];
                                                                                                                                                        String var128 = class268.method4330(var127.field801, Statics.field529);
                                                                                                                                                        if (var128 != null && var128.equals(var121)) {
                                                                                                                                                            class99.method3(31, "", class226.field3008 + var120 + class226.field3061);
                                                                                                                                                            break label1605;
                                                                                                                                                        }
                                                                                                                                                        if (var127.field800 != null) {
                                                                                                                                                            String var129 = class268.method4330(var127.field800, Statics.field529);
                                                                                                                                                            if (var129 != null && var129.equals(var121)) {
                                                                                                                                                                class99.method3(31, "", class226.field3008 + var120 + class226.field3061);
                                                                                                                                                                break label1605;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (class268.method4330(Statics.field3209.field895, Statics.field529).equals(var121)) {
                                                                                                                                                        class99.method3(31, "", class226.field2845);
                                                                                                                                                    } else {
                                                                                                                                                        client.field963.method3121(163);
                                                                                                                                                        client.field963.method2876(class174.method2750(var120));
                                                                                                                                                        client.field963.method2936(var120);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class71 var123 = client.field1192[var122];
                                                                                                                                                String var124 = class268.method4330(var123.field843, Statics.field529);
                                                                                                                                                if (var124 != null && var124.equals(var121)) {
                                                                                                                                                    class99.method3(31, "", var120 + class226.field2901);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var123.field842 != null) {
                                                                                                                                                    String var125 = class268.method4330(var123.field842, Statics.field529);
                                                                                                                                                    if (var125 != null && var125.equals(var121)) {
                                                                                                                                                        class99.method3(31, "", var120 + class226.field2901);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var122++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class99.method3(31, "", class226.field2974);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3608) {
                                                                                                                                String var130 = field1356[--Statics.field658];
                                                                                                                                client.method555(var130);
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3609) {
                                                                                                                                String var131 = field1356[--Statics.field658];
                                                                                                                                class231[] var132 = class231.method667();
                                                                                                                                for (int var133 = 0; var133 < var132.length; var133++) {
                                                                                                                                    class231 var134 = var132[var133];
                                                                                                                                    if (var134.field3157 != -1 && var131.startsWith(class89.method3740(var134.field3157))) {
                                                                                                                                        var131 = var131.substring(6 + Integer.toString(var134.field3157).length());
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1350[++Statics.field308 - 1] = client.method3649(var131, false) ? 1 : 0;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3611) {
                                                                                                                                if (client.field959 == null) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = class269.method4374(client.field959);
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3612) {
                                                                                                                                if (client.field959 == null) {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = Statics.field315;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3613) {
                                                                                                                                int var135 = field1350[--Statics.field308];
                                                                                                                                if (client.field959 == null || var135 >= Statics.field315) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = Statics.field1316[var135].field916;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3614) {
                                                                                                                                int var136 = field1350[--Statics.field308];
                                                                                                                                if (client.field959 == null || var136 >= Statics.field315) {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = Statics.field1316[var136].field912;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3615) {
                                                                                                                                int var137 = field1350[--Statics.field308];
                                                                                                                                if (client.field959 == null || var137 >= Statics.field315) {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = Statics.field1316[var137].field913;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3616) {
                                                                                                                                field1350[++Statics.field308 - 1] = Statics.field388;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3617) {
                                                                                                                                String var138 = field1356[--Statics.field658];
                                                                                                                                client.method2455(var138);
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3618) {
                                                                                                                                field1350[++Statics.field308 - 1] = Statics.field810;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3619) {
                                                                                                                                String var139 = field1356[--Statics.field658];
                                                                                                                                client.method3566(var139);
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3620) {
                                                                                                                                client.method31();
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3621) {
                                                                                                                                if (client.field1188 == 0) {
                                                                                                                                    field1350[++Statics.field308 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = client.field1191;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3622) {
                                                                                                                                int var140 = field1350[--Statics.field308];
                                                                                                                                if (client.field1188 == 0 || var140 >= client.field1191) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = client.field1192[var140].field843;
                                                                                                                                    field1356[++Statics.field658 - 1] = client.field1192[var140].field842;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3623) {
                                                                                                                                String var141 = field1356[--Statics.field658];
                                                                                                                                if (var141.startsWith(class89.method3740(0)) || var141.startsWith(class89.method3740(1))) {
                                                                                                                                    var141 = var141.substring(7);
                                                                                                                                }
                                                                                                                                field1350[++Statics.field308 - 1] = client.method2662(var141) ? 1 : 0;
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3624) {
                                                                                                                                int var142 = field1350[--Statics.field308];
                                                                                                                                if (Statics.field1316 == null || var142 >= Statics.field315 || !Statics.field1316[var142].field916.equalsIgnoreCase(Statics.field3209.field895)) {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = 1;
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else if (var354 == 3625) {
                                                                                                                                if (client.field1147 == null) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = class269.method4374(client.field1147);
                                                                                                                                }
                                                                                                                                var103 = 1;
                                                                                                                            } else {
                                                                                                                                var103 = 2;
                                                                                                                            }
                                                                                                                            var56 = var103;
                                                                                                                        } else if (var354 < 4000) {
                                                                                                                            byte var144;
                                                                                                                            if (var354 == 3903) {
                                                                                                                                int var143 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = client.field1196[var143].method75();
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3904) {
                                                                                                                                int var145 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = client.field1196[var145].field299;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3905) {
                                                                                                                                int var146 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = client.field1196[var146].field303;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3906) {
                                                                                                                                int var147 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = client.field1196[var147].field301;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3907) {
                                                                                                                                int var148 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = client.field1196[var148].field305;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3908) {
                                                                                                                                int var149 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = client.field1196[var149].field302;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3910) {
                                                                                                                                int var150 = field1350[--Statics.field308];
                                                                                                                                int var151 = client.field1196[var150].method74();
                                                                                                                                field1350[++Statics.field308 - 1] = var151 == 0 ? 1 : 0;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3911) {
                                                                                                                                int var152 = field1350[--Statics.field308];
                                                                                                                                int var153 = client.field1196[var152].method74();
                                                                                                                                field1350[++Statics.field308 - 1] = var153 == 2 ? 1 : 0;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3912) {
                                                                                                                                int var154 = field1350[--Statics.field308];
                                                                                                                                int var155 = client.field1196[var154].method74();
                                                                                                                                field1350[++Statics.field308 - 1] = var155 == 5 ? 1 : 0;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3913) {
                                                                                                                                int var156 = field1350[--Statics.field308];
                                                                                                                                int var157 = client.field1196[var156].method74();
                                                                                                                                field1350[++Statics.field308 - 1] = var157 == 1 ? 1 : 0;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3914) {
                                                                                                                                boolean var158 = field1350[--Statics.field308] == 1;
                                                                                                                                if (Statics.field864 != null) {
                                                                                                                                    Statics.field864.method49(class14.field275, var158);
                                                                                                                                }
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3915) {
                                                                                                                                boolean var159 = field1350[--Statics.field308] == 1;
                                                                                                                                if (Statics.field864 != null) {
                                                                                                                                    Statics.field864.method49(class14.field280, var159);
                                                                                                                                }
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3916) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                boolean var160 = field1350[Statics.field308] == 1;
                                                                                                                                boolean var161 = field1350[Statics.field308 + 1] == 1;
                                                                                                                                if (Statics.field864 != null) {
                                                                                                                                    Statics.field864.method49(new class96(var161), var160);
                                                                                                                                }
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3917) {
                                                                                                                                boolean var162 = field1350[--Statics.field308] == 1;
                                                                                                                                if (Statics.field864 != null) {
                                                                                                                                    Statics.field864.method49(class14.field274, var162);
                                                                                                                                }
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3918) {
                                                                                                                                boolean var163 = field1350[--Statics.field308] == 1;
                                                                                                                                if (Statics.field864 != null) {
                                                                                                                                    Statics.field864.method49(class14.field276, var163);
                                                                                                                                }
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3919) {
                                                                                                                                field1350[++Statics.field308 - 1] = Statics.field864 == null ? 0 : Statics.field864.field273.size();
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3920) {
                                                                                                                                int var164 = field1350[--Statics.field308];
                                                                                                                                class15 var165 = (class15) Statics.field864.field273.get(var164);
                                                                                                                                field1350[++Statics.field308 - 1] = var165.field282;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3921) {
                                                                                                                                int var166 = field1350[--Statics.field308];
                                                                                                                                class15 var167 = (class15) Statics.field864.field273.get(var166);
                                                                                                                                field1356[++Statics.field658 - 1] = var167.method53();
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3922) {
                                                                                                                                int var168 = field1350[--Statics.field308];
                                                                                                                                class15 var169 = (class15) Statics.field864.field273.get(var168);
                                                                                                                                field1356[++Statics.field658 - 1] = var169.method54();
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3923) {
                                                                                                                                int var170 = field1350[--Statics.field308];
                                                                                                                                class15 var171 = (class15) Statics.field864.field273.get(var170);
                                                                                                                                long var172 = class176.method218() - Statics.field322 - var171.field281;
                                                                                                                                int var174 = (int) (var172 / 3600000L);
                                                                                                                                int var175 = (int) ((var172 - (long) (var174 * 3600000)) / 60000L);
                                                                                                                                int var176 = (int) ((var172 - (long) (var174 * 3600000) - (long) (var175 * 60000)) / 1000L);
                                                                                                                                String var177 = var174 + ":" + var175 / 10 + var175 % 10 + ":" + var176 / 10 + var176 % 10;
                                                                                                                                field1356[++Statics.field658 - 1] = var177;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3924) {
                                                                                                                                int var178 = field1350[--Statics.field308];
                                                                                                                                class15 var179 = (class15) Statics.field864.field273.get(var178);
                                                                                                                                field1350[++Statics.field308 - 1] = var179.field283.field301;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3925) {
                                                                                                                                int var180 = field1350[--Statics.field308];
                                                                                                                                class15 var181 = (class15) Statics.field864.field273.get(var180);
                                                                                                                                field1350[++Statics.field308 - 1] = var181.field283.field303;
                                                                                                                                var144 = 1;
                                                                                                                            } else if (var354 == 3926) {
                                                                                                                                int var182 = field1350[--Statics.field308];
                                                                                                                                class15 var183 = (class15) Statics.field864.field273.get(var182);
                                                                                                                                field1350[++Statics.field308 - 1] = var183.field283.field299;
                                                                                                                                var144 = 1;
                                                                                                                            } else {
                                                                                                                                var144 = 2;
                                                                                                                            }
                                                                                                                            var56 = var144;
                                                                                                                        } else if (var354 < 4100) {
                                                                                                                            byte var186;
                                                                                                                            if (var354 == 4000) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var184 = field1350[Statics.field308];
                                                                                                                                int var185 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var184 + var185;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4001) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var187 = field1350[Statics.field308];
                                                                                                                                int var188 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var187 - var188;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4002) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var189 = field1350[Statics.field308];
                                                                                                                                int var190 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var189 * var190;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4003) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var191 = field1350[Statics.field308];
                                                                                                                                int var192 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var191 / var192;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4004) {
                                                                                                                                int var193 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = (int) (Math.random() * (double) var193);
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4005) {
                                                                                                                                int var194 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = (int) (Math.random() * (double) (var194 + 1));
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4006) {
                                                                                                                                Statics.field308 -= 5;
                                                                                                                                int var195 = field1350[Statics.field308];
                                                                                                                                int var196 = field1350[Statics.field308 + 1];
                                                                                                                                int var197 = field1350[Statics.field308 + 2];
                                                                                                                                int var198 = field1350[Statics.field308 + 3];
                                                                                                                                int var199 = field1350[Statics.field308 + 4];
                                                                                                                                field1350[++Statics.field308 - 1] = (var196 - var195) * (var199 - var197) / (var198 - var197) + var195;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4007) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var200 = field1350[Statics.field308];
                                                                                                                                int var201 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var200 * var201 / 100 + var200;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4008) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var202 = field1350[Statics.field308];
                                                                                                                                int var203 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var202 | 0x1 << var203;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4009) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var204 = field1350[Statics.field308];
                                                                                                                                int var205 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var204 & -1 - (0x1 << var205);
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4010) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var206 = field1350[Statics.field308];
                                                                                                                                int var207 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = (var206 & 0x1 << var207) == 0 ? 0 : 1;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4011) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var208 = field1350[Statics.field308];
                                                                                                                                int var209 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var208 % var209;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4012) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var210 = field1350[Statics.field308];
                                                                                                                                int var211 = field1350[Statics.field308 + 1];
                                                                                                                                if (var210 == 0) {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = (int) Math.pow((double) var210, (double) var211);
                                                                                                                                }
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4013) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var212 = field1350[Statics.field308];
                                                                                                                                int var213 = field1350[Statics.field308 + 1];
                                                                                                                                if (var212 == 0) {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                } else if (var213 == 0) {
                                                                                                                                    field1350[++Statics.field308 - 1] = Integer.MAX_VALUE;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = (int) Math.pow((double) var212, 1.0D / (double) var213);
                                                                                                                                }
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4014) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var214 = field1350[Statics.field308];
                                                                                                                                int var215 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var214 & var215;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4015) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var216 = field1350[Statics.field308];
                                                                                                                                int var217 = field1350[Statics.field308 + 1];
                                                                                                                                field1350[++Statics.field308 - 1] = var216 | var217;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var354 == 4018) {
                                                                                                                                Statics.field308 -= 3;
                                                                                                                                long var218 = (long) field1350[Statics.field308];
                                                                                                                                long var220 = (long) field1350[Statics.field308 + 1];
                                                                                                                                long var222 = (long) field1350[Statics.field308 + 2];
                                                                                                                                field1350[++Statics.field308 - 1] = (int) (var218 * var222 / var220);
                                                                                                                                var186 = 1;
                                                                                                                            } else {
                                                                                                                                var186 = 2;
                                                                                                                            }
                                                                                                                            var56 = var186;
                                                                                                                        } else if (var354 < 4200) {
                                                                                                                            byte var226;
                                                                                                                            if (var354 == 4100) {
                                                                                                                                String var224 = field1356[--Statics.field658];
                                                                                                                                int var225 = field1350[--Statics.field308];
                                                                                                                                field1356[++Statics.field658 - 1] = var224 + var225;
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4101) {
                                                                                                                                Statics.field658 -= 2;
                                                                                                                                String var227 = field1356[Statics.field658];
                                                                                                                                String var228 = field1356[Statics.field658 + 1];
                                                                                                                                field1356[++Statics.field658 - 1] = var227 + var228;
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4102) {
                                                                                                                                String var229 = field1356[--Statics.field658];
                                                                                                                                int var230 = field1350[--Statics.field308];
                                                                                                                                field1356[++Statics.field658 - 1] = var229 + class271.method3904(var230, true);
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4103) {
                                                                                                                                String var231 = field1356[--Statics.field658];
                                                                                                                                field1356[++Statics.field658 - 1] = var231.toLowerCase();
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4104) {
                                                                                                                                int var232 = field1350[--Statics.field308];
                                                                                                                                long var233 = ((long) var232 + 11745L) * 86400000L;
                                                                                                                                field1349.setTime(new Date(var233));
                                                                                                                                int var235 = field1349.get(5);
                                                                                                                                int var236 = field1349.get(2);
                                                                                                                                int var237 = field1349.get(1);
                                                                                                                                field1356[++Statics.field658 - 1] = var235 + "-" + field1345[var236] + "-" + var237;
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4105) {
                                                                                                                                Statics.field658 -= 2;
                                                                                                                                String var238 = field1356[Statics.field658];
                                                                                                                                String var239 = field1356[Statics.field658 + 1];
                                                                                                                                if (Statics.field3209.field881 != null && Statics.field3209.field881.field2610) {
                                                                                                                                    field1356[++Statics.field658 - 1] = var239;
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = var238;
                                                                                                                                }
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4106) {
                                                                                                                                int var240 = field1350[--Statics.field308];
                                                                                                                                field1356[++Statics.field658 - 1] = Integer.toString(var240);
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4107) {
                                                                                                                                Statics.field658 -= 2;
                                                                                                                                int[] var241 = field1350;
                                                                                                                                int var242 = ++Statics.field308 - 1;
                                                                                                                                String var243 = field1356[Statics.field658];
                                                                                                                                String var244 = field1356[Statics.field658 + 1];
                                                                                                                                int var245 = client.field925;
                                                                                                                                int var246 = var243.length();
                                                                                                                                int var247 = var244.length();
                                                                                                                                int var248 = 0;
                                                                                                                                int var249 = 0;
                                                                                                                                char var250 = 0;
                                                                                                                                char var251 = 0;
                                                                                                                                int var252;
                                                                                                                                label1473: while (true) {
                                                                                                                                    if (var248 - var250 >= var246 && var249 - var251 >= var247) {
                                                                                                                                        int var261 = Math.min(var246, var247);
                                                                                                                                        for (int var262 = 0; var262 < var261; var262++) {
                                                                                                                                            char var265 = var243.charAt(var262);
                                                                                                                                            char var266 = var244.charAt(var262);
                                                                                                                                            if (var265 != var266 && Character.toUpperCase(var265) != Character.toUpperCase(var266)) {
                                                                                                                                                char var267 = Character.toLowerCase(var265);
                                                                                                                                                char var268 = Character.toLowerCase(var266);
                                                                                                                                                if (var267 != var268) {
                                                                                                                                                    var252 = class165.method1598(var267, var245) - class165.method1598(var268, var245);
                                                                                                                                                    break label1473;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int var269 = var246 - var247;
                                                                                                                                        if (var269 == 0) {
                                                                                                                                            for (int var270 = 0; var270 < var261; var270++) {
                                                                                                                                                char var271 = var243.charAt(var270);
                                                                                                                                                char var272 = var244.charAt(var270);
                                                                                                                                                if (var271 != var272) {
                                                                                                                                                    var252 = class165.method1598(var271, var245) - class165.method1598(var272, var245);
                                                                                                                                                    break label1473;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var252 = 0;
                                                                                                                                        } else {
                                                                                                                                            var252 = var269;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var248 - var250 >= var246) {
                                                                                                                                        var252 = -1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var249 - var251 >= var247) {
                                                                                                                                        var252 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    char var253;
                                                                                                                                    if (var250 == 0) {
                                                                                                                                        var253 = var243.charAt(var248++);
                                                                                                                                    } else {
                                                                                                                                        var253 = var250;
                                                                                                                                        boolean var254 = false;
                                                                                                                                    }
                                                                                                                                    char var255;
                                                                                                                                    if (var251 == 0) {
                                                                                                                                        var255 = var244.charAt(var249++);
                                                                                                                                    } else {
                                                                                                                                        var255 = var251;
                                                                                                                                        boolean var256 = false;
                                                                                                                                    }
                                                                                                                                    var250 = class165.method159(var253);
                                                                                                                                    var251 = class165.method159(var255);
                                                                                                                                    char var257 = class165.method2644(var253, var245);
                                                                                                                                    char var258 = class165.method2644(var255, var245);
                                                                                                                                    if (var257 != var258 && Character.toUpperCase(var257) != Character.toUpperCase(var258)) {
                                                                                                                                        char var259 = Character.toLowerCase(var257);
                                                                                                                                        char var260 = Character.toLowerCase(var258);
                                                                                                                                        if (var259 != var260) {
                                                                                                                                            var252 = class165.method1598(var259, var245) - class165.method1598(var260, var245);
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                byte var274;
                                                                                                                                if (var252 > 0) {
                                                                                                                                    var274 = 1;
                                                                                                                                } else if (var252 < 0) {
                                                                                                                                    var274 = -1;
                                                                                                                                } else {
                                                                                                                                    var274 = 0;
                                                                                                                                }
                                                                                                                                var241[var242] = var274;
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4108) {
                                                                                                                                String var275 = field1356[--Statics.field658];
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var276 = field1350[Statics.field308];
                                                                                                                                int var277 = field1350[Statics.field308 + 1];
                                                                                                                                byte[] var278 = Statics.field356.method3760(var277, 0);
                                                                                                                                class264 var279 = new class264(var278);
                                                                                                                                field1350[++Statics.field308 - 1] = var279.method4399(var275, var276);
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4109) {
                                                                                                                                String var280 = field1356[--Statics.field658];
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var281 = field1350[Statics.field308];
                                                                                                                                int var282 = field1350[Statics.field308 + 1];
                                                                                                                                byte[] var283 = Statics.field356.method3760(var282, 0);
                                                                                                                                class264 var284 = new class264(var283);
                                                                                                                                field1350[++Statics.field308 - 1] = var284.method4398(var280, var281);
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4110) {
                                                                                                                                Statics.field658 -= 2;
                                                                                                                                String var285 = field1356[Statics.field658];
                                                                                                                                String var286 = field1356[Statics.field658 + 1];
                                                                                                                                if (field1350[--Statics.field308] == 1) {
                                                                                                                                    field1356[++Statics.field658 - 1] = var285;
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = var286;
                                                                                                                                }
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4111) {
                                                                                                                                String var287 = field1356[--Statics.field658];
                                                                                                                                field1356[++Statics.field658 - 1] = class265.method4400(var287);
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4112) {
                                                                                                                                String var288 = field1356[--Statics.field658];
                                                                                                                                int var289 = field1350[--Statics.field308];
                                                                                                                                field1356[++Statics.field658 - 1] = var288 + (char) var289;
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4113) {
                                                                                                                                int var290 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = class271.method2859((char) var290) ? 1 : 0;
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4114) {
                                                                                                                                int var291 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = class271.method97((char) var291) ? 1 : 0;
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4115) {
                                                                                                                                int var292 = field1350[--Statics.field308];
                                                                                                                                int[] var293 = field1350;
                                                                                                                                int var294 = ++Statics.field308 - 1;
                                                                                                                                char var295 = (char) var292;
                                                                                                                                boolean var296 = var295 >= 'A' && var295 <= 'Z' || var295 >= 'a' && var295 <= 'z';
                                                                                                                                var293[var294] = var296 ? 1 : 0;
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4116) {
                                                                                                                                int var297 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = class271.method594((char) var297) ? 1 : 0;
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4117) {
                                                                                                                                String var298 = field1356[--Statics.field658];
                                                                                                                                if (var298 == null) {
                                                                                                                                    field1350[++Statics.field308 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = var298.length();
                                                                                                                                }
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4118) {
                                                                                                                                String var299 = field1356[--Statics.field658];
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var300 = field1350[Statics.field308];
                                                                                                                                int var301 = field1350[Statics.field308 + 1];
                                                                                                                                field1356[++Statics.field658 - 1] = var299.substring(var300, var301);
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4119) {
                                                                                                                                String var302 = field1356[--Statics.field658];
                                                                                                                                StringBuilder var303 = new StringBuilder(var302.length());
                                                                                                                                boolean var304 = false;
                                                                                                                                for (int var305 = 0; var305 < var302.length(); var305++) {
                                                                                                                                    char var306 = var302.charAt(var305);
                                                                                                                                    if (var306 == '<') {
                                                                                                                                        var304 = true;
                                                                                                                                    } else if (var306 == '>') {
                                                                                                                                        var304 = false;
                                                                                                                                    } else if (!var304) {
                                                                                                                                        var303.append(var306);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1356[++Statics.field658 - 1] = var303.toString();
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4120) {
                                                                                                                                String var307 = field1356[--Statics.field658];
                                                                                                                                int var308 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = var307.indexOf(var308);
                                                                                                                                var226 = 1;
                                                                                                                            } else if (var354 == 4121) {
                                                                                                                                Statics.field658 -= 2;
                                                                                                                                String var309 = field1356[Statics.field658];
                                                                                                                                String var310 = field1356[Statics.field658 + 1];
                                                                                                                                int var311 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = var309.indexOf(var310, var311);
                                                                                                                                var226 = 1;
                                                                                                                            } else {
                                                                                                                                var226 = 2;
                                                                                                                            }
                                                                                                                            var56 = var226;
                                                                                                                        } else if (var354 < 4300) {
                                                                                                                            byte var313;
                                                                                                                            if (var354 == 4200) {
                                                                                                                                int var312 = field1350[--Statics.field308];
                                                                                                                                field1356[++Statics.field658 - 1] = Statics.method461(var312).field3491;
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4201) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var314 = field1350[Statics.field308];
                                                                                                                                int var315 = field1350[Statics.field308 + 1];
                                                                                                                                class257 var316 = Statics.method461(var314);
                                                                                                                                if (var315 < 1 || var315 > 5 || var316.field3490[var315 - 1] == null) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = var316.field3490[var315 - 1];
                                                                                                                                }
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4202) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                int var317 = field1350[Statics.field308];
                                                                                                                                int var318 = field1350[Statics.field308 + 1];
                                                                                                                                class257 var319 = Statics.method461(var317);
                                                                                                                                if (var318 < 1 || var318 > 5 || var319.field3510[var318 - 1] == null) {
                                                                                                                                    field1356[++Statics.field658 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1356[++Statics.field658 - 1] = var319.field3510[var318 - 1];
                                                                                                                                }
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4203) {
                                                                                                                                int var320 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = Statics.method461(var320).field3488;
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4204) {
                                                                                                                                int var321 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = Statics.method461(var321).field3501 == 1 ? 1 : 0;
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4205) {
                                                                                                                                int var322 = field1350[--Statics.field308];
                                                                                                                                class257 var323 = Statics.method461(var322);
                                                                                                                                if (var323.field3498 == -1 && var323.field3507 >= 0) {
                                                                                                                                    field1350[++Statics.field308 - 1] = var323.field3507;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = var322;
                                                                                                                                }
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4206) {
                                                                                                                                int var324 = field1350[--Statics.field308];
                                                                                                                                class257 var325 = Statics.method461(var324);
                                                                                                                                if (var325.field3498 >= 0 && var325.field3507 >= 0) {
                                                                                                                                    field1350[++Statics.field308 - 1] = var325.field3507;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = var324;
                                                                                                                                }
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4207) {
                                                                                                                                int var326 = field1350[--Statics.field308];
                                                                                                                                field1350[++Statics.field308 - 1] = Statics.method461(var326).field3489 ? 1 : 0;
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4208) {
                                                                                                                                int var327 = field1350[--Statics.field308];
                                                                                                                                class257 var328 = Statics.method461(var327);
                                                                                                                                if (var328.field3520 == -1 && var328.field3515 >= 0) {
                                                                                                                                    field1350[++Statics.field308 - 1] = var328.field3515;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = var327;
                                                                                                                                }
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4209) {
                                                                                                                                int var329 = field1350[--Statics.field308];
                                                                                                                                class257 var330 = Statics.method461(var329);
                                                                                                                                if (var330.field3520 >= 0 && var330.field3515 >= 0) {
                                                                                                                                    field1350[++Statics.field308 - 1] = var330.field3515;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = var329;
                                                                                                                                }
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4210) {
                                                                                                                                String var331 = field1356[--Statics.field658];
                                                                                                                                int var332 = field1350[--Statics.field308];
                                                                                                                                boolean var334 = var332 == 1;
                                                                                                                                String var335 = var331.toLowerCase();
                                                                                                                                short[] var336 = new short[16];
                                                                                                                                int var337 = 0;
                                                                                                                                int var338 = 0;
                                                                                                                                while (true) {
                                                                                                                                    if (var338 >= Statics.field1528) {
                                                                                                                                        Statics.field2413 = var336;
                                                                                                                                        Statics.field2119 = 0;
                                                                                                                                        Statics.field471 = var337;
                                                                                                                                        String[] var342 = new String[Statics.field471];
                                                                                                                                        for (int var343 = 0; var343 < Statics.field471; var343++) {
                                                                                                                                            var342[var343] = Statics.method461(var336[var343]).field3491;
                                                                                                                                        }
                                                                                                                                        class171.method1463(var342, Statics.field2413);
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    class257 var339 = Statics.method461(var338);
                                                                                                                                    if ((!var334 || var339.field3516) && var339.field3498 == -1 && var339.field3491.toLowerCase().indexOf(var335) != -1) {
                                                                                                                                        if (var337 >= 250) {
                                                                                                                                            Statics.field471 = -1;
                                                                                                                                            Statics.field2413 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        if (var337 >= var336.length) {
                                                                                                                                            short[] var340 = new short[var336.length * 2];
                                                                                                                                            for (int var341 = 0; var341 < var337; var341++) {
                                                                                                                                                var340[var341] = var336[var341];
                                                                                                                                            }
                                                                                                                                            var336 = var340;
                                                                                                                                        }
                                                                                                                                        var336[var337++] = (short) var338;
                                                                                                                                    }
                                                                                                                                    var338++;
                                                                                                                                }
                                                                                                                                field1350[++Statics.field308 - 1] = Statics.field471;
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4211) {
                                                                                                                                if (Statics.field2413 == null || Statics.field2119 >= Statics.field471) {
                                                                                                                                    field1350[++Statics.field308 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field308 - 1] = Statics.field2413[++Statics.field2119 - 1] & 0xFFFF;
                                                                                                                                }
                                                                                                                                var313 = 1;
                                                                                                                            } else if (var354 == 4212) {
                                                                                                                                Statics.field2119 = 0;
                                                                                                                                var313 = 1;
                                                                                                                            } else {
                                                                                                                                var313 = 2;
                                                                                                                            }
                                                                                                                            var56 = var313;
                                                                                                                        } else if (var354 < 5100) {
                                                                                                                            var56 = method3160(var354, var6, var55);
                                                                                                                        } else if (var354 < 5400) {
                                                                                                                            byte var344;
                                                                                                                            if (var354 == 5306) {
                                                                                                                                field1350[++Statics.field308 - 1] = client.method3650();
                                                                                                                                var344 = 1;
                                                                                                                            } else if (var354 == 5307) {
                                                                                                                                int var345 = field1350[--Statics.field308];
                                                                                                                                if (var345 == 1 || var345 == 2) {
                                                                                                                                    client.field1156 = 0L;
                                                                                                                                    if (var345 >= 2) {
                                                                                                                                        client.field1135 = true;
                                                                                                                                    } else {
                                                                                                                                        client.field1135 = false;
                                                                                                                                    }
                                                                                                                                    if (client.method3650() == 1) {
                                                                                                                                        Statics.field3334.method819(765, 503);
                                                                                                                                    } else {
                                                                                                                                        Statics.field3334.method819(7680, 2160);
                                                                                                                                    }
                                                                                                                                    if (client.field927 >= 25) {
                                                                                                                                        client.field963.method3121(77);
                                                                                                                                        client.field963.method2876(client.method3650());
                                                                                                                                        client.field963.method2877(Statics.field413);
                                                                                                                                        client.field963.method2877(Statics.field1916);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var344 = 1;
                                                                                                                            } else if (var354 == 5308) {
                                                                                                                                field1350[++Statics.field308 - 1] = Statics.field527.field1315;
                                                                                                                                var344 = 1;
                                                                                                                            } else if (var354 == 5309) {
                                                                                                                                int var346 = field1350[--Statics.field308];
                                                                                                                                if (var346 == 1 || var346 == 2) {
                                                                                                                                    Statics.field527.field1315 = var346;
                                                                                                                                    class82.method1400();
                                                                                                                                }
                                                                                                                                var344 = 1;
                                                                                                                            } else {
                                                                                                                                var344 = 2;
                                                                                                                            }
                                                                                                                            var56 = var344;
                                                                                                                        } else if (var354 < 5600) {
                                                                                                                            var56 = method32(var354, var6, var55);
                                                                                                                        } else if (var354 < 5700) {
                                                                                                                            byte var347;
                                                                                                                            if (var354 == 5630) {
                                                                                                                                client.field1090 = 250;
                                                                                                                                var347 = 1;
                                                                                                                            } else {
                                                                                                                                var347 = 2;
                                                                                                                            }
                                                                                                                            var56 = var347;
                                                                                                                        } else if (var354 < 6300) {
                                                                                                                            byte var348;
                                                                                                                            if (var354 == 6200) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                client.field1057 = (short) field1350[Statics.field308];
                                                                                                                                if (client.field1057 <= 0) {
                                                                                                                                    client.field1057 = 256;
                                                                                                                                }
                                                                                                                                client.field1175 = (short) field1350[Statics.field308 + 1];
                                                                                                                                if (client.field1175 <= 0) {
                                                                                                                                    client.field1175 = 205;
                                                                                                                                }
                                                                                                                                var348 = 1;
                                                                                                                            } else if (var354 == 6201) {
                                                                                                                                Statics.field308 -= 2;
                                                                                                                                client.field943 = (short) field1350[Statics.field308];
                                                                                                                                if (client.field943 <= 0) {
                                                                                                                                    client.field943 = 256;
                                                                                                                                }
                                                                                                                                client.field1080 = (short) field1350[Statics.field308 + 1];
                                                                                                                                if (client.field1080 <= 0) {
                                                                                                                                    client.field1080 = 320;
                                                                                                                                }
                                                                                                                                var348 = 1;
                                                                                                                            } else if (var354 == 6202) {
                                                                                                                                Statics.field308 -= 4;
                                                                                                                                client.field1020 = (short) field1350[Statics.field308];
                                                                                                                                if (client.field1020 <= 0) {
                                                                                                                                    client.field1020 = 1;
                                                                                                                                }
                                                                                                                                client.field1040 = (short) field1350[Statics.field308 + 1];
                                                                                                                                if (client.field1040 <= 0) {
                                                                                                                                    client.field1040 = 32767;
                                                                                                                                } else if (client.field1040 < client.field1020) {
                                                                                                                                    client.field1040 = client.field1020;
                                                                                                                                }
                                                                                                                                client.field1127 = (short) field1350[Statics.field308 + 2];
                                                                                                                                if (client.field1127 <= 0) {
                                                                                                                                    client.field1127 = 1;
                                                                                                                                }
                                                                                                                                client.field949 = (short) field1350[Statics.field308 + 3];
                                                                                                                                if (client.field949 <= 0) {
                                                                                                                                    client.field949 = 32767;
                                                                                                                                } else if (client.field949 < client.field1127) {
                                                                                                                                    client.field949 = client.field1127;
                                                                                                                                }
                                                                                                                                var348 = 1;
                                                                                                                            } else if (var354 == 6203) {
                                                                                                                                if (client.field1089 == null) {
                                                                                                                                    field1350[++Statics.field308 - 1] = -1;
                                                                                                                                    field1350[++Statics.field308 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    client.method4546(0, 0, client.field1089.field2625, client.field1089.field2649, false);
                                                                                                                                    field1350[++Statics.field308 - 1] = client.field1113;
                                                                                                                                    field1350[++Statics.field308 - 1] = client.field1108;
                                                                                                                                }
                                                                                                                                var348 = 1;
                                                                                                                            } else if (var354 == 6204) {
                                                                                                                                field1350[++Statics.field308 - 1] = client.field943;
                                                                                                                                field1350[++Statics.field308 - 1] = client.field1080;
                                                                                                                                var348 = 1;
                                                                                                                            } else if (var354 == 6205) {
                                                                                                                                field1350[++Statics.field308 - 1] = client.field1057;
                                                                                                                                field1350[++Statics.field308 - 1] = client.field1175;
                                                                                                                                var348 = 1;
                                                                                                                            } else {
                                                                                                                                var348 = 2;
                                                                                                                            }
                                                                                                                            var56 = var348;
                                                                                                                        } else if (var354 < 6600) {
                                                                                                                            var56 = method983(var354, var6, var55);
                                                                                                                        } else if (var354 < 6700) {
                                                                                                                            var56 = method2659(var354, var6, var55);
                                                                                                                        } else {
                                                                                                                            var56 = 2;
                                                                                                                        }
                                                                                                                        switch(var56) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var354 == 0) {
                                                                                                                        field1350[++Statics.field308 - 1] = var10[var8];
                                                                                                                    } else if (var354 == 1) {
                                                                                                                        int var18 = var10[var8];
                                                                                                                        field1350[++Statics.field308 - 1] = class212.field2589[var18];
                                                                                                                    } else if (var354 == 2) {
                                                                                                                        int var19 = var10[var8];
                                                                                                                        class212.field2589[var19] = field1350[--Statics.field308];
                                                                                                                        client.method2647(var19);
                                                                                                                    } else if (var354 == 3) {
                                                                                                                        field1356[++Statics.field658 - 1] = var6.field1536[var8];
                                                                                                                    } else if (var354 == 6) {
                                                                                                                        var8 += var10[var8];
                                                                                                                    } else if (var354 == 7) {
                                                                                                                        Statics.field308 -= 2;
                                                                                                                        if (field1350[Statics.field308] != field1350[Statics.field308 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var354 == 8) {
                                                                                                                        Statics.field308 -= 2;
                                                                                                                        if (field1350[Statics.field308] == field1350[Statics.field308 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var354 == 9) {
                                                                                                                        Statics.field308 -= 2;
                                                                                                                        if (field1350[Statics.field308] < field1350[Statics.field308 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var354 == 10) {
                                                                                                                        Statics.field308 -= 2;
                                                                                                                        if (field1350[Statics.field308] > field1350[Statics.field308 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var354 == 21) {
                                                                                                                        if (field1347 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var20 = field1346[--field1347];
                                                                                                                        var6 = var20.field772;
                                                                                                                        var9 = var6.field1534;
                                                                                                                        var10 = var6.field1535;
                                                                                                                        var8 = var20.field774;
                                                                                                                        Statics.field1342 = var20.field771;
                                                                                                                        Statics.field1766 = var20.field769;
                                                                                                                    } else if (var354 == 25) {
                                                                                                                        int var21 = var10[var8];
                                                                                                                        field1350[++Statics.field308 - 1] = class212.method56(var21);
                                                                                                                    } else if (var354 == 27) {
                                                                                                                        int var22 = var10[var8];
                                                                                                                        int var23 = field1350[--Statics.field308];
                                                                                                                        class251 var24 = (class251) class251.field3356.method3248((long) var22);
                                                                                                                        class251 var25;
                                                                                                                        if (var24 == null) {
                                                                                                                            byte[] var26 = Statics.field3361.method3760(14, var22);
                                                                                                                            class251 var27 = new class251();
                                                                                                                            if (var26 != null) {
                                                                                                                                var27.method4049(new class174(var26));
                                                                                                                            }
                                                                                                                            class251.field3356.method3250(var27, (long) var22);
                                                                                                                            var25 = var27;
                                                                                                                        } else {
                                                                                                                            var25 = var24;
                                                                                                                        }
                                                                                                                        int var29 = var25.field3359;
                                                                                                                        int var30 = var25.field3357;
                                                                                                                        int var31 = var25.field3355;
                                                                                                                        int var32 = class212.field2594[var31 - var30];
                                                                                                                        if (var23 < 0 || var23 > var32) {
                                                                                                                            var23 = 0;
                                                                                                                        }
                                                                                                                        int var33 = var32 << var30;
                                                                                                                        class212.field2589[var29] = class212.field2589[var29] & ~var33 | var23 << var30 & var33;
                                                                                                                    } else if (var354 == 31) {
                                                                                                                        Statics.field308 -= 2;
                                                                                                                        if (field1350[Statics.field308] <= field1350[Statics.field308 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var354 == 32) {
                                                                                                                        Statics.field308 -= 2;
                                                                                                                        if (field1350[Statics.field308] >= field1350[Statics.field308 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var354 == 33) {
                                                                                                                        field1350[++Statics.field308 - 1] = Statics.field1342[var10[var8]];
                                                                                                                    } else if (var354 == 34) {
                                                                                                                        Statics.field1342[var10[var8]] = field1350[--Statics.field308];
                                                                                                                    } else if (var354 == 35) {
                                                                                                                        field1356[++Statics.field658 - 1] = Statics.field1766[var10[var8]];
                                                                                                                    } else if (var354 == 36) {
                                                                                                                        Statics.field1766[var10[var8]] = field1356[--Statics.field658];
                                                                                                                    } else if (var354 == 37) {
                                                                                                                        int var34 = var10[var8];
                                                                                                                        Statics.field658 -= var34;
                                                                                                                        String var35 = class271.method4(field1356, Statics.field658, var34);
                                                                                                                        field1356[++Statics.field658 - 1] = var35;
                                                                                                                    } else if (var354 == 38) {
                                                                                                                        Statics.field308--;
                                                                                                                    } else if (var354 == 39) {
                                                                                                                        Statics.field658--;
                                                                                                                    } else if (var354 == 40) {
                                                                                                                        int var36 = var10[var8];
                                                                                                                        class100 var37 = class100.method434(var36);
                                                                                                                        int[] var38 = new int[var37.field1537];
                                                                                                                        String[] var39 = new String[var37.field1539];
                                                                                                                        for (int var40 = 0; var40 < var37.field1533; var40++) {
                                                                                                                            var38[var40] = field1350[Statics.field308 - var37.field1533 + var40];
                                                                                                                        }
                                                                                                                        for (int var41 = 0; var41 < var37.field1541; var41++) {
                                                                                                                            var39[var41] = field1356[Statics.field658 - var37.field1541 + var41];
                                                                                                                        }
                                                                                                                        Statics.field308 -= var37.field1533;
                                                                                                                        Statics.field658 -= var37.field1541;
                                                                                                                        class63 var42 = new class63();
                                                                                                                        var42.field772 = var6;
                                                                                                                        var42.field774 = var8;
                                                                                                                        var42.field771 = Statics.field1342;
                                                                                                                        var42.field769 = Statics.field1766;
                                                                                                                        field1346[++field1347 - 1] = var42;
                                                                                                                        var6 = var37;
                                                                                                                        var9 = var37.field1534;
                                                                                                                        var10 = var37.field1535;
                                                                                                                        var8 = -1;
                                                                                                                        Statics.field1342 = var38;
                                                                                                                        Statics.field1766 = var39;
                                                                                                                    } else if (var354 == 42) {
                                                                                                                        field1350[++Statics.field308 - 1] = Statics.field294.method1630(var10[var8]);
                                                                                                                    } else if (var354 == 43) {
                                                                                                                        Statics.field294.method1629(var10[var8], field1350[--Statics.field308]);
                                                                                                                    } else if (var354 == 44) {
                                                                                                                        int var43 = var10[var8] >> 16;
                                                                                                                        int var44 = var10[var8] & 0xFFFF;
                                                                                                                        int var45 = field1350[--Statics.field308];
                                                                                                                        if (var45 >= 0 && var45 <= 5000) {
                                                                                                                            field1343[var43] = var45;
                                                                                                                            byte var46 = -1;
                                                                                                                            if (var44 == 105) {
                                                                                                                                var46 = 0;
                                                                                                                            }
                                                                                                                            int var47 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var47 >= var45) {
                                                                                                                                    continue label1771;
                                                                                                                                }
                                                                                                                                field1344[var43][var47] = var46;
                                                                                                                                var47++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var354 == 45) {
                                                                                                                        int var48 = var10[var8];
                                                                                                                        int var49 = field1350[--Statics.field308];
                                                                                                                        if (var49 < 0 || var49 >= field1343[var48]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1350[++Statics.field308 - 1] = field1344[var48][var49];
                                                                                                                    } else if (var354 == 46) {
                                                                                                                        int var50 = var10[var8];
                                                                                                                        Statics.field308 -= 2;
                                                                                                                        int var51 = field1350[Statics.field308];
                                                                                                                        if (var51 < 0 || var51 >= field1343[var50]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1344[var50][var51] = field1350[Statics.field308 + 1];
                                                                                                                    } else if (var354 == 47) {
                                                                                                                        String var52 = Statics.field294.method1632(var10[var8]);
                                                                                                                        if (var52 == null) {
                                                                                                                            var52 = "null";
                                                                                                                        }
                                                                                                                        field1356[++Statics.field658 - 1] = var52;
                                                                                                                    } else if (var354 == 48) {
                                                                                                                        Statics.field294.method1631(var10[var8], field1356[--Statics.field658]);
                                                                                                                    } else if (var354 == 60) {
                                                                                                                        class187 var53 = var6.field1538[var10[var8]];
                                                                                                                        class199 var54 = (class199) var53.method3216((long) field1350[--Statics.field308]);
                                                                                                                        if (var54 != null) {
                                                                                                                            var8 += var54.field2467;
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
        } catch (Exception var353) {
            StringBuilder var351 = new StringBuilder(30);
            var351.append("").append(var6.field2454).append(" ");
            for (int var352 = field1347 - 1; var352 >= 0; var352--) {
                var351.append("").append(field1346[var352].field772.field2454).append(" ");
            }
            var351.append("").append(var11);
            class153.method464(var351.toString(), var353);
        }
    }

    @ObfuscatedName("aw.m(ILcr;ZS)I")
    public static int method459(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field308 -= 3;
            int var3 = field1350[Statics.field308];
            int var4 = field1350[Statics.field308 + 1];
            int var5 = field1350[Statics.field308 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class217 var6 = class217.method577(var3);
            if (var6.field2757 == null) {
                var6.field2757 = new class217[var5 + 1];
            }
            if (var6.field2757.length <= var5) {
                class217[] var7 = new class217[var5 + 1];
                for (int var8 = 0; var8 < var6.field2757.length; var8++) {
                    var7[var8] = var6.field2757[var8];
                }
                var6.field2757 = var7;
            }
            if (var5 > 0 && var6.field2757[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class217 var9 = new class217();
            var9.field2673 = var4;
            var9.field2652 = var9.field2637 = var6.field2637;
            var9.field2759 = var5;
            var9.field2632 = true;
            var6.field2757[var5] = var9;
            if (arg2) {
                Statics.field2420 = var9;
            } else {
                Statics.field442 = var9;
            }
            client.method1(var6);
            return 1;
        } else if (arg0 == 101) {
            class217 var10 = arg2 ? Statics.field2420 : Statics.field442;
            class217 var11 = class217.method577(var10.field2637);
            var11.field2757[var10.field2759] = null;
            client.method1(var11);
            return 1;
        } else if (arg0 == 102) {
            class217 var12 = class217.method577(field1350[--Statics.field308]);
            var12.field2757 = null;
            client.method1(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field308 -= 2;
            int var13 = field1350[Statics.field308];
            int var14 = field1350[Statics.field308 + 1];
            class217 var15 = class217.method1520(var13, var14);
            if (var15 == null || var14 == -1) {
                field1350[++Statics.field308 - 1] = 0;
            } else {
                field1350[++Statics.field308 - 1] = 1;
                if (arg2) {
                    Statics.field2420 = var15;
                } else {
                    Statics.field442 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class217 var16 = class217.method577(field1350[--Statics.field308]);
            if (var16 == null) {
                field1350[++Statics.field308 - 1] = 0;
            } else {
                field1350[++Statics.field308 - 1] = 1;
                if (arg2) {
                    Statics.field2420 = var16;
                } else {
                    Statics.field442 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.g(ILcr;ZS)I")
    public static int method223(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1350[--Statics.field308];
            var4 = class217.method577(var3);
        } else {
            var4 = arg2 ? Statics.field2420 : Statics.field442;
        }
        if (arg0 == 1000) {
            Statics.field308 -= 4;
            var4.field2642 = field1350[Statics.field308];
            var4.field2643 = field1350[Statics.field308 + 1];
            var4.field2714 = field1350[Statics.field308 + 2];
            var4.field2639 = field1350[Statics.field308 + 3];
            client.method1(var4);
            Statics.field3334.method1172(var4);
            if (var3 != -1 && var4.field2673 == 0) {
                client.method108(Statics.field515[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field308 -= 4;
            var4.field2644 = field1350[Statics.field308];
            var4.field2645 = field1350[Statics.field308 + 1];
            var4.field2640 = field1350[Statics.field308 + 2];
            var4.field2641 = field1350[Statics.field308 + 3];
            client.method1(var4);
            Statics.field3334.method1172(var4);
            if (var3 != -1 && var4.field2673 == 0) {
                client.method108(Statics.field515[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1350[--Statics.field308] == 1;
            if (var4.field2739 != var5) {
                var4.field2739 = var5;
                client.method1(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2766 = field1350[--Statics.field308] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2767 = field1350[--Statics.field308] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.d(ILcr;ZI)I")
    public static int method309(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1350[--Statics.field308];
            var4 = class217.method577(var3);
        } else {
            var4 = arg2 ? Statics.field2420 : Statics.field442;
        }
        if (arg0 == 1100) {
            Statics.field308 -= 2;
            var4.field2654 = field1350[Statics.field308];
            if (var4.field2654 > var4.field2656 - var4.field2625) {
                var4.field2654 = var4.field2656 - var4.field2625;
            }
            if (var4.field2654 < 0) {
                var4.field2654 = 0;
            }
            var4.field2655 = field1350[Statics.field308 + 1];
            if (var4.field2655 > var4.field2657 - var4.field2649) {
                var4.field2655 = var4.field2657 - var4.field2649;
            }
            if (var4.field2655 < 0) {
                var4.field2655 = 0;
            }
            client.method1(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2658 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2630 = field1350[--Statics.field308] == 1;
            client.method1(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2717 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2635 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2668 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2679 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2765 = field1350[--Statics.field308] == 1;
            client.method1(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2693 = 1;
            var4.field2702 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field308 -= 6;
            var4.field2676 = field1350[Statics.field308];
            var4.field2683 = field1350[Statics.field308 + 1];
            var4.field2684 = field1350[Statics.field308 + 2];
            var4.field2685 = field1350[Statics.field308 + 3];
            var4.field2686 = field1350[Statics.field308 + 4];
            var4.field2687 = field1350[Statics.field308 + 5];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1350[--Statics.field308];
            if (var4.field2680 != var5) {
                var4.field2680 = var5;
                var4.field2706 = 0;
                var4.field2659 = 0;
                client.method1(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2690 = field1350[--Statics.field308] == 1;
            client.method1(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1356[--Statics.field658];
            if (!var6.equals(var4.field2707)) {
                var4.field2707 = var6;
                client.method1(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2634 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field308 -= 3;
            var4.field2696 = field1350[Statics.field308];
            var4.field2697 = field1350[Statics.field308 + 1];
            var4.field2695 = field1350[Statics.field308 + 2];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2698 = field1350[--Statics.field308] == 1;
            client.method1(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2672 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2647 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2674 = field1350[--Statics.field308] == 1;
            client.method1(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2712 = field1350[--Statics.field308] == 1;
            client.method1(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field308 -= 2;
            var4.field2656 = field1350[Statics.field308];
            var4.field2657 = field1350[Statics.field308 + 1];
            client.method1(var4);
            if (var3 != -1 && var4.field2673 == 0) {
                client.method108(Statics.field515[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2637;
            int var8 = var4.field2759;
            client.field963.method3121(171);
            client.field963.method2939(var7);
            client.field963.method2916(var8);
            client.field954 = var4;
            client.method1(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2713 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2710 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2688 = field1350[--Statics.field308];
            client.method1(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field1350[--Statics.field308];
            class284 var10 = (class284) class169.method999(class284.method139(), var9);
            if (var10 != null) {
                var4.field2663 = var10;
                client.method1(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var11 = field1350[--Statics.field308] == 1;
            var4.field2667 = var11;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hw.b(ILcr;ZB)I")
    public static int method3747(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method577(field1350[--Statics.field308]);
        } else {
            var3 = arg2 ? Statics.field2420 : Statics.field442;
        }
        client.method1(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field308 -= 2;
            int var4 = field1350[Statics.field308];
            int var5 = field1350[Statics.field308 + 1];
            var3.field2753 = var4;
            var3.field2754 = var5;
            class257 var6 = Statics.method461(var4);
            var3.field2684 = var6.field3482;
            var3.field2685 = var6.field3483;
            var3.field2686 = var6.field3484;
            var3.field2676 = var6.field3485;
            var3.field2683 = var6.field3508;
            var3.field2687 = var6.field3496;
            if (arg0 == 1205) {
                var3.field2691 = 0;
            } else if (arg0 == 1212 | var6.field3501 == 1) {
                var3.field2691 = 1;
            } else {
                var3.field2691 = 2;
            }
            if (var3.field2725 > 0) {
                var3.field2687 = var3.field2687 * 32 / var3.field2725;
            } else if (var3.field2644 > 0) {
                var3.field2687 = var3.field2687 * 32 / var3.field2644;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2693 = 2;
            var3.field2702 = field1350[--Statics.field308];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2693 = 3;
            var3.field2702 = Statics.field3209.field881.method3618();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.k(ILcr;ZS)I")
    public static int method125(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method577(field1350[--Statics.field308]);
        } else {
            var3 = arg2 ? Statics.field2420 : Statics.field442;
        }
        if (arg0 == 1300) {
            int var4 = field1350[--Statics.field308] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3667(var4, field1356[--Statics.field658]);
                return 1;
            } else {
                Statics.field658--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field308 -= 2;
            int var5 = field1350[Statics.field308];
            int var6 = field1350[Statics.field308 + 1];
            var3.field2708 = class217.method1520(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2735 = field1350[--Statics.field308] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2752 = field1350[--Statics.field308];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2715 = field1350[--Statics.field308];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2671 = field1356[--Statics.field658];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2638 = field1356[--Statics.field658];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2677 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bj.q(ILcr;ZI)I")
    public static int method1001(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method577(field1350[--Statics.field308]);
        } else {
            var3 = arg2 ? Statics.field2420 : Statics.field442;
        }
        String var4 = field1356[--Statics.field658];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1350[--Statics.field308];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1350[--Statics.field308];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1356[--Statics.field658];
            } else {
                var7[var8] = Integer.valueOf(field1350[--Statics.field308]);
            }
        }
        int var9 = field1350[--Statics.field308];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2755 = var7;
        } else if (arg0 == 1401) {
            var3.field2718 = var7;
        } else if (arg0 == 1402) {
            var3.field2622 = var7;
        } else if (arg0 == 1403) {
            var3.field2719 = var7;
        } else if (arg0 == 1404) {
            var3.field2721 = var7;
        } else if (arg0 == 1405) {
            var3.field2722 = var7;
        } else if (arg0 == 1406) {
            var3.field2660 = var7;
        } else if (arg0 == 1407) {
            var3.field2726 = var7;
            var3.field2709 = var5;
        } else if (arg0 == 1408) {
            var3.field2732 = var7;
        } else if (arg0 == 1409) {
            var3.field2733 = var7;
        } else if (arg0 == 1410) {
            var3.field2723 = var7;
        } else if (arg0 == 1411) {
            var3.field2716 = var7;
        } else if (arg0 == 1412) {
            var3.field2720 = var7;
        } else if (arg0 == 1414) {
            var3.field2728 = var7;
            var3.field2729 = var5;
        } else if (arg0 == 1415) {
            var3.field2730 = var7;
            var3.field2731 = var5;
        } else if (arg0 == 1416) {
            var3.field2666 = var7;
        } else if (arg0 == 1417) {
            var3.field2734 = var7;
        } else if (arg0 == 1418) {
            var3.field2758 = var7;
        } else if (arg0 == 1419) {
            var3.field2736 = var7;
        } else if (arg0 == 1420) {
            var3.field2737 = var7;
        } else if (arg0 == 1421) {
            var3.field2738 = var7;
        } else if (arg0 == 1422) {
            var3.field2633 = var7;
        } else if (arg0 == 1423) {
            var3.field2740 = var7;
        } else if (arg0 == 1424) {
            var3.field2675 = var7;
        } else if (arg0 == 1425) {
            var3.field2743 = var7;
        } else if (arg0 == 1426) {
            var3.field2744 = var7;
        } else if (arg0 == 1427) {
            var3.field2742 = var7;
        } else {
            return 2;
        }
        var3.field2665 = true;
        return 1;
    }

    @ObfuscatedName("dq.h(ILcr;ZI)I")
    public static int method2174(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field2420 : Statics.field442;
        if (arg0 == 1500) {
            field1350[++Statics.field308 - 1] = var3.field2646;
            return 1;
        } else if (arg0 == 1501) {
            field1350[++Statics.field308 - 1] = var3.field2662;
            return 1;
        } else if (arg0 == 1502) {
            field1350[++Statics.field308 - 1] = var3.field2625;
            return 1;
        } else if (arg0 == 1503) {
            field1350[++Statics.field308 - 1] = var3.field2649;
            return 1;
        } else if (arg0 == 1504) {
            field1350[++Statics.field308 - 1] = var3.field2739 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1350[++Statics.field308 - 1] = var3.field2652;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.i(ILcr;ZB)I")
    public static int method1558(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field2420 : Statics.field442;
        if (arg0 == 1600) {
            field1350[++Statics.field308 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 1601) {
            field1350[++Statics.field308 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 1602) {
            field1356[++Statics.field658 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 1603) {
            field1350[++Statics.field308 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 1604) {
            field1350[++Statics.field308 - 1] = var3.field2657;
            return 1;
        } else if (arg0 == 1605) {
            field1350[++Statics.field308 - 1] = var3.field2687;
            return 1;
        } else if (arg0 == 1606) {
            field1350[++Statics.field308 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 1607) {
            field1350[++Statics.field308 - 1] = var3.field2686;
            return 1;
        } else if (arg0 == 1608) {
            field1350[++Statics.field308 - 1] = var3.field2685;
            return 1;
        } else if (arg0 == 1609) {
            field1350[++Statics.field308 - 1] = var3.field2717;
            return 1;
        } else if (arg0 == 1610) {
            field1350[++Statics.field308 - 1] = var3.field2688;
            return 1;
        } else if (arg0 == 1611) {
            field1350[++Statics.field308 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 1612) {
            field1350[++Statics.field308 - 1] = var3.field2710;
            return 1;
        } else if (arg0 == 1613) {
            field1350[++Statics.field308 - 1] = var3.field2663.method8();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.s(ILcr;ZI)I")
    public static int method195(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method577(field1350[--Statics.field308]);
        } else {
            var3 = arg2 ? Statics.field2420 : Statics.field442;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1348 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2742 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field832 = var3;
            var4.field836 = var3.field2742;
            var4.field830 = field1348 + 1;
            client.field1110.method3318(var4);
            return 1;
        }
    }

    @ObfuscatedName("bv.n(ILcr;ZB)I")
    public static int method1050(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method577(field1350[--Statics.field308]);
        if (arg0 == 2600) {
            field1350[++Statics.field308 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 2601) {
            field1350[++Statics.field308 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 2602) {
            field1356[++Statics.field658 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 2603) {
            field1350[++Statics.field308 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 2604) {
            field1350[++Statics.field308 - 1] = var3.field2657;
            return 1;
        } else if (arg0 == 2605) {
            field1350[++Statics.field308 - 1] = var3.field2687;
            return 1;
        } else if (arg0 == 2606) {
            field1350[++Statics.field308 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 2607) {
            field1350[++Statics.field308 - 1] = var3.field2686;
            return 1;
        } else if (arg0 == 2608) {
            field1350[++Statics.field308 - 1] = var3.field2685;
            return 1;
        } else if (arg0 == 2609) {
            field1350[++Statics.field308 - 1] = var3.field2717;
            return 1;
        } else if (arg0 == 2610) {
            field1350[++Statics.field308 - 1] = var3.field2688;
            return 1;
        } else if (arg0 == 2611) {
            field1350[++Statics.field308 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 2612) {
            field1350[++Statics.field308 - 1] = var3.field2710;
            return 1;
        } else if (arg0 == 2613) {
            field1350[++Statics.field308 - 1] = var3.field2663.method8();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.c(ILcr;ZI)I")
    public static int method714(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class217 var3 = class217.method577(field1350[--Statics.field308]);
            field1350[++Statics.field308 - 1] = var3.field2753;
            return 1;
        } else if (arg0 == 2701) {
            class217 var4 = class217.method577(field1350[--Statics.field308]);
            if (var4.field2753 == -1) {
                field1350[++Statics.field308 - 1] = 0;
            } else {
                field1350[++Statics.field308 - 1] = var4.field2754;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1350[--Statics.field308];
            class69 var6 = (class69) client.field1082.method3268((long) var5);
            if (var6 == null) {
                field1350[++Statics.field308 - 1] = 0;
            } else {
                field1350[++Statics.field308 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1350[++Statics.field308 - 1] = client.field1081;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fn.u(ILcr;ZI)I")
    public static int method3160(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1350[++Statics.field308 - 1] = client.field1137;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field308 -= 3;
            client.field1137 = field1350[Statics.field308];
            int var3 = field1350[Statics.field308 + 1];
            class277[] var4 = class277.method2379();
            int var5 = 0;
            class277 var7;
            while (true) {
                if (var5 >= var4.length) {
                    var7 = null;
                    break;
                }
                class277 var6 = var4[var5];
                if (var6.field3723 == var3) {
                    var7 = var6;
                    break;
                }
                var5++;
            }
            Statics.field3413 = var7;
            if (Statics.field3413 == null) {
                Statics.field3413 = class277.field3726;
            }
            client.field922 = field1350[Statics.field308 + 2];
            client.field963.method3121(153);
            client.field963.method2876(client.field1137);
            client.field963.method2876(Statics.field3413.field3723);
            client.field963.method2876(client.field922);
            return 1;
        } else if (arg0 == 5002) {
            String var8 = field1356[--Statics.field658];
            Statics.field308 -= 2;
            int var9 = field1350[Statics.field308];
            int var10 = field1350[Statics.field308 + 1];
            client.field963.method3121(227);
            client.field963.method2876(class174.method2750(var8) + 2);
            client.field963.method2936(var8);
            client.field963.method2876(var9 - 1);
            client.field963.method2876(var10);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field308 -= 2;
            int var11 = field1350[Statics.field308];
            int var12 = field1350[Statics.field308 + 1];
            class102 var13 = (class102) class99.field1531.get(var11);
            class73 var14 = var13.method1700(var12);
            if (var14 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
                field1356[++Statics.field658 - 1] = "";
                field1356[++Statics.field658 - 1] = "";
            } else {
                field1350[++Statics.field308 - 1] = var14.field867;
                field1350[++Statics.field308 - 1] = var14.field866;
                field1356[++Statics.field658 - 1] = var14.field872 == null ? "" : var14.field872;
                field1356[++Statics.field658 - 1] = var14.field869 == null ? "" : var14.field869;
                field1356[++Statics.field658 - 1] = var14.field870 == null ? "" : var14.field870;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var16 = field1350[--Statics.field308];
            class73 var17 = class99.method103(var16);
            if (var17 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
                field1356[++Statics.field658 - 1] = "";
                field1356[++Statics.field658 - 1] = "";
            } else {
                field1350[++Statics.field308 - 1] = var17.field865;
                field1350[++Statics.field308 - 1] = var17.field866;
                field1356[++Statics.field658 - 1] = var17.field872 == null ? "" : var17.field872;
                field1356[++Statics.field658 - 1] = var17.field869 == null ? "" : var17.field869;
                field1356[++Statics.field658 - 1] = var17.field870 == null ? "" : var17.field870;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field3413 == null) {
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = Statics.field3413.field3723;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var18 = field1356[--Statics.field658];
            int var19 = field1350[--Statics.field308];
            String var20 = var18.toLowerCase();
            byte var21 = 0;
            if (var20.startsWith(class226.field3010)) {
                var21 = 0;
                var18 = var18.substring(class226.field3010.length());
            } else if (var20.startsWith(class226.field3012)) {
                var21 = 1;
                var18 = var18.substring(class226.field3012.length());
            } else if (var20.startsWith(class226.field3014)) {
                var21 = 2;
                var18 = var18.substring(class226.field3014.length());
            } else if (var20.startsWith(class226.field3026)) {
                var21 = 3;
                var18 = var18.substring(class226.field3026.length());
            } else if (var20.startsWith(class226.field3018)) {
                var21 = 4;
                var18 = var18.substring(class226.field3018.length());
            } else if (var20.startsWith(class226.field3020)) {
                var21 = 5;
                var18 = var18.substring(class226.field3020.length());
            } else if (var20.startsWith(class226.field3022)) {
                var21 = 6;
                var18 = var18.substring(class226.field3022.length());
            } else if (var20.startsWith(class226.field2834)) {
                var21 = 7;
                var18 = var18.substring(class226.field2834.length());
            } else if (var20.startsWith(class226.field2938)) {
                var21 = 8;
                var18 = var18.substring(class226.field2938.length());
            } else if (var20.startsWith(class226.field3043)) {
                var21 = 9;
                var18 = var18.substring(class226.field3043.length());
            } else if (var20.startsWith(class226.field3030)) {
                var21 = 10;
                var18 = var18.substring(class226.field3030.length());
            } else if (var20.startsWith(class226.field3104)) {
                var21 = 11;
                var18 = var18.substring(class226.field3104.length());
            } else if (client.field925 != 0) {
                if (var20.startsWith(class226.field3053)) {
                    var21 = 0;
                    var18 = var18.substring(class226.field3053.length());
                } else if (var20.startsWith(class226.field3013)) {
                    var21 = 1;
                    var18 = var18.substring(class226.field3013.length());
                } else if (var20.startsWith(class226.field2893)) {
                    var21 = 2;
                    var18 = var18.substring(class226.field2893.length());
                } else if (var20.startsWith(class226.field3017)) {
                    var21 = 3;
                    var18 = var18.substring(class226.field3017.length());
                } else if (var20.startsWith(class226.field3019)) {
                    var21 = 4;
                    var18 = var18.substring(class226.field3019.length());
                } else if (var20.startsWith(class226.field3021)) {
                    var21 = 5;
                    var18 = var18.substring(class226.field3021.length());
                } else if (var20.startsWith(class226.field3023)) {
                    var21 = 6;
                    var18 = var18.substring(class226.field3023.length());
                } else if (var20.startsWith(class226.field2880)) {
                    var21 = 7;
                    var18 = var18.substring(class226.field2880.length());
                } else if (var20.startsWith(class226.field2987)) {
                    var21 = 8;
                    var18 = var18.substring(class226.field2987.length());
                } else if (var20.startsWith(class226.field2842)) {
                    var21 = 9;
                    var18 = var18.substring(class226.field2842.length());
                } else if (var20.startsWith(class226.field3031)) {
                    var21 = 10;
                    var18 = var18.substring(class226.field3031.length());
                } else if (var20.startsWith(class226.field3105)) {
                    var21 = 11;
                    var18 = var18.substring(class226.field3105.length());
                }
            }
            String var22 = var18.toLowerCase();
            byte var23 = 0;
            if (var22.startsWith(class226.field3052)) {
                var23 = 1;
                var18 = var18.substring(class226.field3052.length());
            } else if (var22.startsWith(class226.field3029)) {
                var23 = 2;
                var18 = var18.substring(class226.field3029.length());
            } else if (var22.startsWith(class226.field3038)) {
                var23 = 3;
                var18 = var18.substring(class226.field3038.length());
            } else if (var22.startsWith(class226.field3109)) {
                var23 = 4;
                var18 = var18.substring(class226.field3109.length());
            } else if (var22.startsWith(class226.field3055)) {
                var23 = 5;
                var18 = var18.substring(class226.field3055.length());
            } else if (client.field925 != 0) {
                if (var22.startsWith(class226.field3035)) {
                    var23 = 1;
                    var18 = var18.substring(class226.field3035.length());
                } else if (var22.startsWith(class226.field3037)) {
                    var23 = 2;
                    var18 = var18.substring(class226.field3037.length());
                } else if (var22.startsWith(class226.field3039)) {
                    var23 = 3;
                    var18 = var18.substring(class226.field3039.length());
                } else if (var22.startsWith(class226.field3041)) {
                    var23 = 4;
                    var18 = var18.substring(class226.field3041.length());
                } else if (var22.startsWith(class226.field2888)) {
                    var23 = 5;
                    var18 = var18.substring(class226.field2888.length());
                }
            }
            client.field963.method3121(99);
            client.field963.method2876(0);
            int var24 = client.field963.field2370;
            client.field963.method2876(var19);
            client.field963.method2876(var21);
            client.field963.method2876(var23);
            class180 var25 = client.field963;
            int var26 = var25.field2370;
            int var27 = var18.length();
            byte[] var28 = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                char var30 = var18.charAt(var29);
                if (var30 > 0 && var30 < 128 || var30 >= 160 && var30 <= 255) {
                    var28[var29] = (byte) var30;
                } else if (var30 == 8364) {
                    var28[var29] = -128;
                } else if (var30 == 8218) {
                    var28[var29] = -126;
                } else if (var30 == 402) {
                    var28[var29] = -125;
                } else if (var30 == 8222) {
                    var28[var29] = -124;
                } else if (var30 == 8230) {
                    var28[var29] = -123;
                } else if (var30 == 8224) {
                    var28[var29] = -122;
                } else if (var30 == 8225) {
                    var28[var29] = -121;
                } else if (var30 == 710) {
                    var28[var29] = -120;
                } else if (var30 == 8240) {
                    var28[var29] = -119;
                } else if (var30 == 352) {
                    var28[var29] = -118;
                } else if (var30 == 8249) {
                    var28[var29] = -117;
                } else if (var30 == 338) {
                    var28[var29] = -116;
                } else if (var30 == 381) {
                    var28[var29] = -114;
                } else if (var30 == 8216) {
                    var28[var29] = -111;
                } else if (var30 == 8217) {
                    var28[var29] = -110;
                } else if (var30 == 8220) {
                    var28[var29] = -109;
                } else if (var30 == 8221) {
                    var28[var29] = -108;
                } else if (var30 == 8226) {
                    var28[var29] = -107;
                } else if (var30 == 8211) {
                    var28[var29] = -106;
                } else if (var30 == 8212) {
                    var28[var29] = -105;
                } else if (var30 == 732) {
                    var28[var29] = -104;
                } else if (var30 == 8482) {
                    var28[var29] = -103;
                } else if (var30 == 353) {
                    var28[var29] = -102;
                } else if (var30 == 8250) {
                    var28[var29] = -101;
                } else if (var30 == 339) {
                    var28[var29] = -100;
                } else if (var30 == 382) {
                    var28[var29] = -98;
                } else if (var30 == 376) {
                    var28[var29] = -97;
                } else {
                    var28[var29] = 63;
                }
            }
            var25.method2906(var28.length);
            var25.field2370 += Statics.field3646.method2820(var28, 0, var28.length, var25.field2373, var25.field2370);
            client.field963.method2888(client.field963.field2370 - var24);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field658 -= 2;
            String var33 = field1356[Statics.field658];
            String var34 = field1356[Statics.field658 + 1];
            client.field963.method3121(47);
            client.field963.method2877(0);
            int var35 = client.field963.field2370;
            client.field963.method2936(var33);
            class180 var36 = client.field963;
            int var37 = var36.field2370;
            int var38 = var34.length();
            byte[] var39 = new byte[var38];
            for (int var40 = 0; var40 < var38; var40++) {
                char var41 = var34.charAt(var40);
                if (var41 > 0 && var41 < 128 || var41 >= 160 && var41 <= 255) {
                    var39[var40] = (byte) var41;
                } else if (var41 == 8364) {
                    var39[var40] = -128;
                } else if (var41 == 8218) {
                    var39[var40] = -126;
                } else if (var41 == 402) {
                    var39[var40] = -125;
                } else if (var41 == 8222) {
                    var39[var40] = -124;
                } else if (var41 == 8230) {
                    var39[var40] = -123;
                } else if (var41 == 8224) {
                    var39[var40] = -122;
                } else if (var41 == 8225) {
                    var39[var40] = -121;
                } else if (var41 == 710) {
                    var39[var40] = -120;
                } else if (var41 == 8240) {
                    var39[var40] = -119;
                } else if (var41 == 352) {
                    var39[var40] = -118;
                } else if (var41 == 8249) {
                    var39[var40] = -117;
                } else if (var41 == 338) {
                    var39[var40] = -116;
                } else if (var41 == 381) {
                    var39[var40] = -114;
                } else if (var41 == 8216) {
                    var39[var40] = -111;
                } else if (var41 == 8217) {
                    var39[var40] = -110;
                } else if (var41 == 8220) {
                    var39[var40] = -109;
                } else if (var41 == 8221) {
                    var39[var40] = -108;
                } else if (var41 == 8226) {
                    var39[var40] = -107;
                } else if (var41 == 8211) {
                    var39[var40] = -106;
                } else if (var41 == 8212) {
                    var39[var40] = -105;
                } else if (var41 == 732) {
                    var39[var40] = -104;
                } else if (var41 == 8482) {
                    var39[var40] = -103;
                } else if (var41 == 353) {
                    var39[var40] = -102;
                } else if (var41 == 8250) {
                    var39[var40] = -101;
                } else if (var41 == 339) {
                    var39[var40] = -100;
                } else if (var41 == 382) {
                    var39[var40] = -98;
                } else if (var41 == 376) {
                    var39[var40] = -97;
                } else {
                    var39[var40] = 63;
                }
            }
            var36.method2906(var39.length);
            var36.field2370 += Statics.field3646.method2820(var39, 0, var39.length, var36.field2373, var36.field2370);
            client.field963.method2887(client.field963.field2370 - var35);
            return 1;
        } else if (arg0 == 5015) {
            String var44;
            if (Statics.field3209 == null || Statics.field3209.field895 == null) {
                var44 = "";
            } else {
                var44 = Statics.field3209.field895;
            }
            field1356[++Statics.field658 - 1] = var44;
            return 1;
        } else if (arg0 == 5016) {
            field1350[++Statics.field308 - 1] = client.field922;
            return 1;
        } else if (arg0 == 5017) {
            int var45 = field1350[--Statics.field308];
            int[] var46 = field1350;
            int var47 = ++Statics.field308 - 1;
            class102 var48 = (class102) class99.field1531.get(var45);
            int var49;
            if (var48 == null) {
                var49 = 0;
            } else {
                var49 = var48.method1697();
            }
            var46[var47] = var49;
            return 1;
        } else if (arg0 == 5018) {
            int var50 = field1350[--Statics.field308];
            int[] var51 = field1350;
            int var52 = ++Statics.field308 - 1;
            class73 var53 = (class73) class99.field1530.method3216((long) var50);
            int var54;
            if (var53 == null) {
                var54 = -1;
            } else if (class99.field1529.field2472 == var53.field2457) {
                var54 = -1;
            } else {
                var54 = ((class73) var53.field2457).field867;
            }
            var51[var52] = var54;
            return 1;
        } else if (arg0 == 5019) {
            int var55 = field1350[--Statics.field308];
            int[] var56 = field1350;
            int var57 = ++Statics.field308 - 1;
            class73 var58 = (class73) class99.field1530.method3216((long) var55);
            int var59;
            if (var58 == null) {
                var59 = -1;
            } else if (class99.field1529.field2472 == var58.field2458) {
                var59 = -1;
            } else {
                var59 = ((class73) var58.field2458).field867;
            }
            var56[var57] = var59;
            return 1;
        } else if (arg0 == 5020) {
            String var60 = field1356[--Statics.field658];
            if (var60.equalsIgnoreCase("toggleroof")) {
                Statics.field527.field1313 = !Statics.field527.field1313;
                class82.method1400();
                if (Statics.field527.field1313) {
                    class99.method3(99, "", "Roofs are now all hidden");
                } else {
                    class99.method3(99, "", "Roofs will only be removed selectively");
                }
            }
            if (var60.equalsIgnoreCase("displayfps")) {
                client.field935 = !client.field935;
            }
            if (var60.equalsIgnoreCase("clickbox")) {
                class134.field1921 = !class134.field1921;
                class99.method3(99, "", "Clickbox Mode: " + (class134.field1921 ? "AABB" : "Legacy"));
            }
            if (client.field1088 >= 2) {
                if (var60.equalsIgnoreCase("aabb")) {
                    if (!class8.field227) {
                        class8.field227 = true;
                        class8.field231 = class12.field260;
                        class99.method3(99, "", "AABB boxes: All");
                    } else if (class8.field231 == class12.field260) {
                        class8.field227 = true;
                        class8.field231 = class12.field265;
                        class99.method3(99, "", "AABB boxes: Mouse Over");
                    } else {
                        class8.field227 = false;
                        class99.method3(99, "", "AABB boxes: Off");
                    }
                }
                if (var60.equalsIgnoreCase("legacyboxes")) {
                    class8.field228 = !class8.field228;
                    class99.method3(99, "", "Show legacy boxes: " + class8.field228);
                }
                if (var60.equalsIgnoreCase("geotests")) {
                    class8.field229 = !class8.field229;
                    class99.method3(99, "", "Show geometry tests: " + class8.field229);
                }
                if (var60.equalsIgnoreCase("fpson")) {
                    client.field935 = true;
                }
                if (var60.equalsIgnoreCase("fpsoff")) {
                    client.field935 = false;
                }
                if (var60.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (var60.equalsIgnoreCase("clientdrop")) {
                    client.method37();
                }
                if (var60.equalsIgnoreCase("errortest") && client.field921 == 2) {
                    throw new RuntimeException();
                }
            }
            client.field963.method3121(179);
            client.field963.method2876(var60.length() + 1);
            client.field963.method2936(var60);
            return 1;
        } else if (arg0 == 5021) {
            client.field1139 = field1356[--Statics.field658].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1356[++Statics.field658 - 1] = client.field1139;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.w(ILcr;ZI)I")
    public static int method32(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field308 -= 2;
            int var3 = field1350[Statics.field308];
            int var4 = field1350[Statics.field308 + 1];
            if (!client.field1167) {
                client.field1004 = var3;
                client.field1005 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1350[++Statics.field308 - 1] = client.field1004;
            return 1;
        } else if (arg0 == 5506) {
            field1350[++Statics.field308 - 1] = client.field1005;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1350[--Statics.field308];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field1010 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1350[++Statics.field308 - 1] = client.field1010;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.p(ILcr;ZI)I")
    public static int method983(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1350[++Statics.field308 - 1] = class81.method19() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = class81.method3570();
            if (var3 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
                field1350[++Statics.field308 - 1] = 0;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
            } else {
                field1350[++Statics.field308 - 1] = var3.field1301;
                field1350[++Statics.field308 - 1] = var3.field1299;
                field1356[++Statics.field658 - 1] = var3.field1306;
                field1350[++Statics.field308 - 1] = var3.field1294;
                field1350[++Statics.field308 - 1] = var3.field1303;
                field1356[++Statics.field658 - 1] = var3.field1302;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4;
            if (class81.field1298 < class81.field1297) {
                var4 = Statics.field1296[++class81.field1298 - 1];
            } else {
                var4 = null;
            }
            if (var4 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
                field1350[++Statics.field308 - 1] = 0;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
            } else {
                field1350[++Statics.field308 - 1] = var4.field1301;
                field1350[++Statics.field308 - 1] = var4.field1299;
                field1356[++Statics.field658 - 1] = var4.field1306;
                field1350[++Statics.field308 - 1] = var4.field1294;
                field1350[++Statics.field308 - 1] = var4.field1303;
                field1356[++Statics.field658 - 1] = var4.field1302;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var6 = field1350[--Statics.field308];
            class81 var7 = null;
            for (int var8 = 0; var8 < class81.field1297; var8++) {
                if (Statics.field1296[var8].field1301 == var6) {
                    var7 = Statics.field1296[var8];
                    break;
                }
            }
            if (var7 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
                field1350[++Statics.field308 - 1] = 0;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
            } else {
                field1350[++Statics.field308 - 1] = var7.field1301;
                field1350[++Statics.field308 - 1] = var7.field1299;
                field1356[++Statics.field658 - 1] = var7.field1306;
                field1350[++Statics.field308 - 1] = var7.field1294;
                field1350[++Statics.field308 - 1] = var7.field1303;
                field1356[++Statics.field658 - 1] = var7.field1302;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field308 -= 4;
            int var9 = field1350[Statics.field308];
            boolean var10 = field1350[Statics.field308 + 1] == 1;
            int var11 = field1350[Statics.field308 + 2];
            boolean var12 = field1350[Statics.field308 + 3] == 1;
            if (Statics.field1296 != null) {
                class81.method960(0, Statics.field1296.length - 1, var9, var10, var11, var12);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var13 = field1350[--Statics.field308];
            if (var13 >= 0 && var13 < class81.field1297) {
                class81 var14 = Statics.field1296[var13];
                field1350[++Statics.field308 - 1] = var14.field1301;
                field1350[++Statics.field308 - 1] = var14.field1299;
                field1356[++Statics.field658 - 1] = var14.field1306;
                field1350[++Statics.field308 - 1] = var14.field1294;
                field1350[++Statics.field308 - 1] = var14.field1303;
                field1356[++Statics.field658 - 1] = var14.field1302;
            } else {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
                field1350[++Statics.field308 - 1] = 0;
                field1350[++Statics.field308 - 1] = 0;
                field1356[++Statics.field658 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1169 = field1350[--Statics.field308] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field308 -= 2;
            int var15 = field1350[Statics.field308];
            int var16 = field1350[Statics.field308 + 1];
            class252 var17 = class252.method1003(var16);
            if (var17.method4067()) {
                field1356[++Statics.field658 - 1] = class259.method3097(var15).method4277(var16, var17.field3362);
            } else {
                field1350[++Statics.field308 - 1] = class259.method3097(var15).method4272(var16, var17.field3367);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field308 -= 2;
            int var18 = field1350[Statics.field308];
            int var19 = field1350[Statics.field308 + 1];
            class252 var20 = class252.method1003(var19);
            if (var20.method4067()) {
                field1356[++Statics.field658 - 1] = class256.method4379(var18).method4197(var19, var20.field3362);
            } else {
                field1350[++Statics.field308 - 1] = class256.method4379(var18).method4155(var19, var20.field3367);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field308 -= 2;
            int var21 = field1350[Statics.field308];
            int var22 = field1350[Statics.field308 + 1];
            class252 var23 = class252.method1003(var22);
            if (var23.method4067()) {
                field1356[++Statics.field658 - 1] = Statics.method461(var21).method4214(var22, var23.field3362);
            } else {
                field1350[++Statics.field308 - 1] = Statics.method461(var21).method4217(var22, var23.field3367);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field308 -= 2;
            int var24 = field1350[Statics.field308];
            int var25 = field1350[Statics.field308 + 1];
            class252 var26 = class252.method1003(var25);
            if (var26.method4067()) {
                String[] var27 = field1356;
                int var28 = ++Statics.field658 - 1;
                class253 var29 = (class253) class253.field3375.method3248((long) var24);
                class253 var30;
                if (var29 == null) {
                    byte[] var31 = Statics.field3371.method3760(34, var24);
                    class253 var32 = new class253();
                    if (var31 != null) {
                        var32.method4075(new class174(var31));
                    }
                    var32.method4078();
                    class253.field3375.method3250(var32, (long) var24);
                    var30 = var32;
                } else {
                    var30 = var29;
                }
                var27[var28] = var30.method4084(var25, var26.field3362);
            } else {
                int[] var33 = field1350;
                int var34 = ++Statics.field308 - 1;
                class253 var35 = (class253) class253.field3375.method3248((long) var24);
                class253 var36;
                if (var35 == null) {
                    byte[] var37 = Statics.field3371.method3760(34, var24);
                    class253 var38 = new class253();
                    if (var37 != null) {
                        var38.method4075(new class174(var37));
                    }
                    var38.method4078();
                    class253.field3375.method3250(var38, (long) var24);
                    var36 = var38;
                } else {
                    var36 = var35;
                }
                var33[var34] = var36.method4082(var25, var26.field3367);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.l(ILcr;ZI)I")
    public static int method2659(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field267;
            int var4 = (Statics.field3209.field1243 >> 7) + Statics.field414;
            int var5 = (Statics.field3209.field1229 >> 7) + Statics.field2117;
            client.method927().method4831(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1350[--Statics.field308];
            String var7 = "";
            class33 var8 = client.method927().method4847(var6);
            if (var8 != null) {
                var7 = var8.method242();
            }
            field1356[++Statics.field658 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1350[--Statics.field308];
            client.method927().method4832(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1350[++Statics.field308 - 1] = client.method927().method4844();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1350[--Statics.field308];
            client.method927().method4841(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1350[++Statics.field308 - 1] = client.method927().method4846() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class213 var11 = new class213(field1350[--Statics.field308]);
            client.method927().method4848(var11.field2595, var11.field2597);
            return 1;
        } else if (arg0 == 6607) {
            class213 var12 = new class213(field1350[--Statics.field308]);
            client.method927().method4849(var12.field2595, var12.field2597);
            return 1;
        } else if (arg0 == 6608) {
            class213 var13 = new class213(field1350[--Statics.field308]);
            client.method927().method4929(var13.field2596, var13.field2595, var13.field2597);
            return 1;
        } else if (arg0 == 6609) {
            class213 var14 = new class213(field1350[--Statics.field308]);
            client.method927().method4851(var14.field2596, var14.field2595, var14.field2597);
            return 1;
        } else if (arg0 == 6610) {
            field1350[++Statics.field308 - 1] = client.method927().method4852();
            field1350[++Statics.field308 - 1] = client.method927().method4853();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1350[--Statics.field308];
            class33 var16 = client.method927().method4847(var15);
            if (var16 == null) {
                field1350[++Statics.field308 - 1] = 0;
            } else {
                field1350[++Statics.field308 - 1] = var16.method303().method3594();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1350[--Statics.field308];
            class33 var18 = client.method927().method4847(var17);
            if (var18 == null) {
                field1350[++Statics.field308 - 1] = 0;
                field1350[++Statics.field308 - 1] = 0;
            } else {
                field1350[++Statics.field308 - 1] = (var18.method246() - var18.method245() + 1) * 64;
                field1350[++Statics.field308 - 1] = (var18.method244() - var18.method294() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1350[--Statics.field308];
            class33 var20 = client.method927().method4847(var19);
            if (var20 == null) {
                field1350[++Statics.field308 - 1] = 0;
                field1350[++Statics.field308 - 1] = 0;
                field1350[++Statics.field308 - 1] = 0;
                field1350[++Statics.field308 - 1] = 0;
            } else {
                field1350[++Statics.field308 - 1] = var20.method245() * 64;
                field1350[++Statics.field308 - 1] = var20.method294() * 64;
                field1350[++Statics.field308 - 1] = var20.method246() * 64 + 64 - 1;
                field1350[++Statics.field308 - 1] = var20.method244() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1350[--Statics.field308];
            class33 var22 = client.method927().method4847(var21);
            if (var22 == null) {
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var22.method232();
            }
            return 1;
        } else if (arg0 == 6615) {
            class213 var23 = client.method927().method4962();
            if (var23 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var23.field2595;
                field1350[++Statics.field308 - 1] = var23.field2597;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1350[++Statics.field308 - 1] = client.method927().method4833();
            return 1;
        } else if (arg0 == 6617) {
            class213 var24 = new class213(field1350[--Statics.field308]);
            class33 var25 = client.method927().method4834();
            if (var25 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method236(var24.field2596, var24.field2595, var24.field2597);
            if (var26 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var26[0];
                field1350[++Statics.field308 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class213 var27 = new class213(field1350[--Statics.field308]);
            class33 var28 = client.method927().method4834();
            if (var28 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = -1;
                return 1;
            }
            class213 var29 = var28.method247(var27.field2595, var27.field2597);
            if (var29 == null) {
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var29.method3594();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field308 -= 2;
            int var30 = field1350[Statics.field308];
            class213 var31 = new class213(field1350[Statics.field308 + 1]);
            class33 var32 = client.method927().method4847(var30);
            int var33 = Statics.field3209.field889;
            int var34 = (Statics.field3209.field1243 >> 7) + Statics.field414;
            int var35 = (Statics.field3209.field1229 >> 7) + Statics.field2117;
            class213 var36 = new class213(var33, var34, var35);
            client.method927().method4837(var32, var36, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field308 -= 2;
            int var37 = field1350[Statics.field308];
            class213 var38 = new class213(field1350[Statics.field308 + 1]);
            class33 var39 = client.method927().method4847(var37);
            int var40 = Statics.field3209.field889;
            int var41 = (Statics.field3209.field1243 >> 7) + Statics.field414;
            int var42 = (Statics.field3209.field1229 >> 7) + Statics.field2117;
            class213 var43 = new class213(var40, var41, var42);
            client.method927().method4837(var39, var43, var38, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field308 -= 2;
            int var44 = field1350[Statics.field308];
            class213 var45 = new class213(field1350[Statics.field308 + 1]);
            class33 var46 = client.method927().method4847(var44);
            if (var46 == null) {
                field1350[++Statics.field308 - 1] = 0;
                return 1;
            } else {
                field1350[++Statics.field308 - 1] = var46.method261(var45.field2596, var45.field2595, var45.field2597) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1350[++Statics.field308 - 1] = client.method927().method4855();
            field1350[++Statics.field308 - 1] = client.method927().method4856();
            return 1;
        } else if (arg0 == 6623) {
            class213 var47 = new class213(field1350[--Statics.field308]);
            class33 var48 = client.method927().method4830(var47.field2596, var47.field2595, var47.field2597);
            if (var48 == null) {
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var48.method239();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method927().method4857(field1350[--Statics.field308]);
            return 1;
        } else if (arg0 == 6625) {
            client.method927().method4826();
            return 1;
        } else if (arg0 == 6626) {
            client.method927().method4955(field1350[--Statics.field308]);
            return 1;
        } else if (arg0 == 6627) {
            client.method927().method4860();
            return 1;
        } else if (arg0 == 6628) {
            boolean var49 = field1350[--Statics.field308] == 1;
            client.method927().method4978(var49);
            return 1;
        } else if (arg0 == 6629) {
            int var50 = field1350[--Statics.field308];
            client.method927().method4862(var50);
            return 1;
        } else if (arg0 == 6630) {
            int var51 = field1350[--Statics.field308];
            client.method927().method4863(var51);
            return 1;
        } else if (arg0 == 6631) {
            client.method927().method5019();
            return 1;
        } else if (arg0 == 6632) {
            boolean var52 = field1350[--Statics.field308] == 1;
            client.method927().method4985(var52);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field308 -= 2;
            int var53 = field1350[Statics.field308];
            boolean var54 = field1350[Statics.field308 + 1] == 1;
            client.method927().method4858(var53, var54);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field308 -= 2;
            int var55 = field1350[Statics.field308];
            boolean var56 = field1350[Statics.field308 + 1] == 1;
            client.method927().method4994(var55, var56);
            return 1;
        } else if (arg0 == 6635) {
            field1350[++Statics.field308 - 1] = client.method927().method4868() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var57 = field1350[--Statics.field308];
            field1350[++Statics.field308 - 1] = client.method927().method4854(var57) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var58 = field1350[--Statics.field308];
            field1350[++Statics.field308 - 1] = client.method927().method4870(var58) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field308 -= 2;
            int var59 = field1350[Statics.field308];
            class213 var60 = new class213(field1350[Statics.field308 + 1]);
            class213 var61 = client.method927().method4873(var59, var60);
            if (var61 == null) {
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var61.method3594();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var62 = client.method927().method4875();
            if (var62 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var62.field535;
                field1350[++Statics.field308 - 1] = var62.field532.method3594();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var63 = client.method927().method4876();
            if (var63 == null) {
                field1350[++Statics.field308 - 1] = -1;
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var63.field535;
                field1350[++Statics.field308 - 1] = var63.field532.method3594();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var64 = field1350[--Statics.field308];
            class243 var65 = Statics.field477[var64];
            if (var65.field3270 == null) {
                field1356[++Statics.field658 - 1] = "";
            } else {
                field1356[++Statics.field658 - 1] = var65.field3270;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var66 = field1350[--Statics.field308];
            class243 var67 = Statics.field477[var66];
            field1350[++Statics.field308 - 1] = var67.field3269;
            return 1;
        } else if (arg0 == 6695) {
            int var68 = field1350[--Statics.field308];
            class243 var69 = Statics.field477[var68];
            if (var69 == null) {
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var69.field3265;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var70 = field1350[--Statics.field308];
            class243 var71 = Statics.field477[var70];
            if (var71 == null) {
                field1350[++Statics.field308 - 1] = -1;
            } else {
                field1350[++Statics.field308 - 1] = var71.field3268;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1350[++Statics.field308 - 1] = Statics.field3659.field608;
            return 1;
        } else if (arg0 == 6698) {
            field1350[++Statics.field308 - 1] = Statics.field3659.field606.method3594();
            return 1;
        } else if (arg0 == 6699) {
            field1350[++Statics.field308 - 1] = Statics.field3659.field607.method3594();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("x.x(II)V")
    public static void method137(int arg0) {
        if (arg0 == -1 || !class217.method1895(arg0)) {
            return;
        }
        class217[] var1 = Statics.field515[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2626 != null) {
                class70 var4 = new class70();
                var4.field832 = var3;
                var4.field836 = var3.field2626;
                method9(var4, 2000000);
            }
        }
    }
}
