package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ca")
public class class84 {

    @ObfuscatedName("ca.b")
    public static int[] field1360 = new int[5];

    @ObfuscatedName("ca.y")
    public static int[][] field1358 = new int[5][5000];

    @ObfuscatedName("ca.h")
    public static int[] field1363 = new int[1000];

    @ObfuscatedName("ca.f")
    public static String[] field1371 = new String[1000];

    @ObfuscatedName("ca.a")
    public static int field1365 = 0;

    @ObfuscatedName("ca.o")
    public static class63[] field1366 = new class63[50];

    @ObfuscatedName("ca.j")
    public static Calendar field1367 = Calendar.getInstance();

    @ObfuscatedName("ca.k")
    public static final String[] field1368 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ca.m")
    public static int field1369 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.i(Lbk;I)V")
    public static void method966(class70 arg0) {
        method1606(arg0, 200000);
    }

    @ObfuscatedName("cu.c(Lbk;IB)V")
    public static void method1606(class70 arg0, int arg1) {
        Object[] var2 = arg0.field850;
        class220 var3 = arg0.field860;
        boolean var4 = class220.field2799 == var3 || class220.field2791 == var3 || class220.field2790 == var3 || class220.field2800 == var3 || class220.field2792 == var3 || class220.field2793 == var3 || class220.field2797 == var3 || class220.field2795 == var3;
        class100 var6;
        if (var4) {
            Statics.field586 = (class48) var2[0];
            class243 var5 = Statics.field2840[Statics.field586.field607];
            var6 = class100.method997(arg0.field860, var5.field3290, var5.field3298);
        } else {
            int var7 = (Integer) var2[0];
            var6 = class100.method2653(var7);
        }
        if (var6 == null) {
            return;
        }
        Statics.field1372 = 0;
        Statics.field667 = 0;
        int var8 = -1;
        int[] var9 = var6.field1538;
        int[] var10 = var6.field1549;
        byte var11 = -1;
        field1365 = 0;
        try {
            Statics.field1357 = new int[var6.field1552];
            int var12 = 0;
            Statics.field1370 = new String[var6.field1542];
            int var13 = 0;
            for (int var14 = 1; var14 < var2.length; var14++) {
                if (var2[var14] instanceof Integer) {
                    int var15 = (Integer) var2[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field851;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field849;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field853 == null ? -1 : arg0.field853.field2652;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field854;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field853 == null ? -1 : arg0.field853.field2653;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field855 == null ? -1 : arg0.field855.field2652;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field855 == null ? -1 : arg0.field855.field2653;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field856;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field857;
                    }
                    Statics.field1357[var12++] = var15;
                } else if (var2[var14] instanceof String) {
                    String var16 = (String) var2[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg0.field852;
                    }
                    Statics.field1370[var13++] = var16;
                }
            }
            int var17 = 0;
            field1369 = arg0.field858;
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
                                                                                                                label2456: while (true) {
                                                                                                                    var17++;
                                                                                                                    if (var17 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var8++;
                                                                                                                    int var414 = var9[var8];
                                                                                                                    if (var414 >= 100) {
                                                                                                                        boolean var66;
                                                                                                                        if (var6.field1549[var8] == 1) {
                                                                                                                            var66 = true;
                                                                                                                        } else {
                                                                                                                            var66 = false;
                                                                                                                        }
                                                                                                                        int var67;
                                                                                                                        if (var414 < 1000) {
                                                                                                                            var67 = method1401(var414, var6, var66);
                                                                                                                        } else if (var414 < 1100) {
                                                                                                                            var67 = method1557(var414, var6, var66);
                                                                                                                        } else if (var414 < 1200) {
                                                                                                                            var67 = method3746(var414, var6, var66);
                                                                                                                        } else if (var414 < 1300) {
                                                                                                                            var67 = method565(var414, var6, var66);
                                                                                                                        } else if (var414 < 1400) {
                                                                                                                            var67 = method3363(var414, var6, var66);
                                                                                                                        } else if (var414 < 1500) {
                                                                                                                            var67 = method944(var414, var6, var66);
                                                                                                                        } else if (var414 < 1600) {
                                                                                                                            class217 var71 = var66 ? Statics.field3188 : Statics.field16;
                                                                                                                            byte var72;
                                                                                                                            if (var414 == 1500) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var71.field2665;
                                                                                                                                var72 = 1;
                                                                                                                            } else if (var414 == 1501) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var71.field2666;
                                                                                                                                var72 = 1;
                                                                                                                            } else if (var414 == 1502) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var71.field2750;
                                                                                                                                var72 = 1;
                                                                                                                            } else if (var414 == 1503) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var71.field2689;
                                                                                                                                var72 = 1;
                                                                                                                            } else if (var414 == 1504) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var71.field2672 ? 1 : 0;
                                                                                                                                var72 = 1;
                                                                                                                            } else if (var414 == 1505) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var71.field2786;
                                                                                                                                var72 = 1;
                                                                                                                            } else {
                                                                                                                                var72 = 2;
                                                                                                                            }
                                                                                                                            var67 = var72;
                                                                                                                        } else if (var414 < 1700) {
                                                                                                                            class217 var73 = var66 ? Statics.field3188 : Statics.field16;
                                                                                                                            byte var74;
                                                                                                                            if (var414 == 1600) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2673;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1601) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2754;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1602) {
                                                                                                                                field1371[++Statics.field667 - 1] = var73.field2712;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1603) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2707;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1604) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2646;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1605) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2706;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1606) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2703;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1607) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2723;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1608) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2704;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1609) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2683;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1610) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2684;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1611) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2677;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1612) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2709;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var414 == 1613) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var73.field2682.method6();
                                                                                                                                var74 = 1;
                                                                                                                            } else {
                                                                                                                                var74 = 2;
                                                                                                                            }
                                                                                                                            var67 = var74;
                                                                                                                        } else if (var414 < 1800) {
                                                                                                                            class217 var78 = var66 ? Statics.field3188 : Statics.field16;
                                                                                                                            byte var79;
                                                                                                                            if (var414 == 1700) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var78.field2674;
                                                                                                                                var79 = 1;
                                                                                                                            } else if (var414 == 1701) {
                                                                                                                                if (var78.field2674 == -1) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var78.field2773;
                                                                                                                                }
                                                                                                                                var79 = 1;
                                                                                                                            } else if (var414 == 1702) {
                                                                                                                                field1363[++Statics.field1372 - 1] = var78.field2653;
                                                                                                                                var79 = 1;
                                                                                                                            } else {
                                                                                                                                var79 = 2;
                                                                                                                            }
                                                                                                                            var67 = var79;
                                                                                                                        } else if (var414 < 1900) {
                                                                                                                            var67 = method160(var414, var6, var66);
                                                                                                                        } else if (var414 < 2000) {
                                                                                                                            var67 = method2746(var414, var6, var66);
                                                                                                                        } else if (var414 < 2100) {
                                                                                                                            var67 = method1557(var414, var6, var66);
                                                                                                                        } else if (var414 < 2200) {
                                                                                                                            var67 = method3746(var414, var6, var66);
                                                                                                                        } else if (var414 < 2300) {
                                                                                                                            var67 = method565(var414, var6, var66);
                                                                                                                        } else if (var414 < 2400) {
                                                                                                                            var67 = method3363(var414, var6, var66);
                                                                                                                        } else if (var414 < 2500) {
                                                                                                                            var67 = method944(var414, var6, var66);
                                                                                                                        } else if (var414 < 2600) {
                                                                                                                            var67 = method1414(var414, var6, var66);
                                                                                                                        } else if (var414 < 2700) {
                                                                                                                            var67 = method8(var414, var6, var66);
                                                                                                                        } else if (var414 < 2800) {
                                                                                                                            byte var81;
                                                                                                                            if (var414 == 2700) {
                                                                                                                                class217 var80 = class217.method192(field1363[--Statics.field1372]);
                                                                                                                                field1363[++Statics.field1372 - 1] = var80.field2674;
                                                                                                                                var81 = 1;
                                                                                                                            } else if (var414 == 2701) {
                                                                                                                                class217 var82 = class217.method192(field1363[--Statics.field1372]);
                                                                                                                                if (var82.field2674 == -1) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var82.field2773;
                                                                                                                                }
                                                                                                                                var81 = 1;
                                                                                                                            } else if (var414 == 2702) {
                                                                                                                                int var83 = field1363[--Statics.field1372];
                                                                                                                                class69 var84 = (class69) client.field1092.method3238((long) var83);
                                                                                                                                if (var84 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 1;
                                                                                                                                }
                                                                                                                                var81 = 1;
                                                                                                                            } else if (var414 == 2706) {
                                                                                                                                field1363[++Statics.field1372 - 1] = client.field1164;
                                                                                                                                var81 = 1;
                                                                                                                            } else {
                                                                                                                                var81 = 2;
                                                                                                                            }
                                                                                                                            var67 = var81;
                                                                                                                        } else if (var414 < 2900) {
                                                                                                                            var67 = method1611(var414, var6, var66);
                                                                                                                        } else if (var414 < 3000) {
                                                                                                                            var67 = method2746(var414, var6, var66);
                                                                                                                        } else if (var414 < 3200) {
                                                                                                                            byte var86;
                                                                                                                            if (var414 == 3100) {
                                                                                                                                String var85 = field1371[--Statics.field667];
                                                                                                                                class99.method107(0, "", var85);
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3101) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                Statics.method44(Statics.field1321, field1363[Statics.field1372], field1363[Statics.field1372 + 1]);
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3103) {
                                                                                                                                client.method226();
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3104) {
                                                                                                                                String var87 = field1371[--Statics.field667];
                                                                                                                                int var88 = 0;
                                                                                                                                if (class271.method4139(var87)) {
                                                                                                                                    var88 = class271.method3551(var87);
                                                                                                                                }
                                                                                                                                client.field973.method3105(159);
                                                                                                                                client.field973.method2871(var88);
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3105) {
                                                                                                                                String var89 = field1371[--Statics.field667];
                                                                                                                                client.field973.method3105(78);
                                                                                                                                client.field973.method2865(var89.length() + 1);
                                                                                                                                client.field973.method2879(var89);
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3106) {
                                                                                                                                String var90 = field1371[--Statics.field667];
                                                                                                                                client.field973.method3105(10);
                                                                                                                                client.field973.method2865(var90.length() + 1);
                                                                                                                                client.field973.method2879(var90);
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3107) {
                                                                                                                                int var91 = field1363[--Statics.field1372];
                                                                                                                                String var92 = field1371[--Statics.field667];
                                                                                                                                client.method229(var91, var92);
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3108) {
                                                                                                                                Statics.field1372 -= 3;
                                                                                                                                int var93 = field1363[Statics.field1372];
                                                                                                                                int var94 = field1363[Statics.field1372 + 1];
                                                                                                                                int var95 = field1363[Statics.field1372 + 2];
                                                                                                                                class217 var96 = class217.method192(var95);
                                                                                                                                client.method67(var96, var93, var94);
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3109) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var97 = field1363[Statics.field1372];
                                                                                                                                int var98 = field1363[Statics.field1372 + 1];
                                                                                                                                class217 var99 = var66 ? Statics.field3188 : Statics.field16;
                                                                                                                                client.method67(var99, var97, var98);
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3110) {
                                                                                                                                Statics.field3203 = field1363[--Statics.field1372] == 1;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3111) {
                                                                                                                                field1363[++Statics.field1372 - 1] = Statics.field304.field1334 ? 1 : 0;
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3112) {
                                                                                                                                Statics.field304.field1334 = field1363[--Statics.field1372] == 1;
                                                                                                                                class82.method943();
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3113) {
                                                                                                                                String var100 = field1371[--Statics.field667];
                                                                                                                                boolean var101 = field1363[--Statics.field1372] == 1;
                                                                                                                                if (var101) {
                                                                                                                                    label2407: {
                                                                                                                                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                                                                                                                            try {
                                                                                                                                                Desktop.getDesktop().browse(new URI(var100));
                                                                                                                                                break label2407;
                                                                                                                                            } catch (Exception var412) {
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (class57.field691.startsWith("win")) {
                                                                                                                                            class57.method475(var100, 0, "openjs");
                                                                                                                                        } else if (class57.field691.startsWith("mac")) {
                                                                                                                                            class57.method475(var100, 1, "openjs");
                                                                                                                                        } else {
                                                                                                                                            class57.method475(var100, 2, "openjs");
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    class57.method475(var100, 3, "openjs");
                                                                                                                                }
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3115) {
                                                                                                                                int var103 = field1363[--Statics.field1372];
                                                                                                                                client.field973.method3105(153);
                                                                                                                                client.field973.method2856(var103);
                                                                                                                                var86 = 1;
                                                                                                                            } else if (var414 == 3116) {
                                                                                                                                int var104 = field1363[--Statics.field1372];
                                                                                                                                Statics.field667 -= 2;
                                                                                                                                String var105 = field1371[Statics.field667];
                                                                                                                                String var106 = field1371[Statics.field667 + 1];
                                                                                                                                if (var105.length() > 500) {
                                                                                                                                    var86 = 1;
                                                                                                                                } else if (var106.length() > 500) {
                                                                                                                                    var86 = 1;
                                                                                                                                } else {
                                                                                                                                    client.field973.method3105(148);
                                                                                                                                    client.field973.method2856(1 + class174.method12(var105) + class174.method12(var106));
                                                                                                                                    client.field973.method2879(var106);
                                                                                                                                    client.field973.method2879(var105);
                                                                                                                                    client.field973.method2894(var104);
                                                                                                                                    var86 = 1;
                                                                                                                                }
                                                                                                                            } else if (var414 == 3117) {
                                                                                                                                client.field1079 = field1363[--Statics.field1372] == 1;
                                                                                                                                var86 = 1;
                                                                                                                            } else {
                                                                                                                                var86 = 2;
                                                                                                                            }
                                                                                                                            var67 = var86;
                                                                                                                        } else if (var414 < 3300) {
                                                                                                                            byte var107;
                                                                                                                            if (var414 == 3200) {
                                                                                                                                Statics.field1372 -= 3;
                                                                                                                                client.method518(field1363[Statics.field1372], field1363[Statics.field1372 + 1], field1363[Statics.field1372 + 2]);
                                                                                                                                var107 = 1;
                                                                                                                            } else if (var414 == 3201) {
                                                                                                                                client.method3485(field1363[--Statics.field1372]);
                                                                                                                                var107 = 1;
                                                                                                                            } else if (var414 == 3202) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                client.method998(field1363[Statics.field1372], field1363[Statics.field1372 + 1]);
                                                                                                                                var107 = 1;
                                                                                                                            } else {
                                                                                                                                var107 = 2;
                                                                                                                            }
                                                                                                                            var67 = var107;
                                                                                                                        } else if (var414 < 3400) {
                                                                                                                            var67 = method889(var414, var6, var66);
                                                                                                                        } else if (var414 < 3500) {
                                                                                                                            var67 = method1555(var414, var6, var66);
                                                                                                                        } else if (var414 < 3700) {
                                                                                                                            byte var108;
                                                                                                                            if (var414 == 3600) {
                                                                                                                                if (client.field1197 == 0) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -2;
                                                                                                                                } else if (client.field1197 == 1) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = client.field1196;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3601) {
                                                                                                                                int var109 = field1363[--Statics.field1372];
                                                                                                                                if (client.field1197 == 2 && var109 < client.field1196) {
                                                                                                                                    field1371[++Statics.field667 - 1] = client.field952[var109].field814;
                                                                                                                                    field1371[++Statics.field667 - 1] = client.field952[var109].field815;
                                                                                                                                } else {
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3602) {
                                                                                                                                int var110 = field1363[--Statics.field1372];
                                                                                                                                if (client.field1197 == 2 && var110 < client.field1196) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = client.field952[var110].field816;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3603) {
                                                                                                                                int var111 = field1363[--Statics.field1372];
                                                                                                                                if (client.field1197 == 2 && var111 < client.field1196) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = client.field952[var111].field817;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3604) {
                                                                                                                                String var112 = field1371[--Statics.field667];
                                                                                                                                int var113 = field1363[--Statics.field1372];
                                                                                                                                Statics.method3383(var112, var113);
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3605) {
                                                                                                                                String var114 = field1371[--Statics.field667];
                                                                                                                                if (var114 != null) {
                                                                                                                                    if ((client.field1196 < 200 || client.field998 == 1) && client.field1196 < 400) {
                                                                                                                                        String var115 = class268.method2702(var114, Statics.field1332);
                                                                                                                                        if (var115 != null) {
                                                                                                                                            int var116 = 0;
                                                                                                                                            label2200: while (true) {
                                                                                                                                                if (var116 >= client.field1196) {
                                                                                                                                                    for (int var120 = 0; var120 < client.field1200; var120++) {
                                                                                                                                                        class71 var121 = client.field1201[var120];
                                                                                                                                                        String var122 = class268.method2702(var121.field864, Statics.field1332);
                                                                                                                                                        if (var122 != null && var122.equals(var115)) {
                                                                                                                                                            class99.method107(30, "", class226.field3025 + var114 + class226.field3026);
                                                                                                                                                            break label2200;
                                                                                                                                                        }
                                                                                                                                                        if (var121.field865 != null) {
                                                                                                                                                            String var123 = class268.method2702(var121.field865, Statics.field1332);
                                                                                                                                                            if (var123 != null && var123.equals(var115)) {
                                                                                                                                                                class99.method107(30, "", class226.field3025 + var114 + class226.field3026);
                                                                                                                                                                break label2200;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (class268.method2702(Statics.field1321.field906, Statics.field1332).equals(var115)) {
                                                                                                                                                        class99.method107(30, "", class226.field3099);
                                                                                                                                                    } else {
                                                                                                                                                        client.field973.method3105(94);
                                                                                                                                                        client.field973.method2865(class174.method12(var114));
                                                                                                                                                        client.field973.method2879(var114);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class66 var117 = client.field952[var116];
                                                                                                                                                String var118 = class268.method2702(var117.field814, Statics.field1332);
                                                                                                                                                if (var118 != null && var118.equals(var115)) {
                                                                                                                                                    class99.method107(30, "", var114 + class226.field3020);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var117.field815 != null) {
                                                                                                                                                    String var119 = class268.method2702(var117.field815, Statics.field1332);
                                                                                                                                                    if (var119 != null && var119.equals(var115)) {
                                                                                                                                                        class99.method107(30, "", var114 + class226.field3020);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var116++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class99.method107(30, "", class226.field3019);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3606) {
                                                                                                                                String var124 = field1371[--Statics.field667];
                                                                                                                                client.method967(var124);
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3607) {
                                                                                                                                String var125 = field1371[--Statics.field667];
                                                                                                                                if (var125 != null) {
                                                                                                                                    if ((client.field1200 < 100 || client.field998 == 1) && client.field1200 < 400) {
                                                                                                                                        String var126 = class268.method2702(var125, Statics.field1332);
                                                                                                                                        if (var126 != null) {
                                                                                                                                            int var127 = 0;
                                                                                                                                            label2234: while (true) {
                                                                                                                                                if (var127 >= client.field1200) {
                                                                                                                                                    for (int var131 = 0; var131 < client.field1196; var131++) {
                                                                                                                                                        class66 var132 = client.field952[var131];
                                                                                                                                                        String var133 = class268.method2702(var132.field814, Statics.field1332);
                                                                                                                                                        if (var133 != null && var133.equals(var126)) {
                                                                                                                                                            class99.method107(31, "", class226.field3027 + var125 + class226.field2928);
                                                                                                                                                            break label2234;
                                                                                                                                                        }
                                                                                                                                                        if (var132.field815 != null) {
                                                                                                                                                            String var134 = class268.method2702(var132.field815, Statics.field1332);
                                                                                                                                                            if (var134 != null && var134.equals(var126)) {
                                                                                                                                                                class99.method107(31, "", class226.field3027 + var125 + class226.field2928);
                                                                                                                                                                break label2234;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (class268.method2702(Statics.field1321.field906, Statics.field1332).equals(var126)) {
                                                                                                                                                        class99.method107(31, "", class226.field3024);
                                                                                                                                                    } else {
                                                                                                                                                        client.field973.method3105(217);
                                                                                                                                                        client.field973.method2865(class174.method12(var125));
                                                                                                                                                        client.field973.method2879(var125);
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                class71 var128 = client.field1201[var127];
                                                                                                                                                String var129 = class268.method2702(var128.field864, Statics.field1332);
                                                                                                                                                if (var129 != null && var129.equals(var126)) {
                                                                                                                                                    class99.method107(31, "", var125 + class226.field3022);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                if (var128.field865 != null) {
                                                                                                                                                    String var130 = class268.method2702(var128.field865, Statics.field1332);
                                                                                                                                                    if (var130 != null && var130.equals(var126)) {
                                                                                                                                                        class99.method107(31, "", var125 + class226.field3022);
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var127++;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        class99.method107(31, "", class226.field3021);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3608) {
                                                                                                                                String var135 = field1371[--Statics.field667];
                                                                                                                                if (var135 != null) {
                                                                                                                                    String var136 = class268.method2702(var135, Statics.field1332);
                                                                                                                                    if (var136 != null) {
                                                                                                                                        for (int var137 = 0; var137 < client.field1200; var137++) {
                                                                                                                                            class71 var138 = client.field1201[var137];
                                                                                                                                            String var139 = var138.field864;
                                                                                                                                            String var140 = class268.method2702(var139, Statics.field1332);
                                                                                                                                            if (class278.method2704(var135, var136, var139, var140)) {
                                                                                                                                                client.field1200--;
                                                                                                                                                for (int var141 = var137; var141 < client.field1200; var141++) {
                                                                                                                                                    client.field1201[var141] = client.field1201[var141 + 1];
                                                                                                                                                }
                                                                                                                                                client.field1067 = client.field1122;
                                                                                                                                                client.field973.method3105(232);
                                                                                                                                                client.field973.method2865(class174.method12(var135));
                                                                                                                                                client.field973.method2879(var135);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3609) {
                                                                                                                                String var142 = field1371[--Statics.field667];
                                                                                                                                class231[] var143 = class231.method1713();
                                                                                                                                for (int var144 = 0; var144 < var143.length; var144++) {
                                                                                                                                    class231 var145 = var143[var144];
                                                                                                                                    if (var145.field3175 != -1) {
                                                                                                                                        int var147 = var145.field3175;
                                                                                                                                        String var148 = "<img=" + var147 + ">";
                                                                                                                                        if (var142.startsWith(var148)) {
                                                                                                                                            var142 = var142.substring(6 + Integer.toString(var145.field3175).length());
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method1609(var142, false) ? 1 : 0;
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3611) {
                                                                                                                                if (client.field1156 == null) {
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    String[] var149 = field1371;
                                                                                                                                    int var150 = ++Statics.field667 - 1;
                                                                                                                                    String var151 = client.field1156;
                                                                                                                                    long var152 = 0L;
                                                                                                                                    int var154 = var151.length();
                                                                                                                                    for (int var155 = 0; var155 < var154; var155++) {
                                                                                                                                        var152 *= 37L;
                                                                                                                                        char var156 = var151.charAt(var155);
                                                                                                                                        if (var156 >= 'A' && var156 <= 'Z') {
                                                                                                                                            var152 += (long) (var156 + 1 - 65);
                                                                                                                                        } else if (var156 >= 'a' && var156 <= 'z') {
                                                                                                                                            var152 += (long) (var156 + 1 - 97);
                                                                                                                                        } else if (var156 >= '0' && var156 <= '9') {
                                                                                                                                            var152 += (long) (var156 + 27 - 48);
                                                                                                                                        }
                                                                                                                                        if (var152 >= 177917621779460413L) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    while (var152 % 37L == 0L && var152 != 0L) {
                                                                                                                                        var152 /= 37L;
                                                                                                                                    }
                                                                                                                                    String var159 = class269.method4331(var152);
                                                                                                                                    if (var159 == null) {
                                                                                                                                        var159 = "";
                                                                                                                                    }
                                                                                                                                    var149[var150] = var159;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3612) {
                                                                                                                                if (client.field1156 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = Statics.field39;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3613) {
                                                                                                                                int var161 = field1363[--Statics.field1372];
                                                                                                                                if (client.field1156 == null || var161 >= Statics.field39) {
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1371[++Statics.field667 - 1] = Statics.field1241[var161].field928;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3614) {
                                                                                                                                int var162 = field1363[--Statics.field1372];
                                                                                                                                if (client.field1156 == null || var162 >= Statics.field39) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = Statics.field1241[var162].field921;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3615) {
                                                                                                                                int var163 = field1363[--Statics.field1372];
                                                                                                                                if (client.field1156 == null || var163 >= Statics.field39) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = Statics.field1241[var163].field922;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3616) {
                                                                                                                                field1363[++Statics.field1372 - 1] = Statics.field3391;
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3617) {
                                                                                                                                String var164 = field1371[--Statics.field667];
                                                                                                                                if (Statics.field1241 != null) {
                                                                                                                                    client.field973.method3105(39);
                                                                                                                                    client.field973.method2865(class174.method12(var164));
                                                                                                                                    client.field973.method2879(var164);
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3618) {
                                                                                                                                field1363[++Statics.field1372 - 1] = Statics.field430;
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3619) {
                                                                                                                                String var165 = field1371[--Statics.field667];
                                                                                                                                if (!var165.equals("")) {
                                                                                                                                    client.field973.method3105(9);
                                                                                                                                    client.field973.method2865(class174.method12(var165));
                                                                                                                                    client.field973.method2879(var165);
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3620) {
                                                                                                                                client.field973.method3105(9);
                                                                                                                                client.field973.method2865(0);
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3621) {
                                                                                                                                if (client.field1197 == 0) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = client.field1200;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3622) {
                                                                                                                                int var166 = field1363[--Statics.field1372];
                                                                                                                                if (client.field1197 == 0 || var166 >= client.field1200) {
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1371[++Statics.field667 - 1] = client.field1201[var166].field864;
                                                                                                                                    field1371[++Statics.field667 - 1] = client.field1201[var166].field865;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3623) {
                                                                                                                                String var167;
                                                                                                                                label2333: {
                                                                                                                                    var167 = field1371[--Statics.field667];
                                                                                                                                    String var169 = "<img=0>";
                                                                                                                                    if (!var167.startsWith(var169)) {
                                                                                                                                        String var171 = "<img=1>";
                                                                                                                                        if (!var167.startsWith(var171)) {
                                                                                                                                            break label2333;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var167 = var167.substring(7);
                                                                                                                                }
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method3580(var167) ? 1 : 0;
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3624) {
                                                                                                                                int var172 = field1363[--Statics.field1372];
                                                                                                                                if (Statics.field1241 == null || var172 >= Statics.field39 || !Statics.field1241[var172].field928.equalsIgnoreCase(Statics.field1321.field906)) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 1;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else if (var414 == 3625) {
                                                                                                                                if (client.field1055 == null) {
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    String[] var173 = field1371;
                                                                                                                                    int var174 = ++Statics.field667 - 1;
                                                                                                                                    String var175 = client.field1055;
                                                                                                                                    long var176 = 0L;
                                                                                                                                    int var178 = var175.length();
                                                                                                                                    for (int var179 = 0; var179 < var178; var179++) {
                                                                                                                                        var176 *= 37L;
                                                                                                                                        char var180 = var175.charAt(var179);
                                                                                                                                        if (var180 >= 'A' && var180 <= 'Z') {
                                                                                                                                            var176 += (long) (var180 + 1 - 65);
                                                                                                                                        } else if (var180 >= 'a' && var180 <= 'z') {
                                                                                                                                            var176 += (long) (var180 + 1 - 97);
                                                                                                                                        } else if (var180 >= '0' && var180 <= '9') {
                                                                                                                                            var176 += (long) (var180 + 27 - 48);
                                                                                                                                        }
                                                                                                                                        if (var176 >= 177917621779460413L) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    while (var176 % 37L == 0L && var176 != 0L) {
                                                                                                                                        var176 /= 37L;
                                                                                                                                    }
                                                                                                                                    String var183 = class269.method4331(var176);
                                                                                                                                    if (var183 == null) {
                                                                                                                                        var183 = "";
                                                                                                                                    }
                                                                                                                                    var173[var174] = var183;
                                                                                                                                }
                                                                                                                                var108 = 1;
                                                                                                                            } else {
                                                                                                                                var108 = 2;
                                                                                                                            }
                                                                                                                            var67 = var108;
                                                                                                                        } else if (var414 < 4000) {
                                                                                                                            byte var186;
                                                                                                                            if (var414 == 3903) {
                                                                                                                                int var185 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = client.field1073[var185].method86();
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3904) {
                                                                                                                                int var187 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = client.field1073[var187].field297;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3905) {
                                                                                                                                int var188 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = client.field1073[var188].field303;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3906) {
                                                                                                                                int var189 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = client.field1073[var189].field300;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3907) {
                                                                                                                                int var190 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = client.field1073[var190].field298;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3908) {
                                                                                                                                int var191 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = client.field1073[var191].field302;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3910) {
                                                                                                                                int var192 = field1363[--Statics.field1372];
                                                                                                                                int var193 = client.field1073[var192].method79();
                                                                                                                                field1363[++Statics.field1372 - 1] = var193 == 0 ? 1 : 0;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3911) {
                                                                                                                                int var194 = field1363[--Statics.field1372];
                                                                                                                                int var195 = client.field1073[var194].method79();
                                                                                                                                field1363[++Statics.field1372 - 1] = var195 == 2 ? 1 : 0;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3912) {
                                                                                                                                int var196 = field1363[--Statics.field1372];
                                                                                                                                int var197 = client.field1073[var196].method79();
                                                                                                                                field1363[++Statics.field1372 - 1] = var197 == 5 ? 1 : 0;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3913) {
                                                                                                                                int var198 = field1363[--Statics.field1372];
                                                                                                                                int var199 = client.field1073[var198].method79();
                                                                                                                                field1363[++Statics.field1372 - 1] = var199 == 1 ? 1 : 0;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3914) {
                                                                                                                                boolean var200 = field1363[--Statics.field1372] == 1;
                                                                                                                                if (Statics.field2634 != null) {
                                                                                                                                    Statics.field2634.method61(class14.field276, var200);
                                                                                                                                }
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3915) {
                                                                                                                                boolean var201 = field1363[--Statics.field1372] == 1;
                                                                                                                                if (Statics.field2634 != null) {
                                                                                                                                    Statics.field2634.method61(class14.field275, var201);
                                                                                                                                }
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3916) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                boolean var202 = field1363[Statics.field1372] == 1;
                                                                                                                                boolean var203 = field1363[Statics.field1372 + 1] == 1;
                                                                                                                                if (Statics.field2634 != null) {
                                                                                                                                    Statics.field2634.method61(new class96(var203), var202);
                                                                                                                                }
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3917) {
                                                                                                                                boolean var204 = field1363[--Statics.field1372] == 1;
                                                                                                                                if (Statics.field2634 != null) {
                                                                                                                                    Statics.field2634.method61(class14.field274, var204);
                                                                                                                                }
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3918) {
                                                                                                                                boolean var205 = field1363[--Statics.field1372] == 1;
                                                                                                                                if (Statics.field2634 != null) {
                                                                                                                                    Statics.field2634.method61(class14.field277, var205);
                                                                                                                                }
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3919) {
                                                                                                                                field1363[++Statics.field1372 - 1] = Statics.field2634 == null ? 0 : Statics.field2634.field273.size();
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3920) {
                                                                                                                                int var206 = field1363[--Statics.field1372];
                                                                                                                                class15 var207 = (class15) Statics.field2634.field273.get(var206);
                                                                                                                                field1363[++Statics.field1372 - 1] = var207.field289;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3921) {
                                                                                                                                int var208 = field1363[--Statics.field1372];
                                                                                                                                class15 var209 = (class15) Statics.field2634.field273.get(var208);
                                                                                                                                field1371[++Statics.field667 - 1] = var209.method65();
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3922) {
                                                                                                                                int var210 = field1363[--Statics.field1372];
                                                                                                                                class15 var211 = (class15) Statics.field2634.field273.get(var210);
                                                                                                                                field1371[++Statics.field667 - 1] = var211.method63();
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3923) {
                                                                                                                                int var212 = field1363[--Statics.field1372];
                                                                                                                                class15 var213 = (class15) Statics.field2634.field273.get(var212);
                                                                                                                                long var214 = class176.method89() - Statics.field415 - var213.field291;
                                                                                                                                int var216 = (int) (var214 / 3600000L);
                                                                                                                                int var217 = (int) ((var214 - (long) (var216 * 3600000)) / 60000L);
                                                                                                                                int var218 = (int) ((var214 - (long) (var216 * 3600000) - (long) (var217 * 60000)) / 1000L);
                                                                                                                                String var219 = var216 + ":" + var217 / 10 + var217 % 10 + ":" + var218 / 10 + var218 % 10;
                                                                                                                                field1371[++Statics.field667 - 1] = var219;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3924) {
                                                                                                                                int var220 = field1363[--Statics.field1372];
                                                                                                                                class15 var221 = (class15) Statics.field2634.field273.get(var220);
                                                                                                                                field1363[++Statics.field1372 - 1] = var221.field287.field300;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3925) {
                                                                                                                                int var222 = field1363[--Statics.field1372];
                                                                                                                                class15 var223 = (class15) Statics.field2634.field273.get(var222);
                                                                                                                                field1363[++Statics.field1372 - 1] = var223.field287.field303;
                                                                                                                                var186 = 1;
                                                                                                                            } else if (var414 == 3926) {
                                                                                                                                int var224 = field1363[--Statics.field1372];
                                                                                                                                class15 var225 = (class15) Statics.field2634.field273.get(var224);
                                                                                                                                field1363[++Statics.field1372 - 1] = var225.field287.field297;
                                                                                                                                var186 = 1;
                                                                                                                            } else {
                                                                                                                                var186 = 2;
                                                                                                                            }
                                                                                                                            var67 = var186;
                                                                                                                        } else if (var414 < 4100) {
                                                                                                                            var67 = method972(var414, var6, var66);
                                                                                                                        } else if (var414 < 4200) {
                                                                                                                            var67 = method449(var414, var6, var66);
                                                                                                                        } else if (var414 < 4300) {
                                                                                                                            byte var227;
                                                                                                                            if (var414 == 4200) {
                                                                                                                                int var226 = field1363[--Statics.field1372];
                                                                                                                                field1371[++Statics.field667 - 1] = class257.method2996(var226).field3496;
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4201) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var228 = field1363[Statics.field1372];
                                                                                                                                int var229 = field1363[Statics.field1372 + 1];
                                                                                                                                class257 var230 = class257.method2996(var228);
                                                                                                                                if (var229 < 1 || var229 > 5 || var230.field3489[var229 - 1] == null) {
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1371[++Statics.field667 - 1] = var230.field3489[var229 - 1];
                                                                                                                                }
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4202) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var231 = field1363[Statics.field1372];
                                                                                                                                int var232 = field1363[Statics.field1372 + 1];
                                                                                                                                class257 var233 = class257.method2996(var231);
                                                                                                                                if (var232 < 1 || var232 > 5 || var233.field3508[var232 - 1] == null) {
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1371[++Statics.field667 - 1] = var233.field3508[var232 - 1];
                                                                                                                                }
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4203) {
                                                                                                                                int var234 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = class257.method2996(var234).field3505;
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4204) {
                                                                                                                                int var235 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = class257.method2996(var235).field3504 == 1 ? 1 : 0;
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4205) {
                                                                                                                                int var236 = field1363[--Statics.field1372];
                                                                                                                                class257 var237 = class257.method2996(var236);
                                                                                                                                if (var237.field3525 == -1 && var237.field3524 >= 0) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var237.field3524;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var236;
                                                                                                                                }
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4206) {
                                                                                                                                int var238 = field1363[--Statics.field1372];
                                                                                                                                class257 var239 = class257.method2996(var238);
                                                                                                                                if (var239.field3525 >= 0 && var239.field3524 >= 0) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var239.field3524;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var238;
                                                                                                                                }
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4207) {
                                                                                                                                int var240 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = class257.method2996(var240).field3506 ? 1 : 0;
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4208) {
                                                                                                                                int var241 = field1363[--Statics.field1372];
                                                                                                                                class257 var242 = class257.method2996(var241);
                                                                                                                                if (var242.field3537 == -1 && var242.field3536 >= 0) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var242.field3536;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var241;
                                                                                                                                }
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4209) {
                                                                                                                                int var243 = field1363[--Statics.field1372];
                                                                                                                                class257 var244 = class257.method2996(var243);
                                                                                                                                if (var244.field3537 >= 0 && var244.field3536 >= 0) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var244.field3536;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var243;
                                                                                                                                }
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4210) {
                                                                                                                                String var245 = field1371[--Statics.field667];
                                                                                                                                int var246 = field1363[--Statics.field1372];
                                                                                                                                boolean var248 = var246 == 1;
                                                                                                                                String var249 = var245.toLowerCase();
                                                                                                                                short[] var250 = new short[16];
                                                                                                                                int var251 = 0;
                                                                                                                                int var252 = 0;
                                                                                                                                while (true) {
                                                                                                                                    if (var252 >= Statics.field3487) {
                                                                                                                                        Statics.field544 = var250;
                                                                                                                                        Statics.field1292 = 0;
                                                                                                                                        Statics.field2454 = var251;
                                                                                                                                        String[] var256 = new String[Statics.field2454];
                                                                                                                                        for (int var257 = 0; var257 < Statics.field2454; var257++) {
                                                                                                                                            var256[var257] = class257.method2996(var250[var257]).field3496;
                                                                                                                                        }
                                                                                                                                        class171.method1510(var256, Statics.field544);
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    class257 var253 = class257.method2996(var252);
                                                                                                                                    if ((!var248 || var253.field3533) && var253.field3525 == -1 && var253.field3496.toLowerCase().indexOf(var249) != -1) {
                                                                                                                                        if (var251 >= 250) {
                                                                                                                                            Statics.field2454 = -1;
                                                                                                                                            Statics.field544 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        if (var251 >= var250.length) {
                                                                                                                                            short[] var254 = new short[var250.length * 2];
                                                                                                                                            for (int var255 = 0; var255 < var251; var255++) {
                                                                                                                                                var254[var255] = var250[var255];
                                                                                                                                            }
                                                                                                                                            var250 = var254;
                                                                                                                                        }
                                                                                                                                        var250[var251++] = (short) var252;
                                                                                                                                    }
                                                                                                                                    var252++;
                                                                                                                                }
                                                                                                                                field1363[++Statics.field1372 - 1] = Statics.field2454;
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4211) {
                                                                                                                                if (Statics.field544 == null || Statics.field1292 >= Statics.field2454) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = Statics.field544[++Statics.field1292 - 1] & 0xFFFF;
                                                                                                                                }
                                                                                                                                var227 = 1;
                                                                                                                            } else if (var414 == 4212) {
                                                                                                                                Statics.field1292 = 0;
                                                                                                                                var227 = 1;
                                                                                                                            } else {
                                                                                                                                var227 = 2;
                                                                                                                            }
                                                                                                                            var67 = var227;
                                                                                                                        } else if (var414 < 5100) {
                                                                                                                            byte var258;
                                                                                                                            if (var414 == 5000) {
                                                                                                                                field1363[++Statics.field1372 - 1] = client.field1032;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5001) {
                                                                                                                                Statics.field1372 -= 3;
                                                                                                                                client.field1032 = field1363[Statics.field1372];
                                                                                                                                int var259 = field1363[Statics.field1372 + 1];
                                                                                                                                class277[] var260 = class277.method3555();
                                                                                                                                int var261 = 0;
                                                                                                                                class277 var263;
                                                                                                                                while (true) {
                                                                                                                                    if (var261 >= var260.length) {
                                                                                                                                        var263 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    class277 var262 = var260[var261];
                                                                                                                                    if (var262.field3738 == var259) {
                                                                                                                                        var263 = var262;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    var261++;
                                                                                                                                }
                                                                                                                                Statics.field696 = var263;
                                                                                                                                if (Statics.field696 == null) {
                                                                                                                                    Statics.field696 = class277.field3735;
                                                                                                                                }
                                                                                                                                client.field1148 = field1363[Statics.field1372 + 2];
                                                                                                                                client.field973.method3105(70);
                                                                                                                                client.field973.method2865(client.field1032);
                                                                                                                                client.field973.method2865(Statics.field696.field3738);
                                                                                                                                client.field973.method2865(client.field1148);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5002) {
                                                                                                                                String var264 = field1371[--Statics.field667];
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var265 = field1363[Statics.field1372];
                                                                                                                                int var266 = field1363[Statics.field1372 + 1];
                                                                                                                                client.field973.method3105(119);
                                                                                                                                client.field973.method2865(class174.method12(var264) + 2);
                                                                                                                                client.field973.method2879(var264);
                                                                                                                                client.field973.method2865(var265 - 1);
                                                                                                                                client.field973.method2865(var266);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5003) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var267 = field1363[Statics.field1372];
                                                                                                                                int var268 = field1363[Statics.field1372 + 1];
                                                                                                                                class73 var269 = class99.method133(var267, var268);
                                                                                                                                if (var269 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var269.field876;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var269.field883;
                                                                                                                                    field1371[++Statics.field667 - 1] = var269.field879 == null ? "" : var269.field879;
                                                                                                                                    field1371[++Statics.field667 - 1] = var269.field880 == null ? "" : var269.field880;
                                                                                                                                    field1371[++Statics.field667 - 1] = var269.field881 == null ? "" : var269.field881;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5004) {
                                                                                                                                int var270 = field1363[--Statics.field1372];
                                                                                                                                class73 var271 = class99.method1563(var270);
                                                                                                                                if (var271 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var271.field878;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var271.field883;
                                                                                                                                    field1371[++Statics.field667 - 1] = var271.field879 == null ? "" : var271.field879;
                                                                                                                                    field1371[++Statics.field667 - 1] = var271.field880 == null ? "" : var271.field880;
                                                                                                                                    field1371[++Statics.field667 - 1] = var271.field881 == null ? "" : var271.field881;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5005) {
                                                                                                                                if (Statics.field696 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = Statics.field696.field3738;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5008) {
                                                                                                                                String var272 = field1371[--Statics.field667];
                                                                                                                                int var273 = field1363[--Statics.field1372];
                                                                                                                                String var274 = var272.toLowerCase();
                                                                                                                                byte var275 = 0;
                                                                                                                                if (var274.startsWith(class226.field3029)) {
                                                                                                                                    var275 = 0;
                                                                                                                                    var272 = var272.substring(class226.field3029.length());
                                                                                                                                } else if (var274.startsWith(class226.field3031)) {
                                                                                                                                    var275 = 1;
                                                                                                                                    var272 = var272.substring(class226.field3031.length());
                                                                                                                                } else if (var274.startsWith(class226.field3033)) {
                                                                                                                                    var275 = 2;
                                                                                                                                    var272 = var272.substring(class226.field3033.length());
                                                                                                                                } else if (var274.startsWith(class226.field2856)) {
                                                                                                                                    var275 = 3;
                                                                                                                                    var272 = var272.substring(class226.field2856.length());
                                                                                                                                } else if (var274.startsWith(class226.field2956)) {
                                                                                                                                    var275 = 4;
                                                                                                                                    var272 = var272.substring(class226.field2956.length());
                                                                                                                                } else if (var274.startsWith(class226.field3039)) {
                                                                                                                                    var275 = 5;
                                                                                                                                    var272 = var272.substring(class226.field3039.length());
                                                                                                                                } else if (var274.startsWith(class226.field3041)) {
                                                                                                                                    var275 = 6;
                                                                                                                                    var272 = var272.substring(class226.field3041.length());
                                                                                                                                } else if (var274.startsWith(class226.field2875)) {
                                                                                                                                    var275 = 7;
                                                                                                                                    var272 = var272.substring(class226.field2875.length());
                                                                                                                                } else if (var274.startsWith(class226.field2906)) {
                                                                                                                                    var275 = 8;
                                                                                                                                    var272 = var272.substring(class226.field2906.length());
                                                                                                                                } else if (var274.startsWith(class226.field3047)) {
                                                                                                                                    var275 = 9;
                                                                                                                                    var272 = var272.substring(class226.field3047.length());
                                                                                                                                } else if (var274.startsWith(class226.field3049)) {
                                                                                                                                    var275 = 10;
                                                                                                                                    var272 = var272.substring(class226.field3049.length());
                                                                                                                                } else if (var274.startsWith(class226.field3051)) {
                                                                                                                                    var275 = 11;
                                                                                                                                    var272 = var272.substring(class226.field3051.length());
                                                                                                                                } else if (client.field1078 != 0) {
                                                                                                                                    if (var274.startsWith(class226.field3030)) {
                                                                                                                                        var275 = 0;
                                                                                                                                        var272 = var272.substring(class226.field3030.length());
                                                                                                                                    } else if (var274.startsWith(class226.field3032)) {
                                                                                                                                        var275 = 1;
                                                                                                                                        var272 = var272.substring(class226.field3032.length());
                                                                                                                                    } else if (var274.startsWith(class226.field2872)) {
                                                                                                                                        var275 = 2;
                                                                                                                                        var272 = var272.substring(class226.field2872.length());
                                                                                                                                    } else if (var274.startsWith(class226.field3036)) {
                                                                                                                                        var275 = 3;
                                                                                                                                        var272 = var272.substring(class226.field3036.length());
                                                                                                                                    } else if (var274.startsWith(class226.field3038)) {
                                                                                                                                        var275 = 4;
                                                                                                                                        var272 = var272.substring(class226.field3038.length());
                                                                                                                                    } else if (var274.startsWith(class226.field2895)) {
                                                                                                                                        var275 = 5;
                                                                                                                                        var272 = var272.substring(class226.field2895.length());
                                                                                                                                    } else if (var274.startsWith(class226.field3042)) {
                                                                                                                                        var275 = 6;
                                                                                                                                        var272 = var272.substring(class226.field3042.length());
                                                                                                                                    } else if (var274.startsWith(class226.field3044)) {
                                                                                                                                        var275 = 7;
                                                                                                                                        var272 = var272.substring(class226.field3044.length());
                                                                                                                                    } else if (var274.startsWith(class226.field3046)) {
                                                                                                                                        var275 = 8;
                                                                                                                                        var272 = var272.substring(class226.field3046.length());
                                                                                                                                    } else if (var274.startsWith(class226.field3037)) {
                                                                                                                                        var275 = 9;
                                                                                                                                        var272 = var272.substring(class226.field3037.length());
                                                                                                                                    } else if (var274.startsWith(class226.field3050)) {
                                                                                                                                        var275 = 10;
                                                                                                                                        var272 = var272.substring(class226.field3050.length());
                                                                                                                                    } else if (var274.startsWith(class226.field2948)) {
                                                                                                                                        var275 = 11;
                                                                                                                                        var272 = var272.substring(class226.field2948.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                String var276 = var272.toLowerCase();
                                                                                                                                byte var277 = 0;
                                                                                                                                if (var276.startsWith(class226.field3053)) {
                                                                                                                                    var277 = 1;
                                                                                                                                    var272 = var272.substring(class226.field3053.length());
                                                                                                                                } else if (var276.startsWith(class226.field2952)) {
                                                                                                                                    var277 = 2;
                                                                                                                                    var272 = var272.substring(class226.field2952.length());
                                                                                                                                } else if (var276.startsWith(class226.field3057)) {
                                                                                                                                    var277 = 3;
                                                                                                                                    var272 = var272.substring(class226.field3057.length());
                                                                                                                                } else if (var276.startsWith(class226.field3059)) {
                                                                                                                                    var277 = 4;
                                                                                                                                    var272 = var272.substring(class226.field3059.length());
                                                                                                                                } else if (var276.startsWith(class226.field3112)) {
                                                                                                                                    var277 = 5;
                                                                                                                                    var272 = var272.substring(class226.field3112.length());
                                                                                                                                } else if (client.field1078 != 0) {
                                                                                                                                    if (var276.startsWith(class226.field3054)) {
                                                                                                                                        var277 = 1;
                                                                                                                                        var272 = var272.substring(class226.field3054.length());
                                                                                                                                    } else if (var276.startsWith(class226.field3056)) {
                                                                                                                                        var277 = 2;
                                                                                                                                        var272 = var272.substring(class226.field3056.length());
                                                                                                                                    } else if (var276.startsWith(class226.field3058)) {
                                                                                                                                        var277 = 3;
                                                                                                                                        var272 = var272.substring(class226.field3058.length());
                                                                                                                                    } else if (var276.startsWith(class226.field3060)) {
                                                                                                                                        var277 = 4;
                                                                                                                                        var272 = var272.substring(class226.field3060.length());
                                                                                                                                    } else if (var276.startsWith(class226.field3062)) {
                                                                                                                                        var277 = 5;
                                                                                                                                        var272 = var272.substring(class226.field3062.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field973.method3105(250);
                                                                                                                                client.field973.method2865(0);
                                                                                                                                int var278 = client.field973.field2407;
                                                                                                                                client.field973.method2865(var273);
                                                                                                                                client.field973.method2865(var275);
                                                                                                                                client.field973.method2865(var277);
                                                                                                                                class180 var279 = client.field973;
                                                                                                                                int var280 = var279.field2407;
                                                                                                                                int var281 = var272.length();
                                                                                                                                byte[] var282 = new byte[var281];
                                                                                                                                int var283 = 0;
                                                                                                                                while (true) {
                                                                                                                                    if (var283 >= var281) {
                                                                                                                                        var279.method2868(var282.length);
                                                                                                                                        var279.field2407 += Statics.field3655.method2802(var282, 0, var282.length, var279.field2415, var279.field2407);
                                                                                                                                        client.field973.method2867(client.field973.field2407 - var278);
                                                                                                                                        var258 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    char var284 = var272.charAt(var283);
                                                                                                                                    if (var284 > 0 && var284 < 128 || var284 >= 160 && var284 <= 255) {
                                                                                                                                        var282[var283] = (byte) var284;
                                                                                                                                    } else if (var284 == 8364) {
                                                                                                                                        var282[var283] = -128;
                                                                                                                                    } else if (var284 == 8218) {
                                                                                                                                        var282[var283] = -126;
                                                                                                                                    } else if (var284 == 402) {
                                                                                                                                        var282[var283] = -125;
                                                                                                                                    } else if (var284 == 8222) {
                                                                                                                                        var282[var283] = -124;
                                                                                                                                    } else if (var284 == 8230) {
                                                                                                                                        var282[var283] = -123;
                                                                                                                                    } else if (var284 == 8224) {
                                                                                                                                        var282[var283] = -122;
                                                                                                                                    } else if (var284 == 8225) {
                                                                                                                                        var282[var283] = -121;
                                                                                                                                    } else if (var284 == 710) {
                                                                                                                                        var282[var283] = -120;
                                                                                                                                    } else if (var284 == 8240) {
                                                                                                                                        var282[var283] = -119;
                                                                                                                                    } else if (var284 == 352) {
                                                                                                                                        var282[var283] = -118;
                                                                                                                                    } else if (var284 == 8249) {
                                                                                                                                        var282[var283] = -117;
                                                                                                                                    } else if (var284 == 338) {
                                                                                                                                        var282[var283] = -116;
                                                                                                                                    } else if (var284 == 381) {
                                                                                                                                        var282[var283] = -114;
                                                                                                                                    } else if (var284 == 8216) {
                                                                                                                                        var282[var283] = -111;
                                                                                                                                    } else if (var284 == 8217) {
                                                                                                                                        var282[var283] = -110;
                                                                                                                                    } else if (var284 == 8220) {
                                                                                                                                        var282[var283] = -109;
                                                                                                                                    } else if (var284 == 8221) {
                                                                                                                                        var282[var283] = -108;
                                                                                                                                    } else if (var284 == 8226) {
                                                                                                                                        var282[var283] = -107;
                                                                                                                                    } else if (var284 == 8211) {
                                                                                                                                        var282[var283] = -106;
                                                                                                                                    } else if (var284 == 8212) {
                                                                                                                                        var282[var283] = -105;
                                                                                                                                    } else if (var284 == 732) {
                                                                                                                                        var282[var283] = -104;
                                                                                                                                    } else if (var284 == 8482) {
                                                                                                                                        var282[var283] = -103;
                                                                                                                                    } else if (var284 == 353) {
                                                                                                                                        var282[var283] = -102;
                                                                                                                                    } else if (var284 == 8250) {
                                                                                                                                        var282[var283] = -101;
                                                                                                                                    } else if (var284 == 339) {
                                                                                                                                        var282[var283] = -100;
                                                                                                                                    } else if (var284 == 382) {
                                                                                                                                        var282[var283] = -98;
                                                                                                                                    } else if (var284 == 376) {
                                                                                                                                        var282[var283] = -97;
                                                                                                                                    } else {
                                                                                                                                        var282[var283] = 63;
                                                                                                                                    }
                                                                                                                                    var283++;
                                                                                                                                }
                                                                                                                            } else if (var414 == 5009) {
                                                                                                                                Statics.field667 -= 2;
                                                                                                                                String var287 = field1371[Statics.field667];
                                                                                                                                String var288 = field1371[Statics.field667 + 1];
                                                                                                                                client.field973.method3105(117);
                                                                                                                                client.field973.method2856(0);
                                                                                                                                int var289 = client.field973.field2407;
                                                                                                                                client.field973.method2879(var287);
                                                                                                                                class180 var290 = client.field973;
                                                                                                                                int var291 = var290.field2407;
                                                                                                                                int var292 = var288.length();
                                                                                                                                byte[] var293 = new byte[var292];
                                                                                                                                int var294 = 0;
                                                                                                                                while (true) {
                                                                                                                                    if (var294 >= var292) {
                                                                                                                                        var290.method2868(var293.length);
                                                                                                                                        var290.field2407 += Statics.field3655.method2802(var293, 0, var293.length, var290.field2415, var290.field2407);
                                                                                                                                        client.field973.method2921(client.field973.field2407 - var289);
                                                                                                                                        var258 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    char var295 = var288.charAt(var294);
                                                                                                                                    if (!(var295 <= 0 || var295 >= 128) || !(var295 < 160 || var295 > 255)) {
                                                                                                                                        var293[var294] = (byte) var295;
                                                                                                                                    } else if (var295 == 8364) {
                                                                                                                                        var293[var294] = -128;
                                                                                                                                    } else if (var295 == 8218) {
                                                                                                                                        var293[var294] = -126;
                                                                                                                                    } else if (var295 == 402) {
                                                                                                                                        var293[var294] = -125;
                                                                                                                                    } else if (var295 == 8222) {
                                                                                                                                        var293[var294] = -124;
                                                                                                                                    } else if (var295 == 8230) {
                                                                                                                                        var293[var294] = -123;
                                                                                                                                    } else if (var295 == 8224) {
                                                                                                                                        var293[var294] = -122;
                                                                                                                                    } else if (var295 == 8225) {
                                                                                                                                        var293[var294] = -121;
                                                                                                                                    } else if (var295 == 710) {
                                                                                                                                        var293[var294] = -120;
                                                                                                                                    } else if (var295 == 8240) {
                                                                                                                                        var293[var294] = -119;
                                                                                                                                    } else if (var295 == 352) {
                                                                                                                                        var293[var294] = -118;
                                                                                                                                    } else if (var295 == 8249) {
                                                                                                                                        var293[var294] = -117;
                                                                                                                                    } else if (var295 == 338) {
                                                                                                                                        var293[var294] = -116;
                                                                                                                                    } else if (var295 == 381) {
                                                                                                                                        var293[var294] = -114;
                                                                                                                                    } else if (var295 == 8216) {
                                                                                                                                        var293[var294] = -111;
                                                                                                                                    } else if (var295 == 8217) {
                                                                                                                                        var293[var294] = -110;
                                                                                                                                    } else if (var295 == 8220) {
                                                                                                                                        var293[var294] = -109;
                                                                                                                                    } else if (var295 == 8221) {
                                                                                                                                        var293[var294] = -108;
                                                                                                                                    } else if (var295 == 8226) {
                                                                                                                                        var293[var294] = -107;
                                                                                                                                    } else if (var295 == 8211) {
                                                                                                                                        var293[var294] = -106;
                                                                                                                                    } else if (var295 == 8212) {
                                                                                                                                        var293[var294] = -105;
                                                                                                                                    } else if (var295 == 732) {
                                                                                                                                        var293[var294] = -104;
                                                                                                                                    } else if (var295 == 8482) {
                                                                                                                                        var293[var294] = -103;
                                                                                                                                    } else if (var295 == 353) {
                                                                                                                                        var293[var294] = -102;
                                                                                                                                    } else if (var295 == 8250) {
                                                                                                                                        var293[var294] = -101;
                                                                                                                                    } else if (var295 == 339) {
                                                                                                                                        var293[var294] = -100;
                                                                                                                                    } else if (var295 == 382) {
                                                                                                                                        var293[var294] = -98;
                                                                                                                                    } else if (var295 == 376) {
                                                                                                                                        var293[var294] = -97;
                                                                                                                                    } else {
                                                                                                                                        var293[var294] = 63;
                                                                                                                                    }
                                                                                                                                    var294++;
                                                                                                                                }
                                                                                                                            } else if (var414 == 5015) {
                                                                                                                                String var298;
                                                                                                                                if (Statics.field1321 == null || Statics.field1321.field906 == null) {
                                                                                                                                    var298 = "";
                                                                                                                                } else {
                                                                                                                                    var298 = Statics.field1321.field906;
                                                                                                                                }
                                                                                                                                field1371[++Statics.field667 - 1] = var298;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5016) {
                                                                                                                                field1363[++Statics.field1372 - 1] = client.field1148;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5017) {
                                                                                                                                int var299 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = class99.method1027(var299);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5018) {
                                                                                                                                int var300 = field1363[--Statics.field1372];
                                                                                                                                int[] var301 = field1363;
                                                                                                                                int var302 = ++Statics.field1372 - 1;
                                                                                                                                class73 var303 = (class73) class99.field1533.method3193((long) var300);
                                                                                                                                int var304;
                                                                                                                                if (var303 == null) {
                                                                                                                                    var304 = -1;
                                                                                                                                } else if (class99.field1535.field2500 == var303.field2485) {
                                                                                                                                    var304 = -1;
                                                                                                                                } else {
                                                                                                                                    var304 = ((class73) var303.field2485).field876;
                                                                                                                                }
                                                                                                                                var301[var302] = var304;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5019) {
                                                                                                                                int var305 = field1363[--Statics.field1372];
                                                                                                                                int[] var306 = field1363;
                                                                                                                                int var307 = ++Statics.field1372 - 1;
                                                                                                                                class73 var308 = (class73) class99.field1533.method3193((long) var305);
                                                                                                                                int var309;
                                                                                                                                if (var308 == null) {
                                                                                                                                    var309 = -1;
                                                                                                                                } else if (class99.field1535.field2500 == var308.field2486) {
                                                                                                                                    var309 = -1;
                                                                                                                                } else {
                                                                                                                                    var309 = ((class73) var308.field2486).field876;
                                                                                                                                }
                                                                                                                                var306[var307] = var309;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5020) {
                                                                                                                                String var310 = field1371[--Statics.field667];
                                                                                                                                if (var310.equalsIgnoreCase("toggleroof")) {
                                                                                                                                    Statics.field304.field1334 = !Statics.field304.field1334;
                                                                                                                                    class82.method943();
                                                                                                                                    if (Statics.field304.field1334) {
                                                                                                                                        class99.method107(99, "", "Roofs are now all hidden");
                                                                                                                                    } else {
                                                                                                                                        class99.method107(99, "", "Roofs will only be removed selectively");
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var310.equalsIgnoreCase("displayfps")) {
                                                                                                                                    client.field944 = !client.field944;
                                                                                                                                }
                                                                                                                                if (var310.equalsIgnoreCase("clickbox")) {
                                                                                                                                    class134.field1999 = !class134.field1999;
                                                                                                                                    class99.method107(99, "", "Clickbox Mode: " + (class134.field1999 ? "AABB" : "Legacy"));
                                                                                                                                }
                                                                                                                                if (client.field1098 >= 2) {
                                                                                                                                    if (var310.equalsIgnoreCase("aabb")) {
                                                                                                                                        if (!class8.field237) {
                                                                                                                                            class8.field237 = true;
                                                                                                                                            class8.field241 = class12.field264;
                                                                                                                                            class99.method107(99, "", "AABB boxes: All");
                                                                                                                                        } else if (class8.field241 == class12.field264) {
                                                                                                                                            class8.field237 = true;
                                                                                                                                            class8.field241 = class12.field269;
                                                                                                                                            class99.method107(99, "", "AABB boxes: Mouse Over");
                                                                                                                                        } else {
                                                                                                                                            class8.field237 = false;
                                                                                                                                            class99.method107(99, "", "AABB boxes: Off");
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var310.equalsIgnoreCase("legacyboxes")) {
                                                                                                                                        class8.field236 = !class8.field236;
                                                                                                                                        class99.method107(99, "", "Show legacy boxes: " + class8.field236);
                                                                                                                                    }
                                                                                                                                    if (var310.equalsIgnoreCase("geotests")) {
                                                                                                                                        class8.field238 = !class8.field238;
                                                                                                                                        class99.method107(99, "", "Show geometry tests: " + class8.field238);
                                                                                                                                    }
                                                                                                                                    if (var310.equalsIgnoreCase("fpson")) {
                                                                                                                                        client.field944 = true;
                                                                                                                                    }
                                                                                                                                    if (var310.equalsIgnoreCase("fpsoff")) {
                                                                                                                                        client.field944 = false;
                                                                                                                                    }
                                                                                                                                    if (var310.equalsIgnoreCase("gc")) {
                                                                                                                                        System.gc();
                                                                                                                                    }
                                                                                                                                    if (var310.equalsIgnoreCase("clientdrop")) {
                                                                                                                                        client.method1537();
                                                                                                                                    }
                                                                                                                                    if (var310.equalsIgnoreCase("errortest") && client.field932 == 2) {
                                                                                                                                        throw new RuntimeException();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field973.method3105(106);
                                                                                                                                client.field973.method2865(var310.length() + 1);
                                                                                                                                client.field973.method2879(var310);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5021) {
                                                                                                                                client.field1149 = field1371[--Statics.field667].toLowerCase().trim();
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var414 == 5022) {
                                                                                                                                field1371[++Statics.field667 - 1] = client.field1149;
                                                                                                                                var258 = 1;
                                                                                                                            } else {
                                                                                                                                var258 = 2;
                                                                                                                            }
                                                                                                                            var67 = var258;
                                                                                                                        } else if (var414 < 5400) {
                                                                                                                            var67 = method1565(var414, var6, var66);
                                                                                                                        } else if (var414 < 5600) {
                                                                                                                            var67 = method3132(var414, var6, var66);
                                                                                                                        } else if (var414 < 5700) {
                                                                                                                            byte var311;
                                                                                                                            if (var414 == 5630) {
                                                                                                                                client.field983 = 250;
                                                                                                                                var311 = 1;
                                                                                                                            } else {
                                                                                                                                var311 = 2;
                                                                                                                            }
                                                                                                                            var67 = var311;
                                                                                                                        } else if (var414 < 6300) {
                                                                                                                            var67 = method2367(var414, var6, var66);
                                                                                                                        } else if (var414 < 6600) {
                                                                                                                            byte var312;
                                                                                                                            if (var414 == 6500) {
                                                                                                                                field1363[++Statics.field1372 - 1] = class81.method180() ? 1 : 0;
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6501) {
                                                                                                                                class81 var313 = class81.method2690();
                                                                                                                                if (var313 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var313.field1328;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var313.field1322;
                                                                                                                                    field1371[++Statics.field667 - 1] = var313.field1325;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var313.field1326;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var313.field1320;
                                                                                                                                    field1371[++Statics.field667 - 1] = var313.field1324;
                                                                                                                                }
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6502) {
                                                                                                                                class81 var314 = class81.method31();
                                                                                                                                if (var314 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var314.field1328;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var314.field1322;
                                                                                                                                    field1371[++Statics.field667 - 1] = var314.field1325;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var314.field1326;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var314.field1320;
                                                                                                                                    field1371[++Statics.field667 - 1] = var314.field1324;
                                                                                                                                }
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6506) {
                                                                                                                                int var315 = field1363[--Statics.field1372];
                                                                                                                                class81 var316 = null;
                                                                                                                                for (int var317 = 0; var317 < class81.field1327; var317++) {
                                                                                                                                    if (Statics.field1316[var317].field1328 == var315) {
                                                                                                                                        var316 = Statics.field1316[var317];
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var316 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var316.field1328;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var316.field1322;
                                                                                                                                    field1371[++Statics.field667 - 1] = var316.field1325;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var316.field1326;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var316.field1320;
                                                                                                                                    field1371[++Statics.field667 - 1] = var316.field1324;
                                                                                                                                }
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6507) {
                                                                                                                                Statics.field1372 -= 4;
                                                                                                                                int var318 = field1363[Statics.field1372];
                                                                                                                                boolean var319 = field1363[Statics.field1372 + 1] == 1;
                                                                                                                                int var320 = field1363[Statics.field1372 + 2];
                                                                                                                                boolean var321 = field1363[Statics.field1372 + 3] == 1;
                                                                                                                                if (Statics.field1316 != null) {
                                                                                                                                    class81.method9(0, Statics.field1316.length - 1, var318, var319, var320, var321);
                                                                                                                                }
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6511) {
                                                                                                                                int var322 = field1363[--Statics.field1372];
                                                                                                                                if (var322 >= 0 && var322 < class81.field1327) {
                                                                                                                                    class81 var323 = Statics.field1316[var322];
                                                                                                                                    field1363[++Statics.field1372 - 1] = var323.field1328;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var323.field1322;
                                                                                                                                    field1371[++Statics.field667 - 1] = var323.field1325;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var323.field1326;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var323.field1320;
                                                                                                                                    field1371[++Statics.field667 - 1] = var323.field1324;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                }
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6512) {
                                                                                                                                client.field1157 = field1363[--Statics.field1372] == 1;
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6513) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var324 = field1363[Statics.field1372];
                                                                                                                                int var325 = field1363[Statics.field1372 + 1];
                                                                                                                                class252 var326 = class252.method469(var325);
                                                                                                                                if (var326.method4088()) {
                                                                                                                                    field1371[++Statics.field667 - 1] = class259.method3724(var324).method4298(var325, var326.field3388);
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = class259.method3724(var324).method4297(var325, var326.field3387);
                                                                                                                                }
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6514) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var327 = field1363[Statics.field1372];
                                                                                                                                int var328 = field1363[Statics.field1372 + 1];
                                                                                                                                class252 var329 = class252.method469(var328);
                                                                                                                                if (var329.method4088()) {
                                                                                                                                    field1371[++Statics.field667 - 1] = Statics.method3743(var327).method4185(var328, var329.field3388);
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = Statics.method3743(var327).method4184(var328, var329.field3387);
                                                                                                                                }
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6515) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var330 = field1363[Statics.field1372];
                                                                                                                                int var331 = field1363[Statics.field1372 + 1];
                                                                                                                                class252 var332 = class252.method469(var331);
                                                                                                                                if (var332.method4088()) {
                                                                                                                                    field1371[++Statics.field667 - 1] = class257.method2996(var330).method4286(var331, var332.field3388);
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = class257.method2996(var330).method4232(var331, var332.field3387);
                                                                                                                                }
                                                                                                                                var312 = 1;
                                                                                                                            } else if (var414 == 6516) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var333 = field1363[Statics.field1372];
                                                                                                                                int var334 = field1363[Statics.field1372 + 1];
                                                                                                                                class252 var335 = class252.method469(var334);
                                                                                                                                if (var335.method4088()) {
                                                                                                                                    String[] var336 = field1371;
                                                                                                                                    int var337 = ++Statics.field667 - 1;
                                                                                                                                    class253 var338 = (class253) class253.field3393.method3220((long) var333);
                                                                                                                                    class253 var339;
                                                                                                                                    if (var338 == null) {
                                                                                                                                        byte[] var340 = Statics.field3392.method3769(34, var333);
                                                                                                                                        class253 var341 = new class253();
                                                                                                                                        if (var340 != null) {
                                                                                                                                            var341.method4109(new class174(var340));
                                                                                                                                        }
                                                                                                                                        var341.method4118();
                                                                                                                                        class253.field3393.method3222(var341, (long) var333);
                                                                                                                                        var339 = var341;
                                                                                                                                    } else {
                                                                                                                                        var339 = var338;
                                                                                                                                    }
                                                                                                                                    var336[var337] = var339.method4117(var334, var335.field3388);
                                                                                                                                } else {
                                                                                                                                    int[] var342 = field1363;
                                                                                                                                    int var343 = ++Statics.field1372 - 1;
                                                                                                                                    class253 var344 = (class253) class253.field3393.method3220((long) var333);
                                                                                                                                    class253 var345;
                                                                                                                                    if (var344 == null) {
                                                                                                                                        byte[] var346 = Statics.field3392.method3769(34, var333);
                                                                                                                                        class253 var347 = new class253();
                                                                                                                                        if (var346 != null) {
                                                                                                                                            var347.method4109(new class174(var346));
                                                                                                                                        }
                                                                                                                                        var347.method4118();
                                                                                                                                        class253.field3393.method3222(var347, (long) var333);
                                                                                                                                        var345 = var347;
                                                                                                                                    } else {
                                                                                                                                        var345 = var344;
                                                                                                                                    }
                                                                                                                                    var342[var343] = var345.method4111(var334, var335.field3387);
                                                                                                                                }
                                                                                                                                var312 = 1;
                                                                                                                            } else {
                                                                                                                                var312 = 2;
                                                                                                                            }
                                                                                                                            var67 = var312;
                                                                                                                        } else if (var414 < 6700) {
                                                                                                                            byte var351;
                                                                                                                            if (var414 == 6600) {
                                                                                                                                int var348 = Statics.field2158;
                                                                                                                                int var349 = (Statics.field1321.field1275 >> 7) + Statics.field562;
                                                                                                                                int var350 = (Statics.field1321.field1244 >> 7) + Statics.field387;
                                                                                                                                client.method2270().method4863(var348, var349, var350, true);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6601) {
                                                                                                                                int var352 = field1363[--Statics.field1372];
                                                                                                                                String var353 = "";
                                                                                                                                class33 var354 = client.method2270().method4825(var352);
                                                                                                                                if (var354 != null) {
                                                                                                                                    var353 = var354.method241();
                                                                                                                                }
                                                                                                                                field1371[++Statics.field667 - 1] = var353;
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6602) {
                                                                                                                                int var355 = field1363[--Statics.field1372];
                                                                                                                                client.method2270().method4810(var355);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6603) {
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4822();
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6604) {
                                                                                                                                int var356 = field1363[--Statics.field1372];
                                                                                                                                client.method2270().method4869(var356);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6605) {
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4824() ? 1 : 0;
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6606) {
                                                                                                                                class213 var357 = new class213(field1363[--Statics.field1372]);
                                                                                                                                client.method2270().method4826(var357.field2617, var357.field2615);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6607) {
                                                                                                                                class213 var358 = new class213(field1363[--Statics.field1372]);
                                                                                                                                client.method2270().method4917(var358.field2617, var358.field2615);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6608) {
                                                                                                                                class213 var359 = new class213(field1363[--Statics.field1372]);
                                                                                                                                client.method2270().method4828(var359.field2616, var359.field2617, var359.field2615);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6609) {
                                                                                                                                class213 var360 = new class213(field1363[--Statics.field1372]);
                                                                                                                                client.method2270().method4829(var360.field2616, var360.field2617, var360.field2615);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6610) {
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4887();
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4831();
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6611) {
                                                                                                                                int var361 = field1363[--Statics.field1372];
                                                                                                                                class33 var362 = client.method2270().method4825(var361);
                                                                                                                                if (var362 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var362.method251().method3588();
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6612) {
                                                                                                                                int var363 = field1363[--Statics.field1372];
                                                                                                                                class33 var364 = client.method2270().method4825(var363);
                                                                                                                                if (var364 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = (var364.method245() - var364.method269() + 1) * 64;
                                                                                                                                    field1363[++Statics.field1372 - 1] = (var364.method247() - var364.method246() + 1) * 64;
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6613) {
                                                                                                                                int var365 = field1363[--Statics.field1372];
                                                                                                                                class33 var366 = client.method2270().method4825(var365);
                                                                                                                                if (var366 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var366.method269() * 64;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var366.method246() * 64;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var366.method245() * 64 + 64 - 1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var366.method247() * 64 + 64 - 1;
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6614) {
                                                                                                                                int var367 = field1363[--Statics.field1372];
                                                                                                                                class33 var368 = client.method2270().method4825(var367);
                                                                                                                                if (var368 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var368.method299();
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6615) {
                                                                                                                                class213 var369 = client.method2270().method4842();
                                                                                                                                if (var369 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var369.field2617;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var369.field2615;
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6616) {
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4837();
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6617) {
                                                                                                                                class213 var370 = new class213(field1363[--Statics.field1372]);
                                                                                                                                class33 var371 = client.method2270().method4812();
                                                                                                                                if (var371 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    var351 = 1;
                                                                                                                                } else {
                                                                                                                                    int[] var372 = var371.method235(var370.field2616, var370.field2617, var370.field2615);
                                                                                                                                    if (var372 == null) {
                                                                                                                                        field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                        field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1363[++Statics.field1372 - 1] = var372[0];
                                                                                                                                        field1363[++Statics.field1372 - 1] = var372[1];
                                                                                                                                    }
                                                                                                                                    var351 = 1;
                                                                                                                                }
                                                                                                                            } else if (var414 == 6618) {
                                                                                                                                class213 var373 = new class213(field1363[--Statics.field1372]);
                                                                                                                                class33 var374 = client.method2270().method4812();
                                                                                                                                if (var374 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    var351 = 1;
                                                                                                                                } else {
                                                                                                                                    class213 var375 = var374.method236(var373.field2617, var373.field2615);
                                                                                                                                    if (var375 == null) {
                                                                                                                                        field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1363[++Statics.field1372 - 1] = var375.method3588();
                                                                                                                                    }
                                                                                                                                    var351 = 1;
                                                                                                                                }
                                                                                                                            } else if (var414 == 6619) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var376 = field1363[Statics.field1372];
                                                                                                                                class213 var377 = new class213(field1363[Statics.field1372 + 1]);
                                                                                                                                Statics.method440(var376, var377, false);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6620) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var378 = field1363[Statics.field1372];
                                                                                                                                class213 var379 = new class213(field1363[Statics.field1372 + 1]);
                                                                                                                                Statics.method440(var378, var379, true);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6621) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var380 = field1363[Statics.field1372];
                                                                                                                                class213 var381 = new class213(field1363[Statics.field1372 + 1]);
                                                                                                                                class33 var382 = client.method2270().method4825(var380);
                                                                                                                                if (var382 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = 0;
                                                                                                                                    var351 = 1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var382.method233(var381.field2616, var381.field2617, var381.field2615) ? 1 : 0;
                                                                                                                                    var351 = 1;
                                                                                                                                }
                                                                                                                            } else if (var414 == 6622) {
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4923();
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4834();
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6623) {
                                                                                                                                class213 var383 = new class213(field1363[--Statics.field1372]);
                                                                                                                                class33 var384 = client.method2270().method4808(var383.field2616, var383.field2617, var383.field2615);
                                                                                                                                if (var384 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var384.method243();
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6624) {
                                                                                                                                client.method2270().method4907(field1363[--Statics.field1372]);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6625) {
                                                                                                                                client.method2270().method4836();
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6626) {
                                                                                                                                client.method2270().method4902(field1363[--Statics.field1372]);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6627) {
                                                                                                                                client.method2270().method4888();
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6628) {
                                                                                                                                boolean var385 = field1363[--Statics.field1372] == 1;
                                                                                                                                client.method2270().method4839(var385);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6629) {
                                                                                                                                int var386 = field1363[--Statics.field1372];
                                                                                                                                client.method2270().method4840(var386);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6630) {
                                                                                                                                int var387 = field1363[--Statics.field1372];
                                                                                                                                client.method2270().method4841(var387);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6631) {
                                                                                                                                client.method2270().method4958();
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6632) {
                                                                                                                                boolean var388 = field1363[--Statics.field1372] == 1;
                                                                                                                                client.method2270().method4843(var388);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6633) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var389 = field1363[Statics.field1372];
                                                                                                                                boolean var390 = field1363[Statics.field1372 + 1] == 1;
                                                                                                                                client.method2270().method4928(var389, var390);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6634) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var391 = field1363[Statics.field1372];
                                                                                                                                boolean var392 = field1363[Statics.field1372 + 1] == 1;
                                                                                                                                client.method2270().method4933(var391, var392);
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6635) {
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4846() ? 1 : 0;
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6636) {
                                                                                                                                int var393 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4851(var393) ? 1 : 0;
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6637) {
                                                                                                                                int var394 = field1363[--Statics.field1372];
                                                                                                                                field1363[++Statics.field1372 - 1] = client.method2270().method4848(var394) ? 1 : 0;
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6638) {
                                                                                                                                Statics.field1372 -= 2;
                                                                                                                                int var395 = field1363[Statics.field1372];
                                                                                                                                class213 var396 = new class213(field1363[Statics.field1372 + 1]);
                                                                                                                                class213 var397 = client.method2270().method4895(var395, var396);
                                                                                                                                if (var397 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var397.method3588();
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6639) {
                                                                                                                                class40 var398 = client.method2270().method4861();
                                                                                                                                if (var398 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var398.field537;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var398.field526.method3588();
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6640) {
                                                                                                                                class40 var399 = client.method2270().method4854();
                                                                                                                                if (var399 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var399.field537;
                                                                                                                                    field1363[++Statics.field1372 - 1] = var399.field526.method3588();
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6693) {
                                                                                                                                int var400 = field1363[--Statics.field1372];
                                                                                                                                class243 var401 = Statics.field2840[var400];
                                                                                                                                if (var401.field3296 == null) {
                                                                                                                                    field1371[++Statics.field667 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1371[++Statics.field667 - 1] = var401.field3296;
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6694) {
                                                                                                                                int var402 = field1363[--Statics.field1372];
                                                                                                                                class243 var403 = Statics.field2840[var402];
                                                                                                                                field1363[++Statics.field1372 - 1] = var403.field3311;
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6695) {
                                                                                                                                int var404 = field1363[--Statics.field1372];
                                                                                                                                class243 var405 = Statics.field2840[var404];
                                                                                                                                if (var405 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var405.field3298;
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6696) {
                                                                                                                                int var406 = field1363[--Statics.field1372];
                                                                                                                                class243 var407 = Statics.field2840[var406];
                                                                                                                                if (var407 == null) {
                                                                                                                                    field1363[++Statics.field1372 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1363[++Statics.field1372 - 1] = var407.field3294;
                                                                                                                                }
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6697) {
                                                                                                                                field1363[++Statics.field1372 - 1] = Statics.field586.field607;
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6698) {
                                                                                                                                field1363[++Statics.field1372 - 1] = Statics.field586.field616.method3588();
                                                                                                                                var351 = 1;
                                                                                                                            } else if (var414 == 6699) {
                                                                                                                                field1363[++Statics.field1372 - 1] = Statics.field586.field605.method3588();
                                                                                                                                var351 = 1;
                                                                                                                            } else {
                                                                                                                                var351 = 2;
                                                                                                                            }
                                                                                                                            var67 = var351;
                                                                                                                        } else {
                                                                                                                            var67 = 2;
                                                                                                                        }
                                                                                                                        switch(var67) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var414 == 0) {
                                                                                                                        field1363[++Statics.field1372 - 1] = var10[var8];
                                                                                                                    } else if (var414 == 1) {
                                                                                                                        int var18 = var10[var8];
                                                                                                                        field1363[++Statics.field1372 - 1] = class212.field2609[var18];
                                                                                                                    } else if (var414 == 2) {
                                                                                                                        int var19 = var10[var8];
                                                                                                                        class212.field2609[var19] = field1363[--Statics.field1372];
                                                                                                                        client.method40(var19);
                                                                                                                    } else if (var414 == 3) {
                                                                                                                        field1371[++Statics.field667 - 1] = var6.field1540[var8];
                                                                                                                    } else if (var414 == 6) {
                                                                                                                        var8 += var10[var8];
                                                                                                                    } else if (var414 == 7) {
                                                                                                                        Statics.field1372 -= 2;
                                                                                                                        if (field1363[Statics.field1372] != field1363[Statics.field1372 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var414 == 8) {
                                                                                                                        Statics.field1372 -= 2;
                                                                                                                        if (field1363[Statics.field1372] == field1363[Statics.field1372 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var414 == 9) {
                                                                                                                        Statics.field1372 -= 2;
                                                                                                                        if (field1363[Statics.field1372] < field1363[Statics.field1372 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var414 == 10) {
                                                                                                                        Statics.field1372 -= 2;
                                                                                                                        if (field1363[Statics.field1372] > field1363[Statics.field1372 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var414 == 21) {
                                                                                                                        if (field1365 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var20 = field1366[--field1365];
                                                                                                                        var6 = var20.field777;
                                                                                                                        var9 = var6.field1538;
                                                                                                                        var10 = var6.field1549;
                                                                                                                        var8 = var20.field776;
                                                                                                                        Statics.field1357 = var20.field778;
                                                                                                                        Statics.field1370 = var20.field786;
                                                                                                                    } else if (var414 == 25) {
                                                                                                                        int var21 = var10[var8];
                                                                                                                        field1363[++Statics.field1372 - 1] = class212.method2144(var21);
                                                                                                                    } else if (var414 == 27) {
                                                                                                                        int var22 = var10[var8];
                                                                                                                        int var23 = field1363[--Statics.field1372];
                                                                                                                        class251 var24 = (class251) class251.field3380.method3220((long) var22);
                                                                                                                        class251 var25;
                                                                                                                        if (var24 == null) {
                                                                                                                            byte[] var26 = Statics.field3381.method3769(14, var22);
                                                                                                                            class251 var27 = new class251();
                                                                                                                            if (var26 != null) {
                                                                                                                                var27.method4074(new class174(var26));
                                                                                                                            }
                                                                                                                            class251.field3380.method3222(var27, (long) var22);
                                                                                                                            var25 = var27;
                                                                                                                        } else {
                                                                                                                            var25 = var24;
                                                                                                                        }
                                                                                                                        int var29 = var25.field3379;
                                                                                                                        int var30 = var25.field3382;
                                                                                                                        int var31 = var25.field3383;
                                                                                                                        int var32 = class212.field2613[var31 - var30];
                                                                                                                        if (var23 < 0 || var23 > var32) {
                                                                                                                            var23 = 0;
                                                                                                                        }
                                                                                                                        int var33 = var32 << var30;
                                                                                                                        class212.field2609[var29] = class212.field2609[var29] & ~var33 | var23 << var30 & var33;
                                                                                                                    } else if (var414 == 31) {
                                                                                                                        Statics.field1372 -= 2;
                                                                                                                        if (field1363[Statics.field1372] <= field1363[Statics.field1372 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var414 == 32) {
                                                                                                                        Statics.field1372 -= 2;
                                                                                                                        if (field1363[Statics.field1372] >= field1363[Statics.field1372 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var414 == 33) {
                                                                                                                        field1363[++Statics.field1372 - 1] = Statics.field1357[var10[var8]];
                                                                                                                    } else if (var414 == 34) {
                                                                                                                        Statics.field1357[var10[var8]] = field1363[--Statics.field1372];
                                                                                                                    } else if (var414 == 35) {
                                                                                                                        field1371[++Statics.field667 - 1] = Statics.field1370[var10[var8]];
                                                                                                                    } else if (var414 == 36) {
                                                                                                                        Statics.field1370[var10[var8]] = field1371[--Statics.field667];
                                                                                                                    } else if (var414 == 37) {
                                                                                                                        int var34 = var10[var8];
                                                                                                                        Statics.field667 -= var34;
                                                                                                                        String[] var35 = field1371;
                                                                                                                        int var36 = Statics.field667;
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
                                                                                                                        field1371[++Statics.field667 - 1] = var37;
                                                                                                                    } else if (var414 == 38) {
                                                                                                                        Statics.field1372--;
                                                                                                                    } else if (var414 == 39) {
                                                                                                                        Statics.field667--;
                                                                                                                    } else if (var414 == 40) {
                                                                                                                        int var47 = var10[var8];
                                                                                                                        class100 var48 = class100.method2653(var47);
                                                                                                                        int[] var49 = new int[var48.field1552];
                                                                                                                        String[] var50 = new String[var48.field1542];
                                                                                                                        for (int var51 = 0; var51 < var48.field1537; var51++) {
                                                                                                                            var49[var51] = field1363[Statics.field1372 - var48.field1537 + var51];
                                                                                                                        }
                                                                                                                        for (int var52 = 0; var52 < var48.field1544; var52++) {
                                                                                                                            var50[var52] = field1371[Statics.field667 - var48.field1544 + var52];
                                                                                                                        }
                                                                                                                        Statics.field1372 -= var48.field1537;
                                                                                                                        Statics.field667 -= var48.field1544;
                                                                                                                        class63 var53 = new class63();
                                                                                                                        var53.field777 = var6;
                                                                                                                        var53.field776 = var8;
                                                                                                                        var53.field778 = Statics.field1357;
                                                                                                                        var53.field786 = Statics.field1370;
                                                                                                                        field1366[++field1365 - 1] = var53;
                                                                                                                        var6 = var48;
                                                                                                                        var9 = var48.field1538;
                                                                                                                        var10 = var48.field1549;
                                                                                                                        var8 = -1;
                                                                                                                        Statics.field1357 = var49;
                                                                                                                        Statics.field1370 = var50;
                                                                                                                    } else if (var414 == 42) {
                                                                                                                        field1363[++Statics.field1372 - 1] = Statics.field917.method1643(var10[var8]);
                                                                                                                    } else if (var414 == 43) {
                                                                                                                        Statics.field917.method1669(var10[var8], field1363[--Statics.field1372]);
                                                                                                                    } else if (var414 == 44) {
                                                                                                                        int var54 = var10[var8] >> 16;
                                                                                                                        int var55 = var10[var8] & 0xFFFF;
                                                                                                                        int var56 = field1363[--Statics.field1372];
                                                                                                                        if (var56 >= 0 && var56 <= 5000) {
                                                                                                                            field1360[var54] = var56;
                                                                                                                            byte var57 = -1;
                                                                                                                            if (var55 == 105) {
                                                                                                                                var57 = 0;
                                                                                                                            }
                                                                                                                            int var58 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var58 >= var56) {
                                                                                                                                    continue label2456;
                                                                                                                                }
                                                                                                                                field1358[var54][var58] = var57;
                                                                                                                                var58++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var414 == 45) {
                                                                                                                        int var59 = var10[var8];
                                                                                                                        int var60 = field1363[--Statics.field1372];
                                                                                                                        if (var60 < 0 || var60 >= field1360[var59]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1363[++Statics.field1372 - 1] = field1358[var59][var60];
                                                                                                                    } else if (var414 == 46) {
                                                                                                                        int var61 = var10[var8];
                                                                                                                        Statics.field1372 -= 2;
                                                                                                                        int var62 = field1363[Statics.field1372];
                                                                                                                        if (var62 < 0 || var62 >= field1360[var61]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1358[var61][var62] = field1363[Statics.field1372 + 1];
                                                                                                                    } else if (var414 == 47) {
                                                                                                                        String var63 = Statics.field917.method1645(var10[var8]);
                                                                                                                        if (var63 == null) {
                                                                                                                            var63 = "null";
                                                                                                                        }
                                                                                                                        field1371[++Statics.field667 - 1] = var63;
                                                                                                                    } else if (var414 == 48) {
                                                                                                                        Statics.field917.method1644(var10[var8], field1371[--Statics.field667]);
                                                                                                                    } else if (var414 == 60) {
                                                                                                                        class187 var64 = var6.field1545[var10[var8]];
                                                                                                                        class199 var65 = (class199) var64.method3193((long) field1363[--Statics.field1372]);
                                                                                                                        if (var65 != null) {
                                                                                                                            var8 += var65.field2495;
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
        } catch (Exception var413) {
            StringBuilder var410 = new StringBuilder(30);
            var410.append("").append(var6.field2480).append(" ");
            for (int var411 = field1365 - 1; var411 >= 0; var411--) {
                var410.append("").append(field1366[var411].field777.field2480).append(" ");
            }
            var410.append("").append(var11);
            class153.method131(var410.toString(), var413);
        }
    }

    @ObfuscatedName("cs.e(ILcz;ZI)I")
    public static int method1401(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1372 -= 3;
            int var3 = field1363[Statics.field1372];
            int var4 = field1363[Statics.field1372 + 1];
            int var5 = field1363[Statics.field1372 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class217 var6 = class217.method192(var3);
            if (var6.field2776 == null) {
                var6.field2776 = new class217[var5 + 1];
            }
            if (var6.field2776.length <= var5) {
                class217[] var7 = new class217[var5 + 1];
                for (int var8 = 0; var8 < var6.field2776.length; var8++) {
                    var7[var8] = var6.field2776[var8];
                }
                var6.field2776 = var7;
            }
            if (var5 > 0 && var6.field2776[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class217 var9 = new class217();
            var9.field2675 = var4;
            var9.field2786 = var9.field2652 = var6.field2652;
            var9.field2653 = var5;
            var9.field2651 = true;
            var6.field2776[var5] = var9;
            if (arg2) {
                Statics.field3188 = var9;
            } else {
                Statics.field16 = var9;
            }
            client.method162(var6);
            return 1;
        } else if (arg0 == 101) {
            class217 var10 = arg2 ? Statics.field3188 : Statics.field16;
            class217 var11 = class217.method192(var10.field2652);
            var11.field2776[var10.field2653] = null;
            client.method162(var11);
            return 1;
        } else if (arg0 == 102) {
            class217 var12 = class217.method192(field1363[--Statics.field1372]);
            var12.field2776 = null;
            client.method162(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1372 -= 2;
            int var13 = field1363[Statics.field1372];
            int var14 = field1363[Statics.field1372 + 1];
            class217 var15 = class217.method2132(var13, var14);
            if (var15 == null || var14 == -1) {
                field1363[++Statics.field1372 - 1] = 0;
            } else {
                field1363[++Statics.field1372 - 1] = 1;
                if (arg2) {
                    Statics.field3188 = var15;
                } else {
                    Statics.field16 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class217 var16 = class217.method192(field1363[--Statics.field1372]);
            if (var16 == null) {
                field1363[++Statics.field1372 - 1] = 0;
            } else {
                field1363[++Statics.field1372 - 1] = 1;
                if (arg2) {
                    Statics.field3188 = var16;
                } else {
                    Statics.field16 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("co.v(ILcz;ZI)I")
    public static int method1557(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1363[--Statics.field1372];
            var4 = class217.method192(var3);
        } else {
            var4 = arg2 ? Statics.field3188 : Statics.field16;
        }
        if (arg0 == 1000) {
            Statics.field1372 -= 4;
            var4.field2661 = field1363[Statics.field1372];
            var4.field2662 = field1363[Statics.field1372 + 1];
            var4.field2657 = field1363[Statics.field1372 + 2];
            var4.field2644 = field1363[Statics.field1372 + 3];
            client.method162(var4);
            Statics.field1215.method1243(var4);
            if (var3 != -1 && var4.field2675 == 0) {
                client.method3876(Statics.field1309[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1372 -= 4;
            var4.field2705 = field1363[Statics.field1372];
            var4.field2641 = field1363[Statics.field1372 + 1];
            var4.field2659 = field1363[Statics.field1372 + 2];
            var4.field2660 = field1363[Statics.field1372 + 3];
            client.method162(var4);
            Statics.field1215.method1243(var4);
            if (var3 != -1 && var4.field2675 == 0) {
                client.method3876(Statics.field1309[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1363[--Statics.field1372] == 1;
            if (var4.field2672 != var5) {
                var4.field2672 = var5;
                client.method162(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2785 = field1363[--Statics.field1372] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2764 = field1363[--Statics.field1372] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.b(ILcz;ZI)I")
    public static int method3746(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1363[--Statics.field1372];
            var4 = class217.method192(var3);
        } else {
            var4 = arg2 ? Statics.field3188 : Statics.field16;
        }
        if (arg0 == 1100) {
            Statics.field1372 -= 2;
            var4.field2673 = field1363[Statics.field1372];
            if (var4.field2673 > var4.field2707 - var4.field2750) {
                var4.field2673 = var4.field2707 - var4.field2750;
            }
            if (var4.field2673 < 0) {
                var4.field2673 = 0;
            }
            var4.field2754 = field1363[Statics.field1372 + 1];
            if (var4.field2754 > var4.field2646 - var4.field2689) {
                var4.field2754 = var4.field2646 - var4.field2689;
            }
            if (var4.field2754 < 0) {
                var4.field2754 = 0;
            }
            client.method162(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2677 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2681 = field1363[--Statics.field1372] == 1;
            client.method162(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2683 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2685 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2713 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2688 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2690 = field1363[--Statics.field1372] == 1;
            client.method162(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2695 = 1;
            var4.field2696 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1372 -= 6;
            var4.field2701 = field1363[Statics.field1372];
            var4.field2702 = field1363[Statics.field1372 + 1];
            var4.field2703 = field1363[Statics.field1372 + 2];
            var4.field2704 = field1363[Statics.field1372 + 3];
            var4.field2723 = field1363[Statics.field1372 + 4];
            var4.field2706 = field1363[Statics.field1372 + 5];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1363[--Statics.field1372];
            if (var4.field2699 != var5) {
                var4.field2699 = var5;
                var4.field2676 = 0;
                var4.field2775 = 0;
                client.method162(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2784 = field1363[--Statics.field1372] == 1;
            client.method162(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1371[--Statics.field667];
            if (!var6.equals(var4.field2712)) {
                var4.field2712 = var6;
                client.method162(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2711 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1372 -= 3;
            var4.field2715 = field1363[Statics.field1372];
            var4.field2716 = field1363[Statics.field1372 + 1];
            var4.field2714 = field1363[Statics.field1372 + 2];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2717 = field1363[--Statics.field1372] == 1;
            client.method162(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2691 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2692 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2693 = field1363[--Statics.field1372] == 1;
            client.method162(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2694 = field1363[--Statics.field1372] == 1;
            client.method162(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1372 -= 2;
            var4.field2707 = field1363[Statics.field1372];
            var4.field2646 = field1363[Statics.field1372 + 1];
            client.method162(var4);
            if (var3 != -1 && var4.field2675 == 0) {
                client.method3876(Statics.field1309[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3755(var4.field2652, var4.field2653);
            client.field964 = var4;
            client.method162(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2663 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2709 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2684 = field1363[--Statics.field1372];
            client.method162(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1363[--Statics.field1372];
            class284 var8 = (class284) class169.method1610(class284.method2654(), var7);
            if (var8 != null) {
                var4.field2682 = var8;
                client.method162(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1363[--Statics.field1372] == 1;
            var4.field2783 = var9;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.y(ILcz;ZI)I")
    public static int method565(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method192(field1363[--Statics.field1372]);
        } else {
            var3 = arg2 ? Statics.field3188 : Statics.field16;
        }
        client.method162(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1372 -= 2;
            int var4 = field1363[Statics.field1372];
            int var5 = field1363[Statics.field1372 + 1];
            var3.field2674 = var4;
            var3.field2773 = var5;
            class257 var6 = class257.method2996(var4);
            var3.field2703 = var6.field3483;
            var3.field2704 = var6.field3520;
            var3.field2723 = var6.field3501;
            var3.field2701 = var6.field3502;
            var3.field2702 = var6.field3535;
            var3.field2706 = var6.field3498;
            if (arg0 == 1205) {
                var3.field2710 = 0;
            } else if (arg0 == 1212 | var6.field3504 == 1) {
                var3.field2710 = 1;
            } else {
                var3.field2710 = 2;
            }
            if (var3.field2744 > 0) {
                var3.field2706 = var3.field2706 * 32 / var3.field2744;
            } else if (var3.field2705 > 0) {
                var3.field2706 = var3.field2706 * 32 / var3.field2705;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2695 = 2;
            var3.field2696 = field1363[--Statics.field1372];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2695 = 3;
            var3.field2696 = Statics.field1321.field902.method3614();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gk.h(ILcz;ZI)I")
    public static int method3363(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method192(field1363[--Statics.field1372]);
        } else {
            var3 = arg2 ? Statics.field3188 : Statics.field16;
        }
        if (arg0 == 1300) {
            int var4 = field1363[--Statics.field1372] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3677(var4, field1371[--Statics.field667]);
                return 1;
            } else {
                Statics.field667--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1372 -= 2;
            int var5 = field1363[Statics.field1372];
            int var6 = field1363[Statics.field1372 + 1];
            var3.field2698 = class217.method2132(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2781 = field1363[--Statics.field1372] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2728 = field1363[--Statics.field1372];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2729 = field1363[--Statics.field1372];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2725 = field1371[--Statics.field667];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2731 = field1371[--Statics.field667];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2766 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.x(ILcz;ZB)I")
    public static int method944(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method192(field1363[--Statics.field1372]);
        } else {
            var3 = arg2 ? Statics.field3188 : Statics.field16;
        }
        String var4 = field1371[--Statics.field667];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1363[--Statics.field1372];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1363[--Statics.field1372];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1371[--Statics.field667];
            } else {
                var7[var8] = Integer.valueOf(field1363[--Statics.field1372]);
            }
        }
        int var9 = field1363[--Statics.field1372];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2734 = var7;
        } else if (arg0 == 1401) {
            var3.field2745 = var7;
        } else if (arg0 == 1402) {
            var3.field2736 = var7;
        } else if (arg0 == 1403) {
            var3.field2738 = var7;
        } else if (arg0 == 1404) {
            var3.field2740 = var7;
        } else if (arg0 == 1405) {
            var3.field2741 = var7;
        } else if (arg0 == 1406) {
            var3.field2649 = var7;
        } else if (arg0 == 1407) {
            var3.field2730 = var7;
            var3.field2746 = var5;
        } else if (arg0 == 1408) {
            var3.field2751 = var7;
        } else if (arg0 == 1409) {
            var3.field2752 = var7;
        } else if (arg0 == 1410) {
            var3.field2742 = var7;
        } else if (arg0 == 1411) {
            var3.field2735 = var7;
        } else if (arg0 == 1412) {
            var3.field2739 = var7;
        } else if (arg0 == 1414) {
            var3.field2747 = var7;
            var3.field2748 = var5;
        } else if (arg0 == 1415) {
            var3.field2749 = var7;
            var3.field2771 = var5;
        } else if (arg0 == 1416) {
            var3.field2774 = var7;
        } else if (arg0 == 1417) {
            var3.field2753 = var7;
        } else if (arg0 == 1418) {
            var3.field2658 = var7;
        } else if (arg0 == 1419) {
            var3.field2732 = var7;
        } else if (arg0 == 1420) {
            var3.field2758 = var7;
        } else if (arg0 == 1421) {
            var3.field2670 = var7;
        } else if (arg0 == 1422) {
            var3.field2726 = var7;
        } else if (arg0 == 1423) {
            var3.field2759 = var7;
        } else if (arg0 == 1424) {
            var3.field2760 = var7;
        } else if (arg0 == 1425) {
            var3.field2762 = var7;
        } else if (arg0 == 1426) {
            var3.field2763 = var7;
        } else if (arg0 == 1427) {
            var3.field2761 = var7;
        } else {
            return 2;
        }
        var3.field2727 = true;
        return 1;
    }

    @ObfuscatedName("t.f(ILcz;ZB)I")
    public static int method160(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field3188 : Statics.field16;
        if (arg0 == 1800) {
            int[] var4 = field1363;
            int var5 = ++Statics.field1372 - 1;
            int var6 = Statics.method3573(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1363[--Statics.field1372];
            int var9 = var8 - 1;
            if (var3.field2766 == null || var9 >= var3.field2766.length || var3.field2766[var9] == null) {
                field1371[++Statics.field667 - 1] = "";
            } else {
                field1371[++Statics.field667 - 1] = var3.field2766[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2725 == null) {
                field1371[++Statics.field667 - 1] = "";
            } else {
                field1371[++Statics.field667 - 1] = var3.field2725;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ff.n(ILcz;ZB)I")
    public static int method2746(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method192(field1363[--Statics.field1372]);
        } else {
            var3 = arg2 ? Statics.field3188 : Statics.field16;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1369 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2761 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field853 = var3;
            var4.field850 = var3.field2761;
            var4.field858 = field1369 + 1;
            client.field956.method3289(var4);
            return 1;
        }
    }

    @ObfuscatedName("ce.a(ILcz;ZI)I")
    public static int method1414(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method192(field1363[--Statics.field1372]);
        if (arg0 == 2500) {
            field1363[++Statics.field1372 - 1] = var3.field2665;
            return 1;
        } else if (arg0 == 2501) {
            field1363[++Statics.field1372 - 1] = var3.field2666;
            return 1;
        } else if (arg0 == 2502) {
            field1363[++Statics.field1372 - 1] = var3.field2750;
            return 1;
        } else if (arg0 == 2503) {
            field1363[++Statics.field1372 - 1] = var3.field2689;
            return 1;
        } else if (arg0 == 2504) {
            field1363[++Statics.field1372 - 1] = var3.field2672 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1363[++Statics.field1372 - 1] = var3.field2786;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.o(ILcz;ZS)I")
    public static int method8(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method192(field1363[--Statics.field1372]);
        if (arg0 == 2600) {
            field1363[++Statics.field1372 - 1] = var3.field2673;
            return 1;
        } else if (arg0 == 2601) {
            field1363[++Statics.field1372 - 1] = var3.field2754;
            return 1;
        } else if (arg0 == 2602) {
            field1371[++Statics.field667 - 1] = var3.field2712;
            return 1;
        } else if (arg0 == 2603) {
            field1363[++Statics.field1372 - 1] = var3.field2707;
            return 1;
        } else if (arg0 == 2604) {
            field1363[++Statics.field1372 - 1] = var3.field2646;
            return 1;
        } else if (arg0 == 2605) {
            field1363[++Statics.field1372 - 1] = var3.field2706;
            return 1;
        } else if (arg0 == 2606) {
            field1363[++Statics.field1372 - 1] = var3.field2703;
            return 1;
        } else if (arg0 == 2607) {
            field1363[++Statics.field1372 - 1] = var3.field2723;
            return 1;
        } else if (arg0 == 2608) {
            field1363[++Statics.field1372 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 2609) {
            field1363[++Statics.field1372 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 2610) {
            field1363[++Statics.field1372 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 2611) {
            field1363[++Statics.field1372 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 2612) {
            field1363[++Statics.field1372 - 1] = var3.field2709;
            return 1;
        } else if (arg0 == 2613) {
            field1363[++Statics.field1372 - 1] = var3.field2682.method6();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cx.z(ILcz;ZI)I")
    public static int method1611(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method192(field1363[--Statics.field1372]);
        if (arg0 == 2800) {
            int[] var4 = field1363;
            int var5 = ++Statics.field1372 - 1;
            int var6 = Statics.method3573(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 2801) {
            int var8 = field1363[--Statics.field1372];
            int var9 = var8 - 1;
            if (var3.field2766 == null || var9 >= var3.field2766.length || var3.field2766[var9] == null) {
                field1371[++Statics.field667 - 1] = "";
            } else {
                field1371[++Statics.field667 - 1] = var3.field2766[var9];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2725 == null) {
                field1371[++Statics.field667 - 1] = "";
            } else {
                field1371[++Statics.field667 - 1] = var3.field2725;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.q(ILcz;ZI)I")
    public static int method889(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1363[++Statics.field1372 - 1] = client.field938;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1372 -= 2;
            int var3 = field1363[Statics.field1372];
            int var4 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = class64.method448(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1372 -= 2;
            int var5 = field1363[Statics.field1372];
            int var6 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = class64.method1384(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1372 -= 2;
            int var7 = field1363[Statics.field1372];
            int var8 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = class64.method1718(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1363[--Statics.field1372];
            int[] var10 = field1363;
            int var11 = ++Statics.field1372 - 1;
            class241 var12 = (class241) class241.field3278.method3220((long) var9);
            class241 var13;
            if (var12 == null) {
                byte[] var14 = Statics.field3277.method3769(5, var9);
                class241 var15 = new class241();
                if (var14 != null) {
                    var15.method3923(new class174(var14));
                }
                class241.field3278.method3222(var15, (long) var9);
                var13 = var15;
            } else {
                var13 = var12;
            }
            var10[var11] = var13.field3280;
            return 1;
        } else if (arg0 == 3305) {
            int var16 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = client.field1065[var16];
            return 1;
        } else if (arg0 == 3306) {
            int var17 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = client.field1066[var17];
            return 1;
        } else if (arg0 == 3307) {
            int var18 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = client.field1205[var18];
            return 1;
        } else if (arg0 == 3308) {
            int var19 = Statics.field2158;
            int var20 = (Statics.field1321.field1275 >> 7) + Statics.field562;
            int var21 = (Statics.field1321.field1244 >> 7) + Statics.field387;
            field1363[++Statics.field1372 - 1] = (var19 << 28) + (var20 << 14) + var21;
            return 1;
        } else if (arg0 == 3309) {
            int var22 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = var22 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var23 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = var23 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var24 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = var24 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1363[++Statics.field1372 - 1] = client.field1002 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1372 -= 2;
            int var25 = field1363[Statics.field1372] + 32768;
            int var26 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = class64.method448(var25, var26);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1372 -= 2;
            int var27 = field1363[Statics.field1372] + 32768;
            int var28 = field1363[Statics.field1372 + 1];
            int[] var29 = field1363;
            int var30 = ++Statics.field1372 - 1;
            class64 var31 = (class64) class64.field797.method3238((long) var27);
            int var32;
            if (var31 == null) {
                var32 = 0;
            } else if (var28 >= 0 && var28 < var31.field789.length) {
                var32 = var31.field789[var28];
            } else {
                var32 = 0;
            }
            var29[var30] = var32;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1372 -= 2;
            int var33 = field1363[Statics.field1372] + 32768;
            int var34 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = class64.method1718(var33, var34);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field1098 >= 2) {
                field1363[++Statics.field1372 - 1] = client.field1098;
            } else {
                field1363[++Statics.field1372 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1363[++Statics.field1372 - 1] = client.field982;
            return 1;
        } else if (arg0 == 3318) {
            field1363[++Statics.field1372 - 1] = client.field930;
            return 1;
        } else if (arg0 == 3321) {
            field1363[++Statics.field1372 - 1] = client.field970;
            return 1;
        } else if (arg0 == 3322) {
            field1363[++Statics.field1372 - 1] = client.field1097;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field1100) {
                field1363[++Statics.field1372 - 1] = 1;
            } else {
                field1363[++Statics.field1372 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1363[++Statics.field1372 - 1] = client.field931;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1372 -= 4;
            int var35 = field1363[Statics.field1372];
            int var36 = field1363[Statics.field1372 + 1];
            int var37 = field1363[Statics.field1372 + 2];
            int var38 = field1363[Statics.field1372 + 3];
            int var39 = (var36 << 14) + var35;
            int var40 = (var37 << 28) + var39;
            int var41 = var38 + var40;
            field1363[++Statics.field1372 - 1] = var41;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("co.j(ILcz;ZI)I")
    public static int method1555(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1372 -= 2;
            int var3 = field1363[Statics.field1372];
            int var4 = field1363[Statics.field1372 + 1];
            class254 var5 = class254.method3074(var3);
            if (var5.field3401 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3398; var6++) {
                if (var5.field3404[var6] == var4) {
                    field1371[++Statics.field667 - 1] = var5.field3406[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1371[++Statics.field667 - 1] = var5.field3397;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1372 -= 4;
            int var7 = field1363[Statics.field1372];
            int var8 = field1363[Statics.field1372 + 1];
            int var9 = field1363[Statics.field1372 + 2];
            int var10 = field1363[Statics.field1372 + 3];
            class254 var11 = class254.method3074(var9);
            if (var11.field3399 != var7 || var11.field3401 != var8) {
                if (var8 == 115) {
                    field1371[++Statics.field667 - 1] = "null";
                } else {
                    field1363[++Statics.field1372 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3398; var12++) {
                if (var11.field3404[var12] == var10) {
                    if (var8 == 115) {
                        field1371[++Statics.field667 - 1] = var11.field3406[var12];
                    } else {
                        field1363[++Statics.field1372 - 1] = var11.field3405[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1371[++Statics.field667 - 1] = var11.field3397;
                } else {
                    field1363[++Statics.field1372 - 1] = var11.field3402;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ba.l(ILcz;ZB)I")
    public static int method972(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1372 -= 2;
            int var3 = field1363[Statics.field1372];
            int var4 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1372 -= 2;
            int var5 = field1363[Statics.field1372];
            int var6 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1372 -= 2;
            int var7 = field1363[Statics.field1372];
            int var8 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1372 -= 2;
            int var9 = field1363[Statics.field1372];
            int var10 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1372 -= 5;
            int var13 = field1363[Statics.field1372];
            int var14 = field1363[Statics.field1372 + 1];
            int var15 = field1363[Statics.field1372 + 2];
            int var16 = field1363[Statics.field1372 + 3];
            int var17 = field1363[Statics.field1372 + 4];
            field1363[++Statics.field1372 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1372 -= 2;
            int var18 = field1363[Statics.field1372];
            int var19 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1372 -= 2;
            int var20 = field1363[Statics.field1372];
            int var21 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1372 -= 2;
            int var22 = field1363[Statics.field1372];
            int var23 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1372 -= 2;
            int var24 = field1363[Statics.field1372];
            int var25 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1372 -= 2;
            int var26 = field1363[Statics.field1372];
            int var27 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1372 -= 2;
            int var28 = field1363[Statics.field1372];
            int var29 = field1363[Statics.field1372 + 1];
            if (var28 == 0) {
                field1363[++Statics.field1372 - 1] = 0;
            } else {
                field1363[++Statics.field1372 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1372 -= 2;
            int var30 = field1363[Statics.field1372];
            int var31 = field1363[Statics.field1372 + 1];
            if (var30 == 0) {
                field1363[++Statics.field1372 - 1] = 0;
            } else if (var31 == 0) {
                field1363[++Statics.field1372 - 1] = Integer.MAX_VALUE;
            } else {
                field1363[++Statics.field1372 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1372 -= 2;
            int var32 = field1363[Statics.field1372];
            int var33 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1372 -= 2;
            int var34 = field1363[Statics.field1372];
            int var35 = field1363[Statics.field1372 + 1];
            field1363[++Statics.field1372 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1372 -= 3;
            long var36 = (long) field1363[Statics.field1372];
            long var38 = (long) field1363[Statics.field1372 + 1];
            long var40 = (long) field1363[Statics.field1372 + 2];
            field1363[++Statics.field1372 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.u(ILcz;ZI)I")
    public static int method449(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1371[--Statics.field667];
            int var4 = field1363[--Statics.field1372];
            field1371[++Statics.field667 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field667 -= 2;
            String var5 = field1371[Statics.field667];
            String var6 = field1371[Statics.field667 + 1];
            field1371[++Statics.field667 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1371[--Statics.field667];
            int var8 = field1363[--Statics.field1372];
            field1371[++Statics.field667 - 1] = var7 + class271.method665(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1371[--Statics.field667];
            field1371[++Statics.field667 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1363[--Statics.field1372];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1367.setTime(new Date(var11));
            int var13 = field1367.get(5);
            int var14 = field1367.get(2);
            int var15 = field1367.get(1);
            field1371[++Statics.field667 - 1] = var13 + "-" + field1368[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field667 -= 2;
            String var16 = field1371[Statics.field667];
            String var17 = field1371[Statics.field667 + 1];
            if (Statics.field1321.field902 != null && Statics.field1321.field902.field2620) {
                field1371[++Statics.field667 - 1] = var17;
            } else {
                field1371[++Statics.field667 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1363[--Statics.field1372];
            field1371[++Statics.field667 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field667 -= 2;
            int[] var19 = field1363;
            int var20 = ++Statics.field1372 - 1;
            String var21 = field1371[Statics.field667];
            String var22 = field1371[Statics.field667 + 1];
            int var23 = client.field1078;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            char var28 = 0;
            char var29 = 0;
            int var38;
            label217: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class165.method1032(var36, var23) - class165.method1032(var37, var23);
                                break label217;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class165.method1032(var41, var23) - class165.method1032(var42, var23);
                                break label217;
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
                    var43 = var28;
                    boolean var44 = false;
                }
                char var45;
                if (var29 == 0) {
                    var45 = var22.charAt(var27++);
                } else {
                    var45 = var29;
                    boolean var46 = false;
                }
                var28 = class165.method1469(var43);
                var29 = class165.method1469(var45);
                char var47 = class165.method3710(var43, var23);
                char var48 = class165.method3710(var45, var23);
                if (var47 != var48 && Character.toUpperCase(var47) != Character.toUpperCase(var48)) {
                    char var49 = Character.toLowerCase(var47);
                    char var50 = Character.toLowerCase(var48);
                    if (var49 != var50) {
                        var38 = class165.method1032(var49, var23) - class165.method1032(var50, var23);
                        break;
                    }
                }
            }
            var19[var20] = class271.method3730(var38);
            return 1;
        } else if (arg0 == 4108) {
            String var51 = field1371[--Statics.field667];
            Statics.field1372 -= 2;
            int var52 = field1363[Statics.field1372];
            int var53 = field1363[Statics.field1372 + 1];
            byte[] var54 = Statics.field325.method3769(var53, 0);
            class264 var55 = new class264(var54);
            field1363[++Statics.field1372 - 1] = var55.method4404(var51, var52);
            return 1;
        } else if (arg0 == 4109) {
            String var56 = field1371[--Statics.field667];
            Statics.field1372 -= 2;
            int var57 = field1363[Statics.field1372];
            int var58 = field1363[Statics.field1372 + 1];
            byte[] var59 = Statics.field325.method3769(var58, 0);
            class264 var60 = new class264(var59);
            field1363[++Statics.field1372 - 1] = var60.method4376(var56, var57);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field667 -= 2;
            String var61 = field1371[Statics.field667];
            String var62 = field1371[Statics.field667 + 1];
            if (field1363[--Statics.field1372] == 1) {
                field1371[++Statics.field667 - 1] = var61;
            } else {
                field1371[++Statics.field667 - 1] = var62;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var63 = field1371[--Statics.field667];
            field1371[++Statics.field667 - 1] = class265.method4415(var63);
            return 1;
        } else if (arg0 == 4112) {
            String var64 = field1371[--Statics.field667];
            int var65 = field1363[--Statics.field1372];
            field1371[++Statics.field667 - 1] = var64 + (char) var65;
            return 1;
        } else if (arg0 == 4113) {
            int var66 = field1363[--Statics.field1372];
            int[] var67 = field1363;
            int var68 = ++Statics.field1372 - 1;
            char var69 = (char) var66;
            boolean var70;
            if (var69 >= ' ' && var69 <= '~') {
                var70 = true;
            } else if (var69 >= 160 && var69 <= 255) {
                var70 = true;
            } else if (var69 == 8364 || var69 == 338 || var69 == 8212 || var69 == 339 || var69 == 376) {
                var70 = true;
            } else {
                var70 = false;
            }
            var67[var68] = var70 ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var71 = field1363[--Statics.field1372];
            int[] var72 = field1363;
            int var73 = ++Statics.field1372 - 1;
            char var74 = (char) var71;
            boolean var75 = var74 >= '0' && var74 <= '9' || var74 >= 'A' && var74 <= 'Z' || var74 >= 'a' && var74 <= 'z';
            var72[var73] = var75 ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var76 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = Statics.method2639((char) var76) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var77 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = class271.method3549((char) var77) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var78 = field1371[--Statics.field667];
            if (var78 == null) {
                field1363[++Statics.field1372 - 1] = 0;
            } else {
                field1363[++Statics.field1372 - 1] = var78.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var79 = field1371[--Statics.field667];
            Statics.field1372 -= 2;
            int var80 = field1363[Statics.field1372];
            int var81 = field1363[Statics.field1372 + 1];
            field1371[++Statics.field667 - 1] = var79.substring(var80, var81);
            return 1;
        } else if (arg0 == 4119) {
            String var82 = field1371[--Statics.field667];
            StringBuilder var83 = new StringBuilder(var82.length());
            boolean var84 = false;
            for (int var85 = 0; var85 < var82.length(); var85++) {
                char var86 = var82.charAt(var85);
                if (var86 == '<') {
                    var84 = true;
                } else if (var86 == '>') {
                    var84 = false;
                } else if (!var84) {
                    var83.append(var86);
                }
            }
            field1371[++Statics.field667 - 1] = var83.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var87 = field1371[--Statics.field667];
            int var88 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = var87.indexOf(var88);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field667 -= 2;
            String var89 = field1371[Statics.field667];
            String var90 = field1371[Statics.field667 + 1];
            int var91 = field1363[--Statics.field1372];
            field1363[++Statics.field1372 - 1] = var89.indexOf(var90, var91);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cl.t(ILcz;ZB)I")
    public static int method1565(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5306) {
            int[] var3 = field1363;
            int var4 = ++Statics.field1372 - 1;
            int var5 = client.field1145 ? 2 : 1;
            var3[var4] = var5;
            return 1;
        } else if (arg0 == 5307) {
            int var6 = field1363[--Statics.field1372];
            if (var6 == 1 || var6 == 2) {
                client.method3763(var6);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1363[++Statics.field1372 - 1] = Statics.field304.field1337;
            return 1;
        } else if (arg0 == 5309) {
            int var7 = field1363[--Statics.field1372];
            if (var7 == 1 || var7 == 2) {
                Statics.field304.field1337 = var7;
                class82.method943();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fz.ad(ILcz;ZS)I")
    public static int method3132(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1372 -= 2;
            int var3 = field1363[Statics.field1372];
            int var4 = field1363[Statics.field1372 + 1];
            if (!client.field990) {
                client.field1014 = var3;
                client.field1015 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1363[++Statics.field1372 - 1] = client.field1014;
            return 1;
        } else if (arg0 == 5506) {
            field1363[++Statics.field1372 - 1] = client.field1015;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1363[--Statics.field1372];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field1020 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1363[++Statics.field1372 - 1] = client.field1020;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ez.ar(ILcz;ZI)I")
    public static int method2367(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1372 -= 2;
            client.field1046 = (short) field1363[Statics.field1372];
            if (client.field1046 <= 0) {
                client.field1046 = 256;
            }
            client.field976 = (short) field1363[Statics.field1372 + 1];
            if (client.field976 <= 0) {
                client.field976 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1372 -= 2;
            client.field1095 = (short) field1363[Statics.field1372];
            if (client.field1095 <= 0) {
                client.field1095 = 256;
            }
            client.field1186 = (short) field1363[Statics.field1372 + 1];
            if (client.field1186 <= 0) {
                client.field1186 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1372 -= 4;
            client.field1160 = (short) field1363[Statics.field1372];
            if (client.field1160 <= 0) {
                client.field1160 = 1;
            }
            client.field1188 = (short) field1363[Statics.field1372 + 1];
            if (client.field1188 <= 0) {
                client.field1188 = 32767;
            } else if (client.field1188 < client.field1160) {
                client.field1188 = client.field1160;
            }
            client.field1189 = (short) field1363[Statics.field1372 + 2];
            if (client.field1189 <= 0) {
                client.field1189 = 1;
            }
            client.field1190 = (short) field1363[Statics.field1372 + 3];
            if (client.field1190 <= 0) {
                client.field1190 = 32767;
            } else if (client.field1190 < client.field1189) {
                client.field1190 = client.field1189;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1103 == null) {
                field1363[++Statics.field1372 - 1] = -1;
                field1363[++Statics.field1372 - 1] = -1;
            } else {
                client.method1572(0, 0, client.field1103.field2750, client.field1103.field2689, false);
                field1363[++Statics.field1372 - 1] = client.field1193;
                field1363[++Statics.field1372 - 1] = client.field1011;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1363[++Statics.field1372 - 1] = client.field1095;
            field1363[++Statics.field1372 - 1] = client.field1186;
            return 1;
        } else if (arg0 == 6205) {
            field1363[++Statics.field1372 - 1] = client.field1046;
            field1363[++Statics.field1372 - 1] = client.field976;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.an(II)V")
    public static void method1573(int arg0) {
        if (arg0 == -1 || !class217.method2721(arg0)) {
            return;
        }
        class217[] var1 = Statics.field1309[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2733 != null) {
                class70 var4 = new class70();
                var4.field853 = var3;
                var4.field850 = var3.field2733;
                method1606(var4, 2000000);
            }
        }
    }
}
