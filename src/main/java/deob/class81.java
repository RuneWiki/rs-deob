package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("co")
public class class81 {

    @ObfuscatedName("co.i")
    public static int[] field1242 = new int[5];

    @ObfuscatedName("co.w")
    public static int[][] field1253 = new int[5][5000];

    @ObfuscatedName("co.t")
    public static int[] field1244 = new int[1000];

    @ObfuscatedName("co.z")
    public static String[] field1246 = new String[1000];

    @ObfuscatedName("co.c")
    public static int field1247 = 0;

    @ObfuscatedName("co.o")
    public static class62[] field1248 = new class62[50];

    @ObfuscatedName("co.q")
    public static Calendar field1249 = Calendar.getInstance();

    @ObfuscatedName("co.r")
    public static final String[] field1239 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("co.u")
    public static int field1251 = 0;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.s(Lbc;B)V")
    public static void method1742(class68 arg0) {
        method893(arg0, 200000);
    }

    @ObfuscatedName("bn.g(Lbc;II)V")
    public static void method893(class68 arg0, int arg1) {
        Object[] var2 = arg0.field787;
        class96 var13;
        if (class231.method3046(arg0.field783)) {
            Statics.field317 = (class48) var2[0];
            class254 var3 = Statics.field3378[Statics.field317.field573];
            class231 var4 = arg0.field783;
            int var5 = var3.field3380;
            int var6 = var3.field3397;
            int var7 = class235.method3064(var5, var4);
            class96 var8 = class96.method457(var7, var4);
            class96 var9;
            if (var8 == null) {
                int var10 = (var6 + 40000 << 8) + var4.field2900;
                class96 var12 = class96.method457(var10, var4);
                if (var12 == null) {
                    var9 = null;
                } else {
                    var9 = var12;
                }
            } else {
                var9 = var8;
            }
            var13 = var9;
        } else {
            int var14 = (Integer) var2[0];
            class96 var15 = (class96) class96.field1425.method3673((long) var14);
            class96 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field335.method4231(var14, 0);
                if (var17 == null) {
                    var16 = null;
                } else {
                    class96 var18 = class96.method1729(var17);
                    class96.field1425.method3675(var18, (long) var14);
                    var16 = var18;
                }
            } else {
                var16 = var15;
            }
            var13 = var16;
        }
        if (var13 == null) {
            return;
        }
        Statics.field1238 = 0;
        Statics.field3803 = 0;
        int var19 = -1;
        int[] var20 = var13.field1430;
        int[] var21 = var13.field1423;
        byte var22 = -1;
        field1247 = 0;
        try {
            Statics.field1240 = new int[var13.field1422];
            int var23 = 0;
            Statics.field1241 = new String[var13.field1426];
            int var24 = 0;
            for (int var25 = 1; var25 < var2.length; var25++) {
                if (var2[var25] instanceof Integer) {
                    int var26 = (Integer) var2[var25];
                    if (var26 == -2147483647) {
                        var26 = arg0.field775;
                    }
                    if (var26 == -2147483646) {
                        var26 = arg0.field776;
                    }
                    if (var26 == -2147483645) {
                        var26 = arg0.field774 == null ? -1 : arg0.field774.field2755;
                    }
                    if (var26 == -2147483644) {
                        var26 = arg0.field782;
                    }
                    if (var26 == -2147483643) {
                        var26 = arg0.field774 == null ? -1 : arg0.field774.field2756;
                    }
                    if (var26 == -2147483642) {
                        var26 = arg0.field778 == null ? -1 : arg0.field778.field2755;
                    }
                    if (var26 == -2147483641) {
                        var26 = arg0.field778 == null ? -1 : arg0.field778.field2756;
                    }
                    if (var26 == -2147483640) {
                        var26 = arg0.field785;
                    }
                    if (var26 == -2147483639) {
                        var26 = arg0.field780;
                    }
                    Statics.field1240[var23++] = var26;
                } else if (var2[var25] instanceof String) {
                    String var27 = (String) var2[var25];
                    if (var27.equals("event_opbase")) {
                        var27 = arg0.field779;
                    }
                    Statics.field1241[var24++] = var27;
                }
            }
            int var28 = 0;
            field1251 = arg0.field772;
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
                                                                                                                label1557: while (true) {
                                                                                                                    var28++;
                                                                                                                    if (var28 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var19++;
                                                                                                                    int var391 = var20[var19];
                                                                                                                    if (var391 >= 100) {
                                                                                                                        boolean var59;
                                                                                                                        if (var13.field1423[var19] == 1) {
                                                                                                                            var59 = true;
                                                                                                                        } else {
                                                                                                                            var59 = false;
                                                                                                                        }
                                                                                                                        int var75;
                                                                                                                        if (var391 < 1000) {
                                                                                                                            byte var67;
                                                                                                                            if (var391 == 100) {
                                                                                                                                Statics.field1238 -= 3;
                                                                                                                                int var60 = field1244[Statics.field1238];
                                                                                                                                int var61 = field1244[Statics.field1238 + 1];
                                                                                                                                int var62 = field1244[Statics.field1238 + 2];
                                                                                                                                if (var61 == 0) {
                                                                                                                                    throw new RuntimeException();
                                                                                                                                }
                                                                                                                                class228 var63 = class228.method3956(var60);
                                                                                                                                if (var63.field2879 == null) {
                                                                                                                                    var63.field2879 = new class228[var62 + 1];
                                                                                                                                }
                                                                                                                                if (var63.field2879.length <= var62) {
                                                                                                                                    class228[] var64 = new class228[var62 + 1];
                                                                                                                                    for (int var65 = 0; var65 < var63.field2879.length; var65++) {
                                                                                                                                        var64[var65] = var63.field2879[var65];
                                                                                                                                    }
                                                                                                                                    var63.field2879 = var64;
                                                                                                                                }
                                                                                                                                if (var62 > 0 && var63.field2879[var62 - 1] == null) {
                                                                                                                                    throw new RuntimeException("" + (var62 - 1));
                                                                                                                                }
                                                                                                                                class228 var66 = new class228();
                                                                                                                                var66.field2864 = var61;
                                                                                                                                var66.field2774 = var66.field2755 = var63.field2755;
                                                                                                                                var66.field2756 = var62;
                                                                                                                                var66.field2754 = true;
                                                                                                                                var63.field2879[var62] = var66;
                                                                                                                                if (var59) {
                                                                                                                                    Statics.field1419 = var66;
                                                                                                                                } else {
                                                                                                                                    Statics.field1669 = var66;
                                                                                                                                }
                                                                                                                                client.method313(var63);
                                                                                                                                var67 = 1;
                                                                                                                            } else if (var391 == 101) {
                                                                                                                                class228 var68 = var59 ? Statics.field1419 : Statics.field1669;
                                                                                                                                class228 var69 = class228.method3956(var68.field2755);
                                                                                                                                var69.field2879[var68.field2756] = null;
                                                                                                                                client.method313(var69);
                                                                                                                                var67 = 1;
                                                                                                                            } else if (var391 == 102) {
                                                                                                                                class228 var70 = class228.method3956(field1244[--Statics.field1238]);
                                                                                                                                var70.field2879 = null;
                                                                                                                                client.method313(var70);
                                                                                                                                var67 = 1;
                                                                                                                            } else if (var391 == 200) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var71 = field1244[Statics.field1238];
                                                                                                                                int var72 = field1244[Statics.field1238 + 1];
                                                                                                                                class228 var73 = class228.method539(var71, var72);
                                                                                                                                if (var73 == null || var72 == -1) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 1;
                                                                                                                                    if (var59) {
                                                                                                                                        Statics.field1419 = var73;
                                                                                                                                    } else {
                                                                                                                                        Statics.field1669 = var73;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var67 = 1;
                                                                                                                            } else if (var391 == 201) {
                                                                                                                                class228 var74 = class228.method3956(field1244[--Statics.field1238]);
                                                                                                                                if (var74 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 1;
                                                                                                                                    if (var59) {
                                                                                                                                        Statics.field1419 = var74;
                                                                                                                                    } else {
                                                                                                                                        Statics.field1669 = var74;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var67 = 1;
                                                                                                                            } else {
                                                                                                                                var67 = 2;
                                                                                                                            }
                                                                                                                            var75 = var67;
                                                                                                                        } else if (var391 < 1100) {
                                                                                                                            var75 = method1496(var391, var13, var59);
                                                                                                                        } else if (var391 < 1200) {
                                                                                                                            var75 = method1748(var391, var13, var59);
                                                                                                                        } else if (var391 < 1300) {
                                                                                                                            var75 = method1503(var391, var13, var59);
                                                                                                                        } else if (var391 < 1400) {
                                                                                                                            var75 = method4488(var391, var13, var59);
                                                                                                                        } else if (var391 < 1500) {
                                                                                                                            var75 = method1759(var391, var13, var59);
                                                                                                                        } else if (var391 < 1600) {
                                                                                                                            var75 = method4024(var391, var13, var59);
                                                                                                                        } else if (var391 < 1700) {
                                                                                                                            var75 = method311(var391, var13, var59);
                                                                                                                        } else if (var391 < 1800) {
                                                                                                                            var75 = method154(var391, var13, var59);
                                                                                                                        } else if (var391 < 1900) {
                                                                                                                            var75 = method1863(var391, var13, var59);
                                                                                                                        } else if (var391 < 2000) {
                                                                                                                            var75 = method982(var391, var13, var59);
                                                                                                                        } else if (var391 < 2100) {
                                                                                                                            var75 = method1496(var391, var13, var59);
                                                                                                                        } else if (var391 < 2200) {
                                                                                                                            var75 = method1748(var391, var13, var59);
                                                                                                                        } else if (var391 < 2300) {
                                                                                                                            var75 = method1503(var391, var13, var59);
                                                                                                                        } else if (var391 < 2400) {
                                                                                                                            var75 = method4488(var391, var13, var59);
                                                                                                                        } else if (var391 < 2500) {
                                                                                                                            var75 = method1759(var391, var13, var59);
                                                                                                                        } else if (var391 < 2600) {
                                                                                                                            var75 = method4532(var391, var13, var59);
                                                                                                                        } else if (var391 < 2700) {
                                                                                                                            class228 var76 = class228.method3956(field1244[--Statics.field1238]);
                                                                                                                            byte var77;
                                                                                                                            if (var391 == 2600) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2776;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2601) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2777;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2602) {
                                                                                                                                field1246[++Statics.field3803 - 1] = var76.field2815;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2603) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2800;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2604) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2785;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2605) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2809;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2606) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2873;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2607) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2808;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2608) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2807;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2609) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2786;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2610) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2787;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2611) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2780;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2612) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2781;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var391 == 2613) {
                                                                                                                                field1244[++Statics.field1238 - 1] = var76.field2833.method10();
                                                                                                                                var77 = 1;
                                                                                                                            } else {
                                                                                                                                var77 = 2;
                                                                                                                            }
                                                                                                                            var75 = var77;
                                                                                                                        } else if (var391 < 2800) {
                                                                                                                            byte var79;
                                                                                                                            if (var391 == 2700) {
                                                                                                                                class228 var78 = class228.method3956(field1244[--Statics.field1238]);
                                                                                                                                field1244[++Statics.field1238 - 1] = var78.field2875;
                                                                                                                                var79 = 1;
                                                                                                                            } else if (var391 == 2701) {
                                                                                                                                class228 var80 = class228.method3956(field1244[--Statics.field1238]);
                                                                                                                                if (var80.field2875 == -1) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var80.field2812;
                                                                                                                                }
                                                                                                                                var79 = 1;
                                                                                                                            } else if (var391 == 2702) {
                                                                                                                                int var81 = field1244[--Statics.field1238];
                                                                                                                                class67 var82 = (class67) client.field1052.method3704((long) var81);
                                                                                                                                if (var82 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 1;
                                                                                                                                }
                                                                                                                                var79 = 1;
                                                                                                                            } else if (var391 == 2706) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field859;
                                                                                                                                var79 = 1;
                                                                                                                            } else {
                                                                                                                                var79 = 2;
                                                                                                                            }
                                                                                                                            var75 = var79;
                                                                                                                        } else if (var391 < 2900) {
                                                                                                                            var75 = method1825(var391, var13, var59);
                                                                                                                        } else if (var391 < 3000) {
                                                                                                                            var75 = method982(var391, var13, var59);
                                                                                                                        } else if (var391 < 3200) {
                                                                                                                            byte var84;
                                                                                                                            if (var391 == 3100) {
                                                                                                                                String var83 = field1246[--Statics.field3803];
                                                                                                                                class95.method649(0, "", var83);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3101) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                Statics.method4178(Statics.field1754, field1244[Statics.field1238], field1244[Statics.field1238 + 1]);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3103) {
                                                                                                                                class175 var85 = class175.method1891(class172.field2412, client.field938.field1455);
                                                                                                                                client.field938.method1907(var85);
                                                                                                                                class67 var86 = (class67) client.field1052.method3693();
                                                                                                                                while (true) {
                                                                                                                                    if (var86 == null) {
                                                                                                                                        if (client.field886 != null) {
                                                                                                                                            client.method313(client.field886);
                                                                                                                                            client.field886 = null;
                                                                                                                                        }
                                                                                                                                        var84 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var86.field768 == 0 || var86.field768 == 3) {
                                                                                                                                        client.method2911(var86, true);
                                                                                                                                    }
                                                                                                                                    var86 = (class67) client.field1052.method3694();
                                                                                                                                }
                                                                                                                            } else if (var391 == 3104) {
                                                                                                                                String var87 = field1246[--Statics.field3803];
                                                                                                                                int var88 = 0;
                                                                                                                                boolean var89 = false;
                                                                                                                                boolean var90 = false;
                                                                                                                                int var91 = 0;
                                                                                                                                int var92 = var87.length();
                                                                                                                                int var93 = 0;
                                                                                                                                boolean var95;
                                                                                                                                while (true) {
                                                                                                                                    if (var93 >= var92) {
                                                                                                                                        var95 = var90;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    label1893: {
                                                                                                                                        char var94 = var87.charAt(var93);
                                                                                                                                        if (var93 == 0) {
                                                                                                                                            if (var94 == '-') {
                                                                                                                                                var89 = true;
                                                                                                                                                break label1893;
                                                                                                                                            }
                                                                                                                                            if (var94 == '+') {
                                                                                                                                                break label1893;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int var392;
                                                                                                                                        if (var94 >= '0' && var94 <= '9') {
                                                                                                                                            var392 = var94 - '0';
                                                                                                                                        } else if (var94 >= 'A' && var94 <= 'Z') {
                                                                                                                                            var392 = var94 - '7';
                                                                                                                                        } else {
                                                                                                                                            if (var94 < 'a' || var94 > 'z') {
                                                                                                                                                var95 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            var392 = var94 - 'W';
                                                                                                                                        }
                                                                                                                                        if (var392 >= 10) {
                                                                                                                                            var95 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        if (var89) {
                                                                                                                                            var392 = -var392;
                                                                                                                                        }
                                                                                                                                        int var96 = var91 * 10 + var392;
                                                                                                                                        if (var96 / 10 != var91) {
                                                                                                                                            var95 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        var91 = var96;
                                                                                                                                        var90 = true;
                                                                                                                                    }
                                                                                                                                    var93++;
                                                                                                                                }
                                                                                                                                if (var95) {
                                                                                                                                    int var98 = class294.method1818(var87, 10, true);
                                                                                                                                    var88 = var98;
                                                                                                                                }
                                                                                                                                class175 var99 = class175.method1891(class172.field2343, client.field938.field1455);
                                                                                                                                var99.field2440.method3242(var88);
                                                                                                                                client.field938.method1907(var99);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3105) {
                                                                                                                                String var100 = field1246[--Statics.field3803];
                                                                                                                                class175 var101 = class175.method1891(class172.field2389, client.field938.field1455);
                                                                                                                                var101.field2440.method3223(var100.length() + 1);
                                                                                                                                var101.field2440.method3230(var100);
                                                                                                                                client.field938.method1907(var101);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3106) {
                                                                                                                                String var102 = field1246[--Statics.field3803];
                                                                                                                                class175 var103 = class175.method1891(class172.field2397, client.field938.field1455);
                                                                                                                                var103.field2440.method3223(var102.length() + 1);
                                                                                                                                var103.field2440.method3230(var102);
                                                                                                                                client.field938.method1907(var103);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3107) {
                                                                                                                                int var104 = field1244[--Statics.field1238];
                                                                                                                                String var105 = field1246[--Statics.field3803];
                                                                                                                                client.method21(var104, var105);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3108) {
                                                                                                                                Statics.field1238 -= 3;
                                                                                                                                int var106 = field1244[Statics.field1238];
                                                                                                                                int var107 = field1244[Statics.field1238 + 1];
                                                                                                                                int var108 = field1244[Statics.field1238 + 2];
                                                                                                                                class228 var109 = class228.method3956(var108);
                                                                                                                                client.method2961(var109, var106, var107);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3109) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var110 = field1244[Statics.field1238];
                                                                                                                                int var111 = field1244[Statics.field1238 + 1];
                                                                                                                                class228 var112 = var59 ? Statics.field1419 : Statics.field1669;
                                                                                                                                client.method2961(var112, var110, var111);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3110) {
                                                                                                                                Statics.field407 = field1244[--Statics.field1238] == 1;
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3111) {
                                                                                                                                field1244[++Statics.field1238 - 1] = Statics.field263.field1203 ? 1 : 0;
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3112) {
                                                                                                                                Statics.field263.field1203 = field1244[--Statics.field1238] == 1;
                                                                                                                                class78.method1502();
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3113) {
                                                                                                                                String var113 = field1246[--Statics.field3803];
                                                                                                                                boolean var114 = field1244[--Statics.field1238] == 1;
                                                                                                                                class57.method4161(var113, var114, false);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3115) {
                                                                                                                                int var115 = field1244[--Statics.field1238];
                                                                                                                                class175 var116 = class175.method1891(class172.field2357, client.field938.field1455);
                                                                                                                                var116.field2440.method3403(var115);
                                                                                                                                client.field938.method1907(var116);
                                                                                                                                var84 = 1;
                                                                                                                            } else if (var391 == 3116) {
                                                                                                                                int var117 = field1244[--Statics.field1238];
                                                                                                                                Statics.field3803 -= 2;
                                                                                                                                String var118 = field1246[Statics.field3803];
                                                                                                                                String var119 = field1246[Statics.field3803 + 1];
                                                                                                                                if (var118.length() > 500) {
                                                                                                                                    var84 = 1;
                                                                                                                                } else if (var119.length() > 500) {
                                                                                                                                    var84 = 1;
                                                                                                                                } else {
                                                                                                                                    class175 var120 = class175.method1891(class172.field2391, client.field938.field1455);
                                                                                                                                    var120.field2440.method3403(1 + class185.method2709(var118) + class185.method2709(var119));
                                                                                                                                    var120.field2440.method3223(var117);
                                                                                                                                    var120.field2440.method3230(var119);
                                                                                                                                    var120.field2440.method3230(var118);
                                                                                                                                    client.field938.method1907(var120);
                                                                                                                                    var84 = 1;
                                                                                                                                }
                                                                                                                            } else if (var391 == 3117) {
                                                                                                                                client.field973 = field1244[--Statics.field1238] == 1;
                                                                                                                                var84 = 1;
                                                                                                                            } else {
                                                                                                                                var84 = 2;
                                                                                                                            }
                                                                                                                            var75 = var84;
                                                                                                                        } else if (var391 < 3300) {
                                                                                                                            var75 = method4417(var391, var13, var59);
                                                                                                                        } else if (var391 < 3400) {
                                                                                                                            byte var121;
                                                                                                                            if (var391 == 3300) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field1036;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3301) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var122 = field1244[Statics.field1238];
                                                                                                                                int var123 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = class65.method4098(var122, var123);
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3302) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var124 = field1244[Statics.field1238];
                                                                                                                                int var125 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = class65.method5(var124, var125);
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3303) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var126 = field1244[Statics.field1238];
                                                                                                                                int var127 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = class65.method693(var126, var127);
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3304) {
                                                                                                                                int var128 = field1244[--Statics.field1238];
                                                                                                                                int[] var129 = field1244;
                                                                                                                                int var130 = ++Statics.field1238 - 1;
                                                                                                                                class252 var131 = (class252) class252.field3365.method3673((long) var128);
                                                                                                                                class252 var132;
                                                                                                                                if (var131 == null) {
                                                                                                                                    byte[] var133 = Statics.field3367.method4231(5, var128);
                                                                                                                                    class252 var134 = new class252();
                                                                                                                                    if (var133 != null) {
                                                                                                                                        var134.method4330(new class185(var133));
                                                                                                                                    }
                                                                                                                                    class252.field3365.method3675(var134, (long) var128);
                                                                                                                                    var132 = var134;
                                                                                                                                } else {
                                                                                                                                    var132 = var131;
                                                                                                                                }
                                                                                                                                var129[var130] = var132.field3366;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3305) {
                                                                                                                                int var135 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field959[var135];
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3306) {
                                                                                                                                int var136 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field960[var136];
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3307) {
                                                                                                                                int var137 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field961[var137];
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3308) {
                                                                                                                                int var138 = Statics.field706;
                                                                                                                                int var139 = (Statics.field1754.field1129 >> 7) + Statics.field3737;
                                                                                                                                int var140 = (Statics.field1754.field1116 >> 7) + Statics.field435;
                                                                                                                                field1244[++Statics.field1238 - 1] = (var138 << 28) + (var139 << 14) + var140;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3309) {
                                                                                                                                int var141 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = var141 >> 14 & 0x3FFF;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3310) {
                                                                                                                                int var142 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = var142 >> 28;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3311) {
                                                                                                                                int var143 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = var143 & 0x3FFF;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3312) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field958 ? 1 : 0;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3313) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var144 = field1244[Statics.field1238] + 32768;
                                                                                                                                int var145 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = class65.method4098(var144, var145);
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3314) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var146 = field1244[Statics.field1238] + 32768;
                                                                                                                                int var147 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = class65.method5(var146, var147);
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3315) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var148 = field1244[Statics.field1238] + 32768;
                                                                                                                                int var149 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = class65.method693(var148, var149);
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3316) {
                                                                                                                                if (client.field1084 >= 2) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = client.field1084;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                }
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3317) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field995;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3318) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field841;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3321) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field919;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3322) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field935;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3323) {
                                                                                                                                if (client.field858) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                }
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3324) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.field842;
                                                                                                                                var121 = 1;
                                                                                                                            } else if (var391 == 3325) {
                                                                                                                                Statics.field1238 -= 4;
                                                                                                                                int var150 = field1244[Statics.field1238];
                                                                                                                                int var151 = field1244[Statics.field1238 + 1];
                                                                                                                                int var152 = field1244[Statics.field1238 + 2];
                                                                                                                                int var153 = field1244[Statics.field1238 + 3];
                                                                                                                                int var154 = (var151 << 14) + var150;
                                                                                                                                int var155 = (var152 << 28) + var154;
                                                                                                                                int var156 = var153 + var155;
                                                                                                                                field1244[++Statics.field1238 - 1] = var156;
                                                                                                                                var121 = 1;
                                                                                                                            } else {
                                                                                                                                var121 = 2;
                                                                                                                            }
                                                                                                                            var75 = var121;
                                                                                                                        } else if (var391 < 3500) {
                                                                                                                            var75 = method3048(var391, var13, var59);
                                                                                                                        } else if (var391 < 3700) {
                                                                                                                            var75 = method1643(var391, var13, var59);
                                                                                                                        } else if (var391 < 4000) {
                                                                                                                            var75 = Statics.method454(var391, var13, var59);
                                                                                                                        } else if (var391 < 4100) {
                                                                                                                            byte var159;
                                                                                                                            if (var391 == 4000) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var157 = field1244[Statics.field1238];
                                                                                                                                int var158 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var157 + var158;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4001) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var160 = field1244[Statics.field1238];
                                                                                                                                int var161 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var160 - var161;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4002) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var162 = field1244[Statics.field1238];
                                                                                                                                int var163 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var162 * var163;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4003) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var164 = field1244[Statics.field1238];
                                                                                                                                int var165 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var164 / var165;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4004) {
                                                                                                                                int var166 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = (int) (Math.random() * (double) var166);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4005) {
                                                                                                                                int var167 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = (int) (Math.random() * (double) (var167 + 1));
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4006) {
                                                                                                                                Statics.field1238 -= 5;
                                                                                                                                int var168 = field1244[Statics.field1238];
                                                                                                                                int var169 = field1244[Statics.field1238 + 1];
                                                                                                                                int var170 = field1244[Statics.field1238 + 2];
                                                                                                                                int var171 = field1244[Statics.field1238 + 3];
                                                                                                                                int var172 = field1244[Statics.field1238 + 4];
                                                                                                                                field1244[++Statics.field1238 - 1] = (var169 - var168) * (var172 - var170) / (var171 - var170) + var168;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4007) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var173 = field1244[Statics.field1238];
                                                                                                                                int var174 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var173 * var174 / 100 + var173;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4008) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var175 = field1244[Statics.field1238];
                                                                                                                                int var176 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var175 | 0x1 << var176;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4009) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var177 = field1244[Statics.field1238];
                                                                                                                                int var178 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var177 & -1 - (0x1 << var178);
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4010) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var179 = field1244[Statics.field1238];
                                                                                                                                int var180 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = (var179 & 0x1 << var180) == 0 ? 0 : 1;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4011) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var181 = field1244[Statics.field1238];
                                                                                                                                int var182 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var181 % var182;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4012) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var183 = field1244[Statics.field1238];
                                                                                                                                int var184 = field1244[Statics.field1238 + 1];
                                                                                                                                if (var183 == 0) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = (int) Math.pow((double) var183, (double) var184);
                                                                                                                                }
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4013) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var185 = field1244[Statics.field1238];
                                                                                                                                int var186 = field1244[Statics.field1238 + 1];
                                                                                                                                if (var185 == 0) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    var159 = 1;
                                                                                                                                } else {
                                                                                                                                    switch(var186) {
                                                                                                                                        case 0:
                                                                                                                                            field1244[++Statics.field1238 - 1] = Integer.MAX_VALUE;
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            field1244[++Statics.field1238 - 1] = var185;
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            field1244[++Statics.field1238 - 1] = (int) Math.sqrt((double) var185);
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            field1244[++Statics.field1238 - 1] = (int) Math.cbrt((double) var185);
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            field1244[++Statics.field1238 - 1] = (int) Math.sqrt(Math.sqrt((double) var185));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            field1244[++Statics.field1238 - 1] = (int) Math.pow((double) var185, 1.0D / (double) var186);
                                                                                                                                    }
                                                                                                                                    var159 = 1;
                                                                                                                                }
                                                                                                                            } else if (var391 == 4014) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var187 = field1244[Statics.field1238];
                                                                                                                                int var188 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var187 & var188;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4015) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var189 = field1244[Statics.field1238];
                                                                                                                                int var190 = field1244[Statics.field1238 + 1];
                                                                                                                                field1244[++Statics.field1238 - 1] = var189 | var190;
                                                                                                                                var159 = 1;
                                                                                                                            } else if (var391 == 4018) {
                                                                                                                                Statics.field1238 -= 3;
                                                                                                                                long var191 = (long) field1244[Statics.field1238];
                                                                                                                                long var193 = (long) field1244[Statics.field1238 + 1];
                                                                                                                                long var195 = (long) field1244[Statics.field1238 + 2];
                                                                                                                                field1244[++Statics.field1238 - 1] = (int) (var191 * var195 / var193);
                                                                                                                                var159 = 1;
                                                                                                                            } else {
                                                                                                                                var159 = 2;
                                                                                                                            }
                                                                                                                            var75 = var159;
                                                                                                                        } else if (var391 < 4200) {
                                                                                                                            byte var199;
                                                                                                                            if (var391 == 4100) {
                                                                                                                                String var197 = field1246[--Statics.field3803];
                                                                                                                                int var198 = field1244[--Statics.field1238];
                                                                                                                                field1246[++Statics.field3803 - 1] = var197 + var198;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4101) {
                                                                                                                                Statics.field3803 -= 2;
                                                                                                                                String var200 = field1246[Statics.field3803];
                                                                                                                                String var201 = field1246[Statics.field3803 + 1];
                                                                                                                                field1246[++Statics.field3803 - 1] = var200 + var201;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4102) {
                                                                                                                                String var202 = field1246[--Statics.field3803];
                                                                                                                                int var203 = field1244[--Statics.field1238];
                                                                                                                                field1246[++Statics.field3803 - 1] = var202 + class294.method2622(var203, true);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4103) {
                                                                                                                                String var204 = field1246[--Statics.field3803];
                                                                                                                                field1246[++Statics.field3803 - 1] = var204.toLowerCase();
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4104) {
                                                                                                                                int var205 = field1244[--Statics.field1238];
                                                                                                                                long var206 = ((long) var205 + 11745L) * 86400000L;
                                                                                                                                field1249.setTime(new Date(var206));
                                                                                                                                int var208 = field1249.get(5);
                                                                                                                                int var209 = field1249.get(2);
                                                                                                                                int var210 = field1249.get(1);
                                                                                                                                field1246[++Statics.field3803 - 1] = var208 + "-" + field1239[var209] + "-" + var210;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4105) {
                                                                                                                                Statics.field3803 -= 2;
                                                                                                                                String var211 = field1246[Statics.field3803];
                                                                                                                                String var212 = field1246[Statics.field3803 + 1];
                                                                                                                                if (Statics.field1754.field820 != null && Statics.field1754.field820.field2730) {
                                                                                                                                    field1246[++Statics.field3803 - 1] = var212;
                                                                                                                                } else {
                                                                                                                                    field1246[++Statics.field3803 - 1] = var211;
                                                                                                                                }
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4106) {
                                                                                                                                int var213 = field1244[--Statics.field1238];
                                                                                                                                field1246[++Statics.field3803 - 1] = Integer.toString(var213);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4107) {
                                                                                                                                Statics.field3803 -= 2;
                                                                                                                                int[] var214 = field1244;
                                                                                                                                int var215 = ++Statics.field1238 - 1;
                                                                                                                                String var216 = field1246[Statics.field3803];
                                                                                                                                String var217 = field1246[Statics.field3803 + 1];
                                                                                                                                int var218 = client.field846;
                                                                                                                                int var219 = var216.length();
                                                                                                                                int var220 = var217.length();
                                                                                                                                int var221 = 0;
                                                                                                                                int var222 = 0;
                                                                                                                                char var223 = 0;
                                                                                                                                char var224 = 0;
                                                                                                                                int var225;
                                                                                                                                label1401: while (true) {
                                                                                                                                    if (var221 - var223 >= var219 && var222 - var224 >= var220) {
                                                                                                                                        int var234 = Math.min(var219, var220);
                                                                                                                                        for (int var235 = 0; var235 < var234; var235++) {
                                                                                                                                            char var238 = var216.charAt(var235);
                                                                                                                                            char var239 = var217.charAt(var235);
                                                                                                                                            if (var238 != var239 && Character.toUpperCase(var238) != Character.toUpperCase(var239)) {
                                                                                                                                                char var240 = Character.toLowerCase(var238);
                                                                                                                                                char var241 = Character.toLowerCase(var239);
                                                                                                                                                if (var240 != var241) {
                                                                                                                                                    var225 = class176.method234(var240, var218) - class176.method234(var241, var218);
                                                                                                                                                    break label1401;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int var242 = var219 - var220;
                                                                                                                                        if (var242 == 0) {
                                                                                                                                            for (int var243 = 0; var243 < var234; var243++) {
                                                                                                                                                char var244 = var216.charAt(var243);
                                                                                                                                                char var245 = var217.charAt(var243);
                                                                                                                                                if (var244 != var245) {
                                                                                                                                                    var225 = class176.method234(var244, var218) - class176.method234(var245, var218);
                                                                                                                                                    break label1401;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var225 = 0;
                                                                                                                                        } else {
                                                                                                                                            var225 = var242;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var221 - var223 >= var219) {
                                                                                                                                        var225 = -1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    if (var222 - var224 >= var220) {
                                                                                                                                        var225 = 1;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    char var226;
                                                                                                                                    if (var223 == 0) {
                                                                                                                                        var226 = var216.charAt(var221++);
                                                                                                                                    } else {
                                                                                                                                        var226 = var223;
                                                                                                                                        boolean var227 = false;
                                                                                                                                    }
                                                                                                                                    char var228;
                                                                                                                                    if (var224 == 0) {
                                                                                                                                        var228 = var217.charAt(var222++);
                                                                                                                                    } else {
                                                                                                                                        var228 = var224;
                                                                                                                                        boolean var229 = false;
                                                                                                                                    }
                                                                                                                                    var223 = Statics.method2932(var226);
                                                                                                                                    var224 = Statics.method2932(var228);
                                                                                                                                    char var230 = class176.method2169(var226, var218);
                                                                                                                                    char var231 = class176.method2169(var228, var218);
                                                                                                                                    if (var230 != var231 && Character.toUpperCase(var230) != Character.toUpperCase(var231)) {
                                                                                                                                        char var232 = Character.toLowerCase(var230);
                                                                                                                                        char var233 = Character.toLowerCase(var231);
                                                                                                                                        if (var232 != var233) {
                                                                                                                                            var225 = class176.method234(var232, var218) - class176.method234(var233, var218);
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var214[var215] = class294.method2930(var225);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4108) {
                                                                                                                                String var246 = field1246[--Statics.field3803];
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var247 = field1244[Statics.field1238];
                                                                                                                                int var248 = field1244[Statics.field1238 + 1];
                                                                                                                                byte[] var249 = Statics.field379.method4231(var248, 0);
                                                                                                                                class287 var250 = new class287(var249);
                                                                                                                                field1244[++Statics.field1238 - 1] = var250.method5001(var246, var247);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4109) {
                                                                                                                                String var251 = field1246[--Statics.field3803];
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var252 = field1244[Statics.field1238];
                                                                                                                                int var253 = field1244[Statics.field1238 + 1];
                                                                                                                                byte[] var254 = Statics.field379.method4231(var253, 0);
                                                                                                                                class287 var255 = new class287(var254);
                                                                                                                                field1244[++Statics.field1238 - 1] = var255.method5072(var251, var252);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4110) {
                                                                                                                                Statics.field3803 -= 2;
                                                                                                                                String var256 = field1246[Statics.field3803];
                                                                                                                                String var257 = field1246[Statics.field3803 + 1];
                                                                                                                                if (field1244[--Statics.field1238] == 1) {
                                                                                                                                    field1246[++Statics.field3803 - 1] = var256;
                                                                                                                                } else {
                                                                                                                                    field1246[++Statics.field3803 - 1] = var257;
                                                                                                                                }
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4111) {
                                                                                                                                String var258 = field1246[--Statics.field3803];
                                                                                                                                field1246[++Statics.field3803 - 1] = class288.method5002(var258);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4112) {
                                                                                                                                String var259 = field1246[--Statics.field3803];
                                                                                                                                int var260 = field1244[--Statics.field1238];
                                                                                                                                field1246[++Statics.field3803 - 1] = var259 + (char) var260;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4113) {
                                                                                                                                int var261 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = class294.method1757((char) var261) ? 1 : 0;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4114) {
                                                                                                                                int var262 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = class294.method3117((char) var262) ? 1 : 0;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4115) {
                                                                                                                                int var263 = field1244[--Statics.field1238];
                                                                                                                                int[] var264 = field1244;
                                                                                                                                int var265 = ++Statics.field1238 - 1;
                                                                                                                                char var266 = (char) var263;
                                                                                                                                boolean var267 = var266 >= 'A' && var266 <= 'Z' || var266 >= 'a' && var266 <= 'z';
                                                                                                                                var264[var265] = var267 ? 1 : 0;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4116) {
                                                                                                                                int var268 = field1244[--Statics.field1238];
                                                                                                                                int[] var269 = field1244;
                                                                                                                                int var270 = ++Statics.field1238 - 1;
                                                                                                                                char var271 = (char) var268;
                                                                                                                                boolean var272 = var271 >= '0' && var271 <= '9';
                                                                                                                                var269[var270] = var272 ? 1 : 0;
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4117) {
                                                                                                                                String var273 = field1246[--Statics.field3803];
                                                                                                                                if (var273 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var273.length();
                                                                                                                                }
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4118) {
                                                                                                                                String var274 = field1246[--Statics.field3803];
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var275 = field1244[Statics.field1238];
                                                                                                                                int var276 = field1244[Statics.field1238 + 1];
                                                                                                                                field1246[++Statics.field3803 - 1] = var274.substring(var275, var276);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4119) {
                                                                                                                                String var277 = field1246[--Statics.field3803];
                                                                                                                                StringBuilder var278 = new StringBuilder(var277.length());
                                                                                                                                boolean var279 = false;
                                                                                                                                for (int var280 = 0; var280 < var277.length(); var280++) {
                                                                                                                                    char var281 = var277.charAt(var280);
                                                                                                                                    if (var281 == '<') {
                                                                                                                                        var279 = true;
                                                                                                                                    } else if (var281 == '>') {
                                                                                                                                        var279 = false;
                                                                                                                                    } else if (!var279) {
                                                                                                                                        var278.append(var281);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1246[++Statics.field3803 - 1] = var278.toString();
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4120) {
                                                                                                                                String var282 = field1246[--Statics.field3803];
                                                                                                                                int var283 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = var282.indexOf(var283);
                                                                                                                                var199 = 1;
                                                                                                                            } else if (var391 == 4121) {
                                                                                                                                Statics.field3803 -= 2;
                                                                                                                                String var284 = field1246[Statics.field3803];
                                                                                                                                String var285 = field1246[Statics.field3803 + 1];
                                                                                                                                int var286 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = var284.indexOf(var285, var286);
                                                                                                                                var199 = 1;
                                                                                                                            } else {
                                                                                                                                var199 = 2;
                                                                                                                            }
                                                                                                                            var75 = var199;
                                                                                                                        } else if (var391 < 4300) {
                                                                                                                            var75 = method4979(var391, var13, var59);
                                                                                                                        } else if (var391 < 5100) {
                                                                                                                            var75 = method1021(var391, var13, var59);
                                                                                                                        } else if (var391 < 5400) {
                                                                                                                            byte var287;
                                                                                                                            if (var391 == 5306) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method39();
                                                                                                                                var287 = 1;
                                                                                                                            } else if (var391 == 5307) {
                                                                                                                                int var288 = field1244[--Statics.field1238];
                                                                                                                                if (var288 == 1 || var288 == 2) {
                                                                                                                                    client.method4980(var288);
                                                                                                                                }
                                                                                                                                var287 = 1;
                                                                                                                            } else if (var391 == 5308) {
                                                                                                                                field1244[++Statics.field1238 - 1] = Statics.field263.field1202;
                                                                                                                                var287 = 1;
                                                                                                                            } else if (var391 == 5309) {
                                                                                                                                int var289 = field1244[--Statics.field1238];
                                                                                                                                if (var289 == 1 || var289 == 2) {
                                                                                                                                    Statics.field263.field1202 = var289;
                                                                                                                                    class78.method1502();
                                                                                                                                }
                                                                                                                                var287 = 1;
                                                                                                                            } else {
                                                                                                                                var287 = 2;
                                                                                                                            }
                                                                                                                            var75 = var287;
                                                                                                                        } else if (var391 < 5600) {
                                                                                                                            var75 = method2927(var391, var13, var59);
                                                                                                                        } else if (var391 < 5700) {
                                                                                                                            var75 = method167(var391, var13, var59);
                                                                                                                        } else if (var391 < 6300) {
                                                                                                                            var75 = method2944(var391, var13, var59);
                                                                                                                        } else if (var391 < 6600) {
                                                                                                                            byte var290;
                                                                                                                            if (var391 == 6500) {
                                                                                                                                field1244[++Statics.field1238 - 1] = class77.method644() ? 1 : 0;
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6501) {
                                                                                                                                class77 var291 = class77.method71();
                                                                                                                                if (var291 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1246[++Statics.field3803 - 1] = "";
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1246[++Statics.field3803 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var291.field1189;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var291.field1190;
                                                                                                                                    field1246[++Statics.field3803 - 1] = var291.field1182;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var291.field1194;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var291.field1191;
                                                                                                                                    field1246[++Statics.field3803 - 1] = var291.field1192;
                                                                                                                                }
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6502) {
                                                                                                                                class77 var292 = class77.method4179();
                                                                                                                                if (var292 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1246[++Statics.field3803 - 1] = "";
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1246[++Statics.field3803 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var292.field1189;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var292.field1190;
                                                                                                                                    field1246[++Statics.field3803 - 1] = var292.field1182;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var292.field1194;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var292.field1191;
                                                                                                                                    field1246[++Statics.field3803 - 1] = var292.field1192;
                                                                                                                                }
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6506) {
                                                                                                                                int var293 = field1244[--Statics.field1238];
                                                                                                                                class77 var294 = null;
                                                                                                                                for (int var295 = 0; var295 < class77.field1185; var295++) {
                                                                                                                                    if (Statics.field423[var295].field1189 == var293) {
                                                                                                                                        var294 = Statics.field423[var295];
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var294 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1246[++Statics.field3803 - 1] = "";
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1246[++Statics.field3803 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var294.field1189;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var294.field1190;
                                                                                                                                    field1246[++Statics.field3803 - 1] = var294.field1182;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var294.field1194;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var294.field1191;
                                                                                                                                    field1246[++Statics.field3803 - 1] = var294.field1192;
                                                                                                                                }
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6507) {
                                                                                                                                Statics.field1238 -= 4;
                                                                                                                                int var296 = field1244[Statics.field1238];
                                                                                                                                boolean var297 = field1244[Statics.field1238 + 1] == 1;
                                                                                                                                int var298 = field1244[Statics.field1238 + 2];
                                                                                                                                boolean var299 = field1244[Statics.field1238 + 3] == 1;
                                                                                                                                if (Statics.field423 != null) {
                                                                                                                                    class77.method3495(0, Statics.field423.length - 1, var296, var297, var298, var299);
                                                                                                                                }
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6511) {
                                                                                                                                int var300 = field1244[--Statics.field1238];
                                                                                                                                if (var300 >= 0 && var300 < class77.field1185) {
                                                                                                                                    class77 var301 = Statics.field423[var300];
                                                                                                                                    field1244[++Statics.field1238 - 1] = var301.field1189;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var301.field1190;
                                                                                                                                    field1246[++Statics.field3803 - 1] = var301.field1182;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var301.field1194;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var301.field1191;
                                                                                                                                    field1246[++Statics.field3803 - 1] = var301.field1192;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1246[++Statics.field3803 - 1] = "";
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1246[++Statics.field3803 - 1] = "";
                                                                                                                                }
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6512) {
                                                                                                                                client.field1014 = field1244[--Statics.field1238] == 1;
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6513) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var302 = field1244[Statics.field1238];
                                                                                                                                int var303 = field1244[Statics.field1238 + 1];
                                                                                                                                class263 var304 = class263.method3491(var303);
                                                                                                                                if (var304.method4504()) {
                                                                                                                                    field1246[++Statics.field3803 - 1] = class270.method4416(var302).method4697(var303, var304.field3470);
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = class270.method4416(var302).method4706(var303, var304.field3466);
                                                                                                                                }
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6514) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var305 = field1244[Statics.field1238];
                                                                                                                                int var306 = field1244[Statics.field1238 + 1];
                                                                                                                                class263 var307 = class263.method3491(var306);
                                                                                                                                if (var307.method4504()) {
                                                                                                                                    field1246[++Statics.field3803 - 1] = class267.method4025(var305).method4598(var306, var307.field3470);
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = class267.method4025(var305).method4597(var306, var307.field3466);
                                                                                                                                }
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6515) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var308 = field1244[Statics.field1238];
                                                                                                                                int var309 = field1244[Statics.field1238 + 1];
                                                                                                                                class263 var310 = class263.method3491(var309);
                                                                                                                                if (var310.method4504()) {
                                                                                                                                    field1246[++Statics.field3803 - 1] = class268.method965(var308).method4651(var309, var310.field3470);
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = class268.method965(var308).method4650(var309, var310.field3466);
                                                                                                                                }
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6516) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var311 = field1244[Statics.field1238];
                                                                                                                                int var312 = field1244[Statics.field1238 + 1];
                                                                                                                                class263 var313 = class263.method3491(var312);
                                                                                                                                if (var313.method4504()) {
                                                                                                                                    String[] var314 = field1246;
                                                                                                                                    int var315 = ++Statics.field3803 - 1;
                                                                                                                                    class264 var316 = (class264) class264.field3474.method3673((long) var311);
                                                                                                                                    class264 var317;
                                                                                                                                    if (var316 == null) {
                                                                                                                                        byte[] var318 = Statics.field3476.method4231(34, var311);
                                                                                                                                        class264 var319 = new class264();
                                                                                                                                        if (var318 != null) {
                                                                                                                                            var319.method4534(new class185(var318));
                                                                                                                                        }
                                                                                                                                        var319.method4517();
                                                                                                                                        class264.field3474.method3675(var319, (long) var311);
                                                                                                                                        var317 = var319;
                                                                                                                                    } else {
                                                                                                                                        var317 = var316;
                                                                                                                                    }
                                                                                                                                    var314[var315] = var317.method4521(var312, var313.field3470);
                                                                                                                                } else {
                                                                                                                                    int[] var320 = field1244;
                                                                                                                                    int var321 = ++Statics.field1238 - 1;
                                                                                                                                    class264 var322 = (class264) class264.field3474.method3673((long) var311);
                                                                                                                                    class264 var323;
                                                                                                                                    if (var322 == null) {
                                                                                                                                        byte[] var324 = Statics.field3476.method4231(34, var311);
                                                                                                                                        class264 var325 = new class264();
                                                                                                                                        if (var324 != null) {
                                                                                                                                            var325.method4534(new class185(var324));
                                                                                                                                        }
                                                                                                                                        var325.method4517();
                                                                                                                                        class264.field3474.method3675(var325, (long) var311);
                                                                                                                                        var323 = var325;
                                                                                                                                    } else {
                                                                                                                                        var323 = var322;
                                                                                                                                    }
                                                                                                                                    var320[var321] = var323.method4520(var312, var313.field3466);
                                                                                                                                }
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6518) {
                                                                                                                                field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6520) {
                                                                                                                                var290 = 1;
                                                                                                                            } else if (var391 == 6521) {
                                                                                                                                var290 = 1;
                                                                                                                            } else {
                                                                                                                                var290 = 2;
                                                                                                                            }
                                                                                                                            var75 = var290;
                                                                                                                        } else if (var391 < 6700) {
                                                                                                                            byte var329;
                                                                                                                            if (var391 == 6600) {
                                                                                                                                int var326 = Statics.field706;
                                                                                                                                int var327 = (Statics.field1754.field1129 >> 7) + Statics.field3737;
                                                                                                                                int var328 = (Statics.field1754.field1116 >> 7) + Statics.field435;
                                                                                                                                client.method312().method5435(var326, var327, var328, true);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6601) {
                                                                                                                                int var330 = field1244[--Statics.field1238];
                                                                                                                                String var331 = "";
                                                                                                                                class33 var332 = client.method312().method5453(var330);
                                                                                                                                if (var332 != null) {
                                                                                                                                    var331 = var332.method253();
                                                                                                                                }
                                                                                                                                field1246[++Statics.field3803 - 1] = var331;
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6602) {
                                                                                                                                int var333 = field1244[--Statics.field1238];
                                                                                                                                client.method312().method5465(var333);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6603) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5450();
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6604) {
                                                                                                                                int var334 = field1244[--Statics.field1238];
                                                                                                                                client.method312().method5447(var334);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6605) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5452() ? 1 : 0;
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6606) {
                                                                                                                                class224 var335 = new class224(field1244[--Statics.field1238]);
                                                                                                                                client.method312().method5548(var335.field2718, var335.field2716);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6607) {
                                                                                                                                class224 var336 = new class224(field1244[--Statics.field1238]);
                                                                                                                                client.method312().method5505(var336.field2718, var336.field2716);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6608) {
                                                                                                                                class224 var337 = new class224(field1244[--Statics.field1238]);
                                                                                                                                client.method312().method5456(var337.field2717, var337.field2718, var337.field2716);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6609) {
                                                                                                                                class224 var338 = new class224(field1244[--Statics.field1238]);
                                                                                                                                client.method312().method5457(var338.field2717, var338.field2718, var338.field2716);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6610) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5458();
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5488();
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6611) {
                                                                                                                                int var339 = field1244[--Statics.field1238];
                                                                                                                                class33 var340 = client.method312().method5453(var339);
                                                                                                                                if (var340 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var340.method263().method4048();
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6612) {
                                                                                                                                int var341 = field1244[--Statics.field1238];
                                                                                                                                class33 var342 = client.method312().method5453(var341);
                                                                                                                                if (var342 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = (var342.method292() - var342.method256() + 1) * 64;
                                                                                                                                    field1244[++Statics.field1238 - 1] = (var342.method259() - var342.method277() + 1) * 64;
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6613) {
                                                                                                                                int var343 = field1244[--Statics.field1238];
                                                                                                                                class33 var344 = client.method312().method5453(var343);
                                                                                                                                if (var344 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var344.method256() * 64;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var344.method277() * 64;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var344.method292() * 64 + 64 - 1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var344.method259() * 64 + 64 - 1;
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6614) {
                                                                                                                                int var345 = field1244[--Statics.field1238];
                                                                                                                                class33 var346 = client.method312().method5453(var345);
                                                                                                                                if (var346 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var346.method283();
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6615) {
                                                                                                                                class224 var347 = client.method312().method5431();
                                                                                                                                if (var347 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var347.field2718;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var347.field2716;
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6616) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5439();
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6617) {
                                                                                                                                class224 var348 = new class224(field1244[--Statics.field1238]);
                                                                                                                                class33 var349 = client.method312().method5440();
                                                                                                                                if (var349 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    var329 = 1;
                                                                                                                                } else {
                                                                                                                                    int[] var350 = var349.method303(var348.field2717, var348.field2718, var348.field2716);
                                                                                                                                    if (var350 == null) {
                                                                                                                                        field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                        field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1244[++Statics.field1238 - 1] = var350[0];
                                                                                                                                        field1244[++Statics.field1238 - 1] = var350[1];
                                                                                                                                    }
                                                                                                                                    var329 = 1;
                                                                                                                                }
                                                                                                                            } else if (var391 == 6618) {
                                                                                                                                class224 var351 = new class224(field1244[--Statics.field1238]);
                                                                                                                                class33 var352 = client.method312().method5440();
                                                                                                                                if (var352 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    var329 = 1;
                                                                                                                                } else {
                                                                                                                                    class224 var353 = var352.method258(var351.field2718, var351.field2716);
                                                                                                                                    if (var353 == null) {
                                                                                                                                        field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1244[++Statics.field1238 - 1] = var353.method4048();
                                                                                                                                    }
                                                                                                                                    var329 = 1;
                                                                                                                                }
                                                                                                                            } else if (var391 == 6619) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var354 = field1244[Statics.field1238];
                                                                                                                                class224 var355 = new class224(field1244[Statics.field1238 + 1]);
                                                                                                                                method1752(var354, var355, false);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6620) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var356 = field1244[Statics.field1238];
                                                                                                                                class224 var357 = new class224(field1244[Statics.field1238 + 1]);
                                                                                                                                method1752(var356, var357, true);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6621) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var358 = field1244[Statics.field1238];
                                                                                                                                class224 var359 = new class224(field1244[Statics.field1238 + 1]);
                                                                                                                                class33 var360 = client.method312().method5453(var358);
                                                                                                                                if (var360 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = 0;
                                                                                                                                    var329 = 1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var360.method306(var359.field2717, var359.field2718, var359.field2716) ? 1 : 0;
                                                                                                                                    var329 = 1;
                                                                                                                                }
                                                                                                                            } else if (var391 == 6622) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5461();
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5551();
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6623) {
                                                                                                                                class224 var361 = new class224(field1244[--Statics.field1238]);
                                                                                                                                class33 var362 = client.method312().method5437(var361.field2717, var361.field2718, var361.field2716);
                                                                                                                                if (var362 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var362.method251();
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6624) {
                                                                                                                                client.method312().method5463(field1244[--Statics.field1238]);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6625) {
                                                                                                                                client.method312().method5464();
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6626) {
                                                                                                                                client.method312().method5493(field1244[--Statics.field1238]);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6627) {
                                                                                                                                client.method312().method5466();
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6628) {
                                                                                                                                boolean var363 = field1244[--Statics.field1238] == 1;
                                                                                                                                client.method312().method5467(var363);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6629) {
                                                                                                                                int var364 = field1244[--Statics.field1238];
                                                                                                                                client.method312().method5468(var364);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6630) {
                                                                                                                                int var365 = field1244[--Statics.field1238];
                                                                                                                                client.method312().method5580(var365);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6631) {
                                                                                                                                client.method312().method5470();
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6632) {
                                                                                                                                boolean var366 = field1244[--Statics.field1238] == 1;
                                                                                                                                client.method312().method5483(var366);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6633) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var367 = field1244[Statics.field1238];
                                                                                                                                boolean var368 = field1244[Statics.field1238 + 1] == 1;
                                                                                                                                client.method312().method5472(var367, var368);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6634) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var369 = field1244[Statics.field1238];
                                                                                                                                boolean var370 = field1244[Statics.field1238 + 1] == 1;
                                                                                                                                client.method312().method5566(var369, var370);
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6635) {
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5474() ? 1 : 0;
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6636) {
                                                                                                                                int var371 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5525(var371) ? 1 : 0;
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6637) {
                                                                                                                                int var372 = field1244[--Statics.field1238];
                                                                                                                                field1244[++Statics.field1238 - 1] = client.method312().method5476(var372) ? 1 : 0;
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6638) {
                                                                                                                                Statics.field1238 -= 2;
                                                                                                                                int var373 = field1244[Statics.field1238];
                                                                                                                                class224 var374 = new class224(field1244[Statics.field1238 + 1]);
                                                                                                                                class224 var375 = client.method312().method5479(var373, var374);
                                                                                                                                if (var375 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var375.method4048();
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6639) {
                                                                                                                                class40 var376 = client.method312().method5571();
                                                                                                                                if (var376 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var376.field515;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var376.field510.method4048();
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6640) {
                                                                                                                                class40 var377 = client.method312().method5547();
                                                                                                                                if (var377 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var377.field515;
                                                                                                                                    field1244[++Statics.field1238 - 1] = var377.field510.method4048();
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6693) {
                                                                                                                                int var378 = field1244[--Statics.field1238];
                                                                                                                                class254 var379 = Statics.field3378[var378];
                                                                                                                                if (var379.field3383 == null) {
                                                                                                                                    field1246[++Statics.field3803 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1246[++Statics.field3803 - 1] = var379.field3383;
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6694) {
                                                                                                                                int var380 = field1244[--Statics.field1238];
                                                                                                                                class254 var381 = Statics.field3378[var380];
                                                                                                                                field1244[++Statics.field1238 - 1] = var381.field3379;
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6695) {
                                                                                                                                int var382 = field1244[--Statics.field1238];
                                                                                                                                class254 var383 = Statics.field3378[var382];
                                                                                                                                if (var383 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var383.field3397;
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6696) {
                                                                                                                                int var384 = field1244[--Statics.field1238];
                                                                                                                                class254 var385 = Statics.field3378[var384];
                                                                                                                                if (var385 == null) {
                                                                                                                                    field1244[++Statics.field1238 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1244[++Statics.field1238 - 1] = var385.field3381;
                                                                                                                                }
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6697) {
                                                                                                                                field1244[++Statics.field1238 - 1] = Statics.field317.field573;
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6698) {
                                                                                                                                field1244[++Statics.field1238 - 1] = Statics.field317.field576.method4048();
                                                                                                                                var329 = 1;
                                                                                                                            } else if (var391 == 6699) {
                                                                                                                                field1244[++Statics.field1238 - 1] = Statics.field317.field575.method4048();
                                                                                                                                var329 = 1;
                                                                                                                            } else {
                                                                                                                                var329 = 2;
                                                                                                                            }
                                                                                                                            var75 = var329;
                                                                                                                        } else {
                                                                                                                            var75 = 2;
                                                                                                                        }
                                                                                                                        switch(var75) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var391 == 0) {
                                                                                                                        field1244[++Statics.field1238 - 1] = var21[var19];
                                                                                                                    } else if (var391 == 1) {
                                                                                                                        int var29 = var21[var19];
                                                                                                                        field1244[++Statics.field1238 - 1] = class223.field2713[var29];
                                                                                                                    } else if (var391 == 2) {
                                                                                                                        int var30 = var21[var19];
                                                                                                                        class223.field2713[var30] = field1244[--Statics.field1238];
                                                                                                                        client.method2(var30);
                                                                                                                    } else if (var391 == 3) {
                                                                                                                        field1246[++Statics.field3803 - 1] = var13.field1421[var19];
                                                                                                                    } else if (var391 == 6) {
                                                                                                                        var19 += var21[var19];
                                                                                                                    } else if (var391 == 7) {
                                                                                                                        Statics.field1238 -= 2;
                                                                                                                        if (field1244[Statics.field1238] != field1244[Statics.field1238 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var391 == 8) {
                                                                                                                        Statics.field1238 -= 2;
                                                                                                                        if (field1244[Statics.field1238] == field1244[Statics.field1238 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var391 == 9) {
                                                                                                                        Statics.field1238 -= 2;
                                                                                                                        if (field1244[Statics.field1238] < field1244[Statics.field1238 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var391 == 10) {
                                                                                                                        Statics.field1238 -= 2;
                                                                                                                        if (field1244[Statics.field1238] > field1244[Statics.field1238 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var391 == 21) {
                                                                                                                        if (field1247 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class62 var31 = field1248[--field1247];
                                                                                                                        var13 = var31.field712;
                                                                                                                        var20 = var13.field1430;
                                                                                                                        var21 = var13.field1423;
                                                                                                                        var19 = var31.field714;
                                                                                                                        Statics.field1240 = var31.field711;
                                                                                                                        Statics.field1241 = var31.field720;
                                                                                                                    } else if (var391 == 25) {
                                                                                                                        int var32 = var21[var19];
                                                                                                                        field1244[++Statics.field1238 - 1] = class223.method51(var32);
                                                                                                                    } else if (var391 == 27) {
                                                                                                                        int var33 = var21[var19];
                                                                                                                        class223.method2913(var33, field1244[--Statics.field1238]);
                                                                                                                    } else if (var391 == 31) {
                                                                                                                        Statics.field1238 -= 2;
                                                                                                                        if (field1244[Statics.field1238] <= field1244[Statics.field1238 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var391 == 32) {
                                                                                                                        Statics.field1238 -= 2;
                                                                                                                        if (field1244[Statics.field1238] >= field1244[Statics.field1238 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var391 == 33) {
                                                                                                                        field1244[++Statics.field1238 - 1] = Statics.field1240[var21[var19]];
                                                                                                                    } else if (var391 == 34) {
                                                                                                                        Statics.field1240[var21[var19]] = field1244[--Statics.field1238];
                                                                                                                    } else if (var391 == 35) {
                                                                                                                        field1246[++Statics.field3803 - 1] = Statics.field1241[var21[var19]];
                                                                                                                    } else if (var391 == 36) {
                                                                                                                        Statics.field1241[var21[var19]] = field1246[--Statics.field3803];
                                                                                                                    } else if (var391 == 37) {
                                                                                                                        int var34 = var21[var19];
                                                                                                                        Statics.field3803 -= var34;
                                                                                                                        String var35 = class294.method4041(field1246, Statics.field3803, var34);
                                                                                                                        field1246[++Statics.field3803 - 1] = var35;
                                                                                                                    } else if (var391 == 38) {
                                                                                                                        Statics.field1238--;
                                                                                                                    } else if (var391 == 39) {
                                                                                                                        Statics.field3803--;
                                                                                                                    } else if (var391 == 40) {
                                                                                                                        int var36 = var21[var19];
                                                                                                                        class96 var37 = (class96) class96.field1425.method3673((long) var36);
                                                                                                                        class96 var38;
                                                                                                                        if (var37 == null) {
                                                                                                                            byte[] var39 = Statics.field335.method4231(var36, 0);
                                                                                                                            if (var39 == null) {
                                                                                                                                var38 = null;
                                                                                                                            } else {
                                                                                                                                class96 var40 = class96.method1729(var39);
                                                                                                                                class96.field1425.method3675(var40, (long) var36);
                                                                                                                                var38 = var40;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var38 = var37;
                                                                                                                        }
                                                                                                                        class96 var41 = var38;
                                                                                                                        int[] var42 = new int[var38.field1422];
                                                                                                                        String[] var43 = new String[var38.field1426];
                                                                                                                        for (int var44 = 0; var44 < var41.field1427; var44++) {
                                                                                                                            var42[var44] = field1244[Statics.field1238 - var41.field1427 + var44];
                                                                                                                        }
                                                                                                                        for (int var45 = 0; var45 < var41.field1428; var45++) {
                                                                                                                            var43[var45] = field1246[Statics.field3803 - var41.field1428 + var45];
                                                                                                                        }
                                                                                                                        Statics.field1238 -= var41.field1427;
                                                                                                                        Statics.field3803 -= var41.field1428;
                                                                                                                        class62 var46 = new class62();
                                                                                                                        var46.field712 = var13;
                                                                                                                        var46.field714 = var19;
                                                                                                                        var46.field711 = Statics.field1240;
                                                                                                                        var46.field720 = Statics.field1241;
                                                                                                                        field1248[++field1247 - 1] = var46;
                                                                                                                        var13 = var41;
                                                                                                                        var20 = var41.field1430;
                                                                                                                        var21 = var41.field1423;
                                                                                                                        var19 = -1;
                                                                                                                        Statics.field1240 = var42;
                                                                                                                        Statics.field1241 = var43;
                                                                                                                    } else if (var391 == 42) {
                                                                                                                        field1244[++Statics.field1238 - 1] = Statics.field470.method1836(var21[var19]);
                                                                                                                    } else if (var391 == 43) {
                                                                                                                        Statics.field470.method1835(var21[var19], field1244[--Statics.field1238]);
                                                                                                                    } else if (var391 == 44) {
                                                                                                                        int var47 = var21[var19] >> 16;
                                                                                                                        int var48 = var21[var19] & 0xFFFF;
                                                                                                                        int var49 = field1244[--Statics.field1238];
                                                                                                                        if (var49 >= 0 && var49 <= 5000) {
                                                                                                                            field1242[var47] = var49;
                                                                                                                            byte var50 = -1;
                                                                                                                            if (var48 == 105) {
                                                                                                                                var50 = 0;
                                                                                                                            }
                                                                                                                            int var51 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var51 >= var49) {
                                                                                                                                    continue label1557;
                                                                                                                                }
                                                                                                                                field1253[var47][var51] = var50;
                                                                                                                                var51++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var391 == 45) {
                                                                                                                        int var52 = var21[var19];
                                                                                                                        int var53 = field1244[--Statics.field1238];
                                                                                                                        if (var53 < 0 || var53 >= field1242[var52]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1244[++Statics.field1238 - 1] = field1253[var52][var53];
                                                                                                                    } else if (var391 == 46) {
                                                                                                                        int var54 = var21[var19];
                                                                                                                        Statics.field1238 -= 2;
                                                                                                                        int var55 = field1244[Statics.field1238];
                                                                                                                        if (var55 < 0 || var55 >= field1242[var54]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1253[var54][var55] = field1244[Statics.field1238 + 1];
                                                                                                                    } else if (var391 == 47) {
                                                                                                                        String var56 = Statics.field470.method1845(var21[var19]);
                                                                                                                        if (var56 == null) {
                                                                                                                            var56 = "null";
                                                                                                                        }
                                                                                                                        field1246[++Statics.field3803 - 1] = var56;
                                                                                                                    } else if (var391 == 48) {
                                                                                                                        Statics.field470.method1837(var21[var19], field1246[--Statics.field3803]);
                                                                                                                    } else if (var391 == 60) {
                                                                                                                        class198 var57 = var13.field1429[var21[var19]];
                                                                                                                        class210 var58 = (class210) var57.method3641((long) field1244[--Statics.field1238]);
                                                                                                                        if (var58 != null) {
                                                                                                                            var19 += var58.field2599;
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
        } catch (Exception var390) {
            StringBuilder var388 = new StringBuilder(30);
            var388.append("").append(var13.field2585).append(" ");
            for (int var389 = field1247 - 1; var389 >= 0; var389--) {
                var388.append("").append(field1248[var389].field712.field2585).append(" ");
            }
            var388.append("").append(var22);
            class155.method73(var388.toString(), var390);
        }
    }

    @ObfuscatedName("be.m(ILcf;ZI)I")
    public static int method1496(int arg0, class96 arg1, boolean arg2) {
        int var3 = -1;
        class228 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1244[--Statics.field1238];
            var4 = class228.method3956(var3);
        } else {
            var4 = arg2 ? Statics.field1419 : Statics.field1669;
        }
        if (arg0 == 1000) {
            Statics.field1238 -= 4;
            var4.field2764 = field1244[Statics.field1238];
            var4.field2765 = field1244[Statics.field1238 + 1];
            var4.field2771 = field1244[Statics.field1238 + 2];
            var4.field2761 = field1244[Statics.field1238 + 3];
            client.method313(var4);
            Statics.field2445.method1443(var4);
            if (var3 != -1 && var4.field2864 == 0) {
                client.method15(Statics.field713[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1238 -= 4;
            var4.field2766 = field1244[Statics.field1238];
            var4.field2767 = field1244[Statics.field1238 + 1];
            var4.field2749 = field1244[Statics.field1238 + 2];
            var4.field2763 = field1244[Statics.field1238 + 3];
            client.method313(var4);
            Statics.field2445.method1443(var4);
            if (var3 != -1 && var4.field2864 == 0) {
                client.method15(Statics.field713[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1244[--Statics.field1238] == 1;
            if (var4.field2775 != var5) {
                var4.field2775 = var5;
                client.method313(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2828 = field1244[--Statics.field1238] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2889 = field1244[--Statics.field1238] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.h(ILcf;ZI)I")
    public static int method1748(int arg0, class96 arg1, boolean arg2) {
        int var3 = -1;
        class228 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1244[--Statics.field1238];
            var4 = class228.method3956(var3);
        } else {
            var4 = arg2 ? Statics.field1419 : Statics.field1669;
        }
        if (arg0 == 1100) {
            Statics.field1238 -= 2;
            var4.field2776 = field1244[Statics.field1238];
            if (var4.field2776 > var4.field2800 - var4.field2770) {
                var4.field2776 = var4.field2800 - var4.field2770;
            }
            if (var4.field2776 < 0) {
                var4.field2776 = 0;
            }
            var4.field2777 = field1244[Statics.field1238 + 1];
            if (var4.field2777 > var4.field2785 - var4.field2790) {
                var4.field2777 = var4.field2785 - var4.field2790;
            }
            if (var4.field2777 < 0) {
                var4.field2777 = 0;
            }
            client.method313(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2780 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2784 = field1244[--Statics.field1238] == 1;
            client.method313(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2786 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2788 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2827 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2796 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2793 = field1244[--Statics.field1238] == 1;
            client.method313(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2798 = 1;
            var4.field2799 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1238 -= 6;
            var4.field2778 = field1244[Statics.field1238];
            var4.field2865 = field1244[Statics.field1238 + 1];
            var4.field2873 = field1244[Statics.field1238 + 2];
            var4.field2807 = field1244[Statics.field1238 + 3];
            var4.field2808 = field1244[Statics.field1238 + 4];
            var4.field2809 = field1244[Statics.field1238 + 5];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1244[--Statics.field1238];
            if (var4.field2802 != var5) {
                var4.field2802 = var5;
                var4.field2877 = 0;
                var4.field2890 = 0;
                client.method313(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2779 = field1244[--Statics.field1238] == 1;
            client.method313(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1246[--Statics.field3803];
            if (!var6.equals(var4.field2815)) {
                var4.field2815 = var6;
                client.method313(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2814 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1238 -= 3;
            var4.field2818 = field1244[Statics.field1238];
            var4.field2819 = field1244[Statics.field1238 + 1];
            var4.field2817 = field1244[Statics.field1238 + 2];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2853 = field1244[--Statics.field1238] == 1;
            client.method313(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2794 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2795 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2789 = field1244[--Statics.field1238] == 1;
            client.method313(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2797 = field1244[--Statics.field1238] == 1;
            client.method313(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1238 -= 2;
            var4.field2800 = field1244[Statics.field1238];
            var4.field2785 = field1244[Statics.field1238 + 1];
            client.method313(var4);
            if (var3 != -1 && var4.field2864 == 0) {
                client.method15(Statics.field713[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2755;
            int var8 = var4.field2756;
            class175 var9 = class175.method1891(class172.field2399, client.field938.field1455);
            var9.field2440.method3368(var7);
            var9.field2440.method3247(var8);
            client.field938.method1907(var9);
            client.field886 = var4;
            client.method313(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2791 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2781 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2787 = field1244[--Statics.field1238];
            client.method313(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var10 = field1244[--Statics.field1238];
            class308[] var11 = new class308[] { class308.field3885, class308.field3888, class308.field3882, class308.field3884, class308.field3883 };
            class308 var12 = (class308) class180.method1823(var11, var10);
            if (var12 != null) {
                var4.field2833 = var12;
                client.method313(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var13 = field1244[--Statics.field1238] == 1;
            var4.field2821 = var13;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bb.i(ILcf;ZB)I")
    public static int method1503(int arg0, class96 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method3956(field1244[--Statics.field1238]);
        } else {
            var3 = arg2 ? Statics.field1419 : Statics.field1669;
        }
        client.method313(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1238 -= 2;
            int var4 = field1244[Statics.field1238];
            int var5 = field1244[Statics.field1238 + 1];
            var3.field2875 = var4;
            var3.field2812 = var5;
            class268 var6 = class268.method965(var4);
            var3.field2873 = var6.field3597;
            var3.field2807 = var6.field3584;
            var3.field2808 = var6.field3585;
            var3.field2778 = var6.field3586;
            var3.field2865 = var6.field3587;
            var3.field2809 = var6.field3582;
            if (arg0 == 1205) {
                var3.field2863 = 0;
            } else if (arg0 == 1212 | var6.field3588 == 1) {
                var3.field2863 = 1;
            } else {
                var3.field2863 = 2;
            }
            if (var3.field2810 > 0) {
                var3.field2809 = var3.field2809 * 32 / var3.field2810;
            } else if (var3.field2766 > 0) {
                var3.field2809 = var3.field2809 * 32 / var3.field2766;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2798 = 2;
            var3.field2799 = field1244[--Statics.field1238];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2798 = 3;
            var3.field2799 = Statics.field1754.field820.method4076();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jf.w(ILcf;ZB)I")
    public static int method4488(int arg0, class96 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method3956(field1244[--Statics.field1238]);
        } else {
            var3 = arg2 ? Statics.field1419 : Statics.field1669;
        }
        if (arg0 == 1300) {
            int var4 = field1244[--Statics.field1238] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4107(var4, field1246[--Statics.field3803]);
                return 1;
            } else {
                Statics.field3803--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1238 -= 2;
            int var5 = field1244[Statics.field1238];
            int var6 = field1244[Statics.field1238 + 1];
            var3.field2830 = class228.method539(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2820 = field1244[--Statics.field1238] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2831 = field1244[--Statics.field1238];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2823 = field1244[--Statics.field1238];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2888 = field1246[--Statics.field3803];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2880 = field1246[--Statics.field3803];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2829 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cp.t(ILcf;ZI)I")
    public static int method1759(int arg0, class96 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method3956(field1244[--Statics.field1238]);
        } else {
            var3 = arg2 ? Statics.field1419 : Statics.field1669;
        }
        String var4 = field1246[--Statics.field3803];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1244[--Statics.field1238];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1244[--Statics.field1238];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1246[--Statics.field3803];
            } else {
                var7[var8] = Integer.valueOf(field1244[--Statics.field1238]);
            }
        }
        int var9 = field1244[--Statics.field1238];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2837 = var7;
        } else if (arg0 == 1401) {
            var3.field2840 = var7;
        } else if (arg0 == 1402) {
            var3.field2826 = var7;
        } else if (arg0 == 1403) {
            var3.field2841 = var7;
        } else if (arg0 == 1404) {
            var3.field2843 = var7;
        } else if (arg0 == 1405) {
            var3.field2844 = var7;
        } else if (arg0 == 1406) {
            var3.field2782 = var7;
        } else if (arg0 == 1407) {
            var3.field2816 = var7;
            var3.field2849 = var5;
        } else if (arg0 == 1408) {
            var3.field2848 = var7;
        } else if (arg0 == 1409) {
            var3.field2847 = var7;
        } else if (arg0 == 1410) {
            var3.field2854 = var7;
        } else if (arg0 == 1411) {
            var3.field2838 = var7;
        } else if (arg0 == 1412) {
            var3.field2842 = var7;
        } else if (arg0 == 1414) {
            var3.field2850 = var7;
            var3.field2851 = var5;
        } else if (arg0 == 1415) {
            var3.field2852 = var7;
            var3.field2741 = var5;
        } else if (arg0 == 1416) {
            var3.field2846 = var7;
        } else if (arg0 == 1417) {
            var3.field2856 = var7;
        } else if (arg0 == 1418) {
            var3.field2857 = var7;
        } else if (arg0 == 1419) {
            var3.field2858 = var7;
        } else if (arg0 == 1420) {
            var3.field2859 = var7;
        } else if (arg0 == 1421) {
            var3.field2860 = var7;
        } else if (arg0 == 1422) {
            var3.field2884 = var7;
        } else if (arg0 == 1423) {
            var3.field2862 = var7;
        } else if (arg0 == 1424) {
            var3.field2801 = var7;
        } else if (arg0 == 1425) {
            var3.field2760 = var7;
        } else if (arg0 == 1426) {
            var3.field2834 = var7;
        } else if (arg0 == 1427) {
            var3.field2813 = var7;
        } else {
            return 2;
        }
        var3.field2835 = true;
        return 1;
    }

    @ObfuscatedName("hl.d(ILcf;ZB)I")
    public static int method4024(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field1419 : Statics.field1669;
        if (arg0 == 1500) {
            field1244[++Statics.field1238 - 1] = var3.field2768;
            return 1;
        } else if (arg0 == 1501) {
            field1244[++Statics.field1238 - 1] = var3.field2769;
            return 1;
        } else if (arg0 == 1502) {
            field1244[++Statics.field1238 - 1] = var3.field2770;
            return 1;
        } else if (arg0 == 1503) {
            field1244[++Statics.field1238 - 1] = var3.field2790;
            return 1;
        } else if (arg0 == 1504) {
            field1244[++Statics.field1238 - 1] = var3.field2775 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1244[++Statics.field1238 - 1] = var3.field2774;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.z(ILcf;ZI)I")
    public static int method311(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field1419 : Statics.field1669;
        if (arg0 == 1600) {
            field1244[++Statics.field1238 - 1] = var3.field2776;
            return 1;
        } else if (arg0 == 1601) {
            field1244[++Statics.field1238 - 1] = var3.field2777;
            return 1;
        } else if (arg0 == 1602) {
            field1246[++Statics.field3803 - 1] = var3.field2815;
            return 1;
        } else if (arg0 == 1603) {
            field1244[++Statics.field1238 - 1] = var3.field2800;
            return 1;
        } else if (arg0 == 1604) {
            field1244[++Statics.field1238 - 1] = var3.field2785;
            return 1;
        } else if (arg0 == 1605) {
            field1244[++Statics.field1238 - 1] = var3.field2809;
            return 1;
        } else if (arg0 == 1606) {
            field1244[++Statics.field1238 - 1] = var3.field2873;
            return 1;
        } else if (arg0 == 1607) {
            field1244[++Statics.field1238 - 1] = var3.field2808;
            return 1;
        } else if (arg0 == 1608) {
            field1244[++Statics.field1238 - 1] = var3.field2807;
            return 1;
        } else if (arg0 == 1609) {
            field1244[++Statics.field1238 - 1] = var3.field2786;
            return 1;
        } else if (arg0 == 1610) {
            field1244[++Statics.field1238 - 1] = var3.field2787;
            return 1;
        } else if (arg0 == 1611) {
            field1244[++Statics.field1238 - 1] = var3.field2780;
            return 1;
        } else if (arg0 == 1612) {
            field1244[++Statics.field1238 - 1] = var3.field2781;
            return 1;
        } else if (arg0 == 1613) {
            field1244[++Statics.field1238 - 1] = var3.field2833.method10();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.k(ILcf;ZB)I")
    public static int method154(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field1419 : Statics.field1669;
        if (arg0 == 1700) {
            field1244[++Statics.field1238 - 1] = var3.field2875;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2875 == -1) {
                field1244[++Statics.field1238 - 1] = 0;
            } else {
                field1244[++Statics.field1238 - 1] = var3.field2812;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1244[++Statics.field1238 - 1] = var3.field2756;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.c(ILcf;ZI)I")
    public static int method1863(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field1419 : Statics.field1669;
        if (arg0 == 1800) {
            int[] var4 = field1244;
            int var5 = ++Statics.field1238 - 1;
            int var6 = client.method53(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1244[--Statics.field1238];
            int var9 = var8 - 1;
            if (var3.field2829 == null || var9 >= var3.field2829.length || var3.field2829[var9] == null) {
                field1246[++Statics.field3803 - 1] = "";
            } else {
                field1246[++Statics.field3803 - 1] = var3.field2829[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2888 == null) {
                field1246[++Statics.field3803 - 1] = "";
            } else {
                field1246[++Statics.field3803 - 1] = var3.field2888;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bc.o(ILcf;ZI)I")
    public static int method982(int arg0, class96 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method3956(field1244[--Statics.field1238]);
        } else {
            var3 = arg2 ? Statics.field1419 : Statics.field1669;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1251 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2813 == null) {
            return 0;
        } else {
            class68 var4 = new class68();
            var4.field774 = var3;
            var4.field787 = var3.field2813;
            var4.field772 = field1251 + 1;
            client.field1024.method3747(var4);
            return 1;
        }
    }

    @ObfuscatedName("jk.l(ILcf;ZI)I")
    public static int method4532(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = class228.method3956(field1244[--Statics.field1238]);
        if (arg0 == 2500) {
            field1244[++Statics.field1238 - 1] = var3.field2768;
            return 1;
        } else if (arg0 == 2501) {
            field1244[++Statics.field1238 - 1] = var3.field2769;
            return 1;
        } else if (arg0 == 2502) {
            field1244[++Statics.field1238 - 1] = var3.field2770;
            return 1;
        } else if (arg0 == 2503) {
            field1244[++Statics.field1238 - 1] = var3.field2790;
            return 1;
        } else if (arg0 == 2504) {
            field1244[++Statics.field1238 - 1] = var3.field2775 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1244[++Statics.field1238 - 1] = var3.field2774;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.f(ILcf;ZB)I")
    public static int method1825(int arg0, class96 arg1, boolean arg2) {
        class228 var3 = class228.method3956(field1244[--Statics.field1238]);
        if (arg0 == 2800) {
            int[] var4 = field1244;
            int var5 = ++Statics.field1238 - 1;
            int var6 = client.method53(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 2801) {
            int var8 = field1244[--Statics.field1238];
            int var9 = var8 - 1;
            if (var3.field2829 == null || var9 >= var3.field2829.length || var3.field2829[var9] == null) {
                field1246[++Statics.field3803 - 1] = "";
            } else {
                field1246[++Statics.field3803 - 1] = var3.field2829[var9];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2888 == null) {
                field1246[++Statics.field3803 - 1] = "";
            } else {
                field1246[++Statics.field3803 - 1] = var3.field2888;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iv.q(ILcf;ZI)I")
    public static int method4417(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1238 -= 3;
            int var3 = field1244[Statics.field1238];
            int var4 = field1244[Statics.field1238 + 1];
            int var5 = field1244[Statics.field1238 + 2];
            if (client.field1059 != 0 && var4 != 0 && client.field1063 < 50) {
                client.field1064[client.field1063] = var3;
                client.field1065[client.field1063] = var4;
                client.field1089[client.field1063] = var5;
                client.field1068[client.field1063] = null;
                client.field1067[client.field1063] = 0;
                client.field1063++;
            }
            return 1;
        } else if (arg0 == 3201) {
            client.method1864(field1244[--Statics.field1238]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1238 -= 2;
            int var6 = field1244[Statics.field1238];
            int var7 = field1244[Statics.field1238 + 1];
            if (client.field1058 != 0 && var6 != -1) {
                class215.method8(Statics.field633, var6, 0, client.field1058, false);
                client.field1060 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fh.r(ILcf;ZI)I")
    public static int method3048(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1238 -= 2;
            int var3 = field1244[Statics.field1238];
            int var4 = field1244[Statics.field1238 + 1];
            class265 var5 = class265.method892(var3);
            if (var5.field3481 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3485; var6++) {
                if (var5.field3486[var6] == var4) {
                    field1246[++Statics.field3803 - 1] = var5.field3478[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1246[++Statics.field3803 - 1] = var5.field3480;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1238 -= 4;
            int var7 = field1244[Statics.field1238];
            int var8 = field1244[Statics.field1238 + 1];
            int var9 = field1244[Statics.field1238 + 2];
            int var10 = field1244[Statics.field1238 + 3];
            class265 var11 = class265.method892(var9);
            if (var11.field3484 != var7 || var11.field3481 != var8) {
                if (var8 == 115) {
                    field1246[++Statics.field3803 - 1] = "null";
                } else {
                    field1244[++Statics.field1238 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3485; var12++) {
                if (var11.field3486[var12] == var10) {
                    if (var8 == 115) {
                        field1246[++Statics.field3803 - 1] = var11.field3478[var12];
                    } else {
                        field1244[++Statics.field1238 - 1] = var11.field3482[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1246[++Statics.field3803 - 1] = var11.field3480;
                } else {
                    field1244[++Statics.field1238 - 1] = var11.field3483;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1244[--Statics.field1238];
            class265 var14 = class265.method892(var13);
            field1244[++Statics.field1238 - 1] = var14.method4539();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.x(ILcf;ZI)I")
    public static int method1643(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field473.field1214 == 0) {
                field1244[++Statics.field1238 - 1] = -2;
            } else if (Statics.field473.field1214 == 1) {
                field1244[++Statics.field1238 - 1] = -1;
            } else {
                field1244[++Statics.field1238 - 1] = Statics.field473.field1212.method4838();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1244[--Statics.field1238];
            if (Statics.field473.method1622() && var3 >= 0 && var3 < Statics.field473.field1212.method4838()) {
                class283 var4 = (class283) Statics.field473.field1212.method4848(var3);
                field1246[++Statics.field3803 - 1] = var4.method4806();
                field1246[++Statics.field3803 - 1] = var4.method4814();
            } else {
                field1246[++Statics.field3803 - 1] = "";
                field1246[++Statics.field3803 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1244[--Statics.field1238];
            if (Statics.field473.method1622() && var5 >= 0 && var5 < Statics.field473.field1212.method4838()) {
                field1244[++Statics.field1238 - 1] = ((class283) Statics.field473.field1212.method4848(var5)).field3740;
            } else {
                field1244[++Statics.field1238 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1244[--Statics.field1238];
            if (Statics.field473.method1622() && var6 >= 0 && var6 < Statics.field473.field1212.method4838()) {
                field1244[++Statics.field1238 - 1] = ((class283) Statics.field473.field1212.method4848(var6)).field3741;
            } else {
                field1244[++Statics.field1238 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1246[--Statics.field3803];
            int var8 = field1244[--Statics.field1238];
            class79.method474(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1246[--Statics.field3803];
            Statics.field473.method1574(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1246[--Statics.field3803];
            Statics.field473.method1596(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1246[--Statics.field3803];
            Statics.field473.method1633(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1246[--Statics.field3803];
            Statics.field473.method1579(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1246[--Statics.field3803];
            String var14 = client.method1758(var13);
            field1244[++Statics.field1238 - 1] = Statics.field473.method1614(new class281(var14, Statics.field2740), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field334 == null) {
                field1246[++Statics.field3803 - 1] = "";
            } else {
                field1246[++Statics.field3803 - 1] = Statics.field334.field3732;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field334 == null) {
                field1244[++Statics.field1238 - 1] = 0;
            } else {
                field1244[++Statics.field1238 - 1] = Statics.field334.method4838();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1244[--Statics.field1238];
            if (Statics.field334 == null || var15 >= Statics.field334.method4838()) {
                field1246[++Statics.field3803 - 1] = "";
            } else {
                field1246[++Statics.field3803 - 1] = Statics.field334.method4848(var15).method4805().method4922();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1244[--Statics.field1238];
            if (Statics.field334 == null || var16 >= Statics.field334.method4838()) {
                field1244[++Statics.field1238 - 1] = 0;
            } else {
                field1244[++Statics.field1238 - 1] = ((class273) Statics.field334.method4848(var16)).field3699;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1244[--Statics.field1238];
            if (Statics.field334 == null || var17 >= Statics.field334.method4838()) {
                field1244[++Statics.field1238 - 1] = 0;
            } else {
                field1244[++Statics.field1238 - 1] = ((class273) Statics.field334.method4848(var17)).field3697;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1244[++Statics.field1238 - 1] = Statics.field334 == null ? 0 : Statics.field334.field3738;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1246[--Statics.field3803];
            if (Statics.field334 != null) {
                class175 var19 = class175.method1891(class172.field2327, client.field938.field1455);
                var19.field2440.method3223(class185.method2709(var18));
                var19.field2440.method3230(var18);
                client.field938.method1907(var19);
            }
            return 1;
        } else if (arg0 == 3618) {
            field1244[++Statics.field1238 - 1] = Statics.field334 == null ? 0 : Statics.field334.field3734;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field1246[--Statics.field3803];
            client.method3589(var20);
            return 1;
        } else if (arg0 == 3620) {
            class175 var21 = class175.method1891(class172.field2335, client.field938.field1455);
            var21.field2440.method3223(0);
            client.field938.method1907(var21);
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field473.method1622()) {
                field1244[++Statics.field1238 - 1] = Statics.field473.field1213.method4838();
            } else {
                field1244[++Statics.field1238 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var22 = field1244[--Statics.field1238];
            if (Statics.field473.method1622() && var22 >= 0 && var22 < Statics.field473.field1213.method4838()) {
                class277 var23 = (class277) Statics.field473.field1213.method4848(var22);
                field1246[++Statics.field3803 - 1] = var23.method4806();
                field1246[++Statics.field3803 - 1] = var23.method4814();
            } else {
                field1246[++Statics.field3803 - 1] = "";
                field1246[++Statics.field3803 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var24 = field1246[--Statics.field3803];
            String var25 = client.method1758(var24);
            field1244[++Statics.field1238 - 1] = Statics.field473.method1573(new class281(var25, Statics.field2740)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var26 = field1244[--Statics.field1238];
            if (Statics.field334 == null || var26 >= Statics.field334.method4838() || !Statics.field334.method4848(var26).method4805().equals(Statics.field1754.field819)) {
                field1244[++Statics.field1238 - 1] = 0;
            } else {
                field1244[++Statics.field1238 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field334 == null || Statics.field334.field3733 == null) {
                field1246[++Statics.field3803 - 1] = "";
            } else {
                field1246[++Statics.field3803 - 1] = Statics.field334.field3733;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var27 = field1244[--Statics.field1238];
            if (Statics.field334 == null || var27 >= Statics.field334.method4838() || !((class273) Statics.field334.method4848(var27)).method4788()) {
                field1244[++Statics.field1238 - 1] = 0;
            } else {
                field1244[++Statics.field1238 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var28 = field1244[--Statics.field1238];
            if (Statics.field334 == null || var28 >= Statics.field334.method4838() || !((class273) Statics.field334.method4848(var28)).method4782()) {
                field1244[++Statics.field1238 - 1] = 0;
            } else {
                field1244[++Statics.field1238 - 1] = 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jw.a(ILcf;ZI)I")
    public static int method4979(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1244[--Statics.field1238];
            field1246[++Statics.field3803 - 1] = class268.method965(var3).field3599;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1238 -= 2;
            int var4 = field1244[Statics.field1238];
            int var5 = field1244[Statics.field1238 + 1];
            class268 var6 = class268.method965(var4);
            if (var5 < 1 || var5 > 5 || var6.field3591[var5 - 1] == null) {
                field1246[++Statics.field3803 - 1] = "";
            } else {
                field1246[++Statics.field3803 - 1] = var6.field3591[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1238 -= 2;
            int var7 = field1244[Statics.field1238];
            int var8 = field1244[Statics.field1238 + 1];
            class268 var9 = class268.method965(var7);
            if (var8 < 1 || var8 > 5 || var9.field3592[var8 - 1] == null) {
                field1246[++Statics.field3803 - 1] = "";
            } else {
                field1246[++Statics.field3803 - 1] = var9.field3592[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1244[--Statics.field1238];
            field1244[++Statics.field1238 - 1] = class268.method965(var10).field3580;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1244[--Statics.field1238];
            field1244[++Statics.field1238 - 1] = class268.method965(var11).field3588 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1244[--Statics.field1238];
            class268 var13 = class268.method965(var12);
            if (var13.field3609 == -1 && var13.field3608 >= 0) {
                field1244[++Statics.field1238 - 1] = var13.field3608;
            } else {
                field1244[++Statics.field1238 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1244[--Statics.field1238];
            class268 var15 = class268.method965(var14);
            if (var15.field3609 >= 0 && var15.field3608 >= 0) {
                field1244[++Statics.field1238 - 1] = var15.field3608;
            } else {
                field1244[++Statics.field1238 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1244[--Statics.field1238];
            field1244[++Statics.field1238 - 1] = class268.method965(var16).field3590 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1244[--Statics.field1238];
            class268 var18 = class268.method965(var17);
            if (var18.field3621 == -1 && var18.field3620 >= 0) {
                field1244[++Statics.field1238 - 1] = var18.field3620;
            } else {
                field1244[++Statics.field1238 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1244[--Statics.field1238];
            class268 var20 = class268.method965(var19);
            if (var20.field3621 >= 0 && var20.field3620 >= 0) {
                field1244[++Statics.field1238 - 1] = var20.field3620;
            } else {
                field1244[++Statics.field1238 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1246[--Statics.field3803];
            int var22 = field1244[--Statics.field1238];
            client.method3843(var21, var22 == 1);
            field1244[++Statics.field1238 - 1] = Statics.field837;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field383 == null || Statics.field2153 >= Statics.field837) {
                field1244[++Statics.field1238 - 1] = -1;
            } else {
                field1244[++Statics.field1238 - 1] = Statics.field383[++Statics.field2153 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2153 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.ad(ILcf;ZB)I")
    public static int method1021(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1244[++Statics.field1238 - 1] = client.field1041;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1238 -= 3;
            client.field1041 = field1244[Statics.field1238];
            int var3 = field1244[Statics.field1238 + 1];
            class302[] var4 = new class302[] { class302.field3854, class302.field3855, class302.field3856 };
            class302[] var5 = var4;
            int var6 = 0;
            class302 var8;
            while (true) {
                if (var6 >= var5.length) {
                    var8 = null;
                    break;
                }
                class302 var7 = var5[var6];
                if (var7.field3857 == var3) {
                    var8 = var7;
                    break;
                }
                var6++;
            }
            Statics.field2186 = var8;
            if (Statics.field2186 == null) {
                Statics.field2186 = class302.field3855;
            }
            client.field1042 = field1244[Statics.field1238 + 2];
            class175 var9 = class175.method1891(class172.field2374, client.field938.field1455);
            var9.field2440.method3223(client.field1041);
            var9.field2440.method3223(Statics.field2186.field3857);
            var9.field2440.method3223(client.field1042);
            client.field938.method1907(var9);
            return 1;
        } else if (arg0 == 5002) {
            String var10 = field1246[--Statics.field3803];
            Statics.field1238 -= 2;
            int var11 = field1244[Statics.field1238];
            int var12 = field1244[Statics.field1238 + 1];
            class175 var13 = class175.method1891(class172.field2332, client.field938.field1455);
            var13.field2440.method3223(class185.method2709(var10) + 2);
            var13.field2440.method3230(var10);
            var13.field2440.method3223(var11 - 1);
            var13.field2440.method3223(var12);
            client.field938.method1907(var13);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1238 -= 2;
            int var14 = field1244[Statics.field1238];
            int var15 = field1244[Statics.field1238 + 1];
            class70 var16 = class95.method237(var14, var15);
            if (var16 == null) {
                field1244[++Statics.field1238 - 1] = -1;
                field1244[++Statics.field1238 - 1] = 0;
                field1246[++Statics.field3803 - 1] = "";
                field1246[++Statics.field3803 - 1] = "";
                field1246[++Statics.field3803 - 1] = "";
                field1244[++Statics.field1238 - 1] = 0;
            } else {
                field1244[++Statics.field1238 - 1] = var16.field803;
                field1244[++Statics.field1238 - 1] = var16.field797;
                field1246[++Statics.field3803 - 1] = var16.field798 == null ? "" : var16.field798;
                field1246[++Statics.field3803 - 1] = var16.field801 == null ? "" : var16.field801;
                field1246[++Statics.field3803 - 1] = var16.field804 == null ? "" : var16.field804;
                field1244[++Statics.field1238 - 1] = var16.method997() ? 1 : (var16.method994() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var17 = field1244[--Statics.field1238];
            class70 var18 = (class70) class95.field1416.method3641((long) var17);
            if (var18 == null) {
                field1244[++Statics.field1238 - 1] = -1;
                field1244[++Statics.field1238 - 1] = 0;
                field1246[++Statics.field3803 - 1] = "";
                field1246[++Statics.field3803 - 1] = "";
                field1246[++Statics.field3803 - 1] = "";
                field1244[++Statics.field1238 - 1] = 0;
            } else {
                field1244[++Statics.field1238 - 1] = var18.field800;
                field1244[++Statics.field1238 - 1] = var18.field797;
                field1246[++Statics.field3803 - 1] = var18.field798 == null ? "" : var18.field798;
                field1246[++Statics.field3803 - 1] = var18.field801 == null ? "" : var18.field801;
                field1246[++Statics.field3803 - 1] = var18.field804 == null ? "" : var18.field804;
                field1244[++Statics.field1238 - 1] = var18.method997() ? 1 : (var18.method994() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2186 == null) {
                field1244[++Statics.field1238 - 1] = -1;
            } else {
                field1244[++Statics.field1238 - 1] = Statics.field2186.field3857;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var20 = field1246[--Statics.field3803];
            int var21 = field1244[--Statics.field1238];
            String var22 = var20.toLowerCase();
            byte var23 = 0;
            if (var22.startsWith(class237.field3128)) {
                var23 = 0;
                var20 = var20.substring(class237.field3128.length());
            } else if (var22.startsWith(class237.field3130)) {
                var23 = 1;
                var20 = var20.substring(class237.field3130.length());
            } else if (var22.startsWith(class237.field3132)) {
                var23 = 2;
                var20 = var20.substring(class237.field3132.length());
            } else if (var22.startsWith(class237.field3134)) {
                var23 = 3;
                var20 = var20.substring(class237.field3134.length());
            } else if (var22.startsWith(class237.field3136)) {
                var23 = 4;
                var20 = var20.substring(class237.field3136.length());
            } else if (var22.startsWith(class237.field3138)) {
                var23 = 5;
                var20 = var20.substring(class237.field3138.length());
            } else if (var22.startsWith(class237.field3140)) {
                var23 = 6;
                var20 = var20.substring(class237.field3140.length());
            } else if (var22.startsWith(class237.field3142)) {
                var23 = 7;
                var20 = var20.substring(class237.field3142.length());
            } else if (var22.startsWith(class237.field3144)) {
                var23 = 8;
                var20 = var20.substring(class237.field3144.length());
            } else if (var22.startsWith(class237.field3146)) {
                var23 = 9;
                var20 = var20.substring(class237.field3146.length());
            } else if (var22.startsWith(class237.field3148)) {
                var23 = 10;
                var20 = var20.substring(class237.field3148.length());
            } else if (var22.startsWith(class237.field3086)) {
                var23 = 11;
                var20 = var20.substring(class237.field3086.length());
            } else if (client.field846 != 0) {
                if (var22.startsWith(class237.field3129)) {
                    var23 = 0;
                    var20 = var20.substring(class237.field3129.length());
                } else if (var22.startsWith(class237.field3131)) {
                    var23 = 1;
                    var20 = var20.substring(class237.field3131.length());
                } else if (var22.startsWith(class237.field3231)) {
                    var23 = 2;
                    var20 = var20.substring(class237.field3231.length());
                } else if (var22.startsWith(class237.field3135)) {
                    var23 = 3;
                    var20 = var20.substring(class237.field3135.length());
                } else if (var22.startsWith(class237.field3137)) {
                    var23 = 4;
                    var20 = var20.substring(class237.field3137.length());
                } else if (var22.startsWith(class237.field3189)) {
                    var23 = 5;
                    var20 = var20.substring(class237.field3189.length());
                } else if (var22.startsWith(class237.field3141)) {
                    var23 = 6;
                    var20 = var20.substring(class237.field3141.length());
                } else if (var22.startsWith(class237.field3190)) {
                    var23 = 7;
                    var20 = var20.substring(class237.field3190.length());
                } else if (var22.startsWith(class237.field3145)) {
                    var23 = 8;
                    var20 = var20.substring(class237.field3145.length());
                } else if (var22.startsWith(class237.field3147)) {
                    var23 = 9;
                    var20 = var20.substring(class237.field3147.length());
                } else if (var22.startsWith(class237.field3149)) {
                    var23 = 10;
                    var20 = var20.substring(class237.field3149.length());
                } else if (var22.startsWith(class237.field3026)) {
                    var23 = 11;
                    var20 = var20.substring(class237.field3026.length());
                }
            }
            String var24 = var20.toLowerCase();
            byte var25 = 0;
            if (var24.startsWith(class237.field3152)) {
                var25 = 1;
                var20 = var20.substring(class237.field3152.length());
            } else if (var24.startsWith(class237.field3154)) {
                var25 = 2;
                var20 = var20.substring(class237.field3154.length());
            } else if (var24.startsWith(class237.field3156)) {
                var25 = 3;
                var20 = var20.substring(class237.field3156.length());
            } else if (var24.startsWith(class237.field3158)) {
                var25 = 4;
                var20 = var20.substring(class237.field3158.length());
            } else if (var24.startsWith(class237.field3160)) {
                var25 = 5;
                var20 = var20.substring(class237.field3160.length());
            } else if (client.field846 != 0) {
                if (var24.startsWith(class237.field3172)) {
                    var25 = 1;
                    var20 = var20.substring(class237.field3172.length());
                } else if (var24.startsWith(class237.field3115)) {
                    var25 = 2;
                    var20 = var20.substring(class237.field3115.length());
                } else if (var24.startsWith(class237.field3157)) {
                    var25 = 3;
                    var20 = var20.substring(class237.field3157.length());
                } else if (var24.startsWith(class237.field3159)) {
                    var25 = 4;
                    var20 = var20.substring(class237.field3159.length());
                } else if (var24.startsWith(class237.field3161)) {
                    var25 = 5;
                    var20 = var20.substring(class237.field3161.length());
                }
            }
            class175 var26 = class175.method1891(class172.field2334, client.field938.field1455);
            var26.field2440.method3223(0);
            int var27 = var26.field2440.field2514;
            var26.field2440.method3223(var21);
            var26.field2440.method3223(var23);
            var26.field2440.method3223(var25);
            class191 var28 = var26.field2440;
            int var29 = var28.field2514;
            int var30 = var20.length();
            byte[] var31 = new byte[var30];
            for (int var32 = 0; var32 < var30; var32++) {
                char var33 = var20.charAt(var32);
                if (!(var33 <= 0 || var33 >= 128) || !(var33 < 160 || var33 > 255)) {
                    var31[var32] = (byte) var33;
                } else if (var33 == 8364) {
                    var31[var32] = -128;
                } else if (var33 == 8218) {
                    var31[var32] = -126;
                } else if (var33 == 402) {
                    var31[var32] = -125;
                } else if (var33 == 8222) {
                    var31[var32] = -124;
                } else if (var33 == 8230) {
                    var31[var32] = -123;
                } else if (var33 == 8224) {
                    var31[var32] = -122;
                } else if (var33 == 8225) {
                    var31[var32] = -121;
                } else if (var33 == 710) {
                    var31[var32] = -120;
                } else if (var33 == 8240) {
                    var31[var32] = -119;
                } else if (var33 == 352) {
                    var31[var32] = -118;
                } else if (var33 == 8249) {
                    var31[var32] = -117;
                } else if (var33 == 338) {
                    var31[var32] = -116;
                } else if (var33 == 381) {
                    var31[var32] = -114;
                } else if (var33 == 8216) {
                    var31[var32] = -111;
                } else if (var33 == 8217) {
                    var31[var32] = -110;
                } else if (var33 == 8220) {
                    var31[var32] = -109;
                } else if (var33 == 8221) {
                    var31[var32] = -108;
                } else if (var33 == 8226) {
                    var31[var32] = -107;
                } else if (var33 == 8211) {
                    var31[var32] = -106;
                } else if (var33 == 8212) {
                    var31[var32] = -105;
                } else if (var33 == 732) {
                    var31[var32] = -104;
                } else if (var33 == 8482) {
                    var31[var32] = -103;
                } else if (var33 == 353) {
                    var31[var32] = -102;
                } else if (var33 == 8250) {
                    var31[var32] = -101;
                } else if (var33 == 339) {
                    var31[var32] = -100;
                } else if (var33 == 382) {
                    var31[var32] = -98;
                } else if (var33 == 376) {
                    var31[var32] = -97;
                } else {
                    var31[var32] = 63;
                }
            }
            var28.method3232(var31.length);
            var28.field2514 += Statics.field3784.method3155(var31, 0, var31.length, var28.field2512, var28.field2514);
            var26.field2440.method3236(var26.field2440.field2514 - var27);
            client.field938.method1907(var26);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field3803 -= 2;
            String var36 = field1246[Statics.field3803];
            String var37 = field1246[Statics.field3803 + 1];
            class175 var38 = class175.method1891(class172.field2394, client.field938.field1455);
            var38.field2440.method3403(0);
            int var39 = var38.field2440.field2514;
            var38.field2440.method3230(var36);
            class191 var40 = var38.field2440;
            int var41 = var40.field2514;
            int var42 = var37.length();
            byte[] var43 = new byte[var42];
            for (int var44 = 0; var44 < var42; var44++) {
                char var45 = var37.charAt(var44);
                if (!(var45 <= 0 || var45 >= 128) || !(var45 < 160 || var45 > 255)) {
                    var43[var44] = (byte) var45;
                } else if (var45 == 8364) {
                    var43[var44] = -128;
                } else if (var45 == 8218) {
                    var43[var44] = -126;
                } else if (var45 == 402) {
                    var43[var44] = -125;
                } else if (var45 == 8222) {
                    var43[var44] = -124;
                } else if (var45 == 8230) {
                    var43[var44] = -123;
                } else if (var45 == 8224) {
                    var43[var44] = -122;
                } else if (var45 == 8225) {
                    var43[var44] = -121;
                } else if (var45 == 710) {
                    var43[var44] = -120;
                } else if (var45 == 8240) {
                    var43[var44] = -119;
                } else if (var45 == 352) {
                    var43[var44] = -118;
                } else if (var45 == 8249) {
                    var43[var44] = -117;
                } else if (var45 == 338) {
                    var43[var44] = -116;
                } else if (var45 == 381) {
                    var43[var44] = -114;
                } else if (var45 == 8216) {
                    var43[var44] = -111;
                } else if (var45 == 8217) {
                    var43[var44] = -110;
                } else if (var45 == 8220) {
                    var43[var44] = -109;
                } else if (var45 == 8221) {
                    var43[var44] = -108;
                } else if (var45 == 8226) {
                    var43[var44] = -107;
                } else if (var45 == 8211) {
                    var43[var44] = -106;
                } else if (var45 == 8212) {
                    var43[var44] = -105;
                } else if (var45 == 732) {
                    var43[var44] = -104;
                } else if (var45 == 8482) {
                    var43[var44] = -103;
                } else if (var45 == 353) {
                    var43[var44] = -102;
                } else if (var45 == 8250) {
                    var43[var44] = -101;
                } else if (var45 == 339) {
                    var43[var44] = -100;
                } else if (var45 == 382) {
                    var43[var44] = -98;
                } else if (var45 == 376) {
                    var43[var44] = -97;
                } else {
                    var43[var44] = 63;
                }
            }
            var40.method3232(var43.length);
            var40.field2514 += Statics.field3784.method3155(var43, 0, var43.length, var40.field2512, var40.field2514);
            var38.field2440.method3235(var38.field2440.field2514 - var39);
            client.field938.method1907(var38);
            return 1;
        } else if (arg0 == 5015) {
            String var48;
            if (Statics.field1754 == null || Statics.field1754.field819 == null) {
                var48 = "";
            } else {
                var48 = Statics.field1754.field819.method4922();
            }
            field1246[++Statics.field3803 - 1] = var48;
            return 1;
        } else if (arg0 == 5016) {
            field1244[++Statics.field1238 - 1] = client.field1042;
            return 1;
        } else if (arg0 == 5017) {
            int var49 = field1244[--Statics.field1238];
            field1244[++Statics.field1238 - 1] = class95.method3852(var49);
            return 1;
        } else if (arg0 == 5018) {
            int var50 = field1244[--Statics.field1238];
            int[] var51 = field1244;
            int var52 = ++Statics.field1238 - 1;
            class70 var53 = (class70) class95.field1416.method3641((long) var50);
            int var54;
            if (var53 == null) {
                var54 = -1;
            } else if (class95.field1414.field2604 == var53.field2590) {
                var54 = -1;
            } else {
                var54 = ((class70) var53.field2590).field803;
            }
            var51[var52] = var54;
            return 1;
        } else if (arg0 == 5019) {
            int var55 = field1244[--Statics.field1238];
            int[] var56 = field1244;
            int var57 = ++Statics.field1238 - 1;
            class70 var58 = (class70) class95.field1416.method3641((long) var55);
            int var59;
            if (var58 == null) {
                var59 = -1;
            } else if (class95.field1414.field2604 == var58.field2589) {
                var59 = -1;
            } else {
                var59 = ((class70) var58.field2589).field803;
            }
            var56[var57] = var59;
            return 1;
        } else if (arg0 == 5020) {
            String var60 = field1246[--Statics.field3803];
            client.method1546(var60);
            return 1;
        } else if (arg0 == 5021) {
            client.field1043 = field1246[--Statics.field3803].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1246[++Statics.field3803 - 1] = client.field1043;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ex.al(ILcf;ZI)I")
    public static int method2927(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1238 -= 2;
            int var3 = field1244[Statics.field1238];
            int var4 = field1244[Statics.field1238 + 1];
            if (!client.field1069) {
                client.field908 = var3;
                client.field909 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1244[++Statics.field1238 - 1] = client.field908;
            return 1;
        } else if (arg0 == 5506) {
            field1244[++Statics.field1238 - 1] = client.field909;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1244[--Statics.field1238];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field1062 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1244[++Statics.field1238 - 1] = client.field1062;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.aq(ILcf;ZI)I")
    public static int method167(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field944 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ea.ar(ILcf;ZI)I")
    public static int method2944(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1238 -= 2;
            client.field1083 = (short) field1244[Statics.field1238];
            if (client.field1083 <= 0) {
                client.field1083 = 256;
            }
            client.field1076 = (short) field1244[Statics.field1238 + 1];
            if (client.field1076 <= 0) {
                client.field1076 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1238 -= 2;
            client.field1077 = (short) field1244[Statics.field1238];
            if (client.field1077 <= 0) {
                client.field1077 = 256;
            }
            client.field963 = (short) field1244[Statics.field1238 + 1];
            if (client.field963 <= 0) {
                client.field963 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1238 -= 4;
            client.field1079 = (short) field1244[Statics.field1238];
            if (client.field1079 <= 0) {
                client.field1079 = 1;
            }
            client.field939 = (short) field1244[Statics.field1238 + 1];
            if (client.field939 <= 0) {
                client.field939 = 32767;
            } else if (client.field939 < client.field1079) {
                client.field939 = client.field1079;
            }
            client.field983 = (short) field1244[Statics.field1238 + 2];
            if (client.field983 <= 0) {
                client.field983 = 1;
            }
            client.field1082 = (short) field1244[Statics.field1238 + 3];
            if (client.field1082 <= 0) {
                client.field1082 = 32767;
            } else if (client.field1082 < client.field983) {
                client.field1082 = client.field983;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1004 == null) {
                field1244[++Statics.field1238 - 1] = -1;
                field1244[++Statics.field1238 - 1] = -1;
            } else {
                client.method37(0, 0, client.field1004.field2770, client.field1004.field2790, false);
                field1244[++Statics.field1238 - 1] = client.field1085;
                field1244[++Statics.field1238 - 1] = client.field1086;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1244[++Statics.field1238 - 1] = client.field1077;
            field1244[++Statics.field1238 - 1] = client.field963;
            return 1;
        } else if (arg0 == 6205) {
            field1244[++Statics.field1238 - 1] = client.field1083;
            field1244[++Statics.field1238 - 1] = client.field1076;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.an(IB)V")
    public static void method2708(int arg0) {
        if (arg0 == -1 || !class228.method3132(arg0)) {
            return;
        }
        class228[] var1 = Statics.field713[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class228 var3 = var1[var2];
            if (var3.field2744 != null) {
                class68 var4 = new class68();
                var4.field774 = var3;
                var4.field787 = var3.field2744;
                method893(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("cn.af(ILhv;ZI)V")
    public static void method1752(int arg0, class224 arg1, boolean arg2) {
        class33 var3 = client.method312().method5453(arg0);
        int var4 = Statics.field1754.field828;
        int var5 = (Statics.field1754.field1129 >> 7) + Statics.field3737;
        int var6 = (Statics.field1754.field1116 >> 7) + Statics.field435;
        class224 var7 = new class224(var4, var5, var6);
        client.method312().method5602(var3, var7, arg1, arg2);
    }
}
