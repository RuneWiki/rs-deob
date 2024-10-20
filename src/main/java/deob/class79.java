package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cd")
public class class79 {

    @ObfuscatedName("cd.b")
    public static int[] field975 = new int[5];

    @ObfuscatedName("cd.d")
    public static int[][] field976 = new int[5][5000];

    @ObfuscatedName("cd.s")
    public static int[] field977 = new int[1000];

    @ObfuscatedName("cd.l")
    public static String[] field978 = new String[1000];

    @ObfuscatedName("cd.c")
    public static int field980 = 0;

    @ObfuscatedName("cd.e")
    public static class72[] field981 = new class72[50];

    @ObfuscatedName("cd.z")
    public static Calendar field982 = Calendar.getInstance();

    @ObfuscatedName("cd.w")
    public static final String[] field985 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cd.h")
    public static boolean field974 = false;

    @ObfuscatedName("cd.q")
    public static boolean field987 = false;

    @ObfuscatedName("cd.i")
    public static int field988 = 0;

    @ObfuscatedName("cd.al")
    public static final double field990 = Math.log(2.0D);

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.v(Lcz;B)V")
    public static void method2186(class96 arg0) {
        method1503(arg0, 500000, 475000);
    }

    @ObfuscatedName("bg.n(Lcz;III)V")
    public static void method1503(class96 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1178;
        class87 var5;
        if (class379.method2065(arg0.field1182)) {
            Statics.field595 = (class189) var3[0];
            class139 var4 = class139.method52(Statics.field595.field2150);
            var5 = class87.method342(arg0.field1182, var4.field1560, var4.field1574);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class87.method1002(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field320 = 0;
        Statics.field979 = 0;
        int var7 = -1;
        int[] var8 = var5.field1089;
        int[] var9 = var5.field1088;
        byte var10 = -1;
        field980 = 0;
        field974 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field4117 = new int[var5.field1090];
            int var13 = 0;
            Statics.field973 = new String[var5.field1091];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1174;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1175;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1173 == null ? -1 : arg0.field1173.field2959;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1176;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1173 == null ? -1 : arg0.field1173.field2960;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1177 == null ? -1 : arg0.field1177.field2959;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1177 == null ? -1 : arg0.field1177.field2960;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1183;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1171;
                    }
                    Statics.field4117[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1180;
                    }
                    Statics.field973[var14++] = var17;
                }
            }
            field988 = arg0.field1181;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var57 = var8[var7];
                if (var57 >= 100) {
                    boolean var47;
                    if (var5.field1088[var7] == 1) {
                        var47 = true;
                    } else {
                        var47 = false;
                    }
                    int var48 = method5155(var57, var5, var47);
                    switch(var48) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var57 == 0) {
                    field977[++Statics.field320 - 1] = var9[var7];
                } else if (var57 == 1) {
                    int var18 = var9[var7];
                    field977[++Statics.field320 - 1] = class242.field2918[var18];
                } else if (var57 == 2) {
                    int var19 = var9[var7];
                    class242.field2918[var19] = field977[--Statics.field320];
                    client.method997(var19);
                } else if (var57 == 3) {
                    field978[++Statics.field979 - 1] = var5.field1096[var7];
                } else if (var57 == 6) {
                    var7 += var9[var7];
                } else if (var57 == 7) {
                    Statics.field320 -= 2;
                    if (field977[Statics.field320] != field977[Statics.field320 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 8) {
                    Statics.field320 -= 2;
                    if (field977[Statics.field320] == field977[Statics.field320 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 9) {
                    Statics.field320 -= 2;
                    if (field977[Statics.field320] < field977[Statics.field320 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 10) {
                    Statics.field320 -= 2;
                    if (field977[Statics.field320] > field977[Statics.field320 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 21) {
                    if (field980 == 0) {
                        return;
                    }
                    class72 var20 = field981[--field980];
                    var5 = var20.field614;
                    var8 = var5.field1089;
                    var9 = var5.field1088;
                    var7 = var20.field613;
                    Statics.field4117 = var20.field612;
                    Statics.field973 = var20.field615;
                } else if (var57 == 25) {
                    int var21 = var9[var7];
                    field977[++Statics.field320 - 1] = class242.method3569(var21);
                } else if (var57 == 27) {
                    int var22 = var9[var7];
                    class242.method1768(var22, field977[--Statics.field320]);
                } else if (var57 == 31) {
                    Statics.field320 -= 2;
                    if (field977[Statics.field320] <= field977[Statics.field320 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 32) {
                    Statics.field320 -= 2;
                    if (field977[Statics.field320] >= field977[Statics.field320 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var57 == 33) {
                    field977[++Statics.field320 - 1] = Statics.field4117[var9[var7]];
                } else if (var57 == 34) {
                    Statics.field4117[var9[var7]] = field977[--Statics.field320];
                } else if (var57 == 35) {
                    field978[++Statics.field979 - 1] = Statics.field973[var9[var7]];
                } else if (var57 == 36) {
                    Statics.field973[var9[var7]] = field978[--Statics.field979];
                } else if (var57 == 37) {
                    int var23 = var9[var7];
                    Statics.field979 -= var23;
                    String var24 = class304.method2266(field978, Statics.field979, var23);
                    field978[++Statics.field979 - 1] = var24;
                } else if (var57 == 38) {
                    Statics.field320--;
                } else if (var57 == 39) {
                    Statics.field979--;
                } else if (var57 == 40) {
                    int var25 = var9[var7];
                    class87 var26 = class87.method1002(var25);
                    int[] var27 = new int[var26.field1090];
                    String[] var28 = new String[var26.field1091];
                    for (int var29 = 0; var29 < var26.field1092; var29++) {
                        var27[var29] = field977[Statics.field320 - var26.field1092 + var29];
                    }
                    for (int var30 = 0; var30 < var26.field1093; var30++) {
                        var28[var30] = field978[Statics.field979 - var26.field1093 + var30];
                    }
                    Statics.field320 -= var26.field1092;
                    Statics.field979 -= var26.field1093;
                    class72 var31 = new class72();
                    var31.field614 = var5;
                    var31.field613 = var7;
                    var31.field612 = Statics.field4117;
                    var31.field615 = Statics.field973;
                    field981[++field980 - 1] = var31;
                    var5 = var26;
                    var8 = var26.field1089;
                    var9 = var26.field1088;
                    var7 = -1;
                    Statics.field4117 = var27;
                    Statics.field973 = var28;
                } else if (var57 == 42) {
                    field977[++Statics.field320 - 1] = Statics.field636.method2097(var9[var7]);
                } else if (var57 == 43) {
                    Statics.field636.method2096(var9[var7], field977[--Statics.field320]);
                } else if (var57 == 44) {
                    int var32 = var9[var7] >> 16;
                    int var33 = var9[var7] & 0xFFFF;
                    int var34 = field977[--Statics.field320];
                    if (var34 < 0 || var34 > 5000) {
                        throw new RuntimeException();
                    }
                    field975[var32] = var34;
                    byte var35 = -1;
                    if (var33 == 105) {
                        var35 = 0;
                    }
                    for (int var36 = 0; var36 < var34; var36++) {
                        field976[var32][var36] = var35;
                    }
                } else if (var57 == 45) {
                    int var37 = var9[var7];
                    int var38 = field977[--Statics.field320];
                    if (var38 < 0 || var38 >= field975[var37]) {
                        throw new RuntimeException();
                    }
                    field977[++Statics.field320 - 1] = field976[var37][var38];
                } else if (var57 == 46) {
                    int var39 = var9[var7];
                    Statics.field320 -= 2;
                    int var40 = field977[Statics.field320];
                    if (var40 < 0 || var40 >= field975[var39]) {
                        throw new RuntimeException();
                    }
                    field976[var39][var40] = field977[Statics.field320 + 1];
                } else if (var57 == 47) {
                    String var41 = Statics.field636.method2129(var9[var7]);
                    if (var41 == null) {
                        var41 = class268.field3242;
                    }
                    field978[++Statics.field979 - 1] = var41;
                } else if (var57 == 48) {
                    Statics.field636.method2100(var9[var7], field978[--Statics.field979]);
                } else if (var57 == 49) {
                    String var42 = Statics.field636.method2099(var9[var7]);
                    field978[++Statics.field979 - 1] = var42;
                } else if (var57 == 50) {
                    Statics.field636.method2098(var9[var7], field978[--Statics.field979]);
                } else if (var57 == 60) {
                    class361 var43 = var5.field1094[var9[var7]];
                    class351 var44 = (class351) var43.method5752((long) field977[--Statics.field320]);
                    if (var44 != null) {
                        var7 += var44.field3937;
                    }
                } else if (var57 == 74) {
                    Integer var45 = Statics.field221.method73(var9[var7]);
                    if (var45 == null) {
                        field977[++Statics.field320 - 1] = -1;
                    } else {
                        field977[++Statics.field320 - 1] = var45;
                    }
                } else if (var57 == 76) {
                    Integer var46 = Statics.field255.method5453(var9[var7]);
                    if (var46 == null) {
                        field977[++Statics.field320 - 1] = -1;
                    } else {
                        field977[++Statics.field320 - 1] = var46;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var55) {
            var11 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(var5.field3938).append(" ");
            for (int var51 = field980 - 1; var51 >= 0; var51--) {
                var50.append("").append(field981[var51].field614.field3938).append(" ");
            }
            var50.append("").append(var10);
            class406.method4407(var50.toString(), var55);
        } finally {
            if (field974) {
                field987 = true;
                client.method39();
                field987 = false;
                field974 = false;
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class406.method4407("Warning: Script " + var5.field1085 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("lo.f(ILcf;ZI)I")
    public static int method5155(int arg0, class87 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method4394(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method5143(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2384(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method336(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1818(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method2365(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3896(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method5127(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4608(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1902(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method185(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method5143(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2384(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method336(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1818(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method2365(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method2394(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method5732(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method1889(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method3752(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method185(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return Statics.method2248(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2723(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3012(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method2972(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method184(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method37(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method2974(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method5055(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method5163(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method1719(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method2964(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method181(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method56(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method141(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method2492(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2202(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method1709(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method4404(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method187(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method3904(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method1754(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method3898(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method60(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method265(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ix.y(ILcf;ZB)I")
    public static int method4394(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field320 -= 3;
            int var3 = field977[Statics.field320];
            int var4 = field977[Statics.field320 + 1];
            int var5 = field977[Statics.field320 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class247 var6 = class247.method3749(var3);
            if (var6.field3091 == null) {
                var6.field3091 = new class247[var5 + 1];
            }
            if (var6.field3091.length <= var5) {
                class247[] var7 = new class247[var5 + 1];
                for (int var8 = 0; var8 < var6.field3091.length; var8++) {
                    var7[var8] = var6.field3091[var8];
                }
                var6.field3091 = var7;
            }
            if (var5 > 0 && var6.field3091[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class247 var9 = new class247();
            var9.field2961 = var4;
            var9.field3010 = var9.field2959 = var6.field2959;
            var9.field2960 = var5;
            var9.field2958 = true;
            var6.field3091[var5] = var9;
            if (arg2) {
                Statics.field132 = var9;
            } else {
                Statics.field989 = var9;
            }
            client.method3353(var6);
            return 1;
        } else if (arg0 == 101) {
            class247 var10 = arg2 ? Statics.field132 : Statics.field989;
            class247 var11 = class247.method3749(var10.field2959);
            var11.field3091[var10.field2960] = null;
            client.method3353(var11);
            return 1;
        } else if (arg0 == 102) {
            class247 var12 = class247.method3749(field977[--Statics.field320]);
            var12.field3091 = null;
            client.method3353(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field320 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field320--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field320 -= 2;
            int var13 = field977[Statics.field320];
            int var14 = field977[Statics.field320 + 1];
            class247 var15 = class247.method4694(var13, var14);
            if (var15 == null || var14 == -1) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = 1;
                if (arg2) {
                    Statics.field132 = var15;
                } else {
                    Statics.field989 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class247 var16 = class247.method3749(field977[--Statics.field320]);
            if (var16 == null) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = 1;
                if (arg2) {
                    Statics.field132 = var16;
                } else {
                    Statics.field989 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field977[Statics.field320 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field977[--Statics.field320 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lr.p(ILcf;ZB)I")
    public static int method5143(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class247 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field977[--Statics.field320];
            var4 = class247.method3749(var3);
        } else {
            var4 = arg2 ? Statics.field132 : Statics.field989;
        }
        if (arg0 == 1000) {
            Statics.field320 -= 4;
            var4.field3017 = field977[Statics.field320];
            var4.field2969 = field977[Statics.field320 + 1];
            var4.field2964 = field977[Statics.field320 + 2];
            var4.field2965 = field977[Statics.field320 + 3];
            client.method3353(var4);
            Statics.field204.method1034(var4);
            if (var3 != -1 && var4.field2961 == 0) {
                client.method5145(Statics.field2951[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field320 -= 4;
            var4.field2970 = field977[Statics.field320];
            var4.field2971 = field977[Statics.field320 + 1];
            var4.field2966 = field977[Statics.field320 + 2];
            var4.field2967 = field977[Statics.field320 + 3];
            client.method3353(var4);
            Statics.field204.method1034(var4);
            if (var3 != -1 && var4.field2961 == 0) {
                client.method5145(Statics.field2951[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field977[--Statics.field320] == 1;
            if (var4.field2979 != var5) {
                var4.field2979 = var5;
                client.method3353(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3101 = field977[--Statics.field320] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3102 = field977[--Statics.field320] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.j(ILcf;ZI)I")
    public static int method2384(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class247 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field977[--Statics.field320];
            var4 = class247.method3749(var3);
        } else {
            var4 = arg2 ? Statics.field132 : Statics.field989;
        }
        if (arg0 == 1100) {
            Statics.field320 -= 2;
            var4.field2980 = field977[Statics.field320];
            if (var4.field2980 > var4.field3077 - var4.field2962) {
                var4.field2980 = var4.field3077 - var4.field2962;
            }
            if (var4.field2980 < 0) {
                var4.field2980 = 0;
            }
            var4.field2981 = field977[Statics.field320 + 1];
            if (var4.field2981 > var4.field2983 - var4.field2975) {
                var4.field2981 = var4.field2983 - var4.field2975;
            }
            if (var4.field2981 < 0) {
                var4.field2981 = 0;
            }
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3103 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2988 = field977[--Statics.field320] == 1;
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2990 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3020 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3037 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2996 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2997 = field977[--Statics.field320] == 1;
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3002 = 1;
            var4.field3003 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field320 -= 6;
            var4.field3008 = field977[Statics.field320];
            var4.field3009 = field977[Statics.field320 + 1];
            var4.field3000 = field977[Statics.field320 + 2];
            var4.field3011 = field977[Statics.field320 + 3];
            var4.field2995 = field977[Statics.field320 + 4];
            var4.field3063 = field977[Statics.field320 + 5];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field977[--Statics.field320];
            if (var4.field3006 != var5) {
                var4.field3006 = var5;
                var4.field2974 = 0;
                var4.field3090 = 0;
                client.method3353(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2946 = field977[--Statics.field320] == 1;
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field978[--Statics.field979];
            if (!var6.equals(var4.field2994)) {
                var4.field2994 = var6;
                client.method3353(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2963 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field320 -= 3;
            var4.field3081 = field977[Statics.field320];
            var4.field2976 = field977[Statics.field320 + 1];
            var4.field3038 = field977[Statics.field320 + 2];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3025 = field977[--Statics.field320] == 1;
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2998 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2999 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3043 = field977[--Statics.field320] == 1;
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3031 = field977[--Statics.field320] == 1;
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field320 -= 2;
            var4.field3077 = field977[Statics.field320];
            var4.field2983 = field977[Statics.field320 + 1];
            client.method3353(var4);
            if (var3 != -1 && var4.field2961 == 0) {
                client.method5145(Statics.field2951[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method172(var4.field2959, var4.field2960);
            client.field808 = var4;
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3094 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2985 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3012 = field977[--Statics.field320];
            client.method3353(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field977[--Statics.field320];
            class394 var8 = (class394) class289.method2163(class394.method3895(), var7);
            if (var8 != null) {
                var4.field2989 = var8;
                client.method3353(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field977[--Statics.field320] == 1;
            var4.field2993 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field977[--Statics.field320] == 1;
            var4.field3106 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field320 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.r(ILcf;ZI)I")
    public static int method336(int arg0, class87 arg1, boolean arg2) {
        class247 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class247.method3749(field977[--Statics.field320]);
        } else {
            var3 = arg2 ? Statics.field132 : Statics.field989;
        }
        client.method3353(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field320 -= 2;
            int var4 = field977[Statics.field320];
            int var5 = field977[Statics.field320 + 1];
            var3.field3087 = var4;
            var3.field3019 = var5;
            class155 var6 = class155.method4399(var4);
            var3.field3000 = var6.field1841;
            var3.field3011 = var6.field1822;
            var3.field2995 = var6.field1823;
            var3.field3008 = var6.field1824;
            var3.field3009 = var6.field1825;
            var3.field3063 = var6.field1821;
            if (arg0 == 1205) {
                var3.field3018 = 0;
            } else if (arg0 == 1212 | var6.field1813 == 1) {
                var3.field3018 = 1;
            } else {
                var3.field3018 = 2;
            }
            if (var3.field3014 > 0) {
                var3.field3063 = var3.field3063 * 32 / var3.field3014;
            } else if (var3.field2970 > 0) {
                var3.field3063 = var3.field3063 * 32 / var3.field2970;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3002 = 2;
            var3.field3003 = field977[--Statics.field320];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3002 = 3;
            var3.field3003 = Statics.field1163.field1194.method4256();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cs.b(ILcf;ZB)I")
    public static int method1818(int arg0, class87 arg1, boolean arg2) {
        boolean var3 = true;
        class247 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class247.method3749(field977[--Statics.field320]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field132 : Statics.field989;
        }
        if (arg0 == 1300) {
            int var5 = field977[--Statics.field320] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4301(var5, field978[--Statics.field979]);
                return 1;
            } else {
                Statics.field979--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field320 -= 2;
            int var6 = field977[Statics.field320];
            int var7 = field977[Statics.field320 + 1];
            var4.field3040 = class247.method4694(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2954 = field977[--Statics.field320] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3041 = field977[--Statics.field320];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3042 = field977[--Statics.field320];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2949 = field978[--Statics.field979];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2968 = field978[--Statics.field979];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2987 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3030 = field977[--Statics.field320] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field320--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field320 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field977[Statics.field320 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field977[Statics.field320 + var10];
                        var9[var10 / 2] = (byte) field977[Statics.field320 + var10 + 1];
                    }
                }
            } else {
                Statics.field320 -= 2;
                var8 = new byte[] { (byte) field977[Statics.field320] };
                var9 = new byte[] { (byte) field977[Statics.field320 + 1] };
            }
            int var11 = field977[--Statics.field320] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            Statics.method4387(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field320 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field977[Statics.field320] };
            byte[] var14 = new byte[] { (byte) field977[Statics.field320 + 1] };
            Statics.method4387(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field320 -= 3;
            int var15 = field977[Statics.field320] - 1;
            int var16 = field977[Statics.field320 + 1];
            int var17 = field977[Statics.field320 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method6479(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field977[--Statics.field320];
            int var20 = field977[--Statics.field320];
            method6479(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field320--;
            int var21 = field977[Statics.field320] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method174(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method174(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oy.s(Lio;IIIB)V")
    public static final void method6479(class247 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3036 == null) {
            throw new RuntimeException();
        }
        arg0.field3036[arg1] = arg2;
        arg0.field3080[arg1] = arg3;
    }

    @ObfuscatedName("h.u(Lio;IB)V")
    public static final void method174(class247 arg0, int arg1) {
        if (arg0.field3034 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3013 == null) {
            arg0.field3013 = new int[arg0.field3034.length];
        }
        arg0.field3013[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ed.l(ILcf;ZI)I")
    public static int method2365(int arg0, class87 arg1, boolean arg2) {
        class247 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class247.method3749(field977[--Statics.field320]);
        } else {
            var3 = arg2 ? Statics.field132 : Statics.field989;
        }
        String var4 = field978[--Statics.field979];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field977[--Statics.field320];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field977[--Statics.field320];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field978[--Statics.field979];
            } else {
                var7[var8] = Integer.valueOf(field977[--Statics.field320]);
            }
        }
        int var9 = field977[--Statics.field320];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2978 = var7;
        } else if (arg0 == 1401) {
            var3.field3050 = var7;
        } else if (arg0 == 1402) {
            var3.field3049 = var7;
        } else if (arg0 == 1403) {
            var3.field3071 = var7;
        } else if (arg0 == 1404) {
            var3.field3053 = var7;
        } else if (arg0 == 1405) {
            var3.field3054 = var7;
        } else if (arg0 == 1406) {
            var3.field3057 = var7;
        } else if (arg0 == 1407) {
            var3.field3058 = var7;
            var3.field3059 = var5;
        } else if (arg0 == 1408) {
            var3.field3026 = var7;
        } else if (arg0 == 1409) {
            var3.field3022 = var7;
        } else if (arg0 == 1410) {
            var3.field3055 = var7;
        } else if (arg0 == 1411) {
            var3.field3048 = var7;
        } else if (arg0 == 1412) {
            var3.field3052 = var7;
        } else if (arg0 == 1414) {
            var3.field3060 = var7;
            var3.field3024 = var5;
        } else if (arg0 == 1415) {
            var3.field3062 = var7;
            var3.field3007 = var5;
        } else if (arg0 == 1416) {
            var3.field3056 = var7;
        } else if (arg0 == 1417) {
            var3.field3066 = var7;
        } else if (arg0 == 1418) {
            var3.field3067 = var7;
        } else if (arg0 == 1419) {
            var3.field3068 = var7;
        } else if (arg0 == 1420) {
            var3.field3069 = var7;
        } else if (arg0 == 1421) {
            var3.field3070 = var7;
        } else if (arg0 == 1422) {
            var3.field3073 = var7;
        } else if (arg0 == 1423) {
            var3.field3074 = var7;
        } else if (arg0 == 1424) {
            var3.field3075 = var7;
        } else if (arg0 == 1425) {
            var3.field3095 = var7;
        } else if (arg0 == 1426) {
            var3.field3078 = var7;
        } else if (arg0 == 1427) {
            var3.field3076 = var7;
        } else if (arg0 == 1428) {
            var3.field3044 = var7;
        } else if (arg0 == 1429) {
            var3.field3072 = var7;
        } else {
            return 2;
        }
        var3.field3045 = true;
        return 1;
    }

    @ObfuscatedName("ga.o(ILcf;ZB)I")
    public static int method3896(int arg0, class87 arg1, boolean arg2) {
        class247 var3 = arg2 ? Statics.field132 : Statics.field989;
        if (arg0 == 1500) {
            field977[++Statics.field320 - 1] = var3.field2972;
            return 1;
        } else if (arg0 == 1501) {
            field977[++Statics.field320 - 1] = var3.field2973;
            return 1;
        } else if (arg0 == 1502) {
            field977[++Statics.field320 - 1] = var3.field2962;
            return 1;
        } else if (arg0 == 1503) {
            field977[++Statics.field320 - 1] = var3.field2975;
            return 1;
        } else if (arg0 == 1504) {
            field977[++Statics.field320 - 1] = var3.field2979 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field977[++Statics.field320 - 1] = var3.field3010;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kv.c(ILcf;ZI)I")
    public static int method5127(int arg0, class87 arg1, boolean arg2) {
        class247 var3 = arg2 ? Statics.field132 : Statics.field989;
        if (arg0 == 1600) {
            field977[++Statics.field320 - 1] = var3.field2980;
            return 1;
        } else if (arg0 == 1601) {
            field977[++Statics.field320 - 1] = var3.field2981;
            return 1;
        } else if (arg0 == 1602) {
            field978[++Statics.field979 - 1] = var3.field2994;
            return 1;
        } else if (arg0 == 1603) {
            field977[++Statics.field320 - 1] = var3.field3077;
            return 1;
        } else if (arg0 == 1604) {
            field977[++Statics.field320 - 1] = var3.field2983;
            return 1;
        } else if (arg0 == 1605) {
            field977[++Statics.field320 - 1] = var3.field3063;
            return 1;
        } else if (arg0 == 1606) {
            field977[++Statics.field320 - 1] = var3.field3000;
            return 1;
        } else if (arg0 == 1607) {
            field977[++Statics.field320 - 1] = var3.field2995;
            return 1;
        } else if (arg0 == 1608) {
            field977[++Statics.field320 - 1] = var3.field3011;
            return 1;
        } else if (arg0 == 1609) {
            field977[++Statics.field320 - 1] = var3.field2990;
            return 1;
        } else if (arg0 == 1610) {
            field977[++Statics.field320 - 1] = var3.field3012;
            return 1;
        } else if (arg0 == 1611) {
            field977[++Statics.field320 - 1] = var3.field3103;
            return 1;
        } else if (arg0 == 1612) {
            field977[++Statics.field320 - 1] = var3.field2985;
            return 1;
        } else if (arg0 == 1613) {
            field977[++Statics.field320 - 1] = var3.field2989.method227();
            return 1;
        } else if (arg0 == 1614) {
            field977[++Statics.field320 - 1] = var3.field3106 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field320++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jt.e(ILcf;ZI)I")
    public static int method4608(int arg0, class87 arg1, boolean arg2) {
        class247 var3 = arg2 ? Statics.field132 : Statics.field989;
        if (arg0 == 1700) {
            field977[++Statics.field320 - 1] = var3.field3087;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3087 == -1) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = var3.field3019;
            }
            return 1;
        } else if (arg0 == 1702) {
            field977[++Statics.field320 - 1] = var3.field2960;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cz.g(ILcf;ZB)I")
    public static int method1902(int arg0, class87 arg1, boolean arg2) {
        class247 var3 = arg2 ? Statics.field132 : Statics.field989;
        if (arg0 == 1800) {
            field977[++Statics.field320 - 1] = class248.method2072(client.method169(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field977[--Statics.field320];
            int var5 = var4 - 1;
            if (var3.field2987 == null || var5 >= var3.field2987.length || var3.field2987[var5] == null) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = var3.field2987[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2949 == null) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = var3.field2949;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.a(ILcf;ZI)I")
    public static int method185(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field988 >= 10) {
                throw new RuntimeException();
            }
            class247 var8;
            if (arg0 >= 2000) {
                var8 = class247.method3749(field977[--Statics.field320]);
            } else {
                var8 = arg2 ? Statics.field132 : Statics.field989;
            }
            if (var8.field3076 == null) {
                return 0;
            }
            class96 var9 = new class96();
            var9.field1173 = var8;
            var9.field1178 = var8.field3076;
            var9.field1181 = field988 + 1;
            client.field801.method4709(var9);
            return 1;
        } else if (arg0 == 1928) {
            class247 var3 = arg2 ? Statics.field132 : Statics.field989;
            int var4 = field977[--Statics.field320];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            client.method5900(var4, var3.field2959, var3.field2960, var3.field3087, "");
            return 1;
        } else if (arg0 == 2928) {
            Statics.field320 -= 3;
            int var5 = field977[Statics.field320];
            int var6 = field977[Statics.field320 + 1];
            int var7 = field977[Statics.field320 + 2];
            if (var7 < 1 || var7 > 10) {
                throw new RuntimeException();
            }
            client.method5900(var7, var5, var6, class247.method3749(var5).field3087, "");
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ex.k(ILcf;ZI)I")
    public static int method2394(int arg0, class87 arg1, boolean arg2) {
        class247 var3 = class247.method3749(field977[--Statics.field320]);
        if (arg0 == 2500) {
            field977[++Statics.field320 - 1] = var3.field2972;
            return 1;
        } else if (arg0 == 2501) {
            field977[++Statics.field320 - 1] = var3.field2973;
            return 1;
        } else if (arg0 == 2502) {
            field977[++Statics.field320 - 1] = var3.field2962;
            return 1;
        } else if (arg0 == 2503) {
            field977[++Statics.field320 - 1] = var3.field2975;
            return 1;
        } else if (arg0 == 2504) {
            field977[++Statics.field320 - 1] = var3.field2979 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field977[++Statics.field320 - 1] = var3.field3010;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mv.m(ILcf;ZI)I")
    public static int method5732(int arg0, class87 arg1, boolean arg2) {
        class247 var3 = class247.method3749(field977[--Statics.field320]);
        if (arg0 == 2600) {
            field977[++Statics.field320 - 1] = var3.field2980;
            return 1;
        } else if (arg0 == 2601) {
            field977[++Statics.field320 - 1] = var3.field2981;
            return 1;
        } else if (arg0 == 2602) {
            field978[++Statics.field979 - 1] = var3.field2994;
            return 1;
        } else if (arg0 == 2603) {
            field977[++Statics.field320 - 1] = var3.field3077;
            return 1;
        } else if (arg0 == 2604) {
            field977[++Statics.field320 - 1] = var3.field2983;
            return 1;
        } else if (arg0 == 2605) {
            field977[++Statics.field320 - 1] = var3.field3063;
            return 1;
        } else if (arg0 == 2606) {
            field977[++Statics.field320 - 1] = var3.field3000;
            return 1;
        } else if (arg0 == 2607) {
            field977[++Statics.field320 - 1] = var3.field2995;
            return 1;
        } else if (arg0 == 2608) {
            field977[++Statics.field320 - 1] = var3.field3011;
            return 1;
        } else if (arg0 == 2609) {
            field977[++Statics.field320 - 1] = var3.field2990;
            return 1;
        } else if (arg0 == 2610) {
            field977[++Statics.field320 - 1] = var3.field3012;
            return 1;
        } else if (arg0 == 2611) {
            field977[++Statics.field320 - 1] = var3.field3103;
            return 1;
        } else if (arg0 == 2612) {
            field977[++Statics.field320 - 1] = var3.field2985;
            return 1;
        } else if (arg0 == 2613) {
            field977[++Statics.field320 - 1] = var3.field2989.method227();
            return 1;
        } else if (arg0 == 2614) {
            field977[++Statics.field320 - 1] = var3.field3106 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field320++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.x(ILcf;ZI)I")
    public static int method1889(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class247 var3 = class247.method3749(field977[--Statics.field320]);
            field977[++Statics.field320 - 1] = var3.field3087;
            return 1;
        } else if (arg0 == 2701) {
            class247 var4 = class247.method3749(field977[--Statics.field320]);
            if (var4.field3087 == -1) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = var4.field3019;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field977[--Statics.field320];
            class95 var6 = (class95) client.field803.method5766((long) var5);
            if (var6 == null) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field977[++Statics.field320 - 1] = client.field637;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gn.z(ILcf;ZI)I")
    public static int method3752(int arg0, class87 arg1, boolean arg2) {
        class247 var3 = class247.method3749(field977[--Statics.field320]);
        if (arg0 == 2800) {
            field977[++Statics.field320 - 1] = class248.method2072(client.method169(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field977[--Statics.field320];
            int var5 = var4 - 1;
            if (var3.field2987 == null || var5 >= var3.field2987.length || var3.field2987[var5] == null) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = var3.field2987[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2949 == null) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = var3.field2949;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eg.t(ILcf;ZI)I")
    public static int method2723(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field320 -= 3;
            client.method5381(field977[Statics.field320], field977[Statics.field320 + 1], field977[Statics.field320 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method190(field977[--Statics.field320]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field320 -= 2;
            client.method4603(field977[Statics.field320], field977[Statics.field320 + 1]);
            return 1;
        } else if (arg0 == 3203) {
            int var3 = Math.min(Math.max(field977[--Statics.field320], 0), 100);
            client.method2184(Math.round((float) var3 * 2.55F));
            return 1;
        } else if (arg0 == 3204) {
            field977[++Statics.field320 - 1] = Math.round((float) Statics.field1804.field1332 / 2.55F);
            return 1;
        } else if (arg0 == 3205) {
            int var4 = Math.min(Math.max(field977[--Statics.field320], 0), 100);
            client.method2975(Math.round((float) var4 * 1.27F));
            return 1;
        } else if (arg0 == 3206) {
            field977[++Statics.field320 - 1] = Math.round((float) Statics.field1804.field1331 / 1.27F);
            return 1;
        } else if (arg0 == 3207) {
            int var5 = Math.min(Math.max(field977[--Statics.field320], 0), 100);
            client.method3981(Math.round((float) var5 * 1.27F));
            return 1;
        } else if (arg0 == 3208) {
            field977[++Statics.field320 - 1] = Math.round((float) Statics.field1804.field1325 / 1.27F);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fb.h(ILcf;ZI)I")
    public static int method3012(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field977[++Statics.field320 - 1] = client.field650;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field320 -= 2;
            int var3 = field977[Statics.field320];
            int var4 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = class93.method439(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field320 -= 2;
            int var5 = field977[Statics.field320];
            int var6 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = class93.method168(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field320 -= 2;
            int var7 = field977[Statics.field320];
            int var8 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = class93.method2034(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class137.method1014(var9).field1542;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.field774[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.field775[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.field776[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field196;
            int var14 = (Statics.field1163.field1238 >> 7) + Statics.field2512;
            int var15 = (Statics.field1163.field1237 >> 7) + Statics.field458;
            field977[++Statics.field320 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field977[++Statics.field320 - 1] = client.field641 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field320 -= 2;
            int var19 = field977[Statics.field320] + 32768;
            int var20 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = class93.method439(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field320 -= 2;
            int var21 = field977[Statics.field320] + 32768;
            int var22 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = class93.method168(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field320 -= 2;
            int var23 = field977[Statics.field320] + 32768;
            int var24 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = class93.method2034(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field811 >= 2) {
                field977[++Statics.field320 - 1] = client.field811;
            } else {
                field977[++Statics.field320 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field977[++Statics.field320 - 1] = client.field657;
            return 1;
        } else if (arg0 == 3318) {
            field977[++Statics.field320 - 1] = client.field638;
            return 1;
        } else if (arg0 == 3321) {
            field977[++Statics.field320 - 1] = client.field899;
            return 1;
        } else if (arg0 == 3322) {
            field977[++Statics.field320 - 1] = client.field767;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field843) {
                field977[++Statics.field320 - 1] = 1;
            } else {
                field977[++Statics.field320 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field977[++Statics.field320 - 1] = client.field639;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field320 -= 4;
            int var25 = field977[Statics.field320];
            int var26 = field977[Statics.field320 + 1];
            int var27 = field977[Statics.field320 + 2];
            int var28 = field977[Statics.field320 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field977[++Statics.field320 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field977[++Statics.field320 - 1] = client.field652;
            return 1;
        } else if (arg0 == 3327) {
            field977[++Statics.field320 - 1] = client.field813;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fp.q(ILcf;ZI)I")
    public static int method2972(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field320 -= 2;
            int var3 = field977[Statics.field320];
            int var4 = field977[Statics.field320 + 1];
            class144 var5 = Statics.method1890(var3);
            if (var5.field1617 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1619; var6++) {
                if (var5.field1620[var6] == var4) {
                    field978[++Statics.field979 - 1] = var5.field1613[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field978[++Statics.field979 - 1] = var5.field1615;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field320 -= 4;
            int var7 = field977[Statics.field320];
            int var8 = field977[Statics.field320 + 1];
            int var9 = field977[Statics.field320 + 2];
            int var10 = field977[Statics.field320 + 3];
            class144 var11 = Statics.method1890(var9);
            if (var11.field1622 != var7 || var11.field1617 != var8) {
                if (var8 == 115) {
                    field978[++Statics.field979 - 1] = class268.field3242;
                } else {
                    field977[++Statics.field320 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1619; var12++) {
                if (var11.field1620[var12] == var10) {
                    if (var8 == 115) {
                        field978[++Statics.field979 - 1] = var11.field1613[var12];
                    } else {
                        field977[++Statics.field320 - 1] = var11.field1621[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field978[++Statics.field979 - 1] = var11.field1615;
                } else {
                    field977[++Statics.field320 - 1] = var11.field1618;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field977[--Statics.field320];
            class144 var14 = Statics.method1890(var13);
            field977[++Statics.field320 - 1] = var14.method2505();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.i(ILcf;ZB)I")
    public static int method184(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1508.field942 == 0) {
                field977[++Statics.field320 - 1] = -2;
            } else if (Statics.field1508.field942 == 1) {
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = Statics.field1508.field945.method5246();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field977[--Statics.field320];
            if (Statics.field1508.method1506() && var3 >= 0 && var3 < Statics.field1508.field945.method5246()) {
                class319 var4 = (class319) Statics.field1508.field945.method5256(var3);
                field978[++Statics.field979 - 1] = var4.method5227();
                field978[++Statics.field979 - 1] = var4.method5228();
            } else {
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field977[--Statics.field320];
            if (Statics.field1508.method1506() && var5 >= 0 && var5 < Statics.field1508.field945.method5246()) {
                field977[++Statics.field320 - 1] = ((class326) Statics.field1508.field945.method5256(var5)).field3853;
            } else {
                field977[++Statics.field320 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field977[--Statics.field320];
            if (Statics.field1508.method1506() && var6 >= 0 && var6 < Statics.field1508.field945.method5246()) {
                field977[++Statics.field320 - 1] = ((class326) Statics.field1508.field945.method5256(var6)).field3852;
            } else {
                field977[++Statics.field320 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field978[--Statics.field979];
            int var8 = field977[--Statics.field320];
            class77.method2555(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field978[--Statics.field979];
            Statics.field1508.method1539(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field978[--Statics.field979];
            Statics.field1508.method1517(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field978[--Statics.field979];
            Statics.field1508.method1505(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field978[--Statics.field979];
            Statics.field1508.method1518(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field978[--Statics.field979];
            String var14 = client.method147(var13);
            field977[++Statics.field320 - 1] = Statics.field1508.method1511(new class328(var14, Statics.field2039), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1987 == null) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = Statics.field1987.field3817;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1987 == null) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = Statics.field1987.method5246();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field977[--Statics.field320];
            if (Statics.field1987 == null || var15 >= Statics.field1987.method5246()) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = Statics.field1987.method5256(var15).method5229().method5338();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field977[--Statics.field320];
            if (Statics.field1987 == null || var16 >= Statics.field1987.method5246()) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = ((class326) Statics.field1987.method5256(var16)).method5330();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field977[--Statics.field320];
            if (Statics.field1987 == null || var17 >= Statics.field1987.method5246()) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = ((class326) Statics.field1987.method5256(var17)).field3852;
            }
            return 1;
        } else if (arg0 == 3616) {
            field977[++Statics.field320 - 1] = Statics.field1987 == null ? 0 : Statics.field1987.field3819;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field978[--Statics.field979];
            client.method2071(var18);
            return 1;
        } else if (arg0 == 3618) {
            field977[++Statics.field320 - 1] = Statics.field1987 == null ? 0 : Statics.field1987.field3820;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field978[--Statics.field979];
            client.method2550(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method547();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1508.method1506()) {
                field977[++Statics.field320 - 1] = Statics.field1508.field946.method5246();
            } else {
                field977[++Statics.field320 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field977[--Statics.field320];
            if (Statics.field1508.method1506() && var20 >= 0 && var20 < Statics.field1508.field946.method5246()) {
                class325 var21 = (class325) Statics.field1508.field946.method5256(var20);
                field978[++Statics.field979 - 1] = var21.method5227();
                field978[++Statics.field979 - 1] = var21.method5228();
            } else {
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field978[--Statics.field979];
            String var23 = client.method147(var22);
            field977[++Statics.field320 - 1] = Statics.field1508.method1512(new class328(var23, Statics.field2039)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field977[--Statics.field320];
            if (Statics.field1987 == null || var24 >= Statics.field1987.method5246() || !Statics.field1987.method5256(var24).method5229().equals(Statics.field1163.field1199)) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1987 == null || Statics.field1987.field3814 == null) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = Statics.field1987.field3814;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field977[--Statics.field320];
            if (Statics.field1987 == null || var25 >= Statics.field1987.method5246() || !((class321) Statics.field1987.method5256(var25)).method5217()) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field977[--Statics.field320];
            if (Statics.field1987 == null || var26 >= Statics.field1987.method5246() || !((class321) Statics.field1987.method5256(var26)).method5203()) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1508.field945.method5264();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class388(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class389(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class119(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class115(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class118(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class123(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class117(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class116(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class120(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class121(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1508.field945.method5298();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1508.field946.method5264();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field977[--Statics.field320] == 1;
            Statics.field1508.field946.method5304(new class388(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field977[--Statics.field320] == 1;
            Statics.field1508.field946.method5304(new class389(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1508.field946.method5298();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1987 != null) {
                Statics.field1987.method5264();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class388(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class389(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class119(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class115(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class118(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class123(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class117(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class116(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class120(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class121(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1987 != null) {
                Statics.field1987.method5298();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field977[--Statics.field320] == 1;
            Statics.field1508.field945.method5304(new class122(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field977[--Statics.field320] == 1;
            if (Statics.field1987 != null) {
                Statics.field1987.method5304(new class122(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.ae(ILcf;ZI)I")
    public static int method37(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field320--;
            Statics.field979--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field320++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fp.ap(ILcf;ZS)I")
    public static int method2974(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1634 == null) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = 1;
                Statics.field221 = Statics.field1634;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field977[--Statics.field320];
            if (client.field735[var3] == null) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = 1;
                Statics.field221 = client.field735[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field978[++Statics.field979 - 1] = Statics.field221.field96;
            return 1;
        } else if (arg0 == 3803) {
            field977[++Statics.field320 - 1] = Statics.field221.field98 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field977[++Statics.field320 - 1] = Statics.field221.field104;
            return 1;
        } else if (arg0 == 3805) {
            field977[++Statics.field320 - 1] = Statics.field221.field114;
            return 1;
        } else if (arg0 == 3806) {
            field977[++Statics.field320 - 1] = Statics.field221.field99;
            return 1;
        } else if (arg0 == 3807) {
            field977[++Statics.field320 - 1] = Statics.field221.field97;
            return 1;
        } else if (arg0 == 3809) {
            field977[++Statics.field320 - 1] = Statics.field221.field103;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field977[--Statics.field320];
            field978[++Statics.field979 - 1] = Statics.field221.field108[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = Statics.field221.field111[var5];
            return 1;
        } else if (arg0 == 3812) {
            field977[++Statics.field320 - 1] = Statics.field221.field112;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field977[--Statics.field320];
            field978[++Statics.field979 - 1] = Statics.field221.field91[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field320 -= 3;
            int var7 = field977[Statics.field320];
            int var8 = field977[Statics.field320 + 1];
            int var9 = field977[Statics.field320 + 2];
            field977[++Statics.field320 - 1] = Statics.field221.method72(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field977[++Statics.field320 - 1] = Statics.field221.field101;
            return 1;
        } else if (arg0 == 3816) {
            field977[++Statics.field320 - 1] = Statics.field221.field100;
            return 1;
        } else if (arg0 == 3817) {
            field977[++Statics.field320 - 1] = Statics.field221.method71(field978[--Statics.field979]);
            return 1;
        } else if (arg0 == 3818) {
            field977[Statics.field320 - 1] = Statics.field221.method74()[field977[Statics.field320 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field320 -= 2;
            int var10 = field977[Statics.field320];
            int var11 = field977[Statics.field320 + 1];
            client.method5060(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = Statics.field221.field102[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field320 -= 3;
                int var13 = field977[Statics.field320];
                boolean var14 = field977[Statics.field320 + 1] == 1;
                int var15 = field977[Statics.field320 + 2];
                client.method156(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field977[--Statics.field320];
                field977[++Statics.field320 - 1] = Statics.field221.field109[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field631 == null) {
                    field977[++Statics.field320 - 1] = 0;
                } else {
                    field977[++Statics.field320 - 1] = 1;
                    Statics.field1148 = Statics.field631;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field977[--Statics.field320];
                if (client.field872[var17] == null) {
                    field977[++Statics.field320 - 1] = 0;
                } else {
                    field977[++Statics.field320 - 1] = 1;
                    Statics.field1148 = client.field872[var17];
                    Statics.field983 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field978[++Statics.field979 - 1] = Statics.field1148.field32;
                return 1;
            } else if (arg0 == 3853) {
                field977[++Statics.field320 - 1] = Statics.field1148.field27;
                return 1;
            } else if (arg0 == 3854) {
                field977[++Statics.field320 - 1] = Statics.field1148.field33;
                return 1;
            } else if (arg0 == 3855) {
                field977[++Statics.field320 - 1] = Statics.field1148.method23();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field977[--Statics.field320];
                field978[++Statics.field979 - 1] = ((class10) Statics.field1148.field29.get(var18)).field85;
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field977[--Statics.field320];
                field977[++Statics.field320 - 1] = ((class10) Statics.field1148.field29.get(var19)).field84;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field977[--Statics.field320];
                field977[++Statics.field320 - 1] = ((class10) Statics.field1148.field29.get(var20)).field80;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field977[--Statics.field320];
                client.method7(Statics.field983, var21);
                return 1;
            } else if (arg0 == 3860) {
                field977[++Statics.field320 - 1] = Statics.field1148.method26(field978[--Statics.field979]);
                return 1;
            } else if (arg0 == 3861) {
                field977[Statics.field320 - 1] = Statics.field1148.method20()[field977[Statics.field320 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field977[++Statics.field320 - 1] = Statics.field255 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("kw.ab(ILcf;ZI)I")
    public static int method5055(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.field862[var3].method4635();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.field862[var4].field3655;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.field862[var5].field3659;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.field862[var6].field3657;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.field862[var7].field3654;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.field862[var8].field3658;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field977[--Statics.field320];
            int var10 = client.field862[var9].method4634();
            field977[++Statics.field320 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field977[--Statics.field320];
            int var12 = client.field862[var11].method4634();
            field977[++Statics.field320 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field977[--Statics.field320];
            int var14 = client.field862[var13].method4634();
            field977[++Statics.field320 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field977[--Statics.field320];
            int var16 = client.field862[var15].method4634();
            field977[++Statics.field320 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field977[--Statics.field320] == 1;
            if (Statics.field1463 != null) {
                Statics.field1463.method4584(class277.field3623, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field977[--Statics.field320] == 1;
            if (Statics.field1463 != null) {
                Statics.field1463.method4584(class277.field3620, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field320 -= 2;
            boolean var19 = field977[Statics.field320] == 1;
            boolean var20 = field977[Statics.field320 + 1] == 1;
            if (Statics.field1463 != null) {
                client.field879.field634 = var20;
                Statics.field1463.method4584(client.field879, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field977[--Statics.field320] == 1;
            if (Statics.field1463 != null) {
                Statics.field1463.method4584(class277.field3621, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field977[--Statics.field320] == 1;
            if (Statics.field1463 != null) {
                Statics.field1463.method4584(class277.field3625, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field977[++Statics.field320 - 1] = Statics.field1463 == null ? 0 : Statics.field1463.field3624.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field977[--Statics.field320];
            class283 var24 = (class283) Statics.field1463.field3624.get(var23);
            field977[++Statics.field320 - 1] = var24.field3650;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field977[--Statics.field320];
            class283 var26 = (class283) Statics.field1463.field3624.get(var25);
            field978[++Statics.field979 - 1] = var26.method4625();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field977[--Statics.field320];
            class283 var28 = (class283) Statics.field1463.field3624.get(var27);
            field978[++Statics.field979 - 1] = var28.method4630();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field977[--Statics.field320];
            class283 var30 = (class283) Statics.field1463.field3624.get(var29);
            long var31 = class380.method2744() - Statics.field3100 - var30.field3648;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field978[++Statics.field979 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field977[--Statics.field320];
            class283 var38 = (class283) Statics.field1463.field3624.get(var37);
            field977[++Statics.field320 - 1] = var38.field3649.field3657;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field977[--Statics.field320];
            class283 var40 = (class283) Statics.field1463.field3624.get(var39);
            field977[++Statics.field320 - 1] = var40.field3649.field3659;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field977[--Statics.field320];
            class283 var42 = (class283) Statics.field1463.field3624.get(var41);
            field977[++Statics.field320 - 1] = var42.field3649.field3655;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lb.al(ILcf;ZI)I")
    public static int method5163(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field320 -= 2;
            int var3 = field977[Statics.field320];
            int var4 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field320 -= 2;
            int var5 = field977[Statics.field320];
            int var6 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field320 -= 2;
            int var7 = field977[Statics.field320];
            int var8 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field320 -= 2;
            int var9 = field977[Statics.field320];
            int var10 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field320 -= 5;
            int var13 = field977[Statics.field320];
            int var14 = field977[Statics.field320 + 1];
            int var15 = field977[Statics.field320 + 2];
            int var16 = field977[Statics.field320 + 3];
            int var17 = field977[Statics.field320 + 4];
            field977[++Statics.field320 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field320 -= 2;
            int var18 = field977[Statics.field320];
            int var19 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field320 -= 2;
            int var20 = field977[Statics.field320];
            int var21 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field320 -= 2;
            int var22 = field977[Statics.field320];
            int var23 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field320 -= 2;
            int var24 = field977[Statics.field320];
            int var25 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field320 -= 2;
            int var26 = field977[Statics.field320];
            int var27 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field320 -= 2;
            int var28 = field977[Statics.field320];
            int var29 = field977[Statics.field320 + 1];
            if (var28 == 0) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field320 -= 2;
            int var30 = field977[Statics.field320];
            int var31 = field977[Statics.field320 + 1];
            if (var30 == 0) {
                field977[++Statics.field320 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field977[++Statics.field320 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field977[++Statics.field320 - 1] = var30;
                    break;
                case 2:
                    field977[++Statics.field320 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field977[++Statics.field320 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field977[++Statics.field320 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field977[++Statics.field320 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field320 -= 2;
            int var32 = field977[Statics.field320];
            int var33 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field320 -= 2;
            int var34 = field977[Statics.field320];
            int var35 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field320 -= 3;
            long var36 = (long) field977[Statics.field320];
            long var38 = (long) field977[Statics.field320 + 1];
            long var40 = (long) field977[Statics.field320 + 2];
            field977[++Statics.field320 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class231.method2908(field977[--Statics.field320]);
            field977[++Statics.field320 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field320 -= 2;
            int var43 = field977[Statics.field320];
            int var44 = field977[Statics.field320 + 1];
            field977[++Statics.field320 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field320 -= 3;
            int var45 = field977[Statics.field320];
            int var46 = field977[Statics.field320 + 1];
            int var47 = field977[Statics.field320 + 2];
            field977[++Statics.field320 - 1] = class231.method5480(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field320 -= 3;
            int var48 = field977[Statics.field320];
            int var49 = field977[Statics.field320 + 1];
            int var50 = field977[Statics.field320 + 2];
            field977[++Statics.field320 - 1] = class231.method1502(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field320 -= 3;
            int var51 = field977[Statics.field320];
            int var52 = field977[Statics.field320 + 1];
            int var53 = field977[Statics.field320 + 2];
            int var54 = 31 - var53;
            field977[++Statics.field320 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field320 -= 4;
            int var55 = field977[Statics.field320];
            int var56 = field977[Statics.field320 + 1];
            int var57 = field977[Statics.field320 + 2];
            int var58 = field977[Statics.field320 + 3];
            int var59 = class231.method1502(var55, var57, var58);
            int var60 = class231.method2944(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field977[++Statics.field320 - 1] = var59 | var56 << var57;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cv.ad(ILcf;ZI)I")
    public static int method1719(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field978[--Statics.field979];
            int var4 = field977[--Statics.field320];
            field978[++Statics.field979 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field979 -= 2;
            String var5 = field978[Statics.field979];
            String var6 = field978[Statics.field979 + 1];
            field978[++Statics.field979 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field978[--Statics.field979];
            int var8 = field977[--Statics.field320];
            field978[++Statics.field979 - 1] = var7 + class304.method1722(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field978[--Statics.field979];
            field978[++Statics.field979 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field977[--Statics.field320];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field982.setTime(new Date(var11));
            int var13 = field982.get(5);
            int var14 = field982.get(2);
            int var15 = field982.get(1);
            field978[++Statics.field979 - 1] = var13 + "-" + field985[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field979 -= 2;
            String var16 = field978[Statics.field979];
            String var17 = field978[Statics.field979 + 1];
            if (Statics.field1163.field1194 != null && Statics.field1163.field1194.field2931) {
                field978[++Statics.field979 - 1] = var17;
            } else {
                field978[++Statics.field979 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field977[--Statics.field320];
            field978[++Statics.field979 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field979 -= 2;
            field977[++Statics.field320 - 1] = Statics.method2256(class305.method4382(field978[Statics.field979], field978[Statics.field979 + 1], Statics.field4141));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field978[--Statics.field979];
            Statics.field320 -= 2;
            int var20 = field977[Statics.field320];
            int var21 = field977[Statics.field320 + 1];
            byte[] var22 = Statics.field547.method4468(var21, 0);
            class300 var23 = new class300(var22);
            field977[++Statics.field320 - 1] = var23.method4889(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field978[--Statics.field979];
            Statics.field320 -= 2;
            int var25 = field977[Statics.field320];
            int var26 = field977[Statics.field320 + 1];
            byte[] var27 = Statics.field547.method4468(var26, 0);
            class300 var28 = new class300(var27);
            field977[++Statics.field320 - 1] = var28.method4888(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field979 -= 2;
            String var29 = field978[Statics.field979];
            String var30 = field978[Statics.field979 + 1];
            if (field977[--Statics.field320] == 1) {
                field978[++Statics.field979 - 1] = var29;
            } else {
                field978[++Statics.field979 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field978[--Statics.field979];
            field978[++Statics.field979 - 1] = class301.method4890(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field978[--Statics.field979];
            int var33 = field977[--Statics.field320];
            field978[++Statics.field979 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class304.method4289((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class304.method1770((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class304.method2396((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class304.method2255((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field978[--Statics.field979];
            if (var38 == null) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field978[--Statics.field979];
            Statics.field320 -= 2;
            int var40 = field977[Statics.field320];
            int var41 = field977[Statics.field320 + 1];
            field978[++Statics.field979 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field978[--Statics.field979];
            StringBuilder var43 = new StringBuilder(var42.length());
            boolean var44 = false;
            for (int var45 = 0; var45 < var42.length(); var45++) {
                char var46 = var42.charAt(var45);
                if (var46 == '<') {
                    var44 = true;
                } else if (var46 == '>') {
                    var44 = false;
                } else if (!var44) {
                    var43.append(var46);
                }
            }
            field978[++Statics.field979 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field978[--Statics.field979];
            int var48 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field979 -= 2;
            String var49 = field978[Statics.field979];
            String var50 = field978[Statics.field979 + 1];
            int var51 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field978[--Statics.field979];
            field978[++Statics.field979 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fp.ai(ILcf;ZB)I")
    public static int method2964(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field977[--Statics.field320];
            field978[++Statics.field979 - 1] = class155.method4399(var3).field1815;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field320 -= 2;
            int var4 = field977[Statics.field320];
            int var5 = field977[Statics.field320 + 1];
            class155 var6 = class155.method4399(var4);
            if (var5 < 1 || var5 > 5 || var6.field1829[var5 - 1] == null) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = var6.field1829[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field320 -= 2;
            int var7 = field977[Statics.field320];
            int var8 = field977[Statics.field320 + 1];
            class155 var9 = class155.method4399(var7);
            if (var8 < 1 || var8 > 5 || var9.field1838[var8 - 1] == null) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = var9.field1838[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class155.method4399(var10).field1827;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class155.method4399(var11).field1813 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field977[--Statics.field320];
            class155 var13 = class155.method4399(var12);
            if (var13.field1851 == -1 && var13.field1806 >= 0) {
                field977[++Statics.field320 - 1] = var13.field1806;
            } else {
                field977[++Statics.field320 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field977[--Statics.field320];
            class155 var15 = class155.method4399(var14);
            if (var15.field1851 >= 0 && var15.field1806 >= 0) {
                field977[++Statics.field320 - 1] = var15.field1806;
            } else {
                field977[++Statics.field320 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class155.method4399(var16).field1828 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field977[--Statics.field320];
            class155 var18 = class155.method4399(var17);
            if (var18.field1859 == -1 && var18.field1858 >= 0) {
                field977[++Statics.field320 - 1] = var18.field1858;
            } else {
                field977[++Statics.field320 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field977[--Statics.field320];
            class155 var20 = class155.method4399(var19);
            if (var20.field1859 >= 0 && var20.field1858 >= 0) {
                field977[++Statics.field320 - 1] = var20.field1858;
            } else {
                field977[++Statics.field320 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field978[--Statics.field979];
            int var22 = field977[--Statics.field320];
            client.method2727(var21, var22 == 1);
            field977[++Statics.field320 - 1] = Statics.field117;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1533 == null || Statics.field305 >= Statics.field117) {
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = Statics.field1533[++Statics.field305 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field305 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.ar(ILcf;ZB)I")
    public static int method181(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field977[++Statics.field320 - 1] = client.field818;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field320 -= 3;
            client.field818 = field977[Statics.field320];
            Statics.field1179 = class334.method2280(field977[Statics.field320 + 1]);
            if (Statics.field1179 == null) {
                Statics.field1179 = class334.field3888;
            }
            client.field863 = field977[Statics.field320 + 2];
            class227 var3 = class227.method171(class225.field2612, client.field688.field1415);
            var3.field2693.method6043(client.field818);
            var3.field2693.method6043(Statics.field1179.field3891);
            var3.field2693.method6043(client.field863);
            client.field688.method2167(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field978[--Statics.field979];
            Statics.field320 -= 2;
            int var5 = field977[Statics.field320];
            int var6 = field977[Statics.field320 + 1];
            class227 var7 = class227.method171(class225.field2597, client.field688.field1415);
            var7.field2693.method6043(class383.method1863(var4) + 2);
            var7.field2693.method5955(var4);
            var7.field2693.method6043(var5 - 1);
            var7.field2693.method6043(var6);
            client.field688.method2167(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field320 -= 2;
            int var8 = field977[Statics.field320];
            int var9 = field977[Statics.field320 + 1];
            class73 var10 = class111.method67(var8, var9);
            if (var10 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = var10.field626;
                field977[++Statics.field320 - 1] = var10.field617;
                field978[++Statics.field979 - 1] = var10.field623 == null ? "" : var10.field623;
                field978[++Statics.field979 - 1] = var10.field619 == null ? "" : var10.field619;
                field978[++Statics.field979 - 1] = var10.field624 == null ? "" : var10.field624;
                field977[++Statics.field320 - 1] = var10.method986() ? 1 : (var10.method973() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field977[--Statics.field320];
            class73 var12 = class111.method2279(var11);
            if (var12 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = var12.field618;
                field977[++Statics.field320 - 1] = var12.field617;
                field978[++Statics.field979 - 1] = var12.field623 == null ? "" : var12.field623;
                field978[++Statics.field979 - 1] = var12.field619 == null ? "" : var12.field619;
                field978[++Statics.field979 - 1] = var12.field624 == null ? "" : var12.field624;
                field977[++Statics.field320 - 1] = var12.method986() ? 1 : (var12.method973() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1179 == null) {
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = Statics.field1179.field3891;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field978[--Statics.field979];
            int var14 = field977[--Statics.field320];
            class227 var15 = class404.method3295(var14, var13, Statics.field4141, -1);
            client.field688.method2167(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field979 -= 2;
            String var16 = field978[Statics.field979];
            String var17 = field978[Statics.field979 + 1];
            class227 var18 = class227.method171(class225.field2615, client.field688.field1415);
            var18.field2693.method6166(0);
            int var19 = var18.field2693.field4158;
            var18.field2693.method5955(var16);
            class250.method2637(var18.field2693, var17);
            var18.field2693.method5961(var18.field2693.field4158 - var19);
            client.field688.method2167(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field978[--Statics.field979];
            Statics.field320 -= 2;
            int var21 = field977[Statics.field320];
            int var22 = field977[Statics.field320 + 1];
            class227 var23 = class404.method3295(var21, var20, Statics.field4141, var22);
            client.field688.method2167(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field1163 == null || Statics.field1163.field1199 == null) {
                var24 = "";
            } else {
                var24 = Statics.field1163.field1199.method5338();
            }
            field978[++Statics.field979 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field977[++Statics.field320 - 1] = client.field863;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class111.method176(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class111.method151(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = class111.method5122(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field978[--Statics.field979];
            client.method4996(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field864 = field978[--Statics.field979].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field978[++Statics.field979 - 1] = client.field864;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field978[--Statics.field979];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field320--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field320++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field320 -= 2;
            int var30 = field977[Statics.field320];
            int var31 = field977[Statics.field320 + 1];
            class73 var32 = class111.method67(var30, var31);
            if (var32 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = var32.field626;
                field977[++Statics.field320 - 1] = var32.field617;
                field978[++Statics.field979 - 1] = var32.field623 == null ? "" : var32.field623;
                field978[++Statics.field979 - 1] = var32.field619 == null ? "" : var32.field619;
                field978[++Statics.field979 - 1] = var32.field624 == null ? "" : var32.field624;
                field977[++Statics.field320 - 1] = var32.method986() ? 1 : (var32.method973() ? 2 : 0);
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field977[--Statics.field320];
            class73 var34 = class111.method2279(var33);
            if (var34 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = var34.field618;
                field977[++Statics.field320 - 1] = var34.field617;
                field978[++Statics.field979 - 1] = var34.field623 == null ? "" : var34.field623;
                field978[++Statics.field979 - 1] = var34.field619 == null ? "" : var34.field619;
                field978[++Statics.field979 - 1] = var34.field624 == null ? "" : var34.field624;
                field977[++Statics.field320 - 1] = var34.method986() ? 1 : (var34.method973() ? 2 : 0);
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.ag(ILcf;ZI)I")
    public static int method56(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field977[++Statics.field320 - 1] = client.method2559();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field977[--Statics.field320];
            if (var3 == 1 || var3 == 2) {
                client.method2945(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field977[++Statics.field320 - 1] = Statics.field1804.field1329;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field977[--Statics.field320];
            if (var4 == 1 || var4 == 2) {
                Statics.field1804.field1329 = var4;
                class103.method2073();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field320--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field979 -= 2;
            Statics.field320--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field979--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.ax(ILcf;ZB)I")
    public static int method141(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field320 -= 2;
            int var3 = field977[Statics.field320];
            int var4 = field977[Statics.field320 + 1];
            if (!client.field762) {
                client.field711 = var3;
                client.field854 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field977[++Statics.field320 - 1] = client.field711;
            return 1;
        } else if (arg0 == 5506) {
            field977[++Statics.field320 - 1] = client.field854;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field977[--Statics.field320];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field821 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field977[++Statics.field320 - 1] = client.field821;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("et.as(ILcf;ZI)I")
    public static int method2492(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field691 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field979 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field977[++Statics.field320 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.aj(IS)I")
    public static int method337(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("dg.am(II)I")
    public static int method2249(int arg0) {
        return (int) ((Math.log((double) arg0) / field990 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("do.az(ILcf;ZI)I")
    public static int method2202(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field320 -= 2;
            client.field895 = (short) method337(field977[Statics.field320]);
            if (client.field895 <= 0) {
                client.field895 = 256;
            }
            client.field896 = (short) method337(field977[Statics.field320 + 1]);
            if (client.field896 <= 0) {
                client.field896 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field320 -= 2;
            client.field897 = (short) field977[Statics.field320];
            if (client.field897 <= 0) {
                client.field897 = 256;
            }
            client.field898 = (short) field977[Statics.field320 + 1];
            if (client.field898 <= 0) {
                client.field898 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field320 -= 4;
            client.field910 = (short) field977[Statics.field320];
            if (client.field910 <= 0) {
                client.field910 = 1;
            }
            client.field829 = (short) field977[Statics.field320 + 1];
            if (client.field829 <= 0) {
                client.field829 = 32767;
            } else if (client.field829 < client.field910) {
                client.field829 = client.field910;
            }
            client.field901 = (short) field977[Statics.field320 + 2];
            if (client.field901 <= 0) {
                client.field901 = 1;
            }
            client.field902 = (short) field977[Statics.field320 + 3];
            if (client.field902 <= 0) {
                client.field902 = 32767;
            } else if (client.field902 < client.field901) {
                client.field902 = client.field901;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field839 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = -1;
            } else {
                client.method2193(0, 0, client.field839.field2962, client.field839.field2975, false);
                field977[++Statics.field320 - 1] = client.field905;
                field977[++Statics.field320 - 1] = client.field906;
            }
            return 1;
        } else if (arg0 == 6204) {
            field977[++Statics.field320 - 1] = client.field897;
            field977[++Statics.field320 - 1] = client.field898;
            return 1;
        } else if (arg0 == 6205) {
            field977[++Statics.field320 - 1] = method2249(client.field895);
            field977[++Statics.field320 - 1] = method2249(client.field896);
            return 1;
        } else if (arg0 == 6220) {
            field977[++Statics.field320 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field977[++Statics.field320 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field977[++Statics.field320 - 1] = Statics.field247;
            return 1;
        } else if (arg0 == 6223) {
            field977[++Statics.field320 - 1] = Statics.field603;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.av(ILcf;ZI)I")
    public static int method1709(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field977[++Statics.field320 - 1] = class76.method687() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class76 var3 = class76.method2572();
            if (var3 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
            } else {
                field977[++Statics.field320 - 1] = var3.field938;
                field977[++Statics.field320 - 1] = var3.field934;
                field978[++Statics.field979 - 1] = var3.field933;
                field977[++Statics.field320 - 1] = var3.field924;
                field977[++Statics.field320 - 1] = var3.field926;
                field978[++Statics.field979 - 1] = var3.field929;
            }
            return 1;
        } else if (arg0 == 6502) {
            class76 var4 = class76.method1715();
            if (var4 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
            } else {
                field977[++Statics.field320 - 1] = var4.field938;
                field977[++Statics.field320 - 1] = var4.field934;
                field978[++Statics.field979 - 1] = var4.field933;
                field977[++Statics.field320 - 1] = var4.field924;
                field977[++Statics.field320 - 1] = var4.field926;
                field978[++Statics.field979 - 1] = var4.field929;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field977[--Statics.field320];
            class76 var6 = null;
            for (int var7 = 0; var7 < class76.field925; var7++) {
                if (Statics.field1133[var7].field938 == var5) {
                    var6 = Statics.field1133[var7];
                    break;
                }
            }
            if (var6 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
            } else {
                field977[++Statics.field320 - 1] = var6.field938;
                field977[++Statics.field320 - 1] = var6.field934;
                field978[++Statics.field979 - 1] = var6.field933;
                field977[++Statics.field320 - 1] = var6.field924;
                field977[++Statics.field320 - 1] = var6.field926;
                field978[++Statics.field979 - 1] = var6.field929;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field320 -= 4;
            int var8 = field977[Statics.field320];
            boolean var9 = field977[Statics.field320 + 1] == 1;
            int var10 = field977[Statics.field320 + 2];
            boolean var11 = field977[Statics.field320 + 3] == 1;
            class76.method4385(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field977[--Statics.field320];
            if (var12 >= 0 && var12 < class76.field925) {
                class76 var13 = Statics.field1133[var12];
                field977[++Statics.field320 - 1] = var13.field938;
                field977[++Statics.field320 - 1] = var13.field934;
                field978[++Statics.field979 - 1] = var13.field933;
                field977[++Statics.field320 - 1] = var13.field924;
                field977[++Statics.field320 - 1] = var13.field926;
                field978[++Statics.field979 - 1] = var13.field929;
            } else {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
                field977[++Statics.field320 - 1] = 0;
                field977[++Statics.field320 - 1] = 0;
                field978[++Statics.field979 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field649 = field977[--Statics.field320] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field320 -= 2;
            int var14 = field977[Statics.field320];
            int var15 = field977[Statics.field320 + 1];
            class151 var16 = class151.method2140(var15);
            if (var16.method2623()) {
                field978[++Statics.field979 - 1] = class146.method2653(var14).method2535(var15, var16.field1710);
            } else {
                field977[++Statics.field320 - 1] = class146.method2653(var14).method2534(var15, var16.field1713);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field320 -= 2;
            int var17 = field977[Statics.field320];
            int var18 = field977[Statics.field320 + 1];
            class151 var19 = class151.method2140(var18);
            if (var19.method2623()) {
                field978[++Statics.field979 - 1] = class154.method175(var17).method2722(var18, var19.field1710);
            } else {
                field977[++Statics.field320 - 1] = class154.method175(var17).method2716(var18, var19.field1713);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field320 -= 2;
            int var20 = field977[Statics.field320];
            int var21 = field977[Statics.field320 + 1];
            class151 var22 = class151.method2140(var21);
            if (var22.method2623()) {
                field978[++Statics.field979 - 1] = class155.method4399(var20).method2792(var21, var22.field1710);
            } else {
                field977[++Statics.field320 - 1] = class155.method4399(var20).method2780(var21, var22.field1713);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field320 -= 2;
            int var23 = field977[Statics.field320];
            int var24 = field977[Statics.field320 + 1];
            class151 var25 = class151.method2140(var24);
            if (var25.method2623()) {
                field978[++Statics.field979 - 1] = class152.method1871(var23).method2645(var24, var25.field1710);
            } else {
                field977[++Statics.field320 - 1] = class152.method1871(var23).method2644(var24, var25.field1713);
            }
            return 1;
        } else if (arg0 == 6518) {
            field977[++Statics.field320 - 1] = client.field824 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field977[++Statics.field320 - 1] = client.field643 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field979--;
            Statics.field320--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field979--;
            Statics.field320--;
            return 1;
        } else if (arg0 == 6524) {
            field977[++Statics.field320 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field977[++Statics.field320 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field977[++Statics.field320 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field977[++Statics.field320 - 1] = client.field644;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jk.ac(ILcf;ZB)I")
    public static int method4404(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field196;
            int var4 = (Statics.field1163.field1238 >> 7) + Statics.field2512;
            int var5 = (Statics.field1163.field1237 >> 7) + Statics.field458;
            client.method1995().method5544(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field977[--Statics.field320];
            String var7 = "";
            class166 var8 = client.method1995().method5562(var6);
            if (var8 != null) {
                var7 = var8.method3075();
            }
            field978[++Statics.field979 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field977[--Statics.field320];
            client.method1995().method5545(var9);
            return 1;
        } else if (arg0 == 6603) {
            field977[++Statics.field320 - 1] = client.method1995().method5559();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field977[--Statics.field320];
            client.method1995().method5556(var10);
            return 1;
        } else if (arg0 == 6605) {
            field977[++Statics.field320 - 1] = client.method1995().method5660() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class243 var11 = new class243(field977[--Statics.field320]);
            client.method1995().method5641(var11.field2926, var11.field2925);
            return 1;
        } else if (arg0 == 6607) {
            class243 var12 = new class243(field977[--Statics.field320]);
            client.method1995().method5564(var12.field2926, var12.field2925);
            return 1;
        } else if (arg0 == 6608) {
            class243 var13 = new class243(field977[--Statics.field320]);
            client.method1995().method5658(var13.field2924, var13.field2926, var13.field2925);
            return 1;
        } else if (arg0 == 6609) {
            class243 var14 = new class243(field977[--Statics.field320]);
            client.method1995().method5566(var14.field2924, var14.field2926, var14.field2925);
            return 1;
        } else if (arg0 == 6610) {
            field977[++Statics.field320 - 1] = client.method1995().method5567();
            field977[++Statics.field320 - 1] = client.method1995().method5681();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field977[--Statics.field320];
            class166 var16 = client.method1995().method5562(var15);
            if (var16 == null) {
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = var16.method3050().method4224();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field977[--Statics.field320];
            class166 var18 = client.method1995().method5562(var17);
            if (var18 == null) {
                field977[++Statics.field320 - 1] = 0;
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = (var18.method3079() - var18.method3032() + 1) * 64;
                field977[++Statics.field320 - 1] = (var18.method3058() - var18.method3034() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field977[--Statics.field320];
            class166 var20 = client.method1995().method5562(var19);
            if (var20 == null) {
                field977[++Statics.field320 - 1] = 0;
                field977[++Statics.field320 - 1] = 0;
                field977[++Statics.field320 - 1] = 0;
                field977[++Statics.field320 - 1] = 0;
            } else {
                field977[++Statics.field320 - 1] = var20.method3032() * 64;
                field977[++Statics.field320 - 1] = var20.method3034() * 64;
                field977[++Statics.field320 - 1] = var20.method3079() * 64 + 64 - 1;
                field977[++Statics.field320 - 1] = var20.method3058() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field977[--Statics.field320];
            class166 var22 = client.method1995().method5562(var21);
            if (var22 == null) {
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var22.method3031();
            }
            return 1;
        } else if (arg0 == 6615) {
            class243 var23 = client.method1995().method5613();
            if (var23 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var23.field2926;
                field977[++Statics.field320 - 1] = var23.field2925;
            }
            return 1;
        } else if (arg0 == 6616) {
            field977[++Statics.field320 - 1] = client.method1995().method5546();
            return 1;
        } else if (arg0 == 6617) {
            class243 var24 = new class243(field977[--Statics.field320]);
            class166 var25 = client.method1995().method5585();
            if (var25 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method3023(var24.field2924, var24.field2926, var24.field2925);
            if (var26 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var26[0];
                field977[++Statics.field320 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class243 var27 = new class243(field977[--Statics.field320]);
            class166 var28 = client.method1995().method5585();
            if (var28 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = -1;
                return 1;
            }
            class243 var29 = var28.method3055(var27.field2926, var27.field2925);
            if (var29 == null) {
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var29.method4224();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field320 -= 2;
            int var30 = field977[Statics.field320];
            class243 var31 = new class243(field977[Statics.field320 + 1]);
            method3568(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field320 -= 2;
            int var32 = field977[Statics.field320];
            class243 var33 = new class243(field977[Statics.field320 + 1]);
            method3568(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field320 -= 2;
            int var34 = field977[Statics.field320];
            class243 var35 = new class243(field977[Statics.field320 + 1]);
            class166 var36 = client.method1995().method5562(var34);
            if (var36 == null) {
                field977[++Statics.field320 - 1] = 0;
                return 1;
            } else {
                field977[++Statics.field320 - 1] = var36.method3044(var35.field2924, var35.field2926, var35.field2925) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field977[++Statics.field320 - 1] = client.method1995().method5569();
            field977[++Statics.field320 - 1] = client.method1995().method5570();
            return 1;
        } else if (arg0 == 6623) {
            class243 var37 = new class243(field977[--Statics.field320]);
            class166 var38 = client.method1995().method5543(var37.field2924, var37.field2926, var37.field2925);
            if (var38 == null) {
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var38.method3026();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1995().method5620(field977[--Statics.field320]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1995().method5539();
            return 1;
        } else if (arg0 == 6626) {
            client.method1995().method5573(field977[--Statics.field320]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1995().method5574();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field977[--Statics.field320] == 1;
            client.method1995().method5662(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field977[--Statics.field320];
            client.method1995().method5576(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field977[--Statics.field320];
            client.method1995().method5637(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1995().method5563();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field977[--Statics.field320] == 1;
            client.method1995().method5651(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field320 -= 2;
            int var43 = field977[Statics.field320];
            boolean var44 = field977[Statics.field320 + 1] == 1;
            client.method1995().method5580(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field320 -= 2;
            int var45 = field977[Statics.field320];
            boolean var46 = field977[Statics.field320 + 1] == 1;
            client.method1995().method5669(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field977[++Statics.field320 - 1] = client.method1995().method5578() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.method1995().method5583(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field977[--Statics.field320];
            field977[++Statics.field320 - 1] = client.method1995().method5584(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field320 -= 2;
            int var49 = field977[Statics.field320];
            class243 var50 = new class243(field977[Statics.field320 + 1]);
            class243 var51 = client.method1995().method5587(var49, var50);
            if (var51 == null) {
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var51.method4224();
            }
            return 1;
        } else if (arg0 == 6639) {
            class184 var52 = client.method1995().method5721();
            if (var52 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var52.method2989();
                field977[++Statics.field320 - 1] = var52.field2131.method4224();
            }
            return 1;
        } else if (arg0 == 6640) {
            class184 var53 = client.method1995().method5590();
            if (var53 == null) {
                field977[++Statics.field320 - 1] = -1;
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var53.method2989();
                field977[++Statics.field320 - 1] = var53.field2131.method4224();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field977[--Statics.field320];
            class139 var55 = class139.method52(var54);
            if (var55.field1557 == null) {
                field978[++Statics.field979 - 1] = "";
            } else {
                field978[++Statics.field979 - 1] = var55.field1557;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field977[--Statics.field320];
            class139 var57 = class139.method52(var56);
            field977[++Statics.field320 - 1] = var57.field1552;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field977[--Statics.field320];
            class139 var59 = class139.method52(var58);
            if (var59 == null) {
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var59.field1574;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field977[--Statics.field320];
            class139 var61 = class139.method52(var60);
            if (var61 == null) {
                field977[++Statics.field320 - 1] = -1;
            } else {
                field977[++Statics.field320 - 1] = var61.field1555;
            }
            return 1;
        } else if (arg0 == 6697) {
            field977[++Statics.field320 - 1] = Statics.field595.field2150;
            return 1;
        } else if (arg0 == 6698) {
            field977[++Statics.field320 - 1] = Statics.field595.field2149.method4224();
            return 1;
        } else if (arg0 == 6699) {
            field977[++Statics.field320 - 1] = Statics.field595.field2151.method4224();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.at(ILcf;ZI)I")
    public static int method187(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field320 -= 2;
            Statics.field979--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field320--;
            return 1;
        } else if (arg0 == 6750) {
            Statics.field979++;
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            Statics.field320++;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field977[--Statics.field320];
            class146 var4 = class146.method2653(var3);
            field978[++Statics.field979 - 1] = var4 == null ? "" : var4.field1636;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hf.ah(ILcf;ZI)I")
    public static int method3904(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6800) {
            Statics.field979++;
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            Statics.field320++;
            return 1;
        } else if (arg0 == 6850) {
            Statics.field979++;
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            Statics.field320++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ct.ao(ILcf;ZI)I")
    public static int method1754(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6900) {
            Statics.field979++;
            return 1;
        } else if (arg0 == 6950) {
            Statics.field320++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ga.aq(ILcf;ZI)I")
    public static int method3898(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field320 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field320 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field320 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field320 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field320--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field979--;
            Statics.field320--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field979--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field320 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field320--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field320--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.aw(ILcf;ZB)I")
    public static int method60(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field320++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field979 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field320++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field320++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field320++;
            return 1;
        } else if (arg0 == 7108) {
            field977[++Statics.field320 - 1] = client.method2990() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.af(ILcf;ZI)I")
    public static int method265(int arg0, class87 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field320 -= 5;
            field977[++Statics.field320 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field320 -= 6;
            field977[++Statics.field320 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field977[Statics.field320 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field320 -= 2;
            field977[++Statics.field320 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field320--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field320 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ge.ay(ILii;ZI)V")
    public static void method3568(int arg0, class243 arg1, boolean arg2) {
        class166 var3 = client.method1995().method5562(arg0);
        int var4 = Statics.field1163.field1214;
        int var5 = (Statics.field1163.field1238 >> 7) + Statics.field2512;
        int var6 = (Statics.field1163.field1237 >> 7) + Statics.field458;
        class243 var7 = new class243(var4, var5, var6);
        client.method1995().method5725(var3, var7, arg1, arg2);
    }
}
