package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ce")
public class class82 {

    @ObfuscatedName("ce.g")
    public static int[] field1330 = new int[5];

    @ObfuscatedName("ce.v")
    public static int[][] field1327 = new int[5][5000];

    @ObfuscatedName("ce.p")
    public static int[] field1332 = new int[1000];

    @ObfuscatedName("ce.d")
    public static String[] field1334 = new String[1000];

    @ObfuscatedName("ce.z")
    public static int field1337 = 0;

    @ObfuscatedName("ce.n")
    public static class63[] field1335 = new class63[50];

    @ObfuscatedName("ce.a")
    public static Calendar field1333 = Calendar.getInstance();

    @ObfuscatedName("ce.i")
    public static final String[] field1339 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ce.b")
    public static int field1338 = 0;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.w(Lbl;I)V")
    public static void method730(class69 arg0) {
        method1427(arg0, 200000);
    }

    @ObfuscatedName("by.s(Lbl;II)V")
    public static void method1427(class69 arg0, int arg1) {
        Object[] var2 = arg0.field850;
        class98 var4;
        if (class220.method145(arg0.field845)) {
            Statics.field3195 = (class48) var2[0];
            class243 var3 = Statics.field3286[Statics.field3195.field616];
            var4 = class98.method1603(arg0.field845, var3.field3288, var3.field3305);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class98.method2811(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field3753 = 0;
        Statics.field3666 = 0;
        int var6 = -1;
        int[] var7 = var4.field1522;
        int[] var8 = var4.field1528;
        byte var9 = -1;
        field1337 = 0;
        try {
            Statics.field1331 = new int[var4.field1525];
            int var10 = 0;
            Statics.field2778 = new String[var4.field1526];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field848;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field849;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field851 == null ? -1 : arg0.field851.field2643;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field852;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field851 == null ? -1 : arg0.field851.field2644;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field856 == null ? -1 : arg0.field856.field2643;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field856 == null ? -1 : arg0.field856.field2644;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field846;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field853;
                    }
                    Statics.field1331[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field854;
                    }
                    Statics.field2778[var11++] = var14;
                }
            }
            int var15 = 0;
            field1338 = arg0.field855;
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
                                                                                                                label1649: while (true) {
                                                                                                                    var15++;
                                                                                                                    if (var15 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var6++;
                                                                                                                    int var258 = var7[var6];
                                                                                                                    if (var258 >= 100) {
                                                                                                                        boolean var42;
                                                                                                                        if (var4.field1528[var6] == 1) {
                                                                                                                            var42 = true;
                                                                                                                        } else {
                                                                                                                            var42 = false;
                                                                                                                        }
                                                                                                                        int var43;
                                                                                                                        if (var258 < 1000) {
                                                                                                                            var43 = method2902(var258, var4, var42);
                                                                                                                        } else if (var258 < 1100) {
                                                                                                                            var43 = method449(var258, var4, var42);
                                                                                                                        } else if (var258 < 1200) {
                                                                                                                            var43 = method58(var258, var4, var42);
                                                                                                                        } else if (var258 < 1300) {
                                                                                                                            var43 = method84(var258, var4, var42);
                                                                                                                        } else if (var258 < 1400) {
                                                                                                                            var43 = Statics.method1594(var258, var4, var42);
                                                                                                                        } else if (var258 < 1500) {
                                                                                                                            var43 = method980(var258, var4, var42);
                                                                                                                        } else if (var258 < 1600) {
                                                                                                                            var43 = method2341(var258, var4, var42);
                                                                                                                        } else if (var258 < 1700) {
                                                                                                                            var43 = method1659(var258, var4, var42);
                                                                                                                        } else if (var258 < 1800) {
                                                                                                                            class217 var47 = var42 ? Statics.field3393 : Statics.field2315;
                                                                                                                            byte var48;
                                                                                                                            if (var258 == 1700) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var47.field2763;
                                                                                                                                var48 = 1;
                                                                                                                            } else if (var258 == 1701) {
                                                                                                                                if (var47.field2763 == -1) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = var47.field2764;
                                                                                                                                }
                                                                                                                                var48 = 1;
                                                                                                                            } else if (var258 == 1702) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var47.field2644;
                                                                                                                                var48 = 1;
                                                                                                                            } else {
                                                                                                                                var48 = 2;
                                                                                                                            }
                                                                                                                            var43 = var48;
                                                                                                                        } else if (var258 < 1900) {
                                                                                                                            class217 var49 = var42 ? Statics.field3393 : Statics.field2315;
                                                                                                                            byte var54;
                                                                                                                            if (var258 == 1800) {
                                                                                                                                int[] var50 = field1332;
                                                                                                                                int var51 = ++Statics.field3753 - 1;
                                                                                                                                int var52 = client.method177(var49);
                                                                                                                                int var53 = var52 >> 11 & 0x3F;
                                                                                                                                var50[var51] = var53;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var258 == 1801) {
                                                                                                                                int var55 = field1332[--Statics.field3753];
                                                                                                                                int var259 = var55 - 1;
                                                                                                                                if (var49.field2717 == null || var259 >= var49.field2717.length || var49.field2717[var259] == null) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field3666 - 1] = var49.field2717[var259];
                                                                                                                                }
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var258 == 1802) {
                                                                                                                                if (var49.field2716 == null) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field3666 - 1] = var49.field2716;
                                                                                                                                }
                                                                                                                                var54 = 1;
                                                                                                                            } else {
                                                                                                                                var54 = 2;
                                                                                                                            }
                                                                                                                            var43 = var54;
                                                                                                                        } else if (var258 < 2000) {
                                                                                                                            var43 = method1014(var258, var4, var42);
                                                                                                                        } else if (var258 < 2100) {
                                                                                                                            var43 = method449(var258, var4, var42);
                                                                                                                        } else if (var258 < 2200) {
                                                                                                                            var43 = method58(var258, var4, var42);
                                                                                                                        } else if (var258 < 2300) {
                                                                                                                            var43 = method84(var258, var4, var42);
                                                                                                                        } else if (var258 < 2400) {
                                                                                                                            var43 = Statics.method1594(var258, var4, var42);
                                                                                                                        } else if (var258 < 2500) {
                                                                                                                            var43 = method980(var258, var4, var42);
                                                                                                                        } else if (var258 < 2600) {
                                                                                                                            var43 = method2252(var258, var4, var42);
                                                                                                                        } else if (var258 < 2700) {
                                                                                                                            class217 var56 = class217.method2254(field1332[--Statics.field3753]);
                                                                                                                            byte var57;
                                                                                                                            if (var258 == 2600) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2664;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2601) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2765;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2602) {
                                                                                                                                field1334[++Statics.field3666 - 1] = var56.field2703;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2603) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2740;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2604) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2667;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2605) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2731;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2606) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2694;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2607) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2696;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2608) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2695;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2609) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2769;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2610) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2675;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2611) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2668;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2612) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2669;
                                                                                                                                var57 = 1;
                                                                                                                            } else if (var258 == 2613) {
                                                                                                                                field1332[++Statics.field3753 - 1] = var56.field2673.method13();
                                                                                                                                var57 = 1;
                                                                                                                            } else {
                                                                                                                                var57 = 2;
                                                                                                                            }
                                                                                                                            var43 = var57;
                                                                                                                        } else if (var258 < 2800) {
                                                                                                                            var43 = method977(var258, var4, var42);
                                                                                                                        } else if (var258 < 2900) {
                                                                                                                            class217 var58 = class217.method2254(field1332[--Statics.field3753]);
                                                                                                                            byte var63;
                                                                                                                            if (var258 == 2800) {
                                                                                                                                int[] var59 = field1332;
                                                                                                                                int var60 = ++Statics.field3753 - 1;
                                                                                                                                int var61 = client.method177(var58);
                                                                                                                                int var62 = var61 >> 11 & 0x3F;
                                                                                                                                var59[var60] = var62;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var258 == 2801) {
                                                                                                                                int var64 = field1332[--Statics.field3753];
                                                                                                                                int var260 = var64 - 1;
                                                                                                                                if (var58.field2717 == null || var260 >= var58.field2717.length || var58.field2717[var260] == null) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field3666 - 1] = var58.field2717[var260];
                                                                                                                                }
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var258 == 2802) {
                                                                                                                                if (var58.field2716 == null) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field3666 - 1] = var58.field2716;
                                                                                                                                }
                                                                                                                                var63 = 1;
                                                                                                                            } else {
                                                                                                                                var63 = 2;
                                                                                                                            }
                                                                                                                            var43 = var63;
                                                                                                                        } else if (var258 < 3000) {
                                                                                                                            var43 = method1014(var258, var4, var42);
                                                                                                                        } else if (var258 < 3200) {
                                                                                                                            byte var66;
                                                                                                                            if (var258 == 3100) {
                                                                                                                                String var65 = field1334[--Statics.field3666];
                                                                                                                                class97.method3203(0, "", var65);
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3101) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                client.method25(Statics.field832, field1332[Statics.field3753], field1332[Statics.field3753 + 1]);
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3103) {
                                                                                                                                client.method2860();
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3104) {
                                                                                                                                String var67 = field1334[--Statics.field3666];
                                                                                                                                int var68 = 0;
                                                                                                                                boolean var69 = false;
                                                                                                                                boolean var70 = false;
                                                                                                                                int var71 = 0;
                                                                                                                                int var72 = var67.length();
                                                                                                                                int var73 = 0;
                                                                                                                                boolean var75;
                                                                                                                                while (true) {
                                                                                                                                    if (var73 >= var72) {
                                                                                                                                        var75 = var70;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    label2004: {
                                                                                                                                        char var74 = var67.charAt(var73);
                                                                                                                                        if (var73 == 0) {
                                                                                                                                            if (var74 == '-') {
                                                                                                                                                var69 = true;
                                                                                                                                                break label2004;
                                                                                                                                            }
                                                                                                                                            if (var74 == '+') {
                                                                                                                                                break label2004;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int var261;
                                                                                                                                        if (var74 >= '0' && var74 <= '9') {
                                                                                                                                            var261 = var74 - '0';
                                                                                                                                        } else if (var74 >= 'A' && var74 <= 'Z') {
                                                                                                                                            var261 = var74 - '7';
                                                                                                                                        } else {
                                                                                                                                            if (var74 < 'a' || var74 > 'z') {
                                                                                                                                                var75 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            var261 = var74 - 'W';
                                                                                                                                        }
                                                                                                                                        if (var261 >= 10) {
                                                                                                                                            var75 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        if (var69) {
                                                                                                                                            var261 = -var261;
                                                                                                                                        }
                                                                                                                                        int var76 = var71 * 10 + var261;
                                                                                                                                        if (var76 / 10 != var71) {
                                                                                                                                            var75 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        var71 = var76;
                                                                                                                                        var70 = true;
                                                                                                                                    }
                                                                                                                                    var73++;
                                                                                                                                }
                                                                                                                                if (var75) {
                                                                                                                                    int var78 = class271.method2729(var67, 10, true);
                                                                                                                                    var68 = var78;
                                                                                                                                }
                                                                                                                                client.field968.method3236(82);
                                                                                                                                client.field968.method3072(var68);
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3105) {
                                                                                                                                String var79 = field1334[--Statics.field3666];
                                                                                                                                client.field968.method3236(219);
                                                                                                                                client.field968.method2955(var79.length() + 1);
                                                                                                                                client.field968.method3117(var79);
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3106) {
                                                                                                                                String var80 = field1334[--Statics.field3666];
                                                                                                                                client.field968.method3236(190);
                                                                                                                                client.field968.method2955(var80.length() + 1);
                                                                                                                                client.field968.method3117(var80);
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3107) {
                                                                                                                                int var81 = field1332[--Statics.field3753];
                                                                                                                                String var82 = field1334[--Statics.field3666];
                                                                                                                                int var83 = class95.field1500;
                                                                                                                                int[] var84 = class95.field1491;
                                                                                                                                boolean var85 = false;
                                                                                                                                for (int var86 = 0; var86 < var83; var86++) {
                                                                                                                                    class74 var87 = client.field1035[var84[var86]];
                                                                                                                                    if (var87 != null && Statics.field832 != var87 && var87.field913 != null && var87.field913.equalsIgnoreCase(var82)) {
                                                                                                                                        if (var81 == 1) {
                                                                                                                                            client.field968.method3236(159);
                                                                                                                                            client.field968.method3005(var84[var86]);
                                                                                                                                            client.field968.method2997(0);
                                                                                                                                        } else if (var81 == 4) {
                                                                                                                                            client.field968.method3236(177);
                                                                                                                                            client.field968.method2956(var84[var86]);
                                                                                                                                            client.field968.method2996(0);
                                                                                                                                        } else if (var81 == 6) {
                                                                                                                                            client.field968.method3236(80);
                                                                                                                                            client.field968.method2955(0);
                                                                                                                                            client.field968.method2957(var84[var86]);
                                                                                                                                        } else if (var81 == 7) {
                                                                                                                                            client.field968.method3236(203);
                                                                                                                                            client.field968.method2955(0);
                                                                                                                                            client.field968.method3005(var84[var86]);
                                                                                                                                        }
                                                                                                                                        var85 = true;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!var85) {
                                                                                                                                    class97.method3203(4, "", class226.field2921 + var82);
                                                                                                                                }
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3108) {
                                                                                                                                Statics.field3753 -= 3;
                                                                                                                                int var88 = field1332[Statics.field3753];
                                                                                                                                int var89 = field1332[Statics.field3753 + 1];
                                                                                                                                int var90 = field1332[Statics.field3753 + 2];
                                                                                                                                class217 var91 = class217.method2254(var90);
                                                                                                                                client.method1589(var91, var88, var89);
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3109) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var92 = field1332[Statics.field3753];
                                                                                                                                int var93 = field1332[Statics.field3753 + 1];
                                                                                                                                class217 var94 = var42 ? Statics.field3393 : Statics.field2315;
                                                                                                                                client.method1589(var94, var92, var93);
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3110) {
                                                                                                                                Statics.field245 = field1332[--Statics.field3753] == 1;
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3111) {
                                                                                                                                field1332[++Statics.field3753 - 1] = Statics.field869.field1304 ? 1 : 0;
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3112) {
                                                                                                                                Statics.field869.field1304 = field1332[--Statics.field3753] == 1;
                                                                                                                                class80.method204();
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3113) {
                                                                                                                                String var95 = field1334[--Statics.field3666];
                                                                                                                                boolean var96 = field1332[--Statics.field3753] == 1;
                                                                                                                                class57.method2765(var95, var96, false);
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3115) {
                                                                                                                                int var97 = field1332[--Statics.field3753];
                                                                                                                                client.field968.method3236(235);
                                                                                                                                client.field968.method2956(var97);
                                                                                                                                var66 = 1;
                                                                                                                            } else if (var258 == 3116) {
                                                                                                                                int var98 = field1332[--Statics.field3753];
                                                                                                                                Statics.field3666 -= 2;
                                                                                                                                String var99 = field1334[Statics.field3666];
                                                                                                                                String var100 = field1334[Statics.field3666 + 1];
                                                                                                                                if (var99.length() > 500) {
                                                                                                                                    var66 = 1;
                                                                                                                                } else if (var100.length() > 500) {
                                                                                                                                    var66 = 1;
                                                                                                                                } else {
                                                                                                                                    client.field968.method3236(224);
                                                                                                                                    client.field968.method2956(1 + class174.method1591(var99) + class174.method1591(var100));
                                                                                                                                    client.field968.method3117(var100);
                                                                                                                                    client.field968.method2997(var98);
                                                                                                                                    client.field968.method3117(var99);
                                                                                                                                    var66 = 1;
                                                                                                                                }
                                                                                                                            } else if (var258 == 3117) {
                                                                                                                                client.field962 = field1332[--Statics.field3753] == 1;
                                                                                                                                var66 = 1;
                                                                                                                            } else {
                                                                                                                                var66 = 2;
                                                                                                                            }
                                                                                                                            var43 = var66;
                                                                                                                        } else if (var258 < 3300) {
                                                                                                                            var43 = method173(var258, var4, var42);
                                                                                                                        } else if (var258 < 3400) {
                                                                                                                            byte var101;
                                                                                                                            if (var258 == 3300) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field933;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3301) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var102 = field1332[Statics.field3753];
                                                                                                                                int var103 = field1332[Statics.field3753 + 1];
                                                                                                                                field1332[++Statics.field3753 - 1] = class64.method4486(var102, var103);
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3302) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var104 = field1332[Statics.field3753];
                                                                                                                                int var105 = field1332[Statics.field3753 + 1];
                                                                                                                                field1332[++Statics.field3753 - 1] = Statics.method1763(var104, var105);
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3303) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var106 = field1332[Statics.field3753];
                                                                                                                                int var107 = field1332[Statics.field3753 + 1];
                                                                                                                                field1332[++Statics.field3753 - 1] = Statics.method3860(var106, var107);
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3304) {
                                                                                                                                int var108 = field1332[--Statics.field3753];
                                                                                                                                int[] var109 = field1332;
                                                                                                                                int var110 = ++Statics.field3753 - 1;
                                                                                                                                class241 var111 = (class241) class241.field3274.method3357((long) var108);
                                                                                                                                class241 var112;
                                                                                                                                if (var111 == null) {
                                                                                                                                    byte[] var113 = Statics.field3277.method3876(5, var108);
                                                                                                                                    class241 var114 = new class241();
                                                                                                                                    if (var113 != null) {
                                                                                                                                        var114.method4013(new class174(var113));
                                                                                                                                    }
                                                                                                                                    class241.field3274.method3371(var114, (long) var108);
                                                                                                                                    var112 = var114;
                                                                                                                                } else {
                                                                                                                                    var112 = var111;
                                                                                                                                }
                                                                                                                                var109[var110] = var112.field3276;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3305) {
                                                                                                                                int var115 = field1332[--Statics.field3753];
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1049[var115];
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3306) {
                                                                                                                                int var116 = field1332[--Statics.field3753];
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field944[var116];
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3307) {
                                                                                                                                int var117 = field1332[--Statics.field3753];
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1051[var117];
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3308) {
                                                                                                                                int var118 = Statics.field609;
                                                                                                                                int var119 = (Statics.field832.field1225 >> 7) + Statics.field352;
                                                                                                                                int var120 = (Statics.field832.field1211 >> 7) + Statics.field3706;
                                                                                                                                field1332[++Statics.field3753 - 1] = (var118 << 28) + (var119 << 14) + var120;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3309) {
                                                                                                                                int var121 = field1332[--Statics.field3753];
                                                                                                                                field1332[++Statics.field3753 - 1] = var121 >> 14 & 0x3FFF;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3310) {
                                                                                                                                int var122 = field1332[--Statics.field3753];
                                                                                                                                field1332[++Statics.field3753 - 1] = var122 >> 28;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3311) {
                                                                                                                                int var123 = field1332[--Statics.field3753];
                                                                                                                                field1332[++Statics.field3753 - 1] = var123 & 0x3FFF;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3312) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1105 ? 1 : 0;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3313) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var124 = field1332[Statics.field3753] + 32768;
                                                                                                                                int var125 = field1332[Statics.field3753 + 1];
                                                                                                                                int[] var126 = field1332;
                                                                                                                                int var127 = ++Statics.field3753 - 1;
                                                                                                                                class64 var128 = (class64) class64.field795.method3387((long) var124);
                                                                                                                                int var129;
                                                                                                                                if (var128 == null) {
                                                                                                                                    var129 = -1;
                                                                                                                                } else if (var125 >= 0 && var125 < var128.field799.length) {
                                                                                                                                    var129 = var128.field799[var125];
                                                                                                                                } else {
                                                                                                                                    var129 = -1;
                                                                                                                                }
                                                                                                                                var126[var127] = var129;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3314) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var130 = field1332[Statics.field3753] + 32768;
                                                                                                                                int var131 = field1332[Statics.field3753 + 1];
                                                                                                                                field1332[++Statics.field3753 - 1] = Statics.method1763(var130, var131);
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3315) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var132 = field1332[Statics.field3753] + 32768;
                                                                                                                                int var133 = field1332[Statics.field3753 + 1];
                                                                                                                                field1332[++Statics.field3753 - 1] = Statics.method3860(var132, var133);
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3316) {
                                                                                                                                if (client.field1082 >= 2) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = client.field1082;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                }
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3317) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1031;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3318) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1074;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3321) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1076;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3322) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field948;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3323) {
                                                                                                                                if (client.field1084) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                }
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3324) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field925;
                                                                                                                                var101 = 1;
                                                                                                                            } else if (var258 == 3325) {
                                                                                                                                Statics.field3753 -= 4;
                                                                                                                                int var134 = field1332[Statics.field3753];
                                                                                                                                int var135 = field1332[Statics.field3753 + 1];
                                                                                                                                int var136 = field1332[Statics.field3753 + 2];
                                                                                                                                int var137 = field1332[Statics.field3753 + 3];
                                                                                                                                int var138 = (var135 << 14) + var134;
                                                                                                                                int var139 = (var136 << 28) + var138;
                                                                                                                                int var140 = var137 + var139;
                                                                                                                                field1332[++Statics.field3753 - 1] = var140;
                                                                                                                                var101 = 1;
                                                                                                                            } else {
                                                                                                                                var101 = 2;
                                                                                                                            }
                                                                                                                            var43 = var101;
                                                                                                                        } else if (var258 < 3500) {
                                                                                                                            var43 = method458(var258, var4, var42);
                                                                                                                        } else if (var258 < 3700) {
                                                                                                                            byte var141;
                                                                                                                            if (var258 == 3600) {
                                                                                                                                if (client.field1181 == 0) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -2;
                                                                                                                                } else if (client.field1181 == 1) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = client.field1115;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3601) {
                                                                                                                                int var142 = field1332[--Statics.field3753];
                                                                                                                                if (client.field1181 == 2 && var142 < client.field1115) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = client.field1182[var142].field823;
                                                                                                                                    field1334[++Statics.field3666 - 1] = client.field1182[var142].field817;
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3602) {
                                                                                                                                int var143 = field1332[--Statics.field3753];
                                                                                                                                if (client.field1181 == 2 && var143 < client.field1115) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = client.field1182[var143].field818;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3603) {
                                                                                                                                int var144 = field1332[--Statics.field3753];
                                                                                                                                if (client.field1181 == 2 && var144 < client.field1115) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = client.field1182[var144].field819;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3604) {
                                                                                                                                String var145 = field1334[--Statics.field3666];
                                                                                                                                int var146 = field1332[--Statics.field3753];
                                                                                                                                client.field968.method3236(146);
                                                                                                                                client.field968.method2955(class174.method1591(var145) + 1);
                                                                                                                                client.field968.method2976(var146);
                                                                                                                                client.field968.method3117(var145);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3605) {
                                                                                                                                String var147 = field1334[--Statics.field3666];
                                                                                                                                client.method3271(var147);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3606) {
                                                                                                                                String var148 = field1334[--Statics.field3666];
                                                                                                                                client.method991(var148);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3607) {
                                                                                                                                String var149 = field1334[--Statics.field3666];
                                                                                                                                client.method4203(var149, false);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3608) {
                                                                                                                                String var150 = field1334[--Statics.field3666];
                                                                                                                                client.method103(var150);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3609) {
                                                                                                                                String var151 = field1334[--Statics.field3666];
                                                                                                                                class231[] var152 = new class231[] { class231.field3172, class231.field3171, class231.field3175, class231.field3179, class231.field3174, class231.field3178 };
                                                                                                                                class231[] var153 = var152;
                                                                                                                                for (int var154 = 0; var154 < var153.length; var154++) {
                                                                                                                                    class231 var155 = var153[var154];
                                                                                                                                    if (var155.field3177 != -1 && var151.startsWith(Statics.method3220(var155.field3177))) {
                                                                                                                                        var151 = var151.substring(6 + Integer.toString(var155.field3177).length());
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1332[++Statics.field3753 - 1] = client.method1647(var151, false) ? 1 : 0;
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3611) {
                                                                                                                                if (client.field1022 == null) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field3666 - 1] = class269.method1595(client.field1022);
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3612) {
                                                                                                                                if (client.field1022 == null) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = Statics.field23;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3613) {
                                                                                                                                int var156 = field1332[--Statics.field3753];
                                                                                                                                if (client.field1022 == null || var156 >= Statics.field23) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field3666 - 1] = Statics.field1352[var156].field919;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3614) {
                                                                                                                                int var157 = field1332[--Statics.field3753];
                                                                                                                                if (client.field1022 == null || var157 >= Statics.field23) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = Statics.field1352[var157].field918;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3615) {
                                                                                                                                int var158 = field1332[--Statics.field3753];
                                                                                                                                if (client.field1022 == null || var158 >= Statics.field23) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = Statics.field1352[var158].field921;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3616) {
                                                                                                                                field1332[++Statics.field3753 - 1] = Statics.field2110;
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3617) {
                                                                                                                                String var159 = field1334[--Statics.field3666];
                                                                                                                                client.method2810(var159);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3618) {
                                                                                                                                field1332[++Statics.field3753 - 1] = Statics.field3275;
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3619) {
                                                                                                                                String var160 = field1334[--Statics.field3666];
                                                                                                                                client.method1478(var160);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3620) {
                                                                                                                                client.field968.method3236(174);
                                                                                                                                client.field968.method2955(0);
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3621) {
                                                                                                                                if (client.field1181 == 0) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = client.field1080;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3622) {
                                                                                                                                int var161 = field1332[--Statics.field3753];
                                                                                                                                if (client.field1181 == 0 || var161 >= client.field1080) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field3666 - 1] = client.field1081[var161].field866;
                                                                                                                                    field1334[++Statics.field3666 - 1] = client.field1081[var161].field863;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3623) {
                                                                                                                                String var162 = field1334[--Statics.field3666];
                                                                                                                                if (var162.startsWith(Statics.method3220(0)) || var162.startsWith(Statics.method3220(1))) {
                                                                                                                                    var162 = var162.substring(7);
                                                                                                                                }
                                                                                                                                field1332[++Statics.field3753 - 1] = client.method999(var162) ? 1 : 0;
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3624) {
                                                                                                                                int var163 = field1332[--Statics.field3753];
                                                                                                                                if (Statics.field1352 == null || var163 >= Statics.field23 || !Statics.field1352[var163].field919.equalsIgnoreCase(Statics.field832.field913)) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = 1;
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else if (var258 == 3625) {
                                                                                                                                if (client.field1171 == null) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1334[++Statics.field3666 - 1] = class269.method1595(client.field1171);
                                                                                                                                }
                                                                                                                                var141 = 1;
                                                                                                                            } else {
                                                                                                                                var141 = 2;
                                                                                                                            }
                                                                                                                            var43 = var141;
                                                                                                                        } else if (var258 < 4000) {
                                                                                                                            var43 = method2693(var258, var4, var42);
                                                                                                                        } else if (var258 < 4100) {
                                                                                                                            var43 = method460(var258, var4, var42);
                                                                                                                        } else if (var258 < 4200) {
                                                                                                                            var43 = method728(var258, var4, var42);
                                                                                                                        } else if (var258 < 4300) {
                                                                                                                            var43 = method993(var258, var4, var42);
                                                                                                                        } else if (var258 < 5100) {
                                                                                                                            byte var164;
                                                                                                                            if (var258 == 5000) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1089;
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5001) {
                                                                                                                                Statics.field3753 -= 3;
                                                                                                                                client.field1089 = field1332[Statics.field3753];
                                                                                                                                Statics.field3318 = class278.method2253(field1332[Statics.field3753 + 1]);
                                                                                                                                if (Statics.field3318 == null) {
                                                                                                                                    Statics.field3318 = class278.field3745;
                                                                                                                                }
                                                                                                                                client.field1072 = field1332[Statics.field3753 + 2];
                                                                                                                                client.field968.method3236(9);
                                                                                                                                client.field968.method2955(client.field1089);
                                                                                                                                client.field968.method2955(Statics.field3318.field3744);
                                                                                                                                client.field968.method2955(client.field1072);
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5002) {
                                                                                                                                String var165 = field1334[--Statics.field3666];
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var166 = field1332[Statics.field3753];
                                                                                                                                int var167 = field1332[Statics.field3753 + 1];
                                                                                                                                client.field968.method3236(11);
                                                                                                                                client.field968.method2955(class174.method1591(var165) + 2);
                                                                                                                                client.field968.method3117(var165);
                                                                                                                                client.field968.method2955(var166 - 1);
                                                                                                                                client.field968.method2955(var167);
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5003) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var168 = field1332[Statics.field3753];
                                                                                                                                int var169 = field1332[Statics.field3753 + 1];
                                                                                                                                class72 var170 = class97.method2877(var168, var169);
                                                                                                                                if (var170 == null) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -1;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = var170.field879;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var170.field876;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var170.field878 == null ? "" : var170.field878;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var170.field882 == null ? "" : var170.field882;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var170.field880 == null ? "" : var170.field880;
                                                                                                                                }
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5004) {
                                                                                                                                int var171 = field1332[--Statics.field3753];
                                                                                                                                class72 var172 = (class72) class97.field1517.method3331((long) var171);
                                                                                                                                if (var172 == null) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -1;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = var172.field877;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var172.field876;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var172.field878 == null ? "" : var172.field878;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var172.field882 == null ? "" : var172.field882;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var172.field880 == null ? "" : var172.field880;
                                                                                                                                }
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5005) {
                                                                                                                                if (Statics.field3318 == null) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = Statics.field3318.field3744;
                                                                                                                                }
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5008) {
                                                                                                                                String var174 = field1334[--Statics.field3666];
                                                                                                                                int var175 = field1332[--Statics.field3753];
                                                                                                                                String var176 = var174.toLowerCase();
                                                                                                                                byte var177 = 0;
                                                                                                                                if (var176.startsWith(class226.field3027)) {
                                                                                                                                    var177 = 0;
                                                                                                                                    var174 = var174.substring(class226.field3027.length());
                                                                                                                                } else if (var176.startsWith(class226.field3029)) {
                                                                                                                                    var177 = 1;
                                                                                                                                    var174 = var174.substring(class226.field3029.length());
                                                                                                                                } else if (var176.startsWith(class226.field2860)) {
                                                                                                                                    var177 = 2;
                                                                                                                                    var174 = var174.substring(class226.field2860.length());
                                                                                                                                } else if (var176.startsWith(class226.field3033)) {
                                                                                                                                    var177 = 3;
                                                                                                                                    var174 = var174.substring(class226.field3033.length());
                                                                                                                                } else if (var176.startsWith(class226.field3035)) {
                                                                                                                                    var177 = 4;
                                                                                                                                    var174 = var174.substring(class226.field3035.length());
                                                                                                                                } else if (var176.startsWith(class226.field2917)) {
                                                                                                                                    var177 = 5;
                                                                                                                                    var174 = var174.substring(class226.field2917.length());
                                                                                                                                } else if (var176.startsWith(class226.field3039)) {
                                                                                                                                    var177 = 6;
                                                                                                                                    var174 = var174.substring(class226.field3039.length());
                                                                                                                                } else if (var176.startsWith(class226.field2975)) {
                                                                                                                                    var177 = 7;
                                                                                                                                    var174 = var174.substring(class226.field2975.length());
                                                                                                                                } else if (var176.startsWith(class226.field3043)) {
                                                                                                                                    var177 = 8;
                                                                                                                                    var174 = var174.substring(class226.field3043.length());
                                                                                                                                } else if (var176.startsWith(class226.field3045)) {
                                                                                                                                    var177 = 9;
                                                                                                                                    var174 = var174.substring(class226.field3045.length());
                                                                                                                                } else if (var176.startsWith(class226.field2864)) {
                                                                                                                                    var177 = 10;
                                                                                                                                    var174 = var174.substring(class226.field2864.length());
                                                                                                                                } else if (var176.startsWith(class226.field3049)) {
                                                                                                                                    var177 = 11;
                                                                                                                                    var174 = var174.substring(class226.field3049.length());
                                                                                                                                } else if (client.field929 != 0) {
                                                                                                                                    if (var176.startsWith(class226.field3028)) {
                                                                                                                                        var177 = 0;
                                                                                                                                        var174 = var174.substring(class226.field3028.length());
                                                                                                                                    } else if (var176.startsWith(class226.field3030)) {
                                                                                                                                        var177 = 1;
                                                                                                                                        var174 = var174.substring(class226.field3030.length());
                                                                                                                                    } else if (var176.startsWith(class226.field2913)) {
                                                                                                                                        var177 = 2;
                                                                                                                                        var174 = var174.substring(class226.field2913.length());
                                                                                                                                    } else if (var176.startsWith(class226.field2900)) {
                                                                                                                                        var177 = 3;
                                                                                                                                        var174 = var174.substring(class226.field2900.length());
                                                                                                                                    } else if (var176.startsWith(class226.field3003)) {
                                                                                                                                        var177 = 4;
                                                                                                                                        var174 = var174.substring(class226.field3003.length());
                                                                                                                                    } else if (var176.startsWith(class226.field3038)) {
                                                                                                                                        var177 = 5;
                                                                                                                                        var174 = var174.substring(class226.field3038.length());
                                                                                                                                    } else if (var176.startsWith(class226.field2854)) {
                                                                                                                                        var177 = 6;
                                                                                                                                        var174 = var174.substring(class226.field2854.length());
                                                                                                                                    } else if (var176.startsWith(class226.field3042)) {
                                                                                                                                        var177 = 7;
                                                                                                                                        var174 = var174.substring(class226.field3042.length());
                                                                                                                                    } else if (var176.startsWith(class226.field3044)) {
                                                                                                                                        var177 = 8;
                                                                                                                                        var174 = var174.substring(class226.field3044.length());
                                                                                                                                    } else if (var176.startsWith(class226.field3046)) {
                                                                                                                                        var177 = 9;
                                                                                                                                        var174 = var174.substring(class226.field3046.length());
                                                                                                                                    } else if (var176.startsWith(class226.field3048)) {
                                                                                                                                        var177 = 10;
                                                                                                                                        var174 = var174.substring(class226.field3048.length());
                                                                                                                                    } else if (var176.startsWith(class226.field3050)) {
                                                                                                                                        var177 = 11;
                                                                                                                                        var174 = var174.substring(class226.field3050.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                String var178 = var174.toLowerCase();
                                                                                                                                byte var179 = 0;
                                                                                                                                if (var178.startsWith(class226.field2927)) {
                                                                                                                                    var179 = 1;
                                                                                                                                    var174 = var174.substring(class226.field2927.length());
                                                                                                                                } else if (var178.startsWith(class226.field3073)) {
                                                                                                                                    var179 = 2;
                                                                                                                                    var174 = var174.substring(class226.field3073.length());
                                                                                                                                } else if (var178.startsWith(class226.field3055)) {
                                                                                                                                    var179 = 3;
                                                                                                                                    var174 = var174.substring(class226.field3055.length());
                                                                                                                                } else if (var178.startsWith(class226.field3057)) {
                                                                                                                                    var179 = 4;
                                                                                                                                    var174 = var174.substring(class226.field3057.length());
                                                                                                                                } else if (var178.startsWith(class226.field3116)) {
                                                                                                                                    var179 = 5;
                                                                                                                                    var174 = var174.substring(class226.field3116.length());
                                                                                                                                } else if (client.field929 != 0) {
                                                                                                                                    if (var178.startsWith(class226.field3052)) {
                                                                                                                                        var179 = 1;
                                                                                                                                        var174 = var174.substring(class226.field3052.length());
                                                                                                                                    } else if (var178.startsWith(class226.field2907)) {
                                                                                                                                        var179 = 2;
                                                                                                                                        var174 = var174.substring(class226.field2907.length());
                                                                                                                                    } else if (var178.startsWith(class226.field2960)) {
                                                                                                                                        var179 = 3;
                                                                                                                                        var174 = var174.substring(class226.field2960.length());
                                                                                                                                    } else if (var178.startsWith(class226.field3058)) {
                                                                                                                                        var179 = 4;
                                                                                                                                        var174 = var174.substring(class226.field3058.length());
                                                                                                                                    } else if (var178.startsWith(class226.field2891)) {
                                                                                                                                        var179 = 5;
                                                                                                                                        var174 = var174.substring(class226.field2891.length());
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                client.field968.method3236(132);
                                                                                                                                client.field968.method2955(0);
                                                                                                                                int var180 = client.field968.field2390;
                                                                                                                                client.field968.method2955(var175);
                                                                                                                                client.field968.method2955(var177);
                                                                                                                                client.field968.method2955(var179);
                                                                                                                                class180 var181 = client.field968;
                                                                                                                                int var182 = var181.field2390;
                                                                                                                                int var183 = var174.length();
                                                                                                                                byte[] var184 = new byte[var183];
                                                                                                                                int var185 = 0;
                                                                                                                                while (true) {
                                                                                                                                    if (var185 >= var183) {
                                                                                                                                        var181.method2969(var184.length);
                                                                                                                                        var181.field2390 += Statics.field3662.method2893(var184, 0, var184.length, var181.field2389, var181.field2390);
                                                                                                                                        client.field968.method3175(client.field968.field2390 - var180);
                                                                                                                                        var164 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    char var186 = var174.charAt(var185);
                                                                                                                                    if (!(var186 <= 0 || var186 >= 128) || !(var186 < 160 || var186 > 255)) {
                                                                                                                                        var184[var185] = (byte) var186;
                                                                                                                                    } else if (var186 == 8364) {
                                                                                                                                        var184[var185] = -128;
                                                                                                                                    } else if (var186 == 8218) {
                                                                                                                                        var184[var185] = -126;
                                                                                                                                    } else if (var186 == 402) {
                                                                                                                                        var184[var185] = -125;
                                                                                                                                    } else if (var186 == 8222) {
                                                                                                                                        var184[var185] = -124;
                                                                                                                                    } else if (var186 == 8230) {
                                                                                                                                        var184[var185] = -123;
                                                                                                                                    } else if (var186 == 8224) {
                                                                                                                                        var184[var185] = -122;
                                                                                                                                    } else if (var186 == 8225) {
                                                                                                                                        var184[var185] = -121;
                                                                                                                                    } else if (var186 == 710) {
                                                                                                                                        var184[var185] = -120;
                                                                                                                                    } else if (var186 == 8240) {
                                                                                                                                        var184[var185] = -119;
                                                                                                                                    } else if (var186 == 352) {
                                                                                                                                        var184[var185] = -118;
                                                                                                                                    } else if (var186 == 8249) {
                                                                                                                                        var184[var185] = -117;
                                                                                                                                    } else if (var186 == 338) {
                                                                                                                                        var184[var185] = -116;
                                                                                                                                    } else if (var186 == 381) {
                                                                                                                                        var184[var185] = -114;
                                                                                                                                    } else if (var186 == 8216) {
                                                                                                                                        var184[var185] = -111;
                                                                                                                                    } else if (var186 == 8217) {
                                                                                                                                        var184[var185] = -110;
                                                                                                                                    } else if (var186 == 8220) {
                                                                                                                                        var184[var185] = -109;
                                                                                                                                    } else if (var186 == 8221) {
                                                                                                                                        var184[var185] = -108;
                                                                                                                                    } else if (var186 == 8226) {
                                                                                                                                        var184[var185] = -107;
                                                                                                                                    } else if (var186 == 8211) {
                                                                                                                                        var184[var185] = -106;
                                                                                                                                    } else if (var186 == 8212) {
                                                                                                                                        var184[var185] = -105;
                                                                                                                                    } else if (var186 == 732) {
                                                                                                                                        var184[var185] = -104;
                                                                                                                                    } else if (var186 == 8482) {
                                                                                                                                        var184[var185] = -103;
                                                                                                                                    } else if (var186 == 353) {
                                                                                                                                        var184[var185] = -102;
                                                                                                                                    } else if (var186 == 8250) {
                                                                                                                                        var184[var185] = -101;
                                                                                                                                    } else if (var186 == 339) {
                                                                                                                                        var184[var185] = -100;
                                                                                                                                    } else if (var186 == 382) {
                                                                                                                                        var184[var185] = -98;
                                                                                                                                    } else if (var186 == 376) {
                                                                                                                                        var184[var185] = -97;
                                                                                                                                    } else {
                                                                                                                                        var184[var185] = 63;
                                                                                                                                    }
                                                                                                                                    var185++;
                                                                                                                                }
                                                                                                                            } else if (var258 == 5009) {
                                                                                                                                Statics.field3666 -= 2;
                                                                                                                                String var189 = field1334[Statics.field3666];
                                                                                                                                String var190 = field1334[Statics.field3666 + 1];
                                                                                                                                client.field968.method3236(142);
                                                                                                                                client.field968.method2956(0);
                                                                                                                                int var191 = client.field968.field2390;
                                                                                                                                client.field968.method3117(var189);
                                                                                                                                class180 var192 = client.field968;
                                                                                                                                int var193 = var192.field2390;
                                                                                                                                int var194 = var190.length();
                                                                                                                                byte[] var195 = new byte[var194];
                                                                                                                                int var196 = 0;
                                                                                                                                while (true) {
                                                                                                                                    if (var196 >= var194) {
                                                                                                                                        var192.method2969(var195.length);
                                                                                                                                        var192.field2390 += Statics.field3662.method2893(var195, 0, var195.length, var192.field2389, var192.field2390);
                                                                                                                                        client.field968.method2967(client.field968.field2390 - var191);
                                                                                                                                        var164 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    char var197 = var190.charAt(var196);
                                                                                                                                    if (var197 > 0 && var197 < 128 || var197 >= 160 && var197 <= 255) {
                                                                                                                                        var195[var196] = (byte) var197;
                                                                                                                                    } else if (var197 == 8364) {
                                                                                                                                        var195[var196] = -128;
                                                                                                                                    } else if (var197 == 8218) {
                                                                                                                                        var195[var196] = -126;
                                                                                                                                    } else if (var197 == 402) {
                                                                                                                                        var195[var196] = -125;
                                                                                                                                    } else if (var197 == 8222) {
                                                                                                                                        var195[var196] = -124;
                                                                                                                                    } else if (var197 == 8230) {
                                                                                                                                        var195[var196] = -123;
                                                                                                                                    } else if (var197 == 8224) {
                                                                                                                                        var195[var196] = -122;
                                                                                                                                    } else if (var197 == 8225) {
                                                                                                                                        var195[var196] = -121;
                                                                                                                                    } else if (var197 == 710) {
                                                                                                                                        var195[var196] = -120;
                                                                                                                                    } else if (var197 == 8240) {
                                                                                                                                        var195[var196] = -119;
                                                                                                                                    } else if (var197 == 352) {
                                                                                                                                        var195[var196] = -118;
                                                                                                                                    } else if (var197 == 8249) {
                                                                                                                                        var195[var196] = -117;
                                                                                                                                    } else if (var197 == 338) {
                                                                                                                                        var195[var196] = -116;
                                                                                                                                    } else if (var197 == 381) {
                                                                                                                                        var195[var196] = -114;
                                                                                                                                    } else if (var197 == 8216) {
                                                                                                                                        var195[var196] = -111;
                                                                                                                                    } else if (var197 == 8217) {
                                                                                                                                        var195[var196] = -110;
                                                                                                                                    } else if (var197 == 8220) {
                                                                                                                                        var195[var196] = -109;
                                                                                                                                    } else if (var197 == 8221) {
                                                                                                                                        var195[var196] = -108;
                                                                                                                                    } else if (var197 == 8226) {
                                                                                                                                        var195[var196] = -107;
                                                                                                                                    } else if (var197 == 8211) {
                                                                                                                                        var195[var196] = -106;
                                                                                                                                    } else if (var197 == 8212) {
                                                                                                                                        var195[var196] = -105;
                                                                                                                                    } else if (var197 == 732) {
                                                                                                                                        var195[var196] = -104;
                                                                                                                                    } else if (var197 == 8482) {
                                                                                                                                        var195[var196] = -103;
                                                                                                                                    } else if (var197 == 353) {
                                                                                                                                        var195[var196] = -102;
                                                                                                                                    } else if (var197 == 8250) {
                                                                                                                                        var195[var196] = -101;
                                                                                                                                    } else if (var197 == 339) {
                                                                                                                                        var195[var196] = -100;
                                                                                                                                    } else if (var197 == 382) {
                                                                                                                                        var195[var196] = -98;
                                                                                                                                    } else if (var197 == 376) {
                                                                                                                                        var195[var196] = -97;
                                                                                                                                    } else {
                                                                                                                                        var195[var196] = 63;
                                                                                                                                    }
                                                                                                                                    var196++;
                                                                                                                                }
                                                                                                                            } else if (var258 == 5015) {
                                                                                                                                String var200;
                                                                                                                                if (Statics.field832 == null || Statics.field832.field913 == null) {
                                                                                                                                    var200 = "";
                                                                                                                                } else {
                                                                                                                                    var200 = Statics.field832.field913;
                                                                                                                                }
                                                                                                                                field1334[++Statics.field3666 - 1] = var200;
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5016) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1072;
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5017) {
                                                                                                                                int var201 = field1332[--Statics.field3753];
                                                                                                                                field1332[++Statics.field3753 - 1] = class97.method144(var201);
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5018) {
                                                                                                                                int var202 = field1332[--Statics.field3753];
                                                                                                                                field1332[++Statics.field3753 - 1] = Statics.method1762(var202);
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5019) {
                                                                                                                                int var203 = field1332[--Statics.field3753];
                                                                                                                                int[] var204 = field1332;
                                                                                                                                int var205 = ++Statics.field3753 - 1;
                                                                                                                                class72 var206 = (class72) class97.field1517.method3331((long) var203);
                                                                                                                                int var207;
                                                                                                                                if (var206 == null) {
                                                                                                                                    var207 = -1;
                                                                                                                                } else if (class97.field1518.field2484 == var206.field2470) {
                                                                                                                                    var207 = -1;
                                                                                                                                } else {
                                                                                                                                    var207 = ((class72) var206.field2470).field879;
                                                                                                                                }
                                                                                                                                var204[var205] = var207;
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5020) {
                                                                                                                                String var208 = field1334[--Statics.field3666];
                                                                                                                                client.method2199(var208);
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5021) {
                                                                                                                                client.field991 = field1334[--Statics.field3666].toLowerCase().trim();
                                                                                                                                var164 = 1;
                                                                                                                            } else if (var258 == 5022) {
                                                                                                                                field1334[++Statics.field3666 - 1] = client.field991;
                                                                                                                                var164 = 1;
                                                                                                                            } else {
                                                                                                                                var164 = 2;
                                                                                                                            }
                                                                                                                            var43 = var164;
                                                                                                                        } else if (var258 < 5400) {
                                                                                                                            var43 = method2691(var258, var4, var42);
                                                                                                                        } else if (var258 < 5600) {
                                                                                                                            byte var214;
                                                                                                                            if (var258 == 5504) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var212 = field1332[Statics.field3753];
                                                                                                                                int var213 = field1332[Statics.field3753 + 1];
                                                                                                                                if (!client.field1161) {
                                                                                                                                    client.field998 = var212;
                                                                                                                                    client.field1156 = var213;
                                                                                                                                }
                                                                                                                                var214 = 1;
                                                                                                                            } else if (var258 == 5505) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field998;
                                                                                                                                var214 = 1;
                                                                                                                            } else if (var258 == 5506) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1156;
                                                                                                                                var214 = 1;
                                                                                                                            } else if (var258 == 5530) {
                                                                                                                                int var215 = field1332[--Statics.field3753];
                                                                                                                                if (var215 < 0) {
                                                                                                                                    var215 = 0;
                                                                                                                                }
                                                                                                                                client.field1070 = var215;
                                                                                                                                var214 = 1;
                                                                                                                            } else if (var258 == 5531) {
                                                                                                                                field1332[++Statics.field3753 - 1] = client.field1070;
                                                                                                                                var214 = 1;
                                                                                                                            } else {
                                                                                                                                var214 = 2;
                                                                                                                            }
                                                                                                                            var43 = var214;
                                                                                                                        } else if (var258 < 5700) {
                                                                                                                            var43 = method1596(var258, var4, var42);
                                                                                                                        } else if (var258 < 6300) {
                                                                                                                            var43 = method1605(var258, var4, var42);
                                                                                                                        } else if (var258 < 6600) {
                                                                                                                            byte var216;
                                                                                                                            if (var258 == 6500) {
                                                                                                                                field1332[++Statics.field3753 - 1] = class79.method1017() ? 1 : 0;
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6501) {
                                                                                                                                class79 var217 = class79.method2251();
                                                                                                                                if (var217 == null) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -1;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = var217.field1282;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var217.field1280;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var217.field1291;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var217.field1292;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var217.field1289;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var217.field1290;
                                                                                                                                }
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6502) {
                                                                                                                                class79 var218;
                                                                                                                                if (class79.field1284 < class79.field1283) {
                                                                                                                                    var218 = Statics.field3665[++class79.field1284 - 1];
                                                                                                                                } else {
                                                                                                                                    var218 = null;
                                                                                                                                }
                                                                                                                                if (var218 == null) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -1;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = var218.field1282;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var218.field1280;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var218.field1291;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var218.field1292;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var218.field1289;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var218.field1290;
                                                                                                                                }
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6506) {
                                                                                                                                int var220 = field1332[--Statics.field3753];
                                                                                                                                class79 var221 = null;
                                                                                                                                for (int var222 = 0; var222 < class79.field1283; var222++) {
                                                                                                                                    if (Statics.field3665[var222].field1282 == var220) {
                                                                                                                                        var221 = Statics.field3665[var222];
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var221 == null) {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -1;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = var221.field1282;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var221.field1280;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var221.field1291;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var221.field1292;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var221.field1289;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var221.field1290;
                                                                                                                                }
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6507) {
                                                                                                                                Statics.field3753 -= 4;
                                                                                                                                int var223 = field1332[Statics.field3753];
                                                                                                                                boolean var224 = field1332[Statics.field3753 + 1] == 1;
                                                                                                                                int var225 = field1332[Statics.field3753 + 2];
                                                                                                                                boolean var226 = field1332[Statics.field3753 + 3] == 1;
                                                                                                                                if (Statics.field3665 != null) {
                                                                                                                                    class79.method16(0, Statics.field3665.length - 1, var223, var224, var225, var226);
                                                                                                                                }
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6511) {
                                                                                                                                int var227 = field1332[--Statics.field3753];
                                                                                                                                if (var227 >= 0 && var227 < class79.field1283) {
                                                                                                                                    class79 var228 = Statics.field3665[var227];
                                                                                                                                    field1332[++Statics.field3753 - 1] = var228.field1282;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var228.field1280;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var228.field1291;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var228.field1292;
                                                                                                                                    field1332[++Statics.field3753 - 1] = var228.field1289;
                                                                                                                                    field1334[++Statics.field3666 - 1] = var228.field1290;
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = -1;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                    field1334[++Statics.field3666 - 1] = "";
                                                                                                                                }
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6512) {
                                                                                                                                client.field1175 = field1332[--Statics.field3753] == 1;
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6513) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var229 = field1332[Statics.field3753];
                                                                                                                                int var230 = field1332[Statics.field3753 + 1];
                                                                                                                                class252 var231 = class252.method3272(var230);
                                                                                                                                if (var231.method4180()) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = class259.method116(var229).method4417(var230, var231.field3389);
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = class259.method116(var229).method4398(var230, var231.field3387);
                                                                                                                                }
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6514) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var232 = field1332[Statics.field3753];
                                                                                                                                int var233 = field1332[Statics.field3753 + 1];
                                                                                                                                class252 var234 = class252.method3272(var233);
                                                                                                                                if (var234.method4180()) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = class256.method2861(var232).method4294(var233, var234.field3389);
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = class256.method2861(var232).method4295(var233, var234.field3387);
                                                                                                                                }
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6515) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var235 = field1332[Statics.field3753];
                                                                                                                                int var236 = field1332[Statics.field3753 + 1];
                                                                                                                                class252 var237 = class252.method3272(var236);
                                                                                                                                if (var237.method4180()) {
                                                                                                                                    field1334[++Statics.field3666 - 1] = class257.method2694(var235).method4338(var236, var237.field3389);
                                                                                                                                } else {
                                                                                                                                    field1332[++Statics.field3753 - 1] = class257.method2694(var235).method4337(var236, var237.field3387);
                                                                                                                                }
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6516) {
                                                                                                                                Statics.field3753 -= 2;
                                                                                                                                int var238 = field1332[Statics.field3753];
                                                                                                                                int var239 = field1332[Statics.field3753 + 1];
                                                                                                                                class252 var240 = class252.method3272(var239);
                                                                                                                                if (var240.method4180()) {
                                                                                                                                    String[] var241 = field1334;
                                                                                                                                    int var242 = ++Statics.field3666 - 1;
                                                                                                                                    class253 var243 = (class253) class253.field3395.method3357((long) var238);
                                                                                                                                    class253 var244;
                                                                                                                                    if (var243 == null) {
                                                                                                                                        byte[] var245 = Statics.field3398.method3876(34, var238);
                                                                                                                                        class253 var246 = new class253();
                                                                                                                                        if (var245 != null) {
                                                                                                                                            var246.method4209(new class174(var245));
                                                                                                                                        }
                                                                                                                                        var246.method4202();
                                                                                                                                        class253.field3395.method3371(var246, (long) var238);
                                                                                                                                        var244 = var246;
                                                                                                                                    } else {
                                                                                                                                        var244 = var243;
                                                                                                                                    }
                                                                                                                                    var241[var242] = var244.method4205(var239, var240.field3389);
                                                                                                                                } else {
                                                                                                                                    int[] var247 = field1332;
                                                                                                                                    int var248 = ++Statics.field3753 - 1;
                                                                                                                                    class253 var249 = (class253) class253.field3395.method3357((long) var238);
                                                                                                                                    class253 var250;
                                                                                                                                    if (var249 == null) {
                                                                                                                                        byte[] var251 = Statics.field3398.method3876(34, var238);
                                                                                                                                        class253 var252 = new class253();
                                                                                                                                        if (var251 != null) {
                                                                                                                                            var252.method4209(new class174(var251));
                                                                                                                                        }
                                                                                                                                        var252.method4202();
                                                                                                                                        class253.field3395.method3371(var252, (long) var238);
                                                                                                                                        var250 = var252;
                                                                                                                                    } else {
                                                                                                                                        var250 = var249;
                                                                                                                                    }
                                                                                                                                    var247[var248] = var250.method4206(var239, var240.field3387);
                                                                                                                                }
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6518) {
                                                                                                                                field1332[++Statics.field3753 - 1] = 0;
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6520) {
                                                                                                                                var216 = 1;
                                                                                                                            } else if (var258 == 6521) {
                                                                                                                                var216 = 1;
                                                                                                                            } else {
                                                                                                                                var216 = 2;
                                                                                                                            }
                                                                                                                            var43 = var216;
                                                                                                                        } else if (var258 < 6700) {
                                                                                                                            var43 = method38(var258, var4, var42);
                                                                                                                        } else {
                                                                                                                            var43 = 2;
                                                                                                                        }
                                                                                                                        switch(var43) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var258 == 0) {
                                                                                                                        field1332[++Statics.field3753 - 1] = var8[var6];
                                                                                                                    } else if (var258 == 1) {
                                                                                                                        int var16 = var8[var6];
                                                                                                                        field1332[++Statics.field3753 - 1] = class212.field2599[var16];
                                                                                                                    } else if (var258 == 2) {
                                                                                                                        int var17 = var8[var6];
                                                                                                                        class212.field2599[var17] = field1332[--Statics.field3753];
                                                                                                                        client.method561(var17);
                                                                                                                    } else if (var258 == 3) {
                                                                                                                        field1334[++Statics.field3666 - 1] = var4.field1527[var6];
                                                                                                                    } else if (var258 == 6) {
                                                                                                                        var6 += var8[var6];
                                                                                                                    } else if (var258 == 7) {
                                                                                                                        Statics.field3753 -= 2;
                                                                                                                        if (field1332[Statics.field3753] != field1332[Statics.field3753 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var258 == 8) {
                                                                                                                        Statics.field3753 -= 2;
                                                                                                                        if (field1332[Statics.field3753] == field1332[Statics.field3753 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var258 == 9) {
                                                                                                                        Statics.field3753 -= 2;
                                                                                                                        if (field1332[Statics.field3753] < field1332[Statics.field3753 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var258 == 10) {
                                                                                                                        Statics.field3753 -= 2;
                                                                                                                        if (field1332[Statics.field3753] > field1332[Statics.field3753 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var258 == 21) {
                                                                                                                        if (field1337 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var18 = field1335[--field1337];
                                                                                                                        var4 = var18.field791;
                                                                                                                        var7 = var4.field1522;
                                                                                                                        var8 = var4.field1528;
                                                                                                                        var6 = var18.field790;
                                                                                                                        Statics.field1331 = var18.field789;
                                                                                                                        Statics.field2778 = var18.field792;
                                                                                                                    } else if (var258 == 25) {
                                                                                                                        int var19 = var8[var6];
                                                                                                                        field1332[++Statics.field3753 - 1] = Statics.method1604(var19);
                                                                                                                    } else if (var258 == 27) {
                                                                                                                        int var20 = var8[var6];
                                                                                                                        class212.method2004(var20, field1332[--Statics.field3753]);
                                                                                                                    } else if (var258 == 31) {
                                                                                                                        Statics.field3753 -= 2;
                                                                                                                        if (field1332[Statics.field3753] <= field1332[Statics.field3753 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var258 == 32) {
                                                                                                                        Statics.field3753 -= 2;
                                                                                                                        if (field1332[Statics.field3753] >= field1332[Statics.field3753 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var258 == 33) {
                                                                                                                        field1332[++Statics.field3753 - 1] = Statics.field1331[var8[var6]];
                                                                                                                    } else if (var258 == 34) {
                                                                                                                        Statics.field1331[var8[var6]] = field1332[--Statics.field3753];
                                                                                                                    } else if (var258 == 35) {
                                                                                                                        field1334[++Statics.field3666 - 1] = Statics.field2778[var8[var6]];
                                                                                                                    } else if (var258 == 36) {
                                                                                                                        Statics.field2778[var8[var6]] = field1334[--Statics.field3666];
                                                                                                                    } else if (var258 == 37) {
                                                                                                                        int var21 = var8[var6];
                                                                                                                        Statics.field3666 -= var21;
                                                                                                                        String var22 = class271.method153(field1334, Statics.field3666, var21);
                                                                                                                        field1334[++Statics.field3666 - 1] = var22;
                                                                                                                    } else if (var258 == 38) {
                                                                                                                        Statics.field3753--;
                                                                                                                    } else if (var258 == 39) {
                                                                                                                        Statics.field3666--;
                                                                                                                    } else if (var258 == 40) {
                                                                                                                        int var23 = var8[var6];
                                                                                                                        class98 var24 = class98.method2811(var23);
                                                                                                                        int[] var25 = new int[var24.field1525];
                                                                                                                        String[] var26 = new String[var24.field1526];
                                                                                                                        for (int var27 = 0; var27 < var24.field1521; var27++) {
                                                                                                                            var25[var27] = field1332[Statics.field3753 - var24.field1521 + var27];
                                                                                                                        }
                                                                                                                        for (int var28 = 0; var28 < var24.field1529; var28++) {
                                                                                                                            var26[var28] = field1334[Statics.field3666 - var24.field1529 + var28];
                                                                                                                        }
                                                                                                                        Statics.field3753 -= var24.field1521;
                                                                                                                        Statics.field3666 -= var24.field1529;
                                                                                                                        class63 var29 = new class63();
                                                                                                                        var29.field791 = var4;
                                                                                                                        var29.field790 = var6;
                                                                                                                        var29.field789 = Statics.field1331;
                                                                                                                        var29.field792 = Statics.field2778;
                                                                                                                        field1335[++field1337 - 1] = var29;
                                                                                                                        var4 = var24;
                                                                                                                        var7 = var24.field1522;
                                                                                                                        var8 = var24.field1528;
                                                                                                                        var6 = -1;
                                                                                                                        Statics.field1331 = var25;
                                                                                                                        Statics.field2778 = var26;
                                                                                                                    } else if (var258 == 42) {
                                                                                                                        field1332[++Statics.field3753 - 1] = Statics.field377.method1690(var8[var6]);
                                                                                                                    } else if (var258 == 43) {
                                                                                                                        Statics.field377.method1689(var8[var6], field1332[--Statics.field3753]);
                                                                                                                    } else if (var258 == 44) {
                                                                                                                        int var30 = var8[var6] >> 16;
                                                                                                                        int var31 = var8[var6] & 0xFFFF;
                                                                                                                        int var32 = field1332[--Statics.field3753];
                                                                                                                        if (var32 >= 0 && var32 <= 5000) {
                                                                                                                            field1330[var30] = var32;
                                                                                                                            byte var33 = -1;
                                                                                                                            if (var31 == 105) {
                                                                                                                                var33 = 0;
                                                                                                                            }
                                                                                                                            int var34 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var34 >= var32) {
                                                                                                                                    continue label1649;
                                                                                                                                }
                                                                                                                                field1327[var30][var34] = var33;
                                                                                                                                var34++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var258 == 45) {
                                                                                                                        int var35 = var8[var6];
                                                                                                                        int var36 = field1332[--Statics.field3753];
                                                                                                                        if (var36 < 0 || var36 >= field1330[var35]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1332[++Statics.field3753 - 1] = field1327[var35][var36];
                                                                                                                    } else if (var258 == 46) {
                                                                                                                        int var37 = var8[var6];
                                                                                                                        Statics.field3753 -= 2;
                                                                                                                        int var38 = field1332[Statics.field3753];
                                                                                                                        if (var38 < 0 || var38 >= field1330[var37]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1327[var37][var38] = field1332[Statics.field3753 + 1];
                                                                                                                    } else if (var258 == 47) {
                                                                                                                        String var39 = Statics.field377.method1701(var8[var6]);
                                                                                                                        if (var39 == null) {
                                                                                                                            var39 = "null";
                                                                                                                        }
                                                                                                                        field1334[++Statics.field3666 - 1] = var39;
                                                                                                                    } else if (var258 == 48) {
                                                                                                                        Statics.field377.method1691(var8[var6], field1334[--Statics.field3666]);
                                                                                                                    } else if (var258 == 60) {
                                                                                                                        class187 var40 = var4.field1524[var8[var6]];
                                                                                                                        class199 var41 = (class199) var40.method3331((long) field1332[--Statics.field3753]);
                                                                                                                        if (var41 != null) {
                                                                                                                            var6 += var41.field2479;
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
        } catch (Exception var257) {
            StringBuilder var255 = new StringBuilder(30);
            var255.append("").append(var4.field2464).append(" ");
            for (int var256 = field1337 - 1; var256 >= 0; var256--) {
                var255.append("").append(field1335[var256].field791.field2464).append(" ");
            }
            var255.append("").append(var9);
            class153.method611(var255.toString(), var257);
        }
    }

    @ObfuscatedName("fo.q(ILct;ZI)I")
    public static int method2902(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field3753 -= 3;
            int var3 = field1332[Statics.field3753];
            int var4 = field1332[Statics.field3753 + 1];
            int var5 = field1332[Statics.field3753 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class217 var6 = class217.method2254(var3);
            if (var6.field2767 == null) {
                var6.field2767 = new class217[var5 + 1];
            }
            if (var6.field2767.length <= var5) {
                class217[] var7 = new class217[var5 + 1];
                for (int var8 = 0; var8 < var6.field2767.length; var8++) {
                    var7[var8] = var6.field2767[var8];
                }
                var6.field2767 = var7;
            }
            if (var5 > 0 && var6.field2767[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class217 var9 = new class217();
            var9.field2645 = var4;
            var9.field2701 = var9.field2643 = var6.field2643;
            var9.field2644 = var5;
            var9.field2642 = true;
            var6.field2767[var5] = var9;
            if (arg2) {
                Statics.field3393 = var9;
            } else {
                Statics.field2315 = var9;
            }
            client.method578(var6);
            return 1;
        } else if (arg0 == 101) {
            class217 var10 = arg2 ? Statics.field3393 : Statics.field2315;
            class217 var11 = class217.method2254(var10.field2643);
            var11.field2767[var10.field2644] = null;
            client.method578(var11);
            return 1;
        } else if (arg0 == 102) {
            class217 var12 = class217.method2254(field1332[--Statics.field3753]);
            var12.field2767 = null;
            client.method578(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field3753 -= 2;
            int var13 = field1332[Statics.field3753];
            int var14 = field1332[Statics.field3753 + 1];
            class217 var15 = Statics.method3770(var13, var14);
            if (var15 == null || var14 == -1) {
                field1332[++Statics.field3753 - 1] = 0;
            } else {
                field1332[++Statics.field3753 - 1] = 1;
                if (arg2) {
                    Statics.field3393 = var15;
                } else {
                    Statics.field2315 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class217 var16 = class217.method2254(field1332[--Statics.field3753]);
            if (var16 == null) {
                field1332[++Statics.field3753 - 1] = 0;
            } else {
                field1332[++Statics.field3753 - 1] = 1;
                if (arg2) {
                    Statics.field3393 = var16;
                } else {
                    Statics.field2315 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.o(ILct;ZB)I")
    public static int method449(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1332[--Statics.field3753];
            var4 = class217.method2254(var3);
        } else {
            var4 = arg2 ? Statics.field3393 : Statics.field2315;
        }
        if (arg0 == 1000) {
            Statics.field3753 -= 4;
            var4.field2652 = field1332[Statics.field3753];
            var4.field2653 = field1332[Statics.field3753 + 1];
            var4.field2648 = field1332[Statics.field3753 + 2];
            var4.field2733 = field1332[Statics.field3753 + 3];
            client.method578(var4);
            Statics.field243.method1069(var4);
            if (var3 != -1 && var4.field2645 == 0) {
                client.method2910(Statics.field2629[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field3753 -= 4;
            var4.field2654 = field1332[Statics.field3753];
            var4.field2655 = field1332[Statics.field3753 + 1];
            var4.field2650 = field1332[Statics.field3753 + 2];
            var4.field2777 = field1332[Statics.field3753 + 3];
            client.method578(var4);
            Statics.field243.method1069(var4);
            if (var3 != -1 && var4.field2645 == 0) {
                client.method2910(Statics.field2629[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1332[--Statics.field3753] == 1;
            if (var4.field2663 != var5) {
                var4.field2663 = var5;
                client.method578(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2660 = field1332[--Statics.field3753] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2699 = field1332[--Statics.field3753] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.g(ILct;ZB)I")
    public static int method58(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1332[--Statics.field3753];
            var4 = class217.method2254(var3);
        } else {
            var4 = arg2 ? Statics.field3393 : Statics.field2315;
        }
        if (arg0 == 1100) {
            Statics.field3753 -= 2;
            var4.field2664 = field1332[Statics.field3753];
            if (var4.field2664 > var4.field2740 - var4.field2658) {
                var4.field2664 = var4.field2740 - var4.field2658;
            }
            if (var4.field2664 < 0) {
                var4.field2664 = 0;
            }
            var4.field2765 = field1332[Statics.field3753 + 1];
            if (var4.field2765 > var4.field2667 - var4.field2659) {
                var4.field2765 = var4.field2667 - var4.field2659;
            }
            if (var4.field2765 < 0) {
                var4.field2765 = 0;
            }
            client.method578(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2668 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2672 = field1332[--Statics.field3753] == 1;
            client.method578(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2769 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2746 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2678 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2680 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2728 = field1332[--Statics.field3753] == 1;
            client.method578(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2774 = 1;
            var4.field2687 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field3753 -= 6;
            var4.field2738 = field1332[Statics.field3753];
            var4.field2693 = field1332[Statics.field3753 + 1];
            var4.field2694 = field1332[Statics.field3753 + 2];
            var4.field2695 = field1332[Statics.field3753 + 3];
            var4.field2696 = field1332[Statics.field3753 + 4];
            var4.field2731 = field1332[Statics.field3753 + 5];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1332[--Statics.field3753];
            if (var4.field2712 != var5) {
                var4.field2712 = var5;
                var4.field2681 = 0;
                var4.field2766 = 0;
                client.method578(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2700 = field1332[--Statics.field3753] == 1;
            client.method578(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1334[--Statics.field3666];
            if (!var6.equals(var4.field2703)) {
                var4.field2703 = var6;
                client.method578(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2692 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field3753 -= 3;
            var4.field2706 = field1332[Statics.field3753];
            var4.field2707 = field1332[Statics.field3753 + 1];
            var4.field2705 = field1332[Statics.field3753 + 2];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2708 = field1332[--Statics.field3753] == 1;
            client.method578(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2682 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2683 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2686 = field1332[--Statics.field3753] == 1;
            client.method578(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2685 = field1332[--Statics.field3753] == 1;
            client.method578(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field3753 -= 2;
            var4.field2740 = field1332[Statics.field3753];
            var4.field2667 = field1332[Statics.field3753 + 1];
            client.method578(var4);
            if (var3 != -1 && var4.field2645 == 0) {
                client.method2910(Statics.field2629[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method674(var4.field2643, var4.field2644);
            client.field1079 = var4;
            client.method578(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2679 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2669 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2675 = field1332[--Statics.field3753];
            client.method578(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1332[--Statics.field3753];
            class285[] var8 = new class285[] { class285.field3780, class285.field3781, class285.field3785, class285.field3783, class285.field3782 };
            class285 var9 = (class285) class169.method233(var8, var7);
            if (var9 != null) {
                var4.field2673 = var9;
                client.method578(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var10 = field1332[--Statics.field3753] == 1;
            var4.field2677 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("i.v(ILct;ZS)I")
    public static int method84(int arg0, class98 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method2254(field1332[--Statics.field3753]);
        } else {
            var3 = arg2 ? Statics.field3393 : Statics.field2315;
        }
        client.method578(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field3753 -= 2;
            int var4 = field1332[Statics.field3753];
            int var5 = field1332[Statics.field3753 + 1];
            var3.field2763 = var4;
            var3.field2764 = var5;
            class257 var6 = class257.method2694(var4);
            var3.field2694 = var6.field3494;
            var3.field2695 = var6.field3506;
            var3.field2696 = var6.field3507;
            var3.field2738 = var6.field3508;
            var3.field2693 = var6.field3509;
            var3.field2731 = var6.field3504;
            if (arg0 == 1205) {
                var3.field2760 = 0;
            } else if (arg0 == 1212 | var6.field3510 == 1) {
                var3.field2760 = 1;
            } else {
                var3.field2760 = 2;
            }
            if (var3.field2759 > 0) {
                var3.field2731 = var3.field2731 * 32 / var3.field2759;
            } else if (var3.field2654 > 0) {
                var3.field2731 = var3.field2731 * 32 / var3.field2654;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2774 = 2;
            var3.field2687 = field1332[--Statics.field3753];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2774 = 3;
            var3.field2687 = Statics.field832.field888.method3740();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.e(ILct;ZB)I")
    public static int method980(int arg0, class98 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method2254(field1332[--Statics.field3753]);
        } else {
            var3 = arg2 ? Statics.field3393 : Statics.field2315;
        }
        String var4 = field1334[--Statics.field3666];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1332[--Statics.field3753];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1332[--Statics.field3753];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1334[--Statics.field3666];
            } else {
                var7[var8] = Integer.valueOf(field1332[--Statics.field3753]);
            }
        }
        int var9 = field1332[--Statics.field3753];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2725 = var7;
        } else if (arg0 == 1401) {
            var3.field2646 = var7;
        } else if (arg0 == 1402) {
            var3.field2722 = var7;
        } else if (arg0 == 1403) {
            var3.field2729 = var7;
        } else if (arg0 == 1404) {
            var3.field2735 = var7;
        } else if (arg0 == 1405) {
            var3.field2732 = var7;
        } else if (arg0 == 1406) {
            var3.field2720 = var7;
        } else if (arg0 == 1407) {
            var3.field2736 = var7;
            var3.field2737 = var5;
        } else if (arg0 == 1408) {
            var3.field2690 = var7;
        } else if (arg0 == 1409) {
            var3.field2743 = var7;
        } else if (arg0 == 1410) {
            var3.field2751 = var7;
        } else if (arg0 == 1411) {
            var3.field2636 = var7;
        } else if (arg0 == 1412) {
            var3.field2726 = var7;
        } else if (arg0 == 1414) {
            var3.field2676 = var7;
            var3.field2739 = var5;
        } else if (arg0 == 1415) {
            var3.field2752 = var7;
            var3.field2666 = var5;
        } else if (arg0 == 1416) {
            var3.field2756 = var7;
        } else if (arg0 == 1417) {
            var3.field2744 = var7;
        } else if (arg0 == 1418) {
            var3.field2745 = var7;
        } else if (arg0 == 1419) {
            var3.field2772 = var7;
        } else if (arg0 == 1420) {
            var3.field2704 = var7;
        } else if (arg0 == 1421) {
            var3.field2748 = var7;
        } else if (arg0 == 1422) {
            var3.field2749 = var7;
        } else if (arg0 == 1423) {
            var3.field2750 = var7;
        } else if (arg0 == 1424) {
            var3.field2741 = var7;
        } else if (arg0 == 1425) {
            var3.field2638 = var7;
        } else if (arg0 == 1426) {
            var3.field2754 = var7;
        } else if (arg0 == 1427) {
            var3.field2662 = var7;
        } else {
            return 2;
        }
        var3.field2723 = true;
        return 1;
    }

    @ObfuscatedName("dg.d(ILct;ZI)I")
    public static int method2341(int arg0, class98 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field3393 : Statics.field2315;
        if (arg0 == 1500) {
            field1332[++Statics.field3753 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 1501) {
            field1332[++Statics.field3753 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 1502) {
            field1332[++Statics.field3753 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 1503) {
            field1332[++Statics.field3753 - 1] = var3.field2659;
            return 1;
        } else if (arg0 == 1504) {
            field1332[++Statics.field3753 - 1] = var3.field2663 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1332[++Statics.field3753 - 1] = var3.field2701;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cd.x(ILct;ZI)I")
    public static int method1659(int arg0, class98 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field3393 : Statics.field2315;
        if (arg0 == 1600) {
            field1332[++Statics.field3753 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 1601) {
            field1332[++Statics.field3753 - 1] = var3.field2765;
            return 1;
        } else if (arg0 == 1602) {
            field1334[++Statics.field3666 - 1] = var3.field2703;
            return 1;
        } else if (arg0 == 1603) {
            field1332[++Statics.field3753 - 1] = var3.field2740;
            return 1;
        } else if (arg0 == 1604) {
            field1332[++Statics.field3753 - 1] = var3.field2667;
            return 1;
        } else if (arg0 == 1605) {
            field1332[++Statics.field3753 - 1] = var3.field2731;
            return 1;
        } else if (arg0 == 1606) {
            field1332[++Statics.field3753 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 1607) {
            field1332[++Statics.field3753 - 1] = var3.field2696;
            return 1;
        } else if (arg0 == 1608) {
            field1332[++Statics.field3753 - 1] = var3.field2695;
            return 1;
        } else if (arg0 == 1609) {
            field1332[++Statics.field3753 - 1] = var3.field2769;
            return 1;
        } else if (arg0 == 1610) {
            field1332[++Statics.field3753 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1611) {
            field1332[++Statics.field3753 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 1612) {
            field1332[++Statics.field3753 - 1] = var3.field2669;
            return 1;
        } else if (arg0 == 1613) {
            field1332[++Statics.field3753 - 1] = var3.field2673.method13();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.u(ILct;ZI)I")
    public static int method1014(int arg0, class98 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method2254(field1332[--Statics.field3753]);
        } else {
            var3 = arg2 ? Statics.field3393 : Statics.field2315;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1338 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2662 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field851 = var3;
            var4.field850 = var3.field2662;
            var4.field855 = field1338 + 1;
            client.field1114.method3429(var4);
            return 1;
        }
    }

    @ObfuscatedName("da.i(ILct;ZI)I")
    public static int method2252(int arg0, class98 arg1, boolean arg2) {
        class217 var3 = class217.method2254(field1332[--Statics.field3753]);
        if (arg0 == 2500) {
            field1332[++Statics.field3753 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 2501) {
            field1332[++Statics.field3753 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 2502) {
            field1332[++Statics.field3753 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 2503) {
            field1332[++Statics.field3753 - 1] = var3.field2659;
            return 1;
        } else if (arg0 == 2504) {
            field1332[++Statics.field3753 - 1] = var3.field2663 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1332[++Statics.field3753 - 1] = var3.field2701;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.h(ILct;ZB)I")
    public static int method977(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class217 var3 = class217.method2254(field1332[--Statics.field3753]);
            field1332[++Statics.field3753 - 1] = var3.field2763;
            return 1;
        } else if (arg0 == 2701) {
            class217 var4 = class217.method2254(field1332[--Statics.field3753]);
            if (var4.field2763 == -1) {
                field1332[++Statics.field3753 - 1] = 0;
            } else {
                field1332[++Statics.field3753 - 1] = var4.field2764;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1332[--Statics.field3753];
            class68 var6 = (class68) client.field974.method3387((long) var5);
            if (var6 == null) {
                field1332[++Statics.field3753 - 1] = 0;
            } else {
                field1332[++Statics.field3753 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1332[++Statics.field3753 - 1] = client.field1075;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.b(ILct;ZI)I")
    public static int method173(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field3753 -= 3;
            int var3 = field1332[Statics.field3753];
            int var4 = field1332[Statics.field3753 + 1];
            int var5 = field1332[Statics.field3753 + 2];
            if (client.field1153 != 0 && var4 != 0 && client.field1155 < 50) {
                client.field1099[client.field1155] = var3;
                client.field1157[client.field1155] = var4;
                client.field1137[client.field1155] = var5;
                client.field1160[client.field1155] = null;
                client.field1041[client.field1155] = 0;
                client.field1155++;
            }
            return 1;
        } else if (arg0 == 3201) {
            client.method2720(field1332[--Statics.field3753]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field3753 -= 2;
            int var6 = field1332[Statics.field3753];
            int var7 = field1332[Statics.field3753 + 1];
            if (client.field1150 != 0 && var6 != -1) {
                class204.method1573(Statics.field858, var6, 0, client.field1150, false);
                client.field1152 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.j(ILct;ZS)I")
    public static int method458(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field3753 -= 2;
            int var3 = field1332[Statics.field3753];
            int var4 = field1332[Statics.field3753 + 1];
            class254 var5 = class254.method2228(var3);
            if (var5.field3402 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3400; var6++) {
                if (var5.field3406[var6] == var4) {
                    field1334[++Statics.field3666 - 1] = var5.field3408[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1334[++Statics.field3666 - 1] = var5.field3403;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field3753 -= 4;
            int var7 = field1332[Statics.field3753];
            int var8 = field1332[Statics.field3753 + 1];
            int var9 = field1332[Statics.field3753 + 2];
            int var10 = field1332[Statics.field3753 + 3];
            class254 var11 = class254.method2228(var9);
            if (var11.field3401 != var7 || var11.field3402 != var8) {
                if (var8 == 115) {
                    field1334[++Statics.field3666 - 1] = "null";
                } else {
                    field1332[++Statics.field3753 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3400; var12++) {
                if (var11.field3406[var12] == var10) {
                    if (var8 == 115) {
                        field1334[++Statics.field3666 - 1] = var11.field3408[var12];
                    } else {
                        field1332[++Statics.field3753 - 1] = var11.field3407[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1334[++Statics.field3666 - 1] = var11.field3403;
                } else {
                    field1332[++Statics.field3753 - 1] = var11.field3404;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("er.y(ILct;ZB)I")
    public static int method2693(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = client.field1189[var3].method89();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = client.field1189[var4].field318;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = client.field1189[var5].field320;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = client.field1189[var6].field315;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = client.field1189[var7].field314;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = client.field1189[var8].field317;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1332[--Statics.field3753];
            int var10 = client.field1189[var9].method88();
            field1332[++Statics.field3753 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1332[--Statics.field3753];
            int var12 = client.field1189[var11].method88();
            field1332[++Statics.field3753 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1332[--Statics.field3753];
            int var14 = client.field1189[var13].method88();
            field1332[++Statics.field3753 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1332[--Statics.field3753];
            int var16 = client.field1189[var15].method88();
            field1332[++Statics.field3753 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1332[--Statics.field3753] == 1;
            if (Statics.field2581 != null) {
                Statics.field2581.method64(class14.field290, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1332[--Statics.field3753] == 1;
            if (Statics.field2581 != null) {
                Statics.field2581.method64(class14.field287, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field3753 -= 2;
            boolean var19 = field1332[Statics.field3753] == 1;
            boolean var20 = field1332[Statics.field3753 + 1] == 1;
            if (Statics.field2581 != null) {
                Statics.field2581.method64(new class94(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1332[--Statics.field3753] == 1;
            if (Statics.field2581 != null) {
                Statics.field2581.method64(class14.field286, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1332[--Statics.field3753] == 1;
            if (Statics.field2581 != null) {
                Statics.field2581.method64(class14.field289, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1332[++Statics.field3753 - 1] = Statics.field2581 == null ? 0 : Statics.field2581.field291.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1332[--Statics.field3753];
            class15 var24 = (class15) Statics.field2581.field291.get(var23);
            field1332[++Statics.field3753 - 1] = var24.field297;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1332[--Statics.field3753];
            class15 var26 = (class15) Statics.field2581.field291.get(var25);
            field1334[++Statics.field3666 - 1] = var26.method73();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1332[--Statics.field3753];
            class15 var28 = (class15) Statics.field2581.field291.get(var27);
            field1334[++Statics.field3666 - 1] = var28.method71();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1332[--Statics.field3753];
            class15 var30 = (class15) Statics.field2581.field291.get(var29);
            long var31 = class176.method3200() - Statics.field458 - var30.field294;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1334[++Statics.field3666 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1332[--Statics.field3753];
            class15 var38 = (class15) Statics.field2581.field291.get(var37);
            field1332[++Statics.field3753 - 1] = var38.field295.field315;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1332[--Statics.field3753];
            class15 var40 = (class15) Statics.field2581.field291.get(var39);
            field1332[++Statics.field3753 - 1] = var40.field295.field320;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1332[--Statics.field3753];
            class15 var42 = (class15) Statics.field2581.field291.get(var41);
            field1332[++Statics.field3753 - 1] = var42.field295.field318;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.c(ILct;ZB)I")
    public static int method460(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field3753 -= 2;
            int var3 = field1332[Statics.field3753];
            int var4 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field3753 -= 2;
            int var5 = field1332[Statics.field3753];
            int var6 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field3753 -= 2;
            int var7 = field1332[Statics.field3753];
            int var8 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field3753 -= 2;
            int var9 = field1332[Statics.field3753];
            int var10 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field3753 -= 5;
            int var13 = field1332[Statics.field3753];
            int var14 = field1332[Statics.field3753 + 1];
            int var15 = field1332[Statics.field3753 + 2];
            int var16 = field1332[Statics.field3753 + 3];
            int var17 = field1332[Statics.field3753 + 4];
            field1332[++Statics.field3753 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field3753 -= 2;
            int var18 = field1332[Statics.field3753];
            int var19 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field3753 -= 2;
            int var20 = field1332[Statics.field3753];
            int var21 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field3753 -= 2;
            int var22 = field1332[Statics.field3753];
            int var23 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field3753 -= 2;
            int var24 = field1332[Statics.field3753];
            int var25 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field3753 -= 2;
            int var26 = field1332[Statics.field3753];
            int var27 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field3753 -= 2;
            int var28 = field1332[Statics.field3753];
            int var29 = field1332[Statics.field3753 + 1];
            if (var28 == 0) {
                field1332[++Statics.field3753 - 1] = 0;
            } else {
                field1332[++Statics.field3753 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field3753 -= 2;
            int var30 = field1332[Statics.field3753];
            int var31 = field1332[Statics.field3753 + 1];
            if (var30 == 0) {
                field1332[++Statics.field3753 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1332[++Statics.field3753 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1332[++Statics.field3753 - 1] = var30;
                    break;
                case 2:
                    field1332[++Statics.field3753 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1332[++Statics.field3753 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1332[++Statics.field3753 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1332[++Statics.field3753 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field3753 -= 2;
            int var32 = field1332[Statics.field3753];
            int var33 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field3753 -= 2;
            int var34 = field1332[Statics.field3753];
            int var35 = field1332[Statics.field3753 + 1];
            field1332[++Statics.field3753 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field3753 -= 3;
            long var36 = (long) field1332[Statics.field3753];
            long var38 = (long) field1332[Statics.field3753 + 1];
            long var40 = (long) field1332[Statics.field3753 + 2];
            field1332[++Statics.field3753 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.r(ILct;ZI)I")
    public static int method728(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1334[--Statics.field3666];
            int var4 = field1332[--Statics.field3753];
            field1334[++Statics.field3666 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field3666 -= 2;
            String var5 = field1334[Statics.field3666];
            String var6 = field1334[Statics.field3666 + 1];
            field1334[++Statics.field3666 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1334[--Statics.field3666];
            int var8 = field1332[--Statics.field3753];
            field1334[++Statics.field3666 - 1] = var7 + class271.method3846(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1334[--Statics.field3666];
            field1334[++Statics.field3666 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1332[--Statics.field3753];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1333.setTime(new Date(var11));
            int var13 = field1333.get(5);
            int var14 = field1333.get(2);
            int var15 = field1333.get(1);
            field1334[++Statics.field3666 - 1] = var13 + "-" + field1339[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field3666 -= 2;
            String var16 = field1334[Statics.field3666];
            String var17 = field1334[Statics.field3666 + 1];
            if (Statics.field832.field888 != null && Statics.field832.field888.field2617) {
                field1334[++Statics.field3666 - 1] = var17;
            } else {
                field1334[++Statics.field3666 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1332[--Statics.field3753];
            field1334[++Statics.field3666 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field3666 -= 2;
            int[] var19 = field1332;
            int var20 = ++Statics.field3753 - 1;
            String var21 = field1334[Statics.field3666];
            String var22 = field1334[Statics.field3666 + 1];
            int var23 = client.field929;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            char var28 = 0;
            char var29 = 0;
            int var38;
            label209: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class165.method2(var36, var23) - class165.method2(var37, var23);
                                break label209;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class165.method2(var41, var23) - class165.method2(var42, var23);
                                break label209;
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
                var28 = class165.method237(var43);
                var29 = class165.method237(var45);
                char var47 = class165.method590(var43, var23);
                char var48 = class165.method590(var45, var23);
                if (var47 != var48 && Character.toUpperCase(var47) != Character.toUpperCase(var48)) {
                    char var49 = Character.toLowerCase(var47);
                    char var50 = Character.toLowerCase(var48);
                    if (var49 != var50) {
                        var38 = class165.method2(var49, var23) - class165.method2(var50, var23);
                        break;
                    }
                }
            }
            var19[var20] = class271.method3839(var38);
            return 1;
        } else if (arg0 == 4108) {
            String var51 = field1334[--Statics.field3666];
            Statics.field3753 -= 2;
            int var52 = field1332[Statics.field3753];
            int var53 = field1332[Statics.field3753 + 1];
            byte[] var54 = Statics.field42.method3876(var53, 0);
            class264 var55 = new class264(var54);
            field1332[++Statics.field3753 - 1] = var55.method4506(var51, var52);
            return 1;
        } else if (arg0 == 4109) {
            String var56 = field1334[--Statics.field3666];
            Statics.field3753 -= 2;
            int var57 = field1332[Statics.field3753];
            int var58 = field1332[Statics.field3753 + 1];
            byte[] var59 = Statics.field42.method3876(var58, 0);
            class264 var60 = new class264(var59);
            field1332[++Statics.field3753 - 1] = var60.method4505(var56, var57);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field3666 -= 2;
            String var61 = field1334[Statics.field3666];
            String var62 = field1334[Statics.field3666 + 1];
            if (field1332[--Statics.field3753] == 1) {
                field1334[++Statics.field3666 - 1] = var61;
            } else {
                field1334[++Statics.field3666 - 1] = var62;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var63 = field1334[--Statics.field3666];
            field1334[++Statics.field3666 - 1] = class265.method4522(var63);
            return 1;
        } else if (arg0 == 4112) {
            String var64 = field1334[--Statics.field3666];
            int var65 = field1332[--Statics.field3753];
            field1334[++Statics.field3666 - 1] = var64 + (char) var65;
            return 1;
        } else if (arg0 == 4113) {
            int var66 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = class271.method3872((char) var66) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var67 = field1332[--Statics.field3753];
            int[] var68 = field1332;
            int var69 = ++Statics.field3753 - 1;
            char var70 = (char) var67;
            boolean var71 = var70 >= '0' && var70 <= '9' || var70 >= 'A' && var70 <= 'Z' || var70 >= 'a' && var70 <= 'z';
            var68[var69] = var71 ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var72 = field1332[--Statics.field3753];
            int[] var73 = field1332;
            int var74 = ++Statics.field3753 - 1;
            char var75 = (char) var72;
            boolean var76 = var75 >= 'A' && var75 <= 'Z' || var75 >= 'a' && var75 <= 'z';
            var73[var74] = var76 ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var77 = field1332[--Statics.field3753];
            int[] var78 = field1332;
            int var79 = ++Statics.field3753 - 1;
            char var80 = (char) var77;
            boolean var81 = var80 >= '0' && var80 <= '9';
            var78[var79] = var81 ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var82 = field1334[--Statics.field3666];
            if (var82 == null) {
                field1332[++Statics.field3753 - 1] = 0;
            } else {
                field1332[++Statics.field3753 - 1] = var82.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var83 = field1334[--Statics.field3666];
            Statics.field3753 -= 2;
            int var84 = field1332[Statics.field3753];
            int var85 = field1332[Statics.field3753 + 1];
            field1334[++Statics.field3666 - 1] = var83.substring(var84, var85);
            return 1;
        } else if (arg0 == 4119) {
            String var86 = field1334[--Statics.field3666];
            StringBuilder var87 = new StringBuilder(var86.length());
            boolean var88 = false;
            for (int var89 = 0; var89 < var86.length(); var89++) {
                char var90 = var86.charAt(var89);
                if (var90 == '<') {
                    var88 = true;
                } else if (var90 == '>') {
                    var88 = false;
                } else if (!var88) {
                    var87.append(var90);
                }
            }
            field1334[++Statics.field3666 - 1] = var87.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var91 = field1334[--Statics.field3666];
            int var92 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = var91.indexOf(var92);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field3666 -= 2;
            String var93 = field1334[Statics.field3666];
            String var94 = field1334[Statics.field3666 + 1];
            int var95 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = var93.indexOf(var94, var95);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.m(ILct;ZI)I")
    public static int method993(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1332[--Statics.field3753];
            field1334[++Statics.field3666 - 1] = class257.method2694(var3).field3499;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field3753 -= 2;
            int var4 = field1332[Statics.field3753];
            int var5 = field1332[Statics.field3753 + 1];
            class257 var6 = class257.method2694(var4);
            if (var5 < 1 || var5 > 5 || var6.field3500[var5 - 1] == null) {
                field1334[++Statics.field3666 - 1] = "";
            } else {
                field1334[++Statics.field3666 - 1] = var6.field3500[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field3753 -= 2;
            int var7 = field1332[Statics.field3753];
            int var8 = field1332[Statics.field3753 + 1];
            class257 var9 = class257.method2694(var7);
            if (var8 < 1 || var8 > 5 || var9.field3514[var8 - 1] == null) {
                field1334[++Statics.field3666 - 1] = "";
            } else {
                field1334[++Statics.field3666 - 1] = var9.field3514[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = class257.method2694(var10).field3496;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = class257.method2694(var11).field3510 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1332[--Statics.field3753];
            class257 var13 = class257.method2694(var12);
            if (var13.field3532 == -1 && var13.field3531 >= 0) {
                field1332[++Statics.field3753 - 1] = var13.field3531;
            } else {
                field1332[++Statics.field3753 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1332[--Statics.field3753];
            class257 var15 = class257.method2694(var14);
            if (var15.field3532 >= 0 && var15.field3531 >= 0) {
                field1332[++Statics.field3753 - 1] = var15.field3531;
            } else {
                field1332[++Statics.field3753 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = class257.method2694(var16).field3512 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1332[--Statics.field3753];
            class257 var18 = class257.method2694(var17);
            if (var18.field3544 == -1 && var18.field3529 >= 0) {
                field1332[++Statics.field3753 - 1] = var18.field3529;
            } else {
                field1332[++Statics.field3753 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1332[--Statics.field3753];
            class257 var20 = class257.method2694(var19);
            if (var20.field3544 >= 0 && var20.field3529 >= 0) {
                field1332[++Statics.field3753 - 1] = var20.field3529;
            } else {
                field1332[++Statics.field3753 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1334[--Statics.field3666];
            int var22 = field1332[--Statics.field3753];
            client.method3858(var21, var22 == 1);
            field1332[++Statics.field3753 - 1] = Statics.field2341;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field32 == null || Statics.field301 >= Statics.field2341) {
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = Statics.field32[++Statics.field301 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field301 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ef.l(ILct;ZI)I")
    public static int method2691(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1332[++Statics.field3753 - 1] = client.method2513();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1332[--Statics.field3753];
            if (var3 == 1 || var3 == 2) {
                client.field1142 = 0L;
                if (var3 >= 2) {
                    client.field1129 = true;
                } else {
                    client.field1129 = false;
                }
                if (client.method2513() == 1) {
                    Statics.field243.method750(765, 503);
                } else {
                    Statics.field243.method750(7680, 2160);
                }
                if (client.field1128 >= 25) {
                    client.field968.method3236(170);
                    client.field968.method2955(client.method2513());
                    client.field968.method2956(Statics.field2255);
                    client.field968.method2956(Statics.field722);
                }
            }
            return 1;
        } else if (arg0 == 5308) {
            field1332[++Statics.field3753 - 1] = Statics.field869.field1311;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1332[--Statics.field3753];
            if (var4 == 1 || var4 == 2) {
                Statics.field869.field1311 = var4;
                class80.method204();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.f(ILct;ZB)I")
    public static int method1596(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field978 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.ap(ILct;ZB)I")
    public static int method1605(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field3753 -= 2;
            client.field1167 = (short) field1332[Statics.field3753];
            if (client.field1167 <= 0) {
                client.field1167 = 256;
            }
            client.field1168 = (short) field1332[Statics.field3753 + 1];
            if (client.field1168 <= 0) {
                client.field1168 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field3753 -= 2;
            client.field994 = (short) field1332[Statics.field3753];
            if (client.field994 <= 0) {
                client.field994 = 256;
            }
            client.field1148 = (short) field1332[Statics.field3753 + 1];
            if (client.field1148 <= 0) {
                client.field1148 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field3753 -= 4;
            client.field1004 = (short) field1332[Statics.field3753];
            if (client.field1004 <= 0) {
                client.field1004 = 1;
            }
            client.field1141 = (short) field1332[Statics.field3753 + 1];
            if (client.field1141 <= 0) {
                client.field1141 = 32767;
            } else if (client.field1141 < client.field1004) {
                client.field1141 = client.field1004;
            }
            client.field999 = (short) field1332[Statics.field3753 + 2];
            if (client.field999 <= 0) {
                client.field999 = 1;
            }
            client.field1174 = (short) field1332[Statics.field3753 + 3];
            if (client.field1174 <= 0) {
                client.field1174 = 32767;
            } else if (client.field1174 < client.field999) {
                client.field1174 = client.field999;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1087 == null) {
                field1332[++Statics.field3753 - 1] = -1;
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                client.method7(0, 0, client.field1087.field2658, client.field1087.field2659, false);
                field1332[++Statics.field3753 - 1] = client.field1177;
                field1332[++Statics.field3753 - 1] = client.field1173;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1332[++Statics.field3753 - 1] = client.field994;
            field1332[++Statics.field3753 - 1] = client.field1148;
            return 1;
        } else if (arg0 == 6205) {
            field1332[++Statics.field3753 - 1] = client.field1167;
            field1332[++Statics.field3753 - 1] = client.field1168;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.af(ILct;ZB)I")
    public static int method38(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field609;
            int var4 = (Statics.field832.field1225 >> 7) + Statics.field352;
            int var5 = (Statics.field832.field1211 >> 7) + Statics.field3706;
            client.method1015().method5014(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1332[--Statics.field3753];
            String var7 = "";
            class33 var8 = client.method1015().method4967(var6);
            if (var8 != null) {
                var7 = var8.method276();
            }
            field1334[++Statics.field3666 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1332[--Statics.field3753];
            client.method1015().method4952(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1332[++Statics.field3753 - 1] = client.method1015().method4946();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1332[--Statics.field3753];
            client.method1015().method4961(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1332[++Statics.field3753 - 1] = client.method1015().method5086() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class213 var11 = new class213(field1332[--Statics.field3753]);
            client.method1015().method4968(var11.field2602, var11.field2603);
            return 1;
        } else if (arg0 == 6607) {
            class213 var12 = new class213(field1332[--Statics.field3753]);
            client.method1015().method4969(var12.field2602, var12.field2603);
            return 1;
        } else if (arg0 == 6608) {
            class213 var13 = new class213(field1332[--Statics.field3753]);
            client.method1015().method5118(var13.field2601, var13.field2602, var13.field2603);
            return 1;
        } else if (arg0 == 6609) {
            class213 var14 = new class213(field1332[--Statics.field3753]);
            client.method1015().method4971(var14.field2601, var14.field2602, var14.field2603);
            return 1;
        } else if (arg0 == 6610) {
            field1332[++Statics.field3753 - 1] = client.method1015().method4972();
            field1332[++Statics.field3753 - 1] = client.method1015().method4973();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1332[--Statics.field3753];
            class33 var16 = client.method1015().method4967(var15);
            if (var16 == null) {
                field1332[++Statics.field3753 - 1] = 0;
            } else {
                field1332[++Statics.field3753 - 1] = var16.method265().method3720();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1332[--Statics.field3753];
            class33 var18 = client.method1015().method4967(var17);
            if (var18 == null) {
                field1332[++Statics.field3753 - 1] = 0;
                field1332[++Statics.field3753 - 1] = 0;
            } else {
                field1332[++Statics.field3753 - 1] = (var18.method259() - var18.method258() + 1) * 64;
                field1332[++Statics.field3753 - 1] = (var18.method261() - var18.method260() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1332[--Statics.field3753];
            class33 var20 = client.method1015().method4967(var19);
            if (var20 == null) {
                field1332[++Statics.field3753 - 1] = 0;
                field1332[++Statics.field3753 - 1] = 0;
                field1332[++Statics.field3753 - 1] = 0;
                field1332[++Statics.field3753 - 1] = 0;
            } else {
                field1332[++Statics.field3753 - 1] = var20.method258() * 64;
                field1332[++Statics.field3753 - 1] = var20.method260() * 64;
                field1332[++Statics.field3753 - 1] = var20.method259() * 64 + 64 - 1;
                field1332[++Statics.field3753 - 1] = var20.method261() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1332[--Statics.field3753];
            class33 var22 = client.method1015().method4967(var21);
            if (var22 == null) {
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var22.method270();
            }
            return 1;
        } else if (arg0 == 6615) {
            class213 var23 = client.method1015().method4941();
            if (var23 == null) {
                field1332[++Statics.field3753 - 1] = -1;
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var23.field2602;
                field1332[++Statics.field3753 - 1] = var23.field2603;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1332[++Statics.field3753 - 1] = client.method1015().method4953();
            return 1;
        } else if (arg0 == 6617) {
            class213 var24 = new class213(field1332[--Statics.field3753]);
            class33 var25 = client.method1015().method4954();
            if (var25 == null) {
                field1332[++Statics.field3753 - 1] = -1;
                field1332[++Statics.field3753 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method291(var24.field2601, var24.field2602, var24.field2603);
            if (var26 == null) {
                field1332[++Statics.field3753 - 1] = -1;
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var26[0];
                field1332[++Statics.field3753 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class213 var27 = new class213(field1332[--Statics.field3753]);
            class33 var28 = client.method1015().method4954();
            if (var28 == null) {
                field1332[++Statics.field3753 - 1] = -1;
                field1332[++Statics.field3753 - 1] = -1;
                return 1;
            }
            class213 var29 = var28.method250(var27.field2602, var27.field2603);
            if (var29 == null) {
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var29.method3720();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field3753 -= 2;
            int var30 = field1332[Statics.field3753];
            class213 var31 = new class213(field1332[Statics.field3753 + 1]);
            method1412(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field3753 -= 2;
            int var32 = field1332[Statics.field3753];
            class213 var33 = new class213(field1332[Statics.field3753 + 1]);
            method1412(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field3753 -= 2;
            int var34 = field1332[Statics.field3753];
            class213 var35 = new class213(field1332[Statics.field3753 + 1]);
            class33 var36 = client.method1015().method4967(var34);
            if (var36 == null) {
                field1332[++Statics.field3753 - 1] = 0;
                return 1;
            } else {
                field1332[++Statics.field3753 - 1] = var36.method247(var35.field2601, var35.field2602, var35.field2603) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1332[++Statics.field3753 - 1] = client.method1015().method5006();
            field1332[++Statics.field3753 - 1] = client.method1015().method5059();
            return 1;
        } else if (arg0 == 6623) {
            class213 var37 = new class213(field1332[--Statics.field3753]);
            class33 var38 = client.method1015().method5130(var37.field2601, var37.field2602, var37.field2603);
            if (var38 == null) {
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var38.method252();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1015().method4977(field1332[--Statics.field3753]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1015().method4978();
            return 1;
        } else if (arg0 == 6626) {
            client.method1015().method4979(field1332[--Statics.field3753]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1015().method4980();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1332[--Statics.field3753] == 1;
            client.method1015().method4981(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1332[--Statics.field3753];
            client.method1015().method5017(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1332[--Statics.field3753];
            client.method1015().method4983(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1015().method5053();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1332[--Statics.field3753] == 1;
            client.method1015().method5008(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field3753 -= 2;
            int var43 = field1332[Statics.field3753];
            boolean var44 = field1332[Statics.field3753 + 1] == 1;
            client.method1015().method4986(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field3753 -= 2;
            int var45 = field1332[Statics.field3753];
            boolean var46 = field1332[Statics.field3753 + 1] == 1;
            client.method1015().method5099(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1332[++Statics.field3753 - 1] = client.method1015().method4988() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = client.method1015().method4989(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1332[--Statics.field3753];
            field1332[++Statics.field3753 - 1] = client.method1015().method4990(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field3753 -= 2;
            int var49 = field1332[Statics.field3753];
            class213 var50 = new class213(field1332[Statics.field3753 + 1]);
            class213 var51 = client.method1015().method4985(var49, var50);
            if (var51 == null) {
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var51.method3720();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var52 = client.method1015().method4944();
            if (var52 == null) {
                field1332[++Statics.field3753 - 1] = -1;
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var52.field557;
                field1332[++Statics.field3753 - 1] = var52.field549.method3720();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var53 = client.method1015().method4996();
            if (var53 == null) {
                field1332[++Statics.field3753 - 1] = -1;
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var53.field557;
                field1332[++Statics.field3753 - 1] = var53.field549.method3720();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1332[--Statics.field3753];
            class243 var55 = Statics.field3286[var54];
            if (var55.field3291 == null) {
                field1334[++Statics.field3666 - 1] = "";
            } else {
                field1334[++Statics.field3666 - 1] = var55.field3291;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1332[--Statics.field3753];
            class243 var57 = Statics.field3286[var56];
            field1332[++Statics.field3753 - 1] = var57.field3285;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1332[--Statics.field3753];
            class243 var59 = Statics.field3286[var58];
            if (var59 == null) {
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var59.field3305;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1332[--Statics.field3753];
            class243 var61 = Statics.field3286[var60];
            if (var61 == null) {
                field1332[++Statics.field3753 - 1] = -1;
            } else {
                field1332[++Statics.field3753 - 1] = var61.field3289;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1332[++Statics.field3753 - 1] = Statics.field3195.field616;
            return 1;
        } else if (arg0 == 6698) {
            field1332[++Statics.field3753 - 1] = Statics.field3195.field617.method3720();
            return 1;
        } else if (arg0 == 6699) {
            field1332[++Statics.field3753 - 1] = Statics.field3195.field618.method3720();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ho.aa(IB)V")
    public static void method3691(int arg0) {
        if (arg0 == -1 || !class217.method263(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2629[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2724 != null) {
                class69 var4 = new class69();
                var4.field851 = var3;
                var4.field850 = var3.field2724;
                method1427(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("be.ay(ILhg;ZI)V")
    public static void method1412(int arg0, class213 arg1, boolean arg2) {
        class33 var3 = client.method1015().method4967(arg0);
        int var4 = Statics.field832.field909;
        int var5 = (Statics.field832.field1225 >> 7) + Statics.field352;
        int var6 = (Statics.field832.field1211 >> 7) + Statics.field3706;
        class213 var7 = new class213(var4, var5, var6);
        client.method1015().method4957(var3, var7, arg1, arg2);
    }
}
