package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cz")
public class class71 {

    @ObfuscatedName("cz.ar")
    public static int[] field864 = new int[5];

    @ObfuscatedName("cz.ag")
    public static int[][] field857 = new int[5][5000];

    @ObfuscatedName("cz.ao")
    public static int[] field851 = new int[1000];

    @ObfuscatedName("cz.aa")
    public static String[] field852 = new String[1000];

    @ObfuscatedName("cz.an")
    public static int field860 = 0;

    @ObfuscatedName("cz.ad")
    public static class64[] field854 = new class64[50];

    @ObfuscatedName("cz.ay")
    public static Calendar field855 = Calendar.getInstance();

    @ObfuscatedName("cz.as")
    public static final String[] field856 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cz.ah")
    public static boolean field858 = false;

    @ObfuscatedName("cz.ai")
    public static boolean field859 = false;

    @ObfuscatedName("cz.ac")
    public static ArrayList field850 = new ArrayList();

    @ObfuscatedName("cz.al")
    public static int field861 = 0;

    @ObfuscatedName("cz.bg")
    public static final double field847 = Math.log(2.0D);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jx.am(Ldr;I)V")
    public static void method4538(class88 arg0) {
        method729(arg0, 500000, 475000);
    }

    @ObfuscatedName("bf.ap(Ldr;IIB)V")
    public static void method729(class88 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1067;
        class79 var5;
        if (class529.method6290(arg0.field1063)) {
            Statics.field849 = (class263) var3[0];
            class178 var4 = class178.method7281(Statics.field849.field2690);
            var5 = class79.method8426(arg0.field1063, var4.field1842, var4.field1862);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class79.method4874(var6);
        }
        if (var5 != null) {
            method4463(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("jt.af(Ldr;Ldd;IIB)V")
    public static void method4463(class88 arg0, class79 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1067;
        Statics.field1469 = 0;
        Statics.field2300 = 0;
        int var5 = -1;
        int[] var6 = arg1.field986;
        int[] var7 = arg1.field982;
        byte var8 = -1;
        field860 = 0;
        field858 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            Statics.field848 = new int[arg1.field979];
            int var11 = 0;
            Statics.field1461 = new String[arg1.field985];
            int var12 = 0;
            for (int var13 = 1; var13 < var4.length; var13++) {
                if (var4[var13] instanceof Integer) {
                    int var14 = (Integer) var4[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1056;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1059;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1058 == null ? -1 : arg0.field1058.field3701;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1061;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1058 == null ? -1 : arg0.field1058.field3721;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1062 == null ? -1 : arg0.field1062.field3701;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1062 == null ? -1 : arg0.field1062.field3721;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1060;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1064;
                    }
                    Statics.field848[var11++] = var14;
                } else if (var4[var13] instanceof String) {
                    String var15 = (String) var4[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1065;
                    }
                    Statics.field1461[var12++] = var15;
                }
            }
            field861 = arg0.field1066;
            while (true) {
                var10++;
                if (var10 > arg2) {
                    throw new RuntimeException();
                }
                var5++;
                int var59 = var6[var5];
                if (var59 >= 100) {
                    boolean var46;
                    if (arg1.field982[var5] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    int var47 = method4123(var59, arg1, var46);
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
                    field851[++Statics.field1469 - 1] = var7[var5];
                } else if (var59 == 1) {
                    int var16 = var7[var5];
                    field851[++Statics.field1469 - 1] = class336.field3598[var16];
                } else if (var59 == 2) {
                    int var17 = var7[var5];
                    class336.field3598[var17] = field851[--Statics.field1469];
                    client.method3017(var17);
                } else if (var59 == 3) {
                    field852[++Statics.field2300 - 1] = arg1.field983[var5];
                } else if (var59 == 6) {
                    var5 += var7[var5];
                } else if (var59 == 7) {
                    Statics.field1469 -= 2;
                    if (field851[Statics.field1469] != field851[Statics.field1469 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 8) {
                    Statics.field1469 -= 2;
                    if (field851[Statics.field1469] == field851[Statics.field1469 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 9) {
                    Statics.field1469 -= 2;
                    if (field851[Statics.field1469] < field851[Statics.field1469 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 10) {
                    Statics.field1469 -= 2;
                    if (field851[Statics.field1469] > field851[Statics.field1469 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 21) {
                    if (field860 == 0) {
                        return;
                    }
                    class64 var19 = field854[--field860];
                    arg1 = var19.field473;
                    var6 = arg1.field986;
                    var7 = arg1.field982;
                    var5 = var19.field469;
                    Statics.field848 = var19.field470;
                    Statics.field1461 = var19.field471;
                } else if (var59 == 25) {
                    int var20 = var7[var5];
                    field851[++Statics.field1469 - 1] = class336.method1124(var20);
                } else if (var59 == 27) {
                    int var21 = var7[var5];
                    class336.method4530(var21, field851[--Statics.field1469]);
                } else if (var59 == 31) {
                    Statics.field1469 -= 2;
                    if (field851[Statics.field1469] <= field851[Statics.field1469 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 32) {
                    Statics.field1469 -= 2;
                    if (field851[Statics.field1469] >= field851[Statics.field1469 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 33) {
                    field851[++Statics.field1469 - 1] = Statics.field848[var7[var5]];
                } else if (var59 == 34) {
                    Statics.field848[var7[var5]] = field851[--Statics.field1469];
                } else if (var59 == 35) {
                    field852[++Statics.field2300 - 1] = Statics.field1461[var7[var5]];
                } else if (var59 == 36) {
                    Statics.field1461[var7[var5]] = field852[--Statics.field2300];
                } else if (var59 == 37) {
                    int var22 = var7[var5];
                    Statics.field2300 -= var22;
                    String var23 = Statics.method5763(field852, Statics.field2300, var22);
                    field852[++Statics.field2300 - 1] = var23;
                } else if (var59 == 38) {
                    Statics.field1469--;
                } else if (var59 == 39) {
                    Statics.field2300--;
                } else if (var59 == 40) {
                    int var24 = var7[var5];
                    class79 var25 = class79.method4874(var24);
                    int[] var26 = new int[var25.field979];
                    String[] var27 = new String[var25.field985];
                    for (int var28 = 0; var28 < var25.field984; var28++) {
                        var26[var28] = field851[Statics.field1469 - var25.field984 + var28];
                    }
                    for (int var29 = 0; var29 < var25.field987; var29++) {
                        var27[var29] = field852[Statics.field2300 - var25.field987 + var29];
                    }
                    Statics.field1469 -= var25.field984;
                    Statics.field2300 -= var25.field987;
                    class64 var30 = new class64();
                    var30.field473 = arg1;
                    var30.field469 = var5;
                    var30.field470 = Statics.field848;
                    var30.field471 = Statics.field1461;
                    field854[++field860 - 1] = var30;
                    arg1 = var25;
                    var6 = var25.field986;
                    var7 = var25.field982;
                    var5 = -1;
                    Statics.field848 = var26;
                    Statics.field1461 = var27;
                } else if (var59 == 42) {
                    field851[++Statics.field1469 - 1] = Statics.field1293.method2668(var7[var5]);
                } else if (var59 == 43) {
                    Statics.field1293.method2679(var7[var5], field851[--Statics.field1469]);
                } else if (var59 == 44) {
                    int var31 = var7[var5] >> 16;
                    int var32 = var7[var5] & 0xFFFF;
                    int var33 = field851[--Statics.field1469];
                    if (var33 < 0 || var33 > 5000) {
                        throw new RuntimeException();
                    }
                    field864[var31] = var33;
                    byte var34 = -1;
                    if (var32 == 105) {
                        var34 = 0;
                    }
                    for (int var35 = 0; var35 < var33; var35++) {
                        field857[var31][var35] = var34;
                    }
                } else if (var59 == 45) {
                    int var36 = var7[var5];
                    int var37 = field851[--Statics.field1469];
                    if (var37 < 0 || var37 >= field864[var36]) {
                        throw new RuntimeException();
                    }
                    field851[++Statics.field1469 - 1] = field857[var36][var37];
                } else if (var59 == 46) {
                    int var38 = var7[var5];
                    Statics.field1469 -= 2;
                    int var39 = field851[Statics.field1469];
                    if (var39 < 0 || var39 >= field864[var38]) {
                        throw new RuntimeException();
                    }
                    field857[var38][var39] = field851[Statics.field1469 + 1];
                } else if (var59 == 47) {
                    String var40 = Statics.field1293.method2674(var7[var5]);
                    if (var40 == null) {
                        var40 = class367.field4120;
                    }
                    field852[++Statics.field2300 - 1] = var40;
                } else if (var59 == 48) {
                    Statics.field1293.method2673(var7[var5], field852[--Statics.field2300]);
                } else if (var59 == 49) {
                    String var41 = Statics.field1293.method2670(var7[var5]);
                    field852[++Statics.field2300 - 1] = var41;
                } else if (var59 == 50) {
                    Statics.field1293.method2708(var7[var5], field852[--Statics.field2300]);
                } else if (var59 == 60) {
                    class504 var42 = arg1.field988[var7[var5]];
                    class488 var43 = (class488) var42.method8286((long) field851[--Statics.field1469]);
                    if (var43 != null) {
                        var5 += var43.field4887;
                    }
                } else if (var59 == 74) {
                    Integer var44 = Statics.field4433.method3116(var7[var5]);
                    if (var44 == null) {
                        field851[++Statics.field1469 - 1] = -1;
                    } else {
                        field851[++Statics.field1469 - 1] = var44;
                    }
                } else if (var59 == 76) {
                    Integer var45 = Statics.field4518.method7901(var7[var5]);
                    if (var45 == null) {
                        field851[++Statics.field1469 - 1] = -1;
                    } else {
                        field851[++Statics.field1469 - 1] = var45;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var57) {
            var9 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(arg1.field4889).append(" ");
            for (int var51 = field860 - 1; var51 >= 0; var51--) {
                var50.append("").append(field854[var51].field473.field4889).append(" ");
            }
            var50.append("").append(var8);
            class557.method6332(var50.toString(), var57);
        } finally {
            while (field850.size() > 0) {
                class103 var54 = (class103) field850.remove(0);
                client.method1115(var54.method2619(), var54.method2621(), var54.method2620(), var54.method2622(), "");
            }
            if (field858) {
                field858 = false;
                client.method884();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class557.method6332("Warning: Script " + arg1.field980 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("ig.aj(ILdd;ZB)I")
    public static int method4123(int arg0, class79 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method432(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method7263(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2965(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method716(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1188(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method5080(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method6331(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method5431(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method6869(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3324(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method428(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method7263(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2965(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method716(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1188(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method5080(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method489(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return Statics.method6631(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method730(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method3464(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method428(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2342(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2851(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method6314(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method6403(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method2235(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method2149(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method4033(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method3090(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return Statics.method834(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method6309(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method2808(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method5084(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method3393(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method6549(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method5726(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method3228(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method298(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3833(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method450(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method5439(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method6844(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method11(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method6845(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method3255(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method3392(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method4217(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method2611(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method1127(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method3056(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.aq(ILdd;ZB)I")
    public static int method432(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1469 -= 3;
            int var3 = field851[Statics.field1469];
            int var4 = field851[Statics.field1469 + 1];
            int var5 = field851[Statics.field1469 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class347 var6 = Statics.field4415.method5742(var3);
            if (var6.field3839 == null) {
                var6.field3839 = new class347[var5 + 1];
            }
            if (var6.field3839.length <= var5) {
                class347[] var7 = new class347[var5 + 1];
                for (int var8 = 0; var8 < var6.field3839.length; var8++) {
                    var7[var8] = var6.field3839[var8];
                }
                var6.field3839 = var7;
            }
            if (var5 > 0 && var6.field3839[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class347 var9 = new class347();
            var9.field3799 = var4;
            var9.field3812 = var9.field3701 = var6.field3701;
            var9.field3721 = var5;
            var9.field3700 = true;
            if (var4 == 12) {
                var9.method6107();
                var9.method6094().method5858(new class106(var9));
                var9.method6094().method5857(new class107(var9));
            }
            var6.field3839[var5] = var9;
            if (arg2) {
                Statics.field163 = var9;
            } else {
                Statics.field1933 = var9;
            }
            Statics.method5074(var6);
            return 1;
        } else if (arg0 == 101) {
            class347 var10 = arg2 ? Statics.field163 : Statics.field1933;
            class347 var11 = Statics.field4415.method5742(var10.field3701);
            var11.field3839[var10.field3721] = null;
            Statics.method5074(var11);
            return 1;
        } else if (arg0 == 102) {
            class347 var12 = Statics.field4415.method5742(field851[--Statics.field1469]);
            var12.field3839 = null;
            Statics.method5074(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1469 -= 2;
            int var13 = field851[Statics.field1469];
            int var14 = field851[Statics.field1469 + 1];
            class347 var15 = Statics.field4415.method5741(var13, var14);
            if (var15 == null || var14 == -1) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = 1;
                if (arg2) {
                    Statics.field163 = var15;
                } else {
                    Statics.field1933 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class347 var16 = Statics.field4415.method5742(field851[--Statics.field1469]);
            if (var16 == null) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = 1;
                if (arg2) {
                    Statics.field163 = var16;
                } else {
                    Statics.field1933 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qt.ar(ILdd;ZI)I")
    public static int method7263(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class347 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field851[--Statics.field1469];
            var4 = Statics.field4415.method5742(var3);
        } else {
            var4 = arg2 ? Statics.field163 : Statics.field1933;
        }
        if (arg0 == 1000) {
            Statics.field1469 -= 4;
            var4.field3817 = field851[Statics.field1469];
            var4.field3712 = field851[Statics.field1469 + 1];
            var4.field3738 = field851[Statics.field1469 + 2];
            var4.field3821 = field851[Statics.field1469 + 3];
            Statics.method5074(var4);
            Statics.field3067.method1216(var4);
            if (var3 != -1 && var4.field3799 == 0) {
                client.method213(Statics.field4415.field3611[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1469 -= 4;
            var4.field3713 = field851[Statics.field1469];
            var4.field3714 = field851[Statics.field1469 + 1];
            var4.field3692 = field851[Statics.field1469 + 2];
            var4.field3710 = field851[Statics.field1469 + 3];
            Statics.method5074(var4);
            Statics.field3067.method1216(var4);
            if (var3 != -1 && var4.field3799 == 0) {
                client.method213(Statics.field4415.field3611[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field851[--Statics.field1469] == 1;
            if (var4.field3722 != var5) {
                var4.field3722 = var5;
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3849 = field851[--Statics.field1469] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3850 = field851[--Statics.field1469] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fx.ag(ILdd;ZI)I")
    public static int method2965(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class347 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field851[--Statics.field1469];
            var4 = Statics.field4415.method5742(var3);
        } else {
            var4 = arg2 ? Statics.field163 : Statics.field1933;
        }
        if (arg0 == 1100) {
            Statics.field1469 -= 2;
            int var5 = field851[Statics.field1469];
            int var6 = field851[Statics.field1469 + 1];
            if (var4.field3799 == 12) {
                class345 var7 = var4.method6094();
                if (var7 != null && var7.method5820(var5, var6)) {
                    Statics.method5074(var4);
                }
            } else {
                var4.field3795 = var5;
                if (var4.field3795 > var4.field3725 - var4.field3778) {
                    var4.field3795 = var4.field3725 - var4.field3778;
                }
                if (var4.field3795 < 0) {
                    var4.field3795 = 0;
                }
                var4.field3724 = var6;
                if (var4.field3724 > var4.field3709 - var4.field3718) {
                    var4.field3724 = var4.field3709 - var4.field3718;
                }
                if (var4.field3724 < 0) {
                    var4.field3724 = 0;
                }
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3842 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3689 = field851[--Statics.field1469] == 1;
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3733 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3735 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3727 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3740 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3741 = field851[--Statics.field1469] == 1;
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3746 = 1;
            var4.field3747 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1469 -= 6;
            var4.field3752 = field851[Statics.field1469];
            var4.field3717 = field851[Statics.field1469 + 1];
            var4.field3754 = field851[Statics.field1469 + 2];
            var4.field3755 = field851[Statics.field1469 + 3];
            var4.field3756 = field851[Statics.field1469 + 4];
            var4.field3757 = field851[Statics.field1469 + 5];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field851[--Statics.field1469];
            if (var4.field3783 != var8) {
                var4.field3783 = var8;
                var4.field3745 = 0;
                var4.field3838 = 0;
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3761 = field851[--Statics.field1469] == 1;
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field852[--Statics.field2300];
            if (var4.field3799 == 12) {
                class345 var10 = var4.method6094();
                if (var10 != null && var10.method5866()) {
                    var10.method6033(var9);
                } else {
                    var4.field3765 = var9;
                }
                Statics.method5074(var4);
            } else if (!var9.equals(var4.field3765)) {
                var4.field3765 = var9;
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3707 = field851[--Statics.field1469];
            if (var4.field3799 == 12) {
                class345 var11 = var4.method6094();
                if (var11 != null) {
                    var11.method5827();
                }
            }
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1469 -= 3;
            if (var4.field3799 == 12) {
                class345 var12 = var4.method6094();
                if (var12 != null) {
                    var12.method5829(field851[Statics.field1469], field851[Statics.field1469 + 1]);
                    var12.method5822(field851[Statics.field1469 + 2]);
                }
            } else {
                var4.field3768 = field851[Statics.field1469];
                var4.field3769 = field851[Statics.field1469 + 1];
                var4.field3767 = field851[Statics.field1469 + 2];
            }
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3770 = field851[--Statics.field1469] == 1;
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3742 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3705 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3764 = field851[--Statics.field1469] == 1;
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3696 = field851[--Statics.field1469] == 1;
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1469 -= 2;
            var4.field3725 = field851[Statics.field1469];
            var4.field3709 = field851[Statics.field1469 + 1];
            Statics.method5074(var4);
            if (var3 != -1 && var4.field3799 == 0) {
                client.method213(Statics.field4415.field3611[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method5081(var4.field3701, var4.field3721);
            client.field522 = var4;
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3803 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3728 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3734 = field851[--Statics.field1469];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field851[--Statics.field1469];
            class543 var14 = (class543) class389.method6514(class543.method3251(), var13);
            if (var14 != null) {
                var4.field3732 = var14;
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field851[--Statics.field1469] == 1;
            var4.field3736 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field851[--Statics.field1469] == 1;
            var4.field3762 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3729 = field852[--Statics.field2300];
            Statics.method5074(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6098(field852[--Statics.field2300], "", Statics.field1431, Statics.method4573());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field1469 -= 2;
            var4.method6136(field851[Statics.field1469], field851[Statics.field1469 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6103(field852[--Statics.field2300], field851[--Statics.field1469]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field1469--;
            class340 var17 = var4.method6123();
            if (var17 != null) {
                var17.field3624 = field851[Statics.field1469];
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field1469--;
            class340 var18 = var4.method6123();
            if (var18 != null) {
                var18.field3620 = field851[Statics.field1469];
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field2300--;
            class345 var19 = var4.method6094();
            if (var19 != null) {
                var4.field3753 = field852[Statics.field2300];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field1469--;
            class340 var20 = var4.method6123();
            if (var20 != null) {
                var20.field3621 = field851[Statics.field1469];
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field1469--;
            class345 var21 = var4.method6094();
            if (var21 != null && var21.method5817(field851[Statics.field1469])) {
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field1469--;
            class345 var22 = var4.method6094();
            if (var22 != null && var22.method5818(field851[Statics.field1469])) {
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field1469--;
            class345 var23 = var4.method6094();
            if (var23 != null && var23.method5819(field851[Statics.field1469])) {
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field851[--Statics.field1469] == 1;
            client.field609.method4040();
            class345 var25 = var4.method6094();
            if (var25 != null && var25.method5869(var24)) {
                if (var24) {
                    client.field609.method4035(var4);
                }
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field851[--Statics.field1469] == 1;
            if (!var26 && client.field609.method4036() == var4) {
                client.field609.method4040();
                Statics.method5074(var4);
            }
            class345 var27 = var4.method6094();
            if (var27 != null) {
                var27.method5812(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field1469 -= 2;
            class345 var28 = var4.method6094();
            if (var28 != null && var28.method5835(field851[Statics.field1469], field851[Statics.field1469 + 1])) {
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field1469--;
            class345 var29 = var4.method6094();
            if (var29 != null && var29.method5835(field851[Statics.field1469], field851[Statics.field1469])) {
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field1469--;
            class345 var30 = var4.method6094();
            if (var30 != null) {
                var30.method5840(field851[Statics.field1469]);
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field1469--;
            class345 var31 = var4.method6094();
            if (var31 != null) {
                var31.method5823(field851[Statics.field1469]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field1469--;
            class345 var32 = var4.method6094();
            if (var32 != null) {
                var32.method5826(field851[Statics.field1469]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field1469--;
            class345 var33 = var4.method6094();
            if (var33 != null) {
                var33.method5825(field851[Statics.field1469]);
                Statics.method5074(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field1469 -= 2;
            class28 var34 = var4.method6118();
            if (var34 != null) {
                var34.method422(field851[Statics.field1469], field851[Statics.field1469 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field1469 -= 2;
            class28 var35 = var4.method6118();
            if (var35 != null) {
                var35.method388((char) field851[Statics.field1469], field851[Statics.field1469 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6162(field852[--Statics.field2300], Statics.field1431);
            return 1;
        } else if (arg0 == 1151) {
            Statics.field2300 -= 3;
            String var36 = field852[Statics.field2300];
            String var37 = field852[Statics.field2300 + 1];
            String var38 = field852[Statics.field2300 + 2];
            long var39 = Statics.method4573();
            long var41 = client.method4080();
            String var43 = client.method2062().method8014(client.method2062().field4927);
            if (var39 != -1L) {
                var36 = var36.replaceAll("%userid%", Long.toString(var39));
            }
            if (var41 != -1L) {
                var36 = var36.replaceAll("%userhash%", Long.toString(var41));
            }
            if (!var43.isEmpty()) {
                var36 = var36.replaceAll("%deviceid%", var43);
            }
            var4.method6099(var36, var37, var38, var43, Long.toString(var41), Statics.field1431);
            return 1;
        } else if (arg0 == 1152) {
            if (var4.field3799 == 11) {
                boolean var44 = class218.method3348().method3970(var4.method6112().method3832());
                field851[++Statics.field1469 - 1] = var44 ? 1 : 0;
            } else {
                System.out.println("Attempting to call function on a non-CRMView object.");
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bc.ao(ILdd;ZI)I")
    public static int method716(int arg0, class79 arg1, boolean arg2) {
        class347 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field4415.method5742(field851[--Statics.field1469]);
        } else {
            var3 = arg2 ? Statics.field163 : Statics.field1933;
        }
        Statics.method5074(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1469 -= 2;
            int var9 = field851[Statics.field1469];
            int var10 = field851[Statics.field1469 + 1];
            var3.field3822 = var9;
            var3.field3836 = var10;
            class203 var11 = class203.method5762(var9);
            var3.field3754 = var11.field2161;
            var3.field3755 = var11.field2162;
            var3.field3756 = var11.field2163;
            var3.field3752 = var11.field2164;
            var3.field3717 = var11.field2165;
            var3.field3757 = var11.field2160;
            if (arg0 == 1205) {
                var3.field3833 = 0;
            } else if (arg0 == 1212 | var11.field2166 == 1) {
                var3.field3833 = 1;
            } else {
                var3.field3833 = 2;
            }
            if (var3.field3786 > 0) {
                var3.field3757 = var3.field3757 * 32 / var3.field3786;
            } else if (var3.field3713 > 0) {
                var3.field3757 = var3.field3757 * 32 / var3.field3713;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3746 = 2;
            var3.field3747 = field851[--Statics.field1469];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3746 = 3;
            var3.field3747 = Statics.field133.field1099.method5794();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field851[--Statics.field1469] == 1;
            class347.method2609(var3, Statics.field133.field1099, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field851[--Statics.field1469];
            if (var3.field3760 == null) {
                throw new RuntimeException("");
            }
            class347.method2350(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field1469 -= 2;
            int var6 = field851[Statics.field1469];
            int var7 = field851[Statics.field1469 + 1];
            if (var3.field3760 == null) {
                throw new RuntimeException("");
            }
            class347.method2946(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field851[--Statics.field1469];
            if (var3.field3760 == null) {
                throw new RuntimeException("");
            }
            class347.method5556(var3, Statics.field133.field1099.field3641, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cn.ae(ILdd;ZI)I")
    public static int method1188(int arg0, class79 arg1, boolean arg2) {
        boolean var3 = true;
        class347 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.field4415.method5742(field851[--Statics.field1469]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field163 : Statics.field1933;
        }
        if (arg0 == 1300) {
            int var5 = field851[--Statics.field1469] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method6115(var5, field852[--Statics.field2300]);
                return 1;
            } else {
                Statics.field2300--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1469 -= 2;
            int var6 = field851[Statics.field1469];
            int var7 = field851[Statics.field1469 + 1];
            var4.field3726 = Statics.field4415.method5741(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3787 = field851[--Statics.field1469] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3785 = field851[--Statics.field1469];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3749 = field851[--Statics.field1469];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3782 = field852[--Statics.field2300];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3744 = field852[--Statics.field2300];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3751 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3851 = field851[--Statics.field1469] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field1469--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1469 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field851[Statics.field1469 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field851[Statics.field1469 + var10];
                        var9[var10 / 2] = (byte) field851[Statics.field1469 + var10 + 1];
                    }
                }
            } else {
                Statics.field1469 -= 2;
                var8 = new byte[] { (byte) field851[Statics.field1469] };
                var9 = new byte[] { (byte) field851[Statics.field1469 + 1] };
            }
            int var11 = field851[--Statics.field1469] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method431(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1469 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field851[Statics.field1469] };
            byte[] var14 = new byte[] { (byte) field851[Statics.field1469 + 1] };
            method431(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1469 -= 3;
            int var15 = field851[Statics.field1469] - 1;
            int var16 = field851[Statics.field1469 + 1];
            int var17 = field851[Statics.field1469 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method4032(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field851[--Statics.field1469];
            int var20 = field851[--Statics.field1469];
            method4032(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1469--;
            int var21 = field851[Statics.field1469] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method2184(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method2184(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.aa(Lnn;I[B[BI)V")
    public static final void method431(class347 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3776 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3776 = new byte[11][];
            arg0.field3797 = new byte[11][];
            arg0.field3780 = new int[11];
            arg0.field3788 = new int[11];
        }
        arg0.field3776[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3777 = false;
            for (int var4 = 0; var4 < arg0.field3776.length; var4++) {
                if (arg0.field3776[var4] != null) {
                    arg0.field3777 = true;
                    break;
                }
            }
        } else {
            arg0.field3777 = true;
        }
        arg0.field3797[arg1] = arg3;
    }

    @ObfuscatedName("iw.au(Lnn;IIIB)V")
    public static final void method4032(class347 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3780 == null) {
            throw new RuntimeException();
        }
        arg0.field3780[arg1] = arg2;
        arg0.field3788[arg1] = arg3;
    }

    @ObfuscatedName("dg.an(Lnn;II)V")
    public static final void method2184(class347 arg0, int arg1) {
        if (arg0.field3776 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3848 == null) {
            arg0.field3848 = new int[arg0.field3776.length];
        }
        arg0.field3848[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("kt.ad(ILdd;ZB)I")
    public static int method5080(int arg0, class79 arg1, boolean arg2) {
        class347 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field4415.method5742(field851[--Statics.field1469]);
        } else {
            var3 = arg2 ? Statics.field163 : Statics.field1933;
        }
        String var4 = field852[--Statics.field2300];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field851[--Statics.field1469];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field851[--Statics.field1469];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field852[--Statics.field2300];
            } else {
                var7[var8] = Integer.valueOf(field851[--Statics.field1469]);
            }
        }
        int var9 = field851[--Statics.field1469];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3791 = var7;
        } else if (arg0 == 1401) {
            var3.field3794 = var7;
        } else if (arg0 == 1402) {
            var3.field3793 = var7;
        } else if (arg0 == 1403) {
            var3.field3737 = var7;
        } else if (arg0 == 1404) {
            var3.field3750 = var7;
        } else if (arg0 == 1405) {
            var3.field3798 = var7;
        } else if (arg0 == 1406) {
            var3.field3801 = var7;
        } else if (arg0 == 1407) {
            var3.field3789 = var7;
            var3.field3823 = var5;
        } else if (arg0 == 1408) {
            var3.field3808 = var7;
        } else if (arg0 == 1409) {
            var3.field3811 = var7;
        } else if (arg0 == 1410) {
            var3.field3781 = var7;
        } else if (arg0 == 1411) {
            var3.field3792 = var7;
        } else if (arg0 == 1412) {
            var3.field3796 = var7;
        } else if (arg0 == 1414) {
            var3.field3804 = var7;
            var3.field3805 = var5;
        } else if (arg0 == 1415) {
            var3.field3806 = var7;
            var3.field3807 = var5;
        } else if (arg0 == 1416) {
            var3.field3800 = var7;
        } else if (arg0 == 1417) {
            var3.field3772 = var7;
        } else if (arg0 == 1418) {
            var3.field3708 = var7;
        } else if (arg0 == 1419) {
            var3.field3758 = var7;
        } else if (arg0 == 1420) {
            var3.field3816 = var7;
        } else if (arg0 == 1421) {
            var3.field3790 = var7;
        } else if (arg0 == 1422) {
            var3.field3820 = var7;
        } else if (arg0 == 1423) {
            var3.field3766 = var7;
        } else if (arg0 == 1424) {
            var3.field3739 = var7;
        } else if (arg0 == 1425) {
            var3.field3824 = var7;
        } else if (arg0 == 1426) {
            var3.field3825 = var7;
        } else if (arg0 == 1427) {
            var3.field3774 = var7;
        } else if (arg0 == 1428) {
            var3.field3818 = var7;
        } else if (arg0 == 1429) {
            var3.field3819 = var7;
        } else if (arg0 == 1430) {
            var3.field3814 = var7;
        } else if (arg0 == 1431) {
            var3.field3815 = var7;
        } else if (arg0 == 1434) {
            var3.field3826 = var7;
        } else if (arg0 == 1435) {
            var3.field3810 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class343 var10 = var3.method6110();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3634 = var7;
                } else if (arg0 == 1437) {
                    var10.field3635 = var7;
                } else if (arg0 == 1438) {
                    var10.field3630 = var7;
                } else if (arg0 == 1439) {
                    var10.field3633 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3809 = true;
        return 1;
    }

    @ObfuscatedName("oc.ax(ILdd;ZB)I")
    public static int method6331(int arg0, class79 arg1, boolean arg2) {
        class347 var3 = arg2 ? Statics.field163 : Statics.field1933;
        if (arg0 == 1500) {
            field851[++Statics.field1469 - 1] = var3.field3715;
            return 1;
        } else if (arg0 == 1501) {
            field851[++Statics.field1469 - 1] = var3.field3716;
            return 1;
        } else if (arg0 == 1502) {
            field851[++Statics.field1469 - 1] = var3.field3778;
            return 1;
        } else if (arg0 == 1503) {
            field851[++Statics.field1469 - 1] = var3.field3718;
            return 1;
        } else if (arg0 == 1504) {
            field851[++Statics.field1469 - 1] = var3.field3722 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field851[++Statics.field1469 - 1] = var3.field3812;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mt.aw(ILdd;ZI)I")
    public static int method5431(int arg0, class79 arg1, boolean arg2) {
        class347 var3 = arg2 ? Statics.field163 : Statics.field1933;
        if (arg0 == 1600) {
            field851[++Statics.field1469 - 1] = var3.field3795;
            return 1;
        } else if (arg0 == 1601) {
            field851[++Statics.field1469 - 1] = var3.field3724;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3799 == 12) {
                class345 var4 = var3.method6094();
                if (var4 != null) {
                    field852[++Statics.field2300 - 1] = var4.method5836().method6955();
                    return 1;
                }
            }
            field852[++Statics.field2300 - 1] = var3.field3765;
            return 1;
        } else if (arg0 == 1603) {
            field851[++Statics.field1469 - 1] = var3.field3725;
            return 1;
        } else if (arg0 == 1604) {
            field851[++Statics.field1469 - 1] = var3.field3709;
            return 1;
        } else if (arg0 == 1605) {
            field851[++Statics.field1469 - 1] = var3.field3757;
            return 1;
        } else if (arg0 == 1606) {
            field851[++Statics.field1469 - 1] = var3.field3754;
            return 1;
        } else if (arg0 == 1607) {
            field851[++Statics.field1469 - 1] = var3.field3756;
            return 1;
        } else if (arg0 == 1608) {
            field851[++Statics.field1469 - 1] = var3.field3755;
            return 1;
        } else if (arg0 == 1609) {
            field851[++Statics.field1469 - 1] = var3.field3733;
            return 1;
        } else if (arg0 == 1610) {
            field851[++Statics.field1469 - 1] = var3.field3734;
            return 1;
        } else if (arg0 == 1611) {
            field851[++Statics.field1469 - 1] = var3.field3842;
            return 1;
        } else if (arg0 == 1612) {
            field851[++Statics.field1469 - 1] = var3.field3728;
            return 1;
        } else if (arg0 == 1613) {
            field851[++Statics.field1469 - 1] = var3.field3732.method34();
            return 1;
        } else if (arg0 == 1614) {
            field851[++Statics.field1469 - 1] = var3.field3762 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class340 var5 = var3.method6123();
                field851[++Statics.field1469 - 1] = var5 == null ? 0 : var5.field3624;
            }
            if (arg0 == 1618) {
                class340 var6 = var3.method6123();
                field851[++Statics.field1469 - 1] = var6 == null ? 0 : var6.field3620;
                return 1;
            } else if (arg0 == 1619) {
                class345 var7 = var3.method6094();
                field852[++Statics.field2300 - 1] = var7 == null ? "" : var7.method5958().method6955();
                return 1;
            } else if (arg0 == 1620) {
                class340 var8 = var3.method6123();
                field851[++Statics.field1469 - 1] = var8 == null ? 0 : var8.field3621;
                return 1;
            } else if (arg0 == 1621) {
                class345 var9 = var3.method6094();
                field851[++Statics.field1469 - 1] = var9 == null ? 0 : var9.method5846();
                return 1;
            } else if (arg0 == 1622) {
                class345 var10 = var3.method6094();
                field851[++Statics.field1469 - 1] = var10 == null ? 0 : var10.method5870();
                return 1;
            } else if (arg0 == 1623) {
                class345 var11 = var3.method6094();
                field851[++Statics.field1469 - 1] = var11 == null ? 0 : var11.method5871();
                return 1;
            } else if (arg0 == 1624) {
                class345 var12 = var3.method6094();
                field851[++Statics.field1469 - 1] = var12 != null && var12.method5862() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class345 var13 = var3.method6094();
                field851[++Statics.field1469 - 1] = var13 != null && var13.method6066() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class345 var14 = var3.method6094();
                field852[++Statics.field2300 - 1] = var14 == null ? "" : var14.method5861().method7222();
                return 1;
            } else if (arg0 == 1627) {
                class345 var15 = var3.method6094();
                int var16 = var15 == null ? 0 : var15.method5925();
                int var17 = var15 == null ? 0 : var15.method5865();
                field851[++Statics.field1469 - 1] = Math.min(var16, var17);
                field851[++Statics.field1469 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class345 var18 = var3.method6094();
                field851[++Statics.field1469 - 1] = var18 == null ? 0 : var18.method5865();
                return 1;
            } else if (arg0 == 1629) {
                class345 var19 = var3.method6094();
                field851[++Statics.field1469 - 1] = var19 == null ? 0 : var19.method5873();
                return 1;
            } else if (arg0 == 1630) {
                class345 var20 = var3.method6094();
                field851[++Statics.field1469 - 1] = var20 == null ? 0 : var20.method6057();
                return 1;
            } else if (arg0 == 1631) {
                class345 var21 = var3.method6094();
                field851[++Statics.field1469 - 1] = var21 == null ? 0 : var21.method5874();
                return 1;
            } else if (arg0 == 1632) {
                class345 var22 = var3.method6094();
                field851[++Statics.field1469 - 1] = var22 == null ? 0 : var22.method5987();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method6118();
                field851[Statics.field1469 - 1] = var23 == null ? 0 : var23.method389(field851[Statics.field1469 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method6118();
                field851[Statics.field1469 - 1] = var24 == null ? 0 : var24.method390((char) field851[Statics.field1469 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("pz.az(ILdd;ZB)I")
    public static int method6869(int arg0, class79 arg1, boolean arg2) {
        class347 var3 = arg2 ? Statics.field163 : Statics.field1933;
        if (arg0 == 1700) {
            field851[++Statics.field1469 - 1] = var3.field3822;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3822 == -1) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = var3.field3836;
            }
            return 1;
        } else if (arg0 == 1702) {
            field851[++Statics.field1469 - 1] = var3.field3721;
            return 1;
        } else if (arg0 == 1707) {
            field851[++Statics.field1469 - 1] = var3.method6156() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method2989(var3);
        } else if (arg0 == 1709) {
            return method2876(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ff.av(Lnn;I)I")
    public static int method2989(class347 arg0) {
        if (arg0.field3799 == 11) {
            String var1 = field852[--Statics.field2300];
            field851[++Statics.field1469 - 1] = arg0.method6106(var1);
            return 1;
        } else {
            Statics.field2300--;
            field851[++Statics.field1469 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("es.ak(Lnn;I)I")
    public static int method2876(class347 arg0) {
        if (arg0.field3799 == 11) {
            String var1 = field852[--Statics.field2300];
            field852[++Statics.field2300 - 1] = arg0.method6200(var1);
            return 1;
        } else {
            field852[Statics.field2300 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("ge.ay(ILdd;ZI)I")
    public static int method3324(int arg0, class79 arg1, boolean arg2) {
        class347 var3 = arg2 ? Statics.field163 : Statics.field1933;
        if (arg0 == 1800) {
            field851[++Statics.field1469 - 1] = class348.method3187(Statics.method6900(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field851[--Statics.field1469];
            int var5 = var4 - 1;
            if (var3.field3751 == null || var5 >= var3.field3751.length || var3.field3751[var5] == null) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = var3.field3751[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3782 == null) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = var3.field3782;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.as(ILdd;ZS)I")
    public static int method428(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field861 >= 10) {
                throw new RuntimeException();
            }
            class347 var10;
            if (arg0 >= 2000) {
                var10 = Statics.field4415.method5742(field851[--Statics.field1469]);
            } else {
                var10 = arg2 ? Statics.field163 : Statics.field1933;
            }
            if (var10.field3774 == null) {
                return 0;
            }
            class88 var11 = new class88();
            var11.field1058 = var10;
            var11.field1067 = var10.field3774;
            var11.field1066 = field861 + 1;
            client.field714.method6666(var11);
            return 1;
        } else if (arg0 == 1928) {
            class347 var3 = arg2 ? Statics.field163 : Statics.field1933;
            int var4 = field851[--Statics.field1469];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class103 var5 = new class103(var4, var3.field3701, var3.field3721, var3.field3822);
            field850.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field1469 -= 3;
            int var6 = field851[Statics.field1469];
            int var7 = field851[Statics.field1469 + 1];
            int var8 = field851[Statics.field1469 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class103 var9 = new class103(var8, var6, var7, Statics.field4415.method5742(var6).field3822);
            field850.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.ab(ILdd;ZI)I")
    public static int method489(int arg0, class79 arg1, boolean arg2) {
        class347 var3 = Statics.field4415.method5742(field851[--Statics.field1469]);
        if (arg0 == 2500) {
            field851[++Statics.field1469 - 1] = var3.field3715;
            return 1;
        } else if (arg0 == 2501) {
            field851[++Statics.field1469 - 1] = var3.field3716;
            return 1;
        } else if (arg0 == 2502) {
            field851[++Statics.field1469 - 1] = var3.field3778;
            return 1;
        } else if (arg0 == 2503) {
            field851[++Statics.field1469 - 1] = var3.field3718;
            return 1;
        } else if (arg0 == 2504) {
            field851[++Statics.field1469 - 1] = var3.field3722 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field851[++Statics.field1469 - 1] = var3.field3812;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.ai(ILdd;ZB)I")
    public static int method730(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class347 var3 = Statics.field4415.method5742(field851[--Statics.field1469]);
            field851[++Statics.field1469 - 1] = var3.field3822;
            return 1;
        } else if (arg0 == 2701) {
            class347 var4 = Statics.field4415.method5742(field851[--Statics.field1469]);
            if (var4.field3822 == -1) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = var4.field3836;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field851[--Statics.field1469];
            class87 var6 = (class87) client.field655.method8301((long) var5);
            if (var6 == null) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field851[++Statics.field1469 - 1] = client.field671;
            return 1;
        } else if (arg0 == 2707) {
            class347 var7 = Statics.field4415.method5742(field851[--Statics.field1469]);
            field851[++Statics.field1469 - 1] = var7.method6156() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class347 var8 = Statics.field4415.method5742(field851[--Statics.field1469]);
            return method2989(var8);
        } else if (arg0 == 2709) {
            class347 var9 = Statics.field4415.method5742(field851[--Statics.field1469]);
            return method2876(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("he.ac(ILdd;ZI)I")
    public static int method3464(int arg0, class79 arg1, boolean arg2) {
        class347 var3 = Statics.field4415.method5742(field851[--Statics.field1469]);
        if (arg0 == 2800) {
            field851[++Statics.field1469 - 1] = class348.method3187(Statics.method6900(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field851[--Statics.field1469];
            int var5 = var4 - 1;
            if (var3.field3751 == null || var5 >= var3.field3751.length || var3.field3751[var5] == null) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = var3.field3751[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3782 == null) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = var3.field3782;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("di.al(ILdd;ZI)I")
    public static int method2342(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field852[--Statics.field2300];
            class111.method6511(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1469 -= 2;
            client.method6310(Statics.field133, field851[Statics.field1469], field851[Statics.field1469 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field859) {
                field858 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field852[--Statics.field2300];
            int var5 = 0;
            if (class403.method2128(var4)) {
                var5 = class403.method2543(var4);
            }
            class311 var6 = class311.method7979(class309.field3240, client.field561.field1404);
            var6.field3279.method8547(var5);
            client.field561.method2736(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field852[--Statics.field2300];
            class311 var8 = class311.method7979(class309.field3199, client.field561.field1404);
            var8.field3279.method8699(var7.length() + 1);
            var8.field3279.method8551(var7);
            client.field561.method2736(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field852[--Statics.field2300];
            class311 var10 = class311.method7979(class309.field3205, client.field561.field1404);
            var10.field3279.method8699(var9.length() + 1);
            var10.field3279.method8551(var9);
            client.field561.method2736(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field851[--Statics.field1469];
            String var12 = field852[--Statics.field2300];
            client.method7982(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1469 -= 3;
            int var13 = field851[Statics.field1469];
            int var14 = field851[Statics.field1469 + 1];
            int var15 = field851[Statics.field1469 + 2];
            class347 var16 = Statics.field4415.method5742(var15);
            client.method4011(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1469 -= 2;
            int var17 = field851[Statics.field1469];
            int var18 = field851[Statics.field1469 + 1];
            class347 var19 = arg2 ? Statics.field163 : Statics.field1933;
            client.method4011(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field320 = field851[--Statics.field1469] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field851[++Statics.field1469 - 1] = Statics.field1155.method2434() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1155.method2476(field851[--Statics.field1469] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field852[--Statics.field2300];
            boolean var21 = field851[--Statics.field1469] == 1;
            class32.method3975(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field851[--Statics.field1469];
            class311 var23 = class311.method7979(class309.field3255, client.field561.field1404);
            var23.field3279.method8737(var22);
            client.field561.method2736(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field851[--Statics.field1469];
            Statics.field2300 -= 2;
            String var25 = field852[Statics.field2300];
            String var26 = field852[Statics.field2300 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class311 var27 = class311.method7979(class309.field3169, client.field561.field1404);
                var27.field3279.method8737(1 + class531.method4114(var25) + class531.method4114(var26));
                var27.field3279.method8551(var25);
                var27.field3279.method8590(var24);
                var27.field3279.method8551(var26);
                client.field561.method2736(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field1469--;
            return 1;
        } else if (arg0 == 3118) {
            client.field659 = field851[--Statics.field1469] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field629 = field851[--Statics.field1469] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field851[--Statics.field1469] == 1) {
                client.field537 |= 0x1;
            } else {
                client.field537 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field851[--Statics.field1469] == 1) {
                client.field537 |= 0x2;
            } else {
                client.field537 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field851[--Statics.field1469] == 1) {
                client.field537 |= 0x4;
            } else {
                client.field537 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field851[--Statics.field1469] == 1) {
                client.field537 |= 0x8;
            } else {
                client.field537 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field537 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field544 = field851[--Statics.field1469] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field623 = field851[--Statics.field1469] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method4540(field851[--Statics.field1469] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field851[++Statics.field1469 - 1] = client.method2884() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1469 -= 2;
            client.field595 = field851[Statics.field1469];
            client.field596 = field851[Statics.field1469 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1469 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1469--;
            return 1;
        } else if (arg0 == 3132) {
            field851[++Statics.field1469 - 1] = Statics.field5134;
            field851[++Statics.field1469 - 1] = Statics.field199;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1469--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1469 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field799 = 3;
            client.field674 = field851[--Statics.field1469];
            return 1;
        } else if (arg0 == 3137) {
            client.field799 = 2;
            client.field674 = field851[--Statics.field1469];
            return 1;
        } else if (arg0 == 3138) {
            client.field799 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field799 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field799 = 3;
            client.field674 = arg2 ? Statics.field163.field3701 : Statics.field1933.field3701;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field851[--Statics.field1469] == 1;
            Statics.field1155.method2435(var28);
            return 1;
        } else if (arg0 == 3142) {
            field851[++Statics.field1469 - 1] = Statics.field1155.method2518() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field851[--Statics.field1469] == 1;
            client.field551 = var29;
            if (!var29) {
                Statics.field1155.method2503("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field851[++Statics.field1469 - 1] = client.field551 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field851[--Statics.field1469] == 1;
            Statics.field1155.method2488(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field851[++Statics.field1469 - 1] = Statics.field1155.method2445() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field851[++Statics.field1469 - 1] = class76.field912;
            return 1;
        } else if (arg0 == 3154) {
            field851[++Statics.field1469 - 1] = client.method6217();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field2300--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1469 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1469--;
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1469--;
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field2300--;
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1469--;
            field852[++Statics.field2300 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1469--;
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1469 -= 2;
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1469 -= 2;
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1469 -= 2;
            field852[++Statics.field2300 - 1] = "";
            field852[++Statics.field2300 - 1] = "";
            field852[++Statics.field2300 - 1] = "";
            field852[++Statics.field2300 - 1] = "";
            field852[++Statics.field2300 - 1] = "";
            field852[++Statics.field2300 - 1] = "";
            field852[++Statics.field2300 - 1] = "";
            field852[++Statics.field2300 - 1] = "";
            field852[++Statics.field2300 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1469--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1469--;
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1469--;
            return 1;
        } else if (arg0 == 3175) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field2300--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field2300--;
            return 1;
        } else if (arg0 == 3181) {
            client.method6286(field851[--Statics.field1469]);
            return 1;
        } else if (arg0 == 3182) {
            field851[++Statics.field1469 - 1] = client.method2287();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field851[--Statics.field1469];
            client.method4542(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.at(ILdd;ZI)I")
    public static int method2851(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1469 -= 3;
            Statics.method6326(field851[Statics.field1469], field851[Statics.field1469 + 1], field851[Statics.field1469 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field1469 -= 5;
            int var3 = field851[Statics.field1469];
            int var4 = field851[Statics.field1469 + 1];
            int var5 = field851[Statics.field1469 + 2];
            int var6 = field851[Statics.field1469 + 3];
            int var7 = field851[Statics.field1469 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method6307(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1469 -= 2;
            Statics.method6899(field851[Statics.field1469], field851[Statics.field1469 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class91 var50 = class91.field1091;
            class90 var51 = class90.field1083;
            int var52 = field851[--Statics.field1469];
            if (arg0 == 3212) {
                int var53 = field851[--Statics.field1469];
                var50 = (class91) class389.method6514(class91.method7(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field851[--Statics.field1469];
                var51 = (class90) class389.method6514(class90.method2183(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field851[--Statics.field1469];
                var50 = (class91) class389.method6514(class91.method7(), var55);
                if (var50 == null) {
                    var51 = (class90) class389.method6514(class90.method2183(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class91.field1093;
            } else if (arg0 == 3203) {
                var51 = class90.field1081;
            } else if (arg0 == 3205) {
                var51 = class90.field1086;
            } else if (arg0 == 3207) {
                var51 = class90.field1079;
            }
            if (class90.field1083 == var51) {
                switch(var50.field1094) {
                    case 1:
                        Statics.field1155.method2435(var52 == 1);
                        break;
                    case 2:
                        Statics.field1155.method2488(var52 == 1);
                        break;
                    case 3:
                        Statics.field1155.method2467(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field1155.method2441(var52);
                        break;
                    case 5:
                        client.method6286(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1084) {
                    case 1:
                        Statics.field1155.method2476(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method6847(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method322(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method3217(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class91 var38 = class91.field1091;
            class90 var39 = class90.field1083;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field851[--Statics.field1469];
                var38 = (class91) class389.method6514(class91.method7(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field851[--Statics.field1469];
                var39 = (class90) class389.method6514(class90.method2183(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field851[--Statics.field1469];
                var38 = (class91) class389.method6514(class91.method7(), var43);
                if (var38 == null) {
                    var39 = (class90) class389.method6514(class90.method2183(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class91.field1093;
            } else if (arg0 == 3204) {
                var39 = class90.field1081;
            } else if (arg0 == 3206) {
                var39 = class90.field1086;
            } else if (arg0 == 3208) {
                var39 = class90.field1079;
            }
            int var45;
            if (class90.field1083 == var39) {
                switch(var38.field1094) {
                    case 1:
                        var45 = Statics.field1155.method2518() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field1155.method2445() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field1155.method2440() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field1155.method2442();
                        break;
                    case 5:
                        var45 = client.method2287();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1084) {
                    case 1:
                        var45 = Statics.field1155.method2434() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field1155.method2496();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field1155.method2448();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field1155.method2450();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field851[++Statics.field1469 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field851[--Statics.field1469];
            int var10 = 0;
            class91 var11 = (class91) class389.method6514(class91.method7(), var9);
            if (var11 != null) {
                var10 = class91.field1091 == var11 ? 0 : 1;
            }
            field851[++Statics.field1469 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field851[--Statics.field1469];
            int var13 = 0;
            class90 var14 = (class90) class389.method6514(class90.method2183(), var12);
            if (var14 != null) {
                var13 = class90.field1083 == var14 ? 0 : 1;
            }
            field851[++Statics.field1469 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class91 var28 = class91.field1091;
            class90 var29 = class90.field1083;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field851[--Statics.field1469];
                var28 = (class91) class389.method6514(class91.method7(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field851[--Statics.field1469];
                var29 = (class90) class389.method6514(class90.method2183(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class90.field1083 == var29) {
                switch(var28.field1094) {
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
                switch(var29.field1084) {
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
            field851[++Statics.field1469 - 1] = var35;
            field851[++Statics.field1469 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field1469 -= 2;
            int var15 = field851[Statics.field1469];
            int var16 = field851[Statics.field1469 + 1];
            class320.method2387(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field1469 -= 6;
            int var17 = field851[Statics.field1469];
            int var18 = field851[Statics.field1469 + 1];
            int var19 = field851[Statics.field1469 + 2];
            int var20 = field851[Statics.field1469 + 3];
            int var21 = field851[Statics.field1469 + 4];
            int var22 = field851[Statics.field1469 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method6307(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field1469 -= 4;
            int var24 = field851[Statics.field1469];
            int var25 = field851[Statics.field1469 + 1];
            int var26 = field851[Statics.field1469 + 2];
            int var27 = field851[Statics.field1469 + 3];
            class320.method1847(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nb.bj(ILdd;ZI)I")
    public static int method6314(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field851[++Statics.field1469 - 1] = client.field677;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1469 -= 2;
            int var3 = field851[Statics.field1469];
            int var4 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = class85.method7656(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1469 -= 2;
            int var5 = field851[Statics.field1469];
            int var6 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = class85.method3390(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1469 -= 2;
            int var7 = field851[Statics.field1469];
            int var8 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = class85.method3103(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class171.method846(var9).field1804;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = client.field642[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = client.field518[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = client.field745[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1428;
            int var14 = (Statics.field133.field1232 >> 7) + Statics.field1900;
            int var15 = (Statics.field133.field1173 >> 7) + Statics.field2683;
            field851[++Statics.field1469 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field851[++Statics.field1469 - 1] = client.field680 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1469 -= 2;
            int var19 = field851[Statics.field1469] + 32768;
            int var20 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = class85.method7656(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1469 -= 2;
            int var21 = field851[Statics.field1469] + 32768;
            int var22 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = class85.method3390(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1469 -= 2;
            int var23 = field851[Statics.field1469] + 32768;
            int var24 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = class85.method3103(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field679 >= 2) {
                field851[++Statics.field1469 - 1] = client.field679;
            } else {
                field851[++Statics.field1469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field851[++Statics.field1469 - 1] = client.field590;
            return 1;
        } else if (arg0 == 3318) {
            field851[++Statics.field1469 - 1] = client.field499;
            return 1;
        } else if (arg0 == 3321) {
            field851[++Statics.field1469 - 1] = client.field672 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field851[++Statics.field1469 - 1] = client.field678;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field517) {
                field851[++Statics.field1469 - 1] = 1;
            } else {
                field851[++Statics.field1469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field851[++Statics.field1469 - 1] = client.field500;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1469 -= 4;
            int var25 = field851[Statics.field1469];
            int var26 = field851[Statics.field1469 + 1];
            int var27 = field851[Statics.field1469 + 2];
            int var28 = field851[Statics.field1469 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field851[++Statics.field1469 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field851[++Statics.field1469 - 1] = client.field513;
            return 1;
        } else if (arg0 == 3327) {
            field851[++Statics.field1469 - 1] = client.field784;
            return 1;
        } else if (arg0 == 3331) {
            field851[++Statics.field1469 - 1] = client.field672;
            return 1;
        } else if (arg0 == 3332) {
            int var32 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = client.field645[var32];
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ow.bd(ILdd;ZB)I")
    public static int method6403(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1469 -= 2;
            int var3 = field851[Statics.field1469];
            int var4 = field851[Statics.field1469 + 1];
            class184 var5 = class184.method95(var3);
            if (var5.field1919 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1918; var6++) {
                if (var5.field1912[var6] == var4) {
                    field852[++Statics.field2300 - 1] = var5.field1917[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field852[++Statics.field2300 - 1] = var5.field1916;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1469 -= 4;
            int var7 = field851[Statics.field1469];
            int var8 = field851[Statics.field1469 + 1];
            int var9 = field851[Statics.field1469 + 2];
            int var10 = field851[Statics.field1469 + 3];
            class184 var11 = class184.method95(var9);
            if (var11.field1914 != var7 || var11.field1919 != var8) {
                if (var8 == 115) {
                    field852[++Statics.field2300 - 1] = class367.field4120;
                } else {
                    field851[++Statics.field1469 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1918; var12++) {
                if (var11.field1912[var12] == var10) {
                    if (var8 == 115) {
                        field852[++Statics.field2300 - 1] = var11.field1917[var12];
                    } else {
                        field851[++Statics.field1469 - 1] = var11.field1920[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field852[++Statics.field2300 - 1] = var11.field1916;
                } else {
                    field851[++Statics.field1469 - 1] = var11.field1924;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field851[--Statics.field1469];
            class184 var14 = class184.method95(var13);
            field851[++Statics.field1469 - 1] = var14.method3383();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dt.bg(ILdd;ZI)I")
    public static int method2235(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = client.field662.method4053(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = client.field662.method4052(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = client.field662.method4054(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ca.bt(ILdd;ZI)I")
    public static int method2149(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field3588.field829 == 0) {
                field851[++Statics.field1469 - 1] = -2;
            } else if (Statics.field3588.field829 == 1) {
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = Statics.field3588.field827.method7622();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field851[--Statics.field1469];
            if (Statics.field3588.method1820() && var3 >= 0 && var3 < Statics.field3588.field827.method7622()) {
                class446 var4 = (class446) Statics.field3588.field827.method7626(var3);
                field852[++Statics.field2300 - 1] = var4.method7545();
                field852[++Statics.field2300 - 1] = var4.method7546();
            } else {
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field851[--Statics.field1469];
            if (Statics.field3588.method1820() && var5 >= 0 && var5 < Statics.field3588.field827.method7622()) {
                field851[++Statics.field1469 - 1] = ((class453) Statics.field3588.field827.method7626(var5)).field4743;
            } else {
                field851[++Statics.field1469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field851[--Statics.field1469];
            if (Statics.field3588.method1820() && var6 >= 0 && var6 < Statics.field3588.field827.method7622()) {
                field851[++Statics.field1469 - 1] = ((class453) Statics.field3588.field827.method7626(var6)).field4742;
            } else {
                field851[++Statics.field1469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field852[--Statics.field2300];
            int var8 = field851[--Statics.field1469];
            class69.method6299(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field852[--Statics.field2300];
            Statics.field3588.method1867(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field852[--Statics.field2300];
            Statics.field3588.method1831(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field852[--Statics.field2300];
            Statics.field3588.method1825(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field852[--Statics.field2300];
            boolean var13 = true;
            Statics.field3588.method1888(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field852[--Statics.field2300];
            String var15 = client.method5708(var14);
            field851[++Statics.field1469 - 1] = Statics.field3588.method1826(new class554(var15, Statics.field1465), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1292 == null) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = Statics.field1292.field4712;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1292 == null) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = Statics.field1292.method7622();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field851[--Statics.field1469];
            if (Statics.field1292 == null || var16 >= Statics.field1292.method7622()) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = Statics.field1292.method7626(var16).method7544().method9164();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field851[--Statics.field1469];
            if (Statics.field1292 == null || var17 >= Statics.field1292.method7622()) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = ((class453) Statics.field1292.method7626(var17)).method7646();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field851[--Statics.field1469];
            if (Statics.field1292 == null || var18 >= Statics.field1292.method7622()) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = ((class453) Statics.field1292.method7626(var18)).field4742;
            }
            return 1;
        } else if (arg0 == 3616) {
            field851[++Statics.field1469 - 1] = Statics.field1292 == null ? 0 : Statics.field1292.field4714;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field852[--Statics.field2300];
            client.method3216(var19);
            return 1;
        } else if (arg0 == 3618) {
            field851[++Statics.field1469 - 1] = Statics.field1292 == null ? 0 : Statics.field1292.field4715;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field852[--Statics.field2300];
            client.method66(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method1757();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field3588.method1820()) {
                field851[++Statics.field1469 - 1] = Statics.field3588.field830.method7622();
            } else {
                field851[++Statics.field1469 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field851[--Statics.field1469];
            if (Statics.field3588.method1820() && var21 >= 0 && var21 < Statics.field3588.field830.method7622()) {
                class452 var22 = (class452) Statics.field3588.field830.method7626(var21);
                field852[++Statics.field2300 - 1] = var22.method7545();
                field852[++Statics.field2300 - 1] = var22.method7546();
            } else {
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field852[--Statics.field2300];
            String var24 = client.method5708(var23);
            field851[++Statics.field1469 - 1] = Statics.field3588.method1866(new class554(var24, Statics.field1465)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field851[--Statics.field1469];
            if (Statics.field1292 == null || var25 >= Statics.field1292.method7622() || !Statics.field1292.method7626(var25).method7544().equals(Statics.field133.field1117)) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1292 == null || Statics.field1292.field4716 == null) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = Statics.field1292.field4716;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field851[--Statics.field1469];
            if (Statics.field1292 == null || var26 >= Statics.field1292.method7622() || !((class448) Statics.field1292.method7626(var26)).method7528()) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field851[--Statics.field1469];
            if (Statics.field1292 == null || var27 >= Statics.field1292.method7622() || !((class448) Statics.field1292.method7626(var27)).method7524()) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field3588.field827.method7599();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class537(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class538(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class120(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class116(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class119(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class124(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class118(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class117(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class121(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class122(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field3588.field827.method7607();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field3588.field830.method7599();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field851[--Statics.field1469] == 1;
            Statics.field3588.field830.method7596(new class537(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field851[--Statics.field1469] == 1;
            Statics.field3588.field830.method7596(new class538(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field3588.field830.method7607();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1292 != null) {
                Statics.field1292.method7599();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class537(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class538(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class120(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class116(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class119(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class124(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class118(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class117(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class121(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class122(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1292 != null) {
                Statics.field1292.method7607();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field851[--Statics.field1469] == 1;
            Statics.field3588.field827.method7596(new class123(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field851[--Statics.field1469] == 1;
            if (Statics.field1292 != null) {
                Statics.field1292.method7596(new class123(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iw.br(ILdd;ZB)I")
    public static int method4033(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("fc.ba(ILdd;ZB)I")
    public static int method3090(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1427 == null) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = 1;
                Statics.field4433 = Statics.field1427;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field851[--Statics.field1469];
            if (client.field743[var3] == null) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = 1;
                Statics.field4433 = client.field743[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field852[++Statics.field2300 - 1] = Statics.field4433.field1696;
            return 1;
        } else if (arg0 == 3803) {
            field851[++Statics.field1469 - 1] = Statics.field4433.field1720 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field851[++Statics.field1469 - 1] = Statics.field4433.field1700;
            return 1;
        } else if (arg0 == 3805) {
            field851[++Statics.field1469 - 1] = Statics.field4433.field1708;
            return 1;
        } else if (arg0 == 3806) {
            field851[++Statics.field1469 - 1] = Statics.field4433.field1697;
            return 1;
        } else if (arg0 == 3807) {
            field851[++Statics.field1469 - 1] = Statics.field4433.field1703;
            return 1;
        } else if (arg0 == 3809) {
            field851[++Statics.field1469 - 1] = Statics.field4433.field1704;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field851[--Statics.field1469];
            field852[++Statics.field2300 - 1] = Statics.field4433.field1715[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = Statics.field4433.field1706[var5];
            return 1;
        } else if (arg0 == 3812) {
            field851[++Statics.field1469 - 1] = Statics.field4433.field1713;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field851[--Statics.field1469];
            field852[++Statics.field2300 - 1] = Statics.field4433.field1716[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field1469 -= 3;
            int var7 = field851[Statics.field1469];
            int var8 = field851[Statics.field1469 + 1];
            int var9 = field851[Statics.field1469 + 2];
            field851[++Statics.field1469 - 1] = Statics.field4433.method3174(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field851[++Statics.field1469 - 1] = Statics.field4433.field1711;
            return 1;
        } else if (arg0 == 3816) {
            field851[++Statics.field1469 - 1] = Statics.field4433.field1712;
            return 1;
        } else if (arg0 == 3817) {
            field851[++Statics.field1469 - 1] = Statics.field4433.method3163(field852[--Statics.field2300]);
            return 1;
        } else if (arg0 == 3818) {
            field851[Statics.field1469 - 1] = Statics.field4433.method3117()[field851[Statics.field1469 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field1469 -= 2;
            int var10 = field851[Statics.field1469];
            int var11 = field851[Statics.field1469 + 1];
            client.method8438(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = Statics.field4433.field1702[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field1469 -= 3;
                int var13 = field851[Statics.field1469];
                boolean var14 = field851[Statics.field1469 + 1] == 1;
                int var15 = field851[Statics.field1469 + 2];
                client.method65(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field851[--Statics.field1469];
                field851[++Statics.field1469 - 1] = Statics.field4433.field1701[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1443 == null) {
                    field851[++Statics.field1469 - 1] = 0;
                } else {
                    field851[++Statics.field1469 - 1] = 1;
                    Statics.field55 = Statics.field1443;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field851[--Statics.field1469];
                if (client.field744[var17] == null) {
                    field851[++Statics.field1469 - 1] = 0;
                } else {
                    field851[++Statics.field1469 - 1] = 1;
                    Statics.field55 = client.field744[var17];
                    Statics.field1382 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field852[++Statics.field2300 - 1] = Statics.field55.field1764;
                return 1;
            } else if (arg0 == 3853) {
                field851[++Statics.field1469 - 1] = Statics.field55.field1768;
                return 1;
            } else if (arg0 == 3854) {
                field851[++Statics.field1469 - 1] = Statics.field55.field1759;
                return 1;
            } else if (arg0 == 3855) {
                field851[++Statics.field1469 - 1] = Statics.field55.method3203();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field851[--Statics.field1469];
                field852[++Statics.field2300 - 1] = ((class146) Statics.field55.field1761.get(var18)).field1644.method9164();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field851[--Statics.field1469];
                field851[++Statics.field1469 - 1] = ((class146) Statics.field55.field1761.get(var19)).field1642;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field851[--Statics.field1469];
                field851[++Statics.field1469 - 1] = ((class146) Statics.field55.field1761.get(var20)).field1643;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field851[--Statics.field1469];
                client.method3936(Statics.field1382, var21);
                return 1;
            } else if (arg0 == 3860) {
                field851[++Statics.field1469 - 1] = Statics.field55.method3206(field852[--Statics.field2300]);
                return 1;
            } else if (arg0 == 3861) {
                field851[Statics.field1469 - 1] = Statics.field55.method3200()[field851[Statics.field1469 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field851[++Statics.field1469 - 1] = Statics.field4518 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("nf.bn(ILdd;ZB)I")
    public static int method6309(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1469 -= 2;
            int var3 = field851[Statics.field1469];
            int var4 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1469 -= 2;
            int var5 = field851[Statics.field1469];
            int var6 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1469 -= 2;
            int var7 = field851[Statics.field1469];
            int var8 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1469 -= 2;
            int var9 = field851[Statics.field1469];
            int var10 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1469 -= 5;
            int var13 = field851[Statics.field1469];
            int var14 = field851[Statics.field1469 + 1];
            int var15 = field851[Statics.field1469 + 2];
            int var16 = field851[Statics.field1469 + 3];
            int var17 = field851[Statics.field1469 + 4];
            field851[++Statics.field1469 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1469 -= 2;
            int var18 = field851[Statics.field1469];
            int var19 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1469 -= 2;
            int var20 = field851[Statics.field1469];
            int var21 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1469 -= 2;
            int var22 = field851[Statics.field1469];
            int var23 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1469 -= 2;
            int var24 = field851[Statics.field1469];
            int var25 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1469 -= 2;
            int var26 = field851[Statics.field1469];
            int var27 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1469 -= 2;
            int var28 = field851[Statics.field1469];
            int var29 = field851[Statics.field1469 + 1];
            if (var28 == 0) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1469 -= 2;
            int var30 = field851[Statics.field1469];
            int var31 = field851[Statics.field1469 + 1];
            if (var30 == 0) {
                field851[++Statics.field1469 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field851[++Statics.field1469 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field851[++Statics.field1469 - 1] = var30;
                    break;
                case 2:
                    field851[++Statics.field1469 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field851[++Statics.field1469 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field851[++Statics.field1469 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field851[++Statics.field1469 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1469 -= 2;
            int var32 = field851[Statics.field1469];
            int var33 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1469 -= 2;
            int var34 = field851[Statics.field1469];
            int var35 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field1469 -= 2;
            int var36 = field851[Statics.field1469];
            int var37 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field1469 -= 2;
            int var38 = field851[Statics.field1469];
            int var39 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1469 -= 3;
            long var40 = (long) field851[Statics.field1469];
            long var42 = (long) field851[Statics.field1469 + 1];
            long var44 = (long) field851[Statics.field1469 + 2];
            field851[++Statics.field1469 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class318.method5356(field851[--Statics.field1469]);
            field851[++Statics.field1469 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field1469 -= 2;
            int var47 = field851[Statics.field1469];
            int var48 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field1469 -= 3;
            int var49 = field851[Statics.field1469];
            int var50 = field851[Statics.field1469 + 1];
            int var51 = field851[Statics.field1469 + 2];
            field851[++Statics.field1469 - 1] = class318.method6308(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field1469 -= 3;
            int var52 = field851[Statics.field1469];
            int var53 = field851[Statics.field1469 + 1];
            int var54 = field851[Statics.field1469 + 2];
            field851[++Statics.field1469 - 1] = class318.method3234(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field1469 -= 3;
            int var55 = field851[Statics.field1469];
            int var56 = field851[Statics.field1469 + 1];
            int var57 = field851[Statics.field1469 + 2];
            int var58 = 31 - var57;
            field851[++Statics.field1469 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field1469 -= 4;
            int var59 = field851[Statics.field1469];
            int var60 = field851[Statics.field1469 + 1];
            int var61 = field851[Statics.field1469 + 2];
            int var62 = field851[Statics.field1469 + 3];
            int var63 = class318.method3234(var59, var61, var62);
            int var64 = class318.method3492(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field851[++Statics.field1469 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field851[Statics.field1469 - 1] = class481.method3254(field851[Statics.field1469 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field851[Statics.field1469 - 1] = class481.method5446(field851[Statics.field1469 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field1469 -= 2;
            int var65 = field851[Statics.field1469];
            int var66 = field851[Statics.field1469 + 1];
            int var67 = class481.method6237(var65, var66);
            field851[++Statics.field1469 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field851[Statics.field1469 - 1] = Math.abs(field851[Statics.field1469 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field852[--Statics.field2300];
            int var69 = -1;
            if (class403.method2128(var68)) {
                var69 = class403.method2543(var68);
            }
            field851[++Statics.field1469 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ee.by(ILdd;ZI)I")
    public static int method2808(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field852[--Statics.field2300];
            int var4 = field851[--Statics.field1469];
            field852[++Statics.field2300 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field2300 -= 2;
            String var5 = field852[Statics.field2300];
            String var6 = field852[Statics.field2300 + 1];
            field852[++Statics.field2300 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field852[--Statics.field2300];
            int var8 = field851[--Statics.field1469];
            field852[++Statics.field2300 - 1] = var7 + class403.method6548(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field852[--Statics.field2300];
            field852[++Statics.field2300 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field851[--Statics.field1469];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field855.setTime(new Date(var11));
            int var13 = field855.get(5);
            int var14 = field855.get(2);
            int var15 = field855.get(1);
            field852[++Statics.field2300 - 1] = var13 + "-" + field856[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field2300 -= 2;
            String var16 = field852[Statics.field2300];
            String var17 = field852[Statics.field2300 + 1];
            if (Statics.field133.field1099 == null || Statics.field133.field1099.field3641 == 0) {
                field852[++Statics.field2300 - 1] = var16;
            } else {
                field852[++Statics.field2300 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field851[--Statics.field1469];
            field852[++Statics.field2300 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field2300 -= 2;
            field851[++Statics.field1469 - 1] = class403.method266(class404.method3661(field852[Statics.field2300], field852[Statics.field2300 + 1], Statics.field1147));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field852[--Statics.field2300];
            Statics.field1469 -= 2;
            int var20 = field851[Statics.field1469];
            int var21 = field851[Statics.field1469 + 1];
            byte[] var22 = Statics.field2091.method6396(var21, 0);
            class410 var23 = new class410(var22);
            field851[++Statics.field1469 - 1] = var23.method7106(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field852[--Statics.field2300];
            Statics.field1469 -= 2;
            int var25 = field851[Statics.field1469];
            int var26 = field851[Statics.field1469 + 1];
            byte[] var27 = Statics.field2091.method6396(var26, 0);
            class410 var28 = new class410(var27);
            field851[++Statics.field1469 - 1] = var28.method7105(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field2300 -= 2;
            String var29 = field852[Statics.field2300];
            String var30 = field852[Statics.field2300 + 1];
            if (field851[--Statics.field1469] == 1) {
                field852[++Statics.field2300 - 1] = var29;
            } else {
                field852[++Statics.field2300 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field852[--Statics.field2300];
            field852[++Statics.field2300 - 1] = class414.method7167(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field852[--Statics.field2300];
            int var33 = field851[--Statics.field1469];
            field852[++Statics.field2300 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class403.method4505((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class403.method4533((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class403.method6336((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class403.method1144((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field852[--Statics.field2300];
            if (var38 == null) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field852[--Statics.field2300];
            Statics.field1469 -= 2;
            int var40 = field851[Statics.field1469];
            int var41 = field851[Statics.field1469 + 1];
            field852[++Statics.field2300 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field852[--Statics.field2300];
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
            field852[++Statics.field2300 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field852[--Statics.field2300];
            int var48 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field2300 -= 2;
            String var49 = field852[Statics.field2300];
            String var50 = field852[Statics.field2300 + 1];
            int var51 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field852[--Statics.field2300];
            field852[++Statics.field2300 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field2300 -= 3;
            String var53 = field852[Statics.field2300];
            String var54 = field852[Statics.field2300 + 1];
            String var55 = field852[Statics.field2300 + 2];
            if (Statics.field133.field1099 == null) {
                field852[++Statics.field2300 - 1] = var55;
                return 1;
            }
            switch(Statics.field133.field1099.field3640) {
                case 0:
                    field852[++Statics.field2300 - 1] = var53;
                    break;
                case 1:
                    field852[++Statics.field2300 - 1] = var54;
                    break;
                case 2:
                default:
                    field852[++Statics.field2300 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kt.bc(ILdd;ZB)I")
    public static int method5084(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field851[--Statics.field1469];
            field852[++Statics.field2300 - 1] = class203.method5762(var3).field2155;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1469 -= 2;
            int var4 = field851[Statics.field1469];
            int var5 = field851[Statics.field1469 + 1];
            class203 var6 = class203.method5762(var4);
            if (var5 < 1 || var5 > 5 || var6.field2172[var5 - 1] == null) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = var6.field2172[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1469 -= 2;
            int var7 = field851[Statics.field1469];
            int var8 = field851[Statics.field1469 + 1];
            class203 var9 = class203.method5762(var7);
            if (var8 < 1 || var8 > 5 || var9.field2193[var8 - 1] == null) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = var9.field2193[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class203.method5762(var10).field2167;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class203.method5762(var11).field2166 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field851[--Statics.field1469];
            class203 var13 = class203.method5762(var12);
            if (var13.field2170 == -1 && var13.field2189 >= 0) {
                field851[++Statics.field1469 - 1] = var13.field2189;
            } else {
                field851[++Statics.field1469 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field851[--Statics.field1469];
            class203 var15 = class203.method5762(var14);
            if (var15.field2170 >= 0 && var15.field2189 >= 0) {
                field851[++Statics.field1469 - 1] = var15.field2189;
            } else {
                field851[++Statics.field1469 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class203.method5762(var16).field2203 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field851[--Statics.field1469];
            class203 var18 = class203.method5762(var17);
            if (var18.field2171 == -1 && var18.field2202 >= 0) {
                field851[++Statics.field1469 - 1] = var18.field2202;
            } else {
                field851[++Statics.field1469 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field851[--Statics.field1469];
            class203 var20 = class203.method5762(var19);
            if (var20.field2171 >= 0 && var20.field2202 >= 0) {
                field851[++Statics.field1469 - 1] = var20.field2202;
            } else {
                field851[++Statics.field1469 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field852[--Statics.field2300];
            int var22 = field851[--Statics.field1469];
            client.method2626(var21, var22 == 1);
            field851[++Statics.field1469 - 1] = Statics.field167;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field3445 == null || Statics.field80 >= Statics.field167) {
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = Statics.field3445[++Statics.field80 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field80 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field851[--Statics.field1469];
            int var24 = class203.method5762(var23).method3678();
            if (var24 == -1) {
                field851[++Statics.field1469 - 1] = var24;
            } else {
                field851[++Statics.field1469 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class203.method5762(var25).field2168;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class203.method5762(var26).field2169;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class203.method5762(var27).field2150;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field851[--Statics.field1469];
            class203 var29 = class203.method5762(var28);
            field851[++Statics.field1469 - 1] = var29.field2197;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hd.bx(ILdd;ZI)I")
    public static int method3393(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field851[++Statics.field1469 - 1] = client.field732;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1469 -= 3;
            client.field732 = field851[Statics.field1469];
            Statics.field4498 = class550.method6540(field851[Statics.field1469 + 1]);
            if (Statics.field4498 == null) {
                Statics.field4498 = class550.field5315;
            }
            client.field585 = field851[Statics.field1469 + 2];
            class311 var3 = class311.method7979(class309.field3197, client.field561.field1404);
            var3.field3279.method8699(client.field732);
            var3.field3279.method8699(Statics.field4498.field5318);
            var3.field3279.method8699(client.field585);
            client.field561.method2736(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field852[--Statics.field2300];
            Statics.field1469 -= 2;
            int var5 = field851[Statics.field1469];
            int var6 = field851[Statics.field1469 + 1];
            class311 var7 = class311.method7979(class309.field3194, client.field561.field1404);
            var7.field3279.method8699(class531.method4114(var4) + 2);
            var7.field3279.method8551(var4);
            var7.field3279.method8699(var5 - 1);
            var7.field3279.method8699(var6);
            client.field561.method2736(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1469 -= 2;
            int var8 = field851[Statics.field1469];
            int var9 = field851[Statics.field1469 + 1];
            class65 var10 = class111.method4731(var8, var9);
            if (var10 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = var10.field480;
                field851[++Statics.field1469 - 1] = var10.field475;
                field852[++Statics.field2300 - 1] = var10.field476 == null ? "" : var10.field476;
                field852[++Statics.field2300 - 1] = var10.field481 == null ? "" : var10.field481;
                field852[++Statics.field2300 - 1] = var10.field482 == null ? "" : var10.field482;
                field851[++Statics.field1469 - 1] = var10.method1159() ? 1 : (var10.method1152() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field851[--Statics.field1469];
            class65 var12 = class111.method286(var11);
            if (var12 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = var12.field474;
                field851[++Statics.field1469 - 1] = var12.field475;
                field852[++Statics.field2300 - 1] = var12.field476 == null ? "" : var12.field476;
                field852[++Statics.field2300 - 1] = var12.field481 == null ? "" : var12.field481;
                field852[++Statics.field2300 - 1] = var12.field482 == null ? "" : var12.field482;
                field851[++Statics.field1469 - 1] = var12.method1159() ? 1 : (var12.method1152() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field4498 == null) {
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = Statics.field4498.field5318;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field852[--Statics.field2300];
            int var14 = field851[--Statics.field1469];
            class311 var15 = class555.method1190(var14, var13, Statics.field1147, -1);
            client.field561.method2736(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2300 -= 2;
            String var16 = field852[Statics.field2300];
            String var17 = field852[Statics.field2300 + 1];
            class311 var18 = class311.method7979(class309.field3241, client.field561.field1404);
            var18.field3279.method8737(0);
            int var19 = var18.field3279.field5181;
            var18.field3279.method8551(var16);
            class354.method4120(var18.field3279, var17);
            var18.field3279.method8557(var18.field3279.field5181 - var19);
            client.field561.method2736(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field852[--Statics.field2300];
            Statics.field1469 -= 2;
            int var21 = field851[Statics.field1469];
            int var22 = field851[Statics.field1469 + 1];
            class311 var23 = class555.method1190(var21, var20, Statics.field1147, var22);
            client.field561.method2736(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field133 == null || Statics.field133.field1117 == null) {
                var24 = "";
            } else {
                var24 = Statics.field133.field1117.method9164();
            }
            field852[++Statics.field2300 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field851[++Statics.field1469 - 1] = client.field585;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class111.method1187(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class111.method4164(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = class111.method3907(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field852[--Statics.field2300];
            client.method4163(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field734 = field852[--Statics.field2300].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field852[++Statics.field2300 - 1] = client.field734;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field852[--Statics.field2300];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field1469 -= 2;
            int var30 = field851[Statics.field1469];
            int var31 = field851[Statics.field1469 + 1];
            class65 var32 = class111.method4731(var30, var31);
            if (var32 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = var32.field480;
                field851[++Statics.field1469 - 1] = var32.field475;
                field852[++Statics.field2300 - 1] = var32.field476 == null ? "" : var32.field476;
                field852[++Statics.field2300 - 1] = var32.field481 == null ? "" : var32.field481;
                field852[++Statics.field2300 - 1] = var32.field482 == null ? "" : var32.field482;
                field851[++Statics.field1469 - 1] = var32.method1159() ? 1 : (var32.method1152() ? 2 : 0);
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field851[--Statics.field1469];
            class65 var34 = class111.method286(var33);
            if (var34 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = var34.field474;
                field851[++Statics.field1469 - 1] = var34.field475;
                field852[++Statics.field2300 - 1] = var34.field476 == null ? "" : var34.field476;
                field852[++Statics.field2300 - 1] = var34.field481 == null ? "" : var34.field481;
                field852[++Statics.field2300 - 1] = var34.field482 == null ? "" : var34.field482;
                field851[++Statics.field1469 - 1] = var34.method1159() ? 1 : (var34.method1152() ? 2 : 0);
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oa.bf(ILdd;ZI)I")
    public static int method6549(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field851[++Statics.field1469 - 1] = client.method3078();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field851[--Statics.field1469];
            if (var3 == 1 || var3 == 2) {
                client.method3185(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field851[++Statics.field1469 - 1] = Statics.field1155.method2451();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field851[--Statics.field1469];
            if (var4 == 1 || var4 == 2) {
                Statics.field1155.method2455(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1469--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mu.bp(ILdd;ZB)I")
    public static int method5726(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1469 -= 2;
            int var3 = field851[Statics.field1469];
            int var4 = field851[Statics.field1469 + 1];
            if (!client.field760) {
                client.field584 = var3;
                client.field580 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field851[++Statics.field1469 - 1] = client.field584;
            return 1;
        } else if (arg0 == 5506) {
            field851[++Statics.field1469 - 1] = client.field580;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field851[--Statics.field1469];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field641 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field851[++Statics.field1469 - 1] = client.field641;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gs.bv(ILdd;ZB)I")
    public static int method3228(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field563 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mf.bm(II)I")
    public static int method5699(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("at.bq(II)I")
    public static int method381(int arg0) {
        return (int) ((Math.log((double) arg0) / field847 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("ab.bb(ILdd;ZI)I")
    public static int method298(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1469 -= 2;
            client.field773 = (short) method5699(field851[Statics.field1469]);
            if (client.field773 <= 0) {
                client.field773 = 256;
            }
            client.field774 = (short) method5699(field851[Statics.field1469 + 1]);
            if (client.field774 <= 0) {
                client.field774 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1469 -= 2;
            client.field775 = (short) field851[Statics.field1469];
            if (client.field775 <= 0) {
                client.field775 = 256;
            }
            client.field643 = (short) field851[Statics.field1469 + 1];
            if (client.field643 <= 0) {
                client.field643 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1469 -= 4;
            client.field777 = (short) field851[Statics.field1469];
            if (client.field777 <= 0) {
                client.field777 = 1;
            }
            client.field597 = (short) field851[Statics.field1469 + 1];
            if (client.field597 <= 0) {
                client.field597 = 32767;
            } else if (client.field597 < client.field777) {
                client.field597 = client.field777;
            }
            client.field779 = (short) field851[Statics.field1469 + 2];
            if (client.field779 <= 0) {
                client.field779 = 1;
            }
            client.field780 = (short) field851[Statics.field1469 + 3];
            if (client.field780 <= 0) {
                client.field780 = 32767;
            } else if (client.field780 < client.field779) {
                client.field780 = client.field779;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field682 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = -1;
            } else {
                client.method3518(0, 0, client.field682.field3778, client.field682.field3718, false);
                field851[++Statics.field1469 - 1] = client.field783;
                field851[++Statics.field1469 - 1] = client.field505;
            }
            return 1;
        } else if (arg0 == 6204) {
            field851[++Statics.field1469 - 1] = client.field775;
            field851[++Statics.field1469 - 1] = client.field643;
            return 1;
        } else if (arg0 == 6205) {
            field851[++Statics.field1469 - 1] = method381(client.field773);
            field851[++Statics.field1469 - 1] = method381(client.field774);
            return 1;
        } else if (arg0 == 6220) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field851[++Statics.field1469 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field851[++Statics.field1469 - 1] = Statics.field5134;
            return 1;
        } else if (arg0 == 6223) {
            field851[++Statics.field1469 - 1] = Statics.field199;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("im.bh(ILdd;ZB)I")
    public static int method3833(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field851[++Statics.field1469 - 1] = class68.method5125() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class68 var3 = class68.method5410();
            if (var3 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
            } else {
                field851[++Statics.field1469 - 1] = var3.field807;
                field851[++Statics.field1469 - 1] = var3.field816;
                field852[++Statics.field2300 - 1] = var3.field819;
                field851[++Statics.field1469 - 1] = var3.field812;
                field851[++Statics.field1469 - 1] = var3.field817;
                field852[++Statics.field2300 - 1] = var3.field818;
            }
            return 1;
        } else if (arg0 == 6502) {
            class68 var4 = class68.method616();
            if (var4 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
            } else {
                field851[++Statics.field1469 - 1] = var4.field807;
                field851[++Statics.field1469 - 1] = var4.field816;
                field852[++Statics.field2300 - 1] = var4.field819;
                field851[++Statics.field1469 - 1] = var4.field812;
                field851[++Statics.field1469 - 1] = var4.field817;
                field852[++Statics.field2300 - 1] = var4.field818;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field851[--Statics.field1469];
            class68 var6 = null;
            for (int var7 = 0; var7 < class68.field811; var7++) {
                if (Statics.field820[var7].field807 == var5) {
                    var6 = Statics.field820[var7];
                    break;
                }
            }
            if (var6 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
            } else {
                field851[++Statics.field1469 - 1] = var6.field807;
                field851[++Statics.field1469 - 1] = var6.field816;
                field852[++Statics.field2300 - 1] = var6.field819;
                field851[++Statics.field1469 - 1] = var6.field812;
                field851[++Statics.field1469 - 1] = var6.field817;
                field852[++Statics.field2300 - 1] = var6.field818;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1469 -= 4;
            int var8 = field851[Statics.field1469];
            boolean var9 = field851[Statics.field1469 + 1] == 1;
            int var10 = field851[Statics.field1469 + 2];
            boolean var11 = field851[Statics.field1469 + 3] == 1;
            class68.method306(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field851[--Statics.field1469];
            if (var12 >= 0 && var12 < class68.field811) {
                class68 var13 = Statics.field820[var12];
                field851[++Statics.field1469 - 1] = var13.field807;
                field851[++Statics.field1469 - 1] = var13.field816;
                field852[++Statics.field2300 - 1] = var13.field819;
                field851[++Statics.field1469 - 1] = var13.field812;
                field851[++Statics.field1469 - 1] = var13.field817;
                field852[++Statics.field2300 - 1] = var13.field818;
            } else {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
                field851[++Statics.field1469 - 1] = 0;
                field851[++Statics.field1469 - 1] = 0;
                field852[++Statics.field2300 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field521 = field851[--Statics.field1469] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1469 -= 2;
            int var14 = field851[Statics.field1469];
            int var15 = field851[Statics.field1469 + 1];
            class199 var16 = class199.method37(var15);
            if (var16.method3537()) {
                field852[++Statics.field2300 - 1] = class189.method2165(var14).method3406(var15, var16.field2064);
            } else {
                field851[++Statics.field1469 - 1] = class189.method2165(var14).method3405(var15, var16.field2063);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1469 -= 2;
            int var17 = field851[Statics.field1469];
            int var18 = field851[Statics.field1469 + 1];
            class199 var19 = class199.method37(var18);
            if (var19.method3537()) {
                field852[++Statics.field2300 - 1] = class202.method3023(var17).method3618(var18, var19.field2064);
            } else {
                field851[++Statics.field1469 - 1] = class202.method3023(var17).method3616(var18, var19.field2063);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1469 -= 2;
            int var20 = field851[Statics.field1469];
            int var21 = field851[Statics.field1469 + 1];
            class199 var22 = class199.method37(var21);
            if (var22.method3537()) {
                field852[++Statics.field2300 - 1] = class203.method5762(var20).method3677(var21, var22.field2064);
            } else {
                field851[++Statics.field1469 - 1] = class203.method5762(var20).method3676(var21, var22.field2063);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1469 -= 2;
            int var23 = field851[Statics.field1469];
            int var24 = field851[Statics.field1469 + 1];
            class199 var25 = class199.method37(var24);
            if (var25.method3537()) {
                field852[++Statics.field2300 - 1] = class200.method2164(var23).method3561(var24, var25.field2064);
            } else {
                field851[++Statics.field1469 - 1] = class200.method2164(var23).method3560(var24, var25.field2063);
            }
            return 1;
        } else if (arg0 == 6518) {
            field851[++Statics.field1469 - 1] = client.field507 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field851[++Statics.field1469 - 1] = client.field536;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field2300--;
            Statics.field1469--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field2300--;
            Statics.field1469--;
            return 1;
        } else if (arg0 == 6524) {
            field851[++Statics.field1469 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field851[++Statics.field1469 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field851[++Statics.field1469 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field851[++Statics.field1469 - 1] = client.field668;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.bw(ILdd;ZI)I")
    public static int method450(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1428;
            int var4 = (Statics.field133.field1232 >> 7) + Statics.field1900;
            int var5 = (Statics.field133.field1173 >> 7) + Statics.field2683;
            client.method2995().method8226(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field851[--Statics.field1469];
            String var7 = "";
            class240 var8 = client.method2995().method8195(var6);
            if (var8 != null) {
                var7 = var8.method4264();
            }
            field852[++Statics.field2300 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field851[--Statics.field1469];
            client.method2995().method8071(var9);
            return 1;
        } else if (arg0 == 6603) {
            field851[++Statics.field1469 - 1] = client.method2995().method8228();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field851[--Statics.field1469];
            client.method2995().method8082(var10);
            return 1;
        } else if (arg0 == 6605) {
            field851[++Statics.field1469 - 1] = client.method2995().method8087() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class337 var11 = new class337(field851[--Statics.field1469]);
            client.method2995().method8089(var11.field3604, var11.field3603);
            return 1;
        } else if (arg0 == 6607) {
            class337 var12 = new class337(field851[--Statics.field1469]);
            client.method2995().method8123(var12.field3604, var12.field3603);
            return 1;
        } else if (arg0 == 6608) {
            class337 var13 = new class337(field851[--Statics.field1469]);
            client.method2995().method8169(var13.field3605, var13.field3604, var13.field3603);
            return 1;
        } else if (arg0 == 6609) {
            class337 var14 = new class337(field851[--Statics.field1469]);
            client.method2995().method8072(var14.field3605, var14.field3604, var14.field3603);
            return 1;
        } else if (arg0 == 6610) {
            field851[++Statics.field1469 - 1] = client.method2995().method8093();
            field851[++Statics.field1469 - 1] = client.method2995().method8094();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field851[--Statics.field1469];
            class240 var16 = client.method2995().method8195(var15);
            if (var16 == null) {
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = var16.method4286().method5721();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field851[--Statics.field1469];
            class240 var18 = client.method2995().method8195(var17);
            if (var18 == null) {
                field851[++Statics.field1469 - 1] = 0;
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = (var18.method4280() - var18.method4279() + 1) * 64;
                field851[++Statics.field1469 - 1] = (var18.method4282() - var18.method4281() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field851[--Statics.field1469];
            class240 var20 = client.method2995().method8195(var19);
            if (var20 == null) {
                field851[++Statics.field1469 - 1] = 0;
                field851[++Statics.field1469 - 1] = 0;
                field851[++Statics.field1469 - 1] = 0;
                field851[++Statics.field1469 - 1] = 0;
            } else {
                field851[++Statics.field1469 - 1] = var20.method4279() * 64;
                field851[++Statics.field1469 - 1] = var20.method4281() * 64;
                field851[++Statics.field1469 - 1] = var20.method4280() * 64 + 64 - 1;
                field851[++Statics.field1469 - 1] = var20.method4282() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field851[--Statics.field1469];
            class240 var22 = client.method2995().method8195(var21);
            if (var22 == null) {
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var22.method4302();
            }
            return 1;
        } else if (arg0 == 6615) {
            class337 var23 = client.method2995().method8095();
            if (var23 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var23.field3604;
                field851[++Statics.field1469 - 1] = var23.field3603;
            }
            return 1;
        } else if (arg0 == 6616) {
            field851[++Statics.field1469 - 1] = client.method2995().method8108();
            return 1;
        } else if (arg0 == 6617) {
            class337 var24 = new class337(field851[--Statics.field1469]);
            class240 var25 = client.method2995().method8073();
            if (var25 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4269(var24.field3605, var24.field3604, var24.field3603);
            if (var26 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var26[0];
                field851[++Statics.field1469 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class337 var27 = new class337(field851[--Statics.field1469]);
            class240 var28 = client.method2995().method8073();
            if (var28 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = -1;
                return 1;
            }
            class337 var29 = var28.method4319(var27.field3604, var27.field3603);
            if (var29 == null) {
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var29.method5721();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1469 -= 2;
            int var30 = field851[Statics.field1469];
            class337 var31 = new class337(field851[Statics.field1469 + 1]);
            method726(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1469 -= 2;
            int var32 = field851[Statics.field1469];
            class337 var33 = new class337(field851[Statics.field1469 + 1]);
            method726(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1469 -= 2;
            int var34 = field851[Statics.field1469];
            class337 var35 = new class337(field851[Statics.field1469 + 1]);
            class240 var36 = client.method2995().method8195(var34);
            if (var36 == null) {
                field851[++Statics.field1469 - 1] = 0;
                return 1;
            } else {
                field851[++Statics.field1469 - 1] = var36.method4267(var35.field3605, var35.field3604, var35.field3603) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field851[++Statics.field1469 - 1] = client.method2995().method8096();
            field851[++Statics.field1469 - 1] = client.method2995().method8183();
            return 1;
        } else if (arg0 == 6623) {
            class337 var37 = new class337(field851[--Statics.field1469]);
            class240 var38 = client.method2995().method8091(var37.field3605, var37.field3604, var37.field3603);
            if (var38 == null) {
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var38.method4272();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method2995().method8098(field851[--Statics.field1469]);
            return 1;
        } else if (arg0 == 6625) {
            client.method2995().method8099();
            return 1;
        } else if (arg0 == 6626) {
            client.method2995().method8100(field851[--Statics.field1469]);
            return 1;
        } else if (arg0 == 6627) {
            client.method2995().method8101();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field851[--Statics.field1469] == 1;
            client.method2995().method8102(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field851[--Statics.field1469];
            client.method2995().method8103(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field851[--Statics.field1469];
            client.method2995().method8253(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method2995().method8105();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field851[--Statics.field1469] == 1;
            client.method2995().method8106(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1469 -= 2;
            int var43 = field851[Statics.field1469];
            boolean var44 = field851[Statics.field1469 + 1] == 1;
            client.method2995().method8107(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1469 -= 2;
            int var45 = field851[Statics.field1469];
            boolean var46 = field851[Statics.field1469 + 1] == 1;
            client.method2995().method8132(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field851[++Statics.field1469 - 1] = client.method2995().method8109() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = client.method2995().method8110(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field851[--Statics.field1469];
            field851[++Statics.field1469 - 1] = client.method2995().method8111(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1469 -= 2;
            int var49 = field851[Statics.field1469];
            class337 var50 = new class337(field851[Statics.field1469 + 1]);
            class337 var51 = client.method2995().method8234(var49, var50);
            if (var51 == null) {
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var51.method5721();
            }
            return 1;
        } else if (arg0 == 6639) {
            class258 var52 = client.method2995().method8116();
            if (var52 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var52.method4226();
                field851[++Statics.field1469 - 1] = var52.field2664.method5721();
            }
            return 1;
        } else if (arg0 == 6640) {
            class258 var53 = client.method2995().method8080();
            if (var53 == null) {
                field851[++Statics.field1469 - 1] = -1;
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var53.method4226();
                field851[++Statics.field1469 - 1] = var53.field2664.method5721();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field851[--Statics.field1469];
            class178 var55 = class178.method7281(var54);
            if (var55.field1845 == null) {
                field852[++Statics.field2300 - 1] = "";
            } else {
                field852[++Statics.field2300 - 1] = var55.field1845;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field851[--Statics.field1469];
            class178 var57 = class178.method7281(var56);
            field851[++Statics.field1469 - 1] = var57.field1844;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field851[--Statics.field1469];
            class178 var59 = class178.method7281(var58);
            if (var59 == null) {
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var59.field1862;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field851[--Statics.field1469];
            class178 var61 = class178.method7281(var60);
            if (var61 == null) {
                field851[++Statics.field1469 - 1] = -1;
            } else {
                field851[++Statics.field1469 - 1] = var61.field1843;
            }
            return 1;
        } else if (arg0 == 6697) {
            field851[++Statics.field1469 - 1] = Statics.field849.field2690;
            return 1;
        } else if (arg0 == 6698) {
            field851[++Statics.field1469 - 1] = Statics.field849.field2686.method5721();
            return 1;
        } else if (arg0 == 6699) {
            field851[++Statics.field1469 - 1] = Statics.field849.field2687.method5721();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("md.bi(ILdd;ZI)I")
    public static int method5439(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field851[--Statics.field1469];
            class189 var4 = class189.method2165(var3);
            field852[++Statics.field2300 - 1] = var4 == null ? "" : var4.field1952;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field1469 -= 2;
            class189 var5 = class189.method2165(field851[Statics.field1469]);
            int var6 = field851[Statics.field1469 + 1];
            field851[++Statics.field1469 - 1] = var5.method3419(var6);
            field851[++Statics.field1469 - 1] = var5.method3410(var6);
            return 1;
        } else if (arg0 == 6765) {
            class189 var7 = class189.method2165(field851[--Statics.field1469]);
            field851[++Statics.field1469 - 1] = var7 == null ? 0 : var7.field1977;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pd.bu(ILdd;ZB)I")
    public static int method6844(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field851[--Statics.field1469];
            class202 var4 = class202.method3023(var3);
            field852[++Statics.field2300 - 1] = var4 == null ? "" : var4.field2101;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.be(ILdd;ZI)I")
    public static int method11(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("pd.bs(ILdd;ZS)I")
    public static int method6845(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("gh.bl(ILdd;ZB)I")
    public static int method3255(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field851[++Statics.field1469 - 1] = client.method4527() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hd.bz(ILdd;ZI)I")
    public static int method3392(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("jl.bo(ILdd;ZI)I")
    public static int method4217(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field851[--Statics.field1469] == 1;
            client.method7261(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("du.cg(ILdd;ZI)I")
    public static int method2611(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field851[--Statics.field1469];
            Object var45 = method263(var44);
            int var46 = field851[--Statics.field1469];
            class523 var47 = client.method3196(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class525.method7508(var46);
            Statics.field1445 = var47.method8458(var45, var48);
            if (Statics.field1445 == null) {
                client.field731 = -1;
                Statics.field145 = null;
                if (arg0 == 7500) {
                    field851[++Statics.field1469 - 1] = 0;
                }
            } else {
                client.field731 = class525.method4125(var46);
                Statics.field145 = Statics.field1445.iterator();
                if (arg0 == 7500) {
                    field851[++Statics.field1469 - 1] = Statics.field1445.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field145 != null && Statics.field145.hasNext()) {
                field851[++Statics.field1469 - 1] = (Integer) Statics.field145.next();
            } else {
                field851[++Statics.field1469 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field1469 -= 3;
            int var3 = field851[Statics.field1469];
            int var4 = field851[Statics.field1469 + 1];
            int var5 = field851[Statics.field1469 + 2];
            int var6 = class525.method4125(var4);
            int var7 = class525.method3927(var4);
            int var8 = class525.method7508(var4);
            class524 var9 = class524.method7767(var3);
            class522 var10 = class522.method7418(var6);
            int[] var11 = var10.field5116[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8461(var7);
            if (var14 == null && var10.field5118 != null) {
                var14 = var10.field5118[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class519 var17 = class517.method4843(var16);
                    if (class519.field5104 == var17) {
                        field852[++Statics.field2300 - 1] = "";
                    } else {
                        field851[++Statics.field1469 - 1] = class517.method8334(var16);
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
                class519 var21 = class517.method4843(var11[var19]);
                if (class519.field5104 == var21) {
                    field852[++Statics.field2300 - 1] = (String) var14[var20];
                } else {
                    field851[++Statics.field1469 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field1469 -= 2;
            int var22 = field851[Statics.field1469];
            int var23 = field851[Statics.field1469 + 1];
            int var24 = 0;
            int var25 = class525.method4125(var23);
            int var26 = class525.method3927(var23);
            class524 var27 = class524.method7767(var22);
            class522 var28 = class522.method7418(var25);
            int[] var29 = var28.field5116[var26];
            Object[] var30 = var27.method8461(var26);
            if (var30 == null && var28.field5118 != null) {
                var30 = var28.field5118[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field851[++Statics.field1469 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field1469--;
            int var41 = field851[Statics.field1469];
            class523 var42 = client.method3926(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1445 = var42.method8458(0, 0);
            int var43 = 0;
            if (Statics.field1445 != null) {
                client.field731 = var41;
                Statics.field145 = Statics.field1445.iterator();
                var43 = Statics.field1445.size();
            }
            if (arg0 == 7504) {
                field851[++Statics.field1469 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field851[--Statics.field1469];
            class524 var32 = class524.method7767(var31);
            field851[++Statics.field1469 - 1] = var32.field5128;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field851[--Statics.field1469];
            int var34 = -1;
            if (Statics.field1445 != null && var33 >= 0 && var33 < Statics.field1445.size()) {
                var34 = (Integer) Statics.field1445.get(var33);
            }
            field851[++Statics.field1469 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field851[--Statics.field1469];
            Object var36 = method263(var35);
            int var37 = field851[--Statics.field1469];
            class523 var38 = client.method3196(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class525.method4125(var37) != client.field731) {
                throw new RuntimeException();
            } else if (Statics.field1445 == null && Statics.field1445.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class525.method7508(var37);
                List var40 = var38.method8458(var36, var39);
                Statics.field1445 = new LinkedList(Statics.field1445);
                if (var40 == null) {
                    Statics.field1445.clear();
                } else {
                    Statics.field1445.retainAll(var40);
                }
                Statics.field145 = Statics.field1445.iterator();
                if (arg0 == 7507) {
                    field851[++Statics.field1469 - 1] = Statics.field1445.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cl.cb(ILdd;ZI)I")
    public static int method1127(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("fs.ci(ILdd;ZB)I")
    public static int method3056(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field1469--;
            int var3 = field851[Statics.field1469];
            int var4 = field864[var3];
            class526.method4001(field857[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field1469 -= 3;
            int var5 = field851[Statics.field1469];
            int var6 = field851[Statics.field1469 + 1];
            int var7 = field851[Statics.field1469 + 2];
            int var8 = field864[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class426.method7293(field857[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hf.cv(IB)V")
    public static void method3513(int arg0) {
        if (arg0 == -1 || !Statics.field4415.method5751(arg0)) {
            return;
        }
        class347[] var1 = Statics.field4415.field3611[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class347 var3 = var1[var2];
            if (var3.field3840 != null) {
                class88 var4 = new class88();
                var4.field1058 = var3;
                var4.field1067 = var3.field3840;
                method729(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("bx.ct(ILmu;ZI)V")
    public static void method726(int arg0, class337 arg1, boolean arg2) {
        class240 var3 = client.method2995().method8195(arg0);
        int var4 = Statics.field133.field1111;
        int var5 = (Statics.field133.field1232 >> 7) + Statics.field1900;
        int var6 = (Statics.field133.field1173 >> 7) + Statics.field2683;
        class337 var7 = new class337(var4, var5, var6);
        client.method2995().method8076(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("pr.cp(Ltq;I)Ljava/lang/Object;")
    public static Object method6646(class519 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5105) {
            case 0:
                return field852[--Statics.field2300];
            case 2:
                return field851[--Statics.field1469];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("ak.cq(II)Ljava/lang/Object;")
    public static Object method263(int arg0) {
        return method6646((class519) class389.method6514(class519.method8439(), arg0));
    }
}
