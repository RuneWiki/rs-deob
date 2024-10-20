package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bs")
public class class64 {

    @ObfuscatedName("bs.w")
    public static int[] field832 = new int[5];

    @ObfuscatedName("bs.v")
    public static int[][] field838 = new int[5][5000];

    @ObfuscatedName("bs.a")
    public static int[] field844 = new int[1000];

    @ObfuscatedName("bs.u")
    public static String[] field841 = new String[1000];

    @ObfuscatedName("bs.q")
    public static int field842 = 0;

    @ObfuscatedName("bs.x")
    public static class57[] field843 = new class57[50];

    @ObfuscatedName("bs.f")
    public static Calendar field845 = Calendar.getInstance();

    @ObfuscatedName("bs.g")
    public static final String[] field846 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bs.k")
    public static boolean field847 = false;

    @ObfuscatedName("bs.b")
    public static boolean field849 = false;

    @ObfuscatedName("bs.z")
    public static ArrayList field833 = new ArrayList();

    @ObfuscatedName("bs.ap")
    public static int field850 = 0;

    @ObfuscatedName("bs.ar")
    public static final double field851 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.c(Lcg;B)V")
    public static void method2170(class81 arg0) {
        method9(arg0, 500000, 475000);
    }

    @ObfuscatedName("l.l(Lcg;III)V")
    public static void method9(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1047;
        class72 var5;
        if (class419.method6536(arg0.field1046)) {
            Statics.field98 = (class241) var3[0];
            class164 var4 = class164.method2597(Statics.field98.field2803);
            var5 = class72.method1799(arg0.field1046, var4.field1764, var4.field1783);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class72.method2195(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field848 = 0;
        Statics.field4182 = 0;
        int var7 = -1;
        int[] var8 = var5.field962;
        int[] var9 = var5.field964;
        byte var10 = -1;
        field842 = 0;
        field847 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field835 = new int[var5.field965];
            int var13 = 0;
            Statics.field836 = new String[var5.field972];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1045;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1050;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1044 == null ? -1 : arg0.field1044.field3265;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1053;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1044 == null ? -1 : arg0.field1044.field3257;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1048 == null ? -1 : arg0.field1048.field3265;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1048 == null ? -1 : arg0.field1048.field3257;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1049;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1052;
                    }
                    Statics.field835[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1051;
                    }
                    Statics.field836[var14++] = var17;
                }
            }
            field850 = arg0.field1042;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field964[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method106(var61, var5, var48);
                    switch(var49) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var61 == 0) {
                    field844[++Statics.field848 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field844[++Statics.field848 - 1] = class281.field3224[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class281.field3224[var19] = field844[--Statics.field848];
                    client.method5028(var19);
                } else if (var61 == 3) {
                    field841[++Statics.field4182 - 1] = var5.field973[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field848 -= 2;
                    if (field844[Statics.field848] != field844[Statics.field848 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field848 -= 2;
                    if (field844[Statics.field848] == field844[Statics.field848 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field848 -= 2;
                    if (field844[Statics.field848] < field844[Statics.field848 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field848 -= 2;
                    if (field844[Statics.field848] > field844[Statics.field848 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field842 == 0) {
                        return;
                    }
                    class57 var21 = field843[--field842];
                    var5 = var21.field465;
                    var8 = var5.field962;
                    var9 = var5.field964;
                    var7 = var21.field462;
                    Statics.field835 = var21.field463;
                    Statics.field836 = var21.field464;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field844[++Statics.field848 - 1] = class281.method6117(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class281.method739(var23, field844[--Statics.field848]);
                } else if (var61 == 31) {
                    Statics.field848 -= 2;
                    if (field844[Statics.field848] <= field844[Statics.field848 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field848 -= 2;
                    if (field844[Statics.field848] >= field844[Statics.field848 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field844[++Statics.field848 - 1] = Statics.field835[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field835[var9[var7]] = field844[--Statics.field848];
                } else if (var61 == 35) {
                    field841[++Statics.field4182 - 1] = Statics.field836[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field836[var9[var7]] = field841[--Statics.field4182];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field4182 -= var24;
                    String var25 = Statics.method2056(field841, Statics.field4182, var24);
                    field841[++Statics.field4182 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field848--;
                } else if (var61 == 39) {
                    Statics.field4182--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = class72.method2195(var26);
                    int[] var28 = new int[var27.field965];
                    String[] var29 = new String[var27.field972];
                    for (int var30 = 0; var30 < var27.field963; var30++) {
                        var28[var30] = field844[Statics.field848 - var27.field963 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field968; var31++) {
                        var29[var31] = field841[Statics.field4182 - var27.field968 + var31];
                    }
                    Statics.field848 -= var27.field963;
                    Statics.field4182 -= var27.field968;
                    class57 var32 = new class57();
                    var32.field465 = var5;
                    var32.field462 = var7;
                    var32.field463 = Statics.field835;
                    var32.field464 = Statics.field836;
                    field843[++field842 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field962;
                    var9 = var27.field964;
                    var7 = -1;
                    Statics.field835 = var28;
                    Statics.field836 = var29;
                } else if (var61 == 42) {
                    field844[++Statics.field848 - 1] = Statics.field1702.method2218(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field1702.method2202(var9[var7], field844[--Statics.field848]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field844[--Statics.field848];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field832[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field838[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field844[--Statics.field848];
                    if (var39 < 0 || var39 >= field832[var38]) {
                        throw new RuntimeException();
                    }
                    field844[++Statics.field848 - 1] = field838[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field848 -= 2;
                    int var41 = field844[Statics.field848];
                    if (var41 < 0 || var41 >= field832[var40]) {
                        throw new RuntimeException();
                    }
                    field838[var40][var41] = field844[Statics.field848 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field1702.method2207(var9[var7]);
                    if (var42 == null) {
                        var42 = class300.field3605;
                    }
                    field841[++Statics.field4182 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field1702.method2206(var9[var7], field841[--Statics.field4182]);
                } else if (var61 == 49) {
                    String var43 = Statics.field1702.method2205(var9[var7]);
                    field841[++Statics.field4182 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field1702.method2204(var9[var7], field841[--Statics.field4182]);
                } else if (var61 == 60) {
                    class401 var44 = var5.field969[var9[var7]];
                    class391 var45 = (class391) var44.method6448((long) field844[--Statics.field848]);
                    if (var45 != null) {
                        var7 += var45.field4299;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field2714.method2639(var9[var7]);
                    if (var46 == null) {
                        field844[++Statics.field848 - 1] = -1;
                    } else {
                        field844[++Statics.field848 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field2681.method6115(var9[var7]);
                    if (var47 == null) {
                        field844[++Statics.field848 - 1] = -1;
                    } else {
                        field844[++Statics.field848 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4301).append(" ");
            for (int var53 = field842 - 1; var53 >= 0; var53--) {
                var52.append("").append(field843[var53].field465.field4301).append(" ");
            }
            var52.append("").append(var10);
            class445.method3452(var52.toString(), var59);
        } finally {
            while (field833.size() > 0) {
                class93 var56 = (class93) field833.remove(0);
                client.method572(var56.method2159(), var56.method2157(), var56.method2158(), var56.method2165(), "");
            }
            if (field847) {
                field847 = false;
                Statics.method3936();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class445.method3452("Warning: Script " + var5.field961 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("u.s(ILbl;ZS)I")
    public static int method106(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2565(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method4306(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method5(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method285(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1951(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method5149(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method1005(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method360(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4827(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3974(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2605(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method4306(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method5(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method285(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1951(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method5149(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method288(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method1043(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method5697(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2614(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2605(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2510(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method1537(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method5210(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method3054(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method3569(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method2067(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method299(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method5166(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method2701(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method625(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3256(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method4939(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2604(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method4489(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3362(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method4284(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method199(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method2181(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return Statics.method2819(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method4352(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method5554(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method5739(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method4377(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method4730(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method2523(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method4752(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dw.e(ILbl;ZI)I")
    public static int method2565(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field848 -= 3;
            int var3 = field844[Statics.field848];
            int var4 = field844[Statics.field848 + 1];
            int var5 = field844[Statics.field848 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class286 var6 = class286.method2611(var3);
            if (var6.field3326 == null) {
                var6.field3326 = new class286[var5 + 1];
            }
            if (var6.field3326.length <= var5) {
                class286[] var7 = new class286[var5 + 1];
                for (int var8 = 0; var8 < var6.field3326.length; var8++) {
                    var7[var8] = var6.field3326[var8];
                }
                var6.field3326 = var7;
            }
            if (var5 > 0 && var6.field3326[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class286 var9 = new class286();
            var9.field3286 = var4;
            var9.field3320 = var9.field3265 = var6.field3265;
            var9.field3257 = var5;
            var9.field3391 = true;
            var6.field3326[var5] = var9;
            if (arg2) {
                Statics.field93 = var9;
            } else {
                Statics.field837 = var9;
            }
            client.method2435(var6);
            return 1;
        } else if (arg0 == 101) {
            class286 var10 = arg2 ? Statics.field93 : Statics.field837;
            class286 var11 = class286.method2611(var10.field3265);
            var11.field3326[var10.field3257] = null;
            client.method2435(var11);
            return 1;
        } else if (arg0 == 102) {
            class286 var12 = class286.method2611(field844[--Statics.field848]);
            var12.field3326 = null;
            client.method2435(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field848 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field848 -= 2;
            int var13 = field844[Statics.field848];
            int var14 = field844[Statics.field848 + 1];
            class286 var15 = Statics.method5251(var13, var14);
            if (var15 == null || var14 == -1) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = 1;
                if (arg2) {
                    Statics.field93 = var15;
                } else {
                    Statics.field837 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class286 var16 = class286.method2611(field844[--Statics.field848]);
            if (var16 == null) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = 1;
                if (arg2) {
                    Statics.field93 = var16;
                } else {
                    Statics.field837 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field844[Statics.field848 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field844[--Statics.field848 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hy.r(ILbl;ZI)I")
    public static int method4306(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class286 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field844[--Statics.field848];
            var4 = class286.method2611(var3);
        } else {
            var4 = arg2 ? Statics.field93 : Statics.field837;
        }
        if (arg0 == 1000) {
            Statics.field848 -= 4;
            var4.field3323 = field844[Statics.field848];
            var4.field3275 = field844[Statics.field848 + 1];
            var4.field3270 = field844[Statics.field848 + 2];
            var4.field3271 = field844[Statics.field848 + 3];
            client.method2435(var4);
            Statics.field4489.method1067(var4);
            if (var3 != -1 && var4.field3286 == 0) {
                client.method728(Statics.field3290[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field848 -= 4;
            var4.field3276 = field844[Statics.field848];
            var4.field3277 = field844[Statics.field848 + 1];
            var4.field3401 = field844[Statics.field848 + 2];
            var4.field3406 = field844[Statics.field848 + 3];
            client.method2435(var4);
            Statics.field4489.method1067(var4);
            if (var3 != -1 && var4.field3286 == 0) {
                client.method728(Statics.field3290[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field844[--Statics.field848] == 1;
            if (var4.field3360 != var5) {
                var4.field3360 = var5;
                client.method2435(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3409 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3287 = field844[--Statics.field848] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.o(ILbl;ZI)I")
    public static int method5(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class286 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field844[--Statics.field848];
            var4 = class286.method2611(var3);
        } else {
            var4 = arg2 ? Statics.field93 : Statics.field837;
        }
        if (arg0 == 1100) {
            Statics.field848 -= 2;
            var4.field3350 = field844[Statics.field848];
            if (var4.field3350 > var4.field3288 - var4.field3280) {
                var4.field3350 = var4.field3288 - var4.field3280;
            }
            if (var4.field3350 < 0) {
                var4.field3350 = 0;
            }
            var4.field3355 = field844[Statics.field848 + 1];
            if (var4.field3355 > var4.field3379 - var4.field3281) {
                var4.field3355 = var4.field3379 - var4.field3281;
            }
            if (var4.field3355 < 0) {
                var4.field3355 = 0;
            }
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3264 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3294 = field844[--Statics.field848] == 1;
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3278 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3298 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3300 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3302 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3325 = field844[--Statics.field848] == 1;
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3318 = 1;
            var4.field3309 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field848 -= 6;
            var4.field3314 = field844[Statics.field848];
            var4.field3315 = field844[Statics.field848 + 1];
            var4.field3316 = field844[Statics.field848 + 2];
            var4.field3256 = field844[Statics.field848 + 3];
            var4.field3338 = field844[Statics.field848 + 4];
            var4.field3319 = field844[Statics.field848 + 5];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field844[--Statics.field848];
            if (var4.field3312 != var5) {
                var4.field3312 = var5;
                var4.field3397 = 0;
                var4.field3387 = 0;
                client.method2435(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3266 = field844[--Statics.field848] == 1;
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field841[--Statics.field4182];
            if (!var6.equals(var4.field3296)) {
                var4.field3296 = var6;
                client.method2435(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3252 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field848 -= 3;
            var4.field3274 = field844[Statics.field848];
            var4.field3408 = field844[Statics.field848 + 1];
            var4.field3295 = field844[Statics.field848 + 2];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3331 = field844[--Statics.field848] == 1;
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3336 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3305 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3306 = field844[--Statics.field848] == 1;
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3307 = field844[--Statics.field848] == 1;
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field848 -= 2;
            var4.field3288 = field844[Statics.field848];
            var4.field3379 = field844[Statics.field848 + 1];
            client.method2435(var4);
            if (var3 != -1 && var4.field3286 == 0) {
                client.method728(Statics.field3290[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method5154(var4.field3265, var4.field3257);
            client.field526 = var4;
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3301 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3254 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3297 = field844[--Statics.field848];
            client.method2435(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field844[--Statics.field848];
            class432 var8 = (class432) class321.method2696(class432.method5969(), var7);
            if (var8 != null) {
                var4.field3328 = var8;
                client.method2435(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field844[--Statics.field848] == 1;
            var4.field3299 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field844[--Statics.field848] == 1;
            var4.field3273 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field848 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.i(ILbl;ZI)I")
    public static int method285(int arg0, class72 arg1, boolean arg2) {
        class286 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class286.method2611(field844[--Statics.field848]);
        } else {
            var3 = arg2 ? Statics.field93 : Statics.field837;
        }
        client.method2435(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field848 -= 2;
            int var4 = field844[Statics.field848];
            int var5 = field844[Statics.field848 + 1];
            var3.field3388 = var4;
            var3.field3396 = var5;
            class181 var6 = class181.method1538(var4);
            var3.field3316 = var6.field2034;
            var3.field3256 = var6.field2066;
            var3.field3338 = var6.field2036;
            var3.field3314 = var6.field2042;
            var3.field3315 = var6.field2038;
            var3.field3319 = var6.field2033;
            if (arg0 == 1205) {
                var3.field3324 = 0;
            } else if (arg0 == 1212 | var6.field2039 == 1) {
                var3.field3324 = 1;
            } else {
                var3.field3324 = 2;
            }
            if (var3.field3311 > 0) {
                var3.field3319 = var3.field3319 * 32 / var3.field3311;
            } else if (var3.field3276 > 0) {
                var3.field3319 = var3.field3319 * 32 / var3.field3276;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3318 = 2;
            var3.field3309 = field844[--Statics.field848];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3318 = 3;
            var3.field3309 = Statics.field2754.field1066.method4834();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.w(ILbl;ZI)I")
    public static int method1951(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class286 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class286.method2611(field844[--Statics.field848]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field93 : Statics.field837;
        }
        if (arg0 == 1300) {
            int var5 = field844[--Statics.field848] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4872(var5, field841[--Statics.field4182]);
                return 1;
            } else {
                Statics.field4182--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field848 -= 2;
            int var6 = field844[Statics.field848];
            int var7 = field844[Statics.field848 + 1];
            var4.field3346 = Statics.method5251(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3349 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3347 = field844[--Statics.field848];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3348 = field844[--Statics.field848];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3344 = field841[--Statics.field4182];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3303 = field841[--Statics.field4182];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3400 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3411 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field848 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field844[Statics.field848 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field844[Statics.field848 + var10];
                        var9[var10 / 2] = (byte) field844[Statics.field848 + var10 + 1];
                    }
                }
            } else {
                Statics.field848 -= 2;
                var8 = new byte[] { (byte) field844[Statics.field848] };
                var9 = new byte[] { (byte) field844[Statics.field848 + 1] };
            }
            int var11 = field844[--Statics.field848] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method4544(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field848 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field844[Statics.field848] };
            byte[] var14 = new byte[] { (byte) field844[Statics.field848 + 1] };
            method4544(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field848 -= 3;
            int var15 = field844[Statics.field848] - 1;
            int var16 = field844[Statics.field848 + 1];
            int var17 = field844[Statics.field848 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method104(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field844[--Statics.field848];
            int var20 = field844[--Statics.field848];
            method104(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field848--;
            int var21 = field844[Statics.field848] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method1900(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method1900(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jk.v(Ljz;I[B[BI)V")
    public static final void method4544(class286 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3340 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3340 = new byte[11][];
            arg0.field3398 = new byte[11][];
            arg0.field3342 = new int[11];
            arg0.field3343 = new int[11];
        }
        arg0.field3340[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3339 = false;
            for (int var4 = 0; var4 < arg0.field3340.length; var4++) {
                if (arg0.field3340[var4] != null) {
                    arg0.field3339 = true;
                    break;
                }
            }
        } else {
            arg0.field3339 = true;
        }
        arg0.field3398[arg1] = arg3;
    }

    @ObfuscatedName("u.a(Ljz;IIII)V")
    public static final void method104(class286 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3342 == null) {
            throw new RuntimeException();
        }
        arg0.field3342[arg1] = arg2;
        arg0.field3343[arg1] = arg3;
    }

    @ObfuscatedName("bc.y(Ljz;II)V")
    public static final void method1900(class286 arg0, int arg1) {
        if (arg0.field3340 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3255 == null) {
            arg0.field3255 = new int[arg0.field3340.length];
        }
        arg0.field3255[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("kd.u(ILbl;ZI)I")
    public static int method5149(int arg0, class72 arg1, boolean arg2) {
        class286 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class286.method2611(field844[--Statics.field848]);
        } else {
            var3 = arg2 ? Statics.field93 : Statics.field837;
        }
        String var4 = field841[--Statics.field4182];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field844[--Statics.field848];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field844[--Statics.field848];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field841[--Statics.field4182];
            } else {
                var7[var8] = Integer.valueOf(field844[--Statics.field848]);
            }
        }
        int var9 = field844[--Statics.field848];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3356 = var7;
        } else if (arg0 == 1401) {
            var3.field3308 = var7;
        } else if (arg0 == 1402) {
            var3.field3268 = var7;
        } else if (arg0 == 1403) {
            var3.field3357 = var7;
        } else if (arg0 == 1404) {
            var3.field3359 = var7;
        } else if (arg0 == 1405) {
            var3.field3380 = var7;
        } else if (arg0 == 1406) {
            var3.field3363 = var7;
        } else if (arg0 == 1407) {
            var3.field3364 = var7;
            var3.field3365 = var5;
        } else if (arg0 == 1408) {
            var3.field3370 = var7;
        } else if (arg0 == 1409) {
            var3.field3399 = var7;
        } else if (arg0 == 1410) {
            var3.field3361 = var7;
        } else if (arg0 == 1411) {
            var3.field3354 = var7;
        } else if (arg0 == 1412) {
            var3.field3358 = var7;
        } else if (arg0 == 1414) {
            var3.field3366 = var7;
            var3.field3367 = var5;
        } else if (arg0 == 1415) {
            var3.field3368 = var7;
            var3.field3395 = var5;
        } else if (arg0 == 1416) {
            var3.field3362 = var7;
        } else if (arg0 == 1417) {
            var3.field3372 = var7;
        } else if (arg0 == 1418) {
            var3.field3373 = var7;
        } else if (arg0 == 1419) {
            var3.field3374 = var7;
        } else if (arg0 == 1420) {
            var3.field3377 = var7;
        } else if (arg0 == 1421) {
            var3.field3378 = var7;
        } else if (arg0 == 1422) {
            var3.field3381 = var7;
        } else if (arg0 == 1423) {
            var3.field3382 = var7;
        } else if (arg0 == 1424) {
            var3.field3383 = var7;
        } else if (arg0 == 1425) {
            var3.field3341 = var7;
        } else if (arg0 == 1426) {
            var3.field3386 = var7;
        } else if (arg0 == 1427) {
            var3.field3293 = var7;
        } else if (arg0 == 1428) {
            var3.field3329 = var7;
        } else if (arg0 == 1429) {
            var3.field3272 = var7;
        } else if (arg0 == 1430) {
            var3.field3375 = var7;
        } else if (arg0 == 1431) {
            var3.field3322 = var7;
        } else {
            return 2;
        }
        var3.field3351 = true;
        return 1;
    }

    @ObfuscatedName("bx.h(ILbl;ZB)I")
    public static int method1005(int arg0, class72 arg1, boolean arg2) {
        class286 var3 = arg2 ? Statics.field93 : Statics.field837;
        if (arg0 == 1500) {
            field844[++Statics.field848 - 1] = var3.field3267;
            return 1;
        } else if (arg0 == 1501) {
            field844[++Statics.field848 - 1] = var3.field3279;
            return 1;
        } else if (arg0 == 1502) {
            field844[++Statics.field848 - 1] = var3.field3280;
            return 1;
        } else if (arg0 == 1503) {
            field844[++Statics.field848 - 1] = var3.field3281;
            return 1;
        } else if (arg0 == 1504) {
            field844[++Statics.field848 - 1] = var3.field3360 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field844[++Statics.field848 - 1] = var3.field3320;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.q(ILbl;ZI)I")
    public static int method360(int arg0, class72 arg1, boolean arg2) {
        class286 var3 = arg2 ? Statics.field93 : Statics.field837;
        if (arg0 == 1600) {
            field844[++Statics.field848 - 1] = var3.field3350;
            return 1;
        } else if (arg0 == 1601) {
            field844[++Statics.field848 - 1] = var3.field3355;
            return 1;
        } else if (arg0 == 1602) {
            field841[++Statics.field4182 - 1] = var3.field3296;
            return 1;
        } else if (arg0 == 1603) {
            field844[++Statics.field848 - 1] = var3.field3288;
            return 1;
        } else if (arg0 == 1604) {
            field844[++Statics.field848 - 1] = var3.field3379;
            return 1;
        } else if (arg0 == 1605) {
            field844[++Statics.field848 - 1] = var3.field3319;
            return 1;
        } else if (arg0 == 1606) {
            field844[++Statics.field848 - 1] = var3.field3316;
            return 1;
        } else if (arg0 == 1607) {
            field844[++Statics.field848 - 1] = var3.field3338;
            return 1;
        } else if (arg0 == 1608) {
            field844[++Statics.field848 - 1] = var3.field3256;
            return 1;
        } else if (arg0 == 1609) {
            field844[++Statics.field848 - 1] = var3.field3278;
            return 1;
        } else if (arg0 == 1610) {
            field844[++Statics.field848 - 1] = var3.field3297;
            return 1;
        } else if (arg0 == 1611) {
            field844[++Statics.field848 - 1] = var3.field3264;
            return 1;
        } else if (arg0 == 1612) {
            field844[++Statics.field848 - 1] = var3.field3254;
            return 1;
        } else if (arg0 == 1613) {
            field844[++Statics.field848 - 1] = var3.field3328.method38();
            return 1;
        } else if (arg0 == 1614) {
            field844[++Statics.field848 - 1] = var3.field3273 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field848++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jt.x(ILbl;ZI)I")
    public static int method4827(int arg0, class72 arg1, boolean arg2) {
        class286 var3 = arg2 ? Statics.field93 : Statics.field837;
        if (arg0 == 1700) {
            field844[++Statics.field848 - 1] = var3.field3388;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3388 == -1) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = var3.field3396;
            }
            return 1;
        } else if (arg0 == 1702) {
            field844[++Statics.field848 - 1] = var3.field3257;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hh.p(ILbl;ZB)I")
    public static int method3974(int arg0, class72 arg1, boolean arg2) {
        class286 var3 = arg2 ? Statics.field93 : Statics.field837;
        if (arg0 == 1800) {
            field844[++Statics.field848 - 1] = class287.method2632(client.method5247(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field844[--Statics.field848];
            int var5 = var4 - 1;
            if (var3.field3400 == null || var5 >= var3.field3400.length || var3.field3400[var5] == null) {
                field841[++Statics.field4182 - 1] = "";
            } else {
                field841[++Statics.field4182 - 1] = var3.field3400[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3344 == null) {
                field841[++Statics.field4182 - 1] = "";
            } else {
                field841[++Statics.field4182 - 1] = var3.field3344;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dc.n(ILbl;ZI)I")
    public static int method2605(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field850 >= 10) {
                throw new RuntimeException();
            }
            class286 var10;
            if (arg0 >= 2000) {
                var10 = class286.method2611(field844[--Statics.field848]);
            } else {
                var10 = arg2 ? Statics.field93 : Statics.field837;
            }
            if (var10.field3293 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1044 = var10;
            var11.field1047 = var10.field3293;
            var11.field1042 = field850 + 1;
            client.field708.method5264(var11);
            return 1;
        } else if (arg0 == 1928) {
            class286 var3 = arg2 ? Statics.field93 : Statics.field837;
            int var4 = field844[--Statics.field848];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class93 var5 = new class93(var4, var3.field3265, var3.field3257, var3.field3388);
            field833.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field848 -= 3;
            int var6 = field844[Statics.field848];
            int var7 = field844[Statics.field848 + 1];
            int var8 = field844[Statics.field848 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class93 var9 = new class93(var8, var6, var7, class286.method2611(var6).field3388);
            field833.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.m(ILbl;ZB)I")
    public static int method288(int arg0, class72 arg1, boolean arg2) {
        class286 var3 = class286.method2611(field844[--Statics.field848]);
        if (arg0 == 2500) {
            field844[++Statics.field848 - 1] = var3.field3267;
            return 1;
        } else if (arg0 == 2501) {
            field844[++Statics.field848 - 1] = var3.field3279;
            return 1;
        } else if (arg0 == 2502) {
            field844[++Statics.field848 - 1] = var3.field3280;
            return 1;
        } else if (arg0 == 2503) {
            field844[++Statics.field848 - 1] = var3.field3281;
            return 1;
        } else if (arg0 == 2504) {
            field844[++Statics.field848 - 1] = var3.field3360 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field844[++Statics.field848 - 1] = var3.field3320;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bm.d(ILbl;ZB)I")
    public static int method1043(int arg0, class72 arg1, boolean arg2) {
        class286 var3 = class286.method2611(field844[--Statics.field848]);
        if (arg0 == 2600) {
            field844[++Statics.field848 - 1] = var3.field3350;
            return 1;
        } else if (arg0 == 2601) {
            field844[++Statics.field848 - 1] = var3.field3355;
            return 1;
        } else if (arg0 == 2602) {
            field841[++Statics.field4182 - 1] = var3.field3296;
            return 1;
        } else if (arg0 == 2603) {
            field844[++Statics.field848 - 1] = var3.field3288;
            return 1;
        } else if (arg0 == 2604) {
            field844[++Statics.field848 - 1] = var3.field3379;
            return 1;
        } else if (arg0 == 2605) {
            field844[++Statics.field848 - 1] = var3.field3319;
            return 1;
        } else if (arg0 == 2606) {
            field844[++Statics.field848 - 1] = var3.field3316;
            return 1;
        } else if (arg0 == 2607) {
            field844[++Statics.field848 - 1] = var3.field3338;
            return 1;
        } else if (arg0 == 2608) {
            field844[++Statics.field848 - 1] = var3.field3256;
            return 1;
        } else if (arg0 == 2609) {
            field844[++Statics.field848 - 1] = var3.field3278;
            return 1;
        } else if (arg0 == 2610) {
            field844[++Statics.field848 - 1] = var3.field3297;
            return 1;
        } else if (arg0 == 2611) {
            field844[++Statics.field848 - 1] = var3.field3264;
            return 1;
        } else if (arg0 == 2612) {
            field844[++Statics.field848 - 1] = var3.field3254;
            return 1;
        } else if (arg0 == 2613) {
            field844[++Statics.field848 - 1] = var3.field3328.method38();
            return 1;
        } else if (arg0 == 2614) {
            field844[++Statics.field848 - 1] = var3.field3273 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field848++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mi.j(ILbl;ZI)I")
    public static int method5697(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class286 var3 = class286.method2611(field844[--Statics.field848]);
            field844[++Statics.field848 - 1] = var3.field3388;
            return 1;
        } else if (arg0 == 2701) {
            class286 var4 = class286.method2611(field844[--Statics.field848]);
            if (var4.field3388 == -1) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = var4.field3396;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field844[--Statics.field848];
            class80 var6 = (class80) client.field666.method6456((long) var5);
            if (var6 == null) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field844[++Statics.field848 - 1] = client.field725;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.f(ILbl;ZB)I")
    public static int method2614(int arg0, class72 arg1, boolean arg2) {
        class286 var3 = class286.method2611(field844[--Statics.field848]);
        if (arg0 == 2800) {
            field844[++Statics.field848 - 1] = class287.method2632(client.method5247(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field844[--Statics.field848];
            int var5 = var4 - 1;
            if (var3.field3400 == null || var5 >= var3.field3400.length || var3.field3400[var5] == null) {
                field841[++Statics.field4182 - 1] = "";
            } else {
                field841[++Statics.field4182 - 1] = var3.field3400[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3344 == null) {
                field841[++Statics.field4182 - 1] = "";
            } else {
                field841[++Statics.field4182 - 1] = var3.field3344;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dt.g(ILbl;ZI)I")
    public static int method2510(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field841[--Statics.field4182];
            class98.method2081(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field848 -= 2;
            client.method1978(Statics.field2754, field844[Statics.field848], field844[Statics.field848 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field849) {
                field847 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field841[--Statics.field4182];
            int var5 = 0;
            if (class336.method2516(var4)) {
                var5 = Statics.method2340(var4);
            }
            class257 var6 = class257.method2630(class255.field2894, client.field551.field1319);
            var6.field2960.method6650(var5);
            client.field551.method2268(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field841[--Statics.field4182];
            class257 var8 = class257.method2630(class255.field2895, client.field551.field1319);
            var8.field2960.method6644(var7.length() + 1);
            var8.field2960.method6654(var7);
            client.field551.method2268(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field841[--Statics.field4182];
            class257 var10 = class257.method2630(class255.field2854, client.field551.field1319);
            var10.field2960.method6644(var9.length() + 1);
            var10.field2960.method6654(var9);
            client.field551.method2268(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field844[--Statics.field848];
            String var12 = field841[--Statics.field4182];
            client.method3943(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field848 -= 3;
            int var13 = field844[Statics.field848];
            int var14 = field844[Statics.field848 + 1];
            int var15 = field844[Statics.field848 + 2];
            class286 var16 = class286.method2611(var15);
            client.method103(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field848 -= 2;
            int var17 = field844[Statics.field848];
            int var18 = field844[Statics.field848 + 1];
            class286 var19 = arg2 ? Statics.field93 : Statics.field837;
            client.method103(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field4238 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field844[++Statics.field848 - 1] = Statics.field4567.field1221 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field4567.field1221 = field844[--Statics.field848] == 1;
            class89.method450();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field841[--Statics.field4182];
            boolean var21 = field844[--Statics.field848] == 1;
            class30.method2812(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field844[--Statics.field848];
            class257 var23 = class257.method2630(class255.field2907, client.field551.field1319);
            var23.field2960.method6757(var22);
            client.field551.method2268(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field844[--Statics.field848];
            Statics.field4182 -= 2;
            String var25 = field841[Statics.field4182];
            String var26 = field841[Statics.field4182 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class257 var27 = class257.method2630(class255.field2880, client.field551.field1319);
                var27.field2960.method6757(1 + class421.method5127(var25) + class421.method5127(var26));
                var27.field2960.method6654(var26);
                var27.field2960.method6654(var25);
                var27.field2960.method6755(var24);
                client.field551.method2268(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field651 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field705 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field638 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field844[--Statics.field848] == 1) {
                client.field513 |= 0x1;
            } else {
                client.field513 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field844[--Statics.field848] == 1) {
                client.field513 |= 0x2;
            } else {
                client.field513 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field844[--Statics.field848] == 1) {
                client.field513 |= 0x4;
            } else {
                client.field513 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field844[--Statics.field848] == 1) {
                client.field513 |= 0x8;
            } else {
                client.field513 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field513 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field610 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field620 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method5025(field844[--Statics.field848] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field844[++Statics.field848 - 1] = client.method2596() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field848 -= 2;
            client.field781 = field844[Statics.field848];
            client.field571 = field844[Statics.field848 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field848 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 3132) {
            field844[++Statics.field848 - 1] = Statics.field3209;
            field844[++Statics.field848 - 1] = Statics.field1246;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field848 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field667 = 3;
            client.field668 = field844[--Statics.field848];
            return 1;
        } else if (arg0 == 3137) {
            client.field667 = 2;
            client.field668 = field844[--Statics.field848];
            return 1;
        } else if (arg0 == 3138) {
            client.field667 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field667 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field667 = 3;
            client.field668 = arg2 ? Statics.field93.field3265 : Statics.field837.field3265;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field844[--Statics.field848] == 1;
            Statics.field4567.field1227 = var28;
            class89.method450();
            return 1;
        } else if (arg0 == 3142) {
            field844[++Statics.field848 - 1] = Statics.field4567.field1227 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field844[--Statics.field848] == 1;
            client.field720 = var29;
            if (!var29) {
                Statics.field4567.field1226 = "";
                class89.method450();
            }
            return 1;
        } else if (arg0 == 3144) {
            field844[++Statics.field848 - 1] = client.field720 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field844[--Statics.field848] == 1;
            if (Statics.field4567.field1222 == var30) {
                Statics.field4567.field1222 = !var30;
                class89.method450();
            }
            return 1;
        } else if (arg0 == 3147) {
            field844[++Statics.field848 - 1] = Statics.field4567.field1222 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field844[++Statics.field848 - 1] = class69.field900;
            return 1;
        } else if (arg0 == 3154) {
            field844[++Statics.field848 - 1] = client.method2069();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field4182--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field848 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field848--;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field848--;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field4182--;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field848--;
            field841[++Statics.field4182 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field848--;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field848 -= 2;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field848 -= 2;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field848 -= 2;
            field841[++Statics.field4182 - 1] = "";
            field841[++Statics.field4182 - 1] = "";
            field841[++Statics.field4182 - 1] = "";
            field841[++Statics.field4182 - 1] = "";
            field841[++Statics.field4182 - 1] = "";
            field841[++Statics.field4182 - 1] = "";
            field841[++Statics.field4182 - 1] = "";
            field841[++Statics.field4182 - 1] = "";
            field841[++Statics.field4182 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field848--;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 3175) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field4182--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field4182--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field844[--Statics.field848], 0), 100);
            client.method6476((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field4567.field1228 - 0.5F) * 200.0F;
            field844[++Statics.field848 - 1] = 100 - Math.round(var32);
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 3187) {
            Statics.field4182 -= 2;
            return 1;
        } else if (arg0 == 3188) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.t(ILbl;ZB)I")
    public static int method1537(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field848 -= 3;
            client.method3166(field844[Statics.field848], field844[Statics.field848 + 1], field844[Statics.field848 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method4009(field844[--Statics.field848]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field848 -= 2;
            client.method3371(field844[Statics.field848], field844[Statics.field848 + 1]);
            return 1;
        } else if (arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            int var6 = 0;
            int var7 = field844[--Statics.field848];
            if (arg0 == 3209) {
                var6 = field844[--Statics.field848];
            } else if (arg0 == 3181) {
                var6 = 6;
            } else if (arg0 == 3203) {
                var6 = 7;
            } else if (arg0 == 3205) {
                var6 = 8;
            } else if (arg0 == 3207) {
                var6 = 9;
            }
            if (var6 == 6) {
                int var8 = 100 - Math.min(Math.max(var7, 0), 100);
                client.method6476((double) ((float) var8 / 200.0F + 0.5F));
            } else if (var6 == 7) {
                int var9 = Math.min(Math.max(var7, 0), 100);
                client.method295(Math.round((float) var9 * 2.55F));
            } else if (var6 == 8) {
                int var10 = Math.min(Math.max(var7, 0), 100);
                client.method613(Math.round((float) var10 * 1.27F));
            } else if (var6 == 9) {
                int var11 = Math.min(Math.max(var7, 0), 100);
                client.method2300(Math.round((float) var11 * 1.27F));
            }
            return 1;
        } else if (arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            int var3 = 0;
            int var4 = 0;
            if (arg0 == 3210) {
                var3 = field844[--Statics.field848];
            } else if (arg0 == 3182) {
                var3 = 6;
            } else if (arg0 == 3204) {
                var3 = 7;
            } else if (arg0 == 3206) {
                var3 = 8;
            } else if (arg0 == 3208) {
                var3 = 9;
            }
            if (var3 == 6) {
                float var5 = ((float) Statics.field4567.field1228 - 0.5F) * 200.0F;
                var4 = 100 - Math.round(var5);
            } else if (var3 == 7) {
                var4 = Math.round((float) Statics.field4567.field1229 / 2.55F);
            } else if (var3 == 8) {
                var4 = Math.round((float) Statics.field4567.field1230 / 1.27F);
            } else if (var3 == 9) {
                var4 = Math.round((float) Statics.field4567.field1231 / 1.27F);
            }
            field844[++Statics.field848 - 1] = var4;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lk.k(ILbl;ZI)I")
    public static int method5210(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field844[++Statics.field848 - 1] = client.field682;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field848 -= 2;
            int var3 = field844[Statics.field848];
            int var4 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = class78.method5652(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field848 -= 2;
            int var5 = field844[Statics.field848];
            int var6 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = class78.method5580(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field848 -= 2;
            int var7 = field844[Statics.field848];
            int var8 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = class78.method2699(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class162.method2377(var9).field1753;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = client.field637[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = client.field557[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = client.field639[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field325;
            int var14 = (Statics.field2754.field1161 >> 7) + Statics.field161;
            int var15 = (Statics.field2754.field1152 >> 7) + Statics.field1467;
            field844[++Statics.field848 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field844[++Statics.field848 - 1] = client.field669 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field848 -= 2;
            int var19 = field844[Statics.field848] + 32768;
            int var20 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = class78.method5652(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field848 -= 2;
            int var21 = field844[Statics.field848] + 32768;
            int var22 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = class78.method5580(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field848 -= 2;
            int var23 = field844[Statics.field848] + 32768;
            int var24 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = class78.method2699(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field674 >= 2) {
                field844[++Statics.field848 - 1] = client.field674;
            } else {
                field844[++Statics.field848 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field844[++Statics.field848 - 1] = client.field757;
            return 1;
        } else if (arg0 == 3318) {
            field844[++Statics.field848 - 1] = client.field496;
            return 1;
        } else if (arg0 == 3321) {
            field844[++Statics.field848 - 1] = client.field672;
            return 1;
        } else if (arg0 == 3322) {
            field844[++Statics.field848 - 1] = client.field673;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field676) {
                field844[++Statics.field848 - 1] = 1;
            } else {
                field844[++Statics.field848 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field844[++Statics.field848 - 1] = client.field770;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field848 -= 4;
            int var25 = field844[Statics.field848];
            int var26 = field844[Statics.field848 + 1];
            int var27 = field844[Statics.field848 + 2];
            int var28 = field844[Statics.field848 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field844[++Statics.field848 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field844[++Statics.field848 - 1] = client.field509;
            return 1;
        } else if (arg0 == 3327) {
            field844[++Statics.field848 - 1] = client.field510;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fl.b(ILbl;ZB)I")
    public static int method3054(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field848 -= 2;
            int var3 = field844[Statics.field848];
            int var4 = field844[Statics.field848 + 1];
            class169 var5 = class169.method5855(var3);
            if (var5.field1832 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1838; var6++) {
                if (var5.field1836[var6] == var4) {
                    field841[++Statics.field4182 - 1] = var5.field1829[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field841[++Statics.field4182 - 1] = var5.field1840;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field848 -= 4;
            int var7 = field844[Statics.field848];
            int var8 = field844[Statics.field848 + 1];
            int var9 = field844[Statics.field848 + 2];
            int var10 = field844[Statics.field848 + 3];
            class169 var11 = class169.method5855(var9);
            if (var11.field1831 != var7 || var11.field1832 != var8) {
                if (var8 == 115) {
                    field841[++Statics.field4182 - 1] = class300.field3605;
                } else {
                    field844[++Statics.field848 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1838; var12++) {
                if (var11.field1836[var12] == var10) {
                    if (var8 == 115) {
                        field841[++Statics.field4182 - 1] = var11.field1829[var12];
                    } else {
                        field844[++Statics.field848 - 1] = var11.field1837[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field841[++Statics.field4182 - 1] = var11.field1840;
                } else {
                    field844[++Statics.field848 - 1] = var11.field1834;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field844[--Statics.field848];
            class169 var14 = class169.method5855(var13);
            field844[++Statics.field848 - 1] = var14.method2948();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gs.z(ILbl;ZI)I")
    public static int method3569(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class24.method1985(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class24.method4794(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class24.method2733(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cq.ap(ILbl;ZI)I")
    public static int method2067(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1606.field811 == 0) {
                field844[++Statics.field848 - 1] = -2;
            } else if (Statics.field1606.field811 == 1) {
                field844[++Statics.field848 - 1] = -1;
            } else {
                field844[++Statics.field848 - 1] = Statics.field1606.field807.method5790();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field844[--Statics.field848];
            if (Statics.field1606.method1582() && var3 >= 0 && var3 < Statics.field1606.field807.method5790()) {
                class351 var4 = (class351) Statics.field1606.field807.method5845(var3);
                field841[++Statics.field4182 - 1] = var4.method5761();
                field841[++Statics.field4182 - 1] = var4.method5762();
            } else {
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field844[--Statics.field848];
            if (Statics.field1606.method1582() && var5 >= 0 && var5 < Statics.field1606.field807.method5790()) {
                field844[++Statics.field848 - 1] = ((class359) Statics.field1606.field807.method5845(var5)).field4172;
            } else {
                field844[++Statics.field848 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field844[--Statics.field848];
            if (Statics.field1606.method1582() && var6 >= 0 && var6 < Statics.field1606.field807.method5790()) {
                field844[++Statics.field848 - 1] = ((class359) Statics.field1606.field807.method5845(var6)).field4174;
            } else {
                field844[++Statics.field848 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field841[--Statics.field4182];
            int var8 = field844[--Statics.field848];
            class62.method154(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field841[--Statics.field4182];
            Statics.field1606.method1589(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field841[--Statics.field4182];
            Statics.field1606.method1593(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field841[--Statics.field4182];
            Statics.field1606.method1598(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field841[--Statics.field4182];
            Statics.field1606.method1594(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field841[--Statics.field4182];
            String var14 = client.method4849(var13);
            field844[++Statics.field848 - 1] = Statics.field1606.method1587(new class442(var14, Statics.field1786), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field888 == null) {
                field841[++Statics.field4182 - 1] = "";
            } else {
                field841[++Statics.field4182 - 1] = Statics.field888.field4140;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field888 == null) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = Statics.field888.method5790();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field844[--Statics.field848];
            if (Statics.field888 == null || var15 >= Statics.field888.method5790()) {
                field841[++Statics.field4182 - 1] = "";
            } else {
                field841[++Statics.field4182 - 1] = Statics.field888.method5845(var15).method5770().method7231();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field844[--Statics.field848];
            if (Statics.field888 == null || var16 >= Statics.field888.method5790()) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = ((class359) Statics.field888.method5845(var16)).method5867();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field844[--Statics.field848];
            if (Statics.field888 == null || var17 >= Statics.field888.method5790()) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = ((class359) Statics.field888.method5845(var17)).field4174;
            }
            return 1;
        } else if (arg0 == 3616) {
            field844[++Statics.field848 - 1] = Statics.field888 == null ? 0 : Statics.field888.field4143;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field841[--Statics.field4182];
            Statics.method5857(var18);
            return 1;
        } else if (arg0 == 3618) {
            field844[++Statics.field848 - 1] = Statics.field888 == null ? 0 : Statics.field888.field4147;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field841[--Statics.field4182];
            client.method6413(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method5551();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1606.method1582()) {
                field844[++Statics.field848 - 1] = Statics.field1606.field808.method5790();
            } else {
                field844[++Statics.field848 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field844[--Statics.field848];
            if (Statics.field1606.method1582() && var20 >= 0 && var20 < Statics.field1606.field808.method5790()) {
                class358 var21 = (class358) Statics.field1606.field808.method5845(var20);
                field841[++Statics.field4182 - 1] = var21.method5761();
                field841[++Statics.field4182 - 1] = var21.method5762();
            } else {
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field841[--Statics.field4182];
            String var23 = client.method4849(var22);
            field844[++Statics.field848 - 1] = Statics.field1606.method1588(new class442(var23, Statics.field1786)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field844[--Statics.field848];
            if (Statics.field888 == null || var24 >= Statics.field888.method5790() || !Statics.field888.method5845(var24).method5770().equals(Statics.field2754.field1073)) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field888 == null || Statics.field888.field4141 == null) {
                field841[++Statics.field4182 - 1] = "";
            } else {
                field841[++Statics.field4182 - 1] = Statics.field888.field4141;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field844[--Statics.field848];
            if (Statics.field888 == null || var25 >= Statics.field888.method5790() || !((class354) Statics.field888.method5845(var25)).method5747()) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field844[--Statics.field848];
            if (Statics.field888 == null || var26 >= Statics.field888.method5790() || !((class354) Statics.field888.method5845(var26)).method5746()) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1606.field807.method5803();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class426(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class427(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class106(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class102(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class105(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class110(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class104(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class103(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class107(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class108(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1606.field807.method5796();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1606.field808.method5803();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field844[--Statics.field848] == 1;
            Statics.field1606.field808.method5804(new class426(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field844[--Statics.field848] == 1;
            Statics.field1606.field808.method5804(new class427(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1606.field808.method5796();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field888 != null) {
                Statics.field888.method5803();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class426(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class427(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class106(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class102(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class105(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class110(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class104(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class103(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class107(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class108(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field888 != null) {
                Statics.field888.method5796();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field844[--Statics.field848] == 1;
            Statics.field1606.field807.method5804(new class109(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field844[--Statics.field848] == 1;
            if (Statics.field888 != null) {
                Statics.field888.method5804(new class109(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.af(ILbl;ZB)I")
    public static int method299(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field848--;
            Statics.field4182--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field848++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lf.ak(ILbl;ZI)I")
    public static int method5166(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1355 == null) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = 1;
                Statics.field2714 = Statics.field1355;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field844[--Statics.field848];
            if (client.field589[var3] == null) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = 1;
                Statics.field2714 = client.field589[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field841[++Statics.field4182 - 1] = Statics.field2714.field1609;
            return 1;
        } else if (arg0 == 3803) {
            field844[++Statics.field848 - 1] = Statics.field2714.field1593 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field844[++Statics.field848 - 1] = Statics.field2714.field1594;
            return 1;
        } else if (arg0 == 3805) {
            field844[++Statics.field848 - 1] = Statics.field2714.field1595;
            return 1;
        } else if (arg0 == 3806) {
            field844[++Statics.field848 - 1] = Statics.field2714.field1596;
            return 1;
        } else if (arg0 == 3807) {
            field844[++Statics.field848 - 1] = Statics.field2714.field1597;
            return 1;
        } else if (arg0 == 3809) {
            field844[++Statics.field848 - 1] = Statics.field2714.field1598;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field844[--Statics.field848];
            field841[++Statics.field4182 - 1] = Statics.field2714.field1591[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = Statics.field2714.field1600[var5];
            return 1;
        } else if (arg0 == 3812) {
            field844[++Statics.field848 - 1] = Statics.field2714.field1607;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field844[--Statics.field848];
            field841[++Statics.field4182 - 1] = Statics.field2714.field1613[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field848 -= 3;
            int var7 = field844[Statics.field848];
            int var8 = field844[Statics.field848 + 1];
            int var9 = field844[Statics.field848 + 2];
            field844[++Statics.field848 - 1] = Statics.field2714.method2638(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field844[++Statics.field848 - 1] = Statics.field2714.field1605;
            return 1;
        } else if (arg0 == 3816) {
            field844[++Statics.field848 - 1] = Statics.field2714.field1592;
            return 1;
        } else if (arg0 == 3817) {
            field844[++Statics.field848 - 1] = Statics.field2714.method2637(field841[--Statics.field4182]);
            return 1;
        } else if (arg0 == 3818) {
            field844[Statics.field848 - 1] = Statics.field2714.method2665()[field844[Statics.field848 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field848 -= 2;
            int var10 = field844[Statics.field848];
            int var11 = field844[Statics.field848 + 1];
            client.method2522(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = Statics.field2714.field1603[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field848 -= 3;
                int var13 = field844[Statics.field848];
                boolean var14 = field844[Statics.field848 + 1] == 1;
                int var15 = field844[Statics.field848 + 2];
                client.method2915(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field844[--Statics.field848];
                field844[++Statics.field848 - 1] = Statics.field2714.field1612[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1037 == null) {
                    field844[++Statics.field848 - 1] = 0;
                } else {
                    field844[++Statics.field848 - 1] = 1;
                    Statics.field79 = Statics.field1037;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field844[--Statics.field848];
                if (client.field717[var17] == null) {
                    field844[++Statics.field848 - 1] = 0;
                } else {
                    field844[++Statics.field848 - 1] = 1;
                    Statics.field79 = client.field717[var17];
                    Statics.field413 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field841[++Statics.field4182 - 1] = Statics.field79.field1662;
                return 1;
            } else if (arg0 == 3853) {
                field844[++Statics.field848 - 1] = Statics.field79.field1659;
                return 1;
            } else if (arg0 == 3854) {
                field844[++Statics.field848 - 1] = Statics.field79.field1657;
                return 1;
            } else if (arg0 == 3855) {
                field844[++Statics.field848 - 1] = Statics.field79.method2716();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field844[--Statics.field848];
                field841[++Statics.field4182 - 1] = ((class129) Statics.field79.field1660.get(var18)).field1527.method7231();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field844[--Statics.field848];
                field844[++Statics.field848 - 1] = ((class129) Statics.field79.field1660.get(var19)).field1528;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field844[--Statics.field848];
                field844[++Statics.field848 - 1] = ((class129) Statics.field79.field1660.get(var20)).field1525;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field844[--Statics.field848];
                client.method3094(Statics.field413, var21);
                return 1;
            } else if (arg0 == 3860) {
                field844[++Statics.field848 - 1] = Statics.field79.method2718(field841[--Statics.field4182]);
                return 1;
            } else if (arg0 == 3861) {
                field844[Statics.field848 - 1] = Statics.field79.method2713()[field844[Statics.field848 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field844[++Statics.field848 - 1] = Statics.field2681 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("eb.av(ILbl;ZI)I")
    public static int method2701(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = client.field516[var3].method5172();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = client.field516[var4].field3959;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = client.field516[var5].field3961;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = client.field516[var6].field3962;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = client.field516[var7].field3963;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = client.field516[var8].field3964;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field844[--Statics.field848];
            int var10 = client.field516[var9].method5175();
            field844[++Statics.field848 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field844[--Statics.field848];
            int var12 = client.field516[var11].method5175();
            field844[++Statics.field848 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field844[--Statics.field848];
            int var14 = client.field516[var13].method5175();
            field844[++Statics.field848 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field844[--Statics.field848];
            int var16 = client.field516[var15].method5175();
            field844[++Statics.field848 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field844[--Statics.field848] == 1;
            if (Statics.field1578 != null) {
                Statics.field1578.method5122(class309.field3936, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field844[--Statics.field848] == 1;
            if (Statics.field1578 != null) {
                Statics.field1578.method5122(class309.field3938, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field848 -= 2;
            boolean var19 = field844[Statics.field848] == 1;
            boolean var20 = field844[Statics.field848 + 1] == 1;
            if (Statics.field1578 != null) {
                client.field777.field490 = var20;
                Statics.field1578.method5122(client.field777, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field844[--Statics.field848] == 1;
            if (Statics.field1578 != null) {
                Statics.field1578.method5122(class309.field3935, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field844[--Statics.field848] == 1;
            if (Statics.field1578 != null) {
                Statics.field1578.method5122(class309.field3937, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field844[++Statics.field848 - 1] = Statics.field1578 == null ? 0 : Statics.field1578.field3934.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field844[--Statics.field848];
            class315 var24 = (class315) Statics.field1578.field3934.get(var23);
            field844[++Statics.field848 - 1] = var24.field3956;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field844[--Statics.field848];
            class315 var26 = (class315) Statics.field1578.field3934.get(var25);
            field841[++Statics.field4182 - 1] = var26.method5167();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field844[--Statics.field848];
            class315 var28 = (class315) Statics.field1578.field3934.get(var27);
            field841[++Statics.field4182 - 1] = var28.method5171();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field844[--Statics.field848];
            class315 var30 = (class315) Statics.field1578.field3934.get(var29);
            long var31 = class262.method4787() - Statics.field1627 - var30.field3953;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field841[++Statics.field4182 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field844[--Statics.field848];
            class315 var38 = (class315) Statics.field1578.field3934.get(var37);
            field844[++Statics.field848 - 1] = var38.field3958.field3962;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field844[--Statics.field848];
            class315 var40 = (class315) Statics.field1578.field3934.get(var39);
            field844[++Statics.field848 - 1] = var40.field3958.field3961;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field844[--Statics.field848];
            class315 var42 = (class315) Statics.field1578.field3934.get(var41);
            field844[++Statics.field848 - 1] = var42.field3958.field3959;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.ar(ILbl;ZI)I")
    public static int method625(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field848 -= 2;
            int var3 = field844[Statics.field848];
            int var4 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field848 -= 2;
            int var5 = field844[Statics.field848];
            int var6 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field848 -= 2;
            int var7 = field844[Statics.field848];
            int var8 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field848 -= 2;
            int var9 = field844[Statics.field848];
            int var10 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field848 -= 5;
            int var13 = field844[Statics.field848];
            int var14 = field844[Statics.field848 + 1];
            int var15 = field844[Statics.field848 + 2];
            int var16 = field844[Statics.field848 + 3];
            int var17 = field844[Statics.field848 + 4];
            field844[++Statics.field848 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field848 -= 2;
            int var18 = field844[Statics.field848];
            int var19 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field848 -= 2;
            int var20 = field844[Statics.field848];
            int var21 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field848 -= 2;
            int var22 = field844[Statics.field848];
            int var23 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field848 -= 2;
            int var24 = field844[Statics.field848];
            int var25 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field848 -= 2;
            int var26 = field844[Statics.field848];
            int var27 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field848 -= 2;
            int var28 = field844[Statics.field848];
            int var29 = field844[Statics.field848 + 1];
            if (var28 == 0) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field848 -= 2;
            int var30 = field844[Statics.field848];
            int var31 = field844[Statics.field848 + 1];
            if (var30 == 0) {
                field844[++Statics.field848 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field844[++Statics.field848 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field844[++Statics.field848 - 1] = var30;
                    break;
                case 2:
                    field844[++Statics.field848 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field844[++Statics.field848 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field844[++Statics.field848 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field844[++Statics.field848 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field848 -= 2;
            int var32 = field844[Statics.field848];
            int var33 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field848 -= 2;
            int var34 = field844[Statics.field848];
            int var35 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field848 -= 3;
            long var36 = (long) field844[Statics.field848];
            long var38 = (long) field844[Statics.field848 + 1];
            long var40 = (long) field844[Statics.field848 + 2];
            field844[++Statics.field848 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class264.method66(field844[--Statics.field848]);
            field844[++Statics.field848 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field848 -= 2;
            int var43 = field844[Statics.field848];
            int var44 = field844[Statics.field848 + 1];
            field844[++Statics.field848 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field848 -= 3;
            int var45 = field844[Statics.field848];
            int var46 = field844[Statics.field848 + 1];
            int var47 = field844[Statics.field848 + 2];
            field844[++Statics.field848 - 1] = class264.method2128(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field848 -= 3;
            int var48 = field844[Statics.field848];
            int var49 = field844[Statics.field848 + 1];
            int var50 = field844[Statics.field848 + 2];
            field844[++Statics.field848 - 1] = class264.method2603(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field848 -= 3;
            int var51 = field844[Statics.field848];
            int var52 = field844[Statics.field848 + 1];
            int var53 = field844[Statics.field848 + 2];
            int var54 = 31 - var53;
            field844[++Statics.field848 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field848 -= 4;
            int var55 = field844[Statics.field848];
            int var56 = field844[Statics.field848 + 1];
            int var57 = field844[Statics.field848 + 2];
            int var58 = field844[Statics.field848 + 3];
            int var59 = class264.method2603(var55, var57, var58);
            int var60 = class264.method2588(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field844[++Statics.field848 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field844[Statics.field848 - 1] = class384.method4788(field844[Statics.field848 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field844[Statics.field848 - 1] = class384.method2308(field844[Statics.field848 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field848 -= 2;
            int var61 = field844[Statics.field848];
            int var62 = field844[Statics.field848 + 1];
            int var63 = class384.method5651(var61, var62);
            field844[++Statics.field848 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field844[Statics.field848 - 1] = Math.abs(field844[Statics.field848 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fn.al(ILbl;ZI)I")
    public static int method3256(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field841[--Statics.field4182];
            int var4 = field844[--Statics.field848];
            field841[++Statics.field4182 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field4182 -= 2;
            String var5 = field841[Statics.field4182];
            String var6 = field841[Statics.field4182 + 1];
            field841[++Statics.field4182 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field841[--Statics.field4182];
            int var8 = field844[--Statics.field848];
            field841[++Statics.field4182 - 1] = var7 + class336.method2569(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field841[--Statics.field4182];
            field841[++Statics.field4182 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field844[--Statics.field848];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field845.setTime(new Date(var11));
            int var13 = field845.get(5);
            int var14 = field845.get(2);
            int var15 = field845.get(1);
            field841[++Statics.field4182 - 1] = var13 + "-" + field846[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field4182 -= 2;
            String var16 = field841[Statics.field4182];
            String var17 = field841[Statics.field4182 + 1];
            if (Statics.field2754.field1066 != null && Statics.field2754.field1066.field3235) {
                field841[++Statics.field4182 - 1] = var17;
            } else {
                field841[++Statics.field4182 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field844[--Statics.field848];
            field841[++Statics.field4182 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field4182 -= 2;
            field844[++Statics.field848 - 1] = class336.method3139(class337.method2693(field841[Statics.field4182], field841[Statics.field4182 + 1], Statics.field1503));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field841[--Statics.field4182];
            Statics.field848 -= 2;
            int var20 = field844[Statics.field848];
            int var21 = field844[Statics.field848 + 1];
            byte[] var22 = Statics.field1805.method5066(var21, 0);
            class332 var23 = new class332(var22);
            field844[++Statics.field848 - 1] = var23.method5443(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field841[--Statics.field4182];
            Statics.field848 -= 2;
            int var25 = field844[Statics.field848];
            int var26 = field844[Statics.field848 + 1];
            byte[] var27 = Statics.field1805.method5066(var26, 0);
            class332 var28 = new class332(var27);
            field844[++Statics.field848 - 1] = var28.method5497(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field4182 -= 2;
            String var29 = field841[Statics.field4182];
            String var30 = field841[Statics.field4182 + 1];
            if (field844[--Statics.field848] == 1) {
                field841[++Statics.field4182 - 1] = var29;
            } else {
                field841[++Statics.field4182 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field841[--Statics.field4182];
            field841[++Statics.field4182 - 1] = class333.method5477(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field841[--Statics.field4182];
            int var33 = field844[--Statics.field848];
            field841[++Statics.field4182 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class336.method1897((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class336.method2587((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class336.method5864((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class336.method2525((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field841[--Statics.field4182];
            if (var38 == null) {
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field841[--Statics.field4182];
            Statics.field848 -= 2;
            int var40 = field844[Statics.field848];
            int var41 = field844[Statics.field848 + 1];
            field841[++Statics.field4182 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field841[--Statics.field4182];
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
            field841[++Statics.field4182 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field841[--Statics.field4182];
            int var48 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field4182 -= 2;
            String var49 = field841[Statics.field4182];
            String var50 = field841[Statics.field4182 + 1];
            int var51 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field841[--Statics.field4182];
            field841[++Statics.field4182 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ka.aa(ILbl;ZI)I")
    public static int method4939(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field844[--Statics.field848];
            field841[++Statics.field4182 - 1] = class181.method1538(var3).field2028;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field848 -= 2;
            int var4 = field844[Statics.field848];
            int var5 = field844[Statics.field848 + 1];
            class181 var6 = class181.method1538(var4);
            if (var5 < 1 || var5 > 5 || var6.field2064[var5 - 1] == null) {
                field841[++Statics.field4182 - 1] = "";
            } else {
                field841[++Statics.field4182 - 1] = var6.field2064[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field848 -= 2;
            int var7 = field844[Statics.field848];
            int var8 = field844[Statics.field848 + 1];
            class181 var9 = class181.method1538(var7);
            if (var8 < 1 || var8 > 5 || var9.field2043[var8 - 1] == null) {
                field841[++Statics.field4182 - 1] = "";
            } else {
                field841[++Statics.field4182 - 1] = var9.field2043[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class181.method1538(var10).field2040;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class181.method1538(var11).field2039 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field844[--Statics.field848];
            class181 var13 = class181.method1538(var12);
            if (var13.field2053 == -1 && var13.field2059 >= 0) {
                field844[++Statics.field848 - 1] = var13.field2059;
            } else {
                field844[++Statics.field848 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field844[--Statics.field848];
            class181 var15 = class181.method1538(var14);
            if (var15.field2053 >= 0 && var15.field2059 >= 0) {
                field844[++Statics.field848 - 1] = var15.field2059;
            } else {
                field844[++Statics.field848 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class181.method1538(var16).field2041 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field844[--Statics.field848];
            class181 var18 = class181.method1538(var17);
            if (var18.field2072 == -1 && var18.field2070 >= 0) {
                field844[++Statics.field848 - 1] = var18.field2070;
            } else {
                field844[++Statics.field848 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field844[--Statics.field848];
            class181 var20 = class181.method1538(var19);
            if (var20.field2072 >= 0 && var20.field2070 >= 0) {
                field844[++Statics.field848 - 1] = var20.field2070;
            } else {
                field844[++Statics.field848 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field841[--Statics.field4182];
            int var22 = field844[--Statics.field848];
            client.method197(var21, var22 == 1);
            field844[++Statics.field848 - 1] = Statics.field2202;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1565 == null || Statics.field2127 >= Statics.field2202) {
                field844[++Statics.field848 - 1] = -1;
            } else {
                field844[++Statics.field848 - 1] = Statics.field1565[++Statics.field2127 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2127 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field844[--Statics.field848];
            int var24 = class181.method1538(var23).method3208();
            if (var24 == -1) {
                field844[++Statics.field848 - 1] = var24;
            } else {
                field844[++Statics.field848 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dc.ao(ILbl;ZI)I")
    public static int method2604(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field844[++Statics.field848 - 1] = client.field606;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field848 -= 3;
            client.field606 = field844[Statics.field848];
            Statics.field879 = class438.method4349(field844[Statics.field848 + 1]);
            if (Statics.field879 == null) {
                Statics.field879 = class438.field4633;
            }
            client.field656 = field844[Statics.field848 + 2];
            class257 var3 = class257.method2630(class255.field2873, client.field551.field1319);
            var3.field2960.method6644(client.field606);
            var3.field2960.method6644(Statics.field879.field4632);
            var3.field2960.method6644(client.field656);
            client.field551.method2268(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field841[--Statics.field4182];
            Statics.field848 -= 2;
            int var5 = field844[Statics.field848];
            int var6 = field844[Statics.field848 + 1];
            class257 var7 = class257.method2630(class255.field2878, client.field551.field1319);
            var7.field2960.method6644(class421.method5127(var4) + 2);
            var7.field2960.method6654(var4);
            var7.field2960.method6644(var5 - 1);
            var7.field2960.method6644(var6);
            client.field551.method2268(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field848 -= 2;
            int var8 = field844[Statics.field848];
            int var9 = field844[Statics.field848 + 1];
            class58 var10 = class98.method736(var8, var9);
            if (var10 == null) {
                field844[++Statics.field848 - 1] = -1;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = var10.field484;
                field844[++Statics.field848 - 1] = var10.field473;
                field841[++Statics.field4182 - 1] = var10.field475 == null ? "" : var10.field475;
                field841[++Statics.field4182 - 1] = var10.field482 == null ? "" : var10.field482;
                field841[++Statics.field4182 - 1] = var10.field480 == null ? "" : var10.field480;
                field844[++Statics.field848 - 1] = var10.method1010() ? 1 : (var10.method1013() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field844[--Statics.field848];
            class58 var12 = class98.method6479(var11);
            if (var12 == null) {
                field844[++Statics.field848 - 1] = -1;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = var12.field474;
                field844[++Statics.field848 - 1] = var12.field473;
                field841[++Statics.field4182 - 1] = var12.field475 == null ? "" : var12.field475;
                field841[++Statics.field4182 - 1] = var12.field482 == null ? "" : var12.field482;
                field841[++Statics.field4182 - 1] = var12.field480 == null ? "" : var12.field480;
                field844[++Statics.field848 - 1] = var12.method1010() ? 1 : (var12.method1013() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field879 == null) {
                field844[++Statics.field848 - 1] = -1;
            } else {
                field844[++Statics.field848 - 1] = Statics.field879.field4632;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field841[--Statics.field4182];
            int var14 = field844[--Statics.field848];
            class257 var15 = class443.method1981(var14, var13, Statics.field1503, -1);
            client.field551.method2268(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field4182 -= 2;
            String var16 = field841[Statics.field4182];
            String var17 = field841[Statics.field4182 + 1];
            class257 var18 = class257.method2630(class255.field2876, client.field551.field1319);
            var18.field2960.method6757(0);
            int var19 = var18.field2960.field4512;
            var18.field2960.method6654(var16);
            class275.method4342(var18.field2960, var17);
            var18.field2960.method6660(var18.field2960.field4512 - var19);
            client.field551.method2268(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field841[--Statics.field4182];
            Statics.field848 -= 2;
            int var21 = field844[Statics.field848];
            int var22 = field844[Statics.field848 + 1];
            class257 var23 = class443.method1981(var21, var20, Statics.field1503, var22);
            client.field551.method2268(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field2754 == null || Statics.field2754.field1073 == null) {
                var24 = "";
            } else {
                var24 = Statics.field2754.field1073.method7231();
            }
            field841[++Statics.field4182 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field844[++Statics.field848 - 1] = client.field656;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class98.method48(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class98.method3935(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field844[--Statics.field848];
            field844[++Statics.field848 - 1] = class98.method2697(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field841[--Statics.field4182];
            client.method2601(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field727 = field841[--Statics.field4182].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field841[++Statics.field4182 - 1] = client.field727;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field841[--Statics.field4182];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field848++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field848 -= 2;
            int var30 = field844[Statics.field848];
            int var31 = field844[Statics.field848 + 1];
            class58 var32 = class98.method736(var30, var31);
            if (var32 == null) {
                field844[++Statics.field848 - 1] = -1;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = var32.field484;
                field844[++Statics.field848 - 1] = var32.field473;
                field841[++Statics.field4182 - 1] = var32.field475 == null ? "" : var32.field475;
                field841[++Statics.field4182 - 1] = var32.field482 == null ? "" : var32.field482;
                field841[++Statics.field4182 - 1] = var32.field480 == null ? "" : var32.field480;
                field844[++Statics.field848 - 1] = var32.method1010() ? 1 : (var32.method1013() ? 2 : 0);
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field844[--Statics.field848];
            class58 var34 = class98.method6479(var33);
            if (var34 == null) {
                field844[++Statics.field848 - 1] = -1;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
            } else {
                field844[++Statics.field848 - 1] = var34.field474;
                field844[++Statics.field848 - 1] = var34.field473;
                field841[++Statics.field4182 - 1] = var34.field475 == null ? "" : var34.field475;
                field841[++Statics.field4182 - 1] = var34.field482 == null ? "" : var34.field482;
                field841[++Statics.field4182 - 1] = var34.field480 == null ? "" : var34.field480;
                field844[++Statics.field848 - 1] = var34.method1010() ? 1 : (var34.method1013() ? 2 : 0);
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ie.aq(ILbl;ZB)I")
    public static int method4489(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field844[++Statics.field848 - 1] = client.method5641();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field844[--Statics.field848];
            if (var3 == 1 || var3 == 2) {
                client.method3962(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field844[++Statics.field848 - 1] = Statics.field4567.field1225;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field844[--Statics.field848];
            if (var4 == 1 || var4 == 2) {
                Statics.field4567.field1225 = var4;
                class89.method450();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field848 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field4182 -= 2;
            Statics.field848--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field4182--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gl.ay(ILbl;ZB)I")
    public static int method3362(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field848 -= 2;
            int var3 = field844[Statics.field848];
            int var4 = field844[Statics.field848 + 1];
            if (!client.field752) {
                client.field574 = var3;
                client.field575 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field844[++Statics.field848 - 1] = client.field574;
            return 1;
        } else if (arg0 == 5506) {
            field844[++Statics.field848 - 1] = client.field575;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field844[--Statics.field848];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field581 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field844[++Statics.field848 - 1] = client.field581;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hn.ac(ILbl;ZI)I")
    public static int method4284(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field552 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field4182 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field844[++Statics.field848 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dy.ab(II)I")
    public static int method2580(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("id.as(II)I")
    public static int method4376(int arg0) {
        return (int) ((Math.log((double) arg0) / field851 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("n.ag(ILbl;ZB)I")
    public static int method199(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field848 -= 2;
            client.field776 = (short) method2580(field844[Statics.field848]);
            if (client.field776 <= 0) {
                client.field776 = 256;
            }
            client.field760 = (short) method2580(field844[Statics.field848 + 1]);
            if (client.field760 <= 0) {
                client.field760 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field848 -= 2;
            client.field761 = (short) field844[Statics.field848];
            if (client.field761 <= 0) {
                client.field761 = 256;
            }
            client.field762 = (short) field844[Statics.field848 + 1];
            if (client.field762 <= 0) {
                client.field762 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field848 -= 4;
            client.field763 = (short) field844[Statics.field848];
            if (client.field763 <= 0) {
                client.field763 = 1;
            }
            client.field764 = (short) field844[Statics.field848 + 1];
            if (client.field764 <= 0) {
                client.field764 = 32767;
            } else if (client.field764 < client.field763) {
                client.field764 = client.field763;
            }
            client.field657 = (short) field844[Statics.field848 + 2];
            if (client.field657 <= 0) {
                client.field657 = 1;
            }
            client.field515 = (short) field844[Statics.field848 + 3];
            if (client.field515 <= 0) {
                client.field515 = 32767;
            } else if (client.field515 < client.field657) {
                client.field515 = client.field657;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field677 == null) {
                field844[++Statics.field848 - 1] = -1;
                field844[++Statics.field848 - 1] = -1;
            } else {
                client.method2586(0, 0, client.field677.field3280, client.field677.field3281, false);
                field844[++Statics.field848 - 1] = client.field524;
                field844[++Statics.field848 - 1] = client.field614;
            }
            return 1;
        } else if (arg0 == 6204) {
            field844[++Statics.field848 - 1] = client.field761;
            field844[++Statics.field848 - 1] = client.field762;
            return 1;
        } else if (arg0 == 6205) {
            field844[++Statics.field848 - 1] = method4376(client.field776);
            field844[++Statics.field848 - 1] = method4376(client.field760);
            return 1;
        } else if (arg0 == 6220) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field844[++Statics.field848 - 1] = Statics.field3209;
            return 1;
        } else if (arg0 == 6223) {
            field844[++Statics.field848 - 1] = Statics.field1246;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.az(ILbl;ZB)I")
    public static int method2181(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field844[++Statics.field848 - 1] = class61.method40() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method4729();
            if (var3 == null) {
                field844[++Statics.field848 - 1] = -1;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
            } else {
                field844[++Statics.field848 - 1] = var3.field795;
                field844[++Statics.field848 - 1] = var3.field796;
                field841[++Statics.field4182 - 1] = var3.field799;
                field844[++Statics.field848 - 1] = var3.field800;
                field844[++Statics.field848 - 1] = var3.field797;
                field841[++Statics.field4182 - 1] = var3.field798;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method2480();
            if (var4 == null) {
                field844[++Statics.field848 - 1] = -1;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
            } else {
                field844[++Statics.field848 - 1] = var4.field795;
                field844[++Statics.field848 - 1] = var4.field796;
                field841[++Statics.field4182 - 1] = var4.field799;
                field844[++Statics.field848 - 1] = var4.field800;
                field844[++Statics.field848 - 1] = var4.field797;
                field841[++Statics.field4182 - 1] = var4.field798;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field844[--Statics.field848];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field801; var7++) {
                if (Statics.field246[var7].field795 == var5) {
                    var6 = Statics.field246[var7];
                    break;
                }
            }
            if (var6 == null) {
                field844[++Statics.field848 - 1] = -1;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
            } else {
                field844[++Statics.field848 - 1] = var6.field795;
                field844[++Statics.field848 - 1] = var6.field796;
                field841[++Statics.field4182 - 1] = var6.field799;
                field844[++Statics.field848 - 1] = var6.field800;
                field844[++Statics.field848 - 1] = var6.field797;
                field841[++Statics.field4182 - 1] = var6.field798;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field848 -= 4;
            int var8 = field844[Statics.field848];
            boolean var9 = field844[Statics.field848 + 1] == 1;
            int var10 = field844[Statics.field848 + 2];
            boolean var11 = field844[Statics.field848 + 3] == 1;
            Statics.method2594(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field844[--Statics.field848];
            if (var12 >= 0 && var12 < class61.field801) {
                class61 var13 = Statics.field246[var12];
                field844[++Statics.field848 - 1] = var13.field795;
                field844[++Statics.field848 - 1] = var13.field796;
                field841[++Statics.field4182 - 1] = var13.field799;
                field844[++Statics.field848 - 1] = var13.field800;
                field844[++Statics.field848 - 1] = var13.field797;
                field841[++Statics.field4182 - 1] = var13.field798;
            } else {
                field844[++Statics.field848 - 1] = -1;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
                field844[++Statics.field848 - 1] = 0;
                field844[++Statics.field848 - 1] = 0;
                field841[++Statics.field4182 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field585 = field844[--Statics.field848] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field848 -= 2;
            int var14 = field844[Statics.field848];
            int var15 = field844[Statics.field848 + 1];
            class177 var16 = class177.method2070(var15);
            if (var16.method3051()) {
                field841[++Statics.field4182 - 1] = class171.method2378(var14).method2982(var15, var16.field1937);
            } else {
                field844[++Statics.field848 - 1] = class171.method2378(var14).method2975(var15, var16.field1935);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field848 -= 2;
            int var17 = field844[Statics.field848];
            int var18 = field844[Statics.field848 + 1];
            class177 var19 = class177.method2070(var18);
            if (var19.method3051()) {
                field841[++Statics.field4182 - 1] = class180.method3056(var17).method3153(var18, var19.field1937);
            } else {
                field844[++Statics.field848 - 1] = class180.method3056(var17).method3152(var18, var19.field1935);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field848 -= 2;
            int var20 = field844[Statics.field848];
            int var21 = field844[Statics.field848 + 1];
            class177 var22 = class177.method2070(var21);
            if (var22.method3051()) {
                field841[++Statics.field4182 - 1] = class181.method1538(var20).method3207(var21, var22.field1937);
            } else {
                field844[++Statics.field848 - 1] = class181.method1538(var20).method3194(var21, var22.field1935);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field848 -= 2;
            int var23 = field844[Statics.field848];
            int var24 = field844[Statics.field848 + 1];
            class177 var25 = class177.method2070(var24);
            if (var25.method3051()) {
                field841[++Statics.field4182 - 1] = class178.method2633(var23).method3092(var24, var25.field1937);
            } else {
                field844[++Statics.field848 - 1] = class178.method2633(var23).method3070(var24, var25.field1935);
            }
            return 1;
        } else if (arg0 == 6518) {
            field844[++Statics.field848 - 1] = client.field544 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field844[++Statics.field848 - 1] = client.field502;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field4182--;
            Statics.field848--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field4182--;
            Statics.field848--;
            return 1;
        } else if (arg0 == 6524) {
            field844[++Statics.field848 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field844[++Statics.field848 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field844[++Statics.field848 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field844[++Statics.field848 - 1] = client.field503;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.au(ILbl;ZB)I")
    public static int method4352(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field848 -= 2;
            Statics.field4182--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 6750) {
            field841[++Statics.field4182 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field844[++Statics.field848 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field844[--Statics.field848];
            class171 var4 = class171.method2378(var3);
            field841[++Statics.field4182 - 1] = var4 == null ? "" : var4.field1862;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lj.at(ILbl;ZI)I")
    public static int method5554(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field841[++Statics.field4182 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field844[++Statics.field848 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field841[++Statics.field4182 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field844[++Statics.field848 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mu.ae(ILbl;ZS)I")
    public static int method5739(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field841[++Statics.field4182 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field844[++Statics.field848 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("id.an(ILbl;ZI)I")
    public static int method4377(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field848 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field848 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field848 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field848 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field4182--;
            Statics.field848--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field4182--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field848 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field848--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jj.aw(ILbl;ZB)I")
    public static int method4730(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field848++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field4182 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field848++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field848++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field848++;
            return 1;
        } else if (arg0 == 7108) {
            field844[++Statics.field848 - 1] = client.method243() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field848--;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field848 -= 2;
            field844[++Statics.field848 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field848 -= 2;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("do.aj(ILbl;ZB)I")
    public static int method2523(int arg0, class72 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field848 -= 5;
            field844[++Statics.field848 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field848 -= 6;
            field844[++Statics.field848 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field844[Statics.field848 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field848 -= 2;
            field844[++Statics.field848 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field848--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field848 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jm.ax(ILbl;ZI)I")
    public static int method4752(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7400) {
            Statics.field848--;
            Statics.field4182--;
            return 1;
        } else if (arg0 == 7401) {
            Statics.field848--;
            Statics.field4182--;
            return 1;
        } else if (arg0 == 7402) {
            Statics.field848 -= 2;
            Statics.field4182--;
            return 1;
        } else if (arg0 == 7403) {
            Statics.field848 -= 2;
            Statics.field4182--;
            return 1;
        } else if (arg0 == 7404) {
            Statics.field848--;
            Statics.field4182--;
            return 1;
        } else if (arg0 == 7405) {
            Statics.field848 -= 2;
            return 1;
        } else if (arg0 == 7406) {
            Statics.field848--;
            field841[++Statics.field4182 - 1] = "";
            return 1;
        } else if (arg0 == 7407) {
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 7408) {
            Statics.field848 -= 2;
            Statics.field4182--;
            field844[++Statics.field848 - 1] = 0;
            return 1;
        } else if (arg0 == 7409) {
            Statics.field848--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gg.ah(II)V")
    public static void method3773(int arg0) {
        if (arg0 == -1 || !class286.method159(arg0)) {
            return;
        }
        class286[] var1 = Statics.field3290[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class286 var3 = var1[var2];
            if (var3.field3352 != null) {
                class81 var4 = new class81();
                var4.field1044 = var3;
                var4.field1047 = var3.field3352;
                method9(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("hg.ai(ILjd;ZI)V")
    public static void method3945(int arg0, class282 arg1, boolean arg2) {
        class218 var3 = client.method4434().method6243(arg0);
        int var4 = Statics.field2754.field1084;
        int var5 = (Statics.field2754.field1161 >> 7) + Statics.field161;
        int var6 = (Statics.field2754.field1152 >> 7) + Statics.field1467;
        class282 var7 = new class282(var4, var5, var6);
        client.method4434().method6337(var3, var7, arg1, arg2);
    }
}
