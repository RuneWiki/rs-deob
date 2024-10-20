package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bs")
public class class71 {

    @ObfuscatedName("bs.i")
    public static int[] field1047 = new int[5];

    @ObfuscatedName("bs.r")
    public static int[][] field1052 = new int[5][5000];

    @ObfuscatedName("bs.j")
    public static int[] field1053 = new int[1000];

    @ObfuscatedName("bs.e")
    public static String[] field1055 = new String[1000];

    @ObfuscatedName("bs.v")
    public static int field1058 = 0;

    @ObfuscatedName("bs.k")
    public static class52[] field1057 = new class52[50];

    @ObfuscatedName("bs.l")
    public static Calendar field1060 = Calendar.getInstance();

    @ObfuscatedName("bs.f")
    public static final String[] field1059 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bs.a")
    public static boolean field1048 = false;

    @ObfuscatedName("bs.x")
    public static boolean field1061 = false;

    @ObfuscatedName("bs.b")
    public static int field1062 = 0;

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.y(Lbc;I)V")
    public static void method109(class58 arg0) {
        method2848(arg0, 500000);
    }

    @ObfuscatedName("dc.c(Lbc;II)V")
    public static void method2848(class58 arg0, int arg1) {
        Object[] var2 = arg0.field556;
        int var3 = arg0.field562;
        boolean var4 = var3 == 10 || var3 == 11 || var3 == 12 || var3 == 13 || var3 == 14 || var3 == 15 || var3 == 16 || var3 == 17;
        class87 var14;
        if (var4) {
            Statics.field406 = (class37) var2[0];
            class258 var5 = class258.method4467(Statics.field406.field339);
            int var6 = arg0.field562;
            int var7 = var5.field3289;
            int var8 = var5.field3285;
            int var9 = class239.method4102(var7, var6);
            class87 var10 = class87.method2562(var9, var6);
            class87 var11;
            if (var10 == null) {
                int var12 = class239.method2580(var8, var6);
                class87 var13 = class87.method2562(var12, var6);
                if (var13 == null) {
                    var11 = null;
                } else {
                    var11 = var13;
                }
            } else {
                var11 = var10;
            }
            var14 = var11;
        } else {
            int var15 = (Integer) var2[0];
            var14 = class87.method5123(var15);
        }
        if (var14 == null) {
            return;
        }
        Statics.field1054 = 0;
        Statics.field36 = 0;
        int var16 = -1;
        int[] var17 = var14.field1248;
        int[] var18 = var14.field1240;
        byte var19 = -1;
        field1058 = 0;
        field1048 = false;
        try {
            Statics.field1056 = new int[var14.field1243];
            int var20 = 0;
            Statics.field1050 = new String[var14.field1244];
            int var21 = 0;
            for (int var22 = 1; var22 < var2.length; var22++) {
                if (var2[var22] instanceof Integer) {
                    int var23 = (Integer) var2[var22];
                    if (var23 == -2147483647) {
                        var23 = arg0.field554;
                    }
                    if (var23 == -2147483646) {
                        var23 = arg0.field560;
                    }
                    if (var23 == -2147483645) {
                        var23 = arg0.field555 == null ? -1 : arg0.field555.field2677;
                    }
                    if (var23 == -2147483644) {
                        var23 = arg0.field563;
                    }
                    if (var23 == -2147483643) {
                        var23 = arg0.field555 == null ? -1 : arg0.field555.field2644;
                    }
                    if (var23 == -2147483642) {
                        var23 = arg0.field557 == null ? -1 : arg0.field557.field2677;
                    }
                    if (var23 == -2147483641) {
                        var23 = arg0.field557 == null ? -1 : arg0.field557.field2644;
                    }
                    if (var23 == -2147483640) {
                        var23 = arg0.field558;
                    }
                    if (var23 == -2147483639) {
                        var23 = arg0.field559;
                    }
                    Statics.field1056[var20++] = var23;
                } else if (var2[var22] instanceof String) {
                    String var24 = (String) var2[var22];
                    if (var24.equals("event_opbase")) {
                        var24 = arg0.field551;
                    }
                    Statics.field1050[var21++] = var24;
                }
            }
            int var25 = 0;
            field1062 = arg0.field561;
            while (true) {
                var25++;
                if (var25 > arg1) {
                    throw new RuntimeException();
                }
                var16++;
                int var70 = var17[var16];
                if (var70 >= 100) {
                    boolean var54;
                    if (var14.field1240[var16] == 1) {
                        var54 = true;
                    } else {
                        var54 = false;
                    }
                    int var55 = method16(var70, var14, var54);
                    switch(var55) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var70 == 0) {
                    field1053[++Statics.field1054 - 1] = var18[var16];
                } else if (var70 == 1) {
                    int var26 = var18[var16];
                    field1053[++Statics.field1054 - 1] = class228.field2601[var26];
                } else if (var70 == 2) {
                    int var27 = var18[var16];
                    class228.field2601[var27] = field1053[--Statics.field1054];
                    client.method918(var27);
                } else if (var70 == 3) {
                    field1055[++Statics.field36 - 1] = var14.field1241[var16];
                } else if (var70 == 6) {
                    var16 += var18[var16];
                } else if (var70 == 7) {
                    Statics.field1054 -= 2;
                    if (field1053[Statics.field1054] != field1053[Statics.field1054 + 1]) {
                        var16 += var18[var16];
                    }
                } else if (var70 == 8) {
                    Statics.field1054 -= 2;
                    if (field1053[Statics.field1054] == field1053[Statics.field1054 + 1]) {
                        var16 += var18[var16];
                    }
                } else if (var70 == 9) {
                    Statics.field1054 -= 2;
                    if (field1053[Statics.field1054] < field1053[Statics.field1054 + 1]) {
                        var16 += var18[var16];
                    }
                } else if (var70 == 10) {
                    Statics.field1054 -= 2;
                    if (field1053[Statics.field1054] > field1053[Statics.field1054 + 1]) {
                        var16 += var18[var16];
                    }
                } else if (var70 == 21) {
                    if (field1058 == 0) {
                        return;
                    }
                    class52 var30 = field1057[--field1058];
                    var14 = var30.field507;
                    var17 = var14.field1248;
                    var18 = var14.field1240;
                    var16 = var30.field506;
                    Statics.field1056 = var30.field510;
                    Statics.field1050 = var30.field508;
                } else if (var70 == 25) {
                    int var31 = var18[var16];
                    field1053[++Statics.field1054 - 1] = class228.method3085(var31);
                } else if (var70 == 27) {
                    int var32 = var18[var16];
                    class228.method4220(var32, field1053[--Statics.field1054]);
                } else if (var70 == 31) {
                    Statics.field1054 -= 2;
                    if (field1053[Statics.field1054] <= field1053[Statics.field1054 + 1]) {
                        var16 += var18[var16];
                    }
                } else if (var70 == 32) {
                    Statics.field1054 -= 2;
                    if (field1053[Statics.field1054] >= field1053[Statics.field1054 + 1]) {
                        var16 += var18[var16];
                    }
                } else if (var70 == 33) {
                    field1053[++Statics.field1054 - 1] = Statics.field1056[var18[var16]];
                } else if (var70 == 34) {
                    Statics.field1056[var18[var16]] = field1053[--Statics.field1054];
                } else if (var70 == 35) {
                    field1055[++Statics.field36 - 1] = Statics.field1050[var18[var16]];
                } else if (var70 == 36) {
                    Statics.field1050[var18[var16]] = field1055[--Statics.field36];
                } else if (var70 == 37) {
                    int var33 = var18[var16];
                    Statics.field36 -= var33;
                    String var34 = class308.method2869(field1055, Statics.field36, var33);
                    field1055[++Statics.field36 - 1] = var34;
                } else if (var70 == 38) {
                    Statics.field1054--;
                } else if (var70 == 39) {
                    Statics.field36--;
                } else if (var70 == 40) {
                    int var35 = var18[var16];
                    class87 var36 = class87.method5123(var35);
                    int[] var37 = new int[var36.field1243];
                    String[] var38 = new String[var36.field1244];
                    for (int var39 = 0; var39 < var36.field1245; var39++) {
                        var37[var39] = field1053[Statics.field1054 - var36.field1245 + var39];
                    }
                    for (int var40 = 0; var40 < var36.field1246; var40++) {
                        var38[var40] = field1055[Statics.field36 - var36.field1246 + var40];
                    }
                    Statics.field1054 -= var36.field1245;
                    Statics.field36 -= var36.field1246;
                    class52 var41 = new class52();
                    var41.field507 = var14;
                    var41.field506 = var16;
                    var41.field510 = Statics.field1056;
                    var41.field508 = Statics.field1050;
                    field1057[++field1058 - 1] = var41;
                    var14 = var36;
                    var17 = var36.field1248;
                    var18 = var36.field1240;
                    var16 = -1;
                    Statics.field1056 = var37;
                    Statics.field1050 = var38;
                } else if (var70 == 42) {
                    field1053[++Statics.field1054 - 1] = Statics.field1928.method1807(var18[var16]);
                } else if (var70 == 43) {
                    Statics.field1928.method1806(var18[var16], field1053[--Statics.field1054]);
                } else if (var70 == 44) {
                    int var42 = var18[var16] >> 16;
                    int var43 = var18[var16] & 0xFFFF;
                    int var44 = field1053[--Statics.field1054];
                    if (var44 < 0 || var44 > 5000) {
                        throw new RuntimeException();
                    }
                    field1047[var42] = var44;
                    byte var45 = -1;
                    if (var43 == 105) {
                        var45 = 0;
                    }
                    for (int var46 = 0; var46 < var44; var46++) {
                        field1052[var42][var46] = var45;
                    }
                } else if (var70 == 45) {
                    int var47 = var18[var16];
                    int var48 = field1053[--Statics.field1054];
                    if (var48 < 0 || var48 >= field1047[var47]) {
                        throw new RuntimeException();
                    }
                    field1053[++Statics.field1054 - 1] = field1052[var47][var48];
                } else if (var70 == 46) {
                    int var49 = var18[var16];
                    Statics.field1054 -= 2;
                    int var50 = field1053[Statics.field1054];
                    if (var50 < 0 || var50 >= field1047[var49]) {
                        throw new RuntimeException();
                    }
                    field1052[var49][var50] = field1053[Statics.field1054 + 1];
                } else if (var70 == 47) {
                    String var51 = Statics.field1928.method1809(var18[var16]);
                    if (var51 == null) {
                        var51 = class240.field2840;
                    }
                    field1055[++Statics.field36 - 1] = var51;
                } else if (var70 == 48) {
                    Statics.field1928.method1808(var18[var16], field1055[--Statics.field36]);
                } else if (var70 == 60) {
                    class200 var52 = var14.field1239[var18[var16]];
                    class214 var53 = (class214) var52.method3667((long) field1053[--Statics.field1054]);
                    if (var53 != null) {
                        var16 += var53.field2487;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var68) {
            StringBuilder var59 = new StringBuilder(30);
            var59.append("").append(var14.field2470).append(" ");
            for (int var60 = field1058 - 1; var60 >= 0; var60--) {
                var59.append("").append(field1057[var60].field507.field2470).append(" ");
            }
            var59.append("").append(var19);
            class155.method917(var59.toString(), var68);
        } finally {
            if (field1048) {
                field1061 = true;
                class175 var64 = class175.method3207(class172.field2205, client.field672.field1273);
                client.field672.method1901(var64);
                for (class57 var65 = (class57) client.field786.method3720(); var65 != null; var65 = (class57) client.field786.method3717()) {
                    if (var65.field545 == 0 || var65.field545 == 3) {
                        client.method4130(var65, true);
                    }
                }
                if (client.field789 != null) {
                    client.method266(client.field789);
                    client.field789 = null;
                }
                field1061 = false;
                field1048 = false;
            }
        }
    }

    @ObfuscatedName("n.n(ILcu;ZB)I")
    public static int method16(int arg0, class87 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method445(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2100(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method438(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method3172(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method2940(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method706(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class233 var6 = arg2 ? Statics.field248 : Statics.field984;
            byte var7;
            if (arg0 == 1500) {
                field1053[++Statics.field1054 - 1] = var6.field2761;
                var7 = 1;
            } else if (arg0 == 1501) {
                field1053[++Statics.field1054 - 1] = var6.field2657;
                var7 = 1;
            } else if (arg0 == 1502) {
                field1053[++Statics.field1054 - 1] = var6.field2654;
                var7 = 1;
            } else if (arg0 == 1503) {
                field1053[++Statics.field1054 - 1] = var6.field2768;
                var7 = 1;
            } else if (arg0 == 1504) {
                field1053[++Statics.field1054 - 1] = var6.field2655 ? 1 : 0;
                var7 = 1;
            } else if (arg0 == 1505) {
                field1053[++Statics.field1054 - 1] = var6.field2662;
                var7 = 1;
            } else {
                var7 = 2;
            }
            return var7;
        } else if (arg0 < 1700) {
            class233 var8 = arg2 ? Statics.field248 : Statics.field984;
            byte var9;
            if (arg0 == 1600) {
                field1053[++Statics.field1054 - 1] = var8.field2664;
                var9 = 1;
            } else if (arg0 == 1601) {
                field1053[++Statics.field1054 - 1] = var8.field2749;
                var9 = 1;
            } else if (arg0 == 1602) {
                field1055[++Statics.field36 - 1] = var8.field2704;
                var9 = 1;
            } else if (arg0 == 1603) {
                field1053[++Statics.field1054 - 1] = var8.field2666;
                var9 = 1;
            } else if (arg0 == 1604) {
                field1053[++Statics.field1054 - 1] = var8.field2667;
                var9 = 1;
            } else if (arg0 == 1605) {
                field1053[++Statics.field1054 - 1] = var8.field2697;
                var9 = 1;
            } else if (arg0 == 1606) {
                field1053[++Statics.field1054 - 1] = var8.field2694;
                var9 = 1;
            } else if (arg0 == 1607) {
                field1053[++Statics.field1054 - 1] = var8.field2696;
                var9 = 1;
            } else if (arg0 == 1608) {
                field1053[++Statics.field1054 - 1] = var8.field2695;
                var9 = 1;
            } else if (arg0 == 1609) {
                field1053[++Statics.field1054 - 1] = var8.field2720;
                var9 = 1;
            } else if (arg0 == 1610) {
                field1053[++Statics.field1054 - 1] = var8.field2675;
                var9 = 1;
            } else if (arg0 == 1611) {
                field1053[++Statics.field1054 - 1] = var8.field2741;
                var9 = 1;
            } else if (arg0 == 1612) {
                field1053[++Statics.field1054 - 1] = var8.field2635;
                var9 = 1;
            } else if (arg0 == 1613) {
                field1053[++Statics.field1054 - 1] = var8.field2760.method144();
                var9 = 1;
            } else if (arg0 == 1614) {
                field1053[++Statics.field1054 - 1] = var8.field2701 ? 1 : 0;
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 1800) {
            return method519(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            class233 var10 = arg2 ? Statics.field248 : Statics.field984;
            byte var11;
            if (arg0 == 1800) {
                field1053[++Statics.field1054 - 1] = class234.method527(client.method50(var10));
                var11 = 1;
            } else if (arg0 == 1801) {
                int var12 = field1053[--Statics.field1054];
                int var435 = var12 - 1;
                if (var10.field2718 == null || var435 >= var10.field2718.length || var10.field2718[var435] == null) {
                    field1055[++Statics.field36 - 1] = "";
                } else {
                    field1055[++Statics.field36 - 1] = var10.field2718[var435];
                }
                var11 = 1;
            } else if (arg0 == 1802) {
                if (var10.field2755 == null) {
                    field1055[++Statics.field36 - 1] = "";
                } else {
                    field1055[++Statics.field36 - 1] = var10.field2755;
                }
                var11 = 1;
            } else {
                var11 = 2;
            }
            return var11;
        } else if (arg0 < 2000) {
            return method3060(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2100(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method438(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method3172(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method2940(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method706(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            class233 var13 = class233.method457(field1053[--Statics.field1054]);
            byte var14;
            if (arg0 == 2500) {
                field1053[++Statics.field1054 - 1] = var13.field2761;
                var14 = 1;
            } else if (arg0 == 2501) {
                field1053[++Statics.field1054 - 1] = var13.field2657;
                var14 = 1;
            } else if (arg0 == 2502) {
                field1053[++Statics.field1054 - 1] = var13.field2654;
                var14 = 1;
            } else if (arg0 == 2503) {
                field1053[++Statics.field1054 - 1] = var13.field2768;
                var14 = 1;
            } else if (arg0 == 2504) {
                field1053[++Statics.field1054 - 1] = var13.field2655 ? 1 : 0;
                var14 = 1;
            } else if (arg0 == 2505) {
                field1053[++Statics.field1054 - 1] = var13.field2662;
                var14 = 1;
            } else {
                var14 = 2;
            }
            return var14;
        } else if (arg0 < 2700) {
            return method112(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            byte var16;
            if (arg0 == 2700) {
                class233 var15 = class233.method457(field1053[--Statics.field1054]);
                field1053[++Statics.field1054 - 1] = var15.field2764;
                var16 = 1;
            } else if (arg0 == 2701) {
                class233 var17 = class233.method457(field1053[--Statics.field1054]);
                if (var17.field2764 == -1) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = var17.field2765;
                }
                var16 = 1;
            } else if (arg0 == 2702) {
                int var18 = field1053[--Statics.field1054];
                class57 var19 = (class57) client.field786.method3734((long) var18);
                if (var19 == null) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = 1;
                }
                var16 = 1;
            } else if (arg0 == 2706) {
                field1053[++Statics.field1054 - 1] = client.field668;
                var16 = 1;
            } else {
                var16 = 2;
            }
            return var16;
        } else if (arg0 < 2900) {
            return method644(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3060(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var21;
            if (arg0 == 3100) {
                String var20 = field1055[--Statics.field36];
                class86.method876(0, "", var20);
                var21 = 1;
            } else if (arg0 == 3101) {
                Statics.field1054 -= 2;
                client.method4221(Statics.field476, field1053[Statics.field1054], field1053[Statics.field1054 + 1]);
                var21 = 1;
            } else if (arg0 == 3103) {
                if (!field1061) {
                    field1048 = true;
                }
                var21 = 1;
            } else if (arg0 == 3104) {
                String var22 = field1055[--Statics.field36];
                int var23 = 0;
                if (class308.method4224(var22)) {
                    var23 = class308.method508(var22);
                }
                class175 var24 = class175.method3207(class172.field2198, client.field672.field1273);
                var24.field2299.method3256(var23);
                client.field672.method1901(var24);
                var21 = 1;
            } else if (arg0 == 3105) {
                String var25 = field1055[--Statics.field36];
                class175 var26 = class175.method3207(class172.field2271, client.field672.field1273);
                var26.field2299.method3253(var25.length() + 1);
                var26.field2299.method3260(var25);
                client.field672.method1901(var26);
                var21 = 1;
            } else if (arg0 == 3106) {
                String var27 = field1055[--Statics.field36];
                class175 var28 = class175.method3207(class172.field2226, client.field672.field1273);
                var28.field2299.method3253(var27.length() + 1);
                var28.field2299.method3260(var27);
                client.field672.method1901(var28);
                var21 = 1;
            } else if (arg0 == 3107) {
                int var29 = field1053[--Statics.field1054];
                String var30 = field1055[--Statics.field36];
                client.method1095(var29, var30);
                var21 = 1;
            } else if (arg0 == 3108) {
                Statics.field1054 -= 3;
                int var31 = field1053[Statics.field1054];
                int var32 = field1053[Statics.field1054 + 1];
                int var33 = field1053[Statics.field1054 + 2];
                class233 var34 = class233.method457(var33);
                client.method1041(var34, var31, var32);
                var21 = 1;
            } else if (arg0 == 3109) {
                Statics.field1054 -= 2;
                int var35 = field1053[Statics.field1054];
                int var36 = field1053[Statics.field1054 + 1];
                class233 var37 = arg2 ? Statics.field248 : Statics.field984;
                client.method1041(var37, var35, var36);
                var21 = 1;
            } else if (arg0 == 3110) {
                Statics.field246 = field1053[--Statics.field1054] == 1;
                var21 = 1;
            } else if (arg0 == 3111) {
                field1053[++Statics.field1054 - 1] = Statics.field257.field1011 ? 1 : 0;
                var21 = 1;
            } else if (arg0 == 3112) {
                Statics.field257.field1011 = field1053[--Statics.field1054] == 1;
                class68.method3057();
                var21 = 1;
            } else if (arg0 == 3113) {
                String var38 = field1055[--Statics.field36];
                boolean var39 = field1053[--Statics.field1054] == 1;
                class46.method4230(var38, var39, false);
                var21 = 1;
            } else if (arg0 == 3115) {
                int var40 = field1053[--Statics.field1054];
                class175 var41 = class175.method3207(class172.field2253, client.field672.field1273);
                var41.field2299.method3254(var40);
                client.field672.method1901(var41);
                var21 = 1;
            } else if (arg0 == 3116) {
                int var42 = field1053[--Statics.field1054];
                Statics.field36 -= 2;
                String var43 = field1055[Statics.field36];
                String var44 = field1055[Statics.field36 + 1];
                if (var43.length() > 500) {
                    var21 = 1;
                } else if (var44.length() > 500) {
                    var21 = 1;
                } else {
                    class175 var45 = class175.method3207(class172.field2242, client.field672.field1273);
                    var45.field2299.method3254(1 + class185.method637(var43) + class185.method637(var44));
                    var45.field2299.method3427(var42);
                    var45.field2299.method3260(var43);
                    var45.field2299.method3260(var44);
                    client.field672.method1901(var45);
                    var21 = 1;
                }
            } else if (arg0 == 3117) {
                client.field771 = field1053[--Statics.field1054] == 1;
                var21 = 1;
            } else if (arg0 == 3118) {
                client.field773 = field1053[--Statics.field1054] == 1;
                var21 = 1;
            } else if (arg0 == 3119) {
                client.field744 = field1053[--Statics.field1054] == 1;
                var21 = 1;
            } else if (arg0 == 3120) {
                if (field1053[--Statics.field1054] == 1) {
                    client.field745 |= 0x1;
                } else {
                    client.field745 &= 0xFFFFFFFE;
                }
                var21 = 1;
            } else if (arg0 == 3121) {
                if (field1053[--Statics.field1054] == 1) {
                    client.field745 |= 0x2;
                } else {
                    client.field745 &= 0xFFFFFFFD;
                }
                var21 = 1;
            } else if (arg0 == 3122) {
                if (field1053[--Statics.field1054] == 1) {
                    client.field745 |= 0x4;
                } else {
                    client.field745 &= 0xFFFFFFFB;
                }
                var21 = 1;
            } else if (arg0 == 3123) {
                if (field1053[--Statics.field1054] == 1) {
                    client.field745 |= 0x8;
                } else {
                    client.field745 &= 0xFFFFFFF7;
                }
                var21 = 1;
            } else if (arg0 == 3124) {
                client.field745 = 0;
                var21 = 1;
            } else if (arg0 == 3125) {
                client.field676 = field1053[--Statics.field1054] == 1;
                var21 = 1;
            } else if (arg0 == 3126) {
                client.field740 = field1053[--Statics.field1054] == 1;
                var21 = 1;
            } else if (arg0 == 3127) {
                client.method3496(field1053[--Statics.field1054] == 1);
                var21 = 1;
            } else if (arg0 == 3128) {
                int[] var46 = field1053;
                int var47 = ++Statics.field1054 - 1;
                boolean var48 = client.field721;
                var46[var47] = var48 ? 1 : 0;
                var21 = 1;
            } else if (arg0 == 3129) {
                Statics.field1054 -= 2;
                client.field705 = field1053[Statics.field1054];
                client.field661 = field1053[Statics.field1054 + 1];
                var21 = 1;
            } else if (arg0 == 3130) {
                Statics.field1054 -= 2;
                var21 = 1;
            } else if (arg0 == 3131) {
                Statics.field1054--;
                var21 = 1;
            } else if (arg0 == 3132) {
                field1053[++Statics.field1054 - 1] = Statics.field226;
                field1053[++Statics.field1054 - 1] = Statics.field387;
                var21 = 1;
            } else if (arg0 == 3133) {
                Statics.field1054--;
                var21 = 1;
            } else if (arg0 == 3134) {
                var21 = 1;
            } else if (arg0 == 3135) {
                Statics.field1054 -= 2;
                var21 = 1;
            } else if (arg0 == 3136) {
                boolean var49 = field1053[--Statics.field1054] == 1;
                Statics.field257.field1012 = var49;
                class68.method3057();
                var21 = 1;
            } else if (arg0 == 3137) {
                field1053[++Statics.field1054 - 1] = Statics.field257.field1012 ? 1 : 0;
                var21 = 1;
            } else if (arg0 == 3138) {
                boolean var50 = field1053[--Statics.field1054] == 1;
                client.field664 = var50;
                if (!var50) {
                    Statics.field257.field1015 = "";
                    class68.method3057();
                }
                var21 = 1;
            } else if (arg0 == 3139) {
                field1053[++Statics.field1054 - 1] = client.field664 ? 1 : 0;
                var21 = 1;
            } else {
                var21 = 2;
            }
            return var21;
        } else if (arg0 < 3300) {
            return method3238(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            byte var51;
            if (arg0 == 3300) {
                field1053[++Statics.field1054 - 1] = client.field637;
                var51 = 1;
            } else if (arg0 == 3301) {
                Statics.field1054 -= 2;
                int var52 = field1053[Statics.field1054];
                int var53 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = class55.method1683(var52, var53);
                var51 = 1;
            } else if (arg0 == 3302) {
                Statics.field1054 -= 2;
                int var54 = field1053[Statics.field1054];
                int var55 = field1053[Statics.field1054 + 1];
                int[] var56 = field1053;
                int var57 = ++Statics.field1054 - 1;
                class55 var58 = (class55) class55.field526.method3734((long) var54);
                int var59;
                if (var58 == null) {
                    var59 = 0;
                } else if (var55 >= 0 && var55 < var58.field525.length) {
                    var59 = var58.field525[var55];
                } else {
                    var59 = 0;
                }
                var56[var57] = var59;
                var51 = 1;
            } else if (arg0 == 3303) {
                Statics.field1054 -= 2;
                int var60 = field1053[Statics.field1054];
                int var61 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = class55.method3532(var60, var61);
                var51 = 1;
            } else if (arg0 == 3304) {
                int var62 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = class256.method662(var62).field3276;
                var51 = 1;
            } else if (arg0 == 3305) {
                int var63 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = client.field757[var63];
                var51 = 1;
            } else if (arg0 == 3306) {
                int var64 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = client.field758[var64];
                var51 = 1;
            } else if (arg0 == 3307) {
                int var65 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = client.field759[var65];
                var51 = 1;
            } else if (arg0 == 3308) {
                int var66 = Statics.field585;
                int var67 = (Statics.field476.field951 >> 7) + Statics.field2788;
                int var68 = (Statics.field476.field956 >> 7) + Statics.field599;
                field1053[++Statics.field1054 - 1] = (var66 << 28) + (var67 << 14) + var68;
                var51 = 1;
            } else if (arg0 == 3309) {
                int var69 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = var69 >> 14 & 0x3FFF;
                var51 = 1;
            } else if (arg0 == 3310) {
                int var70 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = var70 >> 28;
                var51 = 1;
            } else if (arg0 == 3311) {
                int var71 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = var71 & 0x3FFF;
                var51 = 1;
            } else if (arg0 == 3312) {
                field1053[++Statics.field1054 - 1] = client.field871 ? 1 : 0;
                var51 = 1;
            } else if (arg0 == 3313) {
                Statics.field1054 -= 2;
                int var72 = field1053[Statics.field1054] + 32768;
                int var73 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = class55.method1683(var72, var73);
                var51 = 1;
            } else if (arg0 == 3314) {
                Statics.field1054 -= 2;
                int var74 = field1053[Statics.field1054] + 32768;
                int var75 = field1053[Statics.field1054 + 1];
                int[] var76 = field1053;
                int var77 = ++Statics.field1054 - 1;
                class55 var78 = (class55) class55.field526.method3734((long) var74);
                int var79;
                if (var78 == null) {
                    var79 = 0;
                } else if (var75 >= 0 && var75 < var78.field525.length) {
                    var79 = var78.field525[var75];
                } else {
                    var79 = 0;
                }
                var76[var77] = var79;
                var51 = 1;
            } else if (arg0 == 3315) {
                Statics.field1054 -= 2;
                int var80 = field1053[Statics.field1054] + 32768;
                int var81 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = class55.method3532(var80, var81);
                var51 = 1;
            } else if (arg0 == 3316) {
                if (client.field761 >= 2) {
                    field1053[++Statics.field1054 - 1] = client.field761;
                } else {
                    field1053[++Statics.field1054 - 1] = 0;
                }
                var51 = 1;
            } else if (arg0 == 3317) {
                field1053[++Statics.field1054 - 1] = client.field770;
                var51 = 1;
            } else if (arg0 == 3318) {
                field1053[++Statics.field1054 - 1] = client.field627;
                var51 = 1;
            } else if (arg0 == 3321) {
                field1053[++Statics.field1054 - 1] = client.field790;
                var51 = 1;
            } else if (arg0 == 3322) {
                field1053[++Statics.field1054 - 1] = client.field896;
                var51 = 1;
            } else if (arg0 == 3323) {
                if (client.field794) {
                    field1053[++Statics.field1054 - 1] = 1;
                } else {
                    field1053[++Statics.field1054 - 1] = 0;
                }
                var51 = 1;
            } else if (arg0 == 3324) {
                field1053[++Statics.field1054 - 1] = client.field628;
                var51 = 1;
            } else if (arg0 == 3325) {
                Statics.field1054 -= 4;
                int var82 = field1053[Statics.field1054];
                int var83 = field1053[Statics.field1054 + 1];
                int var84 = field1053[Statics.field1054 + 2];
                int var85 = field1053[Statics.field1054 + 3];
                int var86 = (var83 << 14) + var82;
                int var87 = (var84 << 28) + var86;
                int var88 = var85 + var87;
                field1053[++Statics.field1054 - 1] = var88;
                var51 = 1;
            } else {
                var51 = 2;
            }
            return var51;
        } else if (arg0 < 3500) {
            byte var93;
            if (arg0 == 3400) {
                Statics.field1054 -= 2;
                int var89 = field1053[Statics.field1054];
                int var90 = field1053[Statics.field1054 + 1];
                class269 var91 = class269.method1596(var89);
                if (var91.field3389 != 's') {
                }
                for (int var92 = 0; var92 < var91.field3392; var92++) {
                    if (var91.field3393[var92] == var90) {
                        field1055[++Statics.field36 - 1] = var91.field3386[var92];
                        var91 = null;
                        break;
                    }
                }
                if (var91 != null) {
                    field1055[++Statics.field36 - 1] = var91.field3390;
                }
                var93 = 1;
            } else if (arg0 == 3408) {
                Statics.field1054 -= 4;
                int var94 = field1053[Statics.field1054];
                int var95 = field1053[Statics.field1054 + 1];
                int var96 = field1053[Statics.field1054 + 2];
                int var97 = field1053[Statics.field1054 + 3];
                class269 var98 = class269.method1596(var96);
                if (var98.field3388 == var94 && var98.field3389 == var95) {
                    for (int var99 = 0; var99 < var98.field3392; var99++) {
                        if (var98.field3393[var99] == var97) {
                            if (var95 == 115) {
                                field1055[++Statics.field36 - 1] = var98.field3386[var99];
                            } else {
                                field1053[++Statics.field1054 - 1] = var98.field3394[var99];
                            }
                            var98 = null;
                            break;
                        }
                    }
                    if (var98 != null) {
                        if (var95 == 115) {
                            field1055[++Statics.field36 - 1] = var98.field3390;
                        } else {
                            field1053[++Statics.field1054 - 1] = var98.field3395;
                        }
                    }
                    var93 = 1;
                } else {
                    if (var95 == 115) {
                        field1055[++Statics.field36 - 1] = class240.field2840;
                    } else {
                        field1053[++Statics.field1054 - 1] = 0;
                    }
                    var93 = 1;
                }
            } else if (arg0 == 3411) {
                int var100 = field1053[--Statics.field1054];
                class269 var101 = class269.method1596(var100);
                field1053[++Statics.field1054 - 1] = var101.method4631();
                var93 = 1;
            } else {
                var93 = 2;
            }
            return var93;
        } else if (arg0 < 3700) {
            byte var102;
            if (arg0 == 3600) {
                if (Statics.field391.field1023 == 0) {
                    field1053[++Statics.field1054 - 1] = -2;
                } else if (Statics.field391.field1023 == 1) {
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = Statics.field391.field1024.method5002();
                }
                var102 = 1;
            } else if (arg0 == 3601) {
                int var103 = field1053[--Statics.field1054];
                if (Statics.field391.method1582() && var103 >= 0 && var103 < Statics.field391.field1024.method5002()) {
                    class295 var104 = (class295) Statics.field391.field1024.method5047(var103);
                    field1055[++Statics.field36 - 1] = var104.method4960();
                    field1055[++Statics.field36 - 1] = var104.method4961();
                } else {
                    field1055[++Statics.field36 - 1] = "";
                    field1055[++Statics.field36 - 1] = "";
                }
                var102 = 1;
            } else if (arg0 == 3602) {
                int var105 = field1053[--Statics.field1054];
                if (Statics.field391.method1582() && var105 >= 0 && var105 < Statics.field391.field1024.method5002()) {
                    field1053[++Statics.field1054 - 1] = ((class290) Statics.field391.field1024.method5047(var105)).field3686;
                } else {
                    field1053[++Statics.field1054 - 1] = 0;
                }
                var102 = 1;
            } else if (arg0 == 3603) {
                int var106 = field1053[--Statics.field1054];
                if (Statics.field391.method1582() && var106 >= 0 && var106 < Statics.field391.field1024.method5002()) {
                    field1053[++Statics.field1054 - 1] = ((class290) Statics.field391.field1024.method5047(var106)).field3685;
                } else {
                    field1053[++Statics.field1054 - 1] = 0;
                }
                var102 = 1;
            } else if (arg0 == 3604) {
                String var107 = field1055[--Statics.field36];
                int var108 = field1053[--Statics.field1054];
                class69.method430(var107, var108);
                var102 = 1;
            } else if (arg0 == 3605) {
                String var109 = field1055[--Statics.field36];
                Statics.field391.method1530(var109);
                var102 = 1;
            } else if (arg0 == 3606) {
                String var110 = field1055[--Statics.field36];
                Statics.field391.method1534(var110);
                var102 = 1;
            } else if (arg0 == 3607) {
                String var111 = field1055[--Statics.field36];
                Statics.field391.method1529(var111);
                var102 = 1;
            } else if (arg0 == 3608) {
                String var112 = field1055[--Statics.field36];
                Statics.field391.method1535(var112);
                var102 = 1;
            } else if (arg0 == 3609) {
                String var113 = field1055[--Statics.field36];
                String var114 = Statics.method106(var113);
                field1053[++Statics.field1054 - 1] = Statics.field391.method1528(new class294(var114, Statics.field2425), false) ? 1 : 0;
                var102 = 1;
            } else if (arg0 == 3611) {
                if (Statics.field51 == null) {
                    field1055[++Statics.field36 - 1] = "";
                } else {
                    field1055[++Statics.field36 - 1] = Statics.field51.field3700;
                }
                var102 = 1;
            } else if (arg0 == 3612) {
                if (Statics.field51 == null) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = Statics.field51.method5002();
                }
                var102 = 1;
            } else if (arg0 == 3613) {
                int var115 = field1053[--Statics.field1054];
                if (Statics.field51 == null || var115 >= Statics.field51.method5002()) {
                    field1055[++Statics.field36 - 1] = "";
                } else {
                    field1055[++Statics.field36 - 1] = Statics.field51.method5047(var115).method4962().method5079();
                }
                var102 = 1;
            } else if (arg0 == 3614) {
                int var116 = field1053[--Statics.field1054];
                if (Statics.field51 == null || var116 >= Statics.field51.method5002()) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = ((class290) Statics.field51.method5047(var116)).method5062();
                }
                var102 = 1;
            } else if (arg0 == 3615) {
                int var117 = field1053[--Statics.field1054];
                if (Statics.field51 == null || var117 >= Statics.field51.method5002()) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = ((class290) Statics.field51.method5047(var117)).field3685;
                }
                var102 = 1;
            } else if (arg0 == 3616) {
                field1053[++Statics.field1054 - 1] = Statics.field51 == null ? 0 : Statics.field51.field3705;
                var102 = 1;
            } else if (arg0 == 3617) {
                String var118 = field1055[--Statics.field36];
                if (Statics.field51 != null) {
                    class175 var119 = class175.method3207(class172.field2217, client.field672.field1273);
                    var119.field2299.method3253(class185.method637(var118));
                    var119.field2299.method3260(var118);
                    client.field672.method1901(var119);
                }
                var102 = 1;
            } else if (arg0 == 3618) {
                field1053[++Statics.field1054 - 1] = Statics.field51 == null ? 0 : Statics.field51.field3706;
                var102 = 1;
            } else if (arg0 == 3619) {
                String var120 = field1055[--Statics.field36];
                if (!var120.equals("")) {
                    class175 var121 = class175.method3207(class172.field2262, client.field672.field1273);
                    var121.field2299.method3253(class185.method637(var120));
                    var121.field2299.method3260(var120);
                    client.field672.method1901(var121);
                }
                var102 = 1;
            } else if (arg0 == 3620) {
                client.method2308();
                var102 = 1;
            } else if (arg0 == 3621) {
                if (Statics.field391.method1582()) {
                    field1053[++Statics.field1054 - 1] = Statics.field391.field1025.method5002();
                } else {
                    field1053[++Statics.field1054 - 1] = -1;
                }
                var102 = 1;
            } else if (arg0 == 3622) {
                int var122 = field1053[--Statics.field1054];
                if (Statics.field391.method1582() && var122 >= 0 && var122 < Statics.field391.field1025.method5002()) {
                    class289 var123 = (class289) Statics.field391.field1025.method5047(var122);
                    field1055[++Statics.field36 - 1] = var123.method4960();
                    field1055[++Statics.field36 - 1] = var123.method4961();
                } else {
                    field1055[++Statics.field36 - 1] = "";
                    field1055[++Statics.field36 - 1] = "";
                }
                var102 = 1;
            } else if (arg0 == 3623) {
                String var124 = field1055[--Statics.field36];
                String var125 = Statics.method106(var124);
                field1053[++Statics.field1054 - 1] = Statics.field391.method1523(new class294(var125, Statics.field2425)) ? 1 : 0;
                var102 = 1;
            } else if (arg0 == 3624) {
                int var126 = field1053[--Statics.field1054];
                if (Statics.field51 == null || var126 >= Statics.field51.method5002() || !Statics.field51.method5047(var126).method4962().equals(Statics.field476.field593)) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = 1;
                }
                var102 = 1;
            } else if (arg0 == 3625) {
                if (Statics.field51 == null || Statics.field51.field3704 == null) {
                    field1055[++Statics.field36 - 1] = "";
                } else {
                    field1055[++Statics.field36 - 1] = Statics.field51.field3704;
                }
                var102 = 1;
            } else if (arg0 == 3626) {
                int var127 = field1053[--Statics.field1054];
                if (Statics.field51 == null || var127 >= Statics.field51.method5002() || !((class284) Statics.field51.method5047(var127)).method4942()) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = 1;
                }
                var102 = 1;
            } else if (arg0 == 3627) {
                int var128 = field1053[--Statics.field1054];
                if (Statics.field51 == null || var128 >= Statics.field51.method5002() || !((class284) Statics.field51.method5047(var128)).method4945()) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = 1;
                }
                var102 = 1;
            } else if (arg0 == 3628) {
                Statics.field391.field1024.method5019();
                var102 = 1;
            } else if (arg0 == 3629) {
                boolean var129 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class314(var129));
                var102 = 1;
            } else if (arg0 == 3630) {
                boolean var130 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class315(var130));
                var102 = 1;
            } else if (arg0 == 3631) {
                boolean var131 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class146(var131));
                var102 = 1;
            } else if (arg0 == 3632) {
                boolean var132 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class140(var132));
                var102 = 1;
            } else if (arg0 == 3633) {
                boolean var133 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class145(var133));
                var102 = 1;
            } else if (arg0 == 3634) {
                boolean var134 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class148(var134));
                var102 = 1;
            } else if (arg0 == 3635) {
                boolean var135 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class144(var135));
                var102 = 1;
            } else if (arg0 == 3636) {
                boolean var136 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class142(var136));
                var102 = 1;
            } else if (arg0 == 3637) {
                boolean var137 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class141(var137));
                var102 = 1;
            } else if (arg0 == 3638) {
                boolean var138 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class143(var138));
                var102 = 1;
            } else if (arg0 == 3639) {
                Statics.field391.field1024.method5045();
                var102 = 1;
            } else if (arg0 == 3640) {
                Statics.field391.field1025.method5019();
                var102 = 1;
            } else if (arg0 == 3641) {
                boolean var139 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1025.method5020(new class314(var139));
                var102 = 1;
            } else if (arg0 == 3642) {
                boolean var140 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1025.method5020(new class315(var140));
                var102 = 1;
            } else if (arg0 == 3643) {
                Statics.field391.field1025.method5045();
                var102 = 1;
            } else if (arg0 == 3644) {
                if (Statics.field51 != null) {
                    Statics.field51.method5019();
                }
                var102 = 1;
            } else if (arg0 == 3645) {
                boolean var141 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class314(var141));
                }
                var102 = 1;
            } else if (arg0 == 3646) {
                boolean var142 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class315(var142));
                }
                var102 = 1;
            } else if (arg0 == 3647) {
                boolean var143 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class146(var143));
                }
                var102 = 1;
            } else if (arg0 == 3648) {
                boolean var144 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class140(var144));
                }
                var102 = 1;
            } else if (arg0 == 3649) {
                boolean var145 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class145(var145));
                }
                var102 = 1;
            } else if (arg0 == 3650) {
                boolean var146 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class148(var146));
                }
                var102 = 1;
            } else if (arg0 == 3651) {
                boolean var147 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class144(var147));
                }
                var102 = 1;
            } else if (arg0 == 3652) {
                boolean var148 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class142(var148));
                }
                var102 = 1;
            } else if (arg0 == 3653) {
                boolean var149 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class141(var149));
                }
                var102 = 1;
            } else if (arg0 == 3654) {
                boolean var150 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class143(var150));
                }
                var102 = 1;
            } else if (arg0 == 3655) {
                if (Statics.field51 != null) {
                    Statics.field51.method5045();
                }
                var102 = 1;
            } else if (arg0 == 3656) {
                boolean var151 = field1053[--Statics.field1054] == 1;
                Statics.field391.field1024.method5020(new class147(var151));
                var102 = 1;
            } else if (arg0 == 3657) {
                boolean var152 = field1053[--Statics.field1054] == 1;
                if (Statics.field51 != null) {
                    Statics.field51.method5020(new class147(var152));
                }
                var102 = 1;
            } else {
                var102 = 2;
            }
            return var102;
        } else if (arg0 < 4000) {
            return method2850(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            byte var155;
            if (arg0 == 4000) {
                Statics.field1054 -= 2;
                int var153 = field1053[Statics.field1054];
                int var154 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var153 + var154;
                var155 = 1;
            } else if (arg0 == 4001) {
                Statics.field1054 -= 2;
                int var156 = field1053[Statics.field1054];
                int var157 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var156 - var157;
                var155 = 1;
            } else if (arg0 == 4002) {
                Statics.field1054 -= 2;
                int var158 = field1053[Statics.field1054];
                int var159 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var158 * var159;
                var155 = 1;
            } else if (arg0 == 4003) {
                Statics.field1054 -= 2;
                int var160 = field1053[Statics.field1054];
                int var161 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var160 / var161;
                var155 = 1;
            } else if (arg0 == 4004) {
                int var162 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = (int) (Math.random() * (double) var162);
                var155 = 1;
            } else if (arg0 == 4005) {
                int var163 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = (int) (Math.random() * (double) (var163 + 1));
                var155 = 1;
            } else if (arg0 == 4006) {
                Statics.field1054 -= 5;
                int var164 = field1053[Statics.field1054];
                int var165 = field1053[Statics.field1054 + 1];
                int var166 = field1053[Statics.field1054 + 2];
                int var167 = field1053[Statics.field1054 + 3];
                int var168 = field1053[Statics.field1054 + 4];
                field1053[++Statics.field1054 - 1] = (var165 - var164) * (var168 - var166) / (var167 - var166) + var164;
                var155 = 1;
            } else if (arg0 == 4007) {
                Statics.field1054 -= 2;
                int var169 = field1053[Statics.field1054];
                int var170 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var169 * var170 / 100 + var169;
                var155 = 1;
            } else if (arg0 == 4008) {
                Statics.field1054 -= 2;
                int var171 = field1053[Statics.field1054];
                int var172 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var171 | 0x1 << var172;
                var155 = 1;
            } else if (arg0 == 4009) {
                Statics.field1054 -= 2;
                int var173 = field1053[Statics.field1054];
                int var174 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var173 & -1 - (0x1 << var174);
                var155 = 1;
            } else if (arg0 == 4010) {
                Statics.field1054 -= 2;
                int var175 = field1053[Statics.field1054];
                int var176 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = (var175 & 0x1 << var176) == 0 ? 0 : 1;
                var155 = 1;
            } else if (arg0 == 4011) {
                Statics.field1054 -= 2;
                int var177 = field1053[Statics.field1054];
                int var178 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var177 % var178;
                var155 = 1;
            } else if (arg0 == 4012) {
                Statics.field1054 -= 2;
                int var179 = field1053[Statics.field1054];
                int var180 = field1053[Statics.field1054 + 1];
                if (var179 == 0) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = (int) Math.pow((double) var179, (double) var180);
                }
                var155 = 1;
            } else if (arg0 == 4013) {
                Statics.field1054 -= 2;
                int var181 = field1053[Statics.field1054];
                int var182 = field1053[Statics.field1054 + 1];
                if (var181 == 0) {
                    field1053[++Statics.field1054 - 1] = 0;
                    var155 = 1;
                } else {
                    switch(var182) {
                        case 0:
                            field1053[++Statics.field1054 - 1] = Integer.MAX_VALUE;
                            break;
                        case 1:
                            field1053[++Statics.field1054 - 1] = var181;
                            break;
                        case 2:
                            field1053[++Statics.field1054 - 1] = (int) Math.sqrt((double) var181);
                            break;
                        case 3:
                            field1053[++Statics.field1054 - 1] = (int) Math.cbrt((double) var181);
                            break;
                        case 4:
                            field1053[++Statics.field1054 - 1] = (int) Math.sqrt(Math.sqrt((double) var181));
                            break;
                        default:
                            field1053[++Statics.field1054 - 1] = (int) Math.pow((double) var181, 1.0D / (double) var182);
                    }
                    var155 = 1;
                }
            } else if (arg0 == 4014) {
                Statics.field1054 -= 2;
                int var183 = field1053[Statics.field1054];
                int var184 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var183 & var184;
                var155 = 1;
            } else if (arg0 == 4015) {
                Statics.field1054 -= 2;
                int var185 = field1053[Statics.field1054];
                int var186 = field1053[Statics.field1054 + 1];
                field1053[++Statics.field1054 - 1] = var185 | var186;
                var155 = 1;
            } else if (arg0 == 4018) {
                Statics.field1054 -= 3;
                long var187 = (long) field1053[Statics.field1054];
                long var189 = (long) field1053[Statics.field1054 + 1];
                long var191 = (long) field1053[Statics.field1054 + 2];
                field1053[++Statics.field1054 - 1] = (int) (var187 * var191 / var189);
                var155 = 1;
            } else {
                var155 = 2;
            }
            return var155;
        } else if (arg0 < 4200) {
            byte var195;
            if (arg0 == 4100) {
                String var193 = field1055[--Statics.field36];
                int var194 = field1053[--Statics.field1054];
                field1055[++Statics.field36 - 1] = var193 + var194;
                var195 = 1;
            } else if (arg0 == 4101) {
                Statics.field36 -= 2;
                String var196 = field1055[Statics.field36];
                String var197 = field1055[Statics.field36 + 1];
                field1055[++Statics.field36 - 1] = var196 + var197;
                var195 = 1;
            } else if (arg0 == 4102) {
                String var198 = field1055[--Statics.field36];
                int var199 = field1053[--Statics.field1054];
                String[] var200 = field1055;
                int var201 = ++Statics.field36 - 1;
                String var203;
                if (var199 < 0) {
                    var203 = Integer.toString(var199);
                } else {
                    int var204 = var199;
                    String var205;
                    if (var199 < 0) {
                        var205 = Integer.toString(var199, 10);
                    } else {
                        int var206 = 2;
                        int var207 = var199 / 10;
                        while (var207 != 0) {
                            var207 /= 10;
                            var206++;
                        }
                        char[] var208 = new char[var206];
                        var208[0] = '+';
                        for (int var209 = var206 - 1; var209 > 0; var209--) {
                            int var210 = var204;
                            var204 /= 10;
                            int var211 = var210 - var204 * 10;
                            if (var211 >= 10) {
                                var208[var209] = (char) (var211 + 87);
                            } else {
                                var208[var209] = (char) (var211 + 48);
                            }
                        }
                        var205 = new String(var208);
                    }
                    var203 = var205;
                }
                var200[var201] = var198 + var203;
                var195 = 1;
            } else if (arg0 == 4103) {
                String var212 = field1055[--Statics.field36];
                field1055[++Statics.field36 - 1] = var212.toLowerCase();
                var195 = 1;
            } else if (arg0 == 4104) {
                int var213 = field1053[--Statics.field1054];
                long var214 = ((long) var213 + 11745L) * 86400000L;
                field1060.setTime(new Date(var214));
                int var216 = field1060.get(5);
                int var217 = field1060.get(2);
                int var218 = field1060.get(1);
                field1055[++Statics.field36 - 1] = var216 + "-" + field1059[var217] + "-" + var218;
                var195 = 1;
            } else if (arg0 == 4105) {
                Statics.field36 -= 2;
                String var219 = field1055[Statics.field36];
                String var220 = field1055[Statics.field36 + 1];
                if (Statics.field476.field591 != null && Statics.field476.field591.field2613) {
                    field1055[++Statics.field36 - 1] = var220;
                } else {
                    field1055[++Statics.field36 - 1] = var219;
                }
                var195 = 1;
            } else if (arg0 == 4106) {
                int var221 = field1053[--Statics.field1054];
                field1055[++Statics.field36 - 1] = Integer.toString(var221);
                var195 = 1;
            } else if (arg0 == 4107) {
                Statics.field36 -= 2;
                int[] var222 = field1053;
                int var223 = ++Statics.field1054 - 1;
                String var224 = field1055[Statics.field36];
                String var225 = field1055[Statics.field36 + 1];
                int var226 = client.field856;
                int var227 = var224.length();
                int var228 = var225.length();
                int var229 = 0;
                int var230 = 0;
                byte var231 = 0;
                byte var232 = 0;
                int var241;
                label2268: while (true) {
                    if (var229 - var231 >= var227 && var230 - var232 >= var228) {
                        int var233 = Math.min(var227, var228);
                        for (int var234 = 0; var234 < var233; var234++) {
                            char var237 = var224.charAt(var234);
                            char var238 = var225.charAt(var234);
                            if (var237 != var238 && Character.toUpperCase(var237) != Character.toUpperCase(var238)) {
                                char var239 = Character.toLowerCase(var237);
                                char var240 = Character.toLowerCase(var238);
                                if (var239 != var240) {
                                    var241 = class176.method3987(var239, var226) - class176.method3987(var240, var226);
                                    break label2268;
                                }
                            }
                        }
                        int var242 = var227 - var228;
                        if (var242 != 0) {
                            var241 = var242;
                            break;
                        }
                        for (int var243 = 0; var243 < var233; var243++) {
                            char var244 = var224.charAt(var243);
                            char var245 = var225.charAt(var243);
                            if (var244 != var245) {
                                var241 = class176.method3987(var244, var226) - class176.method3987(var245, var226);
                                break label2268;
                            }
                        }
                        var241 = 0;
                        break;
                    }
                    if (var229 - var231 >= var227) {
                        var241 = -1;
                        break;
                    }
                    if (var230 - var232 >= var228) {
                        var241 = 1;
                        break;
                    }
                    char var246;
                    if (var231 == 0) {
                        var246 = var224.charAt(var229++);
                    } else {
                        var246 = (char) var231;
                        boolean var247 = false;
                    }
                    char var248;
                    if (var232 == 0) {
                        var248 = var225.charAt(var230++);
                    } else {
                        var248 = (char) var232;
                        boolean var249 = false;
                    }
                    byte var250;
                    if (var246 == 198) {
                        var250 = 69;
                    } else if (var246 == 230) {
                        var250 = 101;
                    } else if (var246 == 223) {
                        var250 = 115;
                    } else if (var246 == 338) {
                        var250 = 69;
                    } else if (var246 == 339) {
                        var250 = 101;
                    } else {
                        var250 = 0;
                    }
                    var231 = var250;
                    byte var251;
                    if (var248 == 198) {
                        var251 = 69;
                    } else if (var248 == 230) {
                        var251 = 101;
                    } else if (var248 == 223) {
                        var251 = 115;
                    } else if (var248 == 338) {
                        var251 = 69;
                    } else if (var248 == 339) {
                        var251 = 101;
                    } else {
                        var251 = 0;
                    }
                    var232 = var251;
                    char var252 = class176.method1704(var246, var226);
                    char var253 = class176.method1704(var248, var226);
                    if (var252 != var253 && Character.toUpperCase(var252) != Character.toUpperCase(var253)) {
                        char var254 = Character.toLowerCase(var252);
                        char var255 = Character.toLowerCase(var253);
                        if (var254 != var255) {
                            var241 = class176.method3987(var254, var226) - class176.method3987(var255, var226);
                            break;
                        }
                    }
                }
                byte var257;
                if (var241 > 0) {
                    var257 = 1;
                } else if (var241 < 0) {
                    var257 = -1;
                } else {
                    var257 = 0;
                }
                var222[var223] = var257;
                var195 = 1;
            } else if (arg0 == 4108) {
                String var258 = field1055[--Statics.field36];
                Statics.field1054 -= 2;
                int var259 = field1053[Statics.field1054];
                int var260 = field1053[Statics.field1054 + 1];
                byte[] var261 = Statics.field582.method4263(var260, 0);
                class301 var262 = new class301(var261);
                field1053[++Statics.field1054 - 1] = var262.method5207(var258, var259);
                var195 = 1;
            } else if (arg0 == 4109) {
                String var263 = field1055[--Statics.field36];
                Statics.field1054 -= 2;
                int var264 = field1053[Statics.field1054];
                int var265 = field1053[Statics.field1054 + 1];
                byte[] var266 = Statics.field582.method4263(var265, 0);
                class301 var267 = new class301(var266);
                field1053[++Statics.field1054 - 1] = var267.method5162(var263, var264);
                var195 = 1;
            } else if (arg0 == 4110) {
                Statics.field36 -= 2;
                String var268 = field1055[Statics.field36];
                String var269 = field1055[Statics.field36 + 1];
                if (field1053[--Statics.field1054] == 1) {
                    field1055[++Statics.field36 - 1] = var268;
                } else {
                    field1055[++Statics.field36 - 1] = var269;
                }
                var195 = 1;
            } else if (arg0 == 4111) {
                String var270 = field1055[--Statics.field36];
                field1055[++Statics.field36 - 1] = class302.method5143(var270);
                var195 = 1;
            } else if (arg0 == 4112) {
                String var271 = field1055[--Statics.field36];
                int var272 = field1053[--Statics.field1054];
                field1055[++Statics.field36 - 1] = var271 + (char) var272;
                var195 = 1;
            } else if (arg0 == 4113) {
                int var273 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = class308.method424((char) var273) ? 1 : 0;
                var195 = 1;
            } else if (arg0 == 4114) {
                int var274 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = class308.method5244((char) var274) ? 1 : 0;
                var195 = 1;
            } else if (arg0 == 4115) {
                int var275 = field1053[--Statics.field1054];
                int[] var276 = field1053;
                int var277 = ++Statics.field1054 - 1;
                char var278 = (char) var275;
                boolean var279 = var278 >= 'A' && var278 <= 'Z' || var278 >= 'a' && var278 <= 'z';
                var276[var277] = var279 ? 1 : 0;
                var195 = 1;
            } else if (arg0 == 4116) {
                int var280 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = class308.method3240((char) var280) ? 1 : 0;
                var195 = 1;
            } else if (arg0 == 4117) {
                String var281 = field1055[--Statics.field36];
                if (var281 == null) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = var281.length();
                }
                var195 = 1;
            } else if (arg0 == 4118) {
                String var282 = field1055[--Statics.field36];
                Statics.field1054 -= 2;
                int var283 = field1053[Statics.field1054];
                int var284 = field1053[Statics.field1054 + 1];
                field1055[++Statics.field36 - 1] = var282.substring(var283, var284);
                var195 = 1;
            } else if (arg0 == 4119) {
                String var285 = field1055[--Statics.field36];
                StringBuilder var286 = new StringBuilder(var285.length());
                boolean var287 = false;
                for (int var288 = 0; var288 < var285.length(); var288++) {
                    char var289 = var285.charAt(var288);
                    if (var289 == '<') {
                        var287 = true;
                    } else if (var289 == '>') {
                        var287 = false;
                    } else if (!var287) {
                        var286.append(var289);
                    }
                }
                field1055[++Statics.field36 - 1] = var286.toString();
                var195 = 1;
            } else if (arg0 == 4120) {
                String var290 = field1055[--Statics.field36];
                int var291 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = var290.indexOf(var291);
                var195 = 1;
            } else if (arg0 == 4121) {
                Statics.field36 -= 2;
                String var292 = field1055[Statics.field36];
                String var293 = field1055[Statics.field36 + 1];
                int var294 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = var292.indexOf(var293, var294);
                var195 = 1;
            } else {
                var195 = 2;
            }
            return var195;
        } else if (arg0 < 4300) {
            byte var296;
            if (arg0 == 4200) {
                int var295 = field1053[--Statics.field1054];
                field1055[++Statics.field36 - 1] = class272.method4572(var295).field3473;
                var296 = 1;
            } else if (arg0 == 4201) {
                Statics.field1054 -= 2;
                int var297 = field1053[Statics.field1054];
                int var298 = field1053[Statics.field1054 + 1];
                class272 var299 = class272.method4572(var297);
                if (var298 < 1 || var298 > 5 || var299.field3497[var298 - 1] == null) {
                    field1055[++Statics.field36 - 1] = "";
                } else {
                    field1055[++Statics.field36 - 1] = var299.field3497[var298 - 1];
                }
                var296 = 1;
            } else if (arg0 == 4202) {
                Statics.field1054 -= 2;
                int var300 = field1053[Statics.field1054];
                int var301 = field1053[Statics.field1054 + 1];
                class272 var302 = class272.method4572(var300);
                if (var301 < 1 || var301 > 5 || var302.field3509[var301 - 1] == null) {
                    field1055[++Statics.field36 - 1] = "";
                } else {
                    field1055[++Statics.field36 - 1] = var302.field3509[var301 - 1];
                }
                var296 = 1;
            } else if (arg0 == 4203) {
                int var303 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = class272.method4572(var303).field3488;
                var296 = 1;
            } else if (arg0 == 4204) {
                int var304 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = class272.method4572(var304).field3494 == 1 ? 1 : 0;
                var296 = 1;
            } else if (arg0 == 4205) {
                int var305 = field1053[--Statics.field1054];
                class272 var306 = class272.method4572(var305);
                if (var306.field3515 == -1 && var306.field3514 >= 0) {
                    field1053[++Statics.field1054 - 1] = var306.field3514;
                } else {
                    field1053[++Statics.field1054 - 1] = var305;
                }
                var296 = 1;
            } else if (arg0 == 4206) {
                int var307 = field1053[--Statics.field1054];
                class272 var308 = class272.method4572(var307);
                if (var308.field3515 >= 0 && var308.field3514 >= 0) {
                    field1053[++Statics.field1054 - 1] = var308.field3514;
                } else {
                    field1053[++Statics.field1054 - 1] = var307;
                }
                var296 = 1;
            } else if (arg0 == 4207) {
                int var309 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = class272.method4572(var309).field3484 ? 1 : 0;
                var296 = 1;
            } else if (arg0 == 4208) {
                int var310 = field1053[--Statics.field1054];
                class272 var311 = class272.method4572(var310);
                if (var311.field3527 == -1 && var311.field3526 >= 0) {
                    field1053[++Statics.field1054 - 1] = var311.field3526;
                } else {
                    field1053[++Statics.field1054 - 1] = var310;
                }
                var296 = 1;
            } else if (arg0 == 4209) {
                int var312 = field1053[--Statics.field1054];
                class272 var313 = class272.method4572(var312);
                if (var313.field3527 >= 0 && var313.field3526 >= 0) {
                    field1053[++Statics.field1054 - 1] = var313.field3526;
                } else {
                    field1053[++Statics.field1054 - 1] = var312;
                }
                var296 = 1;
            } else if (arg0 == 4210) {
                String var314 = field1055[--Statics.field36];
                int var315 = field1053[--Statics.field1054];
                boolean var317 = var315 == 1;
                String var318 = var314.toLowerCase();
                short[] var319 = new short[16];
                int var320 = 0;
                int var321 = 0;
                while (true) {
                    if (var321 >= Statics.field1085) {
                        Statics.field2400 = var319;
                        Statics.field155 = 0;
                        Statics.field283 = var320;
                        String[] var325 = new String[Statics.field283];
                        for (int var326 = 0; var326 < Statics.field283; var326++) {
                            var325[var326] = class272.method4572(var319[var326]).field3473;
                        }
                        short[] var327 = Statics.field2400;
                        class182.method107(var325, var327, 0, var325.length - 1);
                        break;
                    }
                    class272 var322 = class272.method4572(var321);
                    if ((!var317 || var322.field3492) && var322.field3515 == -1 && var322.field3473.toLowerCase().indexOf(var318) != -1) {
                        if (var320 >= 250) {
                            Statics.field283 = -1;
                            Statics.field2400 = null;
                            break;
                        }
                        if (var320 >= var319.length) {
                            short[] var323 = new short[var319.length * 2];
                            for (int var324 = 0; var324 < var320; var324++) {
                                var323[var324] = var319[var324];
                            }
                            var319 = var323;
                        }
                        var319[var320++] = (short) var321;
                    }
                    var321++;
                }
                field1053[++Statics.field1054 - 1] = Statics.field283;
                var296 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field2400 == null || Statics.field155 >= Statics.field283) {
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = Statics.field2400[++Statics.field155 - 1] & 0xFFFF;
                }
                var296 = 1;
            } else if (arg0 == 4212) {
                Statics.field155 = 0;
                var296 = 1;
            } else {
                var296 = 2;
            }
            return var296;
        } else if (arg0 < 5100) {
            byte var328;
            if (arg0 == 5000) {
                field1053[++Statics.field1054 - 1] = client.field839;
                var328 = 1;
            } else if (arg0 == 5001) {
                Statics.field1054 -= 3;
                client.field839 = field1053[Statics.field1054];
                int var329 = field1053[Statics.field1054 + 1];
                class310[] var330 = class310.method1674();
                int var331 = 0;
                class310 var333;
                while (true) {
                    if (var331 >= var330.length) {
                        var333 = null;
                        break;
                    }
                    class310 var332 = var330[var331];
                    if (var332.field3778 == var329) {
                        var333 = var332;
                        break;
                    }
                    var331++;
                }
                Statics.field3311 = var333;
                if (Statics.field3311 == null) {
                    Statics.field3311 = class310.field3775;
                }
                client.field840 = field1053[Statics.field1054 + 2];
                class175 var334 = class175.method3207(class172.field2230, client.field672.field1273);
                var334.field2299.method3253(client.field839);
                var334.field2299.method3253(Statics.field3311.field3778);
                var334.field2299.method3253(client.field840);
                client.field672.method1901(var334);
                var328 = 1;
            } else if (arg0 == 5002) {
                String var335 = field1055[--Statics.field36];
                Statics.field1054 -= 2;
                int var336 = field1053[Statics.field1054];
                int var337 = field1053[Statics.field1054 + 1];
                class175 var338 = class175.method3207(class172.field2269, client.field672.field1273);
                var338.field2299.method3253(class185.method637(var335) + 2);
                var338.field2299.method3260(var335);
                var338.field2299.method3253(var336 - 1);
                var338.field2299.method3253(var337);
                client.field672.method1901(var338);
                var328 = 1;
            } else if (arg0 == 5003) {
                Statics.field1054 -= 2;
                int var339 = field1053[Statics.field1054];
                int var340 = field1053[Statics.field1054 + 1];
                class60 var341 = class86.method1697(var339, var340);
                if (var341 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                    field1053[++Statics.field1054 - 1] = 0;
                    field1055[++Statics.field36 - 1] = "";
                    field1055[++Statics.field36 - 1] = "";
                    field1055[++Statics.field36 - 1] = "";
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = var341.field576;
                    field1053[++Statics.field1054 - 1] = var341.field573;
                    field1055[++Statics.field36 - 1] = var341.field577 == null ? "" : var341.field577;
                    field1055[++Statics.field36 - 1] = var341.field575 == null ? "" : var341.field575;
                    field1055[++Statics.field36 - 1] = var341.field580 == null ? "" : var341.field580;
                    field1053[++Statics.field1054 - 1] = var341.method1020() ? 1 : (var341.method1024() ? 2 : 0);
                }
                var328 = 1;
            } else if (arg0 == 5004) {
                int var342 = field1053[--Statics.field1054];
                class60 var343 = class86.method5121(var342);
                if (var343 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                    field1053[++Statics.field1054 - 1] = 0;
                    field1055[++Statics.field36 - 1] = "";
                    field1055[++Statics.field36 - 1] = "";
                    field1055[++Statics.field36 - 1] = "";
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = var343.field574;
                    field1053[++Statics.field1054 - 1] = var343.field573;
                    field1055[++Statics.field36 - 1] = var343.field577 == null ? "" : var343.field577;
                    field1055[++Statics.field36 - 1] = var343.field575 == null ? "" : var343.field575;
                    field1055[++Statics.field36 - 1] = var343.field580 == null ? "" : var343.field580;
                    field1053[++Statics.field1054 - 1] = var343.method1020() ? 1 : (var343.method1024() ? 2 : 0);
                }
                var328 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field3311 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = Statics.field3311.field3778;
                }
                var328 = 1;
            } else if (arg0 == 5008) {
                String var344 = field1055[--Statics.field36];
                int var345 = field1053[--Statics.field1054];
                String var346 = var344.toLowerCase();
                byte var347 = 0;
                if (var346.startsWith(class240.field3015)) {
                    var347 = 0;
                    var344 = var344.substring(class240.field3015.length());
                } else if (var346.startsWith(class240.field3041)) {
                    var347 = 1;
                    var344 = var344.substring(class240.field3041.length());
                } else if (var346.startsWith(class240.field3051)) {
                    var347 = 2;
                    var344 = var344.substring(class240.field3051.length());
                } else if (var346.startsWith(class240.field3018)) {
                    var347 = 3;
                    var344 = var344.substring(class240.field3018.length());
                } else if (var346.startsWith(class240.field3020)) {
                    var347 = 4;
                    var344 = var344.substring(class240.field3020.length());
                } else if (var346.startsWith(class240.field3021)) {
                    var347 = 5;
                    var344 = var344.substring(class240.field3021.length());
                } else if (var346.startsWith(class240.field3024)) {
                    var347 = 6;
                    var344 = var344.substring(class240.field3024.length());
                } else if (var346.startsWith(class240.field3026)) {
                    var347 = 7;
                    var344 = var344.substring(class240.field3026.length());
                } else if (var346.startsWith(class240.field2885)) {
                    var347 = 8;
                    var344 = var344.substring(class240.field2885.length());
                } else if (var346.startsWith(class240.field3030)) {
                    var347 = 9;
                    var344 = var344.substring(class240.field3030.length());
                } else if (var346.startsWith(class240.field3032)) {
                    var347 = 10;
                    var344 = var344.substring(class240.field3032.length());
                } else if (var346.startsWith(class240.field3034)) {
                    var347 = 11;
                    var344 = var344.substring(class240.field3034.length());
                } else if (client.field856 != 0) {
                    if (var346.startsWith(class240.field3013)) {
                        var347 = 0;
                        var344 = var344.substring(class240.field3013.length());
                    } else if (var346.startsWith(class240.field2894)) {
                        var347 = 1;
                        var344 = var344.substring(class240.field2894.length());
                    } else if (var346.startsWith(class240.field2908)) {
                        var347 = 2;
                        var344 = var344.substring(class240.field2908.length());
                    } else if (var346.startsWith(class240.field3019)) {
                        var347 = 3;
                        var344 = var344.substring(class240.field3019.length());
                    } else if (var346.startsWith(class240.field3126)) {
                        var347 = 4;
                        var344 = var344.substring(class240.field3126.length());
                    } else if (var346.startsWith(class240.field3023)) {
                        var347 = 5;
                        var344 = var344.substring(class240.field3023.length());
                    } else if (var346.startsWith(class240.field3025)) {
                        var347 = 6;
                        var344 = var344.substring(class240.field3025.length());
                    } else if (var346.startsWith(class240.field3027)) {
                        var347 = 7;
                        var344 = var344.substring(class240.field3027.length());
                    } else if (var346.startsWith(class240.field3029)) {
                        var347 = 8;
                        var344 = var344.substring(class240.field3029.length());
                    } else if (var346.startsWith(class240.field3122)) {
                        var347 = 9;
                        var344 = var344.substring(class240.field3122.length());
                    } else if (var346.startsWith(class240.field3033)) {
                        var347 = 10;
                        var344 = var344.substring(class240.field3033.length());
                    } else if (var346.startsWith(class240.field3035)) {
                        var347 = 11;
                        var344 = var344.substring(class240.field3035.length());
                    }
                }
                String var348 = var344.toLowerCase();
                byte var349 = 0;
                if (var348.startsWith(class240.field3090)) {
                    var349 = 1;
                    var344 = var344.substring(class240.field3090.length());
                } else if (var348.startsWith(class240.field3038)) {
                    var349 = 2;
                    var344 = var344.substring(class240.field3038.length());
                } else if (var348.startsWith(class240.field2857)) {
                    var349 = 3;
                    var344 = var344.substring(class240.field2857.length());
                } else if (var348.startsWith(class240.field3042)) {
                    var349 = 4;
                    var344 = var344.substring(class240.field3042.length());
                } else if (var348.startsWith(class240.field3044)) {
                    var349 = 5;
                    var344 = var344.substring(class240.field3044.length());
                } else if (client.field856 != 0) {
                    if (var348.startsWith(class240.field3037)) {
                        var349 = 1;
                        var344 = var344.substring(class240.field3037.length());
                    } else if (var348.startsWith(class240.field3039)) {
                        var349 = 2;
                        var344 = var344.substring(class240.field3039.length());
                    } else if (var348.startsWith(class240.field2891)) {
                        var349 = 3;
                        var344 = var344.substring(class240.field2891.length());
                    } else if (var348.startsWith(class240.field2907)) {
                        var349 = 4;
                        var344 = var344.substring(class240.field2907.length());
                    } else if (var348.startsWith(class240.field3045)) {
                        var349 = 5;
                        var344 = var344.substring(class240.field3045.length());
                    }
                }
                class175 var350 = class175.method3207(class172.field2218, client.field672.field1273);
                var350.field2299.method3253(0);
                int var351 = var350.field2299.field2374;
                var350.field2299.method3253(var345);
                var350.field2299.method3253(var347);
                var350.field2299.method3253(var349);
                class303.method186(var350.field2299, var344);
                var350.field2299.method3266(var350.field2299.field2374 - var351);
                client.field672.method1901(var350);
                var328 = 1;
            } else if (arg0 == 5009) {
                Statics.field36 -= 2;
                String var352 = field1055[Statics.field36];
                String var353 = field1055[Statics.field36 + 1];
                class175 var354 = class175.method3207(class172.field2264, client.field672.field1273);
                var354.field2299.method3254(0);
                int var355 = var354.field2299.field2374;
                var354.field2299.method3260(var352);
                class303.method186(var354.field2299, var353);
                var354.field2299.method3265(var354.field2299.field2374 - var355);
                client.field672.method1901(var354);
                var328 = 1;
            } else if (arg0 == 5015) {
                String var356;
                if (Statics.field476 == null || Statics.field476.field593 == null) {
                    var356 = "";
                } else {
                    var356 = Statics.field476.field593.method5079();
                }
                field1055[++Statics.field36 - 1] = var356;
                var328 = 1;
            } else if (arg0 == 5016) {
                field1053[++Statics.field1054 - 1] = client.field840;
                var328 = 1;
            } else if (arg0 == 5017) {
                int var357 = field1053[--Statics.field1054];
                int[] var358 = field1053;
                int var359 = ++Statics.field1054 - 1;
                class89 var360 = (class89) class86.field1235.get(var357);
                int var361;
                if (var360 == null) {
                    var361 = 0;
                } else {
                    var361 = var360.method1890();
                }
                var358[var359] = var361;
                var328 = 1;
            } else if (arg0 == 5018) {
                int var362 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = class86.method1753(var362);
                var328 = 1;
            } else if (arg0 == 5019) {
                int var363 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = class86.method497(var363);
                var328 = 1;
            } else if (arg0 == 5020) {
                String var364 = field1055[--Statics.field36];
                if (var364.equalsIgnoreCase("toggleroof")) {
                    Statics.field257.field1011 = !Statics.field257.field1011;
                    class68.method3057();
                    if (Statics.field257.field1011) {
                        class86.method876(99, "", "Roofs are now all hidden");
                    } else {
                        class86.method876(99, "", "Roofs will only be removed selectively");
                    }
                }
                if (var364.equalsIgnoreCase("displayfps")) {
                    client.field643 = !client.field643;
                }
                if (var364.equalsIgnoreCase("renderself")) {
                    client.field744 = !client.field744;
                }
                if (var364.equalsIgnoreCase("mouseovertext")) {
                    client.field773 = !client.field773;
                }
                if (client.field761 >= 2) {
                    if (var364.equalsIgnoreCase("showcoord")) {
                        Statics.field1979.field3967 = !Statics.field1979.field3967;
                    }
                    if (var364.equalsIgnoreCase("fpson")) {
                        client.field643 = true;
                    }
                    if (var364.equalsIgnoreCase("fpsoff")) {
                        client.field643 = false;
                    }
                    if (var364.equalsIgnoreCase("gc")) {
                        System.gc();
                    }
                    if (var364.equalsIgnoreCase("clientdrop")) {
                        client.method1009();
                    }
                }
                class175 var365 = class175.method3207(class172.field2268, client.field672.field1273);
                var365.field2299.method3253(var364.length() + 1);
                var365.field2299.method3260(var364);
                client.field672.method1901(var365);
                var328 = 1;
            } else if (arg0 == 5021) {
                client.field820 = field1055[--Statics.field36].toLowerCase().trim();
                var328 = 1;
            } else if (arg0 == 5022) {
                field1055[++Statics.field36 - 1] = client.field820;
                var328 = 1;
            } else {
                var328 = 2;
            }
            return var328;
        } else if (arg0 < 5400) {
            return method3094(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            byte var371;
            if (arg0 == 5504) {
                Statics.field1054 -= 2;
                int var369 = field1053[Statics.field1054];
                int var370 = field1053[Statics.field1054 + 1];
                if (!client.field867) {
                    client.field694 = var369;
                    client.field695 = var370;
                }
                var371 = 1;
            } else if (arg0 == 5505) {
                field1053[++Statics.field1054 - 1] = client.field694;
                var371 = 1;
            } else if (arg0 == 5506) {
                field1053[++Statics.field1054 - 1] = client.field695;
                var371 = 1;
            } else if (arg0 == 5530) {
                int var372 = field1053[--Statics.field1054];
                if (var372 < 0) {
                    var372 = 0;
                }
                client.field875 = var372;
                var371 = 1;
            } else if (arg0 == 5531) {
                field1053[++Statics.field1054 - 1] = client.field875;
                var371 = 1;
            } else {
                var371 = 2;
            }
            return var371;
        } else if (arg0 < 5700) {
            byte var373;
            if (arg0 == 5630) {
                client.field724 = 250;
                var373 = 1;
            } else {
                var373 = 2;
            }
            return var373;
        } else if (arg0 < 6300) {
            byte var374;
            if (arg0 == 6200) {
                Statics.field1054 -= 2;
                client.field716 = (short) field1053[Statics.field1054];
                if (client.field716 <= 0) {
                    client.field716 = 256;
                }
                client.field690 = (short) field1053[Statics.field1054 + 1];
                if (client.field690 <= 0) {
                    client.field690 = 205;
                }
                var374 = 1;
            } else if (arg0 == 6201) {
                Statics.field1054 -= 2;
                client.field673 = (short) field1053[Statics.field1054];
                if (client.field673 <= 0) {
                    client.field673 = 256;
                }
                client.field626 = (short) field1053[Statics.field1054 + 1];
                if (client.field626 <= 0) {
                    client.field626 = 320;
                }
                var374 = 1;
            } else if (arg0 == 6202) {
                Statics.field1054 -= 4;
                client.field877 = (short) field1053[Statics.field1054];
                if (client.field877 <= 0) {
                    client.field877 = 1;
                }
                client.field868 = (short) field1053[Statics.field1054 + 1];
                if (client.field868 <= 0) {
                    client.field868 = 32767;
                } else if (client.field868 < client.field877) {
                    client.field868 = client.field877;
                }
                client.field879 = (short) field1053[Statics.field1054 + 2];
                if (client.field879 <= 0) {
                    client.field879 = 1;
                }
                client.field880 = (short) field1053[Statics.field1054 + 3];
                if (client.field880 <= 0) {
                    client.field880 = 32767;
                } else if (client.field880 < client.field879) {
                    client.field880 = client.field879;
                }
                var374 = 1;
            } else if (arg0 == 6203) {
                if (client.field795 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    client.method2847(0, 0, client.field795.field2654, client.field795.field2768, false);
                    field1053[++Statics.field1054 - 1] = client.field883;
                    field1053[++Statics.field1054 - 1] = client.field814;
                }
                var374 = 1;
            } else if (arg0 == 6204) {
                field1053[++Statics.field1054 - 1] = client.field673;
                field1053[++Statics.field1054 - 1] = client.field626;
                var374 = 1;
            } else if (arg0 == 6205) {
                field1053[++Statics.field1054 - 1] = client.field716;
                field1053[++Statics.field1054 - 1] = client.field690;
                var374 = 1;
            } else {
                var374 = 2;
            }
            return var374;
        } else if (arg0 < 6600) {
            return method5125(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            byte var378;
            if (arg0 == 6600) {
                int var375 = Statics.field585;
                int var376 = (Statics.field476.field951 >> 7) + Statics.field2788;
                int var377 = (Statics.field476.field956 >> 7) + Statics.field599;
                Statics.method2082().method5648(var375, var376, var377, true);
                var378 = 1;
            } else if (arg0 == 6601) {
                int var379 = field1053[--Statics.field1054];
                String var380 = "";
                class21 var381 = Statics.method2082().method5778(var379);
                if (var381 != null) {
                    var380 = var381.method264();
                }
                field1055[++Statics.field36 - 1] = var380;
                var378 = 1;
            } else if (arg0 == 6602) {
                int var382 = field1053[--Statics.field1054];
                Statics.method2082().method5649(var382);
                var378 = 1;
            } else if (arg0 == 6603) {
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5637();
                var378 = 1;
            } else if (arg0 == 6604) {
                int var383 = field1053[--Statics.field1054];
                Statics.method2082().method5660(var383);
                var378 = 1;
            } else if (arg0 == 6605) {
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5665() ? 1 : 0;
                var378 = 1;
            } else if (arg0 == 6606) {
                class229 var384 = new class229(field1053[--Statics.field1054]);
                Statics.method2082().method5667(var384.field2605, var384.field2606);
                var378 = 1;
            } else if (arg0 == 6607) {
                class229 var385 = new class229(field1053[--Statics.field1054]);
                Statics.method2082().method5668(var385.field2605, var385.field2606);
                var378 = 1;
            } else if (arg0 == 6608) {
                class229 var386 = new class229(field1053[--Statics.field1054]);
                Statics.method2082().method5669(var386.field2610, var386.field2605, var386.field2606);
                var378 = 1;
            } else if (arg0 == 6609) {
                class229 var387 = new class229(field1053[--Statics.field1054]);
                Statics.method2082().method5819(var387.field2610, var387.field2605, var387.field2606);
                var378 = 1;
            } else if (arg0 == 6610) {
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5699();
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5672();
                var378 = 1;
            } else if (arg0 == 6611) {
                int var388 = field1053[--Statics.field1054];
                class21 var389 = Statics.method2082().method5778(var388);
                if (var389 == null) {
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = var389.method235().method4088();
                }
                var378 = 1;
            } else if (arg0 == 6612) {
                int var390 = field1053[--Statics.field1054];
                class21 var391 = Statics.method2082().method5778(var390);
                if (var391 == null) {
                    field1053[++Statics.field1054 - 1] = 0;
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = (var391.method205() - var391.method204() + 1) * 64;
                    field1053[++Statics.field1054 - 1] = (var391.method207() - var391.method206() + 1) * 64;
                }
                var378 = 1;
            } else if (arg0 == 6613) {
                int var392 = field1053[--Statics.field1054];
                class21 var393 = Statics.method2082().method5778(var392);
                if (var393 == null) {
                    field1053[++Statics.field1054 - 1] = 0;
                    field1053[++Statics.field1054 - 1] = 0;
                    field1053[++Statics.field1054 - 1] = 0;
                    field1053[++Statics.field1054 - 1] = 0;
                } else {
                    field1053[++Statics.field1054 - 1] = var393.method204() * 64;
                    field1053[++Statics.field1054 - 1] = var393.method206() * 64;
                    field1053[++Statics.field1054 - 1] = var393.method205() * 64 + 64 - 1;
                    field1053[++Statics.field1054 - 1] = var393.method207() * 64 + 64 - 1;
                }
                var378 = 1;
            } else if (arg0 == 6614) {
                int var394 = field1053[--Statics.field1054];
                class21 var395 = Statics.method2082().method5778(var394);
                if (var395 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = var395.method203();
                }
                var378 = 1;
            } else if (arg0 == 6615) {
                class229 var396 = Statics.method2082().method5673();
                if (var396 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = var396.field2605;
                    field1053[++Statics.field1054 - 1] = var396.field2606;
                }
                var378 = 1;
            } else if (arg0 == 6616) {
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5650();
                var378 = 1;
            } else if (arg0 == 6617) {
                class229 var397 = new class229(field1053[--Statics.field1054]);
                class21 var398 = Statics.method2082().method5651();
                if (var398 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                    field1053[++Statics.field1054 - 1] = -1;
                    var378 = 1;
                } else {
                    int[] var399 = var398.method213(var397.field2610, var397.field2605, var397.field2606);
                    if (var399 == null) {
                        field1053[++Statics.field1054 - 1] = -1;
                        field1053[++Statics.field1054 - 1] = -1;
                    } else {
                        field1053[++Statics.field1054 - 1] = var399[0];
                        field1053[++Statics.field1054 - 1] = var399[1];
                    }
                    var378 = 1;
                }
            } else if (arg0 == 6618) {
                class229 var400 = new class229(field1053[--Statics.field1054]);
                class21 var401 = Statics.method2082().method5651();
                if (var401 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                    field1053[++Statics.field1054 - 1] = -1;
                    var378 = 1;
                } else {
                    class229 var402 = var401.method196(var400.field2605, var400.field2606);
                    if (var402 == null) {
                        field1053[++Statics.field1054 - 1] = -1;
                    } else {
                        field1053[++Statics.field1054 - 1] = var402.method4088();
                    }
                    var378 = 1;
                }
            } else if (arg0 == 6619) {
                Statics.field1054 -= 2;
                int var403 = field1053[Statics.field1054];
                class229 var404 = new class229(field1053[Statics.field1054 + 1]);
                method117(var403, var404, false);
                var378 = 1;
            } else if (arg0 == 6620) {
                Statics.field1054 -= 2;
                int var405 = field1053[Statics.field1054];
                class229 var406 = new class229(field1053[Statics.field1054 + 1]);
                method117(var405, var406, true);
                var378 = 1;
            } else if (arg0 == 6621) {
                Statics.field1054 -= 2;
                int var407 = field1053[Statics.field1054];
                class229 var408 = new class229(field1053[Statics.field1054 + 1]);
                class21 var409 = Statics.method2082().method5778(var407);
                if (var409 == null) {
                    field1053[++Statics.field1054 - 1] = 0;
                    var378 = 1;
                } else {
                    field1053[++Statics.field1054 - 1] = var409.method255(var408.field2610, var408.field2605, var408.field2606) ? 1 : 0;
                    var378 = 1;
                }
            } else if (arg0 == 6622) {
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5674();
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5675();
                var378 = 1;
            } else if (arg0 == 6623) {
                class229 var410 = new class229(field1053[--Statics.field1054]);
                class21 var411 = Statics.method2082().method5647(var410.field2610, var410.field2605, var410.field2606);
                if (var411 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = var411.method198();
                }
                var378 = 1;
            } else if (arg0 == 6624) {
                Statics.method2082().method5676(field1053[--Statics.field1054]);
                var378 = 1;
            } else if (arg0 == 6625) {
                Statics.method2082().method5677();
                var378 = 1;
            } else if (arg0 == 6626) {
                Statics.method2082().method5693(field1053[--Statics.field1054]);
                var378 = 1;
            } else if (arg0 == 6627) {
                Statics.method2082().method5679();
                var378 = 1;
            } else if (arg0 == 6628) {
                boolean var412 = field1053[--Statics.field1054] == 1;
                Statics.method2082().method5705(var412);
                var378 = 1;
            } else if (arg0 == 6629) {
                int var413 = field1053[--Statics.field1054];
                Statics.method2082().method5656(var413);
                var378 = 1;
            } else if (arg0 == 6630) {
                int var414 = field1053[--Statics.field1054];
                Statics.method2082().method5817(var414);
                var378 = 1;
            } else if (arg0 == 6631) {
                Statics.method2082().method5683();
                var378 = 1;
            } else if (arg0 == 6632) {
                boolean var415 = field1053[--Statics.field1054] == 1;
                Statics.method2082().method5718(var415);
                var378 = 1;
            } else if (arg0 == 6633) {
                Statics.field1054 -= 2;
                int var416 = field1053[Statics.field1054];
                boolean var417 = field1053[Statics.field1054 + 1] == 1;
                Statics.method2082().method5732(var416, var417);
                var378 = 1;
            } else if (arg0 == 6634) {
                Statics.field1054 -= 2;
                int var418 = field1053[Statics.field1054];
                boolean var419 = field1053[Statics.field1054 + 1] == 1;
                Statics.method2082().method5810(var418, var419);
                var378 = 1;
            } else if (arg0 == 6635) {
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5687() ? 1 : 0;
                var378 = 1;
            } else if (arg0 == 6636) {
                int var420 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5688(var420) ? 1 : 0;
                var378 = 1;
            } else if (arg0 == 6637) {
                int var421 = field1053[--Statics.field1054];
                field1053[++Statics.field1054 - 1] = Statics.method2082().method5742(var421) ? 1 : 0;
                var378 = 1;
            } else if (arg0 == 6638) {
                Statics.field1054 -= 2;
                int var422 = field1053[Statics.field1054];
                class229 var423 = new class229(field1053[Statics.field1054 + 1]);
                class229 var424 = Statics.method2082().method5685(var422, var423);
                if (var424 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = var424.method4088();
                }
                var378 = 1;
            } else if (arg0 == 6639) {
                class29 var425 = Statics.method2082().method5694();
                if (var425 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = var425.field269;
                    field1053[++Statics.field1054 - 1] = var425.field267.method4088();
                }
                var378 = 1;
            } else if (arg0 == 6640) {
                class29 var426 = Statics.method2082().method5695();
                if (var426 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = var426.field269;
                    field1053[++Statics.field1054 - 1] = var426.field267.method4088();
                }
                var378 = 1;
            } else if (arg0 == 6693) {
                int var427 = field1053[--Statics.field1054];
                class258 var428 = class258.method4467(var427);
                if (var428.field3303 == null) {
                    field1055[++Statics.field36 - 1] = "";
                } else {
                    field1055[++Statics.field36 - 1] = var428.field3303;
                }
                var378 = 1;
            } else if (arg0 == 6694) {
                int var429 = field1053[--Statics.field1054];
                class258 var430 = class258.method4467(var429);
                field1053[++Statics.field1054 - 1] = var430.field3286;
                var378 = 1;
            } else if (arg0 == 6695) {
                int var431 = field1053[--Statics.field1054];
                class258 var432 = class258.method4467(var431);
                if (var432 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = var432.field3285;
                }
                var378 = 1;
            } else if (arg0 == 6696) {
                int var433 = field1053[--Statics.field1054];
                class258 var434 = class258.method4467(var433);
                if (var434 == null) {
                    field1053[++Statics.field1054 - 1] = -1;
                } else {
                    field1053[++Statics.field1054 - 1] = var434.field3290;
                }
                var378 = 1;
            } else if (arg0 == 6697) {
                field1053[++Statics.field1054 - 1] = Statics.field406.field339;
                var378 = 1;
            } else if (arg0 == 6698) {
                field1053[++Statics.field1054 - 1] = Statics.field406.field336.method4088();
                var378 = 1;
            } else if (arg0 == 6699) {
                field1053[++Statics.field1054 - 1] = Statics.field406.field335.method4088();
                var378 = 1;
            } else {
                var378 = 2;
            }
            return var378;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.u(ILcu;ZI)I")
    public static int method445(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1054 -= 3;
            int var3 = field1053[Statics.field1054];
            int var4 = field1053[Statics.field1054 + 1];
            int var5 = field1053[Statics.field1054 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class233 var6 = class233.method457(var3);
            if (var6.field2691 == null) {
                var6.field2691 = new class233[var5 + 1];
            }
            if (var6.field2691.length <= var5) {
                class233[] var7 = new class233[var5 + 1];
                for (int var8 = 0; var8 < var6.field2691.length; var8++) {
                    var7[var8] = var6.field2691[var8];
                }
                var6.field2691 = var7;
            }
            if (var5 > 0 && var6.field2691[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class233 var9 = new class233();
            var9.field2645 = var4;
            var9.field2662 = var9.field2677 = var6.field2677;
            var9.field2644 = var5;
            var9.field2642 = true;
            var6.field2691[var5] = var9;
            if (arg2) {
                Statics.field248 = var9;
            } else {
                Statics.field984 = var9;
            }
            client.method266(var6);
            return 1;
        } else if (arg0 == 101) {
            class233 var10 = arg2 ? Statics.field248 : Statics.field984;
            class233 var11 = class233.method457(var10.field2677);
            var11.field2691[var10.field2644] = null;
            client.method266(var11);
            return 1;
        } else if (arg0 == 102) {
            class233 var12 = class233.method457(field1053[--Statics.field1054]);
            var12.field2691 = null;
            client.method266(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1054 -= 2;
            int var13 = field1053[Statics.field1054];
            int var14 = field1053[Statics.field1054 + 1];
            class233 var15 = class233.method1454(var13, var14);
            if (var15 == null || var14 == -1) {
                field1053[++Statics.field1054 - 1] = 0;
            } else {
                field1053[++Statics.field1054 - 1] = 1;
                if (arg2) {
                    Statics.field248 = var15;
                } else {
                    Statics.field984 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class233 var16 = class233.method457(field1053[--Statics.field1054]);
            if (var16 == null) {
                field1053[++Statics.field1054 - 1] = 0;
            } else {
                field1053[++Statics.field1054 - 1] = 1;
                if (arg2) {
                    Statics.field248 = var16;
                } else {
                    Statics.field984 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.i(ILcu;ZB)I")
    public static int method2100(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1053[--Statics.field1054];
            var4 = class233.method457(var3);
        } else {
            var4 = arg2 ? Statics.field248 : Statics.field984;
        }
        if (arg0 == 1000) {
            Statics.field1054 -= 4;
            var4.field2652 = field1053[Statics.field1054];
            var4.field2653 = field1053[Statics.field1054 + 1];
            var4.field2693 = field1053[Statics.field1054 + 2];
            var4.field2753 = field1053[Statics.field1054 + 3];
            client.method266(var4);
            Statics.field3162.method1154(var4);
            if (var3 != -1 && var4.field2645 == 0) {
                client.method709(Statics.field2639[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1054 -= 4;
            var4.field2772 = field1053[Statics.field1054];
            var4.field2682 = field1053[Statics.field1054 + 1];
            var4.field2650 = field1053[Statics.field1054 + 2];
            var4.field2651 = field1053[Statics.field1054 + 3];
            client.method266(var4);
            Statics.field3162.method1154(var4);
            if (var3 != -1 && var4.field2645 == 0) {
                client.method709(Statics.field2639[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1053[--Statics.field1054] == 1;
            if (var4.field2655 != var5) {
                var4.field2655 = var5;
                client.method266(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2777 = field1053[--Statics.field1054] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2633 = field1053[--Statics.field1054] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.p(ILcu;ZS)I")
    public static int method438(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1053[--Statics.field1054];
            var4 = class233.method457(var3);
        } else {
            var4 = arg2 ? Statics.field248 : Statics.field984;
        }
        if (arg0 == 1100) {
            Statics.field1054 -= 2;
            var4.field2664 = field1053[Statics.field1054];
            if (var4.field2664 > var4.field2666 - var4.field2654) {
                var4.field2664 = var4.field2666 - var4.field2654;
            }
            if (var4.field2664 < 0) {
                var4.field2664 = 0;
            }
            var4.field2749 = field1053[Statics.field1054 + 1];
            if (var4.field2749 > var4.field2667 - var4.field2768) {
                var4.field2749 = var4.field2667 - var4.field2768;
            }
            if (var4.field2749 < 0) {
                var4.field2749 = 0;
            }
            client.method266(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2741 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2672 = field1053[--Statics.field1054] == 1;
            client.method266(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2720 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2676 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2692 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2680 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2746 = field1053[--Statics.field1054] == 1;
            client.method266(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2686 = 1;
            var4.field2687 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1054 -= 6;
            var4.field2743 = field1053[Statics.field1054];
            var4.field2663 = field1053[Statics.field1054 + 1];
            var4.field2694 = field1053[Statics.field1054 + 2];
            var4.field2695 = field1053[Statics.field1054 + 3];
            var4.field2696 = field1053[Statics.field1054 + 4];
            var4.field2697 = field1053[Statics.field1054 + 5];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1053[--Statics.field1054];
            if (var4.field2690 != var5) {
                var4.field2690 = var5;
                var4.field2766 = 0;
                var4.field2767 = 0;
                client.method266(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2700 = field1053[--Statics.field1054] == 1;
            client.method266(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1055[--Statics.field36];
            if (!var6.equals(var4.field2704)) {
                var4.field2704 = var6;
                client.method266(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2703 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1054 -= 3;
            var4.field2707 = field1053[Statics.field1054];
            var4.field2708 = field1053[Statics.field1054 + 1];
            var4.field2754 = field1053[Statics.field1054 + 2];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2709 = field1053[--Statics.field1054] == 1;
            client.method266(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2771 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2683 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2716 = field1053[--Statics.field1054] == 1;
            client.method266(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2684 = field1053[--Statics.field1054] == 1;
            client.method266(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1054 -= 2;
            var4.field2666 = field1053[Statics.field1054];
            var4.field2667 = field1053[Statics.field1054 + 1];
            client.method266(var4);
            if (var3 != -1 && var4.field2645 == 0) {
                client.method709(Statics.field2639[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2677;
            int var8 = var4.field2644;
            class175 var9 = class175.method3207(class172.field2202, client.field672.field1273);
            var9.field2299.method3256(var7);
            var9.field2299.method3303(var8);
            client.field672.method1901(var9);
            client.field789 = var4;
            client.method266(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2679 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2635 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2675 = field1053[--Statics.field1054];
            client.method266(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var10 = field1053[--Statics.field1054];
            class322[] var11 = new class322[] { class322.field3833, class322.field3832, class322.field3836 };
            class322 var12 = (class322) class180.method3179(var11, var10);
            if (var12 != null) {
                var4.field2760 = var12;
                client.method266(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var13 = field1053[--Statics.field1054] == 1;
            var4.field2756 = var13;
            return 1;
        } else if (arg0 == 1127) {
            boolean var14 = field1053[--Statics.field1054] == 1;
            var4.field2701 = var14;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fe.e(ILcu;ZI)I")
    public static int method3172(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method457(field1053[--Statics.field1054]);
        } else {
            var3 = arg2 ? Statics.field248 : Statics.field984;
        }
        client.method266(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1054 -= 2;
            int var4 = field1053[Statics.field1054];
            int var5 = field1053[Statics.field1054 + 1];
            var3.field2764 = var4;
            var3.field2765 = var5;
            class272 var6 = class272.method4572(var4);
            var3.field2694 = var6.field3475;
            var3.field2695 = var6.field3490;
            var3.field2696 = var6.field3491;
            var3.field2743 = var6.field3522;
            var3.field2663 = var6.field3493;
            var3.field2697 = var6.field3524;
            if (arg0 == 1205) {
                var3.field2750 = 0;
            } else if (arg0 == 1212 | var6.field3494 == 1) {
                var3.field2750 = 1;
            } else {
                var3.field2750 = 2;
            }
            if (var3.field2698 > 0) {
                var3.field2697 = var3.field2697 * 32 / var3.field2698;
            } else if (var3.field2772 > 0) {
                var3.field2697 = var3.field2697 * 32 / var3.field2772;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2686 = 2;
            var3.field2687 = field1053[--Statics.field1054];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2686 = 3;
            var3.field2687 = Statics.field476.field591.method4098();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.s(ILcu;ZI)I")
    public static int method2940(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method457(field1053[--Statics.field1054]);
        } else {
            var3 = arg2 ? Statics.field248 : Statics.field984;
        }
        if (arg0 == 1300) {
            int var4 = field1053[--Statics.field1054] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4167(var4, field1055[--Statics.field36]);
                return 1;
            } else {
                Statics.field36--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1054 -= 2;
            int var5 = field1053[Statics.field1054];
            int var6 = field1053[Statics.field1054 + 1];
            var3.field2719 = class233.method1454(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2722 = field1053[--Statics.field1054] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2721 = field1053[--Statics.field1054];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2717 = field1053[--Statics.field1054];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2755 = field1055[--Statics.field36];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2674 = field1055[--Statics.field36];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2718 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.v(ILcu;ZI)I")
    public static int method706(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method457(field1053[--Statics.field1054]);
        } else {
            var3 = arg2 ? Statics.field248 : Statics.field984;
        }
        String var4 = field1055[--Statics.field36];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1053[--Statics.field1054];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1053[--Statics.field1054];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1055[--Statics.field36];
            } else {
                var7[var8] = Integer.valueOf(field1053[--Statics.field1054]);
            }
        }
        int var9 = field1053[--Statics.field1054];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2726 = var7;
        } else if (arg0 == 1401) {
            var3.field2729 = var7;
        } else if (arg0 == 1402) {
            var3.field2728 = var7;
        } else if (arg0 == 1403) {
            var3.field2730 = var7;
        } else if (arg0 == 1404) {
            var3.field2732 = var7;
        } else if (arg0 == 1405) {
            var3.field2733 = var7;
        } else if (arg0 == 1406) {
            var3.field2736 = var7;
        } else if (arg0 == 1407) {
            var3.field2737 = var7;
            var3.field2714 = var5;
        } else if (arg0 == 1408) {
            var3.field2727 = var7;
        } else if (arg0 == 1409) {
            var3.field2744 = var7;
        } else if (arg0 == 1410) {
            var3.field2734 = var7;
        } else if (arg0 == 1411) {
            var3.field2702 = var7;
        } else if (arg0 == 1412) {
            var3.field2731 = var7;
        } else if (arg0 == 1414) {
            var3.field2739 = var7;
            var3.field2740 = var5;
        } else if (arg0 == 1415) {
            var3.field2723 = var7;
            var3.field2742 = var5;
        } else if (arg0 == 1416) {
            var3.field2735 = var7;
        } else if (arg0 == 1417) {
            var3.field2745 = var7;
        } else if (arg0 == 1418) {
            var3.field2659 = var7;
        } else if (arg0 == 1419) {
            var3.field2747 = var7;
        } else if (arg0 == 1420) {
            var3.field2748 = var7;
        } else if (arg0 == 1421) {
            var3.field2643 = var7;
        } else if (arg0 == 1422) {
            var3.field2681 = var7;
        } else if (arg0 == 1423) {
            var3.field2751 = var7;
        } else if (arg0 == 1424) {
            var3.field2648 = var7;
        } else if (arg0 == 1425) {
            var3.field2678 = var7;
        } else if (arg0 == 1426) {
            var3.field2778 = var7;
        } else if (arg0 == 1427) {
            var3.field2631 = var7;
        } else {
            return 2;
        }
        var3.field2724 = true;
        return 1;
    }

    @ObfuscatedName("av.k(ILcu;ZI)I")
    public static int method519(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = arg2 ? Statics.field248 : Statics.field984;
        if (arg0 == 1700) {
            field1053[++Statics.field1054 - 1] = var3.field2764;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2764 == -1) {
                field1053[++Statics.field1054 - 1] = 0;
            } else {
                field1053[++Statics.field1054 - 1] = var3.field2765;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1053[++Statics.field1054 - 1] = var3.field2644;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fk.o(ILcu;ZI)I")
    public static int method3060(int arg0, class87 arg1, boolean arg2) {
        class233 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class233.method457(field1053[--Statics.field1054]);
        } else {
            var3 = arg2 ? Statics.field248 : Statics.field984;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1062 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2631 == null) {
            return 0;
        } else {
            class58 var4 = new class58();
            var4.field555 = var3;
            var4.field556 = var3.field2631;
            var4.field561 = field1062 + 1;
            client.field822.method3773(var4);
            return 1;
        }
    }

    @ObfuscatedName("o.q(ILcu;ZI)I")
    public static int method112(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method457(field1053[--Statics.field1054]);
        if (arg0 == 2600) {
            field1053[++Statics.field1054 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 2601) {
            field1053[++Statics.field1054 - 1] = var3.field2749;
            return 1;
        } else if (arg0 == 2602) {
            field1055[++Statics.field36 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 2603) {
            field1053[++Statics.field1054 - 1] = var3.field2666;
            return 1;
        } else if (arg0 == 2604) {
            field1053[++Statics.field1054 - 1] = var3.field2667;
            return 1;
        } else if (arg0 == 2605) {
            field1053[++Statics.field1054 - 1] = var3.field2697;
            return 1;
        } else if (arg0 == 2606) {
            field1053[++Statics.field1054 - 1] = var3.field2694;
            return 1;
        } else if (arg0 == 2607) {
            field1053[++Statics.field1054 - 1] = var3.field2696;
            return 1;
        } else if (arg0 == 2608) {
            field1053[++Statics.field1054 - 1] = var3.field2695;
            return 1;
        } else if (arg0 == 2609) {
            field1053[++Statics.field1054 - 1] = var3.field2720;
            return 1;
        } else if (arg0 == 2610) {
            field1053[++Statics.field1054 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 2611) {
            field1053[++Statics.field1054 - 1] = var3.field2741;
            return 1;
        } else if (arg0 == 2612) {
            field1053[++Statics.field1054 - 1] = var3.field2635;
            return 1;
        } else if (arg0 == 2613) {
            field1053[++Statics.field1054 - 1] = var3.field2760.method144();
            return 1;
        } else if (arg0 == 2614) {
            field1053[++Statics.field1054 - 1] = var3.field2701 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ac.l(ILcu;ZI)I")
    public static int method644(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method457(field1053[--Statics.field1054]);
        if (arg0 == 2800) {
            field1053[++Statics.field1054 - 1] = class234.method527(client.method50(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1053[--Statics.field1054];
            int var5 = var4 - 1;
            if (var3.field2718 == null || var5 >= var3.field2718.length || var3.field2718[var5] == null) {
                field1055[++Statics.field36 - 1] = "";
            } else {
                field1055[++Statics.field36 - 1] = var3.field2718[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2755 == null) {
                field1055[++Statics.field36 - 1] = "";
            } else {
                field1055[++Statics.field36 - 1] = var3.field2755;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fg.f(ILcu;ZB)I")
    public static int method3238(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1054 -= 3;
            client.method4976(field1053[Statics.field1054], field1053[Statics.field1054 + 1], field1053[Statics.field1054 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            int var3 = field1053[--Statics.field1054];
            if (var3 == -1 && !client.field858) {
                Statics.field2509.method3901();
                class220.field2510 = 1;
                Statics.field2507 = null;
            } else if (var3 != -1 && client.field857 != var3 && client.field714 != 0 && !client.field858) {
                class252 var4 = Statics.field397;
                int var5 = client.field714;
                class220.field2510 = 1;
                Statics.field2507 = var4;
                Statics.field2433 = var3;
                Statics.field407 = 0;
                Statics.field1756 = var5;
                Statics.field2511 = false;
                Statics.field2327 = 2;
            }
            client.field857 = var3;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1054 -= 2;
            client.method962(field1053[Statics.field1054], field1053[Statics.field1054 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eq.z(ILcu;ZI)I")
    public static int method2850(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1053[--Statics.field1054];
            field1053[++Statics.field1054 - 1] = client.field890[var3].method37();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1053[--Statics.field1054];
            field1053[++Statics.field1054 - 1] = client.field890[var4].field28;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1053[--Statics.field1054];
            field1053[++Statics.field1054 - 1] = client.field890[var5].field34;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1053[--Statics.field1054];
            field1053[++Statics.field1054 - 1] = client.field890[var6].field38;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1053[--Statics.field1054];
            field1053[++Statics.field1054 - 1] = client.field890[var7].field29;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1053[--Statics.field1054];
            field1053[++Statics.field1054 - 1] = client.field890[var8].field32;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1053[--Statics.field1054];
            int var10 = client.field890[var9].method36();
            field1053[++Statics.field1054 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1053[--Statics.field1054];
            int var12 = client.field890[var11].method36();
            field1053[++Statics.field1054 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1053[--Statics.field1054];
            int var14 = client.field890[var13].method36();
            field1053[++Statics.field1054 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1053[--Statics.field1054];
            int var16 = client.field890[var15].method36();
            field1053[++Statics.field1054 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1053[--Statics.field1054] == 1;
            if (Statics.field911 != null) {
                Statics.field911.method13(class2.field10, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1053[--Statics.field1054] == 1;
            if (Statics.field911 != null) {
                Statics.field911.method13(class2.field9, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1054 -= 2;
            boolean var19 = field1053[Statics.field1054] == 1;
            boolean var20 = field1053[Statics.field1054 + 1] == 1;
            if (Statics.field911 != null) {
                client.field865.field622 = var20;
                Statics.field911.method13(client.field865, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1053[--Statics.field1054] == 1;
            if (Statics.field911 != null) {
                Statics.field911.method13(class2.field11, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1053[--Statics.field1054] == 1;
            if (Statics.field911 != null) {
                Statics.field911.method13(class2.field7, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1053[++Statics.field1054 - 1] = Statics.field911 == null ? 0 : Statics.field911.field8.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1053[--Statics.field1054];
            class3 var24 = (class3) Statics.field911.field8.get(var23);
            field1053[++Statics.field1054 - 1] = var24.field18;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1053[--Statics.field1054];
            class3 var26 = (class3) Statics.field911.field8.get(var25);
            field1055[++Statics.field36 - 1] = var26.method15();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1053[--Statics.field1054];
            class3 var28 = (class3) Statics.field911.field8.get(var27);
            field1055[++Statics.field36 - 1] = var28.method17();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1053[--Statics.field1054];
            class3 var30 = (class3) Statics.field911.field8.get(var29);
            long var31 = class187.method1700() - Statics.field50 - var30.field15;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1055[++Statics.field36 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1053[--Statics.field1054];
            class3 var38 = (class3) Statics.field911.field8.get(var37);
            field1053[++Statics.field1054 - 1] = var38.field16.field38;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1053[--Statics.field1054];
            class3 var40 = (class3) Statics.field911.field8.get(var39);
            field1053[++Statics.field1054 - 1] = var40.field16.field34;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1053[--Statics.field1054];
            class3 var42 = (class3) Statics.field911.field8.get(var41);
            field1053[++Statics.field1054 - 1] = var42.field16.field28;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fa.a(ILcu;ZI)I")
    public static int method3094(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5306) {
            int[] var3 = field1053;
            int var4 = ++Statics.field1054 - 1;
            int var5 = client.field837 ? 2 : 1;
            var3[var4] = var5;
            return 1;
        } else if (arg0 == 5307) {
            int var6 = field1053[--Statics.field1054];
            if (var6 == 1 || var6 == 2) {
                client.method991(var6);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1053[++Statics.field1054 - 1] = Statics.field257.field1010;
            return 1;
        } else if (arg0 == 5309) {
            int var7 = field1053[--Statics.field1054];
            if (var7 == 1 || var7 == 2) {
                Statics.field257.field1010 = var7;
                class68.method3057();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kw.x(ILcu;ZB)I")
    public static int method5125(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1053[++Statics.field1054 - 1] = class67.method105() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class67.field994 = 0;
            class67 var3;
            if (class67.field994 < class67.field995) {
                var3 = Statics.field990[++class67.field994 - 1];
            } else {
                var3 = null;
            }
            if (var3 == null) {
                field1053[++Statics.field1054 - 1] = -1;
                field1053[++Statics.field1054 - 1] = 0;
                field1055[++Statics.field36 - 1] = "";
                field1053[++Statics.field1054 - 1] = 0;
                field1053[++Statics.field1054 - 1] = 0;
                field1055[++Statics.field36 - 1] = "";
            } else {
                field1053[++Statics.field1054 - 1] = var3.field998;
                field1053[++Statics.field1054 - 1] = var3.field999;
                field1055[++Statics.field36 - 1] = var3.field1002;
                field1053[++Statics.field1054 - 1] = var3.field1003;
                field1053[++Statics.field1054 - 1] = var3.field1001;
                field1055[++Statics.field36 - 1] = var3.field992;
            }
            return 1;
        } else if (arg0 == 6502) {
            class67 var6;
            if (class67.field994 < class67.field995) {
                var6 = Statics.field990[++class67.field994 - 1];
            } else {
                var6 = null;
            }
            if (var6 == null) {
                field1053[++Statics.field1054 - 1] = -1;
                field1053[++Statics.field1054 - 1] = 0;
                field1055[++Statics.field36 - 1] = "";
                field1053[++Statics.field1054 - 1] = 0;
                field1053[++Statics.field1054 - 1] = 0;
                field1055[++Statics.field36 - 1] = "";
            } else {
                field1053[++Statics.field1054 - 1] = var6.field998;
                field1053[++Statics.field1054 - 1] = var6.field999;
                field1055[++Statics.field36 - 1] = var6.field1002;
                field1053[++Statics.field1054 - 1] = var6.field1003;
                field1053[++Statics.field1054 - 1] = var6.field1001;
                field1055[++Statics.field36 - 1] = var6.field992;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var8 = field1053[--Statics.field1054];
            class67 var9 = null;
            for (int var10 = 0; var10 < class67.field995; var10++) {
                if (Statics.field990[var10].field998 == var8) {
                    var9 = Statics.field990[var10];
                    break;
                }
            }
            if (var9 == null) {
                field1053[++Statics.field1054 - 1] = -1;
                field1053[++Statics.field1054 - 1] = 0;
                field1055[++Statics.field36 - 1] = "";
                field1053[++Statics.field1054 - 1] = 0;
                field1053[++Statics.field1054 - 1] = 0;
                field1055[++Statics.field36 - 1] = "";
            } else {
                field1053[++Statics.field1054 - 1] = var9.field998;
                field1053[++Statics.field1054 - 1] = var9.field999;
                field1055[++Statics.field36 - 1] = var9.field1002;
                field1053[++Statics.field1054 - 1] = var9.field1003;
                field1053[++Statics.field1054 - 1] = var9.field1001;
                field1055[++Statics.field36 - 1] = var9.field992;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1054 -= 4;
            int var11 = field1053[Statics.field1054];
            boolean var12 = field1053[Statics.field1054 + 1] == 1;
            int var13 = field1053[Statics.field1054 + 2];
            boolean var14 = field1053[Statics.field1054 + 3] == 1;
            if (Statics.field990 != null) {
                class67.method2887(0, Statics.field990.length - 1, var11, var12, var13, var14);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var15 = field1053[--Statics.field1054];
            if (var15 >= 0 && var15 < class67.field995) {
                class67 var16 = Statics.field990[var15];
                field1053[++Statics.field1054 - 1] = var16.field998;
                field1053[++Statics.field1054 - 1] = var16.field999;
                field1055[++Statics.field36 - 1] = var16.field1002;
                field1053[++Statics.field1054 - 1] = var16.field1003;
                field1053[++Statics.field1054 - 1] = var16.field1001;
                field1055[++Statics.field36 - 1] = var16.field992;
            } else {
                field1053[++Statics.field1054 - 1] = -1;
                field1053[++Statics.field1054 - 1] = 0;
                field1055[++Statics.field36 - 1] = "";
                field1053[++Statics.field1054 - 1] = 0;
                field1053[++Statics.field1054 - 1] = 0;
                field1055[++Statics.field36 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field701 = field1053[--Statics.field1054] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1054 -= 2;
            int var17 = field1053[Statics.field1054];
            int var18 = field1053[Statics.field1054 + 1];
            class267 var19 = class267.method2458(var18);
            if (var19.method4589()) {
                field1055[++Statics.field36 - 1] = Statics.method4448(var17).method4822(var18, var19.field3379);
            } else {
                field1053[++Statics.field1054 - 1] = Statics.method4448(var17).method4807(var18, var19.field3378);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1054 -= 2;
            int var20 = field1053[Statics.field1054];
            int var21 = field1053[Statics.field1054 + 1];
            class267 var22 = class267.method2458(var21);
            if (var22.method4589()) {
                field1055[++Statics.field36 - 1] = class271.method3187(var20).method4716(var21, var22.field3379);
            } else {
                field1053[++Statics.field1054 - 1] = class271.method3187(var20).method4713(var21, var22.field3378);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1054 -= 2;
            int var23 = field1053[Statics.field1054];
            int var24 = field1053[Statics.field1054 + 1];
            class267 var25 = class267.method2458(var24);
            if (var25.method4589()) {
                field1055[++Statics.field36 - 1] = class272.method4572(var23).method4740(var24, var25.field3379);
            } else {
                field1053[++Statics.field1054 - 1] = class272.method4572(var23).method4739(var24, var25.field3378);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1054 -= 2;
            int var26 = field1053[Statics.field1054];
            int var27 = field1053[Statics.field1054 + 1];
            class267 var28 = class267.method2458(var27);
            if (var28.method4589()) {
                String[] var29 = field1055;
                int var30 = ++Statics.field36 - 1;
                class268 var31 = (class268) class268.field3383.method3685((long) var26);
                class268 var32;
                if (var31 == null) {
                    byte[] var33 = Statics.field3382.method4263(34, var26);
                    class268 var34 = new class268();
                    if (var33 != null) {
                        var34.method4610(new class185(var33));
                    }
                    var34.method4609();
                    class268.field3383.method3687(var34, (long) var26);
                    var32 = var34;
                } else {
                    var32 = var31;
                }
                var29[var30] = var32.method4614(var27, var28.field3379);
            } else {
                int[] var35 = field1053;
                int var36 = ++Statics.field1054 - 1;
                class268 var37 = (class268) class268.field3383.method3685((long) var26);
                class268 var38;
                if (var37 == null) {
                    byte[] var39 = Statics.field3382.method4263(34, var26);
                    class268 var40 = new class268();
                    if (var39 != null) {
                        var40.method4610(new class185(var39));
                    }
                    var40.method4609();
                    class268.field3383.method3687(var40, (long) var26);
                    var38 = var40;
                } else {
                    var38 = var37;
                }
                var35[var36] = var38.method4621(var27, var28.field3378);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1053[++Statics.field1054 - 1] = client.field760 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1053[++Statics.field1054 - 1] = client.field633 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field36--;
            Statics.field1054--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field36--;
            Statics.field1054--;
            return 1;
        } else if (arg0 == 6524) {
            field1053[++Statics.field1054 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1053[++Statics.field1054 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1053[++Statics.field1054 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jw.b(IB)V")
    public static void method4548(int arg0) {
        if (arg0 == -1 || !class233.method3013(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2639[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3.field2725 != null) {
                class58 var4 = new class58();
                var4.field555 = var3;
                var4.field556 = var3.field2725;
                method2848(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("q.w(ILhm;ZI)V")
    public static void method117(int arg0, class229 arg1, boolean arg2) {
        class21 var3 = Statics.method2082().method5778(arg0);
        int var4 = Statics.field476.field611;
        int var5 = (Statics.field476.field951 >> 7) + Statics.field2788;
        int var6 = (Statics.field476.field956 >> 7) + Statics.field599;
        class229 var7 = new class229(var4, var5, var6);
        Statics.method2082().method5750(var3, var7, arg1, arg2);
    }
}
