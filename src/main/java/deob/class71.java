package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ce")
public class class71 {

    @ObfuscatedName("ce.ap")
    public static int[] field858 = new int[5];

    @ObfuscatedName("ce.ab")
    public static int[][] field856 = new int[5][5000];

    @ObfuscatedName("ce.ak")
    public static int[] field860 = new int[1000];

    @ObfuscatedName("ce.af")
    public static String[] field862 = new String[1000];

    @ObfuscatedName("ce.aa")
    public static int field863 = 0;

    @ObfuscatedName("ce.aj")
    public static class64[] field864 = new class64[50];

    @ObfuscatedName("ce.az")
    public static Calendar field867 = Calendar.getInstance();

    @ObfuscatedName("ce.au")
    public static final String[] field868 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ce.aq")
    public static boolean field853 = false;

    @ObfuscatedName("ce.aw")
    public static boolean field876 = false;

    @ObfuscatedName("ce.ay")
    public static ArrayList field874 = new ArrayList();

    @ObfuscatedName("ce.al")
    public static int field872 = 0;

    @ObfuscatedName("ce.bj")
    public static final double field869 = Math.log(2.0D);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gs.at(Ldz;S)V")
    public static void method3233(class88 arg0) {
        method795(arg0, 500000, 475000);
    }

    @ObfuscatedName("bv.an(Ldz;IIB)V")
    public static void method795(class88 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1067;
        class79 var5;
        if (class499.method2522(arg0.field1070)) {
            Statics.field1893 = (class279) var3[0];
            class187 var4 = class187.method2956(Statics.field1893.field3063);
            var5 = class79.method7069(arg0.field1070, var4.field1911, var4.field1918);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class79.method3345(var6);
        }
        if (var5 != null) {
            method2775(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("ev.av(Ldz;Ldd;III)V")
    public static void method2775(class88 arg0, class79 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1067;
        Statics.field861 = 0;
        Statics.field1668 = 0;
        int var5 = -1;
        int[] var6 = arg1.field992;
        int[] var7 = arg1.field990;
        byte var8 = -1;
        field863 = 0;
        field853 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            Statics.field875 = new int[arg1.field995];
            int var11 = 0;
            Statics.field870 = new String[arg1.field996];
            int var12 = 0;
            for (int var13 = 1; var13 < var4.length; var13++) {
                if (var4[var13] instanceof Integer) {
                    int var14 = (Integer) var4[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1062;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1059;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1061 == null ? -1 : arg0.field1061.field3673;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1064;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1061 == null ? -1 : arg0.field1061.field3663;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1065 == null ? -1 : arg0.field1065.field3673;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1065 == null ? -1 : arg0.field1065.field3663;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1060;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1066;
                    }
                    Statics.field875[var11++] = var14;
                } else if (var4[var13] instanceof String) {
                    String var15 = (String) var4[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1068;
                    }
                    Statics.field870[var12++] = var15;
                }
            }
            field872 = arg0.field1069;
            while (true) {
                var10++;
                if (var10 > arg2) {
                    throw new RuntimeException();
                }
                var5++;
                int var59 = var6[var5];
                if (var59 >= 100) {
                    boolean var46;
                    if (arg1.field990[var5] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    int var47 = method6568(var59, arg1, var46);
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
                    field860[++Statics.field861 - 1] = var7[var5];
                } else if (var59 == 1) {
                    int var16 = var7[var5];
                    field860[++Statics.field861 - 1] = class320.field3514[var16];
                } else if (var59 == 2) {
                    int var17 = var7[var5];
                    class320.field3514[var17] = field860[--Statics.field861];
                    client.method6769(var17);
                } else if (var59 == 3) {
                    field862[++Statics.field1668 - 1] = arg1.field994[var5];
                } else if (var59 == 6) {
                    var5 += var7[var5];
                } else if (var59 == 7) {
                    Statics.field861 -= 2;
                    if (field860[Statics.field861] != field860[Statics.field861 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 8) {
                    Statics.field861 -= 2;
                    if (field860[Statics.field861] == field860[Statics.field861 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 9) {
                    Statics.field861 -= 2;
                    if (field860[Statics.field861] < field860[Statics.field861 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 10) {
                    Statics.field861 -= 2;
                    if (field860[Statics.field861] > field860[Statics.field861 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 21) {
                    if (field863 == 0) {
                        return;
                    }
                    class64 var19 = field864[--field863];
                    arg1 = var19.field474;
                    var6 = arg1.field992;
                    var7 = arg1.field990;
                    var5 = var19.field482;
                    Statics.field875 = var19.field476;
                    Statics.field870 = var19.field477;
                } else if (var59 == 25) {
                    int var20 = var7[var5];
                    field860[++Statics.field861 - 1] = class320.method5997(var20);
                } else if (var59 == 27) {
                    int var21 = var7[var5];
                    Statics.method8378(var21, field860[--Statics.field861]);
                } else if (var59 == 31) {
                    Statics.field861 -= 2;
                    if (field860[Statics.field861] <= field860[Statics.field861 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 32) {
                    Statics.field861 -= 2;
                    if (field860[Statics.field861] >= field860[Statics.field861 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 33) {
                    field860[++Statics.field861 - 1] = Statics.field875[var7[var5]];
                } else if (var59 == 34) {
                    Statics.field875[var7[var5]] = field860[--Statics.field861];
                } else if (var59 == 35) {
                    field862[++Statics.field1668 - 1] = Statics.field870[var7[var5]];
                } else if (var59 == 36) {
                    Statics.field870[var7[var5]] = field862[--Statics.field1668];
                } else if (var59 == 37) {
                    int var22 = var7[var5];
                    Statics.field1668 -= var22;
                    String var23 = class385.method3208(field862, Statics.field1668, var22);
                    field862[++Statics.field1668 - 1] = var23;
                } else if (var59 == 38) {
                    Statics.field861--;
                } else if (var59 == 39) {
                    Statics.field1668--;
                } else if (var59 == 40) {
                    int var24 = var7[var5];
                    class79 var25 = class79.method3345(var24);
                    int[] var26 = new int[var25.field995];
                    String[] var27 = new String[var25.field996];
                    for (int var28 = 0; var28 < var25.field997; var28++) {
                        var26[var28] = field860[Statics.field861 - var25.field997 + var28];
                    }
                    for (int var29 = 0; var29 < var25.field998; var29++) {
                        var27[var29] = field862[Statics.field1668 - var25.field998 + var29];
                    }
                    Statics.field861 -= var25.field997;
                    Statics.field1668 -= var25.field998;
                    class64 var30 = new class64();
                    var30.field474 = arg1;
                    var30.field482 = var5;
                    var30.field476 = Statics.field875;
                    var30.field477 = Statics.field870;
                    field864[++field863 - 1] = var30;
                    arg1 = var25;
                    var6 = var25.field992;
                    var7 = var25.field990;
                    var5 = -1;
                    Statics.field875 = var26;
                    Statics.field870 = var27;
                } else if (var59 == 42) {
                    field860[++Statics.field861 - 1] = Statics.field236.method2562(var7[var5]);
                } else if (var59 == 43) {
                    Statics.field236.method2563(var7[var5], field860[--Statics.field861]);
                } else if (var59 == 44) {
                    int var31 = var7[var5] >> 16;
                    int var32 = var7[var5] & 0xFFFF;
                    int var33 = field860[--Statics.field861];
                    if (var33 < 0 || var33 > 5000) {
                        throw new RuntimeException();
                    }
                    field858[var31] = var33;
                    byte var34 = -1;
                    if (var32 == 105) {
                        var34 = 0;
                    }
                    for (int var35 = 0; var35 < var33; var35++) {
                        field856[var31][var35] = var34;
                    }
                } else if (var59 == 45) {
                    int var36 = var7[var5];
                    int var37 = field860[--Statics.field861];
                    if (var37 < 0 || var37 >= field858[var36]) {
                        throw new RuntimeException();
                    }
                    field860[++Statics.field861 - 1] = field856[var36][var37];
                } else if (var59 == 46) {
                    int var38 = var7[var5];
                    Statics.field861 -= 2;
                    int var39 = field860[Statics.field861];
                    if (var39 < 0 || var39 >= field858[var38]) {
                        throw new RuntimeException();
                    }
                    field856[var38][var39] = field860[Statics.field861 + 1];
                } else if (var59 == 47) {
                    String var40 = Statics.field236.method2568(var7[var5]);
                    if (var40 == null) {
                        var40 = class350.field3887;
                    }
                    field862[++Statics.field1668 - 1] = var40;
                } else if (var59 == 48) {
                    Statics.field236.method2593(var7[var5], field862[--Statics.field1668]);
                } else if (var59 == 49) {
                    String var41 = Statics.field236.method2588(var7[var5]);
                    field862[++Statics.field1668 - 1] = var41;
                } else if (var59 == 50) {
                    Statics.field236.method2591(var7[var5], field862[--Statics.field1668]);
                } else if (var59 == 60) {
                    class476 var42 = arg1.field991[var7[var5]];
                    class460 var43 = (class460) var42.method7848((long) field860[--Statics.field861]);
                    if (var43 != null) {
                        var5 += var43.field4754;
                    }
                } else if (var59 == 74) {
                    Integer var44 = Statics.field3453.method3002(var7[var5]);
                    if (var44 == null) {
                        field860[++Statics.field861 - 1] = -1;
                    } else {
                        field860[++Statics.field861 - 1] = var44;
                    }
                } else if (var59 == 76) {
                    Integer var45 = Statics.field1496.method7483(var7[var5]);
                    if (var45 == null) {
                        field860[++Statics.field861 - 1] = -1;
                    } else {
                        field860[++Statics.field861 - 1] = var45;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var57) {
            var9 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(arg1.field4757).append(" ");
            for (int var51 = field863 - 1; var51 >= 0; var51--) {
                var50.append("").append(field864[var51].field474.field4757).append(" ");
            }
            var50.append("").append(var8);
            class528.method4947(var50.toString(), var57);
        } finally {
            while (field874.size() > 0) {
                class102 var54 = (class102) field874.remove(0);
                client.method3256(var54.method2501(), var54.method2502(), var54.method2512(), var54.method2504(), "");
            }
            if (field853) {
                field853 = false;
                client.method657();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class528.method4947("Warning: Script " + arg1.field993 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("ou.as(ILdd;ZI)I")
    public static int method6568(int arg0, class79 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method1127(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return Statics.method3197(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method3232(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method3424(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method158(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method4362(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method7040(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method6943(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4689(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3271(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2685(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return Statics.method3197(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method3232(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method3424(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method158(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method4362(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return Statics.method3861(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method3060(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method2229(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method4958(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2685(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2559(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3046(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method161(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method3795(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method6283(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method3450(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method5298(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method4555(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method11(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method2913(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method7279(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1065(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2558(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method4351(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method6284(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method1249(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method3428(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method1792(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method4628(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method3819(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method5152(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method104(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method2885(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method2854(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method309(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method4358(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method3425(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method819(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.ax(ILdd;ZI)I")
    public static int method1127(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field861 -= 3;
            int var3 = field860[Statics.field861];
            int var4 = field860[Statics.field861 + 1];
            int var5 = field860[Statics.field861 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class330 var6 = class330.method1746(var3);
            if (var6.field3731 == null) {
                var6.field3731 = new class330[var5 + 1];
            }
            if (var6.field3731.length <= var5) {
                class330[] var7 = new class330[var5 + 1];
                for (int var8 = 0; var8 < var6.field3731.length; var8++) {
                    var7[var8] = var6.field3731[var8];
                }
                var6.field3731 = var7;
            }
            if (var5 > 0 && var6.field3731[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class330 var9 = new class330();
            var9.field3728 = var4;
            var9.field3622 = var9.field3673 = var6.field3673;
            var9.field3663 = var5;
            var9.field3662 = true;
            if (var4 == 12) {
                var9.method5882();
                var9.method5803().method5526(new class105(var9));
                var9.method5803().method5694(new class106(var9));
            }
            var6.field3731[var5] = var9;
            if (arg2) {
                Statics.field371 = var9;
            } else {
                Statics.field865 = var9;
            }
            client.method2632(var6);
            return 1;
        } else if (arg0 == 101) {
            class330 var10 = arg2 ? Statics.field371 : Statics.field865;
            class330 var11 = class330.method1746(var10.field3673);
            var11.field3731[var10.field3663] = null;
            client.method2632(var11);
            return 1;
        } else if (arg0 == 102) {
            class330 var12 = class330.method1746(field860[--Statics.field861]);
            var12.field3731 = null;
            client.method2632(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field861 -= 2;
            int var13 = field860[Statics.field861];
            int var14 = field860[Statics.field861 + 1];
            class330 var15 = class330.method3049(var13, var14);
            if (var15 == null || var14 == -1) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = 1;
                if (arg2) {
                    Statics.field371 = var15;
                } else {
                    Statics.field865 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class330 var16 = class330.method1746(field860[--Statics.field861]);
            if (var16 == null) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = 1;
                if (arg2) {
                    Statics.field371 = var16;
                } else {
                    Statics.field865 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gq.ab(ILdd;ZB)I")
    public static int method3232(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class330 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field860[--Statics.field861];
            var4 = class330.method1746(var3);
        } else {
            var4 = arg2 ? Statics.field371 : Statics.field865;
        }
        if (arg0 == 1100) {
            Statics.field861 -= 2;
            int var5 = field860[Statics.field861];
            int var6 = field860[Statics.field861 + 1];
            if (var4.field3728 == 12) {
                class328 var7 = var4.method5803();
                if (var7 != null && var7.method5761(var5, var6)) {
                    client.method2632(var4);
                }
            } else {
                var4.field3641 = var5;
                if (var4.field3641 > var4.field3623 - var4.field3618) {
                    var4.field3641 = var4.field3623 - var4.field3618;
                }
                if (var4.field3641 < 0) {
                    var4.field3641 = 0;
                }
                var4.field3706 = var6;
                if (var4.field3706 > var4.field3627 - var4.field3735) {
                    var4.field3706 = var4.field3627 - var4.field3735;
                }
                if (var4.field3706 < 0) {
                    var4.field3706 = 0;
                }
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3630 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3600 = field860[--Statics.field861] == 1;
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3639 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3636 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3638 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3683 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3642 = field860[--Statics.field861] == 1;
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3648 = 1;
            var4.field3604 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field861 -= 6;
            var4.field3653 = field860[Statics.field861];
            var4.field3654 = field860[Statics.field861 + 1];
            var4.field3655 = field860[Statics.field861 + 2];
            var4.field3645 = field860[Statics.field861 + 3];
            var4.field3657 = field860[Statics.field861 + 4];
            var4.field3658 = field860[Statics.field861 + 5];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field860[--Statics.field861];
            if (var4.field3651 != var8) {
                var4.field3651 = var8;
                var4.field3738 = 0;
                var4.field3739 = 0;
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3680 = field860[--Statics.field861] == 1;
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field862[--Statics.field1668];
            if (!var9.equals(var4.field3666)) {
                var4.field3666 = var9;
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3665 = field860[--Statics.field861];
            if (var4.field3728 == 12) {
                class328 var10 = var4.method5803();
                if (var10 != null) {
                    var10.method5495();
                }
            }
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field861 -= 3;
            if (var4.field3728 == 12) {
                class328 var11 = var4.method5803();
                if (var11 != null) {
                    var11.method5489(field860[Statics.field861], field860[Statics.field861 + 1]);
                    var11.method5490(field860[Statics.field861 + 2]);
                }
            } else {
                var4.field3669 = field860[Statics.field861];
                var4.field3681 = field860[Statics.field861 + 1];
                var4.field3588 = field860[Statics.field861 + 2];
            }
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3671 = field860[--Statics.field861] == 1;
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3643 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3603 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3617 = field860[--Statics.field861] == 1;
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3646 = field860[--Statics.field861] == 1;
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field861 -= 2;
            var4.field3623 = field860[Statics.field861];
            var4.field3627 = field860[Statics.field861 + 1];
            client.method2632(var4);
            if (var3 != -1 && var4.field3728 == 0) {
                client.method2025(Statics.field84[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3996(var4.field3673, var4.field3663);
            client.field679 = var4;
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3628 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3629 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3635 = field860[--Statics.field861];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var12 = field860[--Statics.field861];
            class513 var13 = (class513) class371.method4632(class513.method2944(), var12);
            if (var13 != null) {
                var4.field3633 = var13;
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var14 = field860[--Statics.field861] == 1;
            var4.field3659 = var14;
            return 1;
        } else if (arg0 == 1127) {
            boolean var15 = field860[--Statics.field861] == 1;
            var4.field3647 = var15;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3694 = field862[--Statics.field1668];
            client.method2632(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5809(field862[--Statics.field1668], Statics.field337, client.method399());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field861 -= 2;
            var4.method5790(field860[Statics.field861], field860[Statics.field861 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5791(field862[--Statics.field1668], field860[--Statics.field861]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field861--;
            class323 var16 = var4.method5804();
            if (var16 != null) {
                var16.field3523 = field860[Statics.field861];
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field861--;
            class323 var17 = var4.method5804();
            if (var17 != null) {
                var17.field3520 = field860[Statics.field861];
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field1668--;
            class328 var18 = var4.method5803();
            if (var18 != null) {
                var4.field3667 = field862[Statics.field1668];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field861--;
            class323 var19 = var4.method5804();
            if (var19 != null) {
                var19.field3521 = field860[Statics.field861];
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field861--;
            class328 var20 = var4.method5803();
            if (var20 != null && var20.method5590(field860[Statics.field861])) {
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field861--;
            class328 var21 = var4.method5803();
            if (var21 != null && var21.method5533(field860[Statics.field861])) {
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field861--;
            class328 var22 = var4.method5803();
            if (var22 != null && var22.method5487(field860[Statics.field861])) {
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var23 = field860[--Statics.field861] == 1;
            client.field741.method3774();
            class328 var24 = var4.method5803();
            if (var24 != null && var24.method5479(var23)) {
                if (var23) {
                    client.field741.method3783(var4);
                }
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var25 = field860[--Statics.field861] == 1;
            if (!var25 && client.field741.method3772() == var4) {
                client.field741.method3774();
                client.method2632(var4);
            }
            class328 var26 = var4.method5803();
            if (var26 != null) {
                var26.method5480(var25);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field861 -= 2;
            class328 var27 = var4.method5803();
            if (var27 != null && var27.method5503(field860[Statics.field861], field860[Statics.field861 + 1])) {
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field861--;
            class328 var28 = var4.method5803();
            if (var28 != null && var28.method5503(field860[Statics.field861], field860[Statics.field861])) {
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field861--;
            class328 var29 = var4.method5803();
            if (var29 != null) {
                var29.method5492(field860[Statics.field861]);
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field861--;
            class328 var30 = var4.method5803();
            if (var30 != null) {
                var30.method5591(field860[Statics.field861]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field861--;
            class328 var31 = var4.method5803();
            if (var31 != null) {
                var31.method5494(field860[Statics.field861]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field861--;
            class328 var32 = var4.method5803();
            if (var32 != null) {
                var32.method5493(field860[Statics.field861]);
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field861 -= 2;
            class28 var33 = var4.method5805();
            if (var33 != null) {
                var33.method375(field860[Statics.field861], field860[Statics.field861 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field861 -= 2;
            class28 var34 = var4.method5805();
            if (var34 != null) {
                var34.method376((char) field860[Statics.field861], field860[Statics.field861 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method5788(field862[--Statics.field1668], Statics.field337);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hd.ak(ILdd;ZI)I")
    public static int method3424(int arg0, class79 arg1, boolean arg2) {
        class330 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class330.method1746(field860[--Statics.field861]);
        } else {
            var3 = arg2 ? Statics.field371 : Statics.field865;
        }
        client.method2632(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field861 -= 2;
            int var9 = field860[Statics.field861];
            int var10 = field860[Statics.field861 + 1];
            var3.field3736 = var9;
            var3.field3737 = var10;
            class206 var11 = class206.method5155(var9);
            var3.field3655 = var11.field2214;
            var3.field3645 = var11.field2221;
            var3.field3657 = var11.field2216;
            var3.field3653 = var11.field2217;
            var3.field3654 = var11.field2226;
            var3.field3658 = var11.field2248;
            if (arg0 == 1205) {
                var3.field3664 = 0;
            } else if (arg0 == 1212 | var11.field2213 == 1) {
                var3.field3664 = 1;
            } else {
                var3.field3664 = 2;
            }
            if (var3.field3668 > 0) {
                var3.field3658 = var3.field3658 * 32 / var3.field3668;
            } else if (var3.field3614 > 0) {
                var3.field3658 = var3.field3658 * 32 / var3.field3614;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3648 = 2;
            var3.field3604 = field860[--Statics.field861];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3648 = 3;
            var3.field3604 = Statics.field971.field1100.method5443();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field860[--Statics.field861] == 1;
            class330.method1954(var3, Statics.field971.field1100, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field860[--Statics.field861];
            if (var3.field3632 == null) {
                throw new RuntimeException("");
            }
            class330.method3692(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field861 -= 2;
            int var6 = field860[Statics.field861];
            int var7 = field860[Statics.field861 + 1];
            if (var3.field3632 == null) {
                throw new RuntimeException("");
            }
            class330.method3481(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field860[--Statics.field861];
            if (var3.field3632 == null) {
                throw new RuntimeException("");
            }
            class330.method5369(var3, Statics.field971.field1100.field3541, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.ae(ILdd;ZI)I")
    public static int method158(int arg0, class79 arg1, boolean arg2) {
        boolean var3 = true;
        class330 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class330.method1746(field860[--Statics.field861]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field371 : Statics.field865;
        }
        if (arg0 == 1300) {
            int var5 = field860[--Statics.field861] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5784(var5, field862[--Statics.field1668]);
                return 1;
            } else {
                Statics.field1668--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field861 -= 2;
            int var6 = field860[Statics.field861];
            int var7 = field860[Statics.field861 + 1];
            var4.field3685 = class330.method3049(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3711 = field860[--Statics.field861] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3686 = field860[--Statics.field861];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3674 = field860[--Statics.field861];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3590 = field862[--Statics.field1668];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3689 = field862[--Statics.field1668];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3684 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3752 = field860[--Statics.field861] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field861--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field861 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field860[Statics.field861 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field860[Statics.field861 + var10];
                        var9[var10 / 2] = (byte) field860[Statics.field861 + var10 + 1];
                    }
                }
            } else {
                Statics.field861 -= 2;
                var8 = new byte[] { (byte) field860[Statics.field861] };
                var9 = new byte[] { (byte) field860[Statics.field861 + 1] };
            }
            int var11 = field860[--Statics.field861] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method2021(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field861 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field860[Statics.field861] };
            byte[] var14 = new byte[] { (byte) field860[Statics.field861 + 1] };
            method2021(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field861 -= 3;
            int var15 = field860[Statics.field861] - 1;
            int var16 = field860[Statics.field861 + 1];
            int var17 = field860[Statics.field861 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method3213(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field860[--Statics.field861];
            int var20 = field860[--Statics.field861];
            method3213(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field861--;
            int var21 = field860[Statics.field861] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method4556(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method4556(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cx.af(Lmb;I[B[BI)V")
    public static final void method2021(class330 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3679 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3679 = new byte[11][];
            arg0.field3672 = new byte[11][];
            arg0.field3640 = new int[11];
            arg0.field3682 = new int[11];
        }
        arg0.field3679[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3678 = false;
            for (int var4 = 0; var4 < arg0.field3679.length; var4++) {
                if (arg0.field3679[var4] != null) {
                    arg0.field3678 = true;
                    break;
                }
            }
        } else {
            arg0.field3678 = true;
        }
        arg0.field3672[arg1] = arg3;
    }

    @ObfuscatedName("gn.ao(Lmb;IIII)V")
    public static final void method3213(class330 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3640 == null) {
            throw new RuntimeException();
        }
        arg0.field3640[arg1] = arg2;
        arg0.field3682[arg1] = arg3;
    }

    @ObfuscatedName("jn.aa(Lmb;II)V")
    public static final void method4556(class330 arg0, int arg1) {
        if (arg0.field3679 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3670 == null) {
            arg0.field3670 = new int[arg0.field3679.length];
        }
        arg0.field3670[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("jw.aj(ILdd;ZB)I")
    public static int method4362(int arg0, class79 arg1, boolean arg2) {
        class330 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class330.method1746(field860[--Statics.field861]);
        } else {
            var3 = arg2 ? Statics.field371 : Statics.field865;
        }
        String var4 = field862[--Statics.field1668];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field860[--Statics.field861];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field860[--Statics.field861];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field862[--Statics.field1668];
            } else {
                var7[var8] = Integer.valueOf(field860[--Statics.field861]);
            }
        }
        int var9 = field860[--Statics.field861];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3692 = var7;
        } else if (arg0 == 1401) {
            var3.field3695 = var7;
        } else if (arg0 == 1402) {
            var3.field3591 = var7;
        } else if (arg0 == 1403) {
            var3.field3696 = var7;
        } else if (arg0 == 1404) {
            var3.field3698 = var7;
        } else if (arg0 == 1405) {
            var3.field3699 = var7;
        } else if (arg0 == 1406) {
            var3.field3702 = var7;
        } else if (arg0 == 1407) {
            var3.field3703 = var7;
            var3.field3749 = var5;
        } else if (arg0 == 1408) {
            var3.field3709 = var7;
        } else if (arg0 == 1409) {
            var3.field3637 = var7;
        } else if (arg0 == 1410) {
            var3.field3700 = var7;
        } else if (arg0 == 1411) {
            var3.field3624 = var7;
        } else if (arg0 == 1412) {
            var3.field3697 = var7;
        } else if (arg0 == 1414) {
            var3.field3687 = var7;
            var3.field3606 = var5;
        } else if (arg0 == 1415) {
            var3.field3707 = var7;
            var3.field3727 = var5;
        } else if (arg0 == 1416) {
            var3.field3701 = var7;
        } else if (arg0 == 1417) {
            var3.field3712 = var7;
        } else if (arg0 == 1418) {
            var3.field3592 = var7;
        } else if (arg0 == 1419) {
            var3.field3714 = var7;
        } else if (arg0 == 1420) {
            var3.field3717 = var7;
        } else if (arg0 == 1421) {
            var3.field3718 = var7;
        } else if (arg0 == 1422) {
            var3.field3721 = var7;
        } else if (arg0 == 1423) {
            var3.field3722 = var7;
        } else if (arg0 == 1424) {
            var3.field3723 = var7;
        } else if (arg0 == 1425) {
            var3.field3725 = var7;
        } else if (arg0 == 1426) {
            var3.field3726 = var7;
        } else if (arg0 == 1427) {
            var3.field3724 = var7;
        } else if (arg0 == 1428) {
            var3.field3719 = var7;
        } else if (arg0 == 1429) {
            var3.field3720 = var7;
        } else if (arg0 == 1430) {
            var3.field3715 = var7;
        } else if (arg0 == 1431) {
            var3.field3716 = var7;
        } else if (arg0 == 1434) {
            var3.field3704 = var7;
        } else if (arg0 == 1435) {
            var3.field3740 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class326 var10 = var3.method5806();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3533 = var7;
                } else if (arg0 == 1437) {
                    var10.field3534 = var7;
                } else if (arg0 == 1438) {
                    var10.field3535 = var7;
                } else if (arg0 == 1439) {
                    var10.field3529 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3730 = true;
        return 1;
    }

    @ObfuscatedName("pa.ad(ILdd;ZI)I")
    public static int method7040(int arg0, class79 arg1, boolean arg2) {
        class330 var3 = arg2 ? Statics.field371 : Statics.field865;
        if (arg0 == 1500) {
            field860[++Statics.field861 - 1] = var3.field3616;
            return 1;
        } else if (arg0 == 1501) {
            field860[++Statics.field861 - 1] = var3.field3626;
            return 1;
        } else if (arg0 == 1502) {
            field860[++Statics.field861 - 1] = var3.field3618;
            return 1;
        } else if (arg0 == 1503) {
            field860[++Statics.field861 - 1] = var3.field3735;
            return 1;
        } else if (arg0 == 1504) {
            field860[++Statics.field861 - 1] = var3.field3608 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field860[++Statics.field861 - 1] = var3.field3622;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pv.ac(ILdd;ZI)I")
    public static int method6943(int arg0, class79 arg1, boolean arg2) {
        class330 var3 = arg2 ? Statics.field371 : Statics.field865;
        if (arg0 == 1600) {
            field860[++Statics.field861 - 1] = var3.field3641;
            return 1;
        } else if (arg0 == 1601) {
            field860[++Statics.field861 - 1] = var3.field3706;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3728 == 12) {
                class328 var4 = var3.method5803();
                if (var4 != null) {
                    field862[++Statics.field1668 - 1] = var4.method5586().method6623();
                    return 1;
                }
            }
            field862[++Statics.field1668 - 1] = var3.field3666;
            return 1;
        } else if (arg0 == 1603) {
            field860[++Statics.field861 - 1] = var3.field3623;
            return 1;
        } else if (arg0 == 1604) {
            field860[++Statics.field861 - 1] = var3.field3627;
            return 1;
        } else if (arg0 == 1605) {
            field860[++Statics.field861 - 1] = var3.field3658;
            return 1;
        } else if (arg0 == 1606) {
            field860[++Statics.field861 - 1] = var3.field3655;
            return 1;
        } else if (arg0 == 1607) {
            field860[++Statics.field861 - 1] = var3.field3657;
            return 1;
        } else if (arg0 == 1608) {
            field860[++Statics.field861 - 1] = var3.field3645;
            return 1;
        } else if (arg0 == 1609) {
            field860[++Statics.field861 - 1] = var3.field3639;
            return 1;
        } else if (arg0 == 1610) {
            field860[++Statics.field861 - 1] = var3.field3635;
            return 1;
        } else if (arg0 == 1611) {
            field860[++Statics.field861 - 1] = var3.field3630;
            return 1;
        } else if (arg0 == 1612) {
            field860[++Statics.field861 - 1] = var3.field3629;
            return 1;
        } else if (arg0 == 1613) {
            field860[++Statics.field861 - 1] = var3.field3633.method33();
            return 1;
        } else if (arg0 == 1614) {
            field860[++Statics.field861 - 1] = var3.field3647 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class323 var5 = var3.method5804();
                field860[++Statics.field861 - 1] = var5 == null ? 0 : var5.field3523;
            }
            if (arg0 == 1618) {
                class323 var6 = var3.method5804();
                field860[++Statics.field861 - 1] = var6 == null ? 0 : var6.field3520;
                return 1;
            } else if (arg0 == 1619) {
                class328 var7 = var3.method5803();
                field862[++Statics.field1668 - 1] = var7 == null ? "" : var7.method5528().method6623();
                return 1;
            } else if (arg0 == 1620) {
                class323 var8 = var3.method5804();
                field860[++Statics.field861 - 1] = var8 == null ? 0 : var8.field3521;
                return 1;
            } else if (arg0 == 1621) {
                class328 var9 = var3.method5803();
                field860[++Statics.field861 - 1] = var9 == null ? 0 : var9.method5538();
                return 1;
            } else if (arg0 == 1622) {
                class328 var10 = var3.method5803();
                field860[++Statics.field861 - 1] = var10 == null ? 0 : var10.method5593();
                return 1;
            } else if (arg0 == 1623) {
                class328 var11 = var3.method5803();
                field860[++Statics.field861 - 1] = var11 == null ? 0 : var11.method5540();
                return 1;
            } else if (arg0 == 1624) {
                class328 var12 = var3.method5803();
                field860[++Statics.field861 - 1] = var12 != null && var12.method5530() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class328 var13 = var3.method5803();
                field860[++Statics.field861 - 1] = var13 != null && var13.method5579() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class328 var14 = var3.method5803();
                field862[++Statics.field1668 - 1] = var14 == null ? "" : var14.method5529().method6874();
                return 1;
            } else if (arg0 == 1627) {
                class328 var15 = var3.method5803();
                int var16 = var15 == null ? 0 : var15.method5655();
                int var17 = var15 == null ? 0 : var15.method5662();
                field860[++Statics.field861 - 1] = Math.min(var16, var17);
                field860[++Statics.field861 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class328 var18 = var3.method5803();
                field860[++Statics.field861 - 1] = var18 == null ? 0 : var18.method5662();
                return 1;
            } else if (arg0 == 1629) {
                class328 var19 = var3.method5803();
                field860[++Statics.field861 - 1] = var19 == null ? 0 : var19.method5652();
                return 1;
            } else if (arg0 == 1630) {
                class328 var20 = var3.method5803();
                field860[++Statics.field861 - 1] = var20 == null ? 0 : var20.method5541();
                return 1;
            } else if (arg0 == 1631) {
                class328 var21 = var3.method5803();
                field860[++Statics.field861 - 1] = var21 == null ? 0 : var21.method5728();
                return 1;
            } else if (arg0 == 1632) {
                class328 var22 = var3.method5803();
                field860[++Statics.field861 - 1] = var22 == null ? 0 : var22.method5544();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method5805();
                field860[Statics.field861 - 1] = var23 == null ? 0 : var23.method413(field860[Statics.field861 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method5805();
                field860[Statics.field861 - 1] = var24 == null ? 0 : var24.method378((char) field860[Statics.field861 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ju.ag(ILdd;ZI)I")
    public static int method4689(int arg0, class79 arg1, boolean arg2) {
        class330 var3 = arg2 ? Statics.field371 : Statics.field865;
        if (arg0 == 1700) {
            field860[++Statics.field861 - 1] = var3.field3736;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3736 == -1) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = var3.field3737;
            }
            return 1;
        } else if (arg0 == 1702) {
            field860[++Statics.field861 - 1] = var3.field3663;
            return 1;
        } else if (arg0 == 1707) {
            field860[++Statics.field861 - 1] = var3.method5782() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method1967(var3);
        } else if (arg0 == 1709) {
            return method96(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cn.ar(Lmb;I)I")
    public static int method1967(class330 arg0) {
        if (arg0.field3728 == 11) {
            String var1 = field862[--Statics.field1668];
            field860[++Statics.field861 - 1] = arg0.method5794(var1);
            return 1;
        } else {
            Statics.field1668--;
            field860[++Statics.field861 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("ao.ah(Lmb;B)I")
    public static int method96(class330 arg0) {
        if (arg0.field3728 == 11) {
            String var1 = field862[--Statics.field1668];
            field862[++Statics.field1668 - 1] = arg0.method5795(var1);
            return 1;
        } else {
            field862[Statics.field1668 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("hn.az(ILdd;ZI)I")
    public static int method3271(int arg0, class79 arg1, boolean arg2) {
        class330 var3 = arg2 ? Statics.field371 : Statics.field865;
        if (arg0 == 1800) {
            field860[++Statics.field861 - 1] = class331.method2309(client.method6005(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field860[--Statics.field861];
            int var5 = var4 - 1;
            if (var3.field3684 == null || var5 >= var3.field3684.length || var3.field3684[var5] == null) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = var3.field3684[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3590 == null) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = var3.field3590;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("en.au(ILdd;ZB)I")
    public static int method2685(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field872 >= 10) {
                throw new RuntimeException();
            }
            class330 var10;
            if (arg0 >= 2000) {
                var10 = class330.method1746(field860[--Statics.field861]);
            } else {
                var10 = arg2 ? Statics.field371 : Statics.field865;
            }
            if (var10.field3724 == null) {
                return 0;
            }
            class88 var11 = new class88();
            var11.field1061 = var10;
            var11.field1067 = var10.field3724;
            var11.field1069 = field872 + 1;
            client.field746.method6303(var11);
            return 1;
        } else if (arg0 == 1928) {
            class330 var3 = arg2 ? Statics.field371 : Statics.field865;
            int var4 = field860[--Statics.field861];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class102 var5 = new class102(var4, var3.field3673, var3.field3663, var3.field3736);
            field874.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field861 -= 3;
            int var6 = field860[Statics.field861];
            int var7 = field860[Statics.field861 + 1];
            int var8 = field860[Statics.field861 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class102 var9 = new class102(var8, var6, var7, class330.method1746(var6).field3736);
            field874.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gb.aq(ILdd;ZB)I")
    public static int method3060(int arg0, class79 arg1, boolean arg2) {
        class330 var3 = class330.method1746(field860[--Statics.field861]);
        if (arg0 == 2600) {
            field860[++Statics.field861 - 1] = var3.field3641;
            return 1;
        } else if (arg0 == 2601) {
            field860[++Statics.field861 - 1] = var3.field3706;
            return 1;
        } else if (arg0 == 2602) {
            field862[++Statics.field1668 - 1] = var3.field3666;
            return 1;
        } else if (arg0 == 2603) {
            field860[++Statics.field861 - 1] = var3.field3623;
            return 1;
        } else if (arg0 == 2604) {
            field860[++Statics.field861 - 1] = var3.field3627;
            return 1;
        } else if (arg0 == 2605) {
            field860[++Statics.field861 - 1] = var3.field3658;
            return 1;
        } else if (arg0 == 2606) {
            field860[++Statics.field861 - 1] = var3.field3655;
            return 1;
        } else if (arg0 == 2607) {
            field860[++Statics.field861 - 1] = var3.field3657;
            return 1;
        } else if (arg0 == 2608) {
            field860[++Statics.field861 - 1] = var3.field3645;
            return 1;
        } else if (arg0 == 2609) {
            field860[++Statics.field861 - 1] = var3.field3639;
            return 1;
        } else if (arg0 == 2610) {
            field860[++Statics.field861 - 1] = var3.field3635;
            return 1;
        } else if (arg0 == 2611) {
            field860[++Statics.field861 - 1] = var3.field3630;
            return 1;
        } else if (arg0 == 2612) {
            field860[++Statics.field861 - 1] = var3.field3629;
            return 1;
        } else if (arg0 == 2613) {
            field860[++Statics.field861 - 1] = var3.field3633.method33();
            return 1;
        } else if (arg0 == 2614) {
            field860[++Statics.field861 - 1] = var3.field3647 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class323 var4 = var3.method5804();
                field860[++Statics.field861 - 1] = var4 == null ? 0 : var4.field3523;
            }
            if (arg0 == 2618) {
                class323 var5 = var3.method5804();
                field860[++Statics.field861 - 1] = var5 == null ? 0 : var5.field3520;
                return 1;
            } else if (arg0 == 2619) {
                class328 var6 = var3.method5803();
                field862[++Statics.field1668 - 1] = var6 == null ? "" : var6.method5528().method6623();
                return 1;
            } else if (arg0 == 2620) {
                class323 var7 = var3.method5804();
                field860[++Statics.field861 - 1] = var7 == null ? 0 : var7.field3521;
                return 1;
            } else if (arg0 == 2621) {
                class328 var8 = var3.method5803();
                field860[++Statics.field861 - 1] = var8 == null ? 0 : var8.method5538();
                return 1;
            } else if (arg0 == 2622) {
                class328 var9 = var3.method5803();
                field860[++Statics.field861 - 1] = var9 == null ? 0 : var9.method5593();
                return 1;
            } else if (arg0 == 2623) {
                class328 var10 = var3.method5803();
                field860[++Statics.field861 - 1] = var10 == null ? 0 : var10.method5540();
                return 1;
            } else if (arg0 == 2624) {
                class328 var11 = var3.method5803();
                field860[++Statics.field861 - 1] = var11 != null && var11.method5530() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class328 var12 = var3.method5803();
                field860[++Statics.field861 - 1] = var12 != null && var12.method5579() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class328 var13 = var3.method5803();
                field862[++Statics.field1668 - 1] = var13 == null ? "" : var13.method5529().method6874();
                return 1;
            } else if (arg0 == 2627) {
                class328 var14 = var3.method5803();
                int var15 = var14 == null ? 0 : var14.method5655();
                int var16 = var14 == null ? 0 : var14.method5662();
                field860[++Statics.field861 - 1] = Math.min(var15, var16);
                field860[++Statics.field861 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class328 var17 = var3.method5803();
                field860[++Statics.field861 - 1] = var17 == null ? 0 : var17.method5662();
                return 1;
            } else if (arg0 == 2629) {
                class328 var18 = var3.method5803();
                field860[++Statics.field861 - 1] = var18 == null ? 0 : var18.method5652();
                return 1;
            } else if (arg0 == 2630) {
                class328 var19 = var3.method5803();
                field860[++Statics.field861 - 1] = var19 == null ? 0 : var19.method5541();
                return 1;
            } else if (arg0 == 2631) {
                class328 var20 = var3.method5803();
                field860[++Statics.field861 - 1] = var20 == null ? 0 : var20.method5728();
                return 1;
            } else if (arg0 == 2632) {
                class328 var21 = var3.method5803();
                field860[++Statics.field861 - 1] = var21 == null ? 0 : var21.method5544();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method5805();
                field860[Statics.field861 - 1] = var22 == null ? 0 : var22.method413(field860[Statics.field861 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method5805();
                field860[Statics.field861 - 1] = var23 == null ? 0 : var23.method378((char) field860[Statics.field861 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("dp.aw(ILdd;ZI)I")
    public static int method2229(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class330 var3 = class330.method1746(field860[--Statics.field861]);
            field860[++Statics.field861 - 1] = var3.field3736;
            return 1;
        } else if (arg0 == 2701) {
            class330 var4 = class330.method1746(field860[--Statics.field861]);
            if (var4.field3736 == -1) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = var4.field3737;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field860[--Statics.field861];
            class87 var6 = (class87) client.field675.method7872((long) var5);
            if (var6 == null) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field860[++Statics.field861 - 1] = client.field799;
            return 1;
        } else if (arg0 == 2707) {
            class330 var7 = class330.method1746(field860[--Statics.field861]);
            field860[++Statics.field861 - 1] = var7.method5782() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class330 var8 = class330.method1746(field860[--Statics.field861]);
            return method1967(var8);
        } else if (arg0 == 2709) {
            class330 var9 = class330.method1746(field860[--Statics.field861]);
            return method96(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ka.ay(ILdd;ZI)I")
    public static int method4958(int arg0, class79 arg1, boolean arg2) {
        class330 var3 = class330.method1746(field860[--Statics.field861]);
        if (arg0 == 2800) {
            field860[++Statics.field861 - 1] = class331.method2309(client.method6005(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field860[--Statics.field861];
            int var5 = var4 - 1;
            if (var3.field3684 == null || var5 >= var3.field3684.length || var3.field3684[var5] == null) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = var3.field3684[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3590 == null) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = var3.field3590;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eu.al(ILdd;ZI)I")
    public static int method2559(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field862[--Statics.field1668];
            class110.method1047(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field861 -= 2;
            client.method5146(Statics.field971, field860[Statics.field861], field860[Statics.field861 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field876) {
                field853 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field862[--Statics.field1668];
            int var5 = 0;
            if (class385.method2955(var4)) {
                var5 = class385.method4380(var4);
            }
            class296 var6 = class296.method3619(class294.field3119, client.field568.field1380);
            var6.field3211.method8270(var5);
            client.field568.method2642(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field862[--Statics.field1668];
            class296 var8 = class296.method3619(class294.field3125, client.field568.field1380);
            var8.field3211.method8113(var7.length() + 1);
            var8.field3211.method8119(var7);
            client.field568.method2642(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field862[--Statics.field1668];
            class296 var10 = class296.method3619(class294.field3188, client.field568.field1380);
            var10.field3211.method8113(var9.length() + 1);
            var10.field3211.method8119(var9);
            client.field568.method2642(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field860[--Statics.field861];
            String var12 = field862[--Statics.field1668];
            client.method821(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field861 -= 3;
            int var13 = field860[Statics.field861];
            int var14 = field860[Statics.field861 + 1];
            int var15 = field860[Statics.field861 + 2];
            class330 var16 = class330.method1746(var15);
            client.method2741(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field861 -= 2;
            int var17 = field860[Statics.field861];
            int var18 = field860[Statics.field861 + 1];
            class330 var19 = arg2 ? Statics.field371 : Statics.field865;
            client.method2741(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field3402 = field860[--Statics.field861] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field860[++Statics.field861 - 1] = Statics.field48.method2316() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field48.method2371(field860[--Statics.field861] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field862[--Statics.field1668];
            boolean var21 = field860[--Statics.field861] == 1;
            class32.method400(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field860[--Statics.field861];
            class296 var23 = class296.method3619(class294.field3194, client.field568.field1380);
            var23.field3211.method8114(var22);
            client.field568.method2642(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field860[--Statics.field861];
            Statics.field1668 -= 2;
            String var25 = field862[Statics.field1668];
            String var26 = field862[Statics.field1668 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class296 var27 = class296.method3619(class294.field3151, client.field568.field1380);
                var27.field3211.method8114(1 + class501.method5933(var25) + class501.method5933(var26));
                var27.field3211.method8119(var26);
                var27.field3211.method8113(var24);
                var27.field3211.method8119(var25);
                client.field568.method2642(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field861--;
            return 1;
        } else if (arg0 == 3118) {
            client.field662 = field860[--Statics.field861] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field752 = field860[--Statics.field861] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field860[--Statics.field861] == 1) {
                client.field637 |= 0x1;
            } else {
                client.field637 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field860[--Statics.field861] == 1) {
                client.field637 |= 0x2;
            } else {
                client.field637 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field860[--Statics.field861] == 1) {
                client.field637 |= 0x4;
            } else {
                client.field637 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field860[--Statics.field861] == 1) {
                client.field637 |= 0x8;
            } else {
                client.field637 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field637 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field626 = field860[--Statics.field861] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field628 = field860[--Statics.field861] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method2537(field860[--Statics.field861] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field860[++Statics.field861 - 1] = Statics.method4557() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field861 -= 2;
            client.field600 = field860[Statics.field861];
            client.field601 = field860[Statics.field861 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field861 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field861--;
            return 1;
        } else if (arg0 == 3132) {
            field860[++Statics.field861 - 1] = Statics.field4720;
            field860[++Statics.field861 - 1] = Statics.field3024;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field861--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field861 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field518 = 3;
            client.field614 = field860[--Statics.field861];
            return 1;
        } else if (arg0 == 3137) {
            client.field518 = 2;
            client.field614 = field860[--Statics.field861];
            return 1;
        } else if (arg0 == 3138) {
            client.field518 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field518 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field518 = 3;
            client.field614 = arg2 ? Statics.field371.field3673 : Statics.field865.field3673;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field860[--Statics.field861] == 1;
            Statics.field48.method2406(var28);
            return 1;
        } else if (arg0 == 3142) {
            field860[++Statics.field861 - 1] = Statics.field48.method2354() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field860[--Statics.field861] == 1;
            client.field557 = var29;
            if (!var29) {
                Statics.field48.method2314("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field860[++Statics.field861 - 1] = client.field557 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field860[--Statics.field861] == 1;
            Statics.field48.method2318(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field860[++Statics.field861 - 1] = Statics.field48.method2319() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field860[++Statics.field861 - 1] = class76.field956;
            return 1;
        } else if (arg0 == 3154) {
            field860[++Statics.field861 - 1] = client.method7119();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1668--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field861 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field861--;
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field861--;
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1668--;
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field861--;
            field862[++Statics.field1668 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field861--;
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field861 -= 2;
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field861 -= 2;
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field861 -= 2;
            field862[++Statics.field1668 - 1] = "";
            field862[++Statics.field1668 - 1] = "";
            field862[++Statics.field1668 - 1] = "";
            field862[++Statics.field1668 - 1] = "";
            field862[++Statics.field1668 - 1] = "";
            field862[++Statics.field1668 - 1] = "";
            field862[++Statics.field1668 - 1] = "";
            field862[++Statics.field1668 - 1] = "";
            field862[++Statics.field1668 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field861--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field861--;
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field861--;
            return 1;
        } else if (arg0 == 3175) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1668--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1668--;
            return 1;
        } else if (arg0 == 3181) {
            client.method3091(field860[--Statics.field861]);
            return 1;
        } else if (arg0 == 3182) {
            field860[++Statics.field861 - 1] = client.method1051();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field860[--Statics.field861];
            client.method4656(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gw.am(ILdd;ZB)I")
    public static int method3046(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field861 -= 3;
            client.method5385(field860[Statics.field861], field860[Statics.field861 + 1], field860[Statics.field861 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method5363(field860[--Statics.field861]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field861 -= 2;
            client.method2282(field860[Statics.field861], field860[Statics.field861 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class91 var31 = class91.field1092;
            class90 var32 = class90.field1083;
            int var33 = field860[--Statics.field861];
            if (arg0 == 3212) {
                int var34 = field860[--Statics.field861];
                var31 = (class91) class371.method4632(class91.method793(), var34);
                if (var31 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var34));
                }
            }
            if (arg0 == 3213) {
                int var35 = field860[--Statics.field861];
                var32 = (class90) class371.method4632(class90.method5993(), var35);
                if (var32 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var35));
                }
            }
            if (arg0 == 3209) {
                int var36 = field860[--Statics.field861];
                var31 = (class91) class371.method4632(class91.method793(), var36);
                if (var31 == null) {
                    var32 = (class90) class371.method4632(class90.method5993(), var36);
                    if (var32 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var36));
                    }
                }
            } else if (arg0 == 3181) {
                var31 = class91.field1095;
            } else if (arg0 == 3203) {
                var32 = class90.field1084;
            } else if (arg0 == 3205) {
                var32 = class90.field1085;
            } else if (arg0 == 3207) {
                var32 = class90.field1086;
            }
            if (class90.field1083 == var32) {
                switch(var31.field1096) {
                    case 1:
                        Statics.field48.method2406(var33 == 1);
                        break;
                    case 2:
                        Statics.field48.method2318(var33 == 1);
                        break;
                    case 3:
                        Statics.field48.method2320(var33 == 1);
                        break;
                    case 4:
                        if (var33 < 0) {
                            var33 = 0;
                        }
                        Statics.field48.method2334(var33);
                        break;
                    case 5:
                        client.method3091(var33);
                        break;
                    default:
                        String var37 = String.format("Unkown device option: %s.", var31.toString());
                        throw new RuntimeException(var37);
                }
            } else {
                switch(var32.field1087) {
                    case 1:
                        Statics.field48.method2371(var33 == 1);
                        break;
                    case 2:
                        int var43 = Math.min(Math.max(var33, 0), 100);
                        int var44 = Math.round((float) (var43 * 255) / 100.0F);
                        client.method3780(var44);
                        break;
                    case 3:
                        int var41 = Math.min(Math.max(var33, 0), 100);
                        int var42 = Math.round((float) (var41 * 127) / 100.0F);
                        client.method2942(var42);
                        break;
                    case 4:
                        int var39 = Math.min(Math.max(var33, 0), 100);
                        int var40 = Math.round((float) (var39 * 127) / 100.0F);
                        client.method2879(var40);
                        break;
                    default:
                        String var38 = String.format("Unkown game option: %s.", var32.toString());
                        throw new RuntimeException(var38);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class91 var19 = class91.field1092;
            class90 var20 = class90.field1083;
            boolean var21 = false;
            if (arg0 == 3214) {
                int var22 = field860[--Statics.field861];
                var19 = (class91) class371.method4632(class91.method793(), var22);
                if (var19 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var22));
                }
            }
            if (arg0 == 3215) {
                int var23 = field860[--Statics.field861];
                var20 = (class90) class371.method4632(class90.method5993(), var23);
                if (var20 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var23));
                }
            }
            if (arg0 == 3210) {
                int var24 = field860[--Statics.field861];
                var19 = (class91) class371.method4632(class91.method793(), var24);
                if (var19 == null) {
                    var20 = (class90) class371.method4632(class90.method5993(), var24);
                    if (var20 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var24));
                    }
                }
            } else if (arg0 == 3182) {
                var19 = class91.field1095;
            } else if (arg0 == 3204) {
                var20 = class90.field1084;
            } else if (arg0 == 3206) {
                var20 = class90.field1085;
            } else if (arg0 == 3208) {
                var20 = class90.field1086;
            }
            int var26;
            if (class90.field1083 == var20) {
                switch(var19.field1096) {
                    case 1:
                        var26 = Statics.field48.method2354() ? 1 : 0;
                        break;
                    case 2:
                        var26 = Statics.field48.method2319() ? 1 : 0;
                        break;
                    case 3:
                        var26 = Statics.field48.method2330() ? 1 : 0;
                        break;
                    case 4:
                        var26 = Statics.field48.method2324();
                        break;
                    case 5:
                        var26 = client.method1051();
                        break;
                    default:
                        String var25 = String.format("Unkown device option: %s.", var19.toString());
                        throw new RuntimeException(var25);
                }
            } else {
                switch(var20.field1087) {
                    case 1:
                        var26 = Statics.field48.method2316() ? 1 : 0;
                        break;
                    case 2:
                        int var30 = Statics.field48.method2370();
                        var26 = Math.round((float) (var30 * 100) / 255.0F);
                        break;
                    case 3:
                        int var29 = Statics.field48.method2327();
                        var26 = Math.round((float) (var29 * 100) / 127.0F);
                        break;
                    case 4:
                        int var28 = Statics.field48.method2332();
                        var26 = Math.round((float) (var28 * 100) / 127.0F);
                        break;
                    default:
                        String var27 = String.format("Unkown game option: %s.", var20.toString());
                        throw new RuntimeException(var27);
                }
            }
            field860[++Statics.field861 - 1] = var26;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var3 = field860[--Statics.field861];
            int var4 = 0;
            class91 var5 = (class91) class371.method4632(class91.method793(), var3);
            if (var5 != null) {
                var4 = class91.field1092 == var5 ? 0 : 1;
            }
            field860[++Statics.field861 - 1] = var4;
            return 1;
        } else if (arg0 == 3218) {
            int var6 = field860[--Statics.field861];
            int var7 = 0;
            class90 var8 = (class90) class371.method4632(class90.method5993(), var6);
            if (var8 != null) {
                var7 = class90.field1083 == var8 ? 0 : 1;
            }
            field860[++Statics.field861 - 1] = var7;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class91 var9 = class91.field1092;
            class90 var10 = class90.field1083;
            boolean var11 = true;
            boolean var12 = true;
            if (arg0 == 3217) {
                int var13 = field860[--Statics.field861];
                var9 = (class91) class371.method4632(class91.method793(), var13);
                if (var9 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var13));
                }
            }
            if (arg0 == 3219) {
                int var14 = field860[--Statics.field861];
                var10 = (class90) class371.method4632(class90.method5993(), var14);
                if (var10 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var14));
                }
            }
            byte var16;
            int var17;
            if (class90.field1083 == var10) {
                switch(var9.field1096) {
                    case 1:
                    case 2:
                    case 3:
                        var16 = 0;
                        var17 = 1;
                        break;
                    case 4:
                        var16 = 0;
                        var17 = Integer.MAX_VALUE;
                        break;
                    case 5:
                        var16 = 0;
                        var17 = 100;
                        break;
                    default:
                        String var15 = String.format("Unkown device option: %s.", var9.toString());
                        throw new RuntimeException(var15);
                }
            } else {
                switch(var10.field1087) {
                    case 1:
                        var16 = 0;
                        var17 = 1;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        var16 = 0;
                        var17 = 100;
                        break;
                    default:
                        String var18 = String.format("Unkown game option: %s.", var10.toString());
                        throw new RuntimeException(var18);
                }
            }
            field860[++Statics.field861 - 1] = var16;
            field860[++Statics.field861 - 1] = var17;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.bs(ILdd;ZI)I")
    public static int method161(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field860[++Statics.field861 - 1] = client.field506;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field861 -= 2;
            int var3 = field860[Statics.field861];
            int var4 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = class85.method4669(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field861 -= 2;
            int var5 = field860[Statics.field861];
            int var6 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = class85.method3888(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field861 -= 2;
            int var7 = field860[Statics.field861];
            int var8 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = class85.method5379(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class185.method6477(var9).field1900;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field646[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field647[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field719[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1882;
            int var14 = (Statics.field971.field1163 >> 7) + Statics.field2380;
            int var15 = (Statics.field971.field1153 >> 7) + Statics.field1302;
            field860[++Statics.field861 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field860[++Statics.field861 - 1] = client.field507 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field861 -= 2;
            int var19 = field860[Statics.field861] + 32768;
            int var20 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = class85.method4669(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field861 -= 2;
            int var21 = field860[Statics.field861] + 32768;
            int var22 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = class85.method3888(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field861 -= 2;
            int var23 = field860[Statics.field861] + 32768;
            int var24 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = class85.method5379(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field682 >= 2) {
                field860[++Statics.field861 - 1] = client.field682;
            } else {
                field860[++Statics.field861 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field860[++Statics.field861 - 1] = client.field524;
            return 1;
        } else if (arg0 == 3318) {
            field860[++Statics.field861 - 1] = client.field504;
            return 1;
        } else if (arg0 == 3321) {
            field860[++Statics.field861 - 1] = client.field680 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field860[++Statics.field861 - 1] = client.field681;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field766) {
                field860[++Statics.field861 - 1] = 1;
            } else {
                field860[++Statics.field861 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field860[++Statics.field861 - 1] = client.field505;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field861 -= 4;
            int var25 = field860[Statics.field861];
            int var26 = field860[Statics.field861 + 1];
            int var27 = field860[Statics.field861 + 2];
            int var28 = field860[Statics.field861 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field860[++Statics.field861 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field860[++Statics.field861 - 1] = client.field520;
            return 1;
        } else if (arg0 == 3327) {
            field860[++Statics.field861 - 1] = client.field521;
            return 1;
        } else if (arg0 == 3331) {
            field860[++Statics.field861 - 1] = client.field680;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("il.bc(ILdd;ZI)I")
    public static int method3795(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field861 -= 2;
            int var3 = field860[Statics.field861];
            int var4 = field860[Statics.field861 + 1];
            class192 var5 = class192.method321(var3);
            if (var5.field1972 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1978; var6++) {
                if (var5.field1976[var6] == var4) {
                    field862[++Statics.field1668 - 1] = var5.field1971[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field862[++Statics.field1668 - 1] = var5.field1970;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field861 -= 4;
            int var7 = field860[Statics.field861];
            int var8 = field860[Statics.field861 + 1];
            int var9 = field860[Statics.field861 + 2];
            int var10 = field860[Statics.field861 + 3];
            class192 var11 = class192.method321(var9);
            if (var11.field1975 != var7 || var11.field1972 != var8) {
                if (var8 == 115) {
                    field862[++Statics.field1668 - 1] = class350.field3887;
                } else {
                    field860[++Statics.field861 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1978; var12++) {
                if (var11.field1976[var12] == var10) {
                    if (var8 == 115) {
                        field862[++Statics.field1668 - 1] = var11.field1971[var12];
                    } else {
                        field860[++Statics.field861 - 1] = var11.field1977[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field862[++Statics.field1668 - 1] = var11.field1970;
                } else {
                    field860[++Statics.field861 - 1] = var11.field1974;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field860[--Statics.field861];
            class192 var14 = class192.method321(var13);
            field860[++Statics.field861 - 1] = var14.method3354();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oo.bj(ILdd;ZI)I")
    public static int method6283(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field740.method3791(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field740.method3822(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field740.method3792(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ho.bo(ILdd;ZI)I")
    public static int method3450(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field497.field836 == 0) {
                field860[++Statics.field861 - 1] = -2;
            } else if (Statics.field497.field836 == 1) {
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = Statics.field497.field830.method7181();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field860[--Statics.field861];
            if (Statics.field497.method1714() && var3 >= 0 && var3 < Statics.field497.field830.method7181()) {
                class418 var4 = (class418) Statics.field497.field830.method7184(var3);
                field862[++Statics.field1668 - 1] = var4.method7151();
                field862[++Statics.field1668 - 1] = var4.method7152();
            } else {
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field860[--Statics.field861];
            if (Statics.field497.method1714() && var5 >= 0 && var5 < Statics.field497.field830.method7181()) {
                field860[++Statics.field861 - 1] = ((class425) Statics.field497.field830.method7184(var5)).field4612;
            } else {
                field860[++Statics.field861 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field860[--Statics.field861];
            if (Statics.field497.method1714() && var6 >= 0 && var6 < Statics.field497.field830.method7181()) {
                field860[++Statics.field861 - 1] = ((class425) Statics.field497.field830.method7184(var6)).field4614;
            } else {
                field860[++Statics.field861 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field862[--Statics.field1668];
            int var8 = field860[--Statics.field861];
            Statics.method95(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field862[--Statics.field1668];
            Statics.field497.method1721(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field862[--Statics.field1668];
            Statics.field497.method1725(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field862[--Statics.field1668];
            Statics.field497.method1723(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field862[--Statics.field1668];
            boolean var13 = true;
            Statics.field497.method1726(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field862[--Statics.field1668];
            String var15 = client.method319(var14);
            field860[++Statics.field861 - 1] = Statics.field497.method1719(new class525(var15, Statics.field3059), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field4535 == null) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = Statics.field4535.field4583;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field4535 == null) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = Statics.field4535.method7181();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field860[--Statics.field861];
            if (Statics.field4535 == null || var16 >= Statics.field4535.method7181()) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = Statics.field4535.method7184(var16).method7150().method8756();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field860[--Statics.field861];
            if (Statics.field4535 == null || var17 >= Statics.field4535.method7181()) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = ((class425) Statics.field4535.method7184(var17)).method7249();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field860[--Statics.field861];
            if (Statics.field4535 == null || var18 >= Statics.field4535.method7181()) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = ((class425) Statics.field4535.method7184(var18)).field4614;
            }
            return 1;
        } else if (arg0 == 3616) {
            field860[++Statics.field861 - 1] = Statics.field4535 == null ? 0 : Statics.field4535.field4582;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field862[--Statics.field1668];
            client.method2491(var19);
            return 1;
        } else if (arg0 == 3618) {
            field860[++Statics.field861 - 1] = Statics.field4535 == null ? 0 : Statics.field4535.field4588;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field862[--Statics.field1668];
            client.method52(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method7482();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field497.method1714()) {
                field860[++Statics.field861 - 1] = Statics.field497.field828.method7181();
            } else {
                field860[++Statics.field861 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field860[--Statics.field861];
            if (Statics.field497.method1714() && var21 >= 0 && var21 < Statics.field497.field828.method7181()) {
                class424 var22 = (class424) Statics.field497.field828.method7184(var21);
                field862[++Statics.field1668 - 1] = var22.method7151();
                field862[++Statics.field1668 - 1] = var22.method7152();
            } else {
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field862[--Statics.field1668];
            String var24 = client.method319(var23);
            field860[++Statics.field861 - 1] = Statics.field497.method1720(new class525(var24, Statics.field3059)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field860[--Statics.field861];
            if (Statics.field4535 == null || var25 >= Statics.field4535.method7181() || !Statics.field4535.method7184(var25).method7150().equals(Statics.field971.field1112)) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field4535 == null || Statics.field4535.field4587 == null) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = Statics.field4535.field4587;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field860[--Statics.field861];
            if (Statics.field4535 == null || var26 >= Statics.field4535.method7181() || !((class420) Statics.field4535.method7184(var26)).method7122()) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field860[--Statics.field861];
            if (Statics.field4535 == null || var27 >= Statics.field4535.method7181() || !((class420) Statics.field4535.method7184(var27)).method7125()) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field497.field830.method7238();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class507(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class508(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class119(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class115(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class118(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class123(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class117(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class116(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class120(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class121(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field497.field830.method7185();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field497.field828.method7238();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field860[--Statics.field861] == 1;
            Statics.field497.field828.method7193(new class507(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field860[--Statics.field861] == 1;
            Statics.field497.field828.method7193(new class508(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field497.field828.method7185();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field4535 != null) {
                Statics.field4535.method7238();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class507(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class508(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class119(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class115(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class118(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class123(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class117(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class116(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class120(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class121(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field4535 != null) {
                Statics.field4535.method7185();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field860[--Statics.field861] == 1;
            Statics.field497.field830.method7193(new class122(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field860[--Statics.field861] == 1;
            if (Statics.field4535 != null) {
                Statics.field4535.method7193(new class122(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lb.bq(ILdd;ZI)I")
    public static int method5298(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("jx.bg(ILdd;ZI)I")
    public static int method4555(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field4412 == null) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = 1;
                Statics.field3453 = Statics.field4412;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field860[--Statics.field861];
            if (client.field593[var3] == null) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = 1;
                Statics.field3453 = client.field593[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field862[++Statics.field1668 - 1] = Statics.field3453.field1692;
            return 1;
        } else if (arg0 == 3803) {
            field860[++Statics.field861 - 1] = Statics.field3453.field1709 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field860[++Statics.field861 - 1] = Statics.field3453.field1695;
            return 1;
        } else if (arg0 == 3805) {
            field860[++Statics.field861 - 1] = Statics.field3453.field1696;
            return 1;
        } else if (arg0 == 3806) {
            field860[++Statics.field861 - 1] = Statics.field3453.field1710;
            return 1;
        } else if (arg0 == 3807) {
            field860[++Statics.field861 - 1] = Statics.field3453.field1698;
            return 1;
        } else if (arg0 == 3809) {
            field860[++Statics.field861 - 1] = Statics.field3453.field1699;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field860[--Statics.field861];
            field862[++Statics.field1668 - 1] = Statics.field3453.field1687[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = Statics.field3453.field1693[var5];
            return 1;
        } else if (arg0 == 3812) {
            field860[++Statics.field861 - 1] = Statics.field3453.field1697;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field860[--Statics.field861];
            field862[++Statics.field1668 - 1] = Statics.field3453.field1689[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field861 -= 3;
            int var7 = field860[Statics.field861];
            int var8 = field860[Statics.field861 + 1];
            int var9 = field860[Statics.field861 + 2];
            field860[++Statics.field861 - 1] = Statics.field3453.method3039(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field860[++Statics.field861 - 1] = Statics.field3453.field1706;
            return 1;
        } else if (arg0 == 3816) {
            field860[++Statics.field861 - 1] = Statics.field3453.field1707;
            return 1;
        } else if (arg0 == 3817) {
            field860[++Statics.field861 - 1] = Statics.field3453.method2973(field862[--Statics.field1668]);
            return 1;
        } else if (arg0 == 3818) {
            field860[Statics.field861 - 1] = Statics.field3453.method2995()[field860[Statics.field861 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field861 -= 2;
            int var10 = field860[Statics.field861];
            int var11 = field860[Statics.field861 + 1];
            client.method2060(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = Statics.field3453.field1704[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field861 -= 3;
                int var13 = field860[Statics.field861];
                boolean var14 = field860[Statics.field861 + 1] == 1;
                int var15 = field860[Statics.field861 + 2];
                client.method1126(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field860[--Statics.field861];
                field860[++Statics.field861 - 1] = Statics.field3453.field1705[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field2051 == null) {
                    field860[++Statics.field861 - 1] = 0;
                } else {
                    field860[++Statics.field861 - 1] = 1;
                    Statics.field873 = Statics.field2051;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field860[--Statics.field861];
                if (client.field720[var17] == null) {
                    field860[++Statics.field861 - 1] = 0;
                } else {
                    field860[++Statics.field861 - 1] = 1;
                    Statics.field873 = client.field720[var17];
                    Statics.field866 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field862[++Statics.field1668 - 1] = Statics.field873.field1762;
                return 1;
            } else if (arg0 == 3853) {
                field860[++Statics.field861 - 1] = Statics.field873.field1768;
                return 1;
            } else if (arg0 == 3854) {
                field860[++Statics.field861 - 1] = Statics.field873.field1767;
                return 1;
            } else if (arg0 == 3855) {
                field860[++Statics.field861 - 1] = Statics.field873.method3075();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field860[--Statics.field861];
                field862[++Statics.field1668 - 1] = ((class145) Statics.field873.field1763.get(var18)).field1632.method8756();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field860[--Statics.field861];
                field860[++Statics.field861 - 1] = ((class145) Statics.field873.field1763.get(var19)).field1635;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field860[--Statics.field861];
                field860[++Statics.field861 - 1] = ((class145) Statics.field873.field1763.get(var20)).field1631;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field860[--Statics.field861];
                Statics.method5158(Statics.field866, var21);
                return 1;
            } else if (arg0 == 3860) {
                field860[++Statics.field861 - 1] = Statics.field873.method3067(field862[--Statics.field1668]);
                return 1;
            } else if (arg0 == 3861) {
                field860[Statics.field861 - 1] = Statics.field873.method3064()[field860[Statics.field861 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field860[++Statics.field861 - 1] = Statics.field1496 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ax.bf(ILdd;ZI)I")
    public static int method11(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field794[var3].method6224();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field794[var4].field4321;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field794[var5].field4315;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field794[var6].field4317;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field794[var7].field4318;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.field794[var8].field4319;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field860[--Statics.field861];
            int var10 = client.field794[var9].method6221();
            field860[++Statics.field861 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field860[--Statics.field861];
            int var12 = client.field794[var11].method6221();
            field860[++Statics.field861 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field860[--Statics.field861];
            int var14 = client.field794[var13].method6221();
            field860[++Statics.field861 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field860[--Statics.field861];
            int var16 = client.field794[var15].method6221();
            field860[++Statics.field861 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field860[--Statics.field861] == 1;
            if (Statics.field4323 != null) {
                Statics.field4323.method6178(class359.field4292, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field860[--Statics.field861] == 1;
            if (Statics.field4323 != null) {
                Statics.field4323.method6178(class359.field4291, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field861 -= 2;
            boolean var19 = field860[Statics.field861] == 1;
            boolean var20 = field860[Statics.field861 + 1] == 1;
            if (Statics.field4323 != null) {
                client.field795.field501 = var20;
                Statics.field4323.method6178(client.field795, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field860[--Statics.field861] == 1;
            if (Statics.field4323 != null) {
                Statics.field4323.method6178(class359.field4290, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field860[--Statics.field861] == 1;
            if (Statics.field4323 != null) {
                Statics.field4323.method6178(class359.field4293, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field860[++Statics.field861 - 1] = Statics.field4323 == null ? 0 : Statics.field4323.field4289.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field860[--Statics.field861];
            class365 var24 = (class365) Statics.field4323.field4289.get(var23);
            field860[++Statics.field861 - 1] = var24.field4309;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field860[--Statics.field861];
            class365 var26 = (class365) Statics.field4323.field4289.get(var25);
            field862[++Statics.field1668 - 1] = var26.method6215();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field860[--Statics.field861];
            class365 var28 = (class365) Statics.field4323.field4289.get(var27);
            field862[++Statics.field1668 - 1] = var28.method6216();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field860[--Statics.field861];
            class365 var30 = (class365) Statics.field4323.field4289.get(var29);
            long var31 = class301.method4630() - Statics.field2113 - var30.field4311;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field862[++Statics.field1668 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field860[--Statics.field861];
            class365 var38 = (class365) Statics.field4323.field4289.get(var37);
            field860[++Statics.field861 - 1] = var38.field4310.field4317;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field860[--Statics.field861];
            class365 var40 = (class365) Statics.field4323.field4289.get(var39);
            field860[++Statics.field861 - 1] = var40.field4310.field4315;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field860[--Statics.field861];
            class365 var42 = (class365) Statics.field4323.field4289.get(var41);
            field860[++Statics.field861 - 1] = var42.field4310.field4321;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class206.method5155(var43).field2252 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fz.bd(ILdd;ZI)I")
    public static int method2913(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field861 -= 2;
            int var3 = field860[Statics.field861];
            int var4 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field861 -= 2;
            int var5 = field860[Statics.field861];
            int var6 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field861 -= 2;
            int var7 = field860[Statics.field861];
            int var8 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field861 -= 2;
            int var9 = field860[Statics.field861];
            int var10 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field861 -= 5;
            int var13 = field860[Statics.field861];
            int var14 = field860[Statics.field861 + 1];
            int var15 = field860[Statics.field861 + 2];
            int var16 = field860[Statics.field861 + 3];
            int var17 = field860[Statics.field861 + 4];
            field860[++Statics.field861 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field861 -= 2;
            int var18 = field860[Statics.field861];
            int var19 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field861 -= 2;
            int var20 = field860[Statics.field861];
            int var21 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field861 -= 2;
            int var22 = field860[Statics.field861];
            int var23 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field861 -= 2;
            int var24 = field860[Statics.field861];
            int var25 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field861 -= 2;
            int var26 = field860[Statics.field861];
            int var27 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field861 -= 2;
            int var28 = field860[Statics.field861];
            int var29 = field860[Statics.field861 + 1];
            if (var28 == 0) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field861 -= 2;
            int var30 = field860[Statics.field861];
            int var31 = field860[Statics.field861 + 1];
            if (var30 == 0) {
                field860[++Statics.field861 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field860[++Statics.field861 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field860[++Statics.field861 - 1] = var30;
                    break;
                case 2:
                    field860[++Statics.field861 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field860[++Statics.field861 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field860[++Statics.field861 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field860[++Statics.field861 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field861 -= 2;
            int var32 = field860[Statics.field861];
            int var33 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field861 -= 2;
            int var34 = field860[Statics.field861];
            int var35 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field861 -= 2;
            int var36 = field860[Statics.field861];
            int var37 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field861 -= 2;
            int var38 = field860[Statics.field861];
            int var39 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field861 -= 3;
            long var40 = (long) field860[Statics.field861];
            long var42 = (long) field860[Statics.field861 + 1];
            long var44 = (long) field860[Statics.field861 + 2];
            field860[++Statics.field861 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class303.method3696(field860[--Statics.field861]);
            field860[++Statics.field861 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field861 -= 2;
            int var47 = field860[Statics.field861];
            int var48 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field861 -= 3;
            int var49 = field860[Statics.field861];
            int var50 = field860[Statics.field861 + 1];
            int var51 = field860[Statics.field861 + 2];
            field860[++Statics.field861 - 1] = class303.method635(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field861 -= 3;
            int var52 = field860[Statics.field861];
            int var53 = field860[Statics.field861 + 1];
            int var54 = field860[Statics.field861 + 2];
            field860[++Statics.field861 - 1] = class303.method5475(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field861 -= 3;
            int var55 = field860[Statics.field861];
            int var56 = field860[Statics.field861 + 1];
            int var57 = field860[Statics.field861 + 2];
            int var58 = 31 - var57;
            field860[++Statics.field861 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field861 -= 4;
            int var59 = field860[Statics.field861];
            int var60 = field860[Statics.field861 + 1];
            int var61 = field860[Statics.field861 + 2];
            int var62 = field860[Statics.field861 + 3];
            int var63 = class303.method5475(var59, var61, var62);
            int var64 = class303.method3045(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field860[++Statics.field861 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field860[Statics.field861 - 1] = class453.method648(field860[Statics.field861 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field860[Statics.field861 - 1] = class453.method6207(field860[Statics.field861 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field861 -= 2;
            int var65 = field860[Statics.field861];
            int var66 = field860[Statics.field861 + 1];
            int var67 = class453.method2716(var65, var66);
            field860[++Statics.field861 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field860[Statics.field861 - 1] = Math.abs(field860[Statics.field861 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field862[--Statics.field1668];
            int var69 = -1;
            if (class385.method2955(var68)) {
                var69 = class385.method4380(var68);
            }
            field860[++Statics.field861 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qw.ba(ILdd;ZI)I")
    public static int method7279(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field862[--Statics.field1668];
            int var4 = field860[--Statics.field861];
            field862[++Statics.field1668 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1668 -= 2;
            String var5 = field862[Statics.field1668];
            String var6 = field862[Statics.field1668 + 1];
            field862[++Statics.field1668 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field862[--Statics.field1668];
            int var8 = field860[--Statics.field861];
            field862[++Statics.field1668 - 1] = var7 + class385.method2068(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field862[--Statics.field1668];
            field862[++Statics.field1668 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field860[--Statics.field861];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field867.setTime(new Date(var11));
            int var13 = field867.get(5);
            int var14 = field867.get(2);
            int var15 = field867.get(1);
            field862[++Statics.field1668 - 1] = var13 + "-" + field868[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1668 -= 2;
            String var16 = field862[Statics.field1668];
            String var17 = field862[Statics.field1668 + 1];
            if (Statics.field971.field1100 == null || Statics.field971.field1100.field3541 == 0) {
                field862[++Statics.field1668 - 1] = var16;
            } else {
                field862[++Statics.field1668 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field860[--Statics.field861];
            field862[++Statics.field1668 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1668 -= 2;
            field860[++Statics.field861 - 1] = class385.method3047(class386.method3430(field862[Statics.field1668], field862[Statics.field1668 + 1], Statics.field4618));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field862[--Statics.field1668];
            Statics.field861 -= 2;
            int var20 = field860[Statics.field861];
            int var21 = field860[Statics.field861 + 1];
            byte[] var22 = Statics.field3459.method6080(var21, 0);
            class392 var23 = new class392(var22);
            field860[++Statics.field861 - 1] = var23.method6778(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field862[--Statics.field1668];
            Statics.field861 -= 2;
            int var25 = field860[Statics.field861];
            int var26 = field860[Statics.field861 + 1];
            byte[] var27 = Statics.field3459.method6080(var26, 0);
            class392 var28 = new class392(var27);
            field860[++Statics.field861 - 1] = var28.method6798(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1668 -= 2;
            String var29 = field862[Statics.field1668];
            String var30 = field862[Statics.field1668 + 1];
            if (field860[--Statics.field861] == 1) {
                field862[++Statics.field1668 - 1] = var29;
            } else {
                field862[++Statics.field1668 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field862[--Statics.field1668];
            field862[++Statics.field1668 - 1] = class396.method6779(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field862[--Statics.field1668];
            int var33 = field860[--Statics.field861];
            field862[++Statics.field1668 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class385.method5423((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = Statics.method3784((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class385.method6499((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class385.method3055((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field862[--Statics.field1668];
            if (var38 == null) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field862[--Statics.field1668];
            Statics.field861 -= 2;
            int var40 = field860[Statics.field861];
            int var41 = field860[Statics.field861 + 1];
            field862[++Statics.field1668 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field862[--Statics.field1668];
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
            field862[++Statics.field1668 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field862[--Statics.field1668];
            int var48 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1668 -= 2;
            String var49 = field862[Statics.field1668];
            String var50 = field862[Statics.field1668 + 1];
            int var51 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field862[--Statics.field1668];
            field862[++Statics.field1668 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field1668 -= 3;
            String var53 = field862[Statics.field1668];
            String var54 = field862[Statics.field1668 + 1];
            String var55 = field862[Statics.field1668 + 2];
            if (Statics.field971.field1100 == null) {
                field862[++Statics.field1668 - 1] = var55;
                return 1;
            }
            switch(Statics.field971.field1100.field3542) {
                case 0:
                    field862[++Statics.field1668 - 1] = var53;
                    break;
                case 1:
                    field862[++Statics.field1668 - 1] = var54;
                    break;
                case 2:
                default:
                    field862[++Statics.field1668 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cd.bn(ILdd;ZB)I")
    public static int method1065(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field860[--Statics.field861];
            field862[++Statics.field1668 - 1] = class206.method5155(var3).field2208;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field861 -= 2;
            int var4 = field860[Statics.field861];
            int var5 = field860[Statics.field861 + 1];
            class206 var6 = class206.method5155(var4);
            if (var5 < 1 || var5 > 5 || var6.field2205[var5 - 1] == null) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = var6.field2205[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field861 -= 2;
            int var7 = field860[Statics.field861];
            int var8 = field860[Statics.field861 + 1];
            class206 var9 = class206.method5155(var7);
            if (var8 < 1 || var8 > 5 || var9.field2231[var8 - 1] == null) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = var9.field2231[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class206.method5155(var10).field2246;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class206.method5155(var11).field2213 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field860[--Statics.field861];
            class206 var13 = class206.method5155(var12);
            if (var13.field2243 == -1 && var13.field2242 >= 0) {
                field860[++Statics.field861 - 1] = var13.field2242;
            } else {
                field860[++Statics.field861 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field860[--Statics.field861];
            class206 var15 = class206.method5155(var14);
            if (var15.field2243 >= 0 && var15.field2242 >= 0) {
                field860[++Statics.field861 - 1] = var15.field2242;
            } else {
                field860[++Statics.field861 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class206.method5155(var16).field2224 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field860[--Statics.field861];
            class206 var18 = class206.method5155(var17);
            if (var18.field2212 == -1 && var18.field2236 >= 0) {
                field860[++Statics.field861 - 1] = var18.field2236;
            } else {
                field860[++Statics.field861 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field860[--Statics.field861];
            class206 var20 = class206.method5155(var19);
            if (var20.field2212 >= 0 && var20.field2236 >= 0) {
                field860[++Statics.field861 - 1] = var20.field2236;
            } else {
                field860[++Statics.field861 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field862[--Statics.field1668];
            int var22 = field860[--Statics.field861];
            client.method2304(var21, var22 == 1);
            field860[++Statics.field861 - 1] = Statics.field1328;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field93 == null || Statics.field63 >= Statics.field1328) {
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = Statics.field93[++Statics.field63 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field63 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field860[--Statics.field861];
            int var24 = class206.method5155(var23).method3636();
            if (var24 == -1) {
                field860[++Statics.field861 - 1] = var24;
            } else {
                field860[++Statics.field861 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class206.method5155(var25).field2202;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class206.method5155(var26).field2222;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class206.method5155(var27).field2223;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field860[--Statics.field861];
            class206 var29 = class206.method5155(var28);
            field860[++Statics.field861 - 1] = var29.field2250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.bb(ILdd;ZI)I")
    public static int method2558(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field860[++Statics.field861 - 1] = client.field558;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field861 -= 3;
            client.field558 = field860[Statics.field861];
            Statics.field2066 = Statics.method6978(field860[Statics.field861 + 1]);
            if (Statics.field2066 == null) {
                Statics.field2066 = class520.field5155;
            }
            client.field731 = field860[Statics.field861 + 2];
            class296 var3 = class296.method3619(class294.field3126, client.field568.field1380);
            var3.field3211.method8113(client.field558);
            var3.field3211.method8113(Statics.field2066.field5157);
            var3.field3211.method8113(client.field731);
            client.field568.method2642(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field862[--Statics.field1668];
            Statics.field861 -= 2;
            int var5 = field860[Statics.field861];
            int var6 = field860[Statics.field861 + 1];
            class296 var7 = class296.method3619(class294.field3140, client.field568.field1380);
            var7.field3211.method8113(class501.method5933(var4) + 2);
            var7.field3211.method8119(var4);
            var7.field3211.method8113(var5 - 1);
            var7.field3211.method8113(var6);
            client.field568.method2642(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field861 -= 2;
            int var8 = field860[Statics.field861];
            int var9 = field860[Statics.field861 + 1];
            class65 var10 = class110.method2722(var8, var9);
            if (var10 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = var10.field483;
                field860[++Statics.field861 - 1] = var10.field484;
                field862[++Statics.field1668 - 1] = var10.field486 == null ? "" : var10.field486;
                field862[++Statics.field1668 - 1] = var10.field490 == null ? "" : var10.field490;
                field862[++Statics.field1668 - 1] = var10.field494 == null ? "" : var10.field494;
                field860[++Statics.field861 - 1] = var10.method1084() ? 1 : (var10.method1087() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field860[--Statics.field861];
            class65 var12 = class110.method3099(var11);
            if (var12 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = var12.field485;
                field860[++Statics.field861 - 1] = var12.field484;
                field862[++Statics.field1668 - 1] = var12.field486 == null ? "" : var12.field486;
                field862[++Statics.field1668 - 1] = var12.field490 == null ? "" : var12.field490;
                field862[++Statics.field1668 - 1] = var12.field494 == null ? "" : var12.field494;
                field860[++Statics.field861 - 1] = var12.method1084() ? 1 : (var12.method1087() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2066 == null) {
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = Statics.field2066.field5157;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field862[--Statics.field1668];
            int var14 = field860[--Statics.field861];
            class296 var15 = class526.method3451(var14, var13, Statics.field4618, -1);
            client.field568.method2642(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1668 -= 2;
            String var16 = field862[Statics.field1668];
            String var17 = field862[Statics.field1668 + 1];
            class296 var18 = class296.method3619(class294.field3164, client.field568.field1380);
            var18.field3211.method8114(0);
            int var19 = var18.field3211.field5017;
            var18.field3211.method8119(var16);
            class333.method5429(var18.field3211, var17);
            var18.field3211.method8239(var18.field3211.field5017 - var19);
            client.field568.method2642(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field862[--Statics.field1668];
            Statics.field861 -= 2;
            int var21 = field860[Statics.field861];
            int var22 = field860[Statics.field861 + 1];
            class296 var23 = class526.method3451(var21, var20, Statics.field4618, var22);
            client.field568.method2642(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field971 == null || Statics.field971.field1112 == null) {
                var24 = "";
            } else {
                var24 = Statics.field971.field1112.method8756();
            }
            field862[++Statics.field1668 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field860[++Statics.field861 - 1] = client.field731;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class110.method2728(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class110.method2532(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = class110.method5150(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field862[--Statics.field1668];
            client.method5430(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field737 = field862[--Statics.field1668].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field862[++Statics.field1668 - 1] = client.field737;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field862[--Statics.field1668];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field861 -= 2;
            int var30 = field860[Statics.field861];
            int var31 = field860[Statics.field861 + 1];
            class65 var32 = class110.method2722(var30, var31);
            if (var32 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = var32.field483;
                field860[++Statics.field861 - 1] = var32.field484;
                field862[++Statics.field1668 - 1] = var32.field486 == null ? "" : var32.field486;
                field862[++Statics.field1668 - 1] = var32.field490 == null ? "" : var32.field490;
                field862[++Statics.field1668 - 1] = var32.field494 == null ? "" : var32.field494;
                field860[++Statics.field861 - 1] = var32.method1084() ? 1 : (var32.method1087() ? 2 : 0);
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field860[--Statics.field861];
            class65 var34 = class110.method3099(var33);
            if (var34 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = var34.field485;
                field860[++Statics.field861 - 1] = var34.field484;
                field862[++Statics.field1668 - 1] = var34.field486 == null ? "" : var34.field486;
                field862[++Statics.field1668 - 1] = var34.field490 == null ? "" : var34.field490;
                field862[++Statics.field1668 - 1] = var34.field494 == null ? "" : var34.field494;
                field860[++Statics.field861 - 1] = var34.method1084() ? 1 : (var34.method1087() ? 2 : 0);
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("im.bx(ILdd;ZI)I")
    public static int method4351(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field860[++Statics.field861 - 1] = client.method4406();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field860[--Statics.field861];
            if (var3 == 1 || var3 == 2) {
                client.method2433(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field860[++Statics.field861 - 1] = Statics.field48.method2338();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field860[--Statics.field861];
            if (var4 == 1 || var4 == 2) {
                Statics.field48.method2322(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field861--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oo.be(ILdd;ZI)I")
    public static int method6284(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field861 -= 2;
            int var3 = field860[Statics.field861];
            int var4 = field860[Statics.field861 + 1];
            if (!client.field751) {
                client.field589 = var3;
                client.field590 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field860[++Statics.field861 - 1] = client.field589;
            return 1;
        } else if (arg0 == 5506) {
            field860[++Statics.field861 - 1] = client.field590;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field860[--Statics.field861];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field648 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field860[++Statics.field861 - 1] = client.field648;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.bh(ILdd;ZI)I")
    public static int method1249(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field569 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("of.bp(II)I")
    public static int method6571(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("jm.bw(II)I")
    public static int method4877(int arg0) {
        return (int) ((Math.log((double) arg0) / field869 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("hq.bi(ILdd;ZI)I")
    public static int method3428(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field861 -= 2;
            client.field777 = (short) method6571(field860[Statics.field861]);
            if (client.field777 <= 0) {
                client.field777 = 256;
            }
            client.field621 = (short) method6571(field860[Statics.field861 + 1]);
            if (client.field621 <= 0) {
                client.field621 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field861 -= 2;
            client.field624 = (short) field860[Statics.field861];
            if (client.field624 <= 0) {
                client.field624 = 256;
            }
            client.field780 = (short) field860[Statics.field861 + 1];
            if (client.field780 <= 0) {
                client.field780 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field861 -= 4;
            client.field781 = (short) field860[Statics.field861];
            if (client.field781 <= 0) {
                client.field781 = 1;
            }
            client.field782 = (short) field860[Statics.field861 + 1];
            if (client.field782 <= 0) {
                client.field782 = 32767;
            } else if (client.field782 < client.field781) {
                client.field782 = client.field781;
            }
            client.field592 = (short) field860[Statics.field861 + 2];
            if (client.field592 <= 0) {
                client.field592 = 1;
            }
            client.field784 = (short) field860[Statics.field861 + 3];
            if (client.field784 <= 0) {
                client.field784 = 32767;
            } else if (client.field784 < client.field592) {
                client.field784 = client.field592;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field604 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = -1;
            } else {
                client.method5987(0, 0, client.field604.field3618, client.field604.field3735, false);
                field860[++Statics.field861 - 1] = client.field787;
                field860[++Statics.field861 - 1] = client.field788;
            }
            return 1;
        } else if (arg0 == 6204) {
            field860[++Statics.field861 - 1] = client.field624;
            field860[++Statics.field861 - 1] = client.field780;
            return 1;
        } else if (arg0 == 6205) {
            field860[++Statics.field861 - 1] = method4877(client.field777);
            field860[++Statics.field861 - 1] = method4877(client.field621);
            return 1;
        } else if (arg0 == 6220) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field860[++Statics.field861 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field860[++Statics.field861 - 1] = Statics.field4720;
            return 1;
        } else if (arg0 == 6223) {
            field860[++Statics.field861 - 1] = Statics.field3024;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cq.bk(ILdd;ZI)I")
    public static int method1792(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field860[++Statics.field861 - 1] = class68.method8069() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class68 var3 = class68.method263();
            if (var3 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
            } else {
                field860[++Statics.field861 - 1] = var3.field818;
                field860[++Statics.field861 - 1] = var3.field819;
                field862[++Statics.field1668 - 1] = var3.field822;
                field860[++Statics.field861 - 1] = var3.field823;
                field860[++Statics.field861 - 1] = var3.field821;
                field862[++Statics.field1668 - 1] = var3.field817;
            }
            return 1;
        } else if (arg0 == 6502) {
            class68 var4 = class68.method3198();
            if (var4 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
            } else {
                field860[++Statics.field861 - 1] = var4.field818;
                field860[++Statics.field861 - 1] = var4.field819;
                field862[++Statics.field1668 - 1] = var4.field822;
                field860[++Statics.field861 - 1] = var4.field823;
                field860[++Statics.field861 - 1] = var4.field821;
                field862[++Statics.field1668 - 1] = var4.field817;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field860[--Statics.field861];
            class68 var6 = null;
            for (int var7 = 0; var7 < class68.field813; var7++) {
                if (Statics.field812[var7].field818 == var5) {
                    var6 = Statics.field812[var7];
                    break;
                }
            }
            if (var6 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
            } else {
                field860[++Statics.field861 - 1] = var6.field818;
                field860[++Statics.field861 - 1] = var6.field819;
                field862[++Statics.field1668 - 1] = var6.field822;
                field860[++Statics.field861 - 1] = var6.field823;
                field860[++Statics.field861 - 1] = var6.field821;
                field862[++Statics.field1668 - 1] = var6.field817;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field861 -= 4;
            int var8 = field860[Statics.field861];
            boolean var9 = field860[Statics.field861 + 1] == 1;
            int var10 = field860[Statics.field861 + 2];
            boolean var11 = field860[Statics.field861 + 3] == 1;
            Statics.method5356(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field860[--Statics.field861];
            if (var12 >= 0 && var12 < class68.field813) {
                class68 var13 = Statics.field812[var12];
                field860[++Statics.field861 - 1] = var13.field818;
                field860[++Statics.field861 - 1] = var13.field819;
                field862[++Statics.field1668 - 1] = var13.field822;
                field860[++Statics.field861 - 1] = var13.field823;
                field860[++Statics.field861 - 1] = var13.field821;
                field862[++Statics.field1668 - 1] = var13.field817;
            } else {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
                field860[++Statics.field861 - 1] = 0;
                field860[++Statics.field861 - 1] = 0;
                field862[++Statics.field1668 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field660 = field860[--Statics.field861] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field861 -= 2;
            int var14 = field860[Statics.field861];
            int var15 = field860[Statics.field861 + 1];
            class202 var16 = class202.method6280(var15);
            if (var16.method3495()) {
                field862[++Statics.field1668 - 1] = class195.method7336(var14).method3376(var15, var16.field2109);
            } else {
                field860[++Statics.field861 - 1] = class195.method7336(var14).method3395(var15, var16.field2114);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field861 -= 2;
            int var17 = field860[Statics.field861];
            int var18 = field860[Statics.field861 + 1];
            class202 var19 = class202.method6280(var18);
            if (var19.method3495()) {
                field862[++Statics.field1668 - 1] = class205.method3219(var17).method3568(var18, var19.field2109);
            } else {
                field860[++Statics.field861 - 1] = class205.method3219(var17).method3585(var18, var19.field2114);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field861 -= 2;
            int var20 = field860[Statics.field861];
            int var21 = field860[Statics.field861 + 1];
            class202 var22 = class202.method6280(var21);
            if (var22.method3495()) {
                field862[++Statics.field1668 - 1] = class206.method5155(var20).method3635(var21, var22.field2109);
            } else {
                field860[++Statics.field861 - 1] = class206.method5155(var20).method3634(var21, var22.field2114);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field861 -= 2;
            int var23 = field860[Statics.field861];
            int var24 = field860[Statics.field861 + 1];
            class202 var25 = class202.method6280(var24);
            if (var25.method3495()) {
                field862[++Statics.field1668 - 1] = Statics.method2932(var23).method3517(var24, var25.field2109);
            } else {
                field860[++Statics.field861 - 1] = Statics.method2932(var23).method3516(var24, var25.field2114);
            }
            return 1;
        } else if (arg0 == 6518) {
            field860[++Statics.field861 - 1] = client.field804 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field860[++Statics.field861 - 1] = client.field510;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1668--;
            Statics.field861--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1668--;
            Statics.field861--;
            return 1;
        } else if (arg0 == 6524) {
            field860[++Statics.field861 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field860[++Statics.field861 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field860[++Statics.field861 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field860[++Statics.field861 - 1] = client.field511;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jc.bv(ILdd;ZS)I")
    public static int method4628(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1882;
            int var4 = (Statics.field971.field1163 >> 7) + Statics.field2380;
            int var5 = (Statics.field971.field1153 >> 7) + Statics.field1302;
            client.method4344().method7652(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field860[--Statics.field861];
            String var7 = "";
            class256 var8 = client.method4344().method7665(var6);
            if (var8 != null) {
                var7 = var8.method4704();
            }
            field862[++Statics.field1668 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field860[--Statics.field861];
            client.method4344().method7734(var9);
            return 1;
        } else if (arg0 == 6603) {
            field860[++Statics.field861 - 1] = client.method4344().method7669();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field860[--Statics.field861];
            client.method4344().method7671(var10);
            return 1;
        } else if (arg0 == 6605) {
            field860[++Statics.field861 - 1] = client.method4344().method7664() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class321 var11 = new class321(field860[--Statics.field861]);
            client.method4344().method7666(var11.field3517, var11.field3515);
            return 1;
        } else if (arg0 == 6607) {
            class321 var12 = new class321(field860[--Statics.field861]);
            client.method4344().method7667(var12.field3517, var12.field3515);
            return 1;
        } else if (arg0 == 6608) {
            class321 var13 = new class321(field860[--Statics.field861]);
            client.method4344().method7768(var13.field3516, var13.field3517, var13.field3515);
            return 1;
        } else if (arg0 == 6609) {
            class321 var14 = new class321(field860[--Statics.field861]);
            client.method4344().method7797(var14.field3516, var14.field3517, var14.field3515);
            return 1;
        } else if (arg0 == 6610) {
            field860[++Statics.field861 - 1] = client.method4344().method7670();
            field860[++Statics.field861 - 1] = client.method4344().method7704();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field860[--Statics.field861];
            class256 var16 = client.method4344().method7665(var15);
            if (var16 == null) {
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = var16.method4714().method5394();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field860[--Statics.field861];
            class256 var18 = client.method4344().method7665(var17);
            if (var18 == null) {
                field860[++Statics.field861 - 1] = 0;
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = (var18.method4708() - var18.method4707() + 1) * 64;
                field860[++Statics.field861 - 1] = (var18.method4721() - var18.method4706() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field860[--Statics.field861];
            class256 var20 = client.method4344().method7665(var19);
            if (var20 == null) {
                field860[++Statics.field861 - 1] = 0;
                field860[++Statics.field861 - 1] = 0;
                field860[++Statics.field861 - 1] = 0;
                field860[++Statics.field861 - 1] = 0;
            } else {
                field860[++Statics.field861 - 1] = var20.method4707() * 64;
                field860[++Statics.field861 - 1] = var20.method4706() * 64;
                field860[++Statics.field861 - 1] = var20.method4708() * 64 + 64 - 1;
                field860[++Statics.field861 - 1] = var20.method4721() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field860[--Statics.field861];
            class256 var22 = client.method4344().method7665(var21);
            if (var22 == null) {
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var22.method4748();
            }
            return 1;
        } else if (arg0 == 6615) {
            class321 var23 = client.method4344().method7672();
            if (var23 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var23.field3517;
                field860[++Statics.field861 - 1] = var23.field3515;
            }
            return 1;
        } else if (arg0 == 6616) {
            field860[++Statics.field861 - 1] = client.method4344().method7649();
            return 1;
        } else if (arg0 == 6617) {
            class321 var24 = new class321(field860[--Statics.field861]);
            class256 var25 = client.method4344().method7650();
            if (var25 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4698(var24.field3516, var24.field3517, var24.field3515);
            if (var26 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var26[0];
                field860[++Statics.field861 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class321 var27 = new class321(field860[--Statics.field861]);
            class256 var28 = client.method4344().method7650();
            if (var28 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = -1;
                return 1;
            }
            class321 var29 = var28.method4699(var27.field3517, var27.field3515);
            if (var29 == null) {
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var29.method5394();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field861 -= 2;
            int var30 = field860[Statics.field861];
            class321 var31 = new class321(field860[Statics.field861 + 1]);
            method5185(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field861 -= 2;
            int var32 = field860[Statics.field861];
            class321 var33 = new class321(field860[Statics.field861 + 1]);
            method5185(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field861 -= 2;
            int var34 = field860[Statics.field861];
            class321 var35 = new class321(field860[Statics.field861 + 1]);
            class256 var36 = client.method4344().method7665(var34);
            if (var36 == null) {
                field860[++Statics.field861 - 1] = 0;
                return 1;
            } else {
                field860[++Statics.field861 - 1] = var36.method4724(var35.field3516, var35.field3517, var35.field3515) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field860[++Statics.field861 - 1] = client.method4344().method7699();
            field860[++Statics.field861 - 1] = client.method4344().method7674();
            return 1;
        } else if (arg0 == 6623) {
            class321 var37 = new class321(field860[--Statics.field861]);
            class256 var38 = client.method4344().method7647(var37.field3516, var37.field3517, var37.field3515);
            if (var38 == null) {
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var38.method4709();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method4344().method7675(field860[--Statics.field861]);
            return 1;
        } else if (arg0 == 6625) {
            client.method4344().method7676();
            return 1;
        } else if (arg0 == 6626) {
            client.method4344().method7677(field860[--Statics.field861]);
            return 1;
        } else if (arg0 == 6627) {
            client.method4344().method7815();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field860[--Statics.field861] == 1;
            client.method4344().method7711(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field860[--Statics.field861];
            client.method4344().method7771(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field860[--Statics.field861];
            client.method4344().method7681(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method4344().method7682();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field860[--Statics.field861] == 1;
            client.method4344().method7683(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field861 -= 2;
            int var43 = field860[Statics.field861];
            boolean var44 = field860[Statics.field861 + 1] == 1;
            client.method4344().method7684(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field861 -= 2;
            int var45 = field860[Statics.field861];
            boolean var46 = field860[Statics.field861 + 1] == 1;
            client.method4344().method7668(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field860[++Statics.field861 - 1] = client.method4344().method7663() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.method4344().method7687(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field860[--Statics.field861];
            field860[++Statics.field861 - 1] = client.method4344().method7688(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field861 -= 2;
            int var49 = field860[Statics.field861];
            class321 var50 = new class321(field860[Statics.field861 + 1]);
            class321 var51 = client.method4344().method7691(var49, var50);
            if (var51 == null) {
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var51.method5394();
            }
            return 1;
        } else if (arg0 == 6639) {
            class274 var52 = client.method4344().method7693();
            if (var52 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var52.method4663();
                field860[++Statics.field861 - 1] = var52.field3039.method5394();
            }
            return 1;
        } else if (arg0 == 6640) {
            class274 var53 = client.method4344().method7694();
            if (var53 == null) {
                field860[++Statics.field861 - 1] = -1;
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var53.method4663();
                field860[++Statics.field861 - 1] = var53.field3039.method5394();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field860[--Statics.field861];
            class187 var55 = class187.method2956(var54);
            if (var55.field1914 == null) {
                field862[++Statics.field1668 - 1] = "";
            } else {
                field862[++Statics.field1668 - 1] = var55.field1914;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field860[--Statics.field861];
            class187 var57 = class187.method2956(var56);
            field860[++Statics.field861 - 1] = var57.field1916;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field860[--Statics.field861];
            class187 var59 = class187.method2956(var58);
            if (var59 == null) {
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var59.field1918;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field860[--Statics.field861];
            class187 var61 = class187.method2956(var60);
            if (var61 == null) {
                field860[++Statics.field861 - 1] = -1;
            } else {
                field860[++Statics.field861 - 1] = var61.field1912;
            }
            return 1;
        } else if (arg0 == 6697) {
            field860[++Statics.field861 - 1] = Statics.field1893.field3063;
            return 1;
        } else if (arg0 == 6698) {
            field860[++Statics.field861 - 1] = Statics.field1893.field3064.method5394();
            return 1;
        } else if (arg0 == 6699) {
            field860[++Statics.field861 - 1] = Statics.field1893.field3062.method5394();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("il.bz(ILdd;ZB)I")
    public static int method3819(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field860[--Statics.field861];
            class195 var4 = class195.method7336(var3);
            field862[++Statics.field1668 - 1] = var4 == null ? "" : var4.field1998;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field861 -= 2;
            class195 var5 = class195.method7336(field860[Statics.field861]);
            int var6 = field860[Statics.field861 + 1];
            field860[++Statics.field861 - 1] = var5.method3366(var6);
            field860[++Statics.field861 - 1] = var5.method3414(var6);
            return 1;
        } else if (arg0 == 6765) {
            class195 var7 = class195.method7336(field860[--Statics.field861]);
            field860[++Statics.field861 - 1] = var7 == null ? 0 : var7.field2025;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ls.bm(ILdd;ZB)I")
    public static int method5152(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field860[--Statics.field861];
            class205 var4 = class205.method3219(var3);
            field862[++Statics.field1668 - 1] = var4 == null ? "" : var4.field2155;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.br(ILdd;ZB)I")
    public static int method104(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("fe.bu(ILdd;ZB)I")
    public static int method2885(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("fg.by(ILdd;ZB)I")
    public static int method2854(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field860[++Statics.field861 - 1] = Statics.method5511() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.bt(ILdd;ZI)I")
    public static int method309(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("iu.bl(ILdd;ZI)I")
    public static int method4358(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field860[--Statics.field861] == 1;
            client.method7(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hd.cs(ILdd;ZI)I")
    public static int method3425(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field860[--Statics.field861];
            Object var45 = method12(var44);
            int var46 = field860[--Statics.field861];
            class495 var47 = Statics.method984(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class497.method5087(var46);
            Statics.field1738 = var47.method8023(var45, var48);
            if (Statics.field1738 == null) {
                client.field607 = -1;
                Statics.field2405 = null;
                if (arg0 == 7500) {
                    field860[++Statics.field861 - 1] = 0;
                }
            } else {
                client.field607 = class497.method2971(var46);
                Statics.field2405 = Statics.field1738.iterator();
                if (arg0 == 7500) {
                    field860[++Statics.field861 - 1] = Statics.field1738.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field2405 != null && Statics.field2405.hasNext()) {
                field860[++Statics.field861 - 1] = (Integer) Statics.field2405.next();
            } else {
                field860[++Statics.field861 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field861 -= 3;
            int var3 = field860[Statics.field861];
            int var4 = field860[Statics.field861 + 1];
            int var5 = field860[Statics.field861 + 2];
            int var6 = class497.method2971(var4);
            int var7 = class497.method7905(var4);
            int var8 = class497.method5087(var4);
            class496 var9 = class496.method7838(var3);
            class494 var10 = class494.method2969(var6);
            int[] var11 = var10.field4986[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8032(var7);
            if (var14 == null && var10.field4987 != null) {
                var14 = var10.field4987[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class491 var17 = class489.method4988(var16);
                    if (class491.field4977 == var17) {
                        field862[++Statics.field1668 - 1] = "";
                    } else {
                        field860[++Statics.field861 - 1] = Statics.method7971(var16);
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
                class491 var21 = class489.method4988(var11[var19]);
                if (class491.field4977 == var21) {
                    field862[++Statics.field1668 - 1] = (String) var14[var20];
                } else {
                    field860[++Statics.field861 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field861 -= 2;
            int var22 = field860[Statics.field861];
            int var23 = field860[Statics.field861 + 1];
            int var24 = 0;
            int var25 = class497.method2971(var23);
            int var26 = class497.method7905(var23);
            class496 var27 = class496.method7838(var22);
            class494 var28 = class494.method2969(var25);
            int[] var29 = var28.field4986[var26];
            Object[] var30 = var27.method8032(var26);
            if (var30 == null && var28.field4987 != null) {
                var30 = var28.field4987[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field860[++Statics.field861 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field861--;
            int var41 = field860[Statics.field861];
            class495 var42 = client.method2937(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1738 = var42.method8023(0, 0);
            int var43 = 0;
            if (Statics.field1738 != null) {
                client.field607 = var41;
                Statics.field2405 = Statics.field1738.iterator();
                var43 = Statics.field1738.size();
            }
            if (arg0 == 7504) {
                field860[++Statics.field861 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field860[--Statics.field861];
            class496 var32 = class496.method7838(var31);
            field860[++Statics.field861 - 1] = var32.field4996;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field860[--Statics.field861];
            int var34 = -1;
            if (Statics.field1738 != null && var33 >= 0 && var33 < Statics.field1738.size()) {
                var34 = (Integer) Statics.field1738.get(var33);
            }
            field860[++Statics.field861 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field860[--Statics.field861];
            Object var36 = method12(var35);
            int var37 = field860[--Statics.field861];
            class495 var38 = Statics.method984(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class497.method2971(var37) != client.field607) {
                throw new RuntimeException();
            } else if (Statics.field1738 == null && Statics.field1738.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class497.method5087(var37);
                List var40 = var38.method8023(var36, var39);
                Statics.field1738 = new LinkedList(Statics.field1738);
                if (var40 == null) {
                    Statics.field1738.clear();
                } else {
                    Statics.field1738.retainAll(var40);
                }
                Statics.field2405 = Statics.field1738.iterator();
                if (arg0 == 7507) {
                    field860[++Statics.field861 - 1] = Statics.field1738.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.cu(ILdd;ZB)I")
    public static int method819(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("fy.ca(IB)V")
    public static void method2967(int arg0) {
        if (arg0 == -1 || !class330.method1447(arg0)) {
            return;
        }
        class330[] var1 = Statics.field84[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class330 var3 = var1[var2];
            if (var3.field3691 != null) {
                class88 var4 = new class88();
                var4.field1061 = var3;
                var4.field1067 = var3.field3691;
                method795(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("ly.cf(ILmg;ZB)V")
    public static void method5185(int arg0, class321 arg1, boolean arg2) {
        class256 var3 = client.method4344().method7665(arg0);
        int var4 = Statics.field971.field1103;
        int var5 = (Statics.field971.field1163 >> 7) + Statics.field2380;
        int var6 = (Statics.field971.field1153 >> 7) + Statics.field1302;
        class321 var7 = new class321(var4, var5, var6);
        client.method4344().method7653(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("sw.cw(Lsw;I)Ljava/lang/Object;")
    public static Object method7995(class491 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field4978) {
            case 0:
                return field862[--Statics.field1668];
            case 1:
                return field860[--Statics.field861];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("ax.ch(II)Ljava/lang/Object;")
    public static Object method12(int arg0) {
        return method7995((class491) class371.method4632(class491.method7989(), arg0));
    }
}
