package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bg")
public class class64 {

    @ObfuscatedName("bg.n")
    public static int[] field831 = new int[5];

    @ObfuscatedName("bg.s")
    public static int[][] field833 = new int[5][5000];

    @ObfuscatedName("bg.l")
    public static int[] field839 = new int[1000];

    @ObfuscatedName("bg.o")
    public static String[] field832 = new String[1000];

    @ObfuscatedName("bg.p")
    public static int field837 = 0;

    @ObfuscatedName("bg.w")
    public static class57[] field849 = new class57[50];

    @ObfuscatedName("bg.g")
    public static Calendar field838 = Calendar.getInstance();

    @ObfuscatedName("bg.x")
    public static final String[] field841 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bg.y")
    public static boolean field842 = false;

    @ObfuscatedName("bg.j")
    public static boolean field843 = false;

    @ObfuscatedName("bg.e")
    public static ArrayList field844 = new ArrayList();

    @ObfuscatedName("bg.z")
    public static int field845 = 0;

    @ObfuscatedName("bg.aw")
    public static final double field846 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.v(Lch;B)V")
    public static void method2809(class81 arg0) {
        method1804(arg0, 500000, 475000);
    }

    @ObfuscatedName("bg.c(Lch;III)V")
    public static void method1804(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1035;
        class72 var5;
        if (class436.method250(arg0.field1041)) {
            Statics.field1946 = (class224) var3[0];
            class172 var4 = class172.method2469(Statics.field1946.field2435);
            var5 = class72.method4608(arg0.field1041, var4.field1831, var4.field1836);
        } else {
            int var6 = (Integer) var3[0];
            var5 = Statics.method2854(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field835 = 0;
        Statics.field1479 = 0;
        int var7 = -1;
        int[] var8 = var5.field957;
        int[] var9 = var5.field958;
        byte var10 = -1;
        field837 = 0;
        field842 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field4011 = new int[var5.field960];
            int var13 = 0;
            Statics.field834 = new String[var5.field961];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1038;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1036;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1045 == null ? -1 : arg0.field1045.field3449;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1037;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1045 == null ? -1 : arg0.field1045.field3461;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1042 == null ? -1 : arg0.field1042.field3449;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1042 == null ? -1 : arg0.field1042.field3461;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1039;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1040;
                    }
                    Statics.field4011[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1034;
                    }
                    Statics.field834[var14++] = var17;
                }
            }
            field845 = arg0.field1032;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field958[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method608(var61, var5, var48);
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
                    field839[++Statics.field835 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field839[++Statics.field835 - 1] = class289.field3284[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class289.field3284[var19] = field839[--Statics.field835];
                    client.method3941(var19);
                } else if (var61 == 3) {
                    field832[++Statics.field1479 - 1] = var5.field963[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field835 -= 2;
                    if (field839[Statics.field835] != field839[Statics.field835 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field835 -= 2;
                    if (field839[Statics.field835] == field839[Statics.field835 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field835 -= 2;
                    if (field839[Statics.field835] < field839[Statics.field835 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field835 -= 2;
                    if (field839[Statics.field835] > field839[Statics.field835 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field837 == 0) {
                        return;
                    }
                    class57 var21 = field849[--field837];
                    var5 = var21.field465;
                    var8 = var5.field957;
                    var9 = var5.field958;
                    var7 = var21.field464;
                    Statics.field4011 = var21.field467;
                    Statics.field834 = var21.field466;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field839[++Statics.field835 - 1] = class289.method1960(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class289.method4444(var23, field839[--Statics.field835]);
                } else if (var61 == 31) {
                    Statics.field835 -= 2;
                    if (field839[Statics.field835] <= field839[Statics.field835 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field835 -= 2;
                    if (field839[Statics.field835] >= field839[Statics.field835 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field839[++Statics.field835 - 1] = Statics.field4011[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field4011[var9[var7]] = field839[--Statics.field835];
                } else if (var61 == 35) {
                    field832[++Statics.field1479 - 1] = Statics.field834[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field834[var9[var7]] = field832[--Statics.field1479];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field1479 -= var24;
                    String var25 = class348.method5221(field832, Statics.field1479, var24);
                    field832[++Statics.field1479 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field835--;
                } else if (var61 == 39) {
                    Statics.field1479--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = Statics.method2854(var26);
                    int[] var28 = new int[var27.field960];
                    String[] var29 = new String[var27.field961];
                    for (int var30 = 0; var30 < var27.field959; var30++) {
                        var28[var30] = field839[Statics.field835 - var27.field959 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field962; var31++) {
                        var29[var31] = field832[Statics.field1479 - var27.field962 + var31];
                    }
                    Statics.field835 -= var27.field959;
                    Statics.field1479 -= var27.field962;
                    class57 var32 = new class57();
                    var32.field465 = var5;
                    var32.field464 = var7;
                    var32.field467 = Statics.field4011;
                    var32.field466 = Statics.field834;
                    field849[++field837 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field957;
                    var9 = var27.field958;
                    var7 = -1;
                    Statics.field4011 = var28;
                    Statics.field834 = var29;
                } else if (var61 == 42) {
                    field839[++Statics.field835 - 1] = Statics.field1739.method2307(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field1739.method2339(var9[var7], field839[--Statics.field835]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field839[--Statics.field835];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field831[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field833[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field839[--Statics.field835];
                    if (var39 < 0 || var39 >= field831[var38]) {
                        throw new RuntimeException();
                    }
                    field839[++Statics.field835 - 1] = field833[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field835 -= 2;
                    int var41 = field839[Statics.field835];
                    if (var41 < 0 || var41 >= field831[var40]) {
                        throw new RuntimeException();
                    }
                    field833[var40][var41] = field839[Statics.field835 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field1739.method2309(var9[var7]);
                    if (var42 == null) {
                        var42 = class309.field3599;
                    }
                    field832[++Statics.field1479 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field1739.method2305(var9[var7], field832[--Statics.field1479]);
                } else if (var61 == 49) {
                    String var43 = Statics.field1739.method2320(var9[var7]);
                    field832[++Statics.field1479 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field1739.method2308(var9[var7], field832[--Statics.field1479]);
                } else if (var61 == 60) {
                    class418 var44 = var5.field964[var9[var7]];
                    class408 var45 = (class408) var44.method6760((long) field839[--Statics.field835]);
                    if (var45 != null) {
                        var7 += var45.field4409;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field3270.method2732(var9[var7]);
                    if (var46 == null) {
                        field839[++Statics.field835 - 1] = -1;
                    } else {
                        field839[++Statics.field835 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field1886.method6441(var9[var7]);
                    if (var47 == null) {
                        field839[++Statics.field835 - 1] = -1;
                    } else {
                        field839[++Statics.field835 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4410).append(" ");
            for (int var53 = field837 - 1; var53 >= 0; var53--) {
                var52.append("").append(field849[var53].field465.field4410).append(" ");
            }
            var52.append("").append(var10);
            class462.method5173(var52.toString(), var59);
        } finally {
            while (field844.size() > 0) {
                class94 var56 = (class94) field844.remove(0);
                client.method3562(var56.method2260(), var56.method2270(), var56.method2262(), var56.method2263(), "");
            }
            if (field842) {
                field842 = false;
                client.method289();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class462.method5173("Warning: Script " + var5.field955 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("aj.i(ILbd;ZI)I")
    public static int method608(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3022(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return Statics.method52(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2499(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2715(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method2485(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method5498(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method5196(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return Statics.method735(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method2722(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method2251(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2082(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return Statics.method52(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2499(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2715(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method2485(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method5498(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method1061(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2721(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method4708(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2686(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2082(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method1888(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return Statics.method5238(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method4602(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1897(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method5988(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method4964(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method4609(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method3898(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method2014(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method5231(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3939(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method5388(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2861(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method2969(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method5508(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method6250(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1896(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method1022(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method95(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method4709(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method2239(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method82(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method2002(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method4251(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method281(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method1060(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fj.f(ILbd;ZB)I")
    public static int method3022(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field835 -= 3;
            int var3 = field839[Statics.field835];
            int var4 = field839[Statics.field835 + 1];
            int var5 = field839[Statics.field835 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class295 var6 = class295.method2688(var3);
            if (var6.field3454 == null) {
                var6.field3454 = new class295[var5 + 1];
            }
            if (var6.field3454.length <= var5) {
                class295[] var7 = new class295[var5 + 1];
                for (int var8 = 0; var8 < var6.field3454.length; var8++) {
                    var7[var8] = var6.field3454[var8];
                }
                var6.field3454 = var7;
            }
            if (var5 > 0 && var6.field3454[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class295 var9 = new class295();
            var9.field3338 = var4;
            var9.field3426 = var9.field3449 = var6.field3449;
            var9.field3461 = var5;
            var9.field3451 = true;
            var6.field3454[var5] = var9;
            if (arg2) {
                Statics.field2386 = var9;
            } else {
                Statics.field840 = var9;
            }
            client.method5855(var6);
            return 1;
        } else if (arg0 == 101) {
            class295 var10 = arg2 ? Statics.field2386 : Statics.field840;
            class295 var11 = class295.method2688(var10.field3449);
            var11.field3454[var10.field3461] = null;
            client.method5855(var11);
            return 1;
        } else if (arg0 == 102) {
            class295 var12 = class295.method2688(field839[--Statics.field835]);
            var12.field3454 = null;
            client.method5855(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field835 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field835 -= 2;
            int var13 = field839[Statics.field835];
            int var14 = field839[Statics.field835 + 1];
            class295 var15 = class295.method3387(var13, var14);
            if (var15 == null || var14 == -1) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = 1;
                if (arg2) {
                    Statics.field2386 = var15;
                } else {
                    Statics.field840 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class295 var16 = class295.method2688(field839[--Statics.field835]);
            if (var16 == null) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = 1;
                if (arg2) {
                    Statics.field2386 = var16;
                } else {
                    Statics.field840 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field839[Statics.field835 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field839[--Statics.field835 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("de.n(ILbd;ZB)I")
    public static int method2499(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class295 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field839[--Statics.field835];
            var4 = class295.method2688(var3);
        } else {
            var4 = arg2 ? Statics.field2386 : Statics.field840;
        }
        if (arg0 == 1100) {
            Statics.field835 -= 2;
            var4.field3357 = field839[Statics.field835];
            if (var4.field3357 > var4.field3367 - var4.field3351) {
                var4.field3357 = var4.field3367 - var4.field3351;
            }
            if (var4.field3357 < 0) {
                var4.field3357 = 0;
            }
            var4.field3358 = field839[Statics.field835 + 1];
            if (var4.field3358 > var4.field3360 - var4.field3352) {
                var4.field3358 = var4.field3360 - var4.field3352;
            }
            if (var4.field3358 < 0) {
                var4.field3358 = 0;
            }
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3361 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3440 = field839[--Statics.field835] == 1;
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3457 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3436 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3371 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3374 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3375 = field839[--Statics.field835] == 1;
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3397 = 1;
            var4.field3381 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field835 -= 6;
            var4.field3437 = field839[Statics.field835];
            var4.field3482 = field839[Statics.field835 + 1];
            var4.field3388 = field839[Statics.field835 + 2];
            var4.field3384 = field839[Statics.field835 + 3];
            var4.field3327 = field839[Statics.field835 + 4];
            var4.field3391 = field839[Statics.field835 + 5];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field839[--Statics.field835];
            if (var4.field3394 != var5) {
                var4.field3394 = var5;
                var4.field3474 = 0;
                var4.field3487 = 0;
                client.method5855(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3386 = field839[--Statics.field835] == 1;
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field832[--Statics.field1479];
            if (!var6.equals(var4.field3422)) {
                var4.field3422 = var6;
                client.method5855(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3339 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field835 -= 3;
            var4.field3401 = field839[Statics.field835];
            var4.field3472 = field839[Statics.field835 + 1];
            var4.field3400 = field839[Statics.field835 + 2];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3403 = field839[--Statics.field835] == 1;
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3376 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3377 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3337 = field839[--Statics.field835] == 1;
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3379 = field839[--Statics.field835] == 1;
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field835 -= 2;
            var4.field3367 = field839[Statics.field835];
            var4.field3360 = field839[Statics.field835 + 1];
            client.method5855(var4);
            if (var3 != -1 && var4.field3338 == 0) {
                client.method4963(Statics.field3326[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method4686(var4.field3449, var4.field3461);
            client.field684 = var4;
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3372 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3395 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3435 = field839[--Statics.field835];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field839[--Statics.field835];
            class449 var8 = (class449) class330.method4919(Statics.method5019(), var7);
            if (var8 != null) {
                var4.field3378 = var8;
                client.method5855(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field839[--Statics.field835] == 1;
            var4.field3370 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field839[--Statics.field835] == 1;
            var4.field3359 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field835 -= 2;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3488 = field832[--Statics.field1479];
            client.method5855(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5068(field832[--Statics.field1479], Statics.field1932, client.method4916());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field835 -= 2;
            var4.method5172(field839[Statics.field835], field839[Statics.field835 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5122(field832[--Statics.field1479], field839[--Statics.field835]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("em.s(ILbd;ZS)I")
    public static int method2715(int arg0, class72 arg1, boolean arg2) {
        class295 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class295.method2688(field839[--Statics.field835]);
        } else {
            var3 = arg2 ? Statics.field2386 : Statics.field840;
        }
        client.method5855(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field835 -= 2;
            int var4 = field839[Statics.field835];
            int var5 = field839[Statics.field835 + 1];
            var3.field3335 = var4;
            var3.field3473 = var5;
            class189 var6 = Statics.method268(var4);
            var3.field3388 = var6.field2082;
            var3.field3384 = var6.field2083;
            var3.field3327 = var6.field2084;
            var3.field3437 = var6.field2098;
            var3.field3482 = var6.field2086;
            var3.field3391 = var6.field2081;
            if (arg0 == 1205) {
                var3.field3402 = 0;
            } else if (arg0 == 1212 | var6.field2087 == 1) {
                var3.field3402 = 1;
            } else {
                var3.field3402 = 2;
            }
            if (var3.field3468 > 0) {
                var3.field3391 = var3.field3391 * 32 / var3.field3468;
            } else if (var3.field3347 > 0) {
                var3.field3391 = var3.field3391 * 32 / var3.field3347;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3397 = 2;
            var3.field3381 = field839[--Statics.field835];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3397 = 3;
            var3.field3381 = Statics.field4004.field1089.method5029();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dg.l(ILbd;ZB)I")
    public static int method2485(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class295 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class295.method2688(field839[--Statics.field835]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2386 : Statics.field840;
        }
        if (arg0 == 1300) {
            int var5 = field839[--Statics.field835] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5066(var5, field832[--Statics.field1479]);
                return 1;
            } else {
                Statics.field1479--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field835 -= 2;
            int var6 = field839[Statics.field835];
            int var7 = field839[Statics.field835 + 1];
            var4.field3383 = class295.method3387(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3425 = field839[--Statics.field835] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3423 = field839[--Statics.field835];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3424 = field839[--Statics.field835];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3420 = field832[--Statics.field1479];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3389 = field832[--Statics.field1479];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3421 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3477 = field839[--Statics.field835] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field835 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field839[Statics.field835 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field839[Statics.field835 + var10];
                        var9[var10 / 2] = (byte) field839[Statics.field835 + var10 + 1];
                    }
                }
            } else {
                Statics.field835 -= 2;
                var8 = new byte[] { (byte) field839[Statics.field835] };
                var9 = new byte[] { (byte) field839[Statics.field835 + 1] };
            }
            int var11 = field839[--Statics.field835] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method5247(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field835 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field839[Statics.field835] };
            byte[] var14 = new byte[] { (byte) field839[Statics.field835 + 1] };
            method5247(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field835 -= 3;
            int var15 = field839[Statics.field835] - 1;
            int var16 = field839[Statics.field835 + 1];
            int var17 = field839[Statics.field835 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method3160(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field839[--Statics.field835];
            int var20 = field839[--Statics.field835];
            method3160(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field835--;
            int var21 = field839[Statics.field835] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method1824(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method1824(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lg.q(Lky;I[B[BB)V")
    public static final void method5247(class295 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3416 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3416 = new byte[11][];
            arg0.field3486 = new byte[11][];
            arg0.field3418 = new int[11];
            arg0.field3419 = new int[11];
        }
        arg0.field3416[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3415 = false;
            for (int var4 = 0; var4 < arg0.field3416.length; var4++) {
                if (arg0.field3416[var4] != null) {
                    arg0.field3415 = true;
                    break;
                }
            }
        } else {
            arg0.field3415 = true;
        }
        arg0.field3486[arg1] = arg3;
    }

    @ObfuscatedName("fs.o(Lky;IIII)V")
    public static final void method3160(class295 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3418 == null) {
            throw new RuntimeException();
        }
        arg0.field3418[arg1] = arg2;
        arg0.field3419[arg1] = arg3;
    }

    @ObfuscatedName("bk.r(Lky;II)V")
    public static final void method1824(class295 arg0, int arg1) {
        if (arg0.field3416 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3485 == null) {
            arg0.field3485 = new int[arg0.field3416.length];
        }
        arg0.field3485[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("lo.p(ILbd;ZI)I")
    public static int method5498(int arg0, class72 arg1, boolean arg2) {
        class295 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class295.method2688(field839[--Statics.field835]);
        } else {
            var3 = arg2 ? Statics.field2386 : Statics.field840;
        }
        String var4 = field832[--Statics.field1479];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field839[--Statics.field835];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field839[--Statics.field835];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field832[--Statics.field1479];
            } else {
                var7[var8] = Integer.valueOf(field839[--Statics.field835]);
            }
        }
        int var9 = field839[--Statics.field835];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3429 = var7;
        } else if (arg0 == 1401) {
            var3.field3387 = var7;
        } else if (arg0 == 1402) {
            var3.field3431 = var7;
        } else if (arg0 == 1403) {
            var3.field3398 = var7;
        } else if (arg0 == 1404) {
            var3.field3380 = var7;
        } else if (arg0 == 1405) {
            var3.field3462 = var7;
        } else if (arg0 == 1406) {
            var3.field3439 = var7;
        } else if (arg0 == 1407) {
            var3.field3428 = var7;
            var3.field3441 = var5;
        } else if (arg0 == 1408) {
            var3.field3446 = var7;
        } else if (arg0 == 1409) {
            var3.field3447 = var7;
        } else if (arg0 == 1410) {
            var3.field3459 = var7;
        } else if (arg0 == 1411) {
            var3.field3430 = var7;
        } else if (arg0 == 1412) {
            var3.field3476 = var7;
        } else if (arg0 == 1414) {
            var3.field3442 = var7;
            var3.field3443 = var5;
        } else if (arg0 == 1415) {
            var3.field3444 = var7;
            var3.field3445 = var5;
        } else if (arg0 == 1416) {
            var3.field3438 = var7;
        } else if (arg0 == 1417) {
            var3.field3362 = var7;
        } else if (arg0 == 1418) {
            var3.field3349 = var7;
        } else if (arg0 == 1419) {
            var3.field3450 = var7;
        } else if (arg0 == 1420) {
            var3.field3453 = var7;
        } else if (arg0 == 1421) {
            var3.field3469 = var7;
        } else if (arg0 == 1422) {
            var3.field3475 = var7;
        } else if (arg0 == 1423) {
            var3.field3458 = var7;
        } else if (arg0 == 1424) {
            var3.field3432 = var7;
        } else if (arg0 == 1425) {
            var3.field3336 = var7;
        } else if (arg0 == 1426) {
            var3.field3433 = var7;
        } else if (arg0 == 1427) {
            var3.field3460 = var7;
        } else if (arg0 == 1428) {
            var3.field3455 = var7;
        } else if (arg0 == 1429) {
            var3.field3456 = var7;
        } else if (arg0 == 1430) {
            var3.field3417 = var7;
        } else if (arg0 == 1431) {
            var3.field3452 = var7;
        } else if (arg0 == 1434) {
            var3.field3463 = var7;
        } else {
            return 2;
        }
        var3.field3427 = true;
        return 1;
    }

    @ObfuscatedName("kw.w(ILbd;ZI)I")
    public static int method5196(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field2386 : Statics.field840;
        if (arg0 == 1500) {
            field839[++Statics.field835 - 1] = var3.field3365;
            return 1;
        } else if (arg0 == 1501) {
            field839[++Statics.field835 - 1] = var3.field3322;
            return 1;
        } else if (arg0 == 1502) {
            field839[++Statics.field835 - 1] = var3.field3351;
            return 1;
        } else if (arg0 == 1503) {
            field839[++Statics.field835 - 1] = var3.field3352;
            return 1;
        } else if (arg0 == 1504) {
            field839[++Statics.field835 - 1] = var3.field3356 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field839[++Statics.field835 - 1] = var3.field3426;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ei.d(ILbd;ZI)I")
    public static int method2722(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field2386 : Statics.field840;
        if (arg0 == 1700) {
            field839[++Statics.field835 - 1] = var3.field3335;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3335 == -1) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = var3.field3473;
            }
            return 1;
        } else if (arg0 == 1702) {
            field839[++Statics.field835 - 1] = var3.field3461;
            return 1;
        } else if (arg0 == 1707) {
            field839[++Statics.field835 - 1] = var3.method5140() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method2495(var3);
        } else if (arg0 == 1708) {
            return method5223(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("de.m(Lky;I)I")
    public static int method2495(class295 arg0) {
        if (arg0.field3338 == 11) {
            String var1 = field832[--Statics.field1479];
            field839[++Statics.field835 - 1] = arg0.method5073(var1);
            return 1;
        } else {
            Statics.field1479--;
            field839[++Statics.field835 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("ke.u(Lky;I)I")
    public static int method5223(class295 arg0) {
        if (arg0.field3338 == 11) {
            String var1 = field832[--Statics.field1479];
            field832[++Statics.field1479 - 1] = arg0.method5074(var1);
            return 1;
        } else {
            field832[Statics.field1479 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("cy.t(ILbd;ZI)I")
    public static int method2251(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field2386 : Statics.field840;
        if (arg0 == 1800) {
            field839[++Statics.field835 - 1] = class296.method3944(Statics.method5486(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field839[--Statics.field835];
            int var5 = var4 - 1;
            if (var3.field3421 == null || var5 >= var3.field3421.length || var3.field3421[var5] == null) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = var3.field3421[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3420 == null) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = var3.field3420;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cp.g(ILbd;ZB)I")
    public static int method2082(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field845 >= 10) {
                throw new RuntimeException();
            }
            class295 var10;
            if (arg0 >= 2000) {
                var10 = class295.method2688(field839[--Statics.field835]);
            } else {
                var10 = arg2 ? Statics.field2386 : Statics.field840;
            }
            if (var10.field3460 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1045 = var10;
            var11.field1035 = var10.field3460;
            var11.field1032 = field845 + 1;
            client.field710.method5530(var11);
            return 1;
        } else if (arg0 == 1928) {
            class295 var3 = arg2 ? Statics.field2386 : Statics.field840;
            int var4 = field839[--Statics.field835];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class94 var5 = new class94(var4, var3.field3449, var3.field3461, var3.field3335);
            field844.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field835 -= 3;
            int var6 = field839[Statics.field835];
            int var7 = field839[Statics.field835 + 1];
            int var8 = field839[Statics.field835 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class94 var9 = new class94(var8, var6, var7, class295.method2688(var6).field3335);
            field844.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.x(ILbd;ZI)I")
    public static int method1061(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = class295.method2688(field839[--Statics.field835]);
        if (arg0 == 2500) {
            field839[++Statics.field835 - 1] = var3.field3365;
            return 1;
        } else if (arg0 == 2501) {
            field839[++Statics.field835 - 1] = var3.field3322;
            return 1;
        } else if (arg0 == 2502) {
            field839[++Statics.field835 - 1] = var3.field3351;
            return 1;
        } else if (arg0 == 2503) {
            field839[++Statics.field835 - 1] = var3.field3352;
            return 1;
        } else if (arg0 == 2504) {
            field839[++Statics.field835 - 1] = var3.field3356 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field839[++Statics.field835 - 1] = var3.field3426;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ei.a(ILbd;ZB)I")
    public static int method2721(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = class295.method2688(field839[--Statics.field835]);
        if (arg0 == 2600) {
            field839[++Statics.field835 - 1] = var3.field3357;
            return 1;
        } else if (arg0 == 2601) {
            field839[++Statics.field835 - 1] = var3.field3358;
            return 1;
        } else if (arg0 == 2602) {
            field832[++Statics.field1479 - 1] = var3.field3422;
            return 1;
        } else if (arg0 == 2603) {
            field839[++Statics.field835 - 1] = var3.field3367;
            return 1;
        } else if (arg0 == 2604) {
            field839[++Statics.field835 - 1] = var3.field3360;
            return 1;
        } else if (arg0 == 2605) {
            field839[++Statics.field835 - 1] = var3.field3391;
            return 1;
        } else if (arg0 == 2606) {
            field839[++Statics.field835 - 1] = var3.field3388;
            return 1;
        } else if (arg0 == 2607) {
            field839[++Statics.field835 - 1] = var3.field3327;
            return 1;
        } else if (arg0 == 2608) {
            field839[++Statics.field835 - 1] = var3.field3384;
            return 1;
        } else if (arg0 == 2609) {
            field839[++Statics.field835 - 1] = var3.field3457;
            return 1;
        } else if (arg0 == 2610) {
            field839[++Statics.field835 - 1] = var3.field3435;
            return 1;
        } else if (arg0 == 2611) {
            field839[++Statics.field835 - 1] = var3.field3361;
            return 1;
        } else if (arg0 == 2612) {
            field839[++Statics.field835 - 1] = var3.field3395;
            return 1;
        } else if (arg0 == 2613) {
            field839[++Statics.field835 - 1] = var3.field3378.method38();
            return 1;
        } else if (arg0 == 2614) {
            field839[++Statics.field835 - 1] = var3.field3359 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field835++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jw.y(ILbd;ZB)I")
    public static int method4708(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class295 var3 = class295.method2688(field839[--Statics.field835]);
            field839[++Statics.field835 - 1] = var3.field3335;
            return 1;
        } else if (arg0 == 2701) {
            class295 var4 = class295.method2688(field839[--Statics.field835]);
            if (var4.field3335 == -1) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = var4.field3473;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field839[--Statics.field835];
            class80 var6 = (class80) client.field534.method6772((long) var5);
            if (var6 == null) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field839[++Statics.field835 - 1] = client.field523;
            return 1;
        } else if (arg0 == 1707) {
            class295 var7 = class295.method2688(field839[--Statics.field835]);
            field839[++Statics.field835 - 1] = var7.method5140() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            class295 var8 = class295.method2688(field839[--Statics.field835]);
            return method2495(var8);
        } else if (arg0 == 1708) {
            class295 var9 = class295.method2688(field839[--Statics.field835]);
            return method5223(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dh.j(ILbd;ZI)I")
    public static int method2686(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = class295.method2688(field839[--Statics.field835]);
        if (arg0 == 2800) {
            field839[++Statics.field835 - 1] = class296.method3944(Statics.method5486(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field839[--Statics.field835];
            int var5 = var4 - 1;
            if (var3.field3421 == null || var5 >= var3.field3421.length || var3.field3421[var5] == null) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = var3.field3421[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3420 == null) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = var3.field3420;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("by.e(ILbd;ZI)I")
    public static int method1888(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field832[--Statics.field1479];
            class99.method2077(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field835 -= 2;
            client.method1073(Statics.field4004, field839[Statics.field835], field839[Statics.field835 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field843) {
                field842 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field832[--Statics.field1479];
            int var5 = 0;
            if (class348.method5206(var4)) {
                var5 = class348.method283(var4);
            }
            class265 var6 = class265.method3935(class263.field2938, client.field685.field1328);
            var6.field3019.method6957(var5);
            client.field685.method2395(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field832[--Statics.field1479];
            class265 var8 = class265.method3935(class263.field2993, client.field685.field1328);
            var8.field3019.method6954(var7.length() + 1);
            var8.field3019.method7142(var7);
            client.field685.method2395(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field832[--Statics.field1479];
            class265 var10 = class265.method3935(class263.field2981, client.field685.field1328);
            var10.field3019.method6954(var9.length() + 1);
            var10.field3019.method7142(var9);
            client.field685.method2395(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field839[--Statics.field835];
            String var12 = field832[--Statics.field1479];
            client.method4839(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field835 -= 3;
            int var13 = field839[Statics.field835];
            int var14 = field839[Statics.field835 + 1];
            int var15 = field839[Statics.field835 + 2];
            class295 var16 = class295.method2688(var15);
            client.method3260(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field835 -= 2;
            int var17 = field839[Statics.field835];
            int var18 = field839[Statics.field835 + 1];
            class295 var19 = arg2 ? Statics.field2386 : Statics.field840;
            client.method3260(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field3560 = field839[--Statics.field835] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field839[++Statics.field835 - 1] = Statics.field1541.method2159() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1541.method2142(field839[--Statics.field835] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field832[--Statics.field1479];
            boolean var21 = field839[--Statics.field835] == 1;
            class30.method6446(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field839[--Statics.field835];
            class265 var23 = class265.method3935(class263.field2963, client.field685.field1328);
            var23.field3019.method6955(var22);
            client.field685.method2395(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field839[--Statics.field835];
            Statics.field1479 -= 2;
            String var25 = field832[Statics.field1479];
            String var26 = field832[Statics.field1479 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class265 var27 = class265.method3935(class263.field2927, client.field685.field1328);
                var27.field3019.method6955(1 + class438.method6861(var25) + class438.method6861(var26));
                var27.field3019.method7142(var26);
                var27.field3019.method7142(var25);
                var27.field3019.method7000(var24);
                client.field685.method2395(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field638 = field839[--Statics.field835] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field654 = field839[--Statics.field835] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field502 = field839[--Statics.field835] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field839[--Statics.field835] == 1) {
                client.field626 |= 0x1;
            } else {
                client.field626 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field839[--Statics.field835] == 1) {
                client.field626 |= 0x2;
            } else {
                client.field626 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field839[--Statics.field835] == 1) {
                client.field626 |= 0x4;
            } else {
                client.field626 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field839[--Statics.field835] == 1) {
                client.field626 |= 0x8;
            } else {
                client.field626 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field626 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field735 = field839[--Statics.field835] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field620 = field839[--Statics.field835] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method1884(field839[--Statics.field835] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field839[++Statics.field835 - 1] = client.method6112() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field835 -= 2;
            client.field585 = field839[Statics.field835];
            client.field722 = field839[Statics.field835 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field835 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 3132) {
            field839[++Statics.field835 - 1] = Statics.field1798;
            field839[++Statics.field835 - 1] = Statics.field4019;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field835 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field669 = 3;
            client.field629 = field839[--Statics.field835];
            return 1;
        } else if (arg0 == 3137) {
            client.field669 = 2;
            client.field629 = field839[--Statics.field835];
            return 1;
        } else if (arg0 == 3138) {
            client.field669 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field669 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field669 = 3;
            client.field629 = arg2 ? Statics.field2386.field3449 : Statics.field840.field3449;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field839[--Statics.field835] == 1;
            Statics.field1541.method2126(var28);
            return 1;
        } else if (arg0 == 3142) {
            field839[++Statics.field835 - 1] = Statics.field1541.method2213() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field839[--Statics.field835] == 1;
            client.field539 = var29;
            if (!var29) {
                Statics.field1541.method2182("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field839[++Statics.field835 - 1] = client.field539 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field839[--Statics.field835] == 1;
            Statics.field1541.method2133(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field839[++Statics.field835 - 1] = Statics.field1541.method2175() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field839[++Statics.field835 - 1] = class69.field892;
            return 1;
        } else if (arg0 == 3154) {
            field839[++Statics.field835 - 1] = client.method3016();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1479--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field835 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field835--;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field835--;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1479--;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field835--;
            field832[++Statics.field1479 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field835--;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field835 -= 2;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field835 -= 2;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field835 -= 2;
            field832[++Statics.field1479 - 1] = "";
            field832[++Statics.field1479 - 1] = "";
            field832[++Statics.field1479 - 1] = "";
            field832[++Statics.field1479 - 1] = "";
            field832[++Statics.field1479 - 1] = "";
            field832[++Statics.field1479 - 1] = "";
            field832[++Statics.field1479 - 1] = "";
            field832[++Statics.field1479 - 1] = "";
            field832[++Statics.field1479 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field835--;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 3175) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1479--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1479--;
            return 1;
        } else if (arg0 == 3181) {
            client.method2528(field839[--Statics.field835]);
            return 1;
        } else if (arg0 == 3182) {
            field839[++Statics.field835 - 1] = client.method3241();
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 3187) {
            Statics.field1479 -= 2;
            return 1;
        } else if (arg0 == 3188) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("in.h(ILbd;ZB)I")
    public static int method4602(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field839[++Statics.field835 - 1] = client.field507;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field835 -= 2;
            int var3 = field839[Statics.field835];
            int var4 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = class78.method2001(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field835 -= 2;
            int var5 = field839[Statics.field835];
            int var6 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = class78.method6320(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field835 -= 2;
            int var7 = field839[Statics.field835];
            int var8 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = class78.method1826(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class170.method1909(var9).field1797;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.field680[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.field639[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.field777[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field99;
            int var14 = (Statics.field4004.field1132 >> 7) + Statics.field489;
            int var15 = (Statics.field4004.field1116 >> 7) + Statics.field1843;
            field839[++Statics.field835 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field839[++Statics.field835 - 1] = client.field495 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field835 -= 2;
            int var19 = field839[Statics.field835] + 32768;
            int var20 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = class78.method2001(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field835 -= 2;
            int var21 = field839[Statics.field835] + 32768;
            int var22 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = class78.method6320(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field835 -= 2;
            int var23 = field839[Statics.field835] + 32768;
            int var24 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = class78.method1826(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field676 >= 2) {
                field839[++Statics.field835 - 1] = client.field676;
            } else {
                field839[++Statics.field835 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field839[++Statics.field835 - 1] = client.field513;
            return 1;
        } else if (arg0 == 3318) {
            field839[++Statics.field835 - 1] = client.field723;
            return 1;
        } else if (arg0 == 3321) {
            field839[++Statics.field835 - 1] = client.field566;
            return 1;
        } else if (arg0 == 3322) {
            field839[++Statics.field835 - 1] = client.field640;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field678) {
                field839[++Statics.field835 - 1] = 1;
            } else {
                field839[++Statics.field835 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field839[++Statics.field835 - 1] = client.field668;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field835 -= 4;
            int var25 = field839[Statics.field835];
            int var26 = field839[Statics.field835 + 1];
            int var27 = field839[Statics.field835 + 2];
            int var28 = field839[Statics.field835 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field839[++Statics.field835 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field839[++Statics.field835 - 1] = client.field509;
            return 1;
        } else if (arg0 == 3327) {
            field839[++Statics.field835 - 1] = client.field510;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.ae(ILbd;ZI)I")
    public static int method1897(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field835 -= 2;
            int var3 = field839[Statics.field835];
            int var4 = field839[Statics.field835 + 1];
            class177 var5 = class177.method1991(var3);
            if (var5.field1876 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1882; var6++) {
                if (var5.field1879[var6] == var4) {
                    field832[++Statics.field1479 - 1] = var5.field1881[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field832[++Statics.field1479 - 1] = var5.field1880;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field835 -= 4;
            int var7 = field839[Statics.field835];
            int var8 = field839[Statics.field835 + 1];
            int var9 = field839[Statics.field835 + 2];
            int var10 = field839[Statics.field835 + 3];
            class177 var11 = class177.method1991(var9);
            if (var11.field1878 != var7 || var11.field1876 != var8) {
                if (var8 == 115) {
                    field832[++Statics.field1479 - 1] = class309.field3599;
                } else {
                    field839[++Statics.field835 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1882; var12++) {
                if (var11.field1879[var12] == var10) {
                    if (var8 == 115) {
                        field832[++Statics.field1479 - 1] = var11.field1881[var12];
                    } else {
                        field839[++Statics.field835 - 1] = var11.field1884[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field832[++Statics.field1479 - 1] = var11.field1880;
                } else {
                    field839[++Statics.field835 - 1] = var11.field1885;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field839[--Statics.field835];
            class177 var14 = class177.method1991(var13);
            field839[++Statics.field835 - 1] = var14.method3148();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mi.aq(ILbd;ZI)I")
    public static int method5988(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class24.method4675(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class24.method1067(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class24.method1075(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("je.aw(ILbd;ZB)I")
    public static int method4964(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field399.field806 == 0) {
                field839[++Statics.field835 - 1] = -2;
            } else if (Statics.field399.field806 == 1) {
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = Statics.field399.field802.method6129();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field839[--Statics.field835];
            if (Statics.field399.method1597() && var3 >= 0 && var3 < Statics.field399.field802.method6129()) {
                class367 var4 = (class367) Statics.field399.field802.method6139(var3);
                field832[++Statics.field1479 - 1] = var4.method6107();
                field832[++Statics.field1479 - 1] = var4.method6106();
            } else {
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field839[--Statics.field835];
            if (Statics.field399.method1597() && var5 >= 0 && var5 < Statics.field399.field802.method6129()) {
                field839[++Statics.field835 - 1] = ((class375) Statics.field399.field802.method6139(var5)).field4269;
            } else {
                field839[++Statics.field835 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field839[--Statics.field835];
            if (Statics.field399.method1597() && var6 >= 0 && var6 < Statics.field399.field802.method6129()) {
                field839[++Statics.field835 - 1] = ((class375) Statics.field399.field802.method6139(var6)).field4267;
            } else {
                field839[++Statics.field835 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field832[--Statics.field1479];
            int var8 = field839[--Statics.field835];
            class62.method3558(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field832[--Statics.field1479];
            Statics.field399.method1604(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field832[--Statics.field1479];
            Statics.field399.method1608(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field832[--Statics.field1479];
            Statics.field399.method1606(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field832[--Statics.field1479];
            Statics.field399.method1640(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field832[--Statics.field1479];
            String var14 = client.method2970(var13);
            field839[++Statics.field835 - 1] = Statics.field399.method1602(new class459(var14, Statics.field1480), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field3004 == null) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = Statics.field3004.field4240;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field3004 == null) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = Statics.field3004.method6129();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field839[--Statics.field835];
            if (Statics.field3004 == null || var15 >= Statics.field3004.method6129()) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = Statics.field3004.method6139(var15).method6104().method7528();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field839[--Statics.field835];
            if (Statics.field3004 == null || var16 >= Statics.field3004.method6129()) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = ((class375) Statics.field3004.method6139(var16)).method6210();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field839[--Statics.field835];
            if (Statics.field3004 == null || var17 >= Statics.field3004.method6129()) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = ((class375) Statics.field3004.method6139(var17)).field4267;
            }
            return 1;
        } else if (arg0 == 3616) {
            field839[++Statics.field835 - 1] = Statics.field3004 == null ? 0 : Statics.field3004.field4246;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field832[--Statics.field1479];
            client.method4780(var18);
            return 1;
        } else if (arg0 == 3618) {
            field839[++Statics.field835 - 1] = Statics.field3004 == null ? 0 : Statics.field3004.field4244;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field832[--Statics.field1479];
            client.method3073(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method3937();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field399.method1597()) {
                field839[++Statics.field835 - 1] = Statics.field399.field807.method6129();
            } else {
                field839[++Statics.field835 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field839[--Statics.field835];
            if (Statics.field399.method1597() && var20 >= 0 && var20 < Statics.field399.field807.method6129()) {
                class374 var21 = (class374) Statics.field399.field807.method6139(var20);
                field832[++Statics.field1479 - 1] = var21.method6107();
                field832[++Statics.field1479 - 1] = var21.method6106();
            } else {
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field832[--Statics.field1479];
            String var23 = client.method2970(var22);
            field839[++Statics.field835 - 1] = Statics.field399.method1603(new class459(var23, Statics.field1480)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field839[--Statics.field835];
            if (Statics.field3004 == null || var24 >= Statics.field3004.method6129() || !Statics.field3004.method6139(var24).method6104().equals(Statics.field4004.field1073)) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field3004 == null || Statics.field3004.field4242 == null) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = Statics.field3004.field4242;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field839[--Statics.field835];
            if (Statics.field3004 == null || var25 >= Statics.field3004.method6129() || !((class370) Statics.field3004.method6139(var25)).method6087()) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field839[--Statics.field835];
            if (Statics.field3004 == null || var26 >= Statics.field3004.method6129() || !((class370) Statics.field3004.method6139(var26)).method6101()) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field399.field802.method6196();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class443(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class444(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class108(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class104(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class107(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class112(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class106(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class105(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class109(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class110(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field399.field802.method6161();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field399.field807.method6196();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field839[--Statics.field835] == 1;
            Statics.field399.field807.method6203(new class443(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field839[--Statics.field835] == 1;
            Statics.field399.field807.method6203(new class444(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field399.field807.method6161();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field3004 != null) {
                Statics.field3004.method6196();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class443(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class444(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class108(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class104(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class107(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class112(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class106(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class105(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class109(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class110(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field3004 != null) {
                Statics.field3004.method6161();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field839[--Statics.field835] == 1;
            Statics.field399.field802.method6203(new class111(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field839[--Statics.field835] == 1;
            if (Statics.field3004 != null) {
                Statics.field3004.method6203(new class111(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iy.am(ILbd;ZI)I")
    public static int method4609(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field835--;
            Statics.field1479--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field835++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("he.ak(ILbd;ZI)I")
    public static int method3898(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1693 == null) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = 1;
                Statics.field3270 = Statics.field1693;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field839[--Statics.field835];
            if (client.field736[var3] == null) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = 1;
                Statics.field3270 = client.field736[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field832[++Statics.field1479 - 1] = Statics.field3270.field1589;
            return 1;
        } else if (arg0 == 3803) {
            field839[++Statics.field835 - 1] = Statics.field3270.field1598 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field839[++Statics.field835 - 1] = Statics.field3270.field1592;
            return 1;
        } else if (arg0 == 3805) {
            field839[++Statics.field835 - 1] = Statics.field3270.field1593;
            return 1;
        } else if (arg0 == 3806) {
            field839[++Statics.field835 - 1] = Statics.field3270.field1594;
            return 1;
        } else if (arg0 == 3807) {
            field839[++Statics.field835 - 1] = Statics.field3270.field1607;
            return 1;
        } else if (arg0 == 3809) {
            field839[++Statics.field835 - 1] = Statics.field3270.field1596;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field839[--Statics.field835];
            field832[++Statics.field1479 - 1] = Statics.field3270.field1591[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = Statics.field3270.field1611[var5];
            return 1;
        } else if (arg0 == 3812) {
            field839[++Statics.field835 - 1] = Statics.field3270.field1588;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field839[--Statics.field835];
            field832[++Statics.field1479 - 1] = Statics.field3270.field1595[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field835 -= 3;
            int var7 = field839[Statics.field835];
            int var8 = field839[Statics.field835 + 1];
            int var9 = field839[Statics.field835 + 2];
            field839[++Statics.field835 - 1] = Statics.field3270.method2731(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field839[++Statics.field835 - 1] = Statics.field3270.field1603;
            return 1;
        } else if (arg0 == 3816) {
            field839[++Statics.field835 - 1] = Statics.field3270.field1605;
            return 1;
        } else if (arg0 == 3817) {
            field839[++Statics.field835 - 1] = Statics.field3270.method2730(field832[--Statics.field1479]);
            return 1;
        } else if (arg0 == 3818) {
            field839[Statics.field835 - 1] = Statics.field3270.method2733()[field839[Statics.field835 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field835 -= 2;
            int var10 = field839[Statics.field835];
            int var11 = field839[Statics.field835 + 1];
            client.method259(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = Statics.field3270.field1601[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field835 -= 3;
                int var13 = field839[Statics.field835];
                boolean var14 = field839[Statics.field835 + 1] == 1;
                int var15 = field839[Statics.field835 + 2];
                client.method2855(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field839[--Statics.field835];
                field839[++Statics.field835 - 1] = Statics.field3270.field1602[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field114 == null) {
                    field839[++Statics.field835 - 1] = 0;
                } else {
                    field839[++Statics.field835 - 1] = 1;
                    Statics.field809 = Statics.field114;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field839[--Statics.field835];
                if (client.field737[var17] == null) {
                    field839[++Statics.field835 - 1] = 0;
                } else {
                    field839[++Statics.field835 - 1] = 1;
                    Statics.field809 = client.field737[var17];
                    Statics.field1256 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field832[++Statics.field1479 - 1] = Statics.field809.field1658;
                return 1;
            } else if (arg0 == 3853) {
                field839[++Statics.field835 - 1] = Statics.field809.field1660;
                return 1;
            } else if (arg0 == 3854) {
                field839[++Statics.field835 - 1] = Statics.field809.field1655;
                return 1;
            } else if (arg0 == 3855) {
                field839[++Statics.field835 - 1] = Statics.field809.method2837();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field839[--Statics.field835];
                field832[++Statics.field1479 - 1] = ((class131) Statics.field809.field1653.get(var18)).field1528.method7528();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field839[--Statics.field835];
                field839[++Statics.field835 - 1] = ((class131) Statics.field809.field1653.get(var19)).field1534;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field839[--Statics.field835];
                field839[++Statics.field835 - 1] = ((class131) Statics.field809.field1653.get(var20)).field1529;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field839[--Statics.field835];
                client.method2224(Statics.field1256, var21);
                return 1;
            } else if (arg0 == 3860) {
                field839[++Statics.field835 - 1] = Statics.field809.method2834(field832[--Statics.field1479]);
                return 1;
            } else if (arg0 == 3861) {
                field839[Statics.field835 - 1] = Statics.field809.method2831()[field839[Statics.field835 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field839[++Statics.field835 - 1] = Statics.field1886 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("cz.ao(ILbd;ZB)I")
    public static int method2014(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.field778[var3].method5446();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.field778[var4].field4028;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.field778[var5].field4027;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.field778[var6].field4033;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.field778[var7].field4029;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.field778[var8].field4031;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field839[--Statics.field835];
            int var10 = client.field778[var9].method5438();
            field839[++Statics.field835 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field839[--Statics.field835];
            int var12 = client.field778[var11].method5438();
            field839[++Statics.field835 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field839[--Statics.field835];
            int var14 = client.field778[var13].method5438();
            field839[++Statics.field835 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field839[--Statics.field835];
            int var16 = client.field778[var15].method5438();
            field839[++Statics.field835 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field839[--Statics.field835] == 1;
            if (Statics.field1069 != null) {
                Statics.field1069.method5392(class318.field4007, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field839[--Statics.field835] == 1;
            if (Statics.field1069 != null) {
                Statics.field1069.method5392(class318.field4006, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field835 -= 2;
            boolean var19 = field839[Statics.field835] == 1;
            boolean var20 = field839[Statics.field835 + 1] == 1;
            if (Statics.field1069 != null) {
                client.field632.field488 = var20;
                Statics.field1069.method5392(client.field632, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field839[--Statics.field835] == 1;
            if (Statics.field1069 != null) {
                Statics.field1069.method5392(class318.field4005, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field839[--Statics.field835] == 1;
            if (Statics.field1069 != null) {
                Statics.field1069.method5392(class318.field4008, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field839[++Statics.field835 - 1] = Statics.field1069 == null ? 0 : Statics.field1069.field4010.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field839[--Statics.field835];
            class324 var24 = (class324) Statics.field1069.field4010.get(var23);
            field839[++Statics.field835 - 1] = var24.field4022;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field839[--Statics.field835];
            class324 var26 = (class324) Statics.field1069.field4010.get(var25);
            field832[++Statics.field1479 - 1] = var26.method5432();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field839[--Statics.field835];
            class324 var28 = (class324) Statics.field1069.field4010.get(var27);
            field832[++Statics.field1479 - 1] = var28.method5433();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field839[--Statics.field835];
            class324 var30 = (class324) Statics.field1069.field4010.get(var29);
            long var31 = class270.method2724() - Statics.field2389 - var30.field4025;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field832[++Statics.field1479 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field839[--Statics.field835];
            class324 var38 = (class324) Statics.field1069.field4010.get(var37);
            field839[++Statics.field835 - 1] = var38.field4023.field4033;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field839[--Statics.field835];
            class324 var40 = (class324) Statics.field1069.field4010.get(var39);
            field839[++Statics.field835 - 1] = var40.field4023.field4027;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field839[--Statics.field835];
            class324 var42 = (class324) Statics.field1069.field4010.get(var41);
            field839[++Statics.field835 - 1] = var42.field4023.field4028;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kv.aj(ILbd;ZI)I")
    public static int method5231(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field835 -= 2;
            int var3 = field839[Statics.field835];
            int var4 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field835 -= 2;
            int var5 = field839[Statics.field835];
            int var6 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field835 -= 2;
            int var7 = field839[Statics.field835];
            int var8 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field835 -= 2;
            int var9 = field839[Statics.field835];
            int var10 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field835 -= 5;
            int var13 = field839[Statics.field835];
            int var14 = field839[Statics.field835 + 1];
            int var15 = field839[Statics.field835 + 2];
            int var16 = field839[Statics.field835 + 3];
            int var17 = field839[Statics.field835 + 4];
            field839[++Statics.field835 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field835 -= 2;
            int var18 = field839[Statics.field835];
            int var19 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field835 -= 2;
            int var20 = field839[Statics.field835];
            int var21 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field835 -= 2;
            int var22 = field839[Statics.field835];
            int var23 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field835 -= 2;
            int var24 = field839[Statics.field835];
            int var25 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field835 -= 2;
            int var26 = field839[Statics.field835];
            int var27 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field835 -= 2;
            int var28 = field839[Statics.field835];
            int var29 = field839[Statics.field835 + 1];
            if (var28 == 0) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field835 -= 2;
            int var30 = field839[Statics.field835];
            int var31 = field839[Statics.field835 + 1];
            if (var30 == 0) {
                field839[++Statics.field835 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field839[++Statics.field835 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field839[++Statics.field835 - 1] = var30;
                    break;
                case 2:
                    field839[++Statics.field835 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field839[++Statics.field835 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field839[++Statics.field835 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field839[++Statics.field835 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field835 -= 2;
            int var32 = field839[Statics.field835];
            int var33 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field835 -= 2;
            int var34 = field839[Statics.field835];
            int var35 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field835 -= 3;
            long var36 = (long) field839[Statics.field835];
            long var38 = (long) field839[Statics.field835 + 1];
            long var40 = (long) field839[Statics.field835 + 2];
            field839[++Statics.field835 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class272.method2859(field839[--Statics.field835]);
            field839[++Statics.field835 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field835 -= 2;
            int var43 = field839[Statics.field835];
            int var44 = field839[Statics.field835 + 1];
            field839[++Statics.field835 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field835 -= 3;
            int var45 = field839[Statics.field835];
            int var46 = field839[Statics.field835 + 1];
            int var47 = field839[Statics.field835 + 2];
            field839[++Statics.field835 - 1] = class272.method4604(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field835 -= 3;
            int var48 = field839[Statics.field835];
            int var49 = field839[Statics.field835 + 1];
            int var50 = field839[Statics.field835 + 2];
            field839[++Statics.field835 - 1] = class272.method1595(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field835 -= 3;
            int var51 = field839[Statics.field835];
            int var52 = field839[Statics.field835 + 1];
            int var53 = field839[Statics.field835 + 2];
            int var54 = 31 - var53;
            field839[++Statics.field835 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field835 -= 4;
            int var55 = field839[Statics.field835];
            int var56 = field839[Statics.field835 + 1];
            int var57 = field839[Statics.field835 + 2];
            int var58 = field839[Statics.field835 + 3];
            int var59 = class272.method1595(var55, var57, var58);
            int var60 = class272.method1015(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field839[++Statics.field835 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field839[Statics.field835 - 1] = class401.method2240(field839[Statics.field835 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field839[Statics.field835 - 1] = class401.method2817(field839[Statics.field835 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field835 -= 2;
            int var61 = field839[Statics.field835];
            int var62 = field839[Statics.field835 + 1];
            int var63 = class401.method3545(var61, var62);
            field839[++Statics.field835 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field839[Statics.field835 - 1] = Math.abs(field839[Statics.field835 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ho.al(ILbd;ZI)I")
    public static int method3939(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field832[--Statics.field1479];
            int var4 = field839[--Statics.field835];
            field832[++Statics.field1479 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1479 -= 2;
            String var5 = field832[Statics.field1479];
            String var6 = field832[Statics.field1479 + 1];
            field832[++Statics.field1479 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field832[--Statics.field1479];
            int var8 = field839[--Statics.field835];
            field832[++Statics.field1479 - 1] = var7 + class348.method4030(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field832[--Statics.field1479];
            field832[++Statics.field1479 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field839[--Statics.field835];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field838.setTime(new Date(var11));
            int var13 = field838.get(5);
            int var14 = field838.get(2);
            int var15 = field838.get(1);
            field832[++Statics.field1479 - 1] = var13 + "-" + field841[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1479 -= 2;
            String var16 = field832[Statics.field1479];
            String var17 = field832[Statics.field1479 + 1];
            if (Statics.field4004.field1089 != null && Statics.field4004.field1089.field3299) {
                field832[++Statics.field1479 - 1] = var17;
            } else {
                field832[++Statics.field1479 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field839[--Statics.field835];
            field832[++Statics.field1479 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1479 -= 2;
            field839[++Statics.field835 - 1] = class348.method2696(class349.method5237(field832[Statics.field1479], field832[Statics.field1479 + 1], Statics.field3523));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field832[--Statics.field1479];
            Statics.field835 -= 2;
            int var20 = field839[Statics.field835];
            int var21 = field839[Statics.field835 + 1];
            byte[] var22 = Statics.field1783.method5296(var21, 0);
            class344 var23 = new class344(var22);
            field839[++Statics.field835 - 1] = var23.method5744(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field832[--Statics.field1479];
            Statics.field835 -= 2;
            int var25 = field839[Statics.field835];
            int var26 = field839[Statics.field835 + 1];
            byte[] var27 = Statics.field1783.method5296(var26, 0);
            class344 var28 = new class344(var27);
            field839[++Statics.field835 - 1] = var28.method5743(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1479 -= 2;
            String var29 = field832[Statics.field1479];
            String var30 = field832[Statics.field1479 + 1];
            if (field839[--Statics.field835] == 1) {
                field832[++Statics.field1479 - 1] = var29;
            } else {
                field832[++Statics.field1479 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field832[--Statics.field1479];
            field832[++Statics.field1479 - 1] = class345.method5745(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field832[--Statics.field1479];
            int var33 = field839[--Statics.field835];
            field832[++Statics.field1479 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class348.method2184((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class348.method2698((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class348.method736((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class348.method3075((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field832[--Statics.field1479];
            if (var38 == null) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field832[--Statics.field1479];
            Statics.field835 -= 2;
            int var40 = field839[Statics.field835];
            int var41 = field839[Statics.field835 + 1];
            field832[++Statics.field1479 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field832[--Statics.field1479];
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
            field832[++Statics.field1479 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field832[--Statics.field1479];
            int var48 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1479 -= 2;
            String var49 = field832[Statics.field1479];
            String var50 = field832[Statics.field1479 + 1];
            int var51 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field832[--Statics.field1479];
            field832[++Statics.field1479 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lz.av(ILbd;ZI)I")
    public static int method5388(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field839[--Statics.field835];
            field832[++Statics.field1479 - 1] = Statics.method268(var3).field2076;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field835 -= 2;
            int var4 = field839[Statics.field835];
            int var5 = field839[Statics.field835 + 1];
            class189 var6 = Statics.method268(var4);
            if (var5 < 1 || var5 > 5 || var6.field2111[var5 - 1] == null) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = var6.field2111[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field835 -= 2;
            int var7 = field839[Statics.field835];
            int var8 = field839[Statics.field835 + 1];
            class189 var9 = Statics.method268(var7);
            if (var8 < 1 || var8 > 5 || var9.field2091[var8 - 1] == null) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = var9.field2091[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = Statics.method268(var10).field2073;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = Statics.method268(var11).field2087 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field839[--Statics.field835];
            class189 var13 = Statics.method268(var12);
            if (var13.field2108 == -1 && var13.field2085 >= 0) {
                field839[++Statics.field835 - 1] = var13.field2085;
            } else {
                field839[++Statics.field835 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field839[--Statics.field835];
            class189 var15 = Statics.method268(var14);
            if (var15.field2108 >= 0 && var15.field2085 >= 0) {
                field839[++Statics.field835 - 1] = var15.field2085;
            } else {
                field839[++Statics.field835 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = Statics.method268(var16).field2080 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field839[--Statics.field835];
            class189 var18 = Statics.method268(var17);
            if (var18.field2120 == -1 && var18.field2117 >= 0) {
                field839[++Statics.field835 - 1] = var18.field2117;
            } else {
                field839[++Statics.field835 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field839[--Statics.field835];
            class189 var20 = Statics.method268(var19);
            if (var20.field2120 >= 0 && var20.field2117 >= 0) {
                field839[++Statics.field835 - 1] = var20.field2117;
            } else {
                field839[++Statics.field835 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field832[--Statics.field1479];
            int var22 = field839[--Statics.field835];
            client.method130(var21, var22 == 1);
            field839[++Statics.field835 - 1] = Statics.field966;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1113 == null || Statics.field217 >= Statics.field966) {
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = Statics.field1113[++Statics.field217 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field217 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field839[--Statics.field835];
            int var24 = Statics.method268(var23).method3384();
            if (var24 == -1) {
                field839[++Statics.field835 - 1] = var24;
            } else {
                field839[++Statics.field835 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("en.at(ILbd;ZI)I")
    public static int method2861(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field839[++Statics.field835 - 1] = client.field727;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field835 -= 3;
            client.field727 = field839[Statics.field835];
            Statics.field218 = class455.method3017(field839[Statics.field835 + 1]);
            if (Statics.field218 == null) {
                Statics.field218 = class455.field4740;
            }
            client.field728 = field839[Statics.field835 + 2];
            class265 var3 = class265.method3935(class263.field2917, client.field685.field1328);
            var3.field3019.method6954(client.field727);
            var3.field3019.method6954(Statics.field218.field4741);
            var3.field3019.method6954(client.field728);
            client.field685.method2395(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field832[--Statics.field1479];
            Statics.field835 -= 2;
            int var5 = field839[Statics.field835];
            int var6 = field839[Statics.field835 + 1];
            class265 var7 = class265.method3935(class263.field2929, client.field685.field1328);
            var7.field3019.method6954(class438.method6861(var4) + 2);
            var7.field3019.method7142(var4);
            var7.field3019.method6954(var5 - 1);
            var7.field3019.method6954(var6);
            client.field685.method2395(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field835 -= 2;
            int var8 = field839[Statics.field835];
            int var9 = field839[Statics.field835 + 1];
            class58 var10 = class99.method5018(var8, var9);
            if (var10 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = var10.field479;
                field839[++Statics.field835 - 1] = var10.field470;
                field832[++Statics.field1479 - 1] = var10.field472 == null ? "" : var10.field472;
                field832[++Statics.field1479 - 1] = var10.field476 == null ? "" : var10.field476;
                field832[++Statics.field1479 - 1] = var10.field474 == null ? "" : var10.field474;
                field839[++Statics.field835 - 1] = var10.method1026() ? 1 : (var10.method1029() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field839[--Statics.field835];
            class58 var12 = class99.method2283(var11);
            if (var12 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = var12.field471;
                field839[++Statics.field835 - 1] = var12.field470;
                field832[++Statics.field1479 - 1] = var12.field472 == null ? "" : var12.field472;
                field832[++Statics.field1479 - 1] = var12.field476 == null ? "" : var12.field476;
                field832[++Statics.field1479 - 1] = var12.field474 == null ? "" : var12.field474;
                field839[++Statics.field835 - 1] = var12.method1026() ? 1 : (var12.method1029() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field218 == null) {
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = Statics.field218.field4741;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field832[--Statics.field1479];
            int var14 = field839[--Statics.field835];
            class265 var15 = class460.method6247(var14, var13, Statics.field3523, -1);
            client.field685.method2395(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1479 -= 2;
            String var16 = field832[Statics.field1479];
            String var17 = field832[Statics.field1479 + 1];
            class265 var18 = class265.method3935(class263.field2908, client.field685.field1328);
            var18.field3019.method6955(0);
            int var19 = var18.field3019.field4621;
            var18.field3019.method7142(var16);
            class283.method4947(var18.field3019, var17);
            var18.field3019.method6994(var18.field3019.field4621 - var19);
            client.field685.method2395(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field832[--Statics.field1479];
            Statics.field835 -= 2;
            int var21 = field839[Statics.field835];
            int var22 = field839[Statics.field835 + 1];
            class265 var23 = class460.method6247(var21, var20, Statics.field3523, var22);
            client.field685.method2395(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field4004 == null || Statics.field4004.field1073 == null) {
                var24 = "";
            } else {
                var24 = Statics.field4004.field1073.method7528();
            }
            field832[++Statics.field1479 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field839[++Statics.field835 - 1] = client.field728;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class99.method3285(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class99.method3900(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = class99.method753(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field832[--Statics.field1479];
            client.method6791(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field729 = field832[--Statics.field1479].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field832[++Statics.field1479 - 1] = client.field729;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field832[--Statics.field1479];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field835++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field835 -= 2;
            int var30 = field839[Statics.field835];
            int var31 = field839[Statics.field835 + 1];
            class58 var32 = class99.method5018(var30, var31);
            if (var32 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = var32.field479;
                field839[++Statics.field835 - 1] = var32.field470;
                field832[++Statics.field1479 - 1] = var32.field472 == null ? "" : var32.field472;
                field832[++Statics.field1479 - 1] = var32.field476 == null ? "" : var32.field476;
                field832[++Statics.field1479 - 1] = var32.field474 == null ? "" : var32.field474;
                field839[++Statics.field835 - 1] = var32.method1026() ? 1 : (var32.method1029() ? 2 : 0);
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field839[--Statics.field835];
            class58 var34 = class99.method2283(var33);
            if (var34 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = var34.field471;
                field839[++Statics.field835 - 1] = var34.field470;
                field832[++Statics.field1479 - 1] = var34.field472 == null ? "" : var34.field472;
                field832[++Statics.field1479 - 1] = var34.field476 == null ? "" : var34.field476;
                field832[++Statics.field1479 - 1] = var34.field474 == null ? "" : var34.field474;
                field839[++Statics.field835 - 1] = var34.method1026() ? 1 : (var34.method1029() ? 2 : 0);
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fu.an(ILbd;ZI)I")
    public static int method2969(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field839[++Statics.field835 - 1] = client.method1550();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field839[--Statics.field835];
            if (var3 == 1 || var3 == 2) {
                client.method2703(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field839[++Statics.field835 - 1] = Statics.field1541.method2147();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field839[--Statics.field835];
            if (var4 == 1 || var4 == 2) {
                Statics.field1541.method2146(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field835 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field1479 -= 2;
            Statics.field835--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field1479--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lo.ay(ILbd;ZI)I")
    public static int method5508(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field835 -= 2;
            int var3 = field839[Statics.field835];
            int var4 = field839[Statics.field835 + 1];
            if (!client.field754) {
                client.field641 = var3;
                client.field730 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field839[++Statics.field835 - 1] = client.field641;
            return 1;
        } else if (arg0 == 5506) {
            field839[++Statics.field835 - 1] = client.field730;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field839[--Statics.field835];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field581 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field839[++Statics.field835 - 1] = client.field581;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nd.ag(ILbd;ZI)I")
    public static int method6250(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field551 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field1479 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field839[++Statics.field835 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lh.ah(IB)I")
    public static int method5455(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("jl.ac(II)I")
    public static int method4663(int arg0) {
        return (int) ((Math.log((double) arg0) / field846 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("bt.ab(ILbd;ZI)I")
    public static int method1896(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field835 -= 2;
            client.field761 = (short) method5455(field839[Statics.field835]);
            if (client.field761 <= 0) {
                client.field761 = 256;
            }
            client.field762 = (short) method5455(field839[Statics.field835 + 1]);
            if (client.field762 <= 0) {
                client.field762 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field835 -= 2;
            client.field763 = (short) field839[Statics.field835];
            if (client.field763 <= 0) {
                client.field763 = 256;
            }
            client.field610 = (short) field839[Statics.field835 + 1];
            if (client.field610 <= 0) {
                client.field610 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field835 -= 4;
            client.field765 = (short) field839[Statics.field835];
            if (client.field765 <= 0) {
                client.field765 = 1;
            }
            client.field766 = (short) field839[Statics.field835 + 1];
            if (client.field766 <= 0) {
                client.field766 = 32767;
            } else if (client.field766 < client.field765) {
                client.field766 = client.field765;
            }
            client.field767 = (short) field839[Statics.field835 + 2];
            if (client.field767 <= 0) {
                client.field767 = 1;
            }
            client.field667 = (short) field839[Statics.field835 + 3];
            if (client.field667 <= 0) {
                client.field667 = 32767;
            } else if (client.field667 < client.field767) {
                client.field667 = client.field767;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field679 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = -1;
            } else {
                client.method211(0, 0, client.field679.field3351, client.field679.field3352, false);
                field839[++Statics.field835 - 1] = client.field771;
                field839[++Statics.field835 - 1] = client.field635;
            }
            return 1;
        } else if (arg0 == 6204) {
            field839[++Statics.field835 - 1] = client.field763;
            field839[++Statics.field835 - 1] = client.field610;
            return 1;
        } else if (arg0 == 6205) {
            field839[++Statics.field835 - 1] = method4663(client.field761);
            field839[++Statics.field835 - 1] = method4663(client.field762);
            return 1;
        } else if (arg0 == 6220) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field839[++Statics.field835 - 1] = Statics.field1798;
            return 1;
        } else if (arg0 == 6223) {
            field839[++Statics.field835 - 1] = Statics.field4019;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.au(ILbd;ZB)I")
    public static int method1022(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field839[++Statics.field835 - 1] = class61.method2282() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method1959();
            if (var3 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
            } else {
                field839[++Statics.field835 - 1] = var3.field796;
                field839[++Statics.field835 - 1] = var3.field792;
                field832[++Statics.field1479 - 1] = var3.field799;
                field839[++Statics.field835 - 1] = var3.field787;
                field839[++Statics.field835 - 1] = var3.field797;
                field832[++Statics.field1479 - 1] = var3.field795;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method5224();
            if (var4 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
            } else {
                field839[++Statics.field835 - 1] = var4.field796;
                field839[++Statics.field835 - 1] = var4.field792;
                field832[++Statics.field1479 - 1] = var4.field799;
                field839[++Statics.field835 - 1] = var4.field787;
                field839[++Statics.field835 - 1] = var4.field797;
                field832[++Statics.field1479 - 1] = var4.field795;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field839[--Statics.field835];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field791; var7++) {
                if (Statics.field153[var7].field796 == var5) {
                    var6 = Statics.field153[var7];
                    break;
                }
            }
            if (var6 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
            } else {
                field839[++Statics.field835 - 1] = var6.field796;
                field839[++Statics.field835 - 1] = var6.field792;
                field832[++Statics.field1479 - 1] = var6.field799;
                field839[++Statics.field835 - 1] = var6.field787;
                field839[++Statics.field835 - 1] = var6.field797;
                field832[++Statics.field1479 - 1] = var6.field795;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field835 -= 4;
            int var8 = field839[Statics.field835];
            boolean var9 = field839[Statics.field835 + 1] == 1;
            int var10 = field839[Statics.field835 + 2];
            boolean var11 = field839[Statics.field835 + 3] == 1;
            class61.method3885(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field839[--Statics.field835];
            if (var12 >= 0 && var12 < class61.field791) {
                class61 var13 = Statics.field153[var12];
                field839[++Statics.field835 - 1] = var13.field796;
                field839[++Statics.field835 - 1] = var13.field792;
                field832[++Statics.field1479 - 1] = var13.field799;
                field839[++Statics.field835 - 1] = var13.field787;
                field839[++Statics.field835 - 1] = var13.field797;
                field832[++Statics.field1479 - 1] = var13.field795;
            } else {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
                field839[++Statics.field835 - 1] = 0;
                field839[++Statics.field835 - 1] = 0;
                field832[++Statics.field1479 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field651 = field839[--Statics.field835] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field835 -= 2;
            int var14 = field839[Statics.field835];
            int var15 = field839[Statics.field835 + 1];
            class185 var16 = class185.method2862(var15);
            if (var16.method3248()) {
                field832[++Statics.field1479 - 1] = class179.method344(var14).method3194(var15, var16.field1980);
            } else {
                field839[++Statics.field835 - 1] = class179.method344(var14).method3171(var15, var16.field1979);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field835 -= 2;
            int var17 = field839[Statics.field835];
            int var18 = field839[Statics.field835 + 1];
            class185 var19 = class185.method2862(var18);
            if (var19.method3248()) {
                field832[++Statics.field1479 - 1] = class188.method2828(var17).method3335(var18, var19.field1980);
            } else {
                field839[++Statics.field835 - 1] = class188.method2828(var17).method3323(var18, var19.field1979);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field835 -= 2;
            int var20 = field839[Statics.field835];
            int var21 = field839[Statics.field835 + 1];
            class185 var22 = class185.method2862(var21);
            if (var22.method3248()) {
                field832[++Statics.field1479 - 1] = Statics.method268(var20).method3383(var21, var22.field1980);
            } else {
                field839[++Statics.field835 - 1] = Statics.method268(var20).method3372(var21, var22.field1979);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field835 -= 2;
            int var23 = field839[Statics.field835];
            int var24 = field839[Statics.field835 + 1];
            class185 var25 = class185.method2862(var24);
            if (var25.method3248()) {
                field832[++Statics.field1479 - 1] = class186.method3368(var23).method3266(var24, var25.field1980);
            } else {
                field839[++Statics.field835 - 1] = class186.method3368(var23).method3265(var24, var25.field1979);
            }
            return 1;
        } else if (arg0 == 6518) {
            field839[++Statics.field835 - 1] = client.field500 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field839[++Statics.field835 - 1] = client.field498;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1479--;
            Statics.field835--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1479--;
            Statics.field835--;
            return 1;
        } else if (arg0 == 6524) {
            field839[++Statics.field835 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field839[++Statics.field835 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field839[++Statics.field835 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field839[++Statics.field835 - 1] = client.field499;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.af(ILbd;ZI)I")
    public static int method95(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field99;
            int var4 = (Statics.field4004.field1132 >> 7) + Statics.field489;
            int var5 = (Statics.field4004.field1116 >> 7) + Statics.field1843;
            client.method297().method6655(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field839[--Statics.field835];
            String var7 = "";
            class201 var8 = client.method297().method6614(var6);
            if (var8 != null) {
                var7 = var8.method3626();
            }
            field832[++Statics.field1479 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field839[--Statics.field835];
            client.method297().method6554(var9);
            return 1;
        } else if (arg0 == 6603) {
            field839[++Statics.field835 - 1] = client.method297().method6568();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field839[--Statics.field835];
            client.method297().method6565(var10);
            return 1;
        } else if (arg0 == 6605) {
            field839[++Statics.field835 - 1] = client.method297().method6570() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class290 var11 = new class290(field839[--Statics.field835]);
            client.method297().method6591(var11.field3287, var11.field3286);
            return 1;
        } else if (arg0 == 6607) {
            class290 var12 = new class290(field839[--Statics.field835]);
            client.method297().method6573(var12.field3287, var12.field3286);
            return 1;
        } else if (arg0 == 6608) {
            class290 var13 = new class290(field839[--Statics.field835]);
            client.method297().method6574(var13.field3288, var13.field3287, var13.field3286);
            return 1;
        } else if (arg0 == 6609) {
            class290 var14 = new class290(field839[--Statics.field835]);
            client.method297().method6607(var14.field3288, var14.field3287, var14.field3286);
            return 1;
        } else if (arg0 == 6610) {
            field839[++Statics.field835 - 1] = client.method297().method6576();
            field839[++Statics.field835 - 1] = client.method297().method6577();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field839[--Statics.field835];
            class201 var16 = client.method297().method6614(var15);
            if (var16 == null) {
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = var16.method3644().method4980();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field839[--Statics.field835];
            class201 var18 = client.method297().method6614(var17);
            if (var18 == null) {
                field839[++Statics.field835 - 1] = 0;
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = (var18.method3630() - var18.method3629() + 1) * 64;
                field839[++Statics.field835 - 1] = (var18.method3671() - var18.method3631() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field839[--Statics.field835];
            class201 var20 = client.method297().method6614(var19);
            if (var20 == null) {
                field839[++Statics.field835 - 1] = 0;
                field839[++Statics.field835 - 1] = 0;
                field839[++Statics.field835 - 1] = 0;
                field839[++Statics.field835 - 1] = 0;
            } else {
                field839[++Statics.field835 - 1] = var20.method3629() * 64;
                field839[++Statics.field835 - 1] = var20.method3631() * 64;
                field839[++Statics.field835 - 1] = var20.method3630() * 64 + 64 - 1;
                field839[++Statics.field835 - 1] = var20.method3671() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field839[--Statics.field835];
            class201 var22 = client.method297().method6614(var21);
            if (var22 == null) {
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var22.method3615();
            }
            return 1;
        } else if (arg0 == 6615) {
            class290 var23 = client.method297().method6578();
            if (var23 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var23.field3287;
                field839[++Statics.field835 - 1] = var23.field3286;
            }
            return 1;
        } else if (arg0 == 6616) {
            field839[++Statics.field835 - 1] = client.method297().method6555();
            return 1;
        } else if (arg0 == 6617) {
            class290 var24 = new class290(field839[--Statics.field835]);
            class201 var25 = client.method297().method6553();
            if (var25 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method3621(var24.field3288, var24.field3287, var24.field3286);
            if (var26 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var26[0];
                field839[++Statics.field835 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class290 var27 = new class290(field839[--Statics.field835]);
            class201 var28 = client.method297().method6553();
            if (var28 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = -1;
                return 1;
            }
            class290 var29 = var28.method3617(var27.field3287, var27.field3286);
            if (var29 == null) {
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var29.method4980();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field835 -= 2;
            int var30 = field839[Statics.field835];
            class290 var31 = new class290(field839[Statics.field835 + 1]);
            method565(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field835 -= 2;
            int var32 = field839[Statics.field835];
            class290 var33 = new class290(field839[Statics.field835 + 1]);
            method565(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field835 -= 2;
            int var34 = field839[Statics.field835];
            class290 var35 = new class290(field839[Statics.field835 + 1]);
            class201 var36 = client.method297().method6614(var34);
            if (var36 == null) {
                field839[++Statics.field835 - 1] = 0;
                return 1;
            } else {
                field839[++Statics.field835 - 1] = var36.method3637(var35.field3288, var35.field3287, var35.field3286) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field839[++Statics.field835 - 1] = client.method297().method6661();
            field839[++Statics.field835 - 1] = client.method297().method6580();
            return 1;
        } else if (arg0 == 6623) {
            class290 var37 = new class290(field839[--Statics.field835]);
            class201 var38 = client.method297().method6552(var37.field3288, var37.field3287, var37.field3286);
            if (var38 == null) {
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var38.method3623();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method297().method6730(field839[--Statics.field835]);
            return 1;
        } else if (arg0 == 6625) {
            client.method297().method6681();
            return 1;
        } else if (arg0 == 6626) {
            client.method297().method6583(field839[--Statics.field835]);
            return 1;
        } else if (arg0 == 6627) {
            client.method297().method6584();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field839[--Statics.field835] == 1;
            client.method297().method6699(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field839[--Statics.field835];
            client.method297().method6586(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field839[--Statics.field835];
            client.method297().method6587(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method297().method6694();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field839[--Statics.field835] == 1;
            client.method297().method6589(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field835 -= 2;
            int var43 = field839[Statics.field835];
            boolean var44 = field839[Statics.field835 + 1] == 1;
            client.method297().method6623(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field835 -= 2;
            int var45 = field839[Statics.field835];
            boolean var46 = field839[Statics.field835 + 1] == 1;
            client.method297().method6541(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field839[++Statics.field835 - 1] = client.method297().method6592() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.method297().method6593(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field839[--Statics.field835];
            field839[++Statics.field835 - 1] = client.method297().method6594(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field835 -= 2;
            int var49 = field839[Statics.field835];
            class290 var50 = new class290(field839[Statics.field835 + 1]);
            class290 var51 = client.method297().method6597(var49, var50);
            if (var51 == null) {
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var51.method4980();
            }
            return 1;
        } else if (arg0 == 6639) {
            class219 var52 = client.method297().method6666();
            if (var52 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var52.method3567();
                field839[++Statics.field835 - 1] = var52.field2413.method4980();
            }
            return 1;
        } else if (arg0 == 6640) {
            class219 var53 = client.method297().method6600();
            if (var53 == null) {
                field839[++Statics.field835 - 1] = -1;
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var53.method3567();
                field839[++Statics.field835 - 1] = var53.field2413.method4980();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field839[--Statics.field835];
            class172 var55 = class172.method2469(var54);
            if (var55.field1826 == null) {
                field832[++Statics.field1479 - 1] = "";
            } else {
                field832[++Statics.field1479 - 1] = var55.field1826;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field839[--Statics.field835];
            class172 var57 = class172.method2469(var56);
            field839[++Statics.field835 - 1] = var57.field1829;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field839[--Statics.field835];
            class172 var59 = class172.method2469(var58);
            if (var59 == null) {
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var59.field1836;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field839[--Statics.field835];
            class172 var61 = class172.method2469(var60);
            if (var61 == null) {
                field839[++Statics.field835 - 1] = -1;
            } else {
                field839[++Statics.field835 - 1] = var61.field1814;
            }
            return 1;
        } else if (arg0 == 6697) {
            field839[++Statics.field835 - 1] = Statics.field1946.field2435;
            return 1;
        } else if (arg0 == 6698) {
            field839[++Statics.field835 - 1] = Statics.field1946.field2432.method4980();
            return 1;
        } else if (arg0 == 6699) {
            field839[++Statics.field835 - 1] = Statics.field1946.field2433.method4980();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jw.ad(ILbd;ZI)I")
    public static int method4709(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field835 -= 2;
            Statics.field1479--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 6750) {
            field832[++Statics.field1479 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field839[++Statics.field835 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field839[--Statics.field835];
            class179 var4 = class179.method344(var3);
            field832[++Statics.field1479 - 1] = var4 == null ? "" : var4.field1893;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.ai(ILbd;ZI)I")
    public static int method2239(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field832[++Statics.field1479 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field839[++Statics.field835 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field832[++Statics.field1479 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field839[++Statics.field835 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.ax(ILbd;ZB)I")
    public static int method82(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field832[++Statics.field1479 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field839[++Statics.field835 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cf.ar(ILbd;ZI)I")
    public static int method2002(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field835 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field835 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field835 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field835 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field1479--;
            Statics.field835--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field1479--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field835 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field835--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ha.ap(ILbd;ZI)I")
    public static int method4251(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field835++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field1479 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field835++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field835++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field835++;
            return 1;
        } else if (arg0 == 7108) {
            field839[++Statics.field835 - 1] = client.method298() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field835--;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field835 -= 2;
            field839[++Statics.field835 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field835 -= 2;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("x.az(ILbd;ZI)I")
    public static int method281(int arg0, class72 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field835 -= 5;
            field839[++Statics.field835 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field835 -= 6;
            field839[++Statics.field835 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field839[Statics.field835 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field835 -= 2;
            field839[++Statics.field835 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field835--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field835 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.as(ILbd;ZB)I")
    public static int method1060(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7400) {
            Statics.field835--;
            Statics.field1479--;
            return 1;
        } else if (arg0 == 7401) {
            Statics.field835--;
            Statics.field1479--;
            return 1;
        } else if (arg0 == 7402) {
            Statics.field835 -= 2;
            Statics.field1479--;
            return 1;
        } else if (arg0 == 7403) {
            Statics.field835 -= 2;
            Statics.field1479--;
            return 1;
        } else if (arg0 == 7404) {
            Statics.field835--;
            Statics.field1479--;
            return 1;
        } else if (arg0 == 7405) {
            Statics.field835 -= 2;
            return 1;
        } else if (arg0 == 7406) {
            Statics.field835--;
            field832[++Statics.field1479 - 1] = "";
            return 1;
        } else if (arg0 == 7407) {
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 7408) {
            Statics.field835 -= 2;
            Statics.field1479--;
            field839[++Statics.field835 - 1] = 0;
            return 1;
        } else if (arg0 == 7409) {
            Statics.field835--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("er.aa(IB)V")
    public static void method2827(int arg0) {
        if (arg0 == -1 || !class295.method2938(arg0)) {
            return;
        }
        class295[] var1 = Statics.field3326[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class295 var3 = var1[var2];
            if (var3.field3334 != null) {
                class81 var4 = new class81();
                var4.field1045 = var3;
                var4.field1035 = var3.field3334;
                method1804(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("ao.bj(ILks;ZI)V")
    public static void method565(int arg0, class290 arg1, boolean arg2) {
        class201 var3 = client.method297().method6614(arg0);
        int var4 = Statics.field4004.field1092;
        int var5 = (Statics.field4004.field1132 >> 7) + Statics.field489;
        int var6 = (Statics.field4004.field1116 >> 7) + Statics.field1843;
        class290 var7 = new class290(var4, var5, var6);
        client.method297().method6559(var3, var7, arg1, arg2);
    }
}
