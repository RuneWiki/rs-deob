package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("be")
public class class68 {

    @ObfuscatedName("be.j")
    public static int[] field842 = new int[5];

    @ObfuscatedName("be.y")
    public static int[][] field847 = new int[5][5000];

    @ObfuscatedName("be.d")
    public static int[] field844 = new int[1000];

    @ObfuscatedName("be.r")
    public static String[] field845 = new String[1000];

    @ObfuscatedName("be.s")
    public static int field846 = 0;

    @ObfuscatedName("be.p")
    public static class61[] field839 = new class61[50];

    @ObfuscatedName("be.w")
    public static Calendar field856 = Calendar.getInstance();

    @ObfuscatedName("be.m")
    public static final String[] field849 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("be.i")
    public static boolean field850 = false;

    @ObfuscatedName("be.e")
    public static boolean field851 = false;

    @ObfuscatedName("be.g")
    public static ArrayList field852 = new ArrayList();

    @ObfuscatedName("be.k")
    public static int field840 = 0;

    @ObfuscatedName("be.ah")
    public static final double field854 = Math.log(2.0D);

    public class68() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jw.a(Lca;S)V")
    public static void method4883(class85 arg0) {
        method2474(arg0, 500000, 475000);
    }

    @ObfuscatedName("cp.f(Lca;III)V")
    public static void method2474(class85 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1045;
        class76 var5;
        if (class462.method7134(arg0.field1055)) {
            Statics.field413 = (class258) var3[0];
            class178 var4 = class178.method2234(Statics.field413.field2964);
            var5 = class76.method1944(arg0.field1055, var4.field1890, var4.field1896);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class76.method2980(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field4433 = 0;
        Statics.field1512 = 0;
        int var7 = -1;
        int[] var8 = var5.field964;
        int[] var9 = var5.field970;
        byte var10 = -1;
        field846 = 0;
        field850 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field841 = new int[var5.field967];
            int var13 = 0;
            Statics.field4816 = new String[var5.field968];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1052;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1047;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1053 == null ? -1 : arg0.field1053.field3539;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1049;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1053 == null ? -1 : arg0.field1053.field3506;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1050 == null ? -1 : arg0.field1050.field3539;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1050 == null ? -1 : arg0.field1050.field3506;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1048;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1046;
                    }
                    Statics.field841[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1044;
                    }
                    Statics.field4816[var14++] = var17;
                }
            }
            field840 = arg0.field1054;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field970[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method6746(var61, var5, var48);
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
                    field844[++Statics.field4433 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field844[++Statics.field4433 - 1] = class293.field3391[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class293.field3391[var19] = field844[--Statics.field4433];
                    client.method2972(var19);
                } else if (var61 == 3) {
                    field845[++Statics.field1512 - 1] = var5.field966[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field4433 -= 2;
                    if (field844[Statics.field4433] != field844[Statics.field4433 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field4433 -= 2;
                    if (field844[Statics.field4433] == field844[Statics.field4433 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field4433 -= 2;
                    if (field844[Statics.field4433] < field844[Statics.field4433 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field4433 -= 2;
                    if (field844[Statics.field4433] > field844[Statics.field4433 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field846 == 0) {
                        return;
                    }
                    class61 var21 = field839[--field846];
                    var5 = var21.field461;
                    var8 = var5.field964;
                    var9 = var5.field970;
                    var7 = var21.field463;
                    Statics.field841 = var21.field462;
                    Statics.field4816 = var21.field464;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field844[++Statics.field4433 - 1] = class293.method1999(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class293.method6846(var23, field844[--Statics.field4433]);
                } else if (var61 == 31) {
                    Statics.field4433 -= 2;
                    if (field844[Statics.field4433] <= field844[Statics.field4433 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field4433 -= 2;
                    if (field844[Statics.field4433] >= field844[Statics.field4433 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field844[++Statics.field4433 - 1] = Statics.field841[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field841[var9[var7]] = field844[--Statics.field4433];
                } else if (var61 == 35) {
                    field845[++Statics.field1512 - 1] = Statics.field4816[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field4816[var9[var7]] = field845[--Statics.field1512];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field1512 -= var24;
                    String var25 = class358.method5161(field845, Statics.field1512, var24);
                    field845[++Statics.field1512 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field4433--;
                } else if (var61 == 39) {
                    Statics.field1512--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class76 var27 = class76.method2980(var26);
                    int[] var28 = new int[var27.field967];
                    String[] var29 = new String[var27.field968];
                    for (int var30 = 0; var30 < var27.field969; var30++) {
                        var28[var30] = field844[Statics.field4433 - var27.field969 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field962; var31++) {
                        var29[var31] = field845[Statics.field1512 - var27.field962 + var31];
                    }
                    Statics.field4433 -= var27.field969;
                    Statics.field1512 -= var27.field962;
                    class61 var32 = new class61();
                    var32.field461 = var5;
                    var32.field463 = var7;
                    var32.field462 = Statics.field841;
                    var32.field464 = Statics.field4816;
                    field839[++field846 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field964;
                    var9 = var27.field970;
                    var7 = -1;
                    Statics.field841 = var28;
                    Statics.field4816 = var29;
                } else if (var61 == 42) {
                    field844[++Statics.field4433 - 1] = Statics.field957.method2477(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field957.method2515(var9[var7], field844[--Statics.field4433]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field844[--Statics.field4433];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field842[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field847[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field844[--Statics.field4433];
                    if (var39 < 0 || var39 >= field842[var38]) {
                        throw new RuntimeException();
                    }
                    field844[++Statics.field4433 - 1] = field847[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field4433 -= 2;
                    int var41 = field844[Statics.field4433];
                    if (var41 < 0 || var41 >= field842[var40]) {
                        throw new RuntimeException();
                    }
                    field847[var40][var41] = field844[Statics.field4433 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field957.method2476(var9[var7]);
                    if (var42 == null) {
                        var42 = class323.field3774;
                    }
                    field845[++Statics.field1512 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field957.method2480(var9[var7], field845[--Statics.field1512]);
                } else if (var61 == 49) {
                    String var43 = Statics.field957.method2479(var9[var7]);
                    field845[++Statics.field1512 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field957.method2478(var9[var7], field845[--Statics.field1512]);
                } else if (var61 == 60) {
                    class440 var44 = var5.field971[var9[var7]];
                    class429 var45 = (class429) var44.method7455((long) field844[--Statics.field4433]);
                    if (var45 != null) {
                        var7 += var45.field4634;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field57.method2920(var9[var7]);
                    if (var46 == null) {
                        field844[++Statics.field4433 - 1] = -1;
                    } else {
                        field844[++Statics.field4433 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field1746.method7101(var9[var7]);
                    if (var47 == null) {
                        field844[++Statics.field4433 - 1] = -1;
                    } else {
                        field844[++Statics.field4433 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4635).append(" ");
            for (int var53 = field846 - 1; var53 >= 0; var53--) {
                var52.append("").append(field839[var53].field461.field4635).append(" ");
            }
            var52.append("").append(var10);
            class489.method7161(var52.toString(), var59);
        } finally {
            while (field852.size() > 0) {
                class98 var56 = (class98) field852.remove(0);
                client.method4891(var56.method2415(), var56.method2416(), var56.method2418(), var56.method2419(), "");
            }
            if (field850) {
                field850 = false;
                client.method6189();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class489.method7161("Warning: Script " + var5.field963 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("oc.c(ILbz;ZB)I")
    public static int method6746(int arg0, class76 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method322(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method5691(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method7984(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2450(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method2130(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method5662(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method4294(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method2826(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method3705(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method71(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3699(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method5691(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method7984(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2450(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method2130(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method5662(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method6837(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2372(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method167(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2878(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3699(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method4857(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3580(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method4119(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method2841(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method5682(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method407(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method46(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method706(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method5680(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method2233(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method2235(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method5705(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method3094(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method2950(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2655(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method472(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method4863(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method2159(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method6015(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method1102(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method2704(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method1168(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method61(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method5698(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method4650(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method2827(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method388(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method4713(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.x(ILbz;ZI)I")
    public static int method322(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field4433 -= 3;
            int var3 = field844[Statics.field4433];
            int var4 = field844[Statics.field4433 + 1];
            int var5 = field844[Statics.field4433 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class303 var6 = class303.method4921(var3);
            if (var6.field3624 == null) {
                var6.field3624 = new class303[var5 + 1];
            }
            if (var6.field3624.length <= var5) {
                class303[] var7 = new class303[var5 + 1];
                for (int var8 = 0; var8 < var6.field3624.length; var8++) {
                    var7[var8] = var6.field3624[var8];
                }
                var6.field3624 = var7;
            }
            if (var5 > 0 && var6.field3624[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class303 var9 = new class303();
            var9.field3484 = var4;
            var9.field3618 = var9.field3539 = var6.field3539;
            var9.field3506 = var5;
            var9.field3481 = true;
            if (var4 == 12) {
                var9.method5573();
                var9.method5529().method5267(new class101(var9));
                var9.method5529().method5266(new class102(var9));
            }
            var6.field3624[var5] = var9;
            if (arg2) {
                Statics.field1629 = var9;
            } else {
                Statics.field1590 = var9;
            }
            client.method2867(var6);
            return 1;
        } else if (arg0 == 101) {
            class303 var10 = arg2 ? Statics.field1629 : Statics.field1590;
            class303 var11 = class303.method4921(var10.field3539);
            var11.field3624[var10.field3506] = null;
            client.method2867(var11);
            return 1;
        } else if (arg0 == 102) {
            class303 var12 = class303.method4921(field844[--Statics.field4433]);
            var12.field3624 = null;
            client.method2867(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field4433 -= 2;
            int var13 = field844[Statics.field4433];
            int var14 = field844[Statics.field4433 + 1];
            class303 var15 = class303.method4708(var13, var14);
            if (var15 == null || var14 == -1) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = 1;
                if (arg2) {
                    Statics.field1629 = var15;
                } else {
                    Statics.field1590 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class303 var16 = class303.method4921(field844[--Statics.field4433]);
            if (var16 == null) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = 1;
                if (arg2) {
                    Statics.field1629 = var16;
                } else {
                    Statics.field1590 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lk.h(ILbz;ZS)I")
    public static int method5691(int arg0, class76 arg1, boolean arg2) {
        int var3 = -1;
        class303 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field844[--Statics.field4433];
            var4 = class303.method4921(var3);
        } else {
            var4 = arg2 ? Statics.field1629 : Statics.field1590;
        }
        if (arg0 == 1000) {
            Statics.field4433 -= 4;
            var4.field3491 = field844[Statics.field4433];
            var4.field3492 = field844[Statics.field4433 + 1];
            var4.field3487 = field844[Statics.field4433 + 2];
            var4.field3488 = field844[Statics.field4433 + 3];
            client.method2867(var4);
            Statics.field1599.method1143(var4);
            if (var3 != -1 && var4.field3484 == 0) {
                client.method201(Statics.field3615[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field4433 -= 4;
            var4.field3508 = field844[Statics.field4433];
            var4.field3494 = field844[Statics.field4433 + 1];
            var4.field3530 = field844[Statics.field4433 + 2];
            var4.field3490 = field844[Statics.field4433 + 3];
            client.method2867(var4);
            Statics.field1599.method1143(var4);
            if (var3 != -1 && var4.field3484 == 0) {
                client.method201(Statics.field3615[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field844[--Statics.field4433] == 1;
            if (var4.field3502 != var5) {
                var4.field3502 = var5;
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3561 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3471 = field844[--Statics.field4433] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qc.j(ILbz;ZI)I")
    public static int method7984(int arg0, class76 arg1, boolean arg2) {
        int var3 = -1;
        class303 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field844[--Statics.field4433];
            var4 = class303.method4921(var3);
        } else {
            var4 = arg2 ? Statics.field1629 : Statics.field1590;
        }
        if (arg0 == 1100) {
            Statics.field4433 -= 2;
            int var5 = field844[Statics.field4433];
            int var6 = field844[Statics.field4433 + 1];
            if (var4.field3484 == 12) {
                class301 var7 = var4.method5529();
                if (var7 != null && var7.method5399(var5, var6)) {
                    client.method2867(var4);
                }
            } else {
                var4.field3503 = var5;
                if (var4.field3503 > var4.field3505 - var4.field3470) {
                    var4.field3503 = var4.field3505 - var4.field3470;
                }
                if (var4.field3503 < 0) {
                    var4.field3503 = 0;
                }
                var4.field3504 = var6;
                if (var4.field3504 > var4.field3514 - var4.field3498) {
                    var4.field3504 = var4.field3514 - var4.field3498;
                }
                if (var4.field3504 < 0) {
                    var4.field3504 = 0;
                }
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3507 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3511 = field844[--Statics.field4433] == 1;
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3634 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3515 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3582 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3520 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3521 = field844[--Statics.field4433] == 1;
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3526 = 1;
            var4.field3527 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field4433 -= 6;
            var4.field3532 = field844[Statics.field4433];
            var4.field3570 = field844[Statics.field4433 + 1];
            var4.field3623 = field844[Statics.field4433 + 2];
            var4.field3535 = field844[Statics.field4433 + 3];
            var4.field3536 = field844[Statics.field4433 + 4];
            var4.field3584 = field844[Statics.field4433 + 5];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field844[--Statics.field4433];
            if (var4.field3597 != var8) {
                var4.field3597 = var8;
                var4.field3493 = 0;
                var4.field3540 = 0;
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3556 = field844[--Statics.field4433] == 1;
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field845[--Statics.field1512];
            if (!var9.equals(var4.field3544)) {
                var4.field3544 = var9;
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3543 = field844[--Statics.field4433];
            if (var4.field3484 == 12) {
                class301 var10 = var4.method5529();
                if (var10 != null) {
                    var10.method5236();
                }
            }
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field4433 -= 3;
            if (var4.field3484 == 12) {
                class301 var11 = var4.method5529();
                if (var11 != null) {
                    var11.method5230(field844[Statics.field4433], field844[Statics.field4433 + 1]);
                    var11.method5231(field844[Statics.field4433 + 2]);
                }
            } else {
                var4.field3547 = field844[Statics.field4433];
                var4.field3594 = field844[Statics.field4433 + 1];
                var4.field3546 = field844[Statics.field4433 + 2];
            }
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3510 = field844[--Statics.field4433] == 1;
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3522 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3523 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3489 = field844[--Statics.field4433] == 1;
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3525 = field844[--Statics.field4433] == 1;
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field4433 -= 2;
            var4.field3505 = field844[Statics.field4433];
            var4.field3514 = field844[Statics.field4433 + 1];
            client.method2867(var4);
            if (var3 != -1 && var4.field3484 == 0) {
                client.method201(Statics.field3615[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method7588(var4.field3539, var4.field3506);
            client.field499 = var4;
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3518 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3517 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3610 = field844[--Statics.field4433];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var12 = field844[--Statics.field4433];
            class475 var13 = (class475) class344.method4292(class475.method6007(), var12);
            if (var13 != null) {
                var4.field3512 = var13;
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var14 = field844[--Statics.field4433] == 1;
            var4.field3516 = var14;
            return 1;
        } else if (arg0 == 1127) {
            boolean var15 = field844[--Statics.field4433] == 1;
            var4.field3541 = var15;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3519 = field845[--Statics.field1512];
            client.method2867(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5515(field845[--Statics.field1512], Statics.field318, client.method2936());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field4433 -= 2;
            var4.method5527(field844[Statics.field4433], field844[Statics.field4433 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5518(field845[--Statics.field1512], field844[--Statics.field4433]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field4433--;
            class296 var16 = var4.method5606();
            if (var16 != null) {
                var16.field3400 = field844[Statics.field4433];
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field4433--;
            class296 var17 = var4.method5606();
            if (var17 != null) {
                var17.field3402 = field844[Statics.field4433];
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field1512--;
            class301 var18 = var4.method5529();
            if (var18 != null) {
                var4.field3545 = field845[Statics.field1512];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field4433--;
            class296 var19 = var4.method5606();
            if (var19 != null) {
                var19.field3401 = field844[Statics.field4433];
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field4433--;
            class301 var20 = var4.method5529();
            if (var20 != null && var20.method5226(field844[Statics.field4433])) {
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field4433--;
            class301 var21 = var4.method5529();
            if (var21 != null && var21.method5227(field844[Statics.field4433])) {
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field4433--;
            class301 var22 = var4.method5529();
            if (var22 != null && var22.method5228(field844[Statics.field4433])) {
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var23 = field844[--Statics.field4433] == 1;
            client.field735.method3611();
            class301 var24 = var4.method5529();
            if (var24 != null && var24.method5220(var23)) {
                if (var23) {
                    client.field735.method3605(var4);
                }
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var25 = field844[--Statics.field4433] == 1;
            if (!var25 && client.field735.method3606() == var4) {
                client.field735.method3611();
                client.method2867(var4);
            }
            class301 var26 = var4.method5529();
            if (var26 != null) {
                var26.method5296(var25);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field4433 -= 2;
            class301 var27 = var4.method5529();
            if (var27 != null && var27.method5244(field844[Statics.field4433], field844[Statics.field4433 + 1])) {
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field4433--;
            class301 var28 = var4.method5529();
            if (var28 != null && var28.method5244(field844[Statics.field4433], field844[Statics.field4433])) {
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field4433--;
            class301 var29 = var4.method5529();
            if (var29 != null) {
                var29.method5233(field844[Statics.field4433]);
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field4433--;
            class301 var30 = var4.method5529();
            if (var30 != null) {
                var30.method5232(field844[Statics.field4433]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field4433--;
            class301 var31 = var4.method5529();
            if (var31 != null) {
                var31.method5389(field844[Statics.field4433]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field4433--;
            class301 var32 = var4.method5529();
            if (var32 != null) {
                var32.method5234(field844[Statics.field4433]);
                client.method2867(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field4433 -= 2;
            class29 var33 = var4.method5531();
            if (var33 != null) {
                var33.method401(field844[Statics.field4433], field844[Statics.field4433 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field4433 -= 2;
            class29 var34 = var4.method5531();
            if (var34 != null) {
                var34.method402((char) field844[Statics.field4433], field844[Statics.field4433 + 1]);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cv.y(ILbz;ZI)I")
    public static int method2450(int arg0, class76 arg1, boolean arg2) {
        class303 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class303.method4921(field844[--Statics.field4433]);
        } else {
            var3 = arg2 ? Statics.field1629 : Statics.field1590;
        }
        client.method2867(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field4433 -= 2;
            int var4 = field844[Statics.field4433];
            int var5 = field844[Statics.field4433 + 1];
            var3.field3467 = var4;
            var3.field3621 = var5;
            class195 var6 = class195.method5052(var4);
            var3.field3623 = var6.field2150;
            var3.field3535 = var6.field2151;
            var3.field3536 = var6.field2152;
            var3.field3532 = var6.field2153;
            var3.field3570 = var6.field2141;
            var3.field3584 = var6.field2157;
            if (arg0 == 1205) {
                var3.field3542 = 0;
            } else if (arg0 == 1212 | var6.field2155 == 1) {
                var3.field3542 = 1;
            } else {
                var3.field3542 = 2;
            }
            if (var3.field3538 > 0) {
                var3.field3584 = var3.field3584 * 32 / var3.field3538;
            } else if (var3.field3508 > 0) {
                var3.field3584 = var3.field3584 * 32 / var3.field3508;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3526 = 2;
            var3.field3527 = field844[--Statics.field4433];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3526 = 3;
            var3.field3527 = Statics.field3404.field1109.method5215();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.d(ILbz;ZB)I")
    public static int method2130(int arg0, class76 arg1, boolean arg2) {
        boolean var3 = true;
        class303 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class303.method4921(field844[--Statics.field4433]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1629 : Statics.field1590;
        }
        if (arg0 == 1300) {
            int var5 = field844[--Statics.field4433] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5512(var5, field845[--Statics.field1512]);
                return 1;
            } else {
                Statics.field1512--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field4433 -= 2;
            int var6 = field844[Statics.field4433];
            int var7 = field844[Statics.field4433 + 1];
            var4.field3569 = class303.method4708(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3572 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3622 = field844[--Statics.field4433];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3626 = field844[--Statics.field4433];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3567 = field845[--Statics.field1512];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3537 = field845[--Statics.field1512];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3568 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3636 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field4433--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field4433 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field844[Statics.field4433 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field844[Statics.field4433 + var10];
                        var9[var10 / 2] = (byte) field844[Statics.field4433 + var10 + 1];
                    }
                }
            } else {
                Statics.field4433 -= 2;
                var8 = new byte[] { (byte) field844[Statics.field4433] };
                var9 = new byte[] { (byte) field844[Statics.field4433 + 1] };
            }
            int var11 = field844[--Statics.field4433] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method4295(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field4433 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field844[Statics.field4433] };
            byte[] var14 = new byte[] { (byte) field844[Statics.field4433 + 1] };
            method4295(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field4433 -= 3;
            int var15 = field844[Statics.field4433] - 1;
            int var16 = field844[Statics.field4433 + 1];
            int var17 = field844[Statics.field4433 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method2664(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field844[--Statics.field4433];
            int var20 = field844[--Statics.field4433];
            method2664(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field4433--;
            int var21 = field844[Statics.field4433] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method6202(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method6202(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hs.n(Lkn;I[B[BI)V")
    public static final void method4295(class303 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3563 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3563 = new byte[11][];
            arg0.field3564 = new byte[11][];
            arg0.field3612 = new int[11];
            arg0.field3566 = new int[11];
        }
        arg0.field3563[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3562 = false;
            for (int var4 = 0; var4 < arg0.field3563.length; var4++) {
                if (arg0.field3563[var4] != null) {
                    arg0.field3562 = true;
                    break;
                }
            }
        } else {
            arg0.field3562 = true;
        }
        arg0.field3564[arg1] = arg3;
    }

    @ObfuscatedName("dm.r(Lkn;IIII)V")
    public static final void method2664(class303 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3612 == null) {
            throw new RuntimeException();
        }
        arg0.field3612[arg1] = arg2;
        arg0.field3566[arg1] = arg3;
    }

    @ObfuscatedName("mk.l(Lkn;IS)V")
    public static final void method6202(class303 arg0, int arg1) {
        if (arg0.field3563 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3565 == null) {
            arg0.field3565 = new int[arg0.field3563.length];
        }
        arg0.field3565[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ku.s(ILbz;ZI)I")
    public static int method5662(int arg0, class76 arg1, boolean arg2) {
        class303 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class303.method4921(field844[--Statics.field4433]);
        } else {
            var3 = arg2 ? Statics.field1629 : Statics.field1590;
        }
        String var4 = field845[--Statics.field1512];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field844[--Statics.field4433];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field844[--Statics.field4433];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field845[--Statics.field1512];
            } else {
                var7[var8] = Integer.valueOf(field844[--Statics.field4433]);
            }
        }
        int var9 = field844[--Statics.field4433];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3633 = var7;
        } else if (arg0 == 1401) {
            var3.field3579 = var7;
        } else if (arg0 == 1402) {
            var3.field3578 = var7;
        } else if (arg0 == 1403) {
            var3.field3580 = var7;
        } else if (arg0 == 1404) {
            var3.field3476 = var7;
        } else if (arg0 == 1405) {
            var3.field3500 = var7;
        } else if (arg0 == 1406) {
            var3.field3620 = var7;
        } else if (arg0 == 1407) {
            var3.field3587 = var7;
            var3.field3588 = var5;
        } else if (arg0 == 1408) {
            var3.field3593 = var7;
        } else if (arg0 == 1409) {
            var3.field3571 = var7;
        } else if (arg0 == 1410) {
            var3.field3559 = var7;
        } else if (arg0 == 1411) {
            var3.field3577 = var7;
        } else if (arg0 == 1412) {
            var3.field3581 = var7;
        } else if (arg0 == 1414) {
            var3.field3607 = var7;
            var3.field3590 = var5;
        } else if (arg0 == 1415) {
            var3.field3591 = var7;
            var3.field3592 = var5;
        } else if (arg0 == 1416) {
            var3.field3585 = var7;
        } else if (arg0 == 1417) {
            var3.field3596 = var7;
        } else if (arg0 == 1418) {
            var3.field3524 = var7;
        } else if (arg0 == 1419) {
            var3.field3598 = var7;
        } else if (arg0 == 1420) {
            var3.field3601 = var7;
        } else if (arg0 == 1421) {
            var3.field3602 = var7;
        } else if (arg0 == 1422) {
            var3.field3605 = var7;
        } else if (arg0 == 1423) {
            var3.field3606 = var7;
        } else if (arg0 == 1424) {
            var3.field3501 = var7;
        } else if (arg0 == 1425) {
            var3.field3609 = var7;
        } else if (arg0 == 1426) {
            var3.field3583 = var7;
        } else if (arg0 == 1427) {
            var3.field3608 = var7;
        } else if (arg0 == 1428) {
            var3.field3603 = var7;
        } else if (arg0 == 1429) {
            var3.field3474 = var7;
        } else if (arg0 == 1430) {
            var3.field3599 = var7;
        } else if (arg0 == 1431) {
            var3.field3600 = var7;
        } else if (arg0 == 1434) {
            var3.field3611 = var7;
        } else if (arg0 == 1435) {
            var3.field3595 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class299 var10 = var3.method5532();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3414 = var7;
                } else if (arg0 == 1437) {
                    var10.field3415 = var7;
                } else if (arg0 == 1438) {
                    var10.field3417 = var7;
                } else if (arg0 == 1439) {
                    var10.field3416 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3574 = true;
        return 1;
    }

    @ObfuscatedName("hs.p(ILbz;ZI)I")
    public static int method4294(int arg0, class76 arg1, boolean arg2) {
        class303 var3 = arg2 ? Statics.field1629 : Statics.field1590;
        if (arg0 == 1500) {
            field844[++Statics.field4433 - 1] = var3.field3495;
            return 1;
        } else if (arg0 == 1501) {
            field844[++Statics.field4433 - 1] = var3.field3573;
            return 1;
        } else if (arg0 == 1502) {
            field844[++Statics.field4433 - 1] = var3.field3470;
            return 1;
        } else if (arg0 == 1503) {
            field844[++Statics.field4433 - 1] = var3.field3498;
            return 1;
        } else if (arg0 == 1504) {
            field844[++Statics.field4433 - 1] = var3.field3502 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field844[++Statics.field4433 - 1] = var3.field3618;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ek.b(ILbz;ZI)I")
    public static int method2826(int arg0, class76 arg1, boolean arg2) {
        class303 var3 = arg2 ? Statics.field1629 : Statics.field1590;
        if (arg0 == 1600) {
            field844[++Statics.field4433 - 1] = var3.field3503;
            return 1;
        } else if (arg0 == 1601) {
            field844[++Statics.field4433 - 1] = var3.field3504;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3484 == 12) {
                class301 var4 = var3.method5529();
                if (var4 != null) {
                    field845[++Statics.field1512 - 1] = var4.method5415().method6300();
                    return 1;
                }
            }
            field845[++Statics.field1512 - 1] = var3.field3544;
            return 1;
        } else if (arg0 == 1603) {
            field844[++Statics.field4433 - 1] = var3.field3505;
            return 1;
        } else if (arg0 == 1604) {
            field844[++Statics.field4433 - 1] = var3.field3514;
            return 1;
        } else if (arg0 == 1605) {
            field844[++Statics.field4433 - 1] = var3.field3584;
            return 1;
        } else if (arg0 == 1606) {
            field844[++Statics.field4433 - 1] = var3.field3623;
            return 1;
        } else if (arg0 == 1607) {
            field844[++Statics.field4433 - 1] = var3.field3536;
            return 1;
        } else if (arg0 == 1608) {
            field844[++Statics.field4433 - 1] = var3.field3535;
            return 1;
        } else if (arg0 == 1609) {
            field844[++Statics.field4433 - 1] = var3.field3634;
            return 1;
        } else if (arg0 == 1610) {
            field844[++Statics.field4433 - 1] = var3.field3610;
            return 1;
        } else if (arg0 == 1611) {
            field844[++Statics.field4433 - 1] = var3.field3507;
            return 1;
        } else if (arg0 == 1612) {
            field844[++Statics.field4433 - 1] = var3.field3517;
            return 1;
        } else if (arg0 == 1613) {
            field844[++Statics.field4433 - 1] = var3.field3512.method24();
            return 1;
        } else if (arg0 == 1614) {
            field844[++Statics.field4433 - 1] = var3.field3541 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class296 var5 = var3.method5606();
                field844[++Statics.field4433 - 1] = var5 == null ? 0 : var5.field3400;
            }
            if (arg0 == 1618) {
                class296 var6 = var3.method5606();
                field844[++Statics.field4433 - 1] = var6 == null ? 0 : var6.field3402;
                return 1;
            } else if (arg0 == 1619) {
                class301 var7 = var3.method5529();
                field845[++Statics.field1512 - 1] = var7 == null ? "" : var7.method5269().method6300();
                return 1;
            } else if (arg0 == 1620) {
                class296 var8 = var3.method5606();
                field844[++Statics.field4433 - 1] = var8 == null ? 0 : var8.field3401;
                return 1;
            } else if (arg0 == 1621) {
                class301 var9 = var3.method5529();
                field844[++Statics.field4433 - 1] = var9 == null ? 0 : var9.method5279();
                return 1;
            } else if (arg0 == 1622) {
                class301 var10 = var3.method5529();
                field844[++Statics.field4433 - 1] = var10 == null ? 0 : var10.method5280();
                return 1;
            } else if (arg0 == 1623) {
                class301 var11 = var3.method5529();
                field844[++Statics.field4433 - 1] = var11 == null ? 0 : var11.method5281();
                return 1;
            } else if (arg0 == 1624) {
                class301 var12 = var3.method5529();
                field844[++Statics.field4433 - 1] = var12 != null && var12.method5253() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class301 var13 = var3.method5529();
                field844[++Statics.field4433 - 1] = var13 != null && var13.method5272() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class301 var14 = var3.method5529();
                field845[++Statics.field1512 - 1] = var14 == null ? "" : var14.method5270().method6530();
                return 1;
            } else if (arg0 == 1627) {
                class301 var15 = var3.method5529();
                int var16 = var15 == null ? 0 : var15.method5351();
                int var17 = var15 == null ? 0 : var15.method5274();
                field844[++Statics.field4433 - 1] = Math.min(var16, var17);
                field844[++Statics.field4433 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class301 var18 = var3.method5529();
                field844[++Statics.field4433 - 1] = var18 == null ? 0 : var18.method5274();
                return 1;
            } else if (arg0 == 1629) {
                class301 var19 = var3.method5529();
                field844[++Statics.field4433 - 1] = var19 == null ? 0 : var19.method5483();
                return 1;
            } else if (arg0 == 1630) {
                class301 var20 = var3.method5529();
                field844[++Statics.field4433 - 1] = var20 == null ? 0 : var20.method5282();
                return 1;
            } else if (arg0 == 1631) {
                class301 var21 = var3.method5529();
                field844[++Statics.field4433 - 1] = var21 == null ? 0 : var21.method5407();
                return 1;
            } else if (arg0 == 1632) {
                class301 var22 = var3.method5529();
                field844[++Statics.field4433 - 1] = var22 == null ? 0 : var22.method5285();
                return 1;
            } else if (arg0 == 1633) {
                class29 var23 = var3.method5531();
                field844[Statics.field4433 - 1] = var23 == null ? 0 : var23.method403(field844[Statics.field4433 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class29 var24 = var3.method5531();
                field844[Statics.field4433 - 1] = var24 == null ? 0 : var24.method404((char) field844[Statics.field4433 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("gi.o(ILbz;ZI)I")
    public static int method3705(int arg0, class76 arg1, boolean arg2) {
        class303 var3 = arg2 ? Statics.field1629 : Statics.field1590;
        if (arg0 == 1700) {
            field844[++Statics.field4433 - 1] = var3.field3467;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3467 == -1) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = var3.field3621;
            }
            return 1;
        } else if (arg0 == 1702) {
            field844[++Statics.field4433 - 1] = var3.field3506;
            return 1;
        } else if (arg0 == 1707) {
            field844[++Statics.field4433 - 1] = var3.method5528() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method7096(var3);
        } else if (arg0 == 1709) {
            return method2821(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oo.u(Lkn;I)I")
    public static int method7096(class303 arg0) {
        if (arg0.field3484 == 11) {
            String var1 = field845[--Statics.field1512];
            field844[++Statics.field4433 - 1] = arg0.method5520(var1);
            return 1;
        } else {
            Statics.field1512--;
            field844[++Statics.field4433 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("dh.z(Lkn;I)I")
    public static int method2821(class303 arg0) {
        if (arg0.field3484 == 11) {
            String var1 = field845[--Statics.field1512];
            field845[++Statics.field1512 - 1] = arg0.method5589(var1);
            return 1;
        } else {
            field845[Statics.field1512 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("r.t(ILbz;ZB)I")
    public static int method71(int arg0, class76 arg1, boolean arg2) {
        class303 var3 = arg2 ? Statics.field1629 : Statics.field1590;
        if (arg0 == 1800) {
            field844[++Statics.field4433 - 1] = class304.method3082(client.method3618(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field844[--Statics.field4433];
            int var5 = var4 - 1;
            if (var3.field3568 == null || var5 >= var3.field3568.length || var3.field3568[var5] == null) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = var3.field3568[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3567 == null) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = var3.field3567;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gv.w(ILbz;ZB)I")
    public static int method3699(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field840 >= 10) {
                throw new RuntimeException();
            }
            class303 var10;
            if (arg0 >= 2000) {
                var10 = class303.method4921(field844[--Statics.field4433]);
            } else {
                var10 = arg2 ? Statics.field1629 : Statics.field1590;
            }
            if (var10.field3608 == null) {
                return 0;
            }
            class85 var11 = new class85();
            var11.field1053 = var10;
            var11.field1045 = var10.field3608;
            var11.field1054 = field840 + 1;
            client.field623.method6031(var11);
            return 1;
        } else if (arg0 == 1928) {
            class303 var3 = arg2 ? Statics.field1629 : Statics.field1590;
            int var4 = field844[--Statics.field4433];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class98 var5 = new class98(var4, var3.field3539, var3.field3506, var3.field3467);
            field852.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field4433 -= 3;
            int var6 = field844[Statics.field4433];
            int var7 = field844[Statics.field4433 + 1];
            int var8 = field844[Statics.field4433 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class98 var9 = new class98(var8, var6, var7, class303.method4921(var6).field3467);
            field852.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("of.m(ILbz;ZI)I")
    public static int method6837(int arg0, class76 arg1, boolean arg2) {
        class303 var3 = class303.method4921(field844[--Statics.field4433]);
        if (arg0 == 2500) {
            field844[++Statics.field4433 - 1] = var3.field3495;
            return 1;
        } else if (arg0 == 2501) {
            field844[++Statics.field4433 - 1] = var3.field3573;
            return 1;
        } else if (arg0 == 2502) {
            field844[++Statics.field4433 - 1] = var3.field3470;
            return 1;
        } else if (arg0 == 2503) {
            field844[++Statics.field4433 - 1] = var3.field3498;
            return 1;
        } else if (arg0 == 2504) {
            field844[++Statics.field4433 - 1] = var3.field3502 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field844[++Statics.field4433 - 1] = var3.field3618;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ce.q(ILbz;ZI)I")
    public static int method2372(int arg0, class76 arg1, boolean arg2) {
        class303 var3 = class303.method4921(field844[--Statics.field4433]);
        if (arg0 == 2600) {
            field844[++Statics.field4433 - 1] = var3.field3503;
            return 1;
        } else if (arg0 == 2601) {
            field844[++Statics.field4433 - 1] = var3.field3504;
            return 1;
        } else if (arg0 == 2602) {
            field845[++Statics.field1512 - 1] = var3.field3544;
            return 1;
        } else if (arg0 == 2603) {
            field844[++Statics.field4433 - 1] = var3.field3505;
            return 1;
        } else if (arg0 == 2604) {
            field844[++Statics.field4433 - 1] = var3.field3514;
            return 1;
        } else if (arg0 == 2605) {
            field844[++Statics.field4433 - 1] = var3.field3584;
            return 1;
        } else if (arg0 == 2606) {
            field844[++Statics.field4433 - 1] = var3.field3623;
            return 1;
        } else if (arg0 == 2607) {
            field844[++Statics.field4433 - 1] = var3.field3536;
            return 1;
        } else if (arg0 == 2608) {
            field844[++Statics.field4433 - 1] = var3.field3535;
            return 1;
        } else if (arg0 == 2609) {
            field844[++Statics.field4433 - 1] = var3.field3634;
            return 1;
        } else if (arg0 == 2610) {
            field844[++Statics.field4433 - 1] = var3.field3610;
            return 1;
        } else if (arg0 == 2611) {
            field844[++Statics.field4433 - 1] = var3.field3507;
            return 1;
        } else if (arg0 == 2612) {
            field844[++Statics.field4433 - 1] = var3.field3517;
            return 1;
        } else if (arg0 == 2613) {
            field844[++Statics.field4433 - 1] = var3.field3512.method24();
            return 1;
        } else if (arg0 == 2614) {
            field844[++Statics.field4433 - 1] = var3.field3541 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class296 var4 = var3.method5606();
                field844[++Statics.field4433 - 1] = var4 == null ? 0 : var4.field3400;
            }
            if (arg0 == 2618) {
                class296 var5 = var3.method5606();
                field844[++Statics.field4433 - 1] = var5 == null ? 0 : var5.field3402;
                return 1;
            } else if (arg0 == 2619) {
                class301 var6 = var3.method5529();
                field845[++Statics.field1512 - 1] = var6 == null ? "" : var6.method5269().method6300();
                return 1;
            } else if (arg0 == 2620) {
                class296 var7 = var3.method5606();
                field844[++Statics.field4433 - 1] = var7 == null ? 0 : var7.field3401;
                return 1;
            } else if (arg0 == 2621) {
                class301 var8 = var3.method5529();
                field844[++Statics.field4433 - 1] = var8 == null ? 0 : var8.method5279();
                return 1;
            } else if (arg0 == 2622) {
                class301 var9 = var3.method5529();
                field844[++Statics.field4433 - 1] = var9 == null ? 0 : var9.method5280();
                return 1;
            } else if (arg0 == 2623) {
                class301 var10 = var3.method5529();
                field844[++Statics.field4433 - 1] = var10 == null ? 0 : var10.method5281();
                return 1;
            } else if (arg0 == 2624) {
                class301 var11 = var3.method5529();
                field844[++Statics.field4433 - 1] = var11 != null && var11.method5253() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class301 var12 = var3.method5529();
                field844[++Statics.field4433 - 1] = var12 != null && var12.method5272() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class301 var13 = var3.method5529();
                field845[++Statics.field1512 - 1] = var13 == null ? "" : var13.method5270().method6530();
                return 1;
            } else if (arg0 == 2627) {
                class301 var14 = var3.method5529();
                int var15 = var14 == null ? 0 : var14.method5351();
                int var16 = var14 == null ? 0 : var14.method5274();
                field844[++Statics.field4433 - 1] = Math.min(var15, var16);
                field844[++Statics.field4433 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class301 var17 = var3.method5529();
                field844[++Statics.field4433 - 1] = var17 == null ? 0 : var17.method5274();
                return 1;
            } else if (arg0 == 2629) {
                class301 var18 = var3.method5529();
                field844[++Statics.field4433 - 1] = var18 == null ? 0 : var18.method5483();
                return 1;
            } else if (arg0 == 2630) {
                class301 var19 = var3.method5529();
                field844[++Statics.field4433 - 1] = var19 == null ? 0 : var19.method5282();
                return 1;
            } else if (arg0 == 2631) {
                class301 var20 = var3.method5529();
                field844[++Statics.field4433 - 1] = var20 == null ? 0 : var20.method5407();
                return 1;
            } else if (arg0 == 2632) {
                class301 var21 = var3.method5529();
                field844[++Statics.field4433 - 1] = var21 == null ? 0 : var21.method5285();
                return 1;
            } else if (arg0 == 2633) {
                class29 var22 = var3.method5531();
                field844[Statics.field4433 - 1] = var22 == null ? 0 : var22.method403(field844[Statics.field4433 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class29 var23 = var3.method5531();
                field844[Statics.field4433 - 1] = var23 == null ? 0 : var23.method404((char) field844[Statics.field4433 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("b.i(ILbz;ZB)I")
    public static int method167(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class303 var3 = class303.method4921(field844[--Statics.field4433]);
            field844[++Statics.field4433 - 1] = var3.field3467;
            return 1;
        } else if (arg0 == 2701) {
            class303 var4 = class303.method4921(field844[--Statics.field4433]);
            if (var4.field3467 == -1) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = var4.field3621;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field844[--Statics.field4433];
            class84 var6 = (class84) client.field668.method7466((long) var5);
            if (var6 == null) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field844[++Statics.field4433 - 1] = client.field751;
            return 1;
        } else if (arg0 == 2707) {
            class303 var7 = class303.method4921(field844[--Statics.field4433]);
            field844[++Statics.field4433 - 1] = var7.method5528() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class303 var8 = class303.method4921(field844[--Statics.field4433]);
            return method7096(var8);
        } else if (arg0 == 2709) {
            class303 var9 = class303.method4921(field844[--Statics.field4433]);
            return method2821(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("er.e(ILbz;ZI)I")
    public static int method2878(int arg0, class76 arg1, boolean arg2) {
        class303 var3 = class303.method4921(field844[--Statics.field4433]);
        if (arg0 == 2800) {
            field844[++Statics.field4433 - 1] = class304.method3082(client.method3618(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field844[--Statics.field4433];
            int var5 = var4 - 1;
            if (var3.field3568 == null || var5 >= var3.field3568.length || var3.field3568[var5] == null) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = var3.field3568[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3567 == null) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = var3.field3567;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jk.g(ILbz;ZI)I")
    public static int method4857(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field845[--Statics.field1512];
            Statics.method666(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field4433 -= 2;
            client.method7425(Statics.field3404, field844[Statics.field4433], field844[Statics.field4433 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field851) {
                field850 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field845[--Statics.field1512];
            int var5 = 0;
            if (class358.method4635(var4)) {
                var5 = class358.method2449(var4);
            }
            class275 var6 = class275.method3314(class273.field3033, client.field636.field1373);
            var6.field3123.method7835(var5);
            client.field636.method2540(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field845[--Statics.field1512];
            class275 var8 = class275.method3314(class273.field3063, client.field636.field1373);
            var8.field3123.method7698(var7.length() + 1);
            var8.field3123.method7705(var7);
            client.field636.method2540(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field845[--Statics.field1512];
            class275 var10 = class275.method3314(class273.field3095, client.field636.field1373);
            var10.field3123.method7698(var9.length() + 1);
            var10.field3123.method7705(var9);
            client.field636.method2540(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field844[--Statics.field4433];
            String var12 = field845[--Statics.field1512];
            client.method2412(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field4433 -= 3;
            int var13 = field844[Statics.field4433];
            int var14 = field844[Statics.field4433 + 1];
            int var15 = field844[Statics.field4433 + 2];
            class303 var16 = class303.method4921(var15);
            client.method5650(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field4433 -= 2;
            int var17 = field844[Statics.field4433];
            int var18 = field844[Statics.field4433 + 1];
            class303 var19 = arg2 ? Statics.field1629 : Statics.field1590;
            client.method5650(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1024 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field844[++Statics.field4433 - 1] = Statics.field4526.method2353() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field4526.method2279(field844[--Statics.field4433] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field845[--Statics.field1512];
            boolean var21 = field844[--Statics.field4433] == 1;
            class33.method2572(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field844[--Statics.field4433];
            class275 var23 = class275.method3314(class273.field3082, client.field636.field1373);
            var23.field3123.method7775(var22);
            client.field636.method2540(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field844[--Statics.field4433];
            Statics.field1512 -= 2;
            String var25 = field845[Statics.field1512];
            String var26 = field845[Statics.field1512 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class275 var27 = class275.method3314(class273.field3066, client.field636.field1373);
                var27.field3123.method7775(1 + class464.method2236(var25) + class464.method2236(var26));
                var27.field3123.method7705(var26);
                var27.field3123.method7858(var24);
                var27.field3123.method7705(var25);
                client.field636.method2540(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field506 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field655 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field597 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field844[--Statics.field4433] == 1) {
                client.field626 |= 0x1;
            } else {
                client.field626 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field844[--Statics.field4433] == 1) {
                client.field626 |= 0x2;
            } else {
                client.field626 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field844[--Statics.field4433] == 1) {
                client.field626 |= 0x4;
            } else {
                client.field626 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field844[--Statics.field4433] == 1) {
                client.field626 |= 0x8;
            } else {
                client.field626 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field626 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field610 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field620 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method8276(field844[--Statics.field4433] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field844[++Statics.field4433 - 1] = client.method3800() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field4433 -= 2;
            client.field585 = field844[Statics.field4433];
            client.field625 = field844[Statics.field4433 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field4433 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field4433--;
            return 1;
        } else if (arg0 == 3132) {
            field844[++Statics.field4433 - 1] = Statics.field223;
            field844[++Statics.field4433 - 1] = Statics.field59;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field4433--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field4433 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field669 = 3;
            client.field756 = field844[--Statics.field4433];
            return 1;
        } else if (arg0 == 3137) {
            client.field669 = 2;
            client.field756 = field844[--Statics.field4433];
            return 1;
        } else if (arg0 == 3138) {
            client.field669 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field669 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field669 = 3;
            client.field756 = arg2 ? Statics.field1629.field3539 : Statics.field1590.field3539;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field844[--Statics.field4433] == 1;
            Statics.field4526.method2331(var28);
            return 1;
        } else if (arg0 == 3142) {
            field844[++Statics.field4433 - 1] = Statics.field4526.method2282() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field844[--Statics.field4433] == 1;
            client.field749 = var29;
            if (!var29) {
                Statics.field4526.method2286("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field844[++Statics.field4433 - 1] = client.field749 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field844[--Statics.field4433] == 1;
            Statics.field4526.method2283(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field844[++Statics.field4433 - 1] = Statics.field4526.method2284() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field844[++Statics.field4433 - 1] = class73.field902;
            return 1;
        } else if (arg0 == 3154) {
            field844[++Statics.field4433 - 1] = client.method804();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1512--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field4433 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field4433--;
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field4433--;
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1512--;
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field4433--;
            field845[++Statics.field1512 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field4433--;
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field4433 -= 2;
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field4433 -= 2;
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field4433 -= 2;
            field845[++Statics.field1512 - 1] = "";
            field845[++Statics.field1512 - 1] = "";
            field845[++Statics.field1512 - 1] = "";
            field845[++Statics.field1512 - 1] = "";
            field845[++Statics.field1512 - 1] = "";
            field845[++Statics.field1512 - 1] = "";
            field845[++Statics.field1512 - 1] = "";
            field845[++Statics.field1512 - 1] = "";
            field845[++Statics.field1512 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field4433--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field4433--;
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field4433--;
            return 1;
        } else if (arg0 == 3175) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1512--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1512--;
            return 1;
        } else if (arg0 == 3181) {
            client.method4307(field844[--Statics.field4433]);
            return 1;
        } else if (arg0 == 3182) {
            field844[++Statics.field4433 - 1] = client.method6203();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field844[--Statics.field4433];
            class197 var32 = class197.method3143(var31);
            if (var32.method3576()) {
                class197.method3424(var32.field2214);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gg.k(ILbz;ZI)I")
    public static int method3580(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field4433 -= 3;
            client.method4858(field844[Statics.field4433], field844[Statics.field4433 + 1], field844[Statics.field4433 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method697(field844[--Statics.field4433]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field4433 -= 2;
            client.method3788(field844[Statics.field4433], field844[Statics.field4433 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class88 var15 = class88.field1085;
            class87 var16 = class87.field1069;
            int var17 = field844[--Statics.field4433];
            if (arg0 == 3212) {
                int var18 = field844[--Statics.field4433];
                var15 = (class88) class344.method4292(class88.method2977(), var18);
                if (var15 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var18));
                }
            }
            if (arg0 == 3213) {
                int var19 = field844[--Statics.field4433];
                var16 = (class87) class344.method4292(class87.method2018(), var19);
                if (var16 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var19));
                }
            }
            if (arg0 == 3209) {
                int var20 = field844[--Statics.field4433];
                var15 = (class88) class344.method4292(class88.method2977(), var20);
                if (var15 == null) {
                    var16 = (class87) class344.method4292(class87.method2018(), var20);
                    if (var16 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var20));
                    }
                }
            } else if (arg0 == 3181) {
                var15 = class88.field1078;
            } else if (arg0 == 3203) {
                var16 = class87.field1076;
            } else if (arg0 == 3205) {
                var16 = class87.field1070;
            } else if (arg0 == 3207) {
                var16 = class87.field1071;
            }
            if (class87.field1069 == var16) {
                switch(var15.field1080) {
                    case 1:
                        Statics.field4526.method2331(var17 == 1);
                        break;
                    case 2:
                        Statics.field4526.method2283(var17 == 1);
                        break;
                    case 3:
                        Statics.field4526.method2285(var17 == 1);
                        break;
                    case 4:
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        Statics.field4526.method2288(var17);
                        break;
                    case 5:
                        client.method4307(var17);
                        break;
                    default:
                        String var21 = String.format("Unkown device option: %s.", var15.toString());
                        throw new RuntimeException(var21);
                }
            } else {
                switch(var16.field1072) {
                    case 1:
                        Statics.field4526.method2279(var17 == 1);
                        break;
                    case 2:
                        int var27 = Math.min(Math.max(var17, 0), 100);
                        int var28 = Math.round((float) (var27 * 255) / 100.0F);
                        client.method283(var28);
                        break;
                    case 3:
                        int var25 = Math.min(Math.max(var17, 0), 100);
                        int var26 = Math.round((float) (var25 * 127) / 100.0F);
                        client.method1091(var26);
                        break;
                    case 4:
                        int var23 = Math.min(Math.max(var17, 0), 100);
                        int var24 = Math.round((float) (var23 * 127) / 100.0F);
                        client.method5679(var24);
                        break;
                    default:
                        String var22 = String.format("Unkown game option: %s.", var16.toString());
                        throw new RuntimeException(var22);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class88 var3 = class88.field1085;
            class87 var4 = class87.field1069;
            boolean var5 = false;
            if (arg0 == 3214) {
                int var6 = field844[--Statics.field4433];
                var3 = (class88) class344.method4292(class88.method2977(), var6);
                if (var3 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                }
            }
            if (arg0 == 3215) {
                int var7 = field844[--Statics.field4433];
                var4 = (class87) class344.method4292(class87.method2018(), var7);
                if (var4 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                }
            }
            if (arg0 == 3210) {
                int var8 = field844[--Statics.field4433];
                var3 = (class88) class344.method4292(class88.method2977(), var8);
                if (var3 == null) {
                    var4 = (class87) class344.method4292(class87.method2018(), var8);
                    if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var8));
                    }
                }
            } else if (arg0 == 3182) {
                var3 = class88.field1078;
            } else if (arg0 == 3204) {
                var4 = class87.field1076;
            } else if (arg0 == 3206) {
                var4 = class87.field1070;
            } else if (arg0 == 3208) {
                var4 = class87.field1071;
            }
            int var10;
            if (class87.field1069 == var4) {
                switch(var3.field1080) {
                    case 1:
                        var10 = Statics.field4526.method2282() ? 1 : 0;
                        break;
                    case 2:
                        var10 = Statics.field4526.method2284() ? 1 : 0;
                        break;
                    case 3:
                        var10 = Statics.field4526.method2287() ? 1 : 0;
                        break;
                    case 4:
                        var10 = Statics.field4526.method2342();
                        break;
                    case 5:
                        var10 = client.method6203();
                        break;
                    default:
                        String var9 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var9);
                }
            } else {
                switch(var4.field1072) {
                    case 1:
                        var10 = Statics.field4526.method2353() ? 1 : 0;
                        break;
                    case 2:
                        int var14 = Statics.field4526.method2292();
                        var10 = Math.round((float) (var14 * 100) / 255.0F);
                        break;
                    case 3:
                        int var13 = Statics.field4526.method2328();
                        var10 = Math.round((float) (var13 * 100) / 127.0F);
                        break;
                    case 4:
                        int var12 = Statics.field4526.method2312();
                        var10 = Math.round((float) (var12 * 100) / 127.0F);
                        break;
                    default:
                        String var11 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var11);
                }
            }
            field844[++Statics.field4433 - 1] = var10;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hj.v(ILbz;ZI)I")
    public static int method4119(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field844[++Statics.field4433 - 1] = client.field503;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field4433 -= 2;
            int var3 = field844[Statics.field4433];
            int var4 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = class82.method7616(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field4433 -= 2;
            int var5 = field844[Statics.field4433];
            int var6 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = class82.method2854(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field4433 -= 2;
            int var7 = field844[Statics.field4433];
            int var8 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = class82.method4757(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class176.method1110(var9).field1861;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field638[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field675[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field640[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field478;
            int var14 = (Statics.field3404.field1163 >> 7) + Statics.field142;
            int var15 = (Statics.field3404.field1138 >> 7) + Statics.field1754;
            field844[++Statics.field4433 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field844[++Statics.field4433 - 1] = client.field493 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field4433 -= 2;
            int var19 = field844[Statics.field4433] + 32768;
            int var20 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = class82.method7616(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field4433 -= 2;
            int var21 = field844[Statics.field4433] + 32768;
            int var22 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = class82.method2854(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field4433 -= 2;
            int var23 = field844[Statics.field4433] + 32768;
            int var24 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = class82.method4757(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field608 >= 2) {
                field844[++Statics.field4433 - 1] = client.field608;
            } else {
                field844[++Statics.field4433 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field844[++Statics.field4433 - 1] = client.field509;
            return 1;
        } else if (arg0 == 3318) {
            field844[++Statics.field4433 - 1] = client.field726;
            return 1;
        } else if (arg0 == 3321) {
            field844[++Statics.field4433 - 1] = client.field674;
            return 1;
        } else if (arg0 == 3322) {
            field844[++Statics.field4433 - 1] = client.field717;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field678) {
                field844[++Statics.field4433 - 1] = 1;
            } else {
                field844[++Statics.field4433 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field844[++Statics.field4433 - 1] = client.field491;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field4433 -= 4;
            int var25 = field844[Statics.field4433];
            int var26 = field844[Statics.field4433 + 1];
            int var27 = field844[Statics.field4433 + 2];
            int var28 = field844[Statics.field4433 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field844[++Statics.field4433 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field844[++Statics.field4433 - 1] = client.field505;
            return 1;
        } else if (arg0 == 3327) {
            field844[++Statics.field4433 - 1] = client.field631;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ew.aj(ILbz;ZS)I")
    public static int method2841(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field4433 -= 2;
            int var3 = field844[Statics.field4433];
            int var4 = field844[Statics.field4433 + 1];
            class183 var5 = class183.method3092(var3);
            if (var5.field1941 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1944; var6++) {
                if (var5.field1947[var6] == var4) {
                    field845[++Statics.field1512 - 1] = var5.field1938[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field845[++Statics.field1512 - 1] = var5.field1942;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field4433 -= 4;
            int var7 = field844[Statics.field4433];
            int var8 = field844[Statics.field4433 + 1];
            int var9 = field844[Statics.field4433 + 2];
            int var10 = field844[Statics.field4433 + 3];
            class183 var11 = class183.method3092(var9);
            if (var11.field1948 != var7 || var11.field1941 != var8) {
                if (var8 == 115) {
                    field845[++Statics.field1512 - 1] = class323.field3774;
                } else {
                    field844[++Statics.field4433 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1944; var12++) {
                if (var11.field1947[var12] == var10) {
                    if (var8 == 115) {
                        field845[++Statics.field1512 - 1] = var11.field1938[var12];
                    } else {
                        field844[++Statics.field4433 - 1] = var11.field1946[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field845[++Statics.field1512 - 1] = var11.field1942;
                } else {
                    field844[++Statics.field4433 - 1] = var11.field1940;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field844[--Statics.field4433];
            class183 var14 = class183.method3092(var13);
            field844[++Statics.field4433 - 1] = var14.method3230();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kt.an(ILbz;ZB)I")
    public static int method5682(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field734.method3626(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field734.method3650(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field734.method3631(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ah.ah(ILbz;ZI)I")
    public static int method407(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field2726.field815 == 0) {
                field844[++Statics.field4433 - 1] = -2;
            } else if (Statics.field2726.field815 == 1) {
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = Statics.field2726.field818.method6803();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field844[--Statics.field4433];
            if (Statics.field2726.method1735() && var3 >= 0 && var3 < Statics.field2726.field818.method6803()) {
                class388 var4 = (class388) Statics.field2726.field818.method6767(var3);
                field845[++Statics.field1512 - 1] = var4.method6740();
                field845[++Statics.field1512 - 1] = var4.method6729();
            } else {
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field844[--Statics.field4433];
            if (Statics.field2726.method1735() && var5 >= 0 && var5 < Statics.field2726.field818.method6803()) {
                field844[++Statics.field4433 - 1] = ((class395) Statics.field2726.field818.method6767(var5)).field4495;
            } else {
                field844[++Statics.field4433 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field844[--Statics.field4433];
            if (Statics.field2726.method1735() && var6 >= 0 && var6 < Statics.field2726.field818.method6803()) {
                field844[++Statics.field4433 - 1] = ((class395) Statics.field2726.field818.method6767(var6)).field4496;
            } else {
                field844[++Statics.field4433 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field845[--Statics.field1512];
            int var8 = field844[--Statics.field4433];
            class66.method3169(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field845[--Statics.field1512];
            Statics.field2726.method1700(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field845[--Statics.field1512];
            Statics.field2726.method1719(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field845[--Statics.field1512];
            Statics.field2726.method1702(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field845[--Statics.field1512];
            Statics.field2726.method1705(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field845[--Statics.field1512];
            String var14 = client.method3708(var13);
            field844[++Statics.field4433 - 1] = Statics.field2726.method1721(new class486(var14, Statics.field2682), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field889 == null) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = Statics.field889.field4468;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field889 == null) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = Statics.field889.method6803();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field844[--Statics.field4433];
            if (Statics.field889 == null || var15 >= Statics.field889.method6803()) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = Statics.field889.method6767(var15).method6728().method8298();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field844[--Statics.field4433];
            if (Statics.field889 == null || var16 >= Statics.field889.method6803()) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = ((class395) Statics.field889.method6767(var16)).method6834();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field844[--Statics.field4433];
            if (Statics.field889 == null || var17 >= Statics.field889.method6803()) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = ((class395) Statics.field889.method6767(var17)).field4496;
            }
            return 1;
        } else if (arg0 == 3616) {
            field844[++Statics.field4433 - 1] = Statics.field889 == null ? 0 : Statics.field889.field4470;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field845[--Statics.field1512];
            client.method309(var18);
            return 1;
        } else if (arg0 == 3618) {
            field844[++Statics.field4433 - 1] = Statics.field889 == null ? 0 : Statics.field889.field4472;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field845[--Statics.field1512];
            client.method3622(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method2824();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field2726.method1735()) {
                field844[++Statics.field4433 - 1] = Statics.field2726.field814.method6803();
            } else {
                field844[++Statics.field4433 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field844[--Statics.field4433];
            if (Statics.field2726.method1735() && var20 >= 0 && var20 < Statics.field2726.field814.method6803()) {
                class394 var21 = (class394) Statics.field2726.field814.method6767(var20);
                field845[++Statics.field1512 - 1] = var21.method6740();
                field845[++Statics.field1512 - 1] = var21.method6729();
            } else {
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field845[--Statics.field1512];
            String var23 = client.method3708(var22);
            field844[++Statics.field4433 - 1] = Statics.field2726.method1699(new class486(var23, Statics.field2682)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field844[--Statics.field4433];
            if (Statics.field889 == null || var24 >= Statics.field889.method6803() || !Statics.field889.method6767(var24).method6728().equals(Statics.field3404.field1108)) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field889 == null || Statics.field889.field4469 == null) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = Statics.field889.field4469;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field844[--Statics.field4433];
            if (Statics.field889 == null || var25 >= Statics.field889.method6803() || !((class390) Statics.field889.method6767(var25)).method6704()) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field844[--Statics.field4433];
            if (Statics.field889 == null || var26 >= Statics.field889.method6803() || !((class390) Statics.field889.method6767(var26)).method6707()) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field2726.field818.method6806();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class469(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class470(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class115(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class111(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class114(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class119(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class113(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class112(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class116(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class117(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field2726.field818.method6768();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field2726.field814.method6806();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field844[--Statics.field4433] == 1;
            Statics.field2726.field814.method6776(new class469(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field844[--Statics.field4433] == 1;
            Statics.field2726.field814.method6776(new class470(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field2726.field814.method6768();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field889 != null) {
                Statics.field889.method6806();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class469(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class470(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class115(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class111(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class114(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class119(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class113(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class112(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class116(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class117(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field889 != null) {
                Statics.field889.method6768();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field844[--Statics.field4433] == 1;
            Statics.field2726.field818.method6776(new class118(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field844[--Statics.field4433] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method6776(new class118(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.ao(ILbz;ZI)I")
    public static int method46(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("as.ac(ILbz;ZI)I")
    public static int method706(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1452 == null) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = 1;
                Statics.field57 = Statics.field1452;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field844[--Statics.field4433];
            if (client.field596[var3] == null) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = 1;
                Statics.field57 = client.field596[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field845[++Statics.field1512 - 1] = Statics.field57.field1676;
            return 1;
        } else if (arg0 == 3803) {
            field844[++Statics.field4433 - 1] = Statics.field57.field1668 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field844[++Statics.field4433 - 1] = Statics.field57.field1671;
            return 1;
        } else if (arg0 == 3805) {
            field844[++Statics.field4433 - 1] = Statics.field57.field1661;
            return 1;
        } else if (arg0 == 3806) {
            field844[++Statics.field4433 - 1] = Statics.field57.field1681;
            return 1;
        } else if (arg0 == 3807) {
            field844[++Statics.field4433 - 1] = Statics.field57.field1672;
            return 1;
        } else if (arg0 == 3809) {
            field844[++Statics.field4433 - 1] = Statics.field57.field1673;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field844[--Statics.field4433];
            field845[++Statics.field1512 - 1] = Statics.field57.field1677[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = Statics.field57.field1685[var5];
            return 1;
        } else if (arg0 == 3812) {
            field844[++Statics.field4433 - 1] = Statics.field57.field1682;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field844[--Statics.field4433];
            field845[++Statics.field1512 - 1] = Statics.field57.field1675[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field4433 -= 3;
            int var7 = field844[Statics.field4433];
            int var8 = field844[Statics.field4433 + 1];
            int var9 = field844[Statics.field4433 + 2];
            field844[++Statics.field4433 - 1] = Statics.field57.method2913(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field844[++Statics.field4433 - 1] = Statics.field57.field1680;
            return 1;
        } else if (arg0 == 3816) {
            field844[++Statics.field4433 - 1] = Statics.field57.field1674;
            return 1;
        } else if (arg0 == 3817) {
            field844[++Statics.field4433 - 1] = Statics.field57.method2876(field845[--Statics.field1512]);
            return 1;
        } else if (arg0 == 3818) {
            field844[Statics.field4433 - 1] = Statics.field57.method2879()[field844[Statics.field4433 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field4433 -= 2;
            int var10 = field844[Statics.field4433];
            int var11 = field844[Statics.field4433 + 1];
            client.method3604(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = Statics.field57.field1678[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field4433 -= 3;
                int var13 = field844[Statics.field4433];
                boolean var14 = field844[Statics.field4433 + 1] == 1;
                int var15 = field844[Statics.field4433 + 2];
                client.method6190(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field844[--Statics.field4433];
                field844[++Statics.field4433 - 1] = Statics.field57.field1679[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field2239 == null) {
                    field844[++Statics.field4433 - 1] = 0;
                } else {
                    field844[++Statics.field4433 - 1] = 1;
                    Statics.field4759 = Statics.field2239;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field844[--Statics.field4433];
                if (client.field741[var17] == null) {
                    field844[++Statics.field4433 - 1] = 0;
                } else {
                    field844[++Statics.field4433 - 1] = 1;
                    Statics.field4759 = client.field741[var17];
                    Statics.field1390 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field845[++Statics.field1512 - 1] = Statics.field4759.field1731;
                return 1;
            } else if (arg0 == 3853) {
                field844[++Statics.field4433 - 1] = Statics.field4759.field1732;
                return 1;
            } else if (arg0 == 3854) {
                field844[++Statics.field4433 - 1] = Statics.field4759.field1726;
                return 1;
            } else if (arg0 == 3855) {
                field844[++Statics.field4433 - 1] = Statics.field4759.method2963();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field844[--Statics.field4433];
                field845[++Statics.field1512 - 1] = ((class138) Statics.field4759.field1728.get(var18)).field1596.method8298();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field844[--Statics.field4433];
                field844[++Statics.field4433 - 1] = ((class138) Statics.field4759.field1728.get(var19)).field1598;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field844[--Statics.field4433];
                field844[++Statics.field4433 - 1] = ((class138) Statics.field4759.field1728.get(var20)).field1591;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field844[--Statics.field4433];
                client.method7088(Statics.field1390, var21);
                return 1;
            } else if (arg0 == 3860) {
                field844[++Statics.field4433 - 1] = Statics.field4759.method2956(field845[--Statics.field1512]);
                return 1;
            } else if (arg0 == 3861) {
                field844[Statics.field4433 - 1] = Statics.field4759.method2953()[field844[Statics.field4433 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field844[++Statics.field4433 - 1] = Statics.field1746 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("kc.af(ILbz;ZI)I")
    public static int method5680(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field782[var3].method5936();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field782[var4].field4215;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field782[var5].field4214;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field782[var6].field4217;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field782[var7].field4216;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.field782[var8].field4219;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field844[--Statics.field4433];
            int var10 = client.field782[var9].method5934();
            field844[++Statics.field4433 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field844[--Statics.field4433];
            int var12 = client.field782[var11].method5934();
            field844[++Statics.field4433 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field844[--Statics.field4433];
            int var14 = client.field782[var13].method5934();
            field844[++Statics.field4433 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field844[--Statics.field4433];
            int var16 = client.field782[var15].method5934();
            field844[++Statics.field4433 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field844[--Statics.field4433] == 1;
            if (Statics.field2952 != null) {
                Statics.field2952.method5884(class332.field4190, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field844[--Statics.field4433] == 1;
            if (Statics.field2952 != null) {
                Statics.field2952.method5884(class332.field4189, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field4433 -= 2;
            boolean var19 = field844[Statics.field4433] == 1;
            boolean var20 = field844[Statics.field4433 + 1] == 1;
            if (Statics.field2952 != null) {
                client.field783.field487 = var20;
                Statics.field2952.method5884(client.field783, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field844[--Statics.field4433] == 1;
            if (Statics.field2952 != null) {
                Statics.field2952.method5884(class332.field4186, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field844[--Statics.field4433] == 1;
            if (Statics.field2952 != null) {
                Statics.field2952.method5884(class332.field4187, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field844[++Statics.field4433 - 1] = Statics.field2952 == null ? 0 : Statics.field2952.field4188.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field844[--Statics.field4433];
            class338 var24 = (class338) Statics.field2952.field4188.get(var23);
            field844[++Statics.field4433 - 1] = var24.field4206;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field844[--Statics.field4433];
            class338 var26 = (class338) Statics.field2952.field4188.get(var25);
            field845[++Statics.field1512 - 1] = var26.method5924();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field844[--Statics.field4433];
            class338 var28 = (class338) Statics.field2952.field4188.get(var27);
            field845[++Statics.field1512 - 1] = var28.method5925();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field844[--Statics.field4433];
            class338 var30 = (class338) Statics.field2952.field4188.get(var29);
            long var31 = class280.method2629() - Statics.field1308 - var30.field4205;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field845[++Statics.field1512 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field844[--Statics.field4433];
            class338 var38 = (class338) Statics.field2952.field4188.get(var37);
            field844[++Statics.field4433 - 1] = var38.field4207.field4217;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field844[--Statics.field4433];
            class338 var40 = (class338) Statics.field2952.field4188.get(var39);
            field844[++Statics.field4433 - 1] = var40.field4207.field4214;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field844[--Statics.field4433];
            class338 var42 = (class338) Statics.field2952.field4188.get(var41);
            field844[++Statics.field4433 - 1] = var42.field4207.field4215;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cl.ad(ILbz;ZB)I")
    public static int method2233(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field4433 -= 2;
            int var3 = field844[Statics.field4433];
            int var4 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field4433 -= 2;
            int var5 = field844[Statics.field4433];
            int var6 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field4433 -= 2;
            int var7 = field844[Statics.field4433];
            int var8 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field4433 -= 2;
            int var9 = field844[Statics.field4433];
            int var10 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field4433 -= 5;
            int var13 = field844[Statics.field4433];
            int var14 = field844[Statics.field4433 + 1];
            int var15 = field844[Statics.field4433 + 2];
            int var16 = field844[Statics.field4433 + 3];
            int var17 = field844[Statics.field4433 + 4];
            field844[++Statics.field4433 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field4433 -= 2;
            int var18 = field844[Statics.field4433];
            int var19 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field4433 -= 2;
            int var20 = field844[Statics.field4433];
            int var21 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field4433 -= 2;
            int var22 = field844[Statics.field4433];
            int var23 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field4433 -= 2;
            int var24 = field844[Statics.field4433];
            int var25 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field4433 -= 2;
            int var26 = field844[Statics.field4433];
            int var27 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field4433 -= 2;
            int var28 = field844[Statics.field4433];
            int var29 = field844[Statics.field4433 + 1];
            if (var28 == 0) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field4433 -= 2;
            int var30 = field844[Statics.field4433];
            int var31 = field844[Statics.field4433 + 1];
            if (var30 == 0) {
                field844[++Statics.field4433 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field844[++Statics.field4433 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field844[++Statics.field4433 - 1] = var30;
                    break;
                case 2:
                    field844[++Statics.field4433 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field844[++Statics.field4433 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field844[++Statics.field4433 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field844[++Statics.field4433 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field4433 -= 2;
            int var32 = field844[Statics.field4433];
            int var33 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field4433 -= 2;
            int var34 = field844[Statics.field4433];
            int var35 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field4433 -= 3;
            long var36 = (long) field844[Statics.field4433];
            long var38 = (long) field844[Statics.field4433 + 1];
            long var40 = (long) field844[Statics.field4433 + 2];
            field844[++Statics.field4433 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class282.method4107(field844[--Statics.field4433]);
            field844[++Statics.field4433 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field4433 -= 2;
            int var43 = field844[Statics.field4433];
            int var44 = field844[Statics.field4433 + 1];
            field844[++Statics.field4433 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field4433 -= 3;
            int var45 = field844[Statics.field4433];
            int var46 = field844[Statics.field4433 + 1];
            int var47 = field844[Statics.field4433 + 2];
            field844[++Statics.field4433 - 1] = class282.method4706(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field4433 -= 3;
            int var48 = field844[Statics.field4433];
            int var49 = field844[Statics.field4433 + 1];
            int var50 = field844[Statics.field4433 + 2];
            field844[++Statics.field4433 - 1] = class282.method437(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field4433 -= 3;
            int var51 = field844[Statics.field4433];
            int var52 = field844[Statics.field4433 + 1];
            int var53 = field844[Statics.field4433 + 2];
            int var54 = 31 - var53;
            field844[++Statics.field4433 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field4433 -= 4;
            int var55 = field844[Statics.field4433];
            int var56 = field844[Statics.field4433 + 1];
            int var57 = field844[Statics.field4433 + 2];
            int var58 = field844[Statics.field4433 + 3];
            int var59 = class282.method437(var55, var57, var58);
            int var60 = class282.method5775(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field844[++Statics.field4433 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field844[Statics.field4433 - 1] = class422.method5693(field844[Statics.field4433 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field844[Statics.field4433 - 1] = class422.method3123(field844[Statics.field4433 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field4433 -= 2;
            int var61 = field844[Statics.field4433];
            int var62 = field844[Statics.field4433 + 1];
            int var63 = class422.method4695(var61, var62);
            field844[++Statics.field4433 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field844[Statics.field4433 - 1] = Math.abs(field844[Statics.field4433 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cl.av(ILbz;ZI)I")
    public static int method2235(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field845[--Statics.field1512];
            int var4 = field844[--Statics.field4433];
            field845[++Statics.field1512 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1512 -= 2;
            String var5 = field845[Statics.field1512];
            String var6 = field845[Statics.field1512 + 1];
            field845[++Statics.field1512 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field845[--Statics.field1512];
            int var8 = field844[--Statics.field4433];
            field845[++Statics.field1512 - 1] = var7 + class358.method324(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field845[--Statics.field1512];
            field845[++Statics.field1512 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field844[--Statics.field4433];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field856.setTime(new Date(var11));
            int var13 = field856.get(5);
            int var14 = field856.get(2);
            int var15 = field856.get(1);
            field845[++Statics.field1512 - 1] = var13 + "-" + field849[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1512 -= 2;
            String var16 = field845[Statics.field1512];
            String var17 = field845[Statics.field1512 + 1];
            if (Statics.field3404.field1109 == null || Statics.field3404.field1109.field3424 == 0) {
                field845[++Statics.field1512 - 1] = var16;
            } else {
                field845[++Statics.field1512 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field844[--Statics.field4433];
            field845[++Statics.field1512 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1512 -= 2;
            field844[++Statics.field4433 - 1] = class358.method5179(class359.method1923(field845[Statics.field1512], field845[Statics.field1512 + 1], Statics.field1347));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field845[--Statics.field1512];
            Statics.field4433 -= 2;
            int var20 = field844[Statics.field4433];
            int var21 = field844[Statics.field4433 + 1];
            byte[] var22 = Statics.field1651.method5859(var21, 0);
            class365 var23 = new class365(var22);
            field844[++Statics.field4433 - 1] = var23.method6423(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field845[--Statics.field1512];
            Statics.field4433 -= 2;
            int var25 = field844[Statics.field4433];
            int var26 = field844[Statics.field4433 + 1];
            byte[] var27 = Statics.field1651.method5859(var26, 0);
            class365 var28 = new class365(var27);
            field844[++Statics.field4433 - 1] = var28.method6417(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1512 -= 2;
            String var29 = field845[Statics.field1512];
            String var30 = field845[Statics.field1512 + 1];
            if (field844[--Statics.field4433] == 1) {
                field845[++Statics.field1512 - 1] = var29;
            } else {
                field845[++Statics.field1512 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field845[--Statics.field1512];
            field845[++Statics.field1512 - 1] = class369.method6418(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field845[--Statics.field1512];
            int var33 = field844[--Statics.field4433];
            field845[++Statics.field1512 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class358.method5982((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class358.method2894((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class358.method2681((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class358.method5949((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field845[--Statics.field1512];
            if (var38 == null) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field845[--Statics.field1512];
            Statics.field4433 -= 2;
            int var40 = field844[Statics.field4433];
            int var41 = field844[Statics.field4433 + 1];
            field845[++Statics.field1512 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field845[--Statics.field1512];
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
            field845[++Statics.field1512 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field845[--Statics.field1512];
            int var48 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1512 -= 2;
            String var49 = field845[Statics.field1512];
            String var50 = field845[Statics.field1512 + 1];
            int var51 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field845[--Statics.field1512];
            field845[++Statics.field1512 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field1512 -= 3;
            String var53 = field845[Statics.field1512];
            String var54 = field845[Statics.field1512 + 1];
            String var55 = field845[Statics.field1512 + 2];
            if (Statics.field3404.field1109 == null) {
                field845[++Statics.field1512 - 1] = var55;
                return 1;
            }
            switch(Statics.field3404.field1109.field3426) {
                case 0:
                    field845[++Statics.field1512 - 1] = var53;
                    break;
                case 1:
                    field845[++Statics.field1512 - 1] = var54;
                    break;
                case 2:
                default:
                    field845[++Statics.field1512 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lm.ak(ILbz;ZI)I")
    public static int method5705(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field844[--Statics.field4433];
            field845[++Statics.field1512 - 1] = class195.method5052(var3).field2144;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field4433 -= 2;
            int var4 = field844[Statics.field4433];
            int var5 = field844[Statics.field4433 + 1];
            class195 var6 = class195.method5052(var4);
            if (var5 < 1 || var5 > 5 || var6.field2161[var5 - 1] == null) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = var6.field2161[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field4433 -= 2;
            int var7 = field844[Statics.field4433];
            int var8 = field844[Statics.field4433 + 1];
            class195 var9 = class195.method5052(var7);
            if (var8 < 1 || var8 > 5 || var9.field2162[var8 - 1] == null) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = var9.field2162[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class195.method5052(var10).field2156;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class195.method5052(var11).field2155 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field844[--Statics.field4433];
            class195 var13 = class195.method5052(var12);
            if (var13.field2179 == -1 && var13.field2178 >= 0) {
                field844[++Statics.field4433 - 1] = var13.field2178;
            } else {
                field844[++Statics.field4433 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field844[--Statics.field4433];
            class195 var15 = class195.method5052(var14);
            if (var15.field2179 >= 0 && var15.field2178 >= 0) {
                field844[++Statics.field4433 - 1] = var15.field2178;
            } else {
                field844[++Statics.field4433 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class195.method5052(var16).field2175 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field844[--Statics.field4433];
            class195 var18 = class195.method5052(var17);
            if (var18.field2192 == -1 && var18.field2165 >= 0) {
                field844[++Statics.field4433 - 1] = var18.field2165;
            } else {
                field844[++Statics.field4433 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field844[--Statics.field4433];
            class195 var20 = class195.method5052(var19);
            if (var20.field2192 >= 0 && var20.field2165 >= 0) {
                field844[++Statics.field4433 - 1] = var20.field2165;
            } else {
                field844[++Statics.field4433 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field845[--Statics.field1512];
            int var22 = field844[--Statics.field4433];
            client.method5180(var21, var22 == 1);
            field844[++Statics.field4433 - 1] = Statics.field1836;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1314 == null || Statics.field4479 >= Statics.field1836) {
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = Statics.field1314[++Statics.field4479 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field4479 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field844[--Statics.field4433];
            int var24 = class195.method5052(var23).method3480();
            if (var24 == -1) {
                field844[++Statics.field4433 - 1] = var24;
            } else {
                field844[++Statics.field4433 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class195.method5052(var25).field2143;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class195.method5052(var26).field2158;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class195.method5052(var27).field2159;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field844[--Statics.field4433];
            class195 var29 = class195.method5052(var28);
            field844[++Statics.field4433 - 1] = var29.field2183;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fw.ae(ILbz;ZB)I")
    public static int method3094(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field844[++Statics.field4433 - 1] = client.field729;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field4433 -= 3;
            client.field729 = field844[Statics.field4433];
            Statics.field3462 = class482.method6258(field844[Statics.field4433 + 1]);
            if (Statics.field3462 == null) {
                Statics.field3462 = class482.field5001;
            }
            client.field730 = field844[Statics.field4433 + 2];
            class275 var3 = class275.method3314(class273.field3100, client.field636.field1373);
            var3.field3123.method7698(client.field729);
            var3.field3123.method7698(Statics.field3462.field5000);
            var3.field3123.method7698(client.field730);
            client.field636.method2540(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field845[--Statics.field1512];
            Statics.field4433 -= 2;
            int var5 = field844[Statics.field4433];
            int var6 = field844[Statics.field4433 + 1];
            class275 var7 = class275.method3314(class273.field3070, client.field636.field1373);
            var7.field3123.method7698(class464.method2236(var4) + 2);
            var7.field3123.method7705(var4);
            var7.field3123.method7698(var5 - 1);
            var7.field3123.method7698(var6);
            client.field636.method2540(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field4433 -= 2;
            int var8 = field844[Statics.field4433];
            int var9 = field844[Statics.field4433 + 1];
            class62 var10 = class106.method5888(var8, var9);
            if (var10 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = var10.field467;
                field844[++Statics.field4433 - 1] = var10.field466;
                field845[++Statics.field1512 - 1] = var10.field471 == null ? "" : var10.field471;
                field845[++Statics.field1512 - 1] = var10.field469 == null ? "" : var10.field469;
                field845[++Statics.field1512 - 1] = var10.field474 == null ? "" : var10.field474;
                field844[++Statics.field4433 - 1] = var10.method1080() ? 1 : (var10.method1083() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field844[--Statics.field4433];
            class62 var12 = class106.method289(var11);
            if (var12 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = var12.field468;
                field844[++Statics.field4433 - 1] = var12.field466;
                field845[++Statics.field1512 - 1] = var12.field471 == null ? "" : var12.field471;
                field845[++Statics.field1512 - 1] = var12.field469 == null ? "" : var12.field469;
                field845[++Statics.field1512 - 1] = var12.field474 == null ? "" : var12.field474;
                field844[++Statics.field4433 - 1] = var12.method1080() ? 1 : (var12.method1083() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field3462 == null) {
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = Statics.field3462.field5000;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field845[--Statics.field1512];
            int var14 = field844[--Statics.field4433];
            class275 var15 = class487.method5657(var14, var13, Statics.field1347, -1);
            client.field636.method2540(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1512 -= 2;
            String var16 = field845[Statics.field1512];
            String var17 = field845[Statics.field1512 + 1];
            class275 var18 = class275.method3314(class273.field3078, client.field636.field1373);
            var18.field3123.method7775(0);
            int var19 = var18.field3123.field4864;
            var18.field3123.method7705(var16);
            Statics.method4901(var18.field3123, var17);
            var18.field3123.method7711(var18.field3123.field4864 - var19);
            client.field636.method2540(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field845[--Statics.field1512];
            Statics.field4433 -= 2;
            int var21 = field844[Statics.field4433];
            int var22 = field844[Statics.field4433 + 1];
            class275 var23 = class487.method5657(var21, var20, Statics.field1347, var22);
            client.field636.method2540(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field3404 == null || Statics.field3404.field1108 == null) {
                var24 = "";
            } else {
                var24 = Statics.field3404.field1108.method8298();
            }
            field845[++Statics.field1512 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field844[++Statics.field4433 - 1] = client.field730;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class106.method4672(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class106.method2838(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = class106.method4911(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field845[--Statics.field1512];
            client.method565(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field731 = field845[--Statics.field1512].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field845[++Statics.field1512 - 1] = client.field731;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field845[--Statics.field1512];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field4433 -= 2;
            int var30 = field844[Statics.field4433];
            int var31 = field844[Statics.field4433 + 1];
            class62 var32 = class106.method5888(var30, var31);
            if (var32 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = var32.field467;
                field844[++Statics.field4433 - 1] = var32.field466;
                field845[++Statics.field1512 - 1] = var32.field471 == null ? "" : var32.field471;
                field845[++Statics.field1512 - 1] = var32.field469 == null ? "" : var32.field469;
                field845[++Statics.field1512 - 1] = var32.field474 == null ? "" : var32.field474;
                field844[++Statics.field4433 - 1] = var32.method1080() ? 1 : (var32.method1083() ? 2 : 0);
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field844[--Statics.field4433];
            class62 var34 = class106.method289(var33);
            if (var34 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = var34.field468;
                field844[++Statics.field4433 - 1] = var34.field466;
                field845[++Statics.field1512 - 1] = var34.field471 == null ? "" : var34.field471;
                field845[++Statics.field1512 - 1] = var34.field469 == null ? "" : var34.field469;
                field845[++Statics.field1512 - 1] = var34.field474 == null ? "" : var34.field474;
                field844[++Statics.field4433 - 1] = var34.method1080() ? 1 : (var34.method1083() ? 2 : 0);
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("em.ap(ILbz;ZI)I")
    public static int method2950(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field844[++Statics.field4433 - 1] = client.method163();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field844[--Statics.field4433];
            if (var3 == 1 || var3 == 2) {
                client.method3081(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field844[++Statics.field4433 - 1] = Statics.field4526.method2302();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field844[--Statics.field4433];
            if (var4 == 1 || var4 == 2) {
                Statics.field4526.method2354(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field4433--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dj.as(ILbz;ZI)I")
    public static int method2655(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field4433 -= 2;
            int var3 = field844[Statics.field4433];
            int var4 = field844[Statics.field4433 + 1];
            if (!client.field758) {
                client.field619 = var3;
                client.field530 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field844[++Statics.field4433 - 1] = client.field619;
            return 1;
        } else if (arg0 == 5506) {
            field844[++Statics.field4433 - 1] = client.field530;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field844[--Statics.field4433];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field581 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field844[++Statics.field4433 - 1] = client.field581;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.aq(ILbz;ZB)I")
    public static int method472(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field554 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kx.al(IB)I")
    public static int method5181(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("fe.ag(IB)I")
    public static int method2974(int arg0) {
        return (int) ((Math.log((double) arg0) / field854 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("jk.am(ILbz;ZI)I")
    public static int method4863(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field4433 -= 2;
            client.field765 = (short) method5181(field844[Statics.field4433]);
            if (client.field765 <= 0) {
                client.field765 = 256;
            }
            client.field650 = (short) method5181(field844[Statics.field4433 + 1]);
            if (client.field650 <= 0) {
                client.field650 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field4433 -= 2;
            client.field767 = (short) field844[Statics.field4433];
            if (client.field767 <= 0) {
                client.field767 = 256;
            }
            client.field659 = (short) field844[Statics.field4433 + 1];
            if (client.field659 <= 0) {
                client.field659 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field4433 -= 4;
            client.field602 = (short) field844[Statics.field4433];
            if (client.field602 <= 0) {
                client.field602 = 1;
            }
            client.field770 = (short) field844[Statics.field4433 + 1];
            if (client.field770 <= 0) {
                client.field770 = 32767;
            } else if (client.field770 < client.field602) {
                client.field770 = client.field602;
            }
            client.field563 = (short) field844[Statics.field4433 + 2];
            if (client.field563 <= 0) {
                client.field563 = 1;
            }
            client.field772 = (short) field844[Statics.field4433 + 3];
            if (client.field772 <= 0) {
                client.field772 = 32767;
            } else if (client.field772 < client.field563) {
                client.field772 = client.field563;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field679 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = -1;
            } else {
                client.method688(0, 0, client.field679.field3470, client.field679.field3498, false);
                field844[++Statics.field4433 - 1] = client.field775;
                field844[++Statics.field4433 - 1] = client.field536;
            }
            return 1;
        } else if (arg0 == 6204) {
            field844[++Statics.field4433 - 1] = client.field767;
            field844[++Statics.field4433 - 1] = client.field659;
            return 1;
        } else if (arg0 == 6205) {
            field844[++Statics.field4433 - 1] = method2974(client.field765);
            field844[++Statics.field4433 - 1] = method2974(client.field650);
            return 1;
        } else if (arg0 == 6220) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field844[++Statics.field4433 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field844[++Statics.field4433 - 1] = Statics.field223;
            return 1;
        } else if (arg0 == 6223) {
            field844[++Statics.field4433 - 1] = Statics.field59;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.az(ILbz;ZI)I")
    public static int method2159(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field844[++Statics.field4433 - 1] = class65.method5927() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class65 var3 = class65.method583();
            if (var3 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
            } else {
                field844[++Statics.field4433 - 1] = var3.field806;
                field844[++Statics.field4433 - 1] = var3.field803;
                field845[++Statics.field1512 - 1] = var3.field804;
                field844[++Statics.field4433 - 1] = var3.field796;
                field844[++Statics.field4433 - 1] = var3.field809;
                field845[++Statics.field1512 - 1] = var3.field805;
            }
            return 1;
        } else if (arg0 == 6502) {
            class65 var4 = Statics.method4151();
            if (var4 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
            } else {
                field844[++Statics.field4433 - 1] = var4.field806;
                field844[++Statics.field4433 - 1] = var4.field803;
                field845[++Statics.field1512 - 1] = var4.field804;
                field844[++Statics.field4433 - 1] = var4.field796;
                field844[++Statics.field4433 - 1] = var4.field809;
                field845[++Statics.field1512 - 1] = var4.field805;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field844[--Statics.field4433];
            class65 var6 = null;
            for (int var7 = 0; var7 < class65.field798; var7++) {
                if (Statics.field4595[var7].field806 == var5) {
                    var6 = Statics.field4595[var7];
                    break;
                }
            }
            if (var6 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
            } else {
                field844[++Statics.field4433 - 1] = var6.field806;
                field844[++Statics.field4433 - 1] = var6.field803;
                field845[++Statics.field1512 - 1] = var6.field804;
                field844[++Statics.field4433 - 1] = var6.field796;
                field844[++Statics.field4433 - 1] = var6.field809;
                field845[++Statics.field1512 - 1] = var6.field805;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field4433 -= 4;
            int var8 = field844[Statics.field4433];
            boolean var9 = field844[Statics.field4433 + 1] == 1;
            int var10 = field844[Statics.field4433 + 2];
            boolean var11 = field844[Statics.field4433 + 3] == 1;
            class65.method3218(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field844[--Statics.field4433];
            if (var12 >= 0 && var12 < class65.field798) {
                class65 var13 = Statics.field4595[var12];
                field844[++Statics.field4433 - 1] = var13.field806;
                field844[++Statics.field4433 - 1] = var13.field803;
                field845[++Statics.field1512 - 1] = var13.field804;
                field844[++Statics.field4433 - 1] = var13.field796;
                field844[++Statics.field4433 - 1] = var13.field809;
                field845[++Statics.field1512 - 1] = var13.field805;
            } else {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
                field844[++Statics.field4433 - 1] = 0;
                field844[++Statics.field4433 - 1] = 0;
                field845[++Statics.field1512 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field652 = field844[--Statics.field4433] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field4433 -= 2;
            int var14 = field844[Statics.field4433];
            int var15 = field844[Statics.field4433 + 1];
            class191 var16 = class191.method4313(var15);
            if (var16.method3342()) {
                field845[++Statics.field1512 - 1] = class185.method3209(var14).method3245(var15, var16.field2048);
            } else {
                field844[++Statics.field4433 - 1] = class185.method3209(var14).method3244(var15, var16.field2050);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field4433 -= 2;
            int var17 = field844[Statics.field4433];
            int var18 = field844[Statics.field4433 + 1];
            class191 var19 = class191.method4313(var18);
            if (var19.method3342()) {
                field845[++Statics.field1512 - 1] = class194.method2141(var17).method3420(var18, var19.field2048);
            } else {
                field844[++Statics.field4433 - 1] = class194.method2141(var17).method3444(var18, var19.field2050);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field4433 -= 2;
            int var20 = field844[Statics.field4433];
            int var21 = field844[Statics.field4433 + 1];
            class191 var22 = class191.method4313(var21);
            if (var22.method3342()) {
                field845[++Statics.field1512 - 1] = class195.method5052(var20).method3479(var21, var22.field2048);
            } else {
                field844[++Statics.field4433 - 1] = class195.method5052(var20).method3478(var21, var22.field2050);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field4433 -= 2;
            int var23 = field844[Statics.field4433];
            int var24 = field844[Statics.field4433 + 1];
            class191 var25 = class191.method4313(var24);
            if (var25.method3342()) {
                field845[++Statics.field1512 - 1] = class192.method3706(var23).method3352(var24, var25.field2048);
            } else {
                field844[++Statics.field4433 - 1] = class192.method3706(var23).method3353(var24, var25.field2050);
            }
            return 1;
        } else if (arg0 == 6518) {
            field844[++Statics.field4433 - 1] = client.field498 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field844[++Statics.field4433 - 1] = client.field562;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1512--;
            Statics.field4433--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1512--;
            Statics.field4433--;
            return 1;
        } else if (arg0 == 6524) {
            field844[++Statics.field4433 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field844[++Statics.field4433 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field844[++Statics.field4433 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field844[++Statics.field4433 - 1] = client.field574;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mh.ab(ILbz;ZI)I")
    public static int method6015(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field478;
            int var4 = (Statics.field3404.field1163 >> 7) + Statics.field142;
            int var5 = (Statics.field3404.field1138 >> 7) + Statics.field1754;
            client.method5958().method7234(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field844[--Statics.field4433];
            String var7 = "";
            class235 var8 = client.method5958().method7240(var6);
            if (var8 != null) {
                var7 = var8.method4389();
            }
            field845[++Statics.field1512 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field844[--Statics.field4433];
            client.method5958().method7253(var9);
            return 1;
        } else if (arg0 == 6603) {
            field844[++Statics.field4433 - 1] = client.method5958().method7237();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field844[--Statics.field4433];
            client.method5958().method7222(var10);
            return 1;
        } else if (arg0 == 6605) {
            field844[++Statics.field4433 - 1] = client.method5958().method7239() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class294 var11 = new class294(field844[--Statics.field4433]);
            client.method5958().method7241(var11.field3397, var11.field3396);
            return 1;
        } else if (arg0 == 6607) {
            class294 var12 = new class294(field844[--Statics.field4433]);
            client.method5958().method7242(var12.field3397, var12.field3396);
            return 1;
        } else if (arg0 == 6608) {
            class294 var13 = new class294(field844[--Statics.field4433]);
            client.method5958().method7243(var13.field3395, var13.field3397, var13.field3396);
            return 1;
        } else if (arg0 == 6609) {
            class294 var14 = new class294(field844[--Statics.field4433]);
            client.method5958().method7244(var14.field3395, var14.field3397, var14.field3396);
            return 1;
        } else if (arg0 == 6610) {
            field844[++Statics.field4433 - 1] = client.method5958().method7245();
            field844[++Statics.field4433 - 1] = client.method5958().method7246();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field844[--Statics.field4433];
            class235 var16 = client.method5958().method7240(var15);
            if (var16 == null) {
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = var16.method4398().method5143();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field844[--Statics.field4433];
            class235 var18 = client.method5958().method7240(var17);
            if (var18 == null) {
                field844[++Statics.field4433 - 1] = 0;
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = (var18.method4393() - var18.method4458() + 1) * 64;
                field844[++Statics.field4433 - 1] = (var18.method4395() - var18.method4413() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field844[--Statics.field4433];
            class235 var20 = client.method5958().method7240(var19);
            if (var20 == null) {
                field844[++Statics.field4433 - 1] = 0;
                field844[++Statics.field4433 - 1] = 0;
                field844[++Statics.field4433 - 1] = 0;
                field844[++Statics.field4433 - 1] = 0;
            } else {
                field844[++Statics.field4433 - 1] = var20.method4458() * 64;
                field844[++Statics.field4433 - 1] = var20.method4413() * 64;
                field844[++Statics.field4433 - 1] = var20.method4393() * 64 + 64 - 1;
                field844[++Statics.field4433 - 1] = var20.method4395() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field844[--Statics.field4433];
            class235 var22 = client.method5958().method7240(var21);
            if (var22 == null) {
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var22.method4391();
            }
            return 1;
        } else if (arg0 == 6615) {
            class294 var23 = client.method5958().method7247();
            if (var23 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var23.field3397;
                field844[++Statics.field4433 - 1] = var23.field3396;
            }
            return 1;
        } else if (arg0 == 6616) {
            field844[++Statics.field4433 - 1] = client.method5958().method7220();
            return 1;
        } else if (arg0 == 6617) {
            class294 var24 = new class294(field844[--Statics.field4433]);
            class235 var25 = client.method5958().method7225();
            if (var25 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4383(var24.field3395, var24.field3397, var24.field3396);
            if (var26 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var26[0];
                field844[++Statics.field4433 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class294 var27 = new class294(field844[--Statics.field4433]);
            class235 var28 = client.method5958().method7225();
            if (var28 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = -1;
                return 1;
            }
            class294 var29 = var28.method4434(var27.field3397, var27.field3396);
            if (var29 == null) {
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var29.method5143();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field4433 -= 2;
            int var30 = field844[Statics.field4433];
            class294 var31 = new class294(field844[Statics.field4433 + 1]);
            method5959(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field4433 -= 2;
            int var32 = field844[Statics.field4433];
            class294 var33 = new class294(field844[Statics.field4433 + 1]);
            method5959(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field4433 -= 2;
            int var34 = field844[Statics.field4433];
            class294 var35 = new class294(field844[Statics.field4433 + 1]);
            class235 var36 = client.method5958().method7240(var34);
            if (var36 == null) {
                field844[++Statics.field4433 - 1] = 0;
                return 1;
            } else {
                field844[++Statics.field4433 - 1] = var36.method4417(var35.field3395, var35.field3397, var35.field3396) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field844[++Statics.field4433 - 1] = client.method5958().method7248();
            field844[++Statics.field4433 - 1] = client.method5958().method7249();
            return 1;
        } else if (arg0 == 6623) {
            class294 var37 = new class294(field844[--Statics.field4433]);
            class235 var38 = client.method5958().method7351(var37.field3395, var37.field3397, var37.field3396);
            if (var38 == null) {
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var38.method4397();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method5958().method7250(field844[--Statics.field4433]);
            return 1;
        } else if (arg0 == 6625) {
            client.method5958().method7235();
            return 1;
        } else if (arg0 == 6626) {
            client.method5958().method7252(field844[--Statics.field4433]);
            return 1;
        } else if (arg0 == 6627) {
            client.method5958().method7282();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field844[--Statics.field4433] == 1;
            client.method5958().method7344(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field844[--Statics.field4433];
            client.method5958().method7402(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field844[--Statics.field4433];
            client.method5958().method7368(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method5958().method7257();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field844[--Statics.field4433] == 1;
            client.method5958().method7258(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field4433 -= 2;
            int var43 = field844[Statics.field4433];
            boolean var44 = field844[Statics.field4433 + 1] == 1;
            client.method5958().method7259(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field4433 -= 2;
            int var45 = field844[Statics.field4433];
            boolean var46 = field844[Statics.field4433 + 1] == 1;
            client.method5958().method7260(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field844[++Statics.field4433 - 1] = client.method5958().method7261() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.method5958().method7262(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field844[--Statics.field4433];
            field844[++Statics.field4433 - 1] = client.method5958().method7263(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field4433 -= 2;
            int var49 = field844[Statics.field4433];
            class294 var50 = new class294(field844[Statics.field4433 + 1]);
            class294 var51 = client.method5958().method7266(var49, var50);
            if (var51 == null) {
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var51.method5143();
            }
            return 1;
        } else if (arg0 == 6639) {
            class253 var52 = client.method5958().method7268();
            if (var52 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var52.method4330();
                field844[++Statics.field4433 - 1] = var52.field2948.method5143();
            }
            return 1;
        } else if (arg0 == 6640) {
            class253 var53 = client.method5958().method7355();
            if (var53 == null) {
                field844[++Statics.field4433 - 1] = -1;
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var53.method4330();
                field844[++Statics.field4433 - 1] = var53.field2948.method5143();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field844[--Statics.field4433];
            class178 var55 = class178.method2234(var54);
            if (var55.field1879 == null) {
                field845[++Statics.field1512 - 1] = "";
            } else {
                field845[++Statics.field1512 - 1] = var55.field1879;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field844[--Statics.field4433];
            class178 var57 = class178.method2234(var56);
            field844[++Statics.field4433 - 1] = var57.field1881;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field844[--Statics.field4433];
            class178 var59 = class178.method2234(var58);
            if (var59 == null) {
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var59.field1896;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field844[--Statics.field4433];
            class178 var61 = class178.method2234(var60);
            if (var61 == null) {
                field844[++Statics.field4433 - 1] = -1;
            } else {
                field844[++Statics.field4433 - 1] = var61.field1877;
            }
            return 1;
        } else if (arg0 == 6697) {
            field844[++Statics.field4433 - 1] = Statics.field413.field2964;
            return 1;
        } else if (arg0 == 6698) {
            field844[++Statics.field4433 - 1] = Statics.field413.field2965.method5143();
            return 1;
        } else if (arg0 == 6699) {
            field844[++Statics.field4433 - 1] = Statics.field413.field2966.method5143();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bk.ai(ILbz;ZI)I")
    public static int method1102(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field844[--Statics.field4433];
            class185 var4 = class185.method3209(var3);
            field845[++Statics.field1512 - 1] = var4 == null ? "" : var4.field1960;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dw.au(ILbz;ZB)I")
    public static int method2704(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field844[--Statics.field4433];
            class194 var4 = class194.method2141(var3);
            field845[++Statics.field1512 - 1] = var4 == null ? "" : var4.field2092;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.aw(ILbz;ZI)I")
    public static int method1168(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("r.at(ILbz;ZB)I")
    public static int method61(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("lt.ar(ILbz;ZB)I")
    public static int method5698(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field844[++Statics.field4433 - 1] = client.method4721() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ij.ay(ILbz;ZB)I")
    public static int method4650(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ek.ax(ILbz;ZB)I")
    public static int method2827(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field844[--Statics.field4433] == 1;
            client.method159(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.aa(ILbz;ZB)I")
    public static int method388(int arg0, class76 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field844[--Statics.field4433];
            Object var45 = method2022(var44);
            int var46 = field844[--Statics.field4433];
            class458 var47 = client.method4311(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class460.method1772(var46);
            Statics.field891 = var47.method7613(var45, var48);
            if (Statics.field891 == null) {
                client.field786 = -1;
                Statics.field1306 = null;
                if (arg0 == 7500) {
                    field844[++Statics.field4433 - 1] = 0;
                }
            } else {
                client.field786 = class460.method7124(var46);
                Statics.field1306 = Statics.field891.iterator();
                if (arg0 == 7500) {
                    field844[++Statics.field4433 - 1] = Statics.field891.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field1306 != null && Statics.field1306.hasNext()) {
                field844[++Statics.field4433 - 1] = (Integer) Statics.field1306.next();
            } else {
                field844[++Statics.field4433 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field4433 -= 3;
            int var3 = field844[Statics.field4433];
            int var4 = field844[Statics.field4433 + 1];
            int var5 = field844[Statics.field4433 + 2];
            int var6 = class460.method7124(var4);
            int var7 = class460.method5730(var4);
            int var8 = class460.method1772(var4);
            class459 var9 = class459.method2951(var3);
            class457 var10 = class457.method816(var6);
            int[] var11 = var10.field4841[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method7619(var7);
            if (var14 == null && var10.field4843 != null) {
                var14 = var10.field4843[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class454 var17 = class452.method4310(var16);
                    if (class454.field4837 == var17) {
                        field845[++Statics.field1512 - 1] = "";
                    } else {
                        field844[++Statics.field4433 - 1] = Statics.method5983(var16);
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
                class454 var21 = class452.method4310(var11[var19]);
                if (class454.field4837 == var21) {
                    field845[++Statics.field1512 - 1] = (String) var14[var20];
                } else {
                    field844[++Statics.field4433 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field4433 -= 2;
            int var22 = field844[Statics.field4433];
            int var23 = field844[Statics.field4433 + 1];
            int var24 = 0;
            int var25 = class460.method7124(var23);
            int var26 = class460.method5730(var23);
            class459 var27 = class459.method2951(var22);
            class457 var28 = class457.method816(var25);
            int[] var29 = var28.field4841[var26];
            Object[] var30 = var27.method7619(var26);
            if (var30 == null && var28.field4843 != null) {
                var30 = var28.field4843[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field844[++Statics.field4433 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field4433--;
            int var41 = field844[Statics.field4433];
            class458 var42 = client.method3091(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field891 = var42.method7613(0, 0);
            int var43 = 0;
            if (Statics.field891 != null) {
                client.field786 = var41;
                Statics.field1306 = Statics.field891.iterator();
                var43 = Statics.field891.size();
            }
            if (arg0 == 7504) {
                field844[++Statics.field4433 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field844[--Statics.field4433];
            class459 var32 = class459.method2951(var31);
            field844[++Statics.field4433 - 1] = var32.field4851;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field844[--Statics.field4433];
            int var34 = -1;
            if (Statics.field891 != null && var33 >= 0 && var33 < Statics.field891.size()) {
                var34 = (Integer) Statics.field891.get(var33);
            }
            field844[++Statics.field4433 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field844[--Statics.field4433];
            Object var36 = method2022(var35);
            int var37 = field844[--Statics.field4433];
            class458 var38 = client.method4311(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class460.method7124(var37) != client.field786) {
                throw new RuntimeException();
            } else if (Statics.field891 == null && Statics.field891.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class460.method1772(var37);
                List var40 = var38.method7613(var36, var39);
                Statics.field891 = new LinkedList(Statics.field891);
                if (var40 == null) {
                    Statics.field891.clear();
                } else {
                    Statics.field891.retainAll(var40);
                }
                Statics.field1306 = Statics.field891.iterator();
                if (arg0 == 7507) {
                    field844[++Statics.field4433 - 1] = Statics.field891.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ig.bx(ILbz;ZB)I")
    public static int method4713(int arg0, class76 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ed.bh(II)V")
    public static void method2937(int arg0) {
        if (arg0 == -1 || !class303.method4633(arg0)) {
            return;
        }
        class303[] var1 = Statics.field3615[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class303 var3 = var1[var2];
            if (var3.field3575 != null) {
                class85 var4 = new class85();
                var4.field1053 = var3;
                var4.field1045 = var3.field3575;
                method2474(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("mc.bm(ILki;ZB)V")
    public static void method5959(int arg0, class294 arg1, boolean arg2) {
        class235 var3 = client.method5958().method7240(arg0);
        int var4 = Statics.field3404.field1112;
        int var5 = (Statics.field3404.field1163 >> 7) + Statics.field142;
        int var6 = (Statics.field3404.field1138 >> 7) + Statics.field1754;
        class294 var7 = new class294(var4, var5, var6);
        client.method5958().method7228(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("gi.bp(Lqi;B)Ljava/lang/Object;")
    public static Object method3703(class454 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field4832) {
            case 0:
                return field844[--Statics.field4433];
            case 1:
                return field845[--Statics.field1512];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("bf.bl(II)Ljava/lang/Object;")
    public static Object method2022(int arg0) {
        return method3703((class454) class344.method4292(class454.method7587(), arg0));
    }
}
