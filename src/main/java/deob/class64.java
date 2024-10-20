package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bv")
public class class64 {

    @ObfuscatedName("bv.a")
    public static int[] field824 = new int[5];

    @ObfuscatedName("bv.e")
    public static int[][] field822 = new int[5][5000];

    @ObfuscatedName("bv.i")
    public static int[] field823 = new int[1000];

    @ObfuscatedName("bv.w")
    public static String[] field832 = new String[1000];

    @ObfuscatedName("bv.v")
    public static int field825 = 0;

    @ObfuscatedName("bv.s")
    public static class57[] field826 = new class57[50];

    @ObfuscatedName("bv.h")
    public static Calendar field835 = Calendar.getInstance();

    @ObfuscatedName("bv.o")
    public static final String[] field828 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bv.n")
    public static boolean field829 = false;

    @ObfuscatedName("bv.u")
    public static boolean field833 = false;

    @ObfuscatedName("bv.d")
    public static ArrayList field831 = new ArrayList();

    @ObfuscatedName("bv.ab")
    public static int field819 = 0;

    @ObfuscatedName("bv.ah")
    public static final double field827 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hq.l(Lcy;I)V")
    public static void method4138(class81 arg0) {
        method738(arg0, 500000, 475000);
    }

    @ObfuscatedName("ac.q(Lcy;III)V")
    public static void method738(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1042;
        class72 var5;
        if (class397.method3578(arg0.field1048)) {
            Statics.field1484 = (class204) var3[0];
            class154 var4 = class154.method156(Statics.field1484.field2232);
            var5 = class72.method3565(arg0.field1048, var4.field1627, var4.field1638);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class72.method13(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field3208 = 0;
        Statics.field436 = 0;
        int var7 = -1;
        int[] var8 = var5.field945;
        int[] var9 = var5.field948;
        byte var10 = -1;
        field825 = 0;
        field829 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field68 = new int[var5.field950];
            int var13 = 0;
            Statics.field2195 = new String[var5.field951];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1047;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1041;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1040 == null ? -1 : arg0.field1040.field3048;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1037;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1040 == null ? -1 : arg0.field1040.field3185;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1043 == null ? -1 : arg0.field1043.field3048;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1043 == null ? -1 : arg0.field1043.field3185;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1044;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1045;
                    }
                    Statics.field68[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1046;
                    }
                    Statics.field2195[var14++] = var17;
                }
            }
            field819 = arg0.field1038;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field948[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method2405(var61, var5, var48);
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
                    field823[++Statics.field3208 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field823[++Statics.field3208 - 1] = class257.field3009[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class257.field3009[var19] = field823[--Statics.field3208];
                    client.method2617(var19);
                } else if (var61 == 3) {
                    field832[++Statics.field436 - 1] = var5.field949[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field3208 -= 2;
                    if (field823[Statics.field3208] != field823[Statics.field3208 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field3208 -= 2;
                    if (field823[Statics.field3208] == field823[Statics.field3208 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field3208 -= 2;
                    if (field823[Statics.field3208] < field823[Statics.field3208 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field3208 -= 2;
                    if (field823[Statics.field3208] > field823[Statics.field3208 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field825 == 0) {
                        return;
                    }
                    class57 var21 = field826[--field825];
                    var5 = var21.field459;
                    var8 = var5.field945;
                    var9 = var5.field948;
                    var7 = var21.field454;
                    Statics.field68 = var21.field456;
                    Statics.field2195 = var21.field457;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field823[++Statics.field3208 - 1] = class257.method2185(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class257.method1987(var23, field823[--Statics.field3208]);
                } else if (var61 == 31) {
                    Statics.field3208 -= 2;
                    if (field823[Statics.field3208] <= field823[Statics.field3208 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field3208 -= 2;
                    if (field823[Statics.field3208] >= field823[Statics.field3208 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field823[++Statics.field3208 - 1] = Statics.field68[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field68[var9[var7]] = field823[--Statics.field3208];
                } else if (var61 == 35) {
                    field832[++Statics.field436 - 1] = Statics.field2195[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field2195[var9[var7]] = field832[--Statics.field436];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field436 -= var24;
                    String var25 = class319.method732(field832, Statics.field436, var24);
                    field832[++Statics.field436 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field3208--;
                } else if (var61 == 39) {
                    Statics.field436--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = class72.method13(var26);
                    int[] var28 = new int[var27.field950];
                    String[] var29 = new String[var27.field951];
                    for (int var30 = 0; var30 < var27.field946; var30++) {
                        var28[var30] = field823[Statics.field3208 - var27.field946 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field953; var31++) {
                        var29[var31] = field832[Statics.field436 - var27.field953 + var31];
                    }
                    Statics.field3208 -= var27.field946;
                    Statics.field436 -= var27.field953;
                    class57 var32 = new class57();
                    var32.field459 = var5;
                    var32.field454 = var7;
                    var32.field456 = Statics.field68;
                    var32.field457 = Statics.field2195;
                    field826[++field825 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field945;
                    var9 = var27.field948;
                    var7 = -1;
                    Statics.field68 = var28;
                    Statics.field2195 = var29;
                } else if (var61 == 42) {
                    field823[++Statics.field3208 - 1] = Statics.field2344.method2211(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field2344.method2184(var9[var7], field823[--Statics.field3208]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field823[--Statics.field3208];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field824[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field822[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field823[--Statics.field3208];
                    if (var39 < 0 || var39 >= field824[var38]) {
                        throw new RuntimeException();
                    }
                    field823[++Statics.field3208 - 1] = field822[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field3208 -= 2;
                    int var41 = field823[Statics.field3208];
                    if (var41 < 0 || var41 >= field824[var40]) {
                        throw new RuntimeException();
                    }
                    field822[var40][var41] = field823[Statics.field3208 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field2344.method2205(var9[var7]);
                    if (var42 == null) {
                        var42 = class283.field3360;
                    }
                    field832[++Statics.field436 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field2344.method2183(var9[var7], field832[--Statics.field436]);
                } else if (var61 == 49) {
                    String var43 = Statics.field2344.method2187(var9[var7]);
                    field832[++Statics.field436 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field2344.method2199(var9[var7], field832[--Statics.field436]);
                } else if (var61 == 60) {
                    class379 var44 = var5.field952[var9[var7]];
                    class369 var45 = (class369) var44.method6049((long) field823[--Statics.field3208]);
                    if (var45 != null) {
                        var7 += var45.field4074;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field3805.method2444(var9[var7]);
                    if (var46 == null) {
                        field823[++Statics.field3208 - 1] = -1;
                    } else {
                        field823[++Statics.field3208 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field3014.method5712(var9[var7]);
                    if (var47 == null) {
                        field823[++Statics.field3208 - 1] = -1;
                    } else {
                        field823[++Statics.field3208 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4075).append(" ");
            for (int var53 = field825 - 1; var53 >= 0; var53--) {
                var52.append("").append(field826[var53].field459.field4075).append(" ");
            }
            var52.append("").append(var10);
            class425.method5430(var52.toString(), var59);
        } finally {
            if (field829) {
                field833 = true;
            }
            while (field831.size() > 0) {
                class93 var56 = (class93) field831.remove(0);
                client.method1004(var56.method2142(), var56.method2153(), var56.method2141(), var56.method2144(), "");
            }
            if (field833) {
                client.method3188();
                field833 = false;
                field829 = false;
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class425.method5430("Warning: Script " + var5.field957 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("dh.f(ILbe;ZI)I")
    public static int method2405(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3731(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2394(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method6031(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2371(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method4996(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method690(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method4392(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method5687(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4250(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method2344(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3544(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2394(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method6031(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2371(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method4996(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method690(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method292(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method1896(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method4681(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method4752(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3544(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method753(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method1975(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method1034(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method5437(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method1781(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method2402(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method2329(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method3513(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method4628(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1935(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3514(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method2292(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method4251(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3591(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method4690(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method2874(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method4636(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3185(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method4019(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method2124(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method4186(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method2494(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method1643(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method4627(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return Statics.method1002(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gv.j(ILbe;ZI)I")
    public static int method3731(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field3208 -= 3;
            int var3 = field823[Statics.field3208];
            int var4 = field823[Statics.field3208 + 1];
            int var5 = field823[Statics.field3208 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class262 var6 = class262.method2058(var3);
            if (var6.field3182 == null) {
                var6.field3182 = new class262[var5 + 1];
            }
            if (var6.field3182.length <= var5) {
                class262[] var7 = new class262[var5 + 1];
                for (int var8 = 0; var8 < var6.field3182.length; var8++) {
                    var7[var8] = var6.field3182[var8];
                }
                var6.field3182 = var7;
            }
            if (var5 > 0 && var6.field3182[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class262 var9 = new class262();
            var9.field3146 = var4;
            var9.field3134 = var9.field3048 = var6.field3048;
            var9.field3185 = var5;
            var9.field3125 = true;
            var6.field3182[var5] = var9;
            if (arg2) {
                Statics.field2172 = var9;
            } else {
                Statics.field2897 = var9;
            }
            client.method204(var6);
            return 1;
        } else if (arg0 == 101) {
            class262 var10 = arg2 ? Statics.field2172 : Statics.field2897;
            class262 var11 = class262.method2058(var10.field3048);
            var11.field3182[var10.field3185] = null;
            client.method204(var11);
            return 1;
        } else if (arg0 == 102) {
            class262 var12 = class262.method2058(field823[--Statics.field3208]);
            var12.field3182 = null;
            client.method204(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field3208 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field3208 -= 2;
            int var13 = field823[Statics.field3208];
            int var14 = field823[Statics.field3208 + 1];
            class262 var15 = class262.method4179(var13, var14);
            if (var15 == null || var14 == -1) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = 1;
                if (arg2) {
                    Statics.field2172 = var15;
                } else {
                    Statics.field2897 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class262 var16 = class262.method2058(field823[--Statics.field3208]);
            if (var16 == null) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = 1;
                if (arg2) {
                    Statics.field2172 = var16;
                } else {
                    Statics.field2897 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field823[Statics.field3208 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field823[--Statics.field3208 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("di.m(ILbe;ZI)I")
    public static int method2394(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class262 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field823[--Statics.field3208];
            var4 = class262.method2058(var3);
        } else {
            var4 = arg2 ? Statics.field2172 : Statics.field2897;
        }
        if (arg0 == 1000) {
            Statics.field3208 -= 4;
            var4.field3057 = field823[Statics.field3208];
            var4.field3058 = field823[Statics.field3208 + 1];
            var4.field3053 = field823[Statics.field3208 + 2];
            var4.field3054 = field823[Statics.field3208 + 3];
            client.method204(var4);
            Statics.field107.method1483(var4);
            if (var3 != -1 && var4.field3146 == 0) {
                client.method2566(Statics.field3153[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field3208 -= 4;
            var4.field3059 = field823[Statics.field3208];
            var4.field3195 = field823[Statics.field3208 + 1];
            var4.field3055 = field823[Statics.field3208 + 2];
            var4.field3056 = field823[Statics.field3208 + 3];
            client.method204(var4);
            Statics.field107.method1483(var4);
            if (var3 != -1 && var4.field3146 == 0) {
                client.method2566(Statics.field3153[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field823[--Statics.field3208] == 1;
            if (var4.field3192 != var5) {
                var4.field3192 = var5;
                client.method204(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3120 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3193 = field823[--Statics.field3208] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nx.k(ILbe;ZI)I")
    public static int method6031(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class262 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field823[--Statics.field3208];
            var4 = class262.method2058(var3);
        } else {
            var4 = arg2 ? Statics.field2172 : Statics.field2897;
        }
        if (arg0 == 1100) {
            Statics.field3208 -= 2;
            var4.field3100 = field823[Statics.field3208];
            if (var4.field3100 > var4.field3071 - var4.field3063) {
                var4.field3100 = var4.field3071 - var4.field3063;
            }
            if (var4.field3100 < 0) {
                var4.field3100 = 0;
            }
            var4.field3081 = field823[Statics.field3208 + 1];
            if (var4.field3081 > var4.field3072 - var4.field3145) {
                var4.field3081 = var4.field3072 - var4.field3145;
            }
            if (var4.field3081 < 0) {
                var4.field3081 = 0;
            }
            client.method204(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3073 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3077 = field823[--Statics.field3208] == 1;
            client.method204(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3190 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3104 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3040 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3085 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3086 = field823[--Statics.field3208] == 1;
            client.method204(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3091 = 1;
            var4.field3178 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field3208 -= 6;
            var4.field3097 = field823[Statics.field3208];
            var4.field3098 = field823[Statics.field3208 + 1];
            var4.field3099 = field823[Statics.field3208 + 2];
            var4.field3069 = field823[Statics.field3208 + 3];
            var4.field3101 = field823[Statics.field3208 + 4];
            var4.field3102 = field823[Statics.field3208 + 5];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field823[--Statics.field3208];
            if (var4.field3095 != var5) {
                var4.field3095 = var5;
                var4.field3180 = 0;
                var4.field3047 = 0;
                client.method204(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3105 = field823[--Statics.field3208] == 1;
            client.method204(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field832[--Statics.field436];
            if (!var6.equals(var4.field3109)) {
                var4.field3109 = var6;
                client.method204(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3108 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field3208 -= 3;
            var4.field3112 = field823[Statics.field3208];
            var4.field3127 = field823[Statics.field3208 + 1];
            var4.field3111 = field823[Statics.field3208 + 2];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3151 = field823[--Statics.field3208] == 1;
            client.method204(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3087 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3088 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3089 = field823[--Statics.field3208] == 1;
            client.method204(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3090 = field823[--Statics.field3208] == 1;
            client.method204(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field3208 -= 2;
            var4.field3071 = field823[Statics.field3208];
            var4.field3072 = field823[Statics.field3208 + 1];
            client.method204(var4);
            if (var3 != -1 && var4.field3146 == 0) {
                client.method2566(Statics.field3153[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method959(var4.field3048, var4.field3185);
            client.field657 = var4;
            client.method204(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3084 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3052 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3080 = field823[--Statics.field3208];
            client.method204(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field823[--Statics.field3208];
            class412 var8 = (class412) class304.method2484(class412.method2407(), var7);
            if (var8 != null) {
                var4.field3078 = var8;
                client.method204(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field823[--Statics.field3208] == 1;
            var4.field3082 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field823[--Statics.field3208] == 1;
            var4.field3106 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field3208 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("df.t(ILbe;ZB)I")
    public static int method2371(int arg0, class72 arg1, boolean arg2) {
        class262 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class262.method2058(field823[--Statics.field3208]);
        } else {
            var3 = arg2 ? Statics.field2172 : Statics.field2897;
        }
        client.method204(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field3208 -= 2;
            int var4 = field823[Statics.field3208];
            int var5 = field823[Statics.field3208 + 1];
            var3.field3096 = var4;
            var3.field3066 = var5;
            class170 var6 = class170.method2099(var4);
            var3.field3099 = var6.field1921;
            var3.field3069 = var6.field1894;
            var3.field3101 = var6.field1895;
            var3.field3097 = var6.field1896;
            var3.field3098 = var6.field1897;
            var3.field3102 = var6.field1924;
            if (arg0 == 1205) {
                var3.field3070 = 0;
            } else if (arg0 == 1212 | var6.field1898 == 1) {
                var3.field3070 = 1;
            } else {
                var3.field3070 = 2;
            }
            if (var3.field3103 > 0) {
                var3.field3102 = var3.field3102 * 32 / var3.field3103;
            } else if (var3.field3059 > 0) {
                var3.field3102 = var3.field3102 * 32 / var3.field3059;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3091 = 2;
            var3.field3178 = field823[--Statics.field3208];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3091 = 3;
            var3.field3178 = Statics.field868.field1062.method4544();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kn.a(ILbe;ZI)I")
    public static int method4996(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class262 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class262.method2058(field823[--Statics.field3208]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2172 : Statics.field2897;
        }
        if (arg0 == 1300) {
            int var5 = field823[--Statics.field3208] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4558(var5, field832[--Statics.field436]);
                return 1;
            } else {
                Statics.field436--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field3208 -= 2;
            int var6 = field823[Statics.field3208];
            int var7 = field823[Statics.field3208 + 1];
            var4.field3129 = class262.method4179(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3132 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3130 = field823[--Statics.field3208];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3060 = field823[--Statics.field3208];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3152 = field832[--Statics.field436];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3133 = field832[--Statics.field436];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3128 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3194 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field3208 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field823[Statics.field3208 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field823[Statics.field3208 + var10];
                        var9[var10 / 2] = (byte) field823[Statics.field3208 + var10 + 1];
                    }
                }
            } else {
                Statics.field3208 -= 2;
                var8 = new byte[] { (byte) field823[Statics.field3208] };
                var9 = new byte[] { (byte) field823[Statics.field3208 + 1] };
            }
            int var11 = field823[--Statics.field3208] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method2509(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field3208 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field823[Statics.field3208] };
            byte[] var14 = new byte[] { (byte) field823[Statics.field3208 + 1] };
            method2509(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field3208 -= 3;
            int var15 = field823[Statics.field3208] - 1;
            int var16 = field823[Statics.field3208 + 1];
            int var17 = field823[Statics.field3208 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method2383(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field823[--Statics.field3208];
            int var20 = field823[--Statics.field3208];
            method2383(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field3208--;
            int var21 = field823[Statics.field3208] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method5401(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method5401(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ef.e(Ljt;I[B[BI)V")
    public static final void method2509(class262 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3116 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3116 = new byte[11][];
            arg0.field3124 = new byte[11][];
            arg0.field3148 = new int[11];
            arg0.field3067 = new int[11];
        }
        arg0.field3116[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3122 = false;
            for (int var4 = 0; var4 < arg0.field3116.length; var4++) {
                if (arg0.field3116[var4] != null) {
                    arg0.field3122 = true;
                    break;
                }
            }
        } else {
            arg0.field3122 = true;
        }
        arg0.field3124[arg1] = arg3;
    }

    @ObfuscatedName("dr.i(Ljt;IIIB)V")
    public static final void method2383(class262 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3148 == null) {
            throw new RuntimeException();
        }
        arg0.field3148[arg1] = arg2;
        arg0.field3067[arg1] = arg3;
    }

    @ObfuscatedName("la.y(Ljt;IB)V")
    public static final void method5401(class262 arg0, int arg1) {
        if (arg0.field3116 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3191 == null) {
            arg0.field3191 = new int[arg0.field3116.length];
        }
        arg0.field3191[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("aq.w(ILbe;ZI)I")
    public static int method690(int arg0, class72 arg1, boolean arg2) {
        class262 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class262.method2058(field823[--Statics.field3208]);
        } else {
            var3 = arg2 ? Statics.field2172 : Statics.field2897;
        }
        String var4 = field832[--Statics.field436];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field823[--Statics.field3208];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field823[--Statics.field3208];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field832[--Statics.field436];
            } else {
                var7[var8] = Integer.valueOf(field823[--Statics.field3208]);
            }
        }
        int var9 = field823[--Statics.field3208];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3136 = var7;
        } else if (arg0 == 1401) {
            var3.field3074 = var7;
        } else if (arg0 == 1402) {
            var3.field3149 = var7;
        } else if (arg0 == 1403) {
            var3.field3161 = var7;
        } else if (arg0 == 1404) {
            var3.field3142 = var7;
        } else if (arg0 == 1405) {
            var3.field3143 = var7;
        } else if (arg0 == 1406) {
            var3.field3036 = var7;
        } else if (arg0 == 1407) {
            var3.field3147 = var7;
            var3.field3083 = var5;
        } else if (arg0 == 1408) {
            var3.field3144 = var7;
        } else if (arg0 == 1409) {
            var3.field3154 = var7;
        } else if (arg0 == 1410) {
            var3.field3064 = var7;
        } else if (arg0 == 1411) {
            var3.field3126 = var7;
        } else if (arg0 == 1412) {
            var3.field3141 = var7;
        } else if (arg0 == 1414) {
            var3.field3140 = var7;
            var3.field3131 = var5;
        } else if (arg0 == 1415) {
            var3.field3123 = var7;
            var3.field3062 = var5;
        } else if (arg0 == 1416) {
            var3.field3041 = var7;
        } else if (arg0 == 1417) {
            var3.field3155 = var7;
        } else if (arg0 == 1418) {
            var3.field3139 = var7;
        } else if (arg0 == 1419) {
            var3.field3157 = var7;
        } else if (arg0 == 1420) {
            var3.field3160 = var7;
        } else if (arg0 == 1421) {
            var3.field3079 = var7;
        } else if (arg0 == 1422) {
            var3.field3156 = var7;
        } else if (arg0 == 1423) {
            var3.field3093 = var7;
        } else if (arg0 == 1424) {
            var3.field3150 = var7;
        } else if (arg0 == 1425) {
            var3.field3168 = var7;
        } else if (arg0 == 1426) {
            var3.field3169 = var7;
        } else if (arg0 == 1427) {
            var3.field3167 = var7;
        } else if (arg0 == 1428) {
            var3.field3162 = var7;
        } else if (arg0 == 1429) {
            var3.field3164 = var7;
        } else if (arg0 == 1430) {
            var3.field3158 = var7;
        } else if (arg0 == 1431) {
            var3.field3159 = var7;
        } else {
            return 2;
        }
        var3.field3165 = true;
        return 1;
    }

    @ObfuscatedName("ig.g(ILbe;ZI)I")
    public static int method4392(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field2172 : Statics.field2897;
        if (arg0 == 1500) {
            field823[++Statics.field3208 - 1] = var3.field3061;
            return 1;
        } else if (arg0 == 1501) {
            field823[++Statics.field3208 - 1] = var3.field3172;
            return 1;
        } else if (arg0 == 1502) {
            field823[++Statics.field3208 - 1] = var3.field3063;
            return 1;
        } else if (arg0 == 1503) {
            field823[++Statics.field3208 - 1] = var3.field3145;
            return 1;
        } else if (arg0 == 1504) {
            field823[++Statics.field3208 - 1] = var3.field3192 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field823[++Statics.field3208 - 1] = var3.field3134;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("me.v(ILbe;ZB)I")
    public static int method5687(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field2172 : Statics.field2897;
        if (arg0 == 1600) {
            field823[++Statics.field3208 - 1] = var3.field3100;
            return 1;
        } else if (arg0 == 1601) {
            field823[++Statics.field3208 - 1] = var3.field3081;
            return 1;
        } else if (arg0 == 1602) {
            field832[++Statics.field436 - 1] = var3.field3109;
            return 1;
        } else if (arg0 == 1603) {
            field823[++Statics.field3208 - 1] = var3.field3071;
            return 1;
        } else if (arg0 == 1604) {
            field823[++Statics.field3208 - 1] = var3.field3072;
            return 1;
        } else if (arg0 == 1605) {
            field823[++Statics.field3208 - 1] = var3.field3102;
            return 1;
        } else if (arg0 == 1606) {
            field823[++Statics.field3208 - 1] = var3.field3099;
            return 1;
        } else if (arg0 == 1607) {
            field823[++Statics.field3208 - 1] = var3.field3101;
            return 1;
        } else if (arg0 == 1608) {
            field823[++Statics.field3208 - 1] = var3.field3069;
            return 1;
        } else if (arg0 == 1609) {
            field823[++Statics.field3208 - 1] = var3.field3190;
            return 1;
        } else if (arg0 == 1610) {
            field823[++Statics.field3208 - 1] = var3.field3080;
            return 1;
        } else if (arg0 == 1611) {
            field823[++Statics.field3208 - 1] = var3.field3073;
            return 1;
        } else if (arg0 == 1612) {
            field823[++Statics.field3208 - 1] = var3.field3052;
            return 1;
        } else if (arg0 == 1613) {
            field823[++Statics.field3208 - 1] = var3.field3078.method36();
            return 1;
        } else if (arg0 == 1614) {
            field823[++Statics.field3208 - 1] = var3.field3106 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field3208++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ip.s(ILbe;ZI)I")
    public static int method4250(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field2172 : Statics.field2897;
        if (arg0 == 1700) {
            field823[++Statics.field3208 - 1] = var3.field3096;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3096 == -1) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = var3.field3066;
            }
            return 1;
        } else if (arg0 == 1702) {
            field823[++Statics.field3208 - 1] = var3.field3185;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.c(ILbe;ZI)I")
    public static int method2344(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field2172 : Statics.field2897;
        if (arg0 == 1800) {
            field823[++Statics.field3208 - 1] = class263.method1729(client.method3375(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field823[--Statics.field3208];
            int var5 = var4 - 1;
            if (var3.field3128 == null || var5 >= var3.field3128.length || var3.field3128[var5] == null) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = var3.field3128[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3152 == null) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = var3.field3152;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gw.b(ILbe;ZI)I")
    public static int method3544(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field819 >= 10) {
                throw new RuntimeException();
            }
            class262 var10;
            if (arg0 >= 2000) {
                var10 = class262.method2058(field823[--Statics.field3208]);
            } else {
                var10 = arg2 ? Statics.field2172 : Statics.field2897;
            }
            if (var10.field3167 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1040 = var10;
            var11.field1042 = var10.field3167;
            var11.field1038 = field819 + 1;
            client.field770.method5015(var11);
            return 1;
        } else if (arg0 == 1928) {
            class262 var3 = arg2 ? Statics.field2172 : Statics.field2897;
            int var4 = field823[--Statics.field3208];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class93 var5 = new class93(var4, var3.field3048, var3.field3185, var3.field3096);
            field831.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field3208 -= 3;
            int var6 = field823[Statics.field3208];
            int var7 = field823[Statics.field3208 + 1];
            int var8 = field823[Statics.field3208 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class93 var9 = new class93(var8, var6, var7, class262.method2058(var6).field3096);
            field831.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.x(ILbe;ZI)I")
    public static int method292(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = class262.method2058(field823[--Statics.field3208]);
        if (arg0 == 2500) {
            field823[++Statics.field3208 - 1] = var3.field3061;
            return 1;
        } else if (arg0 == 2501) {
            field823[++Statics.field3208 - 1] = var3.field3172;
            return 1;
        } else if (arg0 == 2502) {
            field823[++Statics.field3208 - 1] = var3.field3063;
            return 1;
        } else if (arg0 == 2503) {
            field823[++Statics.field3208 - 1] = var3.field3145;
            return 1;
        } else if (arg0 == 2504) {
            field823[++Statics.field3208 - 1] = var3.field3192 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field823[++Statics.field3208 - 1] = var3.field3134;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.p(ILbe;ZI)I")
    public static int method1896(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = class262.method2058(field823[--Statics.field3208]);
        if (arg0 == 2600) {
            field823[++Statics.field3208 - 1] = var3.field3100;
            return 1;
        } else if (arg0 == 2601) {
            field823[++Statics.field3208 - 1] = var3.field3081;
            return 1;
        } else if (arg0 == 2602) {
            field832[++Statics.field436 - 1] = var3.field3109;
            return 1;
        } else if (arg0 == 2603) {
            field823[++Statics.field3208 - 1] = var3.field3071;
            return 1;
        } else if (arg0 == 2604) {
            field823[++Statics.field3208 - 1] = var3.field3072;
            return 1;
        } else if (arg0 == 2605) {
            field823[++Statics.field3208 - 1] = var3.field3102;
            return 1;
        } else if (arg0 == 2606) {
            field823[++Statics.field3208 - 1] = var3.field3099;
            return 1;
        } else if (arg0 == 2607) {
            field823[++Statics.field3208 - 1] = var3.field3101;
            return 1;
        } else if (arg0 == 2608) {
            field823[++Statics.field3208 - 1] = var3.field3069;
            return 1;
        } else if (arg0 == 2609) {
            field823[++Statics.field3208 - 1] = var3.field3190;
            return 1;
        } else if (arg0 == 2610) {
            field823[++Statics.field3208 - 1] = var3.field3080;
            return 1;
        } else if (arg0 == 2611) {
            field823[++Statics.field3208 - 1] = var3.field3073;
            return 1;
        } else if (arg0 == 2612) {
            field823[++Statics.field3208 - 1] = var3.field3052;
            return 1;
        } else if (arg0 == 2613) {
            field823[++Statics.field3208 - 1] = var3.field3078.method36();
            return 1;
        } else if (arg0 == 2614) {
            field823[++Statics.field3208 - 1] = var3.field3106 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field3208++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jw.z(ILbe;ZI)I")
    public static int method4681(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class262 var3 = class262.method2058(field823[--Statics.field3208]);
            field823[++Statics.field3208 - 1] = var3.field3096;
            return 1;
        } else if (arg0 == 2701) {
            class262 var4 = class262.method2058(field823[--Statics.field3208]);
            if (var4.field3096 == -1) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = var4.field3066;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field823[--Statics.field3208];
            class80 var6 = (class80) client.field652.method6061((long) var5);
            if (var6 == null) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field823[++Statics.field3208 - 1] = client.field718;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kr.h(ILbe;ZB)I")
    public static int method4752(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = class262.method2058(field823[--Statics.field3208]);
        if (arg0 == 2800) {
            field823[++Statics.field3208 - 1] = class263.method1729(client.method3375(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field823[--Statics.field3208];
            int var5 = var4 - 1;
            if (var3.field3128 == null || var5 >= var3.field3128.length || var3.field3128[var5] == null) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = var3.field3128[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3152 == null) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = var3.field3152;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("at.o(ILbe;ZI)I")
    public static int method753(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field832[--Statics.field436];
            class98.method5671(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field3208 -= 2;
            client.method2819(Statics.field868, field823[Statics.field3208], field823[Statics.field3208 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field833) {
                field829 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field832[--Statics.field436];
            int var5 = 0;
            if (class319.method6082(var4)) {
                var5 = class319.method4679(var4);
            }
            class242 var6 = class242.method2075(class240.field2743, client.field639.field1287);
            var6.field2780.method6258(var5);
            client.field639.method2246(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field832[--Statics.field436];
            class242 var8 = class242.method2075(class240.field2667, client.field639.field1287);
            var8.field2780.method6269(var7.length() + 1);
            var8.field2780.method6489(var7);
            client.field639.method2246(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field832[--Statics.field436];
            class242 var10 = class242.method2075(class240.field2742, client.field639.field1287);
            var10.field2780.method6269(var9.length() + 1);
            var10.field2780.method6489(var9);
            client.field639.method2246(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field823[--Statics.field3208];
            String var12 = field832[--Statics.field436];
            client.method97(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field3208 -= 3;
            int var13 = field823[Statics.field3208];
            int var14 = field823[Statics.field3208 + 1];
            int var15 = field823[Statics.field3208 + 2];
            class262 var16 = class262.method2058(var15);
            client.method4873(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field3208 -= 2;
            int var17 = field823[Statics.field3208];
            int var18 = field823[Statics.field3208 + 1];
            class262 var19 = arg2 ? Statics.field2172 : Statics.field2897;
            client.method4873(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1784 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field823[++Statics.field3208 - 1] = Statics.field3227.field1202 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field3227.field1202 = field823[--Statics.field3208] == 1;
            class89.method1005();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field832[--Statics.field436];
            boolean var21 = field823[--Statics.field3208] == 1;
            class30.method2095(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field823[--Statics.field3208];
            class242 var23 = class242.method2075(class240.field2674, client.field639.field1287);
            var23.field2780.method6256(var22);
            client.field639.method2246(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field823[--Statics.field3208];
            Statics.field436 -= 2;
            String var25 = field832[Statics.field436];
            String var26 = field832[Statics.field436 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class242 var27 = class242.method2075(class240.field2680, client.field639.field1287);
                var27.field2780.method6256(1 + class401.method2370(var25) + class401.method2370(var26));
                var27.field2780.method6489(var26);
                var27.field2780.method6489(var25);
                var27.field2780.method6442(var24);
                client.field639.method2246(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field637 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field772 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field694 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field823[--Statics.field3208] == 1) {
                client.field611 |= 0x1;
            } else {
                client.field611 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field823[--Statics.field3208] == 1) {
                client.field611 |= 0x2;
            } else {
                client.field611 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field823[--Statics.field3208] == 1) {
                client.field611 |= 0x4;
            } else {
                client.field611 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field823[--Statics.field3208] == 1) {
                client.field611 |= 0x8;
            } else {
                client.field611 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field611 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field590 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field768 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3824(field823[--Statics.field3208] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field823[++Statics.field3208 - 1] = client.method3512() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field3208 -= 2;
            client.field571 = field823[Statics.field3208];
            client.field572 = field823[Statics.field3208 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field3208 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 3132) {
            field823[++Statics.field3208 - 1] = Statics.field3203;
            field823[++Statics.field3208 - 1] = Statics.field1050;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field3208 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field510 = 3;
            client.field674 = field823[--Statics.field3208];
            return 1;
        } else if (arg0 == 3137) {
            client.field510 = 2;
            client.field674 = field823[--Statics.field3208];
            return 1;
        } else if (arg0 == 3138) {
            client.field510 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field510 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field510 = 3;
            client.field674 = arg2 ? Statics.field2172.field3048 : Statics.field2897.field3048;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field823[--Statics.field3208] == 1;
            Statics.field3227.field1204 = var28;
            class89.method1005();
            return 1;
        } else if (arg0 == 3142) {
            field823[++Statics.field3208 - 1] = Statics.field3227.field1204 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field823[--Statics.field3208] == 1;
            client.field581 = var29;
            if (!var29) {
                Statics.field3227.field1199 = "";
                class89.method1005();
            }
            return 1;
        } else if (arg0 == 3144) {
            field823[++Statics.field3208 - 1] = client.field581 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field823[--Statics.field3208] == 1;
            if (Statics.field3227.field1208 == var30) {
                Statics.field3227.field1208 = !var30;
                class89.method1005();
            }
            return 1;
        } else if (arg0 == 3147) {
            field823[++Statics.field3208 - 1] = Statics.field3227.field1208 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field823[++Statics.field3208 - 1] = class69.field882;
            return 1;
        } else if (arg0 == 3154) {
            field823[++Statics.field3208 - 1] = client.method53();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field436--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field3208 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field3208--;
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field3208--;
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field436--;
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field3208--;
            field832[++Statics.field436 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field3208--;
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field3208 -= 2;
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field3208 -= 2;
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field3208 -= 2;
            field832[++Statics.field436 - 1] = "";
            field832[++Statics.field436 - 1] = "";
            field832[++Statics.field436 - 1] = "";
            field832[++Statics.field436 - 1] = "";
            field832[++Statics.field436 - 1] = "";
            field832[++Statics.field436 - 1] = "";
            field832[++Statics.field436 - 1] = "";
            field832[++Statics.field436 - 1] = "";
            field832[++Statics.field436 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field3208--;
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 3175) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field436--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field436--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field823[--Statics.field3208], 0), 100);
            Statics.method4662((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field3227.field1213 - 0.5F) * 200.0F;
            field823[++Statics.field3208 - 1] = 100 - Math.round(var32);
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field3208--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cy.r(ILbe;ZI)I")
    public static int method1975(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field3208 -= 3;
            client.method3501(field823[Statics.field3208], field823[Statics.field3208 + 1], field823[Statics.field3208 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method3550(field823[--Statics.field3208]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field3208 -= 2;
            client.method714(field823[Statics.field3208], field823[Statics.field3208 + 1]);
            return 1;
        } else if (arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            int var6 = 0;
            int var7 = field823[--Statics.field3208];
            if (arg0 == 3209) {
                var6 = field823[--Statics.field3208];
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
                Statics.method4662((double) ((float) var8 / 200.0F + 0.5F));
            } else if (var6 == 7) {
                int var9 = Math.min(Math.max(var7, 0), 100);
                client.method423(Math.round((float) var9 * 2.55F));
            } else if (var6 == 8) {
                int var10 = Math.min(Math.max(var7, 0), 100);
                client.method2489(Math.round((float) var10 * 1.27F));
            } else if (var6 == 9) {
                int var11 = Math.min(Math.max(var7, 0), 100);
                client.method1043(Math.round((float) var11 * 1.27F));
            }
            return 1;
        } else if (arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            int var3 = 0;
            int var4 = 0;
            if (arg0 == 3210) {
                var3 = field823[--Statics.field3208];
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
                float var5 = ((float) Statics.field3227.field1213 - 0.5F) * 200.0F;
                var4 = 100 - Math.round(var5);
            } else if (var3 == 7) {
                var4 = Math.round((float) Statics.field3227.field1207 / 2.55F);
            } else if (var3 == 8) {
                var4 = Math.round((float) Statics.field3227.field1205 / 1.27F);
            } else if (var3 == 9) {
                var4 = Math.round((float) Statics.field3227.field1201 / 1.27F);
            }
            field823[++Statics.field3208 - 1] = var4;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.n(ILbe;ZI)I")
    public static int method1034(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field823[++Statics.field3208 - 1] = client.field494;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field3208 -= 2;
            int var3 = field823[Statics.field3208];
            int var4 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = class78.method2314(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field3208 -= 2;
            int var5 = field823[Statics.field3208];
            int var6 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = class78.method2114(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field3208 -= 2;
            int var7 = field823[Statics.field3208];
            int var8 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = class78.method2505(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class152.method3211(var9).field1613;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.field623[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.field624[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.field625[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field2592;
            int var14 = (Statics.field868.field1140 >> 7) + Statics.field2131;
            int var15 = (Statics.field868.field1124 >> 7) + Statics.field3028;
            field823[++Statics.field3208 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field823[++Statics.field3208 - 1] = client.field486 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field3208 -= 2;
            int var19 = field823[Statics.field3208] + 32768;
            int var20 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = class78.method2314(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field3208 -= 2;
            int var21 = field823[Statics.field3208] + 32768;
            int var22 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = class78.method2114(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field3208 -= 2;
            int var23 = field823[Statics.field3208] + 32768;
            int var24 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = class78.method2505(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field660 >= 2) {
                field823[++Statics.field3208 - 1] = client.field660;
            } else {
                field823[++Statics.field3208 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field823[++Statics.field3208 - 1] = client.field501;
            return 1;
        } else if (arg0 == 3318) {
            field823[++Statics.field3208 - 1] = client.field483;
            return 1;
        } else if (arg0 == 3321) {
            field823[++Statics.field3208 - 1] = client.field658;
            return 1;
        } else if (arg0 == 3322) {
            field823[++Statics.field3208 - 1] = client.field659;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field518) {
                field823[++Statics.field3208 - 1] = 1;
            } else {
                field823[++Statics.field3208 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field823[++Statics.field3208 - 1] = client.field484;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field3208 -= 4;
            int var25 = field823[Statics.field3208];
            int var26 = field823[Statics.field3208 + 1];
            int var27 = field823[Statics.field3208 + 2];
            int var28 = field823[Statics.field3208 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field823[++Statics.field3208 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field823[++Statics.field3208 - 1] = client.field496;
            return 1;
        } else if (arg0 == 3327) {
            field823[++Statics.field3208 - 1] = client.field497;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lk.u(ILbe;ZB)I")
    public static int method5437(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field3208 -= 2;
            int var3 = field823[Statics.field3208];
            int var4 = field823[Statics.field3208 + 1];
            class159 var5 = class159.method2853(var3);
            if (var5.field1694 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1697; var6++) {
                if (var5.field1698[var6] == var4) {
                    field832[++Statics.field436 - 1] = var5.field1700[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field832[++Statics.field436 - 1] = var5.field1702;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field3208 -= 4;
            int var7 = field823[Statics.field3208];
            int var8 = field823[Statics.field3208 + 1];
            int var9 = field823[Statics.field3208 + 2];
            int var10 = field823[Statics.field3208 + 3];
            class159 var11 = class159.method2853(var9);
            if (var11.field1701 != var7 || var11.field1694 != var8) {
                if (var8 == 115) {
                    field832[++Statics.field436 - 1] = class283.field3360;
                } else {
                    field823[++Statics.field3208 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1697; var12++) {
                if (var11.field1698[var12] == var10) {
                    if (var8 == 115) {
                        field832[++Statics.field436 - 1] = var11.field1700[var12];
                    } else {
                        field823[++Statics.field3208 - 1] = var11.field1699[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field832[++Statics.field436 - 1] = var11.field1702;
                } else {
                    field823[++Statics.field3208 - 1] = var11.field1696;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field823[--Statics.field3208];
            class159 var14 = class159.method2853(var13);
            field823[++Statics.field3208 - 1] = var14.method2744();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.d(ILbe;ZI)I")
    public static int method1781(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class24.method40(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class24.method4245(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class24.method2243(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dw.ab(ILbe;ZI)I")
    public static int method2402(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field464.field799 == 0) {
                field823[++Statics.field3208 - 1] = -2;
            } else if (Statics.field464.field799 == 1) {
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = Statics.field464.field796.method5564();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field823[--Statics.field3208];
            if (Statics.field464.method1563() && var3 >= 0 && var3 < Statics.field464.field796.method5564()) {
                class335 var4 = (class335) Statics.field464.field796.method5547(var3);
                field832[++Statics.field436 - 1] = var4.method5512();
                field832[++Statics.field436 - 1] = var4.method5510();
            } else {
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field823[--Statics.field3208];
            if (Statics.field464.method1563() && var5 >= 0 && var5 < Statics.field464.field796.method5564()) {
                field823[++Statics.field3208 - 1] = ((class342) Statics.field464.field796.method5547(var5)).field3976;
            } else {
                field823[++Statics.field3208 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field823[--Statics.field3208];
            if (Statics.field464.method1563() && var6 >= 0 && var6 < Statics.field464.field796.method5564()) {
                field823[++Statics.field3208 - 1] = ((class342) Statics.field464.field796.method5547(var6)).field3974;
            } else {
                field823[++Statics.field3208 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field832[--Statics.field436];
            int var8 = field823[--Statics.field3208];
            class62.method200(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field832[--Statics.field436];
            Statics.field464.method1570(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field832[--Statics.field436];
            Statics.field464.method1574(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field832[--Statics.field436];
            Statics.field464.method1572(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field832[--Statics.field436];
            Statics.field464.method1575(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field832[--Statics.field436];
            String var14 = client.method5711(var13);
            field823[++Statics.field3208 - 1] = Statics.field464.method1568(new class422(var14, Statics.field2137), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field3205 == null) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = Statics.field3205.field3943;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field3205 == null) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = Statics.field3205.method5564();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field823[--Statics.field3208];
            if (Statics.field3205 == null || var15 >= Statics.field3205.method5564()) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = Statics.field3205.method5547(var15).method5508().method6815();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field823[--Statics.field3208];
            if (Statics.field3205 == null || var16 >= Statics.field3205.method5564()) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = ((class342) Statics.field3205.method5547(var16)).method5611();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field823[--Statics.field3208];
            if (Statics.field3205 == null || var17 >= Statics.field3205.method5564()) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = ((class342) Statics.field3205.method5547(var17)).field3974;
            }
            return 1;
        } else if (arg0 == 3616) {
            field823[++Statics.field3208 - 1] = Statics.field3205 == null ? 0 : Statics.field3205.field3947;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field832[--Statics.field436];
            client.method736(var18);
            return 1;
        } else if (arg0 == 3618) {
            field823[++Statics.field3208 - 1] = Statics.field3205 == null ? 0 : Statics.field3205.field3942;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field832[--Statics.field436];
            Statics.method153(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method4888();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field464.method1563()) {
                field823[++Statics.field3208 - 1] = Statics.field464.field794.method5564();
            } else {
                field823[++Statics.field3208 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field823[--Statics.field3208];
            if (Statics.field464.method1563() && var20 >= 0 && var20 < Statics.field464.field794.method5564()) {
                class341 var21 = (class341) Statics.field464.field794.method5547(var20);
                field832[++Statics.field436 - 1] = var21.method5512();
                field832[++Statics.field436 - 1] = var21.method5510();
            } else {
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field832[--Statics.field436];
            String var23 = client.method5711(var22);
            field823[++Statics.field3208 - 1] = Statics.field464.method1569(new class422(var23, Statics.field2137)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field823[--Statics.field3208];
            if (Statics.field3205 == null || var24 >= Statics.field3205.method5564() || !Statics.field3205.method5547(var24).method5508().equals(Statics.field868.field1067)) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field3205 == null || Statics.field3205.field3944 == null) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = Statics.field3205.field3944;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field823[--Statics.field3208];
            if (Statics.field3205 == null || var25 >= Statics.field3205.method5564() || !((class337) Statics.field3205.method5547(var25)).method5503()) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field823[--Statics.field3208];
            if (Statics.field3205 == null || var26 >= Statics.field3205.method5564() || !((class337) Statics.field3205.method5547(var26)).method5495()) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field464.field796.method5556();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class406(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class407(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class106(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class102(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class105(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class110(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class104(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class103(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class107(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class108(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field464.field796.method5552();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field464.field794.method5556();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field823[--Statics.field3208] == 1;
            Statics.field464.field794.method5557(new class406(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field823[--Statics.field3208] == 1;
            Statics.field464.field794.method5557(new class407(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field464.field794.method5552();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field3205 != null) {
                Statics.field3205.method5556();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class406(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class407(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class106(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class102(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class105(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class110(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class104(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class103(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class107(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class108(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field3205 != null) {
                Statics.field3205.method5552();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field823[--Statics.field3208] == 1;
            Statics.field464.field796.method5557(new class109(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field823[--Statics.field3208] == 1;
            if (Statics.field3205 != null) {
                Statics.field3205.method5557(new class109(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dx.ad(ILbe;ZI)I")
    public static int method2329(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field3208--;
            Statics.field436--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field3208++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gs.as(ILbe;ZI)I")
    public static int method3513(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1373 == null) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = 1;
                Statics.field3805 = Statics.field1373;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field823[--Statics.field3208];
            if (client.field721[var3] == null) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = 1;
                Statics.field3805 = client.field721[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field832[++Statics.field436 - 1] = Statics.field3805.field1449;
            return 1;
        } else if (arg0 == 3803) {
            field823[++Statics.field3208 - 1] = Statics.field3805.field1454 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field823[++Statics.field3208 - 1] = Statics.field3805.field1451;
            return 1;
        } else if (arg0 == 3805) {
            field823[++Statics.field3208 - 1] = Statics.field3805.field1453;
            return 1;
        } else if (arg0 == 3806) {
            field823[++Statics.field3208 - 1] = Statics.field3805.field1460;
            return 1;
        } else if (arg0 == 3807) {
            field823[++Statics.field3208 - 1] = Statics.field3805.field1467;
            return 1;
        } else if (arg0 == 3809) {
            field823[++Statics.field3208 - 1] = Statics.field3805.field1456;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field823[--Statics.field3208];
            field832[++Statics.field436 - 1] = Statics.field3805.field1469[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = Statics.field3805.field1458[var5];
            return 1;
        } else if (arg0 == 3812) {
            field823[++Statics.field3208 - 1] = Statics.field3805.field1465;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field823[--Statics.field3208];
            field832[++Statics.field436 - 1] = Statics.field3805.field1445[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field3208 -= 3;
            int var7 = field823[Statics.field3208];
            int var8 = field823[Statics.field3208 + 1];
            int var9 = field823[Statics.field3208 + 2];
            field823[++Statics.field3208 - 1] = Statics.field3805.method2414(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field823[++Statics.field3208 - 1] = Statics.field3805.field1463;
            return 1;
        } else if (arg0 == 3816) {
            field823[++Statics.field3208 - 1] = Statics.field3805.field1452;
            return 1;
        } else if (arg0 == 3817) {
            field823[++Statics.field3208 - 1] = Statics.field3805.method2413(field832[--Statics.field436]);
            return 1;
        } else if (arg0 == 3818) {
            field823[Statics.field3208 - 1] = Statics.field3805.method2442()[field823[Statics.field3208 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field3208 -= 2;
            int var10 = field823[Statics.field3208];
            int var11 = field823[Statics.field3208 + 1];
            client.method2268(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = Statics.field3805.field1461[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field3208 -= 3;
                int var13 = field823[Statics.field3208];
                boolean var14 = field823[Statics.field3208 + 1] == 1;
                int var15 = field823[Statics.field3208 + 2];
                client.method2360(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field823[--Statics.field3208];
                field823[++Statics.field3208 - 1] = Statics.field3805.field1462[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field3746 == null) {
                    field823[++Statics.field3208 - 1] = 0;
                } else {
                    field823[++Statics.field3208 - 1] = 1;
                    Statics.field1348 = Statics.field3746;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field823[--Statics.field3208];
                if (client.field722[var17] == null) {
                    field823[++Statics.field3208 - 1] = 0;
                } else {
                    field823[++Statics.field3208 - 1] = 1;
                    Statics.field1348 = client.field722[var17];
                    Statics.field1286 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field832[++Statics.field436 - 1] = Statics.field1348.field1517;
                return 1;
            } else if (arg0 == 3853) {
                field823[++Statics.field3208 - 1] = Statics.field1348.field1513;
                return 1;
            } else if (arg0 == 3854) {
                field823[++Statics.field3208 - 1] = Statics.field1348.field1518;
                return 1;
            } else if (arg0 == 3855) {
                field823[++Statics.field3208 - 1] = Statics.field1348.method2516();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field823[--Statics.field3208];
                field832[++Statics.field436 - 1] = ((class119) Statics.field1348.field1514.get(var18)).field1392.method6815();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field823[--Statics.field3208];
                field823[++Statics.field3208 - 1] = ((class119) Statics.field1348.field1514.get(var19)).field1394;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field823[--Statics.field3208];
                field823[++Statics.field3208 - 1] = ((class119) Statics.field1348.field1514.get(var20)).field1391;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field823[--Statics.field3208];
                client.method4670(Statics.field1286, var21);
                return 1;
            } else if (arg0 == 3860) {
                field823[++Statics.field3208 - 1] = Statics.field1348.method2526(field832[--Statics.field436]);
                return 1;
            } else if (arg0 == 3861) {
                field823[Statics.field3208 - 1] = Statics.field1348.method2520()[field823[Statics.field3208 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field823[++Statics.field3208 - 1] = Statics.field3014 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("jf.ak(ILbe;ZB)I")
    public static int method4628(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.field600[var3].method4946();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.field600[var4].field3765;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.field600[var5].field3764;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.field600[var6].field3763;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.field600[var7].field3766;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.field600[var8].field3767;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field823[--Statics.field3208];
            int var10 = client.field600[var9].method4929();
            field823[++Statics.field3208 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field823[--Statics.field3208];
            int var12 = client.field600[var11].method4929();
            field823[++Statics.field3208 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field823[--Statics.field3208];
            int var14 = client.field600[var13].method4929();
            field823[++Statics.field3208 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field823[--Statics.field3208];
            int var16 = client.field600[var15].method4929();
            field823[++Statics.field3208 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field823[--Statics.field3208] == 1;
            if (Statics.field21 != null) {
                Statics.field21.method4871(class292.field3738, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field823[--Statics.field3208] == 1;
            if (Statics.field21 != null) {
                Statics.field21.method4871(class292.field3737, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field3208 -= 2;
            boolean var19 = field823[Statics.field3208] == 1;
            boolean var20 = field823[Statics.field3208 + 1] == 1;
            if (Statics.field21 != null) {
                client.field763.field479 = var20;
                Statics.field21.method4871(client.field763, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field823[--Statics.field3208] == 1;
            if (Statics.field21 != null) {
                Statics.field21.method4871(class292.field3735, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field823[--Statics.field3208] == 1;
            if (Statics.field21 != null) {
                Statics.field21.method4871(class292.field3739, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field823[++Statics.field3208 - 1] = Statics.field21 == null ? 0 : Statics.field21.field3736.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field823[--Statics.field3208];
            class298 var24 = (class298) Statics.field21.field3736.get(var23);
            field823[++Statics.field3208 - 1] = var24.field3757;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field823[--Statics.field3208];
            class298 var26 = (class298) Statics.field21.field3736.get(var25);
            field832[++Statics.field436 - 1] = var26.method4921();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field823[--Statics.field3208];
            class298 var28 = (class298) Statics.field21.field3736.get(var27);
            field832[++Statics.field436 - 1] = var28.method4922();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field823[--Statics.field3208];
            class298 var30 = (class298) Statics.field21.field3736.get(var29);
            long var31 = class398.method2299() - Statics.field1396 - var30.field3760;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field832[++Statics.field436 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field823[--Statics.field3208];
            class298 var38 = (class298) Statics.field21.field3736.get(var37);
            field823[++Statics.field3208 - 1] = var38.field3758.field3763;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field823[--Statics.field3208];
            class298 var40 = (class298) Statics.field21.field3736.get(var39);
            field823[++Statics.field3208 - 1] = var40.field3758.field3764;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field823[--Statics.field3208];
            class298 var42 = (class298) Statics.field21.field3736.get(var41);
            field823[++Statics.field3208 - 1] = var42.field3758.field3765;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bk.ah(ILbe;ZI)I")
    public static int method1935(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field3208 -= 2;
            int var3 = field823[Statics.field3208];
            int var4 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field3208 -= 2;
            int var5 = field823[Statics.field3208];
            int var6 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field3208 -= 2;
            int var7 = field823[Statics.field3208];
            int var8 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field3208 -= 2;
            int var9 = field823[Statics.field3208];
            int var10 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field3208 -= 5;
            int var13 = field823[Statics.field3208];
            int var14 = field823[Statics.field3208 + 1];
            int var15 = field823[Statics.field3208 + 2];
            int var16 = field823[Statics.field3208 + 3];
            int var17 = field823[Statics.field3208 + 4];
            field823[++Statics.field3208 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field3208 -= 2;
            int var18 = field823[Statics.field3208];
            int var19 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field3208 -= 2;
            int var20 = field823[Statics.field3208];
            int var21 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field3208 -= 2;
            int var22 = field823[Statics.field3208];
            int var23 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field3208 -= 2;
            int var24 = field823[Statics.field3208];
            int var25 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field3208 -= 2;
            int var26 = field823[Statics.field3208];
            int var27 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field3208 -= 2;
            int var28 = field823[Statics.field3208];
            int var29 = field823[Statics.field3208 + 1];
            if (var28 == 0) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field3208 -= 2;
            int var30 = field823[Statics.field3208];
            int var31 = field823[Statics.field3208 + 1];
            if (var30 == 0) {
                field823[++Statics.field3208 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field823[++Statics.field3208 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field823[++Statics.field3208 - 1] = var30;
                    break;
                case 2:
                    field823[++Statics.field3208 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field823[++Statics.field3208 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field823[++Statics.field3208 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field823[++Statics.field3208 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field3208 -= 2;
            int var32 = field823[Statics.field3208];
            int var33 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field3208 -= 2;
            int var34 = field823[Statics.field3208];
            int var35 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field3208 -= 3;
            long var36 = (long) field823[Statics.field3208];
            long var38 = (long) field823[Statics.field3208 + 1];
            long var40 = (long) field823[Statics.field3208 + 2];
            field823[++Statics.field3208 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class246.method3495(field823[--Statics.field3208]);
            field823[++Statics.field3208 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field3208 -= 2;
            int var43 = field823[Statics.field3208];
            int var44 = field823[Statics.field3208 + 1];
            field823[++Statics.field3208 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field3208 -= 3;
            int var45 = field823[Statics.field3208];
            int var46 = field823[Statics.field3208 + 1];
            int var47 = field823[Statics.field3208 + 2];
            field823[++Statics.field3208 - 1] = class246.method1887(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field3208 -= 3;
            int var48 = field823[Statics.field3208];
            int var49 = field823[Statics.field3208 + 1];
            int var50 = field823[Statics.field3208 + 2];
            field823[++Statics.field3208 - 1] = class246.method4874(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field3208 -= 3;
            int var51 = field823[Statics.field3208];
            int var52 = field823[Statics.field3208 + 1];
            int var53 = field823[Statics.field3208 + 2];
            int var54 = 31 - var53;
            field823[++Statics.field3208 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field3208 -= 4;
            int var55 = field823[Statics.field3208];
            int var56 = field823[Statics.field3208 + 1];
            int var57 = field823[Statics.field3208 + 2];
            int var58 = field823[Statics.field3208 + 3];
            int var59 = class246.method4874(var55, var57, var58);
            int var60 = class246.method3088(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field823[++Statics.field3208 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field823[Statics.field3208 - 1] = class362.method3503(field823[Statics.field3208 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field823[Statics.field3208 - 1] = class362.method4686(field823[Statics.field3208 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field3208 -= 2;
            int var61 = field823[Statics.field3208];
            int var62 = field823[Statics.field3208 + 1];
            int var63 = class362.method2541(var61, var62);
            field823[++Statics.field3208 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field823[Statics.field3208 - 1] = Math.abs(field823[Statics.field3208 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gs.ay(ILbe;ZI)I")
    public static int method3514(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field832[--Statics.field436];
            int var4 = field823[--Statics.field3208];
            field832[++Statics.field436 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field436 -= 2;
            String var5 = field832[Statics.field436];
            String var6 = field832[Statics.field436 + 1];
            field832[++Statics.field436 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field832[--Statics.field436];
            int var8 = field823[--Statics.field3208];
            field832[++Statics.field436 - 1] = var7 + class319.method174(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field832[--Statics.field436];
            field832[++Statics.field436 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field823[--Statics.field3208];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field835.setTime(new Date(var11));
            int var13 = field835.get(5);
            int var14 = field835.get(2);
            int var15 = field835.get(1);
            field832[++Statics.field436 - 1] = var13 + "-" + field828[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field436 -= 2;
            String var16 = field832[Statics.field436];
            String var17 = field832[Statics.field436 + 1];
            if (Statics.field868.field1062 != null && Statics.field868.field1062.field3018) {
                field832[++Statics.field436 - 1] = var17;
            } else {
                field832[++Statics.field436 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field823[--Statics.field3208];
            field832[++Statics.field436 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field436 -= 2;
            field823[++Statics.field3208 - 1] = class319.method4393(class320.method4464(field832[Statics.field436], field832[Statics.field436 + 1], Statics.field438));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field832[--Statics.field436];
            Statics.field3208 -= 2;
            int var20 = field823[Statics.field3208];
            int var21 = field823[Statics.field3208 + 1];
            byte[] var22 = Statics.field434.method4756(var21, 0);
            class315 var23 = new class315(var22);
            field823[++Statics.field3208 - 1] = var23.method5204(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field832[--Statics.field436];
            Statics.field3208 -= 2;
            int var25 = field823[Statics.field3208];
            int var26 = field823[Statics.field3208 + 1];
            byte[] var27 = Statics.field434.method4756(var26, 0);
            class315 var28 = new class315(var27);
            field823[++Statics.field3208 - 1] = var28.method5203(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field436 -= 2;
            String var29 = field832[Statics.field436];
            String var30 = field832[Statics.field436 + 1];
            if (field823[--Statics.field3208] == 1) {
                field832[++Statics.field436 - 1] = var29;
            } else {
                field832[++Statics.field436 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field832[--Statics.field436];
            field832[++Statics.field436 - 1] = class316.method5205(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field832[--Statics.field436];
            int var33 = field823[--Statics.field3208];
            field832[++Statics.field436 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class319.method366((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class319.method359((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class319.method2504((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class319.method1797((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field832[--Statics.field436];
            if (var38 == null) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field832[--Statics.field436];
            Statics.field3208 -= 2;
            int var40 = field823[Statics.field3208];
            int var41 = field823[Statics.field3208 + 1];
            field832[++Statics.field436 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field832[--Statics.field436];
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
            field832[++Statics.field436 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field832[--Statics.field436];
            int var48 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field436 -= 2;
            String var49 = field832[Statics.field436];
            String var50 = field832[Statics.field436 + 1];
            int var51 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field832[--Statics.field436];
            field832[++Statics.field436 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.al(ILbe;ZB)I")
    public static int method2292(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field823[--Statics.field3208];
            field832[++Statics.field436 - 1] = class170.method2099(var3).field1876;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field3208 -= 2;
            int var4 = field823[Statics.field3208];
            int var5 = field823[Statics.field3208 + 1];
            class170 var6 = class170.method2099(var4);
            if (var5 < 1 || var5 > 5 || var6.field1928[var5 - 1] == null) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = var6.field1928[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field3208 -= 2;
            int var7 = field823[Statics.field3208];
            int var8 = field823[Statics.field3208 + 1];
            class170 var9 = class170.method2099(var7);
            if (var8 < 1 || var8 > 5 || var9.field1902[var8 - 1] == null) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = var9.field1902[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class170.method2099(var10).field1899;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class170.method2099(var11).field1898 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field823[--Statics.field3208];
            class170 var13 = class170.method2099(var12);
            if (var13.field1919 == -1 && var13.field1879 >= 0) {
                field823[++Statics.field3208 - 1] = var13.field1879;
            } else {
                field823[++Statics.field3208 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field823[--Statics.field3208];
            class170 var15 = class170.method2099(var14);
            if (var15.field1919 >= 0 && var15.field1879 >= 0) {
                field823[++Statics.field3208 - 1] = var15.field1879;
            } else {
                field823[++Statics.field3208 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class170.method2099(var16).field1900 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field823[--Statics.field3208];
            class170 var18 = class170.method2099(var17);
            if (var18.field1931 == -1 && var18.field1930 >= 0) {
                field823[++Statics.field3208 - 1] = var18.field1930;
            } else {
                field823[++Statics.field3208 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field823[--Statics.field3208];
            class170 var20 = class170.method2099(var19);
            if (var20.field1931 >= 0 && var20.field1930 >= 0) {
                field823[++Statics.field3208 - 1] = var20.field1930;
            } else {
                field823[++Statics.field3208 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field832[--Statics.field436];
            int var22 = field823[--Statics.field3208];
            client.method3642(var21, var22 == 1);
            field823[++Statics.field3208 - 1] = Statics.field2227;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1874 == null || Statics.field839 >= Statics.field2227) {
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = Statics.field1874[++Statics.field839 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field839 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field823[--Statics.field3208];
            int var24 = class170.method2099(var23).method3015();
            if (var24 == -1) {
                field823[++Statics.field3208 - 1] = var24;
            } else {
                field823[++Statics.field3208 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ip.ao(ILbe;ZB)I")
    public static int method4251(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field823[++Statics.field3208 - 1] = client.field661;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field3208 -= 3;
            client.field661 = field823[Statics.field3208];
            Statics.field2911 = class418.method2488(field823[Statics.field3208 + 1]);
            if (Statics.field2911 == null) {
                Statics.field2911 = class418.field4412;
            }
            client.field713 = field823[Statics.field3208 + 2];
            class242 var3 = class242.method2075(class240.field2750, client.field639.field1287);
            var3.field2780.method6269(client.field661);
            var3.field2780.method6269(Statics.field2911.field4415);
            var3.field2780.method6269(client.field713);
            client.field639.method2246(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field832[--Statics.field436];
            Statics.field3208 -= 2;
            int var5 = field823[Statics.field3208];
            int var6 = field823[Statics.field3208 + 1];
            class242 var7 = class242.method2075(class240.field2759, client.field639.field1287);
            var7.field2780.method6269(class401.method2370(var4) + 2);
            var7.field2780.method6489(var4);
            var7.field2780.method6269(var5 - 1);
            var7.field2780.method6269(var6);
            client.field639.method2246(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field3208 -= 2;
            int var8 = field823[Statics.field3208];
            int var9 = field823[Statics.field3208 + 1];
            class58 var10 = class98.method2941(var8, var9);
            if (var10 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = var10.field460;
                field823[++Statics.field3208 - 1] = var10.field461;
                field832[++Statics.field436 - 1] = var10.field463 == null ? "" : var10.field463;
                field832[++Statics.field436 - 1] = var10.field471 == null ? "" : var10.field471;
                field832[++Statics.field436 - 1] = var10.field468 == null ? "" : var10.field468;
                field823[++Statics.field3208 - 1] = var10.method1011() ? 1 : (var10.method1014() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field823[--Statics.field3208];
            class58 var12 = class98.method4985(var11);
            if (var12 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = var12.field467;
                field823[++Statics.field3208 - 1] = var12.field461;
                field832[++Statics.field436 - 1] = var12.field463 == null ? "" : var12.field463;
                field832[++Statics.field436 - 1] = var12.field471 == null ? "" : var12.field471;
                field832[++Statics.field436 - 1] = var12.field468 == null ? "" : var12.field468;
                field823[++Statics.field3208 - 1] = var12.method1011() ? 1 : (var12.method1014() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2911 == null) {
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = Statics.field2911.field4415;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field832[--Statics.field436];
            int var14 = field823[--Statics.field3208];
            class242 var15 = class423.method2942(var14, var13, Statics.field438, -1);
            client.field639.method2246(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field436 -= 2;
            String var16 = field832[Statics.field436];
            String var17 = field832[Statics.field436 + 1];
            class242 var18 = class242.method2075(class240.field2736, client.field639.field1287);
            var18.field2780.method6256(0);
            int var19 = var18.field2780.field4292;
            var18.field2780.method6489(var16);
            class265.method2738(var18.field2780, var17);
            var18.field2780.method6268(var18.field2780.field4292 - var19);
            client.field639.method2246(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field832[--Statics.field436];
            Statics.field3208 -= 2;
            int var21 = field823[Statics.field3208];
            int var22 = field823[Statics.field3208 + 1];
            class242 var23 = class423.method2942(var21, var20, Statics.field438, var22);
            client.field639.method2246(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field868 == null || Statics.field868.field1067 == null) {
                var24 = "";
            } else {
                var24 = Statics.field868.field1067.method6815();
            }
            field832[++Statics.field436 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field823[++Statics.field3208 - 1] = client.field713;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class98.method2404(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class98.method1931(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = class98.method4659(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field832[--Statics.field436];
            client.method2358(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field551 = field832[--Statics.field436].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field832[++Statics.field436 - 1] = client.field551;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field832[--Statics.field436];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field3208++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field3208 -= 2;
            int var30 = field823[Statics.field3208];
            int var31 = field823[Statics.field3208 + 1];
            class58 var32 = class98.method2941(var30, var31);
            if (var32 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = var32.field460;
                field823[++Statics.field3208 - 1] = var32.field461;
                field832[++Statics.field436 - 1] = var32.field463 == null ? "" : var32.field463;
                field832[++Statics.field436 - 1] = var32.field471 == null ? "" : var32.field471;
                field832[++Statics.field436 - 1] = var32.field468 == null ? "" : var32.field468;
                field823[++Statics.field3208 - 1] = var32.method1011() ? 1 : (var32.method1014() ? 2 : 0);
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field823[--Statics.field3208];
            class58 var34 = class98.method4985(var33);
            if (var34 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = var34.field467;
                field823[++Statics.field3208 - 1] = var34.field461;
                field832[++Statics.field436 - 1] = var34.field463 == null ? "" : var34.field463;
                field832[++Statics.field436 - 1] = var34.field471 == null ? "" : var34.field471;
                field832[++Statics.field436 - 1] = var34.field468 == null ? "" : var34.field468;
                field823[++Statics.field3208 - 1] = var34.method1011() ? 1 : (var34.method1014() ? 2 : 0);
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gz.au(ILbe;ZI)I")
    public static int method3591(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field823[++Statics.field3208 - 1] = client.method151();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field823[--Statics.field3208];
            if (var3 == 1 || var3 == 2) {
                client.method6196(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field823[++Statics.field3208 - 1] = Statics.field3227.field1203;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field823[--Statics.field3208];
            if (var4 == 1 || var4 == 2) {
                Statics.field3227.field1203 = var4;
                class89.method1005();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field3208 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field436 -= 2;
            Statics.field3208--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field436--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jd.aa(ILbe;ZB)I")
    public static int method4690(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field3208 -= 2;
            int var3 = field823[Statics.field3208];
            int var4 = field823[Statics.field3208 + 1];
            if (!client.field690) {
                client.field553 = var3;
                client.field561 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field823[++Statics.field3208 - 1] = client.field553;
            return 1;
        } else if (arg0 == 5506) {
            field823[++Statics.field3208 - 1] = client.field561;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field823[--Statics.field3208];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field697 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field823[++Statics.field3208 - 1] = client.field697;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ff.ag(ILbe;ZB)I")
    public static int method2874(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field644 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field436 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field823[++Statics.field3208 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lg.aq(II)I")
    public static int method5490(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("kj.ar(II)I")
    public static int method4984(int arg0) {
        return (int) ((Math.log((double) arg0) / field827 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("jo.ac(ILbe;ZI)I")
    public static int method4636(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field3208 -= 2;
            client.field745 = (short) method5490(field823[Statics.field3208]);
            if (client.field745 <= 0) {
                client.field745 = 256;
            }
            client.field748 = (short) method5490(field823[Statics.field3208 + 1]);
            if (client.field748 <= 0) {
                client.field748 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field3208 -= 2;
            client.field747 = (short) field823[Statics.field3208];
            if (client.field747 <= 0) {
                client.field747 = 256;
            }
            client.field769 = (short) field823[Statics.field3208 + 1];
            if (client.field769 <= 0) {
                client.field769 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field3208 -= 4;
            client.field749 = (short) field823[Statics.field3208];
            if (client.field749 <= 0) {
                client.field749 = 1;
            }
            client.field750 = (short) field823[Statics.field3208 + 1];
            if (client.field750 <= 0) {
                client.field750 = 32767;
            } else if (client.field750 < client.field749) {
                client.field750 = client.field749;
            }
            client.field751 = (short) field823[Statics.field3208 + 2];
            if (client.field751 <= 0) {
                client.field751 = 1;
            }
            client.field502 = (short) field823[Statics.field3208 + 3];
            if (client.field502 <= 0) {
                client.field502 = 32767;
            } else if (client.field502 < client.field751) {
                client.field502 = client.field751;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field663 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = -1;
            } else {
                client.method2492(0, 0, client.field663.field3063, client.field663.field3145, false);
                field823[++Statics.field3208 - 1] = client.field755;
                field823[++Statics.field3208 - 1] = client.field756;
            }
            return 1;
        } else if (arg0 == 6204) {
            field823[++Statics.field3208 - 1] = client.field747;
            field823[++Statics.field3208 - 1] = client.field769;
            return 1;
        } else if (arg0 == 6205) {
            field823[++Statics.field3208 - 1] = method4984(client.field745);
            field823[++Statics.field3208 - 1] = method4984(client.field748);
            return 1;
        } else if (arg0 == 6220) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field823[++Statics.field3208 - 1] = Statics.field3203;
            return 1;
        } else if (arg0 == 6223) {
            field823[++Statics.field3208 - 1] = Statics.field1050;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fu.at(ILbe;ZI)I")
    public static int method3185(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field823[++Statics.field3208 - 1] = class61.method3170() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method375();
            if (var3 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
            } else {
                field823[++Statics.field3208 - 1] = var3.field790;
                field823[++Statics.field3208 - 1] = var3.field781;
                field832[++Statics.field436 - 1] = var3.field786;
                field823[++Statics.field3208 - 1] = var3.field787;
                field823[++Statics.field3208 - 1] = var3.field783;
                field832[++Statics.field436 - 1] = var3.field785;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method2155();
            if (var4 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
            } else {
                field823[++Statics.field3208 - 1] = var4.field790;
                field823[++Statics.field3208 - 1] = var4.field781;
                field832[++Statics.field436 - 1] = var4.field786;
                field823[++Statics.field3208 - 1] = var4.field787;
                field823[++Statics.field3208 - 1] = var4.field783;
                field832[++Statics.field436 - 1] = var4.field785;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field823[--Statics.field3208];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field778; var7++) {
                if (Statics.field4253[var7].field790 == var5) {
                    var6 = Statics.field4253[var7];
                    break;
                }
            }
            if (var6 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
            } else {
                field823[++Statics.field3208 - 1] = var6.field790;
                field823[++Statics.field3208 - 1] = var6.field781;
                field832[++Statics.field436 - 1] = var6.field786;
                field823[++Statics.field3208 - 1] = var6.field787;
                field823[++Statics.field3208 - 1] = var6.field783;
                field832[++Statics.field436 - 1] = var6.field785;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field3208 -= 4;
            int var8 = field823[Statics.field3208];
            boolean var9 = field823[Statics.field3208 + 1] == 1;
            int var10 = field823[Statics.field3208 + 2];
            boolean var11 = field823[Statics.field3208 + 3] == 1;
            class61.method2539(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field823[--Statics.field3208];
            if (var12 >= 0 && var12 < class61.field778) {
                class61 var13 = Statics.field4253[var12];
                field823[++Statics.field3208 - 1] = var13.field790;
                field823[++Statics.field3208 - 1] = var13.field781;
                field832[++Statics.field436 - 1] = var13.field786;
                field823[++Statics.field3208 - 1] = var13.field787;
                field823[++Statics.field3208 - 1] = var13.field783;
                field832[++Statics.field436 - 1] = var13.field785;
            } else {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
                field823[++Statics.field3208 - 1] = 0;
                field823[++Statics.field3208 - 1] = 0;
                field832[++Statics.field436 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field746 = field823[--Statics.field3208] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field3208 -= 2;
            int var14 = field823[Statics.field3208];
            int var15 = field823[Statics.field3208 + 1];
            class166 var16 = class166.method2408(var15);
            if (var16.method2859()) {
                field832[++Statics.field436 - 1] = class161.method2362(var14).method2774(var15, var16.field1788);
            } else {
                field823[++Statics.field3208 - 1] = class161.method2362(var14).method2779(var15, var16.field1794);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field3208 -= 2;
            int var17 = field823[Statics.field3208];
            int var18 = field823[Statics.field3208 + 1];
            class166 var19 = class166.method2408(var18);
            if (var19.method2859()) {
                field832[++Statics.field436 - 1] = class169.method4277(var17).method2965(var18, var19.field1788);
            } else {
                field823[++Statics.field3208 - 1] = class169.method4277(var17).method2954(var18, var19.field1794);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field3208 -= 2;
            int var20 = field823[Statics.field3208];
            int var21 = field823[Statics.field3208 + 1];
            class166 var22 = class166.method2408(var21);
            if (var22.method2859()) {
                field832[++Statics.field436 - 1] = class170.method2099(var20).method3014(var21, var22.field1788);
            } else {
                field823[++Statics.field3208 - 1] = class170.method2099(var20).method3013(var21, var22.field1794);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field3208 -= 2;
            int var23 = field823[Statics.field3208];
            int var24 = field823[Statics.field3208 + 1];
            class166 var25 = class166.method2408(var24);
            if (var25.method2859()) {
                field832[++Statics.field436 - 1] = class167.method1795(var23).method2880(var24, var25.field1788);
            } else {
                field823[++Statics.field3208 - 1] = class167.method1795(var23).method2879(var24, var25.field1794);
            }
            return 1;
        } else if (arg0 == 6518) {
            field823[++Statics.field3208 - 1] = client.field693 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field823[++Statics.field3208 - 1] = client.field489 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field436--;
            Statics.field3208--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field436--;
            Statics.field3208--;
            return 1;
        } else if (arg0 == 6524) {
            field823[++Statics.field3208 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field823[++Statics.field3208 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field823[++Statics.field3208 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field823[++Statics.field3208 - 1] = client.field682;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hi.ax(ILbe;ZS)I")
    public static int method4019(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field2592;
            int var4 = (Statics.field868.field1140 >> 7) + Statics.field2131;
            int var5 = (Statics.field868.field1124 >> 7) + Statics.field3028;
            client.method4927().method5916(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field823[--Statics.field3208];
            String var7 = "";
            class181 var8 = client.method4927().method5873(var6);
            if (var8 != null) {
                var7 = var8.method3244();
            }
            field832[++Statics.field436 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field823[--Statics.field3208];
            client.method4927().method5836(var9);
            return 1;
        } else if (arg0 == 6603) {
            field823[++Statics.field3208 - 1] = client.method4927().method5850();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field823[--Statics.field3208];
            client.method4927().method5847(var10);
            return 1;
        } else if (arg0 == 6605) {
            field823[++Statics.field3208 - 1] = client.method4927().method5898() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class258 var11 = new class258(field823[--Statics.field3208]);
            client.method4927().method5854(var11.field3012, var11.field3013);
            return 1;
        } else if (arg0 == 6607) {
            class258 var12 = new class258(field823[--Statics.field3208]);
            client.method4927().method5917(var12.field3012, var12.field3013);
            return 1;
        } else if (arg0 == 6608) {
            class258 var13 = new class258(field823[--Statics.field3208]);
            client.method4927().method5856(var13.field3015, var13.field3012, var13.field3013);
            return 1;
        } else if (arg0 == 6609) {
            class258 var14 = new class258(field823[--Statics.field3208]);
            client.method4927().method5857(var14.field3015, var14.field3012, var14.field3013);
            return 1;
        } else if (arg0 == 6610) {
            field823[++Statics.field3208 - 1] = client.method4927().method5835();
            field823[++Statics.field3208 - 1] = client.method4927().method5859();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field823[--Statics.field3208];
            class181 var16 = client.method4927().method5873(var15);
            if (var16 == null) {
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = var16.method3302().method4493();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field823[--Statics.field3208];
            class181 var18 = client.method4927().method5873(var17);
            if (var18 == null) {
                field823[++Statics.field3208 - 1] = 0;
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = (var18.method3248() - var18.method3247() + 1) * 64;
                field823[++Statics.field3208 - 1] = (var18.method3250() - var18.method3249() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field823[--Statics.field3208];
            class181 var20 = client.method4927().method5873(var19);
            if (var20 == null) {
                field823[++Statics.field3208 - 1] = 0;
                field823[++Statics.field3208 - 1] = 0;
                field823[++Statics.field3208 - 1] = 0;
                field823[++Statics.field3208 - 1] = 0;
            } else {
                field823[++Statics.field3208 - 1] = var20.method3247() * 64;
                field823[++Statics.field3208 - 1] = var20.method3249() * 64;
                field823[++Statics.field3208 - 1] = var20.method3248() * 64 + 64 - 1;
                field823[++Statics.field3208 - 1] = var20.method3250() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field823[--Statics.field3208];
            class181 var22 = client.method4927().method5873(var21);
            if (var22 == null) {
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var22.method3246();
            }
            return 1;
        } else if (arg0 == 6615) {
            class258 var23 = client.method4927().method5860();
            if (var23 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var23.field3012;
                field823[++Statics.field3208 - 1] = var23.field3013;
            }
            return 1;
        } else if (arg0 == 6616) {
            field823[++Statics.field3208 - 1] = client.method4927().method5837();
            return 1;
        } else if (arg0 == 6617) {
            class258 var24 = new class258(field823[--Statics.field3208]);
            class181 var25 = client.method4927().method5838();
            if (var25 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method3238(var24.field3015, var24.field3012, var24.field3013);
            if (var26 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var26[0];
                field823[++Statics.field3208 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class258 var27 = new class258(field823[--Statics.field3208]);
            class181 var28 = client.method4927().method5838();
            if (var28 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = -1;
                return 1;
            }
            class258 var29 = var28.method3254(var27.field3012, var27.field3013);
            if (var29 == null) {
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var29.method4493();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field3208 -= 2;
            int var30 = field823[Statics.field3208];
            class258 var31 = new class258(field823[Statics.field3208 + 1]);
            method3347(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field3208 -= 2;
            int var32 = field823[Statics.field3208];
            class258 var33 = new class258(field823[Statics.field3208 + 1]);
            method3347(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field3208 -= 2;
            int var34 = field823[Statics.field3208];
            class258 var35 = new class258(field823[Statics.field3208 + 1]);
            class181 var36 = client.method4927().method5873(var34);
            if (var36 == null) {
                field823[++Statics.field3208 - 1] = 0;
                return 1;
            } else {
                field823[++Statics.field3208 - 1] = var36.method3236(var35.field3015, var35.field3012, var35.field3013) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field823[++Statics.field3208 - 1] = client.method4927().method5861();
            field823[++Statics.field3208 - 1] = client.method4927().method5887();
            return 1;
        } else if (arg0 == 6623) {
            class258 var37 = new class258(field823[--Statics.field3208]);
            class181 var38 = client.method4927().method5872(var37.field3015, var37.field3012, var37.field3013);
            if (var38 == null) {
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var38.method3241();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method4927().method5863(field823[--Statics.field3208]);
            return 1;
        } else if (arg0 == 6625) {
            client.method4927().method5900();
            return 1;
        } else if (arg0 == 6626) {
            client.method4927().method5940(field823[--Statics.field3208]);
            return 1;
        } else if (arg0 == 6627) {
            client.method4927().method6007();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field823[--Statics.field3208] == 1;
            client.method4927().method5867(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field823[--Statics.field3208];
            client.method4927().method5868(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field823[--Statics.field3208];
            client.method4927().method5869(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method4927().method5971();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field823[--Statics.field3208] == 1;
            client.method4927().method5950(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field3208 -= 2;
            int var43 = field823[Statics.field3208];
            boolean var44 = field823[Statics.field3208 + 1] == 1;
            client.method4927().method5875(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field3208 -= 2;
            int var45 = field823[Statics.field3208];
            boolean var46 = field823[Statics.field3208 + 1] == 1;
            client.method4927().method5951(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field823[++Statics.field3208 - 1] = client.method4927().method5874() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.method4927().method6022(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field823[--Statics.field3208];
            field823[++Statics.field3208 - 1] = client.method4927().method5876(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field3208 -= 2;
            int var49 = field823[Statics.field3208];
            class258 var50 = new class258(field823[Statics.field3208 + 1]);
            class258 var51 = client.method4927().method5879(var49, var50);
            if (var51 == null) {
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var51.method4493();
            }
            return 1;
        } else if (arg0 == 6639) {
            class199 var52 = client.method4927().method5912();
            if (var52 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var52.method3195();
                field823[++Statics.field3208 - 1] = var52.field2209.method4493();
            }
            return 1;
        } else if (arg0 == 6640) {
            class199 var53 = client.method4927().method5882();
            if (var53 == null) {
                field823[++Statics.field3208 - 1] = -1;
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var53.method3195();
                field823[++Statics.field3208 - 1] = var53.field2209.method4493();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field823[--Statics.field3208];
            class154 var55 = class154.method156(var54);
            if (var55.field1630 == null) {
                field832[++Statics.field436 - 1] = "";
            } else {
                field832[++Statics.field436 - 1] = var55.field1630;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field823[--Statics.field3208];
            class154 var57 = class154.method156(var56);
            field823[++Statics.field3208 - 1] = var57.field1632;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field823[--Statics.field3208];
            class154 var59 = class154.method156(var58);
            if (var59 == null) {
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var59.field1638;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field823[--Statics.field3208];
            class154 var61 = class154.method156(var60);
            if (var61 == null) {
                field823[++Statics.field3208 - 1] = -1;
            } else {
                field823[++Statics.field3208 - 1] = var61.field1647;
            }
            return 1;
        } else if (arg0 == 6697) {
            field823[++Statics.field3208 - 1] = Statics.field1484.field2232;
            return 1;
        } else if (arg0 == 6698) {
            field823[++Statics.field3208 - 1] = Statics.field1484.field2233.method4493();
            return 1;
        } else if (arg0 == 6699) {
            field823[++Statics.field3208 - 1] = Statics.field1484.field2231.method4493();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cs.an(ILbe;ZB)I")
    public static int method2124(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field3208 -= 2;
            Statics.field436--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 6750) {
            field832[++Statics.field436 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field823[++Statics.field3208 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field823[--Statics.field3208];
            class161 var4 = class161.method2362(var3);
            field832[++Statics.field436 - 1] = var4 == null ? "" : var4.field1716;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hk.av(ILbe;ZB)I")
    public static int method4186(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field832[++Statics.field436 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field823[++Statics.field3208 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field832[++Statics.field436 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field823[++Statics.field3208 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("et.ap(ILbe;ZI)I")
    public static int method2494(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field832[++Statics.field436 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field823[++Statics.field3208 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bm.aj(ILbe;ZI)I")
    public static int method1643(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field3208 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field3208 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field3208 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field3208 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field436--;
            Statics.field3208--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field436--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field3208 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field3208--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field3208--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jf.am(ILbe;ZB)I")
    public static int method4627(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field3208++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field436 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field3208++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field3208++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field3208++;
            return 1;
        } else if (arg0 == 7108) {
            field823[++Statics.field3208 - 1] = client.method4660() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field3208--;
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field3208 -= 2;
            field823[++Statics.field3208 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field3208 -= 2;
            field823[++Statics.field3208 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gg.az(II)V")
    public static void method3643(int arg0) {
        if (arg0 == -1 || !class262.method4885(arg0)) {
            return;
        }
        class262[] var1 = Statics.field3153[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class262 var3 = var1[var2];
            if (var3.field3135 != null) {
                class81 var4 = new class81();
                var4.field1040 = var3;
                var4.field1042 = var3.field3135;
                method738(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("fx.ae(ILic;ZI)V")
    public static void method3347(int arg0, class258 arg1, boolean arg2) {
        class181 var3 = client.method4927().method5873(arg0);
        int var4 = Statics.field868.field1083;
        int var5 = (Statics.field868.field1140 >> 7) + Statics.field2131;
        int var6 = (Statics.field868.field1124 >> 7) + Statics.field3028;
        class258 var7 = new class258(var4, var5, var6);
        client.method4927().method5949(var3, var7, arg1, arg2);
    }
}
