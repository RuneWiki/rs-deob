package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bj")
public class class64 {

    @ObfuscatedName("bj.p")
    public static int[] field791 = new int[5];

    @ObfuscatedName("bj.j")
    public static int[][] field789 = new int[5][5000];

    @ObfuscatedName("bj.b")
    public static int[] field790 = new int[1000];

    @ObfuscatedName("bj.y")
    public static String[] field794 = new String[1000];

    @ObfuscatedName("bj.t")
    public static int field800 = 0;

    @ObfuscatedName("bj.l")
    public static class57[] field793 = new class57[50];

    @ObfuscatedName("bj.r")
    public static Calendar field787 = Calendar.getInstance();

    @ObfuscatedName("bj.m")
    public static final String[] field795 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bj.f")
    public static boolean field796 = false;

    @ObfuscatedName("bj.h")
    public static boolean field792 = false;

    @ObfuscatedName("bj.v")
    public static ArrayList field798 = new ArrayList();

    @ObfuscatedName("bj.ag")
    public static int field799 = 0;

    @ObfuscatedName("bj.am")
    public static final double field802 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hm.i(Lck;B)V")
    public static void method3748(class81 arg0) {
        method759(arg0, 500000, 475000);
    }

    @ObfuscatedName("ar.w(Lck;IIB)V")
    public static void method759(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1016;
        class72 var5;
        if (Statics.method40(arg0.field1026)) {
            Statics.field23 = (class204) var3[0];
            class154 var4 = class154.method3068(Statics.field23.field2233);
            var5 = class72.method1674(arg0.field1026, var4.field1623, var4.field1641);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class72.method2663(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field67 = 0;
        Statics.field3742 = 0;
        int var7 = -1;
        int[] var8 = var5.field928;
        int[] var9 = var5.field931;
        byte var10 = -1;
        field800 = 0;
        field796 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field154 = new int[var5.field933];
            int var13 = 0;
            Statics.field1311 = new String[var5.field930];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1018;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1019;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1023 == null ? -1 : arg0.field1023.field3052;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1020;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1023 == null ? -1 : arg0.field1023.field3053;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1021 == null ? -1 : arg0.field1021.field3052;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1021 == null ? -1 : arg0.field1021.field3053;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1022;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1015;
                    }
                    Statics.field154[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1024;
                    }
                    Statics.field1311[var14++] = var17;
                }
            }
            field799 = arg0.field1025;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field931[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method3597(var61, var5, var48);
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
                    field790[++Statics.field67 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field790[++Statics.field67 - 1] = class257.field3015[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class257.field3015[var19] = field790[--Statics.field67];
                    client.method3212(var19);
                } else if (var61 == 3) {
                    field794[++Statics.field3742 - 1] = var5.field932[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field67 -= 2;
                    if (field790[Statics.field67] != field790[Statics.field67 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field67 -= 2;
                    if (field790[Statics.field67] == field790[Statics.field67 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field67 -= 2;
                    if (field790[Statics.field67] < field790[Statics.field67 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field67 -= 2;
                    if (field790[Statics.field67] > field790[Statics.field67 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field800 == 0) {
                        return;
                    }
                    class57 var21 = field793[--field800];
                    var5 = var21.field439;
                    var8 = var5.field928;
                    var9 = var5.field931;
                    var7 = var21.field434;
                    Statics.field154 = var21.field433;
                    Statics.field1311 = var21.field436;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field790[++Statics.field67 - 1] = class257.method2410(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class257.method2423(var23, field790[--Statics.field67]);
                } else if (var61 == 31) {
                    Statics.field67 -= 2;
                    if (field790[Statics.field67] <= field790[Statics.field67 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field67 -= 2;
                    if (field790[Statics.field67] >= field790[Statics.field67 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field790[++Statics.field67 - 1] = Statics.field154[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field154[var9[var7]] = field790[--Statics.field67];
                } else if (var61 == 35) {
                    field794[++Statics.field3742 - 1] = Statics.field1311[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field1311[var9[var7]] = field794[--Statics.field3742];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field3742 -= var24;
                    String var25 = class319.method1897(field794, Statics.field3742, var24);
                    field794[++Statics.field3742 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field67--;
                } else if (var61 == 39) {
                    Statics.field3742--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = class72.method2663(var26);
                    int[] var28 = new int[var27.field933];
                    String[] var29 = new String[var27.field930];
                    for (int var30 = 0; var30 < var27.field935; var30++) {
                        var28[var30] = field790[Statics.field67 - var27.field935 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field936; var31++) {
                        var29[var31] = field794[Statics.field3742 - var27.field936 + var31];
                    }
                    Statics.field67 -= var27.field935;
                    Statics.field3742 -= var27.field936;
                    class57 var32 = new class57();
                    var32.field439 = var5;
                    var32.field434 = var7;
                    var32.field433 = Statics.field154;
                    var32.field436 = Statics.field1311;
                    field793[++field800 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field928;
                    var9 = var27.field931;
                    var7 = -1;
                    Statics.field154 = var28;
                    Statics.field1311 = var29;
                } else if (var61 == 42) {
                    field790[++Statics.field67 - 1] = Statics.field451.method2195(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field451.method2234(var9[var7], field790[--Statics.field67]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field790[--Statics.field67];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field791[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field789[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field790[--Statics.field67];
                    if (var39 < 0 || var39 >= field791[var38]) {
                        throw new RuntimeException();
                    }
                    field790[++Statics.field67 - 1] = field789[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field67 -= 2;
                    int var41 = field790[Statics.field67];
                    if (var41 < 0 || var41 >= field791[var40]) {
                        throw new RuntimeException();
                    }
                    field789[var40][var41] = field790[Statics.field67 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field451.method2199(var9[var7]);
                    if (var42 == null) {
                        var42 = class283.field3566;
                    }
                    field794[++Statics.field3742 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field451.method2198(var9[var7], field794[--Statics.field3742]);
                } else if (var61 == 49) {
                    String var43 = Statics.field451.method2197(var9[var7]);
                    field794[++Statics.field3742 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field451.method2219(var9[var7], field794[--Statics.field3742]);
                } else if (var61 == 60) {
                    class379 var44 = var5.field937[var9[var7]];
                    class369 var45 = (class369) var44.method6009((long) field790[--Statics.field67]);
                    if (var45 != null) {
                        var7 += var45.field4073;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field288.method2452(var9[var7]);
                    if (var46 == null) {
                        field790[++Statics.field67 - 1] = -1;
                    } else {
                        field790[++Statics.field67 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field1211.method5696(var9[var7]);
                    if (var47 == null) {
                        field790[++Statics.field67 - 1] = -1;
                    } else {
                        field790[++Statics.field67 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4075).append(" ");
            for (int var53 = field800 - 1; var53 >= 0; var53--) {
                var52.append("").append(field793[var53].field439.field4075).append(" ");
            }
            var52.append("").append(var10);
            class425.method2652(var52.toString(), var59);
        } finally {
            if (field796) {
                field792 = true;
            }
            while (field798.size() > 0) {
                class93 var56 = (class93) field798.remove(0);
                client.method4841(var56.method2151(), var56.method2153(), var56.method2152(), var56.method2155(), "");
            }
            if (field792) {
                client.method183();
                field792 = false;
                field796 = false;
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class425.method2652("Warning: Script " + var5.field929 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("gm.s(ILbp;ZI)I")
    public static int method3597(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3220(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method6453(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2512(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method282(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3653(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method4440(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method4162(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method3583(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method1026(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method1800(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method1973(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method6453(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2512(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method282(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3653(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method4440(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method4870(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method3579(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method1983(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method165(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method1973(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method1043(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2424(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return Statics.method2292(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1572(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method547(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return Statics.method2558(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method2506(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method772(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method5996(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method182(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method393(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return Statics.method2179(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2397(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method2145(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2672(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method3523(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1083(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method163(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method4697(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method2421(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method4237(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method1906(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method2559(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method1818(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method394(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fo.a(ILbp;ZI)I")
    public static int method3220(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field67 -= 3;
            int var3 = field790[Statics.field67];
            int var4 = field790[Statics.field67 + 1];
            int var5 = field790[Statics.field67 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class262 var6 = class262.method2355(var3);
            if (var6.field3186 == null) {
                var6.field3186 = new class262[var5 + 1];
            }
            if (var6.field3186.length <= var5) {
                class262[] var7 = new class262[var5 + 1];
                for (int var8 = 0; var8 < var6.field3186.length; var8++) {
                    var7[var8] = var6.field3186[var8];
                }
                var6.field3186 = var7;
            }
            if (var5 > 0 && var6.field3186[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class262 var9 = new class262();
            var9.field3143 = var4;
            var9.field3071 = var9.field3052 = var6.field3052;
            var9.field3053 = var5;
            var9.field3060 = true;
            var6.field3186[var5] = var9;
            if (arg2) {
                Statics.field1403 = var9;
            } else {
                Statics.field2454 = var9;
            }
            client.method3522(var6);
            return 1;
        } else if (arg0 == 101) {
            class262 var10 = arg2 ? Statics.field1403 : Statics.field2454;
            class262 var11 = class262.method2355(var10.field3052);
            var11.field3186[var10.field3053] = null;
            client.method3522(var11);
            return 1;
        } else if (arg0 == 102) {
            class262 var12 = class262.method2355(field790[--Statics.field67]);
            var12.field3186 = null;
            client.method3522(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field67 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field67 -= 2;
            int var13 = field790[Statics.field67];
            int var14 = field790[Statics.field67 + 1];
            class262 var15 = Statics.method1957(var13, var14);
            if (var15 == null || var14 == -1) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = 1;
                if (arg2) {
                    Statics.field1403 = var15;
                } else {
                    Statics.field2454 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class262 var16 = class262.method2355(field790[--Statics.field67]);
            if (var16 == null) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = 1;
                if (arg2) {
                    Statics.field1403 = var16;
                } else {
                    Statics.field2454 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field790[Statics.field67 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field790[--Statics.field67 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("of.o(ILbp;ZB)I")
    public static int method6453(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class262 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field790[--Statics.field67];
            var4 = class262.method2355(var3);
        } else {
            var4 = arg2 ? Statics.field1403 : Statics.field2454;
        }
        if (arg0 == 1000) {
            Statics.field67 -= 4;
            var4.field3061 = field790[Statics.field67];
            var4.field3146 = field790[Statics.field67 + 1];
            var4.field3121 = field790[Statics.field67 + 2];
            var4.field3058 = field790[Statics.field67 + 3];
            client.method3522(var4);
            Statics.field983.method1091(var4);
            if (var3 != -1 && var4.field3143 == 0) {
                client.method1989(Statics.field2200[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field67 -= 4;
            var4.field3063 = field790[Statics.field67];
            var4.field3064 = field790[Statics.field67 + 1];
            var4.field3174 = field790[Statics.field67 + 2];
            var4.field3159 = field790[Statics.field67 + 3];
            client.method3522(var4);
            Statics.field983.method1091(var4);
            if (var3 != -1 && var4.field3143 == 0) {
                client.method1989(Statics.field2200[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field790[--Statics.field67] == 1;
            if (var4.field3072 != var5) {
                var4.field3072 = var5;
                client.method3522(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3196 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3097 = field790[--Statics.field67] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eu.g(ILbp;ZI)I")
    public static int method2512(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class262 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field790[--Statics.field67];
            var4 = class262.method2355(var3);
        } else {
            var4 = arg2 ? Statics.field1403 : Statics.field2454;
        }
        if (arg0 == 1100) {
            Statics.field67 -= 2;
            var4.field3073 = field790[Statics.field67];
            if (var4.field3073 > var4.field3075 - var4.field3067) {
                var4.field3073 = var4.field3075 - var4.field3067;
            }
            if (var4.field3073 < 0) {
                var4.field3073 = 0;
            }
            var4.field3117 = field790[Statics.field67 + 1];
            if (var4.field3117 > var4.field3076 - var4.field3068) {
                var4.field3117 = var4.field3076 - var4.field3068;
            }
            if (var4.field3117 < 0) {
                var4.field3117 = 0;
            }
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3077 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3168 = field790[--Statics.field67] == 1;
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3083 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3085 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3087 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3089 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3090 = field790[--Statics.field67] == 1;
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3095 = 1;
            var4.field3096 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field67 -= 6;
            var4.field3101 = field790[Statics.field67];
            var4.field3102 = field790[Statics.field67 + 1];
            var4.field3081 = field790[Statics.field67 + 2];
            var4.field3164 = field790[Statics.field67 + 3];
            var4.field3105 = field790[Statics.field67 + 4];
            var4.field3103 = field790[Statics.field67 + 5];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field790[--Statics.field67];
            if (var4.field3099 != var5) {
                var4.field3099 = var5;
                var4.field3184 = 0;
                var4.field3151 = 0;
                client.method3522(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3109 = field790[--Statics.field67] == 1;
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field794[--Statics.field3742];
            if (!var6.equals(var4.field3113)) {
                var4.field3113 = var6;
                client.method3522(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3112 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field67 -= 3;
            var4.field3116 = field790[Statics.field67];
            var4.field3177 = field790[Statics.field67 + 1];
            var4.field3115 = field790[Statics.field67 + 2];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3118 = field790[--Statics.field67] == 1;
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3091 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3092 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3125 = field790[--Statics.field67] == 1;
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3094 = field790[--Statics.field67] == 1;
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field67 -= 2;
            var4.field3075 = field790[Statics.field67];
            var4.field3076 = field790[Statics.field67 + 1];
            client.method3522(var4);
            if (var3 != -1 && var4.field3143 == 0) {
                client.method1989(Statics.field2200[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method2169(var4.field3052, var4.field3053);
            client.field637 = var4;
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3152 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3104 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3084 = field790[--Statics.field67];
            client.method3522(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field790[--Statics.field67];
            class412 var8 = (class412) class304.method2319(class412.method5582(), var7);
            if (var8 != null) {
                var4.field3197 = var8;
                client.method3522(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field790[--Statics.field67] == 1;
            var4.field3086 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field790[--Statics.field67] == 1;
            var4.field3110 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field67 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.e(ILbp;ZI)I")
    public static int method282(int arg0, class72 arg1, boolean arg2) {
        class262 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class262.method2355(field790[--Statics.field67]);
        } else {
            var3 = arg2 ? Statics.field1403 : Statics.field2454;
        }
        client.method3522(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field67 -= 2;
            int var4 = field790[Statics.field67];
            int var5 = field790[Statics.field67 + 1];
            var3.field3066 = var4;
            var3.field3193 = var5;
            class170 var6 = class170.method2586(var4);
            var3.field3081 = var6.field1893;
            var3.field3164 = var6.field1894;
            var3.field3105 = var6.field1895;
            var3.field3101 = var6.field1877;
            var3.field3102 = var6.field1897;
            var3.field3103 = var6.field1892;
            if (arg0 == 1205) {
                var3.field3111 = 0;
            } else if (arg0 == 1212 | var6.field1898 == 1) {
                var3.field3111 = 1;
            } else {
                var3.field3111 = 2;
            }
            if (var3.field3107 > 0) {
                var3.field3103 = var3.field3103 * 32 / var3.field3107;
            } else if (var3.field3063 > 0) {
                var3.field3103 = var3.field3103 * 32 / var3.field3063;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3095 = 2;
            var3.field3096 = field790[--Statics.field67];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3095 = 3;
            var3.field3096 = Statics.field1674.field1042.method4516();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gw.p(ILbp;ZB)I")
    public static int method3653(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class262 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class262.method2355(field790[--Statics.field67]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1403 : Statics.field2454;
        }
        if (arg0 == 1300) {
            int var5 = field790[--Statics.field67] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4549(var5, field794[--Statics.field3742]);
                return 1;
            } else {
                Statics.field3742--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field67 -= 2;
            int var6 = field790[Statics.field67];
            int var7 = field790[Statics.field67 + 1];
            var4.field3133 = Statics.method1957(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3093 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3134 = field790[--Statics.field67];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3135 = field790[--Statics.field67];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3048 = field794[--Statics.field3742];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3041 = field794[--Statics.field3742];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3132 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3191 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field67 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field790[Statics.field67 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field790[Statics.field67 + var10];
                        var9[var10 / 2] = (byte) field790[Statics.field67 + var10 + 1];
                    }
                }
            } else {
                Statics.field67 -= 2;
                var8 = new byte[] { (byte) field790[Statics.field67] };
                var9 = new byte[] { (byte) field790[Statics.field67 + 1] };
            }
            int var11 = field790[--Statics.field67] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method4470(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field67 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field790[Statics.field67] };
            byte[] var14 = new byte[] { (byte) field790[Statics.field67 + 1] };
            method4470(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field67 -= 3;
            int var15 = field790[Statics.field67] - 1;
            int var16 = field790[Statics.field67 + 1];
            int var17 = field790[Statics.field67 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1798(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field790[--Statics.field67];
            int var20 = field790[--Statics.field67];
            method1798(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field67--;
            int var21 = field790[Statics.field67] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method14(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method14(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iq.j(Ljf;I[B[BS)V")
    public static final void method4470(class262 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3181 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3181 = new byte[11][];
            arg0.field3106 = new byte[11][];
            arg0.field3129 = new int[11];
            arg0.field3130 = new int[11];
        }
        arg0.field3181[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3126 = false;
            for (int var4 = 0; var4 < arg0.field3181.length; var4++) {
                if (arg0.field3181[var4] != null) {
                    arg0.field3126 = true;
                    break;
                }
            }
        } else {
            arg0.field3126 = true;
        }
        arg0.field3106[arg1] = arg3;
    }

    @ObfuscatedName("bj.b(Ljf;IIIB)V")
    public static final void method1798(class262 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3129 == null) {
            throw new RuntimeException();
        }
        arg0.field3129[arg1] = arg2;
        arg0.field3130[arg1] = arg3;
    }

    @ObfuscatedName("w.x(Ljf;II)V")
    public static final void method14(class262 arg0, int arg1) {
        if (arg0.field3181 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3195 == null) {
            arg0.field3195 = new int[arg0.field3181.length];
        }
        arg0.field3195[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("iy.y(ILbp;ZB)I")
    public static int method4440(int arg0, class72 arg1, boolean arg2) {
        class262 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class262.method2355(field790[--Statics.field67]);
        } else {
            var3 = arg2 ? Statics.field1403 : Statics.field2454;
        }
        String var4 = field794[--Statics.field3742];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field790[--Statics.field67];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field790[--Statics.field67];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field794[--Statics.field3742];
            } else {
                var7[var8] = Integer.valueOf(field790[--Statics.field67]);
            }
        }
        int var9 = field790[--Statics.field67];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3140 = var7;
        } else if (arg0 == 1401) {
            var3.field3198 = var7;
        } else if (arg0 == 1402) {
            var3.field3142 = var7;
        } else if (arg0 == 1403) {
            var3.field3054 = var7;
        } else if (arg0 == 1404) {
            var3.field3128 = var7;
        } else if (arg0 == 1405) {
            var3.field3147 = var7;
        } else if (arg0 == 1406) {
            var3.field3045 = var7;
        } else if (arg0 == 1407) {
            var3.field3051 = var7;
            var3.field3183 = var5;
        } else if (arg0 == 1408) {
            var3.field3157 = var7;
        } else if (arg0 == 1409) {
            var3.field3158 = var7;
        } else if (arg0 == 1410) {
            var3.field3082 = var7;
        } else if (arg0 == 1411) {
            var3.field3062 = var7;
        } else if (arg0 == 1412) {
            var3.field3145 = var7;
        } else if (arg0 == 1414) {
            var3.field3153 = var7;
            var3.field3154 = var5;
        } else if (arg0 == 1415) {
            var3.field3155 = var7;
            var3.field3156 = var5;
        } else if (arg0 == 1416) {
            var3.field3149 = var7;
        } else if (arg0 == 1417) {
            var3.field3080 = var7;
        } else if (arg0 == 1418) {
            var3.field3136 = var7;
        } else if (arg0 == 1419) {
            var3.field3141 = var7;
        } else if (arg0 == 1420) {
            var3.field3114 = var7;
        } else if (arg0 == 1421) {
            var3.field3165 = var7;
        } else if (arg0 == 1422) {
            var3.field3160 = var7;
        } else if (arg0 == 1423) {
            var3.field3169 = var7;
        } else if (arg0 == 1424) {
            var3.field3170 = var7;
        } else if (arg0 == 1425) {
            var3.field3182 = var7;
        } else if (arg0 == 1426) {
            var3.field3173 = var7;
        } else if (arg0 == 1427) {
            var3.field3185 = var7;
        } else if (arg0 == 1428) {
            var3.field3057 = var7;
        } else if (arg0 == 1429) {
            var3.field3167 = var7;
        } else if (arg0 == 1430) {
            var3.field3162 = var7;
        } else if (arg0 == 1431) {
            var3.field3163 = var7;
        } else {
            return 2;
        }
        var3.field3138 = true;
        return 1;
    }

    @ObfuscatedName("hk.k(ILbp;ZI)I")
    public static int method4162(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field1403 : Statics.field2454;
        if (arg0 == 1500) {
            field790[++Statics.field67 - 1] = var3.field3065;
            return 1;
        } else if (arg0 == 1501) {
            field790[++Statics.field67 - 1] = var3.field3123;
            return 1;
        } else if (arg0 == 1502) {
            field790[++Statics.field67 - 1] = var3.field3067;
            return 1;
        } else if (arg0 == 1503) {
            field790[++Statics.field67 - 1] = var3.field3068;
            return 1;
        } else if (arg0 == 1504) {
            field790[++Statics.field67 - 1] = var3.field3072 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field790[++Statics.field67 - 1] = var3.field3071;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gf.t(ILbp;ZB)I")
    public static int method3583(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field1403 : Statics.field2454;
        if (arg0 == 1600) {
            field790[++Statics.field67 - 1] = var3.field3073;
            return 1;
        } else if (arg0 == 1601) {
            field790[++Statics.field67 - 1] = var3.field3117;
            return 1;
        } else if (arg0 == 1602) {
            field794[++Statics.field3742 - 1] = var3.field3113;
            return 1;
        } else if (arg0 == 1603) {
            field790[++Statics.field67 - 1] = var3.field3075;
            return 1;
        } else if (arg0 == 1604) {
            field790[++Statics.field67 - 1] = var3.field3076;
            return 1;
        } else if (arg0 == 1605) {
            field790[++Statics.field67 - 1] = var3.field3103;
            return 1;
        } else if (arg0 == 1606) {
            field790[++Statics.field67 - 1] = var3.field3081;
            return 1;
        } else if (arg0 == 1607) {
            field790[++Statics.field67 - 1] = var3.field3105;
            return 1;
        } else if (arg0 == 1608) {
            field790[++Statics.field67 - 1] = var3.field3164;
            return 1;
        } else if (arg0 == 1609) {
            field790[++Statics.field67 - 1] = var3.field3083;
            return 1;
        } else if (arg0 == 1610) {
            field790[++Statics.field67 - 1] = var3.field3084;
            return 1;
        } else if (arg0 == 1611) {
            field790[++Statics.field67 - 1] = var3.field3077;
            return 1;
        } else if (arg0 == 1612) {
            field790[++Statics.field67 - 1] = var3.field3104;
            return 1;
        } else if (arg0 == 1613) {
            field790[++Statics.field67 - 1] = var3.field3197.method38();
            return 1;
        } else if (arg0 == 1614) {
            field790[++Statics.field67 - 1] = var3.field3110 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field67++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.l(ILbp;ZB)I")
    public static int method1026(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field1403 : Statics.field2454;
        if (arg0 == 1700) {
            field790[++Statics.field67 - 1] = var3.field3066;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3066 == -1) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = var3.field3193;
            }
            return 1;
        } else if (arg0 == 1702) {
            field790[++Statics.field67 - 1] = var3.field3053;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.u(ILbp;ZI)I")
    public static int method1800(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field1403 : Statics.field2454;
        if (arg0 == 1800) {
            field790[++Statics.field67 - 1] = class263.method1943(client.method2052(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field790[--Statics.field67];
            int var5 = var4 - 1;
            if (var3.field3132 == null || var5 >= var3.field3132.length || var3.field3132[var5] == null) {
                field794[++Statics.field3742 - 1] = "";
            } else {
                field794[++Statics.field3742 - 1] = var3.field3132[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3048 == null) {
                field794[++Statics.field3742 - 1] = "";
            } else {
                field794[++Statics.field3742 - 1] = var3.field3048;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cq.n(ILbp;ZS)I")
    public static int method1973(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field799 >= 10) {
                throw new RuntimeException();
            }
            class262 var10;
            if (arg0 >= 2000) {
                var10 = class262.method2355(field790[--Statics.field67]);
            } else {
                var10 = arg2 ? Statics.field1403 : Statics.field2454;
            }
            if (var10.field3185 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1023 = var10;
            var11.field1016 = var10.field3185;
            var11.field1025 = field799 + 1;
            client.field674.method4980(var11);
            return 1;
        } else if (arg0 == 1928) {
            class262 var3 = arg2 ? Statics.field1403 : Statics.field2454;
            int var4 = field790[--Statics.field67];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class93 var5 = new class93(var4, var3.field3052, var3.field3053, var3.field3066);
            field798.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field67 -= 3;
            int var6 = field790[Statics.field67];
            int var7 = field790[Statics.field67 + 1];
            int var8 = field790[Statics.field67 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class93 var9 = new class93(var8, var6, var7, class262.method2355(var6).field3066);
            field798.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ku.z(ILbp;ZI)I")
    public static int method4870(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = class262.method2355(field790[--Statics.field67]);
        if (arg0 == 2500) {
            field790[++Statics.field67 - 1] = var3.field3065;
            return 1;
        } else if (arg0 == 2501) {
            field790[++Statics.field67 - 1] = var3.field3123;
            return 1;
        } else if (arg0 == 2502) {
            field790[++Statics.field67 - 1] = var3.field3067;
            return 1;
        } else if (arg0 == 2503) {
            field790[++Statics.field67 - 1] = var3.field3068;
            return 1;
        } else if (arg0 == 2504) {
            field790[++Statics.field67 - 1] = var3.field3072 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field790[++Statics.field67 - 1] = var3.field3071;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gr.q(ILbp;ZI)I")
    public static int method3579(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = class262.method2355(field790[--Statics.field67]);
        if (arg0 == 2600) {
            field790[++Statics.field67 - 1] = var3.field3073;
            return 1;
        } else if (arg0 == 2601) {
            field790[++Statics.field67 - 1] = var3.field3117;
            return 1;
        } else if (arg0 == 2602) {
            field794[++Statics.field3742 - 1] = var3.field3113;
            return 1;
        } else if (arg0 == 2603) {
            field790[++Statics.field67 - 1] = var3.field3075;
            return 1;
        } else if (arg0 == 2604) {
            field790[++Statics.field67 - 1] = var3.field3076;
            return 1;
        } else if (arg0 == 2605) {
            field790[++Statics.field67 - 1] = var3.field3103;
            return 1;
        } else if (arg0 == 2606) {
            field790[++Statics.field67 - 1] = var3.field3081;
            return 1;
        } else if (arg0 == 2607) {
            field790[++Statics.field67 - 1] = var3.field3105;
            return 1;
        } else if (arg0 == 2608) {
            field790[++Statics.field67 - 1] = var3.field3164;
            return 1;
        } else if (arg0 == 2609) {
            field790[++Statics.field67 - 1] = var3.field3083;
            return 1;
        } else if (arg0 == 2610) {
            field790[++Statics.field67 - 1] = var3.field3084;
            return 1;
        } else if (arg0 == 2611) {
            field790[++Statics.field67 - 1] = var3.field3077;
            return 1;
        } else if (arg0 == 2612) {
            field790[++Statics.field67 - 1] = var3.field3104;
            return 1;
        } else if (arg0 == 2613) {
            field790[++Statics.field67 - 1] = var3.field3197.method38();
            return 1;
        } else if (arg0 == 2614) {
            field790[++Statics.field67 - 1] = var3.field3110 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field67++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.d(ILbp;ZI)I")
    public static int method1983(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class262 var3 = class262.method2355(field790[--Statics.field67]);
            field790[++Statics.field67 - 1] = var3.field3066;
            return 1;
        } else if (arg0 == 2701) {
            class262 var4 = class262.method2355(field790[--Statics.field67]);
            if (var4.field3066 == -1) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = var4.field3193;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field790[--Statics.field67];
            class80 var6 = (class80) client.field632.method6034((long) var5);
            if (var6 == null) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field790[++Statics.field67 - 1] = client.field631;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.r(ILbp;ZI)I")
    public static int method165(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = class262.method2355(field790[--Statics.field67]);
        if (arg0 == 2800) {
            field790[++Statics.field67 - 1] = class263.method1943(client.method2052(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field790[--Statics.field67];
            int var5 = var4 - 1;
            if (var3.field3132 == null || var5 >= var3.field3132.length || var3.field3132[var5] == null) {
                field794[++Statics.field3742 - 1] = "";
            } else {
                field794[++Statics.field3742 - 1] = var3.field3132[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3048 == null) {
                field794[++Statics.field3742 - 1] = "";
            } else {
                field794[++Statics.field3742 - 1] = var3.field3048;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.m(ILbp;ZI)I")
    public static int method1043(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field794[--Statics.field3742];
            class98.method6175(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field67 -= 2;
            client.method4019(Statics.field1674, field790[Statics.field67], field790[Statics.field67 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field792) {
                field796 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field794[--Statics.field3742];
            int var5 = 0;
            if (class319.method2505(var4)) {
                var5 = class319.method2587(var4);
            }
            class242 var6 = class242.method3564(class240.field2755, client.field562.field1277);
            var6.field2792.method6292(var5);
            client.field562.method2269(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field794[--Statics.field3742];
            class242 var8 = class242.method3564(class240.field2765, client.field562.field1277);
            var8.field2792.method6223(var7.length() + 1);
            var8.field2792.method6230(var7);
            client.field562.method2269(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field794[--Statics.field3742];
            class242 var10 = class242.method3564(class240.field2708, client.field562.field1277);
            var10.field2792.method6223(var9.length() + 1);
            var10.field2792.method6230(var9);
            client.field562.method2269(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field790[--Statics.field67];
            String var12 = field794[--Statics.field3742];
            client.method4639(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field67 -= 3;
            int var13 = field790[Statics.field67];
            int var14 = field790[Statics.field67 + 1];
            int var15 = field790[Statics.field67 + 2];
            class262 var16 = class262.method2355(var15);
            client.method2376(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field67 -= 2;
            int var17 = field790[Statics.field67];
            int var18 = field790[Statics.field67 + 1];
            class262 var19 = arg2 ? Statics.field1403 : Statics.field2454;
            client.method2376(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field455 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field790[++Statics.field67 - 1] = Statics.field4363.field1184 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field4363.field1184 = field790[--Statics.field67] == 1;
            class89.method1836();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field794[--Statics.field3742];
            boolean var21 = field790[--Statics.field67] == 1;
            class30.method2146(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field790[--Statics.field67];
            class242 var23 = class242.method3564(class240.field2686, client.field562.field1277);
            var23.field2792.method6224(var22);
            client.field562.method2269(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field790[--Statics.field67];
            Statics.field3742 -= 2;
            String var25 = field794[Statics.field3742];
            String var26 = field794[Statics.field3742 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class242 var27 = class242.method3564(class240.field2725, client.field562.field1277);
                var27.field2792.method6224(1 + Statics.method1282(var25) + Statics.method1282(var26));
                var27.field2792.method6230(var26);
                var27.field2792.method6223(var24);
                var27.field2792.method6230(var25);
                client.field562.method2269(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field503 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field619 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field590 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field790[--Statics.field67] == 1) {
                client.field591 |= 0x1;
            } else {
                client.field591 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field790[--Statics.field67] == 1) {
                client.field591 |= 0x2;
            } else {
                client.field591 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field790[--Statics.field67] == 1) {
                client.field591 |= 0x4;
            } else {
                client.field591 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field790[--Statics.field67] == 1) {
                client.field591 |= 0x8;
            } else {
                client.field591 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field591 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field576 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field586 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method2262(field790[--Statics.field67] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field790[++Statics.field67 - 1] = client.method991() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field67 -= 2;
            client.field572 = field790[Statics.field67];
            client.field552 = field790[Statics.field67 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 3132) {
            field790[++Statics.field67 - 1] = Statics.field184;
            field790[++Statics.field67 - 1] = Statics.field137;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field480 = 3;
            client.field634 = field790[--Statics.field67];
            return 1;
        } else if (arg0 == 3137) {
            client.field480 = 2;
            client.field634 = field790[--Statics.field67];
            return 1;
        } else if (arg0 == 3138) {
            client.field480 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field480 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field480 = 3;
            client.field634 = arg2 ? Statics.field1403.field3052 : Statics.field2454.field3052;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field790[--Statics.field67] == 1;
            Statics.field4363.field1185 = var28;
            class89.method1836();
            return 1;
        } else if (arg0 == 3142) {
            field790[++Statics.field67 - 1] = Statics.field4363.field1185 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field790[--Statics.field67] == 1;
            client.field505 = var29;
            if (!var29) {
                Statics.field4363.field1188 = "";
                class89.method1836();
            }
            return 1;
        } else if (arg0 == 3144) {
            field790[++Statics.field67 - 1] = client.field505 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field790[--Statics.field67] == 1;
            if (Statics.field4363.field1186 == var30) {
                Statics.field4363.field1186 = !var30;
                class89.method1836();
            }
            return 1;
        } else if (arg0 == 3147) {
            field790[++Statics.field67 - 1] = Statics.field4363.field1186 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field790[++Statics.field67 - 1] = class69.field862;
            return 1;
        } else if (arg0 == 3154) {
            field790[++Statics.field67 - 1] = client.method2108();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field3742--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field67--;
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field67--;
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field3742--;
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field67--;
            field794[++Statics.field3742 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field67--;
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field67 -= 2;
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field67 -= 2;
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field67 -= 2;
            field794[++Statics.field3742 - 1] = "";
            field794[++Statics.field3742 - 1] = "";
            field794[++Statics.field3742 - 1] = "";
            field794[++Statics.field3742 - 1] = "";
            field794[++Statics.field3742 - 1] = "";
            field794[++Statics.field3742 - 1] = "";
            field794[++Statics.field3742 - 1] = "";
            field794[++Statics.field3742 - 1] = "";
            field794[++Statics.field3742 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field67--;
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 3175) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field3742--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field3742--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field790[--Statics.field67], 0), 100);
            client.method5713((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field4363.field1190 - 0.5F) * 200.0F;
            field790[++Statics.field67 - 1] = 100 - Math.round(var32);
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field67--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dz.c(ILbp;ZI)I")
    public static int method2424(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field67 -= 3;
            client.method2504(field790[Statics.field67], field790[Statics.field67 + 1], field790[Statics.field67 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method4960(field790[--Statics.field67]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field67 -= 2;
            client.method5448(field790[Statics.field67], field790[Statics.field67 + 1]);
            return 1;
        } else if (arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            int var6 = 0;
            int var7 = field790[--Statics.field67];
            if (arg0 == 3209) {
                var6 = field790[--Statics.field67];
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
                client.method5713((double) ((float) var8 / 200.0F + 0.5F));
            } else if (var6 == 7) {
                int var9 = Math.min(Math.max(var7, 0), 100);
                client.method170(Math.round((float) var9 * 2.55F));
            } else if (var6 == 8) {
                int var10 = Math.min(Math.max(var7, 0), 100);
                client.method3584(Math.round((float) var10 * 1.27F));
            } else if (var6 == 9) {
                int var11 = Math.min(Math.max(var7, 0), 100);
                client.method2554(Math.round((float) var11 * 1.27F));
            }
            return 1;
        } else if (arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            int var3 = 0;
            int var4 = 0;
            if (arg0 == 3210) {
                var3 = field790[--Statics.field67];
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
                float var5 = ((float) Statics.field4363.field1190 - 0.5F) * 200.0F;
                var4 = 100 - Math.round(var5);
            } else if (var3 == 7) {
                var4 = Math.round((float) Statics.field4363.field1191 / 2.55F);
            } else if (var3 == 8) {
                var4 = Math.round((float) Statics.field4363.field1192 / 1.27F);
            } else if (var3 == 9) {
                var4 = Math.round((float) Statics.field4363.field1187 / 1.27F);
            }
            field790[++Statics.field67 - 1] = var4;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.h(ILbp;ZI)I")
    public static int method1572(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field67 -= 2;
            int var3 = field790[Statics.field67];
            int var4 = field790[Statics.field67 + 1];
            class159 var5 = class159.method3110(var3);
            if (var5.field1683 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1691; var6++) {
                if (var5.field1687[var6] == var4) {
                    field794[++Statics.field3742 - 1] = var5.field1692[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field794[++Statics.field3742 - 1] = var5.field1686;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field67 -= 4;
            int var7 = field790[Statics.field67];
            int var8 = field790[Statics.field67 + 1];
            int var9 = field790[Statics.field67 + 2];
            int var10 = field790[Statics.field67 + 3];
            class159 var11 = class159.method3110(var9);
            if (var11.field1689 != var7 || var11.field1683 != var8) {
                if (var8 == 115) {
                    field794[++Statics.field3742 - 1] = class283.field3566;
                } else {
                    field790[++Statics.field67 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1691; var12++) {
                if (var11.field1687[var12] == var10) {
                    if (var8 == 115) {
                        field794[++Statics.field3742 - 1] = var11.field1692[var12];
                    } else {
                        field790[++Statics.field67 - 1] = var11.field1688[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field794[++Statics.field3742 - 1] = var11.field1686;
                } else {
                    field790[++Statics.field67 - 1] = var11.field1685;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field790[--Statics.field67];
            class159 var14 = class159.method3110(var13);
            field790[++Statics.field67 - 1] = var14.method2779();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.v(ILbp;ZB)I")
    public static int method547(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class24.method4679(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class24.method4477(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class24.method3085(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dv.ae(ILbp;ZI)I")
    public static int method2506(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field67--;
            Statics.field3742--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field67++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.aq(ILbp;ZI)I")
    public static int method772(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field842 == null) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = 1;
                Statics.field288 = Statics.field842;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field790[--Statics.field67];
            if (client.field700[var3] == null) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = 1;
                Statics.field288 = client.field700[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field794[++Statics.field3742 - 1] = Statics.field288.field1442;
            return 1;
        } else if (arg0 == 3803) {
            field790[++Statics.field67 - 1] = Statics.field288.field1444 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field790[++Statics.field67 - 1] = Statics.field288.field1445;
            return 1;
        } else if (arg0 == 3805) {
            field790[++Statics.field67 - 1] = Statics.field288.field1440;
            return 1;
        } else if (arg0 == 3806) {
            field790[++Statics.field67 - 1] = Statics.field288.field1447;
            return 1;
        } else if (arg0 == 3807) {
            field790[++Statics.field67 - 1] = Statics.field288.field1448;
            return 1;
        } else if (arg0 == 3809) {
            field790[++Statics.field67 - 1] = Statics.field288.field1449;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field790[--Statics.field67];
            field794[++Statics.field3742 - 1] = Statics.field288.field1460[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = Statics.field288.field1451[var5];
            return 1;
        } else if (arg0 == 3812) {
            field790[++Statics.field67 - 1] = Statics.field288.field1458;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field790[--Statics.field67];
            field794[++Statics.field3742 - 1] = Statics.field288.field1461[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field67 -= 3;
            int var7 = field790[Statics.field67];
            int var8 = field790[Statics.field67 + 1];
            int var9 = field790[Statics.field67 + 2];
            field790[++Statics.field67 - 1] = Statics.field288.method2434(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field790[++Statics.field67 - 1] = Statics.field288.field1437;
            return 1;
        } else if (arg0 == 3816) {
            field790[++Statics.field67 - 1] = Statics.field288.field1439;
            return 1;
        } else if (arg0 == 3817) {
            field790[++Statics.field67 - 1] = Statics.field288.method2431(field794[--Statics.field3742]);
            return 1;
        } else if (arg0 == 3818) {
            field790[Statics.field67 - 1] = Statics.field288.method2479()[field790[Statics.field67 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field67 -= 2;
            int var10 = field790[Statics.field67];
            int var11 = field790[Statics.field67 + 1];
            client.method290(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = Statics.field288.field1454[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field67 -= 3;
                int var13 = field790[Statics.field67];
                boolean var14 = field790[Statics.field67 + 1] == 1;
                int var15 = field790[Statics.field67 + 2];
                client.method2693(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field790[--Statics.field67];
                field790[++Statics.field67 - 1] = Statics.field288.field1455[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1368 == null) {
                    field790[++Statics.field67 - 1] = 0;
                } else {
                    field790[++Statics.field67 - 1] = 1;
                    Statics.field2070 = Statics.field1368;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field790[--Statics.field67];
                if (client.field494[var17] == null) {
                    field790[++Statics.field67 - 1] = 0;
                } else {
                    field790[++Statics.field67 - 1] = 1;
                    Statics.field2070 = client.field494[var17];
                    Statics.field1500 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field794[++Statics.field3742 - 1] = Statics.field2070.field1516;
                return 1;
            } else if (arg0 == 3853) {
                field790[++Statics.field67 - 1] = Statics.field2070.field1512;
                return 1;
            } else if (arg0 == 3854) {
                field790[++Statics.field67 - 1] = Statics.field2070.field1517;
                return 1;
            } else if (arg0 == 3855) {
                field790[++Statics.field67 - 1] = Statics.field2070.method2538();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field790[--Statics.field67];
                field794[++Statics.field3742 - 1] = ((class119) Statics.field2070.field1518.get(var18)).field1384.method6813();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field790[--Statics.field67];
                field790[++Statics.field67 - 1] = ((class119) Statics.field2070.field1518.get(var19)).field1388;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field790[--Statics.field67];
                field790[++Statics.field67 - 1] = ((class119) Statics.field2070.field1518.get(var20)).field1385;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field790[--Statics.field67];
                client.method2949(Statics.field1500, var21);
                return 1;
            } else if (arg0 == 3860) {
                field790[++Statics.field67 - 1] = Statics.field2070.method2546(field794[--Statics.field3742]);
                return 1;
            } else if (arg0 == 3861) {
                field790[Statics.field67 - 1] = Statics.field2070.method2531()[field790[Statics.field67 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field790[++Statics.field67 - 1] = Statics.field1211 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("nu.al(ILbp;ZB)I")
    public static int method5996(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = client.field741[var3].method4884();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = client.field741[var4].field3750;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = client.field741[var5].field3752;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = client.field741[var6].field3753;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = client.field741[var7].field3754;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = client.field741[var8].field3756;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field790[--Statics.field67];
            int var10 = client.field741[var9].method4883();
            field790[++Statics.field67 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field790[--Statics.field67];
            int var12 = client.field741[var11].method4883();
            field790[++Statics.field67 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field790[--Statics.field67];
            int var14 = client.field741[var13].method4883();
            field790[++Statics.field67 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field790[--Statics.field67];
            int var16 = client.field741[var15].method4883();
            field790[++Statics.field67 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field790[--Statics.field67] == 1;
            if (Statics.field1562 != null) {
                Statics.field1562.method4840(class292.field3726, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field790[--Statics.field67] == 1;
            if (Statics.field1562 != null) {
                Statics.field1562.method4840(class292.field3723, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field67 -= 2;
            boolean var19 = field790[Statics.field67] == 1;
            boolean var20 = field790[Statics.field67 + 1] == 1;
            if (Statics.field1562 != null) {
                client.field742.field461 = var20;
                Statics.field1562.method4840(client.field742, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field790[--Statics.field67] == 1;
            if (Statics.field1562 != null) {
                Statics.field1562.method4840(class292.field3724, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field790[--Statics.field67] == 1;
            if (Statics.field1562 != null) {
                Statics.field1562.method4840(class292.field3727, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field790[++Statics.field67 - 1] = Statics.field1562 == null ? 0 : Statics.field1562.field3728.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field790[--Statics.field67];
            class298 var24 = (class298) Statics.field1562.field3728.get(var23);
            field790[++Statics.field67 - 1] = var24.field3748;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field790[--Statics.field67];
            class298 var26 = (class298) Statics.field1562.field3728.get(var25);
            field794[++Statics.field3742 - 1] = var26.method4874();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field790[--Statics.field67];
            class298 var28 = (class298) Statics.field1562.field3728.get(var27);
            field794[++Statics.field3742 - 1] = var28.method4873();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field790[--Statics.field67];
            class298 var30 = (class298) Statics.field1562.field3728.get(var29);
            long var31 = class398.method2381() - Statics.field3759 - var30.field3746;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field794[++Statics.field3742 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field790[--Statics.field67];
            class298 var38 = (class298) Statics.field1562.field3728.get(var37);
            field790[++Statics.field67 - 1] = var38.field3747.field3753;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field790[--Statics.field67];
            class298 var40 = (class298) Statics.field1562.field3728.get(var39);
            field790[++Statics.field67 - 1] = var40.field3747.field3752;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field790[--Statics.field67];
            class298 var42 = (class298) Statics.field1562.field3728.get(var41);
            field790[++Statics.field67 - 1] = var42.field3747.field3750;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.am(ILbp;ZB)I")
    public static int method182(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field67 -= 2;
            int var3 = field790[Statics.field67];
            int var4 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field67 -= 2;
            int var5 = field790[Statics.field67];
            int var6 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field67 -= 2;
            int var7 = field790[Statics.field67];
            int var8 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field67 -= 2;
            int var9 = field790[Statics.field67];
            int var10 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field67 -= 5;
            int var13 = field790[Statics.field67];
            int var14 = field790[Statics.field67 + 1];
            int var15 = field790[Statics.field67 + 2];
            int var16 = field790[Statics.field67 + 3];
            int var17 = field790[Statics.field67 + 4];
            field790[++Statics.field67 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field67 -= 2;
            int var18 = field790[Statics.field67];
            int var19 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field67 -= 2;
            int var20 = field790[Statics.field67];
            int var21 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field67 -= 2;
            int var22 = field790[Statics.field67];
            int var23 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field67 -= 2;
            int var24 = field790[Statics.field67];
            int var25 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field67 -= 2;
            int var26 = field790[Statics.field67];
            int var27 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field67 -= 2;
            int var28 = field790[Statics.field67];
            int var29 = field790[Statics.field67 + 1];
            if (var28 == 0) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field67 -= 2;
            int var30 = field790[Statics.field67];
            int var31 = field790[Statics.field67 + 1];
            if (var30 == 0) {
                field790[++Statics.field67 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field790[++Statics.field67 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field790[++Statics.field67 - 1] = var30;
                    break;
                case 2:
                    field790[++Statics.field67 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field790[++Statics.field67 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field790[++Statics.field67 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field790[++Statics.field67 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field67 -= 2;
            int var32 = field790[Statics.field67];
            int var33 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field67 -= 2;
            int var34 = field790[Statics.field67];
            int var35 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field67 -= 3;
            long var36 = (long) field790[Statics.field67];
            long var38 = (long) field790[Statics.field67 + 1];
            long var40 = (long) field790[Statics.field67 + 2];
            field790[++Statics.field67 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class246.method3747(field790[--Statics.field67]);
            field790[++Statics.field67 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field67 -= 2;
            int var43 = field790[Statics.field67];
            int var44 = field790[Statics.field67 + 1];
            field790[++Statics.field67 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field67 -= 3;
            int var45 = field790[Statics.field67];
            int var46 = field790[Statics.field67 + 1];
            int var47 = field790[Statics.field67 + 2];
            field790[++Statics.field67 - 1] = class246.method1087(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field67 -= 3;
            int var48 = field790[Statics.field67];
            int var49 = field790[Statics.field67 + 1];
            int var50 = field790[Statics.field67 + 2];
            field790[++Statics.field67 - 1] = class246.method4439(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field67 -= 3;
            int var51 = field790[Statics.field67];
            int var52 = field790[Statics.field67 + 1];
            int var53 = field790[Statics.field67 + 2];
            int var54 = 31 - var53;
            field790[++Statics.field67 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field67 -= 4;
            int var55 = field790[Statics.field67];
            int var56 = field790[Statics.field67 + 1];
            int var57 = field790[Statics.field67 + 2];
            int var58 = field790[Statics.field67 + 3];
            int var59 = class246.method4439(var55, var57, var58);
            int var60 = class246.method2425(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field790[++Statics.field67 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field790[Statics.field67 - 1] = class362.method4646(field790[Statics.field67 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field790[Statics.field67 - 1] = class362.method2377(field790[Statics.field67 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field67 -= 2;
            int var61 = field790[Statics.field67];
            int var62 = field790[Statics.field67 + 1];
            int var63 = class362.method4956(var61, var62);
            field790[++Statics.field67 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field790[Statics.field67 - 1] = Math.abs(field790[Statics.field67 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.ai(ILbp;ZI)I")
    public static int method393(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field794[--Statics.field3742];
            int var4 = field790[--Statics.field67];
            field794[++Statics.field3742 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field3742 -= 2;
            String var5 = field794[Statics.field3742];
            String var6 = field794[Statics.field3742 + 1];
            field794[++Statics.field3742 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field794[--Statics.field3742];
            int var8 = field790[--Statics.field67];
            field794[++Statics.field3742 - 1] = var7 + class319.method4254(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field794[--Statics.field3742];
            field794[++Statics.field3742 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field790[--Statics.field67];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field787.setTime(new Date(var11));
            int var13 = field787.get(5);
            int var14 = field787.get(2);
            int var15 = field787.get(1);
            field794[++Statics.field3742 - 1] = var13 + "-" + field795[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field3742 -= 2;
            String var16 = field794[Statics.field3742];
            String var17 = field794[Statics.field3742 + 1];
            if (Statics.field1674.field1042 != null && Statics.field1674.field1042.field3024) {
                field794[++Statics.field3742 - 1] = var17;
            } else {
                field794[++Statics.field3742 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field790[--Statics.field67];
            field794[++Statics.field3742 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field3742 -= 2;
            field790[++Statics.field67 - 1] = class319.method1941(class320.method2176(field794[Statics.field3742], field794[Statics.field3742 + 1], Statics.field207));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field794[--Statics.field3742];
            Statics.field67 -= 2;
            int var20 = field790[Statics.field67];
            int var21 = field790[Statics.field67 + 1];
            byte[] var22 = Statics.field1174.method4743(var21, 0);
            class315 var23 = new class315(var22);
            field790[++Statics.field67 - 1] = var23.method5216(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field794[--Statics.field3742];
            Statics.field67 -= 2;
            int var25 = field790[Statics.field67];
            int var26 = field790[Statics.field67 + 1];
            byte[] var27 = Statics.field1174.method4743(var26, 0);
            class315 var28 = new class315(var27);
            field790[++Statics.field67 - 1] = var28.method5215(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field3742 -= 2;
            String var29 = field794[Statics.field3742];
            String var30 = field794[Statics.field3742 + 1];
            if (field790[--Statics.field67] == 1) {
                field794[++Statics.field3742 - 1] = var29;
            } else {
                field794[++Statics.field3742 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field794[--Statics.field3742];
            field794[++Statics.field3742 - 1] = class316.method5163(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field794[--Statics.field3742];
            int var33 = field790[--Statics.field67];
            field794[++Statics.field3742 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class319.method4648((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class319.method3015((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class319.method4465((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class319.method2404((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field794[--Statics.field3742];
            if (var38 == null) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field794[--Statics.field3742];
            Statics.field67 -= 2;
            int var40 = field790[Statics.field67];
            int var41 = field790[Statics.field67 + 1];
            field794[++Statics.field3742 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field794[--Statics.field3742];
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
            field794[++Statics.field3742 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field794[--Statics.field3742];
            int var48 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field3742 -= 2;
            String var49 = field794[Statics.field3742];
            String var50 = field794[Statics.field3742 + 1];
            int var51 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field794[--Statics.field3742];
            field794[++Statics.field3742 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dj.as(ILbp;ZB)I")
    public static int method2397(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field790[++Statics.field67 - 1] = client.field491;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field67 -= 3;
            client.field491 = field790[Statics.field67];
            Statics.field453 = class418.method3737(field790[Statics.field67 + 1]);
            if (Statics.field453 == null) {
                Statics.field453 = class418.field4426;
            }
            client.field662 = field790[Statics.field67 + 2];
            class242 var3 = class242.method3564(class240.field2697, client.field562.field1277);
            var3.field2792.method6223(client.field491);
            var3.field2792.method6223(Statics.field453.field4425);
            var3.field2792.method6223(client.field662);
            client.field562.method2269(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field794[--Statics.field3742];
            Statics.field67 -= 2;
            int var5 = field790[Statics.field67];
            int var6 = field790[Statics.field67 + 1];
            class242 var7 = class242.method3564(class240.field2669, client.field562.field1277);
            var7.field2792.method6223(Statics.method1282(var4) + 2);
            var7.field2792.method6230(var4);
            var7.field2792.method6223(var5 - 1);
            var7.field2792.method6223(var6);
            client.field562.method2269(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field67 -= 2;
            int var8 = field790[Statics.field67];
            int var9 = field790[Statics.field67 + 1];
            class58 var10 = class98.method1035(var8, var9);
            if (var10 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field794[++Statics.field3742 - 1] = "";
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = var10.field446;
                field790[++Statics.field67 - 1] = var10.field442;
                field794[++Statics.field3742 - 1] = var10.field444 == null ? "" : var10.field444;
                field794[++Statics.field3742 - 1] = var10.field448 == null ? "" : var10.field448;
                field794[++Statics.field3742 - 1] = var10.field445 == null ? "" : var10.field445;
                field790[++Statics.field67 - 1] = var10.method1049() ? 1 : (var10.method1058() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field790[--Statics.field67];
            class58 var12 = class98.method2418(var11);
            if (var12 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field794[++Statics.field3742 - 1] = "";
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = var12.field443;
                field790[++Statics.field67 - 1] = var12.field442;
                field794[++Statics.field3742 - 1] = var12.field444 == null ? "" : var12.field444;
                field794[++Statics.field3742 - 1] = var12.field448 == null ? "" : var12.field448;
                field794[++Statics.field3742 - 1] = var12.field445 == null ? "" : var12.field445;
                field790[++Statics.field67 - 1] = var12.method1049() ? 1 : (var12.method1058() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field453 == null) {
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = Statics.field453.field4425;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field794[--Statics.field3742];
            int var14 = field790[--Statics.field67];
            class242 var15 = class423.method6058(var14, var13, Statics.field207, -1);
            client.field562.method2269(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field3742 -= 2;
            String var16 = field794[Statics.field3742];
            String var17 = field794[Statics.field3742 + 1];
            class242 var18 = class242.method3564(class240.field2676, client.field562.field1277);
            var18.field2792.method6224(0);
            int var19 = var18.field2792.field4300;
            var18.field2792.method6230(var16);
            class265.method2514(var18.field2792, var17);
            var18.field2792.method6266(var18.field2792.field4300 - var19);
            client.field562.method2269(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field794[--Statics.field3742];
            Statics.field67 -= 2;
            int var21 = field790[Statics.field67];
            int var22 = field790[Statics.field67 + 1];
            class242 var23 = class423.method6058(var21, var20, Statics.field207, var22);
            client.field562.method2269(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field1674 == null || Statics.field1674.field1048 == null) {
                var24 = "";
            } else {
                var24 = Statics.field1674.field1048.method6813();
            }
            field794[++Statics.field3742 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field790[++Statics.field67 - 1] = client.field662;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class98.method1673(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class98.method2405(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = class98.method3210(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field794[--Statics.field3742];
            client.method52(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field693 = field794[--Statics.field3742].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field794[++Statics.field3742 - 1] = client.field693;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field794[--Statics.field3742];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field67++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field67 -= 2;
            int var30 = field790[Statics.field67];
            int var31 = field790[Statics.field67 + 1];
            class58 var32 = class98.method1035(var30, var31);
            if (var32 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field794[++Statics.field3742 - 1] = "";
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = var32.field446;
                field790[++Statics.field67 - 1] = var32.field442;
                field794[++Statics.field3742 - 1] = var32.field444 == null ? "" : var32.field444;
                field794[++Statics.field3742 - 1] = var32.field448 == null ? "" : var32.field448;
                field794[++Statics.field3742 - 1] = var32.field445 == null ? "" : var32.field445;
                field790[++Statics.field67 - 1] = var32.method1049() ? 1 : (var32.method1058() ? 2 : 0);
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field790[--Statics.field67];
            class58 var34 = class98.method2418(var33);
            if (var34 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field794[++Statics.field3742 - 1] = "";
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = var34.field443;
                field790[++Statics.field67 - 1] = var34.field442;
                field794[++Statics.field3742 - 1] = var34.field444 == null ? "" : var34.field444;
                field794[++Statics.field3742 - 1] = var34.field448 == null ? "" : var34.field448;
                field794[++Statics.field3742 - 1] = var34.field445 == null ? "" : var34.field445;
                field790[++Statics.field67 - 1] = var34.method1049() ? 1 : (var34.method1058() ? 2 : 0);
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.at(ILbp;ZI)I")
    public static int method2145(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field790[++Statics.field67 - 1] = client.method2524();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field790[--Statics.field67];
            if (var3 == 1 || var3 == 2) {
                Statics.method2798(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field790[++Statics.field67 - 1] = Statics.field4363.field1194;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field790[--Statics.field67];
            if (var4 == 1 || var4 == 2) {
                Statics.field4363.field1194 = var4;
                class89.method1836();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field3742 -= 2;
            Statics.field67--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field3742--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ei.az(ILbp;ZI)I")
    public static int method2672(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field67 -= 2;
            int var3 = field790[Statics.field67];
            int var4 = field790[Statics.field67 + 1];
            if (!client.field692) {
                client.field483 = var3;
                client.field541 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field790[++Statics.field67 - 1] = client.field483;
            return 1;
        } else if (arg0 == 5506) {
            field790[++Statics.field67 - 1] = client.field541;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field790[--Statics.field67];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field727 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field790[++Statics.field67 - 1] = client.field727;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gd.ac(ILbp;ZI)I")
    public static int method3523(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field519 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field3742 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field790[++Statics.field67 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.ak(IB)I")
    public static int method76(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ah.ab(IS)I")
    public static int method618(int arg0) {
        return (int) ((Math.log((double) arg0) / field802 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("bh.ar(ILbp;ZB)I")
    public static int method1083(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field67 -= 2;
            client.field465 = (short) method76(field790[Statics.field67]);
            if (client.field465 <= 0) {
                client.field465 = 256;
            }
            client.field551 = (short) method76(field790[Statics.field67 + 1]);
            if (client.field551 <= 0) {
                client.field551 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field67 -= 2;
            client.field726 = (short) field790[Statics.field67];
            if (client.field726 <= 0) {
                client.field726 = 256;
            }
            client.field598 = (short) field790[Statics.field67 + 1];
            if (client.field598 <= 0) {
                client.field598 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field67 -= 4;
            client.field728 = (short) field790[Statics.field67];
            if (client.field728 <= 0) {
                client.field728 = 1;
            }
            client.field601 = (short) field790[Statics.field67 + 1];
            if (client.field601 <= 0) {
                client.field601 = 32767;
            } else if (client.field601 < client.field728) {
                client.field601 = client.field728;
            }
            client.field730 = (short) field790[Statics.field67 + 2];
            if (client.field730 <= 0) {
                client.field730 = 1;
            }
            client.field731 = (short) field790[Statics.field67 + 3];
            if (client.field731 <= 0) {
                client.field731 = 32767;
            } else if (client.field731 < client.field730) {
                client.field731 = client.field730;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field643 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = -1;
            } else {
                client.method4467(0, 0, client.field643.field3067, client.field643.field3068, false);
                field790[++Statics.field67 - 1] = client.field627;
                field790[++Statics.field67 - 1] = client.field735;
            }
            return 1;
        } else if (arg0 == 6204) {
            field790[++Statics.field67 - 1] = client.field726;
            field790[++Statics.field67 - 1] = client.field598;
            return 1;
        } else if (arg0 == 6205) {
            field790[++Statics.field67 - 1] = method618(client.field465);
            field790[++Statics.field67 - 1] = method618(client.field551);
            return 1;
        } else if (arg0 == 6220) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field790[++Statics.field67 - 1] = Statics.field184;
            return 1;
        } else if (arg0 == 6223) {
            field790[++Statics.field67 - 1] = Statics.field137;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.ad(ILbp;ZI)I")
    public static int method163(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field790[++Statics.field67 - 1] = class61.method4434() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method293();
            if (var3 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
            } else {
                field790[++Statics.field67 - 1] = var3.field752;
                field790[++Statics.field67 - 1] = var3.field754;
                field794[++Statics.field3742 - 1] = var3.field757;
                field790[++Statics.field67 - 1] = var3.field761;
                field790[++Statics.field67 - 1] = var3.field756;
                field794[++Statics.field3742 - 1] = var3.field759;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method2142();
            if (var4 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
            } else {
                field790[++Statics.field67 - 1] = var4.field752;
                field790[++Statics.field67 - 1] = var4.field754;
                field794[++Statics.field3742 - 1] = var4.field757;
                field790[++Statics.field67 - 1] = var4.field761;
                field790[++Statics.field67 - 1] = var4.field756;
                field794[++Statics.field3742 - 1] = var4.field759;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field790[--Statics.field67];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field760; var7++) {
                if (Statics.field2230[var7].field752 == var5) {
                    var6 = Statics.field2230[var7];
                    break;
                }
            }
            if (var6 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
            } else {
                field790[++Statics.field67 - 1] = var6.field752;
                field790[++Statics.field67 - 1] = var6.field754;
                field794[++Statics.field3742 - 1] = var6.field757;
                field790[++Statics.field67 - 1] = var6.field761;
                field790[++Statics.field67 - 1] = var6.field756;
                field794[++Statics.field3742 - 1] = var6.field759;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field67 -= 4;
            int var8 = field790[Statics.field67];
            boolean var9 = field790[Statics.field67 + 1] == 1;
            int var10 = field790[Statics.field67 + 2];
            boolean var11 = field790[Statics.field67 + 3] == 1;
            class61.method102(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field790[--Statics.field67];
            if (var12 >= 0 && var12 < class61.field760) {
                class61 var13 = Statics.field2230[var12];
                field790[++Statics.field67 - 1] = var13.field752;
                field790[++Statics.field67 - 1] = var13.field754;
                field794[++Statics.field3742 - 1] = var13.field757;
                field790[++Statics.field67 - 1] = var13.field761;
                field790[++Statics.field67 - 1] = var13.field756;
                field794[++Statics.field3742 - 1] = var13.field759;
            } else {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
                field790[++Statics.field67 - 1] = 0;
                field790[++Statics.field67 - 1] = 0;
                field794[++Statics.field3742 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field616 = field790[--Statics.field67] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field67 -= 2;
            int var14 = field790[Statics.field67];
            int var15 = field790[Statics.field67 + 1];
            class166 var16 = class166.method6451(var15);
            if (var16.method2892()) {
                field794[++Statics.field3742 - 1] = class161.method1044(var14).method2811(var15, var16.field1787);
            } else {
                field790[++Statics.field67 - 1] = class161.method1044(var14).method2810(var15, var16.field1783);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field67 -= 2;
            int var17 = field790[Statics.field67];
            int var18 = field790[Statics.field67 + 1];
            class166 var19 = class166.method6451(var18);
            if (var19.method2892()) {
                field794[++Statics.field3742 - 1] = Statics.method2740(var17).method3013(var18, var19.field1787);
            } else {
                field790[++Statics.field67 - 1] = Statics.method2740(var17).method2995(var18, var19.field1783);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field67 -= 2;
            int var20 = field790[Statics.field67];
            int var21 = field790[Statics.field67 + 1];
            class166 var22 = class166.method6451(var21);
            if (var22.method2892()) {
                field794[++Statics.field3742 - 1] = class170.method2586(var20).method3031(var21, var22.field1787);
            } else {
                field790[++Statics.field67 - 1] = class170.method2586(var20).method3030(var21, var22.field1783);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field67 -= 2;
            int var23 = field790[Statics.field67];
            int var24 = field790[Statics.field67 + 1];
            class166 var25 = class166.method6451(var24);
            if (var25.method2892()) {
                field794[++Statics.field3742 - 1] = class167.method4652(var23).method2916(var24, var25.field1787);
            } else {
                field790[++Statics.field67 - 1] = class167.method4652(var23).method2927(var24, var25.field1783);
            }
            return 1;
        } else if (arg0 == 6518) {
            field790[++Statics.field67 - 1] = client.field471 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field790[++Statics.field67 - 1] = client.field588 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field3742--;
            Statics.field67--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field3742--;
            Statics.field67--;
            return 1;
        } else if (arg0 == 6524) {
            field790[++Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field790[++Statics.field67 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field790[++Statics.field67 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field790[++Statics.field67 - 1] = client.field470;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kg.an(ILbp;ZI)I")
    public static int method4697(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field3731;
            int var4 = (Statics.field1674.field1092 >> 7) + Statics.field92;
            int var5 = (Statics.field1674.field1085 >> 7) + Statics.field4007;
            client.method1037().method5806(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field790[--Statics.field67];
            String var7 = "";
            class181 var8 = client.method1037().method5826(var6);
            if (var8 != null) {
                var7 = var8.method3304();
            }
            field794[++Statics.field3742 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field790[--Statics.field67];
            client.method1037().method5807(var9);
            return 1;
        } else if (arg0 == 6603) {
            field790[++Statics.field67 - 1] = client.method1037().method5820();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field790[--Statics.field67];
            client.method1037().method5818(var10);
            return 1;
        } else if (arg0 == 6605) {
            field790[++Statics.field67 - 1] = client.method1037().method5823() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class258 var11 = new class258(field790[--Statics.field67]);
            client.method1037().method5805(var11.field3017, var11.field3016);
            return 1;
        } else if (arg0 == 6607) {
            class258 var12 = new class258(field790[--Statics.field67]);
            client.method1037().method5956(var12.field3017, var12.field3016);
            return 1;
        } else if (arg0 == 6608) {
            class258 var13 = new class258(field790[--Statics.field67]);
            client.method1037().method5924(var13.field3018, var13.field3017, var13.field3016);
            return 1;
        } else if (arg0 == 6609) {
            class258 var14 = new class258(field790[--Statics.field67]);
            client.method1037().method5828(var14.field3018, var14.field3017, var14.field3016);
            return 1;
        } else if (arg0 == 6610) {
            field790[++Statics.field67 - 1] = client.method1037().method5829();
            field790[++Statics.field67 - 1] = client.method1037().method5928();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field790[--Statics.field67];
            class181 var16 = client.method1037().method5826(var15);
            if (var16 == null) {
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = var16.method3319().method4479();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field790[--Statics.field67];
            class181 var18 = client.method1037().method5826(var17);
            if (var18 == null) {
                field790[++Statics.field67 - 1] = 0;
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = (var18.method3280() - var18.method3279() + 1) * 64;
                field790[++Statics.field67 - 1] = (var18.method3282() - var18.method3281() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field790[--Statics.field67];
            class181 var20 = client.method1037().method5826(var19);
            if (var20 == null) {
                field790[++Statics.field67 - 1] = 0;
                field790[++Statics.field67 - 1] = 0;
                field790[++Statics.field67 - 1] = 0;
                field790[++Statics.field67 - 1] = 0;
            } else {
                field790[++Statics.field67 - 1] = var20.method3279() * 64;
                field790[++Statics.field67 - 1] = var20.method3281() * 64;
                field790[++Statics.field67 - 1] = var20.method3280() * 64 + 64 - 1;
                field790[++Statics.field67 - 1] = var20.method3282() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field790[--Statics.field67];
            class181 var22 = client.method1037().method5826(var21);
            if (var22 == null) {
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var22.method3278();
            }
            return 1;
        } else if (arg0 == 6615) {
            class258 var23 = client.method1037().method5798();
            if (var23 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var23.field3017;
                field790[++Statics.field67 - 1] = var23.field3016;
            }
            return 1;
        } else if (arg0 == 6616) {
            field790[++Statics.field67 - 1] = client.method1037().method5808();
            return 1;
        } else if (arg0 == 6617) {
            class258 var24 = new class258(field790[--Statics.field67]);
            class181 var25 = client.method1037().method5809();
            if (var25 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method3270(var24.field3018, var24.field3017, var24.field3016);
            if (var26 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var26[0];
                field790[++Statics.field67 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class258 var27 = new class258(field790[--Statics.field67]);
            class181 var28 = client.method1037().method5809();
            if (var28 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = -1;
                return 1;
            }
            class258 var29 = var28.method3271(var27.field3017, var27.field3016);
            if (var29 == null) {
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var29.method4479();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field67 -= 2;
            int var30 = field790[Statics.field67];
            class258 var31 = new class258(field790[Statics.field67 + 1]);
            method211(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field67 -= 2;
            int var32 = field790[Statics.field67];
            class258 var33 = new class258(field790[Statics.field67 + 1]);
            method211(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field67 -= 2;
            int var34 = field790[Statics.field67];
            class258 var35 = new class258(field790[Statics.field67 + 1]);
            class181 var36 = client.method1037().method5826(var34);
            if (var36 == null) {
                field790[++Statics.field67 - 1] = 0;
                return 1;
            } else {
                field790[++Statics.field67 - 1] = var36.method3268(var35.field3018, var35.field3017, var35.field3016) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field790[++Statics.field67 - 1] = client.method1037().method5832();
            field790[++Statics.field67 - 1] = client.method1037().method5833();
            return 1;
        } else if (arg0 == 6623) {
            class258 var37 = new class258(field790[--Statics.field67]);
            class181 var38 = client.method1037().method5963(var37.field3018, var37.field3017, var37.field3016);
            if (var38 == null) {
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var38.method3277();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1037().method5834(field790[--Statics.field67]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1037().method5972();
            return 1;
        } else if (arg0 == 6626) {
            client.method1037().method5836(field790[--Statics.field67]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1037().method5813();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field790[--Statics.field67] == 1;
            client.method1037().method5838(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field790[--Statics.field67];
            client.method1037().method5839(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field790[--Statics.field67];
            client.method1037().method5840(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1037().method5841();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field790[--Statics.field67] == 1;
            client.method1037().method5842(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field67 -= 2;
            int var43 = field790[Statics.field67];
            boolean var44 = field790[Statics.field67 + 1] == 1;
            client.method1037().method5922(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field67 -= 2;
            int var45 = field790[Statics.field67];
            boolean var46 = field790[Statics.field67 + 1] == 1;
            client.method1037().method5875(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field790[++Statics.field67 - 1] = client.method1037().method5845() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = client.method1037().method5846(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field790[--Statics.field67];
            field790[++Statics.field67 - 1] = client.method1037().method5881(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field67 -= 2;
            int var49 = field790[Statics.field67];
            class258 var50 = new class258(field790[Statics.field67 + 1]);
            class258 var51 = client.method1037().method5975(var49, var50);
            if (var51 == null) {
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var51.method4479();
            }
            return 1;
        } else if (arg0 == 6639) {
            class199 var52 = client.method1037().method5852();
            if (var52 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var52.method3225();
                field790[++Statics.field67 - 1] = var52.field2205.method4479();
            }
            return 1;
        } else if (arg0 == 6640) {
            class199 var53 = client.method1037().method5853();
            if (var53 == null) {
                field790[++Statics.field67 - 1] = -1;
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var53.method3225();
                field790[++Statics.field67 - 1] = var53.field2205.method4479();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field790[--Statics.field67];
            class154 var55 = class154.method3068(var54);
            if (var55.field1626 == null) {
                field794[++Statics.field3742 - 1] = "";
            } else {
                field794[++Statics.field3742 - 1] = var55.field1626;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field790[--Statics.field67];
            class154 var57 = class154.method3068(var56);
            field790[++Statics.field67 - 1] = var57.field1628;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field790[--Statics.field67];
            class154 var59 = class154.method3068(var58);
            if (var59 == null) {
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var59.field1641;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field790[--Statics.field67];
            class154 var61 = class154.method3068(var60);
            if (var61 == null) {
                field790[++Statics.field67 - 1] = -1;
            } else {
                field790[++Statics.field67 - 1] = var61.field1632;
            }
            return 1;
        } else if (arg0 == 6697) {
            field790[++Statics.field67 - 1] = Statics.field23.field2233;
            return 1;
        } else if (arg0 == 6698) {
            field790[++Statics.field67 - 1] = Statics.field23.field2231.method4479();
            return 1;
        } else if (arg0 == 6699) {
            field790[++Statics.field67 - 1] = Statics.field23.field2232.method4479();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dz.ax(ILbp;ZI)I")
    public static int method2421(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field67 -= 2;
            Statics.field3742--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 6750) {
            field794[++Statics.field3742 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field790[++Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field790[--Statics.field67];
            class161 var4 = class161.method1044(var3);
            field794[++Statics.field3742 - 1] = var4 == null ? "" : var4.field1716;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ih.av(ILbp;ZB)I")
    public static int method4237(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field794[++Statics.field3742 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field790[++Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field794[++Statics.field3742 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field790[++Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.ap(ILbp;ZI)I")
    public static int method1906(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field794[++Statics.field3742 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field790[++Statics.field67 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("el.au(ILbp;ZI)I")
    public static int method2559(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field67 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field67 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field3742--;
            Statics.field67--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field3742--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field67 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field67--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.aj(ILbp;ZI)I")
    public static int method1818(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field67++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field3742 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field67++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field67++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field67++;
            return 1;
        } else if (arg0 == 7108) {
            field790[++Statics.field67 - 1] = client.method4946() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field67--;
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field67 -= 2;
            field790[++Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field67 -= 2;
            field790[++Statics.field67 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.af(ILbp;ZI)I")
    public static int method394(int arg0, class72 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field67 -= 5;
            field790[++Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field67 -= 6;
            field790[++Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field790[Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field67 -= 2;
            field790[++Statics.field67 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field67--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field67 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.aw(IB)V")
    public static void method1038(int arg0) {
        if (arg0 == -1 || !class262.method3185(arg0)) {
            return;
        }
        class262[] var1 = Statics.field2200[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class262 var3 = var1[var2];
            if (var3.field3139 != null) {
                class81 var4 = new class81();
                var4.field1023 = var3;
                var4.field1016 = var3.field3139;
                method759(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("n.ao(ILie;ZI)V")
    public static void method211(int arg0, class258 arg1, boolean arg2) {
        class181 var3 = client.method1037().method5826(arg0);
        int var4 = Statics.field1674.field1063;
        int var5 = (Statics.field1674.field1092 >> 7) + Statics.field92;
        int var6 = (Statics.field1674.field1085 >> 7) + Statics.field4007;
        class258 var7 = new class258(var4, var5, var6);
        client.method1037().method5944(var3, var7, arg1, arg2);
    }
}
