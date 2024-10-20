package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cw")
public class class81 {

    @ObfuscatedName("cw.a")
    public static int[] field1222 = new int[5];

    @ObfuscatedName("cw.h")
    public static int[][] field1223 = new int[5][5000];

    @ObfuscatedName("cw.l")
    public static int[] field1220 = new int[1000];

    @ObfuscatedName("cw.g")
    public static String[] field1231 = new String[1000];

    @ObfuscatedName("cw.u")
    public static int field1227 = 0;

    @ObfuscatedName("cw.r")
    public static class63[] field1228 = new class63[50];

    @ObfuscatedName("cw.s")
    public static Calendar field1230 = Calendar.getInstance();

    @ObfuscatedName("cw.t")
    public static final String[] field1224 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cw.m")
    public static int field1232 = 0;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gz.b(Lba;I)V")
    public static void method3491(class68 arg0) {
        method489(arg0, 500000);
    }

    @ObfuscatedName("ax.q(Lba;II)V")
    public static void method489(class68 arg0, int arg1) {
        Object[] var2 = arg0.field747;
        class240 var3 = arg0.field753;
        boolean var4 = class240.field2916 == var3 || class240.field2917 == var3 || class240.field2919 == var3 || class240.field2925 == var3 || class240.field2920 == var3 || class240.field2921 == var3 || class240.field2922 == var3 || class240.field2923 == var3;
        class96 var15;
        if (var4) {
            Statics.field3789 = (class48) var2[0];
            class263 var5 = Statics.field4025[Statics.field3789.field557];
            class240 var6 = arg0.field753;
            int var7 = var5.field3407;
            int var8 = var5.field3398;
            int var9 = (var7 << 8) + var6.field2918;
            class96 var11 = class96.method2(var9, var6);
            class96 var12;
            if (var11 == null) {
                int var13 = class245.method1868(var8, var6);
                class96 var14 = class96.method2(var13, var6);
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
            class96 var17 = (class96) class96.field1407.method3658((long) var16);
            class96 var18;
            if (var17 == null) {
                byte[] var19 = Statics.field1233.method4158(var16, 0);
                if (var19 == null) {
                    var18 = null;
                } else {
                    class96 var20 = class96.method4266(var19);
                    class96.field1407.method3659(var20, (long) var16);
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
        Statics.field1234 = 0;
        Statics.field525 = 0;
        int var21 = -1;
        int[] var22 = var15.field1403;
        int[] var23 = var15.field1404;
        byte var24 = -1;
        field1227 = 0;
        try {
            Statics.field1226 = new int[var15.field1408];
            int var25 = 0;
            Statics.field1221 = new String[var15.field1402];
            int var26 = 0;
            for (int var27 = 1; var27 < var2.length; var27++) {
                if (var2[var27] instanceof Integer) {
                    int var28 = (Integer) var2[var27];
                    if (var28 == -2147483647) {
                        var28 = arg0.field745;
                    }
                    if (var28 == -2147483646) {
                        var28 = arg0.field746;
                    }
                    if (var28 == -2147483645) {
                        var28 = arg0.field749 == null ? -1 : arg0.field749.field2795;
                    }
                    if (var28 == -2147483644) {
                        var28 = arg0.field754;
                    }
                    if (var28 == -2147483643) {
                        var28 = arg0.field749 == null ? -1 : arg0.field749.field2769;
                    }
                    if (var28 == -2147483642) {
                        var28 = arg0.field748 == null ? -1 : arg0.field748.field2795;
                    }
                    if (var28 == -2147483641) {
                        var28 = arg0.field748 == null ? -1 : arg0.field748.field2769;
                    }
                    if (var28 == -2147483640) {
                        var28 = arg0.field755;
                    }
                    if (var28 == -2147483639) {
                        var28 = arg0.field750;
                    }
                    Statics.field1226[var25++] = var28;
                } else if (var2[var27] instanceof String) {
                    String var29 = (String) var2[var27];
                    if (var29.equals("event_opbase")) {
                        var29 = arg0.field751;
                    }
                    Statics.field1221[var26++] = var29;
                }
            }
            int var30 = 0;
            field1232 = arg0.field752;
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
                                                                                                                label848: while (true) {
                                                                                                                    var30++;
                                                                                                                    if (var30 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var21++;
                                                                                                                    int var176 = var22[var21];
                                                                                                                    if (var176 >= 100) {
                                                                                                                        boolean var72;
                                                                                                                        if (var15.field1404[var21] == 1) {
                                                                                                                            var72 = true;
                                                                                                                        } else {
                                                                                                                            var72 = false;
                                                                                                                        }
                                                                                                                        int var73;
                                                                                                                        if (var176 < 1000) {
                                                                                                                            var73 = method42(var176, var15, var72);
                                                                                                                        } else if (var176 < 1100) {
                                                                                                                            var73 = method505(var176, var15, var72);
                                                                                                                        } else if (var176 < 1200) {
                                                                                                                            var73 = method1732(var176, var15, var72);
                                                                                                                        } else if (var176 < 1300) {
                                                                                                                            var73 = method1694(var176, var15, var72);
                                                                                                                        } else if (var176 < 1400) {
                                                                                                                            var73 = method3493(var176, var15, var72);
                                                                                                                        } else if (var176 < 1500) {
                                                                                                                            var73 = method1000(var176, var15, var72);
                                                                                                                        } else if (var176 < 1600) {
                                                                                                                            class237 var77 = var72 ? Statics.field2644 : Statics.field1229;
                                                                                                                            byte var78;
                                                                                                                            if (var176 == 1500) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var77.field2791;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var176 == 1501) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var77.field2792;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var176 == 1502) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var77.field2793;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var176 == 1503) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var77.field2794;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var176 == 1504) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var77.field2798 ? 1 : 0;
                                                                                                                                var78 = 1;
                                                                                                                            } else if (var176 == 1505) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var77.field2807;
                                                                                                                                var78 = 1;
                                                                                                                            } else {
                                                                                                                                var78 = 2;
                                                                                                                            }
                                                                                                                            var73 = var78;
                                                                                                                        } else if (var176 < 1700) {
                                                                                                                            class237 var79 = var72 ? Statics.field2644 : Statics.field1229;
                                                                                                                            byte var80;
                                                                                                                            if (var176 == 1600) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2799;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1601) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2778;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1602) {
                                                                                                                                field1231[++Statics.field525 - 1] = var79.field2838;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1603) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2827;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1604) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2802;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1605) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2832;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1606) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2829;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1607) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2899;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1608) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2830;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1609) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2894;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1610) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2773;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1611) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2803;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1612) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2804;
                                                                                                                                var80 = 1;
                                                                                                                            } else if (var176 == 1613) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var79.field2808.method12();
                                                                                                                                var80 = 1;
                                                                                                                            } else {
                                                                                                                                var80 = 2;
                                                                                                                            }
                                                                                                                            var73 = var80;
                                                                                                                        } else if (var176 < 1800) {
                                                                                                                            var73 = method2667(var176, var15, var72);
                                                                                                                        } else if (var176 < 1900) {
                                                                                                                            var73 = method1499(var176, var15, var72);
                                                                                                                        } else if (var176 < 2000) {
                                                                                                                            var73 = method64(var176, var15, var72);
                                                                                                                        } else if (var176 < 2100) {
                                                                                                                            var73 = method505(var176, var15, var72);
                                                                                                                        } else if (var176 < 2200) {
                                                                                                                            var73 = method1732(var176, var15, var72);
                                                                                                                        } else if (var176 < 2300) {
                                                                                                                            var73 = method1694(var176, var15, var72);
                                                                                                                        } else if (var176 < 2400) {
                                                                                                                            var73 = method3493(var176, var15, var72);
                                                                                                                        } else if (var176 < 2500) {
                                                                                                                            var73 = method1000(var176, var15, var72);
                                                                                                                        } else if (var176 < 2600) {
                                                                                                                            var73 = method37(var176, var15, var72);
                                                                                                                        } else if (var176 < 2700) {
                                                                                                                            class237 var81 = class237.method1884(field1220[--Statics.field1234]);
                                                                                                                            byte var82;
                                                                                                                            if (var176 == 2600) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2799;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2601) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2778;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2602) {
                                                                                                                                field1231[++Statics.field525 - 1] = var81.field2838;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2603) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2827;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2604) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2802;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2605) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2832;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2606) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2829;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2607) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2899;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2608) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2830;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2609) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2894;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2610) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2773;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2611) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2803;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2612) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2804;
                                                                                                                                var82 = 1;
                                                                                                                            } else if (var176 == 2613) {
                                                                                                                                field1220[++Statics.field1234 - 1] = var81.field2808.method12();
                                                                                                                                var82 = 1;
                                                                                                                            } else {
                                                                                                                                var82 = 2;
                                                                                                                            }
                                                                                                                            var73 = var82;
                                                                                                                        } else if (var176 < 2800) {
                                                                                                                            var73 = method474(var176, var15, var72);
                                                                                                                        } else if (var176 < 2900) {
                                                                                                                            var73 = method1866(var176, var15, var72);
                                                                                                                        } else if (var176 < 3000) {
                                                                                                                            var73 = method64(var176, var15, var72);
                                                                                                                        } else if (var176 < 3200) {
                                                                                                                            var73 = method614(var176, var15, var72);
                                                                                                                        } else if (var176 < 3300) {
                                                                                                                            var73 = method1865(var176, var15, var72);
                                                                                                                        } else if (var176 < 3400) {
                                                                                                                            var73 = method3223(var176, var15, var72);
                                                                                                                        } else if (var176 < 3500) {
                                                                                                                            var73 = method483(var176, var15, var72);
                                                                                                                        } else if (var176 < 3700) {
                                                                                                                            var73 = method61(var176, var15, var72);
                                                                                                                        } else if (var176 < 4000) {
                                                                                                                            var73 = Statics.method2953(var176, var15, var72);
                                                                                                                        } else if (var176 < 4100) {
                                                                                                                            byte var85;
                                                                                                                            if (var176 == 4000) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var83 = field1220[Statics.field1234];
                                                                                                                                int var84 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var83 + var84;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4001) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var86 = field1220[Statics.field1234];
                                                                                                                                int var87 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var86 - var87;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4002) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var88 = field1220[Statics.field1234];
                                                                                                                                int var89 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var88 * var89;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4003) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var90 = field1220[Statics.field1234];
                                                                                                                                int var91 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var90 / var91;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4004) {
                                                                                                                                int var92 = field1220[--Statics.field1234];
                                                                                                                                field1220[++Statics.field1234 - 1] = (int) (Math.random() * (double) var92);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4005) {
                                                                                                                                int var93 = field1220[--Statics.field1234];
                                                                                                                                field1220[++Statics.field1234 - 1] = (int) (Math.random() * (double) (var93 + 1));
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4006) {
                                                                                                                                Statics.field1234 -= 5;
                                                                                                                                int var94 = field1220[Statics.field1234];
                                                                                                                                int var95 = field1220[Statics.field1234 + 1];
                                                                                                                                int var96 = field1220[Statics.field1234 + 2];
                                                                                                                                int var97 = field1220[Statics.field1234 + 3];
                                                                                                                                int var98 = field1220[Statics.field1234 + 4];
                                                                                                                                field1220[++Statics.field1234 - 1] = (var95 - var94) * (var98 - var96) / (var97 - var96) + var94;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4007) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var99 = field1220[Statics.field1234];
                                                                                                                                int var100 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var99 * var100 / 100 + var99;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4008) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var101 = field1220[Statics.field1234];
                                                                                                                                int var102 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var101 | 0x1 << var102;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4009) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var103 = field1220[Statics.field1234];
                                                                                                                                int var104 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var103 & -1 - (0x1 << var104);
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4010) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var105 = field1220[Statics.field1234];
                                                                                                                                int var106 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = (var105 & 0x1 << var106) == 0 ? 0 : 1;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4011) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var107 = field1220[Statics.field1234];
                                                                                                                                int var108 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var107 % var108;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4012) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var109 = field1220[Statics.field1234];
                                                                                                                                int var110 = field1220[Statics.field1234 + 1];
                                                                                                                                if (var109 == 0) {
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                } else {
                                                                                                                                    field1220[++Statics.field1234 - 1] = (int) Math.pow((double) var109, (double) var110);
                                                                                                                                }
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4013) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var111 = field1220[Statics.field1234];
                                                                                                                                int var112 = field1220[Statics.field1234 + 1];
                                                                                                                                if (var111 == 0) {
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    var85 = 1;
                                                                                                                                } else {
                                                                                                                                    switch(var112) {
                                                                                                                                        case 0:
                                                                                                                                            field1220[++Statics.field1234 - 1] = Integer.MAX_VALUE;
                                                                                                                                            break;
                                                                                                                                        case 1:
                                                                                                                                            field1220[++Statics.field1234 - 1] = var111;
                                                                                                                                            break;
                                                                                                                                        case 2:
                                                                                                                                            field1220[++Statics.field1234 - 1] = (int) Math.sqrt((double) var111);
                                                                                                                                            break;
                                                                                                                                        case 3:
                                                                                                                                            field1220[++Statics.field1234 - 1] = (int) Math.cbrt((double) var111);
                                                                                                                                            break;
                                                                                                                                        case 4:
                                                                                                                                            field1220[++Statics.field1234 - 1] = (int) Math.sqrt(Math.sqrt((double) var111));
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            field1220[++Statics.field1234 - 1] = (int) Math.pow((double) var111, 1.0D / (double) var112);
                                                                                                                                    }
                                                                                                                                    var85 = 1;
                                                                                                                                }
                                                                                                                            } else if (var176 == 4014) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var113 = field1220[Statics.field1234];
                                                                                                                                int var114 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var113 & var114;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4015) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var115 = field1220[Statics.field1234];
                                                                                                                                int var116 = field1220[Statics.field1234 + 1];
                                                                                                                                field1220[++Statics.field1234 - 1] = var115 | var116;
                                                                                                                                var85 = 1;
                                                                                                                            } else if (var176 == 4018) {
                                                                                                                                Statics.field1234 -= 3;
                                                                                                                                long var117 = (long) field1220[Statics.field1234];
                                                                                                                                long var119 = (long) field1220[Statics.field1234 + 1];
                                                                                                                                long var121 = (long) field1220[Statics.field1234 + 2];
                                                                                                                                field1220[++Statics.field1234 - 1] = (int) (var117 * var121 / var119);
                                                                                                                                var85 = 1;
                                                                                                                            } else {
                                                                                                                                var85 = 2;
                                                                                                                            }
                                                                                                                            var73 = var85;
                                                                                                                        } else if (var176 < 4200) {
                                                                                                                            var73 = method2934(var176, var15, var72);
                                                                                                                        } else if (var176 < 4300) {
                                                                                                                            var73 = method1025(var176, var15, var72);
                                                                                                                        } else if (var176 < 5100) {
                                                                                                                            var73 = method566(var176, var15, var72);
                                                                                                                        } else if (var176 < 5400) {
                                                                                                                            var73 = method249(var176, var15, var72);
                                                                                                                        } else if (var176 < 5600) {
                                                                                                                            byte var128;
                                                                                                                            if (var176 == 5504) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var126 = field1220[Statics.field1234];
                                                                                                                                int var127 = field1220[Statics.field1234 + 1];
                                                                                                                                if (!client.field984) {
                                                                                                                                    client.field886 = var126;
                                                                                                                                    client.field887 = var127;
                                                                                                                                }
                                                                                                                                var128 = 1;
                                                                                                                            } else if (var176 == 5505) {
                                                                                                                                field1220[++Statics.field1234 - 1] = client.field886;
                                                                                                                                var128 = 1;
                                                                                                                            } else if (var176 == 5506) {
                                                                                                                                field1220[++Statics.field1234 - 1] = client.field887;
                                                                                                                                var128 = 1;
                                                                                                                            } else if (var176 == 5530) {
                                                                                                                                int var129 = field1220[--Statics.field1234];
                                                                                                                                if (var129 < 0) {
                                                                                                                                    var129 = 0;
                                                                                                                                }
                                                                                                                                client.field892 = var129;
                                                                                                                                var128 = 1;
                                                                                                                            } else if (var176 == 5531) {
                                                                                                                                field1220[++Statics.field1234 - 1] = client.field892;
                                                                                                                                var128 = 1;
                                                                                                                            } else {
                                                                                                                                var128 = 2;
                                                                                                                            }
                                                                                                                            var73 = var128;
                                                                                                                        } else if (var176 < 5700) {
                                                                                                                            byte var130;
                                                                                                                            if (var176 == 5630) {
                                                                                                                                client.field865 = 250;
                                                                                                                                var130 = 1;
                                                                                                                            } else {
                                                                                                                                var130 = 2;
                                                                                                                            }
                                                                                                                            var73 = var130;
                                                                                                                        } else if (var176 < 6300) {
                                                                                                                            byte var131;
                                                                                                                            if (var176 == 6200) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                client.field1056 = (short) field1220[Statics.field1234];
                                                                                                                                if (client.field1056 <= 0) {
                                                                                                                                    client.field1056 = 256;
                                                                                                                                }
                                                                                                                                client.field948 = (short) field1220[Statics.field1234 + 1];
                                                                                                                                if (client.field948 <= 0) {
                                                                                                                                    client.field948 = 205;
                                                                                                                                }
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var176 == 6201) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                client.field900 = (short) field1220[Statics.field1234];
                                                                                                                                if (client.field900 <= 0) {
                                                                                                                                    client.field900 = 256;
                                                                                                                                }
                                                                                                                                client.field1059 = (short) field1220[Statics.field1234 + 1];
                                                                                                                                if (client.field1059 <= 0) {
                                                                                                                                    client.field1059 = 320;
                                                                                                                                }
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var176 == 6202) {
                                                                                                                                Statics.field1234 -= 4;
                                                                                                                                client.field1060 = (short) field1220[Statics.field1234];
                                                                                                                                if (client.field1060 <= 0) {
                                                                                                                                    client.field1060 = 1;
                                                                                                                                }
                                                                                                                                client.field1061 = (short) field1220[Statics.field1234 + 1];
                                                                                                                                if (client.field1061 <= 0) {
                                                                                                                                    client.field1061 = 32767;
                                                                                                                                } else if (client.field1061 < client.field1060) {
                                                                                                                                    client.field1061 = client.field1060;
                                                                                                                                }
                                                                                                                                client.field1062 = (short) field1220[Statics.field1234 + 2];
                                                                                                                                if (client.field1062 <= 0) {
                                                                                                                                    client.field1062 = 1;
                                                                                                                                }
                                                                                                                                client.field1063 = (short) field1220[Statics.field1234 + 3];
                                                                                                                                if (client.field1063 <= 0) {
                                                                                                                                    client.field1063 = 32767;
                                                                                                                                } else if (client.field1063 < client.field1062) {
                                                                                                                                    client.field1063 = client.field1062;
                                                                                                                                }
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var176 == 6203) {
                                                                                                                                if (client.field976 == null) {
                                                                                                                                    field1220[++Statics.field1234 - 1] = -1;
                                                                                                                                    field1220[++Statics.field1234 - 1] = -1;
                                                                                                                                } else {
                                                                                                                                    Statics.method150(0, 0, client.field976.field2793, client.field976.field2794, false);
                                                                                                                                    field1220[++Statics.field1234 - 1] = client.field1066;
                                                                                                                                    field1220[++Statics.field1234 - 1] = client.field1067;
                                                                                                                                }
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var176 == 6204) {
                                                                                                                                field1220[++Statics.field1234 - 1] = client.field900;
                                                                                                                                field1220[++Statics.field1234 - 1] = client.field1059;
                                                                                                                                var131 = 1;
                                                                                                                            } else if (var176 == 6205) {
                                                                                                                                field1220[++Statics.field1234 - 1] = client.field1056;
                                                                                                                                field1220[++Statics.field1234 - 1] = client.field948;
                                                                                                                                var131 = 1;
                                                                                                                            } else {
                                                                                                                                var131 = 2;
                                                                                                                            }
                                                                                                                            var73 = var131;
                                                                                                                        } else if (var176 < 6600) {
                                                                                                                            byte var132;
                                                                                                                            if (var176 == 6500) {
                                                                                                                                field1220[++Statics.field1234 - 1] = class77.method1569() ? 1 : 0;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6501) {
                                                                                                                                class77.field1168 = 0;
                                                                                                                                class77 var133;
                                                                                                                                if (class77.field1168 < class77.field1180) {
                                                                                                                                    var133 = Statics.field1179[++class77.field1168 - 1];
                                                                                                                                } else {
                                                                                                                                    var133 = null;
                                                                                                                                }
                                                                                                                                if (var133 == null) {
                                                                                                                                    field1220[++Statics.field1234 - 1] = -1;
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1231[++Statics.field525 - 1] = "";
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1231[++Statics.field525 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1220[++Statics.field1234 - 1] = var133.field1163;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var133.field1173;
                                                                                                                                    field1231[++Statics.field525 - 1] = var133.field1176;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var133.field1177;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var133.field1174;
                                                                                                                                    field1231[++Statics.field525 - 1] = var133.field1175;
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6502) {
                                                                                                                                class77 var136;
                                                                                                                                if (class77.field1168 < class77.field1180) {
                                                                                                                                    var136 = Statics.field1179[++class77.field1168 - 1];
                                                                                                                                } else {
                                                                                                                                    var136 = null;
                                                                                                                                }
                                                                                                                                if (var136 == null) {
                                                                                                                                    field1220[++Statics.field1234 - 1] = -1;
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1231[++Statics.field525 - 1] = "";
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1231[++Statics.field525 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1220[++Statics.field1234 - 1] = var136.field1163;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var136.field1173;
                                                                                                                                    field1231[++Statics.field525 - 1] = var136.field1176;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var136.field1177;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var136.field1174;
                                                                                                                                    field1231[++Statics.field525 - 1] = var136.field1175;
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6506) {
                                                                                                                                int var138 = field1220[--Statics.field1234];
                                                                                                                                class77 var139 = null;
                                                                                                                                for (int var140 = 0; var140 < class77.field1180; var140++) {
                                                                                                                                    if (Statics.field1179[var140].field1163 == var138) {
                                                                                                                                        var139 = Statics.field1179[var140];
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var139 == null) {
                                                                                                                                    field1220[++Statics.field1234 - 1] = -1;
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1231[++Statics.field525 - 1] = "";
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1231[++Statics.field525 - 1] = "";
                                                                                                                                } else {
                                                                                                                                    field1220[++Statics.field1234 - 1] = var139.field1163;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var139.field1173;
                                                                                                                                    field1231[++Statics.field525 - 1] = var139.field1176;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var139.field1177;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var139.field1174;
                                                                                                                                    field1231[++Statics.field525 - 1] = var139.field1175;
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6507) {
                                                                                                                                Statics.field1234 -= 4;
                                                                                                                                int var141 = field1220[Statics.field1234];
                                                                                                                                boolean var142 = field1220[Statics.field1234 + 1] == 1;
                                                                                                                                int var143 = field1220[Statics.field1234 + 2];
                                                                                                                                boolean var144 = field1220[Statics.field1234 + 3] == 1;
                                                                                                                                if (Statics.field1179 != null) {
                                                                                                                                    class77.method3209(0, Statics.field1179.length - 1, var141, var142, var143, var144);
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6511) {
                                                                                                                                int var145 = field1220[--Statics.field1234];
                                                                                                                                if (var145 >= 0 && var145 < class77.field1180) {
                                                                                                                                    class77 var146 = Statics.field1179[var145];
                                                                                                                                    field1220[++Statics.field1234 - 1] = var146.field1163;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var146.field1173;
                                                                                                                                    field1231[++Statics.field525 - 1] = var146.field1176;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var146.field1177;
                                                                                                                                    field1220[++Statics.field1234 - 1] = var146.field1174;
                                                                                                                                    field1231[++Statics.field525 - 1] = var146.field1175;
                                                                                                                                } else {
                                                                                                                                    field1220[++Statics.field1234 - 1] = -1;
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1231[++Statics.field525 - 1] = "";
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                    field1231[++Statics.field525 - 1] = "";
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6512) {
                                                                                                                                client.field951 = field1220[--Statics.field1234] == 1;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6513) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var147 = field1220[Statics.field1234];
                                                                                                                                int var148 = field1220[Statics.field1234 + 1];
                                                                                                                                class272 var149 = class272.method2932(var148);
                                                                                                                                if (var149.method4480()) {
                                                                                                                                    field1231[++Statics.field525 - 1] = class279.method2487(var147).method4696(var148, var149.field3476);
                                                                                                                                } else {
                                                                                                                                    field1220[++Statics.field1234 - 1] = class279.method2487(var147).method4669(var148, var149.field3478);
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6514) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var150 = field1220[Statics.field1234];
                                                                                                                                int var151 = field1220[Statics.field1234 + 1];
                                                                                                                                class272 var152 = class272.method2932(var151);
                                                                                                                                if (var152.method4480()) {
                                                                                                                                    field1231[++Statics.field525 - 1] = class276.method1566(var150).method4577(var151, var152.field3476);
                                                                                                                                } else {
                                                                                                                                    field1220[++Statics.field1234 - 1] = class276.method1566(var150).method4582(var151, var152.field3478);
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6515) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var153 = field1220[Statics.field1234];
                                                                                                                                int var154 = field1220[Statics.field1234 + 1];
                                                                                                                                class272 var155 = class272.method2932(var154);
                                                                                                                                if (var155.method4480()) {
                                                                                                                                    field1231[++Statics.field525 - 1] = class277.method1730(var153).method4616(var154, var155.field3476);
                                                                                                                                } else {
                                                                                                                                    field1220[++Statics.field1234 - 1] = class277.method1730(var153).method4615(var154, var155.field3478);
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6516) {
                                                                                                                                Statics.field1234 -= 2;
                                                                                                                                int var156 = field1220[Statics.field1234];
                                                                                                                                int var157 = field1220[Statics.field1234 + 1];
                                                                                                                                class272 var158 = class272.method2932(var157);
                                                                                                                                if (var158.method4480()) {
                                                                                                                                    String[] var159 = field1231;
                                                                                                                                    int var160 = ++Statics.field525 - 1;
                                                                                                                                    class273 var161 = (class273) class273.field3481.method3658((long) var156);
                                                                                                                                    class273 var162;
                                                                                                                                    if (var161 == null) {
                                                                                                                                        byte[] var163 = Statics.field3482.method4158(34, var156);
                                                                                                                                        class273 var164 = new class273();
                                                                                                                                        if (var163 != null) {
                                                                                                                                            var164.method4487(new class194(var163));
                                                                                                                                        }
                                                                                                                                        var164.method4499();
                                                                                                                                        class273.field3481.method3659(var164, (long) var156);
                                                                                                                                        var162 = var164;
                                                                                                                                    } else {
                                                                                                                                        var162 = var161;
                                                                                                                                    }
                                                                                                                                    var159[var160] = var162.method4490(var157, var158.field3476);
                                                                                                                                } else {
                                                                                                                                    int[] var165 = field1220;
                                                                                                                                    int var166 = ++Statics.field1234 - 1;
                                                                                                                                    class273 var167 = (class273) class273.field3481.method3658((long) var156);
                                                                                                                                    class273 var168;
                                                                                                                                    if (var167 == null) {
                                                                                                                                        byte[] var169 = Statics.field3482.method4158(34, var156);
                                                                                                                                        class273 var170 = new class273();
                                                                                                                                        if (var169 != null) {
                                                                                                                                            var170.method4487(new class194(var169));
                                                                                                                                        }
                                                                                                                                        var170.method4499();
                                                                                                                                        class273.field3481.method3659(var170, (long) var156);
                                                                                                                                        var168 = var170;
                                                                                                                                    } else {
                                                                                                                                        var168 = var167;
                                                                                                                                    }
                                                                                                                                    var165[var166] = var168.method4489(var157, var158.field3478);
                                                                                                                                }
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6518) {
                                                                                                                                field1220[++Statics.field1234 - 1] = 0;
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6520) {
                                                                                                                                var132 = 1;
                                                                                                                            } else if (var176 == 6521) {
                                                                                                                                var132 = 1;
                                                                                                                            } else {
                                                                                                                                var132 = 2;
                                                                                                                            }
                                                                                                                            var73 = var132;
                                                                                                                        } else if (var176 < 6700) {
                                                                                                                            var73 = method4664(var176, var15, var72);
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
                                                                                                                    } else if (var176 == 0) {
                                                                                                                        field1220[++Statics.field1234 - 1] = var23[var21];
                                                                                                                    } else if (var176 == 1) {
                                                                                                                        int var31 = var23[var21];
                                                                                                                        field1220[++Statics.field1234 - 1] = class232.field2740[var31];
                                                                                                                    } else if (var176 == 2) {
                                                                                                                        int var32 = var23[var21];
                                                                                                                        class232.field2740[var32] = field1220[--Statics.field1234];
                                                                                                                        client.method2066(var32);
                                                                                                                    } else if (var176 == 3) {
                                                                                                                        field1231[++Statics.field525 - 1] = var15.field1409[var21];
                                                                                                                    } else if (var176 == 6) {
                                                                                                                        var21 += var23[var21];
                                                                                                                    } else if (var176 == 7) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1220[Statics.field1234] != field1220[Statics.field1234 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var176 == 8) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1220[Statics.field1234] == field1220[Statics.field1234 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var176 == 9) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1220[Statics.field1234] < field1220[Statics.field1234 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var176 == 10) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1220[Statics.field1234] > field1220[Statics.field1234 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var176 == 21) {
                                                                                                                        if (field1227 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var33 = field1228[--field1227];
                                                                                                                        var15 = var33.field709;
                                                                                                                        var22 = var15.field1403;
                                                                                                                        var23 = var15.field1404;
                                                                                                                        var21 = var33.field702;
                                                                                                                        Statics.field1226 = var33.field706;
                                                                                                                        Statics.field1221 = var33.field704;
                                                                                                                    } else if (var176 == 25) {
                                                                                                                        int var34 = var23[var21];
                                                                                                                        field1220[++Statics.field1234 - 1] = class232.method248(var34);
                                                                                                                    } else if (var176 == 27) {
                                                                                                                        int var35 = var23[var21];
                                                                                                                        class232.method1727(var35, field1220[--Statics.field1234]);
                                                                                                                    } else if (var176 == 31) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1220[Statics.field1234] <= field1220[Statics.field1234 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var176 == 32) {
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        if (field1220[Statics.field1234] >= field1220[Statics.field1234 + 1]) {
                                                                                                                            var21 += var23[var21];
                                                                                                                        }
                                                                                                                    } else if (var176 == 33) {
                                                                                                                        field1220[++Statics.field1234 - 1] = Statics.field1226[var23[var21]];
                                                                                                                    } else if (var176 == 34) {
                                                                                                                        Statics.field1226[var23[var21]] = field1220[--Statics.field1234];
                                                                                                                    } else if (var176 == 35) {
                                                                                                                        field1231[++Statics.field525 - 1] = Statics.field1221[var23[var21]];
                                                                                                                    } else if (var176 == 36) {
                                                                                                                        Statics.field1221[var23[var21]] = field1231[--Statics.field525];
                                                                                                                    } else if (var176 == 37) {
                                                                                                                        int var36 = var23[var21];
                                                                                                                        Statics.field525 -= var36;
                                                                                                                        String[] var37 = field1231;
                                                                                                                        int var38 = Statics.field525;
                                                                                                                        String var39;
                                                                                                                        if (var36 == 0) {
                                                                                                                            var39 = "";
                                                                                                                        } else if (var36 == 1) {
                                                                                                                            String var40 = var37[var38];
                                                                                                                            if (var40 == null) {
                                                                                                                                var39 = "null";
                                                                                                                            } else {
                                                                                                                                var39 = var40.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var41 = var36 + var38;
                                                                                                                            int var42 = 0;
                                                                                                                            for (int var43 = var38; var43 < var41; var43++) {
                                                                                                                                String var44 = var37[var43];
                                                                                                                                if (var44 == null) {
                                                                                                                                    var42 += 4;
                                                                                                                                } else {
                                                                                                                                    var42 += var44.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var45 = new StringBuilder(var42);
                                                                                                                            for (int var46 = var38; var46 < var41; var46++) {
                                                                                                                                String var47 = var37[var46];
                                                                                                                                if (var47 == null) {
                                                                                                                                    var45.append("null");
                                                                                                                                } else {
                                                                                                                                    var45.append(var47);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var39 = var45.toString();
                                                                                                                        }
                                                                                                                        field1231[++Statics.field525 - 1] = var39;
                                                                                                                    } else if (var176 == 38) {
                                                                                                                        Statics.field1234--;
                                                                                                                    } else if (var176 == 39) {
                                                                                                                        Statics.field525--;
                                                                                                                    } else if (var176 == 40) {
                                                                                                                        int var49 = var23[var21];
                                                                                                                        class96 var50 = (class96) class96.field1407.method3658((long) var49);
                                                                                                                        class96 var51;
                                                                                                                        if (var50 == null) {
                                                                                                                            byte[] var52 = Statics.field1233.method4158(var49, 0);
                                                                                                                            if (var52 == null) {
                                                                                                                                var51 = null;
                                                                                                                            } else {
                                                                                                                                class96 var53 = class96.method4266(var52);
                                                                                                                                class96.field1407.method3659(var53, (long) var49);
                                                                                                                                var51 = var53;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var51 = var50;
                                                                                                                        }
                                                                                                                        class96 var54 = var51;
                                                                                                                        int[] var55 = new int[var51.field1408];
                                                                                                                        String[] var56 = new String[var51.field1402];
                                                                                                                        for (int var57 = 0; var57 < var54.field1405; var57++) {
                                                                                                                            var55[var57] = field1220[Statics.field1234 - var54.field1405 + var57];
                                                                                                                        }
                                                                                                                        for (int var58 = 0; var58 < var54.field1406; var58++) {
                                                                                                                            var56[var58] = field1231[Statics.field525 - var54.field1406 + var58];
                                                                                                                        }
                                                                                                                        Statics.field1234 -= var54.field1405;
                                                                                                                        Statics.field525 -= var54.field1406;
                                                                                                                        class63 var59 = new class63();
                                                                                                                        var59.field709 = var15;
                                                                                                                        var59.field702 = var21;
                                                                                                                        var59.field706 = Statics.field1226;
                                                                                                                        var59.field704 = Statics.field1221;
                                                                                                                        field1228[++field1227 - 1] = var59;
                                                                                                                        var15 = var54;
                                                                                                                        var22 = var54.field1403;
                                                                                                                        var23 = var54.field1404;
                                                                                                                        var21 = -1;
                                                                                                                        Statics.field1226 = var55;
                                                                                                                        Statics.field1221 = var56;
                                                                                                                    } else if (var176 == 42) {
                                                                                                                        field1220[++Statics.field1234 - 1] = Statics.field684.method1826(var23[var21]);
                                                                                                                    } else if (var176 == 43) {
                                                                                                                        Statics.field684.method1800(var23[var21], field1220[--Statics.field1234]);
                                                                                                                    } else if (var176 == 44) {
                                                                                                                        int var60 = var23[var21] >> 16;
                                                                                                                        int var61 = var23[var21] & 0xFFFF;
                                                                                                                        int var62 = field1220[--Statics.field1234];
                                                                                                                        if (var62 >= 0 && var62 <= 5000) {
                                                                                                                            field1222[var60] = var62;
                                                                                                                            byte var63 = -1;
                                                                                                                            if (var61 == 105) {
                                                                                                                                var63 = 0;
                                                                                                                            }
                                                                                                                            int var64 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var64 >= var62) {
                                                                                                                                    continue label848;
                                                                                                                                }
                                                                                                                                field1223[var60][var64] = var63;
                                                                                                                                var64++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var176 == 45) {
                                                                                                                        int var65 = var23[var21];
                                                                                                                        int var66 = field1220[--Statics.field1234];
                                                                                                                        if (var66 < 0 || var66 >= field1222[var65]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1220[++Statics.field1234 - 1] = field1223[var65][var66];
                                                                                                                    } else if (var176 == 46) {
                                                                                                                        int var67 = var23[var21];
                                                                                                                        Statics.field1234 -= 2;
                                                                                                                        int var68 = field1220[Statics.field1234];
                                                                                                                        if (var68 < 0 || var68 >= field1222[var67]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1223[var67][var68] = field1220[Statics.field1234 + 1];
                                                                                                                    } else if (var176 == 47) {
                                                                                                                        String var69 = Statics.field684.method1803(var23[var21]);
                                                                                                                        if (var69 == null) {
                                                                                                                            var69 = "null";
                                                                                                                        }
                                                                                                                        field1231[++Statics.field525 - 1] = var69;
                                                                                                                    } else if (var176 == 48) {
                                                                                                                        Statics.field684.method1820(var23[var21], field1231[--Statics.field525]);
                                                                                                                    } else if (var176 == 60) {
                                                                                                                        class207 var70 = var15.field1410[var23[var21]];
                                                                                                                        class219 var71 = (class219) var70.method3632((long) field1220[--Statics.field1234]);
                                                                                                                        if (var71 != null) {
                                                                                                                            var21 += var71.field2626;
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
        } catch (Exception var175) {
            StringBuilder var173 = new StringBuilder(30);
            var173.append("").append(var15.field2613).append(" ");
            for (int var174 = field1227 - 1; var174 >= 0; var174--) {
                var173.append("").append(field1228[var174].field709.field2613).append(" ");
            }
            var173.append("").append(var24);
            class164.method482(var173.toString(), var175);
        }
    }

    @ObfuscatedName("r.o(ILca;ZI)I")
    public static int method42(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1234 -= 3;
            int var3 = field1220[Statics.field1234];
            int var4 = field1220[Statics.field1234 + 1];
            int var5 = field1220[Statics.field1234 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class237 var6 = class237.method1884(var3);
            if (var6.field2863 == null) {
                var6.field2863 = new class237[var5 + 1];
            }
            if (var6.field2863.length <= var5) {
                class237[] var7 = new class237[var5 + 1];
                for (int var8 = 0; var8 < var6.field2863.length; var8++) {
                    var7[var8] = var6.field2863[var8];
                }
                var6.field2863 = var7;
            }
            if (var5 > 0 && var6.field2863[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class237 var9 = new class237();
            var9.field2902 = var4;
            var9.field2807 = var9.field2795 = var6.field2795;
            var9.field2769 = var5;
            var9.field2777 = true;
            var6.field2863[var5] = var9;
            if (arg2) {
                Statics.field2644 = var9;
            } else {
                Statics.field1229 = var9;
            }
            client.method1035(var6);
            return 1;
        } else if (arg0 == 101) {
            class237 var10 = arg2 ? Statics.field2644 : Statics.field1229;
            class237 var11 = class237.method1884(var10.field2795);
            var11.field2863[var10.field2769] = null;
            client.method1035(var11);
            return 1;
        } else if (arg0 == 102) {
            class237 var12 = class237.method1884(field1220[--Statics.field1234]);
            var12.field2863 = null;
            client.method1035(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1234 -= 2;
            int var13 = field1220[Statics.field1234];
            int var14 = field1220[Statics.field1234 + 1];
            class237 var15 = class237.method3581(var13, var14);
            if (var15 == null || var14 == -1) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = 1;
                if (arg2) {
                    Statics.field2644 = var15;
                } else {
                    Statics.field1229 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class237 var16 = class237.method1884(field1220[--Statics.field1234]);
            if (var16 == null) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = 1;
                if (arg2) {
                    Statics.field2644 = var16;
                } else {
                    Statics.field1229 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ar.p(ILca;ZB)I")
    public static int method505(int arg0, class96 arg1, boolean arg2) {
        int var3 = -1;
        class237 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1220[--Statics.field1234];
            var4 = class237.method1884(var3);
        } else {
            var4 = arg2 ? Statics.field2644 : Statics.field1229;
        }
        if (arg0 == 1000) {
            Statics.field1234 -= 4;
            var4.field2853 = field1220[Statics.field1234];
            var4.field2788 = field1220[Statics.field1234 + 1];
            var4.field2783 = field1220[Statics.field1234 + 2];
            var4.field2784 = field1220[Statics.field1234 + 3];
            client.method1035(var4);
            Statics.field3973.method1288(var4);
            if (var3 != -1 && var4.field2902 == 0) {
                client.method108(Statics.field2770[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1234 -= 4;
            var4.field2789 = field1220[Statics.field1234];
            var4.field2790 = field1220[Statics.field1234 + 1];
            var4.field2785 = field1220[Statics.field1234 + 2];
            var4.field2786 = field1220[Statics.field1234 + 3];
            client.method1035(var4);
            Statics.field3973.method1288(var4);
            if (var3 != -1 && var4.field2902 == 0) {
                client.method108(Statics.field2770[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1220[--Statics.field1234] == 1;
            if (var4.field2798 != var5) {
                var4.field2798 = var5;
                client.method1035(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2911 = field1220[--Statics.field1234] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2912 = field1220[--Statics.field1234] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.a(ILca;ZI)I")
    public static int method1732(int arg0, class96 arg1, boolean arg2) {
        int var3 = -1;
        class237 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1220[--Statics.field1234];
            var4 = class237.method1884(var3);
        } else {
            var4 = arg2 ? Statics.field2644 : Statics.field1229;
        }
        if (arg0 == 1100) {
            Statics.field1234 -= 2;
            var4.field2799 = field1220[Statics.field1234];
            if (var4.field2799 > var4.field2827 - var4.field2793) {
                var4.field2799 = var4.field2827 - var4.field2793;
            }
            if (var4.field2799 < 0) {
                var4.field2799 = 0;
            }
            var4.field2778 = field1220[Statics.field1234 + 1];
            if (var4.field2778 > var4.field2802 - var4.field2794) {
                var4.field2778 = var4.field2802 - var4.field2794;
            }
            if (var4.field2778 < 0) {
                var4.field2778 = 0;
            }
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2803 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2812 = field1220[--Statics.field1234] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2894 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2904 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2875 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2815 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2816 = field1220[--Statics.field1234] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2787 = 1;
            var4.field2847 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1234 -= 6;
            var4.field2836 = field1220[Statics.field1234];
            var4.field2796 = field1220[Statics.field1234 + 1];
            var4.field2829 = field1220[Statics.field1234 + 2];
            var4.field2830 = field1220[Statics.field1234 + 3];
            var4.field2899 = field1220[Statics.field1234 + 4];
            var4.field2832 = field1220[Statics.field1234 + 5];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1220[--Statics.field1234];
            if (var4.field2825 != var5) {
                var4.field2825 = var5;
                var4.field2900 = 0;
                var4.field2801 = 0;
                client.method1035(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2835 = field1220[--Statics.field1234] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1231[--Statics.field525];
            if (!var6.equals(var4.field2838)) {
                var4.field2838 = var6;
                client.method1035(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2837 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1234 -= 3;
            var4.field2780 = field1220[Statics.field1234];
            var4.field2848 = field1220[Statics.field1234 + 1];
            var4.field2840 = field1220[Statics.field1234 + 2];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2843 = field1220[--Statics.field1234] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2817 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2818 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2819 = field1220[--Statics.field1234] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2820 = field1220[--Statics.field1234] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1234 -= 2;
            var4.field2827 = field1220[Statics.field1234];
            var4.field2802 = field1220[Statics.field1234 + 1];
            client.method1035(var4);
            if (var3 != -1 && var4.field2902 == 0) {
                client.method108(Statics.field2770[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2795;
            int var8 = var4.field2769;
            class184 var9 = class184.method979(class181.field2413, client.field864.field1435);
            var9.field2468.method3233(var8);
            var9.field2468.method3479(var7);
            client.field864.method1893(var9);
            client.field931 = var4;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2884 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2804 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2773 = field1220[--Statics.field1234];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var10 = field1220[--Statics.field1234];
            class321 var11 = (class321) class189.method2486(class321.method216(), var10);
            if (var11 != null) {
                var4.field2808 = var11;
                client.method1035(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var12 = field1220[--Statics.field1234] == 1;
            var4.field2890 = var12;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.h(ILca;ZB)I")
    public static int method1694(int arg0, class96 arg1, boolean arg2) {
        class237 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class237.method1884(field1220[--Statics.field1234]);
        } else {
            var3 = arg2 ? Statics.field2644 : Statics.field1229;
        }
        client.method1035(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1234 -= 2;
            int var4 = field1220[Statics.field1234];
            int var5 = field1220[Statics.field1234 + 1];
            var3.field2898 = var4;
            var3.field2813 = var5;
            class277 var6 = class277.method1730(var4);
            var3.field2829 = var6.field3585;
            var3.field2830 = var6.field3586;
            var3.field2899 = var6.field3583;
            var3.field2836 = var6.field3588;
            var3.field2796 = var6.field3589;
            var3.field2832 = var6.field3584;
            if (arg0 == 1205) {
                var3.field2859 = 0;
            } else if (arg0 == 1212 | var6.field3590 == 1) {
                var3.field2859 = 1;
            } else {
                var3.field2859 = 2;
            }
            if (var3.field2833 > 0) {
                var3.field2832 = var3.field2832 * 32 / var3.field2833;
            } else if (var3.field2789 > 0) {
                var3.field2832 = var3.field2832 * 32 / var3.field2789;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2787 = 2;
            var3.field2847 = field1220[--Statics.field1234];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2787 = 3;
            var3.field2847 = Statics.field818.field781.method4052();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gz.l(ILca;ZB)I")
    public static int method3493(int arg0, class96 arg1, boolean arg2) {
        class237 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class237.method1884(field1220[--Statics.field1234]);
        } else {
            var3 = arg2 ? Statics.field2644 : Statics.field1229;
        }
        if (arg0 == 1300) {
            int var4 = field1220[--Statics.field1234] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4108(var4, field1231[--Statics.field525]);
                return 1;
            } else {
                Statics.field525--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1234 -= 2;
            int var5 = field1220[Statics.field1234];
            int var6 = field1220[Statics.field1234 + 1];
            var3.field2861 = class237.method3581(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2856 = field1220[--Statics.field1234] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2854 = field1220[--Statics.field1234];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2855 = field1220[--Statics.field1234];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2909 = field1231[--Statics.field525];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2857 = field1231[--Statics.field525];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2811 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bk.y(ILca;ZI)I")
    public static int method1000(int arg0, class96 arg1, boolean arg2) {
        class237 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class237.method1884(field1220[--Statics.field1234]);
        } else {
            var3 = arg2 ? Statics.field2644 : Statics.field1229;
        }
        String var4 = field1231[--Statics.field525];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1220[--Statics.field1234];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1220[--Statics.field1234];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1231[--Statics.field525];
            } else {
                var7[var8] = Integer.valueOf(field1220[--Statics.field1234]);
            }
        }
        int var9 = field1220[--Statics.field1234];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2860 = var7;
        } else if (arg0 == 1401) {
            var3.field2842 = var7;
        } else if (arg0 == 1402) {
            var3.field2862 = var7;
        } else if (arg0 == 1403) {
            var3.field2864 = var7;
        } else if (arg0 == 1404) {
            var3.field2851 = var7;
        } else if (arg0 == 1405) {
            var3.field2907 = var7;
        } else if (arg0 == 1406) {
            var3.field2870 = var7;
        } else if (arg0 == 1407) {
            var3.field2852 = var7;
            var3.field2872 = var5;
        } else if (arg0 == 1408) {
            var3.field2877 = var7;
        } else if (arg0 == 1409) {
            var3.field2878 = var7;
        } else if (arg0 == 1410) {
            var3.field2868 = var7;
        } else if (arg0 == 1411) {
            var3.field2767 = var7;
        } else if (arg0 == 1412) {
            var3.field2865 = var7;
        } else if (arg0 == 1414) {
            var3.field2873 = var7;
            var3.field2874 = var5;
        } else if (arg0 == 1415) {
            var3.field2888 = var7;
            var3.field2876 = var5;
        } else if (arg0 == 1416) {
            var3.field2869 = var7;
        } else if (arg0 == 1417) {
            var3.field2879 = var7;
        } else if (arg0 == 1418) {
            var3.field2880 = var7;
        } else if (arg0 == 1419) {
            var3.field2881 = var7;
        } else if (arg0 == 1420) {
            var3.field2882 = var7;
        } else if (arg0 == 1421) {
            var3.field2883 = var7;
        } else if (arg0 == 1422) {
            var3.field2831 = var7;
        } else if (arg0 == 1423) {
            var3.field2885 = var7;
        } else if (arg0 == 1424) {
            var3.field2901 = var7;
        } else if (arg0 == 1425) {
            var3.field2779 = var7;
        } else if (arg0 == 1426) {
            var3.field2797 = var7;
        } else if (arg0 == 1427) {
            var3.field2887 = var7;
        } else {
            return 2;
        }
        var3.field2858 = true;
        return 1;
    }

    @ObfuscatedName("eg.g(ILca;ZI)I")
    public static int method2667(int arg0, class96 arg1, boolean arg2) {
        class237 var3 = arg2 ? Statics.field2644 : Statics.field1229;
        if (arg0 == 1700) {
            field1220[++Statics.field1234 - 1] = var3.field2898;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2898 == -1) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = var3.field2813;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1220[++Statics.field1234 - 1] = var3.field2769;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.c(ILca;ZB)I")
    public static int method1499(int arg0, class96 arg1, boolean arg2) {
        class237 var3 = arg2 ? Statics.field2644 : Statics.field1229;
        if (arg0 == 1800) {
            field1220[++Statics.field1234 - 1] = class238.method1742(client.method4010(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1220[--Statics.field1234];
            int var5 = var4 - 1;
            if (var3.field2811 == null || var5 >= var3.field2811.length || var3.field2811[var5] == null) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = var3.field2811[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2909 == null) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = var3.field2909;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("v.u(ILca;ZI)I")
    public static int method64(int arg0, class96 arg1, boolean arg2) {
        class237 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class237.method1884(field1220[--Statics.field1234]);
        } else {
            var3 = arg2 ? Statics.field2644 : Statics.field1229;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1232 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2887 == null) {
            return 0;
        } else {
            class68 var4 = new class68();
            var4.field749 = var3;
            var4.field747 = var3.field2887;
            var4.field752 = field1232 + 1;
            client.field822.method3741(var4);
            return 1;
        }
    }

    @ObfuscatedName("c.t(ILca;ZI)I")
    public static int method37(int arg0, class96 arg1, boolean arg2) {
        class237 var3 = class237.method1884(field1220[--Statics.field1234]);
        if (arg0 == 2500) {
            field1220[++Statics.field1234 - 1] = var3.field2791;
            return 1;
        } else if (arg0 == 2501) {
            field1220[++Statics.field1234 - 1] = var3.field2792;
            return 1;
        } else if (arg0 == 2502) {
            field1220[++Statics.field1234 - 1] = var3.field2793;
            return 1;
        } else if (arg0 == 2503) {
            field1220[++Statics.field1234 - 1] = var3.field2794;
            return 1;
        } else if (arg0 == 2504) {
            field1220[++Statics.field1234 - 1] = var3.field2798 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1220[++Statics.field1234 - 1] = var3.field2807;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.f(ILca;ZB)I")
    public static int method474(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class237 var3 = class237.method1884(field1220[--Statics.field1234]);
            field1220[++Statics.field1234 - 1] = var3.field2898;
            return 1;
        } else if (arg0 == 2701) {
            class237 var4 = class237.method1884(field1220[--Statics.field1234]);
            if (var4.field2898 == -1) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = var4.field2813;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1220[--Statics.field1234];
            class67 var6 = (class67) client.field986.method3674((long) var5);
            if (var6 == null) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1220[++Statics.field1234 - 1] = client.field964;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cs.m(ILca;ZI)I")
    public static int method1866(int arg0, class96 arg1, boolean arg2) {
        class237 var3 = class237.method1884(field1220[--Statics.field1234]);
        if (arg0 == 2800) {
            field1220[++Statics.field1234 - 1] = class238.method1742(client.method4010(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1220[--Statics.field1234];
            int var5 = var4 - 1;
            if (var3.field2811 == null || var5 >= var3.field2811.length || var3.field2811[var5] == null) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = var3.field2811[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2909 == null) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = var3.field2909;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.x(ILca;ZI)I")
    public static int method614(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1231[--Statics.field525];
            class95.method2873(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1234 -= 2;
            client.method3141(Statics.field818, field1220[Statics.field1234], field1220[Statics.field1234 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.method2945();
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1231[--Statics.field525];
            int var5 = 0;
            if (class305.method1627(var4)) {
                int var6 = class305.method2952(var4, 10, true);
                var5 = var6;
            }
            class184 var7 = class184.method979(class181.field2343, client.field864.field1435);
            var7.field2468.method3235(var5);
            client.field864.method1893(var7);
            return 1;
        } else if (arg0 == 3105) {
            String var8 = field1231[--Statics.field525];
            class184 var9 = class184.method979(class181.field2435, client.field864.field1435);
            var9.field2468.method3232(var8.length() + 1);
            var9.field2468.method3239(var8);
            client.field864.method1893(var9);
            return 1;
        } else if (arg0 == 3106) {
            String var10 = field1231[--Statics.field525];
            class184 var11 = class184.method979(class181.field2410, client.field864.field1435);
            var11.field2468.method3232(var10.length() + 1);
            var11.field2468.method3239(var10);
            client.field864.method1893(var11);
            return 1;
        } else if (arg0 == 3107) {
            int var12 = field1220[--Statics.field1234];
            String var13 = field1231[--Statics.field525];
            int var14 = class93.field1372;
            int[] var15 = class93.field1377;
            boolean var16 = false;
            class292 var17 = new class292(var13, Statics.field2759);
            for (int var18 = 0; var18 < var14; var18++) {
                class72 var19 = client.field923[var15[var18]];
                if (var19 != null && Statics.field818 != var19 && var19.field800 != null && var19.field800.equals(var17)) {
                    if (var12 == 1) {
                        class184 var20 = class184.method979(class181.field2409, client.field864.field1435);
                        var20.field2468.method3274(0);
                        var20.field2468.method3233(var15[var18]);
                        client.field864.method1893(var20);
                    } else if (var12 == 4) {
                        class184 var21 = class184.method979(class181.field2389, client.field864.field1435);
                        var21.field2468.method3274(0);
                        var21.field2468.method3281(var15[var18]);
                        client.field864.method1893(var21);
                    } else if (var12 == 6) {
                        class184 var22 = class184.method979(class181.field2339, client.field864.field1435);
                        var22.field2468.method3272(0);
                        var22.field2468.method3233(var15[var18]);
                        client.field864.method1893(var22);
                    } else if (var12 == 7) {
                        class184 var23 = class184.method979(class181.field2390, client.field864.field1435);
                        var23.field2468.method3284(var15[var18]);
                        var23.field2468.method3273(0);
                        client.field864.method1893(var23);
                    }
                    var16 = true;
                    break;
                }
            }
            if (!var16) {
                class95.method2873(4, "", class246.field3121 + var13);
            }
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1234 -= 3;
            int var24 = field1220[Statics.field1234];
            int var25 = field1220[Statics.field1234 + 1];
            int var26 = field1220[Statics.field1234 + 2];
            class237 var27 = class237.method1884(var26);
            client.method21(var27, var24, var25);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1234 -= 2;
            int var28 = field1220[Statics.field1234];
            int var29 = field1220[Statics.field1234 + 1];
            class237 var30 = arg2 ? Statics.field2644 : Statics.field1229;
            client.method21(var30, var28, var29);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field333 = field1220[--Statics.field1234] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1220[++Statics.field1234 - 1] = Statics.field1072.field1182 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1072.field1182 = field1220[--Statics.field1234] == 1;
            class78.method2590();
            return 1;
        } else if (arg0 == 3113) {
            String var31 = field1231[--Statics.field525];
            boolean var32 = field1220[--Statics.field1234] == 1;
            class57.method3129(var31, var32, false);
            return 1;
        } else if (arg0 == 3115) {
            int var33 = field1220[--Statics.field1234];
            class184 var34 = class184.method979(class181.field2391, client.field864.field1435);
            var34.field2468.method3233(var33);
            client.field864.method1893(var34);
            return 1;
        } else if (arg0 == 3116) {
            int var35 = field1220[--Statics.field1234];
            Statics.field525 -= 2;
            String var36 = field1231[Statics.field525];
            String var37 = field1231[Statics.field525 + 1];
            if (var36.length() > 500) {
                return 1;
            } else if (var37.length() > 500) {
                return 1;
            } else {
                class184 var38 = class184.method979(class181.field2346, client.field864.field1435);
                var38.field2468.method3233(1 + class194.method564(var36) + class194.method564(var37));
                var38.field2468.method3274(var35);
                var38.field2468.method3239(var36);
                var38.field2468.method3239(var37);
                client.field864.method1893(var38);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field952 = field1220[--Statics.field1234] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field926 = field1220[--Statics.field1234] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ca.w(ILca;ZB)I")
    public static int method1865(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1234 -= 3;
            int var3 = field1220[Statics.field1234];
            int var4 = field1220[Statics.field1234 + 1];
            int var5 = field1220[Statics.field1234 + 2];
            if (client.field1041 != 0 && var4 != 0 && client.field950 < 50) {
                client.field1044[client.field950] = var3;
                client.field1045[client.field950] = var4;
                client.field1046[client.field950] = var5;
                client.field1048[client.field950] = null;
                client.field1047[client.field950] = 0;
                client.field950++;
            }
            return 1;
        } else if (arg0 == 3201) {
            client.method157(field1220[--Statics.field1234]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1234 -= 2;
            client.method13(field1220[Statics.field1234], field1220[Statics.field1234 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gl.j(ILca;ZB)I")
    public static int method3223(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1220[++Statics.field1234 - 1] = client.field830;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1234 -= 2;
            int var3 = field1220[Statics.field1234];
            int var4 = field1220[Statics.field1234 + 1];
            int[] var5 = field1220;
            int var6 = ++Statics.field1234 - 1;
            class65 var7 = (class65) class65.field720.method3674((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field721.length) {
                var8 = var7.field721[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1234 -= 2;
            int var9 = field1220[Statics.field1234];
            int var10 = field1220[Statics.field1234 + 1];
            int[] var11 = field1220;
            int var12 = ++Statics.field1234 - 1;
            class65 var13 = (class65) class65.field720.method3674((long) var9);
            int var14;
            if (var13 == null) {
                var14 = 0;
            } else if (var10 >= 0 && var10 < var13.field723.length) {
                var14 = var13.field723[var10];
            } else {
                var14 = 0;
            }
            var11[var12] = var14;
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1234 -= 2;
            int var15 = field1220[Statics.field1234];
            int var16 = field1220[Statics.field1234 + 1];
            int[] var17 = field1220;
            int var18 = ++Statics.field1234 - 1;
            class65 var19 = (class65) class65.field720.method3674((long) var15);
            int var20;
            if (var19 == null) {
                var20 = 0;
            } else if (var16 == -1) {
                var20 = 0;
            } else {
                int var21 = 0;
                for (int var22 = 0; var22 < var19.field723.length; var22++) {
                    if (var19.field721[var22] == var16) {
                        var21 += var19.field723[var22];
                    }
                }
                var20 = var21;
            }
            var17[var18] = var20;
            return 1;
        } else if (arg0 == 3304) {
            int var23 = field1220[--Statics.field1234];
            int[] var24 = field1220;
            int var25 = ++Statics.field1234 - 1;
            class261 var26 = (class261) class261.field3384.method3658((long) var23);
            class261 var27;
            if (var26 == null) {
                byte[] var28 = Statics.field3385.method4158(5, var23);
                class261 var29 = new class261();
                if (var28 != null) {
                    var29.method4319(new class194(var28));
                }
                class261.field3384.method3659(var29, (long) var23);
                var27 = var29;
            } else {
                var27 = var26;
            }
            var24[var25] = var27.field3383;
            return 1;
        } else if (arg0 == 3305) {
            int var30 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = client.field938[var30];
            return 1;
        } else if (arg0 == 3306) {
            int var31 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = client.field939[var31];
            return 1;
        } else if (arg0 == 3307) {
            int var32 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = client.field1010[var32];
            return 1;
        } else if (arg0 == 3308) {
            int var33 = Statics.field2735;
            int var34 = (Statics.field818.field1133 >> 7) + Statics.field710;
            int var35 = (Statics.field818.field1096 >> 7) + Statics.field401;
            field1220[++Statics.field1234 - 1] = (var33 << 28) + (var34 << 14) + var35;
            return 1;
        } else if (arg0 == 3309) {
            int var36 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = var36 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var37 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = var37 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var38 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = var38 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1220[++Statics.field1234 - 1] = client.field825 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1234 -= 2;
            int var39 = field1220[Statics.field1234] + 32768;
            int var40 = field1220[Statics.field1234 + 1];
            int[] var41 = field1220;
            int var42 = ++Statics.field1234 - 1;
            class65 var43 = (class65) class65.field720.method3674((long) var39);
            int var44;
            if (var43 == null) {
                var44 = -1;
            } else if (var40 >= 0 && var40 < var43.field721.length) {
                var44 = var43.field721[var40];
            } else {
                var44 = -1;
            }
            var41[var42] = var44;
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1234 -= 2;
            int var45 = field1220[Statics.field1234] + 32768;
            int var46 = field1220[Statics.field1234 + 1];
            int[] var47 = field1220;
            int var48 = ++Statics.field1234 - 1;
            class65 var49 = (class65) class65.field720.method3674((long) var45);
            int var50;
            if (var49 == null) {
                var50 = 0;
            } else if (var46 >= 0 && var46 < var49.field723.length) {
                var50 = var49.field723[var46];
            } else {
                var50 = 0;
            }
            var47[var48] = var50;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1234 -= 2;
            int var51 = field1220[Statics.field1234] + 32768;
            int var52 = field1220[Statics.field1234 + 1];
            field1220[++Statics.field1234 - 1] = Statics.method3063(var51, var52);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field907 >= 2) {
                field1220[++Statics.field1234 - 1] = client.field907;
            } else {
                field1220[++Statics.field1234 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1220[++Statics.field1234 - 1] = client.field837;
            return 1;
        } else if (arg0 == 3318) {
            field1220[++Statics.field1234 - 1] = client.field1043;
            return 1;
        } else if (arg0 == 3321) {
            field1220[++Statics.field1234 - 1] = client.field969;
            return 1;
        } else if (arg0 == 3322) {
            field1220[++Statics.field1234 - 1] = client.field970;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field1028) {
                field1220[++Statics.field1234 - 1] = 1;
            } else {
                field1220[++Statics.field1234 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1220[++Statics.field1234 - 1] = client.field823;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1234 -= 4;
            int var53 = field1220[Statics.field1234];
            int var54 = field1220[Statics.field1234 + 1];
            int var55 = field1220[Statics.field1234 + 2];
            int var56 = field1220[Statics.field1234 + 3];
            int var57 = (var54 << 14) + var53;
            int var58 = (var55 << 28) + var57;
            int var59 = var56 + var58;
            field1220[++Statics.field1234 - 1] = var59;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.z(ILca;ZI)I")
    public static int method483(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1234 -= 2;
            int var3 = field1220[Statics.field1234];
            int var4 = field1220[Statics.field1234 + 1];
            class274 var5 = class274.method2592(var3);
            if (var5.field3488 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3491; var6++) {
                if (var5.field3492[var6] == var4) {
                    field1231[++Statics.field525 - 1] = var5.field3495[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1231[++Statics.field525 - 1] = var5.field3485;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1234 -= 4;
            int var7 = field1220[Statics.field1234];
            int var8 = field1220[Statics.field1234 + 1];
            int var9 = field1220[Statics.field1234 + 2];
            int var10 = field1220[Statics.field1234 + 3];
            class274 var11 = class274.method2592(var9);
            if (var11.field3494 != var7 || var11.field3488 != var8) {
                if (var8 == 115) {
                    field1231[++Statics.field525 - 1] = "null";
                } else {
                    field1220[++Statics.field1234 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3491; var12++) {
                if (var11.field3492[var12] == var10) {
                    if (var8 == 115) {
                        field1231[++Statics.field525 - 1] = var11.field3495[var12];
                    } else {
                        field1220[++Statics.field1234 - 1] = var11.field3493[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1231[++Statics.field525 - 1] = var11.field3485;
                } else {
                    field1220[++Statics.field1234 - 1] = var11.field3487;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1220[--Statics.field1234];
            class274 var14 = class274.method2592(var13);
            field1220[++Statics.field1234 - 1] = var14.method4507();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("v.e(ILca;ZI)I")
    public static int method61(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1278.field1196 == 0) {
                field1220[++Statics.field1234 - 1] = -2;
            } else if (Statics.field1278.field1196 == 1) {
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = Statics.field1278.field1195.method4827();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1220[--Statics.field1234];
            if (Statics.field1278.method1574() && var3 >= 0 && var3 < Statics.field1278.field1195.method4827()) {
                class293 var4 = (class293) Statics.field1278.field1195.method4907(var3);
                field1231[++Statics.field525 - 1] = var4.method4781();
                field1231[++Statics.field525 - 1] = var4.method4779();
            } else {
                field1231[++Statics.field525 - 1] = "";
                field1231[++Statics.field525 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1220[--Statics.field1234];
            if (Statics.field1278.method1574() && var5 >= 0 && var5 < Statics.field1278.field1195.method4827()) {
                field1220[++Statics.field1234 - 1] = ((class288) Statics.field1278.field1195.method4907(var5)).field3721;
            } else {
                field1220[++Statics.field1234 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1220[--Statics.field1234];
            if (Statics.field1278.method1574() && var6 >= 0 && var6 < Statics.field1278.field1195.method4827()) {
                field1220[++Statics.field1234 - 1] = ((class288) Statics.field1278.field1195.method4907(var6)).field3720;
            } else {
                field1220[++Statics.field1234 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1231[--Statics.field525];
            int var8 = field1220[--Statics.field1234];
            class79.method702(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1231[--Statics.field525];
            Statics.field1278.method1609(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1231[--Statics.field525];
            Statics.field1278.method1585(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1231[--Statics.field525];
            Statics.field1278.method1577(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1231[--Statics.field525];
            Statics.field1278.method1601(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1231[--Statics.field525];
            String var14 = client.method1717(var13);
            field1220[++Statics.field1234 - 1] = Statics.field1278.method1579(new class292(var14, Statics.field2759), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field14 == null) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = Statics.field14.field3746;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field14 == null) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = Statics.field14.method4827();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1220[--Statics.field1234];
            if (Statics.field14 == null || var15 >= Statics.field14.method4827()) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = Statics.field14.method4907(var15).method4780().method4926();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1220[--Statics.field1234];
            if (Statics.field14 == null || var16 >= Statics.field14.method4827()) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = ((class288) Statics.field14.method4907(var16)).method4917();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1220[--Statics.field1234];
            if (Statics.field14 == null || var17 >= Statics.field14.method4827()) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = ((class288) Statics.field14.method4907(var17)).field3720;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1220[++Statics.field1234 - 1] = Statics.field14 == null ? 0 : Statics.field14.field3740;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1231[--Statics.field525];
            client.method490(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1220[++Statics.field1234 - 1] = Statics.field14 == null ? 0 : Statics.field14.field3745;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1231[--Statics.field525];
            if (!var19.equals("")) {
                class184 var20 = class184.method979(class181.field2411, client.field864.field1435);
                var20.field2468.method3232(class194.method564(var19));
                var20.field2468.method3239(var19);
                client.field864.method1893(var20);
            }
            return 1;
        } else if (arg0 == 3620) {
            class184 var21 = class184.method979(class181.field2411, client.field864.field1435);
            var21.field2468.method3232(0);
            client.field864.method1893(var21);
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1278.method1574()) {
                field1220[++Statics.field1234 - 1] = Statics.field1278.field1194.method4827();
            } else {
                field1220[++Statics.field1234 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var22 = field1220[--Statics.field1234];
            if (Statics.field1278.method1574() && var22 >= 0 && var22 < Statics.field1278.field1194.method4827()) {
                class287 var23 = (class287) Statics.field1278.field1194.method4907(var22);
                field1231[++Statics.field525 - 1] = var23.method4781();
                field1231[++Statics.field525 - 1] = var23.method4779();
            } else {
                field1231[++Statics.field525 - 1] = "";
                field1231[++Statics.field525 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var24 = field1231[--Statics.field525];
            String var25 = client.method1717(var24);
            field1220[++Statics.field1234 - 1] = Statics.field1278.method1580(new class292(var25, Statics.field2759)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var26 = field1220[--Statics.field1234];
            if (Statics.field14 == null || var26 >= Statics.field14.method4827() || !Statics.field14.method4907(var26).method4780().equals(Statics.field818.field800)) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field14 == null || Statics.field14.field3743 == null) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = Statics.field14.field3743;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var27 = field1220[--Statics.field1234];
            if (Statics.field14 == null || var27 >= Statics.field14.method4827() || !((class282) Statics.field14.method4907(var27)).method4764()) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var28 = field1220[--Statics.field1234];
            if (Statics.field14 == null || var28 >= Statics.field14.method4827() || !((class282) Statics.field14.method4907(var28)).method4763()) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1278.field1195.method4893();
            return 1;
        } else if (arg0 == 3629) {
            boolean var29 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class314(var29));
            return 1;
        } else if (arg0 == 3630) {
            boolean var30 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class315(var30));
            return 1;
        } else if (arg0 == 3631) {
            boolean var31 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class155(var31));
            return 1;
        } else if (arg0 == 3632) {
            boolean var32 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class149(var32));
            return 1;
        } else if (arg0 == 3633) {
            boolean var33 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class154(var33));
            return 1;
        } else if (arg0 == 3634) {
            boolean var34 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class157(var34));
            return 1;
        } else if (arg0 == 3635) {
            boolean var35 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class153(var35));
            return 1;
        } else if (arg0 == 3636) {
            boolean var36 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class151(var36));
            return 1;
        } else if (arg0 == 3637) {
            boolean var37 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class150(var37));
            return 1;
        } else if (arg0 == 3638) {
            boolean var38 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class152(var38));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1278.field1195.method4838();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1278.field1194.method4893();
            return 1;
        } else if (arg0 == 3641) {
            boolean var39 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1194.method4847(new class314(var39));
            return 1;
        } else if (arg0 == 3642) {
            boolean var40 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1194.method4847(new class315(var40));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1278.field1194.method4838();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field14 != null) {
                Statics.field14.method4893();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var41 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class314(var41));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var42 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class315(var42));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var43 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class155(var43));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var44 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class149(var44));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var45 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class154(var45));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var46 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class157(var46));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var47 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class153(var47));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var48 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class151(var48));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var49 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class150(var49));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var50 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class152(var50));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field14 != null) {
                Statics.field14.method4838();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var51 = field1220[--Statics.field1234] == 1;
            Statics.field1278.field1195.method4847(new class156(var51));
            return 1;
        } else if (arg0 == 3657) {
            boolean var52 = field1220[--Statics.field1234] == 1;
            if (Statics.field14 != null) {
                Statics.field14.method4847(new class156(var52));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fs.ao(ILca;ZI)I")
    public static int method2934(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1231[--Statics.field525];
            int var4 = field1220[--Statics.field1234];
            field1231[++Statics.field525 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field525 -= 2;
            String var5 = field1231[Statics.field525];
            String var6 = field1231[Statics.field525 + 1];
            field1231[++Statics.field525 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1231[--Statics.field525];
            int var8 = field1220[--Statics.field1234];
            field1231[++Statics.field525 - 1] = var7 + class305.method3503(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1231[--Statics.field525];
            field1231[++Statics.field525 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1220[--Statics.field1234];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1230.setTime(new Date(var11));
            int var13 = field1230.get(5);
            int var14 = field1230.get(2);
            int var15 = field1230.get(1);
            field1231[++Statics.field525 - 1] = var13 + "-" + field1224[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field525 -= 2;
            String var16 = field1231[Statics.field525];
            String var17 = field1231[Statics.field525 + 1];
            if (Statics.field818.field781 != null && Statics.field818.field781.field2752) {
                field1231[++Statics.field525 - 1] = var17;
            } else {
                field1231[++Statics.field525 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1220[--Statics.field1234];
            field1231[++Statics.field525 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field525 -= 2;
            int[] var19 = field1220;
            int var20 = ++Statics.field1234 - 1;
            String var21 = field1231[Statics.field525];
            String var22 = field1231[Statics.field525 + 1];
            int var23 = client.field827;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            char var28 = 0;
            char var29 = 0;
            int var38;
            label207: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class185.method3032(var36, var23) - class185.method3032(var37, var23);
                                break label207;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class185.method3032(var41, var23) - class185.method3032(var42, var23);
                                break label207;
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
                var28 = class185.method472(var43);
                var29 = class185.method472(var45);
                char var47 = class185.method39(var43, var23);
                char var48 = class185.method39(var45, var23);
                if (var47 != var48 && Character.toUpperCase(var47) != Character.toUpperCase(var48)) {
                    char var49 = Character.toLowerCase(var47);
                    char var50 = Character.toLowerCase(var48);
                    if (var49 != var50) {
                        var38 = class185.method3032(var49, var23) - class185.method3032(var50, var23);
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
            String var53 = field1231[--Statics.field525];
            Statics.field1234 -= 2;
            int var54 = field1220[Statics.field1234];
            int var55 = field1220[Statics.field1234 + 1];
            byte[] var56 = Statics.field13.method4158(var55, 0);
            class298 var57 = new class298(var56);
            field1220[++Statics.field1234 - 1] = var57.method5001(var53, var54);
            return 1;
        } else if (arg0 == 4109) {
            String var58 = field1231[--Statics.field525];
            Statics.field1234 -= 2;
            int var59 = field1220[Statics.field1234];
            int var60 = field1220[Statics.field1234 + 1];
            byte[] var61 = Statics.field13.method4158(var60, 0);
            class298 var62 = new class298(var61);
            field1220[++Statics.field1234 - 1] = var62.method5056(var58, var59);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field525 -= 2;
            String var63 = field1231[Statics.field525];
            String var64 = field1231[Statics.field525 + 1];
            if (field1220[--Statics.field1234] == 1) {
                field1231[++Statics.field525 - 1] = var63;
            } else {
                field1231[++Statics.field525 - 1] = var64;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var65 = field1231[--Statics.field525];
            field1231[++Statics.field525 - 1] = class299.method5037(var65);
            return 1;
        } else if (arg0 == 4112) {
            String var66 = field1231[--Statics.field525];
            int var67 = field1220[--Statics.field1234];
            field1231[++Statics.field525 - 1] = var66 + (char) var67;
            return 1;
        } else if (arg0 == 4113) {
            int var68 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = class305.method4378((char) var68) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var69 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = class305.method4452((char) var69) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var70 = field1220[--Statics.field1234];
            int[] var71 = field1220;
            int var72 = ++Statics.field1234 - 1;
            char var73 = (char) var70;
            boolean var74 = var73 >= 'A' && var73 <= 'Z' || var73 >= 'a' && var73 <= 'z';
            var71[var72] = var74 ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var75 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = class305.method1028((char) var75) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var76 = field1231[--Statics.field525];
            if (var76 == null) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = var76.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var77 = field1231[--Statics.field525];
            Statics.field1234 -= 2;
            int var78 = field1220[Statics.field1234];
            int var79 = field1220[Statics.field1234 + 1];
            field1231[++Statics.field525 - 1] = var77.substring(var78, var79);
            return 1;
        } else if (arg0 == 4119) {
            String var80 = field1231[--Statics.field525];
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
            field1231[++Statics.field525 - 1] = var81.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var85 = field1231[--Statics.field525];
            int var86 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = var85.indexOf(var86);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field525 -= 2;
            String var87 = field1231[Statics.field525];
            String var88 = field1231[Statics.field525 + 1];
            int var89 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = var87.indexOf(var88, var89);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.am(ILca;ZI)I")
    public static int method1025(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1220[--Statics.field1234];
            field1231[++Statics.field525 - 1] = class277.method1730(var3).field3579;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1234 -= 2;
            int var4 = field1220[Statics.field1234];
            int var5 = field1220[Statics.field1234 + 1];
            class277 var6 = class277.method1730(var4);
            if (var5 < 1 || var5 > 5 || var6.field3593[var5 - 1] == null) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = var6.field3593[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1234 -= 2;
            int var7 = field1220[Statics.field1234];
            int var8 = field1220[Statics.field1234 + 1];
            class277 var9 = class277.method1730(var7);
            if (var8 < 1 || var8 > 5 || var9.field3594[var8 - 1] == null) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = var9.field3594[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = class277.method1730(var10).field3591;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = class277.method1730(var11).field3590 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1220[--Statics.field1234];
            class277 var13 = class277.method1730(var12);
            if (var13.field3580 == -1 && var13.field3601 >= 0) {
                field1220[++Statics.field1234 - 1] = var13.field3601;
            } else {
                field1220[++Statics.field1234 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1220[--Statics.field1234];
            class277 var15 = class277.method1730(var14);
            if (var15.field3580 >= 0 && var15.field3601 >= 0) {
                field1220[++Statics.field1234 - 1] = var15.field3601;
            } else {
                field1220[++Statics.field1234 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = class277.method1730(var16).field3592 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1220[--Statics.field1234];
            class277 var18 = class277.method1730(var17);
            if (var18.field3587 == -1 && var18.field3602 >= 0) {
                field1220[++Statics.field1234 - 1] = var18.field3602;
            } else {
                field1220[++Statics.field1234 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1220[--Statics.field1234];
            class277 var20 = class277.method1730(var19);
            if (var20.field3587 >= 0 && var20.field3602 >= 0) {
                field1220[++Statics.field1234 - 1] = var20.field3602;
            } else {
                field1220[++Statics.field1234 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1231[--Statics.field525];
            int var22 = field1220[--Statics.field1234];
            client.method1005(var21, var22 == 1);
            field1220[++Statics.field1234 - 1] = Statics.field1368;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1433 == null || Statics.field269 >= Statics.field1368) {
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = Statics.field1433[++Statics.field269 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field269 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.aj(ILca;ZB)I")
    public static int method566(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1220[++Statics.field1234 - 1] = client.field1021;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1234 -= 3;
            client.field1021 = field1220[Statics.field1234];
            int var3 = field1220[Statics.field1234 + 1];
            class313[] var4 = class313.method1113();
            int var5 = 0;
            class313 var7;
            while (true) {
                if (var5 >= var4.length) {
                    var7 = null;
                    break;
                }
                class313 var6 = var4[var5];
                if (var6.field3854 == var3) {
                    var7 = var6;
                    break;
                }
                var5++;
            }
            Statics.field780 = var7;
            if (Statics.field780 == null) {
                Statics.field780 = class313.field3855;
            }
            client.field1022 = field1220[Statics.field1234 + 2];
            class184 var8 = class184.method979(class181.field2349, client.field864.field1435);
            var8.field2468.method3232(client.field1021);
            var8.field2468.method3232(Statics.field780.field3854);
            var8.field2468.method3232(client.field1022);
            client.field864.method1893(var8);
            return 1;
        } else if (arg0 == 5002) {
            String var9 = field1231[--Statics.field525];
            Statics.field1234 -= 2;
            int var10 = field1220[Statics.field1234];
            int var11 = field1220[Statics.field1234 + 1];
            class184 var12 = class184.method979(class181.field2364, client.field864.field1435);
            var12.field2468.method3232(class194.method564(var9) + 2);
            var12.field2468.method3239(var9);
            var12.field2468.method3232(var10 - 1);
            var12.field2468.method3232(var11);
            client.field864.method1893(var12);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1234 -= 2;
            int var13 = field1220[Statics.field1234];
            int var14 = field1220[Statics.field1234 + 1];
            class70 var15 = class95.method11(var13, var14);
            if (var15 == null) {
                field1220[++Statics.field1234 - 1] = -1;
                field1220[++Statics.field1234 - 1] = 0;
                field1231[++Statics.field525 - 1] = "";
                field1231[++Statics.field525 - 1] = "";
                field1231[++Statics.field525 - 1] = "";
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = var15.field773;
                field1220[++Statics.field1234 - 1] = var15.field766;
                field1231[++Statics.field525 - 1] = var15.field768 == null ? "" : var15.field768;
                field1231[++Statics.field525 - 1] = var15.field772 == null ? "" : var15.field772;
                field1231[++Statics.field525 - 1] = var15.field769 == null ? "" : var15.field769;
                field1220[++Statics.field1234 - 1] = var15.method1057() ? 1 : (var15.method1075() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var16 = field1220[--Statics.field1234];
            class70 var17 = (class70) class95.field1400.method3632((long) var16);
            if (var17 == null) {
                field1220[++Statics.field1234 - 1] = -1;
                field1220[++Statics.field1234 - 1] = 0;
                field1231[++Statics.field525 - 1] = "";
                field1231[++Statics.field525 - 1] = "";
                field1231[++Statics.field525 - 1] = "";
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = var17.field765;
                field1220[++Statics.field1234 - 1] = var17.field766;
                field1231[++Statics.field525 - 1] = var17.field768 == null ? "" : var17.field768;
                field1231[++Statics.field525 - 1] = var17.field772 == null ? "" : var17.field772;
                field1231[++Statics.field525 - 1] = var17.field769 == null ? "" : var17.field769;
                field1220[++Statics.field1234 - 1] = var17.method1057() ? 1 : (var17.method1075() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field780 == null) {
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = Statics.field780.field3854;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var19 = field1231[--Statics.field525];
            int var20 = field1220[--Statics.field1234];
            String var21 = var19.toLowerCase();
            byte var22 = 0;
            if (var21.startsWith(class246.field3232)) {
                var22 = 0;
                var19 = var19.substring(class246.field3232.length());
            } else if (var21.startsWith(class246.field3150)) {
                var22 = 1;
                var19 = var19.substring(class246.field3150.length());
            } else if (var21.startsWith(class246.field3152)) {
                var22 = 2;
                var19 = var19.substring(class246.field3152.length());
            } else if (var21.startsWith(class246.field3216)) {
                var22 = 3;
                var19 = var19.substring(class246.field3216.length());
            } else if (var21.startsWith(class246.field3156)) {
                var22 = 4;
                var19 = var19.substring(class246.field3156.length());
            } else if (var21.startsWith(class246.field3158)) {
                var22 = 5;
                var19 = var19.substring(class246.field3158.length());
            } else if (var21.startsWith(class246.field3160)) {
                var22 = 6;
                var19 = var19.substring(class246.field3160.length());
            } else if (var21.startsWith(class246.field3162)) {
                var22 = 7;
                var19 = var19.substring(class246.field3162.length());
            } else if (var21.startsWith(class246.field3164)) {
                var22 = 8;
                var19 = var19.substring(class246.field3164.length());
            } else if (var21.startsWith(class246.field3166)) {
                var22 = 9;
                var19 = var19.substring(class246.field3166.length());
            } else if (var21.startsWith(class246.field3149)) {
                var22 = 10;
                var19 = var19.substring(class246.field3149.length());
            } else if (var21.startsWith(class246.field3031)) {
                var22 = 11;
                var19 = var19.substring(class246.field3031.length());
            } else if (client.field827 != 0) {
                if (var21.startsWith(class246.field3074)) {
                    var22 = 0;
                    var19 = var19.substring(class246.field3074.length());
                } else if (var21.startsWith(class246.field3151)) {
                    var22 = 1;
                    var19 = var19.substring(class246.field3151.length());
                } else if (var21.startsWith(class246.field3242)) {
                    var22 = 2;
                    var19 = var19.substring(class246.field3242.length());
                } else if (var21.startsWith(class246.field3155)) {
                    var22 = 3;
                    var19 = var19.substring(class246.field3155.length());
                } else if (var21.startsWith(class246.field3157)) {
                    var22 = 4;
                    var19 = var19.substring(class246.field3157.length());
                } else if (var21.startsWith(class246.field3159)) {
                    var22 = 5;
                    var19 = var19.substring(class246.field3159.length());
                } else if (var21.startsWith(class246.field3161)) {
                    var22 = 6;
                    var19 = var19.substring(class246.field3161.length());
                } else if (var21.startsWith(class246.field3163)) {
                    var22 = 7;
                    var19 = var19.substring(class246.field3163.length());
                } else if (var21.startsWith(class246.field3199)) {
                    var22 = 8;
                    var19 = var19.substring(class246.field3199.length());
                } else if (var21.startsWith(class246.field3154)) {
                    var22 = 9;
                    var19 = var19.substring(class246.field3154.length());
                } else if (var21.startsWith(class246.field3169)) {
                    var22 = 10;
                    var19 = var19.substring(class246.field3169.length());
                } else if (var21.startsWith(class246.field3148)) {
                    var22 = 11;
                    var19 = var19.substring(class246.field3148.length());
                }
            }
            String var23 = var19.toLowerCase();
            byte var24 = 0;
            if (var23.startsWith(class246.field3172)) {
                var24 = 1;
                var19 = var19.substring(class246.field3172.length());
            } else if (var23.startsWith(class246.field3174)) {
                var24 = 2;
                var19 = var19.substring(class246.field3174.length());
            } else if (var23.startsWith(class246.field3176)) {
                var24 = 3;
                var19 = var19.substring(class246.field3176.length());
            } else if (var23.startsWith(class246.field3093)) {
                var24 = 4;
                var19 = var19.substring(class246.field3093.length());
            } else if (var23.startsWith(class246.field3180)) {
                var24 = 5;
                var19 = var19.substring(class246.field3180.length());
            } else if (client.field827 != 0) {
                if (var23.startsWith(class246.field3132)) {
                    var24 = 1;
                    var19 = var19.substring(class246.field3132.length());
                } else if (var23.startsWith(class246.field2991)) {
                    var24 = 2;
                    var19 = var19.substring(class246.field2991.length());
                } else if (var23.startsWith(class246.field3177)) {
                    var24 = 3;
                    var19 = var19.substring(class246.field3177.length());
                } else if (var23.startsWith(class246.field3179)) {
                    var24 = 4;
                    var19 = var19.substring(class246.field3179.length());
                } else if (var23.startsWith(class246.field3203)) {
                    var24 = 5;
                    var19 = var19.substring(class246.field3203.length());
                }
            }
            class184 var25 = class184.method979(class181.field2427, client.field864.field1435);
            var25.field2468.method3232(0);
            int var26 = var25.field2468.field2538;
            var25.field2468.method3232(var20);
            var25.field2468.method3232(var22);
            var25.field2468.method3232(var24);
            class200 var27 = var25.field2468;
            int var28 = var27.field2538;
            int var29 = var19.length();
            byte[] var30 = new byte[var29];
            for (int var31 = 0; var31 < var29; var31++) {
                char var32 = var19.charAt(var31);
                if (!(var32 <= 0 || var32 >= 128) || !(var32 < 160 || var32 > 255)) {
                    var30[var31] = (byte) var32;
                } else if (var32 == 8364) {
                    var30[var31] = -128;
                } else if (var32 == 8218) {
                    var30[var31] = -126;
                } else if (var32 == 402) {
                    var30[var31] = -125;
                } else if (var32 == 8222) {
                    var30[var31] = -124;
                } else if (var32 == 8230) {
                    var30[var31] = -123;
                } else if (var32 == 8224) {
                    var30[var31] = -122;
                } else if (var32 == 8225) {
                    var30[var31] = -121;
                } else if (var32 == 710) {
                    var30[var31] = -120;
                } else if (var32 == 8240) {
                    var30[var31] = -119;
                } else if (var32 == 352) {
                    var30[var31] = -118;
                } else if (var32 == 8249) {
                    var30[var31] = -117;
                } else if (var32 == 338) {
                    var30[var31] = -116;
                } else if (var32 == 381) {
                    var30[var31] = -114;
                } else if (var32 == 8216) {
                    var30[var31] = -111;
                } else if (var32 == 8217) {
                    var30[var31] = -110;
                } else if (var32 == 8220) {
                    var30[var31] = -109;
                } else if (var32 == 8221) {
                    var30[var31] = -108;
                } else if (var32 == 8226) {
                    var30[var31] = -107;
                } else if (var32 == 8211) {
                    var30[var31] = -106;
                } else if (var32 == 8212) {
                    var30[var31] = -105;
                } else if (var32 == 732) {
                    var30[var31] = -104;
                } else if (var32 == 8482) {
                    var30[var31] = -103;
                } else if (var32 == 353) {
                    var30[var31] = -102;
                } else if (var32 == 8250) {
                    var30[var31] = -101;
                } else if (var32 == 339) {
                    var30[var31] = -100;
                } else if (var32 == 382) {
                    var30[var31] = -98;
                } else if (var32 == 376) {
                    var30[var31] = -97;
                } else {
                    var30[var31] = 63;
                }
            }
            var27.method3337(var30.length);
            var27.field2538 += Statics.field3787.method3165(var30, 0, var30.length, var27.field2541, var27.field2538);
            var25.field2468.method3245(var25.field2468.field2538 - var26);
            client.field864.method1893(var25);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field525 -= 2;
            String var35 = field1231[Statics.field525];
            String var36 = field1231[Statics.field525 + 1];
            class184 var37 = class184.method979(class181.field2365, client.field864.field1435);
            var37.field2468.method3233(0);
            int var38 = var37.field2468.field2538;
            var37.field2468.method3239(var35);
            class200 var39 = var37.field2468;
            int var40 = var39.field2538;
            int var41 = var36.length();
            byte[] var42 = new byte[var41];
            for (int var43 = 0; var43 < var41; var43++) {
                char var44 = var36.charAt(var43);
                if (!(var44 <= 0 || var44 >= 128) || !(var44 < 160 || var44 > 255)) {
                    var42[var43] = (byte) var44;
                } else if (var44 == 8364) {
                    var42[var43] = -128;
                } else if (var44 == 8218) {
                    var42[var43] = -126;
                } else if (var44 == 402) {
                    var42[var43] = -125;
                } else if (var44 == 8222) {
                    var42[var43] = -124;
                } else if (var44 == 8230) {
                    var42[var43] = -123;
                } else if (var44 == 8224) {
                    var42[var43] = -122;
                } else if (var44 == 8225) {
                    var42[var43] = -121;
                } else if (var44 == 710) {
                    var42[var43] = -120;
                } else if (var44 == 8240) {
                    var42[var43] = -119;
                } else if (var44 == 352) {
                    var42[var43] = -118;
                } else if (var44 == 8249) {
                    var42[var43] = -117;
                } else if (var44 == 338) {
                    var42[var43] = -116;
                } else if (var44 == 381) {
                    var42[var43] = -114;
                } else if (var44 == 8216) {
                    var42[var43] = -111;
                } else if (var44 == 8217) {
                    var42[var43] = -110;
                } else if (var44 == 8220) {
                    var42[var43] = -109;
                } else if (var44 == 8221) {
                    var42[var43] = -108;
                } else if (var44 == 8226) {
                    var42[var43] = -107;
                } else if (var44 == 8211) {
                    var42[var43] = -106;
                } else if (var44 == 8212) {
                    var42[var43] = -105;
                } else if (var44 == 732) {
                    var42[var43] = -104;
                } else if (var44 == 8482) {
                    var42[var43] = -103;
                } else if (var44 == 353) {
                    var42[var43] = -102;
                } else if (var44 == 8250) {
                    var42[var43] = -101;
                } else if (var44 == 339) {
                    var42[var43] = -100;
                } else if (var44 == 382) {
                    var42[var43] = -98;
                } else if (var44 == 376) {
                    var42[var43] = -97;
                } else {
                    var42[var43] = 63;
                }
            }
            var39.method3337(var42.length);
            var39.field2538 += Statics.field3787.method3165(var42, 0, var42.length, var39.field2541, var39.field2538);
            var37.field2468.method3355(var37.field2468.field2538 - var38);
            client.field864.method1893(var37);
            return 1;
        } else if (arg0 == 5015) {
            String var47;
            if (Statics.field818 == null || Statics.field818.field800 == null) {
                var47 = "";
            } else {
                var47 = Statics.field818.field800.method4926();
            }
            field1231[++Statics.field525 - 1] = var47;
            return 1;
        } else if (arg0 == 5016) {
            field1220[++Statics.field1234 - 1] = client.field1022;
            return 1;
        } else if (arg0 == 5017) {
            int var48 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = Statics.method2830(var48);
            return 1;
        } else if (arg0 == 5018) {
            int var49 = field1220[--Statics.field1234];
            int[] var50 = field1220;
            int var51 = ++Statics.field1234 - 1;
            class70 var52 = (class70) class95.field1400.method3632((long) var49);
            int var53;
            if (var52 == null) {
                var53 = -1;
            } else if (class95.field1398.field2631 == var52.field2616) {
                var53 = -1;
            } else {
                var53 = ((class70) var52.field2616).field773;
            }
            var50[var51] = var53;
            return 1;
        } else if (arg0 == 5019) {
            int var54 = field1220[--Statics.field1234];
            int[] var55 = field1220;
            int var56 = ++Statics.field1234 - 1;
            class70 var57 = (class70) class95.field1400.method3632((long) var54);
            int var58;
            if (var57 == null) {
                var58 = -1;
            } else if (class95.field1398.field2631 == var57.field2617) {
                var58 = -1;
            } else {
                var58 = ((class70) var57.field2617).field773;
            }
            var55[var56] = var58;
            return 1;
        } else if (arg0 == 5020) {
            String var59 = field1231[--Statics.field525];
            client.method1728(var59);
            return 1;
        } else if (arg0 == 5021) {
            client.field1023 = field1231[--Statics.field525].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1231[++Statics.field525 - 1] = client.field1023;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.ah(ILca;ZI)I")
    public static int method249(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 5306) {
            int[] var3 = field1220;
            int var4 = ++Statics.field1234 - 1;
            int var5 = client.field971 ? 2 : 1;
            var3[var4] = var5;
            return 1;
        } else if (arg0 == 5307) {
            int var6 = field1220[--Statics.field1234];
            if (var6 == 1 || var6 == 2) {
                client.method4248(var6);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1220[++Statics.field1234 - 1] = Statics.field1072.field1184;
            return 1;
        } else if (arg0 == 5309) {
            int var7 = field1220[--Statics.field1234];
            if (var7 == 1 || var7 == 2) {
                Statics.field1072.field1184 = var7;
                class78.method2590();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jj.af(ILca;ZI)I")
    public static int method4664(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field2735;
            int var4 = (Statics.field818.field1133 >> 7) + Statics.field710;
            int var5 = (Statics.field818.field1096 >> 7) + Statics.field401;
            client.method1560().method5505(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1220[--Statics.field1234];
            String var7 = "";
            class33 var8 = client.method1560().method5527(var6);
            if (var8 != null) {
                var7 = var8.method278();
            }
            field1231[++Statics.field525 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1220[--Statics.field1234];
            client.method1560().method5510(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1220[++Statics.field1234 - 1] = client.method1560().method5518();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1220[--Statics.field1234];
            client.method1560().method5515(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1220[++Statics.field1234 - 1] = client.method1560().method5520() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class233 var11 = new class233(field1220[--Statics.field1234]);
            client.method1560().method5522(var11.field2742, var11.field2743);
            return 1;
        } else if (arg0 == 6607) {
            class233 var12 = new class233(field1220[--Statics.field1234]);
            client.method1560().method5556(var12.field2742, var12.field2743);
            return 1;
        } else if (arg0 == 6608) {
            class233 var13 = new class233(field1220[--Statics.field1234]);
            client.method1560().method5524(var13.field2741, var13.field2742, var13.field2743);
            return 1;
        } else if (arg0 == 6609) {
            class233 var14 = new class233(field1220[--Statics.field1234]);
            client.method1560().method5525(var14.field2741, var14.field2742, var14.field2743);
            return 1;
        } else if (arg0 == 6610) {
            field1220[++Statics.field1234 - 1] = client.method1560().method5526();
            field1220[++Statics.field1234 - 1] = client.method1560().method5657();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1220[--Statics.field1234];
            class33 var16 = client.method1560().method5527(var15);
            if (var16 == null) {
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = var16.method283().method4027();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1220[--Statics.field1234];
            class33 var18 = client.method1560().method5527(var17);
            if (var18 == null) {
                field1220[++Statics.field1234 - 1] = 0;
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = (var18.method282() - var18.method281() + 1) * 64;
                field1220[++Statics.field1234 - 1] = (var18.method284() - var18.method318() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1220[--Statics.field1234];
            class33 var20 = client.method1560().method5527(var19);
            if (var20 == null) {
                field1220[++Statics.field1234 - 1] = 0;
                field1220[++Statics.field1234 - 1] = 0;
                field1220[++Statics.field1234 - 1] = 0;
                field1220[++Statics.field1234 - 1] = 0;
            } else {
                field1220[++Statics.field1234 - 1] = var20.method281() * 64;
                field1220[++Statics.field1234 - 1] = var20.method318() * 64;
                field1220[++Statics.field1234 - 1] = var20.method282() * 64 + 64 - 1;
                field1220[++Statics.field1234 - 1] = var20.method284() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1220[--Statics.field1234];
            class33 var22 = client.method1560().method5527(var21);
            if (var22 == null) {
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var22.method280();
            }
            return 1;
        } else if (arg0 == 6615) {
            class233 var23 = client.method1560().method5528();
            if (var23 == null) {
                field1220[++Statics.field1234 - 1] = -1;
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var23.field2742;
                field1220[++Statics.field1234 - 1] = var23.field2743;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1220[++Statics.field1234 - 1] = client.method1560().method5507();
            return 1;
        } else if (arg0 == 6617) {
            class233 var24 = new class233(field1220[--Statics.field1234]);
            class33 var25 = client.method1560().method5566();
            if (var25 == null) {
                field1220[++Statics.field1234 - 1] = -1;
                field1220[++Statics.field1234 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method292(var24.field2741, var24.field2742, var24.field2743);
            if (var26 == null) {
                field1220[++Statics.field1234 - 1] = -1;
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var26[0];
                field1220[++Statics.field1234 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class233 var27 = new class233(field1220[--Statics.field1234]);
            class33 var28 = client.method1560().method5566();
            if (var28 == null) {
                field1220[++Statics.field1234 - 1] = -1;
                field1220[++Statics.field1234 - 1] = -1;
                return 1;
            }
            class233 var29 = var28.method273(var27.field2742, var27.field2743);
            if (var29 == null) {
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var29.method4027();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1234 -= 2;
            int var30 = field1220[Statics.field1234];
            class233 var31 = new class233(field1220[Statics.field1234 + 1]);
            class33 var32 = client.method1560().method5527(var30);
            int var33 = Statics.field818.field803;
            int var34 = (Statics.field818.field1133 >> 7) + Statics.field710;
            int var35 = (Statics.field818.field1096 >> 7) + Statics.field401;
            class233 var36 = new class233(var33, var34, var35);
            client.method1560().method5511(var32, var36, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1234 -= 2;
            int var37 = field1220[Statics.field1234];
            class233 var38 = new class233(field1220[Statics.field1234 + 1]);
            class33 var39 = client.method1560().method5527(var37);
            int var40 = Statics.field818.field803;
            int var41 = (Statics.field818.field1133 >> 7) + Statics.field710;
            int var42 = (Statics.field818.field1096 >> 7) + Statics.field401;
            class233 var43 = new class233(var40, var41, var42);
            client.method1560().method5511(var39, var43, var38, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1234 -= 2;
            int var44 = field1220[Statics.field1234];
            class233 var45 = new class233(field1220[Statics.field1234 + 1]);
            class33 var46 = client.method1560().method5527(var44);
            if (var46 == null) {
                field1220[++Statics.field1234 - 1] = 0;
                return 1;
            } else {
                field1220[++Statics.field1234 - 1] = var46.method295(var45.field2741, var45.field2742, var45.field2743) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1220[++Statics.field1234 - 1] = client.method1560().method5529();
            field1220[++Statics.field1234 - 1] = client.method1560().method5514();
            return 1;
        } else if (arg0 == 6623) {
            class233 var47 = new class233(field1220[--Statics.field1234]);
            class33 var48 = client.method1560().method5504(var47.field2741, var47.field2742, var47.field2743);
            if (var48 == null) {
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var48.method275();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1560().method5531(field1220[--Statics.field1234]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1560().method5607();
            return 1;
        } else if (arg0 == 6626) {
            client.method1560().method5679(field1220[--Statics.field1234]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1560().method5534();
            return 1;
        } else if (arg0 == 6628) {
            boolean var49 = field1220[--Statics.field1234] == 1;
            client.method1560().method5614(var49);
            return 1;
        } else if (arg0 == 6629) {
            int var50 = field1220[--Statics.field1234];
            client.method1560().method5536(var50);
            return 1;
        } else if (arg0 == 6630) {
            int var51 = field1220[--Statics.field1234];
            client.method1560().method5537(var51);
            return 1;
        } else if (arg0 == 6631) {
            client.method1560().method5538();
            return 1;
        } else if (arg0 == 6632) {
            boolean var52 = field1220[--Statics.field1234] == 1;
            client.method1560().method5539(var52);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1234 -= 2;
            int var53 = field1220[Statics.field1234];
            boolean var54 = field1220[Statics.field1234 + 1] == 1;
            client.method1560().method5540(var53, var54);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1234 -= 2;
            int var55 = field1220[Statics.field1234];
            boolean var56 = field1220[Statics.field1234 + 1] == 1;
            client.method1560().method5541(var55, var56);
            return 1;
        } else if (arg0 == 6635) {
            field1220[++Statics.field1234 - 1] = client.method1560().method5555() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var57 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = client.method1560().method5543(var57) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var58 = field1220[--Statics.field1234];
            field1220[++Statics.field1234 - 1] = client.method1560().method5544(var58) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1234 -= 2;
            int var59 = field1220[Statics.field1234];
            class233 var60 = new class233(field1220[Statics.field1234 + 1]);
            class233 var61 = client.method1560().method5516(var59, var60);
            if (var61 == null) {
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var61.method4027();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var62 = client.method1560().method5549();
            if (var62 == null) {
                field1220[++Statics.field1234 - 1] = -1;
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var62.field489;
                field1220[++Statics.field1234 - 1] = var62.field491.method4027();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var63 = client.method1560().method5560();
            if (var63 == null) {
                field1220[++Statics.field1234 - 1] = -1;
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var63.field489;
                field1220[++Statics.field1234 - 1] = var63.field491.method4027();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var64 = field1220[--Statics.field1234];
            class263 var65 = Statics.field4025[var64];
            if (var65.field3396 == null) {
                field1231[++Statics.field525 - 1] = "";
            } else {
                field1231[++Statics.field525 - 1] = var65.field3396;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var66 = field1220[--Statics.field1234];
            class263 var67 = Statics.field4025[var66];
            field1220[++Statics.field1234 - 1] = var67.field3400;
            return 1;
        } else if (arg0 == 6695) {
            int var68 = field1220[--Statics.field1234];
            class263 var69 = Statics.field4025[var68];
            if (var69 == null) {
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var69.field3398;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var70 = field1220[--Statics.field1234];
            class263 var71 = Statics.field4025[var70];
            if (var71 == null) {
                field1220[++Statics.field1234 - 1] = -1;
            } else {
                field1220[++Statics.field1234 - 1] = var71.field3394;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1220[++Statics.field1234 - 1] = Statics.field3789.field557;
            return 1;
        } else if (arg0 == 6698) {
            field1220[++Statics.field1234 - 1] = Statics.field3789.field555.method4027();
            return 1;
        } else if (arg0 == 6699) {
            field1220[++Statics.field1234 - 1] = Statics.field3789.field554.method4027();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.ai(II)V")
    public static void method20(int arg0) {
        if (arg0 == -1 || !class237.method1(arg0)) {
            return;
        }
        class237[] var1 = Statics.field2770[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class237 var3 = var1[var2];
            if (var3.field2810 != null) {
                class68 var4 = new class68();
                var4.field749 = var3;
                var4.field747 = var3.field2810;
                method489(var4, 5000000);
            }
        }
    }
}
