package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cd")
public class class84 {

    @ObfuscatedName("cd.f")
    public static int[] field1344 = new int[5];

    @ObfuscatedName("cd.i")
    public static int[][] field1349 = new int[5][5000];

    @ObfuscatedName("cd.j")
    public static int[] field1350 = new int[1000];

    @ObfuscatedName("cd.u")
    public static String[] field1348 = new String[1000];

    @ObfuscatedName("cd.v")
    public static int field1353 = 0;

    @ObfuscatedName("cd.h")
    public static class63[] field1354 = new class63[50];

    @ObfuscatedName("cd.q")
    public static Calendar field1355 = Calendar.getInstance();

    @ObfuscatedName("cd.l")
    public static final String[] field1356 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cd.n")
    public static int field1347 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.w(Lbs;B)V")
    public static void method2625(class70 arg0) {
        method478(arg0, 200000);
    }

    @ObfuscatedName("ay.o(Lbs;IB)V")
    public static void method478(class70 arg0, int arg1) {
        Object[] var2 = arg0.field854;
        class100 var4;
        if (class223.method3090(arg0.field860)) {
            Statics.field1357 = (class48) var2[0];
            class246 var3 = Statics.field3301[Statics.field1357.field632];
            var4 = Statics.method2109(arg0.field860, var3.field3296, var3.field3313);
        } else {
            int var5 = (Integer) var2[0];
            class100 var6 = (class100) class100.field1545.method3239((long) var5);
            class100 var7;
            if (var6 == null) {
                byte[] var8 = Statics.field607.method3754(var5, 0);
                if (var8 == null) {
                    var7 = null;
                } else {
                    class100 var9 = class100.method165(var8);
                    class100.field1545.method3241(var9, (long) var5);
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
        Statics.field510 = 0;
        Statics.field1352 = 0;
        int var10 = -1;
        int[] var11 = var4.field1543;
        int[] var12 = var4.field1544;
        byte var13 = -1;
        field1353 = 0;
        try {
            Statics.field1346 = new int[var4.field1546];
            int var14 = 0;
            Statics.field1351 = new String[var4.field1547];
            int var15 = 0;
            for (int var16 = 1; var16 < var2.length; var16++) {
                if (var2[var16] instanceof Integer) {
                    int var17 = (Integer) var2[var16];
                    if (var17 == -2147483647) {
                        var17 = arg0.field852;
                    }
                    if (var17 == -2147483646) {
                        var17 = arg0.field853;
                    }
                    if (var17 == -2147483645) {
                        var17 = arg0.field851 == null ? -1 : arg0.field851.field2657;
                    }
                    if (var17 == -2147483644) {
                        var17 = arg0.field865;
                    }
                    if (var17 == -2147483643) {
                        var17 = arg0.field851 == null ? -1 : arg0.field851.field2684;
                    }
                    if (var17 == -2147483642) {
                        var17 = arg0.field856 == null ? -1 : arg0.field856.field2657;
                    }
                    if (var17 == -2147483641) {
                        var17 = arg0.field856 == null ? -1 : arg0.field856.field2684;
                    }
                    if (var17 == -2147483640) {
                        var17 = arg0.field859;
                    }
                    if (var17 == -2147483639) {
                        var17 = arg0.field857;
                    }
                    Statics.field1346[var14++] = var17;
                } else if (var2[var16] instanceof String) {
                    String var18 = (String) var2[var16];
                    if (var18.equals("event_opbase")) {
                        var18 = arg0.field855;
                    }
                    Statics.field1351[var15++] = var18;
                }
            }
            int var19 = 0;
            field1347 = arg0.field858;
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
                                                                                                                label1778: while (true) {
                                                                                                                    var19++;
                                                                                                                    if (var19 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var10++;
                                                                                                                    int var394 = var11[var10];
                                                                                                                    if (var394 >= 100) {
                                                                                                                        boolean var57;
                                                                                                                        if (var4.field1544[var10] == 1) {
                                                                                                                            var57 = true;
                                                                                                                        } else {
                                                                                                                            var57 = false;
                                                                                                                        }
                                                                                                                        int var58;
                                                                                                                        if (var394 < 1000) {
                                                                                                                            var58 = method3914(var394, var4, var57);
                                                                                                                        } else if (var394 < 1100) {
                                                                                                                            var58 = method74(var394, var4, var57);
                                                                                                                        } else if (var394 < 1200) {
                                                                                                                            var58 = method3850(var394, var4, var57);
                                                                                                                        } else if (var394 < 1300) {
                                                                                                                            var58 = method50(var394, var4, var57);
                                                                                                                        } else if (var394 < 1400) {
                                                                                                                            var58 = Statics.method2422(var394, var4, var57);
                                                                                                                        } else if (var394 < 1500) {
                                                                                                                            var58 = method1444(var394, var4, var57);
                                                                                                                        } else if (var394 < 1600) {
                                                                                                                            var58 = method3721(var394, var4, var57);
                                                                                                                        } else if (var394 < 1700) {
                                                                                                                            class220 var59 = var57 ? Statics.field842 : Statics.field3770;
                                                                                                                            byte var60;
                                                                                                                            if (var394 == 1600) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2678;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1601) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2717;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1602) {
                                                                                                                                field1348[++Statics.field1352 - 1] = var59.field2783;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1603) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2680;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1604) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2758;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1605) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2659;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1606) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2779;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1607) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2742;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1608) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2709;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1609) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2688;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1610) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2729;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1611) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2682;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1612) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2683;
                                                                                                                                var60 = 1;
                                                                                                                            } else if (var394 == 1613) {
                                                                                                                                field1350[++Statics.field510 - 1] = var59.field2687.method12();
                                                                                                                                var60 = 1;
                                                                                                                            } else {
                                                                                                                                var60 = 2;
                                                                                                                            }
                                                                                                                            var58 = var60;
                                                                                                                        } else if (var394 < 1800) {
                                                                                                                            var58 = method3562(var394, var4, var57);
                                                                                                                        } else if (var394 < 1900) {
                                                                                                                            var58 = method2329(var394, var4, var57);
                                                                                                                        } else if (var394 < 2000) {
                                                                                                                            var58 = method703(var394, var4, var57);
                                                                                                                        } else if (var394 < 2100) {
                                                                                                                            var58 = method74(var394, var4, var57);
                                                                                                                        } else if (var394 < 2200) {
                                                                                                                            var58 = method3850(var394, var4, var57);
                                                                                                                        } else if (var394 < 2300) {
                                                                                                                            var58 = method50(var394, var4, var57);
                                                                                                                        } else if (var394 < 2400) {
                                                                                                                            var58 = Statics.method2422(var394, var4, var57);
                                                                                                                        } else if (var394 < 2500) {
                                                                                                                            var58 = method1444(var394, var4, var57);
                                                                                                                        } else if (var394 < 2600) {
                                                                                                                            var58 = method3586(var394, var4, var57);
                                                                                                                        } else if (var394 < 2700) {
                                                                                                                            class220 var61 = class220.method1162(field1350[--Statics.field510]);
                                                                                                                            byte var62;
                                                                                                                            if (var394 == 2600) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2678;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2601) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2717;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2602) {
                                                                                                                                field1348[++Statics.field1352 - 1] = var61.field2783;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2603) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2680;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2604) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2758;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2605) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2659;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2606) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2779;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2607) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2742;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2608) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2709;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2609) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2688;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2610) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2729;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2611) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2682;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2612) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2683;
                                                                                                                                var62 = 1;
                                                                                                                            } else if (var394 == 2613) {
                                                                                                                                field1350[++Statics.field510 - 1] = var61.field2687.method12();
                                                                                                                                var62 = 1;
                                                                                                                            } else {
                                                                                                                                var62 = 2;
                                                                                                                            }
                                                                                                                            var58 = var62;
                                                                                                                        } else if (var394 < 2800) {
                                                                                                                            var58 = method529(var394, var4, var57);
                                                                                                                        } else if (var394 < 2900) {
                                                                                                                            class220 var63 = class220.method1162(field1350[--Statics.field510]);
                                                                                                                            byte var68;
                                                                                                                            if (var394 == 2800) {
                                                                                                                                int[] var64 = field1350;
                                                                                                                                int var65 = ++Statics.field510 - 1;
                                                                                                                                int var66 = client.method967(var63);
                                                                                                                                int var67 = var66 >> 11 & 0x3F;
                                                                                                                                var64[var65] = var67;
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var394 == 2801) {
                                                                                                                                int var69 = field1350[--Statics.field510];
                                                                                                                                int var395 = var69 - 1;
                                                                                                                                if (var63.field2731 == null || var395 >= var63.field2731.length || var63.field2731[var395] == null) {
                                                                                                                                    field1348[++Statics.field1352 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field1352 - 1] = var63.field2731[var395];
                                                                                                                                }
                                                                                                                                var68 = 1;
                                                                                                                            } else if (var394 == 2802) {
                                                                                                                                if (var63.field2730 == null) {
                                                                                                                                    field1348[++Statics.field1352 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field1352 - 1] = var63.field2730;
                                                                                                                                }
                                                                                                                                var68 = 1;
                                                                                                                            } else {
                                                                                                                                var68 = 2;
                                                                                                                            }
                                                                                                                            var58 = var68;
                                                                                                                        } else if (var394 < 3000) {
                                                                                                                            var58 = method703(var394, var4, var57);
                                                                                                                        } else if (var394 < 3200) {
                                                                                                                            var58 = method473(var394, var4, var57);
                                                                                                                        } else if (var394 < 3300) {
                                                                                                                            var58 = method324(var394, var4, var57);
                                                                                                                        } else if (var394 < 3400) {
                                                                                                                            byte var70;
                                                                                                                            if (var394 == 3300) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field936;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3301) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var71 = field1350[Statics.field510];
                                                                                                                                int var72 = field1350[Statics.field510 + 1];
                                                                                                                                int[] var73 = field1350;
                                                                                                                                int var74 = ++Statics.field510 - 1;
                                                                                                                                class64 var75 = (class64) class64.field795.method3252((long) var71);
                                                                                                                                int var76;
                                                                                                                                if (var75 == null) {
                                                                                                                                    var76 = -1;
                                                                                                                                } else if (var72 >= 0 && var72 < var75.field794.length) {
                                                                                                                                    var76 = var75.field794[var72];
                                                                                                                                } else {
                                                                                                                                    var76 = -1;
                                                                                                                                }
                                                                                                                                var73[var74] = var76;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3302) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var77 = field1350[Statics.field510];
                                                                                                                                int var78 = field1350[Statics.field510 + 1];
                                                                                                                                int[] var79 = field1350;
                                                                                                                                int var80 = ++Statics.field510 - 1;
                                                                                                                                class64 var81 = (class64) class64.field795.method3252((long) var77);
                                                                                                                                int var82;
                                                                                                                                if (var81 == null) {
                                                                                                                                    var82 = 0;
                                                                                                                                } else if (var78 >= 0 && var78 < var81.field797.length) {
                                                                                                                                    var82 = var81.field797[var78];
                                                                                                                                } else {
                                                                                                                                    var82 = 0;
                                                                                                                                }
                                                                                                                                var79[var80] = var82;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3303) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var83 = field1350[Statics.field510];
                                                                                                                                int var84 = field1350[Statics.field510 + 1];
                                                                                                                                int[] var85 = field1350;
                                                                                                                                int var86 = ++Statics.field510 - 1;
                                                                                                                                class64 var87 = (class64) class64.field795.method3252((long) var83);
                                                                                                                                int var88;
                                                                                                                                if (var87 == null) {
                                                                                                                                    var88 = 0;
                                                                                                                                } else if (var84 == -1) {
                                                                                                                                    var88 = 0;
                                                                                                                                } else {
                                                                                                                                    int var89 = 0;
                                                                                                                                    for (int var90 = 0; var90 < var87.field797.length; var90++) {
                                                                                                                                        if (var87.field794[var90] == var84) {
                                                                                                                                            var89 += var87.field797[var90];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var88 = var89;
                                                                                                                                }
                                                                                                                                var85[var86] = var88;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3304) {
                                                                                                                                int var91 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = class244.method3700(var91).field3280;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3305) {
                                                                                                                                int var92 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.field928[var92];
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3306) {
                                                                                                                                int var93 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1063[var93];
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3307) {
                                                                                                                                int var94 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.field981[var94];
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3308) {
                                                                                                                                int var95 = Statics.field861;
                                                                                                                                int var96 = (Statics.field844.field1264 >> 7) + Statics.field353;
                                                                                                                                int var97 = (Statics.field844.field1236 >> 7) + Statics.field2461;
                                                                                                                                field1350[++Statics.field510 - 1] = (var95 << 28) + (var96 << 14) + var97;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3309) {
                                                                                                                                int var98 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = var98 >> 14 & 0x3FFF;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3310) {
                                                                                                                                int var99 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = var99 >> 28;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3311) {
                                                                                                                                int var100 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = var100 & 0x3FFF;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3312) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1175 ? 1 : 0;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3313) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var101 = field1350[Statics.field510] + 32768;
                                                                                                                                int var102 = field1350[Statics.field510 + 1];
                                                                                                                                int[] var103 = field1350;
                                                                                                                                int var104 = ++Statics.field510 - 1;
                                                                                                                                class64 var105 = (class64) class64.field795.method3252((long) var101);
                                                                                                                                int var106;
                                                                                                                                if (var105 == null) {
                                                                                                                                    var106 = -1;
                                                                                                                                } else if (var102 >= 0 && var102 < var105.field794.length) {
                                                                                                                                    var106 = var105.field794[var102];
                                                                                                                                } else {
                                                                                                                                    var106 = -1;
                                                                                                                                }
                                                                                                                                var103[var104] = var106;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3314) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var107 = field1350[Statics.field510] + 32768;
                                                                                                                                int var108 = field1350[Statics.field510 + 1];
                                                                                                                                int[] var109 = field1350;
                                                                                                                                int var110 = ++Statics.field510 - 1;
                                                                                                                                class64 var111 = (class64) class64.field795.method3252((long) var107);
                                                                                                                                int var112;
                                                                                                                                if (var111 == null) {
                                                                                                                                    var112 = 0;
                                                                                                                                } else if (var108 >= 0 && var108 < var111.field797.length) {
                                                                                                                                    var112 = var111.field797[var108];
                                                                                                                                } else {
                                                                                                                                    var112 = 0;
                                                                                                                                }
                                                                                                                                var109[var110] = var112;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3315) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var113 = field1350[Statics.field510] + 32768;
                                                                                                                                int var114 = field1350[Statics.field510 + 1];
                                                                                                                                int[] var115 = field1350;
                                                                                                                                int var116 = ++Statics.field510 - 1;
                                                                                                                                class64 var117 = (class64) class64.field795.method3252((long) var113);
                                                                                                                                int var118;
                                                                                                                                if (var117 == null) {
                                                                                                                                    var118 = 0;
                                                                                                                                } else if (var114 == -1) {
                                                                                                                                    var118 = 0;
                                                                                                                                } else {
                                                                                                                                    int var119 = 0;
                                                                                                                                    for (int var120 = 0; var120 < var117.field797.length; var120++) {
                                                                                                                                        if (var117.field794[var120] == var114) {
                                                                                                                                            var119 += var117.field797[var120];
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var118 = var119;
                                                                                                                                }
                                                                                                                                var115[var116] = var118;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3316) {
                                                                                                                                if (client.field1095 >= 2) {
                                                                                                                                    field1350[++Statics.field510 - 1] = client.field1095;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                }
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3317) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field980;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3318) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1106;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3321) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field973;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3322) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1094;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3323) {
                                                                                                                                if (client.field1097) {
                                                                                                                                    field1350[++Statics.field510 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                }
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3324) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field929;
                                                                                                                                var70 = 1;
                                                                                                                            } else if (var394 == 3325) {
                                                                                                                                Statics.field510 -= 4;
                                                                                                                                int var121 = field1350[Statics.field510];
                                                                                                                                int var122 = field1350[Statics.field510 + 1];
                                                                                                                                int var123 = field1350[Statics.field510 + 2];
                                                                                                                                int var124 = field1350[Statics.field510 + 3];
                                                                                                                                int var125 = (var122 << 14) + var121;
                                                                                                                                int var126 = (var123 << 28) + var125;
                                                                                                                                int var127 = var124 + var126;
                                                                                                                                field1350[++Statics.field510 - 1] = var127;
                                                                                                                                var70 = 1;
                                                                                                                            } else {
                                                                                                                                var70 = 2;
                                                                                                                            }
                                                                                                                            var58 = var70;
                                                                                                                        } else if (var394 < 3500) {
                                                                                                                            byte var132;
                                                                                                                            if (var394 == 3400) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var128 = field1350[Statics.field510];
                                                                                                                                int var129 = field1350[Statics.field510 + 1];
                                                                                                                                class257 var130 = class257.method2615(var128);
                                                                                                                                if (var130.field3416 != 's') {
                                                                                                                                }
                                                                                                                                for (int var131 = 0; var131 < var130.field3417; var131++) {
                                                                                                                                    if (var130.field3423[var131] == var129) {
                                                                                                                                        field1348[++Statics.field1352 - 1] = var130.field3422[var131];
                                                                                                                                        var130 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var130 != null) {
                                                                                                                                    field1348[++Statics.field1352 - 1] = var130.field3413;
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var394 == 3408) {
                                                                                                                                Statics.field510 -= 4;
                                                                                                                                int var133 = field1350[Statics.field510];
                                                                                                                                int var134 = field1350[Statics.field510 + 1];
                                                                                                                                int var135 = field1350[Statics.field510 + 2];
                                                                                                                                int var136 = field1350[Statics.field510 + 3];
                                                                                                                                class257 var137 = class257.method2615(var135);
                                                                                                                                if (var137.field3415 == var133 && var137.field3416 == var134) {
                                                                                                                                    for (int var138 = 0; var138 < var137.field3417; var138++) {
                                                                                                                                        if (var137.field3423[var138] == var136) {
                                                                                                                                            if (var134 == 115) {
                                                                                                                                                field1348[++Statics.field1352 - 1] = var137.field3422[var138];
                                                                                                                                            } else {
                                                                                                                                                field1350[++Statics.field510 - 1] = var137.field3414[var138];
                                                                                                                                            }
                                                                                                                                            var137 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var137 != null) {
                                                                                                                                        if (var134 == 115) {
                                                                                                                                            field1348[++Statics.field1352 - 1] = var137.field3413;
                                                                                                                                        } else {
                                                                                                                                            field1350[++Statics.field510 - 1] = var137.field3418;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var132 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var134 == 115) {
                                                                                                                                        field1348[++Statics.field1352 - 1] = "null";
                                                                                                                                    } else {
                                                                                                                                        field1350[++Statics.field510 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var132 = 1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var132 = 2;
                                                                                                                            }
                                                                                                                            var58 = var132;
                                                                                                                        } else if (var394 < 3700) {
                                                                                                                            var58 = method3590(var394, var4, var57);
                                                                                                                        } else if (var394 < 4000) {
                                                                                                                            byte var140;
                                                                                                                            if (var394 == 3903) {
                                                                                                                                int var139 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.field931[var139].method87();
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3904) {
                                                                                                                                int var141 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.field931[var141].field317;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3905) {
                                                                                                                                int var142 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.field931[var142].field318;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3906) {
                                                                                                                                int var143 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.field931[var143].field319;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3907) {
                                                                                                                                int var144 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.field931[var144].field323;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3908) {
                                                                                                                                int var145 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.field931[var145].field320;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3910) {
                                                                                                                                int var146 = field1350[--Statics.field510];
                                                                                                                                int var147 = client.field931[var146].method84();
                                                                                                                                field1350[++Statics.field510 - 1] = var147 == 0 ? 1 : 0;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3911) {
                                                                                                                                int var148 = field1350[--Statics.field510];
                                                                                                                                int var149 = client.field931[var148].method84();
                                                                                                                                field1350[++Statics.field510 - 1] = var149 == 2 ? 1 : 0;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3912) {
                                                                                                                                int var150 = field1350[--Statics.field510];
                                                                                                                                int var151 = client.field931[var150].method84();
                                                                                                                                field1350[++Statics.field510 - 1] = var151 == 5 ? 1 : 0;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3913) {
                                                                                                                                int var152 = field1350[--Statics.field510];
                                                                                                                                int var153 = client.field931[var152].method84();
                                                                                                                                field1350[++Statics.field510 - 1] = var153 == 1 ? 1 : 0;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3914) {
                                                                                                                                boolean var154 = field1350[--Statics.field510] == 1;
                                                                                                                                if (Statics.field1532 != null) {
                                                                                                                                    Statics.field1532.method59(class14.field296, var154);
                                                                                                                                }
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3915) {
                                                                                                                                boolean var155 = field1350[--Statics.field510] == 1;
                                                                                                                                if (Statics.field1532 != null) {
                                                                                                                                    Statics.field1532.method59(class14.field294, var155);
                                                                                                                                }
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3916) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                boolean var156 = field1350[Statics.field510] == 1;
                                                                                                                                boolean var157 = field1350[Statics.field510 + 1] == 1;
                                                                                                                                if (Statics.field1532 != null) {
                                                                                                                                    Statics.field1532.method59(new class96(var157), var156);
                                                                                                                                }
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3917) {
                                                                                                                                boolean var158 = field1350[--Statics.field510] == 1;
                                                                                                                                if (Statics.field1532 != null) {
                                                                                                                                    Statics.field1532.method59(class14.field293, var158);
                                                                                                                                }
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3918) {
                                                                                                                                boolean var159 = field1350[--Statics.field510] == 1;
                                                                                                                                if (Statics.field1532 != null) {
                                                                                                                                    Statics.field1532.method59(class14.field297, var159);
                                                                                                                                }
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3919) {
                                                                                                                                field1350[++Statics.field510 - 1] = Statics.field1532 == null ? 0 : Statics.field1532.field295.size();
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3920) {
                                                                                                                                int var160 = field1350[--Statics.field510];
                                                                                                                                class15 var161 = (class15) Statics.field1532.field295.get(var160);
                                                                                                                                field1350[++Statics.field510 - 1] = var161.field309;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3921) {
                                                                                                                                int var162 = field1350[--Statics.field510];
                                                                                                                                class15 var163 = (class15) Statics.field1532.field295.get(var162);
                                                                                                                                field1348[++Statics.field1352 - 1] = var163.method63();
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3922) {
                                                                                                                                int var164 = field1350[--Statics.field510];
                                                                                                                                class15 var165 = (class15) Statics.field1532.field295.get(var164);
                                                                                                                                field1348[++Statics.field1352 - 1] = var165.method64();
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3923) {
                                                                                                                                int var166 = field1350[--Statics.field510];
                                                                                                                                class15 var167 = (class15) Statics.field1532.field295.get(var166);
                                                                                                                                long var168 = class179.method1665() - Statics.field1406 - var167.field302;
                                                                                                                                int var170 = (int) (var168 / 3600000L);
                                                                                                                                int var171 = (int) ((var168 - (long) (var170 * 3600000)) / 60000L);
                                                                                                                                int var172 = (int) ((var168 - (long) (var170 * 3600000) - (long) (var171 * 60000)) / 1000L);
                                                                                                                                String var173 = var170 + ":" + var171 / 10 + var171 % 10 + ":" + var172 / 10 + var172 % 10;
                                                                                                                                field1348[++Statics.field1352 - 1] = var173;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3924) {
                                                                                                                                int var174 = field1350[--Statics.field510];
                                                                                                                                class15 var175 = (class15) Statics.field1532.field295.get(var174);
                                                                                                                                field1350[++Statics.field510 - 1] = var175.field303.field319;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3925) {
                                                                                                                                int var176 = field1350[--Statics.field510];
                                                                                                                                class15 var177 = (class15) Statics.field1532.field295.get(var176);
                                                                                                                                field1350[++Statics.field510 - 1] = var177.field303.field318;
                                                                                                                                var140 = 1;
                                                                                                                            } else if (var394 == 3926) {
                                                                                                                                int var178 = field1350[--Statics.field510];
                                                                                                                                class15 var179 = (class15) Statics.field1532.field295.get(var178);
                                                                                                                                field1350[++Statics.field510 - 1] = var179.field303.field317;
                                                                                                                                var140 = 1;
                                                                                                                            } else {
                                                                                                                                var140 = 2;
                                                                                                                            }
                                                                                                                            var58 = var140;
                                                                                                                        } else if (var394 < 4100) {
                                                                                                                            byte var182;
                                                                                                                            if (var394 == 4000) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var180 = field1350[Statics.field510];
                                                                                                                                int var181 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var180 + var181;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4001) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var183 = field1350[Statics.field510];
                                                                                                                                int var184 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var183 - var184;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4002) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var185 = field1350[Statics.field510];
                                                                                                                                int var186 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var185 * var186;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4003) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var187 = field1350[Statics.field510];
                                                                                                                                int var188 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var187 / var188;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4004) {
                                                                                                                                int var189 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = (int) (Math.random() * (double) var189);
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4005) {
                                                                                                                                int var190 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = (int) (Math.random() * (double) (var190 + 1));
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4006) {
                                                                                                                                Statics.field510 -= 5;
                                                                                                                                int var191 = field1350[Statics.field510];
                                                                                                                                int var192 = field1350[Statics.field510 + 1];
                                                                                                                                int var193 = field1350[Statics.field510 + 2];
                                                                                                                                int var194 = field1350[Statics.field510 + 3];
                                                                                                                                int var195 = field1350[Statics.field510 + 4];
                                                                                                                                field1350[++Statics.field510 - 1] = (var192 - var191) * (var195 - var193) / (var194 - var193) + var191;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4007) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var196 = field1350[Statics.field510];
                                                                                                                                int var197 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var196 * var197 / 100 + var196;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4008) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var198 = field1350[Statics.field510];
                                                                                                                                int var199 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var198 | 0x1 << var199;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4009) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var200 = field1350[Statics.field510];
                                                                                                                                int var201 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var200 & -1 - (0x1 << var201);
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4010) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var202 = field1350[Statics.field510];
                                                                                                                                int var203 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = (var202 & 0x1 << var203) == 0 ? 0 : 1;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4011) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var204 = field1350[Statics.field510];
                                                                                                                                int var205 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var204 % var205;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4012) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var206 = field1350[Statics.field510];
                                                                                                                                int var207 = field1350[Statics.field510 + 1];
                                                                                                                                if (var206 == 0) {
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = (int) Math.pow((double) var206, (double) var207);
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4013) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var208 = field1350[Statics.field510];
                                                                                                                                int var209 = field1350[Statics.field510 + 1];
                                                                                                                                if (var208 == 0) {
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                } else if (var209 == 0) {
                                                                                                                                    field1350[++Statics.field510 - 1] = Integer.MAX_VALUE;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = (int) Math.pow((double) var208, 1.0D / (double) var209);
                                                                                                                                }
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4014) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var210 = field1350[Statics.field510];
                                                                                                                                int var211 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var210 & var211;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4015) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var212 = field1350[Statics.field510];
                                                                                                                                int var213 = field1350[Statics.field510 + 1];
                                                                                                                                field1350[++Statics.field510 - 1] = var212 | var213;
                                                                                                                                var182 = 1;
                                                                                                                            } else if (var394 == 4018) {
                                                                                                                                Statics.field510 -= 3;
                                                                                                                                long var214 = (long) field1350[Statics.field510];
                                                                                                                                long var216 = (long) field1350[Statics.field510 + 1];
                                                                                                                                long var218 = (long) field1350[Statics.field510 + 2];
                                                                                                                                field1350[++Statics.field510 - 1] = (int) (var214 * var218 / var216);
                                                                                                                                var182 = 1;
                                                                                                                            } else {
                                                                                                                                var182 = 2;
                                                                                                                            }
                                                                                                                            var58 = var182;
                                                                                                                        } else if (var394 < 4200) {
                                                                                                                            byte var222;
                                                                                                                            if (var394 == 4100) {
                                                                                                                                String var220 = field1348[--Statics.field1352];
                                                                                                                                int var221 = field1350[--Statics.field510];
                                                                                                                                field1348[++Statics.field1352 - 1] = var220 + var221;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4101) {
                                                                                                                                Statics.field1352 -= 2;
                                                                                                                                String var223 = field1348[Statics.field1352];
                                                                                                                                String var224 = field1348[Statics.field1352 + 1];
                                                                                                                                field1348[++Statics.field1352 - 1] = var223 + var224;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4102) {
                                                                                                                                String var225 = field1348[--Statics.field1352];
                                                                                                                                int var226 = field1350[--Statics.field510];
                                                                                                                                field1348[++Statics.field1352 - 1] = var225 + class274.method1381(var226, true);
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4103) {
                                                                                                                                String var227 = field1348[--Statics.field1352];
                                                                                                                                field1348[++Statics.field1352 - 1] = var227.toLowerCase();
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4104) {
                                                                                                                                int var228 = field1350[--Statics.field510];
                                                                                                                                long var229 = ((long) var228 + 11745L) * 86400000L;
                                                                                                                                field1355.setTime(new Date(var229));
                                                                                                                                int var231 = field1355.get(5);
                                                                                                                                int var232 = field1355.get(2);
                                                                                                                                int var233 = field1355.get(1);
                                                                                                                                field1348[++Statics.field1352 - 1] = var231 + "-" + field1356[var232] + "-" + var233;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4105) {
                                                                                                                                Statics.field1352 -= 2;
                                                                                                                                String var234 = field1348[Statics.field1352];
                                                                                                                                String var235 = field1348[Statics.field1352 + 1];
                                                                                                                                if (Statics.field844.field895 != null && Statics.field844.field895.field2626) {
                                                                                                                                    field1348[++Statics.field1352 - 1] = var235;
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field1352 - 1] = var234;
                                                                                                                                }
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4106) {
                                                                                                                                int var236 = field1350[--Statics.field510];
                                                                                                                                field1348[++Statics.field1352 - 1] = Integer.toString(var236);
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4107) {
                                                                                                                                Statics.field1352 -= 2;
                                                                                                                                field1350[++Statics.field510 - 1] = class274.method3100(class168.method2627(field1348[Statics.field1352], field1348[Statics.field1352 + 1], client.field1111));
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4108) {
                                                                                                                                String var237 = field1348[--Statics.field1352];
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var238 = field1350[Statics.field510];
                                                                                                                                int var239 = field1350[Statics.field510 + 1];
                                                                                                                                byte[] var240 = Statics.field3395.method3754(var239, 0);
                                                                                                                                class267 var241 = new class267(var240);
                                                                                                                                field1350[++Statics.field510 - 1] = var241.method4405(var237, var238);
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4109) {
                                                                                                                                String var242 = field1348[--Statics.field1352];
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var243 = field1350[Statics.field510];
                                                                                                                                int var244 = field1350[Statics.field510 + 1];
                                                                                                                                byte[] var245 = Statics.field3395.method3754(var244, 0);
                                                                                                                                class267 var246 = new class267(var245);
                                                                                                                                field1350[++Statics.field510 - 1] = var246.method4404(var242, var243);
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4110) {
                                                                                                                                Statics.field1352 -= 2;
                                                                                                                                String var247 = field1348[Statics.field1352];
                                                                                                                                String var248 = field1348[Statics.field1352 + 1];
                                                                                                                                if (field1350[--Statics.field510] == 1) {
                                                                                                                                    field1348[++Statics.field1352 - 1] = var247;
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field1352 - 1] = var248;
                                                                                                                                }
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4111) {
                                                                                                                                String var249 = field1348[--Statics.field1352];
                                                                                                                                field1348[++Statics.field1352 - 1] = class268.method4480(var249);
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4112) {
                                                                                                                                String var250 = field1348[--Statics.field1352];
                                                                                                                                int var251 = field1350[--Statics.field510];
                                                                                                                                field1348[++Statics.field1352 - 1] = var250 + (char) var251;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4113) {
                                                                                                                                int var252 = field1350[--Statics.field510];
                                                                                                                                int[] var253 = field1350;
                                                                                                                                int var254 = ++Statics.field510 - 1;
                                                                                                                                char var255 = (char) var252;
                                                                                                                                boolean var256;
                                                                                                                                if (var255 >= ' ' && var255 <= '~') {
                                                                                                                                    var256 = true;
                                                                                                                                } else if (var255 >= 160 && var255 <= 255) {
                                                                                                                                    var256 = true;
                                                                                                                                } else if (var255 == 8364 || var255 == 338 || var255 == 8212 || var255 == 339 || var255 == 376) {
                                                                                                                                    var256 = true;
                                                                                                                                } else {
                                                                                                                                    var256 = false;
                                                                                                                                }
                                                                                                                                var253[var254] = var256 ? 1 : 0;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4114) {
                                                                                                                                int var257 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = class274.method241((char) var257) ? 1 : 0;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4115) {
                                                                                                                                int var258 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = class274.method2657((char) var258) ? 1 : 0;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4116) {
                                                                                                                                int var259 = field1350[--Statics.field510];
                                                                                                                                int[] var260 = field1350;
                                                                                                                                int var261 = ++Statics.field510 - 1;
                                                                                                                                char var262 = (char) var259;
                                                                                                                                boolean var263 = var262 >= '0' && var262 <= '9';
                                                                                                                                var260[var261] = var263 ? 1 : 0;
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4117) {
                                                                                                                                String var264 = field1348[--Statics.field1352];
                                                                                                                                if (var264 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var264.length();
                                                                                                                                }
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4118) {
                                                                                                                                String var265 = field1348[--Statics.field1352];
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var266 = field1350[Statics.field510];
                                                                                                                                int var267 = field1350[Statics.field510 + 1];
                                                                                                                                field1348[++Statics.field1352 - 1] = var265.substring(var266, var267);
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4119) {
                                                                                                                                String var268 = field1348[--Statics.field1352];
                                                                                                                                StringBuilder var269 = new StringBuilder(var268.length());
                                                                                                                                boolean var270 = false;
                                                                                                                                for (int var271 = 0; var271 < var268.length(); var271++) {
                                                                                                                                    char var272 = var268.charAt(var271);
                                                                                                                                    if (var272 == '<') {
                                                                                                                                        var270 = true;
                                                                                                                                    } else if (var272 == '>') {
                                                                                                                                        var270 = false;
                                                                                                                                    } else if (!var270) {
                                                                                                                                        var269.append(var272);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1348[++Statics.field1352 - 1] = var269.toString();
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4120) {
                                                                                                                                String var273 = field1348[--Statics.field1352];
                                                                                                                                int var274 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = var273.indexOf(var274);
                                                                                                                                var222 = 1;
                                                                                                                            } else if (var394 == 4121) {
                                                                                                                                Statics.field1352 -= 2;
                                                                                                                                String var275 = field1348[Statics.field1352];
                                                                                                                                String var276 = field1348[Statics.field1352 + 1];
                                                                                                                                int var277 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = var275.indexOf(var276, var277);
                                                                                                                                var222 = 1;
                                                                                                                            } else {
                                                                                                                                var222 = 2;
                                                                                                                            }
                                                                                                                            var58 = var222;
                                                                                                                        } else if (var394 < 4300) {
                                                                                                                            var58 = Statics.method905(var394, var4, var57);
                                                                                                                        } else if (var394 < 5100) {
                                                                                                                            byte var278;
                                                                                                                            if (var394 == 5000) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1144;
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5001) {
                                                                                                                                Statics.field510 -= 3;
                                                                                                                                client.field1144 = field1350[Statics.field510];
                                                                                                                                Statics.field1371 = class280.method2624(field1350[Statics.field510 + 1]);
                                                                                                                                if (Statics.field1371 == null) {
                                                                                                                                    Statics.field1371 = class280.field3741;
                                                                                                                                }
                                                                                                                                client.field975 = field1350[Statics.field510 + 2];
                                                                                                                                client.field970.method3115(124);
                                                                                                                                client.field970.method3075(client.field1144);
                                                                                                                                client.field970.method3075(Statics.field1371.field3743);
                                                                                                                                client.field970.method3075(client.field975);
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5002) {
                                                                                                                                String var279 = field1348[--Statics.field1352];
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var280 = field1350[Statics.field510];
                                                                                                                                int var281 = field1350[Statics.field510 + 1];
                                                                                                                                client.field970.method3115(197);
                                                                                                                                client.field970.method3075(class177.method117(var279) + 2);
                                                                                                                                client.field970.method2875(var279);
                                                                                                                                client.field970.method3075(var280 - 1);
                                                                                                                                client.field970.method3075(var281);
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5003) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var282 = field1350[Statics.field510];
                                                                                                                                int var283 = field1350[Statics.field510 + 1];
                                                                                                                                class102 var284 = (class102) class99.field1541.get(var282);
                                                                                                                                class73 var285 = var284.method1679(var283);
                                                                                                                                if (var285 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                    field1348[++Statics.field1352 - 1] = "";
                                                                                                                                    field1348[++Statics.field1352 - 1] = "";
                                                                                                                                    field1348[++Statics.field1352 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var285.field890;
                                                                                                                                    field1350[++Statics.field510 - 1] = var285.field881;
                                                                                                                                    field1348[++Statics.field1352 - 1] = var285.field883 == null ? "" : var285.field883;
                                                                                                                                    field1348[++Statics.field1352 - 1] = var285.field884 == null ? "" : var285.field884;
                                                                                                                                    field1348[++Statics.field1352 - 1] = var285.field885 == null ? "" : var285.field885;
                                                                                                                                }
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5004) {
                                                                                                                                int var287 = field1350[--Statics.field510];
                                                                                                                                class73 var288 = class99.method540(var287);
                                                                                                                                if (var288 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                    field1348[++Statics.field1352 - 1] = "";
                                                                                                                                    field1348[++Statics.field1352 - 1] = "";
                                                                                                                                    field1348[++Statics.field1352 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var288.field886;
                                                                                                                                    field1350[++Statics.field510 - 1] = var288.field881;
                                                                                                                                    field1348[++Statics.field1352 - 1] = var288.field883 == null ? "" : var288.field883;
                                                                                                                                    field1348[++Statics.field1352 - 1] = var288.field884 == null ? "" : var288.field884;
                                                                                                                                    field1348[++Statics.field1352 - 1] = var288.field885 == null ? "" : var288.field885;
                                                                                                                                }
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5005) {
                                                                                                                                if (Statics.field1371 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = Statics.field1371.field3743;
                                                                                                                                }
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5008) {
                                                                                                                                String var289 = field1348[--Statics.field1352];
                                                                                                                                int var290 = field1350[--Statics.field510];
                                                                                                                                String var291 = var289.toLowerCase();
                                                                                                                                byte var292 = 0;
                                                                                                                                if (var291.startsWith(class229.field3031)) {
                                                                                                                                    var292 = 0;
                                                                                                                                    var289 = var289.substring(class229.field3031.length());
                                                                                                                                } else if (var291.startsWith(class229.field2991)) {
                                                                                                                                    var292 = 1;
                                                                                                                                    var289 = var289.substring(class229.field2991.length());
                                                                                                                                } else if (var291.startsWith(class229.field2914)) {
                                                                                                                                    var292 = 2;
                                                                                                                                    var289 = var289.substring(class229.field2914.length());
                                                                                                                                } else if (var291.startsWith(class229.field3037)) {
                                                                                                                                    var292 = 3;
                                                                                                                                    var289 = var289.substring(class229.field3037.length());
                                                                                                                                } else if (var291.startsWith(class229.field2928)) {
                                                                                                                                    var292 = 4;
                                                                                                                                    var289 = var289.substring(class229.field2928.length());
                                                                                                                                } else if (var291.startsWith(class229.field3041)) {
                                                                                                                                    var292 = 5;
                                                                                                                                    var289 = var289.substring(class229.field3041.length());
                                                                                                                                } else if (var291.startsWith(class229.field2917)) {
                                                                                                                                    var292 = 6;
                                                                                                                                    var289 = var289.substring(class229.field2917.length());
                                                                                                                                } else if (var291.startsWith(class229.field3045)) {
                                                                                                                                    var292 = 7;
                                                                                                                                    var289 = var289.substring(class229.field3045.length());
                                                                                                                                } else if (var291.startsWith(class229.field3047)) {
                                                                                                                                    var292 = 8;
                                                                                                                                    var289 = var289.substring(class229.field3047.length());
                                                                                                                                } else if (var291.startsWith(class229.field3049)) {
                                                                                                                                    var292 = 9;
                                                                                                                                    var289 = var289.substring(class229.field3049.length());
                                                                                                                                } else if (var291.startsWith(class229.field3051)) {
                                                                                                                                    var292 = 10;
                                                                                                                                    var289 = var289.substring(class229.field3051.length());
                                                                                                                                } else if (var291.startsWith(class229.field3053)) {
                                                                                                                                    var292 = 11;
                                                                                                                                    var289 = var289.substring(class229.field3053.length());
                                                                                                                                } else if (client.field1111 != 0) {
                                                                                                                                    if (var291.startsWith(class229.field3106)) {
                                                                                                                                        var292 = 0;
                                                                                                                                        var289 = var289.substring(class229.field3106.length());
                                                                                                                                    } else if (var291.startsWith(class229.field2874)) {
                                                                                                                                        var292 = 1;
                                                                                                                                        var289 = var289.substring(class229.field2874.length());
                                                                                                                                    } else if (var291.startsWith(class229.field3036)) {
                                                                                                                                        var292 = 2;
                                                                                                                                        var289 = var289.substring(class229.field3036.length());
                                                                                                                                    } else if (var291.startsWith(class229.field3004)) {
                                                                                                                                        var292 = 3;
                                                                                                                                        var289 = var289.substring(class229.field3004.length());
                                                                                                                                    } else if (var291.startsWith(class229.field3122)) {
                                                                                                                                        var292 = 4;
                                                                                                                                        var289 = var289.substring(class229.field3122.length());
                                                                                                                                    } else if (var291.startsWith(class229.field2898)) {
                                                                                                                                        var292 = 5;
                                                                                                                                        var289 = var289.substring(class229.field2898.length());
                                                                                                                                    } else if (var291.startsWith(class229.field3074)) {
                                                                                                                                        var292 = 6;
                                                                                                                                        var289 = var289.substring(class229.field3074.length());
                                                                                                                                    } else if (var291.startsWith(class229.field3046)) {
                                                                                                                                        var292 = 7;
                                                                                                                                        var289 = var289.substring(class229.field3046.length());
                                                                                                                                    } else if (var291.startsWith(class229.field3048)) {
                                                                                                                                        var292 = 8;
                                                                                                                                        var289 = var289.substring(class229.field3048.length());
                                                                                                                                    } else if (var291.startsWith(class229.field3050)) {
                                                                                                                                        var292 = 9;
                                                                                                                                        var289 = var289.substring(class229.field3050.length());
                                                                                                                                    } else if (var291.startsWith(class229.field3052)) {
                                                                                                                                        var292 = 10;
                                                                                                                                        var289 = var289.substring(class229.field3052.length());
                                                                                                                                    } else if (var291.startsWith(class229.field3012)) {
                                                                                                                                        var292 = 11;
                                                                                                                                        var289 = var289.substring(class229.field3012.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                String var293 = var289.toLowerCase();
                                                                                                                                byte var294 = 0;
                                                                                                                                if (var293.startsWith(class229.field3055)) {
                                                                                                                                    var294 = 1;
                                                                                                                                    var289 = var289.substring(class229.field3055.length());
                                                                                                                                } else if (var293.startsWith(class229.field3057)) {
                                                                                                                                    var294 = 2;
                                                                                                                                    var289 = var289.substring(class229.field3057.length());
                                                                                                                                } else if (var293.startsWith(class229.field3054)) {
                                                                                                                                    var294 = 3;
                                                                                                                                    var289 = var289.substring(class229.field3054.length());
                                                                                                                                } else if (var293.startsWith(class229.field3061)) {
                                                                                                                                    var294 = 4;
                                                                                                                                    var289 = var289.substring(class229.field3061.length());
                                                                                                                                } else if (var293.startsWith(class229.field3076)) {
                                                                                                                                    var294 = 5;
                                                                                                                                    var289 = var289.substring(class229.field3076.length());
                                                                                                                                } else if (client.field1111 != 0) {
                                                                                                                                    if (var293.startsWith(class229.field3056)) {
                                                                                                                                        var294 = 1;
                                                                                                                                        var289 = var289.substring(class229.field3056.length());
                                                                                                                                    } else if (var293.startsWith(class229.field3058)) {
                                                                                                                                        var294 = 2;
                                                                                                                                        var289 = var289.substring(class229.field3058.length());
                                                                                                                                    } else if (var293.startsWith(class229.field3060)) {
                                                                                                                                        var294 = 3;
                                                                                                                                        var289 = var289.substring(class229.field3060.length());
                                                                                                                                    } else if (var293.startsWith(class229.field2962)) {
                                                                                                                                        var294 = 4;
                                                                                                                                        var289 = var289.substring(class229.field2962.length());
                                                                                                                                    } else if (var293.startsWith(class229.field3064)) {
                                                                                                                                        var294 = 5;
                                                                                                                                        var289 = var289.substring(class229.field3064.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field970.method3115(185);
                                                                                                                                client.field970.method3075(0);
                                                                                                                                int var295 = client.field970.field2412;
                                                                                                                                client.field970.method3075(var290);
                                                                                                                                client.field970.method3075(var292);
                                                                                                                                client.field970.method3075(var294);
                                                                                                                                class269.method1532(client.field970, var289);
                                                                                                                                client.field970.method2881(client.field970.field2412 - var295);
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5009) {
                                                                                                                                Statics.field1352 -= 2;
                                                                                                                                String var296 = field1348[Statics.field1352];
                                                                                                                                String var297 = field1348[Statics.field1352 + 1];
                                                                                                                                client.field970.method3115(106);
                                                                                                                                client.field970.method2903(0);
                                                                                                                                int var298 = client.field970.field2412;
                                                                                                                                client.field970.method2875(var296);
                                                                                                                                class269.method1532(client.field970, var297);
                                                                                                                                client.field970.method3009(client.field970.field2412 - var298);
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5015) {
                                                                                                                                String var299;
                                                                                                                                if (Statics.field844 == null || Statics.field844.field907 == null) {
                                                                                                                                    var299 = "";
                                                                                                                                } else {
                                                                                                                                    var299 = Statics.field844.field907;
                                                                                                                                }
                                                                                                                                field1348[++Statics.field1352 - 1] = var299;
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5016) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field975;
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5017) {
                                                                                                                                int var300 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = class99.method4381(var300);
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5018) {
                                                                                                                                int var301 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = class99.method2129(var301);
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5019) {
                                                                                                                                int var302 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = class99.method1602(var302);
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5020) {
                                                                                                                                String var303 = field1348[--Statics.field1352];
                                                                                                                                client.method535(var303);
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5021) {
                                                                                                                                client.field1146 = field1348[--Statics.field1352].toLowerCase().trim();
                                                                                                                                var278 = 1;
                                                                                                                            } else if (var394 == 5022) {
                                                                                                                                field1348[++Statics.field1352 - 1] = client.field1146;
                                                                                                                                var278 = 1;
                                                                                                                            } else {
                                                                                                                                var278 = 2;
                                                                                                                            }
                                                                                                                            var58 = var278;
                                                                                                                        } else if (var394 < 5400) {
                                                                                                                            byte var307;
                                                                                                                            if (var394 == 5306) {
                                                                                                                                int[] var304 = field1350;
                                                                                                                                int var305 = ++Statics.field510 - 1;
                                                                                                                                int var306 = client.field1142 ? 2 : 1;
                                                                                                                                var304[var305] = var306;
                                                                                                                                var307 = 1;
                                                                                                                            } else if (var394 == 5307) {
                                                                                                                                int var308 = field1350[--Statics.field510];
                                                                                                                                if (var308 == 1 || var308 == 2) {
                                                                                                                                    client.method482(var308);
                                                                                                                                }
                                                                                                                                var307 = 1;
                                                                                                                            } else if (var394 == 5308) {
                                                                                                                                field1350[++Statics.field510 - 1] = Statics.field3187.field1322;
                                                                                                                                var307 = 1;
                                                                                                                            } else if (var394 == 5309) {
                                                                                                                                int var309 = field1350[--Statics.field510];
                                                                                                                                if (var309 == 1 || var309 == 2) {
                                                                                                                                    Statics.field3187.field1322 = var309;
                                                                                                                                    class82.method1005();
                                                                                                                                }
                                                                                                                                var307 = 1;
                                                                                                                            } else {
                                                                                                                                var307 = 2;
                                                                                                                            }
                                                                                                                            var58 = var307;
                                                                                                                        } else if (var394 < 5600) {
                                                                                                                            byte var315;
                                                                                                                            if (var394 == 5504) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var313 = field1350[Statics.field510];
                                                                                                                                int var314 = field1350[Statics.field510 + 1];
                                                                                                                                if (!client.field1174) {
                                                                                                                                    client.field1119 = var313;
                                                                                                                                    client.field1012 = var314;
                                                                                                                                }
                                                                                                                                var315 = 1;
                                                                                                                            } else if (var394 == 5505) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1119;
                                                                                                                                var315 = 1;
                                                                                                                            } else if (var394 == 5506) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1012;
                                                                                                                                var315 = 1;
                                                                                                                            } else if (var394 == 5530) {
                                                                                                                                int var316 = field1350[--Statics.field510];
                                                                                                                                if (var316 < 0) {
                                                                                                                                    var316 = 0;
                                                                                                                                }
                                                                                                                                client.field927 = var316;
                                                                                                                                var315 = 1;
                                                                                                                            } else if (var394 == 5531) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field927;
                                                                                                                                var315 = 1;
                                                                                                                            } else {
                                                                                                                                var315 = 2;
                                                                                                                            }
                                                                                                                            var58 = var315;
                                                                                                                        } else if (var394 < 5700) {
                                                                                                                            byte var317;
                                                                                                                            if (var394 == 5630) {
                                                                                                                                client.field1122 = 250;
                                                                                                                                var317 = 1;
                                                                                                                            } else {
                                                                                                                                var317 = 2;
                                                                                                                            }
                                                                                                                            var58 = var317;
                                                                                                                        } else if (var394 < 6300) {
                                                                                                                            byte var318;
                                                                                                                            if (var394 == 6200) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                client.field1180 = (short) field1350[Statics.field510];
                                                                                                                                if (client.field1180 <= 0) {
                                                                                                                                    client.field1180 = 256;
                                                                                                                                }
                                                                                                                                client.field1181 = (short) field1350[Statics.field510 + 1];
                                                                                                                                if (client.field1181 <= 0) {
                                                                                                                                    client.field1181 = 205;
                                                                                                                                }
                                                                                                                                var318 = 1;
                                                                                                                            } else if (var394 == 6201) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                client.field940 = (short) field1350[Statics.field510];
                                                                                                                                if (client.field940 <= 0) {
                                                                                                                                    client.field940 = 256;
                                                                                                                                }
                                                                                                                                client.field1183 = (short) field1350[Statics.field510 + 1];
                                                                                                                                if (client.field1183 <= 0) {
                                                                                                                                    client.field1183 = 320;
                                                                                                                                }
                                                                                                                                var318 = 1;
                                                                                                                            } else if (var394 == 6202) {
                                                                                                                                Statics.field510 -= 4;
                                                                                                                                client.field1184 = (short) field1350[Statics.field510];
                                                                                                                                if (client.field1184 <= 0) {
                                                                                                                                    client.field1184 = 1;
                                                                                                                                }
                                                                                                                                client.field1022 = (short) field1350[Statics.field510 + 1];
                                                                                                                                if (client.field1022 <= 0) {
                                                                                                                                    client.field1022 = 32767;
                                                                                                                                } else if (client.field1022 < client.field1184) {
                                                                                                                                    client.field1022 = client.field1184;
                                                                                                                                }
                                                                                                                                client.field1186 = (short) field1350[Statics.field510 + 2];
                                                                                                                                if (client.field1186 <= 0) {
                                                                                                                                    client.field1186 = 1;
                                                                                                                                }
                                                                                                                                client.field1152 = (short) field1350[Statics.field510 + 3];
                                                                                                                                if (client.field1152 <= 0) {
                                                                                                                                    client.field1152 = 32767;
                                                                                                                                } else if (client.field1152 < client.field1186) {
                                                                                                                                    client.field1152 = client.field1186;
                                                                                                                                }
                                                                                                                                var318 = 1;
                                                                                                                            } else if (var394 == 6203) {
                                                                                                                                if (client.field1173 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    client.method4377(0, 0, client.field1173.field2672, client.field1173.field2673, false);
                                                                                                                                    field1350[++Statics.field510 - 1] = client.field1182;
                                                                                                                                    field1350[++Statics.field510 - 1] = client.field1074;
                                                                                                                                }
                                                                                                                                var318 = 1;
                                                                                                                            } else if (var394 == 6204) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field940;
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1183;
                                                                                                                                var318 = 1;
                                                                                                                            } else if (var394 == 6205) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1180;
                                                                                                                                field1350[++Statics.field510 - 1] = client.field1181;
                                                                                                                                var318 = 1;
                                                                                                                            } else {
                                                                                                                                var318 = 2;
                                                                                                                            }
                                                                                                                            var58 = var318;
                                                                                                                        } else if (var394 < 6600) {
                                                                                                                            var58 = method1566(var394, var4, var57);
                                                                                                                        } else if (var394 < 6700) {
                                                                                                                            byte var322;
                                                                                                                            if (var394 == 6600) {
                                                                                                                                int var319 = Statics.field861;
                                                                                                                                int var320 = (Statics.field844.field1264 >> 7) + Statics.field353;
                                                                                                                                int var321 = (Statics.field844.field1236 >> 7) + Statics.field2461;
                                                                                                                                client.method2617().method4978(var319, var320, var321, true);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6601) {
                                                                                                                                int var323 = field1350[--Statics.field510];
                                                                                                                                String var324 = "";
                                                                                                                                class33 var325 = client.method2617().method4864(var323);
                                                                                                                                if (var325 != null) {
                                                                                                                                    var324 = var325.method260();
                                                                                                                                }
                                                                                                                                field1348[++Statics.field1352 - 1] = var324;
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6602) {
                                                                                                                                int var326 = field1350[--Statics.field510];
                                                                                                                                client.method2617().method4849(var326);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6603) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4861();
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6604) {
                                                                                                                                int var327 = field1350[--Statics.field510];
                                                                                                                                client.method2617().method4858(var327);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6605) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4886() ? 1 : 0;
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6606) {
                                                                                                                                class216 var328 = new class216(field1350[--Statics.field510]);
                                                                                                                                client.method2617().method4865(var328.field2622, var328.field2620);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6607) {
                                                                                                                                class216 var329 = new class216(field1350[--Statics.field510]);
                                                                                                                                client.method2617().method4866(var329.field2622, var329.field2620);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6608) {
                                                                                                                                class216 var330 = new class216(field1350[--Statics.field510]);
                                                                                                                                client.method2617().method4867(var330.field2621, var330.field2622, var330.field2620);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6609) {
                                                                                                                                class216 var331 = new class216(field1350[--Statics.field510]);
                                                                                                                                client.method2617().method4942(var331.field2621, var331.field2622, var331.field2620);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6610) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4857();
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4908();
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6611) {
                                                                                                                                int var332 = field1350[--Statics.field510];
                                                                                                                                class33 var333 = client.method2617().method4864(var332);
                                                                                                                                if (var333 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var333.method269().method3593();
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6612) {
                                                                                                                                int var334 = field1350[--Statics.field510];
                                                                                                                                class33 var335 = client.method2617().method4864(var334);
                                                                                                                                if (var335 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = (var335.method261() - var335.method294() + 1) * 64;
                                                                                                                                    field1350[++Statics.field510 - 1] = (var335.method308() - var335.method264() + 1) * 64;
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6613) {
                                                                                                                                int var336 = field1350[--Statics.field510];
                                                                                                                                class33 var337 = client.method2617().method4864(var336);
                                                                                                                                if (var337 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var337.method294() * 64;
                                                                                                                                    field1350[++Statics.field510 - 1] = var337.method264() * 64;
                                                                                                                                    field1350[++Statics.field510 - 1] = var337.method261() * 64 + 64 - 1;
                                                                                                                                    field1350[++Statics.field510 - 1] = var337.method308() * 64 + 64 - 1;
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6614) {
                                                                                                                                int var338 = field1350[--Statics.field510];
                                                                                                                                class33 var339 = client.method2617().method4864(var338);
                                                                                                                                if (var339 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var339.method262();
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6615) {
                                                                                                                                class216 var340 = client.method2617().method4958();
                                                                                                                                if (var340 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var340.field2622;
                                                                                                                                    field1350[++Statics.field510 - 1] = var340.field2620;
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6616) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4842();
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6617) {
                                                                                                                                class216 var341 = new class216(field1350[--Statics.field510]);
                                                                                                                                class33 var342 = client.method2617().method4851();
                                                                                                                                if (var342 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    var322 = 1;
                                                                                                                                } else {
                                                                                                                                    int[] var343 = var342.method302(var341.field2621, var341.field2622, var341.field2620);
                                                                                                                                    if (var343 == null) {
                                                                                                                                        field1350[++Statics.field510 - 1] = -1;
                                                                                                                                        field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1350[++Statics.field510 - 1] = var343[0];
                                                                                                                                        field1350[++Statics.field510 - 1] = var343[1];
                                                                                                                                    }
                                                                                                                                    var322 = 1;
                                                                                                                                }
                                                                                                                            } else if (var394 == 6618) {
                                                                                                                                class216 var344 = new class216(field1350[--Statics.field510]);
                                                                                                                                class33 var345 = client.method2617().method4851();
                                                                                                                                if (var345 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    var322 = 1;
                                                                                                                                } else {
                                                                                                                                    class216 var346 = var345.method255(var344.field2622, var344.field2620);
                                                                                                                                    if (var346 == null) {
                                                                                                                                        field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1350[++Statics.field510 - 1] = var346.method3593();
                                                                                                                                    }
                                                                                                                                    var322 = 1;
                                                                                                                                }
                                                                                                                            } else if (var394 == 6619) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var347 = field1350[Statics.field510];
                                                                                                                                class216 var348 = new class216(field1350[Statics.field510 + 1]);
                                                                                                                                class33 var349 = client.method2617().method4864(var347);
                                                                                                                                int var350 = Statics.field844.field896;
                                                                                                                                int var351 = (Statics.field844.field1264 >> 7) + Statics.field353;
                                                                                                                                int var352 = (Statics.field844.field1236 >> 7) + Statics.field2461;
                                                                                                                                class216 var353 = new class216(var350, var351, var352);
                                                                                                                                client.method2617().method4863(var349, var353, var348, false);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6620) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var354 = field1350[Statics.field510];
                                                                                                                                class216 var355 = new class216(field1350[Statics.field510 + 1]);
                                                                                                                                class33 var356 = client.method2617().method4864(var354);
                                                                                                                                int var357 = Statics.field844.field896;
                                                                                                                                int var358 = (Statics.field844.field1264 >> 7) + Statics.field353;
                                                                                                                                int var359 = (Statics.field844.field1236 >> 7) + Statics.field2461;
                                                                                                                                class216 var360 = new class216(var357, var358, var359);
                                                                                                                                client.method2617().method4863(var356, var360, var355, true);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6621) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var361 = field1350[Statics.field510];
                                                                                                                                class216 var362 = new class216(field1350[Statics.field510 + 1]);
                                                                                                                                class33 var363 = client.method2617().method4864(var361);
                                                                                                                                if (var363 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = 0;
                                                                                                                                    var322 = 1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var363.method252(var362.field2621, var362.field2622, var362.field2620) ? 1 : 0;
                                                                                                                                    var322 = 1;
                                                                                                                                }
                                                                                                                            } else if (var394 == 6622) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4944();
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4873();
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6623) {
                                                                                                                                class216 var364 = new class216(field1350[--Statics.field510]);
                                                                                                                                class33 var365 = client.method2617().method4892(var364.field2621, var364.field2622, var364.field2620);
                                                                                                                                if (var365 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var365.method257();
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6624) {
                                                                                                                                client.method2617().method4874(field1350[--Statics.field510]);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6625) {
                                                                                                                                client.method2617().method4875();
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6626) {
                                                                                                                                client.method2617().method4910(field1350[--Statics.field510]);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6627) {
                                                                                                                                client.method2617().method4877();
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6628) {
                                                                                                                                boolean var366 = field1350[--Statics.field510] == 1;
                                                                                                                                client.method2617().method4878(var366);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6629) {
                                                                                                                                int var367 = field1350[--Statics.field510];
                                                                                                                                client.method2617().method4879(var367);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6630) {
                                                                                                                                int var368 = field1350[--Statics.field510];
                                                                                                                                client.method2617().method4839(var368);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6631) {
                                                                                                                                client.method2617().method4881();
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6632) {
                                                                                                                                boolean var369 = field1350[--Statics.field510] == 1;
                                                                                                                                client.method2617().method4882(var369);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6633) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var370 = field1350[Statics.field510];
                                                                                                                                boolean var371 = field1350[Statics.field510 + 1] == 1;
                                                                                                                                client.method2617().method4883(var370, var371);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6634) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var372 = field1350[Statics.field510];
                                                                                                                                boolean var373 = field1350[Statics.field510 + 1] == 1;
                                                                                                                                client.method2617().method4884(var372, var373);
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6635) {
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4885() ? 1 : 0;
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6636) {
                                                                                                                                int var374 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4870(var374) ? 1 : 0;
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6637) {
                                                                                                                                int var375 = field1350[--Statics.field510];
                                                                                                                                field1350[++Statics.field510 - 1] = client.method2617().method4887(var375) ? 1 : 0;
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6638) {
                                                                                                                                Statics.field510 -= 2;
                                                                                                                                int var376 = field1350[Statics.field510];
                                                                                                                                class216 var377 = new class216(field1350[Statics.field510 + 1]);
                                                                                                                                class216 var378 = client.method2617().method4890(var376, var377);
                                                                                                                                if (var378 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var378.method3593();
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6639) {
                                                                                                                                class40 var379 = client.method2617().method4946();
                                                                                                                                if (var379 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var379.field549;
                                                                                                                                    field1350[++Statics.field510 - 1] = var379.field541.method3593();
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6640) {
                                                                                                                                class40 var380 = client.method2617().method4893();
                                                                                                                                if (var380 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var380.field549;
                                                                                                                                    field1350[++Statics.field510 - 1] = var380.field541.method3593();
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6693) {
                                                                                                                                int var381 = field1350[--Statics.field510];
                                                                                                                                class246 var382 = Statics.field3301[var381];
                                                                                                                                if (var382.field3299 == null) {
                                                                                                                                    field1348[++Statics.field1352 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1348[++Statics.field1352 - 1] = var382.field3299;
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6694) {
                                                                                                                                int var383 = field1350[--Statics.field510];
                                                                                                                                class246 var384 = Statics.field3301[var383];
                                                                                                                                field1350[++Statics.field510 - 1] = var384.field3308;
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6695) {
                                                                                                                                int var385 = field1350[--Statics.field510];
                                                                                                                                class246 var386 = Statics.field3301[var385];
                                                                                                                                if (var386 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var386.field3313;
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6696) {
                                                                                                                                int var387 = field1350[--Statics.field510];
                                                                                                                                class246 var388 = Statics.field3301[var387];
                                                                                                                                if (var388 == null) {
                                                                                                                                    field1350[++Statics.field510 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1350[++Statics.field510 - 1] = var388.field3292;
                                                                                                                                }
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6697) {
                                                                                                                                field1350[++Statics.field510 - 1] = Statics.field1357.field632;
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6698) {
                                                                                                                                field1350[++Statics.field510 - 1] = Statics.field1357.field627.method3593();
                                                                                                                                var322 = 1;
                                                                                                                            } else if (var394 == 6699) {
                                                                                                                                field1350[++Statics.field510 - 1] = Statics.field1357.field626.method3593();
                                                                                                                                var322 = 1;
                                                                                                                            } else {
                                                                                                                                var322 = 2;
                                                                                                                            }
                                                                                                                            var58 = var322;
                                                                                                                        } else {
                                                                                                                            var58 = 2;
                                                                                                                        }
                                                                                                                        switch(var58) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var394 == 0) {
                                                                                                                        field1350[++Statics.field510 - 1] = var12[var10];
                                                                                                                    } else if (var394 == 1) {
                                                                                                                        int var20 = var12[var10];
                                                                                                                        field1350[++Statics.field510 - 1] = class215.field2616[var20];
                                                                                                                    } else if (var394 == 2) {
                                                                                                                        int var21 = var12[var10];
                                                                                                                        class215.field2616[var21] = field1350[--Statics.field510];
                                                                                                                        client.method171(var21);
                                                                                                                    } else if (var394 == 3) {
                                                                                                                        field1348[++Statics.field1352 - 1] = var4.field1550[var10];
                                                                                                                    } else if (var394 == 6) {
                                                                                                                        var10 += var12[var10];
                                                                                                                    } else if (var394 == 7) {
                                                                                                                        Statics.field510 -= 2;
                                                                                                                        if (field1350[Statics.field510] != field1350[Statics.field510 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var394 == 8) {
                                                                                                                        Statics.field510 -= 2;
                                                                                                                        if (field1350[Statics.field510] == field1350[Statics.field510 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var394 == 9) {
                                                                                                                        Statics.field510 -= 2;
                                                                                                                        if (field1350[Statics.field510] < field1350[Statics.field510 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var394 == 10) {
                                                                                                                        Statics.field510 -= 2;
                                                                                                                        if (field1350[Statics.field510] > field1350[Statics.field510 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var394 == 21) {
                                                                                                                        if (field1353 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var22 = field1354[--field1353];
                                                                                                                        var4 = var22.field788;
                                                                                                                        var11 = var4.field1543;
                                                                                                                        var12 = var4.field1544;
                                                                                                                        var10 = var22.field785;
                                                                                                                        Statics.field1346 = var22.field786;
                                                                                                                        Statics.field1351 = var22.field787;
                                                                                                                    } else if (var394 == 25) {
                                                                                                                        int var23 = var12[var10];
                                                                                                                        field1350[++Statics.field510 - 1] = class215.method2867(var23);
                                                                                                                    } else if (var394 == 27) {
                                                                                                                        int var24 = var12[var10];
                                                                                                                        int var25 = field1350[--Statics.field510];
                                                                                                                        class254 var26 = class254.method2346(var24);
                                                                                                                        int var27 = var26.field3389;
                                                                                                                        int var28 = var26.field3392;
                                                                                                                        int var29 = var26.field3391;
                                                                                                                        int var30 = class215.field2615[var29 - var28];
                                                                                                                        if (var25 < 0 || var25 > var30) {
                                                                                                                            var25 = 0;
                                                                                                                        }
                                                                                                                        int var31 = var30 << var28;
                                                                                                                        class215.field2616[var27] = class215.field2616[var27] & ~var31 | var25 << var28 & var31;
                                                                                                                    } else if (var394 == 31) {
                                                                                                                        Statics.field510 -= 2;
                                                                                                                        if (field1350[Statics.field510] <= field1350[Statics.field510 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var394 == 32) {
                                                                                                                        Statics.field510 -= 2;
                                                                                                                        if (field1350[Statics.field510] >= field1350[Statics.field510 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var394 == 33) {
                                                                                                                        field1350[++Statics.field510 - 1] = Statics.field1346[var12[var10]];
                                                                                                                    } else if (var394 == 34) {
                                                                                                                        Statics.field1346[var12[var10]] = field1350[--Statics.field510];
                                                                                                                    } else if (var394 == 35) {
                                                                                                                        field1348[++Statics.field1352 - 1] = Statics.field1351[var12[var10]];
                                                                                                                    } else if (var394 == 36) {
                                                                                                                        Statics.field1351[var12[var10]] = field1348[--Statics.field1352];
                                                                                                                    } else if (var394 == 37) {
                                                                                                                        int var32 = var12[var10];
                                                                                                                        Statics.field1352 -= var32;
                                                                                                                        String var33 = class274.method204(field1348, Statics.field1352, var32);
                                                                                                                        field1348[++Statics.field1352 - 1] = var33;
                                                                                                                    } else if (var394 == 38) {
                                                                                                                        Statics.field510--;
                                                                                                                    } else if (var394 == 39) {
                                                                                                                        Statics.field1352--;
                                                                                                                    } else if (var394 == 40) {
                                                                                                                        int var34 = var12[var10];
                                                                                                                        class100 var35 = (class100) class100.field1545.method3239((long) var34);
                                                                                                                        class100 var36;
                                                                                                                        if (var35 == null) {
                                                                                                                            byte[] var37 = Statics.field607.method3754(var34, 0);
                                                                                                                            if (var37 == null) {
                                                                                                                                var36 = null;
                                                                                                                            } else {
                                                                                                                                class100 var38 = class100.method165(var37);
                                                                                                                                class100.field1545.method3241(var38, (long) var34);
                                                                                                                                var36 = var38;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var36 = var35;
                                                                                                                        }
                                                                                                                        class100 var39 = var36;
                                                                                                                        int[] var40 = new int[var36.field1546];
                                                                                                                        String[] var41 = new String[var36.field1547];
                                                                                                                        for (int var42 = 0; var42 < var39.field1548; var42++) {
                                                                                                                            var40[var42] = field1350[Statics.field510 - var39.field1548 + var42];
                                                                                                                        }
                                                                                                                        for (int var43 = 0; var43 < var39.field1549; var43++) {
                                                                                                                            var41[var43] = field1348[Statics.field1352 - var39.field1549 + var43];
                                                                                                                        }
                                                                                                                        Statics.field510 -= var39.field1548;
                                                                                                                        Statics.field1352 -= var39.field1549;
                                                                                                                        class63 var44 = new class63();
                                                                                                                        var44.field788 = var4;
                                                                                                                        var44.field785 = var10;
                                                                                                                        var44.field786 = Statics.field1346;
                                                                                                                        var44.field787 = Statics.field1351;
                                                                                                                        field1354[++field1353 - 1] = var44;
                                                                                                                        var4 = var39;
                                                                                                                        var11 = var39.field1543;
                                                                                                                        var12 = var39.field1544;
                                                                                                                        var10 = -1;
                                                                                                                        Statics.field1346 = var40;
                                                                                                                        Statics.field1351 = var41;
                                                                                                                    } else if (var394 == 42) {
                                                                                                                        field1350[++Statics.field510 - 1] = Statics.field3189.method1630(var12[var10]);
                                                                                                                    } else if (var394 == 43) {
                                                                                                                        Statics.field3189.method1622(var12[var10], field1350[--Statics.field510]);
                                                                                                                    } else if (var394 == 44) {
                                                                                                                        int var45 = var12[var10] >> 16;
                                                                                                                        int var46 = var12[var10] & 0xFFFF;
                                                                                                                        int var47 = field1350[--Statics.field510];
                                                                                                                        if (var47 >= 0 && var47 <= 5000) {
                                                                                                                            field1344[var45] = var47;
                                                                                                                            byte var48 = -1;
                                                                                                                            if (var46 == 105) {
                                                                                                                                var48 = 0;
                                                                                                                            }
                                                                                                                            int var49 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var49 >= var47) {
                                                                                                                                    continue label1778;
                                                                                                                                }
                                                                                                                                field1349[var45][var49] = var48;
                                                                                                                                var49++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var394 == 45) {
                                                                                                                        int var50 = var12[var10];
                                                                                                                        int var51 = field1350[--Statics.field510];
                                                                                                                        if (var51 < 0 || var51 >= field1344[var50]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1350[++Statics.field510 - 1] = field1349[var50][var51];
                                                                                                                    } else if (var394 == 46) {
                                                                                                                        int var52 = var12[var10];
                                                                                                                        Statics.field510 -= 2;
                                                                                                                        int var53 = field1350[Statics.field510];
                                                                                                                        if (var53 < 0 || var53 >= field1344[var52]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1349[var52][var53] = field1350[Statics.field510 + 1];
                                                                                                                    } else if (var394 == 47) {
                                                                                                                        String var54 = Statics.field3189.method1626(var12[var10]);
                                                                                                                        if (var54 == null) {
                                                                                                                            var54 = "null";
                                                                                                                        }
                                                                                                                        field1348[++Statics.field1352 - 1] = var54;
                                                                                                                    } else if (var394 == 48) {
                                                                                                                        Statics.field3189.method1625(var12[var10], field1348[--Statics.field1352]);
                                                                                                                    } else if (var394 == 60) {
                                                                                                                        class190 var55 = var4.field1542[var12[var10]];
                                                                                                                        class202 var56 = (class202) var55.method3216((long) field1350[--Statics.field510]);
                                                                                                                        if (var56 != null) {
                                                                                                                            var10 += var56.field2503;
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
        } catch (Exception var393) {
            StringBuilder var391 = new StringBuilder(30);
            var391.append("").append(var4.field2490).append(" ");
            for (int var392 = field1353 - 1; var392 >= 0; var392--) {
                var391.append("").append(field1354[var392].field788.field2490).append(" ");
            }
            var391.append("").append(var13);
            class154.method2730(var391.toString(), var393);
        }
    }

    @ObfuscatedName("it.x(ILcm;ZI)I")
    public static int method3914(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field510 -= 3;
            int var3 = field1350[Statics.field510];
            int var4 = field1350[Statics.field510 + 1];
            int var5 = field1350[Statics.field510 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class220 var6 = class220.method1162(var3);
            if (var6.field2655 == null) {
                var6.field2655 = new class220[var5 + 1];
            }
            if (var6.field2655.length <= var5) {
                class220[] var7 = new class220[var5 + 1];
                for (int var8 = 0; var8 < var6.field2655.length; var8++) {
                    var7[var8] = var6.field2655[var8];
                }
                var6.field2655 = var7;
            }
            if (var5 > 0 && var6.field2655[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class220 var9 = new class220();
            var9.field2651 = var4;
            var9.field2676 = var9.field2657 = var6.field2657;
            var9.field2684 = var5;
            var9.field2656 = true;
            var6.field2655[var5] = var9;
            if (arg2) {
                Statics.field842 = var9;
            } else {
                Statics.field3770 = var9;
            }
            client.method667(var6);
            return 1;
        } else if (arg0 == 101) {
            class220 var10 = arg2 ? Statics.field842 : Statics.field3770;
            class220 var11 = class220.method1162(var10.field2657);
            var11.field2655[var10.field2684] = null;
            client.method667(var11);
            return 1;
        } else if (arg0 == 102) {
            class220 var12 = class220.method1162(field1350[--Statics.field510]);
            var12.field2655 = null;
            client.method667(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field510 -= 2;
            int var13 = field1350[Statics.field510];
            int var14 = field1350[Statics.field510 + 1];
            class220 var15 = class220.method2344(var13, var14);
            if (var15 == null || var14 == -1) {
                field1350[++Statics.field510 - 1] = 0;
            } else {
                field1350[++Statics.field510 - 1] = 1;
                if (arg2) {
                    Statics.field842 = var15;
                } else {
                    Statics.field3770 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class220 var16 = class220.method1162(field1350[--Statics.field510]);
            if (var16 == null) {
                field1350[++Statics.field510 - 1] = 0;
            } else {
                field1350[++Statics.field510 - 1] = 1;
                if (arg2) {
                    Statics.field842 = var16;
                } else {
                    Statics.field3770 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.k(ILcm;ZI)I")
    public static int method74(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class220 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1350[--Statics.field510];
            var4 = class220.method1162(var3);
        } else {
            var4 = arg2 ? Statics.field842 : Statics.field3770;
        }
        if (arg0 == 1000) {
            Statics.field510 -= 4;
            var4.field2666 = field1350[Statics.field510];
            var4.field2667 = field1350[Statics.field510 + 1];
            var4.field2781 = field1350[Statics.field510 + 2];
            var4.field2746 = field1350[Statics.field510 + 3];
            client.method667(var4);
            Statics.field2286.method1054(var4);
            if (var3 != -1 && var4.field2651 == 0) {
                client.method557(Statics.field780[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field510 -= 4;
            var4.field2668 = field1350[Statics.field510];
            var4.field2669 = field1350[Statics.field510 + 1];
            var4.field2715 = field1350[Statics.field510 + 2];
            var4.field2665 = field1350[Statics.field510 + 3];
            client.method667(var4);
            Statics.field2286.method1054(var4);
            if (var3 != -1 && var4.field2651 == 0) {
                client.method557(Statics.field780[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1350[--Statics.field510] == 1;
            if (var4.field2664 != var5) {
                var4.field2664 = var5;
                client.method667(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2790 = field1350[--Statics.field510] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2791 = field1350[--Statics.field510] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iw.f(ILcm;ZI)I")
    public static int method3850(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class220 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1350[--Statics.field510];
            var4 = class220.method1162(var3);
        } else {
            var4 = arg2 ? Statics.field842 : Statics.field3770;
        }
        if (arg0 == 1100) {
            Statics.field510 -= 2;
            var4.field2678 = field1350[Statics.field510];
            if (var4.field2678 > var4.field2680 - var4.field2672) {
                var4.field2678 = var4.field2680 - var4.field2672;
            }
            if (var4.field2678 < 0) {
                var4.field2678 = 0;
            }
            var4.field2717 = field1350[Statics.field510 + 1];
            if (var4.field2717 > var4.field2758 - var4.field2673) {
                var4.field2717 = var4.field2758 - var4.field2673;
            }
            if (var4.field2717 < 0) {
                var4.field2717 = 0;
            }
            client.method667(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2682 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2686 = field1350[--Statics.field510] == 1;
            client.method667(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2688 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2690 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2691 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2763 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2719 = field1350[--Statics.field510] == 1;
            client.method667(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2700 = 1;
            var4.field2777 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field510 -= 6;
            var4.field2645 = field1350[Statics.field510];
            var4.field2707 = field1350[Statics.field510 + 1];
            var4.field2779 = field1350[Statics.field510 + 2];
            var4.field2709 = field1350[Statics.field510 + 3];
            var4.field2742 = field1350[Statics.field510 + 4];
            var4.field2659 = field1350[Statics.field510 + 5];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1350[--Statics.field510];
            if (var4.field2724 != var5) {
                var4.field2724 = var5;
                var4.field2671 = 0;
                var4.field2780 = 0;
                client.method667(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2714 = field1350[--Statics.field510] == 1;
            client.method667(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1348[--Statics.field1352];
            if (!var6.equals(var4.field2783)) {
                var4.field2783 = var6;
                client.method667(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2716 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field510 -= 3;
            var4.field2720 = field1350[Statics.field510];
            var4.field2679 = field1350[Statics.field510 + 1];
            var4.field2689 = field1350[Statics.field510 + 2];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2647 = field1350[--Statics.field510] == 1;
            client.method667(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2696 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2721 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2692 = field1350[--Statics.field510] == 1;
            client.method667(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2699 = field1350[--Statics.field510] == 1;
            client.method667(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field510 -= 2;
            var4.field2680 = field1350[Statics.field510];
            var4.field2758 = field1350[Statics.field510 + 1];
            client.method667(var4);
            if (var3 != -1 && var4.field2651 == 0) {
                client.method557(Statics.field780[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method2626(var4.field2657, var4.field2684);
            client.field1011 = var4;
            client.method667(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2693 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2683 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2729 = field1350[--Statics.field510];
            client.method667(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1350[--Statics.field510];
            class287 var8 = (class287) class172.method1461(class287.method2628(), var7);
            if (var8 != null) {
                var4.field2687 = var8;
                client.method667(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1350[--Statics.field510] == 1;
            var4.field2744 = var9;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.i(ILcm;ZI)I")
    public static int method50(int arg0, class100 arg1, boolean arg2) {
        class220 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class220.method1162(field1350[--Statics.field510]);
        } else {
            var3 = arg2 ? Statics.field842 : Statics.field3770;
        }
        client.method667(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field510 -= 2;
            int var4 = field1350[Statics.field510];
            int var5 = field1350[Statics.field510 + 1];
            var3.field2710 = var4;
            var3.field2695 = var5;
            class260 var6 = class260.method3915(var4);
            var3.field2779 = var6.field3520;
            var3.field2709 = var6.field3557;
            var3.field2742 = var6.field3522;
            var3.field2645 = var6.field3514;
            var3.field2707 = var6.field3524;
            var3.field2659 = var6.field3507;
            if (arg0 == 1205) {
                var3.field2663 = 0;
            } else if (arg0 == 1212 | var6.field3531 == 1) {
                var3.field2663 = 1;
            } else {
                var3.field2663 = 2;
            }
            if (var3.field2694 > 0) {
                var3.field2659 = var3.field2659 * 32 / var3.field2694;
            } else if (var3.field2668 > 0) {
                var3.field2659 = var3.field2659 * 32 / var3.field2668;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2700 = 2;
            var3.field2777 = field1350[--Statics.field510];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2700 = 3;
            var3.field2777 = Statics.field844.field895.method3618();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.m(ILcm;ZI)I")
    public static int method1444(int arg0, class100 arg1, boolean arg2) {
        class220 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class220.method1162(field1350[--Statics.field510]);
        } else {
            var3 = arg2 ? Statics.field842 : Statics.field3770;
        }
        String var4 = field1348[--Statics.field1352];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1350[--Statics.field510];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1350[--Statics.field510];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1348[--Statics.field1352];
            } else {
                var7[var8] = Integer.valueOf(field1350[--Statics.field510]);
            }
        }
        int var9 = field1350[--Statics.field510];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2739 = var7;
        } else if (arg0 == 1401) {
            var3.field2712 = var7;
        } else if (arg0 == 1402) {
            var3.field2697 = var7;
        } else if (arg0 == 1403) {
            var3.field2743 = var7;
        } else if (arg0 == 1404) {
            var3.field2745 = var7;
        } else if (arg0 == 1405) {
            var3.field2741 = var7;
        } else if (arg0 == 1406) {
            var3.field2749 = var7;
        } else if (arg0 == 1407) {
            var3.field2750 = var7;
            var3.field2751 = var5;
        } else if (arg0 == 1408) {
            var3.field2766 = var7;
        } else if (arg0 == 1409) {
            var3.field2757 = var7;
        } else if (arg0 == 1410) {
            var3.field2747 = var7;
        } else if (arg0 == 1411) {
            var3.field2740 = var7;
        } else if (arg0 == 1412) {
            var3.field2771 = var7;
        } else if (arg0 == 1414) {
            var3.field2681 = var7;
            var3.field2753 = var5;
        } else if (arg0 == 1415) {
            var3.field2754 = var7;
            var3.field2755 = var5;
        } else if (arg0 == 1416) {
            var3.field2748 = var7;
        } else if (arg0 == 1417) {
            var3.field2698 = var7;
        } else if (arg0 == 1418) {
            var3.field2662 = var7;
        } else if (arg0 == 1419) {
            var3.field2760 = var7;
        } else if (arg0 == 1420) {
            var3.field2759 = var7;
        } else if (arg0 == 1421) {
            var3.field2722 = var7;
        } else if (arg0 == 1422) {
            var3.field2648 = var7;
        } else if (arg0 == 1423) {
            var3.field2764 = var7;
        } else if (arg0 == 1424) {
            var3.field2765 = var7;
        } else if (arg0 == 1425) {
            var3.field2767 = var7;
        } else if (arg0 == 1426) {
            var3.field2768 = var7;
        } else if (arg0 == 1427) {
            var3.field2711 = var7;
        } else {
            return 2;
        }
        var3.field2737 = true;
        return 1;
    }

    @ObfuscatedName("ii.u(ILcm;ZI)I")
    public static int method3721(int arg0, class100 arg1, boolean arg2) {
        class220 var3 = arg2 ? Statics.field842 : Statics.field3770;
        if (arg0 == 1500) {
            field1350[++Statics.field510 - 1] = var3.field2670;
            return 1;
        } else if (arg0 == 1501) {
            field1350[++Statics.field510 - 1] = var3.field2728;
            return 1;
        } else if (arg0 == 1502) {
            field1350[++Statics.field510 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 1503) {
            field1350[++Statics.field510 - 1] = var3.field2673;
            return 1;
        } else if (arg0 == 1504) {
            field1350[++Statics.field510 - 1] = var3.field2664 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1350[++Statics.field510 - 1] = var3.field2676;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hq.h(ILcm;ZI)I")
    public static int method3562(int arg0, class100 arg1, boolean arg2) {
        class220 var3 = arg2 ? Statics.field842 : Statics.field3770;
        if (arg0 == 1700) {
            field1350[++Statics.field510 - 1] = var3.field2710;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2710 == -1) {
                field1350[++Statics.field510 - 1] = 0;
            } else {
                field1350[++Statics.field510 - 1] = var3.field2695;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1350[++Statics.field510 - 1] = var3.field2684;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eq.a(ILcm;ZB)I")
    public static int method2329(int arg0, class100 arg1, boolean arg2) {
        class220 var3 = arg2 ? Statics.field842 : Statics.field3770;
        if (arg0 == 1800) {
            int[] var4 = field1350;
            int var5 = ++Statics.field510 - 1;
            int var6 = client.method967(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1350[--Statics.field510];
            int var9 = var8 - 1;
            if (var3.field2731 == null || var9 >= var3.field2731.length || var3.field2731[var9] == null) {
                field1348[++Statics.field1352 - 1] = "";
            } else {
                field1348[++Statics.field1352 - 1] = var3.field2731[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2730 == null) {
                field1348[++Statics.field1352 - 1] = "";
            } else {
                field1348[++Statics.field1352 - 1] = var3.field2730;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.p(ILcm;ZI)I")
    public static int method703(int arg0, class100 arg1, boolean arg2) {
        class220 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class220.method1162(field1350[--Statics.field510]);
        } else {
            var3 = arg2 ? Statics.field842 : Statics.field3770;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1347 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2711 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field851 = var3;
            var4.field854 = var3.field2711;
            var4.field858 = field1347 + 1;
            client.field1127.method3299(var4);
            return 1;
        }
    }

    @ObfuscatedName("hh.q(ILcm;ZI)I")
    public static int method3586(int arg0, class100 arg1, boolean arg2) {
        class220 var3 = class220.method1162(field1350[--Statics.field510]);
        if (arg0 == 2500) {
            field1350[++Statics.field510 - 1] = var3.field2670;
            return 1;
        } else if (arg0 == 2501) {
            field1350[++Statics.field510 - 1] = var3.field2728;
            return 1;
        } else if (arg0 == 2502) {
            field1350[++Statics.field510 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 2503) {
            field1350[++Statics.field510 - 1] = var3.field2673;
            return 1;
        } else if (arg0 == 2504) {
            field1350[++Statics.field510 - 1] = var3.field2664 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1350[++Statics.field510 - 1] = var3.field2676;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("at.l(ILcm;ZI)I")
    public static int method529(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class220 var3 = class220.method1162(field1350[--Statics.field510]);
            field1350[++Statics.field510 - 1] = var3.field2710;
            return 1;
        } else if (arg0 == 2701) {
            class220 var4 = class220.method1162(field1350[--Statics.field510]);
            if (var4.field2710 == -1) {
                field1350[++Statics.field510 - 1] = 0;
            } else {
                field1350[++Statics.field510 - 1] = var4.field2695;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1350[--Statics.field510];
            class69 var6 = (class69) client.field1089.method3252((long) var5);
            if (var6 == null) {
                field1350[++Statics.field510 - 1] = 0;
            } else {
                field1350[++Statics.field510 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1350[++Statics.field510 - 1] = client.field1088;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.c(ILcm;ZI)I")
    public static int method473(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1348[--Statics.field1352];
            class99.method1676(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field510 -= 2;
            client.method140(Statics.field844, field1350[Statics.field510], field1350[Statics.field510 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.method476();
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1348[--Statics.field1352];
            int var5 = 0;
            if (class274.method3141(var4)) {
                var5 = class274.method246(var4);
            }
            client.field970.method3115(129);
            client.field970.method2872(var5);
            return 1;
        } else if (arg0 == 3105) {
            String var6 = field1348[--Statics.field1352];
            client.field970.method3115(232);
            client.field970.method3075(var6.length() + 1);
            client.field970.method2875(var6);
            return 1;
        } else if (arg0 == 3106) {
            String var7 = field1348[--Statics.field1352];
            client.field970.method3115(235);
            client.field970.method3075(var7.length() + 1);
            client.field970.method2875(var7);
            return 1;
        } else if (arg0 == 3107) {
            int var8 = field1350[--Statics.field510];
            String var9 = field1348[--Statics.field1352];
            client.method3722(var8, var9);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field510 -= 3;
            int var10 = field1350[Statics.field510];
            int var11 = field1350[Statics.field510 + 1];
            int var12 = field1350[Statics.field510 + 2];
            class220 var13 = class220.method1162(var12);
            client.method2812(var13, var10, var11);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field510 -= 2;
            int var14 = field1350[Statics.field510];
            int var15 = field1350[Statics.field510 + 1];
            class220 var16 = arg2 ? Statics.field842 : Statics.field3770;
            client.method2812(var16, var14, var15);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field684 = field1350[--Statics.field510] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1350[++Statics.field510 - 1] = Statics.field3187.field1318 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field3187.field1318 = field1350[--Statics.field510] == 1;
            class82.method1005();
            return 1;
        } else if (arg0 == 3113) {
            String var17 = field1348[--Statics.field1352];
            boolean var18 = field1350[--Statics.field510] == 1;
            class57.method627(var17, var18, "openjs", false);
            return 1;
        } else if (arg0 == 3115) {
            int var19 = field1350[--Statics.field510];
            client.field970.method3115(10);
            client.field970.method2903(var19);
            return 1;
        } else if (arg0 == 3116) {
            int var20 = field1350[--Statics.field510];
            Statics.field1352 -= 2;
            String var21 = field1348[Statics.field1352];
            String var22 = field1348[Statics.field1352 + 1];
            if (var21.length() > 500) {
                return 1;
            } else if (var22.length() > 500) {
                return 1;
            } else {
                client.field970.method3115(251);
                client.field970.method2903(1 + class177.method117(var21) + class177.method117(var22));
                client.field970.method2875(var22);
                client.field970.method2933(var20);
                client.field970.method2875(var21);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field1076 = field1350[--Statics.field510] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.n(ILcm;ZB)I")
    public static int method324(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field510 -= 3;
            client.method995(field1350[Statics.field510], field1350[Statics.field510 + 1], field1350[Statics.field510 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.method3159(field1350[--Statics.field510]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field510 -= 2;
            client.method3556(field1350[Statics.field510], field1350[Statics.field510 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.z(ILcm;ZI)I")
    public static int method3590(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field1194 == 0) {
                field1350[++Statics.field510 - 1] = -2;
            } else if (client.field1194 == 1) {
                field1350[++Statics.field510 - 1] = -1;
            } else {
                field1350[++Statics.field510 - 1] = client.field1013;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1350[--Statics.field510];
            if (client.field1194 == 2 && var3 < client.field1013) {
                field1348[++Statics.field1352 - 1] = client.field1132[var3].field818;
                field1348[++Statics.field1352 - 1] = client.field1132[var3].field814;
            } else {
                field1348[++Statics.field1352 - 1] = "";
                field1348[++Statics.field1352 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field1350[--Statics.field510];
            if (client.field1194 == 2 && var4 < client.field1013) {
                field1350[++Statics.field510 - 1] = client.field1132[var4].field815;
            } else {
                field1350[++Statics.field510 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field1350[--Statics.field510];
            if (client.field1194 == 2 && var5 < client.field1013) {
                field1350[++Statics.field510 - 1] = client.field1132[var5].field816;
            } else {
                field1350[++Statics.field510 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field1348[--Statics.field1352];
            int var7 = field1350[--Statics.field510];
            client.field970.method3115(89);
            client.field970.method3075(class177.method117(var6) + 1);
            client.field970.method2933(var7);
            client.field970.method2875(var6);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field1348[--Statics.field1352];
            Statics.method10(var8);
            return 1;
        } else if (arg0 == 3606) {
            String var9 = field1348[--Statics.field1352];
            if (var9 != null) {
                String var10 = class271.method3563(var9, Statics.field790);
                if (var10 != null) {
                    for (int var11 = 0; var11 < client.field1013; var11++) {
                        class66 var12 = client.field1132[var11];
                        String var13 = var12.field818;
                        String var14 = class271.method3563(var13, Statics.field790);
                        if (class281.method153(var9, var10, var13, var14)) {
                            client.field1013--;
                            for (int var15 = var11; var15 < client.field1013; var15++) {
                                client.field1132[var15] = client.field1132[var15 + 1];
                            }
                            client.field1035 = client.field1113;
                            client.field970.method3115(36);
                            client.field970.method3075(class177.method117(var9));
                            client.field970.method2875(var9);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3607) {
            String var16 = field1348[--Statics.field1352];
            if (var16 != null) {
                if ((client.field953 < 100 || client.field1050 == 1) && client.field953 < 400) {
                    String var17 = class271.method3563(var16, Statics.field790);
                    if (var17 != null) {
                        int var18 = 0;
                        while (true) {
                            if (var18 >= client.field953) {
                                for (int var22 = 0; var22 < client.field1013; var22++) {
                                    class66 var23 = client.field1132[var22];
                                    String var24 = class271.method3563(var23.field818, Statics.field790);
                                    if (var24 != null && var24.equals(var17)) {
                                        class99.method1676(31, "", class229.field3029 + var16 + class229.field2930);
                                        return 1;
                                    }
                                    if (var23.field814 != null) {
                                        String var25 = class271.method3563(var23.field814, Statics.field790);
                                        if (var25 != null && var25.equals(var17)) {
                                            class99.method1676(31, "", class229.field3029 + var16 + class229.field2930);
                                            return 1;
                                        }
                                    }
                                }
                                if (class271.method3563(Statics.field844.field907, Statics.field790).equals(var17)) {
                                    class99.method1676(31, "", class229.field2981);
                                } else {
                                    client.field970.method3115(208);
                                    client.field970.method3075(class177.method117(var16));
                                    client.field970.method2875(var16);
                                }
                                break;
                            }
                            class71 var19 = client.field1198[var18];
                            String var20 = class271.method3563(var19.field867, Statics.field790);
                            if (var20 != null && var20.equals(var17)) {
                                class99.method1676(31, "", var16 + class229.field3024);
                                break;
                            }
                            if (var19.field868 != null) {
                                String var21 = class271.method3563(var19.field868, Statics.field790);
                                if (var21 != null && var21.equals(var17)) {
                                    class99.method1676(31, "", var16 + class229.field3024);
                                    break;
                                }
                            }
                            var18++;
                        }
                    }
                } else {
                    class99.method1676(31, "", class229.field3023);
                }
            }
            return 1;
        } else if (arg0 == 3608) {
            String var26 = field1348[--Statics.field1352];
            if (var26 != null) {
                String var27 = class271.method3563(var26, Statics.field790);
                if (var27 != null) {
                    for (int var28 = 0; var28 < client.field953; var28++) {
                        class71 var29 = client.field1198[var28];
                        String var30 = var29.field867;
                        String var31 = class271.method3563(var30, Statics.field790);
                        if (class281.method153(var26, var27, var30, var31)) {
                            client.field953--;
                            for (int var32 = var28; var32 < client.field953; var32++) {
                                client.field1198[var32] = client.field1198[var32 + 1];
                            }
                            client.field1035 = client.field1113;
                            client.field970.method3115(58);
                            client.field970.method3075(class177.method117(var26));
                            client.field970.method2875(var26);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3609) {
            String var33 = field1348[--Statics.field1352];
            class234[] var34 = new class234[] { class234.field3171, class234.field3173, class234.field3174, class234.field3175, class234.field3177, class234.field3181 };
            class234[] var35 = var34;
            for (int var36 = 0; var36 < var35.length; var36++) {
                class234 var37 = var35[var36];
                if (var37.field3176 != -1 && var33.startsWith(class89.method2878(var37.field3176))) {
                    var33 = var33.substring(6 + Integer.toString(var37.field3176).length());
                    break;
                }
            }
            field1350[++Statics.field510 - 1] = client.method208(var33, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field1153 == null) {
                field1348[++Statics.field1352 - 1] = "";
            } else {
                field1348[++Statics.field1352 - 1] = class272.method3394(client.field1153);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field1153 == null) {
                field1350[++Statics.field510 - 1] = 0;
            } else {
                field1350[++Statics.field510 - 1] = Statics.field379;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var38 = field1350[--Statics.field510];
            if (client.field1153 == null || var38 >= Statics.field379) {
                field1348[++Statics.field1352 - 1] = "";
            } else {
                field1348[++Statics.field1352 - 1] = Statics.field354[var38].field924;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var39 = field1350[--Statics.field510];
            if (client.field1153 == null || var39 >= Statics.field379) {
                field1350[++Statics.field510 - 1] = 0;
            } else {
                field1350[++Statics.field510 - 1] = Statics.field354[var39].field923;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var40 = field1350[--Statics.field510];
            if (client.field1153 == null || var40 >= Statics.field379) {
                field1350[++Statics.field510 - 1] = 0;
            } else {
                field1350[++Statics.field510 - 1] = Statics.field354[var40].field925;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1350[++Statics.field510 - 1] = Statics.field2204;
            return 1;
        } else if (arg0 == 3617) {
            String var41 = field1348[--Statics.field1352];
            if (Statics.field354 != null) {
                client.field970.method3115(152);
                client.field970.method3075(class177.method117(var41));
                client.field970.method2875(var41);
            }
            return 1;
        } else if (arg0 == 3618) {
            field1350[++Statics.field510 - 1] = Statics.field612;
            return 1;
        } else if (arg0 == 3619) {
            String var42 = field1348[--Statics.field1352];
            client.method467(var42);
            return 1;
        } else if (arg0 == 3620) {
            client.field970.method3115(73);
            client.field970.method3075(0);
            return 1;
        } else if (arg0 == 3621) {
            if (client.field1194 == 0) {
                field1350[++Statics.field510 - 1] = -1;
            } else {
                field1350[++Statics.field510 - 1] = client.field953;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var43 = field1350[--Statics.field510];
            if (client.field1194 == 0 || var43 >= client.field953) {
                field1348[++Statics.field1352 - 1] = "";
                field1348[++Statics.field1352 - 1] = "";
            } else {
                field1348[++Statics.field1352 - 1] = client.field1198[var43].field867;
                field1348[++Statics.field1352 - 1] = client.field1198[var43].field868;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var44 = field1348[--Statics.field1352];
            if (var44.startsWith(class89.method2878(0)) || var44.startsWith(class89.method2878(1))) {
                var44 = var44.substring(7);
            }
            field1350[++Statics.field510 - 1] = client.method1542(var44) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var45 = field1350[--Statics.field510];
            if (Statics.field354 == null || var45 >= Statics.field379 || !Statics.field354[var45].field924.equalsIgnoreCase(Statics.field844.field907)) {
                field1350[++Statics.field510 - 1] = 0;
            } else {
                field1350[++Statics.field510 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field1197 == null) {
                field1348[++Statics.field1352 - 1] = "";
            } else {
                String[] var46 = field1348;
                int var47 = ++Statics.field1352 - 1;
                String var48 = client.field1197;
                long var49 = 0L;
                int var51 = var48.length();
                for (int var52 = 0; var52 < var51; var52++) {
                    var49 *= 37L;
                    char var53 = var48.charAt(var52);
                    if (var53 >= 'A' && var53 <= 'Z') {
                        var49 += (long) (var53 + 1 - 65);
                    } else if (var53 >= 'a' && var53 <= 'z') {
                        var49 += (long) (var53 + 1 - 97);
                    } else if (var53 >= '0' && var53 <= '9') {
                        var49 += (long) (var53 + 27 - 48);
                    }
                    if (var49 >= 177917621779460413L) {
                        break;
                    }
                }
                while (var49 % 37L == 0L && var49 != 0L) {
                    var49 /= 37L;
                }
                String var56 = class272.method3698(var49);
                if (var56 == null) {
                    var56 = "";
                }
                var46[var47] = var56;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cs.t(ILcm;ZI)I")
    public static int method1566(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1350[++Statics.field510 - 1] = class81.method104() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = Statics.method320();
            if (var3 == null) {
                field1350[++Statics.field510 - 1] = -1;
                field1350[++Statics.field510 - 1] = 0;
                field1348[++Statics.field1352 - 1] = "";
                field1350[++Statics.field510 - 1] = 0;
                field1350[++Statics.field510 - 1] = 0;
                field1348[++Statics.field1352 - 1] = "";
            } else {
                field1350[++Statics.field510 - 1] = var3.field1314;
                field1350[++Statics.field510 - 1] = var3.field1303;
                field1348[++Statics.field1352 - 1] = var3.field1317;
                field1350[++Statics.field510 - 1] = var3.field1315;
                field1350[++Statics.field510 - 1] = var3.field1310;
                field1348[++Statics.field1352 - 1] = var3.field1313;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4 = class81.method704();
            if (var4 == null) {
                field1350[++Statics.field510 - 1] = -1;
                field1350[++Statics.field510 - 1] = 0;
                field1348[++Statics.field1352 - 1] = "";
                field1350[++Statics.field510 - 1] = 0;
                field1350[++Statics.field510 - 1] = 0;
                field1348[++Statics.field1352 - 1] = "";
            } else {
                field1350[++Statics.field510 - 1] = var4.field1314;
                field1350[++Statics.field510 - 1] = var4.field1303;
                field1348[++Statics.field1352 - 1] = var4.field1317;
                field1350[++Statics.field510 - 1] = var4.field1315;
                field1350[++Statics.field510 - 1] = var4.field1310;
                field1348[++Statics.field1352 - 1] = var4.field1313;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1350[--Statics.field510];
            class81 var6 = null;
            for (int var7 = 0; var7 < class81.field1305; var7++) {
                if (Statics.field520[var7].field1314 == var5) {
                    var6 = Statics.field520[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1350[++Statics.field510 - 1] = -1;
                field1350[++Statics.field510 - 1] = 0;
                field1348[++Statics.field1352 - 1] = "";
                field1350[++Statics.field510 - 1] = 0;
                field1350[++Statics.field510 - 1] = 0;
                field1348[++Statics.field1352 - 1] = "";
            } else {
                field1350[++Statics.field510 - 1] = var6.field1314;
                field1350[++Statics.field510 - 1] = var6.field1303;
                field1348[++Statics.field1352 - 1] = var6.field1317;
                field1350[++Statics.field510 - 1] = var6.field1315;
                field1350[++Statics.field510 - 1] = var6.field1310;
                field1348[++Statics.field1352 - 1] = var6.field1313;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field510 -= 4;
            int var8 = field1350[Statics.field510];
            boolean var9 = field1350[Statics.field510 + 1] == 1;
            int var10 = field1350[Statics.field510 + 2];
            boolean var11 = field1350[Statics.field510 + 3] == 1;
            class81.method620(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1350[--Statics.field510];
            if (var12 >= 0 && var12 < class81.field1305) {
                class81 var13 = Statics.field520[var12];
                field1350[++Statics.field510 - 1] = var13.field1314;
                field1350[++Statics.field510 - 1] = var13.field1303;
                field1348[++Statics.field1352 - 1] = var13.field1317;
                field1350[++Statics.field510 - 1] = var13.field1315;
                field1350[++Statics.field510 - 1] = var13.field1310;
                field1348[++Statics.field1352 - 1] = var13.field1313;
            } else {
                field1350[++Statics.field510 - 1] = -1;
                field1350[++Statics.field510 - 1] = 0;
                field1348[++Statics.field1352 - 1] = "";
                field1350[++Statics.field510 - 1] = 0;
                field1350[++Statics.field510 - 1] = 0;
                field1348[++Statics.field1352 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1028 = field1350[--Statics.field510] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field510 -= 2;
            int var14 = field1350[Statics.field510];
            int var15 = field1350[Statics.field510 + 1];
            class255 var16 = Statics.method51(var15);
            if (var16.method4047()) {
                field1348[++Statics.field1352 - 1] = class262.method1007(var14).method4284(var15, var16.field3402);
            } else {
                field1350[++Statics.field510 - 1] = class262.method1007(var14).method4310(var15, var16.field3401);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field510 -= 2;
            int var17 = field1350[Statics.field510];
            int var18 = field1350[Statics.field510 + 1];
            class255 var19 = Statics.method51(var18);
            if (var19.method4047()) {
                field1348[++Statics.field1352 - 1] = class259.method997(var17).method4182(var18, var19.field3402);
            } else {
                field1350[++Statics.field510 - 1] = class259.method997(var17).method4150(var18, var19.field3401);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field510 -= 2;
            int var20 = field1350[Statics.field510];
            int var21 = field1350[Statics.field510 + 1];
            class255 var22 = Statics.method51(var21);
            if (var22.method4047()) {
                field1348[++Statics.field1352 - 1] = class260.method3915(var20).method4245(var21, var22.field3402);
            } else {
                field1350[++Statics.field510 - 1] = class260.method3915(var20).method4269(var21, var22.field3401);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field510 -= 2;
            int var23 = field1350[Statics.field510];
            int var24 = field1350[Statics.field510 + 1];
            class255 var25 = Statics.method51(var24);
            if (var25.method4047()) {
                field1348[++Statics.field1352 - 1] = class256.method3708(var23).method4069(var24, var25.field3402);
            } else {
                field1350[++Statics.field510 - 1] = class256.method3708(var23).method4068(var24, var25.field3401);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.b(IB)V")
    public static void method76(int arg0) {
        if (arg0 == -1 || !class220.method2857(arg0)) {
            return;
        }
        class220[] var1 = Statics.field780[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class220 var3 = var1[var2];
            if (var3.field2738 != null) {
                class70 var4 = new class70();
                var4.field851 = var3;
                var4.field854 = var3.field2738;
                method478(var4, 2000000);
            }
        }
    }
}
