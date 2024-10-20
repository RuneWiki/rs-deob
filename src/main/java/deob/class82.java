package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("co")
public class class82 {

    @ObfuscatedName("co.e")
    public static int[] field1265 = new int[5];

    @ObfuscatedName("co.y")
    public static int[][] field1262 = new int[5][5000];

    @ObfuscatedName("co.k")
    public static int[] field1259 = new int[1000];

    @ObfuscatedName("co.p")
    public static String[] field1258 = new String[1000];

    @ObfuscatedName("co.m")
    public static int field1266 = 0;

    @ObfuscatedName("co.h")
    public static class64[] field1267 = new class64[50];

    @ObfuscatedName("co.u")
    public static Calendar field1269 = Calendar.getInstance();

    @ObfuscatedName("co.q")
    public static final String[] field1270 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("co.f")
    public static int field1271 = 0;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.d(Lbi;I)V")
    public static void method697(class69 arg0) {
        method45(arg0, 500000);
    }

    @ObfuscatedName("x.z(Lbi;II)V")
    public static void method45(class69 arg0, int arg1) {
        Object[] var2 = arg0.field790;
        class97 var13;
        if (class246.method1090(arg0.field794)) {
            Statics.field650 = (class49) var2[0];
            class270 var3 = Statics.field3450[Statics.field650.field598];
            class246 var4 = arg0.field794;
            int var5 = var3.field3456;
            int var6 = var3.field3452;
            int var7 = class251.method2890(var5, var4);
            class97 var8 = class97.method1887(var7, var4);
            class97 var9;
            if (var8 == null) {
                int var10 = (var6 + 40000 << 8) + var4.field2967;
                class97 var12 = class97.method1887(var10, var4);
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
            var13 = class97.method1748(var14);
        }
        if (var13 == null) {
            return;
        }
        Statics.field1264 = 0;
        Statics.field2098 = 0;
        int var15 = -1;
        int[] var16 = var13.field1446;
        int[] var17 = var13.field1449;
        byte var18 = -1;
        field1266 = 0;
        try {
            Statics.field1263 = new int[var13.field1442];
            int var19 = 0;
            Statics.field1261 = new String[var13.field1443];
            int var20 = 0;
            for (int var21 = 1; var21 < var2.length; var21++) {
                if (var2[var21] instanceof Integer) {
                    int var22 = (Integer) var2[var21];
                    if (var22 == -2147483647) {
                        var22 = arg0.field792;
                    }
                    if (var22 == -2147483646) {
                        var22 = arg0.field791;
                    }
                    if (var22 == -2147483645) {
                        var22 = arg0.field788 == null ? -1 : arg0.field788.field2856;
                    }
                    if (var22 == -2147483644) {
                        var22 = arg0.field799;
                    }
                    if (var22 == -2147483643) {
                        var22 = arg0.field788 == null ? -1 : arg0.field788.field2827;
                    }
                    if (var22 == -2147483642) {
                        var22 = arg0.field793 == null ? -1 : arg0.field793.field2856;
                    }
                    if (var22 == -2147483641) {
                        var22 = arg0.field793 == null ? -1 : arg0.field793.field2827;
                    }
                    if (var22 == -2147483640) {
                        var22 = arg0.field795;
                    }
                    if (var22 == -2147483639) {
                        var22 = arg0.field796;
                    }
                    Statics.field1263[var19++] = var22;
                } else if (var2[var21] instanceof String) {
                    String var23 = (String) var2[var21];
                    if (var23.equals("event_opbase")) {
                        var23 = arg0.field797;
                    }
                    Statics.field1261[var20++] = var23;
                }
            }
            int var24 = 0;
            field1271 = arg0.field798;
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
                                                                                                                label2283: while (true) {
                                                                                                                    var24++;
                                                                                                                    if (var24 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var15++;
                                                                                                                    int var436 = var16[var15];
                                                                                                                    if (var436 >= 100) {
                                                                                                                        boolean var51;
                                                                                                                        if (var13.field1449[var15] == 1) {
                                                                                                                            var51 = true;
                                                                                                                        } else {
                                                                                                                            var51 = false;
                                                                                                                        }
                                                                                                                        int var52;
                                                                                                                        if (var436 < 1000) {
                                                                                                                            var52 = method2925(var436, var13, var51);
                                                                                                                        } else if (var436 < 1100) {
                                                                                                                            var52 = method148(var436, var13, var51);
                                                                                                                        } else if (var436 < 1200) {
                                                                                                                            var52 = method976(var436, var13, var51);
                                                                                                                        } else if (var436 < 1300) {
                                                                                                                            var52 = method4985(var436, var13, var51);
                                                                                                                        } else if (var436 < 1400) {
                                                                                                                            var52 = method2895(var436, var13, var51);
                                                                                                                        } else if (var436 < 1500) {
                                                                                                                            var52 = method1749(var436, var13, var51);
                                                                                                                        } else if (var436 < 1600) {
                                                                                                                            var52 = method694(var436, var13, var51);
                                                                                                                        } else if (var436 < 1700) {
                                                                                                                            class243 var53 = var51 ? Statics.field339 : Statics.field1268;
                                                                                                                            byte var54;
                                                                                                                            if (var436 == 1600) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2847;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1601) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2905;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1602) {
                                                                                                                                field1258[++Statics.field2098 - 1] = var53.field2833;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1603) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2826;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1604) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2850;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1605) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2898;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1606) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2877;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1607) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2879;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1608) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2878;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1609) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2857;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1610) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2858;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1611) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2929;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1612) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2852;
                                                                                                                                var54 = 1;
                                                                                                                            } else if (var436 == 1613) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var53.field2869.method12();
                                                                                                                                var54 = 1;
                                                                                                                            } else {
                                                                                                                                var54 = 2;
                                                                                                                            }
                                                                                                                            var52 = var54;
                                                                                                                        } else if (var436 < 1800) {
                                                                                                                            class243 var58 = var51 ? Statics.field339 : Statics.field1268;
                                                                                                                            byte var59;
                                                                                                                            if (var436 == 1700) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var58.field2946;
                                                                                                                                var59 = 1;
                                                                                                                            } else if (var436 == 1701) {
                                                                                                                                if (var58.field2946 == -1) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var58.field2896;
                                                                                                                                }
                                                                                                                                var59 = 1;
                                                                                                                            } else if (var436 == 1702) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var58.field2827;
                                                                                                                                var59 = 1;
                                                                                                                            } else {
                                                                                                                                var59 = 2;
                                                                                                                            }
                                                                                                                            var52 = var59;
                                                                                                                        } else if (var436 < 1900) {
                                                                                                                            var52 = method2902(var436, var13, var51);
                                                                                                                        } else if (var436 < 2000) {
                                                                                                                            var52 = method2505(var436, var13, var51);
                                                                                                                        } else if (var436 < 2100) {
                                                                                                                            var52 = method148(var436, var13, var51);
                                                                                                                        } else if (var436 < 2200) {
                                                                                                                            var52 = method976(var436, var13, var51);
                                                                                                                        } else if (var436 < 2300) {
                                                                                                                            var52 = method4985(var436, var13, var51);
                                                                                                                        } else if (var436 < 2400) {
                                                                                                                            var52 = method2895(var436, var13, var51);
                                                                                                                        } else if (var436 < 2500) {
                                                                                                                            var52 = method1749(var436, var13, var51);
                                                                                                                        } else if (var436 < 2600) {
                                                                                                                            class243 var60 = class243.method20(field1259[--Statics.field1264]);
                                                                                                                            byte var61;
                                                                                                                            if (var436 == 2500) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var60.field2839;
                                                                                                                                var61 = 1;
                                                                                                                            } else if (var436 == 2501) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var60.field2870;
                                                                                                                                var61 = 1;
                                                                                                                            } else if (var436 == 2502) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var60.field2841;
                                                                                                                                var61 = 1;
                                                                                                                            } else if (var436 == 2503) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var60.field2950;
                                                                                                                                var61 = 1;
                                                                                                                            } else if (var436 == 2504) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var60.field2846 ? 1 : 0;
                                                                                                                                var61 = 1;
                                                                                                                            } else if (var436 == 2505) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var60.field2845;
                                                                                                                                var61 = 1;
                                                                                                                            } else {
                                                                                                                                var61 = 2;
                                                                                                                            }
                                                                                                                            var52 = var61;
                                                                                                                        } else if (var436 < 2700) {
                                                                                                                            class243 var62 = class243.method20(field1259[--Statics.field1264]);
                                                                                                                            byte var63;
                                                                                                                            if (var436 == 2600) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2847;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2601) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2905;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2602) {
                                                                                                                                field1258[++Statics.field2098 - 1] = var62.field2833;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2603) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2826;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2604) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2850;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2605) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2898;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2606) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2877;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2607) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2879;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2608) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2878;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2609) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2857;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2610) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2858;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2611) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2929;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2612) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2852;
                                                                                                                                var63 = 1;
                                                                                                                            } else if (var436 == 2613) {
                                                                                                                                field1259[++Statics.field1264 - 1] = var62.field2869.method12();
                                                                                                                                var63 = 1;
                                                                                                                            } else {
                                                                                                                                var63 = 2;
                                                                                                                            }
                                                                                                                            var52 = var63;
                                                                                                                        } else if (var436 < 2800) {
                                                                                                                            byte var65;
                                                                                                                            if (var436 == 2700) {
                                                                                                                                class243 var64 = class243.method20(field1259[--Statics.field1264]);
                                                                                                                                field1259[++Statics.field1264 - 1] = var64.field2946;
                                                                                                                                var65 = 1;
                                                                                                                            } else if (var436 == 2701) {
                                                                                                                                class243 var66 = class243.method20(field1259[--Statics.field1264]);
                                                                                                                                if (var66.field2946 == -1) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var66.field2896;
                                                                                                                                }
                                                                                                                                var65 = 1;
                                                                                                                            } else if (var436 == 2702) {
                                                                                                                                int var67 = field1259[--Statics.field1264];
                                                                                                                                class68 var68 = (class68) client.field1012.method3736((long) var67);
                                                                                                                                if (var68 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 1;
                                                                                                                                }
                                                                                                                                var65 = 1;
                                                                                                                            } else if (var436 == 2706) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1011;
                                                                                                                                var65 = 1;
                                                                                                                            } else {
                                                                                                                                var65 = 2;
                                                                                                                            }
                                                                                                                            var52 = var65;
                                                                                                                        } else if (var436 < 2900) {
                                                                                                                            class243 var69 = class243.method20(field1259[--Statics.field1264]);
                                                                                                                            byte var74;
                                                                                                                            if (var436 == 2800) {
                                                                                                                                int[] var70 = field1259;
                                                                                                                                int var71 = ++Statics.field1264 - 1;
                                                                                                                                int var72 = client.method1737(var69);
                                                                                                                                int var73 = var72 >> 11 & 0x3F;
                                                                                                                                var70[var71] = var73;
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var436 == 2801) {
                                                                                                                                int var75 = field1259[--Statics.field1264];
                                                                                                                                int var437 = var75 - 1;
                                                                                                                                if (var69.field2900 == null || var437 >= var69.field2900.length || var69.field2900[var437] == null) {
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = var69.field2900[var437];
                                                                                                                                }
                                                                                                                                var74 = 1;
                                                                                                                            } else if (var436 == 2802) {
                                                                                                                                if (var69.field2899 == null) {
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = var69.field2899;
                                                                                                                                }
                                                                                                                                var74 = 1;
                                                                                                                            } else {
                                                                                                                                var74 = 2;
                                                                                                                            }
                                                                                                                            var52 = var74;
                                                                                                                        } else if (var436 < 3000) {
                                                                                                                            var52 = method2505(var436, var13, var51);
                                                                                                                        } else if (var436 < 3200) {
                                                                                                                            byte var77;
                                                                                                                            if (var436 == 3100) {
                                                                                                                                String var76 = field1258[--Statics.field2098];
                                                                                                                                class96.method140(0, "", var76);
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3101) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                client.method5258(Statics.field302, field1259[Statics.field1264], field1259[Statics.field1264 + 1]);
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3103) {
                                                                                                                                client.method239();
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3104) {
                                                                                                                                String var78 = field1258[--Statics.field2098];
                                                                                                                                int var79 = 0;
                                                                                                                                boolean var80 = false;
                                                                                                                                boolean var81 = false;
                                                                                                                                int var82 = 0;
                                                                                                                                int var83 = var78.length();
                                                                                                                                int var84 = 0;
                                                                                                                                boolean var86;
                                                                                                                                while (true) {
                                                                                                                                    if (var84 >= var83) {
                                                                                                                                        var86 = var81;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    label2764: {
                                                                                                                                        char var85 = var78.charAt(var84);
                                                                                                                                        if (var84 == 0) {
                                                                                                                                            if (var85 == '-') {
                                                                                                                                                var80 = true;
                                                                                                                                                break label2764;
                                                                                                                                            }
                                                                                                                                            if (var85 == '+') {
                                                                                                                                                break label2764;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int var438;
                                                                                                                                        if (var85 >= '0' && var85 <= '9') {
                                                                                                                                            var438 = var85 - '0';
                                                                                                                                        } else if (var85 >= 'A' && var85 <= 'Z') {
                                                                                                                                            var438 = var85 - '7';
                                                                                                                                        } else {
                                                                                                                                            if (var85 < 'a' || var85 > 'z') {
                                                                                                                                                var86 = false;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            var438 = var85 - 'W';
                                                                                                                                        }
                                                                                                                                        if (var438 >= 10) {
                                                                                                                                            var86 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        if (var80) {
                                                                                                                                            var438 = -var438;
                                                                                                                                        }
                                                                                                                                        int var87 = var82 * 10 + var438;
                                                                                                                                        if (var87 / 10 != var82) {
                                                                                                                                            var86 = false;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        var82 = var87;
                                                                                                                                        var81 = true;
                                                                                                                                    }
                                                                                                                                    var84++;
                                                                                                                                }
                                                                                                                                if (var86) {
                                                                                                                                    var79 = class319.method1499(var78);
                                                                                                                                }
                                                                                                                                class185 var89 = class185.method251(class182.field2394, client.field900.field1471);
                                                                                                                                var89.field2497.method3326(var79);
                                                                                                                                client.field900.method1921(var89);
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3105) {
                                                                                                                                String var90 = field1258[--Statics.field2098];
                                                                                                                                class185 var91 = class185.method251(class182.field2400, client.field900.field1471);
                                                                                                                                var91.field2497.method3243(var90.length() + 1);
                                                                                                                                var91.field2497.method3250(var90);
                                                                                                                                client.field900.method1921(var91);
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3106) {
                                                                                                                                String var92 = field1258[--Statics.field2098];
                                                                                                                                class185 var93 = class185.method251(class182.field2415, client.field900.field1471);
                                                                                                                                var93.field2497.method3243(var92.length() + 1);
                                                                                                                                var93.field2497.method3250(var92);
                                                                                                                                client.field900.method1921(var93);
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3107) {
                                                                                                                                int var94 = field1259[--Statics.field1264];
                                                                                                                                String var95 = field1258[--Statics.field2098];
                                                                                                                                int var96 = class94.field1407;
                                                                                                                                int[] var97 = class94.field1408;
                                                                                                                                boolean var98 = false;
                                                                                                                                class306 var99 = new class306(var95, Statics.field347);
                                                                                                                                for (int var100 = 0; var100 < var96; var100++) {
                                                                                                                                    class73 var101 = client.field967[var97[var100]];
                                                                                                                                    if (var101 != null && Statics.field302 != var101 && var101.field848 != null && var101.field848.equals(var99)) {
                                                                                                                                        if (var94 == 1) {
                                                                                                                                            class185 var102 = class185.method251(class182.field2451, client.field900.field1471);
                                                                                                                                            var102.field2497.method3285(0);
                                                                                                                                            var102.field2497.method3432(var97[var100]);
                                                                                                                                            client.field900.method1921(var102);
                                                                                                                                        } else if (var94 == 4) {
                                                                                                                                            class185 var103 = class185.method251(class182.field2442, client.field900.field1471);
                                                                                                                                            var103.field2497.method3360(var97[var100]);
                                                                                                                                            var103.field2497.method3243(0);
                                                                                                                                            client.field900.method1921(var103);
                                                                                                                                        } else if (var94 == 6) {
                                                                                                                                            class185 var104 = class185.method251(class182.field2414, client.field900.field1471);
                                                                                                                                            var104.field2497.method3360(var97[var100]);
                                                                                                                                            var104.field2497.method3274(0);
                                                                                                                                            client.field900.method1921(var104);
                                                                                                                                        } else if (var94 == 7) {
                                                                                                                                            class185 var105 = class185.method251(class182.field2457, client.field900.field1471);
                                                                                                                                            var105.field2497.method3285(0);
                                                                                                                                            var105.field2497.method3432(var97[var100]);
                                                                                                                                            client.field900.method1921(var105);
                                                                                                                                        }
                                                                                                                                        var98 = true;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!var98) {
                                                                                                                                    class96.method140(4, "", class252.field3151 + var95);
                                                                                                                                }
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3108) {
                                                                                                                                Statics.field1264 -= 3;
                                                                                                                                int var106 = field1259[Statics.field1264];
                                                                                                                                int var107 = field1259[Statics.field1264 + 1];
                                                                                                                                int var108 = field1259[Statics.field1264 + 2];
                                                                                                                                class243 var109 = class243.method20(var108);
                                                                                                                                client.method21(var109, var106, var107);
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3109) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var110 = field1259[Statics.field1264];
                                                                                                                                int var111 = field1259[Statics.field1264 + 1];
                                                                                                                                class243 var112 = var51 ? Statics.field339 : Statics.field1268;
                                                                                                                                client.method21(var112, var110, var111);
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3110) {
                                                                                                                                Statics.field3560 = field1259[--Statics.field1264] == 1;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3111) {
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field663.field1224 ? 1 : 0;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3112) {
                                                                                                                                Statics.field663.field1224 = field1259[--Statics.field1264] == 1;
                                                                                                                                class79.method1027();
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3113) {
                                                                                                                                String var113 = field1258[--Statics.field2098];
                                                                                                                                boolean var114 = field1259[--Statics.field1264] == 1;
                                                                                                                                class58.method89(var113, var114, false);
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3115) {
                                                                                                                                int var115 = field1259[--Statics.field1264];
                                                                                                                                class185 var116 = class185.method251(class182.field2435, client.field900.field1471);
                                                                                                                                var116.field2497.method3360(var115);
                                                                                                                                client.field900.method1921(var116);
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3116) {
                                                                                                                                int var117 = field1259[--Statics.field1264];
                                                                                                                                Statics.field2098 -= 2;
                                                                                                                                String var118 = field1258[Statics.field2098];
                                                                                                                                String var119 = field1258[Statics.field2098 + 1];
                                                                                                                                if (var118.length() > 500) {
                                                                                                                                    var77 = 1;
                                                                                                                                } else if (var119.length() > 500) {
                                                                                                                                    var77 = 1;
                                                                                                                                } else {
                                                                                                                                    class185 var120 = class185.method251(class182.field2424, client.field900.field1471);
                                                                                                                                    var120.field2497.method3360(1 + class195.method240(var118) + class195.method240(var119));
                                                                                                                                    var120.field2497.method3250(var119);
                                                                                                                                    var120.field2497.method3243(var117);
                                                                                                                                    var120.field2497.method3250(var118);
                                                                                                                                    client.field900.method1921(var120);
                                                                                                                                    var77 = 1;
                                                                                                                                }
                                                                                                                            } else if (var436 == 3117) {
                                                                                                                                client.field997 = field1259[--Statics.field1264] == 1;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3118) {
                                                                                                                                client.field1050 = field1259[--Statics.field1264] == 1;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3119) {
                                                                                                                                client.field970 = field1259[--Statics.field1264] == 1;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3120) {
                                                                                                                                if (field1259[--Statics.field1264] == 1) {
                                                                                                                                    client.field989 |= 0x1;
                                                                                                                                } else {
                                                                                                                                    client.field989 &= 0xFFFFFFFE;
                                                                                                                                }
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3121) {
                                                                                                                                if (field1259[--Statics.field1264] == 1) {
                                                                                                                                    client.field989 |= 0x2;
                                                                                                                                } else {
                                                                                                                                    client.field989 &= 0xFFFFFFFD;
                                                                                                                                }
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3122) {
                                                                                                                                if (field1259[--Statics.field1264] == 1) {
                                                                                                                                    client.field989 |= 0x4;
                                                                                                                                } else {
                                                                                                                                    client.field989 &= 0xFFFFFFFB;
                                                                                                                                }
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3123) {
                                                                                                                                if (field1259[--Statics.field1264] == 1) {
                                                                                                                                    client.field989 |= 0x8;
                                                                                                                                } else {
                                                                                                                                    client.field989 &= 0xFFFFFFF7;
                                                                                                                                }
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3124) {
                                                                                                                                client.field989 = 0;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3125) {
                                                                                                                                client.field979 = field1259[--Statics.field1264] == 1;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3126) {
                                                                                                                                client.field966 = field1259[--Statics.field1264] == 1;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3127) {
                                                                                                                                boolean var121 = field1259[--Statics.field1264] == 1;
                                                                                                                                client.field998 = var121;
                                                                                                                                var77 = 1;
                                                                                                                            } else if (var436 == 3128) {
                                                                                                                                int[] var122 = field1259;
                                                                                                                                int var123 = ++Statics.field1264 - 1;
                                                                                                                                boolean var124 = client.field998;
                                                                                                                                var122[var123] = var124 ? 1 : 0;
                                                                                                                                var77 = 1;
                                                                                                                            } else {
                                                                                                                                var77 = 2;
                                                                                                                            }
                                                                                                                            var52 = var77;
                                                                                                                        } else if (var436 < 3300) {
                                                                                                                            byte var125;
                                                                                                                            if (var436 == 3200) {
                                                                                                                                Statics.field1264 -= 3;
                                                                                                                                client.method964(field1259[Statics.field1264], field1259[Statics.field1264 + 1], field1259[Statics.field1264 + 2]);
                                                                                                                                var125 = 1;
                                                                                                                            } else if (var436 == 3201) {
                                                                                                                                int var126 = field1259[--Statics.field1264];
                                                                                                                                if (var126 == -1 && !client.field971) {
                                                                                                                                    class230.method3514();
                                                                                                                                } else if (var126 != -1 && client.field1116 != var126 && client.field982 != 0 && !client.field971) {
                                                                                                                                    class264 var127 = Statics.field2129;
                                                                                                                                    int var128 = client.field982;
                                                                                                                                    class230.field2695 = 1;
                                                                                                                                    Statics.field2688 = var127;
                                                                                                                                    Statics.field2692 = var126;
                                                                                                                                    Statics.field1332 = 0;
                                                                                                                                    Statics.field2693 = var128;
                                                                                                                                    Statics.field507 = false;
                                                                                                                                    Statics.field3700 = 2;
                                                                                                                                }
                                                                                                                                client.field1116 = var126;
                                                                                                                                var125 = 1;
                                                                                                                            } else if (var436 == 3202) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var129 = field1259[Statics.field1264];
                                                                                                                                int var130 = field1259[Statics.field1264 + 1];
                                                                                                                                if (client.field982 != 0 && var129 != -1) {
                                                                                                                                    class230.method992(Statics.field771, var129, 0, client.field982, false);
                                                                                                                                    client.field971 = true;
                                                                                                                                }
                                                                                                                                var125 = 1;
                                                                                                                            } else {
                                                                                                                                var125 = 2;
                                                                                                                            }
                                                                                                                            var52 = var125;
                                                                                                                        } else if (var436 < 3400) {
                                                                                                                            byte var131;
                                                                                                                            if (var436 == 3300) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field866;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3301) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var132 = field1259[Statics.field1264];
                                                                                                                                int var133 = field1259[Statics.field1264 + 1];
                                                                                                                                int[] var134 = field1259;
                                                                                                                                int var135 = ++Statics.field1264 - 1;
                                                                                                                                class66 var136 = (class66) class66.field769.method3736((long) var132);
                                                                                                                                int var137;
                                                                                                                                if (var136 == null) {
                                                                                                                                    var137 = -1;
                                                                                                                                } else if (var133 >= 0 && var133 < var136.field768.length) {
                                                                                                                                    var137 = var136.field768[var133];
                                                                                                                                } else {
                                                                                                                                    var137 = -1;
                                                                                                                                }
                                                                                                                                var134[var135] = var137;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3302) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var138 = field1259[Statics.field1264];
                                                                                                                                int var139 = field1259[Statics.field1264 + 1];
                                                                                                                                int[] var140 = field1259;
                                                                                                                                int var141 = ++Statics.field1264 - 1;
                                                                                                                                class66 var142 = (class66) class66.field769.method3736((long) var138);
                                                                                                                                int var143;
                                                                                                                                if (var142 == null) {
                                                                                                                                    var143 = 0;
                                                                                                                                } else if (var139 >= 0 && var139 < var142.field767.length) {
                                                                                                                                    var143 = var142.field767[var139];
                                                                                                                                } else {
                                                                                                                                    var143 = 0;
                                                                                                                                }
                                                                                                                                var140[var141] = var143;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3303) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var144 = field1259[Statics.field1264];
                                                                                                                                int var145 = field1259[Statics.field1264 + 1];
                                                                                                                                field1259[++Statics.field1264 - 1] = class66.method1805(var144, var145);
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3304) {
                                                                                                                                int var146 = field1259[--Statics.field1264];
                                                                                                                                int[] var147 = field1259;
                                                                                                                                int var148 = ++Statics.field1264 - 1;
                                                                                                                                class268 var149 = (class268) class268.field3441.method3707((long) var146);
                                                                                                                                class268 var150;
                                                                                                                                if (var149 == null) {
                                                                                                                                    byte[] var151 = Statics.field3444.method4273(5, var146);
                                                                                                                                    class268 var152 = new class268();
                                                                                                                                    if (var151 != null) {
                                                                                                                                        var152.method4445(new class195(var151));
                                                                                                                                    }
                                                                                                                                    class268.field3441.method3697(var152, (long) var146);
                                                                                                                                    var150 = var152;
                                                                                                                                } else {
                                                                                                                                    var150 = var149;
                                                                                                                                }
                                                                                                                                var147[var148] = var150.field3442;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3305) {
                                                                                                                                int var153 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field906[var153];
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3306) {
                                                                                                                                int var154 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field984[var154];
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3307) {
                                                                                                                                int var155 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field985[var155];
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3308) {
                                                                                                                                int var156 = Statics.field505;
                                                                                                                                int var157 = (Statics.field302.field1186 >> 7) + Statics.field445;
                                                                                                                                int var158 = (Statics.field302.field1151 >> 7) + Statics.field3556;
                                                                                                                                field1259[++Statics.field1264 - 1] = (var156 << 28) + (var157 << 14) + var158;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3309) {
                                                                                                                                int var159 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = var159 >> 14 & 0x3FFF;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3310) {
                                                                                                                                int var160 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = var160 >> 28;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3311) {
                                                                                                                                int var161 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = var161 & 0x3FFF;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3312) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1031 ? 1 : 0;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3313) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var162 = field1259[Statics.field1264] + 32768;
                                                                                                                                int var163 = field1259[Statics.field1264 + 1];
                                                                                                                                int[] var164 = field1259;
                                                                                                                                int var165 = ++Statics.field1264 - 1;
                                                                                                                                class66 var166 = (class66) class66.field769.method3736((long) var162);
                                                                                                                                int var167;
                                                                                                                                if (var166 == null) {
                                                                                                                                    var167 = -1;
                                                                                                                                } else if (var163 >= 0 && var163 < var166.field768.length) {
                                                                                                                                    var167 = var166.field768[var163];
                                                                                                                                } else {
                                                                                                                                    var167 = -1;
                                                                                                                                }
                                                                                                                                var164[var165] = var167;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3314) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var168 = field1259[Statics.field1264] + 32768;
                                                                                                                                int var169 = field1259[Statics.field1264 + 1];
                                                                                                                                int[] var170 = field1259;
                                                                                                                                int var171 = ++Statics.field1264 - 1;
                                                                                                                                class66 var172 = (class66) class66.field769.method3736((long) var168);
                                                                                                                                int var173;
                                                                                                                                if (var172 == null) {
                                                                                                                                    var173 = 0;
                                                                                                                                } else if (var169 >= 0 && var169 < var172.field767.length) {
                                                                                                                                    var173 = var172.field767[var169];
                                                                                                                                } else {
                                                                                                                                    var173 = 0;
                                                                                                                                }
                                                                                                                                var170[var171] = var173;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3315) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var174 = field1259[Statics.field1264] + 32768;
                                                                                                                                int var175 = field1259[Statics.field1264 + 1];
                                                                                                                                field1259[++Statics.field1264 - 1] = class66.method1805(var174, var175);
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3316) {
                                                                                                                                if (client.field1018 >= 2) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = client.field1018;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                }
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3317) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1070;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3318) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1084;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3321) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1016;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3322) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1017;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3323) {
                                                                                                                                if (client.field1020) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                }
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3324) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field858;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var436 == 3325) {
                                                                                                                                Statics.field1264 -= 4;
                                                                                                                                int var176 = field1259[Statics.field1264];
                                                                                                                                int var177 = field1259[Statics.field1264 + 1];
                                                                                                                                int var178 = field1259[Statics.field1264 + 2];
                                                                                                                                int var179 = field1259[Statics.field1264 + 3];
                                                                                                                                int var180 = (var177 << 14) + var176;
                                                                                                                                int var181 = (var178 << 28) + var180;
                                                                                                                                int var182 = var179 + var181;
                                                                                                                                field1259[++Statics.field1264 - 1] = var182;
                                                                                                                                var131 = 1;
                                                                                                                            } else {
                                                                                                                                var131 = 2;
                                                                                                                            }
                                                                                                                            var52 = var131;
                                                                                                                        } else if (var436 < 3500) {
                                                                                                                            byte var187;
                                                                                                                            if (var436 == 3400) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var183 = field1259[Statics.field1264];
                                                                                                                                int var184 = field1259[Statics.field1264 + 1];
                                                                                                                                class281 var185 = class281.method3169(var183);
                                                                                                                                if (var185.field3562 != 's') {
                                                                                                                                }
                                                                                                                                for (int var186 = 0; var186 < var185.field3558; var186++) {
                                                                                                                                    if (var185.field3559[var186] == var184) {
                                                                                                                                        field1258[++Statics.field2098 - 1] = var185.field3563[var186];
                                                                                                                                        var185 = null;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var185 != null) {
                                                                                                                                    field1258[++Statics.field2098 - 1] = var185.field3555;
                                                                                                                                }
                                                                                                                                var187 = 1;
                                                                                                                            } else if (var436 == 3408) {
                                                                                                                                Statics.field1264 -= 4;
                                                                                                                                int var188 = field1259[Statics.field1264];
                                                                                                                                int var189 = field1259[Statics.field1264 + 1];
                                                                                                                                int var190 = field1259[Statics.field1264 + 2];
                                                                                                                                int var191 = field1259[Statics.field1264 + 3];
                                                                                                                                class281 var192 = class281.method3169(var190);
                                                                                                                                if (var192.field3554 == var188 && var192.field3562 == var189) {
                                                                                                                                    for (int var193 = 0; var193 < var192.field3558; var193++) {
                                                                                                                                        if (var192.field3559[var193] == var191) {
                                                                                                                                            if (var189 == 115) {
                                                                                                                                                field1258[++Statics.field2098 - 1] = var192.field3563[var193];
                                                                                                                                            } else {
                                                                                                                                                field1259[++Statics.field1264 - 1] = var192.field3552[var193];
                                                                                                                                            }
                                                                                                                                            var192 = null;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var192 != null) {
                                                                                                                                        if (var189 == 115) {
                                                                                                                                            field1258[++Statics.field2098 - 1] = var192.field3555;
                                                                                                                                        } else {
                                                                                                                                            field1259[++Statics.field1264 - 1] = var192.field3561;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var187 = 1;
                                                                                                                                } else {
                                                                                                                                    if (var189 == 115) {
                                                                                                                                        field1258[++Statics.field2098 - 1] = class252.field3160;
                                                                                                                                    } else {
                                                                                                                                        field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                    }
                                                                                                                                    var187 = 1;
                                                                                                                                }
                                                                                                                            } else if (var436 == 3411) {
                                                                                                                                int var194 = field1259[--Statics.field1264];
                                                                                                                                class281 var195 = class281.method3169(var194);
                                                                                                                                field1259[++Statics.field1264 - 1] = var195.method4659();
                                                                                                                                var187 = 1;
                                                                                                                            } else {
                                                                                                                                var187 = 2;
                                                                                                                            }
                                                                                                                            var52 = var187;
                                                                                                                        } else if (var436 < 3700) {
                                                                                                                            byte var196;
                                                                                                                            if (var436 == 3600) {
                                                                                                                                if (Statics.field1319.field1239 == 0) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -2;
                                                                                                                                } else if (Statics.field1319.field1239 == 1) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = Statics.field1319.field1236.method5000();
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3601) {
                                                                                                                                int var197 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field1319.method1572() && var197 >= 0 && var197 < Statics.field1319.field1236.method5000()) {
                                                                                                                                    class307 var198 = (class307) Statics.field1319.field1236.method5009(var197);
                                                                                                                                    field1258[++Statics.field2098 - 1] = var198.method4958();
                                                                                                                                    field1258[++Statics.field2098 - 1] = var198.method4959();
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3602) {
                                                                                                                                int var199 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field1319.method1572() && var199 >= 0 && var199 < Statics.field1319.field1236.method5000()) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = ((class302) Statics.field1319.field1236.method5009(var199)).field3840;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3603) {
                                                                                                                                int var200 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field1319.method1572() && var200 >= 0 && var200 < Statics.field1319.field1236.method5000()) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = ((class302) Statics.field1319.field1236.method5009(var200)).field3839;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3604) {
                                                                                                                                String var201 = field1258[--Statics.field2098];
                                                                                                                                int var202 = field1259[--Statics.field1264];
                                                                                                                                class80.method502(var201, var202);
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3605) {
                                                                                                                                String var203 = field1258[--Statics.field2098];
                                                                                                                                Statics.field1319.method1602(var203);
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3606) {
                                                                                                                                String var204 = field1258[--Statics.field2098];
                                                                                                                                Statics.field1319.method1583(var204);
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3607) {
                                                                                                                                String var205 = field1258[--Statics.field2098];
                                                                                                                                Statics.field1319.method1581(var205);
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3608) {
                                                                                                                                String var206 = field1258[--Statics.field2098];
                                                                                                                                Statics.field1319.method1584(var206);
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3609) {
                                                                                                                                String var207 = field1258[--Statics.field2098];
                                                                                                                                String var208 = client.method545(var207);
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field1319.method1630(new class306(var208, Statics.field347), false) ? 1 : 0;
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3611) {
                                                                                                                                if (Statics.field785 == null) {
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = Statics.field785.field3859;
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3612) {
                                                                                                                                if (Statics.field785 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = Statics.field785.method5000();
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3613) {
                                                                                                                                int var209 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field785 == null || var209 >= Statics.field785.method5000()) {
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = Statics.field785.method5009(var209).method4975().method5095();
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3614) {
                                                                                                                                int var210 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field785 == null || var210 >= Statics.field785.method5000()) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = ((class302) Statics.field785.method5009(var210)).method5079();
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3615) {
                                                                                                                                int var211 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field785 == null || var211 >= Statics.field785.method5000()) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = ((class302) Statics.field785.method5009(var211)).field3839;
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3616) {
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field785 == null ? 0 : Statics.field785.field3861;
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3617) {
                                                                                                                                String var212 = field1258[--Statics.field2098];
                                                                                                                                client.method77(var212);
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3618) {
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field785 == null ? 0 : Statics.field785.field3862;
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3619) {
                                                                                                                                String var213 = field1258[--Statics.field2098];
                                                                                                                                client.method503(var213);
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3620) {
                                                                                                                                class185 var214 = class185.method251(class182.field2376, client.field900.field1471);
                                                                                                                                var214.field2497.method3243(0);
                                                                                                                                client.field900.method1921(var214);
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3621) {
                                                                                                                                if (Statics.field1319.method1572()) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = Statics.field1319.field1234.method5000();
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3622) {
                                                                                                                                int var215 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field1319.method1572() && var215 >= 0 && var215 < Statics.field1319.field1234.method5000()) {
                                                                                                                                    class301 var216 = (class301) Statics.field1319.field1234.method5009(var215);
                                                                                                                                    field1258[++Statics.field2098 - 1] = var216.method4958();
                                                                                                                                    field1258[++Statics.field2098 - 1] = var216.method4959();
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3623) {
                                                                                                                                String var217 = field1258[--Statics.field2098];
                                                                                                                                String var218 = client.method545(var217);
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field1319.method1578(new class306(var218, Statics.field347)) ? 1 : 0;
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3624) {
                                                                                                                                int var219 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field785 == null || var219 >= Statics.field785.method5000() || !Statics.field785.method5009(var219).method4975().equals(Statics.field302.field848)) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 1;
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3625) {
                                                                                                                                if (Statics.field785 == null || Statics.field785.field3857 == null) {
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = Statics.field785.field3857;
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3626) {
                                                                                                                                int var220 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field785 == null || var220 >= Statics.field785.method5000() || !((class296) Statics.field785.method5009(var220)).method4936()) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 1;
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3627) {
                                                                                                                                int var221 = field1259[--Statics.field1264];
                                                                                                                                if (Statics.field785 == null || var221 >= Statics.field785.method5000() || !((class296) Statics.field785.method5009(var221)).method4939()) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 1;
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3628) {
                                                                                                                                Statics.field1319.field1236.method5023();
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3629) {
                                                                                                                                boolean var222 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class322(var222));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3630) {
                                                                                                                                boolean var223 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class323(var223));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3631) {
                                                                                                                                boolean var224 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class156(var224));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3632) {
                                                                                                                                boolean var225 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class150(var225));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3633) {
                                                                                                                                boolean var226 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class155(var226));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3634) {
                                                                                                                                boolean var227 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class158(var227));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3635) {
                                                                                                                                boolean var228 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class154(var228));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3636) {
                                                                                                                                boolean var229 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class152(var229));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3637) {
                                                                                                                                boolean var230 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class151(var230));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3638) {
                                                                                                                                boolean var231 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class153(var231));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3639) {
                                                                                                                                Statics.field1319.field1236.method5010();
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3640) {
                                                                                                                                Statics.field1319.field1234.method5023();
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3641) {
                                                                                                                                boolean var232 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1234.method5018(new class322(var232));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3642) {
                                                                                                                                boolean var233 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1234.method5018(new class323(var233));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3643) {
                                                                                                                                Statics.field1319.field1234.method5010();
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3644) {
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5023();
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3645) {
                                                                                                                                boolean var234 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class322(var234));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3646) {
                                                                                                                                boolean var235 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class323(var235));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3647) {
                                                                                                                                boolean var236 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class156(var236));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3648) {
                                                                                                                                boolean var237 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class150(var237));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3649) {
                                                                                                                                boolean var238 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class155(var238));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3650) {
                                                                                                                                boolean var239 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class158(var239));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3651) {
                                                                                                                                boolean var240 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class154(var240));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3652) {
                                                                                                                                boolean var241 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class152(var241));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3653) {
                                                                                                                                boolean var242 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class151(var242));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3654) {
                                                                                                                                boolean var243 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class153(var243));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3655) {
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5010();
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3656) {
                                                                                                                                boolean var244 = field1259[--Statics.field1264] == 1;
                                                                                                                                Statics.field1319.field1236.method5018(new class157(var244));
                                                                                                                                var196 = 1;
                                                                                                                            } else if (var436 == 3657) {
                                                                                                                                boolean var245 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field785 != null) {
                                                                                                                                    Statics.field785.method5018(new class157(var245));
                                                                                                                                }
                                                                                                                                var196 = 1;
                                                                                                                            } else {
                                                                                                                                var196 = 2;
                                                                                                                            }
                                                                                                                            var52 = var196;
                                                                                                                        } else if (var436 < 4000) {
                                                                                                                            byte var247;
                                                                                                                            if (var436 == 3903) {
                                                                                                                                int var246 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1115[var246].method91();
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3904) {
                                                                                                                                int var248 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1115[var248].field307;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3905) {
                                                                                                                                int var249 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1115[var249].field306;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3906) {
                                                                                                                                int var250 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1115[var250].field314;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3907) {
                                                                                                                                int var251 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1115[var251].field309;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3908) {
                                                                                                                                int var252 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.field1115[var252].field311;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3910) {
                                                                                                                                int var253 = field1259[--Statics.field1264];
                                                                                                                                int var254 = client.field1115[var253].method93();
                                                                                                                                field1259[++Statics.field1264 - 1] = var254 == 0 ? 1 : 0;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3911) {
                                                                                                                                int var255 = field1259[--Statics.field1264];
                                                                                                                                int var256 = client.field1115[var255].method93();
                                                                                                                                field1259[++Statics.field1264 - 1] = var256 == 2 ? 1 : 0;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3912) {
                                                                                                                                int var257 = field1259[--Statics.field1264];
                                                                                                                                int var258 = client.field1115[var257].method93();
                                                                                                                                field1259[++Statics.field1264 - 1] = var258 == 5 ? 1 : 0;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3913) {
                                                                                                                                int var259 = field1259[--Statics.field1264];
                                                                                                                                int var260 = client.field1115[var259].method93();
                                                                                                                                field1259[++Statics.field1264 - 1] = var260 == 1 ? 1 : 0;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3914) {
                                                                                                                                boolean var261 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field2095 != null) {
                                                                                                                                    Statics.field2095.method68(class14.field287, var261);
                                                                                                                                }
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3915) {
                                                                                                                                boolean var262 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field2095 != null) {
                                                                                                                                    Statics.field2095.method68(class14.field284, var262);
                                                                                                                                }
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3916) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                boolean var263 = field1259[Statics.field1264] == 1;
                                                                                                                                boolean var264 = field1259[Statics.field1264 + 1] == 1;
                                                                                                                                if (Statics.field2095 != null) {
                                                                                                                                    client.field859.field854 = var264;
                                                                                                                                    Statics.field2095.method68(client.field859, var263);
                                                                                                                                }
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3917) {
                                                                                                                                boolean var265 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field2095 != null) {
                                                                                                                                    Statics.field2095.method68(class14.field285, var265);
                                                                                                                                }
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3918) {
                                                                                                                                boolean var266 = field1259[--Statics.field1264] == 1;
                                                                                                                                if (Statics.field2095 != null) {
                                                                                                                                    Statics.field2095.method68(class14.field286, var266);
                                                                                                                                }
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3919) {
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field2095 == null ? 0 : Statics.field2095.field283.size();
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3920) {
                                                                                                                                int var267 = field1259[--Statics.field1264];
                                                                                                                                class15 var268 = (class15) Statics.field2095.field283.get(var267);
                                                                                                                                field1259[++Statics.field1264 - 1] = var268.field292;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3921) {
                                                                                                                                int var269 = field1259[--Statics.field1264];
                                                                                                                                class15 var270 = (class15) Statics.field2095.field283.get(var269);
                                                                                                                                field1258[++Statics.field2098 - 1] = var270.method76();
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3922) {
                                                                                                                                int var271 = field1259[--Statics.field1264];
                                                                                                                                class15 var272 = (class15) Statics.field2095.field283.get(var271);
                                                                                                                                field1258[++Statics.field2098 - 1] = var272.method75();
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3923) {
                                                                                                                                int var273 = field1259[--Statics.field1264];
                                                                                                                                class15 var274 = (class15) Statics.field2095.field283.get(var273);
                                                                                                                                long var275 = class197.method1501() - Statics.field3304 - var274.field290;
                                                                                                                                int var277 = (int) (var275 / 3600000L);
                                                                                                                                int var278 = (int) ((var275 - (long) (var277 * 3600000)) / 60000L);
                                                                                                                                int var279 = (int) ((var275 - (long) (var277 * 3600000) - (long) (var278 * 60000)) / 1000L);
                                                                                                                                String var280 = var277 + ":" + var278 / 10 + var278 % 10 + ":" + var279 / 10 + var279 % 10;
                                                                                                                                field1258[++Statics.field2098 - 1] = var280;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3924) {
                                                                                                                                int var281 = field1259[--Statics.field1264];
                                                                                                                                class15 var282 = (class15) Statics.field2095.field283.get(var281);
                                                                                                                                field1259[++Statics.field1264 - 1] = var282.field291.field314;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3925) {
                                                                                                                                int var283 = field1259[--Statics.field1264];
                                                                                                                                class15 var284 = (class15) Statics.field2095.field283.get(var283);
                                                                                                                                field1259[++Statics.field1264 - 1] = var284.field291.field306;
                                                                                                                                var247 = 1;
                                                                                                                            } else if (var436 == 3926) {
                                                                                                                                int var285 = field1259[--Statics.field1264];
                                                                                                                                class15 var286 = (class15) Statics.field2095.field283.get(var285);
                                                                                                                                field1259[++Statics.field1264 - 1] = var286.field291.field307;
                                                                                                                                var247 = 1;
                                                                                                                            } else {
                                                                                                                                var247 = 2;
                                                                                                                            }
                                                                                                                            var52 = var247;
                                                                                                                        } else if (var436 < 4100) {
                                                                                                                            var52 = method2957(var436, var13, var51);
                                                                                                                        } else if (var436 < 4200) {
                                                                                                                            byte var289;
                                                                                                                            if (var436 == 4100) {
                                                                                                                                String var287 = field1258[--Statics.field2098];
                                                                                                                                int var288 = field1259[--Statics.field1264];
                                                                                                                                field1258[++Statics.field2098 - 1] = var287 + var288;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4101) {
                                                                                                                                Statics.field2098 -= 2;
                                                                                                                                String var290 = field1258[Statics.field2098];
                                                                                                                                String var291 = field1258[Statics.field2098 + 1];
                                                                                                                                field1258[++Statics.field2098 - 1] = var290 + var291;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4102) {
                                                                                                                                String var292 = field1258[--Statics.field2098];
                                                                                                                                int var293 = field1259[--Statics.field1264];
                                                                                                                                String[] var294 = field1258;
                                                                                                                                int var295 = ++Statics.field2098 - 1;
                                                                                                                                String var297;
                                                                                                                                if (var293 < 0) {
                                                                                                                                    var297 = Integer.toString(var293);
                                                                                                                                } else {
                                                                                                                                    int var298 = var293;
                                                                                                                                    String var299;
                                                                                                                                    if (var293 < 0) {
                                                                                                                                        var299 = Integer.toString(var293, 10);
                                                                                                                                    } else {
                                                                                                                                        int var300 = 2;
                                                                                                                                        int var301 = var293 / 10;
                                                                                                                                        while (var301 != 0) {
                                                                                                                                            var301 /= 10;
                                                                                                                                            var300++;
                                                                                                                                        }
                                                                                                                                        char[] var302 = new char[var300];
                                                                                                                                        var302[0] = '+';
                                                                                                                                        for (int var303 = var300 - 1; var303 > 0; var303--) {
                                                                                                                                            int var304 = var298;
                                                                                                                                            var298 /= 10;
                                                                                                                                            int var305 = var304 - var298 * 10;
                                                                                                                                            if (var305 >= 10) {
                                                                                                                                                var302[var303] = (char) (var305 + 87);
                                                                                                                                            } else {
                                                                                                                                                var302[var303] = (char) (var305 + 48);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var299 = new String(var302);
                                                                                                                                    }
                                                                                                                                    var297 = var299;
                                                                                                                                }
                                                                                                                                var294[var295] = var292 + var297;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4103) {
                                                                                                                                String var306 = field1258[--Statics.field2098];
                                                                                                                                field1258[++Statics.field2098 - 1] = var306.toLowerCase();
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4104) {
                                                                                                                                int var307 = field1259[--Statics.field1264];
                                                                                                                                long var308 = ((long) var307 + 11745L) * 86400000L;
                                                                                                                                field1269.setTime(new Date(var308));
                                                                                                                                int var310 = field1269.get(5);
                                                                                                                                int var311 = field1269.get(2);
                                                                                                                                int var312 = field1269.get(1);
                                                                                                                                field1258[++Statics.field2098 - 1] = var310 + "-" + field1270[var311] + "-" + var312;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4105) {
                                                                                                                                Statics.field2098 -= 2;
                                                                                                                                String var313 = field1258[Statics.field2098];
                                                                                                                                String var314 = field1258[Statics.field2098 + 1];
                                                                                                                                if (Statics.field302.field824 != null && Statics.field302.field824.field2795) {
                                                                                                                                    field1258[++Statics.field2098 - 1] = var314;
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = var313;
                                                                                                                                }
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4106) {
                                                                                                                                int var315 = field1259[--Statics.field1264];
                                                                                                                                field1258[++Statics.field2098 - 1] = Integer.toString(var315);
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4107) {
                                                                                                                                Statics.field2098 -= 2;
                                                                                                                                int[] var316 = field1259;
                                                                                                                                int var317 = ++Statics.field1264 - 1;
                                                                                                                                int var318 = class186.method2371(field1258[Statics.field2098], field1258[Statics.field2098 + 1], client.field863);
                                                                                                                                byte var319;
                                                                                                                                if (var318 > 0) {
                                                                                                                                    var319 = 1;
                                                                                                                                } else if (var318 < 0) {
                                                                                                                                    var319 = -1;
                                                                                                                                } else {
                                                                                                                                    var319 = 0;
                                                                                                                                }
                                                                                                                                var316[var317] = var319;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4108) {
                                                                                                                                String var320 = field1258[--Statics.field2098];
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var321 = field1259[Statics.field1264];
                                                                                                                                int var322 = field1259[Statics.field1264 + 1];
                                                                                                                                byte[] var323 = Statics.field336.method4273(var322, 0);
                                                                                                                                class312 var324 = new class312(var323);
                                                                                                                                field1259[++Statics.field1264 - 1] = var324.method5160(var320, var321);
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4109) {
                                                                                                                                String var325 = field1258[--Statics.field2098];
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var326 = field1259[Statics.field1264];
                                                                                                                                int var327 = field1259[Statics.field1264 + 1];
                                                                                                                                byte[] var328 = Statics.field336.method4273(var327, 0);
                                                                                                                                class312 var329 = new class312(var328);
                                                                                                                                field1259[++Statics.field1264 - 1] = var329.method5205(var325, var326);
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4110) {
                                                                                                                                Statics.field2098 -= 2;
                                                                                                                                String var330 = field1258[Statics.field2098];
                                                                                                                                String var331 = field1258[Statics.field2098 + 1];
                                                                                                                                if (field1259[--Statics.field1264] == 1) {
                                                                                                                                    field1258[++Statics.field2098 - 1] = var330;
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = var331;
                                                                                                                                }
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4111) {
                                                                                                                                String var332 = field1258[--Statics.field2098];
                                                                                                                                field1258[++Statics.field2098 - 1] = class313.method5161(var332);
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4112) {
                                                                                                                                String var333 = field1258[--Statics.field2098];
                                                                                                                                int var334 = field1259[--Statics.field1264];
                                                                                                                                field1258[++Statics.field2098 - 1] = var333 + (char) var334;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4113) {
                                                                                                                                int var335 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = class319.method1081((char) var335) ? 1 : 0;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4114) {
                                                                                                                                int var336 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = class319.method3512((char) var336) ? 1 : 0;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4115) {
                                                                                                                                int var337 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = class319.method3597((char) var337) ? 1 : 0;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4116) {
                                                                                                                                int var338 = field1259[--Statics.field1264];
                                                                                                                                int[] var339 = field1259;
                                                                                                                                int var340 = ++Statics.field1264 - 1;
                                                                                                                                char var341 = (char) var338;
                                                                                                                                boolean var342 = var341 >= '0' && var341 <= '9';
                                                                                                                                var339[var340] = var342 ? 1 : 0;
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4117) {
                                                                                                                                String var343 = field1258[--Statics.field2098];
                                                                                                                                if (var343 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var343.length();
                                                                                                                                }
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4118) {
                                                                                                                                String var344 = field1258[--Statics.field2098];
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var345 = field1259[Statics.field1264];
                                                                                                                                int var346 = field1259[Statics.field1264 + 1];
                                                                                                                                field1258[++Statics.field2098 - 1] = var344.substring(var345, var346);
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4119) {
                                                                                                                                String var347 = field1258[--Statics.field2098];
                                                                                                                                StringBuilder var348 = new StringBuilder(var347.length());
                                                                                                                                boolean var349 = false;
                                                                                                                                for (int var350 = 0; var350 < var347.length(); var350++) {
                                                                                                                                    char var351 = var347.charAt(var350);
                                                                                                                                    if (var351 == '<') {
                                                                                                                                        var349 = true;
                                                                                                                                    } else if (var351 == '>') {
                                                                                                                                        var349 = false;
                                                                                                                                    } else if (!var349) {
                                                                                                                                        var348.append(var351);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                field1258[++Statics.field2098 - 1] = var348.toString();
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4120) {
                                                                                                                                String var352 = field1258[--Statics.field2098];
                                                                                                                                int var353 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = var352.indexOf(var353);
                                                                                                                                var289 = 1;
                                                                                                                            } else if (var436 == 4121) {
                                                                                                                                Statics.field2098 -= 2;
                                                                                                                                String var354 = field1258[Statics.field2098];
                                                                                                                                String var355 = field1258[Statics.field2098 + 1];
                                                                                                                                int var356 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = var354.indexOf(var355, var356);
                                                                                                                                var289 = 1;
                                                                                                                            } else {
                                                                                                                                var289 = 2;
                                                                                                                            }
                                                                                                                            var52 = var289;
                                                                                                                        } else if (var436 < 4300) {
                                                                                                                            var52 = method50(var436, var13, var51);
                                                                                                                        } else if (var436 < 5100) {
                                                                                                                            var52 = method4167(var436, var13, var51);
                                                                                                                        } else if (var436 < 5400) {
                                                                                                                            byte var357;
                                                                                                                            if (var436 == 5306) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method238();
                                                                                                                                var357 = 1;
                                                                                                                            } else if (var436 == 5307) {
                                                                                                                                int var358 = field1259[--Statics.field1264];
                                                                                                                                if (var358 == 1 || var358 == 2) {
                                                                                                                                    client.field1062 = 0L;
                                                                                                                                    if (var358 >= 2) {
                                                                                                                                        client.field1063 = true;
                                                                                                                                    } else {
                                                                                                                                        client.field1063 = false;
                                                                                                                                    }
                                                                                                                                    if (client.method238() == 1) {
                                                                                                                                        Statics.field357.method788(765, 503);
                                                                                                                                    } else {
                                                                                                                                        Statics.field357.method788(7680, 2160);
                                                                                                                                    }
                                                                                                                                    if (client.field986 >= 25) {
                                                                                                                                        class185 var359 = class185.method251(class182.field2416, client.field900.field1471);
                                                                                                                                        var359.field2497.method3243(client.method238());
                                                                                                                                        var359.field2497.method3360(Statics.field695);
                                                                                                                                        var359.field2497.method3360(Statics.field2582);
                                                                                                                                        client.field900.method1921(var359);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var357 = 1;
                                                                                                                            } else if (var436 == 5308) {
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field663.field1226;
                                                                                                                                var357 = 1;
                                                                                                                            } else if (var436 == 5309) {
                                                                                                                                int var360 = field1259[--Statics.field1264];
                                                                                                                                if (var360 == 1 || var360 == 2) {
                                                                                                                                    Statics.field663.field1226 = var360;
                                                                                                                                    class79.method1027();
                                                                                                                                }
                                                                                                                                var357 = 1;
                                                                                                                            } else {
                                                                                                                                var357 = 2;
                                                                                                                            }
                                                                                                                            var52 = var357;
                                                                                                                        } else if (var436 < 5600) {
                                                                                                                            var52 = method2970(var436, var13, var51);
                                                                                                                        } else if (var436 < 5700) {
                                                                                                                            var52 = method55(var436, var13, var51);
                                                                                                                        } else if (var436 < 6300) {
                                                                                                                            var52 = method225(var436, var13, var51);
                                                                                                                        } else if (var436 < 6600) {
                                                                                                                            var52 = method248(var436, var13, var51);
                                                                                                                        } else if (var436 < 6700) {
                                                                                                                            byte var364;
                                                                                                                            if (var436 == 6600) {
                                                                                                                                int var361 = Statics.field505;
                                                                                                                                int var362 = (Statics.field302.field1186 >> 7) + Statics.field445;
                                                                                                                                int var363 = (Statics.field302.field1151 >> 7) + Statics.field3556;
                                                                                                                                client.method2904().method5705(var361, var362, var363, true);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6601) {
                                                                                                                                int var365 = field1259[--Statics.field1264];
                                                                                                                                String var366 = "";
                                                                                                                                class33 var367 = client.method2904().method5710(var365);
                                                                                                                                if (var367 != null) {
                                                                                                                                    var366 = var367.method254();
                                                                                                                                }
                                                                                                                                field1258[++Statics.field2098 - 1] = var366;
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6602) {
                                                                                                                                int var368 = field1259[--Statics.field1264];
                                                                                                                                client.method2904().method5614(var368);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6603) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5627();
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6604) {
                                                                                                                                int var369 = field1259[--Statics.field1264];
                                                                                                                                client.method2904().method5624(var369);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6605) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5649() ? 1 : 0;
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6606) {
                                                                                                                                class239 var370 = new class239(field1259[--Statics.field1264]);
                                                                                                                                client.method2904().method5631(var370.field2791, var370.field2789);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6607) {
                                                                                                                                class239 var371 = new class239(field1259[--Statics.field1264]);
                                                                                                                                client.method2904().method5608(var371.field2791, var371.field2789);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6608) {
                                                                                                                                class239 var372 = new class239(field1259[--Statics.field1264]);
                                                                                                                                client.method2904().method5696(var372.field2790, var372.field2791, var372.field2789);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6609) {
                                                                                                                                class239 var373 = new class239(field1259[--Statics.field1264]);
                                                                                                                                client.method2904().method5634(var373.field2790, var373.field2791, var373.field2789);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6610) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5725();
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5636();
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6611) {
                                                                                                                                int var374 = field1259[--Statics.field1264];
                                                                                                                                class33 var375 = client.method2904().method5710(var374);
                                                                                                                                if (var375 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var375.method273().method4124();
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6612) {
                                                                                                                                int var376 = field1259[--Statics.field1264];
                                                                                                                                class33 var377 = client.method2904().method5710(var376);
                                                                                                                                if (var377 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = (var377.method266() - var377.method278() + 1) * 64;
                                                                                                                                    field1259[++Statics.field1264 - 1] = (var377.method314() - var377.method268() + 1) * 64;
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6613) {
                                                                                                                                int var378 = field1259[--Statics.field1264];
                                                                                                                                class33 var379 = client.method2904().method5710(var378);
                                                                                                                                if (var379 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var379.method278() * 64;
                                                                                                                                    field1259[++Statics.field1264 - 1] = var379.method268() * 64;
                                                                                                                                    field1259[++Statics.field1264 - 1] = var379.method266() * 64 + 64 - 1;
                                                                                                                                    field1259[++Statics.field1264 - 1] = var379.method314() * 64 + 64 - 1;
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6614) {
                                                                                                                                int var380 = field1259[--Statics.field1264];
                                                                                                                                class33 var381 = client.method2904().method5710(var380);
                                                                                                                                if (var381 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var381.method295();
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6615) {
                                                                                                                                class239 var382 = client.method2904().method5637();
                                                                                                                                if (var382 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var382.field2791;
                                                                                                                                    field1259[++Statics.field1264 - 1] = var382.field2789;
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6616) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5615();
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6617) {
                                                                                                                                class239 var383 = new class239(field1259[--Statics.field1264]);
                                                                                                                                class33 var384 = client.method2904().method5616();
                                                                                                                                if (var384 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                    var364 = 1;
                                                                                                                                } else {
                                                                                                                                    int[] var385 = var384.method257(var383.field2790, var383.field2791, var383.field2789);
                                                                                                                                    if (var385 == null) {
                                                                                                                                        field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                        field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1259[++Statics.field1264 - 1] = var385[0];
                                                                                                                                        field1259[++Statics.field1264 - 1] = var385[1];
                                                                                                                                    }
                                                                                                                                    var364 = 1;
                                                                                                                                }
                                                                                                                            } else if (var436 == 6618) {
                                                                                                                                class239 var386 = new class239(field1259[--Statics.field1264]);
                                                                                                                                class33 var387 = client.method2904().method5616();
                                                                                                                                if (var387 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                    var364 = 1;
                                                                                                                                } else {
                                                                                                                                    class239 var388 = var387.method258(var386.field2791, var386.field2789);
                                                                                                                                    if (var388 == null) {
                                                                                                                                        field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                    } else {
                                                                                                                                        field1259[++Statics.field1264 - 1] = var388.method4124();
                                                                                                                                    }
                                                                                                                                    var364 = 1;
                                                                                                                                }
                                                                                                                            } else if (var436 == 6619) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var389 = field1259[Statics.field1264];
                                                                                                                                class239 var390 = new class239(field1259[Statics.field1264 + 1]);
                                                                                                                                class33 var391 = client.method2904().method5710(var389);
                                                                                                                                int var392 = Statics.field302.field845;
                                                                                                                                int var393 = (Statics.field302.field1186 >> 7) + Statics.field445;
                                                                                                                                int var394 = (Statics.field302.field1151 >> 7) + Statics.field3556;
                                                                                                                                class239 var395 = new class239(var392, var393, var394);
                                                                                                                                client.method2904().method5619(var391, var395, var390, false);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6620) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var396 = field1259[Statics.field1264];
                                                                                                                                class239 var397 = new class239(field1259[Statics.field1264 + 1]);
                                                                                                                                class33 var398 = client.method2904().method5710(var396);
                                                                                                                                int var399 = Statics.field302.field845;
                                                                                                                                int var400 = (Statics.field302.field1186 >> 7) + Statics.field445;
                                                                                                                                int var401 = (Statics.field302.field1151 >> 7) + Statics.field3556;
                                                                                                                                class239 var402 = new class239(var399, var400, var401);
                                                                                                                                client.method2904().method5619(var398, var402, var397, true);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6621) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var403 = field1259[Statics.field1264];
                                                                                                                                class239 var404 = new class239(field1259[Statics.field1264 + 1]);
                                                                                                                                class33 var405 = client.method2904().method5710(var403);
                                                                                                                                if (var405 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = 0;
                                                                                                                                    var364 = 1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var405.method256(var404.field2790, var404.field2791, var404.field2789) ? 1 : 0;
                                                                                                                                    var364 = 1;
                                                                                                                                }
                                                                                                                            } else if (var436 == 6622) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5638();
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5639();
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6623) {
                                                                                                                                class239 var406 = new class239(field1259[--Statics.field1264]);
                                                                                                                                class33 var407 = client.method2904().method5612(var406.field2790, var406.field2791, var406.field2789);
                                                                                                                                if (var407 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var407.method260();
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6624) {
                                                                                                                                client.method2904().method5640(field1259[--Statics.field1264]);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6625) {
                                                                                                                                client.method2904().method5732();
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6626) {
                                                                                                                                client.method2904().method5684(field1259[--Statics.field1264]);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6627) {
                                                                                                                                client.method2904().method5766();
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6628) {
                                                                                                                                boolean var408 = field1259[--Statics.field1264] == 1;
                                                                                                                                client.method2904().method5662(var408);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6629) {
                                                                                                                                int var409 = field1259[--Statics.field1264];
                                                                                                                                client.method2904().method5759(var409);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6630) {
                                                                                                                                int var410 = field1259[--Statics.field1264];
                                                                                                                                client.method2904().method5609(var410);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6631) {
                                                                                                                                client.method2904().method5647();
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6632) {
                                                                                                                                boolean var411 = field1259[--Statics.field1264] == 1;
                                                                                                                                client.method2904().method5648(var411);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6633) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var412 = field1259[Statics.field1264];
                                                                                                                                boolean var413 = field1259[Statics.field1264 + 1] == 1;
                                                                                                                                client.method2904().method5642(var412, var413);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6634) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var414 = field1259[Statics.field1264];
                                                                                                                                boolean var415 = field1259[Statics.field1264 + 1] == 1;
                                                                                                                                client.method2904().method5650(var414, var415);
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6635) {
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5701() ? 1 : 0;
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6636) {
                                                                                                                                int var416 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5618(var416) ? 1 : 0;
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6637) {
                                                                                                                                int var417 = field1259[--Statics.field1264];
                                                                                                                                field1259[++Statics.field1264 - 1] = client.method2904().method5653(var417) ? 1 : 0;
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6638) {
                                                                                                                                Statics.field1264 -= 2;
                                                                                                                                int var418 = field1259[Statics.field1264];
                                                                                                                                class239 var419 = new class239(field1259[Statics.field1264 + 1]);
                                                                                                                                class239 var420 = client.method2904().method5656(var418, var419);
                                                                                                                                if (var420 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var420.method4124();
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6639) {
                                                                                                                                class41 var421 = client.method2904().method5644();
                                                                                                                                if (var421 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var421.field536;
                                                                                                                                    field1259[++Statics.field1264 - 1] = var421.field532.method4124();
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6640) {
                                                                                                                                class41 var422 = client.method2904().method5659();
                                                                                                                                if (var422 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var422.field536;
                                                                                                                                    field1259[++Statics.field1264 - 1] = var422.field532.method4124();
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6693) {
                                                                                                                                int var423 = field1259[--Statics.field1264];
                                                                                                                                class270 var424 = Statics.field3450[var423];
                                                                                                                                if (var424.field3459 == null) {
                                                                                                                                    field1258[++Statics.field2098 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1258[++Statics.field2098 - 1] = var424.field3459;
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6694) {
                                                                                                                                int var425 = field1259[--Statics.field1264];
                                                                                                                                class270 var426 = Statics.field3450[var425];
                                                                                                                                field1259[++Statics.field1264 - 1] = var426.field3457;
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6695) {
                                                                                                                                int var427 = field1259[--Statics.field1264];
                                                                                                                                class270 var428 = Statics.field3450[var427];
                                                                                                                                if (var428 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var428.field3452;
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6696) {
                                                                                                                                int var429 = field1259[--Statics.field1264];
                                                                                                                                class270 var430 = Statics.field3450[var429];
                                                                                                                                if (var430 == null) {
                                                                                                                                    field1259[++Statics.field1264 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    field1259[++Statics.field1264 - 1] = var430.field3453;
                                                                                                                                }
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6697) {
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field650.field598;
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6698) {
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field650.field603.method4124();
                                                                                                                                var364 = 1;
                                                                                                                            } else if (var436 == 6699) {
                                                                                                                                field1259[++Statics.field1264 - 1] = Statics.field650.field597.method4124();
                                                                                                                                var364 = 1;
                                                                                                                            } else {
                                                                                                                                var364 = 2;
                                                                                                                            }
                                                                                                                            var52 = var364;
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
                                                                                                                    } else if (var436 == 0) {
                                                                                                                        field1259[++Statics.field1264 - 1] = var17[var15];
                                                                                                                    } else if (var436 == 1) {
                                                                                                                        int var25 = var17[var15];
                                                                                                                        field1259[++Statics.field1264 - 1] = class238.field2783[var25];
                                                                                                                    } else if (var436 == 2) {
                                                                                                                        int var26 = var17[var15];
                                                                                                                        class238.field2783[var26] = field1259[--Statics.field1264];
                                                                                                                        client.method2934(var26);
                                                                                                                    } else if (var436 == 3) {
                                                                                                                        field1258[++Statics.field2098 - 1] = var13.field1441[var15];
                                                                                                                    } else if (var436 == 6) {
                                                                                                                        var15 += var17[var15];
                                                                                                                    } else if (var436 == 7) {
                                                                                                                        Statics.field1264 -= 2;
                                                                                                                        if (field1259[Statics.field1264] != field1259[Statics.field1264 + 1]) {
                                                                                                                            var15 += var17[var15];
                                                                                                                        }
                                                                                                                    } else if (var436 == 8) {
                                                                                                                        Statics.field1264 -= 2;
                                                                                                                        if (field1259[Statics.field1264] == field1259[Statics.field1264 + 1]) {
                                                                                                                            var15 += var17[var15];
                                                                                                                        }
                                                                                                                    } else if (var436 == 9) {
                                                                                                                        Statics.field1264 -= 2;
                                                                                                                        if (field1259[Statics.field1264] < field1259[Statics.field1264 + 1]) {
                                                                                                                            var15 += var17[var15];
                                                                                                                        }
                                                                                                                    } else if (var436 == 10) {
                                                                                                                        Statics.field1264 -= 2;
                                                                                                                        if (field1259[Statics.field1264] > field1259[Statics.field1264 + 1]) {
                                                                                                                            var15 += var17[var15];
                                                                                                                        }
                                                                                                                    } else if (var436 == 21) {
                                                                                                                        if (field1266 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class64 var27 = field1267[--field1266];
                                                                                                                        var13 = var27.field755;
                                                                                                                        var16 = var13.field1446;
                                                                                                                        var17 = var13.field1449;
                                                                                                                        var15 = var27.field762;
                                                                                                                        Statics.field1263 = var27.field757;
                                                                                                                        Statics.field1261 = var27.field758;
                                                                                                                    } else if (var436 == 25) {
                                                                                                                        int var28 = var17[var15];
                                                                                                                        field1259[++Statics.field1264 - 1] = class238.method728(var28);
                                                                                                                    } else if (var436 == 27) {
                                                                                                                        int var29 = var17[var15];
                                                                                                                        class238.method959(var29, field1259[--Statics.field1264]);
                                                                                                                    } else if (var436 == 31) {
                                                                                                                        Statics.field1264 -= 2;
                                                                                                                        if (field1259[Statics.field1264] <= field1259[Statics.field1264 + 1]) {
                                                                                                                            var15 += var17[var15];
                                                                                                                        }
                                                                                                                    } else if (var436 == 32) {
                                                                                                                        Statics.field1264 -= 2;
                                                                                                                        if (field1259[Statics.field1264] >= field1259[Statics.field1264 + 1]) {
                                                                                                                            var15 += var17[var15];
                                                                                                                        }
                                                                                                                    } else if (var436 == 33) {
                                                                                                                        field1259[++Statics.field1264 - 1] = Statics.field1263[var17[var15]];
                                                                                                                    } else if (var436 == 34) {
                                                                                                                        Statics.field1263[var17[var15]] = field1259[--Statics.field1264];
                                                                                                                    } else if (var436 == 35) {
                                                                                                                        field1258[++Statics.field2098 - 1] = Statics.field1261[var17[var15]];
                                                                                                                    } else if (var436 == 36) {
                                                                                                                        Statics.field1261[var17[var15]] = field1258[--Statics.field2098];
                                                                                                                    } else if (var436 == 37) {
                                                                                                                        int var30 = var17[var15];
                                                                                                                        Statics.field2098 -= var30;
                                                                                                                        String var31 = class319.method3593(field1258, Statics.field2098, var30);
                                                                                                                        field1258[++Statics.field2098 - 1] = var31;
                                                                                                                    } else if (var436 == 38) {
                                                                                                                        Statics.field1264--;
                                                                                                                    } else if (var436 == 39) {
                                                                                                                        Statics.field2098--;
                                                                                                                    } else if (var436 == 40) {
                                                                                                                        int var32 = var17[var15];
                                                                                                                        class97 var33 = class97.method1748(var32);
                                                                                                                        int[] var34 = new int[var33.field1442];
                                                                                                                        String[] var35 = new String[var33.field1443];
                                                                                                                        for (int var36 = 0; var36 < var33.field1444; var36++) {
                                                                                                                            var34[var36] = field1259[Statics.field1264 - var33.field1444 + var36];
                                                                                                                        }
                                                                                                                        for (int var37 = 0; var37 < var33.field1445; var37++) {
                                                                                                                            var35[var37] = field1258[Statics.field2098 - var33.field1445 + var37];
                                                                                                                        }
                                                                                                                        Statics.field1264 -= var33.field1444;
                                                                                                                        Statics.field2098 -= var33.field1445;
                                                                                                                        class64 var38 = new class64();
                                                                                                                        var38.field755 = var13;
                                                                                                                        var38.field762 = var15;
                                                                                                                        var38.field757 = Statics.field1263;
                                                                                                                        var38.field758 = Statics.field1261;
                                                                                                                        field1267[++field1266 - 1] = var38;
                                                                                                                        var13 = var33;
                                                                                                                        var16 = var33.field1446;
                                                                                                                        var17 = var33.field1449;
                                                                                                                        var15 = -1;
                                                                                                                        Statics.field1263 = var34;
                                                                                                                        Statics.field1261 = var35;
                                                                                                                    } else if (var436 == 42) {
                                                                                                                        field1259[++Statics.field1264 - 1] = Statics.field1438.method1835(var17[var15]);
                                                                                                                    } else if (var436 == 43) {
                                                                                                                        Statics.field1438.method1860(var17[var15], field1259[--Statics.field1264]);
                                                                                                                    } else if (var436 == 44) {
                                                                                                                        int var39 = var17[var15] >> 16;
                                                                                                                        int var40 = var17[var15] & 0xFFFF;
                                                                                                                        int var41 = field1259[--Statics.field1264];
                                                                                                                        if (var41 >= 0 && var41 <= 5000) {
                                                                                                                            field1265[var39] = var41;
                                                                                                                            byte var42 = -1;
                                                                                                                            if (var40 == 105) {
                                                                                                                                var42 = 0;
                                                                                                                            }
                                                                                                                            int var43 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var43 >= var41) {
                                                                                                                                    continue label2283;
                                                                                                                                }
                                                                                                                                field1262[var39][var43] = var42;
                                                                                                                                var43++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var436 == 45) {
                                                                                                                        int var44 = var17[var15];
                                                                                                                        int var45 = field1259[--Statics.field1264];
                                                                                                                        if (var45 < 0 || var45 >= field1265[var44]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1259[++Statics.field1264 - 1] = field1262[var44][var45];
                                                                                                                    } else if (var436 == 46) {
                                                                                                                        int var46 = var17[var15];
                                                                                                                        Statics.field1264 -= 2;
                                                                                                                        int var47 = field1259[Statics.field1264];
                                                                                                                        if (var47 < 0 || var47 >= field1265[var46]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1262[var46][var47] = field1259[Statics.field1264 + 1];
                                                                                                                    } else if (var436 == 47) {
                                                                                                                        String var48 = Statics.field1438.method1837(var17[var15]);
                                                                                                                        if (var48 == null) {
                                                                                                                            var48 = class252.field3160;
                                                                                                                        }
                                                                                                                        field1258[++Statics.field2098 - 1] = var48;
                                                                                                                    } else if (var436 == 48) {
                                                                                                                        Statics.field1438.method1836(var17[var15], field1258[--Statics.field2098]);
                                                                                                                    } else if (var436 == 60) {
                                                                                                                        class210 var49 = var13.field1447[var17[var15]];
                                                                                                                        class224 var50 = (class224) var49.method3668((long) field1259[--Statics.field1264]);
                                                                                                                        if (var50 != null) {
                                                                                                                            var15 += var50.field2670;
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
        } catch (Exception var435) {
            StringBuilder var433 = new StringBuilder(30);
            var433.append("").append(var13.field2655).append(" ");
            for (int var434 = field1266 - 1; var434 >= 0; var434--) {
                var433.append("").append(field1267[var434].field755.field2655).append(" ");
            }
            var433.append("").append(var18);
            class165.method2426(var433.toString(), var435);
        }
    }

    @ObfuscatedName("ez.n(ILct;ZI)I")
    public static int method2925(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1264 -= 3;
            int var3 = field1259[Statics.field1264];
            int var4 = field1259[Statics.field1264 + 1];
            int var5 = field1259[Statics.field1264 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class243 var6 = class243.method20(var3);
            if (var6.field2822 == null) {
                var6.field2822 = new class243[var5 + 1];
            }
            if (var6.field2822.length <= var5) {
                class243[] var7 = new class243[var5 + 1];
                for (int var8 = 0; var8 < var6.field2822.length; var8++) {
                    var7[var8] = var6.field2822[var8];
                }
                var6.field2822 = var7;
            }
            if (var5 > 0 && var6.field2822[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class243 var9 = new class243();
            var9.field2893 = var4;
            var9.field2845 = var9.field2856 = var6.field2856;
            var9.field2827 = var5;
            var9.field2825 = true;
            var6.field2822[var5] = var9;
            if (arg2) {
                Statics.field339 = var9;
            } else {
                Statics.field1268 = var9;
            }
            client.method3073(var6);
            return 1;
        } else if (arg0 == 101) {
            class243 var10 = arg2 ? Statics.field339 : Statics.field1268;
            class243 var11 = class243.method20(var10.field2856);
            var11.field2822[var10.field2827] = null;
            client.method3073(var11);
            return 1;
        } else if (arg0 == 102) {
            class243 var12 = class243.method20(field1259[--Statics.field1264]);
            var12.field2822 = null;
            client.method3073(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1264 -= 2;
            int var13 = field1259[Statics.field1264];
            int var14 = field1259[Statics.field1264 + 1];
            class243 var15 = class243.method3513(var13, var14);
            if (var15 == null || var14 == -1) {
                field1259[++Statics.field1264 - 1] = 0;
            } else {
                field1259[++Statics.field1264 - 1] = 1;
                if (arg2) {
                    Statics.field339 = var15;
                } else {
                    Statics.field1268 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class243 var16 = class243.method20(field1259[--Statics.field1264]);
            if (var16 == null) {
                field1259[++Statics.field1264 - 1] = 0;
            } else {
                field1259[++Statics.field1264 - 1] = 1;
                if (arg2) {
                    Statics.field339 = var16;
                } else {
                    Statics.field1268 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.r(ILct;ZI)I")
    public static int method148(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1259[--Statics.field1264];
            var4 = class243.method20(var3);
        } else {
            var4 = arg2 ? Statics.field339 : Statics.field1268;
        }
        if (arg0 == 1000) {
            Statics.field1264 -= 4;
            var4.field2835 = field1259[Statics.field1264];
            var4.field2886 = field1259[Statics.field1264 + 1];
            var4.field2831 = field1259[Statics.field1264 + 2];
            var4.field2832 = field1259[Statics.field1264 + 3];
            client.method3073(var4);
            Statics.field357.method1109(var4);
            if (var3 != -1 && var4.field2893 == 0) {
                client.method3162(Statics.field2817[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1264 -= 4;
            var4.field2837 = field1259[Statics.field1264];
            var4.field2838 = field1259[Statics.field1264 + 1];
            var4.field2902 = field1259[Statics.field1264 + 2];
            var4.field2887 = field1259[Statics.field1264 + 3];
            client.method3073(var4);
            Statics.field357.method1109(var4);
            if (var3 != -1 && var4.field2893 == 0) {
                client.method3162(Statics.field2817[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1259[--Statics.field1264] == 1;
            if (var4.field2846 != var5) {
                var4.field2846 = var5;
                client.method3073(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2840 = field1259[--Statics.field1264] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2960 = field1259[--Statics.field1264] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.e(ILct;ZI)I")
    public static int method976(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1259[--Statics.field1264];
            var4 = class243.method20(var3);
        } else {
            var4 = arg2 ? Statics.field339 : Statics.field1268;
        }
        if (arg0 == 1100) {
            Statics.field1264 -= 2;
            var4.field2847 = field1259[Statics.field1264];
            if (var4.field2847 > var4.field2826 - var4.field2841) {
                var4.field2847 = var4.field2826 - var4.field2841;
            }
            if (var4.field2847 < 0) {
                var4.field2847 = 0;
            }
            var4.field2905 = field1259[Statics.field1264 + 1];
            if (var4.field2905 > var4.field2850 - var4.field2950) {
                var4.field2905 = var4.field2850 - var4.field2950;
            }
            if (var4.field2905 < 0) {
                var4.field2905 = 0;
            }
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2929 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2928 = field1259[--Statics.field1264] == 1;
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2857 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2855 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2861 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2814 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2864 = field1259[--Statics.field1264] == 1;
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2866 = 1;
            var4.field2910 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1264 -= 6;
            var4.field2875 = field1259[Statics.field1264];
            var4.field2876 = field1259[Statics.field1264 + 1];
            var4.field2877 = field1259[Statics.field1264 + 2];
            var4.field2878 = field1259[Statics.field1264 + 3];
            var4.field2879 = field1259[Statics.field1264 + 4];
            var4.field2898 = field1259[Statics.field1264 + 5];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1259[--Statics.field1264];
            if (var4.field2821 != var5) {
                var4.field2821 = var5;
                var4.field2948 = 0;
                var4.field2949 = 0;
                client.method3073(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2883 = field1259[--Statics.field1264] == 1;
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1258[--Statics.field2098];
            if (!var6.equals(var4.field2833)) {
                var4.field2833 = var6;
                client.method3073(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2885 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1264 -= 3;
            var4.field2889 = field1259[Statics.field1264];
            var4.field2892 = field1259[Statics.field1264 + 1];
            var4.field2851 = field1259[Statics.field1264 + 2];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2891 = field1259[--Statics.field1264] == 1;
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2865 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2916 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2914 = field1259[--Statics.field1264] == 1;
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2868 = field1259[--Statics.field1264] == 1;
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1264 -= 2;
            var4.field2826 = field1259[Statics.field1264];
            var4.field2850 = field1259[Statics.field1264 + 1];
            client.method3073(var4);
            if (var3 != -1 && var4.field2893 == 0) {
                client.method3162(Statics.field2817[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method920(var4.field2856, var4.field2827);
            client.field1015 = var4;
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2862 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2852 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2858 = field1259[--Statics.field1264];
            client.method3073(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1259[--Statics.field1264];
            class330 var8 = (class330) class190.method500(class330.method3145(), var7);
            if (var8 != null) {
                var4.field2869 = var8;
                client.method3073(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1259[--Statics.field1264] == 1;
            var4.field2947 = var9;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kn.y(ILct;ZI)I")
    public static int method4985(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method20(field1259[--Statics.field1264]);
        } else {
            var3 = arg2 ? Statics.field339 : Statics.field1268;
        }
        client.method3073(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1264 -= 2;
            int var4 = field1259[Statics.field1264];
            int var5 = field1259[Statics.field1264 + 1];
            var3.field2946 = var4;
            var3.field2896 = var5;
            class284 var6 = class284.method4245(var4);
            var3.field2877 = var6.field3656;
            var3.field2878 = var6.field3657;
            var3.field2879 = var6.field3674;
            var3.field2875 = var6.field3659;
            var3.field2876 = var6.field3660;
            var3.field2898 = var6.field3682;
            if (arg0 == 1205) {
                var3.field2959 = 0;
            } else if (arg0 == 1212 | var6.field3661 == 1) {
                var3.field2959 = 1;
            } else {
                var3.field2959 = 2;
            }
            if (var3.field2881 > 0) {
                var3.field2898 = var3.field2898 * 32 / var3.field2881;
            } else if (var3.field2837 > 0) {
                var3.field2898 = var3.field2898 * 32 / var3.field2837;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2866 = 2;
            var3.field2910 = field1259[--Statics.field1264];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2866 = 3;
            var3.field2910 = Statics.field302.field824.method4133();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ey.k(ILct;ZI)I")
    public static int method2895(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method20(field1259[--Statics.field1264]);
        } else {
            var3 = arg2 ? Statics.field339 : Statics.field1268;
        }
        if (arg0 == 1300) {
            int var4 = field1259[--Statics.field1264] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4179(var4, field1258[--Statics.field2098]);
                return 1;
            } else {
                Statics.field2098--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1264 -= 2;
            int var5 = field1259[Statics.field1264];
            int var6 = field1259[Statics.field1264 + 1];
            var3.field2901 = class243.method3513(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2904 = field1259[--Statics.field1264] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2828 = field1259[--Statics.field1264];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2834 = field1259[--Statics.field1264];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2899 = field1258[--Statics.field2098];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2880 = field1258[--Statics.field2098];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2900 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.s(ILct;ZI)I")
    public static int method1749(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method20(field1259[--Statics.field1264]);
        } else {
            var3 = arg2 ? Statics.field339 : Statics.field1268;
        }
        String var4 = field1258[--Statics.field2098];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1259[--Statics.field1264];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1259[--Statics.field1264];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1258[--Statics.field2098];
            } else {
                var7[var8] = Integer.valueOf(field1259[--Statics.field1264]);
            }
        }
        int var9 = field1259[--Statics.field1264];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2908 = var7;
        } else if (arg0 == 1401) {
            var3.field2911 = var7;
        } else if (arg0 == 1402) {
            var3.field2859 = var7;
        } else if (arg0 == 1403) {
            var3.field2912 = var7;
        } else if (arg0 == 1404) {
            var3.field2873 = var7;
        } else if (arg0 == 1405) {
            var3.field2915 = var7;
        } else if (arg0 == 1406) {
            var3.field2815 = var7;
        } else if (arg0 == 1407) {
            var3.field2945 = var7;
            var3.field2927 = var5;
        } else if (arg0 == 1408) {
            var3.field2925 = var7;
        } else if (arg0 == 1409) {
            var3.field2926 = var7;
        } else if (arg0 == 1410) {
            var3.field2842 = var7;
        } else if (arg0 == 1411) {
            var3.field2909 = var7;
        } else if (arg0 == 1412) {
            var3.field2913 = var7;
        } else if (arg0 == 1414) {
            var3.field2921 = var7;
            var3.field2860 = var5;
        } else if (arg0 == 1415) {
            var3.field2923 = var7;
            var3.field2924 = var5;
        } else if (arg0 == 1416) {
            var3.field2917 = var7;
        } else if (arg0 == 1417) {
            var3.field2818 = var7;
        } else if (arg0 == 1418) {
            var3.field2829 = var7;
        } else if (arg0 == 1419) {
            var3.field2907 = var7;
        } else if (arg0 == 1420) {
            var3.field2930 = var7;
        } else if (arg0 == 1421) {
            var3.field2931 = var7;
        } else if (arg0 == 1422) {
            var3.field2932 = var7;
        } else if (arg0 == 1423) {
            var3.field2933 = var7;
        } else if (arg0 == 1424) {
            var3.field2934 = var7;
        } else if (arg0 == 1425) {
            var3.field2936 = var7;
        } else if (arg0 == 1426) {
            var3.field2937 = var7;
        } else if (arg0 == 1427) {
            var3.field2935 = var7;
        } else {
            return 2;
        }
        var3.field2906 = true;
        return 1;
    }

    @ObfuscatedName("by.x(ILct;ZI)I")
    public static int method694(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = arg2 ? Statics.field339 : Statics.field1268;
        if (arg0 == 1500) {
            field1259[++Statics.field1264 - 1] = var3.field2839;
            return 1;
        } else if (arg0 == 1501) {
            field1259[++Statics.field1264 - 1] = var3.field2870;
            return 1;
        } else if (arg0 == 1502) {
            field1259[++Statics.field1264 - 1] = var3.field2841;
            return 1;
        } else if (arg0 == 1503) {
            field1259[++Statics.field1264 - 1] = var3.field2950;
            return 1;
        } else if (arg0 == 1504) {
            field1259[++Statics.field1264 - 1] = var3.field2846 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1259[++Statics.field1264 - 1] = var3.field2845;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ei.h(ILct;ZB)I")
    public static int method2902(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = arg2 ? Statics.field339 : Statics.field1268;
        if (arg0 == 1800) {
            int[] var4 = field1259;
            int var5 = ++Statics.field1264 - 1;
            int var6 = client.method1737(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1259[--Statics.field1264];
            int var9 = var8 - 1;
            if (var3.field2900 == null || var9 >= var3.field2900.length || var3.field2900[var9] == null) {
                field1258[++Statics.field2098 - 1] = "";
            } else {
                field1258[++Statics.field2098 - 1] = var3.field2900[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2899 == null) {
                field1258[++Statics.field2098 - 1] = "";
            } else {
                field1258[++Statics.field2098 - 1] = var3.field2899;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dv.t(ILct;ZB)I")
    public static int method2505(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method20(field1259[--Statics.field1264]);
        } else {
            var3 = arg2 ? Statics.field339 : Statics.field1268;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1271 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2935 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field788 = var3;
            var4.field790 = var3.field2935;
            var4.field798 = field1271 + 1;
            client.field1048.method3793(var4);
            return 1;
        }
    }

    @ObfuscatedName("en.i(ILct;ZI)I")
    public static int method2957(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1264 -= 2;
            int var3 = field1259[Statics.field1264];
            int var4 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1264 -= 2;
            int var5 = field1259[Statics.field1264];
            int var6 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1264 -= 2;
            int var7 = field1259[Statics.field1264];
            int var8 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1264 -= 2;
            int var9 = field1259[Statics.field1264];
            int var10 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1259[--Statics.field1264];
            field1259[++Statics.field1264 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1259[--Statics.field1264];
            field1259[++Statics.field1264 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1264 -= 5;
            int var13 = field1259[Statics.field1264];
            int var14 = field1259[Statics.field1264 + 1];
            int var15 = field1259[Statics.field1264 + 2];
            int var16 = field1259[Statics.field1264 + 3];
            int var17 = field1259[Statics.field1264 + 4];
            field1259[++Statics.field1264 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1264 -= 2;
            int var18 = field1259[Statics.field1264];
            int var19 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1264 -= 2;
            int var20 = field1259[Statics.field1264];
            int var21 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1264 -= 2;
            int var22 = field1259[Statics.field1264];
            int var23 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1264 -= 2;
            int var24 = field1259[Statics.field1264];
            int var25 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1264 -= 2;
            int var26 = field1259[Statics.field1264];
            int var27 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1264 -= 2;
            int var28 = field1259[Statics.field1264];
            int var29 = field1259[Statics.field1264 + 1];
            if (var28 == 0) {
                field1259[++Statics.field1264 - 1] = 0;
            } else {
                field1259[++Statics.field1264 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1264 -= 2;
            int var30 = field1259[Statics.field1264];
            int var31 = field1259[Statics.field1264 + 1];
            if (var30 == 0) {
                field1259[++Statics.field1264 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1259[++Statics.field1264 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1259[++Statics.field1264 - 1] = var30;
                    break;
                case 2:
                    field1259[++Statics.field1264 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1259[++Statics.field1264 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1259[++Statics.field1264 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1259[++Statics.field1264 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1264 -= 2;
            int var32 = field1259[Statics.field1264];
            int var33 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1264 -= 2;
            int var34 = field1259[Statics.field1264];
            int var35 = field1259[Statics.field1264 + 1];
            field1259[++Statics.field1264 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1264 -= 3;
            long var36 = (long) field1259[Statics.field1264];
            long var38 = (long) field1259[Statics.field1264 + 1];
            long var40 = (long) field1259[Statics.field1264 + 2];
            field1259[++Statics.field1264 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("m.u(ILct;ZI)I")
    public static int method50(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1259[--Statics.field1264];
            field1258[++Statics.field2098 - 1] = class284.method4245(var3).field3650;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1264 -= 2;
            int var4 = field1259[Statics.field1264];
            int var5 = field1259[Statics.field1264 + 1];
            class284 var6 = class284.method4245(var4);
            if (var5 < 1 || var5 > 5 || var6.field3664[var5 - 1] == null) {
                field1258[++Statics.field2098 - 1] = "";
            } else {
                field1258[++Statics.field2098 - 1] = var6.field3664[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1264 -= 2;
            int var7 = field1259[Statics.field1264];
            int var8 = field1259[Statics.field1264 + 1];
            class284 var9 = class284.method4245(var7);
            if (var8 < 1 || var8 > 5 || var9.field3679[var8 - 1] == null) {
                field1258[++Statics.field2098 - 1] = "";
            } else {
                field1258[++Statics.field2098 - 1] = var9.field3679[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1259[--Statics.field1264];
            field1259[++Statics.field1264 - 1] = class284.method4245(var10).field3691;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1259[--Statics.field1264];
            field1259[++Statics.field1264 - 1] = class284.method4245(var11).field3661 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1259[--Statics.field1264];
            class284 var13 = class284.method4245(var12);
            if (var13.field3684 == -1 && var13.field3639 >= 0) {
                field1259[++Statics.field1264 - 1] = var13.field3639;
            } else {
                field1259[++Statics.field1264 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1259[--Statics.field1264];
            class284 var15 = class284.method4245(var14);
            if (var15.field3684 >= 0 && var15.field3639 >= 0) {
                field1259[++Statics.field1264 - 1] = var15.field3639;
            } else {
                field1259[++Statics.field1264 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1259[--Statics.field1264];
            field1259[++Statics.field1264 - 1] = class284.method4245(var16).field3663 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1259[--Statics.field1264];
            class284 var18 = class284.method4245(var17);
            if (var18.field3694 == -1 && var18.field3693 >= 0) {
                field1259[++Statics.field1264 - 1] = var18.field3693;
            } else {
                field1259[++Statics.field1264 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1259[--Statics.field1264];
            class284 var20 = class284.method4245(var19);
            if (var20.field3694 >= 0 && var20.field3693 >= 0) {
                field1259[++Statics.field1264 - 1] = var20.field3693;
            } else {
                field1259[++Statics.field1264 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1258[--Statics.field2098];
            int var22 = field1259[--Statics.field1264];
            client.method249(var21, var22 == 1);
            field1259[++Statics.field1264 - 1] = Statics.field1334;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field579 == null || Statics.field29 >= Statics.field1334) {
                field1259[++Statics.field1264 - 1] = -1;
            } else {
                field1259[++Statics.field1264 - 1] = Statics.field579[++Statics.field29 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field29 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ia.q(ILct;ZI)I")
    public static int method4167(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1259[++Statics.field1264 - 1] = client.field873;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1264 -= 3;
            client.field873 = field1259[Statics.field1264];
            int var3 = field1259[Statics.field1264 + 1];
            class321[] var4 = new class321[] { class321.field3927, class321.field3929, class321.field3925 };
            class321[] var5 = var4;
            int var6 = 0;
            class321 var8;
            while (true) {
                if (var6 >= var5.length) {
                    var8 = null;
                    break;
                }
                class321 var7 = var5[var6];
                if (var7.field3928 == var3) {
                    var8 = var7;
                    break;
                }
                var6++;
            }
            Statics.field251 = var8;
            if (Statics.field251 == null) {
                Statics.field251 = class321.field3929;
            }
            client.field1066 = field1259[Statics.field1264 + 2];
            class185 var9 = class185.method251(class182.field2465, client.field900.field1471);
            var9.field2497.method3243(client.field873);
            var9.field2497.method3243(Statics.field251.field3928);
            var9.field2497.method3243(client.field1066);
            client.field900.method1921(var9);
            return 1;
        } else if (arg0 == 5002) {
            String var10 = field1258[--Statics.field2098];
            Statics.field1264 -= 2;
            int var11 = field1259[Statics.field1264];
            int var12 = field1259[Statics.field1264 + 1];
            class185 var13 = class185.method251(class182.field2473, client.field900.field1471);
            var13.field2497.method3243(class195.method240(var10) + 2);
            var13.field2497.method3250(var10);
            var13.field2497.method3243(var11 - 1);
            var13.field2497.method3243(var12);
            client.field900.method1921(var13);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1264 -= 2;
            int var14 = field1259[Statics.field1264];
            int var15 = field1259[Statics.field1264 + 1];
            class99 var16 = (class99) class96.field1434.get(var14);
            class71 var17 = var16.method1907(var15);
            if (var17 == null) {
                field1259[++Statics.field1264 - 1] = -1;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
                field1258[++Statics.field2098 - 1] = "";
                field1258[++Statics.field2098 - 1] = "";
                field1259[++Statics.field1264 - 1] = 0;
            } else {
                field1259[++Statics.field1264 - 1] = var17.field818;
                field1259[++Statics.field1264 - 1] = var17.field811;
                field1258[++Statics.field2098 - 1] = var17.field813 == null ? "" : var17.field813;
                field1258[++Statics.field2098 - 1] = var17.field817 == null ? "" : var17.field817;
                field1258[++Statics.field2098 - 1] = var17.field816 == null ? "" : var17.field816;
                field1259[++Statics.field1264 - 1] = var17.method1001() ? 1 : (var17.method1024() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var19 = field1259[--Statics.field1264];
            class71 var20 = (class71) class96.field1431.method3668((long) var19);
            if (var20 == null) {
                field1259[++Statics.field1264 - 1] = -1;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
                field1258[++Statics.field2098 - 1] = "";
                field1258[++Statics.field2098 - 1] = "";
                field1259[++Statics.field1264 - 1] = 0;
            } else {
                field1259[++Statics.field1264 - 1] = var20.field812;
                field1259[++Statics.field1264 - 1] = var20.field811;
                field1258[++Statics.field2098 - 1] = var20.field813 == null ? "" : var20.field813;
                field1258[++Statics.field2098 - 1] = var20.field817 == null ? "" : var20.field817;
                field1258[++Statics.field2098 - 1] = var20.field816 == null ? "" : var20.field816;
                field1259[++Statics.field1264 - 1] = var20.method1001() ? 1 : (var20.method1024() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field251 == null) {
                field1259[++Statics.field1264 - 1] = -1;
            } else {
                field1259[++Statics.field1264 - 1] = Statics.field251.field3928;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var22 = field1258[--Statics.field2098];
            int var23 = field1259[--Statics.field1264];
            String var24 = var22.toLowerCase();
            byte var25 = 0;
            if (var24.startsWith(class252.field3142)) {
                var25 = 0;
                var22 = var22.substring(class252.field3142.length());
            } else if (var24.startsWith(class252.field3198)) {
                var25 = 1;
                var22 = var22.substring(class252.field3198.length());
            } else if (var24.startsWith(class252.field3260)) {
                var25 = 2;
                var22 = var22.substring(class252.field3260.length());
            } else if (var24.startsWith(class252.field3270)) {
                var25 = 3;
                var22 = var22.substring(class252.field3270.length());
            } else if (var24.startsWith(class252.field3245)) {
                var25 = 4;
                var22 = var22.substring(class252.field3245.length());
            } else if (var24.startsWith(class252.field3290)) {
                var25 = 5;
                var22 = var22.substring(class252.field3290.length());
            } else if (var24.startsWith(class252.field3206)) {
                var25 = 6;
                var22 = var22.substring(class252.field3206.length());
            } else if (var24.startsWith(class252.field3210)) {
                var25 = 7;
                var22 = var22.substring(class252.field3210.length());
            } else if (var24.startsWith(class252.field3169)) {
                var25 = 8;
                var22 = var22.substring(class252.field3169.length());
            } else if (var24.startsWith(class252.field3214)) {
                var25 = 9;
                var22 = var22.substring(class252.field3214.length());
            } else if (var24.startsWith(class252.field3074)) {
                var25 = 10;
                var22 = var22.substring(class252.field3074.length());
            } else if (var24.startsWith(class252.field3212)) {
                var25 = 11;
                var22 = var22.substring(class252.field3212.length());
            } else if (client.field863 != 0) {
                if (var24.startsWith(class252.field3094)) {
                    var25 = 0;
                    var22 = var22.substring(class252.field3094.length());
                } else if (var24.startsWith(class252.field3199)) {
                    var25 = 1;
                    var22 = var22.substring(class252.field3199.length());
                } else if (var24.startsWith(class252.field3201)) {
                    var25 = 2;
                    var22 = var22.substring(class252.field3201.length());
                } else if (var24.startsWith(class252.field3302)) {
                    var25 = 3;
                    var22 = var22.substring(class252.field3302.length());
                } else if (var24.startsWith(class252.field3076)) {
                    var25 = 4;
                    var22 = var22.substring(class252.field3076.length());
                } else if (var24.startsWith(class252.field3207)) {
                    var25 = 5;
                    var22 = var22.substring(class252.field3207.length());
                } else if (var24.startsWith(class252.field3184)) {
                    var25 = 6;
                    var22 = var22.substring(class252.field3184.length());
                } else if (var24.startsWith(class252.field3211)) {
                    var25 = 7;
                    var22 = var22.substring(class252.field3211.length());
                } else if (var24.startsWith(class252.field3213)) {
                    var25 = 8;
                    var22 = var22.substring(class252.field3213.length());
                } else if (var24.startsWith(class252.field3215)) {
                    var25 = 9;
                    var22 = var22.substring(class252.field3215.length());
                } else if (var24.startsWith(class252.field3217)) {
                    var25 = 10;
                    var22 = var22.substring(class252.field3217.length());
                } else if (var24.startsWith(class252.field3219)) {
                    var25 = 11;
                    var22 = var22.substring(class252.field3219.length());
                }
            }
            String var26 = var22.toLowerCase();
            byte var27 = 0;
            if (var26.startsWith(class252.field3281)) {
                var27 = 1;
                var22 = var22.substring(class252.field3281.length());
            } else if (var26.startsWith(class252.field3222)) {
                var27 = 2;
                var22 = var22.substring(class252.field3222.length());
            } else if (var26.startsWith(class252.field3224)) {
                var27 = 3;
                var22 = var22.substring(class252.field3224.length());
            } else if (var26.startsWith(class252.field3226)) {
                var27 = 4;
                var22 = var22.substring(class252.field3226.length());
            } else if (var26.startsWith(class252.field3296)) {
                var27 = 5;
                var22 = var22.substring(class252.field3296.length());
            } else if (client.field863 != 0) {
                if (var26.startsWith(class252.field3221)) {
                    var27 = 1;
                    var22 = var22.substring(class252.field3221.length());
                } else if (var26.startsWith(class252.field3043)) {
                    var27 = 2;
                    var22 = var22.substring(class252.field3043.length());
                } else if (var26.startsWith(class252.field3225)) {
                    var27 = 3;
                    var22 = var22.substring(class252.field3225.length());
                } else if (var26.startsWith(class252.field3248)) {
                    var27 = 4;
                    var22 = var22.substring(class252.field3248.length());
                } else if (var26.startsWith(class252.field3229)) {
                    var27 = 5;
                    var22 = var22.substring(class252.field3229.length());
                }
            }
            class185 var28 = class185.method251(class182.field2427, client.field900.field1471);
            var28.field2497.method3243(0);
            int var29 = var28.field2497.field2568;
            var28.field2497.method3243(var23);
            var28.field2497.method3243(var25);
            var28.field2497.method3243(var27);
            class202 var30 = var28.field2497;
            int var31 = var30.field2568;
            int var32 = var22.length();
            byte[] var33 = new byte[var32];
            for (int var34 = 0; var34 < var32; var34++) {
                char var35 = var22.charAt(var34);
                if (var35 > 0 && var35 < 128 || var35 >= 160 && var35 <= 255) {
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
            var30.method3340(var33.length);
            var30.field2568 += Statics.field3904.method3184(var33, 0, var33.length, var30.field2569, var30.field2568);
            var28.field2497.method3256(var28.field2497.field2568 - var29);
            client.field900.method1921(var28);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2098 -= 2;
            String var38 = field1258[Statics.field2098];
            String var39 = field1258[Statics.field2098 + 1];
            class185 var40 = class185.method251(class182.field2408, client.field900.field1471);
            var40.field2497.method3360(0);
            int var41 = var40.field2497.field2568;
            var40.field2497.method3250(var38);
            class202 var42 = var40.field2497;
            int var43 = var42.field2568;
            int var44 = var39.length();
            byte[] var45 = new byte[var44];
            for (int var46 = 0; var46 < var44; var46++) {
                char var47 = var39.charAt(var46);
                if (var47 > 0 && var47 < 128 || var47 >= 160 && var47 <= 255) {
                    var45[var46] = (byte) var47;
                } else if (var47 == 8364) {
                    var45[var46] = -128;
                } else if (var47 == 8218) {
                    var45[var46] = -126;
                } else if (var47 == 402) {
                    var45[var46] = -125;
                } else if (var47 == 8222) {
                    var45[var46] = -124;
                } else if (var47 == 8230) {
                    var45[var46] = -123;
                } else if (var47 == 8224) {
                    var45[var46] = -122;
                } else if (var47 == 8225) {
                    var45[var46] = -121;
                } else if (var47 == 710) {
                    var45[var46] = -120;
                } else if (var47 == 8240) {
                    var45[var46] = -119;
                } else if (var47 == 352) {
                    var45[var46] = -118;
                } else if (var47 == 8249) {
                    var45[var46] = -117;
                } else if (var47 == 338) {
                    var45[var46] = -116;
                } else if (var47 == 381) {
                    var45[var46] = -114;
                } else if (var47 == 8216) {
                    var45[var46] = -111;
                } else if (var47 == 8217) {
                    var45[var46] = -110;
                } else if (var47 == 8220) {
                    var45[var46] = -109;
                } else if (var47 == 8221) {
                    var45[var46] = -108;
                } else if (var47 == 8226) {
                    var45[var46] = -107;
                } else if (var47 == 8211) {
                    var45[var46] = -106;
                } else if (var47 == 8212) {
                    var45[var46] = -105;
                } else if (var47 == 732) {
                    var45[var46] = -104;
                } else if (var47 == 8482) {
                    var45[var46] = -103;
                } else if (var47 == 353) {
                    var45[var46] = -102;
                } else if (var47 == 8250) {
                    var45[var46] = -101;
                } else if (var47 == 339) {
                    var45[var46] = -100;
                } else if (var47 == 382) {
                    var45[var46] = -98;
                } else if (var47 == 376) {
                    var45[var46] = -97;
                } else {
                    var45[var46] = 63;
                }
            }
            var42.method3340(var45.length);
            var42.field2568 += Statics.field3904.method3184(var45, 0, var45.length, var42.field2569, var42.field2568);
            var40.field2497.method3271(var40.field2497.field2568 - var41);
            client.field900.method1921(var40);
            return 1;
        } else if (arg0 == 5015) {
            String var50;
            if (Statics.field302 == null || Statics.field302.field848 == null) {
                var50 = "";
            } else {
                var50 = Statics.field302.field848.method5095();
            }
            field1258[++Statics.field2098 - 1] = var50;
            return 1;
        } else if (arg0 == 5016) {
            field1259[++Statics.field1264 - 1] = client.field1066;
            return 1;
        } else if (arg0 == 5017) {
            int var51 = field1259[--Statics.field1264];
            int[] var52 = field1259;
            int var53 = ++Statics.field1264 - 1;
            class99 var54 = (class99) class96.field1434.get(var51);
            int var55;
            if (var54 == null) {
                var55 = 0;
            } else {
                var55 = var54.method1909();
            }
            var52[var53] = var55;
            return 1;
        } else if (arg0 == 5018) {
            int var56 = field1259[--Statics.field1264];
            field1259[++Statics.field1264 - 1] = class96.method1164(var56);
            return 1;
        } else if (arg0 == 5019) {
            int var57 = field1259[--Statics.field1264];
            field1259[++Statics.field1264 - 1] = class96.method1708(var57);
            return 1;
        } else if (arg0 == 5020) {
            String var58 = field1258[--Statics.field2098];
            if (var58.equalsIgnoreCase("toggleroof")) {
                Statics.field663.field1224 = !Statics.field663.field1224;
                class79.method1027();
                if (Statics.field663.field1224) {
                    class96.method140(99, "", "Roofs are now all hidden");
                } else {
                    class96.method140(99, "", "Roofs will only be removed selectively");
                }
            }
            if (var58.equalsIgnoreCase("displayfps")) {
                client.field1034 = !client.field1034;
            }
            if (var58.equalsIgnoreCase("renderself")) {
                client.field970 = !client.field970;
            }
            if (var58.equalsIgnoreCase("mouseovertext")) {
                client.field1050 = !client.field1050;
            }
            if (client.field1018 >= 2) {
                if (var58.equalsIgnoreCase("aabb")) {
                    if (!class8.field228) {
                        class8.field228 = true;
                        class8.field230 = class12.field267;
                    } else if (class8.field230 == class12.field267) {
                        class8.field228 = true;
                        class8.field230 = class12.field268;
                    } else {
                        class8.field228 = false;
                    }
                }
                if (var58.equalsIgnoreCase("showcoord")) {
                    Statics.field3008.field4057 = !Statics.field3008.field4057;
                }
                if (var58.equalsIgnoreCase("fpson")) {
                    client.field1034 = true;
                }
                if (var58.equalsIgnoreCase("fpsoff")) {
                    client.field1034 = false;
                }
                if (var58.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (var58.equalsIgnoreCase("clientdrop")) {
                    client.method678();
                }
                if (var58.equalsIgnoreCase("cs")) {
                    class96.method140(99, "", "" + client.field903);
                }
                if (var58.equalsIgnoreCase("errortest") && client.field860 == 2) {
                    throw new RuntimeException();
                }
            }
            class185 var59 = class185.method251(class182.field2469, client.field900.field1471);
            var59.field2497.method3243(var58.length() + 1);
            var59.field2497.method3250(var58);
            client.field900.method1921(var59);
            return 1;
        } else if (arg0 == 5021) {
            client.field1067 = field1258[--Statics.field2098].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1258[++Statics.field2098 - 1] = client.field1067;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ev.v(ILct;ZI)I")
    public static int method2970(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1264 -= 2;
            int var3 = field1259[Statics.field1264];
            int var4 = field1259[Statics.field1264 + 1];
            if (!client.field1093) {
                client.field880 = var3;
                client.field923 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1259[++Statics.field1264 - 1] = client.field880;
            return 1;
        } else if (arg0 == 5506) {
            field1259[++Statics.field1264 - 1] = client.field923;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1259[--Statics.field1264];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field929 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1259[++Statics.field1264 - 1] = client.field929;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.f(ILct;ZI)I")
    public static int method55(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field887 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.b(ILct;ZI)I")
    public static int method225(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1264 -= 2;
            client.field872 = (short) field1259[Statics.field1264];
            if (client.field872 <= 0) {
                client.field872 = 256;
            }
            client.field1100 = (short) field1259[Statics.field1264 + 1];
            if (client.field1100 <= 0) {
                client.field1100 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1264 -= 2;
            client.field1101 = (short) field1259[Statics.field1264];
            if (client.field1101 <= 0) {
                client.field1101 = 256;
            }
            client.field1102 = (short) field1259[Statics.field1264 + 1];
            if (client.field1102 <= 0) {
                client.field1102 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1264 -= 4;
            client.field894 = (short) field1259[Statics.field1264];
            if (client.field894 <= 0) {
                client.field894 = 1;
            }
            client.field861 = (short) field1259[Statics.field1264 + 1];
            if (client.field861 <= 0) {
                client.field861 = 32767;
            } else if (client.field861 < client.field894) {
                client.field861 = client.field894;
            }
            client.field1105 = (short) field1259[Statics.field1264 + 2];
            if (client.field1105 <= 0) {
                client.field1105 = 1;
            }
            client.field993 = (short) field1259[Statics.field1264 + 3];
            if (client.field993 <= 0) {
                client.field993 = 32767;
            } else if (client.field993 < client.field1105) {
                client.field993 = client.field1105;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1021 == null) {
                field1259[++Statics.field1264 - 1] = -1;
                field1259[++Statics.field1264 - 1] = -1;
            } else {
                client.method3101(0, 0, client.field1021.field2841, client.field1021.field2950, false);
                field1259[++Statics.field1264 - 1] = client.field877;
                field1259[++Statics.field1264 - 1] = client.field1110;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1259[++Statics.field1264 - 1] = client.field1101;
            field1259[++Statics.field1264 - 1] = client.field1102;
            return 1;
        } else if (arg0 == 6205) {
            field1259[++Statics.field1264 - 1] = client.field872;
            field1259[++Statics.field1264 - 1] = client.field1100;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.c(ILct;ZI)I")
    public static int method248(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1259[++Statics.field1264 - 1] = class78.method74() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class78 var3 = class78.method123();
            if (var3 == null) {
                field1259[++Statics.field1264 - 1] = -1;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
                field1259[++Statics.field1264 - 1] = 0;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
            } else {
                field1259[++Statics.field1264 - 1] = var3.field1215;
                field1259[++Statics.field1264 - 1] = var3.field1216;
                field1258[++Statics.field2098 - 1] = var3.field1219;
                field1259[++Statics.field1264 - 1] = var3.field1220;
                field1259[++Statics.field1264 - 1] = var3.field1217;
                field1258[++Statics.field2098 - 1] = var3.field1218;
            }
            return 1;
        } else if (arg0 == 6502) {
            class78 var4 = class78.method3157();
            if (var4 == null) {
                field1259[++Statics.field1264 - 1] = -1;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
                field1259[++Statics.field1264 - 1] = 0;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
            } else {
                field1259[++Statics.field1264 - 1] = var4.field1215;
                field1259[++Statics.field1264 - 1] = var4.field1216;
                field1258[++Statics.field2098 - 1] = var4.field1219;
                field1259[++Statics.field1264 - 1] = var4.field1220;
                field1259[++Statics.field1264 - 1] = var4.field1217;
                field1258[++Statics.field2098 - 1] = var4.field1218;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1259[--Statics.field1264];
            class78 var6 = null;
            for (int var7 = 0; var7 < class78.field1221; var7++) {
                if (Statics.field1209[var7].field1215 == var5) {
                    var6 = Statics.field1209[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1259[++Statics.field1264 - 1] = -1;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
                field1259[++Statics.field1264 - 1] = 0;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
            } else {
                field1259[++Statics.field1264 - 1] = var6.field1215;
                field1259[++Statics.field1264 - 1] = var6.field1216;
                field1258[++Statics.field2098 - 1] = var6.field1219;
                field1259[++Statics.field1264 - 1] = var6.field1220;
                field1259[++Statics.field1264 - 1] = var6.field1217;
                field1258[++Statics.field2098 - 1] = var6.field1218;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1264 -= 4;
            int var8 = field1259[Statics.field1264];
            boolean var9 = field1259[Statics.field1264 + 1] == 1;
            int var10 = field1259[Statics.field1264 + 2];
            boolean var11 = field1259[Statics.field1264 + 3] == 1;
            class78.method1794(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1259[--Statics.field1264];
            if (var12 >= 0 && var12 < class78.field1221) {
                class78 var13 = Statics.field1209[var12];
                field1259[++Statics.field1264 - 1] = var13.field1215;
                field1259[++Statics.field1264 - 1] = var13.field1216;
                field1258[++Statics.field2098 - 1] = var13.field1219;
                field1259[++Statics.field1264 - 1] = var13.field1220;
                field1259[++Statics.field1264 - 1] = var13.field1217;
                field1258[++Statics.field2098 - 1] = var13.field1218;
            } else {
                field1259[++Statics.field1264 - 1] = -1;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
                field1259[++Statics.field1264 - 1] = 0;
                field1259[++Statics.field1264 - 1] = 0;
                field1258[++Statics.field2098 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field938 = field1259[--Statics.field1264] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1264 -= 2;
            int var14 = field1259[Statics.field1264];
            int var15 = field1259[Statics.field1264 + 1];
            class279 var16 = class279.method3077(var15);
            if (var16.method4635()) {
                field1258[++Statics.field2098 - 1] = class286.method4254(var14).method4824(var15, var16.field3544);
            } else {
                field1259[++Statics.field1264 - 1] = class286.method4254(var14).method4823(var15, var16.field3543);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1264 -= 2;
            int var17 = field1259[Statics.field1264];
            int var18 = field1259[Statics.field1264 + 1];
            class279 var19 = class279.method3077(var18);
            if (var19.method4635()) {
                field1258[++Statics.field2098 - 1] = class283.method3065(var17).method4713(var18, var19.field3544);
            } else {
                field1259[++Statics.field1264 - 1] = class283.method3065(var17).method4712(var18, var19.field3543);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1264 -= 2;
            int var20 = field1259[Statics.field1264];
            int var21 = field1259[Statics.field1264 + 1];
            class279 var22 = class279.method3077(var21);
            if (var22.method4635()) {
                field1258[++Statics.field2098 - 1] = class284.method4245(var20).method4763(var21, var22.field3544);
            } else {
                field1259[++Statics.field1264 - 1] = class284.method4245(var20).method4802(var21, var22.field3543);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1264 -= 2;
            int var23 = field1259[Statics.field1264];
            int var24 = field1259[Statics.field1264 + 1];
            class279 var25 = class279.method3077(var24);
            if (var25.method4635()) {
                field1258[++Statics.field2098 - 1] = class280.method3067(var23).method4642(var24, var25.field3544);
            } else {
                field1259[++Statics.field1264 - 1] = class280.method3067(var23).method4647(var24, var25.field3543);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1259[++Statics.field1264 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.w(IB)V")
    public static void method333(int arg0) {
        if (arg0 == -1 || !class243.method129(arg0)) {
            return;
        }
        class243[] var1 = Statics.field2817[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3.field2830 != null) {
                class69 var4 = new class69();
                var4.field788 = var3;
                var4.field790 = var3.field2830;
                method45(var4, 5000000);
            }
        }
    }
}
