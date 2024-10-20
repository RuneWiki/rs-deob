package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cc")
public class class71 {

    @ObfuscatedName("cc.au")
    public static int[] field838 = new int[5];

    @ObfuscatedName("cc.aa")
    public static int[][] field839 = new int[5][5000];

    @ObfuscatedName("cc.ac")
    public static int[] field840 = new int[1000];

    @ObfuscatedName("cc.az")
    public static String[] field841 = new String[1000];

    @ObfuscatedName("cc.av")
    public static int field835 = 0;

    @ObfuscatedName("cc.ax")
    public static class64[] field849 = new class64[50];

    @ObfuscatedName("cc.aq")
    public static Calendar field845 = Calendar.getInstance();

    @ObfuscatedName("cc.ai")
    public static final String[] field846 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cc.ae")
    public static boolean field847 = false;

    @ObfuscatedName("cc.an")
    public static boolean field843 = false;

    @ObfuscatedName("cc.ag")
    public static ArrayList field848 = new ArrayList();

    @ObfuscatedName("cc.ad")
    public static int field850 = 0;

    @ObfuscatedName("cc.bl")
    public static final double field853 = Math.log(2.0D);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.at(Ldo;B)V")
    public static void method3152(class88 arg0) {
        method5584(arg0, 500000, 475000);
    }

    @ObfuscatedName("mo.ah(Ldo;III)V")
    public static void method5584(class88 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1058;
        class79 var5;
        if (class525.method46(arg0.field1054)) {
            Statics.field1579 = (class260) var3[0];
            class178 var4 = class178.method3048(Statics.field1579.field2648);
            var5 = Statics.method6520(arg0.field1054, var4.field1827, var4.field1847);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class79.method2373(var6);
        }
        if (var5 != null) {
            method1165(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("cm.ar(Ldo;Ldt;IIB)V")
    public static void method1165(class88 arg0, class79 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1058;
        Statics.field5072 = 0;
        Statics.field1491 = 0;
        int var5 = -1;
        int[] var6 = arg1.field974;
        int[] var7 = arg1.field977;
        byte var8 = -1;
        field835 = 0;
        field847 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            Statics.field837 = new int[arg1.field980];
            int var11 = 0;
            Statics.field419 = new String[arg1.field976];
            int var12 = 0;
            for (int var13 = 1; var13 < var4.length; var13++) {
                if (var4[var13] instanceof Integer) {
                    int var14 = (Integer) var4[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1057;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1062;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1056 == null ? -1 : arg0.field1056.field3659;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1059;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1056 == null ? -1 : arg0.field1056.field3660;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1060 == null ? -1 : arg0.field1060.field3659;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1060 == null ? -1 : arg0.field1060.field3660;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1061;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1065;
                    }
                    Statics.field837[var11++] = var14;
                } else if (var4[var13] instanceof String) {
                    String var15 = (String) var4[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1063;
                    }
                    Statics.field419[var12++] = var15;
                }
            }
            field850 = arg0.field1064;
            while (true) {
                var10++;
                if (var10 > arg2) {
                    throw new RuntimeException();
                }
                var5++;
                int var59 = var6[var5];
                if (var59 >= 100) {
                    boolean var46;
                    if (arg1.field977[var5] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    int var47 = method3065(var59, arg1, var46);
                    switch(var47) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var59 == 0) {
                    field840[++Statics.field5072 - 1] = var7[var5];
                } else if (var59 == 1) {
                    int var16 = var7[var5];
                    field840[++Statics.field5072 - 1] = class333.field3554[var16];
                } else if (var59 == 2) {
                    int var17 = var7[var5];
                    class333.field3554[var17] = field840[--Statics.field5072];
                    Statics.method2100(var17);
                } else if (var59 == 3) {
                    field841[++Statics.field1491 - 1] = arg1.field978[var5];
                } else if (var59 == 6) {
                    var5 += var7[var5];
                } else if (var59 == 7) {
                    Statics.field5072 -= 2;
                    if (field840[Statics.field5072] != field840[Statics.field5072 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 8) {
                    Statics.field5072 -= 2;
                    if (field840[Statics.field5072] == field840[Statics.field5072 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 9) {
                    Statics.field5072 -= 2;
                    if (field840[Statics.field5072] < field840[Statics.field5072 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 10) {
                    Statics.field5072 -= 2;
                    if (field840[Statics.field5072] > field840[Statics.field5072 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 21) {
                    if (field835 == 0) {
                        return;
                    }
                    class64 var19 = field849[--field835];
                    arg1 = var19.field461;
                    var6 = arg1.field974;
                    var7 = arg1.field977;
                    var5 = var19.field454;
                    Statics.field837 = var19.field455;
                    Statics.field419 = var19.field456;
                } else if (var59 == 25) {
                    int var20 = var7[var5];
                    field840[++Statics.field5072 - 1] = class333.method2521(var20);
                } else if (var59 == 27) {
                    int var21 = var7[var5];
                    class333.method5310(var21, field840[--Statics.field5072]);
                } else if (var59 == 31) {
                    Statics.field5072 -= 2;
                    if (field840[Statics.field5072] <= field840[Statics.field5072 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 32) {
                    Statics.field5072 -= 2;
                    if (field840[Statics.field5072] >= field840[Statics.field5072 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 33) {
                    field840[++Statics.field5072 - 1] = Statics.field837[var7[var5]];
                } else if (var59 == 34) {
                    Statics.field837[var7[var5]] = field840[--Statics.field5072];
                } else if (var59 == 35) {
                    field841[++Statics.field1491 - 1] = Statics.field419[var7[var5]];
                } else if (var59 == 36) {
                    Statics.field419[var7[var5]] = field841[--Statics.field1491];
                } else if (var59 == 37) {
                    int var22 = var7[var5];
                    Statics.field1491 -= var22;
                    String var23 = class399.method5248(field841, Statics.field1491, var22);
                    field841[++Statics.field1491 - 1] = var23;
                } else if (var59 == 38) {
                    Statics.field5072--;
                } else if (var59 == 39) {
                    Statics.field1491--;
                } else if (var59 == 40) {
                    int var24 = var7[var5];
                    class79 var25 = class79.method2373(var24);
                    int[] var26 = new int[var25.field980];
                    String[] var27 = new String[var25.field976];
                    for (int var28 = 0; var28 < var25.field981; var28++) {
                        var26[var28] = field840[Statics.field5072 - var25.field981 + var28];
                    }
                    for (int var29 = 0; var29 < var25.field982; var29++) {
                        var27[var29] = field841[Statics.field1491 - var25.field982 + var29];
                    }
                    Statics.field5072 -= var25.field981;
                    Statics.field1491 -= var25.field982;
                    class64 var30 = new class64();
                    var30.field461 = arg1;
                    var30.field454 = var5;
                    var30.field455 = Statics.field837;
                    var30.field456 = Statics.field419;
                    field849[++field835 - 1] = var30;
                    arg1 = var25;
                    var6 = var25.field974;
                    var7 = var25.field977;
                    var5 = -1;
                    Statics.field837 = var26;
                    Statics.field419 = var27;
                } else if (var59 == 42) {
                    field840[++Statics.field5072 - 1] = Statics.field1821.method2652(var7[var5]);
                } else if (var59 == 43) {
                    Statics.field1821.method2666(var7[var5], field840[--Statics.field5072]);
                } else if (var59 == 44) {
                    int var31 = var7[var5] >> 16;
                    int var32 = var7[var5] & 0xFFFF;
                    int var33 = field840[--Statics.field5072];
                    if (var33 < 0 || var33 > 5000) {
                        throw new RuntimeException();
                    }
                    field838[var31] = var33;
                    byte var34 = -1;
                    if (var32 == 105) {
                        var34 = 0;
                    }
                    for (int var35 = 0; var35 < var33; var35++) {
                        field839[var31][var35] = var34;
                    }
                } else if (var59 == 45) {
                    int var36 = var7[var5];
                    int var37 = field840[--Statics.field5072];
                    if (var37 < 0 || var37 >= field838[var36]) {
                        throw new RuntimeException();
                    }
                    field840[++Statics.field5072 - 1] = field839[var36][var37];
                } else if (var59 == 46) {
                    int var38 = var7[var5];
                    Statics.field5072 -= 2;
                    int var39 = field840[Statics.field5072];
                    if (var39 < 0 || var39 >= field838[var38]) {
                        throw new RuntimeException();
                    }
                    field839[var38][var39] = field840[Statics.field5072 + 1];
                } else if (var59 == 47) {
                    String var40 = Statics.field1821.method2674(var7[var5]);
                    if (var40 == null) {
                        var40 = class364.field4153;
                    }
                    field841[++Statics.field1491 - 1] = var40;
                } else if (var59 == 48) {
                    Statics.field1821.method2655(var7[var5], field841[--Statics.field1491]);
                } else if (var59 == 49) {
                    String var41 = Statics.field1821.method2654(var7[var5]);
                    field841[++Statics.field1491 - 1] = var41;
                } else if (var59 == 50) {
                    Statics.field1821.method2653(var7[var5], field841[--Statics.field1491]);
                } else if (var59 == 60) {
                    class500 var42 = arg1.field983[var7[var5]];
                    class484 var43 = (class484) var42.method8134((long) field840[--Statics.field5072]);
                    if (var43 != null) {
                        var5 += var43.field4847;
                    }
                } else if (var59 == 74) {
                    Integer var44 = Statics.field4600.method3085(var7[var5]);
                    if (var44 == null) {
                        field840[++Statics.field5072 - 1] = -1;
                    } else {
                        field840[++Statics.field5072 - 1] = var44;
                    }
                } else if (var59 == 76) {
                    Integer var45 = Statics.field678.method7756(var7[var5]);
                    if (var45 == null) {
                        field840[++Statics.field5072 - 1] = -1;
                    } else {
                        field840[++Statics.field5072 - 1] = var45;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var57) {
            var9 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(arg1.field4849).append(" ");
            for (int var51 = field835 - 1; var51 >= 0; var51--) {
                var50.append("").append(field849[var51].field461.field4849).append(" ");
            }
            var50.append("").append(var8);
            class553.method6436(var50.toString(), var57);
        } finally {
            while (field848.size() > 0) {
                class103 var54 = (class103) field848.remove(0);
                client.method3721(var54.method2598(), var54.method2594(), var54.method2595(), var54.method2596(), "");
            }
            if (field847) {
                field847 = false;
                client.method8342();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class553.method6436("Warning: Script " + arg1.field975 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("fk.ao(ILdt;ZI)I")
    public static int method3065(int arg0, class79 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method869(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method5651(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method6201(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method7231(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method4466(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method12(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3055(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return Statics.method704(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method456(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3700(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2868(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method5651(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method6201(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method7231(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method4466(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method12(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3203(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method1109(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method3720(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2753(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2868(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method1793(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3157(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method7735(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1170(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method4018(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method6194(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method3781(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method4467(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method2367(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method7190(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method6218(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1867(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method125(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method2032(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method840(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method2836(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2989(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3002(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method2208(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method6159(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method242(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method3438(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method3064(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method3153(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method2251(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method3063(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method1103(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method136(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method5247(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.ab(ILdt;ZI)I")
    public static int method869(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field5072 -= 3;
            int var3 = field840[Statics.field5072];
            int var4 = field840[Statics.field5072 + 1];
            int var5 = field840[Statics.field5072 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class344 var6 = Statics.field1878.method5636(var3);
            if (var6.field3797 == null) {
                var6.field3797 = new class344[var5 + 1];
            }
            if (var6.field3797.length <= var5) {
                class344[] var7 = new class344[var5 + 1];
                for (int var8 = 0; var8 < var6.field3797.length; var8++) {
                    var7[var8] = var6.field3797[var8];
                }
                var6.field3797 = var7;
            }
            if (var5 > 0 && var6.field3797[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class344 var9 = new class344();
            var9.field3714 = var4;
            var9.field3725 = var9.field3659 = var6.field3659;
            var9.field3660 = var5;
            var9.field3749 = true;
            if (var4 == 12) {
                var9.method6038();
                var9.method6039().method5792(new class106(var9));
                var9.method6039().method5758(new class107(var9));
            }
            var6.field3797[var5] = var9;
            if (arg2) {
                Statics.field844 = var9;
            } else {
                Statics.field1303 = var9;
            }
            client.method3158(var6);
            return 1;
        } else if (arg0 == 101) {
            class344 var10 = arg2 ? Statics.field844 : Statics.field1303;
            class344 var11 = Statics.field1878.method5636(var10.field3659);
            var11.field3797[var10.field3660] = null;
            client.method3158(var11);
            return 1;
        } else if (arg0 == 102) {
            class344 var12 = Statics.field1878.method5636(field840[--Statics.field5072]);
            var12.field3797 = null;
            client.method3158(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field5072 -= 2;
            int var13 = field840[Statics.field5072];
            int var14 = field840[Statics.field5072 + 1];
            class344 var15 = Statics.field1878.method5630(var13, var14);
            if (var15 == null || var14 == -1) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = 1;
                if (arg2) {
                    Statics.field844 = var15;
                } else {
                    Statics.field1303 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class344 var16 = Statics.field1878.method5636(field840[--Statics.field5072]);
            if (var16 == null) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = 1;
                if (arg2) {
                    Statics.field844 = var16;
                } else {
                    Statics.field1303 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mr.au(ILdt;ZB)I")
    public static int method5651(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class344 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field840[--Statics.field5072];
            var4 = Statics.field1878.method5636(var3);
        } else {
            var4 = arg2 ? Statics.field844 : Statics.field1303;
        }
        if (arg0 == 1000) {
            Statics.field5072 -= 4;
            var4.field3803 = field840[Statics.field5072];
            var4.field3670 = field840[Statics.field5072 + 1];
            var4.field3665 = field840[Statics.field5072 + 2];
            var4.field3666 = field840[Statics.field5072 + 3];
            client.method3158(var4);
            Statics.field3544.method1434(var4);
            if (var3 != -1 && var4.field3714 == 0) {
                client.method2981(Statics.field1878.field3569[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field5072 -= 4;
            var4.field3671 = field840[Statics.field5072];
            var4.field3672 = field840[Statics.field5072 + 1];
            var4.field3667 = field840[Statics.field5072 + 2];
            var4.field3668 = field840[Statics.field5072 + 3];
            client.method3158(var4);
            Statics.field3544.method1434(var4);
            if (var3 != -1 && var4.field3714 == 0) {
                client.method2981(Statics.field1878.field3569[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field840[--Statics.field5072] == 1;
            if (var4.field3788 != var5) {
                var4.field3788 = var5;
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3807 = field840[--Statics.field5072] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3808 = field840[--Statics.field5072] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nm.aa(ILdt;ZI)I")
    public static int method6201(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class344 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field840[--Statics.field5072];
            var4 = Statics.field1878.method5636(var3);
        } else {
            var4 = arg2 ? Statics.field844 : Statics.field1303;
        }
        if (arg0 == 1100) {
            Statics.field5072 -= 2;
            int var5 = field840[Statics.field5072];
            int var6 = field840[Statics.field5072 + 1];
            if (var4.field3714 == 12) {
                class342 var7 = var4.method6039();
                if (var7 != null && var7.method5721(var5, var6)) {
                    client.method3158(var4);
                }
            } else {
                var4.field3681 = var5;
                if (var4.field3681 > var4.field3683 - var4.field3675) {
                    var4.field3681 = var4.field3683 - var4.field3675;
                }
                if (var4.field3681 < 0) {
                    var4.field3681 = 0;
                }
                var4.field3738 = var6;
                if (var4.field3738 > var4.field3652 - var4.field3676) {
                    var4.field3738 = var4.field3652 - var4.field3676;
                }
                if (var4.field3738 < 0) {
                    var4.field3738 = 0;
                }
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3811 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3710 = field840[--Statics.field5072] == 1;
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3691 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3693 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3695 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3698 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3699 = field840[--Statics.field5072] == 1;
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3712 = 1;
            var4.field3689 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field5072 -= 6;
            var4.field3719 = field840[Statics.field5072];
            var4.field3711 = field840[Statics.field5072 + 1];
            var4.field3651 = field840[Statics.field5072 + 2];
            var4.field3713 = field840[Statics.field5072 + 3];
            var4.field3739 = field840[Statics.field5072 + 4];
            var4.field3742 = field840[Statics.field5072 + 5];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field840[--Statics.field5072];
            if (var4.field3708 != var8) {
                var4.field3708 = var8;
                var4.field3692 = 0;
                var4.field3729 = 0;
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3684 = field840[--Statics.field5072] == 1;
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field841[--Statics.field1491];
            if (var4.field3714 == 12) {
                class342 var10 = var4.method6039();
                if (var10 != null && var10.method5745()) {
                    var10.method5714(var9);
                } else {
                    var4.field3723 = var9;
                }
                client.method3158(var4);
            } else if (!var9.equals(var4.field3723)) {
                var4.field3723 = var9;
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3768 = field840[--Statics.field5072];
            if (var4.field3714 == 12) {
                class342 var11 = var4.method6039();
                if (var11 != null) {
                    var11.method5737();
                }
            }
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field5072 -= 3;
            if (var4.field3714 == 12) {
                class342 var12 = var4.method6039();
                if (var12 != null) {
                    var12.method5722(field840[Statics.field5072], field840[Statics.field5072 + 1]);
                    var12.method5723(field840[Statics.field5072 + 2]);
                }
            } else {
                var4.field3726 = field840[Statics.field5072];
                var4.field3727 = field840[Statics.field5072 + 1];
                var4.field3796 = field840[Statics.field5072 + 2];
            }
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3782 = field840[--Statics.field5072] == 1;
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3700 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3701 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3702 = field840[--Statics.field5072] == 1;
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3776 = field840[--Statics.field5072] == 1;
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field5072 -= 2;
            var4.field3683 = field840[Statics.field5072];
            var4.field3652 = field840[Statics.field5072 + 1];
            client.method3158(var4);
            if (var3 != -1 && var4.field3714 == 0) {
                client.method2981(Statics.field1878.field3569[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method100(var4.field3659, var4.field3660);
            client.field663 = var4;
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3696 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3686 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3704 = field840[--Statics.field5072];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field840[--Statics.field5072];
            class539 var14 = (class539) class385.method164(class539.method5249(), var13);
            if (var14 != null) {
                var4.field3690 = var14;
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field840[--Statics.field5072] == 1;
            var4.field3694 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field840[--Statics.field5072] == 1;
            var4.field3720 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3697 = field841[--Statics.field1491];
            client.method3158(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6023(field841[--Statics.field1491], Statics.field423, client.method5246());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field5072 -= 2;
            var4.method6046(field840[Statics.field5072], field840[Statics.field5072 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6132(field841[--Statics.field1491], field840[--Statics.field5072]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field5072--;
            class337 var17 = var4.method6075();
            if (var17 != null) {
                var17.field3581 = field840[Statics.field5072];
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field5072--;
            class337 var18 = var4.method6075();
            if (var18 != null) {
                var18.field3579 = field840[Statics.field5072];
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field1491--;
            class342 var19 = var4.method6039();
            if (var19 != null) {
                var4.field3724 = field841[Statics.field1491];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field5072--;
            class337 var20 = var4.method6075();
            if (var20 != null) {
                var20.field3580 = field840[Statics.field5072];
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field5072--;
            class342 var21 = var4.method6039();
            if (var21 != null && var21.method5718(field840[Statics.field5072])) {
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field5072--;
            class342 var22 = var4.method6039();
            if (var22 != null && var22.method5904(field840[Statics.field5072])) {
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field5072--;
            class342 var23 = var4.method6039();
            if (var23 != null && var23.method5720(field840[Statics.field5072])) {
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field840[--Statics.field5072] == 1;
            client.field726.method3929();
            class342 var25 = var4.method6039();
            if (var25 != null && var25.method5712(var24)) {
                if (var24) {
                    client.field726.method3928(var4);
                }
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field840[--Statics.field5072] == 1;
            if (!var26 && client.field726.method3942() == var4) {
                client.field726.method3929();
                client.method3158(var4);
            }
            class342 var27 = var4.method6039();
            if (var27 != null) {
                var27.method5965(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field5072 -= 2;
            class342 var28 = var4.method6039();
            if (var28 != null && var28.method5736(field840[Statics.field5072], field840[Statics.field5072 + 1])) {
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field5072--;
            class342 var29 = var4.method6039();
            if (var29 != null && var29.method5736(field840[Statics.field5072], field840[Statics.field5072])) {
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field5072--;
            class342 var30 = var4.method6039();
            if (var30 != null) {
                var30.method5764(field840[Statics.field5072]);
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field5072--;
            class342 var31 = var4.method6039();
            if (var31 != null) {
                var31.method5724(field840[Statics.field5072]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field5072--;
            class342 var32 = var4.method6039();
            if (var32 != null) {
                var32.method5727(field840[Statics.field5072]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field5072--;
            class342 var33 = var4.method6039();
            if (var33 != null) {
                var33.method5726(field840[Statics.field5072]);
                client.method3158(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field5072 -= 2;
            class28 var34 = var4.method6041();
            if (var34 != null) {
                var34.method398(field840[Statics.field5072], field840[Statics.field5072 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field5072 -= 2;
            class28 var35 = var4.method6041();
            if (var35 != null) {
                var35.method400((char) field840[Statics.field5072], field840[Statics.field5072 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6024(field841[--Statics.field1491], Statics.field423);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qj.ac(ILdt;ZI)I")
    public static int method7231(int arg0, class79 arg1, boolean arg2) {
        class344 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field1878.method5636(field840[--Statics.field5072]);
        } else {
            var3 = arg2 ? Statics.field844 : Statics.field1303;
        }
        client.method3158(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field5072 -= 2;
            int var9 = field840[Statics.field5072];
            int var10 = field840[Statics.field5072 + 1];
            var3.field3793 = var9;
            var3.field3794 = var10;
            class203 var11 = class203.method3907(var9);
            var3.field3651 = var11.field2179;
            var3.field3713 = var11.field2129;
            var3.field3739 = var11.field2147;
            var3.field3719 = var11.field2145;
            var3.field3711 = var11.field2149;
            var3.field3742 = var11.field2144;
            if (arg0 == 1205) {
                var3.field3721 = 0;
            } else if (arg0 == 1212 | var11.field2151 == 1) {
                var3.field3721 = 1;
            } else {
                var3.field3721 = 2;
            }
            if (var3.field3685 > 0) {
                var3.field3742 = var3.field3742 * 32 / var3.field3685;
            } else if (var3.field3671 > 0) {
                var3.field3742 = var3.field3742 * 32 / var3.field3671;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3712 = 2;
            var3.field3689 = field840[--Statics.field5072];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3712 = 3;
            var3.field3689 = Statics.field2420.field1100.method5689();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field840[--Statics.field5072] == 1;
            class344.method284(var3, Statics.field2420.field1100, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field840[--Statics.field5072];
            if (var3.field3718 == null) {
                throw new RuntimeException("");
            }
            class344.method4444(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field5072 -= 2;
            int var6 = field840[Statics.field5072];
            int var7 = field840[Statics.field5072 + 1];
            if (var3.field3718 == null) {
                throw new RuntimeException("");
            }
            Statics.method5315(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field840[--Statics.field5072];
            if (var3.field3718 == null) {
                throw new RuntimeException("");
            }
            class344.method5306(var3, Statics.field2420.field1100.field3601, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jy.al(ILdt;ZI)I")
    public static int method4466(int arg0, class79 arg1, boolean arg2) {
        boolean var3 = true;
        class344 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.field1878.method5636(field840[--Statics.field5072]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field844 : Statics.field1303;
        }
        if (arg0 == 1300) {
            int var5 = field840[--Statics.field5072] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method6020(var5, field841[--Statics.field1491]);
                return 1;
            } else {
                Statics.field1491--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field5072 -= 2;
            int var6 = field840[Statics.field5072];
            int var7 = field840[Statics.field5072 + 1];
            var4.field3715 = Statics.field1878.method5630(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3745 = field840[--Statics.field5072] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3716 = field840[--Statics.field5072];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3744 = field840[--Statics.field5072];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3740 = field841[--Statics.field1491];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3746 = field841[--Statics.field1491];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3741 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3775 = field840[--Statics.field5072] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field5072--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field5072 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field840[Statics.field5072 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field840[Statics.field5072 + var10];
                        var9[var10 / 2] = (byte) field840[Statics.field5072 + var10 + 1];
                    }
                }
            } else {
                Statics.field5072 -= 2;
                var8 = new byte[] { (byte) field840[Statics.field5072] };
                var9 = new byte[] { (byte) field840[Statics.field5072 + 1] };
            }
            int var11 = field840[--Statics.field5072] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method3249(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field5072 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field840[Statics.field5072] };
            byte[] var14 = new byte[] { (byte) field840[Statics.field5072 + 1] };
            method3249(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field5072 -= 3;
            int var15 = field840[Statics.field5072] - 1;
            int var16 = field840[Statics.field5072 + 1];
            int var17 = field840[Statics.field5072 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method4517(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field840[--Statics.field5072];
            int var20 = field840[--Statics.field5072];
            method4517(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field5072--;
            int var21 = field840[Statics.field5072] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method2996(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method2996(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gc.az(Lnn;I[B[BI)V")
    public static final void method3249(class344 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3736 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3736 = new byte[11][];
            arg0.field3705 = new byte[11][];
            arg0.field3673 = new int[11];
            arg0.field3757 = new int[11];
        }
        arg0.field3736[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3735 = false;
            for (int var4 = 0; var4 < arg0.field3736.length; var4++) {
                if (arg0.field3736[var4] != null) {
                    arg0.field3735 = true;
                    break;
                }
            }
        } else {
            arg0.field3735 = true;
        }
        arg0.field3705[arg1] = arg3;
    }

    @ObfuscatedName("jx.ap(Lnn;IIII)V")
    public static final void method4517(class344 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3673 == null) {
            throw new RuntimeException();
        }
        arg0.field3673[arg1] = arg2;
        arg0.field3757[arg1] = arg3;
    }

    @ObfuscatedName("fr.av(Lnn;II)V")
    public static final void method2996(class344 arg0, int arg1) {
        if (arg0.field3736 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3806 == null) {
            arg0.field3806 = new int[arg0.field3736.length];
        }
        arg0.field3806[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ah.ax(ILdt;ZI)I")
    public static int method12(int arg0, class79 arg1, boolean arg2) {
        class344 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field1878.method5636(field840[--Statics.field5072]);
        } else {
            var3 = arg2 ? Statics.field844 : Statics.field1303;
        }
        String var4 = field841[--Statics.field1491];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field840[--Statics.field5072];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field840[--Statics.field5072];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field841[--Statics.field1491];
            } else {
                var7[var8] = Integer.valueOf(field840[--Statics.field5072]);
            }
        }
        int var9 = field840[--Statics.field5072];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3781 = var7;
        } else if (arg0 == 1401) {
            var3.field3752 = var7;
        } else if (arg0 == 1402) {
            var3.field3751 = var7;
        } else if (arg0 == 1403) {
            var3.field3753 = var7;
        } else if (arg0 == 1404) {
            var3.field3755 = var7;
        } else if (arg0 == 1405) {
            var3.field3756 = var7;
        } else if (arg0 == 1406) {
            var3.field3759 = var7;
        } else if (arg0 == 1407) {
            var3.field3760 = var7;
            var3.field3654 = var5;
        } else if (arg0 == 1408) {
            var3.field3766 = var7;
        } else if (arg0 == 1409) {
            var3.field3767 = var7;
        } else if (arg0 == 1410) {
            var3.field3647 = var7;
        } else if (arg0 == 1411) {
            var3.field3750 = var7;
        } else if (arg0 == 1412) {
            var3.field3754 = var7;
        } else if (arg0 == 1414) {
            var3.field3762 = var7;
            var3.field3763 = var5;
        } else if (arg0 == 1415) {
            var3.field3743 = var7;
            var3.field3765 = var5;
        } else if (arg0 == 1416) {
            var3.field3758 = var7;
        } else if (arg0 == 1417) {
            var3.field3769 = var7;
        } else if (arg0 == 1418) {
            var3.field3770 = var7;
        } else if (arg0 == 1419) {
            var3.field3669 = var7;
        } else if (arg0 == 1420) {
            var3.field3774 = var7;
        } else if (arg0 == 1421) {
            var3.field3682 = var7;
        } else if (arg0 == 1422) {
            var3.field3778 = var7;
        } else if (arg0 == 1423) {
            var3.field3779 = var7;
        } else if (arg0 == 1424) {
            var3.field3780 = var7;
        } else if (arg0 == 1425) {
            var3.field3795 = var7;
        } else if (arg0 == 1426) {
            var3.field3783 = var7;
        } else if (arg0 == 1427) {
            var3.field3707 = var7;
        } else if (arg0 == 1428) {
            var3.field3677 = var7;
        } else if (arg0 == 1429) {
            var3.field3777 = var7;
        } else if (arg0 == 1430) {
            var3.field3772 = var7;
        } else if (arg0 == 1431) {
            var3.field3773 = var7;
        } else if (arg0 == 1434) {
            var3.field3784 = var7;
        } else if (arg0 == 1435) {
            var3.field3649 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class340 var10 = var3.method6118();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3593 = var7;
                } else if (arg0 == 1437) {
                    var10.field3589 = var7;
                } else if (arg0 == 1438) {
                    var10.field3596 = var7;
                } else if (arg0 == 1439) {
                    var10.field3592 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3747 = true;
        return 1;
    }

    @ObfuscatedName("ft.as(ILdt;ZI)I")
    public static int method3055(int arg0, class79 arg1, boolean arg2) {
        class344 var3 = arg2 ? Statics.field844 : Statics.field1303;
        if (arg0 == 1500) {
            field840[++Statics.field5072 - 1] = var3.field3761;
            return 1;
        } else if (arg0 == 1501) {
            field840[++Statics.field5072 - 1] = var3.field3674;
            return 1;
        } else if (arg0 == 1502) {
            field840[++Statics.field5072 - 1] = var3.field3675;
            return 1;
        } else if (arg0 == 1503) {
            field840[++Statics.field5072 - 1] = var3.field3676;
            return 1;
        } else if (arg0 == 1504) {
            field840[++Statics.field5072 - 1] = var3.field3788 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field840[++Statics.field5072 - 1] = var3.field3725;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.ak(ILdt;ZI)I")
    public static int method456(int arg0, class79 arg1, boolean arg2) {
        class344 var3 = arg2 ? Statics.field844 : Statics.field1303;
        if (arg0 == 1700) {
            field840[++Statics.field5072 - 1] = var3.field3793;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3793 == -1) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = var3.field3794;
            }
            return 1;
        } else if (arg0 == 1702) {
            field840[++Statics.field5072 - 1] = var3.field3660;
            return 1;
        } else if (arg0 == 1707) {
            field840[++Statics.field5072 - 1] = var3.method6033() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method5338(var3);
        } else if (arg0 == 1709) {
            return method6402(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lg.aj(Lnn;I)I")
    public static int method5338(class344 arg0) {
        if (arg0.field3714 == 11) {
            String var1 = field841[--Statics.field1491];
            field840[++Statics.field5072 - 1] = arg0.method6028(var1);
            return 1;
        } else {
            Statics.field1491--;
            field840[++Statics.field5072 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("oq.am(Lnn;B)I")
    public static int method6402(class344 arg0) {
        if (arg0.field3714 == 11) {
            String var1 = field841[--Statics.field1491];
            field841[++Statics.field1491 - 1] = arg0.method6116(var1);
            return 1;
        } else {
            field841[Statics.field1491 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("hv.aq(ILdt;ZI)I")
    public static int method3700(int arg0, class79 arg1, boolean arg2) {
        class344 var3 = arg2 ? Statics.field844 : Statics.field1303;
        if (arg0 == 1800) {
            field840[++Statics.field5072 - 1] = class345.method4103(client.method6207(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field840[--Statics.field5072];
            int var5 = var4 - 1;
            if (var3.field3741 == null || var5 >= var3.field3741.length || var3.field3741[var5] == null) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = var3.field3741[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3740 == null) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = var3.field3740;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ey.ai(ILdt;ZB)I")
    public static int method2868(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field850 >= 10) {
                throw new RuntimeException();
            }
            class344 var10;
            if (arg0 >= 2000) {
                var10 = Statics.field1878.method5636(field840[--Statics.field5072]);
            } else {
                var10 = arg2 ? Statics.field844 : Statics.field1303;
            }
            if (var10.field3707 == null) {
                return 0;
            }
            class88 var11 = new class88();
            var11.field1056 = var10;
            var11.field1058 = var10.field3707;
            var11.field1064 = field850 + 1;
            client.field702.method6547(var11);
            return 1;
        } else if (arg0 == 1928) {
            class344 var3 = arg2 ? Statics.field844 : Statics.field1303;
            int var4 = field840[--Statics.field5072];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class103 var5 = new class103(var4, var3.field3659, var3.field3660, var3.field3793);
            field848.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field5072 -= 3;
            int var6 = field840[Statics.field5072];
            int var7 = field840[Statics.field5072 + 1];
            int var8 = field840[Statics.field5072 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class103 var9 = new class103(var8, var6, var7, Statics.field1878.method5636(var6).field3793);
            field848.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gf.aw(ILdt;ZB)I")
    public static int method3203(int arg0, class79 arg1, boolean arg2) {
        class344 var3 = Statics.field1878.method5636(field840[--Statics.field5072]);
        if (arg0 == 2500) {
            field840[++Statics.field5072 - 1] = var3.field3761;
            return 1;
        } else if (arg0 == 2501) {
            field840[++Statics.field5072 - 1] = var3.field3674;
            return 1;
        } else if (arg0 == 2502) {
            field840[++Statics.field5072 - 1] = var3.field3675;
            return 1;
        } else if (arg0 == 2503) {
            field840[++Statics.field5072 - 1] = var3.field3676;
            return 1;
        } else if (arg0 == 2504) {
            field840[++Statics.field5072 - 1] = var3.field3788 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field840[++Statics.field5072 - 1] = var3.field3725;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.ae(ILdt;ZB)I")
    public static int method1109(int arg0, class79 arg1, boolean arg2) {
        class344 var3 = Statics.field1878.method5636(field840[--Statics.field5072]);
        if (arg0 == 2600) {
            field840[++Statics.field5072 - 1] = var3.field3681;
            return 1;
        } else if (arg0 == 2601) {
            field840[++Statics.field5072 - 1] = var3.field3738;
            return 1;
        } else if (arg0 == 2602) {
            field841[++Statics.field1491 - 1] = var3.field3723;
            return 1;
        } else if (arg0 == 2603) {
            field840[++Statics.field5072 - 1] = var3.field3683;
            return 1;
        } else if (arg0 == 2604) {
            field840[++Statics.field5072 - 1] = var3.field3652;
            return 1;
        } else if (arg0 == 2605) {
            field840[++Statics.field5072 - 1] = var3.field3742;
            return 1;
        } else if (arg0 == 2606) {
            field840[++Statics.field5072 - 1] = var3.field3651;
            return 1;
        } else if (arg0 == 2607) {
            field840[++Statics.field5072 - 1] = var3.field3739;
            return 1;
        } else if (arg0 == 2608) {
            field840[++Statics.field5072 - 1] = var3.field3713;
            return 1;
        } else if (arg0 == 2609) {
            field840[++Statics.field5072 - 1] = var3.field3691;
            return 1;
        } else if (arg0 == 2610) {
            field840[++Statics.field5072 - 1] = var3.field3704;
            return 1;
        } else if (arg0 == 2611) {
            field840[++Statics.field5072 - 1] = var3.field3811;
            return 1;
        } else if (arg0 == 2612) {
            field840[++Statics.field5072 - 1] = var3.field3686;
            return 1;
        } else if (arg0 == 2613) {
            field840[++Statics.field5072 - 1] = var3.field3690.method41();
            return 1;
        } else if (arg0 == 2614) {
            field840[++Statics.field5072 - 1] = var3.field3720 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class337 var4 = var3.method6075();
                field840[++Statics.field5072 - 1] = var4 == null ? 0 : var4.field3581;
            }
            if (arg0 == 2618) {
                class337 var5 = var3.method6075();
                field840[++Statics.field5072 - 1] = var5 == null ? 0 : var5.field3579;
                return 1;
            } else if (arg0 == 2619) {
                class342 var6 = var3.method6039();
                field841[++Statics.field1491 - 1] = var6 == null ? "" : var6.method5995().method6839();
                return 1;
            } else if (arg0 == 2620) {
                class337 var7 = var3.method6075();
                field840[++Statics.field5072 - 1] = var7 == null ? 0 : var7.field3580;
                return 1;
            } else if (arg0 == 2621) {
                class342 var8 = var3.method6039();
                field840[++Statics.field5072 - 1] = var8 == null ? 0 : var8.method5771();
                return 1;
            } else if (arg0 == 2622) {
                class342 var9 = var3.method6039();
                field840[++Statics.field5072 - 1] = var9 == null ? 0 : var9.method5979();
                return 1;
            } else if (arg0 == 2623) {
                class342 var10 = var3.method6039();
                field840[++Statics.field5072 - 1] = var10 == null ? 0 : var10.method5981();
                return 1;
            } else if (arg0 == 2624) {
                class342 var11 = var3.method6039();
                field840[++Statics.field5072 - 1] = var11 != null && var11.method5991() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class342 var12 = var3.method6039();
                field840[++Statics.field5072 - 1] = var12 != null && var12.method5760() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class342 var13 = var3.method6039();
                field841[++Statics.field1491 - 1] = var13 == null ? "" : var13.method5960().method7087();
                return 1;
            } else if (arg0 == 2627) {
                class342 var14 = var3.method6039();
                int var15 = var14 == null ? 0 : var14.method5767();
                int var16 = var14 == null ? 0 : var14.method5766();
                field840[++Statics.field5072 - 1] = Math.min(var15, var16);
                field840[++Statics.field5072 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class342 var17 = var3.method6039();
                field840[++Statics.field5072 - 1] = var17 == null ? 0 : var17.method5766();
                return 1;
            } else if (arg0 == 2629) {
                class342 var18 = var3.method6039();
                field840[++Statics.field5072 - 1] = var18 == null ? 0 : var18.method5775();
                return 1;
            } else if (arg0 == 2630) {
                class342 var19 = var3.method6039();
                field840[++Statics.field5072 - 1] = var19 == null ? 0 : var19.method5774();
                return 1;
            } else if (arg0 == 2631) {
                class342 var20 = var3.method6039();
                field840[++Statics.field5072 - 1] = var20 == null ? 0 : var20.method5776();
                return 1;
            } else if (arg0 == 2632) {
                class342 var21 = var3.method6039();
                field840[++Statics.field5072 - 1] = var21 == null ? 0 : var21.method5901();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method6041();
                field840[Statics.field5072 - 1] = var22 == null ? 0 : var22.method401(field840[Statics.field5072 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method6041();
                field840[Statics.field5072 - 1] = var23 == null ? 0 : var23.method408((char) field840[Statics.field5072 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("hd.an(ILdt;ZB)I")
    public static int method3720(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class344 var3 = Statics.field1878.method5636(field840[--Statics.field5072]);
            field840[++Statics.field5072 - 1] = var3.field3793;
            return 1;
        } else if (arg0 == 2701) {
            class344 var4 = Statics.field1878.method5636(field840[--Statics.field5072]);
            if (var4.field3793 == -1) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = var4.field3794;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field840[--Statics.field5072];
            class87 var6 = (class87) client.field659.method8154((long) var5);
            if (var6 == null) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field840[++Statics.field5072 - 1] = client.field505;
            return 1;
        } else if (arg0 == 2707) {
            class344 var7 = Statics.field1878.method5636(field840[--Statics.field5072]);
            field840[++Statics.field5072 - 1] = var7.method6033() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class344 var8 = Statics.field1878.method5636(field840[--Statics.field5072]);
            return method5338(var8);
        } else if (arg0 == 2709) {
            class344 var9 = Statics.field1878.method5636(field840[--Statics.field5072]);
            return method6402(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("el.ag(ILdt;ZS)I")
    public static int method2753(int arg0, class79 arg1, boolean arg2) {
        class344 var3 = Statics.field1878.method5636(field840[--Statics.field5072]);
        if (arg0 == 2800) {
            field840[++Statics.field5072 - 1] = class345.method4103(client.method6207(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field840[--Statics.field5072];
            int var5 = var4 - 1;
            if (var3.field3741 == null || var5 >= var3.field3741.length || var3.field3741[var5] == null) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = var3.field3741[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3740 == null) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = var3.field3740;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cr.ad(ILdt;ZI)I")
    public static int method1793(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field841[--Statics.field1491];
            class111.method6477(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field5072 -= 2;
            client.method4116(Statics.field2420, field840[Statics.field5072], field840[Statics.field5072 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field843) {
                field847 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field841[--Statics.field1491];
            int var5 = 0;
            if (class399.method5309(var4)) {
                var5 = class399.method6184(var4);
            }
            class308 var6 = class308.method2768(class306.field3183, client.field590.field1405);
            var6.field3243.method8396(var5);
            client.field590.method2719(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field841[--Statics.field1491];
            class308 var8 = class308.method2768(class306.field3222, client.field590.field1405);
            var8.field3243.method8393(var7.length() + 1);
            var8.field3243.method8400(var7);
            client.field590.method2719(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field841[--Statics.field1491];
            class308 var10 = class308.method2768(class306.field3161, client.field590.field1405);
            var10.field3243.method8393(var9.length() + 1);
            var10.field3243.method8400(var9);
            client.field590.method2719(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field840[--Statics.field5072];
            String var12 = field841[--Statics.field1491];
            client.method6788(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field5072 -= 3;
            int var13 = field840[Statics.field5072];
            int var14 = field840[Statics.field5072 + 1];
            int var15 = field840[Statics.field5072 + 2];
            class344 var16 = Statics.field1878.method5636(var15);
            client.method3372(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field5072 -= 2;
            int var17 = field840[Statics.field5072];
            int var18 = field840[Statics.field5072 + 1];
            class344 var19 = arg2 ? Statics.field844 : Statics.field1303;
            client.method3372(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field96 = field840[--Statics.field5072] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field840[++Statics.field5072 - 1] = Statics.field2450.method2413() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field2450.method2412(field840[--Statics.field5072] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field841[--Statics.field1491];
            boolean var21 = field840[--Statics.field5072] == 1;
            class32.method2529(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field840[--Statics.field5072];
            class308 var23 = class308.method2768(class306.field3185, client.field590.field1405);
            var23.field3243.method8394(var22);
            client.field590.method2719(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field840[--Statics.field5072];
            Statics.field1491 -= 2;
            String var25 = field841[Statics.field1491];
            String var26 = field841[Statics.field1491 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class308 var27 = class308.method2768(class306.field3158, client.field590.field1405);
                var27.field3243.method8394(1 + class527.method3196(var25) + class527.method3196(var26));
                var27.field3243.method8400(var26);
                var27.field3243.method8400(var25);
                var27.field3243.method8440(var24);
                client.field590.method2719(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field5072--;
            return 1;
        } else if (arg0 == 3118) {
            client.field685 = field840[--Statics.field5072] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field616 = field840[--Statics.field5072] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field840[--Statics.field5072] == 1) {
                client.field617 |= 0x1;
            } else {
                client.field617 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field840[--Statics.field5072] == 1) {
                client.field617 |= 0x2;
            } else {
                client.field617 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field840[--Statics.field5072] == 1) {
                client.field617 |= 0x4;
            } else {
                client.field617 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field840[--Statics.field5072] == 1) {
                client.field617 |= 0x8;
            } else {
                client.field617 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field617 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field609 = field840[--Statics.field5072] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field611 = field840[--Statics.field5072] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method7348(field840[--Statics.field5072] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field840[++Statics.field5072 - 1] = client.method6212() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field5072 -= 2;
            client.field583 = field840[Statics.field5072];
            client.field584 = field840[Statics.field5072 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field5072 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field5072--;
            return 1;
        } else if (arg0 == 3132) {
            field840[++Statics.field5072 - 1] = Statics.field4410;
            field840[++Statics.field5072 - 1] = Statics.field321;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field5072--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field5072 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field660 = 3;
            client.field661 = field840[--Statics.field5072];
            return 1;
        } else if (arg0 == 3137) {
            client.field660 = 2;
            client.field661 = field840[--Statics.field5072];
            return 1;
        } else if (arg0 == 3138) {
            client.field660 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field660 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field660 = 3;
            client.field661 = arg2 ? Statics.field844.field3659 : Statics.field1303.field3659;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field840[--Statics.field5072] == 1;
            Statics.field2450.method2455(var28);
            return 1;
        } else if (arg0 == 3142) {
            field840[++Statics.field5072 - 1] = Statics.field2450.method2415() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field840[--Statics.field5072] == 1;
            client.field540 = var29;
            if (!var29) {
                Statics.field2450.method2458("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field840[++Statics.field5072 - 1] = client.field540 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field840[--Statics.field5072] == 1;
            Statics.field2450.method2443(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field840[++Statics.field5072 - 1] = Statics.field2450.method2503() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field840[++Statics.field5072 - 1] = class76.field905;
            return 1;
        } else if (arg0 == 3154) {
            field840[++Statics.field5072 - 1] = client.method4415();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1491--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field5072 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field5072--;
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field5072--;
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1491--;
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field5072--;
            field841[++Statics.field1491 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field5072--;
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field5072 -= 2;
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field5072 -= 2;
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field5072 -= 2;
            field841[++Statics.field1491 - 1] = "";
            field841[++Statics.field1491 - 1] = "";
            field841[++Statics.field1491 - 1] = "";
            field841[++Statics.field1491 - 1] = "";
            field841[++Statics.field1491 - 1] = "";
            field841[++Statics.field1491 - 1] = "";
            field841[++Statics.field1491 - 1] = "";
            field841[++Statics.field1491 - 1] = "";
            field841[++Statics.field1491 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field5072--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field5072--;
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field5072--;
            return 1;
        } else if (arg0 == 3175) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1491--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1491--;
            return 1;
        } else if (arg0 == 3181) {
            client.method5340(field840[--Statics.field5072]);
            return 1;
        } else if (arg0 == 3182) {
            field840[++Statics.field5072 - 1] = client.method3913();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field840[--Statics.field5072];
            client.method4417(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ge.af(ILdt;ZI)I")
    public static int method3157(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field5072 -= 3;
            client.method7634(field840[Statics.field5072], field840[Statics.field5072 + 1], field840[Statics.field5072 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field5072 -= 5;
            int var3 = field840[Statics.field5072];
            int var4 = field840[Statics.field5072 + 1];
            int var5 = field840[Statics.field5072 + 2];
            int var6 = field840[Statics.field5072 + 3];
            int var7 = field840[Statics.field5072 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method2993(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field5072 -= 2;
            client.method3905(field840[Statics.field5072], field840[Statics.field5072 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class91 var50 = class91.field1093;
            class90 var51 = class90.field1078;
            int var52 = field840[--Statics.field5072];
            if (arg0 == 3212) {
                int var53 = field840[--Statics.field5072];
                var50 = (class91) class385.method164(class91.method2834(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field840[--Statics.field5072];
                var51 = (class90) class385.method164(class90.method2528(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field840[--Statics.field5072];
                var50 = (class91) class385.method164(class91.method2834(), var55);
                if (var50 == null) {
                    var51 = (class90) class385.method164(class90.method2528(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class91.field1087;
            } else if (arg0 == 3203) {
                var51 = class90.field1072;
            } else if (arg0 == 3205) {
                var51 = class90.field1082;
            } else if (arg0 == 3207) {
                var51 = class90.field1076;
            }
            if (class90.field1078 == var51) {
                switch(var50.field1090) {
                    case 1:
                        Statics.field2450.method2455(var52 == 1);
                        break;
                    case 2:
                        Statics.field2450.method2443(var52 == 1);
                        break;
                    case 3:
                        Statics.field2450.method2418(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field2450.method2421(var52);
                        break;
                    case 5:
                        client.method5340(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1077) {
                    case 1:
                        Statics.field2450.method2412(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method1072(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method839(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method2092(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class91 var38 = class91.field1093;
            class90 var39 = class90.field1078;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field840[--Statics.field5072];
                var38 = (class91) class385.method164(class91.method2834(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field840[--Statics.field5072];
                var39 = (class90) class385.method164(class90.method2528(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field840[--Statics.field5072];
                var38 = (class91) class385.method164(class91.method2834(), var43);
                if (var38 == null) {
                    var39 = (class90) class385.method164(class90.method2528(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class91.field1087;
            } else if (arg0 == 3204) {
                var39 = class90.field1072;
            } else if (arg0 == 3206) {
                var39 = class90.field1082;
            } else if (arg0 == 3208) {
                var39 = class90.field1076;
            }
            int var45;
            if (class90.field1078 == var39) {
                switch(var38.field1090) {
                    case 1:
                        var45 = Statics.field2450.method2415() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field2450.method2503() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field2450.method2480() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field2450.method2476();
                        break;
                    case 5:
                        var45 = client.method3913();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1077) {
                    case 1:
                        var45 = Statics.field2450.method2413() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field2450.method2426();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field2450.method2428();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field2450.method2477();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field840[++Statics.field5072 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field840[--Statics.field5072];
            int var10 = 0;
            class91 var11 = (class91) class385.method164(class91.method2834(), var9);
            if (var11 != null) {
                var10 = class91.field1093 == var11 ? 0 : 1;
            }
            field840[++Statics.field5072 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field840[--Statics.field5072];
            int var13 = 0;
            class90 var14 = (class90) class385.method164(class90.method2528(), var12);
            if (var14 != null) {
                var13 = class90.field1078 == var14 ? 0 : 1;
            }
            field840[++Statics.field5072 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class91 var28 = class91.field1093;
            class90 var29 = class90.field1078;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field840[--Statics.field5072];
                var28 = (class91) class385.method164(class91.method2834(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field840[--Statics.field5072];
                var29 = (class90) class385.method164(class90.method2528(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class90.field1078 == var29) {
                switch(var28.field1090) {
                    case 1:
                    case 2:
                    case 3:
                        var35 = 0;
                        var36 = 1;
                        break;
                    case 4:
                        var35 = 0;
                        var36 = Integer.MAX_VALUE;
                        break;
                    case 5:
                        var35 = 0;
                        var36 = 100;
                        break;
                    default:
                        String var34 = String.format("Unkown device option: %s.", var28.toString());
                        throw new RuntimeException(var34);
                }
            } else {
                switch(var29.field1077) {
                    case 1:
                        var35 = 0;
                        var36 = 1;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        var35 = 0;
                        var36 = 100;
                        break;
                    default:
                        String var37 = String.format("Unkown game option: %s.", var29.toString());
                        throw new RuntimeException(var37);
                }
            }
            field840[++Statics.field5072 - 1] = var35;
            field840[++Statics.field5072 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field5072 -= 2;
            int var15 = field840[Statics.field5072];
            int var16 = field840[Statics.field5072 + 1];
            class317.method4392(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field5072 -= 6;
            int var17 = field840[Statics.field5072];
            int var18 = field840[Statics.field5072 + 1];
            int var19 = field840[Statics.field5072 + 2];
            int var20 = field840[Statics.field5072 + 3];
            int var21 = field840[Statics.field5072 + 4];
            int var22 = field840[Statics.field5072 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method2993(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field5072 -= 4;
            int var24 = field840[Statics.field5072];
            int var25 = field840[Statics.field5072 + 1];
            int var26 = field840[Statics.field5072 + 2];
            int var27 = field840[Statics.field5072 + 3];
            class317.method3443(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rj.be(ILdt;ZB)I")
    public static int method7735(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field840[++Statics.field5072 - 1] = client.field500;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field5072 -= 2;
            int var3 = field840[Statics.field5072];
            int var4 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = class85.method2442(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field5072 -= 2;
            int var5 = field840[Statics.field5072];
            int var6 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = class85.method3355(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field5072 -= 2;
            int var7 = field840[Statics.field5072];
            int var8 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = class85.method440(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class171.method5334(var9).field1800;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field629[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field630[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field631[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field2658;
            int var14 = (Statics.field2420.field1247 >> 7) + Statics.field1917;
            int var15 = (Statics.field2420.field1173 >> 7) + Statics.field1322;
            field840[++Statics.field5072 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field840[++Statics.field5072 - 1] = client.field487 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field5072 -= 2;
            int var19 = field840[Statics.field5072] + 32768;
            int var20 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = class85.method2442(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field5072 -= 2;
            int var21 = field840[Statics.field5072] + 32768;
            int var22 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = class85.method3355(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field5072 -= 2;
            int var23 = field840[Statics.field5072] + 32768;
            int var24 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = class85.method440(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field567 >= 2) {
                field840[++Statics.field5072 - 1] = client.field567;
            } else {
                field840[++Statics.field5072 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field840[++Statics.field5072 - 1] = client.field506;
            return 1;
        } else if (arg0 == 3318) {
            field840[++Statics.field5072 - 1] = client.field591;
            return 1;
        } else if (arg0 == 3321) {
            field840[++Statics.field5072 - 1] = client.field664 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field840[++Statics.field5072 - 1] = client.field665;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field668) {
                field840[++Statics.field5072 - 1] = 1;
            } else {
                field840[++Statics.field5072 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field840[++Statics.field5072 - 1] = client.field485;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field5072 -= 4;
            int var25 = field840[Statics.field5072];
            int var26 = field840[Statics.field5072 + 1];
            int var27 = field840[Statics.field5072 + 2];
            int var28 = field840[Statics.field5072 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field840[++Statics.field5072 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field840[++Statics.field5072 - 1] = client.field502;
            return 1;
        } else if (arg0 == 3327) {
            field840[++Statics.field5072 - 1] = client.field503;
            return 1;
        } else if (arg0 == 3331) {
            field840[++Statics.field5072 - 1] = client.field664;
            return 1;
        } else if (arg0 == 3332) {
            int var32 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field541[var32];
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.bd(ILdt;ZI)I")
    public static int method1170(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field5072 -= 2;
            int var3 = field840[Statics.field5072];
            int var4 = field840[Statics.field5072 + 1];
            class184 var5 = class184.method3632(var3);
            if (var5.field1887 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1893; var6++) {
                if (var5.field1888[var6] == var4) {
                    field841[++Statics.field1491 - 1] = var5.field1896[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field841[++Statics.field1491 - 1] = var5.field1891;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field5072 -= 4;
            int var7 = field840[Statics.field5072];
            int var8 = field840[Statics.field5072 + 1];
            int var9 = field840[Statics.field5072 + 2];
            int var10 = field840[Statics.field5072 + 3];
            class184 var11 = class184.method3632(var9);
            if (var11.field1890 != var7 || var11.field1887 != var8) {
                if (var8 == 115) {
                    field841[++Statics.field1491 - 1] = class364.field4153;
                } else {
                    field840[++Statics.field5072 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1893; var12++) {
                if (var11.field1888[var12] == var10) {
                    if (var8 == 115) {
                        field841[++Statics.field1491 - 1] = var11.field1896[var12];
                    } else {
                        field840[++Statics.field5072 - 1] = var11.field1895[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field841[++Statics.field1491 - 1] = var11.field1891;
                } else {
                    field840[++Statics.field5072 - 1] = var11.field1892;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field840[--Statics.field5072];
            class184 var14 = class184.method3632(var13);
            field840[++Statics.field5072 - 1] = var14.method3366();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("it.bl(ILdt;ZB)I")
    public static int method4018(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field725.method3952(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field725.method3951(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field725.method3953(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ny.bi(ILdt;ZI)I")
    public static int method6194(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field52.field817 == 0) {
                field840[++Statics.field5072 - 1] = -2;
            } else if (Statics.field52.field817 == 1) {
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = Statics.field52.field815.method7456();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field840[--Statics.field5072];
            if (Statics.field52.method1796() && var3 >= 0 && var3 < Statics.field52.field815.method7456()) {
                class442 var4 = (class442) Statics.field52.field815.method7448(var3);
                field841[++Statics.field1491 - 1] = var4.method7414();
                field841[++Statics.field1491 - 1] = var4.method7415();
            } else {
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field840[--Statics.field5072];
            if (Statics.field52.method1796() && var5 >= 0 && var5 < Statics.field52.field815.method7456()) {
                field840[++Statics.field5072 - 1] = ((class449) Statics.field52.field815.method7448(var5)).field4703;
            } else {
                field840[++Statics.field5072 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field840[--Statics.field5072];
            if (Statics.field52.method1796() && var6 >= 0 && var6 < Statics.field52.field815.method7456()) {
                field840[++Statics.field5072 - 1] = ((class449) Statics.field52.field815.method7448(var6)).field4704;
            } else {
                field840[++Statics.field5072 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field841[--Statics.field1491];
            int var8 = field840[--Statics.field5072];
            class69.method161(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field841[--Statics.field1491];
            Statics.field52.method1859(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field841[--Statics.field1491];
            Statics.field52.method1807(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field841[--Statics.field1491];
            Statics.field52.method1811(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field841[--Statics.field1491];
            boolean var13 = true;
            Statics.field52.method1808(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field841[--Statics.field1491];
            String var15 = client.method2808(var14);
            field840[++Statics.field5072 - 1] = Statics.field52.method1840(new class550(var15, Statics.field1079), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field106 == null) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = Statics.field106.field4673;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field106 == null) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = Statics.field106.method7456();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field840[--Statics.field5072];
            if (Statics.field106 == null || var16 >= Statics.field106.method7456()) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = Statics.field106.method7448(var16).method7428().method9073();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field840[--Statics.field5072];
            if (Statics.field106 == null || var17 >= Statics.field106.method7456()) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = ((class449) Statics.field106.method7448(var17)).method7520();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field840[--Statics.field5072];
            if (Statics.field106 == null || var18 >= Statics.field106.method7456()) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = ((class449) Statics.field106.method7448(var18)).field4704;
            }
            return 1;
        } else if (arg0 == 3616) {
            field840[++Statics.field5072 - 1] = Statics.field106 == null ? 0 : Statics.field106.field4675;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field841[--Statics.field1491];
            client.method3221(var19);
            return 1;
        } else if (arg0 == 3618) {
            field840[++Statics.field5072 - 1] = Statics.field106 == null ? 0 : Statics.field106.field4672;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field841[--Statics.field1491];
            client.method3003(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method4436();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field52.method1796()) {
                field840[++Statics.field5072 - 1] = Statics.field52.field816.method7456();
            } else {
                field840[++Statics.field5072 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field840[--Statics.field5072];
            if (Statics.field52.method1796() && var21 >= 0 && var21 < Statics.field52.field816.method7456()) {
                class448 var22 = (class448) Statics.field52.field816.method7448(var21);
                field841[++Statics.field1491 - 1] = var22.method7414();
                field841[++Statics.field1491 - 1] = var22.method7415();
            } else {
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field841[--Statics.field1491];
            String var24 = client.method2808(var23);
            field840[++Statics.field5072 - 1] = Statics.field52.method1802(new class550(var24, Statics.field1079)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field840[--Statics.field5072];
            if (Statics.field106 == null || var25 >= Statics.field106.method7456() || !Statics.field106.method7448(var25).method7428().equals(Statics.field2420.field1103)) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field106 == null || Statics.field106.field4674 == null) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = Statics.field106.field4674;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field840[--Statics.field5072];
            if (Statics.field106 == null || var26 >= Statics.field106.method7456() || !((class444) Statics.field106.method7448(var26)).method7396()) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field840[--Statics.field5072];
            if (Statics.field106 == null || var27 >= Statics.field106.method7456() || !((class444) Statics.field106.method7448(var27)).method7406()) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field52.field815.method7458();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class533(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class534(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class120(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class116(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class119(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class124(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class118(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class117(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class121(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class122(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field52.field815.method7449();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field52.field816.method7458();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field840[--Statics.field5072] == 1;
            Statics.field52.field816.method7483(new class533(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field840[--Statics.field5072] == 1;
            Statics.field52.field816.method7483(new class534(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field52.field816.method7449();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field106 != null) {
                Statics.field106.method7458();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class533(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class534(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class120(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class116(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class119(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class124(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class118(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class117(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class121(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class122(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field106 != null) {
                Statics.field106.method7449();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field840[--Statics.field5072] == 1;
            Statics.field52.field815.method7483(new class123(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field840[--Statics.field5072] == 1;
            if (Statics.field106 != null) {
                Statics.field106.method7483(new class123(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hx.bv(ILdt;ZI)I")
    public static int method3781(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("jy.bf(ILdt;ZI)I")
    public static int method4467(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field4839 == null) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = 1;
                Statics.field4600 = Statics.field4839;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field840[--Statics.field5072];
            if (client.field731[var3] == null) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = 1;
                Statics.field4600 = client.field731[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field841[++Statics.field1491 - 1] = Statics.field4600.field1715;
            return 1;
        } else if (arg0 == 3803) {
            field840[++Statics.field5072 - 1] = Statics.field4600.field1705 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field840[++Statics.field5072 - 1] = Statics.field4600.field1706;
            return 1;
        } else if (arg0 == 3805) {
            field840[++Statics.field5072 - 1] = Statics.field4600.field1707;
            return 1;
        } else if (arg0 == 3806) {
            field840[++Statics.field5072 - 1] = Statics.field4600.field1708;
            return 1;
        } else if (arg0 == 3807) {
            field840[++Statics.field5072 - 1] = Statics.field4600.field1709;
            return 1;
        } else if (arg0 == 3809) {
            field840[++Statics.field5072 - 1] = Statics.field4600.field1710;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field840[--Statics.field5072];
            field841[++Statics.field1491 - 1] = Statics.field4600.field1698[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = Statics.field4600.field1712[var5];
            return 1;
        } else if (arg0 == 3812) {
            field840[++Statics.field5072 - 1] = Statics.field4600.field1719;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field840[--Statics.field5072];
            field841[++Statics.field1491 - 1] = Statics.field4600.field1704[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field5072 -= 3;
            int var7 = field840[Statics.field5072];
            int var8 = field840[Statics.field5072 + 1];
            int var9 = field840[Statics.field5072 + 2];
            field840[++Statics.field5072 - 1] = Statics.field4600.method3102(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field840[++Statics.field5072 - 1] = Statics.field4600.field1717;
            return 1;
        } else if (arg0 == 3816) {
            field840[++Statics.field5072 - 1] = Statics.field4600.field1718;
            return 1;
        } else if (arg0 == 3817) {
            field840[++Statics.field5072 - 1] = Statics.field4600.method3084(field841[--Statics.field1491]);
            return 1;
        } else if (arg0 == 3818) {
            field840[Statics.field5072 - 1] = Statics.field4600.method3087()[field840[Statics.field5072 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field5072 -= 2;
            int var10 = field840[Statics.field5072];
            int var11 = field840[Statics.field5072 + 1];
            client.method2785(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = Statics.field4600.field1724[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field5072 -= 3;
                int var13 = field840[Statics.field5072];
                boolean var14 = field840[Statics.field5072 + 1] == 1;
                int var15 = field840[Statics.field5072 + 2];
                client.method15(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field840[--Statics.field5072];
                field840[++Statics.field5072 - 1] = Statics.field4600.field1699[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1024 == null) {
                    field840[++Statics.field5072 - 1] = 0;
                } else {
                    field840[++Statics.field5072 - 1] = 1;
                    Statics.field1852 = Statics.field1024;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field840[--Statics.field5072];
                if (client.field732[var17] == null) {
                    field840[++Statics.field5072 - 1] = 0;
                } else {
                    field840[++Statics.field5072 - 1] = 1;
                    Statics.field1852 = client.field732[var17];
                    Statics.field4451 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field841[++Statics.field1491 - 1] = Statics.field1852.field1770;
                return 1;
            } else if (arg0 == 3853) {
                field840[++Statics.field5072 - 1] = Statics.field1852.field1772;
                return 1;
            } else if (arg0 == 3854) {
                field840[++Statics.field5072 - 1] = Statics.field1852.field1767;
                return 1;
            } else if (arg0 == 3855) {
                field840[++Statics.field5072 - 1] = Statics.field1852.method3190();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field840[--Statics.field5072];
                field841[++Statics.field1491 - 1] = ((class147) Statics.field1852.field1769.get(var18)).field1648.method9073();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field840[--Statics.field5072];
                field840[++Statics.field5072 - 1] = ((class147) Statics.field1852.field1769.get(var19)).field1649;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field840[--Statics.field5072];
                field840[++Statics.field5072 - 1] = ((class147) Statics.field1852.field1769.get(var20)).field1647;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field840[--Statics.field5072];
                client.method459(Statics.field4451, var21);
                return 1;
            } else if (arg0 == 3860) {
                field840[++Statics.field5072 - 1] = Statics.field1852.method3195(field841[--Statics.field1491]);
                return 1;
            } else if (arg0 == 3861) {
                field840[Statics.field5072 - 1] = Statics.field1852.method3175()[field840[Statics.field5072 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field840[++Statics.field5072 - 1] = Statics.field678 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("df.bg(ILdt;ZI)I")
    public static int method2367(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field778[var3].method6457();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field778[var4].field4374;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field778[var5].field4373;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field778[var6].field4376;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field778[var7].field4377;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.field778[var8].field4375;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field840[--Statics.field5072];
            int var10 = client.field778[var9].method6456();
            field840[++Statics.field5072 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field840[--Statics.field5072];
            int var12 = client.field778[var11].method6456();
            field840[++Statics.field5072 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field840[--Statics.field5072];
            int var14 = client.field778[var13].method6456();
            field840[++Statics.field5072 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field840[--Statics.field5072];
            int var16 = client.field778[var15].method6456();
            field840[++Statics.field5072 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field840[--Statics.field5072] == 1;
            if (Statics.field16 != null) {
                Statics.field16.method6399(class373.field4348, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field840[--Statics.field5072] == 1;
            if (Statics.field16 != null) {
                Statics.field16.method6399(class373.field4347, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field5072 -= 2;
            boolean var19 = field840[Statics.field5072] == 1;
            boolean var20 = field840[Statics.field5072 + 1] == 1;
            if (Statics.field16 != null) {
                client.field779.field481 = var20;
                Statics.field16.method6399(client.field779, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field840[--Statics.field5072] == 1;
            if (Statics.field16 != null) {
                Statics.field16.method6399(class373.field4346, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field840[--Statics.field5072] == 1;
            if (Statics.field16 != null) {
                Statics.field16.method6399(class373.field4349, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field840[++Statics.field5072 - 1] = Statics.field16 == null ? 0 : Statics.field16.field4351.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field840[--Statics.field5072];
            class379 var24 = (class379) Statics.field16.field4351.get(var23);
            field840[++Statics.field5072 - 1] = var24.field4367;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field840[--Statics.field5072];
            class379 var26 = (class379) Statics.field16.field4351.get(var25);
            field841[++Statics.field1491 - 1] = var26.method6446();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field840[--Statics.field5072];
            class379 var28 = (class379) Statics.field16.field4351.get(var27);
            field841[++Statics.field1491 - 1] = var28.method6447();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field840[--Statics.field5072];
            class379 var30 = (class379) Statics.field16.field4351.get(var29);
            long var31 = class313.method3460() - Statics.field4906 - var30.field4365;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field841[++Statics.field1491 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field840[--Statics.field5072];
            class379 var38 = (class379) Statics.field16.field4351.get(var37);
            field840[++Statics.field5072 - 1] = var38.field4366.field4376;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field840[--Statics.field5072];
            class379 var40 = (class379) Statics.field16.field4351.get(var39);
            field840[++Statics.field5072 - 1] = var40.field4366.field4373;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field840[--Statics.field5072];
            class379 var42 = (class379) Statics.field16.field4351.get(var41);
            field840[++Statics.field5072 - 1] = var42.field4366.field4374;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class203.method3907(var43).field2184 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qy.ba(ILdt;ZI)I")
    public static int method7190(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field5072 -= 2;
            int var3 = field840[Statics.field5072];
            int var4 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field5072 -= 2;
            int var5 = field840[Statics.field5072];
            int var6 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field5072 -= 2;
            int var7 = field840[Statics.field5072];
            int var8 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field5072 -= 2;
            int var9 = field840[Statics.field5072];
            int var10 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field5072 -= 5;
            int var13 = field840[Statics.field5072];
            int var14 = field840[Statics.field5072 + 1];
            int var15 = field840[Statics.field5072 + 2];
            int var16 = field840[Statics.field5072 + 3];
            int var17 = field840[Statics.field5072 + 4];
            field840[++Statics.field5072 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field5072 -= 2;
            int var18 = field840[Statics.field5072];
            int var19 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field5072 -= 2;
            int var20 = field840[Statics.field5072];
            int var21 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field5072 -= 2;
            int var22 = field840[Statics.field5072];
            int var23 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field5072 -= 2;
            int var24 = field840[Statics.field5072];
            int var25 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field5072 -= 2;
            int var26 = field840[Statics.field5072];
            int var27 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field5072 -= 2;
            int var28 = field840[Statics.field5072];
            int var29 = field840[Statics.field5072 + 1];
            if (var28 == 0) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field5072 -= 2;
            int var30 = field840[Statics.field5072];
            int var31 = field840[Statics.field5072 + 1];
            if (var30 == 0) {
                field840[++Statics.field5072 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field840[++Statics.field5072 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field840[++Statics.field5072 - 1] = var30;
                    break;
                case 2:
                    field840[++Statics.field5072 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field840[++Statics.field5072 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field840[++Statics.field5072 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field840[++Statics.field5072 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field5072 -= 2;
            int var32 = field840[Statics.field5072];
            int var33 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field5072 -= 2;
            int var34 = field840[Statics.field5072];
            int var35 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field5072 -= 2;
            int var36 = field840[Statics.field5072];
            int var37 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field5072 -= 2;
            int var38 = field840[Statics.field5072];
            int var39 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field5072 -= 3;
            long var40 = (long) field840[Statics.field5072];
            long var42 = (long) field840[Statics.field5072 + 1];
            long var44 = (long) field840[Statics.field5072 + 2];
            field840[++Statics.field5072 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class315.method2792(field840[--Statics.field5072]);
            field840[++Statics.field5072 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field5072 -= 2;
            int var47 = field840[Statics.field5072];
            int var48 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field5072 -= 3;
            int var49 = field840[Statics.field5072];
            int var50 = field840[Statics.field5072 + 1];
            int var51 = field840[Statics.field5072 + 2];
            field840[++Statics.field5072 - 1] = class315.method3496(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field5072 -= 3;
            int var52 = field840[Statics.field5072];
            int var53 = field840[Statics.field5072 + 1];
            int var54 = field840[Statics.field5072 + 2];
            field840[++Statics.field5072 - 1] = class315.method2326(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field5072 -= 3;
            int var55 = field840[Statics.field5072];
            int var56 = field840[Statics.field5072 + 1];
            int var57 = field840[Statics.field5072 + 2];
            int var58 = 31 - var57;
            field840[++Statics.field5072 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field5072 -= 4;
            int var59 = field840[Statics.field5072];
            int var60 = field840[Statics.field5072 + 1];
            int var61 = field840[Statics.field5072 + 2];
            int var62 = field840[Statics.field5072 + 3];
            int var63 = class315.method2326(var59, var61, var62);
            int var64 = class315.method3908(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field840[++Statics.field5072 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field840[Statics.field5072 - 1] = Statics.method3228(field840[Statics.field5072 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field840[Statics.field5072 - 1] = class477.method3485(field840[Statics.field5072 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field5072 -= 2;
            int var65 = field840[Statics.field5072];
            int var66 = field840[Statics.field5072 + 1];
            int var67 = Statics.method5329(var65, var66);
            field840[++Statics.field5072 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field840[Statics.field5072 - 1] = Math.abs(field840[Statics.field5072 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field841[--Statics.field1491];
            int var69 = -1;
            if (class399.method5309(var68)) {
                var69 = class399.method6184(var68);
            }
            field840[++Statics.field5072 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("or.bm(ILdt;ZB)I")
    public static int method6218(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field841[--Statics.field1491];
            int var4 = field840[--Statics.field5072];
            field841[++Statics.field1491 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1491 -= 2;
            String var5 = field841[Statics.field1491];
            String var6 = field841[Statics.field1491 + 1];
            field841[++Statics.field1491 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field841[--Statics.field1491];
            int var8 = field840[--Statics.field5072];
            field841[++Statics.field1491 - 1] = var7 + class399.method5166(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field841[--Statics.field1491];
            field841[++Statics.field1491 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field840[--Statics.field5072];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field845.setTime(new Date(var11));
            int var13 = field845.get(5);
            int var14 = field845.get(2);
            int var15 = field845.get(1);
            field841[++Statics.field1491 - 1] = var13 + "-" + field846[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1491 -= 2;
            String var16 = field841[Statics.field1491];
            String var17 = field841[Statics.field1491 + 1];
            if (Statics.field2420.field1100 == null || Statics.field2420.field1100.field3601 == 0) {
                field841[++Statics.field1491 - 1] = var16;
            } else {
                field841[++Statics.field1491 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field840[--Statics.field5072];
            field841[++Statics.field1491 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1491 -= 2;
            field840[++Statics.field5072 - 1] = class399.method6434(Statics.method3437(field841[Statics.field1491], field841[Statics.field1491 + 1], Statics.field1043));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field841[--Statics.field1491];
            Statics.field5072 -= 2;
            int var20 = field840[Statics.field5072];
            int var21 = field840[Statics.field5072 + 1];
            byte[] var22 = Statics.field2024.method6284(var21, 0);
            class406 var23 = new class406(var22);
            field840[++Statics.field5072 - 1] = var23.method6982(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field841[--Statics.field1491];
            Statics.field5072 -= 2;
            int var25 = field840[Statics.field5072];
            int var26 = field840[Statics.field5072 + 1];
            byte[] var27 = Statics.field2024.method6284(var26, 0);
            class406 var28 = new class406(var27);
            field840[++Statics.field5072 - 1] = var28.method7007(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1491 -= 2;
            String var29 = field841[Statics.field1491];
            String var30 = field841[Statics.field1491 + 1];
            if (field840[--Statics.field5072] == 1) {
                field841[++Statics.field1491 - 1] = var29;
            } else {
                field841[++Statics.field1491 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field841[--Statics.field1491];
            field841[++Statics.field1491 - 1] = class410.method7025(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field841[--Statics.field1491];
            int var33 = field840[--Statics.field5072];
            field841[++Statics.field1491 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class399.method3259((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class399.method386((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class399.method102((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class399.method2318((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field841[--Statics.field1491];
            if (var38 == null) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field841[--Statics.field1491];
            Statics.field5072 -= 2;
            int var40 = field840[Statics.field5072];
            int var41 = field840[Statics.field5072 + 1];
            field841[++Statics.field1491 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field841[--Statics.field1491];
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
            field841[++Statics.field1491 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field841[--Statics.field1491];
            int var48 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1491 -= 2;
            String var49 = field841[Statics.field1491];
            String var50 = field841[Statics.field1491 + 1];
            int var51 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field841[--Statics.field1491];
            field841[++Statics.field1491 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field1491 -= 3;
            String var53 = field841[Statics.field1491];
            String var54 = field841[Statics.field1491 + 1];
            String var55 = field841[Statics.field1491 + 2];
            if (Statics.field2420.field1100 == null) {
                field841[++Statics.field1491 - 1] = var55;
                return 1;
            }
            switch(Statics.field2420.field1100.field3599) {
                case 0:
                    field841[++Statics.field1491 - 1] = var53;
                    break;
                case 1:
                    field841[++Statics.field1491 - 1] = var54;
                    break;
                case 2:
                default:
                    field841[++Statics.field1491 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ca.bp(ILdt;ZB)I")
    public static int method1867(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field840[--Statics.field5072];
            field841[++Statics.field1491 - 1] = class203.method3907(var3).field2166;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field5072 -= 2;
            int var4 = field840[Statics.field5072];
            int var5 = field840[Statics.field5072 + 1];
            class203 var6 = class203.method3907(var4);
            if (var5 < 1 || var5 > 5 || var6.field2157[var5 - 1] == null) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = var6.field2157[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field5072 -= 2;
            int var7 = field840[Statics.field5072];
            int var8 = field840[Statics.field5072 + 1];
            class203 var9 = class203.method3907(var7);
            if (var8 < 1 || var8 > 5 || var9.field2158[var8 - 1] == null) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = var9.field2158[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class203.method3907(var10).field2152;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class203.method3907(var11).field2151 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field840[--Statics.field5072];
            class203 var13 = class203.method3907(var12);
            if (var13.field2187 == -1 && var13.field2131 >= 0) {
                field840[++Statics.field5072 - 1] = var13.field2131;
            } else {
                field840[++Statics.field5072 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field840[--Statics.field5072];
            class203 var15 = class203.method3907(var14);
            if (var15.field2187 >= 0 && var15.field2131 >= 0) {
                field840[++Statics.field5072 - 1] = var15.field2131;
            } else {
                field840[++Statics.field5072 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class203.method3907(var16).field2160 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field840[--Statics.field5072];
            class203 var18 = class203.method3907(var17);
            if (var18.field2188 == -1 && var18.field2156 >= 0) {
                field840[++Statics.field5072 - 1] = var18.field2156;
            } else {
                field840[++Statics.field5072 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field840[--Statics.field5072];
            class203 var20 = class203.method3907(var19);
            if (var20.field2188 >= 0 && var20.field2156 >= 0) {
                field840[++Statics.field5072 - 1] = var20.field2156;
            } else {
                field840[++Statics.field5072 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field841[--Statics.field1491];
            int var22 = field840[--Statics.field5072];
            client.method2779(var21, var22 == 1);
            field840[++Statics.field5072 - 1] = Statics.field1464;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field3522 == null || Statics.field475 >= Statics.field1464) {
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = Statics.field3522[++Statics.field475 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field475 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field840[--Statics.field5072];
            int var24 = class203.method3907(var23).method3633();
            if (var24 == -1) {
                field840[++Statics.field5072 - 1] = var24;
            } else {
                field840[++Statics.field5072 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class203.method3907(var25).field2153;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class203.method3907(var26).field2154;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class203.method3907(var27).field2183;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field840[--Statics.field5072];
            class203 var29 = class203.method3907(var28);
            field840[++Statics.field5072 - 1] = var29.field2182;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ax.bw(ILdt;ZI)I")
    public static int method125(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field840[++Statics.field5072 - 1] = client.field720;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field5072 -= 3;
            client.field720 = field840[Statics.field5072];
            Statics.field1797 = class546.method4203(field840[Statics.field5072 + 1]);
            if (Statics.field1797 == null) {
                Statics.field1797 = class546.field5281;
            }
            client.field604 = field840[Statics.field5072 + 2];
            class308 var3 = class308.method2768(class306.field3144, client.field590.field1405);
            var3.field3243.method8393(client.field720);
            var3.field3243.method8393(Statics.field1797.field5280);
            var3.field3243.method8393(client.field604);
            client.field590.method2719(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field841[--Statics.field1491];
            Statics.field5072 -= 2;
            int var5 = field840[Statics.field5072];
            int var6 = field840[Statics.field5072 + 1];
            class308 var7 = class308.method2768(class306.field3205, client.field590.field1405);
            var7.field3243.method8393(class527.method3196(var4) + 2);
            var7.field3243.method8400(var4);
            var7.field3243.method8393(var5 - 1);
            var7.field3243.method8393(var6);
            client.field590.method2719(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field5072 -= 2;
            int var8 = field840[Statics.field5072];
            int var9 = field840[Statics.field5072 + 1];
            class65 var10 = class111.method185(var8, var9);
            if (var10 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = var10.field471;
                field840[++Statics.field5072 - 1] = var10.field463;
                field841[++Statics.field1491 - 1] = var10.field465 == null ? "" : var10.field465;
                field841[++Statics.field1491 - 1] = var10.field469 == null ? "" : var10.field469;
                field841[++Statics.field1491 - 1] = var10.field464 == null ? "" : var10.field464;
                field840[++Statics.field5072 - 1] = var10.method1136() ? 1 : (var10.method1139() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field840[--Statics.field5072];
            class65 var12 = class111.method465(var11);
            if (var12 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = var12.field468;
                field840[++Statics.field5072 - 1] = var12.field463;
                field841[++Statics.field1491 - 1] = var12.field465 == null ? "" : var12.field465;
                field841[++Statics.field1491 - 1] = var12.field469 == null ? "" : var12.field469;
                field841[++Statics.field1491 - 1] = var12.field464 == null ? "" : var12.field464;
                field840[++Statics.field5072 - 1] = var12.method1136() ? 1 : (var12.method1139() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1797 == null) {
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = Statics.field1797.field5280;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field841[--Statics.field1491];
            int var14 = field840[--Statics.field5072];
            class308 var15 = class551.method9051(var14, var13, Statics.field1043, -1);
            client.field590.method2719(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1491 -= 2;
            String var16 = field841[Statics.field1491];
            String var17 = field841[Statics.field1491 + 1];
            class308 var18 = class308.method2768(class306.field3203, client.field590.field1405);
            var18.field3243.method8394(0);
            int var19 = var18.field3243.field5137;
            var18.field3243.method8400(var16);
            class351.method818(var18.field3243, var17);
            var18.field3243.method8406(var18.field3243.field5137 - var19);
            client.field590.method2719(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field841[--Statics.field1491];
            Statics.field5072 -= 2;
            int var21 = field840[Statics.field5072];
            int var22 = field840[Statics.field5072 + 1];
            class308 var23 = class551.method9051(var21, var20, Statics.field1043, var22);
            client.field590.method2719(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field2420 == null || Statics.field2420.field1103 == null) {
                var24 = "";
            } else {
                var24 = Statics.field2420.field1103.method9073();
            }
            field841[++Statics.field1491 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field840[++Statics.field5072 - 1] = client.field604;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class111.method1163(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class111.method134(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = class111.method2321(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field841[--Statics.field1491];
            client.method81(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field695 = field841[--Statics.field1491].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field841[++Statics.field1491 - 1] = client.field695;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field841[--Statics.field1491];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field5072 -= 2;
            int var30 = field840[Statics.field5072];
            int var31 = field840[Statics.field5072 + 1];
            class65 var32 = class111.method185(var30, var31);
            if (var32 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = var32.field471;
                field840[++Statics.field5072 - 1] = var32.field463;
                field841[++Statics.field1491 - 1] = var32.field465 == null ? "" : var32.field465;
                field841[++Statics.field1491 - 1] = var32.field469 == null ? "" : var32.field469;
                field841[++Statics.field1491 - 1] = var32.field464 == null ? "" : var32.field464;
                field840[++Statics.field5072 - 1] = var32.method1136() ? 1 : (var32.method1139() ? 2 : 0);
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field840[--Statics.field5072];
            class65 var34 = class111.method465(var33);
            if (var34 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = var34.field468;
                field840[++Statics.field5072 - 1] = var34.field463;
                field841[++Statics.field1491 - 1] = var34.field465 == null ? "" : var34.field465;
                field841[++Statics.field1491 - 1] = var34.field469 == null ? "" : var34.field469;
                field841[++Statics.field1491 - 1] = var34.field464 == null ? "" : var34.field464;
                field840[++Statics.field5072 - 1] = var34.method1136() ? 1 : (var34.method1139() ? 2 : 0);
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.bj(ILdt;ZI)I")
    public static int method2032(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field840[++Statics.field5072 - 1] = client.method1169();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field840[--Statics.field5072];
            if (var3 == 1 || var3 == 2) {
                client.method69(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field840[++Statics.field5072 - 1] = Statics.field2450.method2436();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field840[--Statics.field5072];
            if (var4 == 1 || var4 == 2) {
                Statics.field2450.method2435(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field5072--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.bn(ILdt;ZB)I")
    public static int method840(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field5072 -= 2;
            int var3 = field840[Statics.field5072];
            int var4 = field840[Statics.field5072 + 1];
            if (!client.field789) {
                client.field572 = var3;
                client.field573 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field840[++Statics.field5072 - 1] = client.field572;
            return 1;
        } else if (arg0 == 5506) {
            field840[++Statics.field5072 - 1] = client.field573;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field840[--Statics.field5072];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field579 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field840[++Statics.field5072 - 1] = client.field579;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ez.bo(ILdt;ZI)I")
    public static int method2836(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field772 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nf.bt(II)I")
    public static int method6199(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("fh.bu(IB)I")
    public static int method3051(int arg0) {
        return (int) ((Math.log((double) arg0) / field853 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("fe.by(ILdt;ZI)I")
    public static int method2989(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field5072 -= 2;
            client.field761 = (short) method6199(field840[Statics.field5072]);
            if (client.field761 <= 0) {
                client.field761 = 256;
            }
            client.field762 = (short) method6199(field840[Statics.field5072 + 1]);
            if (client.field762 <= 0) {
                client.field762 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field5072 -= 2;
            client.field763 = (short) field840[Statics.field5072];
            if (client.field763 <= 0) {
                client.field763 = 256;
            }
            client.field710 = (short) field840[Statics.field5072 + 1];
            if (client.field710 <= 0) {
                client.field710 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field5072 -= 4;
            client.field765 = (short) field840[Statics.field5072];
            if (client.field765 <= 0) {
                client.field765 = 1;
            }
            client.field766 = (short) field840[Statics.field5072 + 1];
            if (client.field766 <= 0) {
                client.field766 = 32767;
            } else if (client.field766 < client.field765) {
                client.field766 = client.field765;
            }
            client.field532 = (short) field840[Statics.field5072 + 2];
            if (client.field532 <= 0) {
                client.field532 = 1;
            }
            client.field723 = (short) field840[Statics.field5072 + 3];
            if (client.field723 <= 0) {
                client.field723 = 32767;
            } else if (client.field723 < client.field532) {
                client.field723 = client.field532;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field669 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = -1;
            } else {
                client.method6176(0, 0, client.field669.field3675, client.field669.field3676, false);
                field840[++Statics.field5072 - 1] = client.field771;
                field840[++Statics.field5072 - 1] = client.field607;
            }
            return 1;
        } else if (arg0 == 6204) {
            field840[++Statics.field5072 - 1] = client.field763;
            field840[++Statics.field5072 - 1] = client.field710;
            return 1;
        } else if (arg0 == 6205) {
            field840[++Statics.field5072 - 1] = method3051(client.field761);
            field840[++Statics.field5072 - 1] = method3051(client.field762);
            return 1;
        } else if (arg0 == 6220) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field840[++Statics.field5072 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field840[++Statics.field5072 - 1] = Statics.field4410;
            return 1;
        } else if (arg0 == 6223) {
            field840[++Statics.field5072 - 1] = Statics.field321;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fi.bh(ILdt;ZI)I")
    public static int method3002(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field840[++Statics.field5072 - 1] = class68.method4422() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class68 var3 = class68.method6519();
            if (var3 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
            } else {
                field840[++Statics.field5072 - 1] = var3.field802;
                field840[++Statics.field5072 - 1] = var3.field810;
                field841[++Statics.field1491 - 1] = var3.field806;
                field840[++Statics.field5072 - 1] = var3.field803;
                field840[++Statics.field5072 - 1] = var3.field807;
                field841[++Statics.field1491 - 1] = var3.field805;
            }
            return 1;
        } else if (arg0 == 6502) {
            class68 var4 = class68.method4105();
            if (var4 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
            } else {
                field840[++Statics.field5072 - 1] = var4.field802;
                field840[++Statics.field5072 - 1] = var4.field810;
                field841[++Statics.field1491 - 1] = var4.field806;
                field840[++Statics.field5072 - 1] = var4.field803;
                field840[++Statics.field5072 - 1] = var4.field807;
                field841[++Statics.field1491 - 1] = var4.field805;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field840[--Statics.field5072];
            class68 var6 = null;
            for (int var7 = 0; var7 < class68.field798; var7++) {
                if (Statics.field3921[var7].field802 == var5) {
                    var6 = Statics.field3921[var7];
                    break;
                }
            }
            if (var6 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
            } else {
                field840[++Statics.field5072 - 1] = var6.field802;
                field840[++Statics.field5072 - 1] = var6.field810;
                field841[++Statics.field1491 - 1] = var6.field806;
                field840[++Statics.field5072 - 1] = var6.field803;
                field840[++Statics.field5072 - 1] = var6.field807;
                field841[++Statics.field1491 - 1] = var6.field805;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field5072 -= 4;
            int var8 = field840[Statics.field5072];
            boolean var9 = field840[Statics.field5072 + 1] == 1;
            int var10 = field840[Statics.field5072 + 2];
            boolean var11 = field840[Statics.field5072 + 3] == 1;
            class68.method2716(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field840[--Statics.field5072];
            if (var12 >= 0 && var12 < class68.field798) {
                class68 var13 = Statics.field3921[var12];
                field840[++Statics.field5072 - 1] = var13.field802;
                field840[++Statics.field5072 - 1] = var13.field810;
                field841[++Statics.field1491 - 1] = var13.field806;
                field840[++Statics.field5072 - 1] = var13.field803;
                field840[++Statics.field5072 - 1] = var13.field807;
                field841[++Statics.field1491 - 1] = var13.field805;
            } else {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
                field840[++Statics.field5072 - 1] = 0;
                field840[++Statics.field5072 - 1] = 0;
                field841[++Statics.field1491 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field644 = field840[--Statics.field5072] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field5072 -= 2;
            int var14 = field840[Statics.field5072];
            int var15 = field840[Statics.field5072 + 1];
            class199 var16 = class199.method4984(var15);
            if (var16.method3497()) {
                field841[++Statics.field1491 - 1] = class189.method3442(var14).method3378(var15, var16.field2035);
            } else {
                field840[++Statics.field5072 - 1] = class189.method3442(var14).method3387(var15, var16.field2037);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field5072 -= 2;
            int var17 = field840[Statics.field5072];
            int var18 = field840[Statics.field5072 + 1];
            class199 var19 = class199.method4984(var18);
            if (var19.method3497()) {
                field841[++Statics.field1491 - 1] = Statics.method4138(var17).method3574(var18, var19.field2035);
            } else {
                field840[++Statics.field5072 - 1] = Statics.method4138(var17).method3584(var18, var19.field2037);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field5072 -= 2;
            int var20 = field840[Statics.field5072];
            int var21 = field840[Statics.field5072 + 1];
            class199 var22 = class199.method4984(var21);
            if (var22.method3497()) {
                field841[++Statics.field1491 - 1] = class203.method3907(var20).method3648(var21, var22.field2035);
            } else {
                field840[++Statics.field5072 - 1] = class203.method3907(var20).method3647(var21, var22.field2037);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field5072 -= 2;
            int var23 = field840[Statics.field5072];
            int var24 = field840[Statics.field5072 + 1];
            class199 var25 = class199.method4984(var24);
            if (var25.method3497()) {
                field841[++Statics.field1491 - 1] = class200.method7510(var23).method3523(var24, var25.field2035);
            } else {
                field840[++Statics.field5072 - 1] = class200.method7510(var23).method3516(var24, var25.field2037);
            }
            return 1;
        } else if (arg0 == 6518) {
            field840[++Statics.field5072 - 1] = client.field492 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field840[++Statics.field5072 - 1] = client.field490;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1491--;
            Statics.field5072--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1491--;
            Statics.field5072--;
            return 1;
        } else if (arg0 == 6524) {
            field840[++Statics.field5072 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field840[++Statics.field5072 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field840[++Statics.field5072 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field840[++Statics.field5072 - 1] = client.field491;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dx.bz(ILdt;ZI)I")
    public static int method2208(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field2658;
            int var4 = (Statics.field2420.field1247 >> 7) + Statics.field1917;
            int var5 = (Statics.field2420.field1173 >> 7) + Statics.field1322;
            client.method7893().method7907(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field840[--Statics.field5072];
            String var7 = "";
            class237 var8 = client.method7893().method7981(var6);
            if (var8 != null) {
                var7 = var8.method4180();
            }
            field841[++Statics.field1491 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field840[--Statics.field5072];
            client.method7893().method7908(var9);
            return 1;
        } else if (arg0 == 6603) {
            field840[++Statics.field5072 - 1] = client.method7893().method7922();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field840[--Statics.field5072];
            client.method7893().method8054(var10);
            return 1;
        } else if (arg0 == 6605) {
            field840[++Statics.field5072 - 1] = client.method7893().method7924() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class334 var11 = new class334(field840[--Statics.field5072]);
            client.method7893().method8042(var11.field3561, var11.field3563);
            return 1;
        } else if (arg0 == 6607) {
            class334 var12 = new class334(field840[--Statics.field5072]);
            client.method7893().method7987(var12.field3561, var12.field3563);
            return 1;
        } else if (arg0 == 6608) {
            class334 var13 = new class334(field840[--Statics.field5072]);
            client.method7893().method8105(var13.field3562, var13.field3561, var13.field3563);
            return 1;
        } else if (arg0 == 6609) {
            class334 var14 = new class334(field840[--Statics.field5072]);
            client.method7893().method7929(var14.field3562, var14.field3561, var14.field3563);
            return 1;
        } else if (arg0 == 6610) {
            field840[++Statics.field5072 - 1] = client.method7893().method7930();
            field840[++Statics.field5072 - 1] = client.method7893().method7931();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field840[--Statics.field5072];
            class237 var16 = client.method7893().method7981(var15);
            if (var16 == null) {
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = var16.method4190().method5617();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field840[--Statics.field5072];
            class237 var18 = client.method7893().method7981(var17);
            if (var18 == null) {
                field840[++Statics.field5072 - 1] = 0;
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = (var18.method4184() - var18.method4246() + 1) * 64;
                field840[++Statics.field5072 - 1] = (var18.method4186() - var18.method4185() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field840[--Statics.field5072];
            class237 var20 = client.method7893().method7981(var19);
            if (var20 == null) {
                field840[++Statics.field5072 - 1] = 0;
                field840[++Statics.field5072 - 1] = 0;
                field840[++Statics.field5072 - 1] = 0;
                field840[++Statics.field5072 - 1] = 0;
            } else {
                field840[++Statics.field5072 - 1] = var20.method4246() * 64;
                field840[++Statics.field5072 - 1] = var20.method4185() * 64;
                field840[++Statics.field5072 - 1] = var20.method4184() * 64 + 64 - 1;
                field840[++Statics.field5072 - 1] = var20.method4186() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field840[--Statics.field5072];
            class237 var22 = client.method7893().method7981(var21);
            if (var22 == null) {
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var22.method4183();
            }
            return 1;
        } else if (arg0 == 6615) {
            class334 var23 = client.method7893().method7932();
            if (var23 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var23.field3561;
                field840[++Statics.field5072 - 1] = var23.field3563;
            }
            return 1;
        } else if (arg0 == 6616) {
            field840[++Statics.field5072 - 1] = client.method7893().method8086();
            return 1;
        } else if (arg0 == 6617) {
            class334 var24 = new class334(field840[--Statics.field5072]);
            class237 var25 = client.method7893().method8083();
            if (var25 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4208(var24.field3562, var24.field3561, var24.field3563);
            if (var26 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var26[0];
                field840[++Statics.field5072 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class334 var27 = new class334(field840[--Statics.field5072]);
            class237 var28 = client.method7893().method8083();
            if (var28 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = -1;
                return 1;
            }
            class334 var29 = var28.method4175(var27.field3561, var27.field3563);
            if (var29 == null) {
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var29.method5617();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field5072 -= 2;
            int var30 = field840[Statics.field5072];
            class334 var31 = new class334(field840[Statics.field5072 + 1]);
            method7380(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field5072 -= 2;
            int var32 = field840[Statics.field5072];
            class334 var33 = new class334(field840[Statics.field5072 + 1]);
            method7380(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field5072 -= 2;
            int var34 = field840[Statics.field5072];
            class334 var35 = new class334(field840[Statics.field5072 + 1]);
            class237 var36 = client.method7893().method7981(var34);
            if (var36 == null) {
                field840[++Statics.field5072 - 1] = 0;
                return 1;
            } else {
                field840[++Statics.field5072 - 1] = var36.method4172(var35.field3562, var35.field3561, var35.field3563) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field840[++Statics.field5072 - 1] = client.method7893().method7933();
            field840[++Statics.field5072 - 1] = client.method7893().method8034();
            return 1;
        } else if (arg0 == 6623) {
            class334 var37 = new class334(field840[--Statics.field5072]);
            class237 var38 = client.method7893().method7906(var37.field3562, var37.field3561, var37.field3563);
            if (var38 == null) {
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var38.method4177();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method7893().method7944(field840[--Statics.field5072]);
            return 1;
        } else if (arg0 == 6625) {
            client.method7893().method7936();
            return 1;
        } else if (arg0 == 6626) {
            client.method7893().method8085(field840[--Statics.field5072]);
            return 1;
        } else if (arg0 == 6627) {
            client.method7893().method7938();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field840[--Statics.field5072] == 1;
            client.method7893().method8098(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field840[--Statics.field5072];
            client.method7893().method8016(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field840[--Statics.field5072];
            client.method7893().method8104(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method7893().method7942();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field840[--Statics.field5072] == 1;
            client.method7893().method8061(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field5072 -= 2;
            int var43 = field840[Statics.field5072];
            boolean var44 = field840[Statics.field5072 + 1] == 1;
            client.method7893().method8030(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field5072 -= 2;
            int var45 = field840[Statics.field5072];
            boolean var46 = field840[Statics.field5072 + 1] == 1;
            client.method7893().method7945(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field840[++Statics.field5072 - 1] = client.method7893().method7927() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.method7893().method7946(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field840[--Statics.field5072];
            field840[++Statics.field5072 - 1] = client.method7893().method7947(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field5072 -= 2;
            int var49 = field840[Statics.field5072];
            class334 var50 = new class334(field840[Statics.field5072 + 1]);
            class334 var51 = client.method7893().method7950(var49, var50);
            if (var51 == null) {
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var51.method5617();
            }
            return 1;
        } else if (arg0 == 6639) {
            class255 var52 = client.method7893().method7952();
            if (var52 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var52.method4123();
                field840[++Statics.field5072 - 1] = var52.field2623.method5617();
            }
            return 1;
        } else if (arg0 == 6640) {
            class255 var53 = client.method7893().method8022();
            if (var53 == null) {
                field840[++Statics.field5072 - 1] = -1;
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var53.method4123();
                field840[++Statics.field5072 - 1] = var53.field2623.method5617();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field840[--Statics.field5072];
            class178 var55 = class178.method3048(var54);
            if (var55.field1830 == null) {
                field841[++Statics.field1491 - 1] = "";
            } else {
                field841[++Statics.field1491 - 1] = var55.field1830;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field840[--Statics.field5072];
            class178 var57 = class178.method3048(var56);
            field840[++Statics.field5072 - 1] = var57.field1834;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field840[--Statics.field5072];
            class178 var59 = class178.method3048(var58);
            if (var59 == null) {
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var59.field1847;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field840[--Statics.field5072];
            class178 var61 = class178.method3048(var60);
            if (var61 == null) {
                field840[++Statics.field5072 - 1] = -1;
            } else {
                field840[++Statics.field5072 - 1] = var61.field1828;
            }
            return 1;
        } else if (arg0 == 6697) {
            field840[++Statics.field5072 - 1] = Statics.field1579.field2648;
            return 1;
        } else if (arg0 == 6698) {
            field840[++Statics.field5072 - 1] = Statics.field1579.field2647.method5617();
            return 1;
        } else if (arg0 == 6699) {
            field840[++Statics.field5072 - 1] = Statics.field1579.field2649.method5617();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ng.bc(ILdt;ZI)I")
    public static int method6159(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field840[--Statics.field5072];
            class189 var4 = class189.method3442(var3);
            field841[++Statics.field1491 - 1] = var4 == null ? "" : var4.field1926;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field5072 -= 2;
            class189 var5 = class189.method3442(field840[Statics.field5072]);
            int var6 = field840[Statics.field5072 + 1];
            field840[++Statics.field5072 - 1] = var5.method3391(var6);
            field840[++Statics.field5072 - 1] = var5.method3393(var6);
            return 1;
        } else if (arg0 == 6765) {
            class189 var7 = class189.method3442(field840[--Statics.field5072]);
            field840[++Statics.field5072 - 1] = var7 == null ? 0 : var7.field1951;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("am.bs(ILdt;ZB)I")
    public static int method242(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field840[--Statics.field5072];
            class202 var4 = Statics.method4138(var3);
            field841[++Statics.field1491 - 1] = var4 == null ? "" : var4.field2086;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hg.bx(ILdt;ZI)I")
    public static int method3438(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("fp.bb(ILdt;ZI)I")
    public static int method3064(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("gl.bk(ILdt;ZI)I")
    public static int method3153(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field840[++Statics.field5072 - 1] = client.method1105() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("do.br(ILdt;ZB)I")
    public static int method2251(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("fv.bq(ILdt;ZI)I")
    public static int method3063(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field840[--Statics.field5072] == 1;
            client.method3197(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ct.cf(ILdt;ZB)I")
    public static int method1103(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field840[--Statics.field5072];
            Object var45 = method4111(var44);
            int var46 = field840[--Statics.field5072];
            class519 var47 = client.method3202(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class521.method2990(var46);
            Statics.field109 = var47.method8308(var45, var48);
            if (Statics.field109 == null) {
                client.field637 = -1;
                Statics.field41 = null;
                if (arg0 == 7500) {
                    field840[++Statics.field5072 - 1] = 0;
                }
            } else {
                client.field637 = class521.method3777(var46);
                Statics.field41 = Statics.field109.iterator();
                if (arg0 == 7500) {
                    field840[++Statics.field5072 - 1] = Statics.field109.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field41 != null && Statics.field41.hasNext()) {
                field840[++Statics.field5072 - 1] = (Integer) Statics.field41.next();
            } else {
                field840[++Statics.field5072 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field5072 -= 3;
            int var3 = field840[Statics.field5072];
            int var4 = field840[Statics.field5072 + 1];
            int var5 = field840[Statics.field5072 + 2];
            int var6 = class521.method3777(var4);
            int var7 = class521.method5316(var4);
            int var8 = class521.method2990(var4);
            class520 var9 = class520.method7783(var3);
            class518 var10 = class518.method7125(var6);
            int[] var11 = var10.field5074[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8315(var7);
            if (var14 == null && var10.field5076 != null) {
                var14 = var10.field5076[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class515 var17 = class513.method7784(var16);
                    if (class515.field5062 == var17) {
                        field841[++Statics.field1491 - 1] = "";
                    } else {
                        field840[++Statics.field5072 - 1] = class513.method5594(var16);
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
                class515 var21 = class513.method7784(var11[var19]);
                if (class515.field5062 == var21) {
                    field841[++Statics.field1491 - 1] = (String) var14[var20];
                } else {
                    field840[++Statics.field5072 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field5072 -= 2;
            int var22 = field840[Statics.field5072];
            int var23 = field840[Statics.field5072 + 1];
            int var24 = 0;
            int var25 = class521.method3777(var23);
            int var26 = class521.method5316(var23);
            class520 var27 = class520.method7783(var22);
            class518 var28 = class518.method7125(var25);
            int[] var29 = var28.field5074[var26];
            Object[] var30 = var27.method8315(var26);
            if (var30 == null && var28.field5076 != null) {
                var30 = var28.field5076[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field840[++Statics.field5072 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field5072--;
            int var41 = field840[Statics.field5072];
            class519 var42 = client.method2786(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field109 = var42.method8308(0, 0);
            int var43 = 0;
            if (Statics.field109 != null) {
                client.field637 = var41;
                Statics.field41 = Statics.field109.iterator();
                var43 = Statics.field109.size();
            }
            if (arg0 == 7504) {
                field840[++Statics.field5072 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field840[--Statics.field5072];
            class520 var32 = class520.method7783(var31);
            field840[++Statics.field5072 - 1] = var32.field5085;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field840[--Statics.field5072];
            int var34 = -1;
            if (Statics.field109 != null && var33 >= 0 && var33 < Statics.field109.size()) {
                var34 = (Integer) Statics.field109.get(var33);
            }
            field840[++Statics.field5072 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field840[--Statics.field5072];
            Object var36 = method4111(var35);
            int var37 = field840[--Statics.field5072];
            class519 var38 = client.method3202(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class521.method3777(var37) != client.field637) {
                throw new RuntimeException();
            } else if (Statics.field109 == null && Statics.field109.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class521.method2990(var37);
                List var40 = var38.method8308(var36, var39);
                Statics.field109 = new LinkedList(Statics.field109);
                if (var40 == null) {
                    Statics.field109.clear();
                } else {
                    Statics.field109.retainAll(var40);
                }
                Statics.field41 = Statics.field109.iterator();
                if (arg0 == 7507) {
                    field840[++Statics.field5072 - 1] = Statics.field109.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ax.cg(ILdt;ZB)I")
    public static int method136(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("lf.cv(ILdt;ZI)I")
    public static int method5247(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field5072--;
            int var3 = field840[Statics.field5072];
            int var4 = field838[var3];
            class522.method7192(field839[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field5072 -= 3;
            int var5 = field840[Statics.field5072];
            int var6 = field840[Statics.field5072 + 1];
            int var7 = field840[Statics.field5072 + 2];
            int var8 = field838[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class422.method7169(field839[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ex.cx(II)V")
    public static void method2630(int arg0) {
        if (arg0 == -1 || !Statics.field1878.method5633(arg0)) {
            return;
        }
        class344[] var1 = Statics.field1878.field3569[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class344 var3 = var1[var2];
            if (var3.field3748 != null) {
                class88 var4 = new class88();
                var4.field1056 = var3;
                var4.field1058 = var3.field3748;
                method5584(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("qi.cp(ILmh;ZI)V")
    public static void method7380(int arg0, class334 arg1, boolean arg2) {
        class237 var3 = client.method7893().method7981(arg0);
        int var4 = Statics.field2420.field1118;
        int var5 = (Statics.field2420.field1247 >> 7) + Statics.field1917;
        int var6 = (Statics.field2420.field1173 >> 7) + Statics.field1322;
        class334 var7 = new class334(var4, var5, var6);
        client.method7893().method7978(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("pn.ce(Ltu;I)Ljava/lang/Object;")
    public static Object method6973(class515 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5061) {
            case 0:
                return field840[--Statics.field5072];
            case 2:
                return field841[--Statics.field1491];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("io.ci(II)Ljava/lang/Object;")
    public static Object method4111(int arg0) {
        return method6973((class515) class385.method164(class515.method8280(), arg0));
    }
}
