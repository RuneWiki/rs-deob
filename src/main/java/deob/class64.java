package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("be")
public class class64 {

    @ObfuscatedName("be.m")
    public static int[] field825 = new int[5];

    @ObfuscatedName("be.p")
    public static int[][] field823 = new int[5][5000];

    @ObfuscatedName("be.s")
    public static int[] field827 = new int[1000];

    @ObfuscatedName("be.v")
    public static String[] field828 = new String[1000];

    @ObfuscatedName("be.c")
    public static int field829 = 0;

    @ObfuscatedName("be.w")
    public static class57[] field830 = new class57[50];

    @ObfuscatedName("be.e")
    public static Calendar field832 = Calendar.getInstance();

    @ObfuscatedName("be.h")
    public static final String[] field833 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("be.d")
    public static boolean field836 = false;

    @ObfuscatedName("be.j")
    public static boolean field834 = false;

    @ObfuscatedName("be.z")
    public static ArrayList field822 = new ArrayList();

    @ObfuscatedName("be.i")
    public static int field824 = 0;

    @ObfuscatedName("be.am")
    public static final double field838 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.o(Lcr;B)V")
    public static void method2749(class81 arg0) {
        method78(arg0, 500000, 475000);
    }

    @ObfuscatedName("y.q(Lcr;IIB)V")
    public static void method78(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1062;
        class72 var5;
        if (class438.method2680(arg0.field1045)) {
            Statics.field47 = (class249) var3[0];
            class172 var4 = class172.method2598(Statics.field47.field2925);
            var5 = class72.method4072(arg0.field1045, var4.field1868, var4.field1887);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class72.method5117(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field63 = 0;
        Statics.field44 = 0;
        int var7 = -1;
        int[] var8 = var5.field949;
        int[] var9 = var5.field959;
        byte var10 = -1;
        field829 = 0;
        field836 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field113 = new int[var5.field954];
            int var13 = 0;
            Statics.field3212 = new String[var5.field951];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1048;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1049;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1047 == null ? -1 : arg0.field1047.field3395;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1058;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1047 == null ? -1 : arg0.field1047.field3396;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1057 == null ? -1 : arg0.field1057.field3395;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1057 == null ? -1 : arg0.field1057.field3396;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1052;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1051;
                    }
                    Statics.field113[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1054;
                    }
                    Statics.field3212[var14++] = var17;
                }
            }
            field824 = arg0.field1055;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field959[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method322(var61, var5, var48);
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
                    field827[++Statics.field63 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field827[++Statics.field63 - 1] = class289.field3348[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class289.field3348[var19] = field827[--Statics.field63];
                    client.method5317(var19);
                } else if (var61 == 3) {
                    field828[++Statics.field44 - 1] = var5.field953[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field63 -= 2;
                    if (field827[Statics.field63] != field827[Statics.field63 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field63 -= 2;
                    if (field827[Statics.field63] == field827[Statics.field63 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field63 -= 2;
                    if (field827[Statics.field63] < field827[Statics.field63 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field63 -= 2;
                    if (field827[Statics.field63] > field827[Statics.field63 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field829 == 0) {
                        return;
                    }
                    class57 var21 = field830[--field829];
                    var5 = var21.field453;
                    var8 = var5.field949;
                    var9 = var5.field959;
                    var7 = var21.field451;
                    Statics.field113 = var21.field452;
                    Statics.field3212 = var21.field455;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field827[++Statics.field63 - 1] = class289.method241(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class289.method2245(var23, field827[--Statics.field63]);
                } else if (var61 == 31) {
                    Statics.field63 -= 2;
                    if (field827[Statics.field63] <= field827[Statics.field63 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field63 -= 2;
                    if (field827[Statics.field63] >= field827[Statics.field63 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field827[++Statics.field63 - 1] = Statics.field113[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field113[var9[var7]] = field827[--Statics.field63];
                } else if (var61 == 35) {
                    field828[++Statics.field44 - 1] = Statics.field3212[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field3212[var9[var7]] = field828[--Statics.field44];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field44 -= var24;
                    String var25 = class344.method3229(field828, Statics.field44, var24);
                    field828[++Statics.field44 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field63--;
                } else if (var61 == 39) {
                    Statics.field44--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = class72.method5117(var26);
                    int[] var28 = new int[var27.field954];
                    String[] var29 = new String[var27.field951];
                    for (int var30 = 0; var30 < var27.field956; var30++) {
                        var28[var30] = field827[Statics.field63 - var27.field956 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field957; var31++) {
                        var29[var31] = field828[Statics.field44 - var27.field957 + var31];
                    }
                    Statics.field63 -= var27.field956;
                    Statics.field44 -= var27.field957;
                    class57 var32 = new class57();
                    var32.field453 = var5;
                    var32.field451 = var7;
                    var32.field452 = Statics.field113;
                    var32.field455 = Statics.field3212;
                    field830[++field829 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field949;
                    var9 = var27.field959;
                    var7 = -1;
                    Statics.field113 = var28;
                    Statics.field3212 = var29;
                } else if (var61 == 42) {
                    field827[++Statics.field63 - 1] = Statics.field1564.method2325(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field1564.method2295(var9[var7], field827[--Statics.field63]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field827[--Statics.field63];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field825[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field823[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field827[--Statics.field63];
                    if (var39 < 0 || var39 >= field825[var38]) {
                        throw new RuntimeException();
                    }
                    field827[++Statics.field63 - 1] = field823[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field63 -= 2;
                    int var41 = field827[Statics.field63];
                    if (var41 < 0 || var41 >= field825[var40]) {
                        throw new RuntimeException();
                    }
                    field823[var40][var41] = field827[Statics.field63 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field1564.method2309(var9[var7]);
                    if (var42 == null) {
                        var42 = class309.field3681;
                    }
                    field828[++Statics.field44 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field1564.method2299(var9[var7], field828[--Statics.field44]);
                } else if (var61 == 49) {
                    String var43 = Statics.field1564.method2298(var9[var7]);
                    field828[++Statics.field44 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field1564.method2314(var9[var7], field828[--Statics.field44]);
                } else if (var61 == 60) {
                    class420 var44 = var5.field958[var9[var7]];
                    class410 var45 = (class410) var44.method6665((long) field827[--Statics.field63]);
                    if (var45 != null) {
                        var7 += var45.field4465;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field4584.method2687(var9[var7]);
                    if (var46 == null) {
                        field827[++Statics.field63 - 1] = -1;
                    } else {
                        field827[++Statics.field63 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field1379.method6329(var9[var7]);
                    if (var47 == null) {
                        field827[++Statics.field63 - 1] = -1;
                    } else {
                        field827[++Statics.field63 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4468).append(" ");
            for (int var53 = field829 - 1; var53 >= 0; var53--) {
                var52.append("").append(field830[var53].field453.field4468).append(" ");
            }
            var52.append("").append(var10);
            class464.method5148(var52.toString(), var59);
        } finally {
            while (field822.size() > 0) {
                class94 var56 = (class94) field822.remove(0);
                client.method2871(var56.method2252(), var56.method2253(), var56.method2262(), var56.method2255(), "");
            }
            if (field836) {
                field836 = false;
                client.method4907();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class464.method5148("Warning: Script " + var5.field950 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("z.l(ILbb;ZB)I")
    public static int method322(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method749(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method5300(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method4479(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method1698(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method4895(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method2041(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method5949(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method2681(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4614(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1936(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3904(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method5300(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method4479(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method1698(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method4895(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method2041(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3600(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method4435(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return Statics.method3152(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method4880(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3904(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method1858(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2679(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method2865(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method5129(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method1940(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method5123(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method3178(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method5396(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method1925(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method5119(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method4605(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1051(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method6645(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method4066(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method5149(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method4930(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1152(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method585(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method5386(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method43(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method328(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method591(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method3938(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method3599(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method3177(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method4839(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.k(ILbb;ZI)I")
    public static int method749(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field63 -= 3;
            int var3 = field827[Statics.field63];
            int var4 = field827[Statics.field63 + 1];
            int var5 = field827[Statics.field63 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class295 var6 = class295.method2248(var3);
            if (var6.field3535 == null) {
                var6.field3535 = new class295[var5 + 1];
            }
            if (var6.field3535.length <= var5) {
                class295[] var7 = new class295[var5 + 1];
                for (int var8 = 0; var8 < var6.field3535.length; var8++) {
                    var7[var8] = var6.field3535[var8];
                }
                var6.field3535 = var7;
            }
            if (var5 > 0 && var6.field3535[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class295 var9 = new class295();
            var9.field3397 = var4;
            var9.field3403 = var9.field3395 = var6.field3395;
            var9.field3396 = var5;
            var9.field3394 = true;
            var6.field3535[var5] = var9;
            if (arg2) {
                Statics.field831 = var9;
            } else {
                Statics.field128 = var9;
            }
            client.method5299(var6);
            return 1;
        } else if (arg0 == 101) {
            class295 var10 = arg2 ? Statics.field831 : Statics.field128;
            class295 var11 = class295.method2248(var10.field3395);
            var11.field3535[var10.field3396] = null;
            client.method5299(var11);
            return 1;
        } else if (arg0 == 102) {
            class295 var12 = class295.method2248(field827[--Statics.field63]);
            var12.field3535 = null;
            client.method5299(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field63 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field63 -= 2;
            int var13 = field827[Statics.field63];
            int var14 = field827[Statics.field63 + 1];
            class295 var15 = class295.method1035(var13, var14);
            if (var15 == null || var14 == -1) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = 1;
                if (arg2) {
                    Statics.field831 = var15;
                } else {
                    Statics.field128 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class295 var16 = class295.method2248(field827[--Statics.field63]);
            if (var16 == null) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = 1;
                if (arg2) {
                    Statics.field831 = var16;
                } else {
                    Statics.field128 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field827[Statics.field63 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field827[--Statics.field63 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("la.a(ILbb;ZI)I")
    public static int method5300(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class295 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field827[--Statics.field63];
            var4 = class295.method2248(var3);
        } else {
            var4 = arg2 ? Statics.field831 : Statics.field128;
        }
        if (arg0 == 1000) {
            Statics.field63 -= 4;
            var4.field3404 = field827[Statics.field63];
            var4.field3405 = field827[Statics.field63 + 1];
            var4.field3400 = field827[Statics.field63 + 2];
            var4.field3401 = field827[Statics.field63 + 3];
            client.method5299(var4);
            Statics.field1075.method1077(var4);
            if (var3 != -1 && var4.field3397 == 0) {
                client.method2443(Statics.field1799[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field63 -= 4;
            var4.field3522 = field827[Statics.field63];
            var4.field3490 = field827[Statics.field63 + 1];
            var4.field3402 = field827[Statics.field63 + 2];
            var4.field3421 = field827[Statics.field63 + 3];
            client.method5299(var4);
            Statics.field1075.method1077(var4);
            if (var3 != -1 && var4.field3397 == 0) {
                client.method2443(Statics.field1799[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field827[--Statics.field63] == 1;
            if (var4.field3415 != var5) {
                var4.field3415 = var5;
                client.method5299(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3545 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3546 = field827[--Statics.field63] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iq.m(ILbb;ZI)I")
    public static int method4479(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class295 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field827[--Statics.field63];
            var4 = class295.method2248(var3);
        } else {
            var4 = arg2 ? Statics.field831 : Statics.field128;
        }
        if (arg0 == 1100) {
            Statics.field63 -= 2;
            var4.field3433 = field827[Statics.field63];
            if (var4.field3433 > var4.field3418 - var4.field3410) {
                var4.field3433 = var4.field3418 - var4.field3410;
            }
            if (var4.field3433 < 0) {
                var4.field3433 = 0;
            }
            var4.field3417 = field827[Statics.field63 + 1];
            if (var4.field3417 > var4.field3419 - var4.field3411) {
                var4.field3417 = var4.field3419 - var4.field3411;
            }
            if (var4.field3417 < 0) {
                var4.field3417 = 0;
            }
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3469 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3416 = field827[--Statics.field63] == 1;
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3426 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3428 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3515 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3451 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3434 = field827[--Statics.field63] == 1;
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3439 = 1;
            var4.field3508 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field63 -= 6;
            var4.field3445 = field827[Statics.field63];
            var4.field3448 = field827[Statics.field63 + 1];
            var4.field3447 = field827[Statics.field63 + 2];
            var4.field3486 = field827[Statics.field63 + 3];
            var4.field3449 = field827[Statics.field63 + 4];
            var4.field3450 = field827[Statics.field63 + 5];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field827[--Statics.field63];
            if (var4.field3533 != var5) {
                var4.field3533 = var5;
                var4.field3478 = 0;
                var4.field3446 = 0;
                client.method5299(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3453 = field827[--Statics.field63] == 1;
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field828[--Statics.field44];
            if (!var6.equals(var4.field3504)) {
                var4.field3504 = var6;
                client.method5299(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3456 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field63 -= 3;
            var4.field3406 = field827[Statics.field63];
            var4.field3505 = field827[Statics.field63 + 1];
            var4.field3459 = field827[Statics.field63 + 2];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3462 = field827[--Statics.field63] == 1;
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3513 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3436 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3437 = field827[--Statics.field63] == 1;
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3393 = field827[--Statics.field63] == 1;
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field63 -= 2;
            var4.field3418 = field827[Statics.field63];
            var4.field3419 = field827[Statics.field63 + 1];
            client.method5299(var4);
            if (var3 != -1 && var4.field3397 == 0) {
                client.method2443(Statics.field1799[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method5114(var4.field3395, var4.field3396);
            client.field661 = var4;
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3431 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3484 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3427 = field827[--Statics.field63];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field827[--Statics.field63];
            class451 var8 = (class451) class330.method4934(class451.method4524(), var7);
            if (var8 != null) {
                var4.field3425 = var8;
                client.method5299(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field827[--Statics.field63] == 1;
            var4.field3429 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field827[--Statics.field63] == 1;
            var4.field3454 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field63 -= 2;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3432 = field828[--Statics.field44];
            client.method5299(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method4990(field828[--Statics.field44], Statics.field1385, client.method2247());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field63 -= 2;
            var4.method4992(field827[Statics.field63], field827[Statics.field63 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5009(field828[--Statics.field44], field827[--Statics.field63]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.p(ILbb;ZI)I")
    public static int method1698(int arg0, class72 arg1, boolean arg2) {
        class295 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class295.method2248(field827[--Statics.field63]);
        } else {
            var3 = arg2 ? Statics.field831 : Statics.field128;
        }
        client.method5299(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field63 -= 2;
            int var4 = field827[Statics.field63];
            int var5 = field827[Statics.field63 + 1];
            var3.field3531 = var4;
            var3.field3532 = var5;
            class189 var6 = class189.method2903(var4);
            var3.field3447 = var6.field2161;
            var3.field3486 = var6.field2151;
            var3.field3449 = var6.field2152;
            var3.field3445 = var6.field2153;
            var3.field3448 = var6.field2154;
            var3.field3450 = var6.field2149;
            if (arg0 == 1205) {
                var3.field3424 = 0;
            } else if (arg0 == 1212 | var6.field2146 == 1) {
                var3.field3424 = 1;
            } else {
                var3.field3424 = 2;
            }
            if (var3.field3407 > 0) {
                var3.field3450 = var3.field3450 * 32 / var3.field3407;
            } else if (var3.field3522 > 0) {
                var3.field3450 = var3.field3450 * 32 / var3.field3522;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3439 = 2;
            var3.field3508 = field827[--Statics.field63];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3439 = 3;
            var3.field3508 = Statics.field2657.field1113.method4945();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jz.s(ILbb;ZB)I")
    public static int method4895(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class295 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class295.method2248(field827[--Statics.field63]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field831 : Statics.field128;
        }
        if (arg0 == 1300) {
            int var5 = field827[--Statics.field63] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4988(var5, field828[--Statics.field44]);
                return 1;
            } else {
                Statics.field44--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field63 -= 2;
            int var6 = field827[Statics.field63];
            int var7 = field827[Statics.field63 + 1];
            var4.field3481 = class295.method1035(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3440 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3544 = field827[--Statics.field63];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3483 = field827[--Statics.field63];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3479 = field828[--Statics.field44];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3485 = field828[--Statics.field44];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3480 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3547 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field63 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field827[Statics.field63 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field827[Statics.field63 + var10];
                        var9[var10 / 2] = (byte) field827[Statics.field63 + var10 + 1];
                    }
                }
            } else {
                Statics.field63 -= 2;
                var8 = new byte[] { (byte) field827[Statics.field63] };
                var9 = new byte[] { (byte) field827[Statics.field63 + 1] };
            }
            int var11 = field827[--Statics.field63] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method5929(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field63 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field827[Statics.field63] };
            byte[] var14 = new byte[] { (byte) field827[Statics.field63 + 1] };
            method5929(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field63 -= 3;
            int var15 = field827[Statics.field63] - 1;
            int var16 = field827[Statics.field63 + 1];
            int var17 = field827[Statics.field63 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method2786(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field827[--Statics.field63];
            int var20 = field827[--Statics.field63];
            method2786(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field63--;
            int var21 = field827[Statics.field63] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method1856(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method1856(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mw.r(Lki;I[B[BI)V")
    public static final void method5929(class295 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3475 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3475 = new byte[11][];
            arg0.field3420 = new byte[11][];
            arg0.field3477 = new int[11];
            arg0.field3482 = new int[11];
        }
        arg0.field3475[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3474 = false;
            for (int var4 = 0; var4 < arg0.field3475.length; var4++) {
                if (arg0.field3475[var4] != null) {
                    arg0.field3474 = true;
                    break;
                }
            }
        } else {
            arg0.field3474 = true;
        }
        arg0.field3420[arg1] = arg3;
    }

    @ObfuscatedName("ep.v(Lki;IIII)V")
    public static final void method2786(class295 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3477 == null) {
            throw new RuntimeException();
        }
        arg0.field3477[arg1] = arg2;
        arg0.field3482[arg1] = arg3;
    }

    @ObfuscatedName("bb.y(Lki;IB)V")
    public static final void method1856(class295 arg0, int arg1) {
        if (arg0.field3475 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3528 == null) {
            arg0.field3528 = new int[arg0.field3475.length];
        }
        arg0.field3528[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ca.c(ILbb;ZB)I")
    public static int method2041(int arg0, class72 arg1, boolean arg2) {
        class295 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class295.method2248(field827[--Statics.field63]);
        } else {
            var3 = arg2 ? Statics.field831 : Statics.field128;
        }
        String var4 = field828[--Statics.field44];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field827[--Statics.field63];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field827[--Statics.field63];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field828[--Statics.field44];
            } else {
                var7[var8] = Integer.valueOf(field827[--Statics.field63]);
            }
        }
        int var9 = field827[--Statics.field63];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3510 = var7;
        } else if (arg0 == 1401) {
            var3.field3491 = var7;
        } else if (arg0 == 1402) {
            var3.field3538 = var7;
        } else if (arg0 == 1403) {
            var3.field3492 = var7;
        } else if (arg0 == 1404) {
            var3.field3494 = var7;
        } else if (arg0 == 1405) {
            var3.field3529 = var7;
        } else if (arg0 == 1406) {
            var3.field3500 = var7;
        } else if (arg0 == 1407) {
            var3.field3499 = var7;
            var3.field3381 = var5;
        } else if (arg0 == 1408) {
            var3.field3488 = var7;
        } else if (arg0 == 1409) {
            var3.field3506 = var7;
        } else if (arg0 == 1410) {
            var3.field3438 = var7;
        } else if (arg0 == 1411) {
            var3.field3489 = var7;
        } else if (arg0 == 1412) {
            var3.field3493 = var7;
        } else if (arg0 == 1414) {
            var3.field3487 = var7;
            var3.field3502 = var5;
        } else if (arg0 == 1415) {
            var3.field3503 = var7;
            var3.field3430 = var5;
        } else if (arg0 == 1416) {
            var3.field3443 = var7;
        } else if (arg0 == 1417) {
            var3.field3507 = var7;
        } else if (arg0 == 1418) {
            var3.field3523 = var7;
        } else if (arg0 == 1419) {
            var3.field3509 = var7;
        } else if (arg0 == 1420) {
            var3.field3512 = var7;
        } else if (arg0 == 1421) {
            var3.field3501 = var7;
        } else if (arg0 == 1422) {
            var3.field3496 = var7;
        } else if (arg0 == 1423) {
            var3.field3537 = var7;
        } else if (arg0 == 1424) {
            var3.field3518 = var7;
        } else if (arg0 == 1425) {
            var3.field3476 = var7;
        } else if (arg0 == 1426) {
            var3.field3521 = var7;
        } else if (arg0 == 1427) {
            var3.field3519 = var7;
        } else if (arg0 == 1428) {
            var3.field3514 = var7;
        } else if (arg0 == 1429) {
            var3.field3457 = var7;
        } else if (arg0 == 1430) {
            var3.field3444 = var7;
        } else if (arg0 == 1431) {
            var3.field3511 = var7;
        } else if (arg0 == 1434) {
            var3.field3461 = var7;
        } else {
            return 2;
        }
        var3.field3520 = true;
        return 1;
    }

    @ObfuscatedName("na.w(ILbb;ZB)I")
    public static int method5949(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field831 : Statics.field128;
        if (arg0 == 1500) {
            field827[++Statics.field63 - 1] = var3.field3517;
            return 1;
        } else if (arg0 == 1501) {
            field827[++Statics.field63 - 1] = var3.field3534;
            return 1;
        } else if (arg0 == 1502) {
            field827[++Statics.field63 - 1] = var3.field3410;
            return 1;
        } else if (arg0 == 1503) {
            field827[++Statics.field63 - 1] = var3.field3411;
            return 1;
        } else if (arg0 == 1504) {
            field827[++Statics.field63 - 1] = var3.field3415 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field827[++Statics.field63 - 1] = var3.field3403;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.b(ILbb;ZI)I")
    public static int method2681(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field831 : Statics.field128;
        if (arg0 == 1600) {
            field827[++Statics.field63 - 1] = var3.field3433;
            return 1;
        } else if (arg0 == 1601) {
            field827[++Statics.field63 - 1] = var3.field3417;
            return 1;
        } else if (arg0 == 1602) {
            field828[++Statics.field44 - 1] = var3.field3504;
            return 1;
        } else if (arg0 == 1603) {
            field827[++Statics.field63 - 1] = var3.field3418;
            return 1;
        } else if (arg0 == 1604) {
            field827[++Statics.field63 - 1] = var3.field3419;
            return 1;
        } else if (arg0 == 1605) {
            field827[++Statics.field63 - 1] = var3.field3450;
            return 1;
        } else if (arg0 == 1606) {
            field827[++Statics.field63 - 1] = var3.field3447;
            return 1;
        } else if (arg0 == 1607) {
            field827[++Statics.field63 - 1] = var3.field3449;
            return 1;
        } else if (arg0 == 1608) {
            field827[++Statics.field63 - 1] = var3.field3486;
            return 1;
        } else if (arg0 == 1609) {
            field827[++Statics.field63 - 1] = var3.field3426;
            return 1;
        } else if (arg0 == 1610) {
            field827[++Statics.field63 - 1] = var3.field3427;
            return 1;
        } else if (arg0 == 1611) {
            field827[++Statics.field63 - 1] = var3.field3469;
            return 1;
        } else if (arg0 == 1612) {
            field827[++Statics.field63 - 1] = var3.field3484;
            return 1;
        } else if (arg0 == 1613) {
            field827[++Statics.field63 - 1] = var3.field3425.method40();
            return 1;
        } else if (arg0 == 1614) {
            field827[++Statics.field63 - 1] = var3.field3454 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field63++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jr.t(ILbb;ZI)I")
    public static int method4614(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field831 : Statics.field128;
        if (arg0 == 1700) {
            field827[++Statics.field63 - 1] = var3.field3531;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3531 == -1) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = var3.field3532;
            }
            return 1;
        } else if (arg0 == 1702) {
            field827[++Statics.field63 - 1] = var3.field3396;
            return 1;
        } else if (arg0 == 1707) {
            field827[++Statics.field63 - 1] = var3.method5039() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method4971(var3);
        } else if (arg0 == 1708) {
            return method262(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kl.g(Lki;I)I")
    public static int method4971(class295 arg0) {
        if (arg0.field3397 == 11) {
            String var1 = field828[--Statics.field44];
            field827[++Statics.field63 - 1] = arg0.method4996(var1);
            return 1;
        } else {
            Statics.field44--;
            field827[++Statics.field63 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("f.x(Lki;B)I")
    public static int method262(class295 arg0) {
        if (arg0.field3397 == 11) {
            String var1 = field828[--Statics.field44];
            field828[++Statics.field44 - 1] = arg0.method5064(var1);
            return 1;
        } else {
            field828[Statics.field44 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("bp.n(ILbb;ZB)I")
    public static int method1936(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field831 : Statics.field128;
        if (arg0 == 1800) {
            field827[++Statics.field63 - 1] = class296.method4455(client.method2406(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field827[--Statics.field63];
            int var5 = var4 - 1;
            if (var3.field3480 == null || var5 >= var3.field3480.length || var3.field3480[var5] == null) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = var3.field3480[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3479 == null) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = var3.field3479;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gg.e(ILbb;ZI)I")
    public static int method3904(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field824 >= 10) {
                throw new RuntimeException();
            }
            class295 var10;
            if (arg0 >= 2000) {
                var10 = class295.method2248(field827[--Statics.field63]);
            } else {
                var10 = arg2 ? Statics.field831 : Statics.field128;
            }
            if (var10.field3519 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1047 = var10;
            var11.field1062 = var10.field3519;
            var11.field1055 = field824 + 1;
            client.field569.method5413(var11);
            return 1;
        } else if (arg0 == 1928) {
            class295 var3 = arg2 ? Statics.field831 : Statics.field128;
            int var4 = field827[--Statics.field63];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class94 var5 = new class94(var4, var3.field3395, var3.field3396, var3.field3531);
            field822.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field63 -= 3;
            int var6 = field827[Statics.field63];
            int var7 = field827[Statics.field63 + 1];
            int var8 = field827[Statics.field63 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class94 var9 = new class94(var8, var6, var7, class295.method2248(var6).field3531);
            field822.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gn.h(ILbb;ZB)I")
    public static int method3600(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = class295.method2248(field827[--Statics.field63]);
        if (arg0 == 2500) {
            field827[++Statics.field63 - 1] = var3.field3517;
            return 1;
        } else if (arg0 == 2501) {
            field827[++Statics.field63 - 1] = var3.field3534;
            return 1;
        } else if (arg0 == 2502) {
            field827[++Statics.field63 - 1] = var3.field3410;
            return 1;
        } else if (arg0 == 2503) {
            field827[++Statics.field63 - 1] = var3.field3411;
            return 1;
        } else if (arg0 == 2504) {
            field827[++Statics.field63 - 1] = var3.field3415 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field827[++Statics.field63 - 1] = var3.field3403;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iy.f(ILbb;ZI)I")
    public static int method4435(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = class295.method2248(field827[--Statics.field63]);
        if (arg0 == 2600) {
            field827[++Statics.field63 - 1] = var3.field3433;
            return 1;
        } else if (arg0 == 2601) {
            field827[++Statics.field63 - 1] = var3.field3417;
            return 1;
        } else if (arg0 == 2602) {
            field828[++Statics.field44 - 1] = var3.field3504;
            return 1;
        } else if (arg0 == 2603) {
            field827[++Statics.field63 - 1] = var3.field3418;
            return 1;
        } else if (arg0 == 2604) {
            field827[++Statics.field63 - 1] = var3.field3419;
            return 1;
        } else if (arg0 == 2605) {
            field827[++Statics.field63 - 1] = var3.field3450;
            return 1;
        } else if (arg0 == 2606) {
            field827[++Statics.field63 - 1] = var3.field3447;
            return 1;
        } else if (arg0 == 2607) {
            field827[++Statics.field63 - 1] = var3.field3449;
            return 1;
        } else if (arg0 == 2608) {
            field827[++Statics.field63 - 1] = var3.field3486;
            return 1;
        } else if (arg0 == 2609) {
            field827[++Statics.field63 - 1] = var3.field3426;
            return 1;
        } else if (arg0 == 2610) {
            field827[++Statics.field63 - 1] = var3.field3427;
            return 1;
        } else if (arg0 == 2611) {
            field827[++Statics.field63 - 1] = var3.field3469;
            return 1;
        } else if (arg0 == 2612) {
            field827[++Statics.field63 - 1] = var3.field3484;
            return 1;
        } else if (arg0 == 2613) {
            field827[++Statics.field63 - 1] = var3.field3425.method40();
            return 1;
        } else if (arg0 == 2614) {
            field827[++Statics.field63 - 1] = var3.field3454 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field63++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jh.j(ILbb;ZI)I")
    public static int method4880(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = class295.method2248(field827[--Statics.field63]);
        if (arg0 == 2800) {
            field827[++Statics.field63 - 1] = class296.method4455(client.method2406(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field827[--Statics.field63];
            int var5 = var4 - 1;
            if (var3.field3480 == null || var5 >= var3.field3480.length || var3.field3480[var5] == null) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = var3.field3480[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3479 == null) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = var3.field3479;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bm.z(ILbb;ZI)I")
    public static int method1858(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field828[--Statics.field44];
            class99.method4522(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field63 -= 2;
            client.method2887(Statics.field2657, field827[Statics.field63], field827[Statics.field63 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field834) {
                field836 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field828[--Statics.field44];
            int var5 = 0;
            if (class344.method5187(var4)) {
                var5 = class344.method2246(var4);
            }
            class265 var6 = class265.method4070(class263.field2973, client.field734.field1344);
            var6.field3075.method6879(var5);
            client.field734.method2362(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field828[--Statics.field44];
            class265 var8 = class265.method4070(class263.field3049, client.field734.field1344);
            var8.field3075.method6876(var7.length() + 1);
            var8.field3075.method6883(var7);
            client.field734.method2362(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field828[--Statics.field44];
            class265 var10 = class265.method4070(class263.field3034, client.field734.field1344);
            var10.field3075.method6876(var9.length() + 1);
            var10.field3075.method6883(var9);
            client.field734.method2362(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field827[--Statics.field63];
            String var12 = field828[--Statics.field44];
            client.method1859(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field63 -= 3;
            int var13 = field827[Statics.field63];
            int var14 = field827[Statics.field63 + 1];
            int var15 = field827[Statics.field63 + 2];
            class295 var16 = class295.method2248(var15);
            client.method88(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field63 -= 2;
            int var17 = field827[Statics.field63];
            int var18 = field827[Statics.field63 + 1];
            class295 var19 = arg2 ? Statics.field831 : Statics.field128;
            client.method88(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field914 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field827[++Statics.field63 - 1] = Statics.field65.method2103() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field65.method2100(field827[--Statics.field63] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field828[--Statics.field44];
            boolean var21 = field827[--Statics.field63] == 1;
            class30.method1979(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field827[--Statics.field63];
            class265 var23 = class265.method4070(class263.field3018, client.field734.field1344);
            var23.field3075.method6877(var22);
            client.field734.method2362(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field827[--Statics.field63];
            Statics.field44 -= 2;
            String var25 = field828[Statics.field44];
            String var26 = field828[Statics.field44 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class265 var27 = class265.method4070(class263.field3045, client.field734.field1344);
                var27.field3075.method6877(1 + class440.method6331(var25) + class440.method6331(var26));
                var27.field3075.method6883(var25);
                var27.field3075.method7065(var24);
                var27.field3075.method6883(var26);
                client.field734.method2362(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field526 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field643 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field538 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field827[--Statics.field63] == 1) {
                client.field615 |= 0x1;
            } else {
                client.field615 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field827[--Statics.field63] == 1) {
                client.field615 |= 0x2;
            } else {
                client.field615 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field827[--Statics.field63] == 1) {
                client.field615 |= 0x4;
            } else {
                client.field615 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field827[--Statics.field63] == 1) {
                client.field615 |= 0x8;
            } else {
                client.field615 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field615 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field694 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field608 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method588(field827[--Statics.field63] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field827[++Statics.field63 - 1] = client.method4071() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field63 -= 2;
            client.field573 = field827[Statics.field63];
            client.field574 = field827[Statics.field63 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field63 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 3132) {
            field827[++Statics.field63 - 1] = Statics.field841;
            field827[++Statics.field63 - 1] = Statics.field4663;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field63 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field488 = 3;
            client.field658 = field827[--Statics.field63];
            return 1;
        } else if (arg0 == 3137) {
            client.field488 = 2;
            client.field658 = field827[--Statics.field63];
            return 1;
        } else if (arg0 == 3138) {
            client.field488 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field488 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field488 = 3;
            client.field658 = arg2 ? Statics.field831.field3395 : Statics.field128.field3395;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field827[--Statics.field63] == 1;
            Statics.field65.method2104(var28);
            return 1;
        } else if (arg0 == 3142) {
            field827[++Statics.field63 - 1] = Statics.field65.method2138() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field827[--Statics.field63] == 1;
            client.field528 = var29;
            if (!var29) {
                Statics.field65.method2178("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field827[++Statics.field63 - 1] = client.field528 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field827[--Statics.field63] == 1;
            Statics.field65.method2186(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field827[++Statics.field63 - 1] = Statics.field65.method2107() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field827[++Statics.field63 - 1] = class69.field886;
            return 1;
        } else if (arg0 == 3154) {
            field827[++Statics.field63 - 1] = client.method2677();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field44--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field63 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field63--;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field63--;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field44--;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field63--;
            field828[++Statics.field44 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field63--;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field63 -= 2;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field63 -= 2;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field63 -= 2;
            field828[++Statics.field44 - 1] = "";
            field828[++Statics.field44 - 1] = "";
            field828[++Statics.field44 - 1] = "";
            field828[++Statics.field44 - 1] = "";
            field828[++Statics.field44 - 1] = "";
            field828[++Statics.field44 - 1] = "";
            field828[++Statics.field44 - 1] = "";
            field828[++Statics.field44 - 1] = "";
            field828[++Statics.field44 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field63--;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 3175) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field44--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field44--;
            return 1;
        } else if (arg0 == 3181) {
            client.method1569(field827[--Statics.field63]);
            return 1;
        } else if (arg0 == 3182) {
            field827[++Statics.field63 - 1] = client.method5121();
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 3187) {
            Statics.field44 -= 2;
            return 1;
        } else if (arg0 == 3188) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.i(ILbb;ZI)I")
    public static int method2679(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field63 -= 3;
            client.method4089(field827[Statics.field63], field827[Statics.field63 + 1], field827[Statics.field63 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method4393(field827[--Statics.field63]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field63 -= 2;
            client.method5125(field827[Statics.field63], field827[Statics.field63 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class84 var15 = class84.field1089;
            class83 var16 = class83.field1074;
            int var17 = field827[--Statics.field63];
            if (arg0 == 3212) {
                int var18 = field827[--Statics.field63];
                var15 = (class84) class330.method4934(class84.method2745(), var18);
                if (var15 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var18));
                }
            }
            if (arg0 == 3213) {
                int var19 = field827[--Statics.field63];
                var16 = (class83) class330.method4934(class83.method2043(), var19);
                if (var16 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var19));
                }
            }
            if (arg0 == 3209) {
                int var20 = field827[--Statics.field63];
                var15 = (class84) class330.method4934(class84.method2745(), var20);
                if (var15 == null) {
                    var16 = (class83) class330.method4934(class83.method2043(), var20);
                    if (var16 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var20));
                    }
                }
            } else if (arg0 == 3181) {
                var15 = class84.field1093;
            } else if (arg0 == 3203) {
                var16 = class83.field1079;
            } else if (arg0 == 3205) {
                var16 = class83.field1076;
            } else if (arg0 == 3207) {
                var16 = class83.field1077;
            }
            if (class83.field1074 == var16) {
                switch(var15.field1091) {
                    case 1:
                        Statics.field65.method2104(var17 == 1);
                        break;
                    case 2:
                        Statics.field65.method2186(var17 == 1);
                        break;
                    case 3:
                        Statics.field65.method2108(var17 == 1);
                        break;
                    case 4:
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        Statics.field65.method2111(var17);
                        break;
                    case 5:
                        client.method1569(var17);
                        break;
                    default:
                        String var21 = String.format("Unkown device option: %s.", var15.toString());
                        throw new RuntimeException(var21);
                }
            } else {
                switch(var16.field1078) {
                    case 1:
                        Statics.field65.method2100(var17 == 1);
                        break;
                    case 2:
                        int var27 = Math.min(Math.max(var17, 0), 100);
                        int var28 = Math.round((float) (var27 * 255) / 100.0F);
                        client.method4931(var28);
                        break;
                    case 3:
                        int var25 = Math.min(Math.max(var17, 0), 100);
                        int var26 = Math.round((float) (var25 * 127) / 100.0F);
                        client.method1786(var26);
                        break;
                    case 4:
                        int var23 = Math.min(Math.max(var17, 0), 100);
                        int var24 = Math.round((float) (var23 * 127) / 100.0F);
                        client.method584(var24);
                        break;
                    default:
                        String var22 = String.format("Unkown game option: %s.", var16.toString());
                        throw new RuntimeException(var22);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class84 var3 = class84.field1089;
            class83 var4 = class83.field1074;
            boolean var5 = false;
            if (arg0 == 3214) {
                int var6 = field827[--Statics.field63];
                var3 = (class84) class330.method4934(class84.method2745(), var6);
                if (var3 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                }
            }
            if (arg0 == 3215) {
                int var7 = field827[--Statics.field63];
                var4 = (class83) class330.method4934(class83.method2043(), var7);
                if (var4 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                }
            }
            if (arg0 == 3210) {
                int var8 = field827[--Statics.field63];
                var3 = (class84) class330.method4934(class84.method2745(), var8);
                if (var3 == null) {
                    var4 = (class83) class330.method4934(class83.method2043(), var8);
                    if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var8));
                    }
                }
            } else if (arg0 == 3182) {
                var3 = class84.field1093;
            } else if (arg0 == 3204) {
                var4 = class83.field1079;
            } else if (arg0 == 3206) {
                var4 = class83.field1076;
            } else if (arg0 == 3208) {
                var4 = class83.field1077;
            }
            int var10;
            if (class83.field1074 == var4) {
                switch(var3.field1091) {
                    case 1:
                        var10 = Statics.field65.method2138() ? 1 : 0;
                        break;
                    case 2:
                        var10 = Statics.field65.method2107() ? 1 : 0;
                        break;
                    case 3:
                        var10 = Statics.field65.method2110() ? 1 : 0;
                        break;
                    case 4:
                        var10 = Statics.field65.method2112();
                        break;
                    case 5:
                        var10 = client.method5121();
                        break;
                    default:
                        String var9 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var9);
                }
            } else {
                switch(var4.field1078) {
                    case 1:
                        var10 = Statics.field65.method2103() ? 1 : 0;
                        break;
                    case 2:
                        int var14 = Statics.field65.method2129();
                        var10 = Math.round((float) (var14 * 100) / 255.0F);
                        break;
                    case 3:
                        int var13 = Statics.field65.method2125();
                        var10 = Math.round((float) (var13 * 100) / 127.0F);
                        break;
                    case 4:
                        int var12 = Statics.field65.method2120();
                        var10 = Math.round((float) (var12 * 100) / 127.0F);
                        break;
                    default:
                        String var11 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var11);
                }
            }
            field827[++Statics.field63 - 1] = var10;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eq.u(ILbb;ZI)I")
    public static int method2865(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field827[++Statics.field63 - 1] = client.field631;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field63 -= 2;
            int var3 = field827[Statics.field63];
            int var4 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = class78.method1010(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field63 -= 2;
            int var5 = field827[Statics.field63];
            int var6 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = class78.method4925(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field63 -= 2;
            int var7 = field827[Statics.field63];
            int var8 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = class78.method3716(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class170.method4897(var9).field1855;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = client.field508[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = client.field628[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = client.field629[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1577;
            int var14 = (Statics.field2657.field1182 >> 7) + Statics.field1001;
            int var15 = (Statics.field2657.field1138 >> 7) + Statics.field477;
            field827[++Statics.field63 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field827[++Statics.field63 - 1] = client.field482 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field63 -= 2;
            int var19 = field827[Statics.field63] + 32768;
            int var20 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = class78.method1010(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field63 -= 2;
            int var21 = field827[Statics.field63] + 32768;
            int var22 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = class78.method4925(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field63 -= 2;
            int var23 = field827[Statics.field63] + 32768;
            int var24 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = class78.method3716(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field664 >= 2) {
                field827[++Statics.field63 - 1] = client.field664;
            } else {
                field827[++Statics.field63 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field827[++Statics.field63 - 1] = client.field497;
            return 1;
        } else if (arg0 == 3318) {
            field827[++Statics.field63 - 1] = client.field539;
            return 1;
        } else if (arg0 == 3321) {
            field827[++Statics.field63 - 1] = client.field662;
            return 1;
        } else if (arg0 == 3322) {
            field827[++Statics.field63 - 1] = client.field747;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field666) {
                field827[++Statics.field63 - 1] = 1;
            } else {
                field827[++Statics.field63 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field827[++Statics.field63 - 1] = client.field480;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field63 -= 4;
            int var25 = field827[Statics.field63];
            int var26 = field827[Statics.field63 + 1];
            int var27 = field827[Statics.field63 + 2];
            int var28 = field827[Statics.field63 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field827[++Statics.field63 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field827[++Statics.field63 - 1] = client.field493;
            return 1;
        } else if (arg0 == 3327) {
            field827[++Statics.field63 - 1] = client.field682;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("km.ag(ILbb;ZB)I")
    public static int method5129(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field63 -= 2;
            int var3 = field827[Statics.field63];
            int var4 = field827[Statics.field63 + 1];
            class177 var5 = class177.method4896(var3);
            if (var5.field1931 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1929; var6++) {
                if (var5.field1927[var6] == var4) {
                    field828[++Statics.field44 - 1] = var5.field1936[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field828[++Statics.field44 - 1] = var5.field1933;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field63 -= 4;
            int var7 = field827[Statics.field63];
            int var8 = field827[Statics.field63 + 1];
            int var9 = field827[Statics.field63 + 2];
            int var10 = field827[Statics.field63 + 3];
            class177 var11 = class177.method4896(var9);
            if (var11.field1934 != var7 || var11.field1931 != var8) {
                if (var8 == 115) {
                    field828[++Statics.field44 - 1] = class309.field3681;
                } else {
                    field827[++Statics.field63 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1929; var12++) {
                if (var11.field1927[var12] == var10) {
                    if (var8 == 115) {
                        field828[++Statics.field44 - 1] = var11.field1936[var12];
                    } else {
                        field827[++Statics.field63 - 1] = var11.field1935[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field828[++Statics.field44 - 1] = var11.field1933;
                } else {
                    field827[++Statics.field63 - 1] = var11.field1932;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field827[--Statics.field63];
            class177 var14 = class177.method4896(var13);
            field827[++Statics.field63 - 1] = var14.method3096();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bp.ar(ILbb;ZB)I")
    public static int method1940(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class24.method2442(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class24.method4472(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class24.method250(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kz.am(ILbb;ZI)I")
    public static int method5123(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field4350.field804 == 0) {
                field827[++Statics.field63 - 1] = -2;
            } else if (Statics.field4350.field804 == 1) {
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = Statics.field4350.field802.method6028();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field827[--Statics.field63];
            if (Statics.field4350.method1571() && var3 >= 0 && var3 < Statics.field4350.field802.method6028()) {
                class369 var4 = (class369) Statics.field4350.field802.method6037(var3);
                field828[++Statics.field44 - 1] = var4.method5999();
                field828[++Statics.field44 - 1] = var4.method6000();
            } else {
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field827[--Statics.field63];
            if (Statics.field4350.method1571() && var5 >= 0 && var5 < Statics.field4350.field802.method6028()) {
                field827[++Statics.field63 - 1] = ((class376) Statics.field4350.field802.method6037(var5)).field4335;
            } else {
                field827[++Statics.field63 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field827[--Statics.field63];
            if (Statics.field4350.method1571() && var6 >= 0 && var6 < Statics.field4350.field802.method6028()) {
                field827[++Statics.field63 - 1] = ((class376) Statics.field4350.field802.method6037(var6)).field4334;
            } else {
                field827[++Statics.field63 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field828[--Statics.field44];
            int var8 = field827[--Statics.field63];
            class62.method4069(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field828[--Statics.field44];
            Statics.field4350.method1608(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field828[--Statics.field44];
            Statics.field4350.method1581(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field828[--Statics.field44];
            Statics.field4350.method1605(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field828[--Statics.field44];
            Statics.field4350.method1582(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field828[--Statics.field44];
            String var14 = client.method2783(var13);
            field827[++Statics.field63 - 1] = Statics.field4350.method1601(new class461(var14, Statics.field4426), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field303 == null) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = Statics.field303.field4306;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field303 == null) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = Statics.field303.method6028();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field827[--Statics.field63];
            if (Statics.field303 == null || var15 >= Statics.field303.method6028()) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = Statics.field303.method6037(var15).method6011().method7492();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field827[--Statics.field63];
            if (Statics.field303 == null || var16 >= Statics.field303.method6028()) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = ((class376) Statics.field303.method6037(var16)).method6089();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field827[--Statics.field63];
            if (Statics.field303 == null || var17 >= Statics.field303.method6028()) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = ((class376) Statics.field303.method6037(var17)).field4334;
            }
            return 1;
        } else if (arg0 == 3616) {
            field827[++Statics.field63 - 1] = Statics.field303 == null ? 0 : Statics.field303.field4311;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field828[--Statics.field44];
            client.method258(var18);
            return 1;
        } else if (arg0 == 3618) {
            field827[++Statics.field63 - 1] = Statics.field303 == null ? 0 : Statics.field303.field4309;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field828[--Statics.field44];
            client.method5111(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method1958();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field4350.method1571()) {
                field827[++Statics.field63 - 1] = Statics.field4350.field800.method6028();
            } else {
                field827[++Statics.field63 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field827[--Statics.field63];
            if (Statics.field4350.method1571() && var20 >= 0 && var20 < Statics.field4350.field800.method6028()) {
                class375 var21 = (class375) Statics.field4350.field800.method6037(var20);
                field828[++Statics.field44 - 1] = var21.method5999();
                field828[++Statics.field44 - 1] = var21.method6000();
            } else {
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field828[--Statics.field44];
            String var23 = client.method2783(var22);
            field827[++Statics.field63 - 1] = Statics.field4350.method1585(new class461(var23, Statics.field4426)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field827[--Statics.field63];
            if (Statics.field303 == null || var24 >= Statics.field303.method6028() || !Statics.field303.method6037(var24).method6011().equals(Statics.field2657.field1100)) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field303 == null || Statics.field303.field4307 == null) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = Statics.field303.field4307;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field827[--Statics.field63];
            if (Statics.field303 == null || var25 >= Statics.field303.method6028() || !((class371) Statics.field303.method6037(var25)).method5984()) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field827[--Statics.field63];
            if (Statics.field303 == null || var26 >= Statics.field303.method6028() || !((class371) Statics.field303.method6037(var26)).method5987()) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field4350.field802.method6048();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class445(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class446(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class108(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class104(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class107(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class112(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class106(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class105(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class109(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class110(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field4350.field802.method6040();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field4350.field800.method6048();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field827[--Statics.field63] == 1;
            Statics.field4350.field800.method6046(new class445(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field827[--Statics.field63] == 1;
            Statics.field4350.field800.method6046(new class446(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field4350.field800.method6040();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field303 != null) {
                Statics.field303.method6048();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class445(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class446(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class108(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class104(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class107(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class112(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class106(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class105(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class109(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class110(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field303 != null) {
                Statics.field303.method6040();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field827[--Statics.field63] == 1;
            Statics.field4350.field802.method6046(new class111(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field827[--Statics.field63] == 1;
            if (Statics.field303 != null) {
                Statics.field303.method6046(new class111(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gj.ac(ILbb;ZI)I")
    public static int method3178(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field63--;
            Statics.field44--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field63++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lq.ab(ILbb;ZB)I")
    public static int method5396(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field4259 == null) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = 1;
                Statics.field4584 = Statics.field4259;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field827[--Statics.field63];
            if (client.field724[var3] == null) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = 1;
                Statics.field4584 = client.field724[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field828[++Statics.field44 - 1] = Statics.field4584.field1641;
            return 1;
        } else if (arg0 == 3803) {
            field827[++Statics.field63 - 1] = Statics.field4584.field1640 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field827[++Statics.field63 - 1] = Statics.field4584.field1634;
            return 1;
        } else if (arg0 == 3805) {
            field827[++Statics.field63 - 1] = Statics.field4584.field1642;
            return 1;
        } else if (arg0 == 3806) {
            field827[++Statics.field63 - 1] = Statics.field4584.field1643;
            return 1;
        } else if (arg0 == 3807) {
            field827[++Statics.field63 - 1] = Statics.field4584.field1649;
            return 1;
        } else if (arg0 == 3809) {
            field827[++Statics.field63 - 1] = Statics.field4584.field1659;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field827[--Statics.field63];
            field828[++Statics.field44 - 1] = Statics.field4584.field1656[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = Statics.field4584.field1647[var5];
            return 1;
        } else if (arg0 == 3812) {
            field827[++Statics.field63 - 1] = Statics.field4584.field1645;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field827[--Statics.field63];
            field828[++Statics.field44 - 1] = Statics.field4584.field1657[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field63 -= 3;
            int var7 = field827[Statics.field63];
            int var8 = field827[Statics.field63 + 1];
            int var9 = field827[Statics.field63 + 2];
            field827[++Statics.field63 - 1] = Statics.field4584.method2686(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field827[++Statics.field63 - 1] = Statics.field4584.field1644;
            return 1;
        } else if (arg0 == 3816) {
            field827[++Statics.field63 - 1] = Statics.field4584.field1653;
            return 1;
        } else if (arg0 == 3817) {
            field827[++Statics.field63 - 1] = Statics.field4584.method2685(field828[--Statics.field44]);
            return 1;
        } else if (arg0 == 3818) {
            field827[Statics.field63 - 1] = Statics.field4584.method2688()[field827[Statics.field63 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field63 -= 2;
            int var10 = field827[Statics.field63];
            int var11 = field827[Statics.field63 + 1];
            client.method2746(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = Statics.field4584.field1650[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field63 -= 3;
                int var13 = field827[Statics.field63];
                boolean var14 = field827[Statics.field63 + 1] == 1;
                int var15 = field827[Statics.field63 + 2];
                client.method2962(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field827[--Statics.field63];
                field827[++Statics.field63 - 1] = Statics.field4584.field1651[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1403 == null) {
                    field827[++Statics.field63 - 1] = 0;
                } else {
                    field827[++Statics.field63 - 1] = 1;
                    Statics.field3 = Statics.field1403;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field827[--Statics.field63];
                if (client.field765[var17] == null) {
                    field827[++Statics.field63 - 1] = 0;
                } else {
                    field827[++Statics.field63 - 1] = 1;
                    Statics.field3 = client.field765[var17];
                    Statics.field1530 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field828[++Statics.field44 - 1] = Statics.field3.field1711;
                return 1;
            } else if (arg0 == 3853) {
                field827[++Statics.field63 - 1] = Statics.field3.field1707;
                return 1;
            } else if (arg0 == 3854) {
                field827[++Statics.field63 - 1] = Statics.field3.field1712;
                return 1;
            } else if (arg0 == 3855) {
                field827[++Statics.field63 - 1] = Statics.field3.method2763();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field827[--Statics.field63];
                field828[++Statics.field44 - 1] = ((class131) Statics.field3.field1708.get(var18)).field1583.method7492();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field827[--Statics.field63];
                field827[++Statics.field63 - 1] = ((class131) Statics.field3.field1708.get(var19)).field1587;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field827[--Statics.field63];
                field827[++Statics.field63 - 1] = ((class131) Statics.field3.field1708.get(var20)).field1586;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field827[--Statics.field63];
                client.method1964(Statics.field1530, var21);
                return 1;
            } else if (arg0 == 3860) {
                field827[++Statics.field63 - 1] = Statics.field3.method2781(field828[--Statics.field44]);
                return 1;
            } else if (arg0 == 3861) {
                field827[Statics.field63 - 1] = Statics.field3.method2764()[field827[Statics.field63 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field827[++Statics.field63 - 1] = Statics.field1379 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("bn.aj(ILbb;ZI)I")
    public static int method1925(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = client.field766[var3].method5340();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = client.field766[var4].field4093;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = client.field766[var5].field4094;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = client.field766[var6].field4095;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = client.field766[var7].field4097;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = client.field766[var8].field4092;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field827[--Statics.field63];
            int var10 = client.field766[var9].method5339();
            field827[++Statics.field63 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field827[--Statics.field63];
            int var12 = client.field766[var11].method5339();
            field827[++Statics.field63 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field827[--Statics.field63];
            int var14 = client.field766[var13].method5339();
            field827[++Statics.field63 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field827[--Statics.field63];
            int var16 = client.field766[var15].method5339();
            field827[++Statics.field63 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field827[--Statics.field63] == 1;
            if (Statics.field1525 != null) {
                Statics.field1525.method5288(class318.field4060, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field827[--Statics.field63] == 1;
            if (Statics.field1525 != null) {
                Statics.field1525.method5288(class318.field4065, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field63 -= 2;
            boolean var19 = field827[Statics.field63] == 1;
            boolean var20 = field827[Statics.field63 + 1] == 1;
            if (Statics.field1525 != null) {
                client.field767.field476 = var20;
                Statics.field1525.method5288(client.field767, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field827[--Statics.field63] == 1;
            if (Statics.field1525 != null) {
                Statics.field1525.method5288(class318.field4061, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field827[--Statics.field63] == 1;
            if (Statics.field1525 != null) {
                Statics.field1525.method5288(class318.field4064, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field827[++Statics.field63 - 1] = Statics.field1525 == null ? 0 : Statics.field1525.field4066.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field827[--Statics.field63];
            class324 var24 = (class324) Statics.field1525.field4066.get(var23);
            field827[++Statics.field63 - 1] = var24.field4084;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field827[--Statics.field63];
            class324 var26 = (class324) Statics.field1525.field4066.get(var25);
            field828[++Statics.field44 - 1] = var26.method5327();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field827[--Statics.field63];
            class324 var28 = (class324) Statics.field1525.field4066.get(var27);
            field828[++Statics.field44 - 1] = var28.method5328();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field827[--Statics.field63];
            class324 var30 = (class324) Statics.field1525.field4066.get(var29);
            long var31 = class270.method2485() - Statics.field1381 - var30.field4085;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field828[++Statics.field44 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field827[--Statics.field63];
            class324 var38 = (class324) Statics.field1525.field4066.get(var37);
            field827[++Statics.field63 - 1] = var38.field4083.field4095;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field827[--Statics.field63];
            class324 var40 = (class324) Statics.field1525.field4066.get(var39);
            field827[++Statics.field63 - 1] = var40.field4083.field4094;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field827[--Statics.field63];
            class324 var42 = (class324) Statics.field1525.field4066.get(var41);
            field827[++Statics.field63 - 1] = var42.field4083.field4093;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kx.ae(ILbb;ZI)I")
    public static int method5119(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field63 -= 2;
            int var3 = field827[Statics.field63];
            int var4 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field63 -= 2;
            int var5 = field827[Statics.field63];
            int var6 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field63 -= 2;
            int var7 = field827[Statics.field63];
            int var8 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field63 -= 2;
            int var9 = field827[Statics.field63];
            int var10 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field63 -= 5;
            int var13 = field827[Statics.field63];
            int var14 = field827[Statics.field63 + 1];
            int var15 = field827[Statics.field63 + 2];
            int var16 = field827[Statics.field63 + 3];
            int var17 = field827[Statics.field63 + 4];
            field827[++Statics.field63 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field63 -= 2;
            int var18 = field827[Statics.field63];
            int var19 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field63 -= 2;
            int var20 = field827[Statics.field63];
            int var21 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field63 -= 2;
            int var22 = field827[Statics.field63];
            int var23 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field63 -= 2;
            int var24 = field827[Statics.field63];
            int var25 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field63 -= 2;
            int var26 = field827[Statics.field63];
            int var27 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field63 -= 2;
            int var28 = field827[Statics.field63];
            int var29 = field827[Statics.field63 + 1];
            if (var28 == 0) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field63 -= 2;
            int var30 = field827[Statics.field63];
            int var31 = field827[Statics.field63 + 1];
            if (var30 == 0) {
                field827[++Statics.field63 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field827[++Statics.field63 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field827[++Statics.field63 - 1] = var30;
                    break;
                case 2:
                    field827[++Statics.field63 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field827[++Statics.field63 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field827[++Statics.field63 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field827[++Statics.field63 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field63 -= 2;
            int var32 = field827[Statics.field63];
            int var33 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field63 -= 2;
            int var34 = field827[Statics.field63];
            int var35 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field63 -= 3;
            long var36 = (long) field827[Statics.field63];
            long var38 = (long) field827[Statics.field63 + 1];
            long var40 = (long) field827[Statics.field63 + 2];
            field827[++Statics.field63 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class272.method3035(field827[--Statics.field63]);
            field827[++Statics.field63 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field63 -= 2;
            int var43 = field827[Statics.field63];
            int var44 = field827[Statics.field63 + 1];
            field827[++Statics.field63 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field63 -= 3;
            int var45 = field827[Statics.field63];
            int var46 = field827[Statics.field63 + 1];
            int var47 = field827[Statics.field63 + 2];
            field827[++Statics.field63 - 1] = Statics.method2249(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field63 -= 3;
            int var48 = field827[Statics.field63];
            int var49 = field827[Statics.field63 + 1];
            int var50 = field827[Statics.field63 + 2];
            field827[++Statics.field63 - 1] = class272.method1857(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field63 -= 3;
            int var51 = field827[Statics.field63];
            int var52 = field827[Statics.field63 + 1];
            int var53 = field827[Statics.field63 + 2];
            int var54 = 31 - var53;
            field827[++Statics.field63 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field63 -= 4;
            int var55 = field827[Statics.field63];
            int var56 = field827[Statics.field63 + 1];
            int var57 = field827[Statics.field63 + 2];
            int var58 = field827[Statics.field63 + 3];
            int var59 = class272.method1857(var55, var57, var58);
            int var60 = class272.method2762(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field827[++Statics.field63 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field827[Statics.field63 - 1] = class403.method548(field827[Statics.field63 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field827[Statics.field63 - 1] = class403.method3912(field827[Statics.field63 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field63 -= 2;
            int var61 = field827[Statics.field63];
            int var62 = field827[Statics.field63 + 1];
            int var63 = class403.method13(var61, var62);
            field827[++Statics.field63 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field827[Statics.field63 - 1] = Math.abs(field827[Statics.field63 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jb.az(ILbb;ZI)I")
    public static int method4605(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field828[--Statics.field44];
            int var4 = field827[--Statics.field63];
            field828[++Statics.field44 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field44 -= 2;
            String var5 = field828[Statics.field44];
            String var6 = field828[Statics.field44 + 1];
            field828[++Statics.field44 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field828[--Statics.field44];
            int var8 = field827[--Statics.field63];
            field828[++Statics.field44 - 1] = var7 + class344.method1032(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field828[--Statics.field44];
            field828[++Statics.field44 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field827[--Statics.field63];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field832.setTime(new Date(var11));
            int var13 = field832.get(5);
            int var14 = field832.get(2);
            int var15 = field832.get(1);
            field828[++Statics.field44 - 1] = var13 + "-" + field833[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field44 -= 2;
            String var16 = field828[Statics.field44];
            String var17 = field828[Statics.field44 + 1];
            if (Statics.field2657.field1113 != null && Statics.field2657.field1113.field3361) {
                field828[++Statics.field44 - 1] = var17;
            } else {
                field828[++Statics.field44 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field827[--Statics.field63];
            field828[++Statics.field44 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field44 -= 2;
            field827[++Statics.field63 - 1] = class344.method1954(class345.method3081(field828[Statics.field44], field828[Statics.field44 + 1], Statics.field3066));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field828[--Statics.field44];
            Statics.field63 -= 2;
            int var20 = field827[Statics.field63];
            int var21 = field827[Statics.field63 + 1];
            byte[] var22 = Statics.field83.method5249(var21, 0);
            class350 var23 = new class350(var22);
            field827[++Statics.field63 - 1] = var23.method5813(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field828[--Statics.field44];
            Statics.field63 -= 2;
            int var25 = field827[Statics.field63];
            int var26 = field827[Statics.field63 + 1];
            byte[] var27 = Statics.field83.method5249(var26, 0);
            class350 var28 = new class350(var27);
            field827[++Statics.field63 - 1] = var28.method5725(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field44 -= 2;
            String var29 = field828[Statics.field44];
            String var30 = field828[Statics.field44 + 1];
            if (field827[--Statics.field63] == 1) {
                field828[++Statics.field44 - 1] = var29;
            } else {
                field828[++Statics.field44 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field828[--Statics.field44];
            field828[++Statics.field44 - 1] = class351.method5790(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field828[--Statics.field44];
            int var33 = field827[--Statics.field63];
            field828[++Statics.field44 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class344.method42((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class344.method1960((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class344.method2450((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class344.method4910((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field828[--Statics.field44];
            if (var38 == null) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field828[--Statics.field44];
            Statics.field63 -= 2;
            int var40 = field827[Statics.field63];
            int var41 = field827[Statics.field63 + 1];
            field828[++Statics.field44 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field828[--Statics.field44];
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
            field828[++Statics.field44 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field828[--Statics.field44];
            int var48 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field44 -= 2;
            String var49 = field828[Statics.field44];
            String var50 = field828[Statics.field44 + 1];
            int var51 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field828[--Statics.field44];
            field828[++Statics.field44 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.ap(ILbb;ZB)I")
    public static int method1051(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field827[--Statics.field63];
            field828[++Statics.field44 - 1] = class189.method2903(var3).field2183;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field63 -= 2;
            int var4 = field827[Statics.field63];
            int var5 = field827[Statics.field63 + 1];
            class189 var6 = class189.method2903(var4);
            if (var5 < 1 || var5 > 5 || var6.field2156[var5 - 1] == null) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = var6.field2156[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field63 -= 2;
            int var7 = field827[Statics.field63];
            int var8 = field827[Statics.field63 + 1];
            class189 var9 = class189.method2903(var7);
            if (var8 < 1 || var8 > 5 || var9.field2159[var8 - 1] == null) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = var9.field2159[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class189.method2903(var10).field2186;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class189.method2903(var11).field2146 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field827[--Statics.field63];
            class189 var13 = class189.method2903(var12);
            if (var13.field2176 == -1 && var13.field2175 >= 0) {
                field827[++Statics.field63 - 1] = var13.field2175;
            } else {
                field827[++Statics.field63 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field827[--Statics.field63];
            class189 var15 = class189.method2903(var14);
            if (var15.field2176 >= 0 && var15.field2175 >= 0) {
                field827[++Statics.field63 - 1] = var15.field2175;
            } else {
                field827[++Statics.field63 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class189.method2903(var16).field2147 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field827[--Statics.field63];
            class189 var18 = class189.method2903(var17);
            if (var18.field2188 == -1 && var18.field2187 >= 0) {
                field827[++Statics.field63 - 1] = var18.field2187;
            } else {
                field827[++Statics.field63 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field827[--Statics.field63];
            class189 var20 = class189.method2903(var19);
            if (var20.field2188 >= 0 && var20.field2187 >= 0) {
                field827[++Statics.field63 - 1] = var20.field2187;
            } else {
                field827[++Statics.field63 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field828[--Statics.field44];
            int var22 = field827[--Statics.field63];
            client.method369(var21, var22 == 1);
            field827[++Statics.field63 - 1] = Statics.field1398;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field2032 == null || Statics.field3352 >= Statics.field1398) {
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = Statics.field2032[++Statics.field3352 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field3352 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field827[--Statics.field63];
            int var24 = class189.method2903(var23).method3340();
            if (var24 == -1) {
                field827[++Statics.field63 - 1] = var24;
            } else {
                field827[++Statics.field63 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pi.as(ILbb;ZI)I")
    public static int method6645(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field827[++Statics.field63 - 1] = client.field559;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field63 -= 3;
            client.field559 = field827[Statics.field63];
            Statics.field117 = class457.method2544(field827[Statics.field63 + 1]);
            if (Statics.field117 == null) {
                Statics.field117 = class457.field4795;
            }
            client.field659 = field827[Statics.field63 + 2];
            class265 var3 = class265.method4070(class263.field3053, client.field734.field1344);
            var3.field3075.method6876(client.field559);
            var3.field3075.method6876(Statics.field117.field4797);
            var3.field3075.method6876(client.field659);
            client.field734.method2362(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field828[--Statics.field44];
            Statics.field63 -= 2;
            int var5 = field827[Statics.field63];
            int var6 = field827[Statics.field63 + 1];
            class265 var7 = class265.method4070(class263.field3040, client.field734.field1344);
            var7.field3075.method6876(class440.method6331(var4) + 2);
            var7.field3075.method6883(var4);
            var7.field3075.method6876(var5 - 1);
            var7.field3075.method6876(var6);
            client.field734.method2362(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field63 -= 2;
            int var8 = field827[Statics.field63];
            int var9 = field827[Statics.field63 + 1];
            class58 var10 = class99.method3089(var8, var9);
            if (var10 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = var10.field471;
                field827[++Statics.field63 - 1] = var10.field462;
                field828[++Statics.field44 - 1] = var10.field468 == null ? "" : var10.field468;
                field828[++Statics.field44 - 1] = var10.field461 == null ? "" : var10.field461;
                field828[++Statics.field44 - 1] = var10.field469 == null ? "" : var10.field469;
                field827[++Statics.field63 - 1] = var10.method1001() ? 1 : (var10.method1004() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field827[--Statics.field63];
            class58 var12 = class99.method146(var11);
            if (var12 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = var12.field466;
                field827[++Statics.field63 - 1] = var12.field462;
                field828[++Statics.field44 - 1] = var12.field468 == null ? "" : var12.field468;
                field828[++Statics.field44 - 1] = var12.field461 == null ? "" : var12.field461;
                field828[++Statics.field44 - 1] = var12.field469 == null ? "" : var12.field469;
                field827[++Statics.field63 - 1] = var12.method1001() ? 1 : (var12.method1004() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field117 == null) {
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = Statics.field117.field4797;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field828[--Statics.field44];
            int var14 = field827[--Statics.field63];
            class265 var15 = class462.method5302(var14, var13, Statics.field3066, -1);
            client.field734.method2362(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field44 -= 2;
            String var16 = field828[Statics.field44];
            String var17 = field828[Statics.field44 + 1];
            class265 var18 = class265.method4070(class263.field2954, client.field734.field1344);
            var18.field3075.method6877(0);
            int var19 = var18.field3075.field4678;
            var18.field3075.method6883(var16);
            class283.method6008(var18.field3075, var17);
            var18.field3075.method7097(var18.field3075.field4678 - var19);
            client.field734.method2362(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field828[--Statics.field44];
            Statics.field63 -= 2;
            int var21 = field827[Statics.field63];
            int var22 = field827[Statics.field63 + 1];
            class265 var23 = class462.method5302(var21, var20, Statics.field3066, var22);
            client.field734.method2362(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field2657 == null || Statics.field2657.field1100 == null) {
                var24 = "";
            } else {
                var24 = Statics.field2657.field1100.method7492();
            }
            field828[++Statics.field44 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field827[++Statics.field63 - 1] = client.field659;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class99.method2239(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class99.method17(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = class99.method2047(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field828[--Statics.field44];
            client.method2400(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field550 = field828[--Statics.field44].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field828[++Statics.field44 - 1] = client.field550;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field828[--Statics.field44];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field63++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field63 -= 2;
            int var30 = field827[Statics.field63];
            int var31 = field827[Statics.field63 + 1];
            class58 var32 = class99.method3089(var30, var31);
            if (var32 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = var32.field471;
                field827[++Statics.field63 - 1] = var32.field462;
                field828[++Statics.field44 - 1] = var32.field468 == null ? "" : var32.field468;
                field828[++Statics.field44 - 1] = var32.field461 == null ? "" : var32.field461;
                field828[++Statics.field44 - 1] = var32.field469 == null ? "" : var32.field469;
                field827[++Statics.field63 - 1] = var32.method1001() ? 1 : (var32.method1004() ? 2 : 0);
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field827[--Statics.field63];
            class58 var34 = class99.method146(var33);
            if (var34 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = var34.field466;
                field827[++Statics.field63 - 1] = var34.field462;
                field828[++Statics.field44 - 1] = var34.field468 == null ? "" : var34.field468;
                field828[++Statics.field44 - 1] = var34.field461 == null ? "" : var34.field461;
                field828[++Statics.field44 - 1] = var34.field469 == null ? "" : var34.field469;
                field827[++Statics.field63 - 1] = var34.method1001() ? 1 : (var34.method1004() ? 2 : 0);
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hq.au(ILbb;ZB)I")
    public static int method4066(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field827[++Statics.field63 - 1] = client.method2650();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field827[--Statics.field63];
            if (var3 == 1 || var3 == 2) {
                client.method5022(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field827[++Statics.field63 - 1] = Statics.field65.method2155();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field827[--Statics.field63];
            if (var4 == 1 || var4 == 2) {
                Statics.field65.method2126(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field63 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field44 -= 2;
            Statics.field63--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field44--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("le.ak(ILbb;ZI)I")
    public static int method5149(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field63 -= 2;
            int var3 = field827[Statics.field63];
            int var4 = field827[Statics.field63 + 1];
            if (!client.field742) {
                client.field562 = var3;
                client.field523 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field827[++Statics.field63 - 1] = client.field562;
            return 1;
        } else if (arg0 == 5506) {
            field827[++Statics.field63 - 1] = client.field523;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field827[--Statics.field63];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field761 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field827[++Statics.field63 - 1] = client.field761;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kh.af(ILbb;ZI)I")
    public static int method4930(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field540 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field44 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field827[++Statics.field63 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.al(IB)I")
    public static int method1961(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("d.aq(II)I")
    public static int method271(int arg0) {
        return (int) ((Math.log((double) arg0) / field838 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("client.ad(ILbb;ZI)I")
    public static int method1152(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field63 -= 2;
            client.field749 = (short) method1961(field827[Statics.field63]);
            if (client.field749 <= 0) {
                client.field749 = 256;
            }
            client.field750 = (short) method1961(field827[Statics.field63 + 1]);
            if (client.field750 <= 0) {
                client.field750 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field63 -= 2;
            client.field751 = (short) field827[Statics.field63];
            if (client.field751 <= 0) {
                client.field751 = 256;
            }
            client.field752 = (short) field827[Statics.field63 + 1];
            if (client.field752 <= 0) {
                client.field752 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field63 -= 4;
            client.field753 = (short) field827[Statics.field63];
            if (client.field753 <= 0) {
                client.field753 = 1;
            }
            client.field754 = (short) field827[Statics.field63 + 1];
            if (client.field754 <= 0) {
                client.field754 = 32767;
            } else if (client.field754 < client.field753) {
                client.field754 = client.field753;
            }
            client.field657 = (short) field827[Statics.field63 + 2];
            if (client.field657 <= 0) {
                client.field657 = 1;
            }
            client.field756 = (short) field827[Statics.field63 + 3];
            if (client.field756 <= 0) {
                client.field756 = 32767;
            } else if (client.field756 < client.field657) {
                client.field756 = client.field657;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field727 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = -1;
            } else {
                client.method1042(0, 0, client.field727.field3410, client.field727.field3411, false);
                field827[++Statics.field63 - 1] = client.field759;
                field827[++Statics.field63 - 1] = client.field760;
            }
            return 1;
        } else if (arg0 == 6204) {
            field827[++Statics.field63 - 1] = client.field751;
            field827[++Statics.field63 - 1] = client.field752;
            return 1;
        } else if (arg0 == 6205) {
            field827[++Statics.field63 - 1] = method271(client.field749);
            field827[++Statics.field63 - 1] = method271(client.field750);
            return 1;
        } else if (arg0 == 6220) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field827[++Statics.field63 - 1] = Statics.field841;
            return 1;
        } else if (arg0 == 6223) {
            field827[++Statics.field63 - 1] = Statics.field4663;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.an(ILbb;ZI)I")
    public static int method585(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field827[++Statics.field63 - 1] = class61.method2200() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method2171();
            if (var3 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
            } else {
                field827[++Statics.field63 - 1] = var3.field787;
                field827[++Statics.field63 - 1] = var3.field788;
                field828[++Statics.field44 - 1] = var3.field782;
                field827[++Statics.field63 - 1] = var3.field792;
                field827[++Statics.field63 - 1] = var3.field779;
                field828[++Statics.field44 - 1] = var3.field789;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method2761();
            if (var4 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
            } else {
                field827[++Statics.field63 - 1] = var4.field787;
                field827[++Statics.field63 - 1] = var4.field788;
                field828[++Statics.field44 - 1] = var4.field782;
                field827[++Statics.field63 - 1] = var4.field792;
                field827[++Statics.field63 - 1] = var4.field779;
                field828[++Statics.field44 - 1] = var4.field789;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field827[--Statics.field63];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field783; var7++) {
                if (Statics.field785[var7].field787 == var5) {
                    var6 = Statics.field785[var7];
                    break;
                }
            }
            if (var6 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
            } else {
                field827[++Statics.field63 - 1] = var6.field787;
                field827[++Statics.field63 - 1] = var6.field788;
                field828[++Statics.field44 - 1] = var6.field782;
                field827[++Statics.field63 - 1] = var6.field792;
                field827[++Statics.field63 - 1] = var6.field779;
                field828[++Statics.field44 - 1] = var6.field789;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field63 -= 4;
            int var8 = field827[Statics.field63];
            boolean var9 = field827[Statics.field63 + 1] == 1;
            int var10 = field827[Statics.field63 + 2];
            boolean var11 = field827[Statics.field63 + 3] == 1;
            class61.method6165(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field827[--Statics.field63];
            if (var12 >= 0 && var12 < class61.field783) {
                class61 var13 = Statics.field785[var12];
                field827[++Statics.field63 - 1] = var13.field787;
                field827[++Statics.field63 - 1] = var13.field788;
                field828[++Statics.field44 - 1] = var13.field782;
                field827[++Statics.field63 - 1] = var13.field792;
                field827[++Statics.field63 - 1] = var13.field779;
                field828[++Statics.field44 - 1] = var13.field789;
            } else {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
                field827[++Statics.field63 - 1] = 0;
                field827[++Statics.field63 - 1] = 0;
                field828[++Statics.field44 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field640 = field827[--Statics.field63] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field63 -= 2;
            int var14 = field827[Statics.field63];
            int var15 = field827[Statics.field63 + 1];
            class185 var16 = class185.method1959(var15);
            if (var16.method3199()) {
                field828[++Statics.field44 - 1] = class179.method4396(var14).method3122(var15, var16.field2047);
            } else {
                field827[++Statics.field63 - 1] = class179.method4396(var14).method3121(var15, var16.field2046);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field63 -= 2;
            int var17 = field827[Statics.field63];
            int var18 = field827[Statics.field63 + 1];
            class185 var19 = class185.method1959(var18);
            if (var19.method3199()) {
                field828[++Statics.field44 - 1] = class188.method1989(var17).method3315(var18, var19.field2047);
            } else {
                field827[++Statics.field63 - 1] = class188.method1989(var17).method3276(var18, var19.field2046);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field63 -= 2;
            int var20 = field827[Statics.field63];
            int var21 = field827[Statics.field63 + 1];
            class185 var22 = class185.method1959(var21);
            if (var22.method3199()) {
                field828[++Statics.field44 - 1] = class189.method2903(var20).method3339(var21, var22.field2047);
            } else {
                field827[++Statics.field63 - 1] = class189.method2903(var20).method3348(var21, var22.field2046);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field63 -= 2;
            int var23 = field827[Statics.field63];
            int var24 = field827[Statics.field63 + 1];
            class185 var25 = class185.method1959(var24);
            if (var25.method3199()) {
                field828[++Statics.field44 - 1] = class186.method6382(var23).method3216(var24, var25.field2047);
            } else {
                field827[++Statics.field63 - 1] = class186.method6382(var23).method3215(var24, var25.field2046);
            }
            return 1;
        } else if (arg0 == 6518) {
            field827[++Statics.field63 - 1] = client.field491 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field827[++Statics.field63 - 1] = client.field486;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field44--;
            Statics.field63--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field44--;
            Statics.field63--;
            return 1;
        } else if (arg0 == 6524) {
            field827[++Statics.field63 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field827[++Statics.field63 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field827[++Statics.field63 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field827[++Statics.field63 - 1] = client.field487;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lh.aw(ILbb;ZB)I")
    public static int method5386(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1577;
            int var4 = (Statics.field2657.field1182 >> 7) + Statics.field1001;
            int var5 = (Statics.field2657.field1138 >> 7) + Statics.field477;
            Statics.method2950().method6447(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field827[--Statics.field63];
            String var7 = "";
            class226 var8 = Statics.method2950().method6464(var6);
            if (var8 != null) {
                var7 = var8.method4137();
            }
            field828[++Statics.field44 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field827[--Statics.field63];
            Statics.method2950().method6448(var9);
            return 1;
        } else if (arg0 == 6603) {
            field827[++Statics.field63 - 1] = Statics.method2950().method6461();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field827[--Statics.field63];
            Statics.method2950().method6513(var10);
            return 1;
        } else if (arg0 == 6605) {
            field827[++Statics.field63 - 1] = Statics.method2950().method6463() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class290 var11 = new class290(field827[--Statics.field63]);
            Statics.method2950().method6546(var11.field3351, var11.field3354);
            return 1;
        } else if (arg0 == 6607) {
            class290 var12 = new class290(field827[--Statics.field63]);
            Statics.method2950().method6466(var12.field3351, var12.field3354);
            return 1;
        } else if (arg0 == 6608) {
            class290 var13 = new class290(field827[--Statics.field63]);
            Statics.method2950().method6467(var13.field3350, var13.field3351, var13.field3354);
            return 1;
        } else if (arg0 == 6609) {
            class290 var14 = new class290(field827[--Statics.field63]);
            Statics.method2950().method6468(var14.field3350, var14.field3351, var14.field3354);
            return 1;
        } else if (arg0 == 6610) {
            field827[++Statics.field63 - 1] = Statics.method2950().method6469();
            field827[++Statics.field63 - 1] = Statics.method2950().method6483();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field827[--Statics.field63];
            class226 var16 = Statics.method2950().method6464(var15);
            if (var16 == null) {
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = var16.method4167().method4908();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field827[--Statics.field63];
            class226 var18 = Statics.method2950().method6464(var17);
            if (var18 == null) {
                field827[++Statics.field63 - 1] = 0;
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = (var18.method4178() - var18.method4169() + 1) * 64;
                field827[++Statics.field63 - 1] = (var18.method4143() - var18.method4142() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field827[--Statics.field63];
            class226 var20 = Statics.method2950().method6464(var19);
            if (var20 == null) {
                field827[++Statics.field63 - 1] = 0;
                field827[++Statics.field63 - 1] = 0;
                field827[++Statics.field63 - 1] = 0;
                field827[++Statics.field63 - 1] = 0;
            } else {
                field827[++Statics.field63 - 1] = var20.method4169() * 64;
                field827[++Statics.field63 - 1] = var20.method4142() * 64;
                field827[++Statics.field63 - 1] = var20.method4178() * 64 + 64 - 1;
                field827[++Statics.field63 - 1] = var20.method4143() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field827[--Statics.field63];
            class226 var22 = Statics.method2950().method6464(var21);
            if (var22 == null) {
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var22.method4141();
            }
            return 1;
        } else if (arg0 == 6615) {
            class290 var23 = Statics.method2950().method6471();
            if (var23 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var23.field3351;
                field827[++Statics.field63 - 1] = var23.field3354;
            }
            return 1;
        } else if (arg0 == 6616) {
            field827[++Statics.field63 - 1] = Statics.method2950().method6449();
            return 1;
        } else if (arg0 == 6617) {
            class290 var24 = new class290(field827[--Statics.field63]);
            class226 var25 = Statics.method2950().method6450();
            if (var25 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4131(var24.field3350, var24.field3351, var24.field3354);
            if (var26 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var26[0];
                field827[++Statics.field63 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class290 var27 = new class290(field827[--Statics.field63]);
            class226 var28 = Statics.method2950().method6450();
            if (var28 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = -1;
                return 1;
            }
            class290 var29 = var28.method4132(var27.field3351, var27.field3354);
            if (var29 == null) {
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var29.method4908();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field63 -= 2;
            int var30 = field827[Statics.field63];
            class290 var31 = new class290(field827[Statics.field63 + 1]);
            method5946(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field63 -= 2;
            int var32 = field827[Statics.field63];
            class290 var33 = new class290(field827[Statics.field63 + 1]);
            method5946(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field63 -= 2;
            int var34 = field827[Statics.field63];
            class290 var35 = new class290(field827[Statics.field63 + 1]);
            class226 var36 = Statics.method2950().method6464(var34);
            if (var36 == null) {
                field827[++Statics.field63 - 1] = 0;
                return 1;
            } else {
                field827[++Statics.field63 - 1] = var36.method4184(var35.field3350, var35.field3351, var35.field3354) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field827[++Statics.field63 - 1] = Statics.method2950().method6571();
            field827[++Statics.field63 - 1] = Statics.method2950().method6473();
            return 1;
        } else if (arg0 == 6623) {
            class290 var37 = new class290(field827[--Statics.field63]);
            class226 var38 = Statics.method2950().method6446(var37.field3350, var37.field3351, var37.field3354);
            if (var38 == null) {
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var38.method4139();
            }
            return 1;
        } else if (arg0 == 6624) {
            Statics.method2950().method6474(field827[--Statics.field63]);
            return 1;
        } else if (arg0 == 6625) {
            Statics.method2950().method6548();
            return 1;
        } else if (arg0 == 6626) {
            Statics.method2950().method6476(field827[--Statics.field63]);
            return 1;
        } else if (arg0 == 6627) {
            Statics.method2950().method6477();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field827[--Statics.field63] == 1;
            Statics.method2950().method6478(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field827[--Statics.field63];
            Statics.method2950().method6624(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field827[--Statics.field63];
            Statics.method2950().method6563(var41);
            return 1;
        } else if (arg0 == 6631) {
            Statics.method2950().method6523();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field827[--Statics.field63] == 1;
            Statics.method2950().method6475(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field63 -= 2;
            int var43 = field827[Statics.field63];
            boolean var44 = field827[Statics.field63 + 1] == 1;
            Statics.method2950().method6441(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field63 -= 2;
            int var45 = field827[Statics.field63];
            boolean var46 = field827[Statics.field63 + 1] == 1;
            Statics.method2950().method6498(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field827[++Statics.field63 - 1] = Statics.method2950().method6485() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = Statics.method2950().method6486(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field827[--Statics.field63];
            field827[++Statics.field63 - 1] = Statics.method2950().method6620(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field63 -= 2;
            int var49 = field827[Statics.field63];
            class290 var50 = new class290(field827[Statics.field63 + 1]);
            class290 var51 = Statics.method2950().method6490(var49, var50);
            if (var51 == null) {
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var51.method4908();
            }
            return 1;
        } else if (arg0 == 6639) {
            class244 var52 = Statics.method2950().method6492();
            if (var52 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var52.method4095();
                field827[++Statics.field63 - 1] = var52.field2900.method4908();
            }
            return 1;
        } else if (arg0 == 6640) {
            class244 var53 = Statics.method2950().method6493();
            if (var53 == null) {
                field827[++Statics.field63 - 1] = -1;
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var53.method4095();
                field827[++Statics.field63 - 1] = var53.field2900.method4908();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field827[--Statics.field63];
            class172 var55 = class172.method2598(var54);
            if (var55.field1871 == null) {
                field828[++Statics.field44 - 1] = "";
            } else {
                field828[++Statics.field44 - 1] = var55.field1871;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field827[--Statics.field63];
            class172 var57 = class172.method2598(var56);
            field827[++Statics.field63 - 1] = var57.field1869;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field827[--Statics.field63];
            class172 var59 = class172.method2598(var58);
            if (var59 == null) {
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var59.field1887;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field827[--Statics.field63];
            class172 var61 = class172.method2598(var60);
            if (var61 == null) {
                field827[++Statics.field63 - 1] = -1;
            } else {
                field827[++Statics.field63 - 1] = var61.field1880;
            }
            return 1;
        } else if (arg0 == 6697) {
            field827[++Statics.field63 - 1] = Statics.field47.field2925;
            return 1;
        } else if (arg0 == 6698) {
            field827[++Statics.field63 - 1] = Statics.field47.field2924.method4908();
            return 1;
        } else if (arg0 == 6699) {
            field827[++Statics.field63 - 1] = Statics.field47.field2926.method4908();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.ah(ILbb;ZI)I")
    public static int method43(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field63 -= 2;
            Statics.field44--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 6750) {
            field828[++Statics.field44 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field827[++Statics.field63 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field827[--Statics.field63];
            class179 var4 = class179.method4396(var3);
            field828[++Statics.field44 - 1] = var4 == null ? "" : var4.field1966;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("i.ao(ILbb;ZI)I")
    public static int method328(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field828[++Statics.field44 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field827[++Statics.field63 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field828[++Statics.field44 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field827[++Statics.field63 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.av(ILbb;ZI)I")
    public static int method591(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field828[++Statics.field44 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field827[++Statics.field63 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ht.ai(ILbb;ZI)I")
    public static int method3938(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field63 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field63 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field63 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field63 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field44--;
            Statics.field63--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field44--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field63 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field63--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gn.ay(ILbb;ZB)I")
    public static int method3599(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field63++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field44 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field63++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field63++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field63++;
            return 1;
        } else if (arg0 == 7108) {
            field827[++Statics.field63 - 1] = client.method3493() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field63--;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field63 -= 2;
            field827[++Statics.field63 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field63 -= 2;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gj.aa(ILbb;ZI)I")
    public static int method3177(int arg0, class72 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field63 -= 5;
            field827[++Statics.field63 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field63 -= 6;
            field827[++Statics.field63 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field827[Statics.field63 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field63 -= 2;
            field827[++Statics.field63 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field63--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field63 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jt.ax(ILbb;ZI)I")
    public static int method4839(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7400) {
            Statics.field63--;
            Statics.field44--;
            return 1;
        } else if (arg0 == 7401) {
            Statics.field63--;
            Statics.field44--;
            return 1;
        } else if (arg0 == 7402) {
            Statics.field63 -= 2;
            Statics.field44--;
            return 1;
        } else if (arg0 == 7403) {
            Statics.field63 -= 2;
            Statics.field44--;
            return 1;
        } else if (arg0 == 7404) {
            Statics.field63--;
            Statics.field44--;
            return 1;
        } else if (arg0 == 7405) {
            Statics.field63 -= 2;
            return 1;
        } else if (arg0 == 7406) {
            Statics.field63--;
            field828[++Statics.field44 - 1] = "";
            return 1;
        } else if (arg0 == 7407) {
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 7408) {
            Statics.field63 -= 2;
            Statics.field44--;
            field827[++Statics.field63 - 1] = 0;
            return 1;
        } else if (arg0 == 7409) {
            Statics.field63--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ib.at(II)V")
    public static void method4434(int arg0) {
        if (arg0 == -1 || !class295.method4436(arg0)) {
            return;
        }
        class295[] var1 = Statics.field1799[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class295 var3 = var1[var2];
            if (var3.field3516 != null) {
                class81 var4 = new class81();
                var4.field1047 = var3;
                var4.field1062 = var3.field3516;
                method78(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("na.br(ILkd;ZB)V")
    public static void method5946(int arg0, class290 arg1, boolean arg2) {
        class226 var3 = Statics.method2950().method6464(arg0);
        int var4 = Statics.field2657.field1116;
        int var5 = (Statics.field2657.field1182 >> 7) + Statics.field1001;
        int var6 = (Statics.field2657.field1138 >> 7) + Statics.field477;
        class290 var7 = new class290(var4, var5, var6);
        Statics.method2950().method6453(var3, var7, arg1, arg2);
    }
}
