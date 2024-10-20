package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cu")
public class class84 {

    @ObfuscatedName("cu.v")
    public static int[] field1332 = new int[5];

    @ObfuscatedName("cu.e")
    public static int[][] field1339 = new int[5][5000];

    @ObfuscatedName("cu.l")
    public static int[] field1333 = new int[1000];

    @ObfuscatedName("cu.w")
    public static String[] field1334 = new String[1000];

    @ObfuscatedName("cu.m")
    public static int field1343 = 0;

    @ObfuscatedName("cu.u")
    public static class63[] field1336 = new class63[50];

    @ObfuscatedName("cu.t")
    public static Calendar field1338 = Calendar.getInstance();

    @ObfuscatedName("cu.c")
    public static final String[] field1327 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cu.x")
    public static int field1335 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.a(Lbf;I)V")
    public static void method1537(class70 arg0) {
        method2754(arg0, 200000);
    }

    @ObfuscatedName("fz.j(Lbf;IB)V")
    public static void method2754(class70 arg0, int arg1) {
        Object[] var2 = arg0.field840;
        class220 var3 = arg0.field835;
        boolean var4 = class220.field2799 == var3 || class220.field2803 == var3 || class220.field2794 == var3 || class220.field2795 == var3 || class220.field2796 == var3 || class220.field2797 == var3 || class220.field2798 == var3 || class220.field2806 == var3;
        class100 var15;
        if (var4) {
            Statics.field1331 = (class48) var2[0];
            class243 var5 = Statics.field663[Statics.field1331.field591];
            class220 var6 = arg0.field835;
            int var7 = var5.field3291;
            int var8 = var5.field3308;
            int var9 = (var7 << 8) + var6.field2802;
            class100 var11 = class100.method886(var9, var6);
            class100 var12;
            if (var11 == null) {
                int var13 = class225.method1677(var8, var6);
                class100 var14 = class100.method886(var13, var6);
                if (var14 == null) {
                    var12 = null;
                } else {
                    var12 = var14;
                }
            } else {
                var12 = var11;
            }
            var15 = var12;
        } else {
            int var16 = (Integer) var2[0];
            class100 var17 = (class100) class100.field1531.method3245((long) var16);
            class100 var18;
            if (var17 == null) {
                byte[] var19 = Statics.field3661.method3787(var16, 0);
                if (var19 == null) {
                    var18 = null;
                } else {
                    class100 var20 = class100.method1524(var19);
                    class100.field1531.method3247(var20, (long) var16);
                    var18 = var20;
                }
            } else {
                var18 = var17;
            }
            var15 = var18;
        }
        if (var15 == null) {
            return;
        }
        Statics.field508 = 0;
        Statics.field23 = 0;
        int var21 = -1;
        int[] var22 = var15.field1529;
        int[] var23 = var15.field1530;
        byte var24 = -1;
        field1343 = 0;
        try {
            Statics.field1329 = new int[var15.field1532];
            int var25 = 0;
            Statics.field1330 = new String[var15.field1535];
            int var26 = 0;
            for (int var27 = 1; var27 < var2.length; var27++) {
                if (var2[var27] instanceof Integer) {
                    int var28 = (Integer) var2[var27];
                    if (var28 == -2147483647) {
                        var28 = arg0.field832;
                    }
                    if (var28 == -2147483646) {
                        var28 = arg0.field829;
                    }
                    if (var28 == -2147483645) {
                        var28 = arg0.field831 == null ? -1 : arg0.field831.field2654;
                    }
                    if (var28 == -2147483644) {
                        var28 = arg0.field833;
                    }
                    if (var28 == -2147483643) {
                        var28 = arg0.field831 == null ? -1 : arg0.field831.field2711;
                    }
                    if (var28 == -2147483642) {
                        var28 = arg0.field834 == null ? -1 : arg0.field834.field2654;
                    }
                    if (var28 == -2147483641) {
                        var28 = arg0.field834 == null ? -1 : arg0.field834.field2711;
                    }
                    if (var28 == -2147483640) {
                        var28 = arg0.field839;
                    }
                    if (var28 == -2147483639) {
                        var28 = arg0.field837;
                    }
                    Statics.field1329[var25++] = var28;
                } else if (var2[var27] instanceof String) {
                    String var29 = (String) var2[var27];
                    if (var29.equals("event_opbase")) {
                        var29 = arg0.field838;
                    }
                    Statics.field1330[var26++] = var29;
                }
            }
            int var30 = 0;
            field1335 = arg0.field836;
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
                                                                                                                label1783: while (true) {
                                                                                                                    var30++;
                                                                                                                    if (var30 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var21++;
                                                                                                                    int var347 = var22[var21];
                                                                                                                    if (var347 >= 100) {
                                                                                                                        boolean var72;
                                                                                                                        if (var15.field1530[var21] == 1) {
                                                                                                                            var72 = true;
                                                                                                                        } else {
                                                                                                                            var72 = false;
                                                                                                                        }
                                                                                                                        int var73;
                                                                                                                        if (var347 < 1000) {
                                                                                                                            var73 = method628(var347, var15, var72);
                                                                                                                        } else if (var347 < 1100) {
                                                                                                                            var73 = method1637(var347, var15, var72);
                                                                                                                        } else if (var347 < 1200) {
                                                                                                                            var73 = method3085(var347, var15, var72);
                                                                                                                        } else if (var347 < 1300) {
                                                                                                                            var73 = method141(var347, var15, var72);
                                                                                                                        } else if (var347 < 1400) {
                                                                                                                            var73 = method18(var347, var15, var72);
                                                                                                                        } else if (var347 < 1500) {
                                                                                                                            var73 = method2798(var347, var15, var72);
                                                                                                                        } else if (var347 < 1600) {
                                                                                                                            class217 var77 = var72 ? Statics.field1337 : Statics.field10;
                                                                                                                            byte var78;
                                                                                                                            if (var347 == 1500) {
                                                                                                                                field1333[++Statics.field508 - 1] = var77.field2667;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var347 == 1501) {
                                                                                                                                field1333[++Statics.field508 - 1] = var77.field2647;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var347 == 1502) {
                                                                                                                                field1333[++Statics.field508 - 1] = var77.field2669;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var347 == 1503) {
                                                                                                                                field1333[++Statics.field508 - 1] = var77.field2694;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var347 == 1504) {
                                                                                                                                field1333[++Statics.field508 - 1] = var77.field2674 ? 1 : 0;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var347 == 1505) {
                                                                                                                                field1333[++Statics.field508 - 1] = var77.field2673;
                                                                                                                                var78 = 1;
                                                                                                                            } else {
                                                                                                                                var78 = 2;
                                                                                                                            }
                                                                                                                            var73 = var78;
                                                                                                                        } else if (var347 < 1700) {
                                                                                                                            var73 = method3743(var347, var15, var72);
                                                                                                                        } else if (var347 < 1800) {
                                                                                                                            class217 var82 = var72 ? Statics.field1337 : Statics.field10;
                                                                                                                            byte var83;
                                                                                                                            if (var347 == 1700) {
                                                                                                                                field1333[++Statics.field508 - 1] = var82.field2774;
                                                                                                                                var83 = 1;
                                                                                                                            } else if (var347 == 1701) {
                                                                                                                                if (var82.field2774 == -1) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var82.field2699;
                                                                                                                                }
                                                                                                                                var83 = 1;
                                                                                                                            } else if (var347 == 1702) {
                                                                                                                                field1333[++Statics.field508 - 1] = var82.field2711;
                                                                                                                                var83 = 1;
                                                                                                                            } else {
                                                                                                                                var83 = 2;
                                                                                                                            }
                                                                                                                            var73 = var83;
                                                                                                                        } else if (var347 < 1900) {
                                                                                                                            class217 var84 = var72 ? Statics.field1337 : Statics.field10;
                                                                                                                            byte var89;
                                                                                                                            if (var347 == 1800) {
                                                                                                                                int[] var85 = field1333;
                                                                                                                                int var86 = ++Statics.field508 - 1;
                                                                                                                                int var87 = client.method619(var84);
                                                                                                                                int var88 = var87 >> 11 & 0x3F;
                                                                                                                                var85[var86] = var88;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var347 == 1801) {
                                                                                                                                int var90 = field1333[--Statics.field508];
                                                                                                                                int var348 = var90 - 1;
                                                                                                                                if (var84.field2728 == null || var348 >= var84.field2728.length || var84.field2728[var348] == null) {
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = var84.field2728[var348];
                                                                                                                                }
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var347 == 1802) {
                                                                                                                                if (var84.field2645 == null) {
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = var84.field2645;
                                                                                                                                }
                                                                                                                                var89 = 1;
                                                                                                                            } else {
                                                                                                                                var89 = 2;
                                                                                                                            }
                                                                                                                            var73 = var89;
                                                                                                                        } else if (var347 < 2000) {
                                                                                                                            var73 = method142(var347, var15, var72);
                                                                                                                        } else if (var347 < 2100) {
                                                                                                                            var73 = method1637(var347, var15, var72);
                                                                                                                        } else if (var347 < 2200) {
                                                                                                                            var73 = method3085(var347, var15, var72);
                                                                                                                        } else if (var347 < 2300) {
                                                                                                                            var73 = method141(var347, var15, var72);
                                                                                                                        } else if (var347 < 2400) {
                                                                                                                            var73 = method18(var347, var15, var72);
                                                                                                                        } else if (var347 < 2500) {
                                                                                                                            var73 = method2798(var347, var15, var72);
                                                                                                                        } else if (var347 < 2600) {
                                                                                                                            var73 = method1024(var347, var15, var72);
                                                                                                                        } else if (var347 < 2700) {
                                                                                                                            var73 = method1369(var347, var15, var72);
                                                                                                                        } else if (var347 < 2800) {
                                                                                                                            var73 = method314(var347, var15, var72);
                                                                                                                        } else if (var347 < 2900) {
                                                                                                                            var73 = method452(var347, var15, var72);
                                                                                                                        } else if (var347 < 3000) {
                                                                                                                            var73 = method142(var347, var15, var72);
                                                                                                                        } else if (var347 < 3200) {
                                                                                                                            var73 = method1580(var347, var15, var72);
                                                                                                                        } else if (var347 < 3300) {
                                                                                                                            var73 = method17(var347, var15, var72);
                                                                                                                        } else if (var347 < 3400) {
                                                                                                                            var73 = method3751(var347, var15, var72);
                                                                                                                        } else if (var347 < 3500) {
                                                                                                                            byte var95;
                                                                                                                            if (var347 == 3400) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var91 = field1333[Statics.field508];
                                                                                                                                int var92 = field1333[Statics.field508 + 1];
                                                                                                                                class254 var93 = Statics.method44(var91);
                                                                                                                                if (var93.field3398 != 's') {
                                                                                                                                }
                                                                                                                                for (int var94 = 0; var94 < var93.field3401; var94++) {
                                                                                                                                    if (var93.field3406[var94] == var92) {
                                                                                                                                        field1334[++Statics.field23 - 1] = var93.field3404[var94];
                                                                                                                                        var93 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var93 != null) {
                                                                                                                                    field1334[++Statics.field23 - 1] = var93.field3399;
                                                                                                                                }
                                                                                                                                var95 = 1;
                                                                                                                            } else if (var347 == 3408) {
                                                                                                                                Statics.field508 -= 4;
                                                                                                                                int var96 = field1333[Statics.field508];
                                                                                                                                int var97 = field1333[Statics.field508 + 1];
                                                                                                                                int var98 = field1333[Statics.field508 + 2];
                                                                                                                                int var99 = field1333[Statics.field508 + 3];
                                                                                                                                class254 var100 = Statics.method44(var98);
                                                                                                                                if (var100.field3397 == var96 && var100.field3398 == var97) {
                                                                                                                                    for (int var101 = 0; var101 < var100.field3401; var101++) {
                                                                                                                                        if (var100.field3406[var101] == var99) {
                                                                                                                                            if (var97 == 115) {
                                                                                                                                                field1334[++Statics.field23 - 1] = var100.field3404[var101];
                                                                                                                                            } else {
                                                                                                                                                field1333[++Statics.field508 - 1] = var100.field3403[var101];
                                                                                                                                            }
                                                                                                                                            var100 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var100 != null) {
                                                                                                                                        if (var97 == 115) {
                                                                                                                                            field1334[++Statics.field23 - 1] = var100.field3399;
                                                                                                                                        } else {
                                                                                                                                            field1333[++Statics.field508 - 1] = var100.field3402;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var95 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var97 == 115) {
                                                                                                                                        field1334[++Statics.field23 - 1] = "null";
                                                                                                                                    } else {
                                                                                                                                        field1333[++Statics.field508 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var95 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var95 = 2;
                                                                                                                            }
                                                                                                                            var73 = var95;
                                                                                                                        } else if (var347 < 3700) {
                                                                                                                            byte var102;
                                                                                                                            if (var347 == 3600) {
                                                                                                                                if (client.field1057 == 0) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -2;
                                                                                                                                } else if (client.field1057 == 1) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = client.field1172;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3601) {
                                                                                                                                int var103 = field1333[--Statics.field508];
                                                                                                                                if (client.field1057 == 2 && var103 < client.field1172) {
                                                                                                                                    field1334[++Statics.field23 - 1] = client.field1089[var103].field805;
                                                                                                                                    field1334[++Statics.field23 - 1] = client.field1089[var103].field801;
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3602) {
                                                                                                                                int var104 = field1333[--Statics.field508];
                                                                                                                                if (client.field1057 == 2 && var104 < client.field1172) {
                                                                                                                                    field1333[++Statics.field508 - 1] = client.field1089[var104].field803;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3603) {
                                                                                                                                int var105 = field1333[--Statics.field508];
                                                                                                                                if (client.field1057 == 2 && var105 < client.field1172) {
                                                                                                                                    field1333[++Statics.field508 - 1] = client.field1089[var105].field804;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3604) {
                                                                                                                                String var106 = field1334[--Statics.field23];
                                                                                                                                int var107 = field1333[--Statics.field508];
                                                                                                                                client.method2255(var106, var107);
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3605) {
                                                                                                                                String var108 = field1334[--Statics.field23];
                                                                                                                                if (var108 != null) {
                                                                                                                                    if ((client.field1172 < 200 || client.field1029 == 1) && client.field1172 < 400) {
                                                                                                                                        String var109 = class268.method3406(var108, Statics.field2318);
                                                                                                                                        if (var109 != null) {
                                                                                                                                            int var110 = 0;
                                                                                                                                            label1595: while (true) {
                                                                                                                                                if (var110 >= client.field1172) {
                                                                                                                                                    for (int var114 = 0; var114 < client.field1176; var114++) {
                                                                                                                                                        class71 var115 = client.field1177[var114];
                                                                                                                                                        String var116 = class268.method3406(var115.field846, Statics.field2318);
                                                                                                                                                        if (var116 != null && var116.equals(var109)) {
                                                                                                                                                            class99.method973(30, "", class226.field3120 + var108 + class226.field3033);
                                                                                                                                                            break label1595;
                                                                                                                                                        }
                                                                                                                                                        if (var115.field843 != null) {
                                                                                                                                                            String var117 = class268.method3406(var115.field843, Statics.field2318);
                                                                                                                                                            if (var117 != null && var117.equals(var109)) {
                                                                                                                                                                class99.method973(30, "", class226.field3120 + var108 + class226.field3033);
                                                                                                                                                                break label1595;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (class268.method3406(Statics.field1537.field878, Statics.field2318).equals(var109)) {
                                                                                                                                                        class99.method973(30, "", class226.field2973);
                                                                                                                                                    } else {
                                                                                                                                                        client.field949.method3136(6);
                                                                                                                                                        client.field949.method2908(class174.method2644(var108));
                                                                                                                                                        client.field949.method2862(var108);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class66 var111 = client.field1089[var110];
                                                                                                                                                String var112 = class268.method3406(var111.field805, Statics.field2318);
                                                                                                                                                if (var112 != null && var112.equals(var109)) {
                                                                                                                                                    class99.method973(30, "", var108 + class226.field3027);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var111.field801 != null) {
                                                                                                                                                    String var113 = class268.method3406(var111.field801, Statics.field2318);
                                                                                                                                                    if (var113 != null && var113.equals(var109)) {
                                                                                                                                                        class99.method973(30, "", var108 + class226.field3027);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var110++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class99.method973(30, "", class226.field3061);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3606) {
                                                                                                                                String var118 = field1334[--Statics.field23];
                                                                                                                                client.method566(var118);
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3607) {
                                                                                                                                String var119 = field1334[--Statics.field23];
                                                                                                                                if (var119 != null) {
                                                                                                                                    if ((client.field1176 < 100 || client.field1029 == 1) && client.field1176 < 400) {
                                                                                                                                        String var120 = class268.method3406(var119, Statics.field2318);
                                                                                                                                        if (var120 != null) {
                                                                                                                                            int var121 = 0;
                                                                                                                                            label1629: while (true) {
                                                                                                                                                if (var121 >= client.field1176) {
                                                                                                                                                    for (int var125 = 0; var125 < client.field1172; var125++) {
                                                                                                                                                        class66 var126 = client.field1089[var125];
                                                                                                                                                        String var127 = class268.method3406(var126.field805, Statics.field2318);
                                                                                                                                                        if (var127 != null && var127.equals(var120)) {
                                                                                                                                                            class99.method973(31, "", class226.field2946 + var119 + class226.field3035);
                                                                                                                                                            break label1629;
                                                                                                                                                        }
                                                                                                                                                        if (var126.field801 != null) {
                                                                                                                                                            String var128 = class268.method3406(var126.field801, Statics.field2318);
                                                                                                                                                            if (var128 != null && var128.equals(var120)) {
                                                                                                                                                                class99.method973(31, "", class226.field2946 + var119 + class226.field3035);
                                                                                                                                                                break label1629;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (class268.method3406(Statics.field1537.field878, Statics.field2318).equals(var120)) {
                                                                                                                                                        class99.method973(31, "", class226.field2995);
                                                                                                                                                    } else {
                                                                                                                                                        client.field949.method3136(195);
                                                                                                                                                        client.field949.method2908(class174.method2644(var119));
                                                                                                                                                        client.field949.method2862(var119);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class71 var122 = client.field1177[var121];
                                                                                                                                                String var123 = class268.method3406(var122.field846, Statics.field2318);
                                                                                                                                                if (var123 != null && var123.equals(var120)) {
                                                                                                                                                    class99.method973(31, "", var119 + class226.field3029);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var122.field843 != null) {
                                                                                                                                                    String var124 = class268.method3406(var122.field843, Statics.field2318);
                                                                                                                                                    if (var124 != null && var124.equals(var120)) {
                                                                                                                                                        class99.method973(31, "", var119 + class226.field3029);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var121++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class99.method973(31, "", class226.field3028);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3608) {
                                                                                                                                String var129 = field1334[--Statics.field23];
                                                                                                                                client.method1673(var129);
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3609) {
                                                                                                                                String var130 = field1334[--Statics.field23];
                                                                                                                                class231[] var131 = new class231[] { class231.field3177, class231.field3176, class231.field3175, class231.field3181, class231.field3178, class231.field3180 };
                                                                                                                                class231[] var132 = var131;
                                                                                                                                for (int var133 = 0; var133 < var132.length; var133++) {
                                                                                                                                    class231 var134 = var132[var133];
                                                                                                                                    if (var134.field3179 != -1 && var130.startsWith(class89.method1373(var134.field3179))) {
                                                                                                                                        var130 = var130.substring(6 + Integer.toString(var134.field3179).length());
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1333[++Statics.field508 - 1] = client.method189(var130, false) ? 1 : 0;
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3611) {
                                                                                                                                if (client.field1132 == null) {
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = Statics.method3910(client.field1132);
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3612) {
                                                                                                                                if (client.field1132 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = Statics.field2233;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3613) {
                                                                                                                                int var135 = field1333[--Statics.field508];
                                                                                                                                if (client.field1132 == null || var135 >= Statics.field2233) {
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = Statics.field571[var135].field904;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3614) {
                                                                                                                                int var136 = field1333[--Statics.field508];
                                                                                                                                if (client.field1132 == null || var136 >= Statics.field2233) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = Statics.field571[var136].field906;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3615) {
                                                                                                                                int var137 = field1333[--Statics.field508];
                                                                                                                                if (client.field1132 == null || var137 >= Statics.field2233) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = Statics.field571[var137].field901;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3616) {
                                                                                                                                field1333[++Statics.field508 - 1] = Statics.field2134;
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3617) {
                                                                                                                                String var138 = field1334[--Statics.field23];
                                                                                                                                if (Statics.field571 != null) {
                                                                                                                                    client.field949.method3136(182);
                                                                                                                                    client.field949.method2908(class174.method2644(var138));
                                                                                                                                    client.field949.method2862(var138);
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3618) {
                                                                                                                                field1333[++Statics.field508 - 1] = Statics.field391;
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3619) {
                                                                                                                                String var139 = field1334[--Statics.field23];
                                                                                                                                client.method11(var139);
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3620) {
                                                                                                                                client.method1371();
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3621) {
                                                                                                                                if (client.field1057 == 0) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = client.field1176;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3622) {
                                                                                                                                int var140 = field1333[--Statics.field508];
                                                                                                                                if (client.field1057 == 0 || var140 >= client.field1176) {
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = client.field1177[var140].field846;
                                                                                                                                    field1334[++Statics.field23 - 1] = client.field1177[var140].field843;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3623) {
                                                                                                                                String var141 = field1334[--Statics.field23];
                                                                                                                                if (var141.startsWith(class89.method1373(0)) || var141.startsWith(class89.method1373(1))) {
                                                                                                                                    var141 = var141.substring(7);
                                                                                                                                }
                                                                                                                                field1333[++Statics.field508 - 1] = client.method2655(var141) ? 1 : 0;
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3624) {
                                                                                                                                int var142 = field1333[--Statics.field508];
                                                                                                                                if (Statics.field571 == null || var142 >= Statics.field2233 || !Statics.field571[var142].field904.equalsIgnoreCase(Statics.field1537.field878)) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = 1;
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else if (var347 == 3625) {
                                                                                                                                if (client.field1058 == null) {
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = Statics.method3910(client.field1058);
                                                                                                                                }
                                                                                                                                var102 = 1;
                                                                                                                            } else {
                                                                                                                                var102 = 2;
                                                                                                                            }
                                                                                                                            var73 = var102;
                                                                                                                        } else if (var347 < 4000) {
                                                                                                                            var73 = method167(var347, var15, var72);
                                                                                                                        } else if (var347 < 4100) {
                                                                                                                            byte var145;
                                                                                                                            if (var347 == 4000) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var143 = field1333[Statics.field508];
                                                                                                                                int var144 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var143 + var144;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4001) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var146 = field1333[Statics.field508];
                                                                                                                                int var147 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var146 - var147;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4002) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var148 = field1333[Statics.field508];
                                                                                                                                int var149 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var148 * var149;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4003) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var150 = field1333[Statics.field508];
                                                                                                                                int var151 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var150 / var151;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4004) {
                                                                                                                                int var152 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = (int) (Math.random() * (double) var152);
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4005) {
                                                                                                                                int var153 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = (int) (Math.random() * (double) (var153 + 1));
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4006) {
                                                                                                                                Statics.field508 -= 5;
                                                                                                                                int var154 = field1333[Statics.field508];
                                                                                                                                int var155 = field1333[Statics.field508 + 1];
                                                                                                                                int var156 = field1333[Statics.field508 + 2];
                                                                                                                                int var157 = field1333[Statics.field508 + 3];
                                                                                                                                int var158 = field1333[Statics.field508 + 4];
                                                                                                                                field1333[++Statics.field508 - 1] = (var155 - var154) * (var158 - var156) / (var157 - var156) + var154;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4007) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var159 = field1333[Statics.field508];
                                                                                                                                int var160 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var159 * var160 / 100 + var159;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4008) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var161 = field1333[Statics.field508];
                                                                                                                                int var162 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var161 | 0x1 << var162;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4009) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var163 = field1333[Statics.field508];
                                                                                                                                int var164 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var163 & -1 - (0x1 << var164);
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4010) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var165 = field1333[Statics.field508];
                                                                                                                                int var166 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = (var165 & 0x1 << var166) == 0 ? 0 : 1;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4011) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var167 = field1333[Statics.field508];
                                                                                                                                int var168 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var167 % var168;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4012) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var169 = field1333[Statics.field508];
                                                                                                                                int var170 = field1333[Statics.field508 + 1];
                                                                                                                                if (var169 == 0) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = (int) Math.pow((double) var169, (double) var170);
                                                                                                                                }
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4013) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var171 = field1333[Statics.field508];
                                                                                                                                int var172 = field1333[Statics.field508 + 1];
                                                                                                                                if (var171 == 0) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else if (var172 == 0) {
                                                                                                                                    field1333[++Statics.field508 - 1] = Integer.MAX_VALUE;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = (int) Math.pow((double) var171, 1.0D / (double) var172);
                                                                                                                                }
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4014) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var173 = field1333[Statics.field508];
                                                                                                                                int var174 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var173 & var174;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4015) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var175 = field1333[Statics.field508];
                                                                                                                                int var176 = field1333[Statics.field508 + 1];
                                                                                                                                field1333[++Statics.field508 - 1] = var175 | var176;
                                                                                                                                var145 = 1;
                                                                                                                            } else if (var347 == 4018) {
                                                                                                                                Statics.field508 -= 3;
                                                                                                                                long var177 = (long) field1333[Statics.field508];
                                                                                                                                long var179 = (long) field1333[Statics.field508 + 1];
                                                                                                                                long var181 = (long) field1333[Statics.field508 + 2];
                                                                                                                                field1333[++Statics.field508 - 1] = (int) (var177 * var181 / var179);
                                                                                                                                var145 = 1;
                                                                                                                            } else {
                                                                                                                                var145 = 2;
                                                                                                                            }
                                                                                                                            var73 = var145;
                                                                                                                        } else if (var347 < 4200) {
                                                                                                                            byte var185;
                                                                                                                            if (var347 == 4100) {
                                                                                                                                String var183 = field1334[--Statics.field23];
                                                                                                                                int var184 = field1333[--Statics.field508];
                                                                                                                                field1334[++Statics.field23 - 1] = var183 + var184;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4101) {
                                                                                                                                Statics.field23 -= 2;
                                                                                                                                String var186 = field1334[Statics.field23];
                                                                                                                                String var187 = field1334[Statics.field23 + 1];
                                                                                                                                field1334[++Statics.field23 - 1] = var186 + var187;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4102) {
                                                                                                                                String var188 = field1334[--Statics.field23];
                                                                                                                                int var189 = field1333[--Statics.field508];
                                                                                                                                field1334[++Statics.field23 - 1] = var188 + class271.method888(var189, true);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4103) {
                                                                                                                                String var190 = field1334[--Statics.field23];
                                                                                                                                field1334[++Statics.field23 - 1] = var190.toLowerCase();
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4104) {
                                                                                                                                int var191 = field1333[--Statics.field508];
                                                                                                                                long var192 = ((long) var191 + 11745L) * 86400000L;
                                                                                                                                field1338.setTime(new Date(var192));
                                                                                                                                int var194 = field1338.get(5);
                                                                                                                                int var195 = field1338.get(2);
                                                                                                                                int var196 = field1338.get(1);
                                                                                                                                field1334[++Statics.field23 - 1] = var194 + "-" + field1327[var195] + "-" + var196;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4105) {
                                                                                                                                Statics.field23 -= 2;
                                                                                                                                String var197 = field1334[Statics.field23];
                                                                                                                                String var198 = field1334[Statics.field23 + 1];
                                                                                                                                if (Statics.field1537.field869 != null && Statics.field1537.field869.field2621) {
                                                                                                                                    field1334[++Statics.field23 - 1] = var198;
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = var197;
                                                                                                                                }
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4106) {
                                                                                                                                int var199 = field1333[--Statics.field508];
                                                                                                                                field1334[++Statics.field23 - 1] = Integer.toString(var199);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4107) {
                                                                                                                                Statics.field23 -= 2;
                                                                                                                                int[] var200 = field1333;
                                                                                                                                int var201 = ++Statics.field508 - 1;
                                                                                                                                int var202 = Statics.method1586(field1334[Statics.field23], field1334[Statics.field23 + 1], client.field913);
                                                                                                                                byte var203;
                                                                                                                                if (var202 > 0) {
                                                                                                                                    var203 = 1;
                                                                                                                                } else if (var202 < 0) {
                                                                                                                                    var203 = -1;
                                                                                                                                } else {
                                                                                                                                    var203 = 0;
                                                                                                                                }
                                                                                                                                var200[var201] = var203;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4108) {
                                                                                                                                String var204 = field1334[--Statics.field23];
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var205 = field1333[Statics.field508];
                                                                                                                                int var206 = field1333[Statics.field508 + 1];
                                                                                                                                byte[] var207 = Statics.field882.method3787(var206, 0);
                                                                                                                                class264 var208 = new class264(var207);
                                                                                                                                field1333[++Statics.field508 - 1] = var208.method4343(var204, var205);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4109) {
                                                                                                                                String var209 = field1334[--Statics.field23];
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var210 = field1333[Statics.field508];
                                                                                                                                int var211 = field1333[Statics.field508 + 1];
                                                                                                                                byte[] var212 = Statics.field882.method3787(var211, 0);
                                                                                                                                class264 var213 = new class264(var212);
                                                                                                                                field1333[++Statics.field508 - 1] = var213.method4342(var209, var210);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4110) {
                                                                                                                                Statics.field23 -= 2;
                                                                                                                                String var214 = field1334[Statics.field23];
                                                                                                                                String var215 = field1334[Statics.field23 + 1];
                                                                                                                                if (field1333[--Statics.field508] == 1) {
                                                                                                                                    field1334[++Statics.field23 - 1] = var214;
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = var215;
                                                                                                                                }
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4111) {
                                                                                                                                String var216 = field1334[--Statics.field23];
                                                                                                                                field1334[++Statics.field23 - 1] = class265.method4344(var216);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4112) {
                                                                                                                                String var217 = field1334[--Statics.field23];
                                                                                                                                int var218 = field1333[--Statics.field508];
                                                                                                                                field1334[++Statics.field23 - 1] = var217 + (char) var218;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4113) {
                                                                                                                                int var219 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = class271.method3755((char) var219) ? 1 : 0;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4114) {
                                                                                                                                int var220 = field1333[--Statics.field508];
                                                                                                                                int[] var221 = field1333;
                                                                                                                                int var222 = ++Statics.field508 - 1;
                                                                                                                                char var223 = (char) var220;
                                                                                                                                boolean var224 = var223 >= '0' && var223 <= '9' || var223 >= 'A' && var223 <= 'Z' || var223 >= 'a' && var223 <= 'z';
                                                                                                                                var221[var222] = var224 ? 1 : 0;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4115) {
                                                                                                                                int var225 = field1333[--Statics.field508];
                                                                                                                                int[] var226 = field1333;
                                                                                                                                int var227 = ++Statics.field508 - 1;
                                                                                                                                char var228 = (char) var225;
                                                                                                                                boolean var229 = var228 >= 'A' && var228 <= 'Z' || var228 >= 'a' && var228 <= 'z';
                                                                                                                                var226[var227] = var229 ? 1 : 0;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4116) {
                                                                                                                                int var230 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = class271.method2801((char) var230) ? 1 : 0;
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4117) {
                                                                                                                                String var231 = field1334[--Statics.field23];
                                                                                                                                if (var231 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var231.length();
                                                                                                                                }
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4118) {
                                                                                                                                String var232 = field1334[--Statics.field23];
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var233 = field1333[Statics.field508];
                                                                                                                                int var234 = field1333[Statics.field508 + 1];
                                                                                                                                field1334[++Statics.field23 - 1] = var232.substring(var233, var234);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4119) {
                                                                                                                                String var235 = field1334[--Statics.field23];
                                                                                                                                StringBuilder var236 = new StringBuilder(var235.length());
                                                                                                                                boolean var237 = false;
                                                                                                                                for (int var238 = 0; var238 < var235.length(); var238++) {
                                                                                                                                    char var239 = var235.charAt(var238);
                                                                                                                                    if (var239 == '<') {
                                                                                                                                        var237 = true;
                                                                                                                                    } else if (var239 == '>') {
                                                                                                                                        var237 = false;
                                                                                                                                    } else if (!var237) {
                                                                                                                                        var236.append(var239);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1334[++Statics.field23 - 1] = var236.toString();
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4120) {
                                                                                                                                String var240 = field1334[--Statics.field23];
                                                                                                                                int var241 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = var240.indexOf(var241);
                                                                                                                                var185 = 1;
                                                                                                                            } else if (var347 == 4121) {
                                                                                                                                Statics.field23 -= 2;
                                                                                                                                String var242 = field1334[Statics.field23];
                                                                                                                                String var243 = field1334[Statics.field23 + 1];
                                                                                                                                int var244 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = var242.indexOf(var243, var244);
                                                                                                                                var185 = 1;
                                                                                                                            } else {
                                                                                                                                var185 = 2;
                                                                                                                            }
                                                                                                                            var73 = var185;
                                                                                                                        } else if (var347 < 4300) {
                                                                                                                            var73 = method710(var347, var15, var72);
                                                                                                                        } else if (var347 < 5100) {
                                                                                                                            byte var245;
                                                                                                                            if (var347 == 5000) {
                                                                                                                                field1333[++Statics.field508 - 1] = client.field1061;
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5001) {
                                                                                                                                Statics.field508 -= 3;
                                                                                                                                client.field1061 = field1333[Statics.field508];
                                                                                                                                int var246 = field1333[Statics.field508 + 1];
                                                                                                                                class277[] var247 = new class277[] { class277.field3733, class277.field3731, class277.field3735 };
                                                                                                                                class277[] var248 = var247;
                                                                                                                                int var249 = 0;
                                                                                                                                class277 var251;
                                                                                                                                while (true) {
                                                                                                                                    if (var249 >= var248.length) {
                                                                                                                                        var251 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    class277 var250 = var248[var249];
                                                                                                                                    if (var250.field3732 == var246) {
                                                                                                                                        var251 = var250;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    var249++;
                                                                                                                                }
                                                                                                                                Statics.field733 = var251;
                                                                                                                                if (Statics.field733 == null) {
                                                                                                                                    Statics.field733 = class277.field3735;
                                                                                                                                }
                                                                                                                                client.field1124 = field1333[Statics.field508 + 2];
                                                                                                                                client.field949.method3136(153);
                                                                                                                                client.field949.method2908(client.field1061);
                                                                                                                                client.field949.method2908(Statics.field733.field3732);
                                                                                                                                client.field949.method2908(client.field1124);
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5002) {
                                                                                                                                String var252 = field1334[--Statics.field23];
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var253 = field1333[Statics.field508];
                                                                                                                                int var254 = field1333[Statics.field508 + 1];
                                                                                                                                client.field949.method3136(166);
                                                                                                                                client.field949.method2908(class174.method2644(var252) + 2);
                                                                                                                                client.field949.method2862(var252);
                                                                                                                                client.field949.method2908(var253 - 1);
                                                                                                                                client.field949.method2908(var254);
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5003) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var255 = field1333[Statics.field508];
                                                                                                                                int var256 = field1333[Statics.field508 + 1];
                                                                                                                                class73 var257 = class99.method970(var255, var256);
                                                                                                                                if (var257 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var257.field861;
                                                                                                                                    field1333[++Statics.field508 - 1] = var257.field859;
                                                                                                                                    field1334[++Statics.field23 - 1] = var257.field856 == null ? "" : var257.field856;
                                                                                                                                    field1334[++Statics.field23 - 1] = var257.field855 == null ? "" : var257.field855;
                                                                                                                                    field1334[++Statics.field23 - 1] = var257.field860 == null ? "" : var257.field860;
                                                                                                                                }
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5004) {
                                                                                                                                int var258 = field1333[--Statics.field508];
                                                                                                                                class73 var259 = class99.method1844(var258);
                                                                                                                                if (var259 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var259.field857;
                                                                                                                                    field1333[++Statics.field508 - 1] = var259.field859;
                                                                                                                                    field1334[++Statics.field23 - 1] = var259.field856 == null ? "" : var259.field856;
                                                                                                                                    field1334[++Statics.field23 - 1] = var259.field855 == null ? "" : var259.field855;
                                                                                                                                    field1334[++Statics.field23 - 1] = var259.field860 == null ? "" : var259.field860;
                                                                                                                                }
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5005) {
                                                                                                                                if (Statics.field733 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = Statics.field733.field3732;
                                                                                                                                }
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5008) {
                                                                                                                                String var260 = field1334[--Statics.field23];
                                                                                                                                int var261 = field1333[--Statics.field508];
                                                                                                                                String var262 = var260.toLowerCase();
                                                                                                                                byte var263 = 0;
                                                                                                                                if (var262.startsWith(class226.field3085)) {
                                                                                                                                    var263 = 0;
                                                                                                                                    var260 = var260.substring(class226.field3085.length());
                                                                                                                                } else if (var262.startsWith(class226.field2877)) {
                                                                                                                                    var263 = 1;
                                                                                                                                    var260 = var260.substring(class226.field2877.length());
                                                                                                                                } else if (var262.startsWith(class226.field2894)) {
                                                                                                                                    var263 = 2;
                                                                                                                                    var260 = var260.substring(class226.field2894.length());
                                                                                                                                } else if (var262.startsWith(class226.field3042)) {
                                                                                                                                    var263 = 3;
                                                                                                                                    var260 = var260.substring(class226.field3042.length());
                                                                                                                                } else if (var262.startsWith(class226.field3083)) {
                                                                                                                                    var263 = 4;
                                                                                                                                    var260 = var260.substring(class226.field3083.length());
                                                                                                                                } else if (var262.startsWith(class226.field3114)) {
                                                                                                                                    var263 = 5;
                                                                                                                                    var260 = var260.substring(class226.field3114.length());
                                                                                                                                } else if (var262.startsWith(class226.field3137)) {
                                                                                                                                    var263 = 6;
                                                                                                                                    var260 = var260.substring(class226.field3137.length());
                                                                                                                                } else if (var262.startsWith(class226.field3050)) {
                                                                                                                                    var263 = 7;
                                                                                                                                    var260 = var260.substring(class226.field3050.length());
                                                                                                                                } else if (var262.startsWith(class226.field3052)) {
                                                                                                                                    var263 = 8;
                                                                                                                                    var260 = var260.substring(class226.field3052.length());
                                                                                                                                } else if (var262.startsWith(class226.field3054)) {
                                                                                                                                    var263 = 9;
                                                                                                                                    var260 = var260.substring(class226.field3054.length());
                                                                                                                                } else if (var262.startsWith(class226.field3056)) {
                                                                                                                                    var263 = 10;
                                                                                                                                    var260 = var260.substring(class226.field3056.length());
                                                                                                                                } else if (var262.startsWith(class226.field3058)) {
                                                                                                                                    var263 = 11;
                                                                                                                                    var260 = var260.substring(class226.field3058.length());
                                                                                                                                } else if (client.field913 != 0) {
                                                                                                                                    if (var262.startsWith(class226.field3037)) {
                                                                                                                                        var263 = 0;
                                                                                                                                        var260 = var260.substring(class226.field3037.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3070)) {
                                                                                                                                        var263 = 1;
                                                                                                                                        var260 = var260.substring(class226.field3070.length());
                                                                                                                                    } else if (var262.startsWith(class226.field2874)) {
                                                                                                                                        var263 = 2;
                                                                                                                                        var260 = var260.substring(class226.field2874.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3043)) {
                                                                                                                                        var263 = 3;
                                                                                                                                        var260 = var260.substring(class226.field3043.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3104)) {
                                                                                                                                        var263 = 4;
                                                                                                                                        var260 = var260.substring(class226.field3104.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3047)) {
                                                                                                                                        var263 = 5;
                                                                                                                                        var260 = var260.substring(class226.field3047.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3049)) {
                                                                                                                                        var263 = 6;
                                                                                                                                        var260 = var260.substring(class226.field3049.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3080)) {
                                                                                                                                        var263 = 7;
                                                                                                                                        var260 = var260.substring(class226.field3080.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3001)) {
                                                                                                                                        var263 = 8;
                                                                                                                                        var260 = var260.substring(class226.field3001.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3055)) {
                                                                                                                                        var263 = 9;
                                                                                                                                        var260 = var260.substring(class226.field3055.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3138)) {
                                                                                                                                        var263 = 10;
                                                                                                                                        var260 = var260.substring(class226.field3138.length());
                                                                                                                                    } else if (var262.startsWith(class226.field3059)) {
                                                                                                                                        var263 = 11;
                                                                                                                                        var260 = var260.substring(class226.field3059.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                String var264 = var260.toLowerCase();
                                                                                                                                byte var265 = 0;
                                                                                                                                if (var264.startsWith(class226.field3060)) {
                                                                                                                                    var265 = 1;
                                                                                                                                    var260 = var260.substring(class226.field3060.length());
                                                                                                                                } else if (var264.startsWith(class226.field3014)) {
                                                                                                                                    var265 = 2;
                                                                                                                                    var260 = var260.substring(class226.field3014.length());
                                                                                                                                } else if (var264.startsWith(class226.field3064)) {
                                                                                                                                    var265 = 3;
                                                                                                                                    var260 = var260.substring(class226.field3064.length());
                                                                                                                                } else if (var264.startsWith(class226.field3044)) {
                                                                                                                                    var265 = 4;
                                                                                                                                    var260 = var260.substring(class226.field3044.length());
                                                                                                                                } else if (var264.startsWith(class226.field3057)) {
                                                                                                                                    var265 = 5;
                                                                                                                                    var260 = var260.substring(class226.field3057.length());
                                                                                                                                } else if (client.field913 != 0) {
                                                                                                                                    if (var264.startsWith(class226.field3116)) {
                                                                                                                                        var265 = 1;
                                                                                                                                        var260 = var260.substring(class226.field3116.length());
                                                                                                                                    } else if (var264.startsWith(class226.field3063)) {
                                                                                                                                        var265 = 2;
                                                                                                                                        var260 = var260.substring(class226.field3063.length());
                                                                                                                                    } else if (var264.startsWith(class226.field3065)) {
                                                                                                                                        var265 = 3;
                                                                                                                                        var260 = var260.substring(class226.field3065.length());
                                                                                                                                    } else if (var264.startsWith(class226.field3067)) {
                                                                                                                                        var265 = 4;
                                                                                                                                        var260 = var260.substring(class226.field3067.length());
                                                                                                                                    } else if (var264.startsWith(class226.field3069)) {
                                                                                                                                        var265 = 5;
                                                                                                                                        var260 = var260.substring(class226.field3069.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field949.method3136(174);
                                                                                                                                client.field949.method2908(0);
                                                                                                                                int var266 = client.field949.field2394;
                                                                                                                                client.field949.method2908(var261);
                                                                                                                                client.field949.method2908(var263);
                                                                                                                                client.field949.method2908(var265);
                                                                                                                                class180 var267 = client.field949;
                                                                                                                                int var268 = var267.field2394;
                                                                                                                                byte[] var269 = class267.method578(var260);
                                                                                                                                var267.method2867(var269.length);
                                                                                                                                var267.field2394 += Statics.field3658.method2797(var269, 0, var269.length, var267.field2391, var267.field2394);
                                                                                                                                client.field949.method2868(client.field949.field2394 - var266);
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5009) {
                                                                                                                                Statics.field23 -= 2;
                                                                                                                                String var270 = field1334[Statics.field23];
                                                                                                                                String var271 = field1334[Statics.field23 + 1];
                                                                                                                                client.field949.method3136(246);
                                                                                                                                client.field949.method2857(0);
                                                                                                                                int var272 = client.field949.field2394;
                                                                                                                                client.field949.method2862(var270);
                                                                                                                                class180 var273 = client.field949;
                                                                                                                                int var274 = var273.field2394;
                                                                                                                                byte[] var275 = class267.method578(var271);
                                                                                                                                var273.method2867(var275.length);
                                                                                                                                var273.field2394 += Statics.field3658.method2797(var275, 0, var275.length, var273.field2391, var273.field2394);
                                                                                                                                client.field949.method2901(client.field949.field2394 - var272);
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5015) {
                                                                                                                                String var276;
                                                                                                                                if (Statics.field1537 == null || Statics.field1537.field878 == null) {
                                                                                                                                    var276 = "";
                                                                                                                                } else {
                                                                                                                                    var276 = Statics.field1537.field878;
                                                                                                                                }
                                                                                                                                field1334[++Statics.field23 - 1] = var276;
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5016) {
                                                                                                                                field1333[++Statics.field508 - 1] = client.field1124;
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5017) {
                                                                                                                                int var277 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = class99.method3732(var277);
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5018) {
                                                                                                                                int var278 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = class99.method487(var278);
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5019) {
                                                                                                                                int var279 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = class99.method2440(var279);
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5020) {
                                                                                                                                String var280 = field1334[--Statics.field23];
                                                                                                                                if (var280.equalsIgnoreCase("toggleroof")) {
                                                                                                                                    Statics.field344.field1305 = !Statics.field344.field1305;
                                                                                                                                    Statics.method1335();
                                                                                                                                    if (Statics.field344.field1305) {
                                                                                                                                        class99.method973(99, "", "Roofs are now all hidden");
                                                                                                                                    } else {
                                                                                                                                        class99.method973(99, "", "Roofs will only be removed selectively");
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var280.equalsIgnoreCase("displayfps")) {
                                                                                                                                    client.field922 = !client.field922;
                                                                                                                                }
                                                                                                                                if (var280.equalsIgnoreCase("clickbox")) {
                                                                                                                                    class134.field1979 = !class134.field1979;
                                                                                                                                    class99.method973(99, "", "Clickbox Mode: " + (class134.field1979 ? "AABB" : "Legacy"));
                                                                                                                                }
                                                                                                                                if (client.field1074 >= 2) {
                                                                                                                                    if (var280.equalsIgnoreCase("aabb")) {
                                                                                                                                        if (!class8.field233) {
                                                                                                                                            class8.field233 = true;
                                                                                                                                            class8.field230 = class12.field271;
                                                                                                                                            class99.method973(99, "", "AABB boxes: All");
                                                                                                                                        } else if (class8.field230 == class12.field271) {
                                                                                                                                            class8.field233 = true;
                                                                                                                                            class8.field230 = class12.field274;
                                                                                                                                            class99.method973(99, "", "AABB boxes: Mouse Over");
                                                                                                                                        } else {
                                                                                                                                            class8.field233 = false;
                                                                                                                                            class99.method973(99, "", "AABB boxes: Off");
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var280.equalsIgnoreCase("legacyboxes")) {
                                                                                                                                        class8.field228 = !class8.field228;
                                                                                                                                        class99.method973(99, "", "Show legacy boxes: " + class8.field228);
                                                                                                                                    }
                                                                                                                                    if (var280.equalsIgnoreCase("geotests")) {
                                                                                                                                        class8.field229 = !class8.field229;
                                                                                                                                        class99.method973(99, "", "Show geometry tests: " + class8.field229);
                                                                                                                                    }
                                                                                                                                    if (var280.equalsIgnoreCase("fpson")) {
                                                                                                                                        client.field922 = true;
                                                                                                                                    }
                                                                                                                                    if (var280.equalsIgnoreCase("fpsoff")) {
                                                                                                                                        client.field922 = false;
                                                                                                                                    }
                                                                                                                                    if (var280.equalsIgnoreCase("gc")) {
                                                                                                                                        System.gc();
                                                                                                                                    }
                                                                                                                                    if (var280.equalsIgnoreCase("clientdrop")) {
                                                                                                                                        if (client.field959 > 0) {
                                                                                                                                            client.method3574();
                                                                                                                                        } else {
                                                                                                                                            client.method471(40);
                                                                                                                                            Statics.field3624 = Statics.field2151;
                                                                                                                                            Statics.field2151 = null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var280.equalsIgnoreCase("errortest") && client.field1021 == 2) {
                                                                                                                                        throw new RuntimeException();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field949.method3136(255);
                                                                                                                                client.field949.method2908(var280.length() + 1);
                                                                                                                                client.field949.method2862(var280);
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5021) {
                                                                                                                                client.field1125 = field1334[--Statics.field23].toLowerCase().trim();
                                                                                                                                var245 = 1;
                                                                                                                            } else if (var347 == 5022) {
                                                                                                                                field1334[++Statics.field23 - 1] = client.field1125;
                                                                                                                                var245 = 1;
                                                                                                                            } else {
                                                                                                                                var245 = 2;
                                                                                                                            }
                                                                                                                            var73 = var245;
                                                                                                                        } else if (var347 < 5400) {
                                                                                                                            var73 = Statics.method625(var347, var15, var72);
                                                                                                                        } else if (var347 < 5600) {
                                                                                                                            var73 = method62(var347, var15, var72);
                                                                                                                        } else if (var347 < 5700) {
                                                                                                                            byte var281;
                                                                                                                            if (var347 == 5630) {
                                                                                                                                client.field959 = 250;
                                                                                                                                var281 = 1;
                                                                                                                            } else {
                                                                                                                                var281 = 2;
                                                                                                                            }
                                                                                                                            var73 = var281;
                                                                                                                        } else if (var347 < 6300) {
                                                                                                                            var73 = method2439(var347, var15, var72);
                                                                                                                        } else if (var347 < 6600) {
                                                                                                                            var73 = method990(var347, var15, var72);
                                                                                                                        } else if (var347 < 6700) {
                                                                                                                            byte var285;
                                                                                                                            if (var347 == 6600) {
                                                                                                                                int var282 = Statics.field579;
                                                                                                                                int var283 = (Statics.field1537.field1233 >> 7) + Statics.field2316;
                                                                                                                                int var284 = (Statics.field1537.field1265 >> 7) + Statics.field265;
                                                                                                                                client.method485().method4766(var282, var283, var284, true);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6601) {
                                                                                                                                int var286 = field1333[--Statics.field508];
                                                                                                                                String var287 = "";
                                                                                                                                class33 var288 = client.method485().method4758(var286);
                                                                                                                                if (var288 != null) {
                                                                                                                                    var287 = var288.method265();
                                                                                                                                }
                                                                                                                                field1334[++Statics.field23 - 1] = var287;
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6602) {
                                                                                                                                int var289 = field1333[--Statics.field508];
                                                                                                                                client.method485().method4767(var289);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6603) {
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4779();
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6604) {
                                                                                                                                int var290 = field1333[--Statics.field508];
                                                                                                                                client.method485().method4776(var290);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6605) {
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4806() ? 1 : 0;
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6606) {
                                                                                                                                class213 var291 = new class213(field1333[--Statics.field508]);
                                                                                                                                client.method485().method4833(var291.field2615, var291.field2618);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6607) {
                                                                                                                                class213 var292 = new class213(field1333[--Statics.field508]);
                                                                                                                                client.method485().method4875(var292.field2615, var292.field2618);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6608) {
                                                                                                                                class213 var293 = new class213(field1333[--Statics.field508]);
                                                                                                                                client.method485().method4785(var293.field2616, var293.field2615, var293.field2618);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6609) {
                                                                                                                                class213 var294 = new class213(field1333[--Statics.field508]);
                                                                                                                                client.method485().method4786(var294.field2616, var294.field2615, var294.field2618);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6610) {
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4787();
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4788();
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6611) {
                                                                                                                                int var295 = field1333[--Statics.field508];
                                                                                                                                class33 var296 = client.method485().method4758(var295);
                                                                                                                                if (var296 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var296.method262().method3605();
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6612) {
                                                                                                                                int var297 = field1333[--Statics.field508];
                                                                                                                                class33 var298 = client.method485().method4758(var297);
                                                                                                                                if (var298 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = (var298.method241() - var298.method255() + 1) * 64;
                                                                                                                                    field1333[++Statics.field508 - 1] = (var298.method243() - var298.method256() + 1) * 64;
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6613) {
                                                                                                                                int var299 = field1333[--Statics.field508];
                                                                                                                                class33 var300 = client.method485().method4758(var299);
                                                                                                                                if (var300 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var300.method255() * 64;
                                                                                                                                    field1333[++Statics.field508 - 1] = var300.method256() * 64;
                                                                                                                                    field1333[++Statics.field508 - 1] = var300.method241() * 64 + 64 - 1;
                                                                                                                                    field1333[++Statics.field508 - 1] = var300.method243() * 64 + 64 - 1;
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6614) {
                                                                                                                                int var301 = field1333[--Statics.field508];
                                                                                                                                class33 var302 = client.method485().method4758(var301);
                                                                                                                                if (var302 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var302.method246();
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6615) {
                                                                                                                                class213 var303 = client.method485().method4789();
                                                                                                                                if (var303 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var303.field2615;
                                                                                                                                    field1333[++Statics.field508 - 1] = var303.field2618;
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6616) {
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4768();
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6617) {
                                                                                                                                class213 var304 = new class213(field1333[--Statics.field508]);
                                                                                                                                class33 var305 = client.method485().method4901();
                                                                                                                                if (var305 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    var285 = 1;
                                                                                                                                } else {
                                                                                                                                    int[] var306 = var305.method295(var304.field2616, var304.field2615, var304.field2618);
                                                                                                                                    if (var306 == null) {
                                                                                                                                        field1333[++Statics.field508 - 1] = -1;
                                                                                                                                        field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1333[++Statics.field508 - 1] = var306[0];
                                                                                                                                        field1333[++Statics.field508 - 1] = var306[1];
                                                                                                                                    }
                                                                                                                                    var285 = 1;
                                                                                                                                }
                                                                                                                            } else if (var347 == 6618) {
                                                                                                                                class213 var307 = new class213(field1333[--Statics.field508]);
                                                                                                                                class33 var308 = client.method485().method4901();
                                                                                                                                if (var308 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    var285 = 1;
                                                                                                                                } else {
                                                                                                                                    class213 var309 = var308.method247(var307.field2615, var307.field2618);
                                                                                                                                    if (var309 == null) {
                                                                                                                                        field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1333[++Statics.field508 - 1] = var309.method3605();
                                                                                                                                    }
                                                                                                                                    var285 = 1;
                                                                                                                                }
                                                                                                                            } else if (var347 == 6619) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var310 = field1333[Statics.field508];
                                                                                                                                class213 var311 = new class213(field1333[Statics.field508 + 1]);
                                                                                                                                method144(var310, var311, false);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6620) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var312 = field1333[Statics.field508];
                                                                                                                                class213 var313 = new class213(field1333[Statics.field508 + 1]);
                                                                                                                                method144(var312, var313, true);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6621) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var314 = field1333[Statics.field508];
                                                                                                                                class213 var315 = new class213(field1333[Statics.field508 + 1]);
                                                                                                                                class33 var316 = client.method485().method4758(var314);
                                                                                                                                if (var316 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = 0;
                                                                                                                                    var285 = 1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var316.method244(var315.field2616, var315.field2615, var315.field2618) ? 1 : 0;
                                                                                                                                    var285 = 1;
                                                                                                                                }
                                                                                                                            } else if (var347 == 6622) {
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4832();
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4791();
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6623) {
                                                                                                                                class213 var317 = new class213(field1333[--Statics.field508]);
                                                                                                                                class33 var318 = client.method485().method4765(var317.field2616, var317.field2615, var317.field2618);
                                                                                                                                if (var318 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var318.method260();
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6624) {
                                                                                                                                client.method485().method4792(field1333[--Statics.field508]);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6625) {
                                                                                                                                client.method485().method4828();
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6626) {
                                                                                                                                client.method485().method4757(field1333[--Statics.field508]);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6627) {
                                                                                                                                client.method485().method4894();
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6628) {
                                                                                                                                boolean var319 = field1333[--Statics.field508] == 1;
                                                                                                                                client.method485().method4796(var319);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6629) {
                                                                                                                                int var320 = field1333[--Statics.field508];
                                                                                                                                client.method485().method4857(var320);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6630) {
                                                                                                                                int var321 = field1333[--Statics.field508];
                                                                                                                                client.method485().method4907(var321);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6631) {
                                                                                                                                client.method485().method4799();
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6632) {
                                                                                                                                boolean var322 = field1333[--Statics.field508] == 1;
                                                                                                                                client.method485().method4794(var322);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6633) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var323 = field1333[Statics.field508];
                                                                                                                                boolean var324 = field1333[Statics.field508 + 1] == 1;
                                                                                                                                client.method485().method4800(var323, var324);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6634) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var325 = field1333[Statics.field508];
                                                                                                                                boolean var326 = field1333[Statics.field508 + 1] == 1;
                                                                                                                                client.method485().method4801(var325, var326);
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6635) {
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4802() ? 1 : 0;
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6636) {
                                                                                                                                int var327 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4859(var327) ? 1 : 0;
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6637) {
                                                                                                                                int var328 = field1333[--Statics.field508];
                                                                                                                                field1333[++Statics.field508 - 1] = client.method485().method4804(var328) ? 1 : 0;
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6638) {
                                                                                                                                Statics.field508 -= 2;
                                                                                                                                int var329 = field1333[Statics.field508];
                                                                                                                                class213 var330 = new class213(field1333[Statics.field508 + 1]);
                                                                                                                                class213 var331 = client.method485().method4807(var329, var330);
                                                                                                                                if (var331 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var331.method3605();
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6639) {
                                                                                                                                class40 var332 = client.method485().method4852();
                                                                                                                                if (var332 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var332.field524;
                                                                                                                                    field1333[++Statics.field508 - 1] = var332.field517.method3605();
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6640) {
                                                                                                                                class40 var333 = client.method485().method4921();
                                                                                                                                if (var333 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var333.field524;
                                                                                                                                    field1333[++Statics.field508 - 1] = var333.field517.method3605();
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6693) {
                                                                                                                                int var334 = field1333[--Statics.field508];
                                                                                                                                class243 var335 = Statics.field663[var334];
                                                                                                                                if (var335.field3289 == null) {
                                                                                                                                    field1334[++Statics.field23 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field23 - 1] = var335.field3289;
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6694) {
                                                                                                                                int var336 = field1333[--Statics.field508];
                                                                                                                                class243 var337 = Statics.field663[var336];
                                                                                                                                field1333[++Statics.field508 - 1] = var337.field3301;
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6695) {
                                                                                                                                int var338 = field1333[--Statics.field508];
                                                                                                                                class243 var339 = Statics.field663[var338];
                                                                                                                                if (var339 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var339.field3308;
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6696) {
                                                                                                                                int var340 = field1333[--Statics.field508];
                                                                                                                                class243 var341 = Statics.field663[var340];
                                                                                                                                if (var341 == null) {
                                                                                                                                    field1333[++Statics.field508 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1333[++Statics.field508 - 1] = var341.field3298;
                                                                                                                                }
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6697) {
                                                                                                                                field1333[++Statics.field508 - 1] = Statics.field1331.field591;
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6698) {
                                                                                                                                field1333[++Statics.field508 - 1] = Statics.field1331.field590.method3605();
                                                                                                                                var285 = 1;
                                                                                                                            } else if (var347 == 6699) {
                                                                                                                                field1333[++Statics.field508 - 1] = Statics.field1331.field594.method3605();
                                                                                                                                var285 = 1;
                                                                                                                            } else {
                                                                                                                                var285 = 2;
                                                                                                                            }
                                                                                                                            var73 = var285;
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
                                                                                                                    } else if (var347 == 0) {
                                                                                                                        field1333[++Statics.field508 - 1] = var23[var21];
                                                                                                                    } else if (var347 == 1) {
                                                                                                                        int var31 = var23[var21];
                                                                                                                        field1333[++Statics.field508 - 1] = class212.field2613[var31];
                                                                                                                    } else if (var347 == 2) {
                                                                                                                        int var32 = var23[var21];
                                                                                                                        class212.field2613[var32] = field1333[--Statics.field508];
                                                                                                                        client.method9(var32);
                                                                                                                    } else if (var347 == 3) {
                                                                                                                        field1334[++Statics.field23 - 1] = var15.field1533[var21];
                                                                                                                    } else if (var347 == 6) {
                                                                                                                        var21 += var23[var21];
                                                                                                                    } else if (var347 == 7) {
                                                                                                                        Statics.field508 -= 2;
                                                                                                                        if (field1333[Statics.field508] != field1333[Statics.field508 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var347 == 8) {
                                                                                                                        Statics.field508 -= 2;
                                                                                                                        if (field1333[Statics.field508] == field1333[Statics.field508 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var347 == 9) {
                                                                                                                        Statics.field508 -= 2;
                                                                                                                        if (field1333[Statics.field508] < field1333[Statics.field508 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var347 == 10) {
                                                                                                                        Statics.field508 -= 2;
                                                                                                                        if (field1333[Statics.field508] > field1333[Statics.field508 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var347 == 21) {
                                                                                                                        if (field1343 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var33 = field1336[--field1343];
                                                                                                                        var15 = var33.field776;
                                                                                                                        var22 = var15.field1529;
                                                                                                                        var23 = var15.field1530;
                                                                                                                        var21 = var33.field767;
                                                                                                                        Statics.field1329 = var33.field771;
                                                                                                                        Statics.field1330 = var33.field766;
                                                                                                                    } else if (var347 == 25) {
                                                                                                                        int var34 = var23[var21];
                                                                                                                        field1333[++Statics.field508 - 1] = class212.method4(var34);
                                                                                                                    } else if (var347 == 27) {
                                                                                                                        int var35 = var23[var21];
                                                                                                                        int var36 = field1333[--Statics.field508];
                                                                                                                        class251 var37 = (class251) class251.field3380.method3245((long) var35);
                                                                                                                        class251 var38;
                                                                                                                        if (var37 == null) {
                                                                                                                            byte[] var39 = Statics.field3379.method3787(14, var35);
                                                                                                                            class251 var40 = new class251();
                                                                                                                            if (var39 != null) {
                                                                                                                                var40.method4039(new class174(var39));
                                                                                                                            }
                                                                                                                            class251.field3380.method3247(var40, (long) var35);
                                                                                                                            var38 = var40;
                                                                                                                        } else {
                                                                                                                            var38 = var37;
                                                                                                                        }
                                                                                                                        int var42 = var38.field3383;
                                                                                                                        int var43 = var38.field3382;
                                                                                                                        int var44 = var38.field3381;
                                                                                                                        int var45 = class212.field2610[var44 - var43];
                                                                                                                        if (var36 < 0 || var36 > var45) {
                                                                                                                            var36 = 0;
                                                                                                                        }
                                                                                                                        int var46 = var45 << var43;
                                                                                                                        class212.field2613[var42] = class212.field2613[var42] & ~var46 | var36 << var43 & var46;
                                                                                                                    } else if (var347 == 31) {
                                                                                                                        Statics.field508 -= 2;
                                                                                                                        if (field1333[Statics.field508] <= field1333[Statics.field508 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var347 == 32) {
                                                                                                                        Statics.field508 -= 2;
                                                                                                                        if (field1333[Statics.field508] >= field1333[Statics.field508 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var347 == 33) {
                                                                                                                        field1333[++Statics.field508 - 1] = Statics.field1329[var23[var21]];
                                                                                                                    } else if (var347 == 34) {
                                                                                                                        Statics.field1329[var23[var21]] = field1333[--Statics.field508];
                                                                                                                    } else if (var347 == 35) {
                                                                                                                        field1334[++Statics.field23 - 1] = Statics.field1330[var23[var21]];
                                                                                                                    } else if (var347 == 36) {
                                                                                                                        Statics.field1330[var23[var21]] = field1334[--Statics.field23];
                                                                                                                    } else if (var347 == 37) {
                                                                                                                        int var47 = var23[var21];
                                                                                                                        Statics.field23 -= var47;
                                                                                                                        String var48 = class271.method3095(field1334, Statics.field23, var47);
                                                                                                                        field1334[++Statics.field23 - 1] = var48;
                                                                                                                    } else if (var347 == 38) {
                                                                                                                        Statics.field508--;
                                                                                                                    } else if (var347 == 39) {
                                                                                                                        Statics.field23--;
                                                                                                                    } else if (var347 == 40) {
                                                                                                                        int var49 = var23[var21];
                                                                                                                        class100 var50 = (class100) class100.field1531.method3245((long) var49);
                                                                                                                        class100 var51;
                                                                                                                        if (var50 == null) {
                                                                                                                            byte[] var52 = Statics.field3661.method3787(var49, 0);
                                                                                                                            if (var52 == null) {
                                                                                                                                var51 = null;
                                                                                                                            } else {
                                                                                                                                class100 var53 = class100.method1524(var52);
                                                                                                                                class100.field1531.method3247(var53, (long) var49);
                                                                                                                                var51 = var53;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var51 = var50;
                                                                                                                        }
                                                                                                                        class100 var54 = var51;
                                                                                                                        int[] var55 = new int[var51.field1532];
                                                                                                                        String[] var56 = new String[var51.field1535];
                                                                                                                        for (int var57 = 0; var57 < var54.field1534; var57++) {
                                                                                                                            var55[var57] = field1333[Statics.field508 - var54.field1534 + var57];
                                                                                                                        }
                                                                                                                        for (int var58 = 0; var58 < var54.field1539; var58++) {
                                                                                                                            var56[var58] = field1334[Statics.field23 - var54.field1539 + var58];
                                                                                                                        }
                                                                                                                        Statics.field508 -= var54.field1534;
                                                                                                                        Statics.field23 -= var54.field1539;
                                                                                                                        class63 var59 = new class63();
                                                                                                                        var59.field776 = var15;
                                                                                                                        var59.field767 = var21;
                                                                                                                        var59.field771 = Statics.field1329;
                                                                                                                        var59.field766 = Statics.field1330;
                                                                                                                        field1336[++field1343 - 1] = var59;
                                                                                                                        var15 = var54;
                                                                                                                        var22 = var54.field1529;
                                                                                                                        var23 = var54.field1530;
                                                                                                                        var21 = -1;
                                                                                                                        Statics.field1329 = var55;
                                                                                                                        Statics.field1330 = var56;
                                                                                                                    } else if (var347 == 42) {
                                                                                                                        field1333[++Statics.field508 - 1] = Statics.field585.method1614(var23[var21]);
                                                                                                                    } else if (var347 == 43) {
                                                                                                                        Statics.field585.method1635(var23[var21], field1333[--Statics.field508]);
                                                                                                                    } else if (var347 == 44) {
                                                                                                                        int var60 = var23[var21] >> 16;
                                                                                                                        int var61 = var23[var21] & 0xFFFF;
                                                                                                                        int var62 = field1333[--Statics.field508];
                                                                                                                        if (var62 >= 0 && var62 <= 5000) {
                                                                                                                            field1332[var60] = var62;
                                                                                                                            byte var63 = -1;
                                                                                                                            if (var61 == 105) {
                                                                                                                                var63 = 0;
                                                                                                                            }
                                                                                                                            int var64 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var64 >= var62) {
                                                                                                                                    continue label1783;
                                                                                                                                }
                                                                                                                                field1339[var60][var64] = var63;
                                                                                                                                var64++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var347 == 45) {
                                                                                                                        int var65 = var23[var21];
                                                                                                                        int var66 = field1333[--Statics.field508];
                                                                                                                        if (var66 < 0 || var66 >= field1332[var65]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1333[++Statics.field508 - 1] = field1339[var65][var66];
                                                                                                                    } else if (var347 == 46) {
                                                                                                                        int var67 = var23[var21];
                                                                                                                        Statics.field508 -= 2;
                                                                                                                        int var68 = field1333[Statics.field508];
                                                                                                                        if (var68 < 0 || var68 >= field1332[var67]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1339[var67][var68] = field1333[Statics.field508 + 1];
                                                                                                                    } else if (var347 == 47) {
                                                                                                                        String var69 = Statics.field585.method1627(var23[var21]);
                                                                                                                        if (var69 == null) {
                                                                                                                            var69 = "null";
                                                                                                                        }
                                                                                                                        field1334[++Statics.field23 - 1] = var69;
                                                                                                                    } else if (var347 == 48) {
                                                                                                                        Statics.field585.method1615(var23[var21], field1334[--Statics.field23]);
                                                                                                                    } else if (var347 == 60) {
                                                                                                                        class187 var70 = var15.field1536[var23[var21]];
                                                                                                                        class199 var71 = (class199) var70.method3206((long) field1333[--Statics.field508]);
                                                                                                                        if (var71 != null) {
                                                                                                                            var21 += var71.field2480;
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
        } catch (Exception var346) {
            StringBuilder var344 = new StringBuilder(30);
            var344.append("").append(var15.field2467).append(" ");
            for (int var345 = field1343 - 1; var345 >= 0; var345--) {
                var344.append("").append(field1336[var345].field776.field2467).append(" ");
            }
            var344.append("").append(var24);
            class153.method683(var344.toString(), var346);
        }
    }

    @ObfuscatedName("an.n(ILcg;ZI)I")
    public static int method628(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field508 -= 3;
            int var3 = field1333[Statics.field508];
            int var4 = field1333[Statics.field508 + 1];
            int var5 = field1333[Statics.field508 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class217 var6 = class217.method921(var3);
            if (var6.field2744 == null) {
                var6.field2744 = new class217[var5 + 1];
            }
            if (var6.field2744.length <= var5) {
                class217[] var7 = new class217[var5 + 1];
                for (int var8 = 0; var8 < var6.field2744.length; var8++) {
                    var7[var8] = var6.field2744[var8];
                }
                var6.field2744 = var7;
            }
            if (var5 > 0 && var6.field2744[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class217 var9 = new class217();
            var9.field2656 = var4;
            var9.field2673 = var9.field2654 = var6.field2654;
            var9.field2711 = var5;
            var9.field2726 = true;
            var6.field2744[var5] = var9;
            if (arg2) {
                Statics.field1337 = var9;
            } else {
                Statics.field10 = var9;
            }
            client.method632(var6);
            return 1;
        } else if (arg0 == 101) {
            class217 var10 = arg2 ? Statics.field1337 : Statics.field10;
            class217 var11 = class217.method921(var10.field2654);
            var11.field2744[var10.field2711] = null;
            client.method632(var11);
            return 1;
        } else if (arg0 == 102) {
            class217 var12 = class217.method921(field1333[--Statics.field508]);
            var12.field2744 = null;
            client.method632(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field508 -= 2;
            int var13 = field1333[Statics.field508];
            int var14 = field1333[Statics.field508 + 1];
            class217 var15 = class217.method63(var13, var14);
            if (var15 == null || var14 == -1) {
                field1333[++Statics.field508 - 1] = 0;
            } else {
                field1333[++Statics.field508 - 1] = 1;
                if (arg2) {
                    Statics.field1337 = var15;
                } else {
                    Statics.field10 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class217 var16 = class217.method921(field1333[--Statics.field508]);
            if (var16 == null) {
                field1333[++Statics.field508 - 1] = 0;
            } else {
                field1333[++Statics.field508 - 1] = 1;
                if (arg2) {
                    Statics.field1337 = var16;
                } else {
                    Statics.field10 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.r(ILcg;ZI)I")
    public static int method1637(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1333[--Statics.field508];
            var4 = class217.method921(var3);
        } else {
            var4 = arg2 ? Statics.field1337 : Statics.field10;
        }
        if (arg0 == 1000) {
            Statics.field508 -= 4;
            var4.field2663 = field1333[Statics.field508];
            var4.field2664 = field1333[Statics.field508 + 1];
            var4.field2659 = field1333[Statics.field508 + 2];
            var4.field2660 = field1333[Statics.field508 + 3];
            client.method632(var4);
            Statics.field403.method1210(var4);
            if (var3 != -1 && var4.field2656 == 0) {
                client.method451(Statics.field2642[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field508 -= 4;
            var4.field2665 = field1333[Statics.field508];
            var4.field2737 = field1333[Statics.field508 + 1];
            var4.field2641 = field1333[Statics.field508 + 2];
            var4.field2662 = field1333[Statics.field508 + 3];
            client.method632(var4);
            Statics.field403.method1210(var4);
            if (var3 != -1 && var4.field2656 == 0) {
                client.method451(Statics.field2642[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1333[--Statics.field508] == 1;
            if (var4.field2674 != var5) {
                var4.field2674 = var5;
                client.method632(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2787 = field1333[--Statics.field508] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2788 = field1333[--Statics.field508] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fn.v(ILcg;ZI)I")
    public static int method3085(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1333[--Statics.field508];
            var4 = class217.method921(var3);
        } else {
            var4 = arg2 ? Statics.field1337 : Statics.field10;
        }
        if (arg0 == 1100) {
            Statics.field508 -= 2;
            var4.field2675 = field1333[Statics.field508];
            if (var4.field2675 > var4.field2677 - var4.field2669) {
                var4.field2675 = var4.field2677 - var4.field2669;
            }
            if (var4.field2675 < 0) {
                var4.field2675 = 0;
            }
            var4.field2680 = field1333[Statics.field508 + 1];
            if (var4.field2680 > var4.field2715 - var4.field2694) {
                var4.field2680 = var4.field2715 - var4.field2694;
            }
            if (var4.field2680 < 0) {
                var4.field2680 = 0;
            }
            client.method632(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2679 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2683 = field1333[--Statics.field508] == 1;
            client.method632(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2682 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2644 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2751 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2691 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2692 = field1333[--Statics.field508] == 1;
            client.method632(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2697 = 1;
            var4.field2698 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field508 -= 6;
            var4.field2703 = field1333[Statics.field508];
            var4.field2671 = field1333[Statics.field508 + 1];
            var4.field2705 = field1333[Statics.field508 + 2];
            var4.field2706 = field1333[Statics.field508 + 3];
            var4.field2707 = field1333[Statics.field508 + 4];
            var4.field2708 = field1333[Statics.field508 + 5];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1333[--Statics.field508];
            if (var4.field2778 != var5) {
                var4.field2778 = var5;
                var4.field2773 = 0;
                var4.field2777 = 0;
                client.method632(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2688 = field1333[--Statics.field508] == 1;
            client.method632(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1334[--Statics.field23];
            if (!var6.equals(var4.field2678)) {
                var4.field2678 = var6;
                client.method632(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2713 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field508 -= 3;
            var4.field2717 = field1333[Statics.field508];
            var4.field2750 = field1333[Statics.field508 + 1];
            var4.field2652 = field1333[Statics.field508 + 2];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2768 = field1333[--Statics.field508] == 1;
            client.method632(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2693 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2666 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2695 = field1333[--Statics.field508] == 1;
            client.method632(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2696 = field1333[--Statics.field508] == 1;
            client.method632(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field508 -= 2;
            var4.field2677 = field1333[Statics.field508];
            var4.field2715 = field1333[Statics.field508 + 1];
            client.method632(var4);
            if (var3 != -1 && var4.field2656 == 0) {
                client.method451(Statics.field2642[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2654;
            int var8 = var4.field2711;
            client.field949.method3136(213);
            client.field949.method3030(var7);
            client.field949.method2905(var8);
            client.field1071 = var4;
            client.method632(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2690 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2704 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2709 = field1333[--Statics.field508];
            client.method632(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field1333[--Statics.field508];
            class284[] var10 = new class284[] { class284.field3767, class284.field3770, class284.field3769, class284.field3766, class284.field3768 };
            class284 var11 = (class284) class169.method1334(var10, var9);
            if (var11 != null) {
                var4.field2684 = var11;
                client.method632(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var12 = field1333[--Statics.field508] == 1;
            var4.field2722 = var12;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.e(ILcg;ZS)I")
    public static int method141(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method921(field1333[--Statics.field508]);
        } else {
            var3 = arg2 ? Statics.field1337 : Statics.field10;
        }
        client.method632(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field508 -= 2;
            int var4 = field1333[Statics.field508];
            int var5 = field1333[Statics.field508 + 1];
            var3.field2774 = var4;
            var3.field2699 = var5;
            class257 var6 = class257.method1498(var4);
            var3.field2705 = var6.field3521;
            var3.field2706 = var6.field3506;
            var3.field2707 = var6.field3490;
            var3.field2703 = var6.field3508;
            var3.field2671 = var6.field3509;
            var3.field2708 = var6.field3504;
            if (arg0 == 1205) {
                var3.field2712 = 0;
            } else if (arg0 == 1212 | var6.field3510 == 1) {
                var3.field2712 = 1;
            } else {
                var3.field2712 = 2;
            }
            if (var3.field2649 > 0) {
                var3.field2708 = var3.field2708 * 32 / var3.field2649;
            } else if (var3.field2665 > 0) {
                var3.field2708 = var3.field2708 * 32 / var3.field2665;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2697 = 2;
            var3.field2698 = field1333[--Statics.field508];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2697 = 3;
            var3.field2698 = Statics.field1537.field869.method3631();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.l(ILcg;ZI)I")
    public static int method18(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method921(field1333[--Statics.field508]);
        } else {
            var3 = arg2 ? Statics.field1337 : Statics.field10;
        }
        if (arg0 == 1300) {
            int var4 = field1333[--Statics.field508] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3692(var4, field1334[--Statics.field23]);
                return 1;
            } else {
                Statics.field23--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field508 -= 2;
            int var5 = field1333[Statics.field508];
            int var6 = field1333[Statics.field508 + 1];
            var3.field2735 = class217.method63(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2732 = field1333[--Statics.field508] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2730 = field1333[--Statics.field508];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2731 = field1333[--Statics.field508];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2645 = field1334[--Statics.field23];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2718 = field1334[--Statics.field23];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2728 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fa.s(ILcg;ZI)I")
    public static int method2798(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method921(field1333[--Statics.field508]);
        } else {
            var3 = arg2 ? Statics.field1337 : Statics.field10;
        }
        String var4 = field1334[--Statics.field23];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1333[--Statics.field508];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1333[--Statics.field508];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1334[--Statics.field23];
            } else {
                var7[var8] = Integer.valueOf(field1333[--Statics.field508]);
            }
        }
        int var9 = field1333[--Statics.field508];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2668 = var7;
        } else if (arg0 == 1401) {
            var3.field2739 = var7;
        } else if (arg0 == 1402) {
            var3.field2738 = var7;
        } else if (arg0 == 1403) {
            var3.field2740 = var7;
        } else if (arg0 == 1404) {
            var3.field2701 = var7;
        } else if (arg0 == 1405) {
            var3.field2743 = var7;
        } else if (arg0 == 1406) {
            var3.field2746 = var7;
        } else if (arg0 == 1407) {
            var3.field2747 = var7;
            var3.field2748 = var5;
        } else if (arg0 == 1408) {
            var3.field2753 = var7;
        } else if (arg0 == 1409) {
            var3.field2754 = var7;
        } else if (arg0 == 1410) {
            var3.field2727 = var7;
        } else if (arg0 == 1411) {
            var3.field2676 = var7;
        } else if (arg0 == 1412) {
            var3.field2741 = var7;
        } else if (arg0 == 1414) {
            var3.field2749 = var7;
            var3.field2714 = var5;
        } else if (arg0 == 1415) {
            var3.field2729 = var7;
            var3.field2752 = var5;
        } else if (arg0 == 1416) {
            var3.field2745 = var7;
        } else if (arg0 == 1417) {
            var3.field2755 = var7;
        } else if (arg0 == 1418) {
            var3.field2756 = var7;
        } else if (arg0 == 1419) {
            var3.field2757 = var7;
        } else if (arg0 == 1420) {
            var3.field2758 = var7;
        } else if (arg0 == 1421) {
            var3.field2759 = var7;
        } else if (arg0 == 1422) {
            var3.field2670 = var7;
        } else if (arg0 == 1423) {
            var3.field2761 = var7;
        } else if (arg0 == 1424) {
            var3.field2762 = var7;
        } else if (arg0 == 1425) {
            var3.field2764 = var7;
        } else if (arg0 == 1426) {
            var3.field2765 = var7;
        } else if (arg0 == 1427) {
            var3.field2733 = var7;
        } else {
            return 2;
        }
        var3.field2734 = true;
        return 1;
    }

    @ObfuscatedName("ht.w(ILcg;ZI)I")
    public static int method3743(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field1337 : Statics.field10;
        if (arg0 == 1600) {
            field1333[++Statics.field508 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1601) {
            field1333[++Statics.field508 - 1] = var3.field2680;
            return 1;
        } else if (arg0 == 1602) {
            field1334[++Statics.field23 - 1] = var3.field2678;
            return 1;
        } else if (arg0 == 1603) {
            field1333[++Statics.field508 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 1604) {
            field1333[++Statics.field508 - 1] = var3.field2715;
            return 1;
        } else if (arg0 == 1605) {
            field1333[++Statics.field508 - 1] = var3.field2708;
            return 1;
        } else if (arg0 == 1606) {
            field1333[++Statics.field508 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 1607) {
            field1333[++Statics.field508 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 1608) {
            field1333[++Statics.field508 - 1] = var3.field2706;
            return 1;
        } else if (arg0 == 1609) {
            field1333[++Statics.field508 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 1610) {
            field1333[++Statics.field508 - 1] = var3.field2709;
            return 1;
        } else if (arg0 == 1611) {
            field1333[++Statics.field508 - 1] = var3.field2679;
            return 1;
        } else if (arg0 == 1612) {
            field1333[++Statics.field508 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 1613) {
            field1333[++Statics.field508 - 1] = var3.field2684.method12();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.p(ILcg;ZI)I")
    public static int method142(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method921(field1333[--Statics.field508]);
        } else {
            var3 = arg2 ? Statics.field1337 : Statics.field10;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1335 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2733 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field831 = var3;
            var4.field840 = var3.field2733;
            var4.field836 = field1335 + 1;
            client.field1106.method3320(var4);
            return 1;
        }
    }

    @ObfuscatedName("bx.m(ILcg;ZI)I")
    public static int method1024(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method921(field1333[--Statics.field508]);
        if (arg0 == 2500) {
            field1333[++Statics.field508 - 1] = var3.field2667;
            return 1;
        } else if (arg0 == 2501) {
            field1333[++Statics.field508 - 1] = var3.field2647;
            return 1;
        } else if (arg0 == 2502) {
            field1333[++Statics.field508 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 2503) {
            field1333[++Statics.field508 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 2504) {
            field1333[++Statics.field508 - 1] = var3.field2674 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1333[++Statics.field508 - 1] = var3.field2673;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cs.u(ILcg;ZB)I")
    public static int method1369(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method921(field1333[--Statics.field508]);
        if (arg0 == 2600) {
            field1333[++Statics.field508 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 2601) {
            field1333[++Statics.field508 - 1] = var3.field2680;
            return 1;
        } else if (arg0 == 2602) {
            field1334[++Statics.field23 - 1] = var3.field2678;
            return 1;
        } else if (arg0 == 2603) {
            field1333[++Statics.field508 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 2604) {
            field1333[++Statics.field508 - 1] = var3.field2715;
            return 1;
        } else if (arg0 == 2605) {
            field1333[++Statics.field508 - 1] = var3.field2708;
            return 1;
        } else if (arg0 == 2606) {
            field1333[++Statics.field508 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 2607) {
            field1333[++Statics.field508 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 2608) {
            field1333[++Statics.field508 - 1] = var3.field2706;
            return 1;
        } else if (arg0 == 2609) {
            field1333[++Statics.field508 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 2610) {
            field1333[++Statics.field508 - 1] = var3.field2709;
            return 1;
        } else if (arg0 == 2611) {
            field1333[++Statics.field508 - 1] = var3.field2679;
            return 1;
        } else if (arg0 == 2612) {
            field1333[++Statics.field508 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 2613) {
            field1333[++Statics.field508 - 1] = var3.field2684.method12();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.g(ILcg;ZI)I")
    public static int method314(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class217 var3 = class217.method921(field1333[--Statics.field508]);
            field1333[++Statics.field508 - 1] = var3.field2774;
            return 1;
        } else if (arg0 == 2701) {
            class217 var4 = class217.method921(field1333[--Statics.field508]);
            if (var4.field2774 == -1) {
                field1333[++Statics.field508 - 1] = 0;
            } else {
                field1333[++Statics.field508 - 1] = var4.field2699;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1333[--Statics.field508];
            class69 var6 = (class69) client.field1068.method3264((long) var5);
            if (var6 == null) {
                field1333[++Statics.field508 - 1] = 0;
            } else {
                field1333[++Statics.field508 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1333[++Statics.field508 - 1] = client.field1019;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.k(ILcg;ZI)I")
    public static int method452(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method921(field1333[--Statics.field508]);
        if (arg0 == 2800) {
            int[] var4 = field1333;
            int var5 = ++Statics.field508 - 1;
            int var6 = client.method619(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 2801) {
            int var8 = field1333[--Statics.field508];
            int var9 = var8 - 1;
            if (var3.field2728 == null || var9 >= var3.field2728.length || var3.field2728[var9] == null) {
                field1334[++Statics.field23 - 1] = "";
            } else {
                field1334[++Statics.field23 - 1] = var3.field2728[var9];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2645 == null) {
                field1334[++Statics.field23 - 1] = "";
            } else {
                field1334[++Statics.field23 - 1] = var3.field2645;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.c(ILcg;ZI)I")
    public static int method1580(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1334[--Statics.field23];
            class99.method973(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field508 -= 2;
            client.method2717(Statics.field1537, field1333[Statics.field508], field1333[Statics.field508 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.field949.method3136(89);
            for (class69 var4 = (class69) client.field1068.method3262(); var4 != null; var4 = (class69) client.field1068.method3263()) {
                if (var4.field823 == 0 || var4.field823 == 3) {
                    client.method2657(var4, true);
                }
            }
            if (client.field1071 != null) {
                client.method632(client.field1071);
                client.field1071 = null;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var5 = field1334[--Statics.field23];
            int var6 = 0;
            boolean var7 = class271.method3941(var5, 10, true);
            if (var7) {
                int var8 = class271.method4447(var5, 10, true);
                var6 = var8;
            }
            client.field949.method3136(38);
            client.field949.method2859(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var9 = field1334[--Statics.field23];
            client.field949.method3136(226);
            client.field949.method2908(var9.length() + 1);
            client.field949.method2862(var9);
            return 1;
        } else if (arg0 == 3106) {
            String var10 = field1334[--Statics.field23];
            client.field949.method3136(165);
            client.field949.method2908(var10.length() + 1);
            client.field949.method2862(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1333[--Statics.field508];
            String var12 = field1334[--Statics.field23];
            client.method33(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field508 -= 3;
            int var13 = field1333[Statics.field508];
            int var14 = field1333[Statics.field508 + 1];
            int var15 = field1333[Statics.field508 + 2];
            class217 var16 = class217.method921(var15);
            client.method1545(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field508 -= 2;
            int var17 = field1333[Statics.field508];
            int var18 = field1333[Statics.field508 + 1];
            class217 var19 = arg2 ? Statics.field1337 : Statics.field10;
            client.method1545(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field462 = field1333[--Statics.field508] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1333[++Statics.field508 - 1] = Statics.field344.field1305 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field344.field1305 = field1333[--Statics.field508] == 1;
            Statics.method1335();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1334[--Statics.field23];
            boolean var21 = field1333[--Statics.field508] == 1;
            Statics.method449(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1333[--Statics.field508];
            client.field949.method3136(124);
            client.field949.method2857(var22);
            return 1;
        } else if (arg0 == 3116) {
            int var23 = field1333[--Statics.field508];
            Statics.field23 -= 2;
            String var24 = field1334[Statics.field23];
            String var25 = field1334[Statics.field23 + 1];
            if (var24.length() > 500) {
                return 1;
            } else if (var25.length() > 500) {
                return 1;
            } else {
                client.field949.method3136(23);
                client.field949.method2857(1 + class174.method2644(var24) + class174.method2644(var25));
                client.field949.method2862(var25);
                client.field949.method2862(var24);
                client.field949.method2860(var23);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field1055 = field1333[--Statics.field508] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.o(ILcg;ZI)I")
    public static int method17(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field508 -= 3;
            int var3 = field1333[Statics.field508];
            int var4 = field1333[Statics.field508 + 1];
            int var5 = field1333[Statics.field508 + 2];
            if (client.field1060 != 0 && var4 != 0 && client.field1081 < 50) {
                client.field1148[client.field1081] = var3;
                client.field966[client.field1081] = var4;
                client.field1150[client.field1081] = var5;
                client.field1152[client.field1081] = null;
                client.field1015[client.field1081] = 0;
                client.field1081++;
            }
            return 1;
        } else if (arg0 == 3201) {
            int var6 = field1333[--Statics.field508];
            if (var6 == -1 && !client.field947) {
                Statics.field2501.method3427();
                class204.field2502 = 1;
                Statics.field2503 = null;
            } else if (var6 != -1 && client.field1143 != var6 && client.field924 != 0 && !client.field947) {
                class238 var7 = Statics.field2438;
                int var8 = client.field924;
                class204.field2502 = 1;
                Statics.field2503 = var7;
                Statics.field2504 = var6;
                Statics.field2205 = 0;
                Statics.field2505 = var8;
                Statics.field2506 = false;
                Statics.field862 = 2;
            }
            client.field1143 = var6;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field508 -= 2;
            int var9 = field1333[Statics.field508];
            int var10 = field1333[Statics.field508 + 1];
            if (client.field924 != 0 && var9 != -1) {
                class204.method966(Statics.field268, var9, 0, client.field924, false);
                client.field947 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hq.x(ILcg;ZB)I")
    public static int method3751(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1333[++Statics.field508 - 1] = client.field934;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field508 -= 2;
            int var3 = field1333[Statics.field508];
            int var4 = field1333[Statics.field508 + 1];
            field1333[++Statics.field508 - 1] = class64.method13(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field508 -= 2;
            int var5 = field1333[Statics.field508];
            int var6 = field1333[Statics.field508 + 1];
            int[] var7 = field1333;
            int var8 = ++Statics.field508 - 1;
            class64 var9 = (class64) class64.field786.method3264((long) var5);
            int var10;
            if (var9 == null) {
                var10 = 0;
            } else if (var6 >= 0 && var6 < var9.field779.length) {
                var10 = var9.field779[var6];
            } else {
                var10 = 0;
            }
            var7[var8] = var10;
            return 1;
        } else if (arg0 == 3303) {
            Statics.field508 -= 2;
            int var11 = field1333[Statics.field508];
            int var12 = field1333[Statics.field508 + 1];
            int[] var13 = field1333;
            int var14 = ++Statics.field508 - 1;
            class64 var15 = (class64) class64.field786.method3264((long) var11);
            int var16;
            if (var15 == null) {
                var16 = 0;
            } else if (var12 == -1) {
                var16 = 0;
            } else {
                int var17 = 0;
                for (int var18 = 0; var18 < var15.field779.length; var18++) {
                    if (var15.field777[var18] == var12) {
                        var17 += var15.field779[var18];
                    }
                }
                var16 = var17;
            }
            var13[var14] = var16;
            return 1;
        } else if (arg0 == 3304) {
            int var19 = field1333[--Statics.field508];
            int[] var20 = field1333;
            int var21 = ++Statics.field508 - 1;
            class241 var22 = (class241) class241.field3281.method3245((long) var19);
            class241 var23;
            if (var22 == null) {
                byte[] var24 = Statics.field3282.method3787(5, var19);
                class241 var25 = new class241();
                if (var24 != null) {
                    var25.method3893(new class174(var24));
                }
                class241.field3281.method3247(var25, (long) var19);
                var23 = var25;
            } else {
                var23 = var22;
            }
            var20[var21] = var23.field3280;
            return 1;
        } else if (arg0 == 3305) {
            int var26 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = client.field1041[var26];
            return 1;
        } else if (arg0 == 3306) {
            int var27 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = client.field1042[var27];
            return 1;
        } else if (arg0 == 3307) {
            int var28 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = client.field1043[var28];
            return 1;
        } else if (arg0 == 3308) {
            int var29 = Statics.field579;
            int var30 = (Statics.field1537.field1233 >> 7) + Statics.field2316;
            int var31 = (Statics.field1537.field1265 >> 7) + Statics.field265;
            field1333[++Statics.field508 - 1] = (var29 << 28) + (var30 << 14) + var31;
            return 1;
        } else if (arg0 == 3309) {
            int var32 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = var32 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var33 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = var33 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var34 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = var34 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1333[++Statics.field508 - 1] = client.field1039 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field508 -= 2;
            int var35 = field1333[Statics.field508] + 32768;
            int var36 = field1333[Statics.field508 + 1];
            field1333[++Statics.field508 - 1] = class64.method13(var35, var36);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field508 -= 2;
            int var37 = field1333[Statics.field508] + 32768;
            int var38 = field1333[Statics.field508 + 1];
            int[] var39 = field1333;
            int var40 = ++Statics.field508 - 1;
            class64 var41 = (class64) class64.field786.method3264((long) var37);
            int var42;
            if (var41 == null) {
                var42 = 0;
            } else if (var38 >= 0 && var38 < var41.field779.length) {
                var42 = var41.field779[var38];
            } else {
                var42 = 0;
            }
            var39[var40] = var42;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field508 -= 2;
            int var43 = field1333[Statics.field508] + 32768;
            int var44 = field1333[Statics.field508 + 1];
            int[] var45 = field1333;
            int var46 = ++Statics.field508 - 1;
            class64 var47 = (class64) class64.field786.method3264((long) var43);
            int var48;
            if (var47 == null) {
                var48 = 0;
            } else if (var44 == -1) {
                var48 = 0;
            } else {
                int var49 = 0;
                for (int var50 = 0; var50 < var47.field779.length; var50++) {
                    if (var47.field777[var50] == var44) {
                        var49 += var47.field779[var50];
                    }
                }
                var48 = var49;
            }
            var45[var46] = var48;
            return 1;
        } else if (arg0 == 3316) {
            if (client.field1074 >= 2) {
                field1333[++Statics.field508 - 1] = client.field1074;
            } else {
                field1333[++Statics.field508 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1333[++Statics.field508 - 1] = client.field987;
            return 1;
        } else if (arg0 == 3318) {
            field1333[++Statics.field508 - 1] = client.field1012;
            return 1;
        } else if (arg0 == 3321) {
            field1333[++Statics.field508 - 1] = client.field915;
            return 1;
        } else if (arg0 == 3322) {
            field1333[++Statics.field508 - 1] = client.field1073;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field1076) {
                field1333[++Statics.field508 - 1] = 1;
            } else {
                field1333[++Statics.field508 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1333[++Statics.field508 - 1] = client.field1087;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field508 -= 4;
            int var51 = field1333[Statics.field508];
            int var52 = field1333[Statics.field508 + 1];
            int var53 = field1333[Statics.field508 + 2];
            int var54 = field1333[Statics.field508 + 3];
            int var55 = (var52 << 14) + var51;
            int var56 = (var53 << 28) + var55;
            int var57 = var54 + var56;
            field1333[++Statics.field508 - 1] = var57;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.h(ILcg;ZB)I")
    public static int method167(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = client.field1181[var3].method91();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = client.field1181[var4].field303;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = client.field1181[var5].field305;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = client.field1181[var6].field311;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = client.field1181[var7].field307;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = client.field1181[var8].field304;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1333[--Statics.field508];
            int var10 = client.field1181[var9].method88();
            field1333[++Statics.field508 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1333[--Statics.field508];
            int var12 = client.field1181[var11].method88();
            field1333[++Statics.field508 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1333[--Statics.field508];
            int var14 = client.field1181[var13].method88();
            field1333[++Statics.field508 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1333[--Statics.field508];
            int var16 = client.field1181[var15].method88();
            field1333[++Statics.field508 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1333[--Statics.field508] == 1;
            if (Statics.field905 != null) {
                Statics.field905.method67(class14.field291, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1333[--Statics.field508] == 1;
            if (Statics.field905 != null) {
                Statics.field905.method67(class14.field293, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field508 -= 2;
            boolean var19 = field1333[Statics.field508] == 1;
            boolean var20 = field1333[Statics.field508 + 1] == 1;
            if (Statics.field905 != null) {
                Statics.field905.method67(new class96(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1333[--Statics.field508] == 1;
            if (Statics.field905 != null) {
                Statics.field905.method67(class14.field289, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1333[--Statics.field508] == 1;
            if (Statics.field905 != null) {
                Statics.field905.method67(class14.field292, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1333[++Statics.field508 - 1] = Statics.field905 == null ? 0 : Statics.field905.field295.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1333[--Statics.field508];
            class15 var24 = (class15) Statics.field905.field295.get(var23);
            field1333[++Statics.field508 - 1] = var24.field302;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1333[--Statics.field508];
            class15 var26 = (class15) Statics.field905.field295.get(var25);
            field1334[++Statics.field23 - 1] = var26.method72();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1333[--Statics.field508];
            class15 var28 = (class15) Statics.field905.field295.get(var27);
            field1334[++Statics.field23 - 1] = var28.method76();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1333[--Statics.field508];
            class15 var30 = (class15) Statics.field905.field295.get(var29);
            long var31 = class176.method584() - Statics.field844 - var30.field297;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1334[++Statics.field23 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1333[--Statics.field508];
            class15 var38 = (class15) Statics.field905.field295.get(var37);
            field1333[++Statics.field508 - 1] = var38.field298.field311;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1333[--Statics.field508];
            class15 var40 = (class15) Statics.field905.field295.get(var39);
            field1333[++Statics.field508 - 1] = var40.field298.field305;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1333[--Statics.field508];
            class15 var42 = (class15) Statics.field905.field295.get(var41);
            field1333[++Statics.field508 - 1] = var42.field298.field303;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.z(ILcg;ZB)I")
    public static int method710(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1333[--Statics.field508];
            field1334[++Statics.field23 - 1] = class257.method1498(var3).field3499;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field508 -= 2;
            int var4 = field1333[Statics.field508];
            int var5 = field1333[Statics.field508 + 1];
            class257 var6 = class257.method1498(var4);
            if (var5 < 1 || var5 > 5 || var6.field3513[var5 - 1] == null) {
                field1334[++Statics.field23 - 1] = "";
            } else {
                field1334[++Statics.field23 - 1] = var6.field3513[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field508 -= 2;
            int var7 = field1333[Statics.field508];
            int var8 = field1333[Statics.field508 + 1];
            class257 var9 = class257.method1498(var7);
            if (var8 < 1 || var8 > 5 || var9.field3514[var8 - 1] == null) {
                field1334[++Statics.field23 - 1] = "";
            } else {
                field1334[++Statics.field23 - 1] = var9.field3514[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = class257.method1498(var10).field3511;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = class257.method1498(var11).field3510 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1333[--Statics.field508];
            class257 var13 = class257.method1498(var12);
            if (var13.field3525 == -1 && var13.field3530 >= 0) {
                field1333[++Statics.field508 - 1] = var13.field3530;
            } else {
                field1333[++Statics.field508 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1333[--Statics.field508];
            class257 var15 = class257.method1498(var14);
            if (var15.field3525 >= 0 && var15.field3530 >= 0) {
                field1333[++Statics.field508 - 1] = var15.field3530;
            } else {
                field1333[++Statics.field508 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1333[--Statics.field508];
            field1333[++Statics.field508 - 1] = class257.method1498(var16).field3512 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1333[--Statics.field508];
            class257 var18 = class257.method1498(var17);
            if (var18.field3543 == -1 && var18.field3493 >= 0) {
                field1333[++Statics.field508 - 1] = var18.field3493;
            } else {
                field1333[++Statics.field508 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1333[--Statics.field508];
            class257 var20 = class257.method1498(var19);
            if (var20.field3543 >= 0 && var20.field3493 >= 0) {
                field1333[++Statics.field508 - 1] = var20.field3493;
            } else {
                field1333[++Statics.field508 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1334[--Statics.field23];
            int var22 = field1333[--Statics.field508];
            boolean var24 = var22 == 1;
            String var25 = var21.toLowerCase();
            short[] var26 = new short[16];
            int var27 = 0;
            int var28 = 0;
            while (true) {
                if (var28 >= Statics.field3492) {
                    Statics.field1182 = var26;
                    Statics.field2261 = 0;
                    Statics.field1374 = var27;
                    String[] var32 = new String[Statics.field1374];
                    for (int var33 = 0; var33 < Statics.field1374; var33++) {
                        var32[var33] = class257.method1498(var26[var33]).field3499;
                    }
                    short[] var34 = Statics.field1182;
                    class171.method1691(var32, var34, 0, var32.length - 1);
                    break;
                }
                class257 var29 = class257.method1498(var28);
                if ((!var24 || var29.field3539) && var29.field3525 == -1 && var29.field3499.toLowerCase().indexOf(var25) != -1) {
                    if (var27 >= 250) {
                        Statics.field1374 = -1;
                        Statics.field1182 = null;
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
            field1333[++Statics.field508 - 1] = Statics.field1374;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1182 == null || Statics.field2261 >= Statics.field1374) {
                field1333[++Statics.field508 - 1] = -1;
            } else {
                field1333[++Statics.field508 - 1] = Statics.field1182[++Statics.field2261 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2261 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.d(ILcg;ZS)I")
    public static int method62(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field508 -= 2;
            int var3 = field1333[Statics.field508];
            int var4 = field1333[Statics.field508 + 1];
            if (!client.field1153) {
                client.field990 = var3;
                client.field991 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1333[++Statics.field508 - 1] = client.field990;
            return 1;
        } else if (arg0 == 5506) {
            field1333[++Statics.field508 - 1] = client.field991;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1333[--Statics.field508];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field996 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1333[++Statics.field508 - 1] = client.field996;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ez.ai(ILcg;ZI)I")
    public static int method2439(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field508 -= 2;
            client.field1008 = (short) field1333[Statics.field508];
            if (client.field1008 <= 0) {
                client.field1008 = 256;
            }
            client.field1160 = (short) field1333[Statics.field508 + 1];
            if (client.field1160 <= 0) {
                client.field1160 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field508 -= 2;
            client.field1161 = (short) field1333[Statics.field508];
            if (client.field1161 <= 0) {
                client.field1161 = 256;
            }
            client.field1162 = (short) field1333[Statics.field508 + 1];
            if (client.field1162 <= 0) {
                client.field1162 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field508 -= 4;
            client.field1163 = (short) field1333[Statics.field508];
            if (client.field1163 <= 0) {
                client.field1163 = 1;
            }
            client.field1128 = (short) field1333[Statics.field508 + 1];
            if (client.field1128 <= 0) {
                client.field1128 = 32767;
            } else if (client.field1128 < client.field1163) {
                client.field1128 = client.field1163;
            }
            client.field1165 = (short) field1333[Statics.field508 + 2];
            if (client.field1165 <= 0) {
                client.field1165 = 1;
            }
            client.field1166 = (short) field1333[Statics.field508 + 3];
            if (client.field1166 <= 0) {
                client.field1166 = 32767;
            } else if (client.field1166 < client.field1165) {
                client.field1166 = client.field1165;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1079 == null) {
                field1333[++Statics.field508 - 1] = -1;
                field1333[++Statics.field508 - 1] = -1;
            } else {
                client.method168(0, 0, client.field1079.field2669, client.field1079.field2694, false);
                field1333[++Statics.field508 - 1] = client.field1169;
                field1333[++Statics.field508 - 1] = client.field1142;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1333[++Statics.field508 - 1] = client.field1161;
            field1333[++Statics.field508 - 1] = client.field1162;
            return 1;
        } else if (arg0 == 6205) {
            field1333[++Statics.field508 - 1] = client.field1008;
            field1333[++Statics.field508 - 1] = client.field1160;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.ae(ILcg;ZI)I")
    public static int method990(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1333[++Statics.field508 - 1] = class81.method3733() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = class81.method237();
            if (var3 == null) {
                field1333[++Statics.field508 - 1] = -1;
                field1333[++Statics.field508 - 1] = 0;
                field1334[++Statics.field23 - 1] = "";
                field1333[++Statics.field508 - 1] = 0;
                field1333[++Statics.field508 - 1] = 0;
                field1334[++Statics.field23 - 1] = "";
            } else {
                field1333[++Statics.field508 - 1] = var3.field1293;
                field1333[++Statics.field508 - 1] = var3.field1294;
                field1334[++Statics.field23 - 1] = var3.field1287;
                field1333[++Statics.field508 - 1] = var3.field1298;
                field1333[++Statics.field508 - 1] = var3.field1295;
                field1334[++Statics.field23 - 1] = var3.field1297;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4;
            if (class81.field1290 < class81.field1284) {
                var4 = Statics.field1292[++class81.field1290 - 1];
            } else {
                var4 = null;
            }
            if (var4 == null) {
                field1333[++Statics.field508 - 1] = -1;
                field1333[++Statics.field508 - 1] = 0;
                field1334[++Statics.field23 - 1] = "";
                field1333[++Statics.field508 - 1] = 0;
                field1333[++Statics.field508 - 1] = 0;
                field1334[++Statics.field23 - 1] = "";
            } else {
                field1333[++Statics.field508 - 1] = var4.field1293;
                field1333[++Statics.field508 - 1] = var4.field1294;
                field1334[++Statics.field23 - 1] = var4.field1287;
                field1333[++Statics.field508 - 1] = var4.field1298;
                field1333[++Statics.field508 - 1] = var4.field1295;
                field1334[++Statics.field23 - 1] = var4.field1297;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var6 = field1333[--Statics.field508];
            class81 var7 = null;
            for (int var8 = 0; var8 < class81.field1284; var8++) {
                if (Statics.field1292[var8].field1293 == var6) {
                    var7 = Statics.field1292[var8];
                    break;
                }
            }
            if (var7 == null) {
                field1333[++Statics.field508 - 1] = -1;
                field1333[++Statics.field508 - 1] = 0;
                field1334[++Statics.field23 - 1] = "";
                field1333[++Statics.field508 - 1] = 0;
                field1333[++Statics.field508 - 1] = 0;
                field1334[++Statics.field23 - 1] = "";
            } else {
                field1333[++Statics.field508 - 1] = var7.field1293;
                field1333[++Statics.field508 - 1] = var7.field1294;
                field1334[++Statics.field23 - 1] = var7.field1287;
                field1333[++Statics.field508 - 1] = var7.field1298;
                field1333[++Statics.field508 - 1] = var7.field1295;
                field1334[++Statics.field23 - 1] = var7.field1297;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field508 -= 4;
            int var9 = field1333[Statics.field508];
            boolean var10 = field1333[Statics.field508 + 1] == 1;
            int var11 = field1333[Statics.field508 + 2];
            boolean var12 = field1333[Statics.field508 + 3] == 1;
            if (Statics.field1292 != null) {
                class81.method2256(0, Statics.field1292.length - 1, var9, var10, var11, var12);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var13 = field1333[--Statics.field508];
            if (var13 >= 0 && var13 < class81.field1284) {
                class81 var14 = Statics.field1292[var13];
                field1333[++Statics.field508 - 1] = var14.field1293;
                field1333[++Statics.field508 - 1] = var14.field1294;
                field1334[++Statics.field23 - 1] = var14.field1287;
                field1333[++Statics.field508 - 1] = var14.field1298;
                field1333[++Statics.field508 - 1] = var14.field1295;
                field1334[++Statics.field23 - 1] = var14.field1297;
            } else {
                field1333[++Statics.field508 - 1] = -1;
                field1333[++Statics.field508 - 1] = 0;
                field1334[++Statics.field23 - 1] = "";
                field1333[++Statics.field508 - 1] = 0;
                field1333[++Statics.field508 - 1] = 0;
                field1334[++Statics.field23 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1053 = field1333[--Statics.field508] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field508 -= 2;
            int var15 = field1333[Statics.field508];
            int var16 = field1333[Statics.field508 + 1];
            class252 var17 = class252.method3752(var16);
            if (var17.method4053()) {
                field1334[++Statics.field23 - 1] = class259.method3748(var15).method4244(var16, var17.field3385);
            } else {
                field1333[++Statics.field508 - 1] = class259.method3748(var15).method4243(var16, var17.field3388);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field508 -= 2;
            int var18 = field1333[Statics.field508];
            int var19 = field1333[Statics.field508 + 1];
            class252 var20 = class252.method3752(var19);
            if (var20.method4053()) {
                field1334[++Statics.field23 - 1] = class256.method3652(var18).method4172(var19, var20.field3385);
            } else {
                field1333[++Statics.field508 - 1] = class256.method3652(var18).method4145(var19, var20.field3388);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field508 -= 2;
            int var21 = field1333[Statics.field508];
            int var22 = field1333[Statics.field508 + 1];
            class252 var23 = class252.method3752(var22);
            if (var23.method4053()) {
                field1334[++Statics.field23 - 1] = class257.method1498(var21).method4228(var22, var23.field3385);
            } else {
                field1333[++Statics.field508 - 1] = class257.method1498(var21).method4186(var22, var23.field3388);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field508 -= 2;
            int var24 = field1333[Statics.field508];
            int var25 = field1333[Statics.field508 + 1];
            class252 var26 = class252.method3752(var25);
            if (var26.method4053()) {
                String[] var27 = field1334;
                int var28 = ++Statics.field23 - 1;
                class253 var29 = (class253) class253.field3395.method3245((long) var24);
                class253 var30;
                if (var29 == null) {
                    byte[] var31 = Statics.field2791.method3787(34, var24);
                    class253 var32 = new class253();
                    if (var31 != null) {
                        var32.method4068(new class174(var31));
                    }
                    var32.method4091();
                    class253.field3395.method3247(var32, (long) var24);
                    var30 = var32;
                } else {
                    var30 = var29;
                }
                var27[var28] = var30.method4085(var25, var26.field3385);
            } else {
                int[] var33 = field1333;
                int var34 = ++Statics.field508 - 1;
                class253 var35 = (class253) class253.field3395.method3245((long) var24);
                class253 var36;
                if (var35 == null) {
                    byte[] var37 = Statics.field2791.method3787(34, var24);
                    class253 var38 = new class253();
                    if (var37 != null) {
                        var38.method4068(new class174(var37));
                    }
                    var38.method4091();
                    class253.field3395.method3247(var38, (long) var24);
                    var36 = var38;
                } else {
                    var36 = var35;
                }
                var33[var34] = var36.method4070(var25, var26.field3388);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hw.au(IB)V")
    public static void method3753(int arg0) {
        if (arg0 == -1 || !class217.method315(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2642[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2776 != null) {
                class70 var4 = new class70();
                var4.field831 = var3;
                var4.field840 = var3.field2776;
                method2754(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("i.ak(ILhd;ZB)V")
    public static void method144(int arg0, class213 arg1, boolean arg2) {
        class33 var3 = client.method485().method4758(arg0);
        int var4 = Statics.field1537.field890;
        int var5 = (Statics.field1537.field1233 >> 7) + Statics.field2316;
        int var6 = (Statics.field1537.field1265 >> 7) + Statics.field265;
        class213 var7 = new class213(var4, var5, var6);
        client.method485().method4878(var3, var7, arg1, arg2);
    }
}
