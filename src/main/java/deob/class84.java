package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cv")
public class class84 {

    @ObfuscatedName("cv.f")
    public static int[] field1354 = new int[5];

    @ObfuscatedName("cv.m")
    public static int[][] field1346 = new int[5][5000];

    @ObfuscatedName("cv.c")
    public static int[] field1347 = new int[1000];

    @ObfuscatedName("cv.h")
    public static String[] field1348 = new String[1000];

    @ObfuscatedName("cv.e")
    public static int field1351 = 0;

    @ObfuscatedName("cv.o")
    public static class63[] field1350 = new class63[50];

    @ObfuscatedName("cv.y")
    public static Calendar field1341 = Calendar.getInstance();

    @ObfuscatedName("cv.r")
    public static final String[] field1352 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cv.s")
    public static int field1345 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ht.n(Lbi;I)V")
    public static void method3815(class70 arg0) {
        method3637(arg0, 200000);
    }

    @ObfuscatedName("gx.p(Lbi;II)V")
    public static void method3637(class70 arg0, int arg1) {
        Object[] var2 = arg0.field834;
        class220 var3 = arg0.field832;
        boolean var4 = class220.field2790 == var3 || class220.field2791 == var3 || class220.field2798 == var3 || class220.field2792 == var3 || class220.field2793 == var3 || class220.field2794 == var3 || class220.field2795 == var3 || class220.field2796 == var3;
        class100 var6;
        if (var4) {
            Statics.field1353 = (class48) var2[0];
            class243 var5 = Statics.field1301[Statics.field1353.field601];
            var6 = class100.method662(arg0.field832, var5.field3308, var5.field3314);
        } else {
            int var7 = (Integer) var2[0];
            var6 = class100.method1610(var7);
        }
        if (var6 == null) {
            return;
        }
        Statics.field2334 = 0;
        Statics.field2445 = 0;
        int var8 = -1;
        int[] var9 = var6.field1538;
        int[] var10 = var6.field1540;
        byte var11 = -1;
        field1351 = 0;
        try {
            Statics.field1349 = new int[var6.field1537];
            int var12 = 0;
            Statics.field1344 = new String[var6.field1534];
            int var13 = 0;
            for (int var14 = 1; var14 < var2.length; var14++) {
                if (var2[var14] instanceof Integer) {
                    int var15 = (Integer) var2[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field823;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field827;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field825 == null ? -1 : arg0.field825.field2653;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field828;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field825 == null ? -1 : arg0.field825.field2654;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field836 == null ? -1 : arg0.field836.field2653;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field836 == null ? -1 : arg0.field836.field2654;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field830;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field831;
                    }
                    Statics.field1349[var12++] = var15;
                } else if (var2[var14] instanceof String) {
                    String var16 = (String) var2[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg0.field829;
                    }
                    Statics.field1344[var13++] = var16;
                }
            }
            int var17 = 0;
            field1345 = arg0.field833;
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
                                                                                                                label1458: while (true) {
                                                                                                                    var17++;
                                                                                                                    if (var17 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var8++;
                                                                                                                    int var260 = var9[var8];
                                                                                                                    if (var260 >= 100) {
                                                                                                                        boolean var51;
                                                                                                                        if (var6.field1540[var8] == 1) {
                                                                                                                            var51 = true;
                                                                                                                        } else {
                                                                                                                            var51 = false;
                                                                                                                        }
                                                                                                                        int var52;
                                                                                                                        if (var260 < 1000) {
                                                                                                                            var52 = method252(var260, var6, var51);
                                                                                                                        } else if (var260 < 1100) {
                                                                                                                            var52 = method976(var260, var6, var51);
                                                                                                                        } else if (var260 < 1200) {
                                                                                                                            var52 = method56(var260, var6, var51);
                                                                                                                        } else if (var260 < 1300) {
                                                                                                                            var52 = Statics.method54(var260, var6, var51);
                                                                                                                        } else if (var260 < 1400) {
                                                                                                                            var52 = method658(var260, var6, var51);
                                                                                                                        } else if (var260 < 1500) {
                                                                                                                            var52 = method221(var260, var6, var51);
                                                                                                                        } else if (var260 < 1600) {
                                                                                                                            class217 var56 = var51 ? Statics.field3738 : Statics.field516;
                                                                                                                            byte var57;
                                                                                                                            if (var260 == 1500) {
                                                                                                                                field1347[++Statics.field2334 - 1] = var56.field2666;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var260 == 1501) {
                                                                                                                                field1347[++Statics.field2334 - 1] = var56.field2665;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var260 == 1502) {
                                                                                                                                field1347[++Statics.field2334 - 1] = var56.field2701;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var260 == 1503) {
                                                                                                                                field1347[++Statics.field2334 - 1] = var56.field2693;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var260 == 1504) {
                                                                                                                                field1347[++Statics.field2334 - 1] = var56.field2673 ? 1 : 0;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var260 == 1505) {
                                                                                                                                field1347[++Statics.field2334 - 1] = var56.field2668;
                                                                                                                                var57 = 1;
                                                                                                                            } else {
                                                                                                                                var57 = 2;
                                                                                                                            }
                                                                                                                            var52 = var57;
                                                                                                                        } else if (var260 < 1700) {
                                                                                                                            var52 = method2680(var260, var6, var51);
                                                                                                                        } else if (var260 < 1800) {
                                                                                                                            class217 var61 = var51 ? Statics.field3738 : Statics.field516;
                                                                                                                            byte var62;
                                                                                                                            if (var260 == 1700) {
                                                                                                                                field1347[++Statics.field2334 - 1] = var61.field2773;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var260 == 1701) {
                                                                                                                                if (var61.field2773 == -1) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var61.field2692;
                                                                                                                                }
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var260 == 1702) {
                                                                                                                                field1347[++Statics.field2334 - 1] = var61.field2654;
                                                                                                                                var62 = 1;
                                                                                                                            } else {
                                                                                                                                var62 = 2;
                                                                                                                            }
                                                                                                                            var52 = var62;
                                                                                                                        } else if (var260 < 1900) {
                                                                                                                            class217 var63 = var51 ? Statics.field3738 : Statics.field516;
                                                                                                                            byte var64;
                                                                                                                            if (var260 == 1800) {
                                                                                                                                field1347[++Statics.field2334 - 1] = class218.method757(client.method4162(var63));
                                                                                                                                var64 = 1;
                                                                                                                            } else if (var260 == 1801) {
                                                                                                                                int var65 = field1347[--Statics.field2334];
                                                                                                                                int var261 = var65 - 1;
                                                                                                                                if (var63.field2727 == null || var261 >= var63.field2727.length || var63.field2727[var261] == null) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field2445 - 1] = var63.field2727[var261];
                                                                                                                                }
                                                                                                                                var64 = 1;
                                                                                                                            } else if (var260 == 1802) {
                                                                                                                                if (var63.field2726 == null) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field2445 - 1] = var63.field2726;
                                                                                                                                }
                                                                                                                                var64 = 1;
                                                                                                                            } else {
                                                                                                                                var64 = 2;
                                                                                                                            }
                                                                                                                            var52 = var64;
                                                                                                                        } else if (var260 < 2000) {
                                                                                                                            var52 = method1604(var260, var6, var51);
                                                                                                                        } else if (var260 < 2100) {
                                                                                                                            var52 = method976(var260, var6, var51);
                                                                                                                        } else if (var260 < 2200) {
                                                                                                                            var52 = method56(var260, var6, var51);
                                                                                                                        } else if (var260 < 2300) {
                                                                                                                            var52 = Statics.method54(var260, var6, var51);
                                                                                                                        } else if (var260 < 2400) {
                                                                                                                            var52 = method658(var260, var6, var51);
                                                                                                                        } else if (var260 < 2500) {
                                                                                                                            var52 = method221(var260, var6, var51);
                                                                                                                        } else if (var260 < 2600) {
                                                                                                                            var52 = method620(var260, var6, var51);
                                                                                                                        } else if (var260 < 2700) {
                                                                                                                            var52 = method4030(var260, var6, var51);
                                                                                                                        } else if (var260 < 2800) {
                                                                                                                            byte var67;
                                                                                                                            if (var260 == 2700) {
                                                                                                                                class217 var66 = class217.method3143(field1347[--Statics.field2334]);
                                                                                                                                field1347[++Statics.field2334 - 1] = var66.field2773;
                                                                                                                                var67 = 1;
                                                                                                                            } else if (var260 == 2701) {
                                                                                                                                class217 var68 = class217.method3143(field1347[--Statics.field2334]);
                                                                                                                                if (var68.field2773 == -1) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var68.field2692;
                                                                                                                                }
                                                                                                                                var67 = 1;
                                                                                                                            } else if (var260 == 2702) {
                                                                                                                                int var69 = field1347[--Statics.field2334];
                                                                                                                                class69 var70 = (class69) client.field1135.method3295((long) var69);
                                                                                                                                if (var70 == null) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 1;
                                                                                                                                }
                                                                                                                                var67 = 1;
                                                                                                                            } else if (var260 == 2706) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field993;
                                                                                                                                var67 = 1;
                                                                                                                            } else {
                                                                                                                                var67 = 2;
                                                                                                                            }
                                                                                                                            var52 = var67;
                                                                                                                        } else if (var260 < 2900) {
                                                                                                                            var52 = method684(var260, var6, var51);
                                                                                                                        } else if (var260 < 3000) {
                                                                                                                            var52 = method1604(var260, var6, var51);
                                                                                                                        } else if (var260 < 3200) {
                                                                                                                            var52 = method655(var260, var6, var51);
                                                                                                                        } else if (var260 < 3300) {
                                                                                                                            var52 = method934(var260, var6, var51);
                                                                                                                        } else if (var260 < 3400) {
                                                                                                                            byte var71;
                                                                                                                            if (var260 == 3300) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field923;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3301) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var72 = field1347[Statics.field2334];
                                                                                                                                int var73 = field1347[Statics.field2334 + 1];
                                                                                                                                field1347[++Statics.field2334 - 1] = class64.method68(var72, var73);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3302) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var74 = field1347[Statics.field2334];
                                                                                                                                int var75 = field1347[Statics.field2334 + 1];
                                                                                                                                int[] var76 = field1347;
                                                                                                                                int var77 = ++Statics.field2334 - 1;
                                                                                                                                class64 var78 = (class64) class64.field770.method3295((long) var74);
                                                                                                                                int var79;
                                                                                                                                if (var78 == null) {
                                                                                                                                    var79 = 0;
                                                                                                                                } else if (var75 >= 0 && var75 < var78.field765.length) {
                                                                                                                                    var79 = var78.field765[var75];
                                                                                                                                } else {
                                                                                                                                    var79 = 0;
                                                                                                                                }
                                                                                                                                var76[var77] = var79;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3303) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var80 = field1347[Statics.field2334];
                                                                                                                                int var81 = field1347[Statics.field2334 + 1];
                                                                                                                                field1347[++Statics.field2334 - 1] = class64.method60(var80, var81);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3304) {
                                                                                                                                int var82 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = class241.method1551(var82).field3286;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3305) {
                                                                                                                                int var83 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1171[var83];
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3306) {
                                                                                                                                int var84 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1051[var84];
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3307) {
                                                                                                                                int var85 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1012[var85];
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3308) {
                                                                                                                                int var86 = Statics.field1449;
                                                                                                                                int var87 = (Statics.field2350.field1234 >> 7) + Statics.field749;
                                                                                                                                int var88 = (Statics.field2350.field1276 >> 7) + Statics.field357;
                                                                                                                                field1347[++Statics.field2334 - 1] = (var86 << 28) + (var87 << 14) + var88;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3309) {
                                                                                                                                int var89 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = var89 >> 14 & 0x3FFF;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3310) {
                                                                                                                                int var90 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = var90 >> 28;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3311) {
                                                                                                                                int var91 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = var91 & 0x3FFF;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3312) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field918 ? 1 : 0;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3313) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var92 = field1347[Statics.field2334] + 32768;
                                                                                                                                int var93 = field1347[Statics.field2334 + 1];
                                                                                                                                field1347[++Statics.field2334 - 1] = class64.method68(var92, var93);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3314) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var94 = field1347[Statics.field2334] + 32768;
                                                                                                                                int var95 = field1347[Statics.field2334 + 1];
                                                                                                                                int[] var96 = field1347;
                                                                                                                                int var97 = ++Statics.field2334 - 1;
                                                                                                                                class64 var98 = (class64) class64.field770.method3295((long) var94);
                                                                                                                                int var99;
                                                                                                                                if (var98 == null) {
                                                                                                                                    var99 = 0;
                                                                                                                                } else if (var95 >= 0 && var95 < var98.field765.length) {
                                                                                                                                    var99 = var98.field765[var95];
                                                                                                                                } else {
                                                                                                                                    var99 = 0;
                                                                                                                                }
                                                                                                                                var96[var97] = var99;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3315) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var100 = field1347[Statics.field2334] + 32768;
                                                                                                                                int var101 = field1347[Statics.field2334 + 1];
                                                                                                                                field1347[++Statics.field2334 - 1] = class64.method60(var100, var101);
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3316) {
                                                                                                                                if (client.field1133 >= 2) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = client.field1133;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                }
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3317) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1082;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3318) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field914;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3321) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1007;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3322) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1198;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3323) {
                                                                                                                                if (client.field1041) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                }
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3324) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field987;
                                                                                                                                var71 = 1;
                                                                                                                            } else if (var260 == 3325) {
                                                                                                                                Statics.field2334 -= 4;
                                                                                                                                int var102 = field1347[Statics.field2334];
                                                                                                                                int var103 = field1347[Statics.field2334 + 1];
                                                                                                                                int var104 = field1347[Statics.field2334 + 2];
                                                                                                                                int var105 = field1347[Statics.field2334 + 3];
                                                                                                                                int var106 = (var103 << 14) + var102;
                                                                                                                                int var107 = (var104 << 28) + var106;
                                                                                                                                int var108 = var105 + var107;
                                                                                                                                field1347[++Statics.field2334 - 1] = var108;
                                                                                                                                var71 = 1;
                                                                                                                            } else {
                                                                                                                                var71 = 2;
                                                                                                                            }
                                                                                                                            var52 = var71;
                                                                                                                        } else if (var260 < 3500) {
                                                                                                                            byte var113;
                                                                                                                            if (var260 == 3400) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var109 = field1347[Statics.field2334];
                                                                                                                                int var110 = field1347[Statics.field2334 + 1];
                                                                                                                                class254 var111 = class254.method92(var109);
                                                                                                                                if (var111.field3408 != 's') {
                                                                                                                                }
                                                                                                                                for (int var112 = 0; var112 < var111.field3405; var112++) {
                                                                                                                                    if (var111.field3412[var112] == var110) {
                                                                                                                                        field1348[++Statics.field2445 - 1] = var111.field3414[var112];
                                                                                                                                        var111 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var111 != null) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = var111.field3409;
                                                                                                                                }
                                                                                                                                var113 = 1;
                                                                                                                            } else if (var260 == 3408) {
                                                                                                                                Statics.field2334 -= 4;
                                                                                                                                int var114 = field1347[Statics.field2334];
                                                                                                                                int var115 = field1347[Statics.field2334 + 1];
                                                                                                                                int var116 = field1347[Statics.field2334 + 2];
                                                                                                                                int var117 = field1347[Statics.field2334 + 3];
                                                                                                                                class254 var118 = class254.method92(var116);
                                                                                                                                if (var118.field3407 == var114 && var118.field3408 == var115) {
                                                                                                                                    for (int var119 = 0; var119 < var118.field3405; var119++) {
                                                                                                                                        if (var118.field3412[var119] == var117) {
                                                                                                                                            if (var115 == 115) {
                                                                                                                                                field1348[++Statics.field2445 - 1] = var118.field3414[var119];
                                                                                                                                            } else {
                                                                                                                                                field1347[++Statics.field2334 - 1] = var118.field3416[var119];
                                                                                                                                            }
                                                                                                                                            var118 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var118 != null) {
                                                                                                                                        if (var115 == 115) {
                                                                                                                                            field1348[++Statics.field2445 - 1] = var118.field3409;
                                                                                                                                        } else {
                                                                                                                                            field1347[++Statics.field2334 - 1] = var118.field3406;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var113 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var115 == 115) {
                                                                                                                                        field1348[++Statics.field2445 - 1] = "null";
                                                                                                                                    } else {
                                                                                                                                        field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var113 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var113 = 2;
                                                                                                                            }
                                                                                                                            var52 = var113;
                                                                                                                        } else if (var260 < 3700) {
                                                                                                                            byte var120;
                                                                                                                            if (var260 == 3600) {
                                                                                                                                if (client.field1184 == 0) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = -2;
                                                                                                                                } else if (client.field1184 == 1) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = client.field1183;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3601) {
                                                                                                                                int var121 = field1347[--Statics.field2334];
                                                                                                                                if (client.field1184 == 2 && var121 < client.field1183) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = client.field1185[var121].field796;
                                                                                                                                    field1348[++Statics.field2445 - 1] = client.field1185[var121].field792;
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3602) {
                                                                                                                                int var122 = field1347[--Statics.field2334];
                                                                                                                                if (client.field1184 == 2 && var122 < client.field1183) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = client.field1185[var122].field793;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3603) {
                                                                                                                                int var123 = field1347[--Statics.field2334];
                                                                                                                                if (client.field1184 == 2 && var123 < client.field1183) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = client.field1185[var123].field791;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3604) {
                                                                                                                                String var124 = field1348[--Statics.field2445];
                                                                                                                                int var125 = field1347[--Statics.field2334];
                                                                                                                                client.method99(var124, var125);
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3605) {
                                                                                                                                String var126 = field1348[--Statics.field2445];
                                                                                                                                if (var126 != null) {
                                                                                                                                    if ((client.field1183 < 200 || client.field1147 == 1) && client.field1183 < 400) {
                                                                                                                                        String var127 = Statics.method2789(var126, Statics.field282);
                                                                                                                                        if (var127 != null) {
                                                                                                                                            int var128 = 0;
                                                                                                                                            label1260: while (true) {
                                                                                                                                                if (var128 >= client.field1183) {
                                                                                                                                                    for (int var132 = 0; var132 < client.field1187; var132++) {
                                                                                                                                                        class71 var133 = client.field1188[var132];
                                                                                                                                                        String var134 = Statics.method2789(var133.field844, Statics.field282);
                                                                                                                                                        if (var134 != null && var134.equals(var127)) {
                                                                                                                                                            class99.method1689(30, "", class226.field3026 + var126 + class226.field3093);
                                                                                                                                                            break label1260;
                                                                                                                                                        }
                                                                                                                                                        if (var133.field843 != null) {
                                                                                                                                                            String var135 = Statics.method2789(var133.field843, Statics.field282);
                                                                                                                                                            if (var135 != null && var135.equals(var127)) {
                                                                                                                                                                class99.method1689(30, "", class226.field3026 + var126 + class226.field3093);
                                                                                                                                                                break label1260;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (Statics.method2789(Statics.field2350.field888, Statics.field282).equals(var127)) {
                                                                                                                                                        class99.method1689(30, "", class226.field2956);
                                                                                                                                                    } else {
                                                                                                                                                        client.field957.method3159(212);
                                                                                                                                                        client.field957.method2906(Statics.method1708(var126));
                                                                                                                                                        client.field957.method2912(var126);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class66 var129 = client.field1185[var128];
                                                                                                                                                String var130 = Statics.method2789(var129.field796, Statics.field282);
                                                                                                                                                if (var130 != null && var130.equals(var127)) {
                                                                                                                                                    class99.method1689(30, "", var126 + class226.field2988);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var129.field792 != null) {
                                                                                                                                                    String var131 = Statics.method2789(var129.field792, Statics.field282);
                                                                                                                                                    if (var131 != null && var131.equals(var127)) {
                                                                                                                                                        class99.method1689(30, "", var126 + class226.field2988);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var128++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class99.method1689(30, "", class226.field3012);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3606) {
                                                                                                                                String var136 = field1348[--Statics.field2445];
                                                                                                                                client.method4044(var136);
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3607) {
                                                                                                                                String var137 = field1348[--Statics.field2445];
                                                                                                                                client.method1613(var137, false);
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3608) {
                                                                                                                                String var138 = field1348[--Statics.field2445];
                                                                                                                                client.method2(var138);
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3609) {
                                                                                                                                String var139 = field1348[--Statics.field2445];
                                                                                                                                class231[] var140 = new class231[] { class231.field3182, class231.field3174, class231.field3172, class231.field3176, class231.field3173, class231.field3181 };
                                                                                                                                class231[] var141 = var140;
                                                                                                                                for (int var142 = 0; var142 < var141.length; var142++) {
                                                                                                                                    class231 var143 = var141[var142];
                                                                                                                                    if (var143.field3175 != -1 && var139.startsWith(class89.method971(var143.field3175))) {
                                                                                                                                        var139 = var139.substring(6 + Integer.toString(var143.field3175).length());
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1347[++Statics.field2334 - 1] = client.method27(var139, false) ? 1 : 0;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3611) {
                                                                                                                                if (client.field1142 == null) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field2445 - 1] = class269.method1578(client.field1142);
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3612) {
                                                                                                                                if (client.field1142 == null) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = Statics.field370;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3613) {
                                                                                                                                int var144 = field1347[--Statics.field2334];
                                                                                                                                if (client.field1142 == null || var144 >= Statics.field370) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field2445 - 1] = Statics.field17[var144].field912;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3614) {
                                                                                                                                int var145 = field1347[--Statics.field2334];
                                                                                                                                if (client.field1142 == null || var145 >= Statics.field370) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = Statics.field17[var145].field900;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3615) {
                                                                                                                                int var146 = field1347[--Statics.field2334];
                                                                                                                                if (client.field1142 == null || var146 >= Statics.field370) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = Statics.field17[var146].field901;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3616) {
                                                                                                                                field1347[++Statics.field2334 - 1] = Statics.field1144;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3617) {
                                                                                                                                String var147 = field1348[--Statics.field2445];
                                                                                                                                if (Statics.field17 != null) {
                                                                                                                                    client.field957.method3159(127);
                                                                                                                                    client.field957.method2906(Statics.method1708(var147));
                                                                                                                                    client.field957.method2912(var147);
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3618) {
                                                                                                                                field1347[++Statics.field2334 - 1] = Statics.field1694;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3619) {
                                                                                                                                String var148 = field1348[--Statics.field2445];
                                                                                                                                if (!var148.equals("")) {
                                                                                                                                    client.field957.method3159(163);
                                                                                                                                    client.field957.method2906(Statics.method1708(var148));
                                                                                                                                    client.field957.method2912(var148);
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3620) {
                                                                                                                                client.method973();
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3621) {
                                                                                                                                if (client.field1184 == 0) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = client.field1187;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3622) {
                                                                                                                                int var149 = field1347[--Statics.field2334];
                                                                                                                                if (client.field1184 == 0 || var149 >= client.field1187) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field2445 - 1] = client.field1188[var149].field844;
                                                                                                                                    field1348[++Statics.field2445 - 1] = client.field1188[var149].field843;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3623) {
                                                                                                                                String var150 = field1348[--Statics.field2445];
                                                                                                                                if (var150.startsWith(class89.method971(0)) || var150.startsWith(class89.method971(1))) {
                                                                                                                                    var150 = var150.substring(7);
                                                                                                                                }
                                                                                                                                field1347[++Statics.field2334 - 1] = client.method2886(var150) ? 1 : 0;
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3624) {
                                                                                                                                int var151 = field1347[--Statics.field2334];
                                                                                                                                if (Statics.field17 == null || var151 >= Statics.field370 || !Statics.field17[var151].field912.equalsIgnoreCase(Statics.field2350.field888)) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = 1;
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else if (var260 == 3625) {
                                                                                                                                if (client.field1143 == null) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field2445 - 1] = class269.method1578(client.field1143);
                                                                                                                                }
                                                                                                                                var120 = 1;
                                                                                                                            } else {
                                                                                                                                var120 = 2;
                                                                                                                            }
                                                                                                                            var52 = var120;
                                                                                                                        } else if (var260 < 4000) {
                                                                                                                            byte var153;
                                                                                                                            if (var260 == 3903) {
                                                                                                                                int var152 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1192[var152].method106();
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3904) {
                                                                                                                                int var154 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1192[var154].field308;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3905) {
                                                                                                                                int var155 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1192[var155].field309;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3906) {
                                                                                                                                int var156 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1192[var156].field310;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3907) {
                                                                                                                                int var157 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1192[var157].field315;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3908) {
                                                                                                                                int var158 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1192[var158].field312;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3910) {
                                                                                                                                int var159 = field1347[--Statics.field2334];
                                                                                                                                int var160 = client.field1192[var159].method109();
                                                                                                                                field1347[++Statics.field2334 - 1] = var160 == 0 ? 1 : 0;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3911) {
                                                                                                                                int var161 = field1347[--Statics.field2334];
                                                                                                                                int var162 = client.field1192[var161].method109();
                                                                                                                                field1347[++Statics.field2334 - 1] = var162 == 2 ? 1 : 0;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3912) {
                                                                                                                                int var163 = field1347[--Statics.field2334];
                                                                                                                                int var164 = client.field1192[var163].method109();
                                                                                                                                field1347[++Statics.field2334 - 1] = var164 == 5 ? 1 : 0;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3913) {
                                                                                                                                int var165 = field1347[--Statics.field2334];
                                                                                                                                int var166 = client.field1192[var165].method109();
                                                                                                                                field1347[++Statics.field2334 - 1] = var166 == 1 ? 1 : 0;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3914) {
                                                                                                                                boolean var167 = field1347[--Statics.field2334] == 1;
                                                                                                                                if (Statics.field835 != null) {
                                                                                                                                    Statics.field835.method73(class14.field281, var167);
                                                                                                                                }
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3915) {
                                                                                                                                boolean var168 = field1347[--Statics.field2334] == 1;
                                                                                                                                if (Statics.field835 != null) {
                                                                                                                                    Statics.field835.method73(class14.field280, var168);
                                                                                                                                }
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3916) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                boolean var169 = field1347[Statics.field2334] == 1;
                                                                                                                                boolean var170 = field1347[Statics.field2334 + 1] == 1;
                                                                                                                                if (Statics.field835 != null) {
                                                                                                                                    Statics.field835.method73(new class96(var170), var169);
                                                                                                                                }
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3917) {
                                                                                                                                boolean var171 = field1347[--Statics.field2334] == 1;
                                                                                                                                if (Statics.field835 != null) {
                                                                                                                                    Statics.field835.method73(class14.field279, var171);
                                                                                                                                }
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3918) {
                                                                                                                                boolean var172 = field1347[--Statics.field2334] == 1;
                                                                                                                                if (Statics.field835 != null) {
                                                                                                                                    Statics.field835.method73(class14.field284, var172);
                                                                                                                                }
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3919) {
                                                                                                                                field1347[++Statics.field2334 - 1] = Statics.field835 == null ? 0 : Statics.field835.field285.size();
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3920) {
                                                                                                                                int var173 = field1347[--Statics.field2334];
                                                                                                                                class15 var174 = (class15) Statics.field835.field285.get(var173);
                                                                                                                                field1347[++Statics.field2334 - 1] = var174.field293;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3921) {
                                                                                                                                int var175 = field1347[--Statics.field2334];
                                                                                                                                class15 var176 = (class15) Statics.field835.field285.get(var175);
                                                                                                                                field1348[++Statics.field2445 - 1] = var176.method80();
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3922) {
                                                                                                                                int var177 = field1347[--Statics.field2334];
                                                                                                                                class15 var178 = (class15) Statics.field835.field285.get(var177);
                                                                                                                                field1348[++Statics.field2445 - 1] = var178.method81();
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3923) {
                                                                                                                                int var179 = field1347[--Statics.field2334];
                                                                                                                                class15 var180 = (class15) Statics.field835.field285.get(var179);
                                                                                                                                long var181 = class176.method2396() - Statics.field1780 - var180.field288;
                                                                                                                                int var183 = (int) (var181 / 3600000L);
                                                                                                                                int var184 = (int) ((var181 - (long) (var183 * 3600000)) / 60000L);
                                                                                                                                int var185 = (int) ((var181 - (long) (var183 * 3600000) - (long) (var184 * 60000)) / 1000L);
                                                                                                                                String var186 = var183 + ":" + var184 / 10 + var184 % 10 + ":" + var185 / 10 + var185 % 10;
                                                                                                                                field1348[++Statics.field2445 - 1] = var186;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3924) {
                                                                                                                                int var187 = field1347[--Statics.field2334];
                                                                                                                                class15 var188 = (class15) Statics.field835.field285.get(var187);
                                                                                                                                field1347[++Statics.field2334 - 1] = var188.field289.field310;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3925) {
                                                                                                                                int var189 = field1347[--Statics.field2334];
                                                                                                                                class15 var190 = (class15) Statics.field835.field285.get(var189);
                                                                                                                                field1347[++Statics.field2334 - 1] = var190.field289.field309;
                                                                                                                                var153 = 1;
                                                                                                                            } else if (var260 == 3926) {
                                                                                                                                int var191 = field1347[--Statics.field2334];
                                                                                                                                class15 var192 = (class15) Statics.field835.field285.get(var191);
                                                                                                                                field1347[++Statics.field2334 - 1] = var192.field289.field308;
                                                                                                                                var153 = 1;
                                                                                                                            } else {
                                                                                                                                var153 = 2;
                                                                                                                            }
                                                                                                                            var52 = var153;
                                                                                                                        } else if (var260 < 4100) {
                                                                                                                            var52 = method1513(var260, var6, var51);
                                                                                                                        } else if (var260 < 4200) {
                                                                                                                            var52 = method1388(var260, var6, var51);
                                                                                                                        } else if (var260 < 4300) {
                                                                                                                            byte var194;
                                                                                                                            if (var260 == 4200) {
                                                                                                                                int var193 = field1347[--Statics.field2334];
                                                                                                                                field1348[++Statics.field2445 - 1] = class257.method4344(var193).field3507;
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4201) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var195 = field1347[Statics.field2334];
                                                                                                                                int var196 = field1347[Statics.field2334 + 1];
                                                                                                                                class257 var197 = class257.method4344(var195);
                                                                                                                                if (var196 < 1 || var196 > 5 || var197.field3521[var196 - 1] == null) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field2445 - 1] = var197.field3521[var196 - 1];
                                                                                                                                }
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4202) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var198 = field1347[Statics.field2334];
                                                                                                                                int var199 = field1347[Statics.field2334 + 1];
                                                                                                                                class257 var200 = class257.method4344(var198);
                                                                                                                                if (var199 < 1 || var199 > 5 || var200.field3522[var199 - 1] == null) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field2445 - 1] = var200.field3522[var199 - 1];
                                                                                                                                }
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4203) {
                                                                                                                                int var201 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = class257.method4344(var201).field3509;
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4204) {
                                                                                                                                int var202 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = class257.method4344(var202).field3535 == 1 ? 1 : 0;
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4205) {
                                                                                                                                int var203 = field1347[--Statics.field2334];
                                                                                                                                class257 var204 = class257.method4344(var203);
                                                                                                                                if (var204.field3539 == -1 && var204.field3538 >= 0) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var204.field3538;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var203;
                                                                                                                                }
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4206) {
                                                                                                                                int var205 = field1347[--Statics.field2334];
                                                                                                                                class257 var206 = class257.method4344(var205);
                                                                                                                                if (var206.field3539 >= 0 && var206.field3538 >= 0) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var206.field3538;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var205;
                                                                                                                                }
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4207) {
                                                                                                                                int var207 = field1347[--Statics.field2334];
                                                                                                                                field1347[++Statics.field2334 - 1] = class257.method4344(var207).field3520 ? 1 : 0;
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4208) {
                                                                                                                                int var208 = field1347[--Statics.field2334];
                                                                                                                                class257 var209 = class257.method4344(var208);
                                                                                                                                if (var209.field3544 == -1 && var209.field3550 >= 0) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var209.field3550;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var208;
                                                                                                                                }
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4209) {
                                                                                                                                int var210 = field1347[--Statics.field2334];
                                                                                                                                class257 var211 = class257.method4344(var210);
                                                                                                                                if (var211.field3544 >= 0 && var211.field3550 >= 0) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var211.field3550;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var210;
                                                                                                                                }
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4210) {
                                                                                                                                String var212 = field1348[--Statics.field2445];
                                                                                                                                int var213 = field1347[--Statics.field2334];
                                                                                                                                client.method87(var212, var213 == 1);
                                                                                                                                field1347[++Statics.field2334 - 1] = Statics.field245;
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4211) {
                                                                                                                                if (Statics.field270 == null || Statics.field1638 >= Statics.field245) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = Statics.field270[++Statics.field1638 - 1] & 0xFFFF;
                                                                                                                                }
                                                                                                                                var194 = 1;
                                                                                                                            } else if (var260 == 4212) {
                                                                                                                                Statics.field1638 = 0;
                                                                                                                                var194 = 1;
                                                                                                                            } else {
                                                                                                                                var194 = 2;
                                                                                                                            }
                                                                                                                            var52 = var194;
                                                                                                                        } else if (var260 < 5100) {
                                                                                                                            var52 = method248(var260, var6, var51);
                                                                                                                        } else if (var260 < 5400) {
                                                                                                                            byte var214;
                                                                                                                            if (var260 == 5306) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.method2677();
                                                                                                                                var214 = 1;
                                                                                                                            } else if (var260 == 5307) {
                                                                                                                                int var215 = field1347[--Statics.field2334];
                                                                                                                                if (var215 == 1 || var215 == 2) {
                                                                                                                                    client.field947 = 0L;
                                                                                                                                    if (var215 >= 2) {
                                                                                                                                        client.field1131 = true;
                                                                                                                                    } else {
                                                                                                                                        client.field1131 = false;
                                                                                                                                    }
                                                                                                                                    if (client.method2677() == 1) {
                                                                                                                                        Statics.field591.method744(765, 503);
                                                                                                                                    } else {
                                                                                                                                        Statics.field591.method744(7680, 2160);
                                                                                                                                    }
                                                                                                                                    if (client.field970 >= 25) {
                                                                                                                                        client.method1383();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var214 = 1;
                                                                                                                            } else if (var260 == 5308) {
                                                                                                                                field1347[++Statics.field2334 - 1] = Statics.field802.field1318;
                                                                                                                                var214 = 1;
                                                                                                                            } else if (var260 == 5309) {
                                                                                                                                int var216 = field1347[--Statics.field2334];
                                                                                                                                if (var216 == 1 || var216 == 2) {
                                                                                                                                    Statics.field802.field1318 = var216;
                                                                                                                                    class82.method220();
                                                                                                                                }
                                                                                                                                var214 = 1;
                                                                                                                            } else {
                                                                                                                                var214 = 2;
                                                                                                                            }
                                                                                                                            var52 = var214;
                                                                                                                        } else if (var260 < 5600) {
                                                                                                                            byte var222;
                                                                                                                            if (var260 == 5504) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var220 = field1347[Statics.field2334];
                                                                                                                                int var221 = field1347[Statics.field2334 + 1];
                                                                                                                                if (!client.field988) {
                                                                                                                                    client.field1108 = var220;
                                                                                                                                    client.field1000 = var221;
                                                                                                                                }
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var260 == 5505) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1108;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var260 == 5506) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1000;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var260 == 5530) {
                                                                                                                                int var223 = field1347[--Statics.field2334];
                                                                                                                                if (var223 < 0) {
                                                                                                                                    var223 = 0;
                                                                                                                                }
                                                                                                                                client.field1005 = var223;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var260 == 5531) {
                                                                                                                                field1347[++Statics.field2334 - 1] = client.field1005;
                                                                                                                                var222 = 1;
                                                                                                                            } else {
                                                                                                                                var222 = 2;
                                                                                                                            }
                                                                                                                            var52 = var222;
                                                                                                                        } else if (var260 < 5700) {
                                                                                                                            var52 = method1543(var260, var6, var51);
                                                                                                                        } else if (var260 < 6300) {
                                                                                                                            var52 = method1576(var260, var6, var51);
                                                                                                                        } else if (var260 < 6600) {
                                                                                                                            byte var224;
                                                                                                                            if (var260 == 6500) {
                                                                                                                                field1347[++Statics.field2334 - 1] = class81.method494() ? 1 : 0;
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6501) {
                                                                                                                                class81 var225 = class81.method181();
                                                                                                                                if (var225 == null) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = -1;
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var225.field1308;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var225.field1309;
                                                                                                                                    field1348[++Statics.field2445 - 1] = var225.field1306;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var225.field1307;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var225.field1304;
                                                                                                                                    field1348[++Statics.field2445 - 1] = var225.field1313;
                                                                                                                                }
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6502) {
                                                                                                                                class81 var226;
                                                                                                                                if (class81.field1312 < class81.field1298) {
                                                                                                                                    var226 = Statics.field1297[++class81.field1312 - 1];
                                                                                                                                } else {
                                                                                                                                    var226 = null;
                                                                                                                                }
                                                                                                                                if (var226 == null) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = -1;
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var226.field1308;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var226.field1309;
                                                                                                                                    field1348[++Statics.field2445 - 1] = var226.field1306;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var226.field1307;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var226.field1304;
                                                                                                                                    field1348[++Statics.field2445 - 1] = var226.field1313;
                                                                                                                                }
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6506) {
                                                                                                                                int var228 = field1347[--Statics.field2334];
                                                                                                                                class81 var229 = null;
                                                                                                                                for (int var230 = 0; var230 < class81.field1298; var230++) {
                                                                                                                                    if (Statics.field1297[var230].field1308 == var228) {
                                                                                                                                        var229 = Statics.field1297[var230];
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var229 == null) {
                                                                                                                                    field1347[++Statics.field2334 - 1] = -1;
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = var229.field1308;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var229.field1309;
                                                                                                                                    field1348[++Statics.field2445 - 1] = var229.field1306;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var229.field1307;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var229.field1304;
                                                                                                                                    field1348[++Statics.field2445 - 1] = var229.field1313;
                                                                                                                                }
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6507) {
                                                                                                                                Statics.field2334 -= 4;
                                                                                                                                int var231 = field1347[Statics.field2334];
                                                                                                                                boolean var232 = field1347[Statics.field2334 + 1] == 1;
                                                                                                                                int var233 = field1347[Statics.field2334 + 2];
                                                                                                                                boolean var234 = field1347[Statics.field2334 + 3] == 1;
                                                                                                                                class81.method90(var231, var232, var233, var234);
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6511) {
                                                                                                                                int var235 = field1347[--Statics.field2334];
                                                                                                                                if (var235 >= 0 && var235 < class81.field1298) {
                                                                                                                                    class81 var236 = Statics.field1297[var235];
                                                                                                                                    field1347[++Statics.field2334 - 1] = var236.field1308;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var236.field1309;
                                                                                                                                    field1348[++Statics.field2445 - 1] = var236.field1306;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var236.field1307;
                                                                                                                                    field1347[++Statics.field2334 - 1] = var236.field1304;
                                                                                                                                    field1348[++Statics.field2445 - 1] = var236.field1313;
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = -1;
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1347[++Statics.field2334 - 1] = 0;
                                                                                                                                    field1348[++Statics.field2445 - 1] = "";
                                                                                                                                }
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6512) {
                                                                                                                                client.field1062 = field1347[--Statics.field2334] == 1;
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6513) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var237 = field1347[Statics.field2334];
                                                                                                                                int var238 = field1347[Statics.field2334 + 1];
                                                                                                                                class252 var239 = class252.method1729(var238);
                                                                                                                                if (var239.method4148()) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = Statics.method3798(var237).method4369(var238, var239.field3392);
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = Statics.method3798(var237).method4355(var238, var239.field3391);
                                                                                                                                }
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6514) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var240 = field1347[Statics.field2334];
                                                                                                                                int var241 = field1347[Statics.field2334 + 1];
                                                                                                                                class252 var242 = class252.method1729(var241);
                                                                                                                                if (var242.method4148()) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = class256.method937(var240).method4245(var241, var242.field3392);
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = class256.method937(var240).method4239(var241, var242.field3391);
                                                                                                                                }
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6515) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var243 = field1347[Statics.field2334];
                                                                                                                                int var244 = field1347[Statics.field2334 + 1];
                                                                                                                                class252 var245 = class252.method1729(var244);
                                                                                                                                if (var245.method4148()) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = class257.method4344(var243).method4299(var244, var245.field3392);
                                                                                                                                } else {
                                                                                                                                    field1347[++Statics.field2334 - 1] = class257.method4344(var243).method4328(var244, var245.field3391);
                                                                                                                                }
                                                                                                                                var224 = 1;
                                                                                                                            } else if (var260 == 6516) {
                                                                                                                                Statics.field2334 -= 2;
                                                                                                                                int var246 = field1347[Statics.field2334];
                                                                                                                                int var247 = field1347[Statics.field2334 + 1];
                                                                                                                                class252 var248 = class252.method1729(var247);
                                                                                                                                if (var248.method4148()) {
                                                                                                                                    field1348[++Statics.field2445 - 1] = class253.method3647(var246).method4176(var247, var248.field3392);
                                                                                                                                } else {
                                                                                                                                    int[] var249 = field1347;
                                                                                                                                    int var250 = ++Statics.field2334 - 1;
                                                                                                                                    class253 var251 = (class253) class253.field3404.method3280((long) var246);
                                                                                                                                    class253 var252;
                                                                                                                                    if (var251 == null) {
                                                                                                                                        byte[] var253 = Statics.field3402.method3880(34, var246);
                                                                                                                                        class253 var254 = new class253();
                                                                                                                                        if (var253 != null) {
                                                                                                                                            var254.method4164(new class174(var253));
                                                                                                                                        }
                                                                                                                                        var254.method4163();
                                                                                                                                        class253.field3404.method3282(var254, (long) var246);
                                                                                                                                        var252 = var254;
                                                                                                                                    } else {
                                                                                                                                        var252 = var251;
                                                                                                                                    }
                                                                                                                                    var249[var250] = var252.method4172(var247, var248.field3391);
                                                                                                                                }
                                                                                                                                var224 = 1;
                                                                                                                            } else {
                                                                                                                                var224 = 2;
                                                                                                                            }
                                                                                                                            var52 = var224;
                                                                                                                        } else if (var260 < 6700) {
                                                                                                                            var52 = method3577(var260, var6, var51);
                                                                                                                        } else {
                                                                                                                            var52 = 2;
                                                                                                                        }
                                                                                                                        switch(var52) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var260 == 0) {
                                                                                                                        field1347[++Statics.field2334 - 1] = var10[var8];
                                                                                                                    } else if (var260 == 1) {
                                                                                                                        int var18 = var10[var8];
                                                                                                                        field1347[++Statics.field2334 - 1] = class212.field2615[var18];
                                                                                                                    } else if (var260 == 2) {
                                                                                                                        int var19 = var10[var8];
                                                                                                                        class212.field2615[var19] = field1347[--Statics.field2334];
                                                                                                                        client.method1378(var19);
                                                                                                                    } else if (var260 == 3) {
                                                                                                                        field1348[++Statics.field2445 - 1] = var6.field1536[var8];
                                                                                                                    } else if (var260 == 6) {
                                                                                                                        var8 += var10[var8];
                                                                                                                    } else if (var260 == 7) {
                                                                                                                        Statics.field2334 -= 2;
                                                                                                                        if (field1347[Statics.field2334] != field1347[Statics.field2334 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var260 == 8) {
                                                                                                                        Statics.field2334 -= 2;
                                                                                                                        if (field1347[Statics.field2334] == field1347[Statics.field2334 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var260 == 9) {
                                                                                                                        Statics.field2334 -= 2;
                                                                                                                        if (field1347[Statics.field2334] < field1347[Statics.field2334 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var260 == 10) {
                                                                                                                        Statics.field2334 -= 2;
                                                                                                                        if (field1347[Statics.field2334] > field1347[Statics.field2334 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var260 == 21) {
                                                                                                                        if (field1351 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var20 = field1350[--field1351];
                                                                                                                        var6 = var20.field762;
                                                                                                                        var9 = var6.field1538;
                                                                                                                        var10 = var6.field1540;
                                                                                                                        var8 = var20.field758;
                                                                                                                        Statics.field1349 = var20.field757;
                                                                                                                        Statics.field1344 = var20.field760;
                                                                                                                    } else if (var260 == 25) {
                                                                                                                        int var21 = var10[var8];
                                                                                                                        field1347[++Statics.field2334 - 1] = class212.method3578(var21);
                                                                                                                    } else if (var260 == 27) {
                                                                                                                        int var22 = var10[var8];
                                                                                                                        int var23 = field1347[--Statics.field2334];
                                                                                                                        class251 var24 = class251.method110(var22);
                                                                                                                        int var25 = var24.field3383;
                                                                                                                        int var26 = var24.field3381;
                                                                                                                        int var27 = var24.field3384;
                                                                                                                        int var28 = class212.field2616[var27 - var26];
                                                                                                                        if (var23 < 0 || var23 > var28) {
                                                                                                                            var23 = 0;
                                                                                                                        }
                                                                                                                        int var29 = var28 << var26;
                                                                                                                        class212.field2615[var25] = class212.field2615[var25] & ~var29 | var23 << var26 & var29;
                                                                                                                    } else if (var260 == 31) {
                                                                                                                        Statics.field2334 -= 2;
                                                                                                                        if (field1347[Statics.field2334] <= field1347[Statics.field2334 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var260 == 32) {
                                                                                                                        Statics.field2334 -= 2;
                                                                                                                        if (field1347[Statics.field2334] >= field1347[Statics.field2334 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var260 == 33) {
                                                                                                                        field1347[++Statics.field2334 - 1] = Statics.field1349[var10[var8]];
                                                                                                                    } else if (var260 == 34) {
                                                                                                                        Statics.field1349[var10[var8]] = field1347[--Statics.field2334];
                                                                                                                    } else if (var260 == 35) {
                                                                                                                        field1348[++Statics.field2445 - 1] = Statics.field1344[var10[var8]];
                                                                                                                    } else if (var260 == 36) {
                                                                                                                        Statics.field1344[var10[var8]] = field1348[--Statics.field2445];
                                                                                                                    } else if (var260 == 37) {
                                                                                                                        int var30 = var10[var8];
                                                                                                                        Statics.field2445 -= var30;
                                                                                                                        String var31 = class271.method4554(field1348, Statics.field2445, var30);
                                                                                                                        field1348[++Statics.field2445 - 1] = var31;
                                                                                                                    } else if (var260 == 38) {
                                                                                                                        Statics.field2334--;
                                                                                                                    } else if (var260 == 39) {
                                                                                                                        Statics.field2445--;
                                                                                                                    } else if (var260 == 40) {
                                                                                                                        int var32 = var10[var8];
                                                                                                                        class100 var33 = class100.method1610(var32);
                                                                                                                        int[] var34 = new int[var33.field1537];
                                                                                                                        String[] var35 = new String[var33.field1534];
                                                                                                                        for (int var36 = 0; var36 < var33.field1539; var36++) {
                                                                                                                            var34[var36] = field1347[Statics.field2334 - var33.field1539 + var36];
                                                                                                                        }
                                                                                                                        for (int var37 = 0; var37 < var33.field1543; var37++) {
                                                                                                                            var35[var37] = field1348[Statics.field2445 - var33.field1543 + var37];
                                                                                                                        }
                                                                                                                        Statics.field2334 -= var33.field1539;
                                                                                                                        Statics.field2445 -= var33.field1543;
                                                                                                                        class63 var38 = new class63();
                                                                                                                        var38.field762 = var6;
                                                                                                                        var38.field758 = var8;
                                                                                                                        var38.field757 = Statics.field1349;
                                                                                                                        var38.field760 = Statics.field1344;
                                                                                                                        field1350[++field1351 - 1] = var38;
                                                                                                                        var6 = var33;
                                                                                                                        var9 = var33.field1538;
                                                                                                                        var10 = var33.field1540;
                                                                                                                        var8 = -1;
                                                                                                                        Statics.field1349 = var34;
                                                                                                                        Statics.field1344 = var35;
                                                                                                                    } else if (var260 == 42) {
                                                                                                                        field1347[++Statics.field2334 - 1] = Statics.field1915.method1639(var10[var8]);
                                                                                                                    } else if (var260 == 43) {
                                                                                                                        Statics.field1915.method1638(var10[var8], field1347[--Statics.field2334]);
                                                                                                                    } else if (var260 == 44) {
                                                                                                                        int var39 = var10[var8] >> 16;
                                                                                                                        int var40 = var10[var8] & 0xFFFF;
                                                                                                                        int var41 = field1347[--Statics.field2334];
                                                                                                                        if (var41 >= 0 && var41 <= 5000) {
                                                                                                                            field1354[var39] = var41;
                                                                                                                            byte var42 = -1;
                                                                                                                            if (var40 == 105) {
                                                                                                                                var42 = 0;
                                                                                                                            }
                                                                                                                            int var43 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var43 >= var41) {
                                                                                                                                    continue label1458;
                                                                                                                                }
                                                                                                                                field1346[var39][var43] = var42;
                                                                                                                                var43++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var260 == 45) {
                                                                                                                        int var44 = var10[var8];
                                                                                                                        int var45 = field1347[--Statics.field2334];
                                                                                                                        if (var45 < 0 || var45 >= field1354[var44]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1347[++Statics.field2334 - 1] = field1346[var44][var45];
                                                                                                                    } else if (var260 == 46) {
                                                                                                                        int var46 = var10[var8];
                                                                                                                        Statics.field2334 -= 2;
                                                                                                                        int var47 = field1347[Statics.field2334];
                                                                                                                        if (var47 < 0 || var47 >= field1354[var46]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1346[var46][var47] = field1347[Statics.field2334 + 1];
                                                                                                                    } else if (var260 == 47) {
                                                                                                                        String var48 = Statics.field1915.method1641(var10[var8]);
                                                                                                                        if (var48 == null) {
                                                                                                                            var48 = "null";
                                                                                                                        }
                                                                                                                        field1348[++Statics.field2445 - 1] = var48;
                                                                                                                    } else if (var260 == 48) {
                                                                                                                        Statics.field1915.method1640(var10[var8], field1348[--Statics.field2445]);
                                                                                                                    } else if (var260 == 60) {
                                                                                                                        class187 var49 = var6.field1541[var10[var8]];
                                                                                                                        class199 var50 = (class199) var49.method3243((long) field1347[--Statics.field2334]);
                                                                                                                        if (var50 != null) {
                                                                                                                            var8 += var50.field2497;
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
        } catch (Exception var259) {
            StringBuilder var257 = new StringBuilder(30);
            var257.append("").append(var6.field2483).append(" ");
            for (int var258 = field1351 - 1; var258 >= 0; var258--) {
                var257.append("").append(field1350[var258].field762.field2483).append(" ");
            }
            var257.append("").append(var11);
            class153.method1609(var257.toString(), var259);
        }
    }

    @ObfuscatedName("an.i(ILch;ZI)I")
    public static int method252(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field2334 -= 3;
            int var3 = field1347[Statics.field2334];
            int var4 = field1347[Statics.field2334 + 1];
            int var5 = field1347[Statics.field2334 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class217 var6 = class217.method3143(var3);
            if (var6.field2777 == null) {
                var6.field2777 = new class217[var5 + 1];
            }
            if (var6.field2777.length <= var5) {
                class217[] var7 = new class217[var5 + 1];
                for (int var8 = 0; var8 < var6.field2777.length; var8++) {
                    var7[var8] = var6.field2777[var8];
                }
                var6.field2777 = var7;
            }
            if (var5 > 0 && var6.field2777[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class217 var9 = new class217();
            var9.field2655 = var4;
            var9.field2668 = var9.field2653 = var6.field2653;
            var9.field2654 = var5;
            var9.field2652 = true;
            var6.field2777[var5] = var9;
            if (arg2) {
                Statics.field3738 = var9;
            } else {
                Statics.field516 = var9;
            }
            client.method1404(var6);
            return 1;
        } else if (arg0 == 101) {
            class217 var10 = arg2 ? Statics.field3738 : Statics.field516;
            class217 var11 = class217.method3143(var10.field2653);
            var11.field2777[var10.field2654] = null;
            client.method1404(var11);
            return 1;
        } else if (arg0 == 102) {
            class217 var12 = class217.method3143(field1347[--Statics.field2334]);
            var12.field2777 = null;
            client.method1404(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field2334 -= 2;
            int var13 = field1347[Statics.field2334];
            int var14 = field1347[Statics.field2334 + 1];
            class217 var15 = class217.method239(var13, var14);
            if (var15 == null || var14 == -1) {
                field1347[++Statics.field2334 - 1] = 0;
            } else {
                field1347[++Statics.field2334 - 1] = 1;
                if (arg2) {
                    Statics.field3738 = var15;
                } else {
                    Statics.field516 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class217 var16 = class217.method3143(field1347[--Statics.field2334]);
            if (var16 == null) {
                field1347[++Statics.field2334 - 1] = 0;
            } else {
                field1347[++Statics.field2334 - 1] = 1;
                if (arg2) {
                    Statics.field3738 = var16;
                } else {
                    Statics.field516 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.j(ILch;ZI)I")
    public static int method976(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1347[--Statics.field2334];
            var4 = class217.method3143(var3);
        } else {
            var4 = arg2 ? Statics.field3738 : Statics.field516;
        }
        if (arg0 == 1000) {
            Statics.field2334 -= 4;
            var4.field2662 = field1347[Statics.field2334];
            var4.field2704 = field1347[Statics.field2334 + 1];
            var4.field2682 = field1347[Statics.field2334 + 2];
            var4.field2778 = field1347[Statics.field2334 + 3];
            client.method1404(var4);
            Statics.field591.method1315(var4);
            if (var3 != -1 && var4.field2655 == 0) {
                client.method162(Statics.field2678[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field2334 -= 4;
            var4.field2664 = field1347[Statics.field2334];
            var4.field2783 = field1347[Statics.field2334 + 1];
            var4.field2660 = field1347[Statics.field2334 + 2];
            var4.field2661 = field1347[Statics.field2334 + 3];
            client.method1404(var4);
            Statics.field591.method1315(var4);
            if (var3 != -1 && var4.field2655 == 0) {
                client.method162(Statics.field2678[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1347[--Statics.field2334] == 1;
            if (var4.field2673 != var5) {
                var4.field2673 = var5;
                client.method1404(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2679 = field1347[--Statics.field2334] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2787 = field1347[--Statics.field2334] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("e.f(ILch;ZB)I")
    public static int method56(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1347[--Statics.field2334];
            var4 = class217.method3143(var3);
        } else {
            var4 = arg2 ? Statics.field3738 : Statics.field516;
        }
        if (arg0 == 1100) {
            Statics.field2334 -= 2;
            var4.field2674 = field1347[Statics.field2334];
            if (var4.field2674 > var4.field2676 - var4.field2701) {
                var4.field2674 = var4.field2676 - var4.field2701;
            }
            if (var4.field2674 < 0) {
                var4.field2674 = 0;
            }
            var4.field2641 = field1347[Statics.field2334 + 1];
            if (var4.field2641 > var4.field2677 - var4.field2693) {
                var4.field2641 = var4.field2677 - var4.field2693;
            }
            if (var4.field2641 < 0) {
                var4.field2641 = 0;
            }
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2785 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2746 = field1347[--Statics.field2334] == 1;
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2684 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2686 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2688 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2643 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2691 = field1347[--Statics.field2334] == 1;
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2696 = 1;
            var4.field2697 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field2334 -= 6;
            var4.field2681 = field1347[Statics.field2334];
            var4.field2703 = field1347[Statics.field2334 + 1];
            var4.field2713 = field1347[Statics.field2334 + 2];
            var4.field2705 = field1347[Statics.field2334 + 3];
            var4.field2706 = field1347[Statics.field2334 + 4];
            var4.field2707 = field1347[Statics.field2334 + 5];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1347[--Statics.field2334];
            if (var4.field2700 != var5) {
                var4.field2700 = var5;
                var4.field2775 = 0;
                var4.field2663 = 0;
                client.method1404(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2710 = field1347[--Statics.field2334] == 1;
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1348[--Statics.field2445];
            if (!var6.equals(var4.field2644)) {
                var4.field2644 = var6;
                client.method1404(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2712 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field2334 -= 3;
            var4.field2716 = field1347[Statics.field2334];
            var4.field2715 = field1347[Statics.field2334 + 1];
            var4.field2670 = field1347[Statics.field2334 + 2];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2718 = field1347[--Statics.field2334] == 1;
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2699 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2742 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2694 = field1347[--Statics.field2334] == 1;
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2695 = field1347[--Statics.field2334] == 1;
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field2334 -= 2;
            var4.field2676 = field1347[Statics.field2334];
            var4.field2677 = field1347[Statics.field2334 + 1];
            client.method1404(var4);
            if (var3 != -1 && var4.field2655 == 0) {
                client.method162(Statics.field2678[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method253(var4.field2653, var4.field2654);
            client.field1148 = var4;
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2689 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2776 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2685 = field1347[--Statics.field2334];
            client.method1404(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1347[--Statics.field2334];
            class284 var8 = (class284) class169.method1611(Statics.method3118(), var7);
            if (var8 != null) {
                var4.field2669 = var8;
                client.method1404(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1347[--Statics.field2334] == 1;
            var4.field2687 = var9;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.c(ILch;ZI)I")
    public static int method658(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3143(field1347[--Statics.field2334]);
        } else {
            var3 = arg2 ? Statics.field3738 : Statics.field516;
        }
        if (arg0 == 1300) {
            int var4 = field1347[--Statics.field2334] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3740(var4, field1348[--Statics.field2445]);
                return 1;
            } else {
                Statics.field2445--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field2334 -= 2;
            int var5 = field1347[Statics.field2334];
            int var6 = field1347[Statics.field2334 + 1];
            var3.field2768 = class217.method239(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2731 = field1347[--Statics.field2334] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2729 = field1347[--Statics.field2334];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2730 = field1347[--Statics.field2334];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2726 = field1348[--Statics.field2445];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2781 = field1348[--Statics.field2445];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2727 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.z(ILch;ZI)I")
    public static int method221(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3143(field1347[--Statics.field2334]);
        } else {
            var3 = arg2 ? Statics.field3738 : Statics.field516;
        }
        String var4 = field1348[--Statics.field2445];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1347[--Statics.field2334];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1347[--Statics.field2334];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1348[--Statics.field2445];
            } else {
                var7[var8] = Integer.valueOf(field1347[--Statics.field2334]);
            }
        }
        int var9 = field1347[--Statics.field2334];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2735 = var7;
        } else if (arg0 == 1401) {
            var3.field2738 = var7;
        } else if (arg0 == 1402) {
            var3.field2708 = var7;
        } else if (arg0 == 1403) {
            var3.field2739 = var7;
        } else if (arg0 == 1404) {
            var3.field2756 = var7;
        } else if (arg0 == 1405) {
            var3.field2786 = var7;
        } else if (arg0 == 1406) {
            var3.field2745 = var7;
        } else if (arg0 == 1407) {
            var3.field2683 = var7;
            var3.field2732 = var5;
        } else if (arg0 == 1408) {
            var3.field2752 = var7;
        } else if (arg0 == 1409) {
            var3.field2753 = var7;
        } else if (arg0 == 1410) {
            var3.field2743 = var7;
        } else if (arg0 == 1411) {
            var3.field2736 = var7;
        } else if (arg0 == 1412) {
            var3.field2740 = var7;
        } else if (arg0 == 1414) {
            var3.field2748 = var7;
            var3.field2749 = var5;
        } else if (arg0 == 1415) {
            var3.field2741 = var7;
            var3.field2751 = var5;
        } else if (arg0 == 1416) {
            var3.field2744 = var7;
        } else if (arg0 == 1417) {
            var3.field2754 = var7;
        } else if (arg0 == 1418) {
            var3.field2755 = var7;
        } else if (arg0 == 1419) {
            var3.field2650 = var7;
        } else if (arg0 == 1420) {
            var3.field2757 = var7;
        } else if (arg0 == 1421) {
            var3.field2758 = var7;
        } else if (arg0 == 1422) {
            var3.field2759 = var7;
        } else if (arg0 == 1423) {
            var3.field2760 = var7;
        } else if (arg0 == 1424) {
            var3.field2761 = var7;
        } else if (arg0 == 1425) {
            var3.field2763 = var7;
        } else if (arg0 == 1426) {
            var3.field2764 = var7;
        } else if (arg0 == 1427) {
            var3.field2762 = var7;
        } else {
            return 2;
        }
        var3.field2733 = true;
        return 1;
    }

    @ObfuscatedName("ej.h(ILch;ZB)I")
    public static int method2680(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field3738 : Statics.field516;
        if (arg0 == 1600) {
            field1347[++Statics.field2334 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 1601) {
            field1347[++Statics.field2334 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 1602) {
            field1348[++Statics.field2445 - 1] = var3.field2644;
            return 1;
        } else if (arg0 == 1603) {
            field1347[++Statics.field2334 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 1604) {
            field1347[++Statics.field2334 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 1605) {
            field1347[++Statics.field2334 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 1606) {
            field1347[++Statics.field2334 - 1] = var3.field2713;
            return 1;
        } else if (arg0 == 1607) {
            field1347[++Statics.field2334 - 1] = var3.field2706;
            return 1;
        } else if (arg0 == 1608) {
            field1347[++Statics.field2334 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 1609) {
            field1347[++Statics.field2334 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 1610) {
            field1347[++Statics.field2334 - 1] = var3.field2685;
            return 1;
        } else if (arg0 == 1611) {
            field1347[++Statics.field2334 - 1] = var3.field2785;
            return 1;
        } else if (arg0 == 1612) {
            field1347[++Statics.field2334 - 1] = var3.field2776;
            return 1;
        } else if (arg0 == 1613) {
            field1347[++Statics.field2334 - 1] = var3.field2669.method14();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cu.g(ILch;ZI)I")
    public static int method1604(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3143(field1347[--Statics.field2334]);
        } else {
            var3 = arg2 ? Statics.field3738 : Statics.field516;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1345 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2762 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field825 = var3;
            var4.field834 = var3.field2762;
            var4.field833 = field1345 + 1;
            client.field1116.method3384(var4);
            return 1;
        }
    }

    @ObfuscatedName("aj.e(ILch;ZI)I")
    public static int method620(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method3143(field1347[--Statics.field2334]);
        if (arg0 == 2500) {
            field1347[++Statics.field2334 - 1] = var3.field2666;
            return 1;
        } else if (arg0 == 2501) {
            field1347[++Statics.field2334 - 1] = var3.field2665;
            return 1;
        } else if (arg0 == 2502) {
            field1347[++Statics.field2334 - 1] = var3.field2701;
            return 1;
        } else if (arg0 == 2503) {
            field1347[++Statics.field2334 - 1] = var3.field2693;
            return 1;
        } else if (arg0 == 2504) {
            field1347[++Statics.field2334 - 1] = var3.field2673 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1347[++Statics.field2334 - 1] = var3.field2668;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("if.o(ILch;ZI)I")
    public static int method4030(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method3143(field1347[--Statics.field2334]);
        if (arg0 == 2600) {
            field1347[++Statics.field2334 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 2601) {
            field1347[++Statics.field2334 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 2602) {
            field1348[++Statics.field2445 - 1] = var3.field2644;
            return 1;
        } else if (arg0 == 2603) {
            field1347[++Statics.field2334 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 2604) {
            field1347[++Statics.field2334 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 2605) {
            field1347[++Statics.field2334 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 2606) {
            field1347[++Statics.field2334 - 1] = var3.field2713;
            return 1;
        } else if (arg0 == 2607) {
            field1347[++Statics.field2334 - 1] = var3.field2706;
            return 1;
        } else if (arg0 == 2608) {
            field1347[++Statics.field2334 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 2609) {
            field1347[++Statics.field2334 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 2610) {
            field1347[++Statics.field2334 - 1] = var3.field2685;
            return 1;
        } else if (arg0 == 2611) {
            field1347[++Statics.field2334 - 1] = var3.field2785;
            return 1;
        } else if (arg0 == 2612) {
            field1347[++Statics.field2334 - 1] = var3.field2776;
            return 1;
        } else if (arg0 == 2613) {
            field1347[++Statics.field2334 - 1] = var3.field2669.method14();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.x(ILch;ZS)I")
    public static int method684(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method3143(field1347[--Statics.field2334]);
        if (arg0 == 2800) {
            field1347[++Statics.field2334 - 1] = class218.method757(client.method4162(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1347[--Statics.field2334];
            int var5 = var4 - 1;
            if (var3.field2727 == null || var5 >= var3.field2727.length || var3.field2727[var5] == null) {
                field1348[++Statics.field2445 - 1] = "";
            } else {
                field1348[++Statics.field2445 - 1] = var3.field2727[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2726 == null) {
                field1348[++Statics.field2445 - 1] = "";
            } else {
                field1348[++Statics.field2445 - 1] = var3.field2726;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.a(ILch;ZI)I")
    public static int method655(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1348[--Statics.field2445];
            class99.method1689(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field2334 -= 2;
            client.method466(Statics.field2350, field1347[Statics.field2334], field1347[Statics.field2334 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.field957.method3159(169);
            for (class69 var4 = (class69) client.field1135.method3298(); var4 != null; var4 = (class69) client.field1135.method3306()) {
                if (var4.field817 == 0 || var4.field817 == 3) {
                    client.method219(var4, true);
                }
            }
            if (client.field1148 != null) {
                client.method1404(client.field1148);
                client.field1148 = null;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var5 = field1348[--Statics.field2445];
            int var6 = 0;
            if (class271.method2751(var5)) {
                var6 = class271.method3718(var5);
            }
            client.field957.method3159(101);
            client.field957.method2909(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1348[--Statics.field2445];
            client.field957.method3159(52);
            client.field957.method2906(var7.length() + 1);
            client.field957.method2912(var7);
            return 1;
        } else if (arg0 == 3106) {
            String var8 = field1348[--Statics.field2445];
            client.field957.method3159(3);
            client.field957.method2906(var8.length() + 1);
            client.field957.method2912(var8);
            return 1;
        } else if (arg0 == 3107) {
            int var9 = field1347[--Statics.field2334];
            String var10 = field1348[--Statics.field2445];
            client.method1463(var9, var10);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field2334 -= 3;
            int var11 = field1347[Statics.field2334];
            int var12 = field1347[Statics.field2334 + 1];
            int var13 = field1347[Statics.field2334 + 2];
            class217 var14 = class217.method3143(var13);
            client.method663(var14, var11, var12);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field2334 -= 2;
            int var15 = field1347[Statics.field2334];
            int var16 = field1347[Statics.field2334 + 1];
            class217 var17 = arg2 ? Statics.field3738 : Statics.field516;
            client.method663(var17, var15, var16);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1799 = field1347[--Statics.field2334] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1347[++Statics.field2334 - 1] = Statics.field802.field1319 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field802.field1319 = field1347[--Statics.field2334] == 1;
            class82.method220();
            return 1;
        } else if (arg0 == 3113) {
            String var18 = field1348[--Statics.field2445];
            boolean var19 = field1347[--Statics.field2334] == 1;
            class57.method42(var18, var19, "openjs", false);
            return 1;
        } else if (arg0 == 3115) {
            int var20 = field1347[--Statics.field2334];
            client.field957.method3159(232);
            client.field957.method2907(var20);
            return 1;
        } else if (arg0 == 3116) {
            int var21 = field1347[--Statics.field2334];
            Statics.field2445 -= 2;
            String var22 = field1348[Statics.field2445];
            String var23 = field1348[Statics.field2445 + 1];
            if (var22.length() > 500) {
                return 1;
            } else if (var23.length() > 500) {
                return 1;
            } else {
                client.field957.method3159(6);
                client.field957.method2907(1 + Statics.method1708(var22) + Statics.method1708(var23));
                client.field957.method2912(var23);
                client.field957.method2947(var21);
                client.field957.method2912(var22);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field1180 = field1347[--Statics.field2334] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.y(ILch;ZI)I")
    public static int method934(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field2334 -= 3;
            int var3 = field1347[Statics.field2334];
            int var4 = field1347[Statics.field2334 + 1];
            int var5 = field1347[Statics.field2334 + 2];
            if (client.field1156 != 0 && var4 != 0 && client.field1078 < 50) {
                client.field1159[client.field1078] = var3;
                client.field1160[client.field1078] = var4;
                client.field1050[client.field1078] = var5;
                client.field1163[client.field1078] = null;
                client.field1102[client.field1078] = 0;
                client.field1078++;
            }
            return 1;
        } else if (arg0 == 3201) {
            int var6 = field1347[--Statics.field2334];
            if (var6 == -1 && !client.field1155) {
                Statics.field2518.method3477();
                class204.field2516 = 1;
                Statics.field2517 = null;
            } else if (var6 != -1 && client.field1154 != var6 && client.field1031 != 0 && !client.field1155) {
                class204.method688(2, Statics.field657, var6, 0, client.field1031, false);
            }
            client.field1154 = var6;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field2334 -= 2;
            client.method61(field1347[Statics.field2334], field1347[Statics.field2334 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cv.r(ILch;ZI)I")
    public static int method1513(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field2334 -= 2;
            int var3 = field1347[Statics.field2334];
            int var4 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field2334 -= 2;
            int var5 = field1347[Statics.field2334];
            int var6 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field2334 -= 2;
            int var7 = field1347[Statics.field2334];
            int var8 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field2334 -= 2;
            int var9 = field1347[Statics.field2334];
            int var10 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1347[--Statics.field2334];
            field1347[++Statics.field2334 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1347[--Statics.field2334];
            field1347[++Statics.field2334 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field2334 -= 5;
            int var13 = field1347[Statics.field2334];
            int var14 = field1347[Statics.field2334 + 1];
            int var15 = field1347[Statics.field2334 + 2];
            int var16 = field1347[Statics.field2334 + 3];
            int var17 = field1347[Statics.field2334 + 4];
            field1347[++Statics.field2334 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field2334 -= 2;
            int var18 = field1347[Statics.field2334];
            int var19 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field2334 -= 2;
            int var20 = field1347[Statics.field2334];
            int var21 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field2334 -= 2;
            int var22 = field1347[Statics.field2334];
            int var23 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field2334 -= 2;
            int var24 = field1347[Statics.field2334];
            int var25 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field2334 -= 2;
            int var26 = field1347[Statics.field2334];
            int var27 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field2334 -= 2;
            int var28 = field1347[Statics.field2334];
            int var29 = field1347[Statics.field2334 + 1];
            if (var28 == 0) {
                field1347[++Statics.field2334 - 1] = 0;
            } else {
                field1347[++Statics.field2334 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field2334 -= 2;
            int var30 = field1347[Statics.field2334];
            int var31 = field1347[Statics.field2334 + 1];
            if (var30 == 0) {
                field1347[++Statics.field2334 - 1] = 0;
            } else if (var31 == 0) {
                field1347[++Statics.field2334 - 1] = Integer.MAX_VALUE;
            } else {
                field1347[++Statics.field2334 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field2334 -= 2;
            int var32 = field1347[Statics.field2334];
            int var33 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field2334 -= 2;
            int var34 = field1347[Statics.field2334];
            int var35 = field1347[Statics.field2334 + 1];
            field1347[++Statics.field2334 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field2334 -= 3;
            long var36 = (long) field1347[Statics.field2334];
            long var38 = (long) field1347[Statics.field2334 + 1];
            long var40 = (long) field1347[Statics.field2334 + 2];
            field1347[++Statics.field2334 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cs.b(ILch;ZI)I")
    public static int method1388(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1348[--Statics.field2445];
            int var4 = field1347[--Statics.field2334];
            field1348[++Statics.field2445 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field2445 -= 2;
            String var5 = field1348[Statics.field2445];
            String var6 = field1348[Statics.field2445 + 1];
            field1348[++Statics.field2445 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1348[--Statics.field2445];
            int var8 = field1347[--Statics.field2334];
            field1348[++Statics.field2445 - 1] = var7 + class271.method50(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1348[--Statics.field2445];
            field1348[++Statics.field2445 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1347[--Statics.field2334];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1341.setTime(new Date(var11));
            int var13 = field1341.get(5);
            int var14 = field1341.get(2);
            int var15 = field1341.get(1);
            field1348[++Statics.field2445 - 1] = var13 + "-" + field1352[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field2445 -= 2;
            String var16 = field1348[Statics.field2445];
            String var17 = field1348[Statics.field2445 + 1];
            if (Statics.field2350.field886 != null && Statics.field2350.field886.field2624) {
                field1348[++Statics.field2445 - 1] = var17;
            } else {
                field1348[++Statics.field2445 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1347[--Statics.field2334];
            field1348[++Statics.field2445 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field2445 -= 2;
            int[] var19 = field1347;
            int var20 = ++Statics.field2334 - 1;
            int var21 = class165.method878(field1348[Statics.field2445], field1348[Statics.field2445 + 1], client.field920);
            byte var22;
            if (var21 > 0) {
                var22 = 1;
            } else if (var21 < 0) {
                var22 = -1;
            } else {
                var22 = 0;
            }
            var19[var20] = var22;
            return 1;
        } else if (arg0 == 4108) {
            String var23 = field1348[--Statics.field2445];
            Statics.field2334 -= 2;
            int var24 = field1347[Statics.field2334];
            int var25 = field1347[Statics.field2334 + 1];
            byte[] var26 = Statics.field3208.method3880(var25, 0);
            class264 var27 = new class264(var26);
            field1347[++Statics.field2334 - 1] = var27.method4470(var23, var24);
            return 1;
        } else if (arg0 == 4109) {
            String var28 = field1348[--Statics.field2445];
            Statics.field2334 -= 2;
            int var29 = field1347[Statics.field2334];
            int var30 = field1347[Statics.field2334 + 1];
            byte[] var31 = Statics.field3208.method3880(var30, 0);
            class264 var32 = new class264(var31);
            field1347[++Statics.field2334 - 1] = var32.method4480(var28, var29);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field2445 -= 2;
            String var33 = field1348[Statics.field2445];
            String var34 = field1348[Statics.field2445 + 1];
            if (field1347[--Statics.field2334] == 1) {
                field1348[++Statics.field2445 - 1] = var33;
            } else {
                field1348[++Statics.field2445 - 1] = var34;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var35 = field1348[--Statics.field2445];
            field1348[++Statics.field2445 - 1] = class265.method4497(var35);
            return 1;
        } else if (arg0 == 4112) {
            String var36 = field1348[--Statics.field2445];
            int var37 = field1347[--Statics.field2334];
            field1348[++Statics.field2445 - 1] = var36 + (char) var37;
            return 1;
        } else if (arg0 == 4113) {
            int var38 = field1347[--Statics.field2334];
            int[] var39 = field1347;
            int var40 = ++Statics.field2334 - 1;
            char var41 = (char) var38;
            boolean var42;
            if (var41 >= ' ' && var41 <= '~') {
                var42 = true;
            } else if (var41 >= 160 && var41 <= 255) {
                var42 = true;
            } else if (var41 == 8364 || var41 == 338 || var41 == 8212 || var41 == 339 || var41 == 376) {
                var42 = true;
            } else {
                var42 = false;
            }
            var39[var40] = var42 ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var43 = field1347[--Statics.field2334];
            int[] var44 = field1347;
            int var45 = ++Statics.field2334 - 1;
            char var46 = (char) var43;
            boolean var47 = var46 >= '0' && var46 <= '9' || var46 >= 'A' && var46 <= 'Z' || var46 >= 'a' && var46 <= 'z';
            var44[var45] = var47 ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var48 = field1347[--Statics.field2334];
            int[] var49 = field1347;
            int var50 = ++Statics.field2334 - 1;
            char var51 = (char) var48;
            boolean var52 = var51 >= 'A' && var51 <= 'Z' || var51 >= 'a' && var51 <= 'z';
            var49[var50] = var52 ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var53 = field1347[--Statics.field2334];
            int[] var54 = field1347;
            int var55 = ++Statics.field2334 - 1;
            char var56 = (char) var53;
            boolean var57 = var56 >= '0' && var56 <= '9';
            var54[var55] = var57 ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var58 = field1348[--Statics.field2445];
            if (var58 == null) {
                field1347[++Statics.field2334 - 1] = 0;
            } else {
                field1347[++Statics.field2334 - 1] = var58.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var59 = field1348[--Statics.field2445];
            Statics.field2334 -= 2;
            int var60 = field1347[Statics.field2334];
            int var61 = field1347[Statics.field2334 + 1];
            field1348[++Statics.field2445 - 1] = var59.substring(var60, var61);
            return 1;
        } else if (arg0 == 4119) {
            String var62 = field1348[--Statics.field2445];
            StringBuilder var63 = new StringBuilder(var62.length());
            boolean var64 = false;
            for (int var65 = 0; var65 < var62.length(); var65++) {
                char var66 = var62.charAt(var65);
                if (var66 == '<') {
                    var64 = true;
                } else if (var66 == '>') {
                    var64 = false;
                } else if (!var64) {
                    var63.append(var66);
                }
            }
            field1348[++Statics.field2445 - 1] = var63.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var67 = field1348[--Statics.field2445];
            int var68 = field1347[--Statics.field2334];
            field1347[++Statics.field2334 - 1] = var67.indexOf(var68);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field2445 -= 2;
            String var69 = field1348[Statics.field2445];
            String var70 = field1348[Statics.field2445 + 1];
            int var71 = field1347[--Statics.field2334];
            field1347[++Statics.field2334 - 1] = var69.indexOf(var70, var71);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.s(ILch;ZI)I")
    public static int method248(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1347[++Statics.field2334 - 1] = client.field939;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field2334 -= 3;
            client.field939 = field1347[Statics.field2334];
            Statics.field338 = class277.method3784(field1347[Statics.field2334 + 1]);
            if (Statics.field338 == null) {
                Statics.field338 = class277.field3734;
            }
            client.field1134 = field1347[Statics.field2334 + 2];
            client.field957.method3159(248);
            client.field957.method2906(client.field939);
            client.field957.method2906(Statics.field338.field3736);
            client.field957.method2906(client.field1134);
            return 1;
        } else if (arg0 == 5002) {
            String var3 = field1348[--Statics.field2445];
            Statics.field2334 -= 2;
            int var4 = field1347[Statics.field2334];
            int var5 = field1347[Statics.field2334 + 1];
            client.field957.method3159(63);
            client.field957.method2906(Statics.method1708(var3) + 2);
            client.field957.method2912(var3);
            client.field957.method2906(var4 - 1);
            client.field957.method2906(var5);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field2334 -= 2;
            int var6 = field1347[Statics.field2334];
            int var7 = field1347[Statics.field2334 + 1];
            class73 var8 = class99.method1600(var6, var7);
            if (var8 == null) {
                field1347[++Statics.field2334 - 1] = -1;
                field1347[++Statics.field2334 - 1] = 0;
                field1348[++Statics.field2445 - 1] = "";
                field1348[++Statics.field2445 - 1] = "";
                field1348[++Statics.field2445 - 1] = "";
            } else {
                field1347[++Statics.field2334 - 1] = var8.field862;
                field1347[++Statics.field2334 - 1] = var8.field855;
                field1348[++Statics.field2445 - 1] = var8.field860 == null ? "" : var8.field860;
                field1348[++Statics.field2445 - 1] = var8.field858 == null ? "" : var8.field858;
                field1348[++Statics.field2445 - 1] = var8.field859 == null ? "" : var8.field859;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var9 = field1347[--Statics.field2334];
            class73 var10 = (class73) class99.field1525.method3243((long) var9);
            if (var10 == null) {
                field1347[++Statics.field2334 - 1] = -1;
                field1347[++Statics.field2334 - 1] = 0;
                field1348[++Statics.field2445 - 1] = "";
                field1348[++Statics.field2445 - 1] = "";
                field1348[++Statics.field2445 - 1] = "";
            } else {
                field1347[++Statics.field2334 - 1] = var10.field856;
                field1347[++Statics.field2334 - 1] = var10.field855;
                field1348[++Statics.field2445 - 1] = var10.field860 == null ? "" : var10.field860;
                field1348[++Statics.field2445 - 1] = var10.field858 == null ? "" : var10.field858;
                field1348[++Statics.field2445 - 1] = var10.field859 == null ? "" : var10.field859;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field338 == null) {
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = Statics.field338.field3736;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var12 = field1348[--Statics.field2445];
            int var13 = field1347[--Statics.field2334];
            String var14 = var12.toLowerCase();
            byte var15 = 0;
            if (var14.startsWith(class226.field2984)) {
                var15 = 0;
                var12 = var12.substring(class226.field2984.length());
            } else if (var14.startsWith(class226.field2965)) {
                var15 = 1;
                var12 = var12.substring(class226.field2965.length());
            } else if (var14.startsWith(class226.field3034)) {
                var15 = 2;
                var12 = var12.substring(class226.field3034.length());
            } else if (var14.startsWith(class226.field3036)) {
                var15 = 3;
                var12 = var12.substring(class226.field3036.length());
            } else if (var14.startsWith(class226.field2917)) {
                var15 = 4;
                var12 = var12.substring(class226.field2917.length());
            } else if (var14.startsWith(class226.field3040)) {
                var15 = 5;
                var12 = var12.substring(class226.field3040.length());
            } else if (var14.startsWith(class226.field2949)) {
                var15 = 6;
                var12 = var12.substring(class226.field2949.length());
            } else if (var14.startsWith(class226.field2951)) {
                var15 = 7;
                var12 = var12.substring(class226.field2951.length());
            } else if (var14.startsWith(class226.field2947)) {
                var15 = 8;
                var12 = var12.substring(class226.field2947.length());
            } else if (var14.startsWith(class226.field3027)) {
                var15 = 9;
                var12 = var12.substring(class226.field3027.length());
            } else if (var14.startsWith(class226.field3050)) {
                var15 = 10;
                var12 = var12.substring(class226.field3050.length());
            } else if (var14.startsWith(class226.field3052)) {
                var15 = 11;
                var12 = var12.substring(class226.field3052.length());
            } else if (client.field920 != 0) {
                if (var14.startsWith(class226.field2944)) {
                    var15 = 0;
                    var12 = var12.substring(class226.field2944.length());
                } else if (var14.startsWith(class226.field3033)) {
                    var15 = 1;
                    var12 = var12.substring(class226.field3033.length());
                } else if (var14.startsWith(class226.field3035)) {
                    var15 = 2;
                    var12 = var12.substring(class226.field3035.length());
                } else if (var14.startsWith(class226.field3037)) {
                    var15 = 3;
                    var12 = var12.substring(class226.field3037.length());
                } else if (var14.startsWith(class226.field3039)) {
                    var15 = 4;
                    var12 = var12.substring(class226.field3039.length());
                } else if (var14.startsWith(class226.field3013)) {
                    var15 = 5;
                    var12 = var12.substring(class226.field3013.length());
                } else if (var14.startsWith(class226.field3043)) {
                    var15 = 6;
                    var12 = var12.substring(class226.field3043.length());
                } else if (var14.startsWith(class226.field2927)) {
                    var15 = 7;
                    var12 = var12.substring(class226.field2927.length());
                } else if (var14.startsWith(class226.field3047)) {
                    var15 = 8;
                    var12 = var12.substring(class226.field3047.length());
                } else if (var14.startsWith(class226.field3049)) {
                    var15 = 9;
                    var12 = var12.substring(class226.field3049.length());
                } else if (var14.startsWith(class226.field2973)) {
                    var15 = 10;
                    var12 = var12.substring(class226.field2973.length());
                } else if (var14.startsWith(class226.field3053)) {
                    var15 = 11;
                    var12 = var12.substring(class226.field3053.length());
                }
            }
            String var16 = var12.toLowerCase();
            byte var17 = 0;
            if (var16.startsWith(class226.field3054)) {
                var17 = 1;
                var12 = var12.substring(class226.field3054.length());
            } else if (var16.startsWith(class226.field3056)) {
                var17 = 2;
                var12 = var12.substring(class226.field3056.length());
            } else if (var16.startsWith(class226.field2960)) {
                var17 = 3;
                var12 = var12.substring(class226.field2960.length());
            } else if (var16.startsWith(class226.field3060)) {
                var17 = 4;
                var12 = var12.substring(class226.field3060.length());
            } else if (var16.startsWith(class226.field2924)) {
                var17 = 5;
                var12 = var12.substring(class226.field2924.length());
            } else if (client.field920 != 0) {
                if (var16.startsWith(class226.field3055)) {
                    var17 = 1;
                    var12 = var12.substring(class226.field3055.length());
                } else if (var16.startsWith(class226.field2861)) {
                    var17 = 2;
                    var12 = var12.substring(class226.field2861.length());
                } else if (var16.startsWith(class226.field3059)) {
                    var17 = 3;
                    var12 = var12.substring(class226.field3059.length());
                } else if (var16.startsWith(class226.field3061)) {
                    var17 = 4;
                    var12 = var12.substring(class226.field3061.length());
                } else if (var16.startsWith(class226.field3004)) {
                    var17 = 5;
                    var12 = var12.substring(class226.field3004.length());
                }
            }
            client.field957.method3159(167);
            client.field957.method2906(0);
            int var18 = client.field957.field2400;
            client.field957.method2906(var13);
            client.field957.method2906(var15);
            client.field957.method2906(var17);
            class180 var19 = client.field957;
            int var20 = var19.field2400;
            int var21 = var12.length();
            byte[] var22 = new byte[var21];
            for (int var23 = 0; var23 < var21; var23++) {
                char var24 = var12.charAt(var23);
                if (!(var24 <= 0 || var24 >= 128) || !(var24 < 160 || var24 > 255)) {
                    var22[var23] = (byte) var24;
                } else if (var24 == 8364) {
                    var22[var23] = -128;
                } else if (var24 == 8218) {
                    var22[var23] = -126;
                } else if (var24 == 402) {
                    var22[var23] = -125;
                } else if (var24 == 8222) {
                    var22[var23] = -124;
                } else if (var24 == 8230) {
                    var22[var23] = -123;
                } else if (var24 == 8224) {
                    var22[var23] = -122;
                } else if (var24 == 8225) {
                    var22[var23] = -121;
                } else if (var24 == 710) {
                    var22[var23] = -120;
                } else if (var24 == 8240) {
                    var22[var23] = -119;
                } else if (var24 == 352) {
                    var22[var23] = -118;
                } else if (var24 == 8249) {
                    var22[var23] = -117;
                } else if (var24 == 338) {
                    var22[var23] = -116;
                } else if (var24 == 381) {
                    var22[var23] = -114;
                } else if (var24 == 8216) {
                    var22[var23] = -111;
                } else if (var24 == 8217) {
                    var22[var23] = -110;
                } else if (var24 == 8220) {
                    var22[var23] = -109;
                } else if (var24 == 8221) {
                    var22[var23] = -108;
                } else if (var24 == 8226) {
                    var22[var23] = -107;
                } else if (var24 == 8211) {
                    var22[var23] = -106;
                } else if (var24 == 8212) {
                    var22[var23] = -105;
                } else if (var24 == 732) {
                    var22[var23] = -104;
                } else if (var24 == 8482) {
                    var22[var23] = -103;
                } else if (var24 == 353) {
                    var22[var23] = -102;
                } else if (var24 == 8250) {
                    var22[var23] = -101;
                } else if (var24 == 339) {
                    var22[var23] = -100;
                } else if (var24 == 382) {
                    var22[var23] = -98;
                } else if (var24 == 376) {
                    var22[var23] = -97;
                } else {
                    var22[var23] = 63;
                }
            }
            var19.method2919(var22.length);
            var19.field2400 += Statics.field3671.method2837(var22, 0, var22.length, var19.field2401, var19.field2400);
            client.field957.method2918(client.field957.field2400 - var18);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2445 -= 2;
            String var27 = field1348[Statics.field2445];
            String var28 = field1348[Statics.field2445 + 1];
            client.field957.method3159(20);
            client.field957.method2907(0);
            int var29 = client.field957.field2400;
            client.field957.method2912(var27);
            class180 var30 = client.field957;
            int var31 = var30.field2400;
            int var32 = var28.length();
            byte[] var33 = new byte[var32];
            for (int var34 = 0; var34 < var32; var34++) {
                char var35 = var28.charAt(var34);
                if (!(var35 <= 0 || var35 >= 128) || !(var35 < 160 || var35 > 255)) {
                    var33[var34] = (byte) var35;
                } else if (var35 == 8364) {
                    var33[var34] = -128;
                } else if (var35 == 8218) {
                    var33[var34] = -126;
                } else if (var35 == 402) {
                    var33[var34] = -125;
                } else if (var35 == 8222) {
                    var33[var34] = -124;
                } else if (var35 == 8230) {
                    var33[var34] = -123;
                } else if (var35 == 8224) {
                    var33[var34] = -122;
                } else if (var35 == 8225) {
                    var33[var34] = -121;
                } else if (var35 == 710) {
                    var33[var34] = -120;
                } else if (var35 == 8240) {
                    var33[var34] = -119;
                } else if (var35 == 352) {
                    var33[var34] = -118;
                } else if (var35 == 8249) {
                    var33[var34] = -117;
                } else if (var35 == 338) {
                    var33[var34] = -116;
                } else if (var35 == 381) {
                    var33[var34] = -114;
                } else if (var35 == 8216) {
                    var33[var34] = -111;
                } else if (var35 == 8217) {
                    var33[var34] = -110;
                } else if (var35 == 8220) {
                    var33[var34] = -109;
                } else if (var35 == 8221) {
                    var33[var34] = -108;
                } else if (var35 == 8226) {
                    var33[var34] = -107;
                } else if (var35 == 8211) {
                    var33[var34] = -106;
                } else if (var35 == 8212) {
                    var33[var34] = -105;
                } else if (var35 == 732) {
                    var33[var34] = -104;
                } else if (var35 == 8482) {
                    var33[var34] = -103;
                } else if (var35 == 353) {
                    var33[var34] = -102;
                } else if (var35 == 8250) {
                    var33[var34] = -101;
                } else if (var35 == 339) {
                    var33[var34] = -100;
                } else if (var35 == 382) {
                    var33[var34] = -98;
                } else if (var35 == 376) {
                    var33[var34] = -97;
                } else {
                    var33[var34] = 63;
                }
            }
            var30.method2919(var33.length);
            var30.field2400 += Statics.field3671.method2837(var33, 0, var33.length, var30.field2401, var30.field2400);
            client.field957.method2917(client.field957.field2400 - var29);
            return 1;
        } else if (arg0 == 5015) {
            String var38;
            if (Statics.field2350 == null || Statics.field2350.field888 == null) {
                var38 = "";
            } else {
                var38 = Statics.field2350.field888;
            }
            field1348[++Statics.field2445 - 1] = var38;
            return 1;
        } else if (arg0 == 5016) {
            field1347[++Statics.field2334 - 1] = client.field1134;
            return 1;
        } else if (arg0 == 5017) {
            int var39 = field1347[--Statics.field2334];
            field1347[++Statics.field2334 - 1] = Statics.method619(var39);
            return 1;
        } else if (arg0 == 5018) {
            int var40 = field1347[--Statics.field2334];
            field1347[++Statics.field2334 - 1] = class99.method3181(var40);
            return 1;
        } else if (arg0 == 5019) {
            int var41 = field1347[--Statics.field2334];
            field1347[++Statics.field2334 - 1] = class99.method250(var41);
            return 1;
        } else if (arg0 == 5020) {
            String var42 = field1348[--Statics.field2445];
            client.method3120(var42);
            return 1;
        } else if (arg0 == 5021) {
            client.field1015 = field1348[--Statics.field2445].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1348[++Statics.field2445 - 1] = client.field1015;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cl.v(ILch;ZI)I")
    public static int method1543(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field967 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cd.t(ILch;ZB)I")
    public static int method1576(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field2334 -= 2;
            client.field1170 = (short) field1347[Statics.field2334];
            if (client.field1170 <= 0) {
                client.field1170 = 256;
            }
            client.field1058 = (short) field1347[Statics.field2334 + 1];
            if (client.field1058 <= 0) {
                client.field1058 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field2334 -= 2;
            client.field1038 = (short) field1347[Statics.field2334];
            if (client.field1038 <= 0) {
                client.field1038 = 256;
            }
            client.field1173 = (short) field1347[Statics.field2334 + 1];
            if (client.field1173 <= 0) {
                client.field1173 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field2334 -= 4;
            client.field1174 = (short) field1347[Statics.field2334];
            if (client.field1174 <= 0) {
                client.field1174 = 1;
            }
            client.field1193 = (short) field1347[Statics.field2334 + 1];
            if (client.field1193 <= 0) {
                client.field1193 = 32767;
            } else if (client.field1193 < client.field1174) {
                client.field1193 = client.field1174;
            }
            client.field1176 = (short) field1347[Statics.field2334 + 2];
            if (client.field1176 <= 0) {
                client.field1176 = 1;
            }
            client.field976 = (short) field1347[Statics.field2334 + 3];
            if (client.field976 <= 0) {
                client.field976 = 32767;
            } else if (client.field976 < client.field1176) {
                client.field976 = client.field1176;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1089 == null) {
                field1347[++Statics.field2334 - 1] = -1;
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                client.method3670(0, 0, client.field1089.field2701, client.field1089.field2693, false);
                field1347[++Statics.field2334 - 1] = client.field942;
                field1347[++Statics.field2334 - 1] = client.field935;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1347[++Statics.field2334 - 1] = client.field1038;
            field1347[++Statics.field2334 - 1] = client.field1173;
            return 1;
        } else if (arg0 == 6205) {
            field1347[++Statics.field2334 - 1] = client.field1170;
            field1347[++Statics.field2334 - 1] = client.field1058;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ga.w(ILch;ZB)I")
    public static int method3577(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1449;
            int var4 = (Statics.field2350.field1234 >> 7) + Statics.field749;
            int var5 = (Statics.field2350.field1276 >> 7) + Statics.field357;
            client.method242().method4899(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1347[--Statics.field2334];
            String var7 = "";
            class33 var8 = client.method242().method4945(var6);
            if (var8 != null) {
                var7 = var8.method266();
            }
            field1348[++Statics.field2445 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1347[--Statics.field2334];
            client.method242().method4900(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1347[++Statics.field2334 - 1] = client.method242().method4912();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1347[--Statics.field2334];
            client.method242().method4894(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1347[++Statics.field2334 - 1] = client.method242().method4914() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class213 var11 = new class213(field1347[--Statics.field2334]);
            client.method242().method4916(var11.field2621, var11.field2618);
            return 1;
        } else if (arg0 == 6607) {
            class213 var12 = new class213(field1347[--Statics.field2334]);
            client.method242().method4972(var12.field2621, var12.field2618);
            return 1;
        } else if (arg0 == 6608) {
            class213 var13 = new class213(field1347[--Statics.field2334]);
            client.method242().method4918(var13.field2619, var13.field2621, var13.field2618);
            return 1;
        } else if (arg0 == 6609) {
            class213 var14 = new class213(field1347[--Statics.field2334]);
            client.method242().method4966(var14.field2619, var14.field2621, var14.field2618);
            return 1;
        } else if (arg0 == 6610) {
            field1347[++Statics.field2334 - 1] = client.method242().method4919();
            field1347[++Statics.field2334 - 1] = client.method242().method4920();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1347[--Statics.field2334];
            class33 var16 = client.method242().method4945(var15);
            if (var16 == null) {
                field1347[++Statics.field2334 - 1] = 0;
            } else {
                field1347[++Statics.field2334 - 1] = var16.method310().method3675();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1347[--Statics.field2334];
            class33 var18 = client.method242().method4945(var17);
            if (var18 == null) {
                field1347[++Statics.field2334 - 1] = 0;
                field1347[++Statics.field2334 - 1] = 0;
            } else {
                field1347[++Statics.field2334 - 1] = (var18.method289() - var18.method269() + 1) * 64;
                field1347[++Statics.field2334 - 1] = (var18.method272() - var18.method297() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1347[--Statics.field2334];
            class33 var20 = client.method242().method4945(var19);
            if (var20 == null) {
                field1347[++Statics.field2334 - 1] = 0;
                field1347[++Statics.field2334 - 1] = 0;
                field1347[++Statics.field2334 - 1] = 0;
                field1347[++Statics.field2334 - 1] = 0;
            } else {
                field1347[++Statics.field2334 - 1] = var20.method269() * 64;
                field1347[++Statics.field2334 - 1] = var20.method297() * 64;
                field1347[++Statics.field2334 - 1] = var20.method289() * 64 + 64 - 1;
                field1347[++Statics.field2334 - 1] = var20.method272() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1347[--Statics.field2334];
            class33 var22 = client.method242().method4945(var21);
            if (var22 == null) {
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var22.method268();
            }
            return 1;
        } else if (arg0 == 6615) {
            class213 var23 = client.method242().method4921();
            if (var23 == null) {
                field1347[++Statics.field2334 - 1] = -1;
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var23.field2621;
                field1347[++Statics.field2334 - 1] = var23.field2618;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1347[++Statics.field2334 - 1] = client.method242().method4901();
            return 1;
        } else if (arg0 == 6617) {
            class213 var24 = new class213(field1347[--Statics.field2334]);
            class33 var25 = client.method242().method4896();
            if (var25 == null) {
                field1347[++Statics.field2334 - 1] = -1;
                field1347[++Statics.field2334 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method303(var24.field2619, var24.field2621, var24.field2618);
            if (var26 == null) {
                field1347[++Statics.field2334 - 1] = -1;
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var26[0];
                field1347[++Statics.field2334 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class213 var27 = new class213(field1347[--Statics.field2334]);
            class33 var28 = client.method242().method4896();
            if (var28 == null) {
                field1347[++Statics.field2334 - 1] = -1;
                field1347[++Statics.field2334 - 1] = -1;
                return 1;
            }
            class213 var29 = var28.method261(var27.field2621, var27.field2618);
            if (var29 == null) {
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var29.method3675();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field2334 -= 2;
            int var30 = field1347[Statics.field2334];
            class213 var31 = new class213(field1347[Statics.field2334 + 1]);
            class33 var32 = client.method242().method4945(var30);
            int var33 = Statics.field2350.field892;
            int var34 = (Statics.field2350.field1234 >> 7) + Statics.field749;
            int var35 = (Statics.field2350.field1276 >> 7) + Statics.field357;
            class213 var36 = new class213(var33, var34, var35);
            client.method242().method4905(var32, var36, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field2334 -= 2;
            int var37 = field1347[Statics.field2334];
            class213 var38 = new class213(field1347[Statics.field2334 + 1]);
            method19(var37, var38, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field2334 -= 2;
            int var39 = field1347[Statics.field2334];
            class213 var40 = new class213(field1347[Statics.field2334 + 1]);
            class33 var41 = client.method242().method4945(var39);
            if (var41 == null) {
                field1347[++Statics.field2334 - 1] = 0;
                return 1;
            } else {
                field1347[++Statics.field2334 - 1] = var41.method258(var40.field2619, var40.field2621, var40.field2618) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1347[++Statics.field2334 - 1] = client.method242().method4922();
            field1347[++Statics.field2334 - 1] = client.method242().method4923();
            return 1;
        } else if (arg0 == 6623) {
            class213 var42 = new class213(field1347[--Statics.field2334]);
            class33 var43 = client.method242().method4898(var42.field2619, var42.field2621, var42.field2618);
            if (var43 == null) {
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var43.method263();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method242().method4924(field1347[--Statics.field2334]);
            return 1;
        } else if (arg0 == 6625) {
            client.method242().method4925();
            return 1;
        } else if (arg0 == 6626) {
            client.method242().method4892(field1347[--Statics.field2334]);
            return 1;
        } else if (arg0 == 6627) {
            client.method242().method4927();
            return 1;
        } else if (arg0 == 6628) {
            boolean var44 = field1347[--Statics.field2334] == 1;
            client.method242().method4928(var44);
            return 1;
        } else if (arg0 == 6629) {
            int var45 = field1347[--Statics.field2334];
            client.method242().method4986(var45);
            return 1;
        } else if (arg0 == 6630) {
            int var46 = field1347[--Statics.field2334];
            client.method242().method4930(var46);
            return 1;
        } else if (arg0 == 6631) {
            client.method242().method4931();
            return 1;
        } else if (arg0 == 6632) {
            boolean var47 = field1347[--Statics.field2334] == 1;
            client.method242().method4932(var47);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field2334 -= 2;
            int var48 = field1347[Statics.field2334];
            boolean var49 = field1347[Statics.field2334 + 1] == 1;
            client.method242().method4933(var48, var49);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field2334 -= 2;
            int var50 = field1347[Statics.field2334];
            boolean var51 = field1347[Statics.field2334 + 1] == 1;
            client.method242().method4934(var50, var51);
            return 1;
        } else if (arg0 == 6635) {
            field1347[++Statics.field2334 - 1] = client.method242().method4935() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var52 = field1347[--Statics.field2334];
            field1347[++Statics.field2334 - 1] = client.method242().method4936(var52) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var53 = field1347[--Statics.field2334];
            field1347[++Statics.field2334 - 1] = client.method242().method4937(var53) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field2334 -= 2;
            int var54 = field1347[Statics.field2334];
            class213 var55 = new class213(field1347[Statics.field2334 + 1]);
            class213 var56 = client.method242().method4940(var54, var55);
            if (var56 == null) {
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var56.method3675();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var57 = client.method242().method4942();
            if (var57 == null) {
                field1347[++Statics.field2334 - 1] = -1;
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var57.field539;
                field1347[++Statics.field2334 - 1] = var57.field528.method3675();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var58 = client.method242().method4943();
            if (var58 == null) {
                field1347[++Statics.field2334 - 1] = -1;
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var58.field539;
                field1347[++Statics.field2334 - 1] = var58.field528.method3675();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var59 = field1347[--Statics.field2334];
            class243 var60 = Statics.field1301[var59];
            if (var60.field3295 == null) {
                field1348[++Statics.field2445 - 1] = "";
            } else {
                field1348[++Statics.field2445 - 1] = var60.field3295;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var61 = field1347[--Statics.field2334];
            class243 var62 = Statics.field1301[var61];
            field1347[++Statics.field2334 - 1] = var62.field3302;
            return 1;
        } else if (arg0 == 6695) {
            int var63 = field1347[--Statics.field2334];
            class243 var64 = Statics.field1301[var63];
            if (var64 == null) {
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var64.field3314;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var65 = field1347[--Statics.field2334];
            class243 var66 = Statics.field1301[var65];
            if (var66 == null) {
                field1347[++Statics.field2334 - 1] = -1;
            } else {
                field1347[++Statics.field2334 - 1] = var66.field3298;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1347[++Statics.field2334 - 1] = Statics.field1353.field601;
            return 1;
        } else if (arg0 == 6698) {
            field1347[++Statics.field2334 - 1] = Statics.field1353.field597.method3675();
            return 1;
        } else if (arg0 == 6699) {
            field1347[++Statics.field2334 - 1] = Statics.field1353.field598.method3675();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("js.u(IB)V")
    public static void method4601(int arg0) {
        if (arg0 == -1 || !class217.method1008(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2678[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2734 != null) {
                class70 var4 = new class70();
                var4.field825 = var3;
                var4.field834 = var3.field2734;
                method3637(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("m.aa(ILhl;ZI)V")
    public static void method19(int arg0, class213 arg1, boolean arg2) {
        class33 var3 = client.method242().method4945(arg0);
        int var4 = Statics.field2350.field892;
        int var5 = (Statics.field2350.field1234 >> 7) + Statics.field749;
        int var6 = (Statics.field2350.field1276 >> 7) + Statics.field357;
        class213 var7 = new class213(var4, var5, var6);
        client.method242().method4905(var3, var7, arg1, arg2);
    }
}
