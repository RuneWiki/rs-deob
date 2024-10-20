package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ck")
public class class71 {

    @ObfuscatedName("ck.aj")
    public static int[] field869 = new int[5];

    @ObfuscatedName("ck.ag")
    public static int[][] field878 = new int[5][5000];

    @ObfuscatedName("ck.az")
    public static int[] field871 = new int[1000];

    @ObfuscatedName("ck.ap")
    public static String[] field872 = new String[1000];

    @ObfuscatedName("ck.at")
    public static int field875 = 0;

    @ObfuscatedName("ck.ah")
    public static class64[] field876 = new class64[50];

    @ObfuscatedName("ck.ad")
    public static Calendar field887 = Calendar.getInstance();

    @ObfuscatedName("ck.ao")
    public static final String[] field880 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ck.ak")
    public static boolean field879 = false;

    @ObfuscatedName("ck.an")
    public static boolean field865 = false;

    @ObfuscatedName("ck.af")
    public static ArrayList field881 = new ArrayList();

    @ObfuscatedName("ck.ai")
    public static int field882 = 0;

    @ObfuscatedName("ck.bn")
    public static final double field883 = Math.log(2.0D);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.aw(Ldi;I)V")
    public static void method1189(class88 arg0) {
        method2734(arg0, 500000, 475000);
    }

    @ObfuscatedName("es.ay(Ldi;III)V")
    public static void method2734(class88 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1076;
        class79 var5;
        if (class512.method6028(arg0.field1081)) {
            Statics.field492 = (class281) var3[0];
            class188 var4 = class188.method3780(Statics.field492.field3062);
            var5 = class79.method467(arg0.field1081, var4.field1921, var4.field1933);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class79.method1983(var6);
        }
        if (var5 != null) {
            method263(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("ad.ar(Ldi;Ldc;III)V")
    public static void method263(class88 arg0, class79 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1076;
        Statics.field867 = 0;
        Statics.field874 = 0;
        int var5 = -1;
        int[] var6 = arg1.field997;
        int[] var7 = arg1.field998;
        byte var8 = -1;
        field875 = 0;
        field879 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            Statics.field870 = new int[arg1.field1000];
            int var11 = 0;
            Statics.field868 = new String[arg1.field999];
            int var12 = 0;
            for (int var13 = 1; var13 < var4.length; var13++) {
                if (var4[var13] instanceof Integer) {
                    int var14 = (Integer) var4[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1073;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1074;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1072 == null ? -1 : arg0.field1072.field3624;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1077;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1072 == null ? -1 : arg0.field1072.field3625;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1080 == null ? -1 : arg0.field1080.field3624;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1080 == null ? -1 : arg0.field1080.field3625;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1070;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1078;
                    }
                    Statics.field870[var11++] = var14;
                } else if (var4[var13] instanceof String) {
                    String var15 = (String) var4[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1079;
                    }
                    Statics.field868[var12++] = var15;
                }
            }
            field882 = arg0.field1075;
            while (true) {
                var10++;
                if (var10 > arg2) {
                    throw new RuntimeException();
                }
                var5++;
                int var59 = var6[var5];
                if (var59 >= 100) {
                    boolean var46;
                    if (arg1.field998[var5] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    int var47 = method2959(var59, arg1, var46);
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
                    field871[++Statics.field867 - 1] = var7[var5];
                } else if (var59 == 1) {
                    int var16 = var7[var5];
                    field871[++Statics.field867 - 1] = class323.field3532[var16];
                } else if (var59 == 2) {
                    int var17 = var7[var5];
                    class323.field3532[var17] = field871[--Statics.field867];
                    client.method1992(var17);
                } else if (var59 == 3) {
                    field872[++Statics.field874 - 1] = arg1.field995[var5];
                } else if (var59 == 6) {
                    var5 += var7[var5];
                } else if (var59 == 7) {
                    Statics.field867 -= 2;
                    if (field871[Statics.field867] != field871[Statics.field867 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 8) {
                    Statics.field867 -= 2;
                    if (field871[Statics.field867] == field871[Statics.field867 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 9) {
                    Statics.field867 -= 2;
                    if (field871[Statics.field867] < field871[Statics.field867 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 10) {
                    Statics.field867 -= 2;
                    if (field871[Statics.field867] > field871[Statics.field867 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 21) {
                    if (field875 == 0) {
                        return;
                    }
                    class64 var19 = field876[--field875];
                    arg1 = var19.field491;
                    var6 = arg1.field997;
                    var7 = arg1.field998;
                    var5 = var19.field489;
                    Statics.field870 = var19.field490;
                    Statics.field868 = var19.field488;
                } else if (var59 == 25) {
                    int var20 = var7[var5];
                    field871[++Statics.field867 - 1] = class323.method4655(var20);
                } else if (var59 == 27) {
                    int var21 = var7[var5];
                    class323.method3114(var21, field871[--Statics.field867]);
                } else if (var59 == 31) {
                    Statics.field867 -= 2;
                    if (field871[Statics.field867] <= field871[Statics.field867 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 32) {
                    Statics.field867 -= 2;
                    if (field871[Statics.field867] >= field871[Statics.field867 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 33) {
                    field871[++Statics.field867 - 1] = Statics.field870[var7[var5]];
                } else if (var59 == 34) {
                    Statics.field870[var7[var5]] = field871[--Statics.field867];
                } else if (var59 == 35) {
                    field872[++Statics.field874 - 1] = Statics.field868[var7[var5]];
                } else if (var59 == 36) {
                    Statics.field868[var7[var5]] = field872[--Statics.field874];
                } else if (var59 == 37) {
                    int var22 = var7[var5];
                    Statics.field874 -= var22;
                    String var23 = class388.method2997(field872, Statics.field874, var22);
                    field872[++Statics.field874 - 1] = var23;
                } else if (var59 == 38) {
                    Statics.field867--;
                } else if (var59 == 39) {
                    Statics.field874--;
                } else if (var59 == 40) {
                    int var24 = var7[var5];
                    class79 var25 = class79.method1983(var24);
                    int[] var26 = new int[var25.field1000];
                    String[] var27 = new String[var25.field999];
                    for (int var28 = 0; var28 < var25.field996; var28++) {
                        var26[var28] = field871[Statics.field867 - var25.field996 + var28];
                    }
                    for (int var29 = 0; var29 < var25.field1001; var29++) {
                        var27[var29] = field872[Statics.field874 - var25.field1001 + var29];
                    }
                    Statics.field867 -= var25.field996;
                    Statics.field874 -= var25.field1001;
                    class64 var30 = new class64();
                    var30.field491 = arg1;
                    var30.field489 = var5;
                    var30.field490 = Statics.field870;
                    var30.field488 = Statics.field868;
                    field876[++field875 - 1] = var30;
                    arg1 = var25;
                    var6 = var25.field997;
                    var7 = var25.field998;
                    var5 = -1;
                    Statics.field870 = var26;
                    Statics.field868 = var27;
                } else if (var59 == 42) {
                    field871[++Statics.field867 - 1] = Statics.field1181.method2602(var7[var5]);
                } else if (var59 == 43) {
                    Statics.field1181.method2610(var7[var5], field871[--Statics.field867]);
                } else if (var59 == 44) {
                    int var31 = var7[var5] >> 16;
                    int var32 = var7[var5] & 0xFFFF;
                    int var33 = field871[--Statics.field867];
                    if (var33 < 0 || var33 > 5000) {
                        throw new RuntimeException();
                    }
                    field869[var31] = var33;
                    byte var34 = -1;
                    if (var32 == 105) {
                        var34 = 0;
                    }
                    for (int var35 = 0; var35 < var33; var35++) {
                        field878[var31][var35] = var34;
                    }
                } else if (var59 == 45) {
                    int var36 = var7[var5];
                    int var37 = field871[--Statics.field867];
                    if (var37 < 0 || var37 >= field869[var36]) {
                        throw new RuntimeException();
                    }
                    field871[++Statics.field867 - 1] = field878[var36][var37];
                } else if (var59 == 46) {
                    int var38 = var7[var5];
                    Statics.field867 -= 2;
                    int var39 = field871[Statics.field867];
                    if (var39 < 0 || var39 >= field869[var38]) {
                        throw new RuntimeException();
                    }
                    field878[var38][var39] = field871[Statics.field867 + 1];
                } else if (var59 == 47) {
                    String var40 = Statics.field1181.method2584(var7[var5]);
                    if (var40 == null) {
                        var40 = class353.field3906;
                    }
                    field872[++Statics.field874 - 1] = var40;
                } else if (var59 == 48) {
                    Statics.field1181.method2626(var7[var5], field872[--Statics.field874]);
                } else if (var59 == 49) {
                    String var41 = Statics.field1181.method2587(var7[var5]);
                    field872[++Statics.field874 - 1] = var41;
                } else if (var59 == 50) {
                    Statics.field1181.method2582(var7[var5], field872[--Statics.field874]);
                } else if (var59 == 60) {
                    class489 var42 = arg1.field1002[var7[var5]];
                    class473 var43 = (class473) var42.method7961((long) field871[--Statics.field867]);
                    if (var43 != null) {
                        var5 += var43.field4817;
                    }
                } else if (var59 == 74) {
                    Integer var44 = Statics.field3213.method3003(var7[var5]);
                    if (var44 == null) {
                        field871[++Statics.field867 - 1] = -1;
                    } else {
                        field871[++Statics.field867 - 1] = var44;
                    }
                } else if (var59 == 76) {
                    Integer var45 = Statics.field1601.method7586(var7[var5]);
                    if (var45 == null) {
                        field871[++Statics.field867 - 1] = -1;
                    } else {
                        field871[++Statics.field867 - 1] = var45;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var57) {
            var9 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(arg1.field4819).append(" ");
            for (int var51 = field875 - 1; var51 >= 0; var51--) {
                var50.append("").append(field876[var51].field491.field4819).append(" ");
            }
            var50.append("").append(var8);
            class541.method5458(var50.toString(), var57);
        } finally {
            while (field881.size() > 0) {
                class103 var54 = (class103) field881.remove(0);
                client.method7371(var54.method2528(), var54.method2529(), var54.method2530(), var54.method2532(), "");
            }
            if (field879) {
                field879 = false;
                client.method6602();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class541.method5458("Warning: Script " + arg1.field994 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("fh.am(ILdc;ZB)I")
    public static int method2959(int arg0, class79 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method5187(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2773(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2058(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method1125(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method76(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method290(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method77(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method7115(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method2258(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method4681(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method5473(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2773(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2058(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method1125(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method76(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method290(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3313(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method851(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method3103(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2312(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method5473(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method71(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method4550(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method1176(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method4019(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method7654(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return Statics.method2259(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method1982(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method6025(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method4383(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method2202(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return Statics.method1843(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method6018(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method5998(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method2706(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method5027(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method3867(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method1177(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3119(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method5026(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method1179(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return Statics.method160(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method2200(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method3071(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method3916(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method440(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return Statics.method267(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method5104(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method1993(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lt.as(ILdc;ZI)I")
    public static int method5187(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field867 -= 3;
            int var3 = field871[Statics.field867];
            int var4 = field871[Statics.field867 + 1];
            int var5 = field871[Statics.field867 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class333 var6 = class333.method3491(var3);
            if (var6.field3761 == null) {
                var6.field3761 = new class333[var5 + 1];
            }
            if (var6.field3761.length <= var5) {
                class333[] var7 = new class333[var5 + 1];
                for (int var8 = 0; var8 < var6.field3761.length; var8++) {
                    var7[var8] = var6.field3761[var8];
                }
                var6.field3761 = var7;
            }
            if (var5 > 0 && var6.field3761[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class333 var9 = new class333();
            var9.field3626 = var4;
            var9.field3643 = var9.field3624 = var6.field3624;
            var9.field3625 = var5;
            var9.field3623 = true;
            if (var4 == 12) {
                var9.method5853();
                var9.method5902().method5605(new class106(var9));
                var9.method5902().method5625(new class107(var9));
            }
            var6.field3761[var5] = var9;
            if (arg2) {
                Statics.field260 = var9;
            } else {
                Statics.field3897 = var9;
            }
            client.method3478(var6);
            return 1;
        } else if (arg0 == 101) {
            class333 var10 = arg2 ? Statics.field260 : Statics.field3897;
            class333 var11 = class333.method3491(var10.field3624);
            var11.field3761[var10.field3625] = null;
            client.method3478(var11);
            return 1;
        } else if (arg0 == 102) {
            class333 var12 = class333.method3491(field871[--Statics.field867]);
            var12.field3761 = null;
            client.method3478(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field867 -= 2;
            int var13 = field871[Statics.field867];
            int var14 = field871[Statics.field867 + 1];
            class333 var15 = class333.method2199(var13, var14);
            if (var15 == null || var14 == -1) {
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = 1;
                if (arg2) {
                    Statics.field260 = var15;
                } else {
                    Statics.field3897 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class333 var16 = class333.method3491(field871[--Statics.field867]);
            if (var16 == null) {
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = 1;
                if (arg2) {
                    Statics.field260 = var16;
                } else {
                    Statics.field3897 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ed.aj(ILdc;ZB)I")
    public static int method2773(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class333 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field871[--Statics.field867];
            var4 = class333.method3491(var3);
        } else {
            var4 = arg2 ? Statics.field260 : Statics.field3897;
        }
        if (arg0 == 1000) {
            Statics.field867 -= 4;
            var4.field3633 = field871[Statics.field867];
            var4.field3634 = field871[Statics.field867 + 1];
            var4.field3718 = field871[Statics.field867 + 2];
            var4.field3630 = field871[Statics.field867 + 3];
            client.method3478(var4);
            Statics.field1352.method1218(var4);
            if (var3 != -1 && var4.field3626 == 0) {
                Statics.method838(Statics.field1046[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field867 -= 4;
            var4.field3750 = field871[Statics.field867];
            var4.field3758 = field871[Statics.field867 + 1];
            var4.field3610 = field871[Statics.field867 + 2];
            var4.field3632 = field871[Statics.field867 + 3];
            client.method3478(var4);
            Statics.field1352.method1218(var4);
            if (var3 != -1 && var4.field3626 == 0) {
                Statics.method838(Statics.field1046[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field871[--Statics.field867] == 1;
            if (var4.field3644 != var5) {
                var4.field3644 = var5;
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3771 = field871[--Statics.field867] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3772 = field871[--Statics.field867] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.ag(ILdc;ZB)I")
    public static int method2058(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class333 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field871[--Statics.field867];
            var4 = class333.method3491(var3);
        } else {
            var4 = arg2 ? Statics.field260 : Statics.field3897;
        }
        if (arg0 == 1100) {
            Statics.field867 -= 2;
            int var5 = field871[Statics.field867];
            int var6 = field871[Statics.field867 + 1];
            if (var4.field3626 == 12) {
                class331 var7 = var4.method5902();
                if (var7 != null && var7.method5606(var5, var6)) {
                    client.method3478(var4);
                }
            } else {
                var4.field3645 = var5;
                if (var4.field3645 > var4.field3647 - var4.field3616) {
                    var4.field3645 = var4.field3647 - var4.field3616;
                }
                if (var4.field3645 < 0) {
                    var4.field3645 = 0;
                }
                var4.field3646 = var6;
                if (var4.field3646 > var4.field3737 - var4.field3640) {
                    var4.field3646 = var4.field3737 - var4.field3640;
                }
                if (var4.field3646 < 0) {
                    var4.field3646 = 0;
                }
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3736 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3739 = field871[--Statics.field867] == 1;
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3655 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3657 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3659 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3662 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3663 = field871[--Statics.field867] == 1;
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3668 = 1;
            var4.field3621 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field867 -= 6;
            var4.field3674 = field871[Statics.field867];
            var4.field3675 = field871[Statics.field867 + 1];
            var4.field3664 = field871[Statics.field867 + 2];
            var4.field3677 = field871[Statics.field867 + 3];
            var4.field3768 = field871[Statics.field867 + 4];
            var4.field3679 = field871[Statics.field867 + 5];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field871[--Statics.field867];
            if (var4.field3672 != var8) {
                var4.field3672 = var8;
                var4.field3759 = 0;
                var4.field3760 = 0;
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3683 = field871[--Statics.field867] == 1;
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field872[--Statics.field874];
            if (!var9.equals(var4.field3639)) {
                var4.field3639 = var9;
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3608 = field871[--Statics.field867];
            if (var4.field3626 == 12) {
                class331 var10 = var4.method5902();
                if (var10 != null) {
                    var10.method5574();
                }
            }
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field867 -= 3;
            if (var4.field3626 == 12) {
                class331 var11 = var4.method5902();
                if (var11 != null) {
                    var11.method5568(field871[Statics.field867], field871[Statics.field867 + 1]);
                    var11.method5708(field871[Statics.field867 + 2]);
                }
            } else {
                var4.field3690 = field871[Statics.field867];
                var4.field3691 = field871[Statics.field867 + 1];
                var4.field3689 = field871[Statics.field867 + 2];
            }
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3706 = field871[--Statics.field867] == 1;
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3714 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3727 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3666 = field871[--Statics.field867] == 1;
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3667 = field871[--Statics.field867] == 1;
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field867 -= 2;
            var4.field3647 = field871[Statics.field867];
            var4.field3737 = field871[Statics.field867 + 1];
            client.method3478(var4);
            if (var3 != -1 && var4.field3626 == 0) {
                Statics.method838(Statics.field1046[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method4795(var4.field3624, var4.field3625);
            client.field690 = var4;
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3660 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3650 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3656 = field871[--Statics.field867];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var12 = field871[--Statics.field867];
            class526 var13 = (class526) class374.method2465(class526.method3923(), var12);
            if (var13 != null) {
                var4.field3654 = var13;
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var14 = field871[--Statics.field867] == 1;
            var4.field3726 = var14;
            return 1;
        } else if (arg0 == 1127) {
            boolean var15 = field871[--Statics.field867] == 1;
            var4.field3684 = var15;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3661 = field872[--Statics.field874];
            client.method3478(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5916(field872[--Statics.field874], Statics.field3013, client.method2268());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field867 -= 2;
            var4.method5854(field871[Statics.field867], field871[Statics.field867 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5855(field872[--Statics.field874], field871[--Statics.field867]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field867--;
            class326 var16 = var4.method5867();
            if (var16 != null) {
                var16.field3540 = field871[Statics.field867];
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field867--;
            class326 var17 = var4.method5867();
            if (var17 != null) {
                var17.field3541 = field871[Statics.field867];
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field874--;
            class331 var18 = var4.method5902();
            if (var18 != null) {
                var4.field3688 = field872[Statics.field874];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field867--;
            class326 var19 = var4.method5867();
            if (var19 != null) {
                var19.field3542 = field871[Statics.field867];
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field867--;
            class331 var20 = var4.method5902();
            if (var20 != null && var20.method5729(field871[Statics.field867])) {
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field867--;
            class331 var21 = var4.method5902();
            if (var21 != null && var21.method5565(field871[Statics.field867])) {
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field867--;
            class331 var22 = var4.method5902();
            if (var22 != null && var22.method5566(field871[Statics.field867])) {
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var23 = field871[--Statics.field867] == 1;
            client.field613.method3783();
            class331 var24 = var4.method5902();
            if (var24 != null && var24.method5558(var23)) {
                if (var23) {
                    client.field613.method3786(var4);
                }
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var25 = field871[--Statics.field867] == 1;
            if (!var25 && client.field613.method3782() == var4) {
                client.field613.method3783();
                client.method3478(var4);
            }
            class331 var26 = var4.method5902();
            if (var26 != null) {
                var26.method5559(var25);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field867 -= 2;
            class331 var27 = var4.method5902();
            if (var27 != null && var27.method5582(field871[Statics.field867], field871[Statics.field867 + 1])) {
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field867--;
            class331 var28 = var4.method5902();
            if (var28 != null && var28.method5582(field871[Statics.field867], field871[Statics.field867])) {
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field867--;
            class331 var29 = var4.method5902();
            if (var29 != null) {
                var29.method5571(field871[Statics.field867]);
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field867--;
            class331 var30 = var4.method5902();
            if (var30 != null) {
                var30.method5748(field871[Statics.field867]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field867--;
            class331 var31 = var4.method5902();
            if (var31 != null) {
                var31.method5573(field871[Statics.field867]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field867--;
            class331 var32 = var4.method5902();
            if (var32 != null) {
                var32.method5675(field871[Statics.field867]);
                client.method3478(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field867 -= 2;
            class28 var33 = var4.method5861();
            if (var33 != null) {
                var33.method382(field871[Statics.field867], field871[Statics.field867 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field867 -= 2;
            class28 var34 = var4.method5861();
            if (var34 != null) {
                var34.method383((char) field871[Statics.field867], field871[Statics.field867 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method5852(field872[--Statics.field874], Statics.field3013);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ce.az(ILdc;ZI)I")
    public static int method1125(int arg0, class79 arg1, boolean arg2) {
        class333 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class333.method3491(field871[--Statics.field867]);
        } else {
            var3 = arg2 ? Statics.field260 : Statics.field3897;
        }
        client.method3478(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field867 -= 2;
            int var9 = field871[Statics.field867];
            int var10 = field871[Statics.field867 + 1];
            var3.field3757 = var9;
            var3.field3648 = var10;
            class208 var11 = class208.method2788(var9);
            var3.field3664 = var11.field2200;
            var3.field3677 = var11.field2190;
            var3.field3768 = var11.field2202;
            var3.field3674 = var11.field2203;
            var3.field3675 = var11.field2201;
            var3.field3679 = var11.field2199;
            if (arg0 == 1205) {
                var3.field3685 = 0;
            } else if (arg0 == 1212 | var11.field2205 == 1) {
                var3.field3685 = 1;
            } else {
                var3.field3685 = 2;
            }
            if (var3.field3680 > 0) {
                var3.field3679 = var3.field3679 * 32 / var3.field3680;
            } else if (var3.field3750 > 0) {
                var3.field3679 = var3.field3679 * 32 / var3.field3750;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3668 = 2;
            var3.field3621 = field871[--Statics.field867];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3668 = 3;
            var3.field3621 = Statics.field1605.field1139.method5525();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field871[--Statics.field867] == 1;
            class333.method4957(var3, Statics.field1605.field1139, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field871[--Statics.field867];
            if (var3.field3682 == null) {
                throw new RuntimeException("");
            }
            class333.method2759(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field867 -= 2;
            int var6 = field871[Statics.field867];
            int var7 = field871[Statics.field867 + 1];
            if (var3.field3682 == null) {
                throw new RuntimeException("");
            }
            class333.method5430(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field871[--Statics.field867];
            if (var3.field3682 == null) {
                throw new RuntimeException("");
            }
            class333.method3218(var3, Statics.field1605.field1139.field3564, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.av(ILdc;ZI)I")
    public static int method76(int arg0, class79 arg1, boolean arg2) {
        boolean var3 = true;
        class333 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class333.method3491(field871[--Statics.field867]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field260 : Statics.field3897;
        }
        if (arg0 == 1300) {
            int var5 = field871[--Statics.field867] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5848(var5, field872[--Statics.field874]);
                return 1;
            } else {
                Statics.field874--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field867 -= 2;
            int var6 = field871[Statics.field867];
            int var7 = field871[Statics.field867 + 1];
            var4.field3732 = class333.method2199(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3709 = field871[--Statics.field867] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3669 = field871[--Statics.field867];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3708 = field871[--Statics.field867];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3704 = field872[--Statics.field874];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3710 = field872[--Statics.field874];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3665 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3773 = field871[--Statics.field867] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field867--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field867 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field871[Statics.field867 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field871[Statics.field867 + var10];
                        var9[var10 / 2] = (byte) field871[Statics.field867 + var10 + 1];
                    }
                }
            } else {
                Statics.field867 -= 2;
                var8 = new byte[] { (byte) field871[Statics.field867] };
                var9 = new byte[] { (byte) field871[Statics.field867 + 1] };
            }
            int var11 = field871[--Statics.field867] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method6949(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field867 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field871[Statics.field867] };
            byte[] var14 = new byte[] { (byte) field871[Statics.field867 + 1] };
            method6949(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field867 -= 3;
            int var15 = field871[Statics.field867] - 1;
            int var16 = field871[Statics.field867 + 1];
            int var17 = field871[Statics.field867 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method3249(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field871[--Statics.field867];
            int var20 = field871[--Statics.field867];
            method3249(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field867--;
            int var21 = field871[Statics.field867] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method1991(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method1991(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pe.ap(Lmt;I[B[BS)V")
    public static final void method6949(class333 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3712 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3712 = new byte[11][];
            arg0.field3701 = new byte[11][];
            arg0.field3658 = new int[11];
            arg0.field3631 = new int[11];
        }
        arg0.field3712[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3699 = false;
            for (int var4 = 0; var4 < arg0.field3712.length; var4++) {
                if (arg0.field3712[var4] != null) {
                    arg0.field3699 = true;
                    break;
                }
            }
        } else {
            arg0.field3699 = true;
        }
        arg0.field3701[arg1] = arg3;
    }

    @ObfuscatedName("hf.aq(Lmt;IIIB)V")
    public static final void method3249(class333 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3658 == null) {
            throw new RuntimeException();
        }
        arg0.field3658[arg1] = arg2;
        arg0.field3631[arg1] = arg3;
    }

    @ObfuscatedName("cl.at(Lmt;II)V")
    public static final void method1991(class333 arg0, int arg1) {
        if (arg0.field3712 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3770 == null) {
            arg0.field3770 = new int[arg0.field3712.length];
        }
        arg0.field3770[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ac.ah(ILdc;ZI)I")
    public static int method290(int arg0, class79 arg1, boolean arg2) {
        class333 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class333.method3491(field871[--Statics.field867]);
        } else {
            var3 = arg2 ? Statics.field260 : Statics.field3897;
        }
        String var4 = field872[--Statics.field874];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field871[--Statics.field867];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field871[--Statics.field867];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field872[--Statics.field874];
            } else {
                var7[var8] = Integer.valueOf(field871[--Statics.field867]);
            }
        }
        int var9 = field871[--Statics.field867];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3713 = var7;
        } else if (arg0 == 1401) {
            var3.field3716 = var7;
        } else if (arg0 == 1402) {
            var3.field3715 = var7;
        } else if (arg0 == 1403) {
            var3.field3717 = var7;
        } else if (arg0 == 1404) {
            var3.field3719 = var7;
        } else if (arg0 == 1405) {
            var3.field3720 = var7;
        } else if (arg0 == 1406) {
            var3.field3724 = var7;
        } else if (arg0 == 1407) {
            var3.field3686 = var7;
            var3.field3725 = var5;
        } else if (arg0 == 1408) {
            var3.field3705 = var7;
        } else if (arg0 == 1409) {
            var3.field3731 = var7;
        } else if (arg0 == 1410) {
            var3.field3721 = var7;
        } else if (arg0 == 1411) {
            var3.field3711 = var7;
        } else if (arg0 == 1412) {
            var3.field3678 = var7;
        } else if (arg0 == 1414) {
            var3.field3703 = var7;
            var3.field3722 = var5;
        } else if (arg0 == 1415) {
            var3.field3728 = var7;
            var3.field3729 = var5;
        } else if (arg0 == 1416) {
            var3.field3734 = var7;
        } else if (arg0 == 1417) {
            var3.field3733 = var7;
        } else if (arg0 == 1418) {
            var3.field3769 = var7;
        } else if (arg0 == 1419) {
            var3.field3735 = var7;
        } else if (arg0 == 1420) {
            var3.field3738 = var7;
        } else if (arg0 == 1421) {
            var3.field3641 = var7;
        } else if (arg0 == 1422) {
            var3.field3742 = var7;
        } else if (arg0 == 1423) {
            var3.field3743 = var7;
        } else if (arg0 == 1424) {
            var3.field3744 = var7;
        } else if (arg0 == 1425) {
            var3.field3653 = var7;
        } else if (arg0 == 1426) {
            var3.field3747 = var7;
        } else if (arg0 == 1427) {
            var3.field3615 = var7;
        } else if (arg0 == 1428) {
            var3.field3740 = var7;
        } else if (arg0 == 1429) {
            var3.field3741 = var7;
        } else if (arg0 == 1430) {
            var3.field3619 = var7;
        } else if (arg0 == 1431) {
            var3.field3636 = var7;
        } else if (arg0 == 1434) {
            var3.field3748 = var7;
        } else if (arg0 == 1435) {
            var3.field3629 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class329 var10 = var3.method5869();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3558 = var7;
                } else if (arg0 == 1437) {
                    var10.field3557 = var7;
                } else if (arg0 == 1438) {
                    var10.field3555 = var7;
                } else if (arg0 == 1439) {
                    var10.field3554 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3765 = true;
        return 1;
    }

    @ObfuscatedName("aq.ax(ILdc;ZI)I")
    public static int method77(int arg0, class79 arg1, boolean arg2) {
        class333 var3 = arg2 ? Statics.field260 : Statics.field3897;
        if (arg0 == 1500) {
            field871[++Statics.field867 - 1] = var3.field3637;
            return 1;
        } else if (arg0 == 1501) {
            field871[++Statics.field867 - 1] = var3.field3638;
            return 1;
        } else if (arg0 == 1502) {
            field871[++Statics.field867 - 1] = var3.field3616;
            return 1;
        } else if (arg0 == 1503) {
            field871[++Statics.field867 - 1] = var3.field3640;
            return 1;
        } else if (arg0 == 1504) {
            field871[++Statics.field867 - 1] = var3.field3644 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field871[++Statics.field867 - 1] = var3.field3643;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qo.aa(ILdc;ZB)I")
    public static int method7115(int arg0, class79 arg1, boolean arg2) {
        class333 var3 = arg2 ? Statics.field260 : Statics.field3897;
        if (arg0 == 1600) {
            field871[++Statics.field867 - 1] = var3.field3645;
            return 1;
        } else if (arg0 == 1601) {
            field871[++Statics.field867 - 1] = var3.field3646;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3626 == 12) {
                class331 var4 = var3.method5902();
                if (var4 != null) {
                    field872[++Statics.field874 - 1] = var4.method5662().method6708();
                    return 1;
                }
            }
            field872[++Statics.field874 - 1] = var3.field3639;
            return 1;
        } else if (arg0 == 1603) {
            field871[++Statics.field867 - 1] = var3.field3647;
            return 1;
        } else if (arg0 == 1604) {
            field871[++Statics.field867 - 1] = var3.field3737;
            return 1;
        } else if (arg0 == 1605) {
            field871[++Statics.field867 - 1] = var3.field3679;
            return 1;
        } else if (arg0 == 1606) {
            field871[++Statics.field867 - 1] = var3.field3664;
            return 1;
        } else if (arg0 == 1607) {
            field871[++Statics.field867 - 1] = var3.field3768;
            return 1;
        } else if (arg0 == 1608) {
            field871[++Statics.field867 - 1] = var3.field3677;
            return 1;
        } else if (arg0 == 1609) {
            field871[++Statics.field867 - 1] = var3.field3655;
            return 1;
        } else if (arg0 == 1610) {
            field871[++Statics.field867 - 1] = var3.field3656;
            return 1;
        } else if (arg0 == 1611) {
            field871[++Statics.field867 - 1] = var3.field3736;
            return 1;
        } else if (arg0 == 1612) {
            field871[++Statics.field867 - 1] = var3.field3650;
            return 1;
        } else if (arg0 == 1613) {
            field871[++Statics.field867 - 1] = var3.field3654.method36();
            return 1;
        } else if (arg0 == 1614) {
            field871[++Statics.field867 - 1] = var3.field3684 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class326 var5 = var3.method5867();
                field871[++Statics.field867 - 1] = var5 == null ? 0 : var5.field3540;
            }
            if (arg0 == 1618) {
                class326 var6 = var3.method5867();
                field871[++Statics.field867 - 1] = var6 == null ? 0 : var6.field3541;
                return 1;
            } else if (arg0 == 1619) {
                class331 var7 = var3.method5902();
                field872[++Statics.field874 - 1] = var7 == null ? "" : var7.method5813().method6708();
                return 1;
            } else if (arg0 == 1620) {
                class326 var8 = var3.method5867();
                field871[++Statics.field867 - 1] = var8 == null ? 0 : var8.field3542;
                return 1;
            } else if (arg0 == 1621) {
                class331 var9 = var3.method5902();
                field871[++Statics.field867 - 1] = var9 == null ? 0 : var9.method5617();
                return 1;
            } else if (arg0 == 1622) {
                class331 var10 = var3.method5902();
                field871[++Statics.field867 - 1] = var10 == null ? 0 : var10.method5618();
                return 1;
            } else if (arg0 == 1623) {
                class331 var11 = var3.method5902();
                field871[++Statics.field867 - 1] = var11 == null ? 0 : var11.method5619();
                return 1;
            } else if (arg0 == 1624) {
                class331 var12 = var3.method5902();
                field871[++Statics.field867 - 1] = var12 != null && var12.method5609() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class331 var13 = var3.method5902();
                field871[++Statics.field867 - 1] = var13 != null && var13.method5610() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class331 var14 = var3.method5902();
                field872[++Statics.field874 - 1] = var14 == null ? "" : var14.method5608().method6914();
                return 1;
            } else if (arg0 == 1627) {
                class331 var15 = var3.method5902();
                int var16 = var15 == null ? 0 : var15.method5613();
                int var17 = var15 == null ? 0 : var15.method5612();
                field871[++Statics.field867 - 1] = Math.min(var16, var17);
                field871[++Statics.field867 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class331 var18 = var3.method5902();
                field871[++Statics.field867 - 1] = var18 == null ? 0 : var18.method5612();
                return 1;
            } else if (arg0 == 1629) {
                class331 var19 = var3.method5902();
                field871[++Statics.field867 - 1] = var19 == null ? 0 : var19.method5621();
                return 1;
            } else if (arg0 == 1630) {
                class331 var20 = var3.method5902();
                field871[++Statics.field867 - 1] = var20 == null ? 0 : var20.method5602();
                return 1;
            } else if (arg0 == 1631) {
                class331 var21 = var3.method5902();
                field871[++Statics.field867 - 1] = var21 == null ? 0 : var21.method5709();
                return 1;
            } else if (arg0 == 1632) {
                class331 var22 = var3.method5902();
                field871[++Statics.field867 - 1] = var22 == null ? 0 : var22.method5698();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method5861();
                field871[Statics.field867 - 1] = var23 == null ? 0 : var23.method384(field871[Statics.field867 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method5861();
                field871[Statics.field867 - 1] = var24 == null ? 0 : var24.method381((char) field871[Statics.field867 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("df.au(ILdc;ZI)I")
    public static int method2258(int arg0, class79 arg1, boolean arg2) {
        class333 var3 = arg2 ? Statics.field260 : Statics.field3897;
        if (arg0 == 1700) {
            field871[++Statics.field867 - 1] = var3.field3757;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3757 == -1) {
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = var3.field3648;
            }
            return 1;
        } else if (arg0 == 1702) {
            field871[++Statics.field867 - 1] = var3.field3625;
            return 1;
        } else if (arg0 == 1707) {
            field871[++Statics.field867 - 1] = var3.method5857() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method1998(var3);
        } else if (arg0 == 1709) {
            return method2895(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.ae(Lmt;I)I")
    public static int method1998(class333 arg0) {
        if (arg0.field3626 == 11) {
            String var1 = field872[--Statics.field874];
            field871[++Statics.field867 - 1] = arg0.method5858(var1);
            return 1;
        } else {
            Statics.field874--;
            field871[++Statics.field867 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("fq.ab(Lmt;I)I")
    public static int method2895(class333 arg0) {
        if (arg0.field3626 == 11) {
            String var1 = field872[--Statics.field874];
            field872[++Statics.field874 - 1] = arg0.method5859(var1);
            return 1;
        } else {
            field872[Statics.field874 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("jg.ad(ILdc;ZI)I")
    public static int method4681(int arg0, class79 arg1, boolean arg2) {
        class333 var3 = arg2 ? Statics.field260 : Statics.field3897;
        if (arg0 == 1800) {
            field871[++Statics.field867 - 1] = class334.method5039(client.method2735(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field871[--Statics.field867];
            int var5 = var4 - 1;
            if (var3.field3665 == null || var5 >= var3.field3665.length || var3.field3665[var5] == null) {
                field872[++Statics.field874 - 1] = "";
            } else {
                field872[++Statics.field874 - 1] = var3.field3665[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3704 == null) {
                field872[++Statics.field874 - 1] = "";
            } else {
                field872[++Statics.field874 - 1] = var3.field3704;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mx.ao(ILdc;ZI)I")
    public static int method5473(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field882 >= 10) {
                throw new RuntimeException();
            }
            class333 var10;
            if (arg0 >= 2000) {
                var10 = class333.method3491(field871[--Statics.field867]);
            } else {
                var10 = arg2 ? Statics.field260 : Statics.field3897;
            }
            if (var10.field3615 == null) {
                return 0;
            }
            class88 var11 = new class88();
            var11.field1072 = var10;
            var11.field1076 = var10.field3615;
            var11.field1075 = field882 + 1;
            client.field728.method6367(var11);
            return 1;
        } else if (arg0 == 1928) {
            class333 var3 = arg2 ? Statics.field260 : Statics.field3897;
            int var4 = field871[--Statics.field867];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class103 var5 = new class103(var4, var3.field3624, var3.field3625, var3.field3757);
            field881.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field867 -= 3;
            int var6 = field871[Statics.field867];
            int var7 = field871[Statics.field867 + 1];
            int var8 = field871[Statics.field867 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class103 var9 = new class103(var8, var6, var7, class333.method3491(var6).field3757);
            field881.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("he.ac(ILdc;ZI)I")
    public static int method3313(int arg0, class79 arg1, boolean arg2) {
        class333 var3 = class333.method3491(field871[--Statics.field867]);
        if (arg0 == 2500) {
            field871[++Statics.field867 - 1] = var3.field3637;
            return 1;
        } else if (arg0 == 2501) {
            field871[++Statics.field867 - 1] = var3.field3638;
            return 1;
        } else if (arg0 == 2502) {
            field871[++Statics.field867 - 1] = var3.field3616;
            return 1;
        } else if (arg0 == 2503) {
            field871[++Statics.field867 - 1] = var3.field3640;
            return 1;
        } else if (arg0 == 2504) {
            field871[++Statics.field867 - 1] = var3.field3644 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field871[++Statics.field867 - 1] = var3.field3643;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.ak(ILdc;ZI)I")
    public static int method851(int arg0, class79 arg1, boolean arg2) {
        class333 var3 = class333.method3491(field871[--Statics.field867]);
        if (arg0 == 2600) {
            field871[++Statics.field867 - 1] = var3.field3645;
            return 1;
        } else if (arg0 == 2601) {
            field871[++Statics.field867 - 1] = var3.field3646;
            return 1;
        } else if (arg0 == 2602) {
            field872[++Statics.field874 - 1] = var3.field3639;
            return 1;
        } else if (arg0 == 2603) {
            field871[++Statics.field867 - 1] = var3.field3647;
            return 1;
        } else if (arg0 == 2604) {
            field871[++Statics.field867 - 1] = var3.field3737;
            return 1;
        } else if (arg0 == 2605) {
            field871[++Statics.field867 - 1] = var3.field3679;
            return 1;
        } else if (arg0 == 2606) {
            field871[++Statics.field867 - 1] = var3.field3664;
            return 1;
        } else if (arg0 == 2607) {
            field871[++Statics.field867 - 1] = var3.field3768;
            return 1;
        } else if (arg0 == 2608) {
            field871[++Statics.field867 - 1] = var3.field3677;
            return 1;
        } else if (arg0 == 2609) {
            field871[++Statics.field867 - 1] = var3.field3655;
            return 1;
        } else if (arg0 == 2610) {
            field871[++Statics.field867 - 1] = var3.field3656;
            return 1;
        } else if (arg0 == 2611) {
            field871[++Statics.field867 - 1] = var3.field3736;
            return 1;
        } else if (arg0 == 2612) {
            field871[++Statics.field867 - 1] = var3.field3650;
            return 1;
        } else if (arg0 == 2613) {
            field871[++Statics.field867 - 1] = var3.field3654.method36();
            return 1;
        } else if (arg0 == 2614) {
            field871[++Statics.field867 - 1] = var3.field3684 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class326 var4 = var3.method5867();
                field871[++Statics.field867 - 1] = var4 == null ? 0 : var4.field3540;
            }
            if (arg0 == 2618) {
                class326 var5 = var3.method5867();
                field871[++Statics.field867 - 1] = var5 == null ? 0 : var5.field3541;
                return 1;
            } else if (arg0 == 2619) {
                class331 var6 = var3.method5902();
                field872[++Statics.field874 - 1] = var6 == null ? "" : var6.method5813().method6708();
                return 1;
            } else if (arg0 == 2620) {
                class326 var7 = var3.method5867();
                field871[++Statics.field867 - 1] = var7 == null ? 0 : var7.field3542;
                return 1;
            } else if (arg0 == 2621) {
                class331 var8 = var3.method5902();
                field871[++Statics.field867 - 1] = var8 == null ? 0 : var8.method5617();
                return 1;
            } else if (arg0 == 2622) {
                class331 var9 = var3.method5902();
                field871[++Statics.field867 - 1] = var9 == null ? 0 : var9.method5618();
                return 1;
            } else if (arg0 == 2623) {
                class331 var10 = var3.method5902();
                field871[++Statics.field867 - 1] = var10 == null ? 0 : var10.method5619();
                return 1;
            } else if (arg0 == 2624) {
                class331 var11 = var3.method5902();
                field871[++Statics.field867 - 1] = var11 != null && var11.method5609() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class331 var12 = var3.method5902();
                field871[++Statics.field867 - 1] = var12 != null && var12.method5610() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class331 var13 = var3.method5902();
                field872[++Statics.field874 - 1] = var13 == null ? "" : var13.method5608().method6914();
                return 1;
            } else if (arg0 == 2627) {
                class331 var14 = var3.method5902();
                int var15 = var14 == null ? 0 : var14.method5613();
                int var16 = var14 == null ? 0 : var14.method5612();
                field871[++Statics.field867 - 1] = Math.min(var15, var16);
                field871[++Statics.field867 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class331 var17 = var3.method5902();
                field871[++Statics.field867 - 1] = var17 == null ? 0 : var17.method5612();
                return 1;
            } else if (arg0 == 2629) {
                class331 var18 = var3.method5902();
                field871[++Statics.field867 - 1] = var18 == null ? 0 : var18.method5621();
                return 1;
            } else if (arg0 == 2630) {
                class331 var19 = var3.method5902();
                field871[++Statics.field867 - 1] = var19 == null ? 0 : var19.method5602();
                return 1;
            } else if (arg0 == 2631) {
                class331 var20 = var3.method5902();
                field871[++Statics.field867 - 1] = var20 == null ? 0 : var20.method5709();
                return 1;
            } else if (arg0 == 2632) {
                class331 var21 = var3.method5902();
                field871[++Statics.field867 - 1] = var21 == null ? 0 : var21.method5698();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method5861();
                field871[Statics.field867 - 1] = var22 == null ? 0 : var22.method384(field871[Statics.field867 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method5861();
                field871[Statics.field867 - 1] = var23 == null ? 0 : var23.method381((char) field871[Statics.field867 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("gh.an(ILdc;ZI)I")
    public static int method3103(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class333 var3 = class333.method3491(field871[--Statics.field867]);
            field871[++Statics.field867 - 1] = var3.field3757;
            return 1;
        } else if (arg0 == 2701) {
            class333 var4 = class333.method3491(field871[--Statics.field867]);
            if (var4.field3757 == -1) {
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = var4.field3648;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field871[--Statics.field867];
            class87 var6 = (class87) client.field686.method7981((long) var5);
            if (var6 == null) {
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field871[++Statics.field867 - 1] = client.field685;
            return 1;
        } else if (arg0 == 2707) {
            class333 var7 = class333.method3491(field871[--Statics.field867]);
            field871[++Statics.field867 - 1] = var7.method5857() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class333 var8 = class333.method3491(field871[--Statics.field867]);
            return method1998(var8);
        } else if (arg0 == 2709) {
            class333 var9 = class333.method3491(field871[--Statics.field867]);
            return method2895(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.af(ILdc;ZI)I")
    public static int method2312(int arg0, class79 arg1, boolean arg2) {
        class333 var3 = class333.method3491(field871[--Statics.field867]);
        if (arg0 == 2800) {
            field871[++Statics.field867 - 1] = class334.method5039(client.method2735(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field871[--Statics.field867];
            int var5 = var4 - 1;
            if (var3.field3665 == null || var5 >= var3.field3665.length || var3.field3665[var5] == null) {
                field872[++Statics.field874 - 1] = "";
            } else {
                field872[++Statics.field874 - 1] = var3.field3665[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3704 == null) {
                field872[++Statics.field874 - 1] = "";
            } else {
                field872[++Statics.field874 - 1] = var3.field3704;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.ai(ILdc;ZI)I")
    public static int method71(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field872[--Statics.field874];
            class111.method7045(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field867 -= 2;
            client.method4988(Statics.field1605, field871[Statics.field867], field871[Statics.field867 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field865) {
                field879 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field872[--Statics.field874];
            int var5 = 0;
            if (class388.method4188(var4)) {
                var5 = class388.method5252(var4);
            }
            class298 var6 = class298.method8119(class296.field3146, client.field521.field1414);
            var6.field3205.method8230(var5);
            client.field521.method2669(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field872[--Statics.field874];
            class298 var8 = class298.method8119(class296.field3125, client.field521.field1414);
            var8.field3205.method8227(var7.length() + 1);
            var8.field3205.method8234(var7);
            client.field521.method2669(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field872[--Statics.field874];
            class298 var10 = class298.method8119(class296.field3148, client.field521.field1414);
            var10.field3205.method8227(var9.length() + 1);
            var10.field3205.method8234(var9);
            client.field521.method2669(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field871[--Statics.field867];
            String var12 = field872[--Statics.field874];
            client.method421(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field867 -= 3;
            int var13 = field871[Statics.field867];
            int var14 = field871[Statics.field867 + 1];
            int var15 = field871[Statics.field867 + 2];
            class333 var16 = class333.method3491(var15);
            client.method6043(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field867 -= 2;
            int var17 = field871[Statics.field867];
            int var18 = field871[Statics.field867 + 1];
            class333 var19 = arg2 ? Statics.field260 : Statics.field3897;
            client.method6043(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field170 = field871[--Statics.field867] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field871[++Statics.field867 - 1] = Statics.field1686.method2354() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1686.method2353(field871[--Statics.field867] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field872[--Statics.field874];
            boolean var21 = field871[--Statics.field867] == 1;
            class32.method2478(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field871[--Statics.field867];
            class298 var23 = class298.method8119(class296.field3137, client.field521.field1414);
            var23.field3205.method8228(var22);
            client.field521.method2669(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field871[--Statics.field867];
            Statics.field874 -= 2;
            String var25 = field872[Statics.field874];
            String var26 = field872[Statics.field874 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class298 var27 = class298.method8119(class296.field3188, client.field521.field1414);
                var27.field3205.method8228(1 + class514.method8096(var25) + class514.method8096(var26));
                var27.field3205.method8234(var26);
                var27.field3205.method8234(var25);
                var27.field3205.method8402(var24);
                client.field521.method2669(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field867--;
            return 1;
        } else if (arg0 == 3118) {
            client.field702 = field871[--Statics.field867] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field767 = field871[--Statics.field867] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field871[--Statics.field867] == 1) {
                client.field645 |= 0x1;
            } else {
                client.field645 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field871[--Statics.field867] == 1) {
                client.field645 |= 0x2;
            } else {
                client.field645 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field871[--Statics.field867] == 1) {
                client.field645 |= 0x4;
            } else {
                client.field645 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field871[--Statics.field867] == 1) {
                client.field645 |= 0x8;
            } else {
                client.field645 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field645 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field640 = field871[--Statics.field867] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field581 = field871[--Statics.field867] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method6004(field871[--Statics.field867] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field871[++Statics.field867 - 1] = client.method2964() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field867 -= 2;
            client.field611 = field871[Statics.field867];
            client.field787 = field871[Statics.field867 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field867 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field867--;
            return 1;
        } else if (arg0 == 3132) {
            field871[++Statics.field867 - 1] = Statics.field4328;
            field871[++Statics.field867 - 1] = Statics.field4883;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field867--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field867 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field618 = 3;
            client.field688 = field871[--Statics.field867];
            return 1;
        } else if (arg0 == 3137) {
            client.field618 = 2;
            client.field688 = field871[--Statics.field867];
            return 1;
        } else if (arg0 == 3138) {
            client.field618 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field618 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field618 = 3;
            client.field688 = arg2 ? Statics.field260.field3624 : Statics.field3897.field3624;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field871[--Statics.field867] == 1;
            Statics.field1686.method2418(var28);
            return 1;
        } else if (arg0 == 3142) {
            field871[++Statics.field867 - 1] = Statics.field1686.method2356() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field871[--Statics.field867] == 1;
            client.field568 = var29;
            if (!var29) {
                Statics.field1686.method2371("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field871[++Statics.field867 - 1] = client.field568 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field871[--Statics.field867] == 1;
            Statics.field1686.method2357(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field871[++Statics.field867 - 1] = Statics.field1686.method2358() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field871[++Statics.field867 - 1] = class76.field943;
            return 1;
        } else if (arg0 == 3154) {
            field871[++Statics.field867 - 1] = client.method3110();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field874--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field867 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field867--;
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field867--;
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field874--;
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field867--;
            field872[++Statics.field874 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field867--;
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field867 -= 2;
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field867 -= 2;
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field867 -= 2;
            field872[++Statics.field874 - 1] = "";
            field872[++Statics.field874 - 1] = "";
            field872[++Statics.field874 - 1] = "";
            field872[++Statics.field874 - 1] = "";
            field872[++Statics.field874 - 1] = "";
            field872[++Statics.field874 - 1] = "";
            field872[++Statics.field874 - 1] = "";
            field872[++Statics.field874 - 1] = "";
            field872[++Statics.field874 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field867--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field867--;
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field867--;
            return 1;
        } else if (arg0 == 3175) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field874--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field874--;
            return 1;
        } else if (arg0 == 3181) {
            client.method2695(field871[--Statics.field867]);
            return 1;
        } else if (arg0 == 3182) {
            field871[++Statics.field867 - 1] = client.method3221();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field871[--Statics.field867];
            client.method106(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jr.al(ILdc;ZI)I")
    public static int method4550(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field867 -= 3;
            client.method219(field871[Statics.field867], field871[Statics.field867 + 1], field871[Statics.field867 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field867 -= 5;
            int var3 = field871[Statics.field867];
            int var4 = field871[Statics.field867 + 1];
            int var5 = field871[Statics.field867 + 2];
            int var6 = field871[Statics.field867 + 3];
            int var7 = field871[Statics.field867 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method3628(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field867 -= 2;
            client.method1904(field871[Statics.field867], field871[Statics.field867 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class91 var50 = class91.field1101;
            class90 var51 = class90.field1098;
            int var52 = field871[--Statics.field867];
            if (arg0 == 3212) {
                int var53 = field871[--Statics.field867];
                var50 = (class91) class374.method2465(class91.method11(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field871[--Statics.field867];
                var51 = (class90) class374.method2465(class90.method7940(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field871[--Statics.field867];
                var50 = (class91) class374.method2465(class91.method11(), var55);
                if (var50 == null) {
                    var51 = (class90) class374.method2465(class90.method7940(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class91.field1104;
            } else if (arg0 == 3203) {
                var51 = class90.field1092;
            } else if (arg0 == 3205) {
                var51 = class90.field1094;
            } else if (arg0 == 3207) {
                var51 = class90.field1090;
            }
            if (class90.field1098 == var51) {
                switch(var50.field1105) {
                    case 1:
                        Statics.field1686.method2418(var52 == 1);
                        break;
                    case 2:
                        Statics.field1686.method2357(var52 == 1);
                        break;
                    case 3:
                        Statics.field1686.method2408(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field1686.method2362(var52);
                        break;
                    case 5:
                        client.method2695(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1095) {
                    case 1:
                        Statics.field1686.method2353(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method6032(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method7221(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method1875(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class91 var38 = class91.field1101;
            class90 var39 = class90.field1098;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field871[--Statics.field867];
                var38 = (class91) class374.method2465(class91.method11(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field871[--Statics.field867];
                var39 = (class90) class374.method2465(class90.method7940(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field871[--Statics.field867];
                var38 = (class91) class374.method2465(class91.method11(), var43);
                if (var38 == null) {
                    var39 = (class90) class374.method2465(class90.method7940(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class91.field1104;
            } else if (arg0 == 3204) {
                var39 = class90.field1092;
            } else if (arg0 == 3206) {
                var39 = class90.field1094;
            } else if (arg0 == 3208) {
                var39 = class90.field1090;
            }
            int var45;
            if (class90.field1098 == var39) {
                switch(var38.field1105) {
                    case 1:
                        var45 = Statics.field1686.method2356() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field1686.method2358() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field1686.method2435() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field1686.method2350();
                        break;
                    case 5:
                        var45 = client.method3221();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1095) {
                    case 1:
                        var45 = Statics.field1686.method2354() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field1686.method2367();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field1686.method2369();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field1686.method2370();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field871[++Statics.field867 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field871[--Statics.field867];
            int var10 = 0;
            class91 var11 = (class91) class374.method2465(class91.method11(), var9);
            if (var11 != null) {
                var10 = class91.field1101 == var11 ? 0 : 1;
            }
            field871[++Statics.field867 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field871[--Statics.field867];
            int var13 = 0;
            class90 var14 = (class90) class374.method2465(class90.method7940(), var12);
            if (var14 != null) {
                var13 = class90.field1098 == var14 ? 0 : 1;
            }
            field871[++Statics.field867 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class91 var28 = class91.field1101;
            class90 var29 = class90.field1098;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field871[--Statics.field867];
                var28 = (class91) class374.method2465(class91.method11(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field871[--Statics.field867];
                var29 = (class90) class374.method2465(class90.method7940(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class90.field1098 == var29) {
                switch(var28.field1105) {
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
                switch(var29.field1095) {
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
            field871[++Statics.field867 - 1] = var35;
            field871[++Statics.field867 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field867 -= 2;
            int var15 = field871[Statics.field867];
            int var16 = field871[Statics.field867 + 1];
            class307.method3865(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field867 -= 6;
            int var17 = field871[Statics.field867];
            int var18 = field871[Statics.field867 + 1];
            int var19 = field871[Statics.field867 + 2];
            int var20 = field871[Statics.field867 + 3];
            int var21 = field871[Statics.field867 + 4];
            int var22 = field871[Statics.field867 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method3628(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field867 -= 4;
            int var24 = field871[Statics.field867];
            int var25 = field871[Statics.field867 + 1];
            int var26 = field871[Statics.field867 + 2];
            int var27 = field871[Statics.field867 + 3];
            class307.method7564(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("co.bd(ILdc;ZS)I")
    public static int method1176(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field871[++Statics.field867 - 1] = client.field530;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field867 -= 2;
            int var3 = field871[Statics.field867];
            int var4 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = class85.method5177(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field867 -= 2;
            int var5 = field871[Statics.field867];
            int var6 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = class85.method7936(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field867 -= 2;
            int var7 = field871[Statics.field867];
            int var8 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = class85.method1856(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class186.method633(var9).field1897;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field657[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field578[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field659[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field265;
            int var14 = (Statics.field1605.field1192 >> 7) + Statics.field4295;
            int var15 = (Statics.field1605.field1206 >> 7) + Statics.field1676;
            field871[++Statics.field867 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field871[++Statics.field867 - 1] = client.field520 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field867 -= 2;
            int var19 = field871[Statics.field867] + 32768;
            int var20 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = class85.method5177(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field867 -= 2;
            int var21 = field871[Statics.field867] + 32768;
            int var22 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = class85.method7936(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field867 -= 2;
            int var23 = field871[Statics.field867] + 32768;
            int var24 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = class85.method1856(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field693 >= 2) {
                field871[++Statics.field867 - 1] = client.field693;
            } else {
                field871[++Statics.field867 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field871[++Statics.field867 - 1] = client.field536;
            return 1;
        } else if (arg0 == 3318) {
            field871[++Statics.field867 - 1] = client.field517;
            return 1;
        } else if (arg0 == 3321) {
            field871[++Statics.field867 - 1] = client.field691 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field871[++Statics.field867 - 1] = client.field692;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field695) {
                field871[++Statics.field867 - 1] = 1;
            } else {
                field871[++Statics.field867 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field871[++Statics.field867 - 1] = client.field518;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field867 -= 4;
            int var25 = field871[Statics.field867];
            int var26 = field871[Statics.field867 + 1];
            int var27 = field871[Statics.field867 + 2];
            int var28 = field871[Statics.field867 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field871[++Statics.field867 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field871[++Statics.field867 - 1] = client.field744;
            return 1;
        } else if (arg0 == 3327) {
            field871[++Statics.field867 - 1] = client.field533;
            return 1;
        } else if (arg0 == 3331) {
            field871[++Statics.field867 - 1] = client.field691;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ip.bb(ILdc;ZB)I")
    public static int method4019(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field867 -= 2;
            int var3 = field871[Statics.field867];
            int var4 = field871[Statics.field867 + 1];
            class193 var5 = class193.method6340(var3);
            if (var5.field1977 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1983; var6++) {
                if (var5.field1981[var6] == var4) {
                    field872[++Statics.field874 - 1] = var5.field1976[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field872[++Statics.field874 - 1] = var5.field1979;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field867 -= 4;
            int var7 = field871[Statics.field867];
            int var8 = field871[Statics.field867 + 1];
            int var9 = field871[Statics.field867 + 2];
            int var10 = field871[Statics.field867 + 3];
            class193 var11 = class193.method6340(var9);
            if (var11.field1978 != var7 || var11.field1977 != var8) {
                if (var8 == 115) {
                    field872[++Statics.field874 - 1] = class353.field3906;
                } else {
                    field871[++Statics.field867 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1983; var12++) {
                if (var11.field1981[var12] == var10) {
                    if (var8 == 115) {
                        field872[++Statics.field874 - 1] = var11.field1976[var12];
                    } else {
                        field871[++Statics.field867 - 1] = var11.field1982[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field872[++Statics.field874 - 1] = var11.field1979;
                } else {
                    field871[++Statics.field867 - 1] = var11.field1974;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field871[--Statics.field867];
            class193 var14 = class193.method6340(var13);
            field871[++Statics.field867 - 1] = var14.method3364();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rz.bn(ILdc;ZI)I")
    public static int method7654(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field751.method3796(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field751.method3795(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field751.method3797(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.bf(ILdc;ZI)I")
    public static int method1982(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ns.bs(ILdc;ZI)I")
    public static int method6025(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field61 == null) {
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = 1;
                Statics.field3213 = Statics.field61;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field871[--Statics.field867];
            if (client.field713[var3] == null) {
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = 1;
                Statics.field3213 = client.field713[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field872[++Statics.field874 - 1] = Statics.field3213.field1709;
            return 1;
        } else if (arg0 == 3803) {
            field871[++Statics.field867 - 1] = Statics.field3213.field1711 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field871[++Statics.field867 - 1] = Statics.field3213.field1713;
            return 1;
        } else if (arg0 == 3805) {
            field871[++Statics.field867 - 1] = Statics.field3213.field1707;
            return 1;
        } else if (arg0 == 3806) {
            field871[++Statics.field867 - 1] = Statics.field3213.field1714;
            return 1;
        } else if (arg0 == 3807) {
            field871[++Statics.field867 - 1] = Statics.field3213.field1715;
            return 1;
        } else if (arg0 == 3809) {
            field871[++Statics.field867 - 1] = Statics.field3213.field1716;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field871[--Statics.field867];
            field872[++Statics.field874 - 1] = Statics.field3213.field1727[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = Statics.field3213.field1718[var5];
            return 1;
        } else if (arg0 == 3812) {
            field871[++Statics.field867 - 1] = Statics.field3213.field1725;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field871[--Statics.field867];
            field872[++Statics.field874 - 1] = Statics.field3213.field1728[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field867 -= 3;
            int var7 = field871[Statics.field867];
            int var8 = field871[Statics.field867 + 1];
            int var9 = field871[Statics.field867 + 2];
            field871[++Statics.field867 - 1] = Statics.field3213.method3044(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field871[++Statics.field867 - 1] = Statics.field3213.field1723;
            return 1;
        } else if (arg0 == 3816) {
            field871[++Statics.field867 - 1] = Statics.field3213.field1726;
            return 1;
        } else if (arg0 == 3817) {
            field871[++Statics.field867 - 1] = Statics.field3213.method3015(field872[--Statics.field874]);
            return 1;
        } else if (arg0 == 3818) {
            field871[Statics.field867 - 1] = Statics.field3213.method3004()[field871[Statics.field867 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field867 -= 2;
            int var10 = field871[Statics.field867];
            int var11 = field871[Statics.field867 + 1];
            client.method8121(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = Statics.field3213.field1721[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field867 -= 3;
                int var13 = field871[Statics.field867];
                boolean var14 = field871[Statics.field867 + 1] == 1;
                int var15 = field871[Statics.field867 + 2];
                client.method2992(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field871[--Statics.field867];
                field871[++Statics.field867 - 1] = Statics.field3213.field1722[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field2860 == null) {
                    field871[++Statics.field867 - 1] = 0;
                } else {
                    field871[++Statics.field867 - 1] = 1;
                    Statics.field1093 = Statics.field2860;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field871[--Statics.field867];
                if (client.field758[var17] == null) {
                    field871[++Statics.field867 - 1] = 0;
                } else {
                    field871[++Statics.field867 - 1] = 1;
                    Statics.field1093 = client.field758[var17];
                    Statics.field3843 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field872[++Statics.field874 - 1] = Statics.field1093.field1778;
                return 1;
            } else if (arg0 == 3853) {
                field871[++Statics.field867 - 1] = Statics.field1093.field1781;
                return 1;
            } else if (arg0 == 3854) {
                field871[++Statics.field867 - 1] = Statics.field1093.field1779;
                return 1;
            } else if (arg0 == 3855) {
                field871[++Statics.field867 - 1] = Statics.field1093.method3105();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field871[--Statics.field867];
                field872[++Statics.field874 - 1] = ((class146) Statics.field1093.field1775.get(var18)).field1654.method8881();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field871[--Statics.field867];
                field871[++Statics.field867 - 1] = ((class146) Statics.field1093.field1775.get(var19)).field1656;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field871[--Statics.field867];
                field871[++Statics.field867 - 1] = ((class146) Statics.field1093.field1775.get(var20)).field1653;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field871[--Statics.field867];
                client.method1715(Statics.field3843, var21);
                return 1;
            } else if (arg0 == 3860) {
                field871[++Statics.field867 - 1] = Statics.field1093.method3092(field872[--Statics.field874]);
                return 1;
            } else if (arg0 == 3861) {
                field871[Statics.field867 - 1] = Statics.field1093.method3085()[field871[Statics.field867 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field871[++Statics.field867 - 1] = Statics.field1601 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("jp.bp(ILdc;ZI)I")
    public static int method4383(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field805[var3].method6286();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field805[var4].field4352;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field805[var5].field4355;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field805[var6].field4354;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field805[var7].field4353;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.field805[var8].field4356;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field871[--Statics.field867];
            int var10 = client.field805[var9].method6304();
            field871[++Statics.field867 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field871[--Statics.field867];
            int var12 = client.field805[var11].method6304();
            field871[++Statics.field867 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field871[--Statics.field867];
            int var14 = client.field805[var13].method6304();
            field871[++Statics.field867 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field871[--Statics.field867];
            int var16 = client.field805[var15].method6304();
            field871[++Statics.field867 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field871[--Statics.field867] == 1;
            if (Statics.field166 != null) {
                Statics.field166.method6238(class362.field4325, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field871[--Statics.field867] == 1;
            if (Statics.field166 != null) {
                Statics.field166.method6238(class362.field4324, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field867 -= 2;
            boolean var19 = field871[Statics.field867] == 1;
            boolean var20 = field871[Statics.field867 + 1] == 1;
            if (Statics.field166 != null) {
                client.field806.field511 = var20;
                Statics.field166.method6238(client.field806, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field871[--Statics.field867] == 1;
            if (Statics.field166 != null) {
                Statics.field166.method6238(class362.field4322, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field871[--Statics.field867] == 1;
            if (Statics.field166 != null) {
                Statics.field166.method6238(class362.field4326, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field871[++Statics.field867 - 1] = Statics.field166 == null ? 0 : Statics.field166.field4327.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field871[--Statics.field867];
            class368 var24 = (class368) Statics.field166.field4327.get(var23);
            field871[++Statics.field867 - 1] = var24.field4345;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field871[--Statics.field867];
            class368 var26 = (class368) Statics.field166.field4327.get(var25);
            field872[++Statics.field874 - 1] = var26.method6278();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field871[--Statics.field867];
            class368 var28 = (class368) Statics.field166.field4327.get(var27);
            field872[++Statics.field874 - 1] = var28.method6277();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field871[--Statics.field867];
            class368 var30 = (class368) Statics.field166.field4327.get(var29);
            long var31 = class303.method2705() - Statics.field2050 - var30.field4348;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field872[++Statics.field874 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field871[--Statics.field867];
            class368 var38 = (class368) Statics.field166.field4327.get(var37);
            field871[++Statics.field867 - 1] = var38.field4346.field4354;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field871[--Statics.field867];
            class368 var40 = (class368) Statics.field166.field4327.get(var39);
            field871[++Statics.field867 - 1] = var40.field4346.field4355;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field871[--Statics.field867];
            class368 var42 = (class368) Statics.field166.field4327.get(var41);
            field871[++Statics.field867 - 1] = var42.field4346.field4352;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class208.method2788(var43).field2238 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("de.bv(ILdc;ZI)I")
    public static int method2202(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field867 -= 2;
            int var3 = field871[Statics.field867];
            int var4 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field867 -= 2;
            int var5 = field871[Statics.field867];
            int var6 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field867 -= 2;
            int var7 = field871[Statics.field867];
            int var8 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field867 -= 2;
            int var9 = field871[Statics.field867];
            int var10 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field867 -= 5;
            int var13 = field871[Statics.field867];
            int var14 = field871[Statics.field867 + 1];
            int var15 = field871[Statics.field867 + 2];
            int var16 = field871[Statics.field867 + 3];
            int var17 = field871[Statics.field867 + 4];
            field871[++Statics.field867 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field867 -= 2;
            int var18 = field871[Statics.field867];
            int var19 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field867 -= 2;
            int var20 = field871[Statics.field867];
            int var21 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field867 -= 2;
            int var22 = field871[Statics.field867];
            int var23 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field867 -= 2;
            int var24 = field871[Statics.field867];
            int var25 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field867 -= 2;
            int var26 = field871[Statics.field867];
            int var27 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field867 -= 2;
            int var28 = field871[Statics.field867];
            int var29 = field871[Statics.field867 + 1];
            if (var28 == 0) {
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field867 -= 2;
            int var30 = field871[Statics.field867];
            int var31 = field871[Statics.field867 + 1];
            if (var30 == 0) {
                field871[++Statics.field867 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field871[++Statics.field867 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field871[++Statics.field867 - 1] = var30;
                    break;
                case 2:
                    field871[++Statics.field867 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field871[++Statics.field867 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field871[++Statics.field867 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field871[++Statics.field867 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field867 -= 2;
            int var32 = field871[Statics.field867];
            int var33 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field867 -= 2;
            int var34 = field871[Statics.field867];
            int var35 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field867 -= 2;
            int var36 = field871[Statics.field867];
            int var37 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field867 -= 2;
            int var38 = field871[Statics.field867];
            int var39 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field867 -= 3;
            long var40 = (long) field871[Statics.field867];
            long var42 = (long) field871[Statics.field867 + 1];
            long var44 = (long) field871[Statics.field867 + 2];
            field871[++Statics.field867 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class305.method2197(field871[--Statics.field867]);
            field871[++Statics.field867 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field867 -= 2;
            int var47 = field871[Statics.field867];
            int var48 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field867 -= 3;
            int var49 = field871[Statics.field867];
            int var50 = field871[Statics.field867 + 1];
            int var51 = field871[Statics.field867 + 2];
            field871[++Statics.field867 - 1] = class305.method4371(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field867 -= 3;
            int var52 = field871[Statics.field867];
            int var53 = field871[Statics.field867 + 1];
            int var54 = field871[Statics.field867 + 2];
            field871[++Statics.field867 - 1] = class305.method424(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field867 -= 3;
            int var55 = field871[Statics.field867];
            int var56 = field871[Statics.field867 + 1];
            int var57 = field871[Statics.field867 + 2];
            int var58 = 31 - var57;
            field871[++Statics.field867 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field867 -= 4;
            int var59 = field871[Statics.field867];
            int var60 = field871[Statics.field867 + 1];
            int var61 = field871[Statics.field867 + 2];
            int var62 = field871[Statics.field867 + 3];
            int var63 = class305.method424(var59, var61, var62);
            int var64 = class305.method4137(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field871[++Statics.field867 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field871[Statics.field867 - 1] = class466.method7341(field871[Statics.field867 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field871[Statics.field867 - 1] = Statics.method7366(field871[Statics.field867 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field867 -= 2;
            int var65 = field871[Statics.field867];
            int var66 = field871[Statics.field867 + 1];
            int var67 = class466.method6317(var65, var66);
            field871[++Statics.field867 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field871[Statics.field867 - 1] = Math.abs(field871[Statics.field867 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field872[--Statics.field874];
            int var69 = -1;
            if (class388.method4188(var68)) {
                var69 = class388.method5252(var68);
            }
            field871[++Statics.field867 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nf.bo(ILdc;ZI)I")
    public static int method6018(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field871[--Statics.field867];
            field872[++Statics.field874 - 1] = class208.method2788(var3).field2228;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field867 -= 2;
            int var4 = field871[Statics.field867];
            int var5 = field871[Statics.field867 + 1];
            class208 var6 = class208.method2788(var4);
            if (var5 < 1 || var5 > 5 || var6.field2189[var5 - 1] == null) {
                field872[++Statics.field874 - 1] = "";
            } else {
                field872[++Statics.field874 - 1] = var6.field2189[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field867 -= 2;
            int var7 = field871[Statics.field867];
            int var8 = field871[Statics.field867 + 1];
            class208 var9 = class208.method2788(var7);
            if (var8 < 1 || var8 > 5 || var9.field2212[var8 - 1] == null) {
                field872[++Statics.field874 - 1] = "";
            } else {
                field872[++Statics.field874 - 1] = var9.field2212[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class208.method2788(var10).field2206;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class208.method2788(var11).field2205 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field871[--Statics.field867];
            class208 var13 = class208.method2788(var12);
            if (var13.field2229 == -1 && var13.field2227 >= 0) {
                field871[++Statics.field867 - 1] = var13.field2227;
            } else {
                field871[++Statics.field867 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field871[--Statics.field867];
            class208 var15 = class208.method2788(var14);
            if (var15.field2229 >= 0 && var15.field2227 >= 0) {
                field871[++Statics.field867 - 1] = var15.field2227;
            } else {
                field871[++Statics.field867 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class208.method2788(var16).field2210 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field871[--Statics.field867];
            class208 var18 = class208.method2788(var17);
            if (var18.field2207 == -1 && var18.field2236 >= 0) {
                field871[++Statics.field867 - 1] = var18.field2236;
            } else {
                field871[++Statics.field867 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field871[--Statics.field867];
            class208 var20 = class208.method2788(var19);
            if (var20.field2207 >= 0 && var20.field2236 >= 0) {
                field871[++Statics.field867 - 1] = var20.field2236;
            } else {
                field871[++Statics.field867 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field872[--Statics.field874];
            int var22 = field871[--Statics.field867];
            client.method2979(var21, var22 == 1);
            field871[++Statics.field867 - 1] = Statics.field1844;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1083 == null || Statics.field1729 >= Statics.field1844) {
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = Statics.field1083[++Statics.field1729 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field1729 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field871[--Statics.field867];
            int var24 = class208.method2788(var23).method3683();
            if (var24 == -1) {
                field871[++Statics.field867 - 1] = var24;
            } else {
                field871[++Statics.field867 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class208.method2788(var25).field2239;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class208.method2788(var26).field2208;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class208.method2788(var27).field2209;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field871[--Statics.field867];
            class208 var29 = class208.method2788(var28);
            field871[++Statics.field867 - 1] = var29.field2241;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ml.br(ILdc;ZS)I")
    public static int method5998(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field871[++Statics.field867 - 1] = client.field746;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field867 -= 3;
            client.field746 = field871[Statics.field867];
            Statics.field80 = class533.method4145(field871[Statics.field867 + 1]);
            if (Statics.field80 == null) {
                Statics.field80 = class533.field5206;
            }
            client.field747 = field871[Statics.field867 + 2];
            class298 var3 = class298.method8119(class296.field3182, client.field521.field1414);
            var3.field3205.method8227(client.field746);
            var3.field3205.method8227(Statics.field80.field5209);
            var3.field3205.method8227(client.field747);
            client.field521.method2669(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field872[--Statics.field874];
            Statics.field867 -= 2;
            int var5 = field871[Statics.field867];
            int var6 = field871[Statics.field867 + 1];
            class298 var7 = class298.method8119(class296.field3119, client.field521.field1414);
            var7.field3205.method8227(class514.method8096(var4) + 2);
            var7.field3205.method8234(var4);
            var7.field3205.method8227(var5 - 1);
            var7.field3205.method8227(var6);
            client.field521.method2669(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field867 -= 2;
            int var8 = field871[Statics.field867];
            int var9 = field871[Statics.field867 + 1];
            class65 var10 = class111.method2179(var8, var9);
            if (var10 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field872[++Statics.field874 - 1] = "";
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = var10.field497;
                field871[++Statics.field867 - 1] = var10.field506;
                field872[++Statics.field874 - 1] = var10.field500 == null ? "" : var10.field500;
                field872[++Statics.field874 - 1] = var10.field504 == null ? "" : var10.field504;
                field872[++Statics.field874 - 1] = var10.field498 == null ? "" : var10.field498;
                field871[++Statics.field867 - 1] = var10.method1142() ? 1 : (var10.method1145() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field871[--Statics.field867];
            class65 var12 = class111.method2555(var11);
            if (var12 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field872[++Statics.field874 - 1] = "";
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = var12.field499;
                field871[++Statics.field867 - 1] = var12.field506;
                field872[++Statics.field874 - 1] = var12.field500 == null ? "" : var12.field500;
                field872[++Statics.field874 - 1] = var12.field504 == null ? "" : var12.field504;
                field872[++Statics.field874 - 1] = var12.field498 == null ? "" : var12.field498;
                field871[++Statics.field867 - 1] = var12.method1142() ? 1 : (var12.method1145() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field80 == null) {
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = Statics.field80.field5209;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field872[--Statics.field874];
            int var14 = field871[--Statics.field867];
            class298 var15 = class539.method6799(var14, var13, Statics.field884, -1);
            client.field521.method2669(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field874 -= 2;
            String var16 = field872[Statics.field874];
            String var17 = field872[Statics.field874 + 1];
            class298 var18 = class298.method8119(class296.field3150, client.field521.field1414);
            var18.field3205.method8228(0);
            int var19 = var18.field3205.field5072;
            var18.field3205.method8234(var16);
            class336.method268(var18.field3205, var17);
            var18.field3205.method8240(var18.field3205.field5072 - var19);
            client.field521.method2669(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field872[--Statics.field874];
            Statics.field867 -= 2;
            int var21 = field871[Statics.field867];
            int var22 = field871[Statics.field867 + 1];
            class298 var23 = class539.method6799(var21, var20, Statics.field884, var22);
            client.field521.method2669(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field1605 == null || Statics.field1605.field1115 == null) {
                var24 = "";
            } else {
                var24 = Statics.field1605.field1115.method8881();
            }
            field872[++Statics.field874 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field871[++Statics.field867 - 1] = client.field747;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class111.method5172(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = class111.method6112(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = Statics.method6039(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field872[--Statics.field874];
            client.method8505(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field748 = field872[--Statics.field874].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field872[++Statics.field874 - 1] = client.field748;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field872[--Statics.field874];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field867 -= 2;
            int var30 = field871[Statics.field867];
            int var31 = field871[Statics.field867 + 1];
            class65 var32 = class111.method2179(var30, var31);
            if (var32 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field872[++Statics.field874 - 1] = "";
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = var32.field497;
                field871[++Statics.field867 - 1] = var32.field506;
                field872[++Statics.field874 - 1] = var32.field500 == null ? "" : var32.field500;
                field872[++Statics.field874 - 1] = var32.field504 == null ? "" : var32.field504;
                field872[++Statics.field874 - 1] = var32.field498 == null ? "" : var32.field498;
                field871[++Statics.field867 - 1] = var32.method1142() ? 1 : (var32.method1145() ? 2 : 0);
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field871[--Statics.field867];
            class65 var34 = class111.method2555(var33);
            if (var34 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field872[++Statics.field874 - 1] = "";
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = var34.field499;
                field871[++Statics.field867 - 1] = var34.field506;
                field872[++Statics.field874 - 1] = var34.field500 == null ? "" : var34.field500;
                field872[++Statics.field874 - 1] = var34.field504 == null ? "" : var34.field504;
                field872[++Statics.field874 - 1] = var34.field498 == null ? "" : var34.field498;
                field871[++Statics.field867 - 1] = var34.method1142() ? 1 : (var34.method1145() ? 2 : 0);
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.bw(ILdc;ZI)I")
    public static int method2706(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field871[++Statics.field867 - 1] = client.method5997();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field871[--Statics.field867];
            if (var3 == 1 || var3 == 2) {
                client.method3866(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field871[++Statics.field867 - 1] = Statics.field1686.method2376();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field871[--Statics.field867];
            if (var4 == 1 || var4 == 2) {
                Statics.field1686.method2461(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field867--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kn.be(ILdc;ZS)I")
    public static int method5027(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field867 -= 2;
            int var3 = field871[Statics.field867];
            int var4 = field871[Statics.field867 + 1];
            if (!client.field774) {
                client.field734 = var3;
                client.field654 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field871[++Statics.field867 - 1] = client.field734;
            return 1;
        } else if (arg0 == 5506) {
            field871[++Statics.field867 - 1] = client.field654;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field871[--Statics.field867];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field607 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field871[++Statics.field867 - 1] = client.field607;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("in.bc(ILdc;ZS)I")
    public static int method3867(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field627 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jc.bi(II)I")
    public static int method4657(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("gg.bu(II)I")
    public static int method3073(int arg0) {
        return (int) ((Math.log((double) arg0) / field883 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("co.bk(ILdc;ZI)I")
    public static int method1177(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field867 -= 2;
            client.field788 = (short) method4657(field871[Statics.field867]);
            if (client.field788 <= 0) {
                client.field788 = 256;
            }
            client.field778 = (short) method4657(field871[Statics.field867 + 1]);
            if (client.field778 <= 0) {
                client.field778 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field867 -= 2;
            client.field600 = (short) field871[Statics.field867];
            if (client.field600 <= 0) {
                client.field600 = 256;
            }
            client.field791 = (short) field871[Statics.field867 + 1];
            if (client.field791 <= 0) {
                client.field791 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field867 -= 4;
            client.field792 = (short) field871[Statics.field867];
            if (client.field792 <= 0) {
                client.field792 = 1;
            }
            client.field593 = (short) field871[Statics.field867 + 1];
            if (client.field593 <= 0) {
                client.field593 = 32767;
            } else if (client.field593 < client.field792) {
                client.field593 = client.field792;
            }
            client.field760 = (short) field871[Statics.field867 + 2];
            if (client.field760 <= 0) {
                client.field760 = 1;
            }
            client.field795 = (short) field871[Statics.field867 + 3];
            if (client.field795 <= 0) {
                client.field795 = 32767;
            } else if (client.field795 < client.field760) {
                client.field795 = client.field760;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field696 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = -1;
            } else {
                client.method450(0, 0, client.field696.field3616, client.field696.field3640, false);
                field871[++Statics.field867 - 1] = client.field541;
                field871[++Statics.field867 - 1] = client.field799;
            }
            return 1;
        } else if (arg0 == 6204) {
            field871[++Statics.field867 - 1] = client.field600;
            field871[++Statics.field867 - 1] = client.field791;
            return 1;
        } else if (arg0 == 6205) {
            field871[++Statics.field867 - 1] = method3073(client.field788);
            field871[++Statics.field867 - 1] = method3073(client.field778);
            return 1;
        } else if (arg0 == 6220) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field871[++Statics.field867 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field871[++Statics.field867 - 1] = Statics.field4328;
            return 1;
        } else if (arg0 == 6223) {
            field871[++Statics.field867 - 1] = Statics.field4883;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gr.bz(ILdc;ZI)I")
    public static int method3119(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field871[++Statics.field867 - 1] = class68.method2080() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class68 var3 = class68.method777();
            if (var3 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
            } else {
                field871[++Statics.field867 - 1] = var3.field825;
                field871[++Statics.field867 - 1] = var3.field828;
                field872[++Statics.field874 - 1] = var3.field832;
                field871[++Statics.field867 - 1] = var3.field833;
                field871[++Statics.field867 - 1] = var3.field822;
                field872[++Statics.field874 - 1] = var3.field831;
            }
            return 1;
        } else if (arg0 == 6502) {
            class68 var4 = Statics.method7053();
            if (var4 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
            } else {
                field871[++Statics.field867 - 1] = var4.field825;
                field871[++Statics.field867 - 1] = var4.field828;
                field872[++Statics.field874 - 1] = var4.field832;
                field871[++Statics.field867 - 1] = var4.field833;
                field871[++Statics.field867 - 1] = var4.field822;
                field872[++Statics.field874 - 1] = var4.field831;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field871[--Statics.field867];
            class68 var6 = null;
            for (int var7 = 0; var7 < class68.field829; var7++) {
                if (Statics.field4440[var7].field825 == var5) {
                    var6 = Statics.field4440[var7];
                    break;
                }
            }
            if (var6 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
            } else {
                field871[++Statics.field867 - 1] = var6.field825;
                field871[++Statics.field867 - 1] = var6.field828;
                field872[++Statics.field874 - 1] = var6.field832;
                field871[++Statics.field867 - 1] = var6.field833;
                field871[++Statics.field867 - 1] = var6.field822;
                field872[++Statics.field874 - 1] = var6.field831;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field867 -= 4;
            int var8 = field871[Statics.field867];
            boolean var9 = field871[Statics.field867 + 1] == 1;
            int var10 = field871[Statics.field867 + 2];
            boolean var11 = field871[Statics.field867 + 3] == 1;
            class68.method5102(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field871[--Statics.field867];
            if (var12 >= 0 && var12 < class68.field829) {
                class68 var13 = Statics.field4440[var12];
                field871[++Statics.field867 - 1] = var13.field825;
                field871[++Statics.field867 - 1] = var13.field828;
                field872[++Statics.field874 - 1] = var13.field832;
                field871[++Statics.field867 - 1] = var13.field833;
                field871[++Statics.field867 - 1] = var13.field822;
                field872[++Statics.field874 - 1] = var13.field831;
            } else {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
                field871[++Statics.field867 - 1] = 0;
                field871[++Statics.field867 - 1] = 0;
                field872[++Statics.field874 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field777 = field871[--Statics.field867] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field867 -= 2;
            int var14 = field871[Statics.field867];
            int var15 = field871[Statics.field867 + 1];
            class203 var16 = class203.method5455(var15);
            if (var16.method3498()) {
                field872[++Statics.field874 - 1] = class196.method4032(var14).method3384(var15, var16.field2097);
            } else {
                field871[++Statics.field867 - 1] = class196.method4032(var14).method3376(var15, var16.field2100);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field867 -= 2;
            int var17 = field871[Statics.field867];
            int var18 = field871[Statics.field867 + 1];
            class203 var19 = class203.method5455(var18);
            if (var19.method3498()) {
                field872[++Statics.field874 - 1] = Statics.method2211(var17).method3616(var18, var19.field2097);
            } else {
                field871[++Statics.field867 - 1] = Statics.method2211(var17).method3593(var18, var19.field2100);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field867 -= 2;
            int var20 = field871[Statics.field867];
            int var21 = field871[Statics.field867 + 1];
            class203 var22 = class203.method5455(var21);
            if (var22.method3498()) {
                field872[++Statics.field874 - 1] = class208.method2788(var20).method3644(var21, var22.field2097);
            } else {
                field871[++Statics.field867 - 1] = class208.method2788(var20).method3643(var21, var22.field2100);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field867 -= 2;
            int var23 = field871[Statics.field867];
            int var24 = field871[Statics.field867 + 1];
            class203 var25 = class203.method5455(var24);
            if (var25.method3498()) {
                field872[++Statics.field874 - 1] = class205.method3910(var23).method3522(var24, var25.field2097);
            } else {
                field871[++Statics.field867 - 1] = class205.method3910(var23).method3521(var24, var25.field2100);
            }
            return 1;
        } else if (arg0 == 6518) {
            field871[++Statics.field867 - 1] = client.field525 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field871[++Statics.field867 - 1] = client.field523;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field874--;
            Statics.field867--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field874--;
            Statics.field867--;
            return 1;
        } else if (arg0 == 6524) {
            field871[++Statics.field867 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field871[++Statics.field867 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field871[++Statics.field867 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field871[++Statics.field867 - 1] = client.field658;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kn.bx(ILdc;ZB)I")
    public static int method5026(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field265;
            int var4 = (Statics.field1605.field1192 >> 7) + Statics.field4295;
            int var5 = (Statics.field1605.field1206 >> 7) + Statics.field1676;
            client.method2539().method7739(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field871[--Statics.field867];
            String var7 = "";
            class258 var8 = client.method2539().method7899(var6);
            if (var8 != null) {
                var7 = var8.method4737();
            }
            field872[++Statics.field874 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field871[--Statics.field867];
            client.method2539().method7919(var9);
            return 1;
        } else if (arg0 == 6603) {
            field871[++Statics.field867 - 1] = client.method2539().method7754();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field871[--Statics.field867];
            client.method2539().method7751(var10);
            return 1;
        } else if (arg0 == 6605) {
            field871[++Statics.field867 - 1] = client.method2539().method7756() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class324 var11 = new class324(field871[--Statics.field867]);
            client.method2539().method7758(var11.field3536, var11.field3538);
            return 1;
        } else if (arg0 == 6607) {
            class324 var12 = new class324(field871[--Statics.field867]);
            client.method2539().method7759(var12.field3536, var12.field3538);
            return 1;
        } else if (arg0 == 6608) {
            class324 var13 = new class324(field871[--Statics.field867]);
            client.method2539().method7760(var13.field3537, var13.field3536, var13.field3538);
            return 1;
        } else if (arg0 == 6609) {
            class324 var14 = new class324(field871[--Statics.field867]);
            client.method2539().method7761(var14.field3537, var14.field3536, var14.field3538);
            return 1;
        } else if (arg0 == 6610) {
            field871[++Statics.field867 - 1] = client.method2539().method7788();
            field871[++Statics.field867 - 1] = client.method2539().method7763();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field871[--Statics.field867];
            class258 var16 = client.method2539().method7899(var15);
            if (var16 == null) {
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = var16.method4740().method5487();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field871[--Statics.field867];
            class258 var18 = client.method2539().method7899(var17);
            if (var18 == null) {
                field871[++Statics.field867 - 1] = 0;
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = (var18.method4734() - var18.method4766() + 1) * 64;
                field871[++Statics.field867 - 1] = (var18.method4736() - var18.method4735() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field871[--Statics.field867];
            class258 var20 = client.method2539().method7899(var19);
            if (var20 == null) {
                field871[++Statics.field867 - 1] = 0;
                field871[++Statics.field867 - 1] = 0;
                field871[++Statics.field867 - 1] = 0;
                field871[++Statics.field867 - 1] = 0;
            } else {
                field871[++Statics.field867 - 1] = var20.method4766() * 64;
                field871[++Statics.field867 - 1] = var20.method4735() * 64;
                field871[++Statics.field867 - 1] = var20.method4734() * 64 + 64 - 1;
                field871[++Statics.field867 - 1] = var20.method4736() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field871[--Statics.field867];
            class258 var22 = client.method2539().method7899(var21);
            if (var22 == null) {
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var22.method4732();
            }
            return 1;
        } else if (arg0 == 6615) {
            class324 var23 = client.method2539().method7764();
            if (var23 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var23.field3536;
                field871[++Statics.field867 - 1] = var23.field3538;
            }
            return 1;
        } else if (arg0 == 6616) {
            field871[++Statics.field867 - 1] = client.method2539().method7838();
            return 1;
        } else if (arg0 == 6617) {
            class324 var24 = new class324(field871[--Statics.field867]);
            class258 var25 = client.method2539().method7742();
            if (var25 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4724(var24.field3537, var24.field3536, var24.field3538);
            if (var26 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var26[0];
                field871[++Statics.field867 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class324 var27 = new class324(field871[--Statics.field867]);
            class258 var28 = client.method2539().method7742();
            if (var28 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = -1;
                return 1;
            }
            class324 var29 = var28.method4725(var27.field3536, var27.field3538);
            if (var29 == null) {
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var29.method5487();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field867 -= 2;
            int var30 = field871[Statics.field867];
            class324 var31 = new class324(field871[Statics.field867 + 1]);
            method6307(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field867 -= 2;
            int var32 = field871[Statics.field867];
            class324 var33 = new class324(field871[Statics.field867 + 1]);
            method6307(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field867 -= 2;
            int var34 = field871[Statics.field867];
            class324 var35 = new class324(field871[Statics.field867 + 1]);
            class258 var36 = client.method2539().method7899(var34);
            if (var36 == null) {
                field871[++Statics.field867 - 1] = 0;
                return 1;
            } else {
                field871[++Statics.field867 - 1] = var36.method4790(var35.field3537, var35.field3536, var35.field3538) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field871[++Statics.field867 - 1] = client.method2539().method7765();
            field871[++Statics.field867 - 1] = client.method2539().method7803();
            return 1;
        } else if (arg0 == 6623) {
            class324 var37 = new class324(field871[--Statics.field867]);
            class258 var38 = client.method2539().method7738(var37.field3537, var37.field3536, var37.field3538);
            if (var38 == null) {
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var38.method4727();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method2539().method7835(field871[--Statics.field867]);
            return 1;
        } else if (arg0 == 6625) {
            client.method2539().method7755();
            return 1;
        } else if (arg0 == 6626) {
            client.method2539().method7769(field871[--Statics.field867]);
            return 1;
        } else if (arg0 == 6627) {
            client.method2539().method7770();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field871[--Statics.field867] == 1;
            client.method2539().method7771(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field871[--Statics.field867];
            client.method2539().method7772(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field871[--Statics.field867];
            client.method2539().method7773(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method2539().method7774();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field871[--Statics.field867] == 1;
            client.method2539().method7775(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field867 -= 2;
            int var43 = field871[Statics.field867];
            boolean var44 = field871[Statics.field867 + 1] == 1;
            client.method2539().method7776(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field867 -= 2;
            int var45 = field871[Statics.field867];
            boolean var46 = field871[Statics.field867 + 1] == 1;
            client.method2539().method7777(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field871[++Statics.field867 - 1] = client.method2539().method7861() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.method2539().method7779(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field871[--Statics.field867];
            field871[++Statics.field867 - 1] = client.method2539().method7780(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field867 -= 2;
            int var49 = field871[Statics.field867];
            class324 var50 = new class324(field871[Statics.field867 + 1]);
            class324 var51 = client.method2539().method7783(var49, var50);
            if (var51 == null) {
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var51.method5487();
            }
            return 1;
        } else if (arg0 == 6639) {
            class276 var52 = client.method2539().method7785();
            if (var52 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var52.method4675();
                field871[++Statics.field867 - 1] = var52.field3043.method5487();
            }
            return 1;
        } else if (arg0 == 6640) {
            class276 var53 = client.method2539().method7786();
            if (var53 == null) {
                field871[++Statics.field867 - 1] = -1;
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var53.method4675();
                field871[++Statics.field867 - 1] = var53.field3043.method5487();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field871[--Statics.field867];
            class188 var55 = class188.method3780(var54);
            if (var55.field1917 == null) {
                field872[++Statics.field874 - 1] = "";
            } else {
                field872[++Statics.field874 - 1] = var55.field1917;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field871[--Statics.field867];
            class188 var57 = class188.method3780(var56);
            field871[++Statics.field867 - 1] = var57.field1919;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field871[--Statics.field867];
            class188 var59 = class188.method3780(var58);
            if (var59 == null) {
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var59.field1933;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field871[--Statics.field867];
            class188 var61 = class188.method3780(var60);
            if (var61 == null) {
                field871[++Statics.field867 - 1] = -1;
            } else {
                field871[++Statics.field867 - 1] = var61.field1915;
            }
            return 1;
        } else if (arg0 == 6697) {
            field871[++Statics.field867 - 1] = Statics.field492.field3062;
            return 1;
        } else if (arg0 == 6698) {
            field871[++Statics.field867 - 1] = Statics.field492.field3065.method5487();
            return 1;
        } else if (arg0 == 6699) {
            field871[++Statics.field867 - 1] = Statics.field492.field3064.method5487();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cu.bh(ILdc;ZB)I")
    public static int method1179(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field871[--Statics.field867];
            class196 var4 = class196.method4032(var3);
            field872[++Statics.field874 - 1] = var4 == null ? "" : var4.field2034;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field867 -= 2;
            class196 var5 = class196.method4032(field871[Statics.field867]);
            int var6 = field871[Statics.field867 + 1];
            field871[++Statics.field867 - 1] = var5.method3383(var6);
            field871[++Statics.field867 - 1] = var5.method3389(var6);
            return 1;
        } else if (arg0 == 6765) {
            class196 var7 = class196.method4032(field871[--Statics.field867]);
            field871[++Statics.field867 - 1] = var7 == null ? 0 : var7.field2027;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("de.bl(ILdc;ZI)I")
    public static int method2200(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("gg.bt(ILdc;ZB)I")
    public static int method3071(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ib.by(ILdc;ZB)I")
    public static int method3916(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field871[++Statics.field867 - 1] = client.method2543() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.bg(ILdc;ZI)I")
    public static int method440(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ki.ct(ILdc;ZI)I")
    public static int method5104(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field871[--Statics.field867];
            Object var45 = method2531(var44);
            int var46 = field871[--Statics.field867];
            class508 var47 = client.method7692(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = Statics.method7044(var46);
            Statics.field3057 = var47.method8147(var45, var48);
            if (Statics.field3057 == null) {
                client.field620 = -1;
                Statics.field2303 = null;
                if (arg0 == 7500) {
                    field871[++Statics.field867 - 1] = 0;
                }
            } else {
                client.field620 = class510.method4557(var46);
                Statics.field2303 = Statics.field3057.iterator();
                if (arg0 == 7500) {
                    field871[++Statics.field867 - 1] = Statics.field3057.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field2303 != null && Statics.field2303.hasNext()) {
                field871[++Statics.field867 - 1] = (Integer) Statics.field2303.next();
            } else {
                field871[++Statics.field867 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field867 -= 3;
            int var3 = field871[Statics.field867];
            int var4 = field871[Statics.field867 + 1];
            int var5 = field871[Statics.field867 + 2];
            int var6 = class510.method4557(var4);
            int var7 = class510.method1171(var4);
            int var8 = Statics.method7044(var4);
            class509 var9 = Statics.method7123(var3);
            class507 var10 = class507.method7367(var6);
            int[] var11 = var10.field5041[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8154(var7);
            if (var14 == null && var10.field5043 != null) {
                var14 = var10.field5043[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class504 var17 = class502.method6796(var16);
                    if (class504.field5029 == var17) {
                        field872[++Statics.field874 - 1] = "";
                    } else {
                        field871[++Statics.field867 - 1] = class502.method6029(var16);
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
                class504 var21 = class502.method6796(var11[var19]);
                if (class504.field5029 == var21) {
                    field872[++Statics.field874 - 1] = (String) var14[var20];
                } else {
                    field871[++Statics.field867 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field867 -= 2;
            int var22 = field871[Statics.field867];
            int var23 = field871[Statics.field867 + 1];
            int var24 = 0;
            int var25 = class510.method4557(var23);
            int var26 = class510.method1171(var23);
            class509 var27 = Statics.method7123(var22);
            class507 var28 = class507.method7367(var25);
            int[] var29 = var28.field5041[var26];
            Object[] var30 = var27.method8154(var26);
            if (var30 == null && var28.field5043 != null) {
                var30 = var28.field5043[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field871[++Statics.field867 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field867--;
            int var41 = field871[Statics.field867];
            class508 var42 = client.method3228(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field3057 = var42.method8147(0, 0);
            int var43 = 0;
            if (Statics.field3057 != null) {
                client.field620 = var41;
                Statics.field2303 = Statics.field3057.iterator();
                var43 = Statics.field3057.size();
            }
            if (arg0 == 7504) {
                field871[++Statics.field867 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field871[--Statics.field867];
            class509 var32 = Statics.method7123(var31);
            field871[++Statics.field867 - 1] = var32.field5049;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field871[--Statics.field867];
            int var34 = -1;
            if (Statics.field3057 != null && var33 >= 0 && var33 < Statics.field3057.size()) {
                var34 = (Integer) Statics.field3057.get(var33);
            }
            field871[++Statics.field867 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field871[--Statics.field867];
            Object var36 = method2531(var35);
            int var37 = field871[--Statics.field867];
            class508 var38 = client.method7692(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class510.method4557(var37) != client.field620) {
                throw new RuntimeException();
            } else if (Statics.field3057 == null && Statics.field3057.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = Statics.method7044(var37);
                List var40 = var38.method8147(var36, var39);
                Statics.field3057 = new LinkedList(Statics.field3057);
                if (var40 == null) {
                    Statics.field3057.clear();
                } else {
                    Statics.field3057.retainAll(var40);
                }
                Statics.field2303 = Statics.field3057.iterator();
                if (arg0 == 7507) {
                    field871[++Statics.field867 - 1] = Statics.field3057.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.cf(ILdc;ZB)I")
    public static int method1993(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ca.cz(II)V")
    public static void method1137(int arg0) {
        if (arg0 == -1 || !class333.method2001(arg0)) {
            return;
        }
        class333[] var1 = Statics.field1046[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class333 var3 = var1[var2];
            if (var3.field3723 != null) {
                class88 var4 = new class88();
                var4.field1072 = var3;
                var4.field1076 = var3.field3723;
                method2734(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("oc.cb(ILmr;ZI)V")
    public static void method6307(int arg0, class324 arg1, boolean arg2) {
        class258 var3 = client.method2539().method7899(arg0);
        int var4 = Statics.field1605.field1134;
        int var5 = (Statics.field1605.field1192 >> 7) + Statics.field4295;
        int var6 = (Statics.field1605.field1206 >> 7) + Statics.field1676;
        class324 var7 = new class324(var4, var5, var6);
        client.method2539().method7856(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("fu.cs(Ltm;I)Ljava/lang/Object;")
    public static Object method2965(class504 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5032) {
            case 0:
                return field871[--Statics.field867];
            case 2:
                return field872[--Statics.field874];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("db.cj(IB)Ljava/lang/Object;")
    public static Object method2531(int arg0) {
        return method2965((class504) class374.method2465(class504.method8111(), arg0));
    }
}
