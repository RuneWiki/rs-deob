package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cd")
public class class83 {

    @ObfuscatedName("cd.h")
    public static int[] field1261 = new int[5];

    @ObfuscatedName("cd.d")
    public static int[][] field1262 = new int[5][5000];

    @ObfuscatedName("cd.s")
    public static int[] field1263 = new int[1000];

    @ObfuscatedName("cd.e")
    public static String[] field1266 = new String[1000];

    @ObfuscatedName("cd.z")
    public static int field1258 = 0;

    @ObfuscatedName("cd.u")
    public static class63[] field1267 = new class63[50];

    @ObfuscatedName("cd.t")
    public static Calendar field1259 = Calendar.getInstance();

    @ObfuscatedName("cd.o")
    public static final String[] field1270 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cd.i")
    public static int field1272 = 0;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.n(Lbn;I)V")
    public static void method1505(class69 arg0) {
        method8(arg0, 200000);
    }

    @ObfuscatedName("h.v(Lbn;II)V")
    public static void method8(class69 arg0, int arg1) {
        Object[] var2 = arg0.field805;
        class231 var3 = arg0.field803;
        boolean var4 = class231.field2905 == var3 || class231.field2901 == var3 || class231.field2902 == var3 || class231.field2910 == var3 || class231.field2904 == var3 || class231.field2900 == var3 || class231.field2906 == var3 || class231.field2907 == var3;
        class98 var15;
        if (var4) {
            Statics.field1271 = (class48) var2[0];
            class254 var5 = Statics.field3384[Statics.field1271.field574];
            class231 var6 = arg0.field803;
            int var7 = var5.field3385;
            int var8 = var5.field3402;
            int var9 = class236.method3(var7, var6);
            class98 var10 = class98.method1610(var9, var6);
            class98 var11;
            if (var10 == null) {
                int var12 = (var8 + 40000 << 8) + var6.field2903;
                class98 var14 = class98.method1610(var12, var6);
                if (var14 == null) {
                    var11 = null;
                } else {
                    var11 = var14;
                }
            } else {
                var11 = var10;
            }
            var15 = var11;
        } else {
            int var16 = (Integer) var2[0];
            var15 = class98.method2717(var16);
        }
        if (var15 == null) {
            return;
        }
        Statics.field1269 = 0;
        Statics.field1679 = 0;
        int var17 = -1;
        int[] var18 = var15.field1439;
        int[] var19 = var15.field1433;
        byte var20 = -1;
        field1258 = 0;
        try {
            Statics.field1264 = new int[var15.field1435];
            int var21 = 0;
            Statics.field1257 = new String[var15.field1434];
            int var22 = 0;
            for (int var23 = 1; var23 < var2.length; var23++) {
                if (var2[var23] instanceof Integer) {
                    int var24 = (Integer) var2[var23];
                    if (var24 == -2147483647) {
                        var24 = arg0.field796;
                    }
                    if (var24 == -2147483646) {
                        var24 = arg0.field794;
                    }
                    if (var24 == -2147483645) {
                        var24 = arg0.field797 == null ? -1 : arg0.field797.field2763;
                    }
                    if (var24 == -2147483644) {
                        var24 = arg0.field799;
                    }
                    if (var24 == -2147483643) {
                        var24 = arg0.field797 == null ? -1 : arg0.field797.field2764;
                    }
                    if (var24 == -2147483642) {
                        var24 = arg0.field798 == null ? -1 : arg0.field798.field2763;
                    }
                    if (var24 == -2147483641) {
                        var24 = arg0.field798 == null ? -1 : arg0.field798.field2764;
                    }
                    if (var24 == -2147483640) {
                        var24 = arg0.field801;
                    }
                    if (var24 == -2147483639) {
                        var24 = arg0.field802;
                    }
                    Statics.field1264[var21++] = var24;
                } else if (var2[var23] instanceof String) {
                    String var25 = (String) var2[var23];
                    if (var25.equals("event_opbase")) {
                        var25 = arg0.field800;
                    }
                    Statics.field1257[var22++] = var25;
                }
            }
            int var26 = 0;
            field1272 = arg0.field804;
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
                                                                                                                label1713: while (true) {
                                                                                                                    var26++;
                                                                                                                    if (var26 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var17++;
                                                                                                                    int var317 = var18[var17];
                                                                                                                    if (var317 >= 100) {
                                                                                                                        boolean var75;
                                                                                                                        if (var15.field1433[var17] == 1) {
                                                                                                                            var75 = true;
                                                                                                                        } else {
                                                                                                                            var75 = false;
                                                                                                                        }
                                                                                                                        int var76;
                                                                                                                        if (var317 < 1000) {
                                                                                                                            var76 = method1002(var317, var15, var75);
                                                                                                                        } else if (var317 < 1100) {
                                                                                                                            var76 = method617(var317, var15, var75);
                                                                                                                        } else if (var317 < 1200) {
                                                                                                                            var76 = method549(var317, var15, var75);
                                                                                                                        } else if (var317 < 1300) {
                                                                                                                            var76 = method48(var317, var15, var75);
                                                                                                                        } else if (var317 < 1400) {
                                                                                                                            var76 = Statics.method1506(var317, var15, var75);
                                                                                                                        } else if (var317 < 1500) {
                                                                                                                            var76 = method12(var317, var15, var75);
                                                                                                                        } else if (var317 < 1600) {
                                                                                                                            var76 = method2709(var317, var15, var75);
                                                                                                                        } else if (var317 < 1700) {
                                                                                                                            class228 var77 = var75 ? Statics.field1268 : Statics.field1217;
                                                                                                                            byte var78;
                                                                                                                            if (var317 == 1600) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2784;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1601) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2867;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1602) {
                                                                                                                                field1266[++Statics.field1679 - 1] = var77.field2823;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1603) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2786;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1604) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2787;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1605) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2817;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1606) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2814;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1607) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2767;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1608) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2815;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1609) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2794;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1610) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2897;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1611) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2788;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1612) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2789;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var317 == 1613) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var77.field2793.method6();
                                                                                                                                var78 = 1;
                                                                                                                            } else {
                                                                                                                                var78 = 2;
                                                                                                                            }
                                                                                                                            var76 = var78;
                                                                                                                        } else if (var317 < 1800) {
                                                                                                                            var76 = method28(var317, var15, var75);
                                                                                                                        } else if (var317 < 1900) {
                                                                                                                            class228 var79 = var75 ? Statics.field1268 : Statics.field1217;
                                                                                                                            byte var84;
                                                                                                                            if (var317 == 1800) {
                                                                                                                                int[] var80 = field1263;
                                                                                                                                int var81 = ++Statics.field1269 - 1;
                                                                                                                                int var82 = client.method1563(var79);
                                                                                                                                int var83 = var82 >> 11 & 0x3F;
                                                                                                                                var80[var81] = var83;
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var317 == 1801) {
                                                                                                                                int var85 = field1263[--Statics.field1269];
                                                                                                                                int var318 = var85 - 1;
                                                                                                                                if (var79.field2820 == null || var318 >= var79.field2820.length || var79.field2820[var318] == null) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1266[++Statics.field1679 - 1] = var79.field2820[var318];
                                                                                                                                }
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var317 == 1802) {
                                                                                                                                if (var79.field2854 == null) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1266[++Statics.field1679 - 1] = var79.field2854;
                                                                                                                                }
                                                                                                                                var84 = 1;
                                                                                                                            } else {
                                                                                                                                var84 = 2;
                                                                                                                            }
                                                                                                                            var76 = var84;
                                                                                                                        } else if (var317 < 2000) {
                                                                                                                            var76 = method1424(var317, var15, var75);
                                                                                                                        } else if (var317 < 2100) {
                                                                                                                            var76 = method617(var317, var15, var75);
                                                                                                                        } else if (var317 < 2200) {
                                                                                                                            var76 = method549(var317, var15, var75);
                                                                                                                        } else if (var317 < 2300) {
                                                                                                                            var76 = method48(var317, var15, var75);
                                                                                                                        } else if (var317 < 2400) {
                                                                                                                            var76 = Statics.method1506(var317, var15, var75);
                                                                                                                        } else if (var317 < 2500) {
                                                                                                                            var76 = method12(var317, var15, var75);
                                                                                                                        } else if (var317 < 2600) {
                                                                                                                            class228 var86 = class228.method2725(field1263[--Statics.field1269]);
                                                                                                                            byte var87;
                                                                                                                            if (var317 == 2500) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var86.field2757;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var317 == 2501) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var86.field2825;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var317 == 2502) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var86.field2778;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var317 == 2503) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var86.field2779;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var317 == 2504) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var86.field2783 ? 1 : 0;
                                                                                                                                var87 = 1;
                                                                                                                            } else if (var317 == 2505) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var86.field2782;
                                                                                                                                var87 = 1;
                                                                                                                            } else {
                                                                                                                                var87 = 2;
                                                                                                                            }
                                                                                                                            var76 = var87;
                                                                                                                        } else if (var317 < 2700) {
                                                                                                                            class228 var88 = class228.method2725(field1263[--Statics.field1269]);
                                                                                                                            byte var89;
                                                                                                                            if (var317 == 2600) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2784;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2601) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2867;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2602) {
                                                                                                                                field1266[++Statics.field1679 - 1] = var88.field2823;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2603) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2786;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2604) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2787;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2605) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2817;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2606) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2814;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2607) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2767;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2608) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2815;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2609) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2794;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2610) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2897;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2611) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2788;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2612) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2789;
                                                                                                                                var89 = 1;
                                                                                                                            } else if (var317 == 2613) {
                                                                                                                                field1263[++Statics.field1269 - 1] = var88.field2793.method6();
                                                                                                                                var89 = 1;
                                                                                                                            } else {
                                                                                                                                var89 = 2;
                                                                                                                            }
                                                                                                                            var76 = var89;
                                                                                                                        } else if (var317 < 2800) {
                                                                                                                            byte var91;
                                                                                                                            if (var317 == 2700) {
                                                                                                                                class228 var90 = class228.method2725(field1263[--Statics.field1269]);
                                                                                                                                field1263[++Statics.field1269 - 1] = var90.field2883;
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var317 == 2701) {
                                                                                                                                class228 var92 = class228.method2725(field1263[--Statics.field1269]);
                                                                                                                                if (var92.field2883 == -1) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var92.field2884;
                                                                                                                                }
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var317 == 2702) {
                                                                                                                                int var93 = field1263[--Statics.field1269];
                                                                                                                                class68 var94 = (class68) client.field1017.method3416((long) var93);
                                                                                                                                if (var94 == null) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 1;
                                                                                                                                }
                                                                                                                                var91 = 1;
                                                                                                                            } else if (var317 == 2706) {
                                                                                                                                field1263[++Statics.field1269 - 1] = client.field1016;
                                                                                                                                var91 = 1;
                                                                                                                            } else {
                                                                                                                                var91 = 2;
                                                                                                                            }
                                                                                                                            var76 = var91;
                                                                                                                        } else if (var317 < 2900) {
                                                                                                                            var76 = method1008(var317, var15, var75);
                                                                                                                        } else if (var317 < 3000) {
                                                                                                                            var76 = method1424(var317, var15, var75);
                                                                                                                        } else if (var317 < 3200) {
                                                                                                                            byte var96;
                                                                                                                            if (var317 == 3100) {
                                                                                                                                String var95 = field1266[--Statics.field1679];
                                                                                                                                class97.method1495(0, "", var95);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3101) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                client.method199(Statics.field289, field1263[Statics.field1269], field1263[Statics.field1269 + 1]);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3103) {
                                                                                                                                class175 var97 = class175.method3892(class172.field2356, client.field916.field1463);
                                                                                                                                client.field916.method1747(var97);
                                                                                                                                class68 var98 = (class68) client.field1017.method3419();
                                                                                                                                while (true) {
                                                                                                                                    if (var98 == null) {
                                                                                                                                        if (client.field1020 != null) {
                                                                                                                                            client.method211(client.field1020);
                                                                                                                                            client.field1020 = null;
                                                                                                                                        }
                                                                                                                                        var96 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var98.field790 == 0 || var98.field790 == 3) {
                                                                                                                                        client.method132(var98, true);
                                                                                                                                    }
                                                                                                                                    var98 = (class68) client.field1017.method3415();
                                                                                                                                }
                                                                                                                            } else if (var317 == 3104) {
                                                                                                                                String var99 = field1266[--Statics.field1679];
                                                                                                                                int var100 = 0;
                                                                                                                                if (class282.method3262(var99)) {
                                                                                                                                    int var101 = class282.method2944(var99, 10, true);
                                                                                                                                    var100 = var101;
                                                                                                                                }
                                                                                                                                class175 var102 = class175.method3892(class172.field2362, client.field916.field1463);
                                                                                                                                var102.field2451.method3005(var100);
                                                                                                                                client.field916.method1747(var102);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3105) {
                                                                                                                                String var103 = field1266[--Statics.field1679];
                                                                                                                                class175 var104 = class175.method3892(class172.field2393, client.field916.field1463);
                                                                                                                                var104.field2451.method3157(var103.length() + 1);
                                                                                                                                var104.field2451.method3012(var103);
                                                                                                                                client.field916.method1747(var104);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3106) {
                                                                                                                                String var105 = field1266[--Statics.field1679];
                                                                                                                                class175 var106 = class175.method3892(class172.field2401, client.field916.field1463);
                                                                                                                                var106.field2451.method3157(var105.length() + 1);
                                                                                                                                var106.field2451.method3012(var105);
                                                                                                                                client.field916.method1747(var106);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3107) {
                                                                                                                                int var107 = field1263[--Statics.field1269];
                                                                                                                                String var108 = field1266[--Statics.field1679];
                                                                                                                                client.method1426(var107, var108);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3108) {
                                                                                                                                Statics.field1269 -= 3;
                                                                                                                                int var109 = field1263[Statics.field1269];
                                                                                                                                int var110 = field1263[Statics.field1269 + 1];
                                                                                                                                int var111 = field1263[Statics.field1269 + 2];
                                                                                                                                class228 var112 = class228.method2725(var111);
                                                                                                                                client.method2711(var112, var109, var110);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3109) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var113 = field1263[Statics.field1269];
                                                                                                                                int var114 = field1263[Statics.field1269 + 1];
                                                                                                                                class228 var115 = var75 ? Statics.field1268 : Statics.field1217;
                                                                                                                                client.method2711(var115, var113, var114);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3110) {
                                                                                                                                Statics.field565 = field1263[--Statics.field1269] == 1;
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3111) {
                                                                                                                                field1263[++Statics.field1269 - 1] = Statics.field2727.field1240 ? 1 : 0;
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3112) {
                                                                                                                                Statics.field2727.field1240 = field1263[--Statics.field1269] == 1;
                                                                                                                                class81.method1488();
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3113) {
                                                                                                                                String var116 = field1266[--Statics.field1679];
                                                                                                                                boolean var117 = field1263[--Statics.field1269] == 1;
                                                                                                                                class57.method2716(var116, var117, false);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3115) {
                                                                                                                                int var118 = field1263[--Statics.field1269];
                                                                                                                                class175 var119 = class175.method3892(class172.field2416, client.field916.field1463);
                                                                                                                                var119.field2451.method3006(var118);
                                                                                                                                client.field916.method1747(var119);
                                                                                                                                var96 = 1;
                                                                                                                            } else if (var317 == 3116) {
                                                                                                                                int var120 = field1263[--Statics.field1269];
                                                                                                                                Statics.field1679 -= 2;
                                                                                                                                String var121 = field1266[Statics.field1679];
                                                                                                                                String var122 = field1266[Statics.field1679 + 1];
                                                                                                                                if (var121.length() > 500) {
                                                                                                                                    var96 = 1;
                                                                                                                                } else if (var122.length() > 500) {
                                                                                                                                    var96 = 1;
                                                                                                                                } else {
                                                                                                                                    class175 var123 = class175.method3892(class172.field2374, client.field916.field1463);
                                                                                                                                    var123.field2451.method3006(1 + class185.method166(var121) + class185.method166(var122));
                                                                                                                                    var123.field2451.method3012(var122);
                                                                                                                                    var123.field2451.method3012(var121);
                                                                                                                                    var123.field2451.method3046(var120);
                                                                                                                                    client.field916.method1747(var123);
                                                                                                                                    var96 = 1;
                                                                                                                                }
                                                                                                                            } else if (var317 == 3117) {
                                                                                                                                client.field1004 = field1263[--Statics.field1269] == 1;
                                                                                                                                var96 = 1;
                                                                                                                            } else {
                                                                                                                                var96 = 2;
                                                                                                                            }
                                                                                                                            var76 = var96;
                                                                                                                        } else if (var317 < 3300) {
                                                                                                                            byte var127;
                                                                                                                            if (var317 == 3200) {
                                                                                                                                Statics.field1269 -= 3;
                                                                                                                                int var124 = field1263[Statics.field1269];
                                                                                                                                int var125 = field1263[Statics.field1269 + 1];
                                                                                                                                int var126 = field1263[Statics.field1269 + 2];
                                                                                                                                if (client.field904 != 0 && var125 != 0 && client.field1026 < 50) {
                                                                                                                                    client.field1097[client.field1026] = var124;
                                                                                                                                    client.field1028[client.field1026] = var125;
                                                                                                                                    client.field1099[client.field1026] = var126;
                                                                                                                                    client.field1101[client.field1026] = null;
                                                                                                                                    client.field1100[client.field1026] = 0;
                                                                                                                                    client.field1026++;
                                                                                                                                }
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var317 == 3201) {
                                                                                                                                client.method580(field1263[--Statics.field1269]);
                                                                                                                                var127 = 1;
                                                                                                                            } else if (var317 == 3202) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                client.method457(field1263[Statics.field1269], field1263[Statics.field1269 + 1]);
                                                                                                                                var127 = 1;
                                                                                                                            } else {
                                                                                                                                var127 = 2;
                                                                                                                            }
                                                                                                                            var76 = var127;
                                                                                                                        } else if (var317 < 3400) {
                                                                                                                            var76 = method4488(var317, var15, var75);
                                                                                                                        } else if (var317 < 3500) {
                                                                                                                            byte var132;
                                                                                                                            if (var317 == 3400) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var128 = field1263[Statics.field1269];
                                                                                                                                int var129 = field1263[Statics.field1269 + 1];
                                                                                                                                class265 var130 = class265.method456(var128);
                                                                                                                                if (var130.field3493 != 's') {
                                                                                                                                }
                                                                                                                                for (int var131 = 0; var131 < var130.field3489; var131++) {
                                                                                                                                    if (var130.field3494[var131] == var129) {
                                                                                                                                        field1266[++Statics.field1679 - 1] = var130.field3496[var131];
                                                                                                                                        var130 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var130 != null) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = var130.field3490;
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var317 == 3408) {
                                                                                                                                Statics.field1269 -= 4;
                                                                                                                                int var133 = field1263[Statics.field1269];
                                                                                                                                int var134 = field1263[Statics.field1269 + 1];
                                                                                                                                int var135 = field1263[Statics.field1269 + 2];
                                                                                                                                int var136 = field1263[Statics.field1269 + 3];
                                                                                                                                class265 var137 = class265.method456(var135);
                                                                                                                                if (var137.field3491 == var133 && var137.field3493 == var134) {
                                                                                                                                    for (int var138 = 0; var138 < var137.field3489; var138++) {
                                                                                                                                        if (var137.field3494[var138] == var136) {
                                                                                                                                            if (var134 == 115) {
                                                                                                                                                field1266[++Statics.field1679 - 1] = var137.field3496[var138];
                                                                                                                                            } else {
                                                                                                                                                field1263[++Statics.field1269 - 1] = var137.field3495[var138];
                                                                                                                                            }
                                                                                                                                            var137 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var137 != null) {
                                                                                                                                        if (var134 == 115) {
                                                                                                                                            field1266[++Statics.field1679 - 1] = var137.field3490;
                                                                                                                                        } else {
                                                                                                                                            field1263[++Statics.field1269 - 1] = var137.field3488;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var132 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var134 == 115) {
                                                                                                                                        field1266[++Statics.field1679 - 1] = "null";
                                                                                                                                    } else {
                                                                                                                                        field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var132 = 1;
                                                                                                                                }
                                                                                                                            } else if (var317 == 3411) {
                                                                                                                                int var139 = field1263[--Statics.field1269];
                                                                                                                                class265 var140 = class265.method456(var139);
                                                                                                                                field1263[++Statics.field1269 - 1] = var140.method4270();
                                                                                                                                var132 = 1;
                                                                                                                            } else {
                                                                                                                                var132 = 2;
                                                                                                                            }
                                                                                                                            var76 = var132;
                                                                                                                        } else if (var317 < 3700) {
                                                                                                                            byte var141;
                                                                                                                            if (var317 == 3600) {
                                                                                                                                if (client.field1078 == 0) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = -2;
                                                                                                                                } else if (client.field1078 == 1) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = client.field1121;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3601) {
                                                                                                                                int var142 = field1263[--Statics.field1269];
                                                                                                                                if (client.field1078 == 2 && var142 < client.field1121) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = client.field1123[var142].field782;
                                                                                                                                    field1266[++Statics.field1679 - 1] = client.field1123[var142].field776;
                                                                                                                                } else {
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3602) {
                                                                                                                                int var143 = field1263[--Statics.field1269];
                                                                                                                                if (client.field1078 == 2 && var143 < client.field1121) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = client.field1123[var143].field775;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3603) {
                                                                                                                                int var144 = field1263[--Statics.field1269];
                                                                                                                                if (client.field1078 == 2 && var144 < client.field1121) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = client.field1123[var144].field779;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3604) {
                                                                                                                                String var145 = field1266[--Statics.field1679];
                                                                                                                                int var146 = field1263[--Statics.field1269];
                                                                                                                                client.method2749(var145, var146);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3605) {
                                                                                                                                String var147 = field1266[--Statics.field1679];
                                                                                                                                client.method684(var147);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3606) {
                                                                                                                                String var148 = field1266[--Statics.field1679];
                                                                                                                                if (var148 != null) {
                                                                                                                                    String var149 = class279.method311(var148, Statics.field295);
                                                                                                                                    if (var149 != null) {
                                                                                                                                        for (int var150 = 0; var150 < client.field1121; var150++) {
                                                                                                                                            class66 var151 = client.field1123[var150];
                                                                                                                                            String var152 = var151.field782;
                                                                                                                                            String var153 = class279.method311(var152, Statics.field295);
                                                                                                                                            if (class291.method459(var148, var149, var152, var153)) {
                                                                                                                                                client.field1121--;
                                                                                                                                                for (int var154 = var150; var154 < client.field1121; var154++) {
                                                                                                                                                    client.field1123[var154] = client.field1123[var154 + 1];
                                                                                                                                                }
                                                                                                                                                client.field881 = client.field953;
                                                                                                                                                class175 var155 = class175.method3892(class172.field2366, client.field916.field1463);
                                                                                                                                                var155.field2451.method3157(class185.method166(var148));
                                                                                                                                                var155.field2451.method3012(var148);
                                                                                                                                                client.field916.method1747(var155);
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3607) {
                                                                                                                                String var156 = field1266[--Statics.field1679];
                                                                                                                                client.method1601(var156, false);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3608) {
                                                                                                                                String var157 = field1266[--Statics.field1679];
                                                                                                                                client.method527(var157);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3609) {
                                                                                                                                String var158 = field1266[--Statics.field1679];
                                                                                                                                class242[] var159 = new class242[] { class242.field3274, class242.field3276, class242.field3283, class242.field3279, class242.field3273, class242.field3277 };
                                                                                                                                class242[] var160 = var159;
                                                                                                                                for (int var161 = 0; var161 < var160.length; var161++) {
                                                                                                                                    class242 var162 = var160[var161];
                                                                                                                                    if (var162.field3280 != -1 && var158.startsWith(class88.method1575(var162.field3280))) {
                                                                                                                                        var158 = var158.substring(6 + Integer.toString(var162.field3280).length());
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1263[++Statics.field1269 - 1] = Statics.method1652(var158, false) ? 1 : 0;
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3611) {
                                                                                                                                if (client.field955 == null) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    String[] var163 = field1266;
                                                                                                                                    int var164 = ++Statics.field1679 - 1;
                                                                                                                                    String var165 = client.field955;
                                                                                                                                    long var166 = 0L;
                                                                                                                                    int var168 = var165.length();
                                                                                                                                    for (int var169 = 0; var169 < var168; var169++) {
                                                                                                                                        var166 *= 37L;
                                                                                                                                        char var170 = var165.charAt(var169);
                                                                                                                                        if (var170 >= 'A' && var170 <= 'Z') {
                                                                                                                                            var166 += (long) (var170 + 1 - 65);
                                                                                                                                        } else if (var170 >= 'a' && var170 <= 'z') {
                                                                                                                                            var166 += (long) (var170 + 1 - 97);
                                                                                                                                        } else if (var170 >= '0' && var170 <= '9') {
                                                                                                                                            var166 += (long) (var170 + 27 - 48);
                                                                                                                                        }
                                                                                                                                        if (var166 >= 177917621779460413L) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    while (var166 % 37L == 0L && var166 != 0L) {
                                                                                                                                        var166 /= 37L;
                                                                                                                                    }
                                                                                                                                    String var173 = class280.method120(var166);
                                                                                                                                    if (var173 == null) {
                                                                                                                                        var173 = "";
                                                                                                                                    }
                                                                                                                                    var163[var164] = var173;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3612) {
                                                                                                                                if (client.field955 == null) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = Statics.field3303;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3613) {
                                                                                                                                int var175 = field1263[--Statics.field1269];
                                                                                                                                if (client.field955 == null || var175 >= Statics.field3303) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1266[++Statics.field1679 - 1] = Statics.field1559[var175].field869;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3614) {
                                                                                                                                int var176 = field1263[--Statics.field1269];
                                                                                                                                if (client.field955 == null || var176 >= Statics.field3303) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = Statics.field1559[var176].field868;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3615) {
                                                                                                                                int var177 = field1263[--Statics.field1269];
                                                                                                                                if (client.field955 == null || var177 >= Statics.field3303) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = Statics.field1559[var177].field870;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3616) {
                                                                                                                                field1263[++Statics.field1269 - 1] = Statics.field527;
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3617) {
                                                                                                                                String var178 = field1266[--Statics.field1679];
                                                                                                                                Statics.method1026(var178);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3618) {
                                                                                                                                field1263[++Statics.field1269 - 1] = Statics.field375;
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3619) {
                                                                                                                                String var179 = field1266[--Statics.field1679];
                                                                                                                                if (!var179.equals("")) {
                                                                                                                                    class175 var180 = class175.method3892(class172.field2342, client.field916.field1463);
                                                                                                                                    var180.field2451.method3157(class185.method166(var179));
                                                                                                                                    var180.field2451.method3012(var179);
                                                                                                                                    client.field916.method1747(var180);
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3620) {
                                                                                                                                class175 var181 = class175.method3892(class172.field2342, client.field916.field1463);
                                                                                                                                var181.field2451.method3157(0);
                                                                                                                                client.field916.method1747(var181);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3621) {
                                                                                                                                if (client.field1078 == 0) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = client.field1032;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3622) {
                                                                                                                                int var182 = field1263[--Statics.field1269];
                                                                                                                                if (client.field1078 == 0 || var182 >= client.field1032) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1266[++Statics.field1679 - 1] = client.field1012[var182].field809;
                                                                                                                                    field1266[++Statics.field1679 - 1] = client.field1012[var182].field808;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3623) {
                                                                                                                                String var183 = field1266[--Statics.field1679];
                                                                                                                                if (var183.startsWith(class88.method1575(0)) || var183.startsWith(class88.method1575(1))) {
                                                                                                                                    var183 = var183.substring(7);
                                                                                                                                }
                                                                                                                                field1263[++Statics.field1269 - 1] = client.method314(var183) ? 1 : 0;
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3624) {
                                                                                                                                int var184 = field1263[--Statics.field1269];
                                                                                                                                if (Statics.field1559 == null || var184 >= Statics.field3303 || !Statics.field1559[var184].field869.equalsIgnoreCase(Statics.field289.field860)) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 1;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var317 == 3625) {
                                                                                                                                if (client.field1082 == null) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    String[] var185 = field1266;
                                                                                                                                    int var186 = ++Statics.field1679 - 1;
                                                                                                                                    String var187 = client.field1082;
                                                                                                                                    long var188 = 0L;
                                                                                                                                    int var190 = var187.length();
                                                                                                                                    for (int var191 = 0; var191 < var190; var191++) {
                                                                                                                                        var188 *= 37L;
                                                                                                                                        char var192 = var187.charAt(var191);
                                                                                                                                        if (var192 >= 'A' && var192 <= 'Z') {
                                                                                                                                            var188 += (long) (var192 + 1 - 65);
                                                                                                                                        } else if (var192 >= 'a' && var192 <= 'z') {
                                                                                                                                            var188 += (long) (var192 + 1 - 97);
                                                                                                                                        } else if (var192 >= '0' && var192 <= '9') {
                                                                                                                                            var188 += (long) (var192 + 27 - 48);
                                                                                                                                        }
                                                                                                                                        if (var188 >= 177917621779460413L) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    while (var188 % 37L == 0L && var188 != 0L) {
                                                                                                                                        var188 /= 37L;
                                                                                                                                    }
                                                                                                                                    String var195 = class280.method120(var188);
                                                                                                                                    if (var195 == null) {
                                                                                                                                        var195 = "";
                                                                                                                                    }
                                                                                                                                    var185[var186] = var195;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else {
                                                                                                                                var141 = 2;
                                                                                                                            }
                                                                                                                            var76 = var141;
                                                                                                                        } else if (var317 < 4000) {
                                                                                                                            var76 = method169(var317, var15, var75);
                                                                                                                        } else if (var317 < 4100) {
                                                                                                                            byte var199;
                                                                                                                            if (var317 == 4000) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var197 = field1263[Statics.field1269];
                                                                                                                                int var198 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var197 + var198;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4001) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var200 = field1263[Statics.field1269];
                                                                                                                                int var201 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var200 - var201;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4002) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var202 = field1263[Statics.field1269];
                                                                                                                                int var203 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var202 * var203;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4003) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var204 = field1263[Statics.field1269];
                                                                                                                                int var205 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var204 / var205;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4004) {
                                                                                                                                int var206 = field1263[--Statics.field1269];
                                                                                                                                field1263[++Statics.field1269 - 1] = (int) (Math.random() * (double) var206);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4005) {
                                                                                                                                int var207 = field1263[--Statics.field1269];
                                                                                                                                field1263[++Statics.field1269 - 1] = (int) (Math.random() * (double) (var207 + 1));
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4006) {
                                                                                                                                Statics.field1269 -= 5;
                                                                                                                                int var208 = field1263[Statics.field1269];
                                                                                                                                int var209 = field1263[Statics.field1269 + 1];
                                                                                                                                int var210 = field1263[Statics.field1269 + 2];
                                                                                                                                int var211 = field1263[Statics.field1269 + 3];
                                                                                                                                int var212 = field1263[Statics.field1269 + 4];
                                                                                                                                field1263[++Statics.field1269 - 1] = (var209 - var208) * (var212 - var210) / (var211 - var210) + var208;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4007) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var213 = field1263[Statics.field1269];
                                                                                                                                int var214 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var213 * var214 / 100 + var213;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4008) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var215 = field1263[Statics.field1269];
                                                                                                                                int var216 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var215 | 0x1 << var216;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4009) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var217 = field1263[Statics.field1269];
                                                                                                                                int var218 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var217 & -1 - (0x1 << var218);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4010) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var219 = field1263[Statics.field1269];
                                                                                                                                int var220 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = (var219 & 0x1 << var220) == 0 ? 0 : 1;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4011) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var221 = field1263[Statics.field1269];
                                                                                                                                int var222 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var221 % var222;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4012) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var223 = field1263[Statics.field1269];
                                                                                                                                int var224 = field1263[Statics.field1269 + 1];
                                                                                                                                if (var223 == 0) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = (int) Math.pow((double) var223, (double) var224);
                                                                                                                                }
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4013) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var225 = field1263[Statics.field1269];
                                                                                                                                int var226 = field1263[Statics.field1269 + 1];
                                                                                                                                if (var225 == 0) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                    var199 = 1;
                                                                                                                                } else {
                                                                                                                                    switch(var226) {
                                                                                                                                        case 0:
                                                                                                                                            field1263[++Statics.field1269 - 1] = Integer.MAX_VALUE;
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            field1263[++Statics.field1269 - 1] = var225;
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            field1263[++Statics.field1269 - 1] = (int) Math.sqrt((double) var225);
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            field1263[++Statics.field1269 - 1] = (int) Math.cbrt((double) var225);
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            field1263[++Statics.field1269 - 1] = (int) Math.sqrt(Math.sqrt((double) var225));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            field1263[++Statics.field1269 - 1] = (int) Math.pow((double) var225, 1.0D / (double) var226);
                                                                                                                                    }
                                                                                                                                    var199 = 1;
                                                                                                                                }
                                                                                                                            } else if (var317 == 4014) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var227 = field1263[Statics.field1269];
                                                                                                                                int var228 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var227 & var228;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4015) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var229 = field1263[Statics.field1269];
                                                                                                                                int var230 = field1263[Statics.field1269 + 1];
                                                                                                                                field1263[++Statics.field1269 - 1] = var229 | var230;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var317 == 4018) {
                                                                                                                                Statics.field1269 -= 3;
                                                                                                                                long var231 = (long) field1263[Statics.field1269];
                                                                                                                                long var233 = (long) field1263[Statics.field1269 + 1];
                                                                                                                                long var235 = (long) field1263[Statics.field1269 + 2];
                                                                                                                                field1263[++Statics.field1269 - 1] = (int) (var231 * var235 / var233);
                                                                                                                                var199 = 1;
                                                                                                                            } else {
                                                                                                                                var199 = 2;
                                                                                                                            }
                                                                                                                            var76 = var199;
                                                                                                                        } else if (var317 < 4200) {
                                                                                                                            var76 = method3893(var317, var15, var75);
                                                                                                                        } else if (var317 < 4300) {
                                                                                                                            byte var238;
                                                                                                                            if (var317 == 4200) {
                                                                                                                                int var237 = field1263[--Statics.field1269];
                                                                                                                                field1266[++Statics.field1679 - 1] = class268.method1985(var237).field3583;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4201) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var239 = field1263[Statics.field1269];
                                                                                                                                int var240 = field1263[Statics.field1269 + 1];
                                                                                                                                class268 var241 = class268.method1985(var239);
                                                                                                                                if (var240 < 1 || var240 > 5 || var241.field3592[var240 - 1] == null) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1266[++Statics.field1679 - 1] = var241.field3592[var240 - 1];
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4202) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var242 = field1263[Statics.field1269];
                                                                                                                                int var243 = field1263[Statics.field1269 + 1];
                                                                                                                                class268 var244 = class268.method1985(var242);
                                                                                                                                if (var243 < 1 || var243 > 5 || var244.field3598[var243 - 1] == null) {
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1266[++Statics.field1679 - 1] = var244.field3598[var243 - 1];
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4203) {
                                                                                                                                int var245 = field1263[--Statics.field1269];
                                                                                                                                field1263[++Statics.field1269 - 1] = class268.method1985(var245).field3595;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4204) {
                                                                                                                                int var246 = field1263[--Statics.field1269];
                                                                                                                                field1263[++Statics.field1269 - 1] = class268.method1985(var246).field3578 == 1 ? 1 : 0;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4205) {
                                                                                                                                int var247 = field1263[--Statics.field1269];
                                                                                                                                class268 var248 = class268.method1985(var247);
                                                                                                                                if (var248.field3607 == -1 && var248.field3614 >= 0) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var248.field3614;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var247;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4206) {
                                                                                                                                int var249 = field1263[--Statics.field1269];
                                                                                                                                class268 var250 = class268.method1985(var249);
                                                                                                                                if (var250.field3607 >= 0 && var250.field3614 >= 0) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var250.field3614;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var249;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4207) {
                                                                                                                                int var251 = field1263[--Statics.field1269];
                                                                                                                                field1263[++Statics.field1269 - 1] = class268.method1985(var251).field3621 ? 1 : 0;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4208) {
                                                                                                                                int var252 = field1263[--Statics.field1269];
                                                                                                                                class268 var253 = class268.method1985(var252);
                                                                                                                                if (var253.field3627 == -1 && var253.field3626 >= 0) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var253.field3626;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var252;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4209) {
                                                                                                                                int var254 = field1263[--Statics.field1269];
                                                                                                                                class268 var255 = class268.method1985(var254);
                                                                                                                                if (var255.field3627 >= 0 && var255.field3626 >= 0) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var255.field3626;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var254;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4210) {
                                                                                                                                String var256 = field1266[--Statics.field1679];
                                                                                                                                int var257 = field1263[--Statics.field1269];
                                                                                                                                client.method2951(var256, var257 == 1);
                                                                                                                                field1263[++Statics.field1269 - 1] = Statics.field243;
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4211) {
                                                                                                                                if (Statics.field2927 == null || Statics.field727 >= Statics.field243) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = Statics.field2927[++Statics.field727 - 1] & 0xFFFF;
                                                                                                                                }
                                                                                                                                var238 = 1;
                                                                                                                            } else if (var317 == 4212) {
                                                                                                                                Statics.field727 = 0;
                                                                                                                                var238 = 1;
                                                                                                                            } else {
                                                                                                                                var238 = 2;
                                                                                                                            }
                                                                                                                            var76 = var238;
                                                                                                                        } else if (var317 < 5100) {
                                                                                                                            byte var258;
                                                                                                                            if (var317 == 5000) {
                                                                                                                                field1263[++Statics.field1269 - 1] = client.field1072;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5001) {
                                                                                                                                Statics.field1269 -= 3;
                                                                                                                                client.field1072 = field1263[Statics.field1269];
                                                                                                                                int var259 = field1263[Statics.field1269 + 1];
                                                                                                                                class290[] var260 = new class290[] { class290.field3814, class290.field3813, class290.field3815 };
                                                                                                                                class290[] var261 = var260;
                                                                                                                                int var262 = 0;
                                                                                                                                class290 var264;
                                                                                                                                while (true) {
                                                                                                                                    if (var262 >= var261.length) {
                                                                                                                                        var264 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    class290 var263 = var261[var262];
                                                                                                                                    if (var263.field3816 == var259) {
                                                                                                                                        var264 = var263;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    var262++;
                                                                                                                                }
                                                                                                                                Statics.field581 = var264;
                                                                                                                                if (Statics.field581 == null) {
                                                                                                                                    Statics.field581 = class290.field3814;
                                                                                                                                }
                                                                                                                                client.field1073 = field1263[Statics.field1269 + 2];
                                                                                                                                class175 var265 = class175.method3892(class172.field2406, client.field916.field1463);
                                                                                                                                var265.field2451.method3157(client.field1072);
                                                                                                                                var265.field2451.method3157(Statics.field581.field3816);
                                                                                                                                var265.field2451.method3157(client.field1073);
                                                                                                                                client.field916.method1747(var265);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5002) {
                                                                                                                                String var266 = field1266[--Statics.field1679];
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var267 = field1263[Statics.field1269];
                                                                                                                                int var268 = field1263[Statics.field1269 + 1];
                                                                                                                                class175 var269 = class175.method3892(class172.field2410, client.field916.field1463);
                                                                                                                                var269.field2451.method3157(class185.method166(var266) + 2);
                                                                                                                                var269.field2451.method3012(var266);
                                                                                                                                var269.field2451.method3157(var267 - 1);
                                                                                                                                var269.field2451.method3157(var268);
                                                                                                                                client.field916.method1747(var269);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5003) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                int var270 = field1263[Statics.field1269];
                                                                                                                                int var271 = field1263[Statics.field1269 + 1];
                                                                                                                                class72 var272 = class97.method3791(var270, var271);
                                                                                                                                if (var272 == null) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = -1;
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var272.field828;
                                                                                                                                    field1263[++Statics.field1269 - 1] = var272.field821;
                                                                                                                                    field1266[++Statics.field1679 - 1] = var272.field823 == null ? "" : var272.field823;
                                                                                                                                    field1266[++Statics.field1679 - 1] = var272.field824 == null ? "" : var272.field824;
                                                                                                                                    field1266[++Statics.field1679 - 1] = var272.field831 == null ? "" : var272.field831;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5004) {
                                                                                                                                int var273 = field1263[--Statics.field1269];
                                                                                                                                class72 var274 = (class72) class97.field1426.method3382((long) var273);
                                                                                                                                if (var274 == null) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = -1;
                                                                                                                                    field1263[++Statics.field1269 - 1] = 0;
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                    field1266[++Statics.field1679 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = var274.field822;
                                                                                                                                    field1263[++Statics.field1269 - 1] = var274.field821;
                                                                                                                                    field1266[++Statics.field1679 - 1] = var274.field823 == null ? "" : var274.field823;
                                                                                                                                    field1266[++Statics.field1679 - 1] = var274.field824 == null ? "" : var274.field824;
                                                                                                                                    field1266[++Statics.field1679 - 1] = var274.field831 == null ? "" : var274.field831;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5005) {
                                                                                                                                if (Statics.field581 == null) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1263[++Statics.field1269 - 1] = Statics.field581.field3816;
                                                                                                                                }
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5008) {
                                                                                                                                String var276 = field1266[--Statics.field1679];
                                                                                                                                int var277 = field1263[--Statics.field1269];
                                                                                                                                String var278 = var276.toLowerCase();
                                                                                                                                byte var279 = 0;
                                                                                                                                if (var278.startsWith(class237.field3138)) {
                                                                                                                                    var279 = 0;
                                                                                                                                    var276 = var276.substring(class237.field3138.length());
                                                                                                                                } else if (var278.startsWith(class237.field3007)) {
                                                                                                                                    var279 = 1;
                                                                                                                                    var276 = var276.substring(class237.field3007.length());
                                                                                                                                } else if (var278.startsWith(class237.field3142)) {
                                                                                                                                    var279 = 2;
                                                                                                                                    var276 = var276.substring(class237.field3142.length());
                                                                                                                                } else if (var278.startsWith(class237.field3144)) {
                                                                                                                                    var279 = 3;
                                                                                                                                    var276 = var276.substring(class237.field3144.length());
                                                                                                                                } else if (var278.startsWith(class237.field3210)) {
                                                                                                                                    var279 = 4;
                                                                                                                                    var276 = var276.substring(class237.field3210.length());
                                                                                                                                } else if (var278.startsWith(class237.field3187)) {
                                                                                                                                    var279 = 5;
                                                                                                                                    var276 = var276.substring(class237.field3187.length());
                                                                                                                                } else if (var278.startsWith(class237.field3112)) {
                                                                                                                                    var279 = 6;
                                                                                                                                    var276 = var276.substring(class237.field3112.length());
                                                                                                                                } else if (var278.startsWith(class237.field3232)) {
                                                                                                                                    var279 = 7;
                                                                                                                                    var276 = var276.substring(class237.field3232.length());
                                                                                                                                } else if (var278.startsWith(class237.field3019)) {
                                                                                                                                    var279 = 8;
                                                                                                                                    var276 = var276.substring(class237.field3019.length());
                                                                                                                                } else if (var278.startsWith(class237.field2968)) {
                                                                                                                                    var279 = 9;
                                                                                                                                    var276 = var276.substring(class237.field2968.length());
                                                                                                                                } else if (var278.startsWith(class237.field3158)) {
                                                                                                                                    var279 = 10;
                                                                                                                                    var276 = var276.substring(class237.field3158.length());
                                                                                                                                } else if (var278.startsWith(class237.field3160)) {
                                                                                                                                    var279 = 11;
                                                                                                                                    var276 = var276.substring(class237.field3160.length());
                                                                                                                                } else if (client.field972 != 0) {
                                                                                                                                    if (var278.startsWith(class237.field3097)) {
                                                                                                                                        var279 = 0;
                                                                                                                                        var276 = var276.substring(class237.field3097.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3169)) {
                                                                                                                                        var279 = 1;
                                                                                                                                        var276 = var276.substring(class237.field3169.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3143)) {
                                                                                                                                        var279 = 2;
                                                                                                                                        var276 = var276.substring(class237.field3143.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3157)) {
                                                                                                                                        var279 = 3;
                                                                                                                                        var276 = var276.substring(class237.field3157.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3047)) {
                                                                                                                                        var279 = 4;
                                                                                                                                        var276 = var276.substring(class237.field3047.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3149)) {
                                                                                                                                        var279 = 5;
                                                                                                                                        var276 = var276.substring(class237.field3149.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3084)) {
                                                                                                                                        var279 = 6;
                                                                                                                                        var276 = var276.substring(class237.field3084.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3136)) {
                                                                                                                                        var279 = 7;
                                                                                                                                        var276 = var276.substring(class237.field3136.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3148)) {
                                                                                                                                        var279 = 8;
                                                                                                                                        var276 = var276.substring(class237.field3148.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3180)) {
                                                                                                                                        var279 = 9;
                                                                                                                                        var276 = var276.substring(class237.field3180.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3159)) {
                                                                                                                                        var279 = 10;
                                                                                                                                        var276 = var276.substring(class237.field3159.length());
                                                                                                                                    } else if (var278.startsWith(class237.field3161)) {
                                                                                                                                        var279 = 11;
                                                                                                                                        var276 = var276.substring(class237.field3161.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                String var280 = var276.toLowerCase();
                                                                                                                                byte var281 = 0;
                                                                                                                                if (var280.startsWith(class237.field3162)) {
                                                                                                                                    var281 = 1;
                                                                                                                                    var276 = var276.substring(class237.field3162.length());
                                                                                                                                } else if (var280.startsWith(class237.field3164)) {
                                                                                                                                    var281 = 2;
                                                                                                                                    var276 = var276.substring(class237.field3164.length());
                                                                                                                                } else if (var280.startsWith(class237.field3166)) {
                                                                                                                                    var281 = 3;
                                                                                                                                    var276 = var276.substring(class237.field3166.length());
                                                                                                                                } else if (var280.startsWith(class237.field3039)) {
                                                                                                                                    var281 = 4;
                                                                                                                                    var276 = var276.substring(class237.field3039.length());
                                                                                                                                } else if (var280.startsWith(class237.field3170)) {
                                                                                                                                    var281 = 5;
                                                                                                                                    var276 = var276.substring(class237.field3170.length());
                                                                                                                                } else if (client.field972 != 0) {
                                                                                                                                    if (var280.startsWith(class237.field3163)) {
                                                                                                                                        var281 = 1;
                                                                                                                                        var276 = var276.substring(class237.field3163.length());
                                                                                                                                    } else if (var280.startsWith(class237.field3165)) {
                                                                                                                                        var281 = 2;
                                                                                                                                        var276 = var276.substring(class237.field3165.length());
                                                                                                                                    } else if (var280.startsWith(class237.field3178)) {
                                                                                                                                        var281 = 3;
                                                                                                                                        var276 = var276.substring(class237.field3178.length());
                                                                                                                                    } else if (var280.startsWith(class237.field3059)) {
                                                                                                                                        var281 = 4;
                                                                                                                                        var276 = var276.substring(class237.field3059.length());
                                                                                                                                    } else if (var280.startsWith(class237.field3171)) {
                                                                                                                                        var281 = 5;
                                                                                                                                        var276 = var276.substring(class237.field3171.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                class175 var282 = class175.method3892(class172.field2425, client.field916.field1463);
                                                                                                                                var282.field2451.method3157(0);
                                                                                                                                int var283 = var282.field2451.field2529;
                                                                                                                                var282.field2451.method3157(var277);
                                                                                                                                var282.field2451.method3157(var279);
                                                                                                                                var282.field2451.method3157(var281);
                                                                                                                                class191 var284 = var282.field2451;
                                                                                                                                int var285 = var284.field2529;
                                                                                                                                byte[] var286 = class278.method1602(var276);
                                                                                                                                var284.method3215(var286.length);
                                                                                                                                var284.field2529 += Statics.field3742.method2952(var286, 0, var286.length, var284.field2528, var284.field2529);
                                                                                                                                var282.field2451.method3018(var282.field2451.field2529 - var283);
                                                                                                                                client.field916.method1747(var282);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5009) {
                                                                                                                                Statics.field1679 -= 2;
                                                                                                                                String var287 = field1266[Statics.field1679];
                                                                                                                                String var288 = field1266[Statics.field1679 + 1];
                                                                                                                                class175 var289 = class175.method3892(class172.field2418, client.field916.field1463);
                                                                                                                                var289.field2451.method3006(0);
                                                                                                                                int var290 = var289.field2451.field2529;
                                                                                                                                var289.field2451.method3012(var287);
                                                                                                                                class191 var291 = var289.field2451;
                                                                                                                                int var292 = var291.field2529;
                                                                                                                                byte[] var293 = class278.method1602(var288);
                                                                                                                                var291.method3215(var293.length);
                                                                                                                                var291.field2529 += Statics.field3742.method2952(var293, 0, var293.length, var291.field2528, var291.field2529);
                                                                                                                                var289.field2451.method3017(var289.field2451.field2529 - var290);
                                                                                                                                client.field916.method1747(var289);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5015) {
                                                                                                                                String var294;
                                                                                                                                if (Statics.field289 == null || Statics.field289.field860 == null) {
                                                                                                                                    var294 = "";
                                                                                                                                } else {
                                                                                                                                    var294 = Statics.field289.field860;
                                                                                                                                }
                                                                                                                                field1266[++Statics.field1679 - 1] = var294;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5016) {
                                                                                                                                field1263[++Statics.field1269 - 1] = client.field1073;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5017) {
                                                                                                                                int var295 = field1263[--Statics.field1269];
                                                                                                                                int[] var296 = field1263;
                                                                                                                                int var297 = ++Statics.field1269 - 1;
                                                                                                                                class100 var298 = (class100) class97.field1430.get(var295);
                                                                                                                                int var299;
                                                                                                                                if (var298 == null) {
                                                                                                                                    var299 = 0;
                                                                                                                                } else {
                                                                                                                                    var299 = var298.method1741();
                                                                                                                                }
                                                                                                                                var296[var297] = var299;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5018) {
                                                                                                                                int var300 = field1263[--Statics.field1269];
                                                                                                                                field1263[++Statics.field1269 - 1] = Statics.method2748(var300);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5019) {
                                                                                                                                int var301 = field1263[--Statics.field1269];
                                                                                                                                int[] var302 = field1263;
                                                                                                                                int var303 = ++Statics.field1269 - 1;
                                                                                                                                class72 var304 = (class72) class97.field1426.method3382((long) var301);
                                                                                                                                int var305;
                                                                                                                                if (var304 == null) {
                                                                                                                                    var305 = -1;
                                                                                                                                } else if (class97.field1425.field2616 == var304.field2602) {
                                                                                                                                    var305 = -1;
                                                                                                                                } else {
                                                                                                                                    var305 = ((class72) var304.field2602).field828;
                                                                                                                                }
                                                                                                                                var302[var303] = var305;
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5020) {
                                                                                                                                String var306 = field1266[--Statics.field1679];
                                                                                                                                client.method2439(var306);
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5021) {
                                                                                                                                client.field886 = field1266[--Statics.field1679].toLowerCase().trim();
                                                                                                                                var258 = 1;
                                                                                                                            } else if (var317 == 5022) {
                                                                                                                                field1266[++Statics.field1679 - 1] = client.field886;
                                                                                                                                var258 = 1;
                                                                                                                            } else {
                                                                                                                                var258 = 2;
                                                                                                                            }
                                                                                                                            var76 = var258;
                                                                                                                        } else if (var317 < 5400) {
                                                                                                                            byte var307;
                                                                                                                            if (var317 == 5306) {
                                                                                                                                field1263[++Statics.field1269 - 1] = client.method537();
                                                                                                                                var307 = 1;
                                                                                                                            } else if (var317 == 5307) {
                                                                                                                                int var308 = field1263[--Statics.field1269];
                                                                                                                                if (var308 == 1 || var308 == 2) {
                                                                                                                                    client.field1069 = 0L;
                                                                                                                                    if (var308 >= 2) {
                                                                                                                                        client.field893 = true;
                                                                                                                                    } else {
                                                                                                                                        client.field893 = false;
                                                                                                                                    }
                                                                                                                                    if (client.method537() == 1) {
                                                                                                                                        Statics.field2183.method735(765, 503);
                                                                                                                                    } else {
                                                                                                                                        Statics.field2183.method735(7680, 2160);
                                                                                                                                    }
                                                                                                                                    if (client.field880 >= 25) {
                                                                                                                                        client.method3312();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var307 = 1;
                                                                                                                            } else if (var317 == 5308) {
                                                                                                                                field1263[++Statics.field1269 - 1] = Statics.field2727.field1237;
                                                                                                                                var307 = 1;
                                                                                                                            } else if (var317 == 5309) {
                                                                                                                                int var309 = field1263[--Statics.field1269];
                                                                                                                                if (var309 == 1 || var309 == 2) {
                                                                                                                                    Statics.field2727.field1237 = var309;
                                                                                                                                    class81.method1488();
                                                                                                                                }
                                                                                                                                var307 = 1;
                                                                                                                            } else {
                                                                                                                                var307 = 2;
                                                                                                                            }
                                                                                                                            var76 = var307;
                                                                                                                        } else if (var317 < 5600) {
                                                                                                                            var76 = method16(var317, var15, var75);
                                                                                                                        } else if (var317 < 5700) {
                                                                                                                            byte var310;
                                                                                                                            if (var317 == 5630) {
                                                                                                                                client.field1085 = 250;
                                                                                                                                var310 = 1;
                                                                                                                            } else {
                                                                                                                                var310 = 2;
                                                                                                                            }
                                                                                                                            var76 = var310;
                                                                                                                        } else if (var317 < 6300) {
                                                                                                                            byte var311;
                                                                                                                            if (var317 == 6200) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                client.field1108 = (short) field1263[Statics.field1269];
                                                                                                                                if (client.field1108 <= 0) {
                                                                                                                                    client.field1108 = 256;
                                                                                                                                }
                                                                                                                                client.field1109 = (short) field1263[Statics.field1269 + 1];
                                                                                                                                if (client.field1109 <= 0) {
                                                                                                                                    client.field1109 = 205;
                                                                                                                                }
                                                                                                                                var311 = 1;
                                                                                                                            } else if (var317 == 6201) {
                                                                                                                                Statics.field1269 -= 2;
                                                                                                                                client.field1047 = (short) field1263[Statics.field1269];
                                                                                                                                if (client.field1047 <= 0) {
                                                                                                                                    client.field1047 = 256;
                                                                                                                                }
                                                                                                                                client.field1111 = (short) field1263[Statics.field1269 + 1];
                                                                                                                                if (client.field1111 <= 0) {
                                                                                                                                    client.field1111 = 320;
                                                                                                                                }
                                                                                                                                var311 = 1;
                                                                                                                            } else if (var317 == 6202) {
                                                                                                                                Statics.field1269 -= 4;
                                                                                                                                client.field1112 = (short) field1263[Statics.field1269];
                                                                                                                                if (client.field1112 <= 0) {
                                                                                                                                    client.field1112 = 1;
                                                                                                                                }
                                                                                                                                client.field1113 = (short) field1263[Statics.field1269 + 1];
                                                                                                                                if (client.field1113 <= 0) {
                                                                                                                                    client.field1113 = 32767;
                                                                                                                                } else if (client.field1113 < client.field1112) {
                                                                                                                                    client.field1113 = client.field1112;
                                                                                                                                }
                                                                                                                                client.field1114 = (short) field1263[Statics.field1269 + 2];
                                                                                                                                if (client.field1114 <= 0) {
                                                                                                                                    client.field1114 = 1;
                                                                                                                                }
                                                                                                                                client.field949 = (short) field1263[Statics.field1269 + 3];
                                                                                                                                if (client.field949 <= 0) {
                                                                                                                                    client.field949 = 32767;
                                                                                                                                } else if (client.field949 < client.field1114) {
                                                                                                                                    client.field949 = client.field1114;
                                                                                                                                }
                                                                                                                                var311 = 1;
                                                                                                                            } else if (var317 == 6203) {
                                                                                                                                if (client.field981 == null) {
                                                                                                                                    field1263[++Statics.field1269 - 1] = -1;
                                                                                                                                    field1263[++Statics.field1269 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    client.method1062(0, 0, client.field981.field2778, client.field981.field2779, false);
                                                                                                                                    field1263[++Statics.field1269 - 1] = client.field1118;
                                                                                                                                    field1263[++Statics.field1269 - 1] = client.field1070;
                                                                                                                                }
                                                                                                                                var311 = 1;
                                                                                                                            } else if (var317 == 6204) {
                                                                                                                                field1263[++Statics.field1269 - 1] = client.field1047;
                                                                                                                                field1263[++Statics.field1269 - 1] = client.field1111;
                                                                                                                                var311 = 1;
                                                                                                                            } else if (var317 == 6205) {
                                                                                                                                field1263[++Statics.field1269 - 1] = client.field1108;
                                                                                                                                field1263[++Statics.field1269 - 1] = client.field1109;
                                                                                                                                var311 = 1;
                                                                                                                            } else {
                                                                                                                                var311 = 2;
                                                                                                                            }
                                                                                                                            var76 = var311;
                                                                                                                        } else if (var317 < 6600) {
                                                                                                                            var76 = method1005(var317, var15, var75);
                                                                                                                        } else if (var317 < 6700) {
                                                                                                                            var76 = method939(var317, var15, var75);
                                                                                                                        } else {
                                                                                                                            var76 = 2;
                                                                                                                        }
                                                                                                                        switch(var76) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var317 == 0) {
                                                                                                                        field1263[++Statics.field1269 - 1] = var19[var17];
                                                                                                                    } else if (var317 == 1) {
                                                                                                                        int var27 = var19[var17];
                                                                                                                        field1263[++Statics.field1269 - 1] = class223.field2726[var27];
                                                                                                                    } else if (var317 == 2) {
                                                                                                                        int var28 = var19[var17];
                                                                                                                        class223.field2726[var28] = field1263[--Statics.field1269];
                                                                                                                        client.method32(var28);
                                                                                                                    } else if (var317 == 3) {
                                                                                                                        field1266[++Statics.field1679 - 1] = var15.field1432[var17];
                                                                                                                    } else if (var317 == 6) {
                                                                                                                        var17 += var19[var17];
                                                                                                                    } else if (var317 == 7) {
                                                                                                                        Statics.field1269 -= 2;
                                                                                                                        if (field1263[Statics.field1269] != field1263[Statics.field1269 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var317 == 8) {
                                                                                                                        Statics.field1269 -= 2;
                                                                                                                        if (field1263[Statics.field1269] == field1263[Statics.field1269 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var317 == 9) {
                                                                                                                        Statics.field1269 -= 2;
                                                                                                                        if (field1263[Statics.field1269] < field1263[Statics.field1269 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var317 == 10) {
                                                                                                                        Statics.field1269 -= 2;
                                                                                                                        if (field1263[Statics.field1269] > field1263[Statics.field1269 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var317 == 21) {
                                                                                                                        if (field1258 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var29 = field1267[--field1258];
                                                                                                                        var15 = var29.field747;
                                                                                                                        var18 = var15.field1439;
                                                                                                                        var19 = var15.field1433;
                                                                                                                        var17 = var29.field750;
                                                                                                                        Statics.field1264 = var29.field748;
                                                                                                                        Statics.field1257 = var29.field749;
                                                                                                                    } else if (var317 == 25) {
                                                                                                                        int var30 = var19[var17];
                                                                                                                        field1263[++Statics.field1269 - 1] = class223.method1428(var30);
                                                                                                                    } else if (var317 == 27) {
                                                                                                                        int var31 = var19[var17];
                                                                                                                        int var32 = field1263[--Statics.field1269];
                                                                                                                        class262 var33 = (class262) class262.field3471.method3407((long) var31);
                                                                                                                        class262 var34;
                                                                                                                        if (var33 == null) {
                                                                                                                            byte[] var35 = Statics.field3470.method3931(14, var31);
                                                                                                                            class262 var36 = new class262();
                                                                                                                            if (var35 != null) {
                                                                                                                                var36.method4205(new class185(var35));
                                                                                                                            }
                                                                                                                            class262.field3471.method3408(var36, (long) var31);
                                                                                                                            var34 = var36;
                                                                                                                        } else {
                                                                                                                            var34 = var33;
                                                                                                                        }
                                                                                                                        int var38 = var34.field3473;
                                                                                                                        int var39 = var34.field3472;
                                                                                                                        int var40 = var34.field3474;
                                                                                                                        int var41 = class223.field2728[var40 - var39];
                                                                                                                        if (var32 < 0 || var32 > var41) {
                                                                                                                            var32 = 0;
                                                                                                                        }
                                                                                                                        int var42 = var41 << var39;
                                                                                                                        class223.field2726[var38] = class223.field2726[var38] & ~var42 | var32 << var39 & var42;
                                                                                                                    } else if (var317 == 31) {
                                                                                                                        Statics.field1269 -= 2;
                                                                                                                        if (field1263[Statics.field1269] <= field1263[Statics.field1269 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var317 == 32) {
                                                                                                                        Statics.field1269 -= 2;
                                                                                                                        if (field1263[Statics.field1269] >= field1263[Statics.field1269 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var317 == 33) {
                                                                                                                        field1263[++Statics.field1269 - 1] = Statics.field1264[var19[var17]];
                                                                                                                    } else if (var317 == 34) {
                                                                                                                        Statics.field1264[var19[var17]] = field1263[--Statics.field1269];
                                                                                                                    } else if (var317 == 35) {
                                                                                                                        field1266[++Statics.field1679 - 1] = Statics.field1257[var19[var17]];
                                                                                                                    } else if (var317 == 36) {
                                                                                                                        Statics.field1257[var19[var17]] = field1266[--Statics.field1679];
                                                                                                                    } else if (var317 == 37) {
                                                                                                                        int var43 = var19[var17];
                                                                                                                        Statics.field1679 -= var43;
                                                                                                                        String[] var44 = field1266;
                                                                                                                        int var45 = Statics.field1679;
                                                                                                                        String var46;
                                                                                                                        if (var43 == 0) {
                                                                                                                            var46 = "";
                                                                                                                        } else if (var43 == 1) {
                                                                                                                            String var47 = var44[var45];
                                                                                                                            if (var47 == null) {
                                                                                                                                var46 = "null";
                                                                                                                            } else {
                                                                                                                                var46 = var47.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var48 = var43 + var45;
                                                                                                                            int var49 = 0;
                                                                                                                            for (int var50 = var45; var50 < var48; var50++) {
                                                                                                                                String var51 = var44[var50];
                                                                                                                                if (var51 == null) {
                                                                                                                                    var49 += 4;
                                                                                                                                } else {
                                                                                                                                    var49 += var51.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var52 = new StringBuilder(var49);
                                                                                                                            for (int var53 = var45; var53 < var48; var53++) {
                                                                                                                                String var54 = var44[var53];
                                                                                                                                if (var54 == null) {
                                                                                                                                    var52.append("null");
                                                                                                                                } else {
                                                                                                                                    var52.append(var54);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var46 = var52.toString();
                                                                                                                        }
                                                                                                                        field1266[++Statics.field1679 - 1] = var46;
                                                                                                                    } else if (var317 == 38) {
                                                                                                                        Statics.field1269--;
                                                                                                                    } else if (var317 == 39) {
                                                                                                                        Statics.field1679--;
                                                                                                                    } else if (var317 == 40) {
                                                                                                                        int var56 = var19[var17];
                                                                                                                        class98 var57 = class98.method2717(var56);
                                                                                                                        int[] var58 = new int[var57.field1435];
                                                                                                                        String[] var59 = new String[var57.field1434];
                                                                                                                        for (int var60 = 0; var60 < var57.field1437; var60++) {
                                                                                                                            var58[var60] = field1263[Statics.field1269 - var57.field1437 + var60];
                                                                                                                        }
                                                                                                                        for (int var61 = 0; var61 < var57.field1438; var61++) {
                                                                                                                            var59[var61] = field1266[Statics.field1679 - var57.field1438 + var61];
                                                                                                                        }
                                                                                                                        Statics.field1269 -= var57.field1437;
                                                                                                                        Statics.field1679 -= var57.field1438;
                                                                                                                        class63 var62 = new class63();
                                                                                                                        var62.field747 = var15;
                                                                                                                        var62.field750 = var17;
                                                                                                                        var62.field748 = Statics.field1264;
                                                                                                                        var62.field749 = Statics.field1257;
                                                                                                                        field1267[++field1258 - 1] = var62;
                                                                                                                        var15 = var57;
                                                                                                                        var18 = var57.field1439;
                                                                                                                        var19 = var57.field1433;
                                                                                                                        var17 = -1;
                                                                                                                        Statics.field1264 = var58;
                                                                                                                        Statics.field1257 = var59;
                                                                                                                    } else if (var317 == 42) {
                                                                                                                        field1263[++Statics.field1269 - 1] = Statics.field2177.method1676(var19[var17]);
                                                                                                                    } else if (var317 == 43) {
                                                                                                                        Statics.field2177.method1697(var19[var17], field1263[--Statics.field1269]);
                                                                                                                    } else if (var317 == 44) {
                                                                                                                        int var63 = var19[var17] >> 16;
                                                                                                                        int var64 = var19[var17] & 0xFFFF;
                                                                                                                        int var65 = field1263[--Statics.field1269];
                                                                                                                        if (var65 >= 0 && var65 <= 5000) {
                                                                                                                            field1261[var63] = var65;
                                                                                                                            byte var66 = -1;
                                                                                                                            if (var64 == 105) {
                                                                                                                                var66 = 0;
                                                                                                                            }
                                                                                                                            int var67 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var67 >= var65) {
                                                                                                                                    continue label1713;
                                                                                                                                }
                                                                                                                                field1262[var63][var67] = var66;
                                                                                                                                var67++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var317 == 45) {
                                                                                                                        int var68 = var19[var17];
                                                                                                                        int var69 = field1263[--Statics.field1269];
                                                                                                                        if (var69 < 0 || var69 >= field1261[var68]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1263[++Statics.field1269 - 1] = field1262[var68][var69];
                                                                                                                    } else if (var317 == 46) {
                                                                                                                        int var70 = var19[var17];
                                                                                                                        Statics.field1269 -= 2;
                                                                                                                        int var71 = field1263[Statics.field1269];
                                                                                                                        if (var71 < 0 || var71 >= field1261[var70]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1262[var70][var71] = field1263[Statics.field1269 + 1];
                                                                                                                    } else if (var317 == 47) {
                                                                                                                        String var72 = Statics.field2177.method1688(var19[var17]);
                                                                                                                        if (var72 == null) {
                                                                                                                            var72 = "null";
                                                                                                                        }
                                                                                                                        field1266[++Statics.field1679 - 1] = var72;
                                                                                                                    } else if (var317 == 48) {
                                                                                                                        Statics.field2177.method1677(var19[var17], field1266[--Statics.field1679]);
                                                                                                                    } else if (var317 == 60) {
                                                                                                                        class198 var73 = var15.field1431[var19[var17]];
                                                                                                                        class210 var74 = (class210) var73.method3382((long) field1263[--Statics.field1269]);
                                                                                                                        if (var74 != null) {
                                                                                                                            var17 += var74.field2611;
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
        } catch (Exception var316) {
            StringBuilder var314 = new StringBuilder(30);
            var314.append("").append(var15.field2597).append(" ");
            for (int var315 = field1258 - 1; var315 >= 0; var315--) {
                var314.append("").append(field1267[var315].field747.field2597).append(" ");
            }
            var314.append("").append(var20);
            class155.method4721(var314.toString(), var316);
        }
    }

    @ObfuscatedName("be.y(ILcv;ZB)I")
    public static int method1002(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1269 -= 3;
            int var3 = field1263[Statics.field1269];
            int var4 = field1263[Statics.field1269 + 1];
            int var5 = field1263[Statics.field1269 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class228 var6 = class228.method2725(var3);
            if (var6.field2887 == null) {
                var6.field2887 = new class228[var5 + 1];
            }
            if (var6.field2887.length <= var5) {
                class228[] var7 = new class228[var5 + 1];
                for (int var8 = 0; var8 < var6.field2887.length; var8++) {
                    var7[var8] = var6.field2887[var8];
                }
                var6.field2887 = var7;
            }
            if (var5 > 0 && var6.field2887[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class228 var9 = new class228();
            var9.field2765 = var4;
            var9.field2782 = var9.field2763 = var6.field2763;
            var9.field2764 = var5;
            var9.field2812 = true;
            var6.field2887[var5] = var9;
            if (arg2) {
                Statics.field1268 = var9;
            } else {
                Statics.field1217 = var9;
            }
            client.method211(var6);
            return 1;
        } else if (arg0 == 101) {
            class228 var10 = arg2 ? Statics.field1268 : Statics.field1217;
            class228 var11 = class228.method2725(var10.field2763);
            var11.field2887[var10.field2764] = null;
            client.method211(var11);
            return 1;
        } else if (arg0 == 102) {
            class228 var12 = class228.method2725(field1263[--Statics.field1269]);
            var12.field2887 = null;
            client.method211(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1269 -= 2;
            int var13 = field1263[Statics.field1269];
            int var14 = field1263[Statics.field1269 + 1];
            class228 var15 = class228.method19(var13, var14);
            if (var15 == null || var14 == -1) {
                field1263[++Statics.field1269 - 1] = 0;
            } else {
                field1263[++Statics.field1269 - 1] = 1;
                if (arg2) {
                    Statics.field1268 = var15;
                } else {
                    Statics.field1217 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class228 var16 = class228.method2725(field1263[--Statics.field1269]);
            if (var16 == null) {
                field1263[++Statics.field1269 - 1] = 0;
            } else {
                field1263[++Statics.field1269 - 1] = 1;
                if (arg2) {
                    Statics.field1268 = var16;
                } else {
                    Statics.field1217 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.r(ILcv;ZB)I")
    public static int method617(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class228 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1263[--Statics.field1269];
            var4 = class228.method2725(var3);
        } else {
            var4 = arg2 ? Statics.field1268 : Statics.field1217;
        }
        if (arg0 == 1000) {
            Statics.field1269 -= 4;
            var4.field2865 = field1263[Statics.field1269];
            var4.field2773 = field1263[Statics.field1269 + 1];
            var4.field2768 = field1263[Statics.field1269 + 2];
            var4.field2795 = field1263[Statics.field1269 + 3];
            client.method211(var4);
            Statics.field2183.method1092(var4);
            if (var3 != -1 && var4.field2765 == 0) {
                client.method2835(Statics.field2754[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1269 -= 4;
            var4.field2774 = field1263[Statics.field1269];
            var4.field2775 = field1263[Statics.field1269 + 1];
            var4.field2816 = field1263[Statics.field1269 + 2];
            var4.field2771 = field1263[Statics.field1269 + 3];
            client.method211(var4);
            Statics.field2183.method1092(var4);
            if (var3 != -1 && var4.field2765 == 0) {
                client.method2835(Statics.field2754[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1263[--Statics.field1269] == 1;
            if (var4.field2783 != var5) {
                var4.field2783 = var5;
                client.method211(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2896 = field1263[--Statics.field1269] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2804 = field1263[--Statics.field1269] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.h(ILcv;ZB)I")
    public static int method549(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class228 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1263[--Statics.field1269];
            var4 = class228.method2725(var3);
        } else {
            var4 = arg2 ? Statics.field1268 : Statics.field1217;
        }
        if (arg0 == 1100) {
            Statics.field1269 -= 2;
            var4.field2784 = field1263[Statics.field1269];
            if (var4.field2784 > var4.field2786 - var4.field2778) {
                var4.field2784 = var4.field2786 - var4.field2778;
            }
            if (var4.field2784 < 0) {
                var4.field2784 = 0;
            }
            var4.field2867 = field1263[Statics.field1269 + 1];
            if (var4.field2867 > var4.field2787 - var4.field2779) {
                var4.field2867 = var4.field2787 - var4.field2779;
            }
            if (var4.field2867 < 0) {
                var4.field2867 = 0;
            }
            client.method211(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2788 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2792 = field1263[--Statics.field1269] == 1;
            client.method211(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2794 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2796 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2798 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2800 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2801 = field1263[--Statics.field1269] == 1;
            client.method211(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2889 = 1;
            var4.field2807 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1269 -= 6;
            var4.field2869 = field1263[Statics.field1269];
            var4.field2813 = field1263[Statics.field1269 + 1];
            var4.field2814 = field1263[Statics.field1269 + 2];
            var4.field2815 = field1263[Statics.field1269 + 3];
            var4.field2767 = field1263[Statics.field1269 + 4];
            var4.field2817 = field1263[Statics.field1269 + 5];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1263[--Statics.field1269];
            if (var4.field2750 != var5) {
                var4.field2750 = var5;
                var4.field2885 = 0;
                var4.field2886 = 0;
                client.method211(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2858 = field1263[--Statics.field1269] == 1;
            client.method211(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1266[--Statics.field1679];
            if (!var6.equals(var4.field2823)) {
                var4.field2823 = var6;
                client.method211(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2806 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1269 -= 3;
            var4.field2826 = field1263[Statics.field1269];
            var4.field2762 = field1263[Statics.field1269 + 1];
            var4.field2836 = field1263[Statics.field1269 + 2];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2828 = field1263[--Statics.field1269] == 1;
            client.method211(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2802 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2803 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2893 = field1263[--Statics.field1269] == 1;
            client.method211(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2766 = field1263[--Statics.field1269] == 1;
            client.method211(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1269 -= 2;
            var4.field2786 = field1263[Statics.field1269];
            var4.field2787 = field1263[Statics.field1269 + 1];
            client.method211(var4);
            if (var3 != -1 && var4.field2765 == 0) {
                client.method2835(Statics.field2754[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2763;
            int var8 = var4.field2764;
            class175 var9 = class175.method3892(class172.field2355, client.field916.field1463);
            var9.field2451.method3125(var8);
            var9.field2451.method3066(var7);
            client.field916.method1747(var9);
            client.field1020 = var4;
            client.method211(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2799 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2789 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2897 = field1263[--Statics.field1269];
            client.method211(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var10 = field1263[--Statics.field1269];
            class297[] var11 = new class297[] { class297.field3845, class297.field3842, class297.field3846, class297.field3843, class297.field3847 };
            class297 var12 = (class297) class180.method455(var11, var10);
            if (var12 != null) {
                var4.field2793 = var12;
                client.method211(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var13 = field1263[--Statics.field1269] == 1;
            var4.field2797 = var13;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.d(ILcv;ZI)I")
    public static int method48(int arg0, class98 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method2725(field1263[--Statics.field1269]);
        } else {
            var3 = arg2 ? Statics.field1268 : Statics.field1217;
        }
        client.method211(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1269 -= 2;
            int var4 = field1263[Statics.field1269];
            int var5 = field1263[Statics.field1269 + 1];
            var3.field2883 = var4;
            var3.field2884 = var5;
            class268 var6 = class268.method1985(var4);
            var3.field2814 = var6.field3589;
            var3.field2815 = var6.field3609;
            var3.field2767 = var6.field3594;
            var3.field2869 = var6.field3590;
            var3.field2813 = var6.field3593;
            var3.field2817 = var6.field3588;
            if (arg0 == 1205) {
                var3.field2785 = 0;
            } else if (arg0 == 1212 | var6.field3578 == 1) {
                var3.field2785 = 1;
            } else {
                var3.field2785 = 2;
            }
            if (var3.field2818 > 0) {
                var3.field2817 = var3.field2817 * 32 / var3.field2818;
            } else if (var3.field2774 > 0) {
                var3.field2817 = var3.field2817 * 32 / var3.field2774;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2889 = 2;
            var3.field2807 = field1263[--Statics.field1269];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2889 = 3;
            var3.field2807 = Statics.field289.field858.method3812();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.b(ILcv;ZI)I")
    public static int method12(int arg0, class98 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method2725(field1263[--Statics.field1269]);
        } else {
            var3 = arg2 ? Statics.field1268 : Statics.field1217;
        }
        String var4 = field1266[--Statics.field1679];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1263[--Statics.field1269];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1263[--Statics.field1269];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1266[--Statics.field1679];
            } else {
                var7[var8] = Integer.valueOf(field1263[--Statics.field1269]);
            }
        }
        int var9 = field1263[--Statics.field1269];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2845 = var7;
        } else if (arg0 == 1401) {
            var3.field2848 = var7;
        } else if (arg0 == 1402) {
            var3.field2855 = var7;
        } else if (arg0 == 1403) {
            var3.field2849 = var7;
        } else if (arg0 == 1404) {
            var3.field2851 = var7;
        } else if (arg0 == 1405) {
            var3.field2821 = var7;
        } else if (arg0 == 1406) {
            var3.field2857 = var7;
        } else if (arg0 == 1407) {
            var3.field2856 = var7;
            var3.field2770 = var5;
        } else if (arg0 == 1408) {
            var3.field2780 = var7;
        } else if (arg0 == 1409) {
            var3.field2863 = var7;
        } else if (arg0 == 1410) {
            var3.field2853 = var7;
        } else if (arg0 == 1411) {
            var3.field2846 = var7;
        } else if (arg0 == 1412) {
            var3.field2827 = var7;
        } else if (arg0 == 1414) {
            var3.field2878 = var7;
            var3.field2859 = var5;
        } else if (arg0 == 1415) {
            var3.field2769 = var7;
            var3.field2840 = var5;
        } else if (arg0 == 1416) {
            var3.field2837 = var7;
        } else if (arg0 == 1417) {
            var3.field2864 = var7;
        } else if (arg0 == 1418) {
            var3.field2877 = var7;
        } else if (arg0 == 1419) {
            var3.field2866 = var7;
        } else if (arg0 == 1420) {
            var3.field2756 = var7;
        } else if (arg0 == 1421) {
            var3.field2835 = var7;
        } else if (arg0 == 1422) {
            var3.field2860 = var7;
        } else if (arg0 == 1423) {
            var3.field2879 = var7;
        } else if (arg0 == 1424) {
            var3.field2871 = var7;
        } else if (arg0 == 1425) {
            var3.field2873 = var7;
        } else if (arg0 == 1426) {
            var3.field2874 = var7;
        } else if (arg0 == 1427) {
            var3.field2872 = var7;
        } else {
            return 2;
        }
        var3.field2891 = true;
        return 1;
    }

    @ObfuscatedName("ek.e(ILcv;ZI)I")
    public static int method2709(int arg0, class98 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field1268 : Statics.field1217;
        if (arg0 == 1500) {
            field1263[++Statics.field1269 - 1] = var3.field2757;
            return 1;
        } else if (arg0 == 1501) {
            field1263[++Statics.field1269 - 1] = var3.field2825;
            return 1;
        } else if (arg0 == 1502) {
            field1263[++Statics.field1269 - 1] = var3.field2778;
            return 1;
        } else if (arg0 == 1503) {
            field1263[++Statics.field1269 - 1] = var3.field2779;
            return 1;
        } else if (arg0 == 1504) {
            field1263[++Statics.field1269 - 1] = var3.field2783 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1263[++Statics.field1269 - 1] = var3.field2782;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.f(ILcv;ZB)I")
    public static int method28(int arg0, class98 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field1268 : Statics.field1217;
        if (arg0 == 1700) {
            field1263[++Statics.field1269 - 1] = var3.field2883;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2883 == -1) {
                field1263[++Statics.field1269 - 1] = 0;
            } else {
                field1263[++Statics.field1269 - 1] = var3.field2884;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1263[++Statics.field1269 - 1] = var3.field2764;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.u(ILcv;ZI)I")
    public static int method1424(int arg0, class98 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method2725(field1263[--Statics.field1269]);
        } else {
            var3 = arg2 ? Statics.field1268 : Statics.field1217;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1272 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2872 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field797 = var3;
            var4.field805 = var3.field2872;
            var4.field804 = field1272 + 1;
            client.field1055.method3482(var4);
            return 1;
        }
    }

    @ObfuscatedName("bp.t(ILcv;ZI)I")
    public static int method1008(int arg0, class98 arg1, boolean arg2) {
        class228 var3 = class228.method2725(field1263[--Statics.field1269]);
        if (arg0 == 2800) {
            int[] var4 = field1263;
            int var5 = ++Statics.field1269 - 1;
            int var6 = client.method1563(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 2801) {
            int var8 = field1263[--Statics.field1269];
            int var9 = var8 - 1;
            if (var3.field2820 == null || var9 >= var3.field2820.length || var3.field2820[var9] == null) {
                field1266[++Statics.field1679 - 1] = "";
            } else {
                field1266[++Statics.field1679 - 1] = var3.field2820[var9];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2854 == null) {
                field1266[++Statics.field1679 - 1] = "";
            } else {
                field1266[++Statics.field1679 - 1] = var3.field2854;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jy.o(ILcv;ZI)I")
    public static int method4488(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1263[++Statics.field1269 - 1] = client.field883;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1269 -= 2;
            int var3 = field1263[Statics.field1269];
            int var4 = field1263[Statics.field1269 + 1];
            field1263[++Statics.field1269 - 1] = class64.method1007(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1269 -= 2;
            int var5 = field1263[Statics.field1269];
            int var6 = field1263[Statics.field1269 + 1];
            int[] var7 = field1263;
            int var8 = ++Statics.field1269 - 1;
            class64 var9 = (class64) class64.field755.method3416((long) var5);
            int var10;
            if (var9 == null) {
                var10 = 0;
            } else if (var6 >= 0 && var6 < var9.field759.length) {
                var10 = var9.field759[var6];
            } else {
                var10 = 0;
            }
            var7[var8] = var10;
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1269 -= 2;
            int var11 = field1263[Statics.field1269];
            int var12 = field1263[Statics.field1269 + 1];
            int[] var13 = field1263;
            int var14 = ++Statics.field1269 - 1;
            class64 var15 = (class64) class64.field755.method3416((long) var11);
            int var16;
            if (var15 == null) {
                var16 = 0;
            } else if (var12 == -1) {
                var16 = 0;
            } else {
                int var17 = 0;
                for (int var18 = 0; var18 < var15.field759.length; var18++) {
                    if (var15.field754[var18] == var12) {
                        var17 += var15.field759[var18];
                    }
                }
                var16 = var17;
            }
            var13[var14] = var16;
            return 1;
        } else if (arg0 == 3304) {
            int var19 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = class252.method2198(var19).field3373;
            return 1;
        } else if (arg0 == 3305) {
            int var20 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.field990[var20];
            return 1;
        } else if (arg0 == 3306) {
            int var21 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.field1116[var21];
            return 1;
        } else if (arg0 == 3307) {
            int var22 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.field901[var22];
            return 1;
        } else if (arg0 == 3308) {
            int var23 = Statics.field226;
            int var24 = (Statics.field289.field1155 >> 7) + Statics.field2458;
            int var25 = (Statics.field289.field1151 >> 7) + Statics.field1288;
            field1263[++Statics.field1269 - 1] = (var23 << 28) + (var24 << 14) + var25;
            return 1;
        } else if (arg0 == 3309) {
            int var26 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = var26 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var27 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = var27 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var28 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = var28 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1263[++Statics.field1269 - 1] = client.field875 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1269 -= 2;
            int var29 = field1263[Statics.field1269] + 32768;
            int var30 = field1263[Statics.field1269 + 1];
            field1263[++Statics.field1269 - 1] = class64.method1007(var29, var30);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1269 -= 2;
            int var31 = field1263[Statics.field1269] + 32768;
            int var32 = field1263[Statics.field1269 + 1];
            int[] var33 = field1263;
            int var34 = ++Statics.field1269 - 1;
            class64 var35 = (class64) class64.field755.method3416((long) var31);
            int var36;
            if (var35 == null) {
                var36 = 0;
            } else if (var32 >= 0 && var32 < var35.field759.length) {
                var36 = var35.field759[var32];
            } else {
                var36 = 0;
            }
            var33[var34] = var36;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1269 -= 2;
            int var37 = field1263[Statics.field1269] + 32768;
            int var38 = field1263[Statics.field1269 + 1];
            int[] var39 = field1263;
            int var40 = ++Statics.field1269 - 1;
            class64 var41 = (class64) class64.field755.method3416((long) var37);
            int var42;
            if (var41 == null) {
                var42 = 0;
            } else if (var38 == -1) {
                var42 = 0;
            } else {
                int var43 = 0;
                for (int var44 = 0; var44 < var41.field759.length; var44++) {
                    if (var41.field754[var44] == var38) {
                        var43 += var41.field759[var44];
                    }
                }
                var42 = var43;
            }
            var39[var40] = var42;
            return 1;
        } else if (arg0 == 3316) {
            if (client.field1023 >= 2) {
                field1263[++Statics.field1269 - 1] = client.field1023;
            } else {
                field1263[++Statics.field1269 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1263[++Statics.field1269 - 1] = client.field890;
            return 1;
        } else if (arg0 == 3318) {
            field1263[++Statics.field1269 - 1] = client.field874;
            return 1;
        } else if (arg0 == 3321) {
            field1263[++Statics.field1269 - 1] = client.field1063;
            return 1;
        } else if (arg0 == 3322) {
            field1263[++Statics.field1269 - 1] = client.field957;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field984) {
                field1263[++Statics.field1269 - 1] = 1;
            } else {
                field1263[++Statics.field1269 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1263[++Statics.field1269 - 1] = client.field1126;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1269 -= 4;
            int var45 = field1263[Statics.field1269];
            int var46 = field1263[Statics.field1269 + 1];
            int var47 = field1263[Statics.field1269 + 2];
            int var48 = field1263[Statics.field1269 + 3];
            int var49 = (var46 << 14) + var45;
            int var50 = (var47 << 28) + var49;
            int var51 = var48 + var50;
            field1263[++Statics.field1269 - 1] = var51;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.a(ILcv;ZB)I")
    public static int method169(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.field1130[var3].method94();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.field1130[var4].field290;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.field1130[var5].field291;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.field1130[var6].field292;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.field1130[var7].field293;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.field1130[var8].field294;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1263[--Statics.field1269];
            int var10 = client.field1130[var9].method93();
            field1263[++Statics.field1269 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1263[--Statics.field1269];
            int var12 = client.field1130[var11].method93();
            field1263[++Statics.field1269 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1263[--Statics.field1269];
            int var14 = client.field1130[var13].method93();
            field1263[++Statics.field1269 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1263[--Statics.field1269];
            int var16 = client.field1130[var15].method93();
            field1263[++Statics.field1269 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1263[--Statics.field1269] == 1;
            if (Statics.field308 != null) {
                Statics.field308.method66(class14.field267, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1263[--Statics.field1269] == 1;
            if (Statics.field308 != null) {
                Statics.field308.method66(class14.field266, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1269 -= 2;
            boolean var19 = field1263[Statics.field1269] == 1;
            boolean var20 = field1263[Statics.field1269 + 1] == 1;
            if (Statics.field308 != null) {
                client.field1131.field863 = var20;
                Statics.field308.method66(client.field1131, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1263[--Statics.field1269] == 1;
            if (Statics.field308 != null) {
                Statics.field308.method66(class14.field265, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1263[--Statics.field1269] == 1;
            if (Statics.field308 != null) {
                Statics.field308.method66(class14.field268, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1263[++Statics.field1269 - 1] = Statics.field308 == null ? 0 : Statics.field308.field272.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1263[--Statics.field1269];
            class15 var24 = (class15) Statics.field308.field272.get(var23);
            field1263[++Statics.field1269 - 1] = var24.field276;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1263[--Statics.field1269];
            class15 var26 = (class15) Statics.field308.field272.get(var25);
            field1266[++Statics.field1679 - 1] = var26.method77();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1263[--Statics.field1269];
            class15 var28 = (class15) Statics.field308.field272.get(var27);
            field1266[++Statics.field1679 - 1] = var28.method72();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1263[--Statics.field1269];
            class15 var30 = (class15) Statics.field308.field272.get(var29);
            long var31 = class187.method938() - Statics.field3717 - var30.field275;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1266[++Statics.field1679 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1263[--Statics.field1269];
            class15 var38 = (class15) Statics.field308.field272.get(var37);
            field1263[++Statics.field1269 - 1] = var38.field277.field292;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1263[--Statics.field1269];
            class15 var40 = (class15) Statics.field308.field272.get(var39);
            field1263[++Statics.field1269 - 1] = var40.field277.field291;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1263[--Statics.field1269];
            class15 var42 = (class15) Statics.field308.field272.get(var41);
            field1263[++Statics.field1269 - 1] = var42.field277.field290;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ia.i(ILcv;ZI)I")
    public static int method3893(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1266[--Statics.field1679];
            int var4 = field1263[--Statics.field1269];
            field1266[++Statics.field1679 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1679 -= 2;
            String var5 = field1266[Statics.field1679];
            String var6 = field1266[Statics.field1679 + 1];
            field1266[++Statics.field1679 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1266[--Statics.field1679];
            int var8 = field1263[--Statics.field1269];
            field1266[++Statics.field1679 - 1] = var7 + class282.method2515(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1266[--Statics.field1679];
            field1266[++Statics.field1679 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1263[--Statics.field1269];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1259.setTime(new Date(var11));
            int var13 = field1259.get(5);
            int var14 = field1259.get(2);
            int var15 = field1259.get(1);
            field1266[++Statics.field1679 - 1] = var13 + "-" + field1270[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1679 -= 2;
            String var16 = field1266[Statics.field1679];
            String var17 = field1266[Statics.field1679 + 1];
            if (Statics.field289.field858 != null && Statics.field289.field858.field2738) {
                field1266[++Statics.field1679 - 1] = var17;
            } else {
                field1266[++Statics.field1679 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1263[--Statics.field1269];
            field1266[++Statics.field1679 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1679 -= 2;
            int[] var19 = field1263;
            int var20 = ++Statics.field1269 - 1;
            String var21 = field1266[Statics.field1679];
            String var22 = field1266[Statics.field1679 + 1];
            int var23 = client.field972;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            char var28 = 0;
            char var29 = 0;
            int var38;
            label229: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class176.method3241(var36, var23) - class176.method3241(var37, var23);
                                break label229;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class176.method3241(var41, var23) - class176.method3241(var42, var23);
                                break label229;
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
                var28 = class176.method528(var43);
                var29 = class176.method528(var45);
                char var47 = class176.method2847(var43, var23);
                char var48 = class176.method2847(var45, var23);
                if (var47 != var48 && Character.toUpperCase(var47) != Character.toUpperCase(var48)) {
                    char var49 = Character.toLowerCase(var47);
                    char var50 = Character.toLowerCase(var48);
                    if (var49 != var50) {
                        var38 = class176.method3241(var49, var23) - class176.method3241(var50, var23);
                        break;
                    }
                }
            }
            byte var52;
            if (var38 > 0) {
                var52 = 1;
            } else if (var38 < 0) {
                var52 = -1;
            } else {
                var52 = 0;
            }
            var19[var20] = var52;
            return 1;
        } else if (arg0 == 4108) {
            String var53 = field1266[--Statics.field1679];
            Statics.field1269 -= 2;
            int var54 = field1263[Statics.field1269];
            int var55 = field1263[Statics.field1269 + 1];
            byte[] var56 = Statics.field771.method3931(var55, 0);
            class275 var57 = new class275(var56);
            field1263[++Statics.field1269 - 1] = var57.method4627(var53, var54);
            return 1;
        } else if (arg0 == 4109) {
            String var58 = field1266[--Statics.field1679];
            Statics.field1269 -= 2;
            int var59 = field1263[Statics.field1269];
            int var60 = field1263[Statics.field1269 + 1];
            byte[] var61 = Statics.field771.method3931(var60, 0);
            class275 var62 = new class275(var61);
            field1263[++Statics.field1269 - 1] = var62.method4593(var58, var59);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1679 -= 2;
            String var63 = field1266[Statics.field1679];
            String var64 = field1266[Statics.field1679 + 1];
            if (field1263[--Statics.field1269] == 1) {
                field1266[++Statics.field1679 - 1] = var63;
            } else {
                field1266[++Statics.field1679 - 1] = var64;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var65 = field1266[--Statics.field1679];
            field1266[++Statics.field1679 - 1] = class276.method4581(var65);
            return 1;
        } else if (arg0 == 4112) {
            String var66 = field1266[--Statics.field1679];
            int var67 = field1263[--Statics.field1269];
            field1266[++Statics.field1679 - 1] = var66 + (char) var67;
            return 1;
        } else if (arg0 == 4113) {
            int var68 = field1263[--Statics.field1269];
            int[] var69 = field1263;
            int var70 = ++Statics.field1269 - 1;
            char var71 = (char) var68;
            boolean var72;
            if (var71 >= ' ' && var71 <= '~') {
                var72 = true;
            } else if (var71 >= 160 && var71 <= 255) {
                var72 = true;
            } else if (var71 == 8364 || var71 == 338 || var71 == 8212 || var71 == 339 || var71 == 376) {
                var72 = true;
            } else {
                var72 = false;
            }
            var69[var70] = var72 ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var73 = field1263[--Statics.field1269];
            int[] var74 = field1263;
            int var75 = ++Statics.field1269 - 1;
            char var76 = (char) var73;
            boolean var77 = var76 >= '0' && var76 <= '9' || var76 >= 'A' && var76 <= 'Z' || var76 >= 'a' && var76 <= 'z';
            var74[var75] = var77 ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var78 = field1263[--Statics.field1269];
            int[] var79 = field1263;
            int var80 = ++Statics.field1269 - 1;
            char var81 = (char) var78;
            boolean var82 = var81 >= 'A' && var81 <= 'Z' || var81 >= 'a' && var81 <= 'z';
            var79[var80] = var82 ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var83 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = class282.method3673((char) var83) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var84 = field1266[--Statics.field1679];
            if (var84 == null) {
                field1263[++Statics.field1269 - 1] = 0;
            } else {
                field1263[++Statics.field1269 - 1] = var84.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var85 = field1266[--Statics.field1679];
            Statics.field1269 -= 2;
            int var86 = field1263[Statics.field1269];
            int var87 = field1263[Statics.field1269 + 1];
            field1266[++Statics.field1679 - 1] = var85.substring(var86, var87);
            return 1;
        } else if (arg0 == 4119) {
            String var88 = field1266[--Statics.field1679];
            StringBuilder var89 = new StringBuilder(var88.length());
            boolean var90 = false;
            for (int var91 = 0; var91 < var88.length(); var91++) {
                char var92 = var88.charAt(var91);
                if (var92 == '<') {
                    var90 = true;
                } else if (var92 == '>') {
                    var90 = false;
                } else if (!var90) {
                    var89.append(var92);
                }
            }
            field1266[++Statics.field1679 - 1] = var89.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var93 = field1266[--Statics.field1679];
            int var94 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = var93.indexOf(var94);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1679 -= 2;
            String var95 = field1266[Statics.field1679];
            String var96 = field1266[Statics.field1679 + 1];
            int var97 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = var95.indexOf(var96, var97);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.m(ILcv;ZI)I")
    public static int method16(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1269 -= 2;
            int var3 = field1263[Statics.field1269];
            int var4 = field1263[Statics.field1269 + 1];
            if (!client.field1102) {
                client.field1093 = var3;
                client.field940 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1263[++Statics.field1269 - 1] = client.field1093;
            return 1;
        } else if (arg0 == 5506) {
            field1263[++Statics.field1269 - 1] = client.field940;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1263[--Statics.field1269];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field1024 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1263[++Statics.field1269 - 1] = client.field1024;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.x(ILcv;ZB)I")
    public static int method1005(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1263[++Statics.field1269 - 1] = class80.method454() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class80.field1218 = 0;
            class80 var3;
            if (class80.field1218 < class80.field1222) {
                var3 = Statics.field1221[++class80.field1218 - 1];
            } else {
                var3 = null;
            }
            if (var3 == null) {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = 0;
                field1266[++Statics.field1679 - 1] = "";
                field1263[++Statics.field1269 - 1] = 0;
                field1263[++Statics.field1269 - 1] = 0;
                field1266[++Statics.field1679 - 1] = "";
            } else {
                field1263[++Statics.field1269 - 1] = var3.field1226;
                field1263[++Statics.field1269 - 1] = var3.field1220;
                field1266[++Statics.field1679 - 1] = var3.field1223;
                field1263[++Statics.field1269 - 1] = var3.field1227;
                field1263[++Statics.field1269 - 1] = var3.field1228;
                field1266[++Statics.field1679 - 1] = var3.field1229;
            }
            return 1;
        } else if (arg0 == 6502) {
            class80 var6;
            if (class80.field1218 < class80.field1222) {
                var6 = Statics.field1221[++class80.field1218 - 1];
            } else {
                var6 = null;
            }
            if (var6 == null) {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = 0;
                field1266[++Statics.field1679 - 1] = "";
                field1263[++Statics.field1269 - 1] = 0;
                field1263[++Statics.field1269 - 1] = 0;
                field1266[++Statics.field1679 - 1] = "";
            } else {
                field1263[++Statics.field1269 - 1] = var6.field1226;
                field1263[++Statics.field1269 - 1] = var6.field1220;
                field1266[++Statics.field1679 - 1] = var6.field1223;
                field1263[++Statics.field1269 - 1] = var6.field1227;
                field1263[++Statics.field1269 - 1] = var6.field1228;
                field1266[++Statics.field1679 - 1] = var6.field1229;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var8 = field1263[--Statics.field1269];
            class80 var9 = null;
            for (int var10 = 0; var10 < class80.field1222; var10++) {
                if (Statics.field1221[var10].field1226 == var8) {
                    var9 = Statics.field1221[var10];
                    break;
                }
            }
            if (var9 == null) {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = 0;
                field1266[++Statics.field1679 - 1] = "";
                field1263[++Statics.field1269 - 1] = 0;
                field1263[++Statics.field1269 - 1] = 0;
                field1266[++Statics.field1679 - 1] = "";
            } else {
                field1263[++Statics.field1269 - 1] = var9.field1226;
                field1263[++Statics.field1269 - 1] = var9.field1220;
                field1266[++Statics.field1679 - 1] = var9.field1223;
                field1263[++Statics.field1269 - 1] = var9.field1227;
                field1263[++Statics.field1269 - 1] = var9.field1228;
                field1266[++Statics.field1679 - 1] = var9.field1229;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1269 -= 4;
            int var11 = field1263[Statics.field1269];
            boolean var12 = field1263[Statics.field1269 + 1] == 1;
            int var13 = field1263[Statics.field1269 + 2];
            boolean var14 = field1263[Statics.field1269 + 3] == 1;
            class80.method15(var11, var12, var13, var14);
            return 1;
        } else if (arg0 == 6511) {
            int var15 = field1263[--Statics.field1269];
            if (var15 >= 0 && var15 < class80.field1222) {
                class80 var16 = Statics.field1221[var15];
                field1263[++Statics.field1269 - 1] = var16.field1226;
                field1263[++Statics.field1269 - 1] = var16.field1220;
                field1266[++Statics.field1679 - 1] = var16.field1223;
                field1263[++Statics.field1269 - 1] = var16.field1227;
                field1263[++Statics.field1269 - 1] = var16.field1228;
                field1266[++Statics.field1679 - 1] = var16.field1229;
            } else {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = 0;
                field1266[++Statics.field1679 - 1] = "";
                field1263[++Statics.field1269 - 1] = 0;
                field1263[++Statics.field1269 - 1] = 0;
                field1266[++Statics.field1679 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1003 = field1263[--Statics.field1269] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1269 -= 2;
            int var17 = field1263[Statics.field1269];
            int var18 = field1263[Statics.field1269 + 1];
            class263 var19 = Statics.method1733(var18);
            if (var19.method4216()) {
                field1266[++Statics.field1679 - 1] = class270.method564(var17).method4418(var18, var19.field3479);
            } else {
                field1263[++Statics.field1269 - 1] = class270.method564(var17).method4425(var18, var19.field3478);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1269 -= 2;
            int var20 = field1263[Statics.field1269];
            int var21 = field1263[Statics.field1269 + 1];
            class263 var22 = Statics.method1733(var21);
            if (var22.method4216()) {
                field1266[++Statics.field1679 - 1] = class267.method1587(var20).method4315(var21, var22.field3479);
            } else {
                field1263[++Statics.field1269 - 1] = class267.method1587(var20).method4356(var21, var22.field3478);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1269 -= 2;
            int var23 = field1263[Statics.field1269];
            int var24 = field1263[Statics.field1269 + 1];
            class263 var25 = Statics.method1733(var24);
            if (var25.method4216()) {
                field1266[++Statics.field1679 - 1] = class268.method1985(var23).method4372(var24, var25.field3479);
            } else {
                field1263[++Statics.field1269 - 1] = class268.method1985(var23).method4371(var24, var25.field3478);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1269 -= 2;
            int var26 = field1263[Statics.field1269];
            int var27 = field1263[Statics.field1269 + 1];
            class263 var28 = Statics.method1733(var27);
            if (var28.method4216()) {
                field1266[++Statics.field1679 - 1] = class264.method4204(var26).method4237(var27, var28.field3479);
            } else {
                field1263[++Statics.field1269 - 1] = class264.method4204(var26).method4236(var27, var28.field3478);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1263[++Statics.field1269 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.j(ILcv;ZB)I")
    public static int method939(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field226;
            int var4 = (Statics.field289.field1155 >> 7) + Statics.field2458;
            int var5 = (Statics.field289.field1151 >> 7) + Statics.field1288;
            client.method618().method5174(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1263[--Statics.field1269];
            String var7 = "";
            class33 var8 = client.method618().method5026(var6);
            if (var8 != null) {
                var7 = var8.method253();
            }
            field1266[++Statics.field1679 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1263[--Statics.field1269];
            client.method618().method5011(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1263[++Statics.field1269 - 1] = client.method618().method5023();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1263[--Statics.field1269];
            client.method618().method5036(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1263[++Statics.field1269 - 1] = client.method618().method5025() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class224 var11 = new class224(field1263[--Statics.field1269]);
            client.method618().method5027(var11.field2730, var11.field2731);
            return 1;
        } else if (arg0 == 6607) {
            class224 var12 = new class224(field1263[--Statics.field1269]);
            client.method618().method5054(var12.field2730, var12.field2731);
            return 1;
        } else if (arg0 == 6608) {
            class224 var13 = new class224(field1263[--Statics.field1269]);
            client.method618().method5018(var13.field2729, var13.field2730, var13.field2731);
            return 1;
        } else if (arg0 == 6609) {
            class224 var14 = new class224(field1263[--Statics.field1269]);
            client.method618().method5158(var14.field2729, var14.field2730, var14.field2731);
            return 1;
        } else if (arg0 == 6610) {
            field1263[++Statics.field1269 - 1] = client.method618().method5031();
            field1263[++Statics.field1269 - 1] = client.method618().method5032();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1263[--Statics.field1269];
            class33 var16 = client.method618().method5026(var15);
            if (var16 == null) {
                field1263[++Statics.field1269 - 1] = 0;
            } else {
                field1263[++Statics.field1269 - 1] = var16.method263().method3786();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1263[--Statics.field1269];
            class33 var18 = client.method618().method5026(var17);
            if (var18 == null) {
                field1263[++Statics.field1269 - 1] = 0;
                field1263[++Statics.field1269 - 1] = 0;
            } else {
                field1263[++Statics.field1269 - 1] = (var18.method295() - var18.method266() + 1) * 64;
                field1263[++Statics.field1269 - 1] = (var18.method259() - var18.method258() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1263[--Statics.field1269];
            class33 var20 = client.method618().method5026(var19);
            if (var20 == null) {
                field1263[++Statics.field1269 - 1] = 0;
                field1263[++Statics.field1269 - 1] = 0;
                field1263[++Statics.field1269 - 1] = 0;
                field1263[++Statics.field1269 - 1] = 0;
            } else {
                field1263[++Statics.field1269 - 1] = var20.method266() * 64;
                field1263[++Statics.field1269 - 1] = var20.method258() * 64;
                field1263[++Statics.field1269 - 1] = var20.method295() * 64 + 64 - 1;
                field1263[++Statics.field1269 - 1] = var20.method259() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1263[--Statics.field1269];
            class33 var22 = client.method618().method5026(var21);
            if (var22 == null) {
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var22.method257();
            }
            return 1;
        } else if (arg0 == 6615) {
            class224 var23 = client.method618().method5014();
            if (var23 == null) {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var23.field2730;
                field1263[++Statics.field1269 - 1] = var23.field2731;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1263[++Statics.field1269 - 1] = client.method618().method5131();
            return 1;
        } else if (arg0 == 6617) {
            class224 var24 = new class224(field1263[--Statics.field1269]);
            class33 var25 = client.method618().method5013();
            if (var25 == null) {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method291(var24.field2729, var24.field2730, var24.field2731);
            if (var26 == null) {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var26[0];
                field1263[++Statics.field1269 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class224 var27 = new class224(field1263[--Statics.field1269]);
            class33 var28 = client.method618().method5013();
            if (var28 == null) {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = -1;
                return 1;
            }
            class224 var29 = var28.method248(var27.field2730, var27.field2731);
            if (var29 == null) {
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var29.method3786();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1269 -= 2;
            int var30 = field1263[Statics.field1269];
            class224 var31 = new class224(field1263[Statics.field1269 + 1]);
            class33 var32 = client.method618().method5026(var30);
            int var33 = Statics.field289.field857;
            int var34 = (Statics.field289.field1155 >> 7) + Statics.field2458;
            int var35 = (Statics.field289.field1151 >> 7) + Statics.field1288;
            class224 var36 = new class224(var33, var34, var35);
            client.method618().method5016(var32, var36, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1269 -= 2;
            int var37 = field1263[Statics.field1269];
            class224 var38 = new class224(field1263[Statics.field1269 + 1]);
            class33 var39 = client.method618().method5026(var37);
            int var40 = Statics.field289.field857;
            int var41 = (Statics.field289.field1155 >> 7) + Statics.field2458;
            int var42 = (Statics.field289.field1151 >> 7) + Statics.field1288;
            class224 var43 = new class224(var40, var41, var42);
            client.method618().method5016(var39, var43, var38, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1269 -= 2;
            int var44 = field1263[Statics.field1269];
            class224 var45 = new class224(field1263[Statics.field1269 + 1]);
            class33 var46 = client.method618().method5026(var44);
            if (var46 == null) {
                field1263[++Statics.field1269 - 1] = 0;
                return 1;
            } else {
                field1263[++Statics.field1269 - 1] = var46.method245(var45.field2729, var45.field2730, var45.field2731) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1263[++Statics.field1269 - 1] = client.method618().method5034();
            field1263[++Statics.field1269 - 1] = client.method618().method5035();
            return 1;
        } else if (arg0 == 6623) {
            class224 var47 = new class224(field1263[--Statics.field1269]);
            class33 var48 = client.method618().method5009(var47.field2729, var47.field2730, var47.field2731);
            if (var48 == null) {
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var48.method250();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method618().method5020(field1263[--Statics.field1269]);
            return 1;
        } else if (arg0 == 6625) {
            client.method618().method5037();
            return 1;
        } else if (arg0 == 6626) {
            client.method618().method5178(field1263[--Statics.field1269]);
            return 1;
        } else if (arg0 == 6627) {
            client.method618().method5039();
            return 1;
        } else if (arg0 == 6628) {
            boolean var49 = field1263[--Statics.field1269] == 1;
            client.method618().method5040(var49);
            return 1;
        } else if (arg0 == 6629) {
            int var50 = field1263[--Statics.field1269];
            client.method618().method5030(var50);
            return 1;
        } else if (arg0 == 6630) {
            int var51 = field1263[--Statics.field1269];
            client.method618().method5042(var51);
            return 1;
        } else if (arg0 == 6631) {
            client.method618().method5043();
            return 1;
        } else if (arg0 == 6632) {
            boolean var52 = field1263[--Statics.field1269] == 1;
            client.method618().method5044(var52);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1269 -= 2;
            int var53 = field1263[Statics.field1269];
            boolean var54 = field1263[Statics.field1269 + 1] == 1;
            client.method618().method5155(var53, var54);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1269 -= 2;
            int var55 = field1263[Statics.field1269];
            boolean var56 = field1263[Statics.field1269 + 1] == 1;
            client.method618().method5134(var55, var56);
            return 1;
        } else if (arg0 == 6635) {
            field1263[++Statics.field1269 - 1] = client.method618().method5047() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var57 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.method618().method5048(var57) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var58 = field1263[--Statics.field1269];
            field1263[++Statics.field1269 - 1] = client.method618().method5010(var58) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1269 -= 2;
            int var59 = field1263[Statics.field1269];
            class224 var60 = new class224(field1263[Statics.field1269 + 1]);
            class224 var61 = client.method618().method5052(var59, var60);
            if (var61 == null) {
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var61.method3786();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var62 = client.method618().method5055();
            if (var62 == null) {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var62.field513;
                field1263[++Statics.field1269 - 1] = var62.field515.method3786();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var63 = client.method618().method5173();
            if (var63 == null) {
                field1263[++Statics.field1269 - 1] = -1;
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var63.field513;
                field1263[++Statics.field1269 - 1] = var63.field515.method3786();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var64 = field1263[--Statics.field1269];
            class254 var65 = Statics.field3384[var64];
            if (var65.field3391 == null) {
                field1266[++Statics.field1679 - 1] = "";
            } else {
                field1266[++Statics.field1679 - 1] = var65.field3391;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var66 = field1263[--Statics.field1269];
            class254 var67 = Statics.field3384[var66];
            field1263[++Statics.field1269 - 1] = var67.field3390;
            return 1;
        } else if (arg0 == 6695) {
            int var68 = field1263[--Statics.field1269];
            class254 var69 = Statics.field3384[var68];
            if (var69 == null) {
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var69.field3402;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var70 = field1263[--Statics.field1269];
            class254 var71 = Statics.field3384[var70];
            if (var71 == null) {
                field1263[++Statics.field1269 - 1] = -1;
            } else {
                field1263[++Statics.field1269 - 1] = var71.field3386;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1263[++Statics.field1269 - 1] = Statics.field1271.field574;
            return 1;
        } else if (arg0 == 6698) {
            field1263[++Statics.field1269 - 1] = Statics.field1271.field575.method3786();
            return 1;
        } else if (arg0 == 6699) {
            field1263[++Statics.field1269 - 1] = Statics.field1271.field576.method3786();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.g(II)V")
    public static void method41(int arg0) {
        if (arg0 == -1 || !class228.method4526(arg0)) {
            return;
        }
        class228[] var1 = Statics.field2754[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class228 var3 = var1[var2];
            if (var3.field2847 != null) {
                class69 var4 = new class69();
                var4.field797 = var3;
                var4.field805 = var3.field2847;
                method8(var4, 2000000);
            }
        }
    }
}
