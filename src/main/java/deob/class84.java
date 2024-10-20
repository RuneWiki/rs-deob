package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ck")
public class class84 {

    @ObfuscatedName("ck.s")
    public static int[] field1359 = new int[5];

    @ObfuscatedName("ck.r")
    public static int[][] field1364 = new int[5][5000];

    @ObfuscatedName("ck.v")
    public static int[] field1361 = new int[1000];

    @ObfuscatedName("ck.j")
    public static String[] field1362 = new String[1000];

    @ObfuscatedName("ck.e")
    public static int field1363 = 0;

    @ObfuscatedName("ck.o")
    public static class63[] field1355 = new class63[50];

    @ObfuscatedName("ck.c")
    public static Calendar field1366 = Calendar.getInstance();

    @ObfuscatedName("ck.m")
    public static final String[] field1360 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ck.f")
    public static int field1368 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.i(Lbu;I)V")
    public static void method68(class70 arg0) {
        method230(arg0, 200000);
    }

    @ObfuscatedName("au.w(Lbu;II)V")
    public static void method230(class70 arg0, int arg1) {
        Object[] var2 = arg0.field858;
        class220 var3 = arg0.field859;
        boolean var4 = class220.field2802 == var3 || class220.field2796 == var3 || class220.field2797 == var3 || class220.field2798 == var3 || class220.field2799 == var3 || class220.field2800 == var3 || class220.field2801 == var3 || class220.field2795 == var3;
        class100 var6;
        if (var4) {
            Statics.field450 = (class48) var2[0];
            class243 var5 = Statics.field3304[Statics.field450.field634];
            var6 = class100.method1109(arg0.field859, var5.field3298, var5.field3308);
        } else {
            int var7 = (Integer) var2[0];
            class100 var8 = (class100) class100.field1552.method3235((long) var7);
            class100 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field2353.method3768(var7, 0);
                if (var10 == null) {
                    var9 = null;
                } else {
                    class100 var11 = class100.method643(var10);
                    class100.field1552.method3234(var11, (long) var7);
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
        Statics.field627 = 0;
        Statics.field667 = 0;
        int var12 = -1;
        int[] var13 = var6.field1561;
        int[] var14 = var6.field1553;
        byte var15 = -1;
        field1363 = 0;
        try {
            Statics.field1367 = new int[var6.field1555];
            int var16 = 0;
            Statics.field1358 = new String[var6.field1556];
            int var17 = 0;
            for (int var18 = 1; var18 < var2.length; var18++) {
                if (var2[var18] instanceof Integer) {
                    int var19 = (Integer) var2[var18];
                    if (var19 == -2147483647) {
                        var19 = arg0.field851;
                    }
                    if (var19 == -2147483646) {
                        var19 = arg0.field854;
                    }
                    if (var19 == -2147483645) {
                        var19 = arg0.field850 == null ? -1 : arg0.field850.field2655;
                    }
                    if (var19 == -2147483644) {
                        var19 = arg0.field853;
                    }
                    if (var19 == -2147483643) {
                        var19 = arg0.field850 == null ? -1 : arg0.field850.field2656;
                    }
                    if (var19 == -2147483642) {
                        var19 = arg0.field860 == null ? -1 : arg0.field860.field2655;
                    }
                    if (var19 == -2147483641) {
                        var19 = arg0.field860 == null ? -1 : arg0.field860.field2656;
                    }
                    if (var19 == -2147483640) {
                        var19 = arg0.field855;
                    }
                    if (var19 == -2147483639) {
                        var19 = arg0.field856;
                    }
                    Statics.field1367[var16++] = var19;
                } else if (var2[var18] instanceof String) {
                    String var20 = (String) var2[var18];
                    if (var20.equals("event_opbase")) {
                        var20 = arg0.field857;
                    }
                    Statics.field1358[var17++] = var20;
                }
            }
            int var21 = 0;
            field1368 = arg0.field852;
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
                                                                                                                label2058: while (true) {
                                                                                                                    var21++;
                                                                                                                    if (var21 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var12++;
                                                                                                                    int var377 = var13[var12];
                                                                                                                    if (var377 >= 100) {
                                                                                                                        boolean var63;
                                                                                                                        if (var6.field1553[var12] == 1) {
                                                                                                                            var63 = true;
                                                                                                                        } else {
                                                                                                                            var63 = false;
                                                                                                                        }
                                                                                                                        int var64;
                                                                                                                        if (var377 < 1000) {
                                                                                                                            var64 = method308(var377, var6, var63);
                                                                                                                        } else if (var377 < 1100) {
                                                                                                                            var64 = method2851(var377, var6, var63);
                                                                                                                        } else if (var377 < 1200) {
                                                                                                                            var64 = method4372(var377, var6, var63);
                                                                                                                        } else if (var377 < 1300) {
                                                                                                                            var64 = method3133(var377, var6, var63);
                                                                                                                        } else if (var377 < 1400) {
                                                                                                                            var64 = method498(var377, var6, var63);
                                                                                                                        } else if (var377 < 1500) {
                                                                                                                            var64 = method1902(var377, var6, var63);
                                                                                                                        } else if (var377 < 1600) {
                                                                                                                            class217 var68 = var63 ? Statics.field1365 : Statics.field767;
                                                                                                                            byte var69;
                                                                                                                            if (var377 == 1500) {
                                                                                                                                field1361[++Statics.field627 - 1] = var68.field2668;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var377 == 1501) {
                                                                                                                                field1361[++Statics.field627 - 1] = var68.field2669;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var377 == 1502) {
                                                                                                                                field1361[++Statics.field627 - 1] = var68.field2750;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var377 == 1503) {
                                                                                                                                field1361[++Statics.field627 - 1] = var68.field2671;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var377 == 1504) {
                                                                                                                                field1361[++Statics.field627 - 1] = var68.field2675 ? 1 : 0;
                                                                                                                                var69 = 1;
                                                                                                                            } else if (var377 == 1505) {
                                                                                                                                field1361[++Statics.field627 - 1] = var68.field2674;
                                                                                                                                var69 = 1;
                                                                                                                            } else {
                                                                                                                                var69 = 2;
                                                                                                                            }
                                                                                                                            var64 = var69;
                                                                                                                        } else if (var377 < 1700) {
                                                                                                                            var64 = method992(var377, var6, var63);
                                                                                                                        } else if (var377 < 1800) {
                                                                                                                            class217 var73 = var63 ? Statics.field1365 : Statics.field767;
                                                                                                                            byte var74;
                                                                                                                            if (var377 == 1700) {
                                                                                                                                field1361[++Statics.field627 - 1] = var73.field2775;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var377 == 1701) {
                                                                                                                                if (var73.field2775 == -1) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var73.field2713;
                                                                                                                                }
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var377 == 1702) {
                                                                                                                                field1361[++Statics.field627 - 1] = var73.field2656;
                                                                                                                                var74 = 1;
                                                                                                                            } else {
                                                                                                                                var74 = 2;
                                                                                                                            }
                                                                                                                            var64 = var74;
                                                                                                                        } else if (var377 < 1900) {
                                                                                                                            var64 = method2142(var377, var6, var63);
                                                                                                                        } else if (var377 < 2000) {
                                                                                                                            int var75 = var377;
                                                                                                                            class217 var76;
                                                                                                                            if (var377 >= 2000) {
                                                                                                                                var75 = var377 - 1000;
                                                                                                                                var76 = class217.method3122(field1361[--Statics.field627]);
                                                                                                                            } else {
                                                                                                                                var76 = var63 ? Statics.field1365 : Statics.field767;
                                                                                                                            }
                                                                                                                            byte var77;
                                                                                                                            if (var75 == 1927) {
                                                                                                                                if (field1368 >= 10) {
                                                                                                                                    throw new RuntimeException();
                                                                                                                                }
                                                                                                                                if (var76.field2764 == null) {
                                                                                                                                    var77 = 0;
                                                                                                                                } else {
                                                                                                                                    class70 var78 = new class70();
                                                                                                                                    var78.field850 = var76;
                                                                                                                                    var78.field858 = var76.field2764;
                                                                                                                                    var78.field852 = field1368 + 1;
                                                                                                                                    client.field1036.method3322(var78);
                                                                                                                                    var77 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var77 = 2;
                                                                                                                            }
                                                                                                                            var64 = var77;
                                                                                                                        } else if (var377 < 2100) {
                                                                                                                            var64 = method2851(var377, var6, var63);
                                                                                                                        } else if (var377 < 2200) {
                                                                                                                            var64 = method4372(var377, var6, var63);
                                                                                                                        } else if (var377 < 2300) {
                                                                                                                            var64 = method3133(var377, var6, var63);
                                                                                                                        } else if (var377 < 2400) {
                                                                                                                            var64 = method498(var377, var6, var63);
                                                                                                                        } else if (var377 < 2500) {
                                                                                                                            var64 = method1902(var377, var6, var63);
                                                                                                                        } else if (var377 < 2600) {
                                                                                                                            var64 = method3561(var377, var6, var63);
                                                                                                                        } else if (var377 < 2700) {
                                                                                                                            var64 = method1032(var377, var6, var63);
                                                                                                                        } else if (var377 < 2800) {
                                                                                                                            byte var80;
                                                                                                                            if (var377 == 2700) {
                                                                                                                                class217 var79 = class217.method3122(field1361[--Statics.field627]);
                                                                                                                                field1361[++Statics.field627 - 1] = var79.field2775;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var377 == 2701) {
                                                                                                                                class217 var81 = class217.method3122(field1361[--Statics.field627]);
                                                                                                                                if (var81.field2775 == -1) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var81.field2713;
                                                                                                                                }
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var377 == 2702) {
                                                                                                                                int var82 = field1361[--Statics.field627];
                                                                                                                                class69 var83 = (class69) client.field1089.method3249((long) var82);
                                                                                                                                if (var83 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = 1;
                                                                                                                                }
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var377 == 2706) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1088;
                                                                                                                                var80 = 1;
                                                                                                                            } else {
                                                                                                                                var80 = 2;
                                                                                                                            }
                                                                                                                            var64 = var80;
                                                                                                                        } else if (var377 < 2900) {
                                                                                                                            class217 var84 = class217.method3122(field1361[--Statics.field627]);
                                                                                                                            byte var89;
                                                                                                                            if (var377 == 2800) {
                                                                                                                                int[] var85 = field1361;
                                                                                                                                int var86 = ++Statics.field627 - 1;
                                                                                                                                int var87 = client.method191(var84);
                                                                                                                                int var88 = var87 >> 11 & 0x3F;
                                                                                                                                var85[var86] = var88;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var377 == 2801) {
                                                                                                                                int var90 = field1361[--Statics.field627];
                                                                                                                                int var378 = var90 - 1;
                                                                                                                                if (var84.field2729 == null || var378 >= var84.field2729.length || var84.field2729[var378] == null) {
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1362[++Statics.field667 - 1] = var84.field2729[var378];
                                                                                                                                }
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var377 == 2802) {
                                                                                                                                if (var84.field2728 == null) {
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1362[++Statics.field667 - 1] = var84.field2728;
                                                                                                                                }
                                                                                                                                var89 = 1;
                                                                                                                            } else {
                                                                                                                                var89 = 2;
                                                                                                                            }
                                                                                                                            var64 = var89;
                                                                                                                        } else if (var377 < 3000) {
                                                                                                                            int var91 = var377;
                                                                                                                            class217 var92;
                                                                                                                            if (var377 >= 2000) {
                                                                                                                                var91 = var377 - 1000;
                                                                                                                                var92 = class217.method3122(field1361[--Statics.field627]);
                                                                                                                            } else {
                                                                                                                                var92 = var63 ? Statics.field1365 : Statics.field767;
                                                                                                                            }
                                                                                                                            byte var93;
                                                                                                                            if (var91 == 1927) {
                                                                                                                                if (field1368 >= 10) {
                                                                                                                                    throw new RuntimeException();
                                                                                                                                }
                                                                                                                                if (var92.field2764 == null) {
                                                                                                                                    var93 = 0;
                                                                                                                                } else {
                                                                                                                                    class70 var94 = new class70();
                                                                                                                                    var94.field850 = var92;
                                                                                                                                    var94.field858 = var92.field2764;
                                                                                                                                    var94.field852 = field1368 + 1;
                                                                                                                                    client.field1036.method3322(var94);
                                                                                                                                    var93 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var93 = 2;
                                                                                                                            }
                                                                                                                            var64 = var93;
                                                                                                                        } else if (var377 < 3200) {
                                                                                                                            byte var96;
                                                                                                                            if (var377 == 3100) {
                                                                                                                                String var95 = field1362[--Statics.field667];
                                                                                                                                class99.method2665(0, "", var95);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3101) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                client.method701(Statics.field803, field1361[Statics.field627], field1361[Statics.field627 + 1]);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3103) {
                                                                                                                                client.method1918();
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3104) {
                                                                                                                                String var97 = field1362[--Statics.field667];
                                                                                                                                int var98 = 0;
                                                                                                                                boolean var99 = class271.method686(var97, 10, true);
                                                                                                                                if (var99) {
                                                                                                                                    var98 = class271.method994(var97);
                                                                                                                                }
                                                                                                                                client.field969.method3116(205);
                                                                                                                                client.field969.method2868(var98);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3105) {
                                                                                                                                String var100 = field1362[--Statics.field667];
                                                                                                                                client.field969.method3116(43);
                                                                                                                                client.field969.method2865(var100.length() + 1);
                                                                                                                                client.field969.method2871(var100);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3106) {
                                                                                                                                String var101 = field1362[--Statics.field667];
                                                                                                                                client.field969.method3116(107);
                                                                                                                                client.field969.method2865(var101.length() + 1);
                                                                                                                                client.field969.method2871(var101);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3107) {
                                                                                                                                int var102 = field1361[--Statics.field627];
                                                                                                                                String var103 = field1362[--Statics.field667];
                                                                                                                                client.method942(var102, var103);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3108) {
                                                                                                                                Statics.field627 -= 3;
                                                                                                                                int var104 = field1361[Statics.field627];
                                                                                                                                int var105 = field1361[Statics.field627 + 1];
                                                                                                                                int var106 = field1361[Statics.field627 + 2];
                                                                                                                                class217 var107 = class217.method3122(var106);
                                                                                                                                client.method2632(var107, var104, var105);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3109) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var108 = field1361[Statics.field627];
                                                                                                                                int var109 = field1361[Statics.field627 + 1];
                                                                                                                                class217 var110 = var63 ? Statics.field1365 : Statics.field767;
                                                                                                                                client.method2632(var110, var108, var109);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3110) {
                                                                                                                                Statics.field500 = field1361[--Statics.field627] == 1;
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3111) {
                                                                                                                                field1361[++Statics.field627 - 1] = Statics.field248.field1336 ? 1 : 0;
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3112) {
                                                                                                                                Statics.field248.field1336 = field1361[--Statics.field627] == 1;
                                                                                                                                Statics.method4();
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3113) {
                                                                                                                                String var111 = field1362[--Statics.field667];
                                                                                                                                boolean var112 = field1361[--Statics.field627] == 1;
                                                                                                                                class57.method1066(var111, var112, false);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3115) {
                                                                                                                                int var113 = field1361[--Statics.field627];
                                                                                                                                client.field969.method3116(55);
                                                                                                                                client.field969.method2990(var113);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var377 == 3116) {
                                                                                                                                int var114 = field1361[--Statics.field627];
                                                                                                                                Statics.field667 -= 2;
                                                                                                                                String var115 = field1362[Statics.field667];
                                                                                                                                String var116 = field1362[Statics.field667 + 1];
                                                                                                                                if (var115.length() > 500) {
                                                                                                                                    var96 = 1;
                                                                                                                                } else if (var116.length() > 500) {
                                                                                                                                    var96 = 1;
                                                                                                                                } else {
                                                                                                                                    client.field969.method3116(102);
                                                                                                                                    client.field969.method2990(1 + class174.method4370(var115) + class174.method4370(var116));
                                                                                                                                    client.field969.method2871(var116);
                                                                                                                                    client.field969.method2871(var115);
                                                                                                                                    client.field969.method2865(var114);
                                                                                                                                    var96 = 1;
                                                                                                                                }
                                                                                                                            } else if (var377 == 3117) {
                                                                                                                                client.field1076 = field1361[--Statics.field627] == 1;
                                                                                                                                var96 = 1;
                                                                                                                            } else {
                                                                                                                                var96 = 2;
                                                                                                                            }
                                                                                                                            var64 = var96;
                                                                                                                        } else if (var377 < 3300) {
                                                                                                                            byte var117;
                                                                                                                            if (var377 == 3200) {
                                                                                                                                Statics.field627 -= 3;
                                                                                                                                client.method319(field1361[Statics.field627], field1361[Statics.field627 + 1], field1361[Statics.field627 + 2]);
                                                                                                                                var117 = 1;
                                                                                                                            } else if (var377 == 3201) {
                                                                                                                                client.method4473(field1361[--Statics.field627]);
                                                                                                                                var117 = 1;
                                                                                                                            } else if (var377 == 3202) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var118 = field1361[Statics.field627];
                                                                                                                                int var119 = field1361[Statics.field627 + 1];
                                                                                                                                if (client.field1163 != 0 && var118 != -1) {
                                                                                                                                    class204.method219(Statics.field311, var118, 0, client.field1163, false);
                                                                                                                                    client.field1015 = true;
                                                                                                                                }
                                                                                                                                var117 = 1;
                                                                                                                            } else {
                                                                                                                                var117 = 2;
                                                                                                                            }
                                                                                                                            var64 = var117;
                                                                                                                        } else if (var377 < 3400) {
                                                                                                                            byte var120;
                                                                                                                            if (var377 == 3300) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field936;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3301) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var121 = field1361[Statics.field627];
                                                                                                                                int var122 = field1361[Statics.field627 + 1];
                                                                                                                                int[] var123 = field1361;
                                                                                                                                int var124 = ++Statics.field627 - 1;
                                                                                                                                class64 var125 = (class64) class64.field806.method3249((long) var121);
                                                                                                                                int var126;
                                                                                                                                if (var125 == null) {
                                                                                                                                    var126 = -1;
                                                                                                                                } else if (var122 >= 0 && var122 < var125.field804.length) {
                                                                                                                                    var126 = var125.field804[var122];
                                                                                                                                } else {
                                                                                                                                    var126 = -1;
                                                                                                                                }
                                                                                                                                var123[var124] = var126;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3302) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var127 = field1361[Statics.field627];
                                                                                                                                int var128 = field1361[Statics.field627 + 1];
                                                                                                                                int[] var129 = field1361;
                                                                                                                                int var130 = ++Statics.field627 - 1;
                                                                                                                                class64 var131 = (class64) class64.field806.method3249((long) var127);
                                                                                                                                int var132;
                                                                                                                                if (var131 == null) {
                                                                                                                                    var132 = 0;
                                                                                                                                } else if (var128 >= 0 && var128 < var131.field805.length) {
                                                                                                                                    var132 = var131.field805[var128];
                                                                                                                                } else {
                                                                                                                                    var132 = 0;
                                                                                                                                }
                                                                                                                                var129[var130] = var132;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3303) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var133 = field1361[Statics.field627];
                                                                                                                                int var134 = field1361[Statics.field627 + 1];
                                                                                                                                field1361[++Statics.field627 - 1] = class64.method18(var133, var134);
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3304) {
                                                                                                                                int var135 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = class241.method3587(var135).field3288;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3305) {
                                                                                                                                int var136 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1202[var136];
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3306) {
                                                                                                                                int var137 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.field973[var137];
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3307) {
                                                                                                                                int var138 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1078[var138];
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3308) {
                                                                                                                                int var139 = Statics.field2137;
                                                                                                                                int var140 = (Statics.field803.field1273 >> 7) + Statics.field669;
                                                                                                                                int var141 = (Statics.field803.field1240 >> 7) + Statics.field3674;
                                                                                                                                field1361[++Statics.field627 - 1] = (var139 << 28) + (var140 << 14) + var141;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3309) {
                                                                                                                                int var142 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = var142 >> 14 & 0x3FFF;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3310) {
                                                                                                                                int var143 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = var143 >> 28;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3311) {
                                                                                                                                int var144 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = var144 & 0x3FFF;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3312) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field930 ? 1 : 0;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3313) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var145 = field1361[Statics.field627] + 32768;
                                                                                                                                int var146 = field1361[Statics.field627 + 1];
                                                                                                                                int[] var147 = field1361;
                                                                                                                                int var148 = ++Statics.field627 - 1;
                                                                                                                                class64 var149 = (class64) class64.field806.method3249((long) var145);
                                                                                                                                int var150;
                                                                                                                                if (var149 == null) {
                                                                                                                                    var150 = -1;
                                                                                                                                } else if (var146 >= 0 && var146 < var149.field804.length) {
                                                                                                                                    var150 = var149.field804[var146];
                                                                                                                                } else {
                                                                                                                                    var150 = -1;
                                                                                                                                }
                                                                                                                                var147[var148] = var150;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3314) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var151 = field1361[Statics.field627] + 32768;
                                                                                                                                int var152 = field1361[Statics.field627 + 1];
                                                                                                                                int[] var153 = field1361;
                                                                                                                                int var154 = ++Statics.field627 - 1;
                                                                                                                                class64 var155 = (class64) class64.field806.method3249((long) var151);
                                                                                                                                int var156;
                                                                                                                                if (var155 == null) {
                                                                                                                                    var156 = 0;
                                                                                                                                } else if (var152 >= 0 && var152 < var155.field805.length) {
                                                                                                                                    var156 = var155.field805[var152];
                                                                                                                                } else {
                                                                                                                                    var156 = 0;
                                                                                                                                }
                                                                                                                                var153[var154] = var156;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3315) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var157 = field1361[Statics.field627] + 32768;
                                                                                                                                int var158 = field1361[Statics.field627 + 1];
                                                                                                                                field1361[++Statics.field627 - 1] = class64.method18(var157, var158);
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3316) {
                                                                                                                                if (client.field1095 >= 2) {
                                                                                                                                    field1361[++Statics.field627 - 1] = client.field1095;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3317) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field943;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3318) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1168;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3321) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1093;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3322) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1081;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3323) {
                                                                                                                                if (client.field1097) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3324) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field927;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var377 == 3325) {
                                                                                                                                Statics.field627 -= 4;
                                                                                                                                int var159 = field1361[Statics.field627];
                                                                                                                                int var160 = field1361[Statics.field627 + 1];
                                                                                                                                int var161 = field1361[Statics.field627 + 2];
                                                                                                                                int var162 = field1361[Statics.field627 + 3];
                                                                                                                                int var163 = (var160 << 14) + var159;
                                                                                                                                int var164 = (var161 << 28) + var163;
                                                                                                                                int var165 = var162 + var164;
                                                                                                                                field1361[++Statics.field627 - 1] = var165;
                                                                                                                                var120 = 1;
                                                                                                                            } else {
                                                                                                                                var120 = 2;
                                                                                                                            }
                                                                                                                            var64 = var120;
                                                                                                                        } else if (var377 < 3500) {
                                                                                                                            var64 = method1646(var377, var6, var63);
                                                                                                                        } else if (var377 < 3700) {
                                                                                                                            byte var166;
                                                                                                                            if (var377 == 3600) {
                                                                                                                                if (client.field1194 == 0) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -2;
                                                                                                                                } else if (client.field1194 == 1) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = client.field1193;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3601) {
                                                                                                                                int var167 = field1361[--Statics.field627];
                                                                                                                                if (client.field1194 == 2 && var167 < client.field1193) {
                                                                                                                                    field1362[++Statics.field667 - 1] = client.field1195[var167].field827;
                                                                                                                                    field1362[++Statics.field667 - 1] = client.field1195[var167].field822;
                                                                                                                                } else {
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3602) {
                                                                                                                                int var168 = field1361[--Statics.field627];
                                                                                                                                if (client.field1194 == 2 && var168 < client.field1193) {
                                                                                                                                    field1361[++Statics.field627 - 1] = client.field1195[var168].field823;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3603) {
                                                                                                                                int var169 = field1361[--Statics.field627];
                                                                                                                                if (client.field1194 == 2 && var169 < client.field1193) {
                                                                                                                                    field1361[++Statics.field627 - 1] = client.field1195[var169].field824;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3604) {
                                                                                                                                String var170 = field1362[--Statics.field667];
                                                                                                                                int var171 = field1361[--Statics.field627];
                                                                                                                                client.field969.method3116(136);
                                                                                                                                client.field969.method2865(class174.method4370(var170) + 1);
                                                                                                                                client.field969.method2871(var170);
                                                                                                                                client.field969.method2865(var171);
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3605) {
                                                                                                                                String var172 = field1362[--Statics.field667];
                                                                                                                                if (var172 != null) {
                                                                                                                                    if ((client.field1193 < 200 || client.field1050 == 1) && client.field1193 < 400) {
                                                                                                                                        String var173 = class268.method1070(var172, Statics.field929);
                                                                                                                                        if (var173 != null) {
                                                                                                                                            int var174 = 0;
                                                                                                                                            label1874: while (true) {
                                                                                                                                                if (var174 >= client.field1193) {
                                                                                                                                                    for (int var178 = 0; var178 < client.field1197; var178++) {
                                                                                                                                                        class71 var179 = client.field1119[var178];
                                                                                                                                                        String var180 = class268.method1070(var179.field864, Statics.field929);
                                                                                                                                                        if (var180 != null && var180.equals(var173)) {
                                                                                                                                                            class99.method2665(30, "", class226.field3032 + var172 + class226.field3033);
                                                                                                                                                            break label1874;
                                                                                                                                                        }
                                                                                                                                                        if (var179.field863 != null) {
                                                                                                                                                            String var181 = class268.method1070(var179.field863, Statics.field929);
                                                                                                                                                            if (var181 != null && var181.equals(var173)) {
                                                                                                                                                                class99.method2665(30, "", class226.field3032 + var172 + class226.field3033);
                                                                                                                                                                break label1874;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (class268.method1070(Statics.field803.field913, Statics.field929).equals(var173)) {
                                                                                                                                                        class99.method2665(30, "", class226.field2916);
                                                                                                                                                    } else {
                                                                                                                                                        client.field969.method3116(240);
                                                                                                                                                        client.field969.method2865(class174.method4370(var172));
                                                                                                                                                        client.field969.method2871(var172);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class66 var175 = client.field1195[var174];
                                                                                                                                                String var176 = class268.method1070(var175.field827, Statics.field929);
                                                                                                                                                if (var176 != null && var176.equals(var173)) {
                                                                                                                                                    class99.method2665(30, "", var172 + class226.field3027);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var175.field822 != null) {
                                                                                                                                                    String var177 = class268.method1070(var175.field822, Statics.field929);
                                                                                                                                                    if (var177 != null && var177.equals(var173)) {
                                                                                                                                                        class99.method2665(30, "", var172 + class226.field3027);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var174++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class99.method2665(30, "", class226.field3026);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3606) {
                                                                                                                                String var182 = field1362[--Statics.field667];
                                                                                                                                client.method1716(var182);
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3607) {
                                                                                                                                String var183 = field1362[--Statics.field667];
                                                                                                                                client.method2648(var183, false);
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3608) {
                                                                                                                                String var184 = field1362[--Statics.field667];
                                                                                                                                client.method680(var184);
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3609) {
                                                                                                                                String var185 = field1362[--Statics.field667];
                                                                                                                                class231[] var186 = class231.method3711();
                                                                                                                                for (int var187 = 0; var187 < var186.length; var187++) {
                                                                                                                                    class231 var188 = var186[var187];
                                                                                                                                    if (var188.field3187 != -1 && var185.startsWith(class89.method548(var188.field3187))) {
                                                                                                                                        var185 = var185.substring(6 + Integer.toString(var188.field3187).length());
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1361[++Statics.field627 - 1] = client.method159(var185, false) ? 1 : 0;
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3611) {
                                                                                                                                if (client.field1153 == null) {
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1362[++Statics.field667 - 1] = class269.method1554(client.field1153);
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3612) {
                                                                                                                                if (client.field1153 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = Statics.field417;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3613) {
                                                                                                                                int var189 = field1361[--Statics.field627];
                                                                                                                                if (client.field1153 == null || var189 >= Statics.field417) {
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1362[++Statics.field667 - 1] = Statics.field263[var189].field919;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3614) {
                                                                                                                                int var190 = field1361[--Statics.field627];
                                                                                                                                if (client.field1153 == null || var190 >= Statics.field417) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = Statics.field263[var190].field921;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3615) {
                                                                                                                                int var191 = field1361[--Statics.field627];
                                                                                                                                if (client.field1153 == null || var191 >= Statics.field417) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = Statics.field263[var191].field922;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3616) {
                                                                                                                                field1361[++Statics.field627 - 1] = Statics.field272;
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3617) {
                                                                                                                                String var192 = field1362[--Statics.field667];
                                                                                                                                client.method103(var192);
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3618) {
                                                                                                                                field1361[++Statics.field627 - 1] = Statics.field511;
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3619) {
                                                                                                                                String var193 = field1362[--Statics.field667];
                                                                                                                                client.method1643(var193);
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3620) {
                                                                                                                                client.method1415();
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3621) {
                                                                                                                                if (client.field1194 == 0) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = client.field1197;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3622) {
                                                                                                                                int var194 = field1361[--Statics.field627];
                                                                                                                                if (client.field1194 == 0 || var194 >= client.field1197) {
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1362[++Statics.field667 - 1] = client.field1119[var194].field864;
                                                                                                                                    field1362[++Statics.field667 - 1] = client.field1119[var194].field863;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3623) {
                                                                                                                                String var195 = field1362[--Statics.field667];
                                                                                                                                if (var195.startsWith(class89.method548(0)) || var195.startsWith(class89.method548(1))) {
                                                                                                                                    var195 = var195.substring(7);
                                                                                                                                }
                                                                                                                                field1361[++Statics.field627 - 1] = client.method3(var195) ? 1 : 0;
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3624) {
                                                                                                                                int var196 = field1361[--Statics.field627];
                                                                                                                                if (Statics.field263 == null || var196 >= Statics.field417 || !Statics.field263[var196].field919.equalsIgnoreCase(Statics.field803.field913)) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = 1;
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else if (var377 == 3625) {
                                                                                                                                if (client.field1154 == null) {
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1362[++Statics.field667 - 1] = class269.method1554(client.field1154);
                                                                                                                                }
                                                                                                                                var166 = 1;
                                                                                                                            } else {
                                                                                                                                var166 = 2;
                                                                                                                            }
                                                                                                                            var64 = var166;
                                                                                                                        } else if (var377 < 4000) {
                                                                                                                            byte var198;
                                                                                                                            if (var377 == 3903) {
                                                                                                                                int var197 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1145[var197].method83();
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3904) {
                                                                                                                                int var199 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1145[var199].field305;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3905) {
                                                                                                                                int var200 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1145[var200].field306;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3906) {
                                                                                                                                int var201 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1145[var201].field304;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3907) {
                                                                                                                                int var202 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1145[var202].field307;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3908) {
                                                                                                                                int var203 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1145[var203].field309;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3910) {
                                                                                                                                int var204 = field1361[--Statics.field627];
                                                                                                                                int var205 = client.field1145[var204].method79();
                                                                                                                                field1361[++Statics.field627 - 1] = var205 == 0 ? 1 : 0;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3911) {
                                                                                                                                int var206 = field1361[--Statics.field627];
                                                                                                                                int var207 = client.field1145[var206].method79();
                                                                                                                                field1361[++Statics.field627 - 1] = var207 == 2 ? 1 : 0;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3912) {
                                                                                                                                int var208 = field1361[--Statics.field627];
                                                                                                                                int var209 = client.field1145[var208].method79();
                                                                                                                                field1361[++Statics.field627 - 1] = var209 == 5 ? 1 : 0;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3913) {
                                                                                                                                int var210 = field1361[--Statics.field627];
                                                                                                                                int var211 = client.field1145[var210].method79();
                                                                                                                                field1361[++Statics.field627 - 1] = var211 == 1 ? 1 : 0;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3914) {
                                                                                                                                boolean var212 = field1361[--Statics.field627] == 1;
                                                                                                                                if (Statics.field834 != null) {
                                                                                                                                    Statics.field834.method53(class14.field280, var212);
                                                                                                                                }
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3915) {
                                                                                                                                boolean var213 = field1361[--Statics.field627] == 1;
                                                                                                                                if (Statics.field834 != null) {
                                                                                                                                    Statics.field834.method53(class14.field279, var213);
                                                                                                                                }
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3916) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                boolean var214 = field1361[Statics.field627] == 1;
                                                                                                                                boolean var215 = field1361[Statics.field627 + 1] == 1;
                                                                                                                                if (Statics.field834 != null) {
                                                                                                                                    Statics.field834.method53(new class96(var215), var214);
                                                                                                                                }
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3917) {
                                                                                                                                boolean var216 = field1361[--Statics.field627] == 1;
                                                                                                                                if (Statics.field834 != null) {
                                                                                                                                    Statics.field834.method53(class14.field278, var216);
                                                                                                                                }
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3918) {
                                                                                                                                boolean var217 = field1361[--Statics.field627] == 1;
                                                                                                                                if (Statics.field834 != null) {
                                                                                                                                    Statics.field834.method53(class14.field281, var217);
                                                                                                                                }
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3919) {
                                                                                                                                field1361[++Statics.field627 - 1] = Statics.field834 == null ? 0 : Statics.field834.field284.size();
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3920) {
                                                                                                                                int var218 = field1361[--Statics.field627];
                                                                                                                                class15 var219 = (class15) Statics.field834.field284.get(var218);
                                                                                                                                field1361[++Statics.field627 - 1] = var219.field292;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3921) {
                                                                                                                                int var220 = field1361[--Statics.field627];
                                                                                                                                class15 var221 = (class15) Statics.field834.field284.get(var220);
                                                                                                                                field1362[++Statics.field667 - 1] = var221.method58();
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3922) {
                                                                                                                                int var222 = field1361[--Statics.field627];
                                                                                                                                class15 var223 = (class15) Statics.field834.field284.get(var222);
                                                                                                                                field1362[++Statics.field667 - 1] = var223.method70();
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3923) {
                                                                                                                                int var224 = field1361[--Statics.field627];
                                                                                                                                class15 var225 = (class15) Statics.field834.field284.get(var224);
                                                                                                                                long var226 = class176.method2862() - Statics.field600 - var225.field287;
                                                                                                                                int var228 = (int) (var226 / 3600000L);
                                                                                                                                int var229 = (int) ((var226 - (long) (var228 * 3600000)) / 60000L);
                                                                                                                                int var230 = (int) ((var226 - (long) (var228 * 3600000) - (long) (var229 * 60000)) / 1000L);
                                                                                                                                String var231 = var228 + ":" + var229 / 10 + var229 % 10 + ":" + var230 / 10 + var230 % 10;
                                                                                                                                field1362[++Statics.field667 - 1] = var231;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3924) {
                                                                                                                                int var232 = field1361[--Statics.field627];
                                                                                                                                class15 var233 = (class15) Statics.field834.field284.get(var232);
                                                                                                                                field1361[++Statics.field627 - 1] = var233.field286.field304;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3925) {
                                                                                                                                int var234 = field1361[--Statics.field627];
                                                                                                                                class15 var235 = (class15) Statics.field834.field284.get(var234);
                                                                                                                                field1361[++Statics.field627 - 1] = var235.field286.field306;
                                                                                                                                var198 = 1;
                                                                                                                            } else if (var377 == 3926) {
                                                                                                                                int var236 = field1361[--Statics.field627];
                                                                                                                                class15 var237 = (class15) Statics.field834.field284.get(var236);
                                                                                                                                field1361[++Statics.field627 - 1] = var237.field286.field305;
                                                                                                                                var198 = 1;
                                                                                                                            } else {
                                                                                                                                var198 = 2;
                                                                                                                            }
                                                                                                                            var64 = var198;
                                                                                                                        } else if (var377 < 4100) {
                                                                                                                            var64 = method2647(var377, var6, var63);
                                                                                                                        } else if (var377 < 4200) {
                                                                                                                            var64 = method4371(var377, var6, var63);
                                                                                                                        } else if (var377 < 4300) {
                                                                                                                            var64 = method155(var377, var6, var63);
                                                                                                                        } else if (var377 < 5100) {
                                                                                                                            byte var238;
                                                                                                                            if (var377 == 5000) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1144;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5001) {
                                                                                                                                Statics.field627 -= 3;
                                                                                                                                client.field1144 = field1361[Statics.field627];
                                                                                                                                Statics.field788 = class277.method1028(field1361[Statics.field627 + 1]);
                                                                                                                                if (Statics.field788 == null) {
                                                                                                                                    Statics.field788 = class277.field3741;
                                                                                                                                }
                                                                                                                                client.field1033 = field1361[Statics.field627 + 2];
                                                                                                                                client.field969.method3116(180);
                                                                                                                                client.field969.method2865(client.field1144);
                                                                                                                                client.field969.method2865(Statics.field788.field3739);
                                                                                                                                client.field969.method2865(client.field1033);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5002) {
                                                                                                                                String var239 = field1362[--Statics.field667];
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var240 = field1361[Statics.field627];
                                                                                                                                int var241 = field1361[Statics.field627 + 1];
                                                                                                                                client.field969.method3116(153);
                                                                                                                                client.field969.method2865(class174.method4370(var239) + 2);
                                                                                                                                client.field969.method2871(var239);
                                                                                                                                client.field969.method2865(var240 - 1);
                                                                                                                                client.field969.method2865(var241);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5003) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var242 = field1361[Statics.field627];
                                                                                                                                int var243 = field1361[Statics.field627 + 1];
                                                                                                                                class73 var244 = class99.method681(var242, var243);
                                                                                                                                if (var244 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var244.field888;
                                                                                                                                    field1361[++Statics.field627 - 1] = var244.field889;
                                                                                                                                    field1362[++Statics.field667 - 1] = var244.field883 == null ? "" : var244.field883;
                                                                                                                                    field1362[++Statics.field667 - 1] = var244.field884 == null ? "" : var244.field884;
                                                                                                                                    field1362[++Statics.field667 - 1] = var244.field885 == null ? "" : var244.field885;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5004) {
                                                                                                                                int var245 = field1361[--Statics.field627];
                                                                                                                                class73 var246 = (class73) class99.field1547.method3197((long) var245);
                                                                                                                                if (var246 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var246.field882;
                                                                                                                                    field1361[++Statics.field627 - 1] = var246.field889;
                                                                                                                                    field1362[++Statics.field667 - 1] = var246.field883 == null ? "" : var246.field883;
                                                                                                                                    field1362[++Statics.field667 - 1] = var246.field884 == null ? "" : var246.field884;
                                                                                                                                    field1362[++Statics.field667 - 1] = var246.field885 == null ? "" : var246.field885;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5005) {
                                                                                                                                if (Statics.field788 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = Statics.field788.field3739;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5008) {
                                                                                                                                String var248 = field1362[--Statics.field667];
                                                                                                                                int var249 = field1361[--Statics.field627];
                                                                                                                                String var250 = var248.toLowerCase();
                                                                                                                                byte var251 = 0;
                                                                                                                                if (var250.startsWith(class226.field3091)) {
                                                                                                                                    var251 = 0;
                                                                                                                                    var248 = var248.substring(class226.field3091.length());
                                                                                                                                } else if (var250.startsWith(class226.field3038)) {
                                                                                                                                    var251 = 1;
                                                                                                                                    var248 = var248.substring(class226.field3038.length());
                                                                                                                                } else if (var250.startsWith(class226.field3040)) {
                                                                                                                                    var251 = 2;
                                                                                                                                    var248 = var248.substring(class226.field3040.length());
                                                                                                                                } else if (var250.startsWith(class226.field3042)) {
                                                                                                                                    var251 = 3;
                                                                                                                                    var248 = var248.substring(class226.field3042.length());
                                                                                                                                } else if (var250.startsWith(class226.field2878)) {
                                                                                                                                    var251 = 4;
                                                                                                                                    var248 = var248.substring(class226.field2878.length());
                                                                                                                                } else if (var250.startsWith(class226.field3046)) {
                                                                                                                                    var251 = 5;
                                                                                                                                    var248 = var248.substring(class226.field3046.length());
                                                                                                                                } else if (var250.startsWith(class226.field3048)) {
                                                                                                                                    var251 = 6;
                                                                                                                                    var248 = var248.substring(class226.field3048.length());
                                                                                                                                } else if (var250.startsWith(class226.field2987)) {
                                                                                                                                    var251 = 7;
                                                                                                                                    var248 = var248.substring(class226.field2987.length());
                                                                                                                                } else if (var250.startsWith(class226.field3052)) {
                                                                                                                                    var251 = 8;
                                                                                                                                    var248 = var248.substring(class226.field3052.length());
                                                                                                                                } else if (var250.startsWith(class226.field3054)) {
                                                                                                                                    var251 = 9;
                                                                                                                                    var248 = var248.substring(class226.field3054.length());
                                                                                                                                } else if (var250.startsWith(class226.field3134)) {
                                                                                                                                    var251 = 10;
                                                                                                                                    var248 = var248.substring(class226.field3134.length());
                                                                                                                                } else if (var250.startsWith(class226.field3058)) {
                                                                                                                                    var251 = 11;
                                                                                                                                    var248 = var248.substring(class226.field3058.length());
                                                                                                                                } else if (client.field932 != 0) {
                                                                                                                                    if (var250.startsWith(class226.field3037)) {
                                                                                                                                        var251 = 0;
                                                                                                                                        var248 = var248.substring(class226.field3037.length());
                                                                                                                                    } else if (var250.startsWith(class226.field3039)) {
                                                                                                                                        var251 = 1;
                                                                                                                                        var248 = var248.substring(class226.field3039.length());
                                                                                                                                    } else if (var250.startsWith(class226.field3016)) {
                                                                                                                                        var251 = 2;
                                                                                                                                        var248 = var248.substring(class226.field3016.length());
                                                                                                                                    } else if (var250.startsWith(class226.field3035)) {
                                                                                                                                        var251 = 3;
                                                                                                                                        var248 = var248.substring(class226.field3035.length());
                                                                                                                                    } else if (var250.startsWith(class226.field2980)) {
                                                                                                                                        var251 = 4;
                                                                                                                                        var248 = var248.substring(class226.field2980.length());
                                                                                                                                    } else if (var250.startsWith(class226.field2924)) {
                                                                                                                                        var251 = 5;
                                                                                                                                        var248 = var248.substring(class226.field2924.length());
                                                                                                                                    } else if (var250.startsWith(class226.field3028)) {
                                                                                                                                        var251 = 6;
                                                                                                                                        var248 = var248.substring(class226.field3028.length());
                                                                                                                                    } else if (var250.startsWith(class226.field3051)) {
                                                                                                                                        var251 = 7;
                                                                                                                                        var248 = var248.substring(class226.field3051.length());
                                                                                                                                    } else if (var250.startsWith(class226.field3053)) {
                                                                                                                                        var251 = 8;
                                                                                                                                        var248 = var248.substring(class226.field3053.length());
                                                                                                                                    } else if (var250.startsWith(class226.field3055)) {
                                                                                                                                        var251 = 9;
                                                                                                                                        var248 = var248.substring(class226.field3055.length());
                                                                                                                                    } else if (var250.startsWith(class226.field3001)) {
                                                                                                                                        var251 = 10;
                                                                                                                                        var248 = var248.substring(class226.field3001.length());
                                                                                                                                    } else if (var250.startsWith(class226.field2981)) {
                                                                                                                                        var251 = 11;
                                                                                                                                        var248 = var248.substring(class226.field2981.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                String var252 = var248.toLowerCase();
                                                                                                                                byte var253 = 0;
                                                                                                                                if (var252.startsWith(class226.field2971)) {
                                                                                                                                    var253 = 1;
                                                                                                                                    var248 = var248.substring(class226.field2971.length());
                                                                                                                                } else if (var252.startsWith(class226.field3062)) {
                                                                                                                                    var253 = 2;
                                                                                                                                    var248 = var248.substring(class226.field3062.length());
                                                                                                                                } else if (var252.startsWith(class226.field3064)) {
                                                                                                                                    var253 = 3;
                                                                                                                                    var248 = var248.substring(class226.field3064.length());
                                                                                                                                } else if (var252.startsWith(class226.field3066)) {
                                                                                                                                    var253 = 4;
                                                                                                                                    var248 = var248.substring(class226.field3066.length());
                                                                                                                                } else if (var252.startsWith(class226.field2953)) {
                                                                                                                                    var253 = 5;
                                                                                                                                    var248 = var248.substring(class226.field2953.length());
                                                                                                                                } else if (client.field932 != 0) {
                                                                                                                                    if (var252.startsWith(class226.field3061)) {
                                                                                                                                        var253 = 1;
                                                                                                                                        var248 = var248.substring(class226.field3061.length());
                                                                                                                                    } else if (var252.startsWith(class226.field3063)) {
                                                                                                                                        var253 = 2;
                                                                                                                                        var248 = var248.substring(class226.field3063.length());
                                                                                                                                    } else if (var252.startsWith(class226.field3065)) {
                                                                                                                                        var253 = 3;
                                                                                                                                        var248 = var248.substring(class226.field3065.length());
                                                                                                                                    } else if (var252.startsWith(class226.field2903)) {
                                                                                                                                        var253 = 4;
                                                                                                                                        var248 = var248.substring(class226.field2903.length());
                                                                                                                                    } else if (var252.startsWith(class226.field2944)) {
                                                                                                                                        var253 = 5;
                                                                                                                                        var248 = var248.substring(class226.field2944.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field969.method3116(213);
                                                                                                                                client.field969.method2865(0);
                                                                                                                                int var254 = client.field969.field2399;
                                                                                                                                client.field969.method2865(var249);
                                                                                                                                client.field969.method2865(var251);
                                                                                                                                client.field969.method2865(var253);
                                                                                                                                class266.method1033(client.field969, var248);
                                                                                                                                client.field969.method2968(client.field969.field2399 - var254);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5009) {
                                                                                                                                Statics.field667 -= 2;
                                                                                                                                String var255 = field1362[Statics.field667];
                                                                                                                                String var256 = field1362[Statics.field667 + 1];
                                                                                                                                client.field969.method3116(239);
                                                                                                                                client.field969.method2990(0);
                                                                                                                                int var257 = client.field969.field2399;
                                                                                                                                client.field969.method2871(var255);
                                                                                                                                class266.method1033(client.field969, var256);
                                                                                                                                client.field969.method2876(client.field969.field2399 - var257);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5015) {
                                                                                                                                String var258;
                                                                                                                                if (Statics.field803 == null || Statics.field803.field913 == null) {
                                                                                                                                    var258 = "";
                                                                                                                                } else {
                                                                                                                                    var258 = Statics.field803.field913;
                                                                                                                                }
                                                                                                                                field1362[++Statics.field667 - 1] = var258;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5016) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1033;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5017) {
                                                                                                                                int var259 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = class99.method4040(var259);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5018) {
                                                                                                                                int var260 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = class99.method2810(var260);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5019) {
                                                                                                                                int var261 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = class99.method4494(var261);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5020) {
                                                                                                                                String var262 = field1362[--Statics.field667];
                                                                                                                                if (var262.equalsIgnoreCase("toggleroof")) {
                                                                                                                                    Statics.field248.field1336 = !Statics.field248.field1336;
                                                                                                                                    Statics.method4();
                                                                                                                                    if (Statics.field248.field1336) {
                                                                                                                                        class99.method2665(99, "", "Roofs are now all hidden");
                                                                                                                                    } else {
                                                                                                                                        class99.method2665(99, "", "Roofs will only be removed selectively");
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var262.equalsIgnoreCase("displayfps")) {
                                                                                                                                    client.field942 = !client.field942;
                                                                                                                                }
                                                                                                                                if (var262.equalsIgnoreCase("clickbox")) {
                                                                                                                                    class134.field1993 = !class134.field1993;
                                                                                                                                    class99.method2665(99, "", "Clickbox Mode: " + (class134.field1993 ? "AABB" : "Legacy"));
                                                                                                                                }
                                                                                                                                if (client.field1095 >= 2) {
                                                                                                                                    if (var262.equalsIgnoreCase("aabb")) {
                                                                                                                                        if (!class8.field237) {
                                                                                                                                            class8.field237 = true;
                                                                                                                                            class8.field234 = class12.field264;
                                                                                                                                            class99.method2665(99, "", "AABB boxes: All");
                                                                                                                                        } else if (class8.field234 == class12.field264) {
                                                                                                                                            class8.field237 = true;
                                                                                                                                            class8.field234 = class12.field269;
                                                                                                                                            class99.method2665(99, "", "AABB boxes: Mouse Over");
                                                                                                                                        } else {
                                                                                                                                            class8.field237 = false;
                                                                                                                                            class99.method2665(99, "", "AABB boxes: Off");
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var262.equalsIgnoreCase("legacyboxes")) {
                                                                                                                                        class8.field239 = !class8.field239;
                                                                                                                                        class99.method2665(99, "", "Show legacy boxes: " + class8.field239);
                                                                                                                                    }
                                                                                                                                    if (var262.equalsIgnoreCase("geotests")) {
                                                                                                                                        class8.field233 = !class8.field233;
                                                                                                                                        class99.method2665(99, "", "Show geometry tests: " + class8.field233);
                                                                                                                                    }
                                                                                                                                    if (var262.equalsIgnoreCase("fpson")) {
                                                                                                                                        client.field942 = true;
                                                                                                                                    }
                                                                                                                                    if (var262.equalsIgnoreCase("fpsoff")) {
                                                                                                                                        client.field942 = false;
                                                                                                                                    }
                                                                                                                                    if (var262.equalsIgnoreCase("gc")) {
                                                                                                                                        System.gc();
                                                                                                                                    }
                                                                                                                                    if (var262.equalsIgnoreCase("clientdrop")) {
                                                                                                                                        client.method52();
                                                                                                                                    }
                                                                                                                                    if (var262.equalsIgnoreCase("errortest") && client.field1203 == 2) {
                                                                                                                                        throw new RuntimeException();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field969.method3116(232);
                                                                                                                                client.field969.method2865(var262.length() + 1);
                                                                                                                                client.field969.method2871(var262);
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5021) {
                                                                                                                                client.field1146 = field1362[--Statics.field667].toLowerCase().trim();
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var377 == 5022) {
                                                                                                                                field1362[++Statics.field667 - 1] = client.field1146;
                                                                                                                                var238 = 1;
                                                                                                                            } else {
                                                                                                                                var238 = 2;
                                                                                                                            }
                                                                                                                            var64 = var238;
                                                                                                                        } else if (var377 < 5400) {
                                                                                                                            var64 = method473(var377, var6, var63);
                                                                                                                        } else if (var377 < 5600) {
                                                                                                                            byte var268;
                                                                                                                            if (var377 == 5504) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var266 = field1361[Statics.field627];
                                                                                                                                int var267 = field1361[Statics.field627 + 1];
                                                                                                                                if (!client.field1174) {
                                                                                                                                    client.field1053 = var266;
                                                                                                                                    client.field1011 = var267;
                                                                                                                                }
                                                                                                                                var268 = 1;
                                                                                                                            } else if (var377 == 5505) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1053;
                                                                                                                                var268 = 1;
                                                                                                                            } else if (var377 == 5506) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1011;
                                                                                                                                var268 = 1;
                                                                                                                            } else if (var377 == 5530) {
                                                                                                                                int var269 = field1361[--Statics.field627];
                                                                                                                                if (var269 < 0) {
                                                                                                                                    var269 = 0;
                                                                                                                                }
                                                                                                                                client.field1016 = var269;
                                                                                                                                var268 = 1;
                                                                                                                            } else if (var377 == 5531) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1016;
                                                                                                                                var268 = 1;
                                                                                                                            } else {
                                                                                                                                var268 = 2;
                                                                                                                            }
                                                                                                                            var64 = var268;
                                                                                                                        } else if (var377 < 5700) {
                                                                                                                            byte var270;
                                                                                                                            if (var377 == 5630) {
                                                                                                                                client.field979 = 250;
                                                                                                                                var270 = 1;
                                                                                                                            } else {
                                                                                                                                var270 = 2;
                                                                                                                            }
                                                                                                                            var64 = var270;
                                                                                                                        } else if (var377 < 6300) {
                                                                                                                            byte var271;
                                                                                                                            if (var377 == 6200) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                client.field1180 = (short) field1361[Statics.field627];
                                                                                                                                if (client.field1180 <= 0) {
                                                                                                                                    client.field1180 = 256;
                                                                                                                                }
                                                                                                                                client.field1181 = (short) field1361[Statics.field627 + 1];
                                                                                                                                if (client.field1181 <= 0) {
                                                                                                                                    client.field1181 = 205;
                                                                                                                                }
                                                                                                                                var271 = 1;
                                                                                                                            } else if (var377 == 6201) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                client.field1127 = (short) field1361[Statics.field627];
                                                                                                                                if (client.field1127 <= 0) {
                                                                                                                                    client.field1127 = 256;
                                                                                                                                }
                                                                                                                                client.field1183 = (short) field1361[Statics.field627 + 1];
                                                                                                                                if (client.field1183 <= 0) {
                                                                                                                                    client.field1183 = 320;
                                                                                                                                }
                                                                                                                                var271 = 1;
                                                                                                                            } else if (var377 == 6202) {
                                                                                                                                Statics.field627 -= 4;
                                                                                                                                client.field1167 = (short) field1361[Statics.field627];
                                                                                                                                if (client.field1167 <= 0) {
                                                                                                                                    client.field1167 = 1;
                                                                                                                                }
                                                                                                                                client.field1185 = (short) field1361[Statics.field627 + 1];
                                                                                                                                if (client.field1185 <= 0) {
                                                                                                                                    client.field1185 = 32767;
                                                                                                                                } else if (client.field1185 < client.field1167) {
                                                                                                                                    client.field1185 = client.field1167;
                                                                                                                                }
                                                                                                                                client.field1186 = (short) field1361[Statics.field627 + 2];
                                                                                                                                if (client.field1186 <= 0) {
                                                                                                                                    client.field1186 = 1;
                                                                                                                                }
                                                                                                                                client.field1187 = (short) field1361[Statics.field627 + 3];
                                                                                                                                if (client.field1187 <= 0) {
                                                                                                                                    client.field1187 = 32767;
                                                                                                                                } else if (client.field1187 < client.field1186) {
                                                                                                                                    client.field1187 = client.field1186;
                                                                                                                                }
                                                                                                                                var271 = 1;
                                                                                                                            } else if (var377 == 6203) {
                                                                                                                                if (client.field1100 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    client.method1619(0, 0, client.field1100.field2750, client.field1100.field2671, false);
                                                                                                                                    field1361[++Statics.field627 - 1] = client.field1190;
                                                                                                                                    field1361[++Statics.field627 - 1] = client.field946;
                                                                                                                                }
                                                                                                                                var271 = 1;
                                                                                                                            } else if (var377 == 6204) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1127;
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1183;
                                                                                                                                var271 = 1;
                                                                                                                            } else if (var377 == 6205) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1180;
                                                                                                                                field1361[++Statics.field627 - 1] = client.field1181;
                                                                                                                                var271 = 1;
                                                                                                                            } else {
                                                                                                                                var271 = 2;
                                                                                                                            }
                                                                                                                            var64 = var271;
                                                                                                                        } else if (var377 < 6600) {
                                                                                                                            byte var272;
                                                                                                                            if (var377 == 6500) {
                                                                                                                                field1361[++Statics.field627 - 1] = class81.method5() ? 1 : 0;
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6501) {
                                                                                                                                class81 var273 = class81.method1482();
                                                                                                                                if (var273 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var273.field1315;
                                                                                                                                    field1361[++Statics.field627 - 1] = var273.field1316;
                                                                                                                                    field1362[++Statics.field667 - 1] = var273.field1325;
                                                                                                                                    field1361[++Statics.field627 - 1] = var273.field1320;
                                                                                                                                    field1361[++Statics.field627 - 1] = var273.field1317;
                                                                                                                                    field1362[++Statics.field667 - 1] = var273.field1318;
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6502) {
                                                                                                                                class81 var274 = class81.method1423();
                                                                                                                                if (var274 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var274.field1315;
                                                                                                                                    field1361[++Statics.field627 - 1] = var274.field1316;
                                                                                                                                    field1362[++Statics.field667 - 1] = var274.field1325;
                                                                                                                                    field1361[++Statics.field627 - 1] = var274.field1320;
                                                                                                                                    field1361[++Statics.field627 - 1] = var274.field1317;
                                                                                                                                    field1362[++Statics.field667 - 1] = var274.field1318;
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6506) {
                                                                                                                                int var275 = field1361[--Statics.field627];
                                                                                                                                class81 var276 = null;
                                                                                                                                for (int var277 = 0; var277 < class81.field1310; var277++) {
                                                                                                                                    if (Statics.field1309[var277].field1315 == var275) {
                                                                                                                                        var276 = Statics.field1309[var277];
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var276 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var276.field1315;
                                                                                                                                    field1361[++Statics.field627 - 1] = var276.field1316;
                                                                                                                                    field1362[++Statics.field667 - 1] = var276.field1325;
                                                                                                                                    field1361[++Statics.field627 - 1] = var276.field1320;
                                                                                                                                    field1361[++Statics.field627 - 1] = var276.field1317;
                                                                                                                                    field1362[++Statics.field667 - 1] = var276.field1318;
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6507) {
                                                                                                                                Statics.field627 -= 4;
                                                                                                                                int var278 = field1361[Statics.field627];
                                                                                                                                boolean var279 = field1361[Statics.field627 + 1] == 1;
                                                                                                                                int var280 = field1361[Statics.field627 + 2];
                                                                                                                                boolean var281 = field1361[Statics.field627 + 3] == 1;
                                                                                                                                if (Statics.field1309 != null) {
                                                                                                                                    class81.method104(0, Statics.field1309.length - 1, var278, var279, var280, var281);
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6511) {
                                                                                                                                int var282 = field1361[--Statics.field627];
                                                                                                                                if (var282 >= 0 && var282 < class81.field1310) {
                                                                                                                                    class81 var283 = Statics.field1309[var282];
                                                                                                                                    field1361[++Statics.field627 - 1] = var283.field1315;
                                                                                                                                    field1361[++Statics.field627 - 1] = var283.field1316;
                                                                                                                                    field1362[++Statics.field667 - 1] = var283.field1325;
                                                                                                                                    field1361[++Statics.field627 - 1] = var283.field1320;
                                                                                                                                    field1361[++Statics.field627 - 1] = var283.field1317;
                                                                                                                                    field1362[++Statics.field667 - 1] = var283.field1318;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6512) {
                                                                                                                                client.field1074 = field1361[--Statics.field627] == 1;
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6513) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var284 = field1361[Statics.field627];
                                                                                                                                int var285 = field1361[Statics.field627 + 1];
                                                                                                                                class252 var286 = class252.method2639(var285);
                                                                                                                                if (var286.method4081()) {
                                                                                                                                    field1362[++Statics.field667 - 1] = class259.method471(var284).method4285(var285, var286.field3402);
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = class259.method471(var284).method4284(var285, var286.field3399);
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6514) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var287 = field1361[Statics.field627];
                                                                                                                                int var288 = field1361[Statics.field627 + 1];
                                                                                                                                class252 var289 = class252.method2639(var288);
                                                                                                                                if (var289.method4081()) {
                                                                                                                                    field1362[++Statics.field667 - 1] = class256.method4092(var287).method4166(var288, var289.field3402);
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = class256.method4092(var287).method4189(var288, var289.field3399);
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6515) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var290 = field1361[Statics.field627];
                                                                                                                                int var291 = field1361[Statics.field627 + 1];
                                                                                                                                class252 var292 = class252.method2639(var291);
                                                                                                                                if (var292.method4081()) {
                                                                                                                                    field1362[++Statics.field667 - 1] = class257.method3084(var290).method4230(var291, var292.field3402);
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = class257.method3084(var290).method4227(var291, var292.field3399);
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else if (var377 == 6516) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var293 = field1361[Statics.field627];
                                                                                                                                int var294 = field1361[Statics.field627 + 1];
                                                                                                                                class252 var295 = class252.method2639(var294);
                                                                                                                                if (var295.method4081()) {
                                                                                                                                    String[] var296 = field1362;
                                                                                                                                    int var297 = ++Statics.field667 - 1;
                                                                                                                                    class253 var298 = (class253) class253.field3403.method3235((long) var293);
                                                                                                                                    class253 var299;
                                                                                                                                    if (var298 == null) {
                                                                                                                                        byte[] var300 = Statics.field3407.method3768(34, var293);
                                                                                                                                        class253 var301 = new class253();
                                                                                                                                        if (var300 != null) {
                                                                                                                                            var301.method4100(new class174(var300));
                                                                                                                                        }
                                                                                                                                        var301.method4099();
                                                                                                                                        class253.field3403.method3234(var301, (long) var293);
                                                                                                                                        var299 = var301;
                                                                                                                                    } else {
                                                                                                                                        var299 = var298;
                                                                                                                                    }
                                                                                                                                    var296[var297] = var299.method4103(var294, var295.field3402);
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = class253.method107(var293).method4098(var294, var295.field3399);
                                                                                                                                }
                                                                                                                                var272 = 1;
                                                                                                                            } else {
                                                                                                                                var272 = 2;
                                                                                                                            }
                                                                                                                            var64 = var272;
                                                                                                                        } else if (var377 < 6700) {
                                                                                                                            byte var305;
                                                                                                                            if (var377 == 6600) {
                                                                                                                                int var302 = Statics.field2137;
                                                                                                                                int var303 = (Statics.field803.field1273 >> 7) + Statics.field669;
                                                                                                                                int var304 = (Statics.field803.field1240 >> 7) + Statics.field3674;
                                                                                                                                client.method566().method4804(var302, var303, var304, true);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6601) {
                                                                                                                                int var306 = field1361[--Statics.field627];
                                                                                                                                String var307 = "";
                                                                                                                                class33 var308 = client.method566().method4796(var306);
                                                                                                                                if (var308 != null) {
                                                                                                                                    var307 = var308.method246();
                                                                                                                                }
                                                                                                                                field1362[++Statics.field667 - 1] = var307;
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6602) {
                                                                                                                                int var309 = field1361[--Statics.field627];
                                                                                                                                client.method566().method4805(var309);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6603) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4942();
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6604) {
                                                                                                                                int var310 = field1361[--Statics.field627];
                                                                                                                                client.method566().method4867(var310);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6605) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4819() ? 1 : 0;
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6606) {
                                                                                                                                class213 var311 = new class213(field1361[--Statics.field627]);
                                                                                                                                client.method566().method4821(var311.field2616, var311.field2618);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6607) {
                                                                                                                                class213 var312 = new class213(field1361[--Statics.field627]);
                                                                                                                                client.method566().method4822(var312.field2616, var312.field2618);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6608) {
                                                                                                                                class213 var313 = new class213(field1361[--Statics.field627]);
                                                                                                                                client.method566().method4823(var313.field2617, var313.field2616, var313.field2618);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6609) {
                                                                                                                                class213 var314 = new class213(field1361[--Statics.field627]);
                                                                                                                                client.method566().method4829(var314.field2617, var314.field2616, var314.field2618);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6610) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4916();
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4826();
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6611) {
                                                                                                                                int var315 = field1361[--Statics.field627];
                                                                                                                                class33 var316 = client.method566().method4796(var315);
                                                                                                                                if (var316 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var316.method297().method3592();
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6612) {
                                                                                                                                int var317 = field1361[--Statics.field627];
                                                                                                                                class33 var318 = client.method566().method4796(var317);
                                                                                                                                if (var318 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = (var318.method250() - var318.method268() + 1) * 64;
                                                                                                                                    field1361[++Statics.field627 - 1] = (var318.method252() - var318.method251() + 1) * 64;
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6613) {
                                                                                                                                int var319 = field1361[--Statics.field627];
                                                                                                                                class33 var320 = client.method566().method4796(var319);
                                                                                                                                if (var320 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var320.method268() * 64;
                                                                                                                                    field1361[++Statics.field627 - 1] = var320.method251() * 64;
                                                                                                                                    field1361[++Statics.field627 - 1] = var320.method250() * 64 + 64 - 1;
                                                                                                                                    field1361[++Statics.field627 - 1] = var320.method252() * 64 + 64 - 1;
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6614) {
                                                                                                                                int var321 = field1361[--Statics.field627];
                                                                                                                                class33 var322 = client.method566().method4796(var321);
                                                                                                                                if (var322 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var322.method248();
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6615) {
                                                                                                                                class213 var323 = client.method566().method4827();
                                                                                                                                if (var323 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var323.field2616;
                                                                                                                                    field1361[++Statics.field627 - 1] = var323.field2618;
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6616) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4806();
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6617) {
                                                                                                                                class213 var324 = new class213(field1361[--Statics.field627]);
                                                                                                                                class33 var325 = client.method566().method4877();
                                                                                                                                if (var325 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    var305 = 1;
                                                                                                                                } else {
                                                                                                                                    int[] var326 = var325.method280(var324.field2617, var324.field2616, var324.field2618);
                                                                                                                                    if (var326 == null) {
                                                                                                                                        field1361[++Statics.field627 - 1] = -1;
                                                                                                                                        field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1361[++Statics.field627 - 1] = var326[0];
                                                                                                                                        field1361[++Statics.field627 - 1] = var326[1];
                                                                                                                                    }
                                                                                                                                    var305 = 1;
                                                                                                                                }
                                                                                                                            } else if (var377 == 6618) {
                                                                                                                                class213 var327 = new class213(field1361[--Statics.field627]);
                                                                                                                                class33 var328 = client.method566().method4877();
                                                                                                                                if (var328 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    var305 = 1;
                                                                                                                                } else {
                                                                                                                                    class213 var329 = var328.method241(var327.field2616, var327.field2618);
                                                                                                                                    if (var329 == null) {
                                                                                                                                        field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1361[++Statics.field627 - 1] = var329.method3592();
                                                                                                                                    }
                                                                                                                                    var305 = 1;
                                                                                                                                }
                                                                                                                            } else if (var377 == 6619) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var330 = field1361[Statics.field627];
                                                                                                                                class213 var331 = new class213(field1361[Statics.field627 + 1]);
                                                                                                                                class33 var332 = client.method566().method4796(var330);
                                                                                                                                int var333 = Statics.field803.field912;
                                                                                                                                int var334 = (Statics.field803.field1273 >> 7) + Statics.field669;
                                                                                                                                int var335 = (Statics.field803.field1240 >> 7) + Statics.field3674;
                                                                                                                                class213 var336 = new class213(var333, var334, var335);
                                                                                                                                client.method566().method4810(var332, var336, var331, false);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6620) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var337 = field1361[Statics.field627];
                                                                                                                                class213 var338 = new class213(field1361[Statics.field627 + 1]);
                                                                                                                                class33 var339 = client.method566().method4796(var337);
                                                                                                                                int var340 = Statics.field803.field912;
                                                                                                                                int var341 = (Statics.field803.field1273 >> 7) + Statics.field669;
                                                                                                                                int var342 = (Statics.field803.field1240 >> 7) + Statics.field3674;
                                                                                                                                class213 var343 = new class213(var340, var341, var342);
                                                                                                                                client.method566().method4810(var339, var343, var338, true);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6621) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var344 = field1361[Statics.field627];
                                                                                                                                class213 var345 = new class213(field1361[Statics.field627 + 1]);
                                                                                                                                class33 var346 = client.method566().method4796(var344);
                                                                                                                                if (var346 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = 0;
                                                                                                                                    var305 = 1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var346.method238(var345.field2617, var345.field2616, var345.field2618) ? 1 : 0;
                                                                                                                                    var305 = 1;
                                                                                                                                }
                                                                                                                            } else if (var377 == 6622) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4901();
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4950();
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6623) {
                                                                                                                                class213 var347 = new class213(field1361[--Statics.field627]);
                                                                                                                                class33 var348 = client.method566().method4831(var347.field2617, var347.field2616, var347.field2618);
                                                                                                                                if (var348 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var348.method243();
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6624) {
                                                                                                                                client.method566().method4871(field1361[--Statics.field627]);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6625) {
                                                                                                                                client.method566().method4798();
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6626) {
                                                                                                                                client.method566().method4936(field1361[--Statics.field627]);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6627) {
                                                                                                                                client.method566().method4900();
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6628) {
                                                                                                                                boolean var349 = field1361[--Statics.field627] == 1;
                                                                                                                                client.method566().method4834(var349);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6629) {
                                                                                                                                int var350 = field1361[--Statics.field627];
                                                                                                                                client.method566().method4956(var350);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6630) {
                                                                                                                                int var351 = field1361[--Statics.field627];
                                                                                                                                client.method566().method4836(var351);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6631) {
                                                                                                                                client.method566().method4837();
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6632) {
                                                                                                                                boolean var352 = field1361[--Statics.field627] == 1;
                                                                                                                                client.method566().method4982(var352);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6633) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var353 = field1361[Statics.field627];
                                                                                                                                boolean var354 = field1361[Statics.field627 + 1] == 1;
                                                                                                                                client.method566().method4839(var353, var354);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6634) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var355 = field1361[Statics.field627];
                                                                                                                                boolean var356 = field1361[Statics.field627 + 1] == 1;
                                                                                                                                client.method566().method4840(var355, var356);
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6635) {
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4841() ? 1 : 0;
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6636) {
                                                                                                                                int var357 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4842(var357) ? 1 : 0;
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6637) {
                                                                                                                                int var358 = field1361[--Statics.field627];
                                                                                                                                field1361[++Statics.field627 - 1] = client.method566().method4843(var358) ? 1 : 0;
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6638) {
                                                                                                                                Statics.field627 -= 2;
                                                                                                                                int var359 = field1361[Statics.field627];
                                                                                                                                class213 var360 = new class213(field1361[Statics.field627 + 1]);
                                                                                                                                class213 var361 = client.method566().method4938(var359, var360);
                                                                                                                                if (var361 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var361.method3592();
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6639) {
                                                                                                                                class40 var362 = client.method566().method4848();
                                                                                                                                if (var362 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var362.field549;
                                                                                                                                    field1361[++Statics.field627 - 1] = var362.field551.method3592();
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6640) {
                                                                                                                                class40 var363 = client.method566().method4849();
                                                                                                                                if (var363 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var363.field549;
                                                                                                                                    field1361[++Statics.field627 - 1] = var363.field551.method3592();
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6693) {
                                                                                                                                int var364 = field1361[--Statics.field627];
                                                                                                                                class243 var365 = Statics.field3304[var364];
                                                                                                                                if (var365.field3301 == null) {
                                                                                                                                    field1362[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1362[++Statics.field667 - 1] = var365.field3301;
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6694) {
                                                                                                                                int var366 = field1361[--Statics.field627];
                                                                                                                                class243 var367 = Statics.field3304[var366];
                                                                                                                                field1361[++Statics.field627 - 1] = var367.field3303;
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6695) {
                                                                                                                                int var368 = field1361[--Statics.field627];
                                                                                                                                class243 var369 = Statics.field3304[var368];
                                                                                                                                if (var369 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var369.field3308;
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6696) {
                                                                                                                                int var370 = field1361[--Statics.field627];
                                                                                                                                class243 var371 = Statics.field3304[var370];
                                                                                                                                if (var371 == null) {
                                                                                                                                    field1361[++Statics.field627 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1361[++Statics.field627 - 1] = var371.field3309;
                                                                                                                                }
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6697) {
                                                                                                                                field1361[++Statics.field627 - 1] = Statics.field450.field634;
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6698) {
                                                                                                                                field1361[++Statics.field627 - 1] = Statics.field450.field636.method3592();
                                                                                                                                var305 = 1;
                                                                                                                            } else if (var377 == 6699) {
                                                                                                                                field1361[++Statics.field627 - 1] = Statics.field450.field633.method3592();
                                                                                                                                var305 = 1;
                                                                                                                            } else {
                                                                                                                                var305 = 2;
                                                                                                                            }
                                                                                                                            var64 = var305;
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
                                                                                                                    } else if (var377 == 0) {
                                                                                                                        field1361[++Statics.field627 - 1] = var14[var12];
                                                                                                                    } else if (var377 == 1) {
                                                                                                                        int var22 = var14[var12];
                                                                                                                        field1361[++Statics.field627 - 1] = class212.field2613[var22];
                                                                                                                    } else if (var377 == 2) {
                                                                                                                        int var23 = var14[var12];
                                                                                                                        class212.field2613[var23] = field1361[--Statics.field627];
                                                                                                                        client.method1481(var23);
                                                                                                                    } else if (var377 == 3) {
                                                                                                                        field1362[++Statics.field667 - 1] = var6.field1554[var12];
                                                                                                                    } else if (var377 == 6) {
                                                                                                                        var12 += var14[var12];
                                                                                                                    } else if (var377 == 7) {
                                                                                                                        Statics.field627 -= 2;
                                                                                                                        if (field1361[Statics.field627] != field1361[Statics.field627 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var377 == 8) {
                                                                                                                        Statics.field627 -= 2;
                                                                                                                        if (field1361[Statics.field627] == field1361[Statics.field627 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var377 == 9) {
                                                                                                                        Statics.field627 -= 2;
                                                                                                                        if (field1361[Statics.field627] < field1361[Statics.field627 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var377 == 10) {
                                                                                                                        Statics.field627 -= 2;
                                                                                                                        if (field1361[Statics.field627] > field1361[Statics.field627 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var377 == 21) {
                                                                                                                        if (field1363 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var24 = field1355[--field1363];
                                                                                                                        var6 = var24.field802;
                                                                                                                        var13 = var6.field1561;
                                                                                                                        var14 = var6.field1553;
                                                                                                                        var12 = var24.field793;
                                                                                                                        Statics.field1367 = var24.field794;
                                                                                                                        Statics.field1358 = var24.field795;
                                                                                                                    } else if (var377 == 25) {
                                                                                                                        int var25 = var14[var12];
                                                                                                                        field1361[++Statics.field627 - 1] = class212.method227(var25);
                                                                                                                    } else if (var377 == 27) {
                                                                                                                        int var26 = var14[var12];
                                                                                                                        class212.method1717(var26, field1361[--Statics.field627]);
                                                                                                                    } else if (var377 == 31) {
                                                                                                                        Statics.field627 -= 2;
                                                                                                                        if (field1361[Statics.field627] <= field1361[Statics.field627 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var377 == 32) {
                                                                                                                        Statics.field627 -= 2;
                                                                                                                        if (field1361[Statics.field627] >= field1361[Statics.field627 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var377 == 33) {
                                                                                                                        field1361[++Statics.field627 - 1] = Statics.field1367[var14[var12]];
                                                                                                                    } else if (var377 == 34) {
                                                                                                                        Statics.field1367[var14[var12]] = field1361[--Statics.field627];
                                                                                                                    } else if (var377 == 35) {
                                                                                                                        field1362[++Statics.field667 - 1] = Statics.field1358[var14[var12]];
                                                                                                                    } else if (var377 == 36) {
                                                                                                                        Statics.field1358[var14[var12]] = field1362[--Statics.field667];
                                                                                                                    } else if (var377 == 37) {
                                                                                                                        int var27 = var14[var12];
                                                                                                                        Statics.field667 -= var27;
                                                                                                                        String[] var28 = field1362;
                                                                                                                        int var29 = Statics.field667;
                                                                                                                        String var30;
                                                                                                                        if (var27 == 0) {
                                                                                                                            var30 = "";
                                                                                                                        } else if (var27 == 1) {
                                                                                                                            String var31 = var28[var29];
                                                                                                                            if (var31 == null) {
                                                                                                                                var30 = "null";
                                                                                                                            } else {
                                                                                                                                var30 = var31.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var32 = var27 + var29;
                                                                                                                            int var33 = 0;
                                                                                                                            for (int var34 = var29; var34 < var32; var34++) {
                                                                                                                                String var35 = var28[var34];
                                                                                                                                if (var35 == null) {
                                                                                                                                    var33 += 4;
                                                                                                                                } else {
                                                                                                                                    var33 += var35.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var36 = new StringBuilder(var33);
                                                                                                                            for (int var37 = var29; var37 < var32; var37++) {
                                                                                                                                String var38 = var28[var37];
                                                                                                                                if (var38 == null) {
                                                                                                                                    var36.append("null");
                                                                                                                                } else {
                                                                                                                                    var36.append(var38);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var30 = var36.toString();
                                                                                                                        }
                                                                                                                        field1362[++Statics.field667 - 1] = var30;
                                                                                                                    } else if (var377 == 38) {
                                                                                                                        Statics.field627--;
                                                                                                                    } else if (var377 == 39) {
                                                                                                                        Statics.field667--;
                                                                                                                    } else if (var377 == 40) {
                                                                                                                        int var40 = var14[var12];
                                                                                                                        class100 var41 = (class100) class100.field1552.method3235((long) var40);
                                                                                                                        class100 var42;
                                                                                                                        if (var41 == null) {
                                                                                                                            byte[] var43 = Statics.field2353.method3768(var40, 0);
                                                                                                                            if (var43 == null) {
                                                                                                                                var42 = null;
                                                                                                                            } else {
                                                                                                                                class100 var44 = class100.method643(var43);
                                                                                                                                class100.field1552.method3234(var44, (long) var40);
                                                                                                                                var42 = var44;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var42 = var41;
                                                                                                                        }
                                                                                                                        class100 var45 = var42;
                                                                                                                        int[] var46 = new int[var42.field1555];
                                                                                                                        String[] var47 = new String[var42.field1556];
                                                                                                                        for (int var48 = 0; var48 < var45.field1557; var48++) {
                                                                                                                            var46[var48] = field1361[Statics.field627 - var45.field1557 + var48];
                                                                                                                        }
                                                                                                                        for (int var49 = 0; var49 < var45.field1558; var49++) {
                                                                                                                            var47[var49] = field1362[Statics.field667 - var45.field1558 + var49];
                                                                                                                        }
                                                                                                                        Statics.field627 -= var45.field1557;
                                                                                                                        Statics.field667 -= var45.field1558;
                                                                                                                        class63 var50 = new class63();
                                                                                                                        var50.field802 = var6;
                                                                                                                        var50.field793 = var12;
                                                                                                                        var50.field794 = Statics.field1367;
                                                                                                                        var50.field795 = Statics.field1358;
                                                                                                                        field1355[++field1363 - 1] = var50;
                                                                                                                        var6 = var45;
                                                                                                                        var13 = var45.field1561;
                                                                                                                        var14 = var45.field1553;
                                                                                                                        var12 = -1;
                                                                                                                        Statics.field1367 = var46;
                                                                                                                        Statics.field1358 = var47;
                                                                                                                    } else if (var377 == 42) {
                                                                                                                        field1361[++Statics.field627 - 1] = Statics.field874.method1650(var14[var12]);
                                                                                                                    } else if (var377 == 43) {
                                                                                                                        Statics.field874.method1649(var14[var12], field1361[--Statics.field627]);
                                                                                                                    } else if (var377 == 44) {
                                                                                                                        int var51 = var14[var12] >> 16;
                                                                                                                        int var52 = var14[var12] & 0xFFFF;
                                                                                                                        int var53 = field1361[--Statics.field627];
                                                                                                                        if (var53 >= 0 && var53 <= 5000) {
                                                                                                                            field1359[var51] = var53;
                                                                                                                            byte var54 = -1;
                                                                                                                            if (var52 == 105) {
                                                                                                                                var54 = 0;
                                                                                                                            }
                                                                                                                            int var55 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var55 >= var53) {
                                                                                                                                    continue label2058;
                                                                                                                                }
                                                                                                                                field1364[var51][var55] = var54;
                                                                                                                                var55++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var377 == 45) {
                                                                                                                        int var56 = var14[var12];
                                                                                                                        int var57 = field1361[--Statics.field627];
                                                                                                                        if (var57 < 0 || var57 >= field1359[var56]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1361[++Statics.field627 - 1] = field1364[var56][var57];
                                                                                                                    } else if (var377 == 46) {
                                                                                                                        int var58 = var14[var12];
                                                                                                                        Statics.field627 -= 2;
                                                                                                                        int var59 = field1361[Statics.field627];
                                                                                                                        if (var59 < 0 || var59 >= field1359[var58]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1364[var58][var59] = field1361[Statics.field627 + 1];
                                                                                                                    } else if (var377 == 47) {
                                                                                                                        String var60 = Statics.field874.method1652(var14[var12]);
                                                                                                                        if (var60 == null) {
                                                                                                                            var60 = "null";
                                                                                                                        }
                                                                                                                        field1362[++Statics.field667 - 1] = var60;
                                                                                                                    } else if (var377 == 48) {
                                                                                                                        Statics.field874.method1651(var14[var12], field1362[--Statics.field667]);
                                                                                                                    } else if (var377 == 60) {
                                                                                                                        class187 var61 = var6.field1559[var14[var12]];
                                                                                                                        class199 var62 = (class199) var61.method3197((long) field1361[--Statics.field627]);
                                                                                                                        if (var62 != null) {
                                                                                                                            var12 += var62.field2488;
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
        } catch (Exception var376) {
            StringBuilder var374 = new StringBuilder(30);
            var374.append("").append(var6.field2473).append(" ");
            for (int var375 = field1363 - 1; var375 >= 0; var375--) {
                var374.append("").append(field1355[var375].field802.field2473).append(" ");
            }
            var374.append("").append(var15);
            class153.method2658(var374.toString(), var376);
        }
    }

    @ObfuscatedName("ay.a(ILcy;ZI)I")
    public static int method308(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field627 -= 3;
            int var3 = field1361[Statics.field627];
            int var4 = field1361[Statics.field627 + 1];
            int var5 = field1361[Statics.field627 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class217 var6 = class217.method3122(var3);
            if (var6.field2779 == null) {
                var6.field2779 = new class217[var5 + 1];
            }
            if (var6.field2779.length <= var5) {
                class217[] var7 = new class217[var5 + 1];
                for (int var8 = 0; var8 < var6.field2779.length; var8++) {
                    var7[var8] = var6.field2779[var8];
                }
                var6.field2779 = var7;
            }
            if (var5 > 0 && var6.field2779[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class217 var9 = new class217();
            var9.field2657 = var4;
            var9.field2674 = var9.field2655 = var6.field2655;
            var9.field2656 = var5;
            var9.field2654 = true;
            var6.field2779[var5] = var9;
            if (arg2) {
                Statics.field1365 = var9;
            } else {
                Statics.field767 = var9;
            }
            client.method1571(var6);
            return 1;
        } else if (arg0 == 101) {
            class217 var10 = arg2 ? Statics.field1365 : Statics.field767;
            class217 var11 = class217.method3122(var10.field2655);
            var11.field2779[var10.field2656] = null;
            client.method1571(var11);
            return 1;
        } else if (arg0 == 102) {
            class217 var12 = class217.method3122(field1361[--Statics.field627]);
            var12.field2779 = null;
            client.method1571(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field627 -= 2;
            int var13 = field1361[Statics.field627];
            int var14 = field1361[Statics.field627 + 1];
            class217 var15 = class217.method3369(var13, var14);
            if (var15 == null || var14 == -1) {
                field1361[++Statics.field627 - 1] = 0;
            } else {
                field1361[++Statics.field627 - 1] = 1;
                if (arg2) {
                    Statics.field1365 = var15;
                } else {
                    Statics.field767 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class217 var16 = class217.method3122(field1361[--Statics.field627]);
            if (var16 == null) {
                field1361[++Statics.field627 - 1] = 0;
            } else {
                field1361[++Statics.field627 - 1] = 1;
                if (arg2) {
                    Statics.field1365 = var16;
                } else {
                    Statics.field767 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fg.t(ILcy;ZI)I")
    public static int method2851(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1361[--Statics.field627];
            var4 = class217.method3122(var3);
        } else {
            var4 = arg2 ? Statics.field1365 : Statics.field767;
        }
        if (arg0 == 1000) {
            Statics.field627 -= 4;
            var4.field2701 = field1361[Statics.field627];
            var4.field2665 = field1361[Statics.field627 + 1];
            var4.field2660 = field1361[Statics.field627 + 2];
            var4.field2661 = field1361[Statics.field627 + 3];
            client.method1571(var4);
            Statics.field3633.method1218(var4);
            if (var3 != -1 && var4.field2657 == 0) {
                client.method485(Statics.field628[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field627 -= 4;
            var4.field2666 = field1361[Statics.field627];
            var4.field2708 = field1361[Statics.field627 + 1];
            var4.field2684 = field1361[Statics.field627 + 2];
            var4.field2663 = field1361[Statics.field627 + 3];
            client.method1571(var4);
            Statics.field3633.method1218(var4);
            if (var3 != -1 && var4.field2657 == 0) {
                client.method485(Statics.field628[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1361[--Statics.field627] == 1;
            if (var4.field2675 != var5) {
                var4.field2675 = var5;
                client.method1571(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2686 = field1361[--Statics.field627] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2784 = field1361[--Statics.field627] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jr.s(ILcy;ZI)I")
    public static int method4372(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1361[--Statics.field627];
            var4 = class217.method3122(var3);
        } else {
            var4 = arg2 ? Statics.field1365 : Statics.field767;
        }
        if (arg0 == 1100) {
            Statics.field627 -= 2;
            var4.field2676 = field1361[Statics.field627];
            if (var4.field2676 > var4.field2649 - var4.field2750) {
                var4.field2676 = var4.field2649 - var4.field2750;
            }
            if (var4.field2676 < 0) {
                var4.field2676 = 0;
            }
            var4.field2677 = field1361[Statics.field627 + 1];
            if (var4.field2677 > var4.field2679 - var4.field2671) {
                var4.field2677 = var4.field2679 - var4.field2671;
            }
            if (var4.field2677 < 0) {
                var4.field2677 = 0;
            }
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2680 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2648 = field1361[--Statics.field627] == 1;
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2700 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2688 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2690 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2692 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2693 = field1361[--Statics.field627] == 1;
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2662 = 1;
            var4.field2699 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field627 -= 6;
            var4.field2704 = field1361[Statics.field627];
            var4.field2705 = field1361[Statics.field627 + 1];
            var4.field2706 = field1361[Statics.field627 + 2];
            var4.field2707 = field1361[Statics.field627 + 3];
            var4.field2744 = field1361[Statics.field627 + 4];
            var4.field2651 = field1361[Statics.field627 + 5];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1361[--Statics.field627];
            if (var4.field2718 != var5) {
                var4.field2718 = var5;
                var4.field2789 = 0;
                var4.field2778 = 0;
                client.method1571(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2712 = field1361[--Statics.field627] == 1;
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1362[--Statics.field667];
            if (!var6.equals(var4.field2715)) {
                var4.field2715 = var6;
                client.method1571(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2714 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field627 -= 3;
            var4.field2653 = field1361[Statics.field627];
            var4.field2727 = field1361[Statics.field627 + 1];
            var4.field2717 = field1361[Statics.field627 + 2];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2720 = field1361[--Statics.field627] == 1;
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2694 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2771 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2696 = field1361[--Statics.field627] == 1;
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2697 = field1361[--Statics.field627] == 1;
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field627 -= 2;
            var4.field2649 = field1361[Statics.field627];
            var4.field2679 = field1361[Statics.field627 + 1];
            client.method1571(var4);
            if (var3 != -1 && var4.field2657 == 0) {
                client.method485(Statics.field628[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            Statics.method908(var4.field2655, var4.field2656);
            client.field1092 = var4;
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2691 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2681 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2687 = field1361[--Statics.field627];
            client.method1571(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1361[--Statics.field627];
            class284[] var8 = new class284[] { class284.field3769, class284.field3771, class284.field3772, class284.field3773, class284.field3770 };
            class284 var9 = (class284) class169.method2353(var8, var7);
            if (var9 != null) {
                var4.field2758 = var9;
                client.method1571(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var10 = field1361[--Statics.field627] == 1;
            var4.field2689 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fr.r(ILcy;ZB)I")
    public static int method3133(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3122(field1361[--Statics.field627]);
        } else {
            var3 = arg2 ? Statics.field1365 : Statics.field767;
        }
        client.method1571(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field627 -= 2;
            int var4 = field1361[Statics.field627];
            int var5 = field1361[Statics.field627 + 1];
            var3.field2775 = var4;
            var3.field2713 = var5;
            class257 var6 = class257.method3084(var4);
            var3.field2706 = var6.field3511;
            var3.field2707 = var6.field3512;
            var3.field2744 = var6.field3513;
            var3.field2704 = var6.field3514;
            var3.field2705 = var6.field3534;
            var3.field2651 = var6.field3545;
            if (arg0 == 1205) {
                var3.field2785 = 0;
            } else if (arg0 == 1212 | var6.field3529 == 1) {
                var3.field2785 = 1;
            } else {
                var3.field2785 = 2;
            }
            if (var3.field2710 > 0) {
                var3.field2651 = var3.field2651 * 32 / var3.field2710;
            } else if (var3.field2666 > 0) {
                var3.field2651 = var3.field2651 * 32 / var3.field2666;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2662 = 2;
            var3.field2699 = field1361[--Statics.field627];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2662 = 3;
            var3.field2699 = Statics.field803.field917.method3617();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.v(ILcy;ZI)I")
    public static int method498(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3122(field1361[--Statics.field627]);
        } else {
            var3 = arg2 ? Statics.field1365 : Statics.field767;
        }
        if (arg0 == 1300) {
            int var4 = field1361[--Statics.field627] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3671(var4, field1362[--Statics.field667]);
                return 1;
            } else {
                Statics.field667--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field627 -= 2;
            int var5 = field1361[Statics.field627];
            int var6 = field1361[Statics.field627 + 1];
            var3.field2709 = class217.method3369(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2738 = field1361[--Statics.field627] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2731 = field1361[--Statics.field627];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2721 = field1361[--Statics.field627];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2728 = field1362[--Statics.field667];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2734 = field1362[--Statics.field667];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2729 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("db.y(ILcy;ZB)I")
    public static int method1902(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3122(field1361[--Statics.field627]);
        } else {
            var3 = arg2 ? Statics.field1365 : Statics.field767;
        }
        String var4 = field1362[--Statics.field667];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1361[--Statics.field627];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1361[--Statics.field627];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1362[--Statics.field667];
            } else {
                var7[var8] = Integer.valueOf(field1361[--Statics.field627]);
            }
        }
        int var9 = field1361[--Statics.field627];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2726 = var7;
        } else if (arg0 == 1401) {
            var3.field2723 = var7;
        } else if (arg0 == 1402) {
            var3.field2739 = var7;
        } else if (arg0 == 1403) {
            var3.field2741 = var7;
        } else if (arg0 == 1404) {
            var3.field2743 = var7;
        } else if (arg0 == 1405) {
            var3.field2644 = var7;
        } else if (arg0 == 1406) {
            var3.field2747 = var7;
        } else if (arg0 == 1407) {
            var3.field2748 = var7;
            var3.field2749 = var5;
        } else if (arg0 == 1408) {
            var3.field2754 = var7;
        } else if (arg0 == 1409) {
            var3.field2755 = var7;
        } else if (arg0 == 1410) {
            var3.field2745 = var7;
        } else if (arg0 == 1411) {
            var3.field2678 = var7;
        } else if (arg0 == 1412) {
            var3.field2742 = var7;
        } else if (arg0 == 1414) {
            var3.field2719 = var7;
            var3.field2788 = var5;
        } else if (arg0 == 1415) {
            var3.field2752 = var7;
            var3.field2753 = var5;
        } else if (arg0 == 1416) {
            var3.field2746 = var7;
        } else if (arg0 == 1417) {
            var3.field2733 = var7;
        } else if (arg0 == 1418) {
            var3.field2757 = var7;
        } else if (arg0 == 1419) {
            var3.field2762 = var7;
        } else if (arg0 == 1420) {
            var3.field2759 = var7;
        } else if (arg0 == 1421) {
            var3.field2760 = var7;
        } else if (arg0 == 1422) {
            var3.field2761 = var7;
        } else if (arg0 == 1423) {
            var3.field2732 = var7;
        } else if (arg0 == 1424) {
            var3.field2763 = var7;
        } else if (arg0 == 1425) {
            var3.field2664 = var7;
        } else if (arg0 == 1426) {
            var3.field2702 = var7;
        } else if (arg0 == 1427) {
            var3.field2764 = var7;
        } else {
            return 2;
        }
        var3.field2735 = true;
        return 1;
    }

    @ObfuscatedName("bo.j(ILcy;ZI)I")
    public static int method992(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field1365 : Statics.field767;
        if (arg0 == 1600) {
            field1361[++Statics.field627 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 1601) {
            field1361[++Statics.field627 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 1602) {
            field1362[++Statics.field667 - 1] = var3.field2715;
            return 1;
        } else if (arg0 == 1603) {
            field1361[++Statics.field627 - 1] = var3.field2649;
            return 1;
        } else if (arg0 == 1604) {
            field1361[++Statics.field627 - 1] = var3.field2679;
            return 1;
        } else if (arg0 == 1605) {
            field1361[++Statics.field627 - 1] = var3.field2651;
            return 1;
        } else if (arg0 == 1606) {
            field1361[++Statics.field627 - 1] = var3.field2706;
            return 1;
        } else if (arg0 == 1607) {
            field1361[++Statics.field627 - 1] = var3.field2744;
            return 1;
        } else if (arg0 == 1608) {
            field1361[++Statics.field627 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 1609) {
            field1361[++Statics.field627 - 1] = var3.field2700;
            return 1;
        } else if (arg0 == 1610) {
            field1361[++Statics.field627 - 1] = var3.field2687;
            return 1;
        } else if (arg0 == 1611) {
            field1361[++Statics.field627 - 1] = var3.field2680;
            return 1;
        } else if (arg0 == 1612) {
            field1361[++Statics.field627 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 1613) {
            field1361[++Statics.field627 - 1] = var3.field2758.method17();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.k(ILcy;ZI)I")
    public static int method2142(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field1365 : Statics.field767;
        if (arg0 == 1800) {
            int[] var4 = field1361;
            int var5 = ++Statics.field627 - 1;
            int var6 = client.method191(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1361[--Statics.field627];
            int var9 = var8 - 1;
            if (var3.field2729 == null || var9 >= var3.field2729.length || var3.field2729[var9] == null) {
                field1362[++Statics.field667 - 1] = "";
            } else {
                field1362[++Statics.field667 - 1] = var3.field2729[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2728 == null) {
                field1362[++Statics.field667 - 1] = "";
            } else {
                field1362[++Statics.field667 - 1] = var3.field2728;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gg.e(ILcy;ZI)I")
    public static int method3561(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method3122(field1361[--Statics.field627]);
        if (arg0 == 2500) {
            field1361[++Statics.field627 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 2501) {
            field1361[++Statics.field627 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 2502) {
            field1361[++Statics.field627 - 1] = var3.field2750;
            return 1;
        } else if (arg0 == 2503) {
            field1361[++Statics.field627 - 1] = var3.field2671;
            return 1;
        } else if (arg0 == 2504) {
            field1361[++Statics.field627 - 1] = var3.field2675 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1361[++Statics.field627 - 1] = var3.field2674;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.o(ILcy;ZI)I")
    public static int method1032(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method3122(field1361[--Statics.field627]);
        if (arg0 == 2600) {
            field1361[++Statics.field627 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 2601) {
            field1361[++Statics.field627 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 2602) {
            field1362[++Statics.field667 - 1] = var3.field2715;
            return 1;
        } else if (arg0 == 2603) {
            field1361[++Statics.field627 - 1] = var3.field2649;
            return 1;
        } else if (arg0 == 2604) {
            field1361[++Statics.field627 - 1] = var3.field2679;
            return 1;
        } else if (arg0 == 2605) {
            field1361[++Statics.field627 - 1] = var3.field2651;
            return 1;
        } else if (arg0 == 2606) {
            field1361[++Statics.field627 - 1] = var3.field2706;
            return 1;
        } else if (arg0 == 2607) {
            field1361[++Statics.field627 - 1] = var3.field2744;
            return 1;
        } else if (arg0 == 2608) {
            field1361[++Statics.field627 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 2609) {
            field1361[++Statics.field627 - 1] = var3.field2700;
            return 1;
        } else if (arg0 == 2610) {
            field1361[++Statics.field627 - 1] = var3.field2687;
            return 1;
        } else if (arg0 == 2611) {
            field1361[++Statics.field627 - 1] = var3.field2680;
            return 1;
        } else if (arg0 == 2612) {
            field1361[++Statics.field627 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 2613) {
            field1361[++Statics.field627 - 1] = var3.field2758.method17();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cu.z(ILcy;ZI)I")
    public static int method1646(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field627 -= 2;
            int var3 = field1361[Statics.field627];
            int var4 = field1361[Statics.field627 + 1];
            class254 var5 = (class254) class254.field3416.method3235((long) var3);
            class254 var6;
            if (var5 == null) {
                byte[] var7 = Statics.field3410.method3768(8, var3);
                class254 var8 = new class254();
                if (var7 != null) {
                    var8.method4114(new class174(var7));
                }
                class254.field3416.method3234(var8, (long) var3);
                var6 = var8;
            } else {
                var6 = var5;
            }
            class254 var9 = var6;
            if (var6.field3413 != 's') {
            }
            for (int var10 = 0; var10 < var9.field3411; var10++) {
                if (var9.field3417[var10] == var4) {
                    field1362[++Statics.field667 - 1] = var9.field3418[var10];
                    var9 = null;
                    break;
                }
            }
            if (var9 != null) {
                field1362[++Statics.field667 - 1] = var9.field3414;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field627 -= 4;
            int var11 = field1361[Statics.field627];
            int var12 = field1361[Statics.field627 + 1];
            int var13 = field1361[Statics.field627 + 2];
            int var14 = field1361[Statics.field627 + 3];
            class254 var15 = (class254) class254.field3416.method3235((long) var13);
            class254 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field3410.method3768(8, var13);
                class254 var18 = new class254();
                if (var17 != null) {
                    var18.method4114(new class174(var17));
                }
                class254.field3416.method3234(var18, (long) var13);
                var16 = var18;
            } else {
                var16 = var15;
            }
            class254 var19 = var16;
            if (var16.field3412 != var11 || var16.field3413 != var12) {
                if (var12 == 115) {
                    field1362[++Statics.field667 - 1] = "null";
                } else {
                    field1361[++Statics.field627 - 1] = 0;
                }
                return 1;
            }
            for (int var20 = 0; var20 < var19.field3411; var20++) {
                if (var19.field3417[var20] == var14) {
                    if (var12 == 115) {
                        field1362[++Statics.field667 - 1] = var19.field3418[var20];
                    } else {
                        field1361[++Statics.field627 - 1] = var19.field3419[var20];
                    }
                    var19 = null;
                    break;
                }
            }
            if (var19 != null) {
                if (var12 == 115) {
                    field1362[++Statics.field667 - 1] = var19.field3414;
                } else {
                    field1361[++Statics.field627 - 1] = var19.field3415;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ey.l(ILcy;ZI)I")
    public static int method2647(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field627 -= 2;
            int var3 = field1361[Statics.field627];
            int var4 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field627 -= 2;
            int var5 = field1361[Statics.field627];
            int var6 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field627 -= 2;
            int var7 = field1361[Statics.field627];
            int var8 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field627 -= 2;
            int var9 = field1361[Statics.field627];
            int var10 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field627 -= 5;
            int var13 = field1361[Statics.field627];
            int var14 = field1361[Statics.field627 + 1];
            int var15 = field1361[Statics.field627 + 2];
            int var16 = field1361[Statics.field627 + 3];
            int var17 = field1361[Statics.field627 + 4];
            field1361[++Statics.field627 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field627 -= 2;
            int var18 = field1361[Statics.field627];
            int var19 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field627 -= 2;
            int var20 = field1361[Statics.field627];
            int var21 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field627 -= 2;
            int var22 = field1361[Statics.field627];
            int var23 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field627 -= 2;
            int var24 = field1361[Statics.field627];
            int var25 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field627 -= 2;
            int var26 = field1361[Statics.field627];
            int var27 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field627 -= 2;
            int var28 = field1361[Statics.field627];
            int var29 = field1361[Statics.field627 + 1];
            if (var28 == 0) {
                field1361[++Statics.field627 - 1] = 0;
            } else {
                field1361[++Statics.field627 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field627 -= 2;
            int var30 = field1361[Statics.field627];
            int var31 = field1361[Statics.field627 + 1];
            if (var30 == 0) {
                field1361[++Statics.field627 - 1] = 0;
            } else if (var31 == 0) {
                field1361[++Statics.field627 - 1] = Integer.MAX_VALUE;
            } else {
                field1361[++Statics.field627 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field627 -= 2;
            int var32 = field1361[Statics.field627];
            int var33 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field627 -= 2;
            int var34 = field1361[Statics.field627];
            int var35 = field1361[Statics.field627 + 1];
            field1361[++Statics.field627 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field627 -= 3;
            long var36 = (long) field1361[Statics.field627];
            long var38 = (long) field1361[Statics.field627 + 1];
            long var40 = (long) field1361[Statics.field627 + 2];
            field1361[++Statics.field627 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jr.c(ILcy;ZI)I")
    public static int method4371(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1362[--Statics.field667];
            int var4 = field1361[--Statics.field627];
            field1362[++Statics.field667 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field667 -= 2;
            String var5 = field1362[Statics.field667];
            String var6 = field1362[Statics.field667 + 1];
            field1362[++Statics.field667 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1362[--Statics.field667];
            int var8 = field1361[--Statics.field627];
            field1362[++Statics.field667 - 1] = var7 + class271.method4031(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1362[--Statics.field667];
            field1362[++Statics.field667 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1361[--Statics.field627];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1366.setTime(new Date(var11));
            int var13 = field1366.get(5);
            int var14 = field1366.get(2);
            int var15 = field1366.get(1);
            field1362[++Statics.field667 - 1] = var13 + "-" + field1360[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field667 -= 2;
            String var16 = field1362[Statics.field667];
            String var17 = field1362[Statics.field667 + 1];
            if (Statics.field803.field917 != null && Statics.field803.field917.field2623) {
                field1362[++Statics.field667 - 1] = var17;
            } else {
                field1362[++Statics.field667 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1361[--Statics.field627];
            field1362[++Statics.field667 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field667 -= 2;
            int[] var19 = field1361;
            int var20 = ++Statics.field627 - 1;
            String var21 = field1362[Statics.field667];
            String var22 = field1362[Statics.field667 + 1];
            int var23 = client.field932;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            byte var28 = 0;
            byte var29 = 0;
            int var38;
            label237: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class165.method161(var36, var23) - class165.method161(var37, var23);
                                break label237;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class165.method161(var41, var23) - class165.method161(var42, var23);
                                break label237;
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
                char var49 = class165.method2708(var43, var23);
                char var50 = class165.method2708(var45, var23);
                if (var49 != var50 && Character.toUpperCase(var49) != Character.toUpperCase(var50)) {
                    char var51 = Character.toLowerCase(var49);
                    char var52 = Character.toLowerCase(var50);
                    if (var51 != var52) {
                        var38 = class165.method161(var51, var23) - class165.method161(var52, var23);
                        break;
                    }
                }
            }
            var19[var20] = class271.method2439(var38);
            return 1;
        } else if (arg0 == 4108) {
            String var53 = field1362[--Statics.field667];
            Statics.field627 -= 2;
            int var54 = field1361[Statics.field627];
            int var55 = field1361[Statics.field627 + 1];
            byte[] var56 = Statics.field694.method3768(var55, 0);
            class264 var57 = new class264(var56);
            field1361[++Statics.field627 - 1] = var57.method4388(var53, var54);
            return 1;
        } else if (arg0 == 4109) {
            String var58 = field1362[--Statics.field667];
            Statics.field627 -= 2;
            int var59 = field1361[Statics.field627];
            int var60 = field1361[Statics.field627 + 1];
            byte[] var61 = Statics.field694.method3768(var60, 0);
            class264 var62 = new class264(var61);
            field1361[++Statics.field627 - 1] = var62.method4387(var58, var59);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field667 -= 2;
            String var63 = field1362[Statics.field667];
            String var64 = field1362[Statics.field667 + 1];
            if (field1361[--Statics.field627] == 1) {
                field1362[++Statics.field667 - 1] = var63;
            } else {
                field1362[++Statics.field667 - 1] = var64;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var65 = field1362[--Statics.field667];
            field1362[++Statics.field667 - 1] = class265.method4466(var65);
            return 1;
        } else if (arg0 == 4112) {
            String var66 = field1362[--Statics.field667];
            int var67 = field1361[--Statics.field627];
            field1362[++Statics.field667 - 1] = var66 + (char) var67;
            return 1;
        } else if (arg0 == 4113) {
            int var68 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = Statics.method2786((char) var68) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var69 = field1361[--Statics.field627];
            int[] var70 = field1361;
            int var71 = ++Statics.field627 - 1;
            char var72 = (char) var69;
            boolean var73 = var72 >= '0' && var72 <= '9' || var72 >= 'A' && var72 <= 'Z' || var72 >= 'a' && var72 <= 'z';
            var70[var71] = var73 ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var74 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = class271.method933((char) var74) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var75 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = class271.method151((char) var75) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var76 = field1362[--Statics.field667];
            if (var76 == null) {
                field1361[++Statics.field627 - 1] = 0;
            } else {
                field1361[++Statics.field627 - 1] = var76.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var77 = field1362[--Statics.field667];
            Statics.field627 -= 2;
            int var78 = field1361[Statics.field627];
            int var79 = field1361[Statics.field627 + 1];
            field1362[++Statics.field667 - 1] = var77.substring(var78, var79);
            return 1;
        } else if (arg0 == 4119) {
            String var80 = field1362[--Statics.field667];
            StringBuilder var81 = new StringBuilder(var80.length());
            boolean var82 = false;
            for (int var83 = 0; var83 < var80.length(); var83++) {
                char var84 = var80.charAt(var83);
                if (var84 == '<') {
                    var82 = true;
                } else if (var84 == '>') {
                    var82 = false;
                } else if (!var82) {
                    var81.append(var84);
                }
            }
            field1362[++Statics.field667 - 1] = var81.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var85 = field1362[--Statics.field667];
            int var86 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = var85.indexOf(var86);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field667 -= 2;
            String var87 = field1362[Statics.field667];
            String var88 = field1362[Statics.field667 + 1];
            int var89 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = var87.indexOf(var88, var89);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.b(ILcy;ZB)I")
    public static int method155(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1361[--Statics.field627];
            field1362[++Statics.field667 - 1] = class257.method3084(var3).field3505;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field627 -= 2;
            int var4 = field1361[Statics.field627];
            int var5 = field1361[Statics.field627 + 1];
            class257 var6 = class257.method3084(var4);
            if (var5 < 1 || var5 > 5 || var6.field3519[var5 - 1] == null) {
                field1362[++Statics.field667 - 1] = "";
            } else {
                field1362[++Statics.field667 - 1] = var6.field3519[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field627 -= 2;
            int var7 = field1361[Statics.field627];
            int var8 = field1361[Statics.field627 + 1];
            class257 var9 = class257.method3084(var7);
            if (var8 < 1 || var8 > 5 || var9.field3520[var8 - 1] == null) {
                field1362[++Statics.field667 - 1] = "";
            } else {
                field1362[++Statics.field667 - 1] = var9.field3520[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = class257.method3084(var10).field3510;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = class257.method3084(var11).field3529 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1361[--Statics.field627];
            class257 var13 = class257.method3084(var12);
            if (var13.field3537 == -1 && var13.field3497 >= 0) {
                field1361[++Statics.field627 - 1] = var13.field3497;
            } else {
                field1361[++Statics.field627 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1361[--Statics.field627];
            class257 var15 = class257.method3084(var14);
            if (var15.field3537 >= 0 && var15.field3497 >= 0) {
                field1361[++Statics.field627 - 1] = var15.field3497;
            } else {
                field1361[++Statics.field627 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1361[--Statics.field627];
            field1361[++Statics.field627 - 1] = class257.method3084(var16).field3518 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1361[--Statics.field627];
            class257 var18 = class257.method3084(var17);
            if (var18.field3502 == -1 && var18.field3509 >= 0) {
                field1361[++Statics.field627 - 1] = var18.field3509;
            } else {
                field1361[++Statics.field627 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1361[--Statics.field627];
            class257 var20 = class257.method3084(var19);
            if (var20.field3502 >= 0 && var20.field3509 >= 0) {
                field1361[++Statics.field627 - 1] = var20.field3509;
            } else {
                field1361[++Statics.field627 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1362[--Statics.field667];
            int var22 = field1361[--Statics.field627];
            boolean var24 = var22 == 1;
            String var25 = var21.toLowerCase();
            short[] var26 = new short[16];
            int var27 = 0;
            int var28 = 0;
            while (true) {
                if (var28 >= Statics.field1390) {
                    Statics.field297 = var26;
                    Statics.field546 = 0;
                    Statics.field570 = var27;
                    String[] var32 = new String[Statics.field570];
                    for (int var33 = 0; var33 < Statics.field570; var33++) {
                        var32[var33] = class257.method3084(var26[var33]).field3505;
                    }
                    short[] var34 = Statics.field297;
                    class171.method2795(var32, var34, 0, var32.length - 1);
                    break;
                }
                class257 var29 = class257.method3084(var28);
                if ((!var24 || var29.field3503) && var29.field3537 == -1 && var29.field3505.toLowerCase().indexOf(var25) != -1) {
                    if (var27 >= 250) {
                        Statics.field570 = -1;
                        Statics.field297 = null;
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
            field1361[++Statics.field627 - 1] = Statics.field570;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field297 == null || Statics.field546 >= Statics.field570) {
                field1361[++Statics.field627 - 1] = -1;
            } else {
                field1361[++Statics.field627 - 1] = Statics.field297[++Statics.field546 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field546 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.f(ILcy;ZI)I")
    public static int method473(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5306) {
            int[] var3 = field1361;
            int var4 = ++Statics.field627 - 1;
            int var5 = client.field1048 ? 2 : 1;
            var3[var4] = var5;
            return 1;
        } else if (arg0 == 5307) {
            int var6 = field1361[--Statics.field627];
            if (var6 == 1 || var6 == 2) {
                client.field1141 = 0L;
                if (var6 >= 2) {
                    client.field1048 = true;
                } else {
                    client.field1048 = false;
                }
                int var7 = client.field1048 ? 2 : 1;
                if (var7 == 1) {
                    Statics.field3633.method760(765, 503);
                } else {
                    Statics.field3633.method760(7680, 2160);
                }
                if (client.field934 >= 25) {
                    client.method19();
                }
            }
            return 1;
        } else if (arg0 == 5308) {
            field1361[++Statics.field627 - 1] = Statics.field248.field1326;
            return 1;
        } else if (arg0 == 5309) {
            int var8 = field1361[--Statics.field627];
            if (var8 == 1 || var8 == 2) {
                Statics.field248.field1326 = var8;
                Statics.method4();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.n(IB)V")
    public static void method1027(int arg0) {
        if (arg0 == -1 || !class217.method1012(arg0)) {
            return;
        }
        class217[] var1 = Statics.field628[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2736 != null) {
                class70 var4 = new class70();
                var4.field850 = var3;
                var4.field858 = var3.field2736;
                method230(var4, 2000000);
            }
        }
    }
}
