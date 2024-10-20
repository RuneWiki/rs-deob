package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("bg")
public class class67 {

    @ObfuscatedName("bg.j")
    public static int[] field850 = new int[5];

    @ObfuscatedName("bg.i")
    public static int[][] field851 = new int[5][5000];

    @ObfuscatedName("bg.n")
    public static int[] field857 = new int[1000];

    @ObfuscatedName("bg.k")
    public static String[] field853 = new String[1000];

    @ObfuscatedName("bg.r")
    public static int field854 = 0;

    @ObfuscatedName("bg.b")
    public static class60[] field855 = new class60[50];

    @ObfuscatedName("bg.u")
    public static Calendar field848 = Calendar.getInstance();

    @ObfuscatedName("bg.x")
    public static final String[] field858 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bg.q")
    public static boolean field852 = false;

    @ObfuscatedName("bg.d")
    public static boolean field867 = false;

    @ObfuscatedName("bg.e")
    public static ArrayList field865 = new ArrayList();

    @ObfuscatedName("bg.g")
    public static int field862 = 0;

    @ObfuscatedName("bg.ai")
    public static final double field863 = Math.log(2.0D);

    public class67() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("je.f(Lcd;I)V")
    public static void method4946(class84 arg0) {
        method3882(arg0, 500000, 475000);
    }

    @ObfuscatedName("hi.w(Lcd;III)V")
    public static void method3882(class84 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1062;
        class75 var5;
        if (class472.method5872(arg0.field1070)) {
            Statics.field120 = (class265) var3[0];
            class183 var4 = class183.method18(Statics.field120.field3031);
            var5 = class75.method3014(arg0.field1070, var4.field1937, var4.field1956);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class75.method1999(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field3469 = 0;
        Statics.field114 = 0;
        int var7 = -1;
        int[] var8 = var5.field981;
        int[] var9 = var5.field989;
        byte var10 = -1;
        field854 = 0;
        field852 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field849 = new int[var5.field984];
            int var13 = 0;
            Statics.field975 = new String[var5.field985];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1069;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1063;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1073 == null ? -1 : arg0.field1073.field3701;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1060;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1073 == null ? -1 : arg0.field1073.field3558;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1065 == null ? -1 : arg0.field1065.field3701;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1065 == null ? -1 : arg0.field1065.field3558;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1066;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1067;
                    }
                    Statics.field849[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1068;
                    }
                    Statics.field975[var14++] = var17;
                }
            }
            field862 = arg0.field1072;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field989[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method486(var61, var5, var48);
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
                    field857[++Statics.field3469 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field857[++Statics.field3469 - 1] = class300.field3459[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class300.field3459[var19] = field857[--Statics.field3469];
                    client.method690(var19);
                } else if (var61 == 3) {
                    field853[++Statics.field114 - 1] = var5.field983[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field3469 -= 2;
                    if (field857[Statics.field3469] != field857[Statics.field3469 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field3469 -= 2;
                    if (field857[Statics.field3469] == field857[Statics.field3469 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field3469 -= 2;
                    if (field857[Statics.field3469] < field857[Statics.field3469 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field3469 -= 2;
                    if (field857[Statics.field3469] > field857[Statics.field3469 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field854 == 0) {
                        return;
                    }
                    class60 var21 = field855[--field854];
                    var5 = var21.field474;
                    var8 = var5.field981;
                    var9 = var5.field989;
                    var7 = var21.field469;
                    Statics.field849 = var21.field470;
                    Statics.field975 = var21.field471;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field857[++Statics.field3469 - 1] = class300.method2093(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class300.method4988(var23, field857[--Statics.field3469]);
                } else if (var61 == 31) {
                    Statics.field3469 -= 2;
                    if (field857[Statics.field3469] <= field857[Statics.field3469 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field3469 -= 2;
                    if (field857[Statics.field3469] >= field857[Statics.field3469 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field857[++Statics.field3469 - 1] = Statics.field849[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field849[var9[var7]] = field857[--Statics.field3469];
                } else if (var61 == 35) {
                    field853[++Statics.field114 - 1] = Statics.field975[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field975[var9[var7]] = field853[--Statics.field114];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field114 -= var24;
                    String var25 = Statics.method5852(field853, Statics.field114, var24);
                    field853[++Statics.field114 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field3469--;
                } else if (var61 == 39) {
                    Statics.field114--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class75 var27 = class75.method1999(var26);
                    int[] var28 = new int[var27.field984];
                    String[] var29 = new String[var27.field985];
                    for (int var30 = 0; var30 < var27.field990; var30++) {
                        var28[var30] = field857[Statics.field3469 - var27.field990 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field987; var31++) {
                        var29[var31] = field853[Statics.field114 - var27.field987 + var31];
                    }
                    Statics.field3469 -= var27.field990;
                    Statics.field114 -= var27.field987;
                    class60 var32 = new class60();
                    var32.field474 = var5;
                    var32.field469 = var7;
                    var32.field470 = Statics.field849;
                    var32.field471 = Statics.field975;
                    field855[++field854 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field981;
                    var9 = var27.field989;
                    var7 = -1;
                    Statics.field849 = var28;
                    Statics.field975 = var29;
                } else if (var61 == 42) {
                    field857[++Statics.field3469 - 1] = Statics.field35.method2618(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field35.method2647(var9[var7], field857[--Statics.field3469]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field857[--Statics.field3469];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field850[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field851[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field857[--Statics.field3469];
                    if (var39 < 0 || var39 >= field850[var38]) {
                        throw new RuntimeException();
                    }
                    field857[++Statics.field3469 - 1] = field851[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field3469 -= 2;
                    int var41 = field857[Statics.field3469];
                    if (var41 < 0 || var41 >= field850[var40]) {
                        throw new RuntimeException();
                    }
                    field851[var40][var41] = field857[Statics.field3469 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field35.method2622(var9[var7]);
                    if (var42 == null) {
                        var42 = class330.field3846;
                    }
                    field853[++Statics.field114 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field35.method2621(var9[var7], field853[--Statics.field114]);
                } else if (var61 == 49) {
                    String var43 = Statics.field35.method2633(var9[var7]);
                    field853[++Statics.field114 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field35.method2619(var9[var7], field853[--Statics.field114]);
                } else if (var61 == 60) {
                    class450 var44 = var5.field979[var9[var7]];
                    class439 var45 = (class439) var44.method7691((long) field857[--Statics.field3469]);
                    if (var45 != null) {
                        var7 += var45.field4708;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field2852.method3027(var9[var7]);
                    if (var46 == null) {
                        field857[++Statics.field3469 - 1] = -1;
                    } else {
                        field857[++Statics.field3469 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field4513.method7365(var9[var7]);
                    if (var47 == null) {
                        field857[++Statics.field3469 - 1] = -1;
                    } else {
                        field857[++Statics.field3469 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4711).append(" ");
            for (int var53 = field854 - 1; var53 >= 0; var53--) {
                var52.append("").append(field855[var53].field474.field4711).append(" ");
            }
            var52.append("").append(var10);
            class500.method2855(var52.toString(), var59);
        } finally {
            while (field865.size() > 0) {
                class98 var56 = (class98) field865.remove(0);
                client.method212(var56.method2576(), var56.method2566(), var56.method2567(), var56.method2568(), "");
            }
            if (field852) {
                field852 = false;
                client.method842();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class500.method2855("Warning: Script " + var5.field982 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("at.v(ILba;ZI)I")
    public static int method486(int arg0, class75 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2941(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2808(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method1142(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method1087(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1141(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method2992(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method4829(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method3142(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method2561(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method7802(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2175(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2808(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method1142(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method1087(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1141(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method2992(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method2944(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method3414(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method1138(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method4868(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2175(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method4100(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2887(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method2710(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method3095(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method2769(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method6901(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method3568(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method2105(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method7144(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method105(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3135(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method40(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method5898(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1765(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return Statics.method2595(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method4082(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method5069(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method6787(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method4900(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method2978(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method218(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method810(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method1547(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method1735(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method3874(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method17(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method7207(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method2930(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ev.s(ILba;ZI)I")
    public static int method2941(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field3469 -= 3;
            int var3 = field857[Statics.field3469];
            int var4 = field857[Statics.field3469 + 1];
            int var5 = field857[Statics.field3469 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class310 var6 = class310.method2952(var3);
            if (var6.field3694 == null) {
                var6.field3694 = new class310[var5 + 1];
            }
            if (var6.field3694.length <= var5) {
                class310[] var7 = new class310[var5 + 1];
                for (int var8 = 0; var8 < var6.field3694.length; var8++) {
                    var7[var8] = var6.field3694[var8];
                }
                var6.field3694 = var7;
            }
            if (var5 > 0 && var6.field3694[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class310 var9 = new class310();
            var9.field3657 = var4;
            var9.field3571 = var9.field3701 = var6.field3701;
            var9.field3558 = var5;
            var9.field3551 = true;
            if (var4 == 12) {
                var9.method5694();
                var9.method5705().method5440(new class101(var9));
                var9.method5705().method5439(new class102(var9));
            }
            var6.field3694[var5] = var9;
            if (arg2) {
                Statics.field860 = var9;
            } else {
                Statics.field1092 = var9;
            }
            client.method2361(var6);
            return 1;
        } else if (arg0 == 101) {
            class310 var10 = arg2 ? Statics.field860 : Statics.field1092;
            class310 var11 = class310.method2952(var10.field3701);
            var11.field3694[var10.field3558] = null;
            client.method2361(var11);
            return 1;
        } else if (arg0 == 102) {
            class310 var12 = class310.method2952(field857[--Statics.field3469]);
            var12.field3694 = null;
            client.method2361(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field3469 -= 2;
            int var13 = field857[Statics.field3469];
            int var14 = field857[Statics.field3469 + 1];
            class310 var15 = class310.method2979(var13, var14);
            if (var15 == null || var14 == -1) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = 1;
                if (arg2) {
                    Statics.field860 = var15;
                } else {
                    Statics.field1092 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class310 var16 = class310.method2952(field857[--Statics.field3469]);
            if (var16 == null) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = 1;
                if (arg2) {
                    Statics.field860 = var16;
                } else {
                    Statics.field1092 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("do.z(ILba;ZI)I")
    public static int method2808(int arg0, class75 arg1, boolean arg2) {
        int var3 = -1;
        class310 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field857[--Statics.field3469];
            var4 = class310.method2952(var3);
        } else {
            var4 = arg2 ? Statics.field860 : Statics.field1092;
        }
        if (arg0 == 1000) {
            Statics.field3469 -= 4;
            var4.field3561 = field857[Statics.field3469];
            var4.field3562 = field857[Statics.field3469 + 1];
            var4.field3545 = field857[Statics.field3469 + 2];
            var4.field3695 = field857[Statics.field3469 + 3];
            client.method2361(var4);
            Statics.field427.method1506(var4);
            if (var3 != -1 && var4.field3657 == 0) {
                client.method4899(Statics.field2984[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field3469 -= 4;
            var4.field3563 = field857[Statics.field3469];
            var4.field3564 = field857[Statics.field3469 + 1];
            var4.field3559 = field857[Statics.field3469 + 2];
            var4.field3560 = field857[Statics.field3469 + 3];
            client.method2361(var4);
            Statics.field427.method1506(var4);
            if (var3 != -1 && var4.field3657 == 0) {
                client.method4899(Statics.field2984[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field857[--Statics.field3469] == 1;
            if (var4.field3708 != var5) {
                var4.field3708 = var5;
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3610 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3684 = field857[--Statics.field3469] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.j(ILba;ZI)I")
    public static int method1142(int arg0, class75 arg1, boolean arg2) {
        int var3 = -1;
        class310 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field857[--Statics.field3469];
            var4 = class310.method2952(var3);
        } else {
            var4 = arg2 ? Statics.field860 : Statics.field1092;
        }
        if (arg0 == 1100) {
            Statics.field3469 -= 2;
            int var5 = field857[Statics.field3469];
            int var6 = field857[Statics.field3469 + 1];
            if (var4.field3657 == 12) {
                class308 var7 = var4.method5705();
                if (var7 != null && var7.method5402(var5, var6)) {
                    client.method2361(var4);
                }
            } else {
                var4.field3573 = var5;
                if (var4.field3573 > var4.field3641 - var4.field3567) {
                    var4.field3573 = var4.field3641 - var4.field3567;
                }
                if (var4.field3573 < 0) {
                    var4.field3573 = 0;
                }
                var4.field3574 = var6;
                if (var4.field3574 > var4.field3543 - var4.field3568) {
                    var4.field3574 = var4.field3543 - var4.field3568;
                }
                if (var4.field3574 < 0) {
                    var4.field3574 = 0;
                }
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3577 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3608 = field857[--Statics.field3469] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3546 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3585 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3587 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3590 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3591 = field857[--Statics.field3469] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3596 = 1;
            var4.field3597 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field3469 -= 6;
            var4.field3602 = field857[Statics.field3469];
            var4.field3603 = field857[Statics.field3469 + 1];
            var4.field3604 = field857[Statics.field3469 + 2];
            var4.field3677 = field857[Statics.field3469 + 3];
            var4.field3667 = field857[Statics.field3469 + 4];
            var4.field3592 = field857[Statics.field3469 + 5];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field857[--Statics.field3469];
            if (var4.field3704 != var8) {
                var4.field3704 = var8;
                var4.field3692 = 0;
                var4.field3693 = 0;
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3598 = field857[--Statics.field3469] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field853[--Statics.field114];
            if (!var9.equals(var4.field3614)) {
                var4.field3614 = var9;
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3613 = field857[--Statics.field3469];
            if (var4.field3657 == 12) {
                class308 var10 = var4.method5705();
                if (var10 != null) {
                    var10.method5501();
                }
            }
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field3469 -= 3;
            if (var4.field3657 == 12) {
                class308 var11 = var4.method5705();
                if (var11 != null) {
                    var11.method5538(field857[Statics.field3469], field857[Statics.field3469 + 1]);
                    var11.method5404(field857[Statics.field3469 + 2]);
                }
            } else {
                var4.field3539 = field857[Statics.field3469];
                var4.field3618 = field857[Statics.field3469 + 1];
                var4.field3616 = field857[Statics.field3469 + 2];
            }
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3584 = field857[--Statics.field3469] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3645 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3593 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3594 = field857[--Statics.field3469] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3557 = field857[--Statics.field3469] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field3469 -= 2;
            var4.field3641 = field857[Statics.field3469];
            var4.field3543 = field857[Statics.field3469 + 1];
            client.method2361(var4);
            if (var3 != -1 && var4.field3657 == 0) {
                client.method4899(Statics.field2984[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3814(var4.field3701, var4.field3558);
            client.field697 = var4;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3588 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3578 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3655 = field857[--Statics.field3469];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var12 = field857[--Statics.field3469];
            class486 var13 = (class486) class351.method19(Statics.method4513(), var12);
            if (var13 != null) {
                var4.field3582 = var13;
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var14 = field857[--Statics.field3469] == 1;
            var4.field3607 = var14;
            return 1;
        } else if (arg0 == 1127) {
            boolean var15 = field857[--Statics.field3469] == 1;
            var4.field3611 = var15;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3589 = field853[--Statics.field114];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5681(field853[--Statics.field114], Statics.field2910, client.method239());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field3469 -= 2;
            var4.method5683(field857[Statics.field3469], field857[Statics.field3469 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5684(field853[--Statics.field114], field857[--Statics.field3469]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field3469--;
            class303 var16 = var4.method5696();
            if (var16 != null) {
                var16.field3466 = field857[Statics.field3469];
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field3469--;
            class303 var17 = var4.method5696();
            if (var17 != null) {
                var17.field3471 = field857[Statics.field3469];
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field114--;
            class308 var18 = var4.method5705();
            if (var18 != null) {
                var4.field3703 = field853[Statics.field114];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field3469--;
            class303 var19 = var4.method5696();
            if (var19 != null) {
                var19.field3468 = field857[Statics.field3469];
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field3469--;
            class308 var20 = var4.method5705();
            if (var20 != null && var20.method5399(field857[Statics.field3469])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field3469--;
            class308 var21 = var4.method5705();
            if (var21 != null && var21.method5400(field857[Statics.field3469])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field3469--;
            class308 var22 = var4.method5705();
            if (var22 != null && var22.method5620(field857[Statics.field3469])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var23 = field857[--Statics.field3469] == 1;
            client.field753.method3795();
            class308 var24 = var4.method5705();
            if (var24 != null && var24.method5527(var23)) {
                if (var23) {
                    client.field753.method3794(var4);
                }
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var25 = field857[--Statics.field3469] == 1;
            if (!var25 && client.field753.method3797() == var4) {
                client.field753.method3795();
                client.method2361(var4);
            }
            class308 var26 = var4.method5705();
            if (var26 != null) {
                var26.method5394(var25);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field3469 -= 2;
            class308 var27 = var4.method5705();
            if (var27 != null && var27.method5483(field857[Statics.field3469], field857[Statics.field3469 + 1])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field3469--;
            class308 var28 = var4.method5705();
            if (var28 != null && var28.method5483(field857[Statics.field3469], field857[Statics.field3469])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field3469--;
            class308 var29 = var4.method5705();
            if (var29 != null) {
                var29.method5406(field857[Statics.field3469]);
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field3469--;
            class308 var30 = var4.method5705();
            if (var30 != null) {
                var30.method5405(field857[Statics.field3469]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field3469--;
            class308 var31 = var4.method5705();
            if (var31 != null) {
                var31.method5408(field857[Statics.field3469]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field3469--;
            class308 var32 = var4.method5705();
            if (var32 != null) {
                var32.method5407(field857[Statics.field3469]);
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field3469 -= 2;
            class28 var33 = var4.method5697();
            if (var33 != null) {
                var33.method384(field857[Statics.field3469], field857[Statics.field3469 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field3469 -= 2;
            class28 var34 = var4.method5697();
            if (var34 != null) {
                var34.method410((char) field857[Statics.field3469], field857[Statics.field3469 + 1]);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.i(ILba;ZI)I")
    public static int method1087(int arg0, class75 arg1, boolean arg2) {
        class310 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class310.method2952(field857[--Statics.field3469]);
        } else {
            var3 = arg2 ? Statics.field860 : Statics.field1092;
        }
        client.method2361(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field3469 -= 2;
            int var4 = field857[Statics.field3469];
            int var5 = field857[Statics.field3469 + 1];
            var3.field3690 = var4;
            var3.field3569 = var5;
            class201 var6 = class201.method2583(var4);
            var3.field3604 = var6.field2223;
            var3.field3677 = var6.field2224;
            var3.field3667 = var6.field2252;
            var3.field3602 = var6.field2226;
            var3.field3603 = var6.field2227;
            var3.field3592 = var6.field2254;
            if (arg0 == 1205) {
                var3.field3669 = 0;
            } else if (arg0 == 1212 | var6.field2228 == 1) {
                var3.field3669 = 1;
            } else {
                var3.field3669 = 2;
            }
            if (var3.field3617 > 0) {
                var3.field3592 = var3.field3592 * 32 / var3.field3617;
            } else if (var3.field3563 > 0) {
                var3.field3592 = var3.field3592 * 32 / var3.field3563;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3596 = 2;
            var3.field3597 = field857[--Statics.field3469];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3596 = 3;
            var3.field3597 = Statics.field4508.field1107.method5369();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.n(ILba;ZI)I")
    public static int method1141(int arg0, class75 arg1, boolean arg2) {
        boolean var3 = true;
        class310 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class310.method2952(field857[--Statics.field3469]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field860 : Statics.field1092;
        }
        if (arg0 == 1300) {
            int var5 = field857[--Statics.field3469] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5678(var5, field853[--Statics.field114]);
                return 1;
            } else {
                Statics.field114--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field3469 -= 2;
            int var6 = field857[Statics.field3469];
            int var7 = field857[Statics.field3469 + 1];
            var4.field3639 = class310.method2979(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3642 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3640 = field857[--Statics.field3469];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3706 = field857[--Statics.field3469];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3637 = field853[--Statics.field114];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3623 = field853[--Statics.field114];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3705 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3672 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field3469--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field3469 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field857[Statics.field3469 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field857[Statics.field3469 + var10];
                        var9[var10 / 2] = (byte) field857[Statics.field3469 + var10 + 1];
                    }
                }
            } else {
                Statics.field3469 -= 2;
                var8 = new byte[] { (byte) field857[Statics.field3469] };
                var9 = new byte[] { (byte) field857[Statics.field3469 + 1] };
            }
            int var11 = field857[--Statics.field3469] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method1828(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field3469 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field857[Statics.field3469] };
            byte[] var14 = new byte[] { (byte) field857[Statics.field3469 + 1] };
            method1828(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field3469 -= 3;
            int var15 = field857[Statics.field3469] - 1;
            int var16 = field857[Statics.field3469 + 1];
            int var17 = field857[Statics.field3469 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method4489(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field857[--Statics.field3469];
            int var20 = field857[--Statics.field3469];
            method4489(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field3469--;
            int var21 = field857[Statics.field3469] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method3011(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method3011(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.l(Lkz;I[B[BB)V")
    public static final void method1828(class310 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3633 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3633 = new byte[11][];
            arg0.field3634 = new byte[11][];
            arg0.field3635 = new int[11];
            arg0.field3636 = new int[11];
        }
        arg0.field3633[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3632 = false;
            for (int var4 = 0; var4 < arg0.field3633.length; var4++) {
                if (arg0.field3633[var4] != null) {
                    arg0.field3632 = true;
                    break;
                }
            }
        } else {
            arg0.field3632 = true;
        }
        arg0.field3634[arg1] = arg3;
    }

    @ObfuscatedName("hu.k(Lkz;IIII)V")
    public static final void method4489(class310 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3635 == null) {
            throw new RuntimeException();
        }
        arg0.field3635[arg1] = arg2;
        arg0.field3636[arg1] = arg3;
    }

    @ObfuscatedName("eo.c(Lkz;IB)V")
    public static final void method3011(class310 arg0, int arg1) {
        if (arg0.field3633 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3595 == null) {
            arg0.field3595 = new int[arg0.field3633.length];
        }
        arg0.field3595[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ej.r(ILba;ZI)I")
    public static int method2992(int arg0, class75 arg1, boolean arg2) {
        class310 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class310.method2952(field857[--Statics.field3469]);
        } else {
            var3 = arg2 ? Statics.field860 : Statics.field1092;
        }
        String var4 = field853[--Statics.field114];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field857[--Statics.field3469];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field857[--Statics.field3469];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field853[--Statics.field114];
            } else {
                var7[var8] = Integer.valueOf(field857[--Statics.field3469]);
            }
        }
        int var9 = field857[--Statics.field3469];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3646 = var7;
        } else if (arg0 == 1401) {
            var3.field3649 = var7;
        } else if (arg0 == 1402) {
            var3.field3650 = var7;
        } else if (arg0 == 1403) {
            var3.field3627 = var7;
        } else if (arg0 == 1404) {
            var3.field3652 = var7;
        } else if (arg0 == 1405) {
            var3.field3653 = var7;
        } else if (arg0 == 1406) {
            var3.field3575 = var7;
        } else if (arg0 == 1407) {
            var3.field3600 = var7;
            var3.field3658 = var5;
        } else if (arg0 == 1408) {
            var3.field3663 = var7;
        } else if (arg0 == 1409) {
            var3.field3664 = var7;
        } else if (arg0 == 1410) {
            var3.field3654 = var7;
        } else if (arg0 == 1411) {
            var3.field3647 = var7;
        } else if (arg0 == 1412) {
            var3.field3550 = var7;
        } else if (arg0 == 1414) {
            var3.field3619 = var7;
            var3.field3615 = var5;
        } else if (arg0 == 1415) {
            var3.field3661 = var7;
            var3.field3662 = var5;
        } else if (arg0 == 1416) {
            var3.field3638 = var7;
        } else if (arg0 == 1417) {
            var3.field3666 = var7;
        } else if (arg0 == 1418) {
            var3.field3656 = var7;
        } else if (arg0 == 1419) {
            var3.field3668 = var7;
        } else if (arg0 == 1420) {
            var3.field3671 = var7;
        } else if (arg0 == 1421) {
            var3.field3643 = var7;
        } else if (arg0 == 1422) {
            var3.field3581 = var7;
        } else if (arg0 == 1423) {
            var3.field3685 = var7;
        } else if (arg0 == 1424) {
            var3.field3651 = var7;
        } else if (arg0 == 1425) {
            var3.field3679 = var7;
        } else if (arg0 == 1426) {
            var3.field3680 = var7;
        } else if (arg0 == 1427) {
            var3.field3678 = var7;
        } else if (arg0 == 1428) {
            var3.field3673 = var7;
        } else if (arg0 == 1429) {
            var3.field3674 = var7;
        } else if (arg0 == 1430) {
            var3.field3605 = var7;
        } else if (arg0 == 1431) {
            var3.field3670 = var7;
        } else if (arg0 == 1434) {
            var3.field3681 = var7;
        } else if (arg0 == 1435) {
            var3.field3665 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class306 var10 = var3.method5698();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3481 = var7;
                } else if (arg0 == 1437) {
                    var10.field3480 = var7;
                } else if (arg0 == 1438) {
                    var10.field3483 = var7;
                } else if (arg0 == 1439) {
                    var10.field3482 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3644 = true;
        return 1;
    }

    @ObfuscatedName("ic.b(ILba;ZB)I")
    public static int method4829(int arg0, class75 arg1, boolean arg2) {
        class310 var3 = arg2 ? Statics.field860 : Statics.field1092;
        if (arg0 == 1500) {
            field857[++Statics.field3469 - 1] = var3.field3565;
            return 1;
        } else if (arg0 == 1501) {
            field857[++Statics.field3469 - 1] = var3.field3566;
            return 1;
        } else if (arg0 == 1502) {
            field857[++Statics.field3469 - 1] = var3.field3567;
            return 1;
        } else if (arg0 == 1503) {
            field857[++Statics.field3469 - 1] = var3.field3568;
            return 1;
        } else if (arg0 == 1504) {
            field857[++Statics.field3469 - 1] = var3.field3708 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field857[++Statics.field3469 - 1] = var3.field3571;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fu.m(ILba;ZI)I")
    public static int method3142(int arg0, class75 arg1, boolean arg2) {
        class310 var3 = arg2 ? Statics.field860 : Statics.field1092;
        if (arg0 == 1600) {
            field857[++Statics.field3469 - 1] = var3.field3573;
            return 1;
        } else if (arg0 == 1601) {
            field857[++Statics.field3469 - 1] = var3.field3574;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3657 == 12) {
                class308 var4 = var3.method5705();
                if (var4 != null) {
                    field853[++Statics.field114 - 1] = var4.method5441().method6513();
                    return 1;
                }
            }
            field853[++Statics.field114 - 1] = var3.field3614;
            return 1;
        } else if (arg0 == 1603) {
            field857[++Statics.field3469 - 1] = var3.field3641;
            return 1;
        } else if (arg0 == 1604) {
            field857[++Statics.field3469 - 1] = var3.field3543;
            return 1;
        } else if (arg0 == 1605) {
            field857[++Statics.field3469 - 1] = var3.field3592;
            return 1;
        } else if (arg0 == 1606) {
            field857[++Statics.field3469 - 1] = var3.field3604;
            return 1;
        } else if (arg0 == 1607) {
            field857[++Statics.field3469 - 1] = var3.field3667;
            return 1;
        } else if (arg0 == 1608) {
            field857[++Statics.field3469 - 1] = var3.field3677;
            return 1;
        } else if (arg0 == 1609) {
            field857[++Statics.field3469 - 1] = var3.field3546;
            return 1;
        } else if (arg0 == 1610) {
            field857[++Statics.field3469 - 1] = var3.field3655;
            return 1;
        } else if (arg0 == 1611) {
            field857[++Statics.field3469 - 1] = var3.field3577;
            return 1;
        } else if (arg0 == 1612) {
            field857[++Statics.field3469 - 1] = var3.field3578;
            return 1;
        } else if (arg0 == 1613) {
            field857[++Statics.field3469 - 1] = var3.field3582.method46();
            return 1;
        } else if (arg0 == 1614) {
            field857[++Statics.field3469 - 1] = var3.field3611 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class303 var5 = var3.method5696();
                field857[++Statics.field3469 - 1] = var5 == null ? 0 : var5.field3466;
            }
            if (arg0 == 1618) {
                class303 var6 = var3.method5696();
                field857[++Statics.field3469 - 1] = var6 == null ? 0 : var6.field3471;
                return 1;
            } else if (arg0 == 1619) {
                class308 var7 = var3.method5705();
                field853[++Statics.field114 - 1] = var7 == null ? "" : var7.method5598().method6513();
                return 1;
            } else if (arg0 == 1620) {
                class303 var8 = var3.method5696();
                field857[++Statics.field3469 - 1] = var8 == null ? 0 : var8.field3468;
                return 1;
            } else if (arg0 == 1621) {
                class308 var9 = var3.method5705();
                field857[++Statics.field3469 - 1] = var9 == null ? 0 : var9.method5420();
                return 1;
            } else if (arg0 == 1622) {
                class308 var10 = var3.method5705();
                field857[++Statics.field3469 - 1] = var10 == null ? 0 : var10.method5453();
                return 1;
            } else if (arg0 == 1623) {
                class308 var11 = var3.method5705();
                field857[++Statics.field3469 - 1] = var11 == null ? 0 : var11.method5454();
                return 1;
            } else if (arg0 == 1624) {
                class308 var12 = var3.method5705();
                field857[++Statics.field3469 - 1] = var12 != null && var12.method5444() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class308 var13 = var3.method5705();
                field857[++Statics.field3469 - 1] = var13 != null && var13.method5424() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class308 var14 = var3.method5705();
                field853[++Statics.field114 - 1] = var14 == null ? "" : var14.method5443().method6736();
                return 1;
            } else if (arg0 == 1627) {
                class308 var15 = var3.method5705();
                int var16 = var15 == null ? 0 : var15.method5448();
                int var17 = var15 == null ? 0 : var15.method5615();
                field857[++Statics.field3469 - 1] = Math.min(var16, var17);
                field857[++Statics.field3469 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class308 var18 = var3.method5705();
                field857[++Statics.field3469 - 1] = var18 == null ? 0 : var18.method5615();
                return 1;
            } else if (arg0 == 1629) {
                class308 var19 = var3.method5705();
                field857[++Statics.field3469 - 1] = var19 == null ? 0 : var19.method5455();
                return 1;
            } else if (arg0 == 1630) {
                class308 var20 = var3.method5705();
                field857[++Statics.field3469 - 1] = var20 == null ? 0 : var20.method5418();
                return 1;
            } else if (arg0 == 1631) {
                class308 var21 = var3.method5705();
                field857[++Statics.field3469 - 1] = var21 == null ? 0 : var21.method5528();
                return 1;
            } else if (arg0 == 1632) {
                class308 var22 = var3.method5705();
                field857[++Statics.field3469 - 1] = var22 == null ? 0 : var22.method5457();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method5697();
                field857[Statics.field3469 - 1] = var23 == null ? 0 : var23.method386(field857[Statics.field3469 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method5697();
                field857[Statics.field3469 - 1] = var24 == null ? 0 : var24.method387((char) field857[Statics.field3469 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("cm.t(ILba;ZB)I")
    public static int method2561(int arg0, class75 arg1, boolean arg2) {
        class310 var3 = arg2 ? Statics.field860 : Statics.field1092;
        if (arg0 == 1700) {
            field857[++Statics.field3469 - 1] = var3.field3690;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3690 == -1) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = var3.field3569;
            }
            return 1;
        } else if (arg0 == 1702) {
            field857[++Statics.field3469 - 1] = var3.field3558;
            return 1;
        } else if (arg0 == 1707) {
            field857[++Statics.field3469 - 1] = var3.method5821() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method3250(var3);
        } else if (arg0 == 1709) {
            return method5658(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fw.h(Lkz;I)I")
    public static int method3250(class310 arg0) {
        if (arg0.field3657 == 11) {
            String var1 = field853[--Statics.field114];
            field857[++Statics.field3469 - 1] = arg0.method5686(var1);
            return 1;
        } else {
            Statics.field114--;
            field857[++Statics.field3469 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("kh.p(Lkz;I)I")
    public static int method5658(class310 arg0) {
        if (arg0.field3657 == 11) {
            String var1 = field853[--Statics.field114];
            field853[++Statics.field114 - 1] = arg0.method5755(var1);
            return 1;
        } else {
            field853[Statics.field114 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("qb.o(ILba;ZI)I")
    public static int method7802(int arg0, class75 arg1, boolean arg2) {
        class310 var3 = arg2 ? Statics.field860 : Statics.field1092;
        if (arg0 == 1800) {
            field857[++Statics.field3469 - 1] = class311.method1993(client.method3252(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field857[--Statics.field3469];
            int var5 = var4 - 1;
            if (var3.field3705 == null || var5 >= var3.field3705.length || var3.field3705[var5] == null) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = var3.field3705[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3637 == null) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = var3.field3637;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.u(ILba;ZI)I")
    public static int method2175(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field862 >= 10) {
                throw new RuntimeException();
            }
            class310 var10;
            if (arg0 >= 2000) {
                var10 = class310.method2952(field857[--Statics.field3469]);
            } else {
                var10 = arg2 ? Statics.field860 : Statics.field1092;
            }
            if (var10.field3678 == null) {
                return 0;
            }
            class84 var11 = new class84();
            var11.field1073 = var10;
            var11.field1062 = var10.field3678;
            var11.field1072 = field862 + 1;
            client.field719.method6236(var11);
            return 1;
        } else if (arg0 == 1928) {
            class310 var3 = arg2 ? Statics.field860 : Statics.field1092;
            int var4 = field857[--Statics.field3469];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class98 var5 = new class98(var4, var3.field3701, var3.field3558, var3.field3690);
            field865.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field3469 -= 3;
            int var6 = field857[Statics.field3469];
            int var7 = field857[Statics.field3469 + 1];
            int var8 = field857[Statics.field3469 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class98 var9 = new class98(var8, var6, var7, class310.method2952(var6).field3690);
            field865.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("er.x(ILba;ZI)I")
    public static int method2944(int arg0, class75 arg1, boolean arg2) {
        class310 var3 = class310.method2952(field857[--Statics.field3469]);
        if (arg0 == 2500) {
            field857[++Statics.field3469 - 1] = var3.field3565;
            return 1;
        } else if (arg0 == 2501) {
            field857[++Statics.field3469 - 1] = var3.field3566;
            return 1;
        } else if (arg0 == 2502) {
            field857[++Statics.field3469 - 1] = var3.field3567;
            return 1;
        } else if (arg0 == 2503) {
            field857[++Statics.field3469 - 1] = var3.field3568;
            return 1;
        } else if (arg0 == 2504) {
            field857[++Statics.field3469 - 1] = var3.field3708 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field857[++Statics.field3469 - 1] = var3.field3571;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gq.a(ILba;ZI)I")
    public static int method3414(int arg0, class75 arg1, boolean arg2) {
        class310 var3 = class310.method2952(field857[--Statics.field3469]);
        if (arg0 == 2600) {
            field857[++Statics.field3469 - 1] = var3.field3573;
            return 1;
        } else if (arg0 == 2601) {
            field857[++Statics.field3469 - 1] = var3.field3574;
            return 1;
        } else if (arg0 == 2602) {
            field853[++Statics.field114 - 1] = var3.field3614;
            return 1;
        } else if (arg0 == 2603) {
            field857[++Statics.field3469 - 1] = var3.field3641;
            return 1;
        } else if (arg0 == 2604) {
            field857[++Statics.field3469 - 1] = var3.field3543;
            return 1;
        } else if (arg0 == 2605) {
            field857[++Statics.field3469 - 1] = var3.field3592;
            return 1;
        } else if (arg0 == 2606) {
            field857[++Statics.field3469 - 1] = var3.field3604;
            return 1;
        } else if (arg0 == 2607) {
            field857[++Statics.field3469 - 1] = var3.field3667;
            return 1;
        } else if (arg0 == 2608) {
            field857[++Statics.field3469 - 1] = var3.field3677;
            return 1;
        } else if (arg0 == 2609) {
            field857[++Statics.field3469 - 1] = var3.field3546;
            return 1;
        } else if (arg0 == 2610) {
            field857[++Statics.field3469 - 1] = var3.field3655;
            return 1;
        } else if (arg0 == 2611) {
            field857[++Statics.field3469 - 1] = var3.field3577;
            return 1;
        } else if (arg0 == 2612) {
            field857[++Statics.field3469 - 1] = var3.field3578;
            return 1;
        } else if (arg0 == 2613) {
            field857[++Statics.field3469 - 1] = var3.field3582.method46();
            return 1;
        } else if (arg0 == 2614) {
            field857[++Statics.field3469 - 1] = var3.field3611 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class303 var4 = var3.method5696();
                field857[++Statics.field3469 - 1] = var4 == null ? 0 : var4.field3466;
            }
            if (arg0 == 2618) {
                class303 var5 = var3.method5696();
                field857[++Statics.field3469 - 1] = var5 == null ? 0 : var5.field3471;
                return 1;
            } else if (arg0 == 2619) {
                class308 var6 = var3.method5705();
                field853[++Statics.field114 - 1] = var6 == null ? "" : var6.method5598().method6513();
                return 1;
            } else if (arg0 == 2620) {
                class303 var7 = var3.method5696();
                field857[++Statics.field3469 - 1] = var7 == null ? 0 : var7.field3468;
                return 1;
            } else if (arg0 == 2621) {
                class308 var8 = var3.method5705();
                field857[++Statics.field3469 - 1] = var8 == null ? 0 : var8.method5420();
                return 1;
            } else if (arg0 == 2622) {
                class308 var9 = var3.method5705();
                field857[++Statics.field3469 - 1] = var9 == null ? 0 : var9.method5453();
                return 1;
            } else if (arg0 == 2623) {
                class308 var10 = var3.method5705();
                field857[++Statics.field3469 - 1] = var10 == null ? 0 : var10.method5454();
                return 1;
            } else if (arg0 == 2624) {
                class308 var11 = var3.method5705();
                field857[++Statics.field3469 - 1] = var11 != null && var11.method5444() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class308 var12 = var3.method5705();
                field857[++Statics.field3469 - 1] = var12 != null && var12.method5424() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class308 var13 = var3.method5705();
                field853[++Statics.field114 - 1] = var13 == null ? "" : var13.method5443().method6736();
                return 1;
            } else if (arg0 == 2627) {
                class308 var14 = var3.method5705();
                int var15 = var14 == null ? 0 : var14.method5448();
                int var16 = var14 == null ? 0 : var14.method5615();
                field857[++Statics.field3469 - 1] = Math.min(var15, var16);
                field857[++Statics.field3469 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class308 var17 = var3.method5705();
                field857[++Statics.field3469 - 1] = var17 == null ? 0 : var17.method5615();
                return 1;
            } else if (arg0 == 2629) {
                class308 var18 = var3.method5705();
                field857[++Statics.field3469 - 1] = var18 == null ? 0 : var18.method5455();
                return 1;
            } else if (arg0 == 2630) {
                class308 var19 = var3.method5705();
                field857[++Statics.field3469 - 1] = var19 == null ? 0 : var19.method5418();
                return 1;
            } else if (arg0 == 2631) {
                class308 var20 = var3.method5705();
                field857[++Statics.field3469 - 1] = var20 == null ? 0 : var20.method5528();
                return 1;
            } else if (arg0 == 2632) {
                class308 var21 = var3.method5705();
                field857[++Statics.field3469 - 1] = var21 == null ? 0 : var21.method5457();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method5697();
                field857[Statics.field3469 - 1] = var22 == null ? 0 : var22.method386(field857[Statics.field3469 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method5697();
                field857[Statics.field3469 - 1] = var23 == null ? 0 : var23.method387((char) field857[Statics.field3469 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("bi.q(ILba;ZI)I")
    public static int method1138(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class310 var3 = class310.method2952(field857[--Statics.field3469]);
            field857[++Statics.field3469 - 1] = var3.field3690;
            return 1;
        } else if (arg0 == 2701) {
            class310 var4 = class310.method2952(field857[--Statics.field3469]);
            if (var4.field3690 == -1) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = var4.field3569;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field857[--Statics.field3469];
            class83 var6 = (class83) client.field676.method7706((long) var5);
            if (var6 == null) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field857[++Statics.field3469 - 1] = client.field675;
            return 1;
        } else if (arg0 == 2707) {
            class310 var7 = class310.method2952(field857[--Statics.field3469]);
            field857[++Statics.field3469 - 1] = var7.method5821() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class310 var8 = class310.method2952(field857[--Statics.field3469]);
            return method3250(var8);
        } else if (arg0 == 2709) {
            class310 var9 = class310.method2952(field857[--Statics.field3469]);
            return method5658(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ib.d(ILba;ZB)I")
    public static int method4868(int arg0, class75 arg1, boolean arg2) {
        class310 var3 = class310.method2952(field857[--Statics.field3469]);
        if (arg0 == 2800) {
            field857[++Statics.field3469 - 1] = class311.method1993(client.method3252(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field857[--Statics.field3469];
            int var5 = var4 - 1;
            if (var3.field3705 == null || var5 >= var3.field3705.length || var3.field3705[var5] == null) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = var3.field3705[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3637 == null) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = var3.field3637;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hk.e(ILba;ZI)I")
    public static int method4100(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field853[--Statics.field114];
            class106.method5047(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field3469 -= 2;
            client.method2305(Statics.field4508, field857[Statics.field3469], field857[Statics.field3469 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field867) {
                field852 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field853[--Statics.field114];
            int var5 = 0;
            if (class365.method3003(var4)) {
                var5 = class365.method4987(var4);
            }
            class282 var6 = class282.method4287(class280.field3149, client.field689.field1390);
            var6.field3187.method8048(var5);
            client.field689.method2694(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field853[--Statics.field114];
            class282 var8 = class282.method4287(class280.field3116, client.field689.field1390);
            var8.field3187.method7947(var7.length() + 1);
            var8.field3187.method7954(var7);
            client.field689.method2694(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field853[--Statics.field114];
            class282 var10 = class282.method4287(class280.field3064, client.field689.field1390);
            var10.field3187.method7947(var9.length() + 1);
            var10.field3187.method7954(var9);
            client.field689.method2694(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field857[--Statics.field3469];
            String var12 = field853[--Statics.field114];
            client.method4860(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field3469 -= 3;
            int var13 = field857[Statics.field3469];
            int var14 = field857[Statics.field3469 + 1];
            int var15 = field857[Statics.field3469 + 2];
            class310 var16 = class310.method2952(var15);
            client.method2807(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field3469 -= 2;
            int var17 = field857[Statics.field3469];
            int var18 = field857[Statics.field3469 + 1];
            class310 var19 = arg2 ? Statics.field860 : Statics.field1092;
            client.method2807(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field4559 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field857[++Statics.field3469 - 1] = Statics.field1404.method2456() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1404.method2435(field857[--Statics.field3469] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field853[--Statics.field114];
            boolean var21 = field857[--Statics.field3469] == 1;
            class32.method2581(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field857[--Statics.field3469];
            class282 var23 = class282.method4287(class280.field3148, client.field689.field1390);
            var23.field3187.method7950(var22);
            client.field689.method2694(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field857[--Statics.field3469];
            Statics.field114 -= 2;
            String var25 = field853[Statics.field114];
            String var26 = field853[Statics.field114 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class282 var27 = class282.method4287(class280.field3131, client.field689.field1390);
                var27.field3187.method7950(1 + class474.method2557(var25) + class474.method2557(var26));
                var27.field3187.method7954(var26);
                var27.field3187.method7954(var25);
                var27.field3187.method7993(var24);
                client.field689.method2694(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field581 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field663 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field522 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field857[--Statics.field3469] == 1) {
                client.field634 |= 0x1;
            } else {
                client.field634 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field857[--Statics.field3469] == 1) {
                client.field634 |= 0x2;
            } else {
                client.field634 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field857[--Statics.field3469] == 1) {
                client.field634 |= 0x4;
            } else {
                client.field634 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field857[--Statics.field3469] == 1) {
                client.field634 |= 0x8;
            } else {
                client.field634 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field634 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field588 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field628 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method4514(field857[--Statics.field3469] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field857[++Statics.field3469 - 1] = client.method6220() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field3469 -= 2;
            client.field593 = field857[Statics.field3469];
            client.field594 = field857[Statics.field3469 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field3469 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field3469--;
            return 1;
        } else if (arg0 == 3132) {
            field857[++Statics.field3469 - 1] = Statics.field220;
            field857[++Statics.field3469 - 1] = Statics.field1559;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field3469--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field3469 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field799 = 3;
            client.field678 = field857[--Statics.field3469];
            return 1;
        } else if (arg0 == 3137) {
            client.field799 = 2;
            client.field678 = field857[--Statics.field3469];
            return 1;
        } else if (arg0 == 3138) {
            client.field799 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field799 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field799 = 3;
            client.field678 = arg2 ? Statics.field860.field3701 : Statics.field1092.field3701;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field857[--Statics.field3469] == 1;
            Statics.field1404.method2367(var28);
            return 1;
        } else if (arg0 == 3142) {
            field857[++Statics.field3469 - 1] = Statics.field1404.method2368() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field857[--Statics.field3469] == 1;
            client.field549 = var29;
            if (!var29) {
                Statics.field1404.method2384("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field857[++Statics.field3469 - 1] = client.field549 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field857[--Statics.field3469] == 1;
            Statics.field1404.method2447(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field857[++Statics.field3469 - 1] = Statics.field1404.method2454() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field857[++Statics.field3469 - 1] = class72.field914;
            return 1;
        } else if (arg0 == 3154) {
            field857[++Statics.field3469 - 1] = client.method2837();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field114--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field3469 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field3469--;
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field3469--;
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field114--;
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field3469--;
            field853[++Statics.field114 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field3469--;
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field3469 -= 2;
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field3469 -= 2;
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field3469 -= 2;
            field853[++Statics.field114 - 1] = "";
            field853[++Statics.field114 - 1] = "";
            field853[++Statics.field114 - 1] = "";
            field853[++Statics.field114 - 1] = "";
            field853[++Statics.field114 - 1] = "";
            field853[++Statics.field114 - 1] = "";
            field853[++Statics.field114 - 1] = "";
            field853[++Statics.field114 - 1] = "";
            field853[++Statics.field114 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field3469--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field3469--;
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field3469--;
            return 1;
        } else if (arg0 == 3175) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field114--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field114--;
            return 1;
        } else if (arg0 == 3181) {
            client.method2347(field857[--Statics.field3469]);
            return 1;
        } else if (arg0 == 3182) {
            field857[++Statics.field3469 - 1] = client.method7836();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field857[--Statics.field3469];
            client.method5968(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dc.g(ILba;ZI)I")
    public static int method2887(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field3469 -= 3;
            client.method5038(field857[Statics.field3469], field857[Statics.field3469 + 1], field857[Statics.field3469 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method5310(field857[--Statics.field3469]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field3469 -= 2;
            client.method2219(field857[Statics.field3469], field857[Statics.field3469 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class87 var15 = class87.field1096;
            class86 var16 = class86.field1090;
            int var17 = field857[--Statics.field3469];
            if (arg0 == 3212) {
                int var18 = field857[--Statics.field3469];
                var15 = (class87) class351.method19(class87.method5056(), var18);
                if (var15 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var18));
                }
            }
            if (arg0 == 3213) {
                int var19 = field857[--Statics.field3469];
                var16 = (class86) class351.method19(class86.method2981(), var19);
                if (var16 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var19));
                }
            }
            if (arg0 == 3209) {
                int var20 = field857[--Statics.field3469];
                var15 = (class87) class351.method19(class87.method5056(), var20);
                if (var15 == null) {
                    var16 = (class86) class351.method19(class86.method2981(), var20);
                    if (var16 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var20));
                    }
                }
            } else if (arg0 == 3181) {
                var15 = class87.field1103;
            } else if (arg0 == 3203) {
                var16 = class86.field1085;
            } else if (arg0 == 3205) {
                var16 = class86.field1093;
            } else if (arg0 == 3207) {
                var16 = class86.field1087;
            }
            if (class86.field1090 == var16) {
                switch(var15.field1104) {
                    case 1:
                        Statics.field1404.method2367(var17 == 1);
                        break;
                    case 2:
                        Statics.field1404.method2447(var17 == 1);
                        break;
                    case 3:
                        Statics.field1404.method2369(var17 == 1);
                        break;
                    case 4:
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        Statics.field1404.method2374(var17);
                        break;
                    case 5:
                        client.method2347(var17);
                        break;
                    default:
                        String var21 = String.format("Unkown device option: %s.", var15.toString());
                        throw new RuntimeException(var21);
                }
            } else {
                switch(var16.field1088) {
                    case 1:
                        Statics.field1404.method2435(var17 == 1);
                        break;
                    case 2:
                        int var27 = Math.min(Math.max(var17, 0), 100);
                        int var28 = Math.round((float) (var27 * 255) / 100.0F);
                        client.method2259(var28);
                        break;
                    case 3:
                        int var25 = Math.min(Math.max(var17, 0), 100);
                        int var26 = Math.round((float) (var25 * 127) / 100.0F);
                        client.method3808(var26);
                        break;
                    case 4:
                        int var23 = Math.min(Math.max(var17, 0), 100);
                        int var24 = Math.round((float) (var23 * 127) / 100.0F);
                        client.method2552(var24);
                        break;
                    default:
                        String var22 = String.format("Unkown game option: %s.", var16.toString());
                        throw new RuntimeException(var22);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class87 var3 = class87.field1096;
            class86 var4 = class86.field1090;
            boolean var5 = false;
            if (arg0 == 3214) {
                int var6 = field857[--Statics.field3469];
                var3 = (class87) class351.method19(class87.method5056(), var6);
                if (var3 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                }
            }
            if (arg0 == 3215) {
                int var7 = field857[--Statics.field3469];
                var4 = (class86) class351.method19(class86.method2981(), var7);
                if (var4 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                }
            }
            if (arg0 == 3210) {
                int var8 = field857[--Statics.field3469];
                var3 = (class87) class351.method19(class87.method5056(), var8);
                if (var3 == null) {
                    var4 = (class86) class351.method19(class86.method2981(), var8);
                    if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var8));
                    }
                }
            } else if (arg0 == 3182) {
                var3 = class87.field1103;
            } else if (arg0 == 3204) {
                var4 = class86.field1085;
            } else if (arg0 == 3206) {
                var4 = class86.field1093;
            } else if (arg0 == 3208) {
                var4 = class86.field1087;
            }
            int var10;
            if (class86.field1090 == var4) {
                switch(var3.field1104) {
                    case 1:
                        var10 = Statics.field1404.method2368() ? 1 : 0;
                        break;
                    case 2:
                        var10 = Statics.field1404.method2454() ? 1 : 0;
                        break;
                    case 3:
                        var10 = Statics.field1404.method2373() ? 1 : 0;
                        break;
                    case 4:
                        var10 = Statics.field1404.method2375();
                        break;
                    case 5:
                        var10 = client.method7836();
                        break;
                    default:
                        String var9 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var9);
                }
            } else {
                switch(var4.field1088) {
                    case 1:
                        var10 = Statics.field1404.method2456() ? 1 : 0;
                        break;
                    case 2:
                        int var14 = Statics.field1404.method2379();
                        var10 = Math.round((float) (var14 * 100) / 255.0F);
                        break;
                    case 3:
                        int var13 = Statics.field1404.method2381();
                        var10 = Math.round((float) (var13 * 100) / 127.0F);
                        break;
                    case 4:
                        int var12 = Statics.field1404.method2383();
                        var10 = Math.round((float) (var12 * 100) / 127.0F);
                        break;
                    default:
                        String var11 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var11);
                }
            }
            field857[++Statics.field3469 - 1] = var10;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("db.y(ILba;ZB)I")
    public static int method2710(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field857[++Statics.field3469 - 1] = client.field511;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field3469 -= 2;
            int var3 = field857[Statics.field3469];
            int var4 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = class81.method44(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field3469 -= 2;
            int var5 = field857[Statics.field3469];
            int var6 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = class81.method7213(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field3469 -= 2;
            int var7 = field857[Statics.field3469];
            int var8 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = class81.method5050(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class181.method4584(var9).field1923;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field646[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field712[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field648[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1370;
            int var14 = (Statics.field4508.field1204 >> 7) + Statics.field2118;
            int var15 = (Statics.field4508.field1161 >> 7) + Statics.field565;
            field857[++Statics.field3469 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field857[++Statics.field3469 - 1] = client.field500 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field3469 -= 2;
            int var19 = field857[Statics.field3469] + 32768;
            int var20 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = class81.method44(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field3469 -= 2;
            int var21 = field857[Statics.field3469] + 32768;
            int var22 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = class81.method7213(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field3469 -= 2;
            int var23 = field857[Statics.field3469] + 32768;
            int var24 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = class81.method5050(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field684 >= 2) {
                field857[++Statics.field3469 - 1] = client.field684;
            } else {
                field857[++Statics.field3469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field857[++Statics.field3469 - 1] = client.field677;
            return 1;
        } else if (arg0 == 3318) {
            field857[++Statics.field3469 - 1] = client.field601;
            return 1;
        } else if (arg0 == 3321) {
            field857[++Statics.field3469 - 1] = client.field497 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field857[++Statics.field3469 - 1] = client.field717;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field611) {
                field857[++Statics.field3469 - 1] = 1;
            } else {
                field857[++Statics.field3469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field857[++Statics.field3469 - 1] = client.field498;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field3469 -= 4;
            int var25 = field857[Statics.field3469];
            int var26 = field857[Statics.field3469 + 1];
            int var27 = field857[Statics.field3469 + 2];
            int var28 = field857[Statics.field3469 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field857[++Statics.field3469 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field857[++Statics.field3469 - 1] = client.field564;
            return 1;
        } else if (arg0 == 3327) {
            field857[++Statics.field3469 - 1] = client.field514;
            return 1;
        } else if (arg0 == 3331) {
            field857[++Statics.field3469 - 1] = client.field497;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("et.af(ILba;ZI)I")
    public static int method3095(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field3469 -= 2;
            int var3 = field857[Statics.field3469];
            int var4 = field857[Statics.field3469 + 1];
            class188 var5 = class188.method2810(var3);
            if (var5.field2006 != 's') {
            }
            for (int var6 = 0; var6 < var5.field2004; var6++) {
                if (var5.field2005[var6] == var4) {
                    field853[++Statics.field114 - 1] = var5.field2007[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field853[++Statics.field114 - 1] = var5.field2002;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field3469 -= 4;
            int var7 = field857[Statics.field3469];
            int var8 = field857[Statics.field3469 + 1];
            int var9 = field857[Statics.field3469 + 2];
            int var10 = field857[Statics.field3469 + 3];
            class188 var11 = class188.method2810(var9);
            if (var11.field2000 != var7 || var11.field2006 != var8) {
                if (var8 == 115) {
                    field853[++Statics.field114 - 1] = class330.field3846;
                } else {
                    field857[++Statics.field3469 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field2004; var12++) {
                if (var11.field2005[var12] == var10) {
                    if (var8 == 115) {
                        field853[++Statics.field114 - 1] = var11.field2007[var12];
                    } else {
                        field857[++Statics.field3469 - 1] = var11.field2001[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field853[++Statics.field114 - 1] = var11.field2002;
                } else {
                    field857[++Statics.field3469 - 1] = var11.field2003;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field857[--Statics.field3469];
            class188 var14 = class188.method2810(var13);
            field857[++Statics.field3469 - 1] = var14.method3407();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dm.aa(ILba;ZI)I")
    public static int method2769(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field703.method3820(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field703.method3819(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field703.method3824(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oq.ai(ILba;ZI)I")
    public static int method6901(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1944.field825 == 0) {
                field857[++Statics.field3469 - 1] = -2;
            } else if (Statics.field1944.field825 == 1) {
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = Statics.field1944.field829.method7052();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field857[--Statics.field3469];
            if (Statics.field1944.method1817() && var3 >= 0 && var3 < Statics.field1944.field829.method7052()) {
                class398 var4 = (class398) Statics.field1944.field829.method7069(var3);
                field853[++Statics.field114 - 1] = var4.method7025();
                field853[++Statics.field114 - 1] = var4.method7031();
            } else {
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field857[--Statics.field3469];
            if (Statics.field1944.method1817() && var5 >= 0 && var5 < Statics.field1944.field829.method7052()) {
                field857[++Statics.field3469 - 1] = ((class405) Statics.field1944.field829.method7069(var5)).field4577;
            } else {
                field857[++Statics.field3469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field857[--Statics.field3469];
            if (Statics.field1944.method1817() && var6 >= 0 && var6 < Statics.field1944.field829.method7052()) {
                field857[++Statics.field3469 - 1] = ((class405) Statics.field1944.field829.method7069(var6)).field4576;
            } else {
                field857[++Statics.field3469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field853[--Statics.field114];
            int var8 = field857[--Statics.field3469];
            class65.method6836(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field853[--Statics.field114];
            Statics.field1944.method1751(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field853[--Statics.field114];
            Statics.field1944.method1755(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field853[--Statics.field114];
            Statics.field1944.method1811(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field853[--Statics.field114];
            Statics.field1944.method1756(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field853[--Statics.field114];
            String var14 = client.method43(var13);
            field857[++Statics.field3469 - 1] = Statics.field1944.method1749(new class497(var14, Statics.field3020), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field4903 == null) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = Statics.field4903.field4544;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field4903 == null) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = Statics.field4903.method7052();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field857[--Statics.field3469];
            if (Statics.field4903 == null || var15 >= Statics.field4903.method7052()) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = Statics.field4903.method7069(var15).method7024().method8556();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field857[--Statics.field3469];
            if (Statics.field4903 == null || var16 >= Statics.field4903.method7052()) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = ((class405) Statics.field4903.method7069(var16)).method7136();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field857[--Statics.field3469];
            if (Statics.field4903 == null || var17 >= Statics.field4903.method7052()) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = ((class405) Statics.field4903.method7069(var17)).field4576;
            }
            return 1;
        } else if (arg0 == 3616) {
            field857[++Statics.field3469 - 1] = Statics.field4903 == null ? 0 : Statics.field4903.field4548;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field853[--Statics.field114];
            client.method3137(var18);
            return 1;
        } else if (arg0 == 3618) {
            field857[++Statics.field3469 - 1] = Statics.field4903 == null ? 0 : Statics.field4903.field4549;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field853[--Statics.field114];
            client.method3071(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method6168();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1944.method1817()) {
                field857[++Statics.field3469 - 1] = Statics.field1944.field826.method7052();
            } else {
                field857[++Statics.field3469 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field857[--Statics.field3469];
            if (Statics.field1944.method1817() && var20 >= 0 && var20 < Statics.field1944.field826.method7052()) {
                class404 var21 = (class404) Statics.field1944.field826.method7069(var20);
                field853[++Statics.field114 - 1] = var21.method7025();
                field853[++Statics.field114 - 1] = var21.method7031();
            } else {
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field853[--Statics.field114];
            String var23 = client.method43(var22);
            field857[++Statics.field3469 - 1] = Statics.field1944.method1750(new class497(var23, Statics.field3020)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field857[--Statics.field3469];
            if (Statics.field4903 == null || var24 >= Statics.field4903.method7052() || !Statics.field4903.method7069(var24).method7024().equals(Statics.field4508.field1115)) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field4903 == null || Statics.field4903.field4547 == null) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = Statics.field4903.field4547;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field857[--Statics.field3469];
            if (Statics.field4903 == null || var25 >= Statics.field4903.method7052() || !((class400) Statics.field4903.method7069(var25)).method7020()) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field857[--Statics.field3469];
            if (Statics.field4903 == null || var26 >= Statics.field4903.method7052() || !((class400) Statics.field4903.method7069(var26)).method7007()) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1944.field829.method7124();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class480(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class481(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class115(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class111(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class114(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class119(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class113(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class112(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class116(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class117(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1944.field829.method7104();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1944.field826.method7124();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field857[--Statics.field3469] == 1;
            Statics.field1944.field826.method7070(new class480(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field857[--Statics.field3469] == 1;
            Statics.field1944.field826.method7070(new class481(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1944.field826.method7104();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field4903 != null) {
                Statics.field4903.method7124();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class480(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class481(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class115(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class111(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class114(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class119(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class113(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class112(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class116(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class117(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field4903 != null) {
                Statics.field4903.method7104();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field857[--Statics.field3469] == 1;
            Statics.field1944.field829.method7070(new class118(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field857[--Statics.field3469] == 1;
            if (Statics.field4903 != null) {
                Statics.field4903.method7070(new class118(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gn.ag(ILba;ZI)I")
    public static int method3568(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("bh.aw(ILba;ZI)I")
    public static int method2105(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field992 == null) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = 1;
                Statics.field2852 = Statics.field992;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field857[--Statics.field3469];
            if (client.field748[var3] == null) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = 1;
                Statics.field2852 = client.field748[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field853[++Statics.field114 - 1] = Statics.field2852.field1720;
            return 1;
        } else if (arg0 == 3803) {
            field857[++Statics.field3469 - 1] = Statics.field2852.field1722 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field857[++Statics.field3469 - 1] = Statics.field2852.field1723;
            return 1;
        } else if (arg0 == 3805) {
            field857[++Statics.field3469 - 1] = Statics.field2852.field1741;
            return 1;
        } else if (arg0 == 3806) {
            field857[++Statics.field3469 - 1] = Statics.field2852.field1737;
            return 1;
        } else if (arg0 == 3807) {
            field857[++Statics.field3469 - 1] = Statics.field2852.field1726;
            return 1;
        } else if (arg0 == 3809) {
            field857[++Statics.field3469 - 1] = Statics.field2852.field1724;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field857[--Statics.field3469];
            field853[++Statics.field114 - 1] = Statics.field2852.field1715[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = Statics.field2852.field1738[var5];
            return 1;
        } else if (arg0 == 3812) {
            field857[++Statics.field3469 - 1] = Statics.field2852.field1734;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field857[--Statics.field3469];
            field853[++Statics.field114 - 1] = Statics.field2852.field1739[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field3469 -= 3;
            int var7 = field857[Statics.field3469];
            int var8 = field857[Statics.field3469 + 1];
            int var9 = field857[Statics.field3469 + 2];
            field857[++Statics.field3469 - 1] = Statics.field2852.method3026(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field857[++Statics.field3469 - 1] = Statics.field2852.field1727;
            return 1;
        } else if (arg0 == 3816) {
            field857[++Statics.field3469 - 1] = Statics.field2852.field1735;
            return 1;
        } else if (arg0 == 3817) {
            field857[++Statics.field3469 - 1] = Statics.field2852.method3080(field853[--Statics.field114]);
            return 1;
        } else if (arg0 == 3818) {
            field857[Statics.field3469 - 1] = Statics.field2852.method3094()[field857[Statics.field3469 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field3469 -= 2;
            int var10 = field857[Statics.field3469];
            int var11 = field857[Statics.field3469 + 1];
            client.method2257(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = Statics.field2852.field1732[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field3469 -= 3;
                int var13 = field857[Statics.field3469];
                boolean var14 = field857[Statics.field3469 + 1] == 1;
                int var15 = field857[Statics.field3469 + 2];
                client.method2787(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field857[--Statics.field3469];
                field857[++Statics.field3469 - 1] = Statics.field2852.field1733[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field5003 == null) {
                    field857[++Statics.field3469 - 1] = 0;
                } else {
                    field857[++Statics.field3469 - 1] = 1;
                    Statics.field472 = Statics.field5003;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field857[--Statics.field3469];
                if (client.field749[var17] == null) {
                    field857[++Statics.field3469 - 1] = 0;
                } else {
                    field857[++Statics.field3469 - 1] = 1;
                    Statics.field472 = client.field749[var17];
                    Statics.field3408 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field853[++Statics.field114 - 1] = Statics.field472.field1799;
                return 1;
            } else if (arg0 == 3853) {
                field857[++Statics.field3469 - 1] = Statics.field472.field1796;
                return 1;
            } else if (arg0 == 3854) {
                field857[++Statics.field3469 - 1] = Statics.field472.field1795;
                return 1;
            } else if (arg0 == 3855) {
                field857[++Statics.field3469 - 1] = Statics.field472.method3120();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field857[--Statics.field3469];
                field853[++Statics.field114 - 1] = ((class142) Statics.field472.field1794.get(var18)).field1656.method8556();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field857[--Statics.field3469];
                field857[++Statics.field3469 - 1] = ((class142) Statics.field472.field1794.get(var19)).field1657;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field857[--Statics.field3469];
                field857[++Statics.field3469 - 1] = ((class142) Statics.field472.field1794.get(var20)).field1659;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field857[--Statics.field3469];
                client.method5870(Statics.field3408, var21);
                return 1;
            } else if (arg0 == 3860) {
                field857[++Statics.field3469 - 1] = Statics.field472.method3118(field853[--Statics.field114]);
                return 1;
            } else if (arg0 == 3861) {
                field857[Statics.field3469 - 1] = Statics.field472.method3121()[field857[Statics.field3469 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field857[++Statics.field3469 - 1] = Statics.field4513 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ot.ar(ILba;ZB)I")
    public static int method7144(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field560[var3].method6146();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field560[var4].field4297;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field560[var5].field4291;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field560[var6].field4294;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field560[var7].field4295;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.field560[var8].field4296;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field857[--Statics.field3469];
            int var10 = client.field560[var9].method6158();
            field857[++Statics.field3469 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field857[--Statics.field3469];
            int var12 = client.field560[var11].method6158();
            field857[++Statics.field3469 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field857[--Statics.field3469];
            int var14 = client.field560[var13].method6158();
            field857[++Statics.field3469 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field857[--Statics.field3469];
            int var16 = client.field560[var15].method6158();
            field857[++Statics.field3469 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field857[--Statics.field3469] == 1;
            if (Statics.field1998 != null) {
                Statics.field1998.method6087(class339.field4265, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field857[--Statics.field3469] == 1;
            if (Statics.field1998 != null) {
                Statics.field1998.method6087(class339.field4264, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field3469 -= 2;
            boolean var19 = field857[Statics.field3469] == 1;
            boolean var20 = field857[Statics.field3469 + 1] == 1;
            if (Statics.field1998 != null) {
                client.field792.field492 = var20;
                Statics.field1998.method6087(client.field792, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field857[--Statics.field3469] == 1;
            if (Statics.field1998 != null) {
                Statics.field1998.method6087(class339.field4262, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field857[--Statics.field3469] == 1;
            if (Statics.field1998 != null) {
                Statics.field1998.method6087(class339.field4266, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field857[++Statics.field3469 - 1] = Statics.field1998 == null ? 0 : Statics.field1998.field4263.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field857[--Statics.field3469];
            class345 var24 = (class345) Statics.field1998.field4263.get(var23);
            field857[++Statics.field3469 - 1] = var24.field4289;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field857[--Statics.field3469];
            class345 var26 = (class345) Statics.field1998.field4263.get(var25);
            field853[++Statics.field114 - 1] = var26.method6138();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field857[--Statics.field3469];
            class345 var28 = (class345) Statics.field1998.field4263.get(var27);
            field853[++Statics.field114 - 1] = var28.method6139();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field857[--Statics.field3469];
            class345 var30 = (class345) Statics.field1998.field4263.get(var29);
            long var31 = class287.method3099() - Statics.field4360 - var30.field4284;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field853[++Statics.field114 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field857[--Statics.field3469];
            class345 var38 = (class345) Statics.field1998.field4263.get(var37);
            field857[++Statics.field3469 - 1] = var38.field4290.field4294;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field857[--Statics.field3469];
            class345 var40 = (class345) Statics.field1998.field4263.get(var39);
            field857[++Statics.field3469 - 1] = var40.field4290.field4291;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field857[--Statics.field3469];
            class345 var42 = (class345) Statics.field1998.field4263.get(var41);
            field857[++Statics.field3469 - 1] = var42.field4290.field4297;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("c.al(ILba;ZI)I")
    public static int method105(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field3469 -= 2;
            int var3 = field857[Statics.field3469];
            int var4 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field3469 -= 2;
            int var5 = field857[Statics.field3469];
            int var6 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field3469 -= 2;
            int var7 = field857[Statics.field3469];
            int var8 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field3469 -= 2;
            int var9 = field857[Statics.field3469];
            int var10 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field3469 -= 5;
            int var13 = field857[Statics.field3469];
            int var14 = field857[Statics.field3469 + 1];
            int var15 = field857[Statics.field3469 + 2];
            int var16 = field857[Statics.field3469 + 3];
            int var17 = field857[Statics.field3469 + 4];
            field857[++Statics.field3469 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field3469 -= 2;
            int var18 = field857[Statics.field3469];
            int var19 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field3469 -= 2;
            int var20 = field857[Statics.field3469];
            int var21 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field3469 -= 2;
            int var22 = field857[Statics.field3469];
            int var23 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field3469 -= 2;
            int var24 = field857[Statics.field3469];
            int var25 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field3469 -= 2;
            int var26 = field857[Statics.field3469];
            int var27 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field3469 -= 2;
            int var28 = field857[Statics.field3469];
            int var29 = field857[Statics.field3469 + 1];
            if (var28 == 0) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field3469 -= 2;
            int var30 = field857[Statics.field3469];
            int var31 = field857[Statics.field3469 + 1];
            if (var30 == 0) {
                field857[++Statics.field3469 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field857[++Statics.field3469 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field857[++Statics.field3469 - 1] = var30;
                    break;
                case 2:
                    field857[++Statics.field3469 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field857[++Statics.field3469 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field857[++Statics.field3469 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field857[++Statics.field3469 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field3469 -= 2;
            int var32 = field857[Statics.field3469];
            int var33 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field3469 -= 2;
            int var34 = field857[Statics.field3469];
            int var35 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field3469 -= 2;
            int var36 = field857[Statics.field3469];
            int var37 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field3469 -= 2;
            int var38 = field857[Statics.field3469];
            int var39 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field3469 -= 3;
            long var40 = (long) field857[Statics.field3469];
            long var42 = (long) field857[Statics.field3469 + 1];
            long var44 = (long) field857[Statics.field3469 + 2];
            field857[++Statics.field3469 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class289.method6463(field857[--Statics.field3469]);
            field857[++Statics.field3469 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field3469 -= 2;
            int var47 = field857[Statics.field3469];
            int var48 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field3469 -= 3;
            int var49 = field857[Statics.field3469];
            int var50 = field857[Statics.field3469 + 1];
            int var51 = field857[Statics.field3469 + 2];
            field857[++Statics.field3469 - 1] = class289.method3096(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field3469 -= 3;
            int var52 = field857[Statics.field3469];
            int var53 = field857[Statics.field3469 + 1];
            int var54 = field857[Statics.field3469 + 2];
            field857[++Statics.field3469 - 1] = class289.method5924(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field3469 -= 3;
            int var55 = field857[Statics.field3469];
            int var56 = field857[Statics.field3469 + 1];
            int var57 = field857[Statics.field3469 + 2];
            int var58 = 31 - var57;
            field857[++Statics.field3469 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field3469 -= 4;
            int var59 = field857[Statics.field3469];
            int var60 = field857[Statics.field3469 + 1];
            int var61 = field857[Statics.field3469 + 2];
            int var62 = field857[Statics.field3469 + 3];
            int var63 = class289.method5924(var59, var61, var62);
            int var64 = class289.method844(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field857[++Statics.field3469 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field857[Statics.field3469 - 1] = class432.method2553(field857[Statics.field3469 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field857[Statics.field3469 - 1] = class432.method6896(field857[Statics.field3469 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field3469 -= 2;
            int var65 = field857[Statics.field3469];
            int var66 = field857[Statics.field3469 + 1];
            int var67 = class432.method4290(var65, var66);
            field857[++Statics.field3469 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field857[Statics.field3469 - 1] = Math.abs(field857[Statics.field3469 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fe.at(ILba;ZI)I")
    public static int method3135(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field853[--Statics.field114];
            int var4 = field857[--Statics.field3469];
            field853[++Statics.field114 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field114 -= 2;
            String var5 = field853[Statics.field114];
            String var6 = field853[Statics.field114 + 1];
            field853[++Statics.field114 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field853[--Statics.field114];
            int var8 = field857[--Statics.field3469];
            field853[++Statics.field114 - 1] = var7 + class365.method3532(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field853[--Statics.field114];
            field853[++Statics.field114 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field857[--Statics.field3469];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field848.setTime(new Date(var11));
            int var13 = field848.get(5);
            int var14 = field848.get(2);
            int var15 = field848.get(1);
            field853[++Statics.field114 - 1] = var13 + "-" + field858[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field114 -= 2;
            String var16 = field853[Statics.field114];
            String var17 = field853[Statics.field114 + 1];
            if (Statics.field4508.field1107 == null || Statics.field4508.field1107.field3492 == 0) {
                field853[++Statics.field114 - 1] = var16;
            } else {
                field853[++Statics.field114 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field857[--Statics.field3469];
            field853[++Statics.field114 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field114 -= 2;
            field857[++Statics.field3469 - 1] = class365.method6067(class366.method2077(field853[Statics.field114], field853[Statics.field114 + 1], Statics.field268));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field853[--Statics.field114];
            Statics.field3469 -= 2;
            int var20 = field857[Statics.field3469];
            int var21 = field857[Statics.field3469 + 1];
            byte[] var22 = Statics.field1159.method5990(var21, 0);
            class372 var23 = new class372(var22);
            field857[++Statics.field3469 - 1] = var23.method6645(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field853[--Statics.field114];
            Statics.field3469 -= 2;
            int var25 = field857[Statics.field3469];
            int var26 = field857[Statics.field3469 + 1];
            byte[] var27 = Statics.field1159.method5990(var26, 0);
            class372 var28 = new class372(var27);
            field857[++Statics.field3469 - 1] = var28.method6625(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field114 -= 2;
            String var29 = field853[Statics.field114];
            String var30 = field853[Statics.field114 + 1];
            if (field857[--Statics.field3469] == 1) {
                field853[++Statics.field114 - 1] = var29;
            } else {
                field853[++Statics.field114 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field853[--Statics.field114];
            field853[++Statics.field114 - 1] = class376.method6713(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field853[--Statics.field114];
            int var33 = field857[--Statics.field3469];
            field853[++Statics.field114 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class365.method2925((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class365.method2577((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class365.method3102((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class365.method3873((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field853[--Statics.field114];
            if (var38 == null) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field853[--Statics.field114];
            Statics.field3469 -= 2;
            int var40 = field857[Statics.field3469];
            int var41 = field857[Statics.field3469 + 1];
            field853[++Statics.field114 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field853[--Statics.field114];
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
            field853[++Statics.field114 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field853[--Statics.field114];
            int var48 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field114 -= 2;
            String var49 = field853[Statics.field114];
            String var50 = field853[Statics.field114 + 1];
            int var51 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field853[--Statics.field114];
            field853[++Statics.field114 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field114 -= 3;
            String var53 = field853[Statics.field114];
            String var54 = field853[Statics.field114 + 1];
            String var55 = field853[Statics.field114 + 2];
            if (Statics.field4508.field1107 == null) {
                field853[++Statics.field114 - 1] = var55;
                return 1;
            }
            switch(Statics.field4508.field1107.field3487) {
                case 0:
                    field853[++Statics.field114 - 1] = var53;
                    break;
                case 1:
                    field853[++Statics.field114 - 1] = var54;
                    break;
                case 2:
                default:
                    field853[++Statics.field114 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("i.aj(ILba;ZI)I")
    public static int method40(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field857[--Statics.field3469];
            field853[++Statics.field114 - 1] = class201.method2583(var3).field2266;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field3469 -= 2;
            int var4 = field857[Statics.field3469];
            int var5 = field857[Statics.field3469 + 1];
            class201 var6 = class201.method2583(var4);
            if (var5 < 1 || var5 > 5 || var6.field2262[var5 - 1] == null) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = var6.field2262[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field3469 -= 2;
            int var7 = field857[Statics.field3469];
            int var8 = field857[Statics.field3469 + 1];
            class201 var9 = class201.method2583(var7);
            if (var8 < 1 || var8 > 5 || var9.field2211[var8 - 1] == null) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = var9.field2211[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class201.method2583(var10).field2248;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class201.method2583(var11).field2228 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field857[--Statics.field3469];
            class201 var13 = class201.method2583(var12);
            if (var13.field2205 == -1 && var13.field2251 >= 0) {
                field857[++Statics.field3469 - 1] = var13.field2251;
            } else {
                field857[++Statics.field3469 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field857[--Statics.field3469];
            class201 var15 = class201.method2583(var14);
            if (var15.field2205 >= 0 && var15.field2251 >= 0) {
                field857[++Statics.field3469 - 1] = var15.field2251;
            } else {
                field857[++Statics.field3469 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class201.method2583(var16).field2235 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field857[--Statics.field3469];
            class201 var18 = class201.method2583(var17);
            if (var18.field2265 == -1 && var18.field2233 >= 0) {
                field857[++Statics.field3469 - 1] = var18.field2233;
            } else {
                field857[++Statics.field3469 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field857[--Statics.field3469];
            class201 var20 = class201.method2583(var19);
            if (var20.field2265 >= 0 && var20.field2233 >= 0) {
                field857[++Statics.field3469 - 1] = var20.field2233;
            } else {
                field857[++Statics.field3469 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field853[--Statics.field114];
            int var22 = field857[--Statics.field3469];
            client.method6835(var21, var22 == 1);
            field857[++Statics.field3469 - 1] = Statics.field4441;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field2116 == null || Statics.field2825 >= Statics.field4441) {
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = Statics.field2116[++Statics.field2825 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2825 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field857[--Statics.field3469];
            int var24 = class201.method2583(var23).method3713();
            if (var24 == -1) {
                field857[++Statics.field3469 - 1] = var24;
            } else {
                field857[++Statics.field3469 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class201.method2583(var25).field2230;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class201.method2583(var26).field2231;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class201.method2583(var27).field2232;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field857[--Statics.field3469];
            class201 var29 = class201.method2583(var28);
            field857[++Statics.field3469 - 1] = var29.field2259;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("le.ax(ILba;ZI)I")
    public static int method5898(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field857[++Statics.field3469 - 1] = client.field737;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field3469 -= 3;
            client.field737 = field857[Statics.field3469];
            Statics.field3342 = class493.method3420(field857[Statics.field3469 + 1]);
            if (Statics.field3342 == null) {
                Statics.field3342 = class493.field5073;
            }
            client.field738 = field857[Statics.field3469 + 2];
            class282 var3 = class282.method4287(class280.field3069, client.field689.field1390);
            var3.field3187.method7947(client.field737);
            var3.field3187.method7947(Statics.field3342.field5072);
            var3.field3187.method7947(client.field738);
            client.field689.method2694(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field853[--Statics.field114];
            Statics.field3469 -= 2;
            int var5 = field857[Statics.field3469];
            int var6 = field857[Statics.field3469 + 1];
            class282 var7 = class282.method4287(class280.field3105, client.field689.field1390);
            var7.field3187.method7947(class474.method2557(var4) + 2);
            var7.field3187.method7954(var4);
            var7.field3187.method7947(var5 - 1);
            var7.field3187.method7947(var6);
            client.field689.method2694(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field3469 -= 2;
            int var8 = field857[Statics.field3469];
            int var9 = field857[Statics.field3469 + 1];
            class61 var10 = class106.method1126(var8, var9);
            if (var10 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = var10.field485;
                field857[++Statics.field3469 - 1] = var10.field478;
                field853[++Statics.field114 - 1] = var10.field480 == null ? "" : var10.field480;
                field853[++Statics.field114 - 1] = var10.field484 == null ? "" : var10.field484;
                field853[++Statics.field114 - 1] = var10.field481 == null ? "" : var10.field481;
                field857[++Statics.field3469 - 1] = var10.method1097() ? 1 : (var10.method1096() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field857[--Statics.field3469];
            class61 var12 = class106.method265(var11);
            if (var12 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = var12.field479;
                field857[++Statics.field3469 - 1] = var12.field478;
                field853[++Statics.field114 - 1] = var12.field480 == null ? "" : var12.field480;
                field853[++Statics.field114 - 1] = var12.field484 == null ? "" : var12.field484;
                field853[++Statics.field114 - 1] = var12.field481 == null ? "" : var12.field481;
                field857[++Statics.field3469 - 1] = var12.method1097() ? 1 : (var12.method1096() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field3342 == null) {
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = Statics.field3342.field5072;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field853[--Statics.field114];
            int var14 = field857[--Statics.field3469];
            class282 var15 = class498.method2560(var14, var13, Statics.field268, -1);
            client.field689.method2694(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field114 -= 2;
            String var16 = field853[Statics.field114];
            String var17 = field853[Statics.field114 + 1];
            class282 var18 = class282.method4287(class280.field3076, client.field689.field1390);
            var18.field3187.method7950(0);
            int var19 = var18.field3187.field4939;
            var18.field3187.method7954(var16);
            class313.method5068(var18.field3187, var17);
            var18.field3187.method7960(var18.field3187.field4939 - var19);
            client.field689.method2694(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field853[--Statics.field114];
            Statics.field3469 -= 2;
            int var21 = field857[Statics.field3469];
            int var22 = field857[Statics.field3469 + 1];
            class282 var23 = class498.method2560(var21, var20, Statics.field268, var22);
            client.field689.method2694(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field4508 == null || Statics.field4508.field1115 == null) {
                var24 = "";
            } else {
                var24 = Statics.field4508.field1115.method8556();
            }
            field853[++Statics.field114 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field857[++Statics.field3469 - 1] = client.field738;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class106.method2083(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class106.method68(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = class106.method4921(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field853[--Statics.field114];
            client.method1086(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field739 = field853[--Statics.field114].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field853[++Statics.field114 - 1] = client.field739;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field853[--Statics.field114];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field3469 -= 2;
            int var30 = field857[Statics.field3469];
            int var31 = field857[Statics.field3469 + 1];
            class61 var32 = class106.method1126(var30, var31);
            if (var32 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = var32.field485;
                field857[++Statics.field3469 - 1] = var32.field478;
                field853[++Statics.field114 - 1] = var32.field480 == null ? "" : var32.field480;
                field853[++Statics.field114 - 1] = var32.field484 == null ? "" : var32.field484;
                field853[++Statics.field114 - 1] = var32.field481 == null ? "" : var32.field481;
                field857[++Statics.field3469 - 1] = var32.method1097() ? 1 : (var32.method1096() ? 2 : 0);
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field857[--Statics.field3469];
            class61 var34 = class106.method265(var33);
            if (var34 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = var34.field479;
                field857[++Statics.field3469 - 1] = var34.field478;
                field853[++Statics.field114 - 1] = var34.field480 == null ? "" : var34.field480;
                field853[++Statics.field114 - 1] = var34.field484 == null ? "" : var34.field484;
                field853[++Statics.field114 - 1] = var34.field481 == null ? "" : var34.field481;
                field857[++Statics.field3469 - 1] = var34.method1097() ? 1 : (var34.method1096() ? 2 : 0);
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.az(ILba;ZB)I")
    public static int method1765(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field857[++Statics.field3469 - 1] = client.method1094();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field857[--Statics.field3469];
            if (var3 == 1 || var3 == 2) {
                client.method3136(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field857[++Statics.field3469 - 1] = Statics.field1404.method2389();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field857[--Statics.field3469];
            if (var4 == 1 || var4 == 2) {
                Statics.field1404.method2388(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field3469--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hk.ay(ILba;ZS)I")
    public static int method4082(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field610 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hi.ac(IB)I")
    public static int method3884(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("cc.av(IB)I")
    public static int method2225(int arg0) {
        return (int) ((Math.log((double) arg0) / field863 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("jg.aq(ILba;ZB)I")
    public static int method5069(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field3469 -= 2;
            client.field774 = (short) method3884(field857[Statics.field3469]);
            if (client.field774 <= 0) {
                client.field774 = 256;
            }
            client.field775 = (short) method3884(field857[Statics.field3469 + 1]);
            if (client.field775 <= 0) {
                client.field775 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field3469 -= 2;
            client.field776 = (short) field857[Statics.field3469];
            if (client.field776 <= 0) {
                client.field776 = 256;
            }
            client.field752 = (short) field857[Statics.field3469 + 1];
            if (client.field752 <= 0) {
                client.field752 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field3469 -= 4;
            client.field764 = (short) field857[Statics.field3469];
            if (client.field764 <= 0) {
                client.field764 = 1;
            }
            client.field779 = (short) field857[Statics.field3469 + 1];
            if (client.field779 <= 0) {
                client.field779 = 32767;
            } else if (client.field779 < client.field764) {
                client.field779 = client.field764;
            }
            client.field780 = (short) field857[Statics.field3469 + 2];
            if (client.field780 <= 0) {
                client.field780 = 1;
            }
            client.field781 = (short) field857[Statics.field3469 + 3];
            if (client.field781 <= 0) {
                client.field781 = 32767;
            } else if (client.field781 < client.field780) {
                client.field781 = client.field780;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field687 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = -1;
            } else {
                client.method5286(0, 0, client.field687.field3567, client.field687.field3568, false);
                field857[++Statics.field3469 - 1] = client.field784;
                field857[++Statics.field3469 - 1] = client.field702;
            }
            return 1;
        } else if (arg0 == 6204) {
            field857[++Statics.field3469 - 1] = client.field776;
            field857[++Statics.field3469 - 1] = client.field752;
            return 1;
        } else if (arg0 == 6205) {
            field857[++Statics.field3469 - 1] = method2225(client.field774);
            field857[++Statics.field3469 - 1] = method2225(client.field775);
            return 1;
        } else if (arg0 == 6220) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field857[++Statics.field3469 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field857[++Statics.field3469 - 1] = Statics.field220;
            return 1;
        } else if (arg0 == 6223) {
            field857[++Statics.field3469 - 1] = Statics.field1559;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("na.ak(ILba;ZI)I")
    public static int method6787(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field857[++Statics.field3469 - 1] = class64.method5117() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class64 var3 = class64.method2740();
            if (var3 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
            } else {
                field857[++Statics.field3469 - 1] = var3.field815;
                field857[++Statics.field3469 - 1] = var3.field816;
                field853[++Statics.field114 - 1] = var3.field819;
                field857[++Statics.field3469 - 1] = var3.field807;
                field857[++Statics.field3469 - 1] = var3.field817;
                field853[++Statics.field114 - 1] = var3.field808;
            }
            return 1;
        } else if (arg0 == 6502) {
            class64 var4 = class64.method2588();
            if (var4 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
            } else {
                field857[++Statics.field3469 - 1] = var4.field815;
                field857[++Statics.field3469 - 1] = var4.field816;
                field853[++Statics.field114 - 1] = var4.field819;
                field857[++Statics.field3469 - 1] = var4.field807;
                field857[++Statics.field3469 - 1] = var4.field817;
                field853[++Statics.field114 - 1] = var4.field808;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field857[--Statics.field3469];
            class64 var6 = null;
            for (int var7 = 0; var7 < class64.field811; var7++) {
                if (Statics.field1140[var7].field815 == var5) {
                    var6 = Statics.field1140[var7];
                    break;
                }
            }
            if (var6 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
            } else {
                field857[++Statics.field3469 - 1] = var6.field815;
                field857[++Statics.field3469 - 1] = var6.field816;
                field853[++Statics.field114 - 1] = var6.field819;
                field857[++Statics.field3469 - 1] = var6.field807;
                field857[++Statics.field3469 - 1] = var6.field817;
                field853[++Statics.field114 - 1] = var6.field808;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field3469 -= 4;
            int var8 = field857[Statics.field3469];
            boolean var9 = field857[Statics.field3469 + 1] == 1;
            int var10 = field857[Statics.field3469 + 2];
            boolean var11 = field857[Statics.field3469 + 3] == 1;
            class64.method2176(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field857[--Statics.field3469];
            if (var12 >= 0 && var12 < class64.field811) {
                class64 var13 = Statics.field1140[var12];
                field857[++Statics.field3469 - 1] = var13.field815;
                field857[++Statics.field3469 - 1] = var13.field816;
                field853[++Statics.field114 - 1] = var13.field819;
                field857[++Statics.field3469 - 1] = var13.field807;
                field857[++Statics.field3469 - 1] = var13.field817;
                field853[++Statics.field114 - 1] = var13.field808;
            } else {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
                field857[++Statics.field3469 - 1] = 0;
                field857[++Statics.field3469 - 1] = 0;
                field853[++Statics.field114 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field660 = field857[--Statics.field3469] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field3469 -= 2;
            int var14 = field857[Statics.field3469];
            int var15 = field857[Statics.field3469 + 1];
            class197 var16 = class197.method2995(var15);
            if (var16.method3525()) {
                field853[++Statics.field114 - 1] = class191.method2988(var14).method3430(var15, var16.field2122);
            } else {
                field857[++Statics.field3469 - 1] = class191.method2988(var14).method3432(var15, var16.field2121);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field3469 -= 2;
            int var17 = field857[Statics.field3469];
            int var18 = field857[Statics.field3469 + 1];
            class197 var19 = class197.method2995(var18);
            if (var19.method3525()) {
                field853[++Statics.field114 - 1] = class200.method7839(var17).method3614(var18, var19.field2122);
            } else {
                field857[++Statics.field3469 - 1] = class200.method7839(var17).method3613(var18, var19.field2121);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field3469 -= 2;
            int var20 = field857[Statics.field3469];
            int var21 = field857[Statics.field3469 + 1];
            class197 var22 = class197.method2995(var21);
            if (var22.method3525()) {
                field853[++Statics.field114 - 1] = class201.method2583(var20).method3662(var21, var22.field2122);
            } else {
                field857[++Statics.field3469 - 1] = class201.method2583(var20).method3661(var21, var22.field2121);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field3469 -= 2;
            int var23 = field857[Statics.field3469];
            int var24 = field857[Statics.field3469 + 1];
            class197 var25 = class197.method2995(var24);
            if (var25.method3525()) {
                field853[++Statics.field114 - 1] = class198.method2325(var23).method3544(var24, var25.field2122);
            } else {
                field857[++Statics.field3469 - 1] = class198.method2325(var23).method3547(var24, var25.field2121);
            }
            return 1;
        } else if (arg0 == 6518) {
            field857[++Statics.field3469 - 1] = client.field661 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field857[++Statics.field3469 - 1] = client.field629;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field114--;
            Statics.field3469--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field114--;
            Statics.field3469--;
            return 1;
        } else if (arg0 == 6524) {
            field857[++Statics.field3469 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field857[++Statics.field3469 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field857[++Statics.field3469 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field857[++Statics.field3469 - 1] = client.field504;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("is.au(ILba;ZI)I")
    public static int method4900(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1370;
            int var4 = (Statics.field4508.field1204 >> 7) + Statics.field2118;
            int var5 = (Statics.field4508.field1161 >> 7) + Statics.field565;
            client.method5881().method7656(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field857[--Statics.field3469];
            String var7 = "";
            class242 var8 = client.method5881().method7491(var6);
            if (var8 != null) {
                var7 = var8.method4624();
            }
            field853[++Statics.field114 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field857[--Statics.field3469];
            client.method5881().method7570(var9);
            return 1;
        } else if (arg0 == 6603) {
            field857[++Statics.field3469 - 1] = client.method5881().method7488();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field857[--Statics.field3469];
            client.method5881().method7485(var10);
            return 1;
        } else if (arg0 == 6605) {
            field857[++Statics.field3469 - 1] = client.method5881().method7549() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class301 var11 = new class301(field857[--Statics.field3469]);
            client.method5881().method7622(var11.field3463, var11.field3462);
            return 1;
        } else if (arg0 == 6607) {
            class301 var12 = new class301(field857[--Statics.field3469]);
            client.method5881().method7493(var12.field3463, var12.field3462);
            return 1;
        } else if (arg0 == 6608) {
            class301 var13 = new class301(field857[--Statics.field3469]);
            client.method5881().method7494(var13.field3464, var13.field3463, var13.field3462);
            return 1;
        } else if (arg0 == 6609) {
            class301 var14 = new class301(field857[--Statics.field3469]);
            client.method5881().method7495(var14.field3464, var14.field3463, var14.field3462);
            return 1;
        } else if (arg0 == 6610) {
            field857[++Statics.field3469 - 1] = client.method5881().method7496();
            field857[++Statics.field3469 - 1] = client.method5881().method7497();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field857[--Statics.field3469];
            class242 var16 = client.method5881().method7491(var15);
            if (var16 == null) {
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = var16.method4582().method5322();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field857[--Statics.field3469];
            class242 var18 = client.method5881().method7491(var17);
            if (var18 == null) {
                field857[++Statics.field3469 - 1] = 0;
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = (var18.method4576() - var18.method4575() + 1) * 64;
                field857[++Statics.field3469 - 1] = (var18.method4587() - var18.method4577() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field857[--Statics.field3469];
            class242 var20 = client.method5881().method7491(var19);
            if (var20 == null) {
                field857[++Statics.field3469 - 1] = 0;
                field857[++Statics.field3469 - 1] = 0;
                field857[++Statics.field3469 - 1] = 0;
                field857[++Statics.field3469 - 1] = 0;
            } else {
                field857[++Statics.field3469 - 1] = var20.method4575() * 64;
                field857[++Statics.field3469 - 1] = var20.method4577() * 64;
                field857[++Statics.field3469 - 1] = var20.method4576() * 64 + 64 - 1;
                field857[++Statics.field3469 - 1] = var20.method4587() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field857[--Statics.field3469];
            class242 var22 = client.method5881().method7491(var21);
            if (var22 == null) {
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var22.method4617();
            }
            return 1;
        } else if (arg0 == 6615) {
            class301 var23 = client.method5881().method7498();
            if (var23 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var23.field3463;
                field857[++Statics.field3469 - 1] = var23.field3462;
            }
            return 1;
        } else if (arg0 == 6616) {
            field857[++Statics.field3469 - 1] = client.method5881().method7475();
            return 1;
        } else if (arg0 == 6617) {
            class301 var24 = new class301(field857[--Statics.field3469]);
            class242 var25 = client.method5881().method7476();
            if (var25 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4581(var24.field3464, var24.field3463, var24.field3462);
            if (var26 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var26[0];
                field857[++Statics.field3469 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class301 var27 = new class301(field857[--Statics.field3469]);
            class242 var28 = client.method5881().method7476();
            if (var28 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = -1;
                return 1;
            }
            class301 var29 = var28.method4574(var27.field3463, var27.field3462);
            if (var29 == null) {
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var29.method5322();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field3469 -= 2;
            int var30 = field857[Statics.field3469];
            class301 var31 = new class301(field857[Statics.field3469 + 1]);
            method2898(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field3469 -= 2;
            int var32 = field857[Statics.field3469];
            class301 var33 = new class301(field857[Statics.field3469 + 1]);
            method2898(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field3469 -= 2;
            int var34 = field857[Statics.field3469];
            class301 var35 = new class301(field857[Statics.field3469 + 1]);
            class242 var36 = client.method5881().method7491(var34);
            if (var36 == null) {
                field857[++Statics.field3469 - 1] = 0;
                return 1;
            } else {
                field857[++Statics.field3469 - 1] = var36.method4564(var35.field3464, var35.field3463, var35.field3462) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field857[++Statics.field3469 - 1] = client.method5881().method7624();
            field857[++Statics.field3469 - 1] = client.method5881().method7500();
            return 1;
        } else if (arg0 == 6623) {
            class301 var37 = new class301(field857[--Statics.field3469]);
            class242 var38 = client.method5881().method7472(var37.field3464, var37.field3463, var37.field3462);
            if (var38 == null) {
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var38.method4569();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method5881().method7501(field857[--Statics.field3469]);
            return 1;
        } else if (arg0 == 6625) {
            client.method5881().method7502();
            return 1;
        } else if (arg0 == 6626) {
            client.method5881().method7503(field857[--Statics.field3469]);
            return 1;
        } else if (arg0 == 6627) {
            client.method5881().method7504();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field857[--Statics.field3469] == 1;
            client.method5881().method7505(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field857[--Statics.field3469];
            client.method5881().method7506(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field857[--Statics.field3469];
            client.method5881().method7651(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method5881().method7508();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field857[--Statics.field3469] == 1;
            client.method5881().method7474(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field3469 -= 2;
            int var43 = field857[Statics.field3469];
            boolean var44 = field857[Statics.field3469 + 1] == 1;
            client.method5881().method7510(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field3469 -= 2;
            int var45 = field857[Statics.field3469];
            boolean var46 = field857[Statics.field3469 + 1] == 1;
            client.method5881().method7511(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field857[++Statics.field3469 - 1] = client.method5881().method7512() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.method5881().method7513(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field857[--Statics.field3469];
            field857[++Statics.field3469 - 1] = client.method5881().method7514(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field3469 -= 2;
            int var49 = field857[Statics.field3469];
            class301 var50 = new class301(field857[Statics.field3469 + 1]);
            class301 var51 = client.method5881().method7464(var49, var50);
            if (var51 == null) {
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var51.method5322();
            }
            return 1;
        } else if (arg0 == 6639) {
            class260 var52 = client.method5881().method7519();
            if (var52 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var52.method4535();
                field857[++Statics.field3469 - 1] = var52.field3009.method5322();
            }
            return 1;
        } else if (arg0 == 6640) {
            class260 var53 = client.method5881().method7520();
            if (var53 == null) {
                field857[++Statics.field3469 - 1] = -1;
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var53.method4535();
                field857[++Statics.field3469 - 1] = var53.field3009.method5322();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field857[--Statics.field3469];
            class183 var55 = class183.method18(var54);
            if (var55.field1935 == null) {
                field853[++Statics.field114 - 1] = "";
            } else {
                field853[++Statics.field114 - 1] = var55.field1935;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field857[--Statics.field3469];
            class183 var57 = class183.method18(var56);
            field857[++Statics.field3469 - 1] = var57.field1942;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field857[--Statics.field3469];
            class183 var59 = class183.method18(var58);
            if (var59 == null) {
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var59.field1956;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field857[--Statics.field3469];
            class183 var61 = class183.method18(var60);
            if (var61 == null) {
                field857[++Statics.field3469 - 1] = -1;
            } else {
                field857[++Statics.field3469 - 1] = var61.field1938;
            }
            return 1;
        } else if (arg0 == 6697) {
            field857[++Statics.field3469 - 1] = Statics.field120.field3031;
            return 1;
        } else if (arg0 == 6698) {
            field857[++Statics.field3469 - 1] = Statics.field120.field3033.method5322();
            return 1;
        } else if (arg0 == 6699) {
            field857[++Statics.field3469 - 1] = Statics.field120.field3032.method5322();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("el.ae(ILba;ZB)I")
    public static int method2978(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field857[--Statics.field3469];
            class191 var4 = class191.method2988(var3);
            field853[++Statics.field114 - 1] = var4 == null ? "" : var4.field2029;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field3469 -= 2;
            class191 var5 = class191.method2988(field857[Statics.field3469]);
            int var6 = field857[Statics.field3469 + 1];
            field857[++Statics.field3469 - 1] = var5.method3452(var6);
            field857[++Statics.field3469 - 1] = var5.method3435(var6);
            return 1;
        } else if (arg0 == 6765) {
            class191 var7 = class191.method2988(field857[--Statics.field3469]);
            field857[++Statics.field3469 - 1] = var7 == null ? 0 : var7.field2033;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.ah(ILba;ZI)I")
    public static int method218(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field857[--Statics.field3469];
            class200 var4 = class200.method7839(var3);
            field853[++Statics.field114 - 1] = var4 == null ? "" : var4.field2154;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.ad(ILba;ZI)I")
    public static int method810(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("client.ab(ILba;ZI)I")
    public static int method1547(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("bw.an(ILba;ZB)I")
    public static int method1735(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field857[++Statics.field3469 - 1] = client.method5084() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gv.am(ILba;ZI)I")
    public static int method3874(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("z.as(ILba;ZI)I")
    public static int method17(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field857[--Statics.field3469] == 1;
            client.method3508(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oi.ao(ILba;ZB)I")
    public static int method7207(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field857[--Statics.field3469];
            Object var45 = Statics.method1683(var44);
            int var46 = field857[--Statics.field3469];
            class468 var47 = client.method2174(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class470.method4862(var46);
            Statics.field2522 = var47.method7868(var45, var48);
            if (Statics.field2522 == null) {
                client.field778 = -1;
                Statics.field140 = null;
                if (arg0 == 7500) {
                    field857[++Statics.field3469 - 1] = 0;
                }
            } else {
                client.field778 = class470.method4524(var46);
                Statics.field140 = Statics.field2522.iterator();
                if (arg0 == 7500) {
                    field857[++Statics.field3469 - 1] = Statics.field2522.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field140 != null && Statics.field140.hasNext()) {
                field857[++Statics.field3469 - 1] = (Integer) Statics.field140.next();
            } else {
                field857[++Statics.field3469 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field3469 -= 3;
            int var3 = field857[Statics.field3469];
            int var4 = field857[Statics.field3469 + 1];
            int var5 = field857[Statics.field3469 + 2];
            int var6 = class470.method4524(var4);
            int var7 = class470.method5217(var4);
            int var8 = class470.method4862(var4);
            class469 var9 = class469.method7132(var3);
            class467 var10 = class467.method5044(var6);
            int[] var11 = var10.field4908[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method7889(var7);
            if (var14 == null && var10.field4910 != null) {
                var14 = var10.field4910[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class464 var17 = class462.method6482(var16);
                    if (class464.field4904 == var17) {
                        field853[++Statics.field114 - 1] = "";
                    } else {
                        field857[++Statics.field3469 - 1] = class462.method6500(var16);
                    }
                }
                return 1;
            }
            int var18 = var14.length / var11.length;
            if (var5 < 0 || var5 >= var18) {
                throw new RuntimeException();
            }
            for (int var19 = var12; var19 < var13; var19++) {
                int var20 = var11.length * var5 + var19;
                class464 var21 = class462.method6482(var11[var19]);
                if (class464.field4904 == var21) {
                    field853[++Statics.field114 - 1] = (String) var14[var20];
                } else {
                    field857[++Statics.field3469 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field3469 -= 2;
            int var22 = field857[Statics.field3469];
            int var23 = field857[Statics.field3469 + 1];
            int var24 = 0;
            int var25 = class470.method4524(var23);
            int var26 = class470.method5217(var23);
            class469 var27 = class469.method7132(var22);
            class467 var28 = class467.method5044(var25);
            int[] var29 = var28.field4908[var26];
            Object[] var30 = var27.method7889(var26);
            if (var30 == null && var28.field4910 != null) {
                var30 = var28.field4910[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field857[++Statics.field3469 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field3469--;
            int var41 = field857[Statics.field3469];
            class468 var42 = client.method3269(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field2522 = var42.method7868(0, 0);
            int var43 = 0;
            if (Statics.field2522 != null) {
                client.field778 = var41;
                Statics.field140 = Statics.field2522.iterator();
                var43 = Statics.field2522.size();
            }
            if (arg0 == 7504) {
                field857[++Statics.field3469 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field857[--Statics.field3469];
            class469 var32 = class469.method7132(var31);
            field857[++Statics.field3469 - 1] = var32.field4921;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field857[--Statics.field3469];
            int var34 = -1;
            if (Statics.field2522 != null && var33 >= 0 && var33 < Statics.field2522.size()) {
                var34 = (Integer) Statics.field2522.get(var33);
            }
            field857[++Statics.field3469 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field857[--Statics.field3469];
            Object var36 = Statics.method1683(var35);
            int var37 = field857[--Statics.field3469];
            class468 var38 = client.method2174(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class470.method4524(var37) != client.field778) {
                throw new RuntimeException();
            } else if (Statics.field2522 == null && Statics.field2522.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class470.method4862(var37);
                List var40 = var38.method7868(var36, var39);
                Statics.field2522 = new LinkedList(Statics.field2522);
                if (var40 == null) {
                    Statics.field2522.clear();
                } else {
                    Statics.field2522.retainAll(var40);
                }
                Statics.field140 = Statics.field2522.iterator();
                if (arg0 == 7507) {
                    field857[++Statics.field3469 - 1] = Statics.field2522.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dk.bj(ILba;ZB)I")
    public static int method2930(int arg0, class75 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ah.bf(IB)V")
    public static void method843(int arg0) {
        if (arg0 == -1 || !class310.method3100(arg0)) {
            return;
        }
        class310[] var1 = Statics.field2984[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3.field3629 != null) {
                class84 var4 = new class84();
                var4.field1073 = var3;
                var4.field1062 = var3.field3629;
                method3882(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("du.bz(ILko;ZI)V")
    public static void method2898(int arg0, class301 arg1, boolean arg2) {
        class242 var3 = client.method5881().method7491(arg0);
        int var4 = Statics.field4508.field1128;
        int var5 = (Statics.field4508.field1204 >> 7) + Statics.field2118;
        int var6 = (Statics.field4508.field1161 >> 7) + Statics.field565;
        class301 var7 = new class301(var4, var5, var6);
        client.method5881().method7648(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("oe.br(Lqn;I)Ljava/lang/Object;")
    public static Object method6961(class464 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field4900) {
            case 1:
                return field853[--Statics.field114];
            case 2:
                return field857[--Statics.field3469];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }
}
