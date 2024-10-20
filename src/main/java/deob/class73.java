package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cs")
public class class73 {

    @ObfuscatedName("cs.aq")
    public static int[] field874 = new int[5];

    @ObfuscatedName("cs.af")
    public static int[][] field875 = new int[5][5000];

    @ObfuscatedName("cs.at")
    public static int[] field870 = new int[1000];

    @ObfuscatedName("cs.ar")
    public static String[] field877 = new String[1000];

    @ObfuscatedName("cs.ad")
    public static int field878 = 0;

    @ObfuscatedName("cs.ah")
    public static class64[] field879 = new class64[50];

    @ObfuscatedName("cs.ao")
    public static Calendar field888 = Calendar.getInstance();

    @ObfuscatedName("cs.as")
    public static final String[] field884 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cs.aj")
    public static boolean field883 = false;

    @ObfuscatedName("cs.av")
    public static boolean field887 = false;

    @ObfuscatedName("cs.aw")
    public static ArrayList field871 = new ArrayList();

    @ObfuscatedName("cs.an")
    public static int field886 = 0;

    @ObfuscatedName("cs.bd")
    public static final double field891 = Math.log(2.0D);

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.ae(Ldo;III)V")
    public static void method2397(class91 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1111;
        class82 var5;
        if (class548.method6962(arg0.field1110)) {
            Statics.field1799 = (class309) var3[0];
            class184 var4 = class184.method3200(Statics.field1799.field3278);
            var5 = class82.method3420(arg0.field1110, var4.field1901, var4.field1908);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class82.method285(var6);
        }
        if (var5 != null) {
            method5599(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("la.ag(Ldo;Ldt;III)V")
    public static void method5599(class91 arg0, class82 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1111;
        Statics.field3297 = 0;
        Statics.field4953 = 0;
        int var5 = -1;
        int[] var6 = arg1.field1034;
        int[] var7 = arg1.field1029;
        byte var8 = -1;
        field878 = 0;
        field883 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            Statics.field872 = new int[arg1.field1031];
            int var11 = 0;
            Statics.field873 = new String[arg1.field1026];
            int var12 = 0;
            for (int var13 = 1; var13 < var4.length; var13++) {
                if (var4[var13] instanceof Integer) {
                    int var14 = (Integer) var4[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1101;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1109;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1112 == null ? -1 : arg0.field1112.field3852;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1103;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1112 == null ? -1 : arg0.field1112.field3991;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1098 == null ? -1 : arg0.field1098.field3852;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1098 == null ? -1 : arg0.field1098.field3991;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1106;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1107;
                    }
                    if (var14 == -2147483638) {
                        var14 = arg0.field1104;
                    }
                    Statics.field872[var11++] = var14;
                } else if (var4[var13] instanceof String) {
                    String var15 = (String) var4[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1108;
                    }
                    Statics.field873[var12++] = var15;
                }
            }
            field886 = arg0.field1100;
            while (true) {
                var10++;
                if (var10 > arg2) {
                    throw new RuntimeException();
                }
                var5++;
                int var59 = var6[var5];
                if (var59 >= 100) {
                    boolean var46;
                    if (arg1.field1029[var5] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    int var47 = method37(var59, arg1, var46);
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
                    field870[++Statics.field3297 - 1] = var7[var5];
                } else if (var59 == 1) {
                    int var16 = var7[var5];
                    field870[++Statics.field3297 - 1] = class351.field3752[var16];
                } else if (var59 == 2) {
                    int var17 = var7[var5];
                    class351.field3752[var17] = field870[--Statics.field3297];
                    Statics.method3283(var17);
                } else if (var59 == 3) {
                    field877[++Statics.field4953 - 1] = arg1.field1037[var5];
                } else if (var59 == 6) {
                    var5 += var7[var5];
                } else if (var59 == 7) {
                    Statics.field3297 -= 2;
                    if (field870[Statics.field3297] != field870[Statics.field3297 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 8) {
                    Statics.field3297 -= 2;
                    if (field870[Statics.field3297] == field870[Statics.field3297 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 9) {
                    Statics.field3297 -= 2;
                    if (field870[Statics.field3297] < field870[Statics.field3297 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 10) {
                    Statics.field3297 -= 2;
                    if (field870[Statics.field3297] > field870[Statics.field3297 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 21) {
                    if (field878 == 0) {
                        return;
                    }
                    class64 var19 = field879[--field878];
                    arg1 = var19.field458;
                    var6 = arg1.field1034;
                    var7 = arg1.field1029;
                    var5 = var19.field457;
                    Statics.field872 = var19.field459;
                    Statics.field873 = var19.field460;
                } else if (var59 == 25) {
                    int var20 = var7[var5];
                    field870[++Statics.field3297 - 1] = class351.method3259(var20);
                } else if (var59 == 27) {
                    int var21 = var7[var5];
                    class351.method3292(var21, field870[--Statics.field3297]);
                } else if (var59 == 31) {
                    Statics.field3297 -= 2;
                    if (field870[Statics.field3297] <= field870[Statics.field3297 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 32) {
                    Statics.field3297 -= 2;
                    if (field870[Statics.field3297] >= field870[Statics.field3297 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 33) {
                    field870[++Statics.field3297 - 1] = Statics.field872[var7[var5]];
                } else if (var59 == 34) {
                    Statics.field872[var7[var5]] = field870[--Statics.field3297];
                } else if (var59 == 35) {
                    field877[++Statics.field4953 - 1] = Statics.field873[var7[var5]];
                } else if (var59 == 36) {
                    Statics.field873[var7[var5]] = field877[--Statics.field4953];
                } else if (var59 == 37) {
                    int var22 = var7[var5];
                    Statics.field4953 -= var22;
                    String var23 = class419.method3437(field877, Statics.field4953, var22);
                    field877[++Statics.field4953 - 1] = var23;
                } else if (var59 == 38) {
                    Statics.field3297--;
                } else if (var59 == 39) {
                    Statics.field4953--;
                } else if (var59 == 40) {
                    int var24 = var7[var5];
                    class82 var25 = class82.method285(var24);
                    int[] var26 = new int[var25.field1031];
                    String[] var27 = new String[var25.field1026];
                    for (int var28 = 0; var28 < var25.field1033; var28++) {
                        var26[var28] = field870[Statics.field3297 - var25.field1033 + var28];
                    }
                    for (int var29 = 0; var29 < var25.field1032; var29++) {
                        var27[var29] = field877[Statics.field4953 - var25.field1032 + var29];
                    }
                    Statics.field3297 -= var25.field1033;
                    Statics.field4953 -= var25.field1032;
                    class64 var30 = new class64();
                    var30.field458 = arg1;
                    var30.field457 = var5;
                    var30.field459 = Statics.field872;
                    var30.field460 = Statics.field873;
                    field879[++field878 - 1] = var30;
                    arg1 = var25;
                    var6 = var25.field1034;
                    var7 = var25.field1029;
                    var5 = -1;
                    Statics.field872 = var26;
                    Statics.field873 = var27;
                } else if (var59 == 42) {
                    field870[++Statics.field3297 - 1] = Statics.field2460.method2891(var7[var5]);
                } else if (var59 == 43) {
                    Statics.field2460.method2913(var7[var5], field870[--Statics.field3297]);
                } else if (var59 == 44) {
                    int var31 = var7[var5] >> 16;
                    int var32 = var7[var5] & 0xFFFF;
                    int var33 = field870[--Statics.field3297];
                    if (var33 < 0 || var33 > 5000) {
                        throw new RuntimeException();
                    }
                    field874[var31] = var33;
                    byte var34 = -1;
                    if (var32 == 105) {
                        var34 = 0;
                    }
                    for (int var35 = 0; var35 < var33; var35++) {
                        field875[var31][var35] = var34;
                    }
                } else if (var59 == 45) {
                    int var36 = var7[var5];
                    int var37 = field870[--Statics.field3297];
                    if (var37 < 0 || var37 >= field874[var36]) {
                        throw new RuntimeException();
                    }
                    field870[++Statics.field3297 - 1] = field875[var36][var37];
                } else if (var59 == 46) {
                    int var38 = var7[var5];
                    Statics.field3297 -= 2;
                    int var39 = field870[Statics.field3297];
                    if (var39 < 0 || var39 >= field874[var38]) {
                        throw new RuntimeException();
                    }
                    field875[var38][var39] = field870[Statics.field3297 + 1];
                } else if (var59 == 47) {
                    String var40 = Statics.field2460.method2877(var7[var5]);
                    if (var40 == null) {
                        var40 = class382.field4298;
                    }
                    field877[++Statics.field4953 - 1] = var40;
                } else if (var59 == 48) {
                    Statics.field2460.method2880(var7[var5], field877[--Statics.field4953]);
                } else if (var59 == 49) {
                    String var41 = Statics.field2460.method2879(var7[var5]);
                    field877[++Statics.field4953 - 1] = var41;
                } else if (var59 == 50) {
                    Statics.field2460.method2885(var7[var5], field877[--Statics.field4953]);
                } else if (var59 == 60) {
                    class523 var42 = arg1.field1039[var7[var5]];
                    class507 var43 = (class507) var42.method8666((long) field870[--Statics.field3297]);
                    if (var43 != null) {
                        var5 += var43.field5120;
                    }
                } else if (var59 == 74) {
                    Integer var44 = Statics.field4027.method3321(var7[var5]);
                    if (var44 == null) {
                        field870[++Statics.field3297 - 1] = -1;
                    } else {
                        field870[++Statics.field3297 - 1] = var44;
                    }
                } else if (var59 == 76) {
                    Integer var45 = Statics.field3065.method8277(var7[var5]);
                    if (var45 == null) {
                        field870[++Statics.field3297 - 1] = -1;
                    } else {
                        field870[++Statics.field3297 - 1] = var45;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var57) {
            var9 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(arg1.field5122).append(" ");
            for (int var51 = field878 - 1; var51 >= 0; var51--) {
                var50.append("").append(field879[var51].field458.field5122).append(" ");
            }
            var50.append("").append(var8);
            class577.method3409(var50.toString(), var57);
        } finally {
            while (field871.size() > 0) {
                class108 var54 = (class108) field871.remove(0);
                client.method4084(var54.method2813(), var54.method2809(), var54.method2810(), var54.method2808(), "");
            }
            if (field883) {
                field883 = false;
                client.method2594();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class577.method3409("Warning: Script " + arg1.field1027 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("af.am(ILdt;ZI)I")
    public static int method37(int arg0, class82 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2946(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method814(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2678(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2200(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3272(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method6143(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method1073(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method1879(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method1847(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method4736(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method1184(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method814(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2678(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2200(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3272(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method6143(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method5139(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method1123(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method1088(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method6023(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method1184(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method5643(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2180(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method5744(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method6031(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method699(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method4735(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method5606(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method6914(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return Statics.method5156(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method6694(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method6893(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3552(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2291(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1881(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method8811(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method3586(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method7899(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method2490(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method2410(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method4984(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method1142(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method7808(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method6033(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method3592(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method3484(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method2201(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method3993(arg0, arg1, arg2);
        } else if (arg0 < 8000) {
            return method2556(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method3104(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("el.ax(ILdt;ZB)I")
    public static int method2946(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field3297 -= 3;
            int var3 = field870[Statics.field3297];
            int var4 = field870[Statics.field3297 + 1];
            int var5 = field870[Statics.field3297 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class363 var6 = Statics.field2371.method6131(var3);
            if (var6.field3951 == null) {
                var6.field3951 = new class363[var5 + 1];
            }
            if (var6.field3951.length <= var5) {
                class363[] var7 = new class363[var5 + 1];
                for (int var8 = 0; var8 < var6.field3951.length; var8++) {
                    var7[var8] = var6.field3951[var8];
                }
                var6.field3951 = var7;
            }
            if (var5 > 0 && var6.field3951[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class363 var9 = new class363();
            var9.field3855 = var4;
            var9.field3872 = var9.field3852 = var6.field3852;
            var9.field3991 = var5;
            var9.field3851 = true;
            if (var4 == 12) {
                var9.method6557();
                var9.method6558().method6479(new class111(var9));
                var9.method6558().method6290(new class112(var9));
            }
            var6.field3951[var5] = var9;
            if (arg2) {
                Statics.field880 = var9;
            } else {
                Statics.field4945 = var9;
            }
            client.method2361(var6);
            return 1;
        } else if (arg0 == 101) {
            class363 var10 = arg2 ? Statics.field880 : Statics.field4945;
            class363 var11 = Statics.field2371.method6131(var10.field3852);
            var11.field3951[var10.field3991] = null;
            client.method2361(var11);
            return 1;
        } else if (arg0 == 102) {
            class363 var12 = Statics.field2371.method6131(field870[--Statics.field3297]);
            var12.field3951 = null;
            client.method2361(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field3297 -= 2;
            int var13 = field870[Statics.field3297];
            int var14 = field870[Statics.field3297 + 1];
            class363 var15 = Statics.field2371.method6130(var13, var14);
            if (var15 == null || var14 == -1) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = 1;
                if (arg2) {
                    Statics.field880 = var15;
                } else {
                    Statics.field4945 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class363 var16 = Statics.field2371.method6131(field870[--Statics.field3297]);
            if (var16 == null) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = 1;
                if (arg2) {
                    Statics.field880 = var16;
                } else {
                    Statics.field4945 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.aq(ILdt;ZI)I")
    public static int method814(int arg0, class82 arg1, boolean arg2) {
        int var3 = -1;
        class363 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field870[--Statics.field3297];
            var4 = Statics.field2371.method6131(var3);
        } else {
            var4 = arg2 ? Statics.field880 : Statics.field4945;
        }
        if (arg0 == 1000) {
            Statics.field3297 -= 4;
            var4.field3862 = field870[Statics.field3297];
            var4.field3844 = field870[Statics.field3297 + 1];
            var4.field3858 = field870[Statics.field3297 + 2];
            var4.field3859 = field870[Statics.field3297 + 3];
            client.method2361(var4);
            Statics.field3.method1238(var4);
            if (var3 != -1 && var4.field3855 == 0) {
                client.method265(Statics.field2371.field3764[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field3297 -= 4;
            var4.field3850 = field870[Statics.field3297];
            var4.field3965 = field870[Statics.field3297 + 1];
            var4.field3860 = field870[Statics.field3297 + 2];
            var4.field3861 = field870[Statics.field3297 + 3];
            client.method2361(var4);
            Statics.field3.method1238(var4);
            if (var3 != -1 && var4.field3855 == 0) {
                client.method265(Statics.field2371.field3764[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field870[--Statics.field3297] == 1;
            if (var4.field3927 != var5) {
                var4.field3927 = var5;
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3936 = field870[--Statics.field3297] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field4003 = field870[--Statics.field3297] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("du.af(ILdt;ZS)I")
    public static int method2678(int arg0, class82 arg1, boolean arg2) {
        int var3 = -1;
        class363 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field870[--Statics.field3297];
            var4 = Statics.field2371.method6131(var3);
        } else {
            var4 = arg2 ? Statics.field880 : Statics.field4945;
        }
        if (arg0 == 1100) {
            Statics.field3297 -= 2;
            int var5 = field870[Statics.field3297];
            int var6 = field870[Statics.field3297 + 1];
            if (var4.field3855 == 12) {
                class361 var7 = var4.method6558();
                if (var7 != null && var7.method6252(var5, var6)) {
                    client.method2361(var4);
                }
            } else {
                var4.field3874 = var5;
                if (var4.field3874 > var4.field3876 - var4.field3868) {
                    var4.field3874 = var4.field3876 - var4.field3868;
                }
                if (var4.field3874 < 0) {
                    var4.field3874 = 0;
                }
                var4.field3875 = var6;
                if (var4.field3875 > var4.field3877 - var4.field3869) {
                    var4.field3875 = var4.field3877 - var4.field3869;
                }
                if (var4.field3875 < 0) {
                    var4.field3875 = 0;
                }
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3997 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3882 = field870[--Statics.field3297] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3884 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3886 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3888 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3891 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3892 = field870[--Statics.field3297] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3897 = 1;
            var4.field3898 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field3297 -= 6;
            var4.field3903 = field870[Statics.field3297];
            var4.field3992 = field870[Statics.field3297 + 1];
            var4.field3916 = field870[Statics.field3297 + 2];
            var4.field3915 = field870[Statics.field3297 + 3];
            var4.field3907 = field870[Statics.field3297 + 4];
            var4.field3908 = field870[Statics.field3297 + 5];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field870[--Statics.field3297];
            if (var4.field3901 != var8) {
                var4.field3901 = var8;
                var4.field3873 = 0;
                var4.field3912 = 0;
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3954 = field870[--Statics.field3297] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field877[--Statics.field4953];
            if (var4.field3855 == 12) {
                class361 var10 = var4.method6558();
                if (var10 != null && var10.method6299()) {
                    var10.method6521(var9);
                } else {
                    var4.field3947 = var9;
                }
                client.method2361(var4);
            } else if (!var9.equals(var4.field3947)) {
                var4.field3947 = var9;
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3841 = field870[--Statics.field3297];
            if (var4.field3855 == 12) {
                class361 var11 = var4.method6558();
                if (var11 != null) {
                    var11.method6259();
                }
            }
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field3297 -= 3;
            if (var4.field3855 == 12) {
                class361 var12 = var4.method6558();
                if (var12 != null) {
                    var12.method6253(field870[Statics.field3297], field870[Statics.field3297 + 1]);
                    var12.method6254(field870[Statics.field3297 + 2]);
                }
            } else {
                var4.field3919 = field870[Statics.field3297];
                var4.field3920 = field870[Statics.field3297 + 1];
                var4.field3918 = field870[Statics.field3297 + 2];
            }
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3921 = field870[--Statics.field3297] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3893 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3994 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3865 = field870[--Statics.field3297] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3896 = field870[--Statics.field3297] == 1;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field3297 -= 2;
            var4.field3876 = field870[Statics.field3297];
            var4.field3877 = field870[Statics.field3297 + 1];
            client.method2361(var4);
            if (var3 != -1 && var4.field3855 == 0) {
                client.method265(Statics.field2371.field3764[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method8779(var4.field3852, var4.field3991);
            client.field686 = var4;
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3889 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3879 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3885 = field870[--Statics.field3297];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field870[--Statics.field3297];
            class563 var14 = (class563) class405.method6719(class563.method2094(), var13);
            if (var14 != null) {
                var4.field3883 = var14;
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field870[--Statics.field3297] == 1;
            var4.field3887 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field870[--Statics.field3297] == 1;
            var4.field3913 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3890 = field877[--Statics.field4953];
            client.method2361(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6628(field877[--Statics.field4953], "", Statics.field71, client.method3266());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field3297 -= 2;
            var4.method6544(field870[Statics.field3297], field870[Statics.field3297 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6545(field877[--Statics.field4953], field870[--Statics.field3297]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field3297--;
            class355 var17 = var4.method6593();
            if (var17 != null) {
                var17.field3775 = field870[Statics.field3297];
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field3297--;
            class355 var18 = var4.method6593();
            if (var18 != null) {
                var18.field3772 = field870[Statics.field3297];
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field4953--;
            class361 var19 = var4.method6558();
            if (var19 != null) {
                var4.field3894 = field877[Statics.field4953];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field3297--;
            class355 var20 = var4.method6593();
            if (var20 != null) {
                var20.field3773 = field870[Statics.field3297];
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field3297--;
            class361 var21 = var4.method6558();
            if (var21 != null && var21.method6415(field870[Statics.field3297])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field3297--;
            class361 var22 = var4.method6558();
            if (var22 != null && var22.method6250(field870[Statics.field3297])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field3297--;
            class361 var23 = var4.method6558();
            if (var23 != null && var23.method6285(field870[Statics.field3297])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field870[--Statics.field3297] == 1;
            client.field680.method5060();
            class361 var25 = var4.method6558();
            if (var25 != null && var25.method6243(var24)) {
                if (var24) {
                    client.field680.method5057(var4);
                }
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field870[--Statics.field3297] == 1;
            if (!var26 && client.field680.method5059() == var4) {
                client.field680.method5060();
                client.method2361(var4);
            }
            class361 var27 = var4.method6558();
            if (var27 != null) {
                var27.method6244(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field3297 -= 2;
            class361 var28 = var4.method6558();
            if (var28 != null && var28.method6267(field870[Statics.field3297], field870[Statics.field3297 + 1])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field3297--;
            class361 var29 = var4.method6558();
            if (var29 != null && var29.method6267(field870[Statics.field3297], field870[Statics.field3297])) {
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field3297--;
            class361 var30 = var4.method6558();
            if (var30 != null) {
                var30.method6256(field870[Statics.field3297]);
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field3297--;
            class361 var31 = var4.method6558();
            if (var31 != null) {
                var31.method6507(field870[Statics.field3297]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field3297--;
            class361 var32 = var4.method6558();
            if (var32 != null) {
                var32.method6298(field870[Statics.field3297]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field3297--;
            class361 var33 = var4.method6558();
            if (var33 != null) {
                var33.method6452(field870[Statics.field3297]);
                client.method2361(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field3297 -= 2;
            class28 var34 = var4.method6560();
            if (var34 != null) {
                var34.method372(field870[Statics.field3297], field870[Statics.field3297 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field3297 -= 2;
            class28 var35 = var4.method6560();
            if (var35 != null) {
                var35.method373((char) field870[Statics.field3297], field870[Statics.field3297 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6542(field877[--Statics.field4953], Statics.field71);
            return 1;
        } else if (arg0 == 1151) {
            Statics.field4953 -= 3;
            String var36 = field877[Statics.field4953];
            String var37 = field877[Statics.field4953 + 1];
            String var38 = field877[Statics.field4953 + 2];
            long var39 = client.method3266();
            long var41 = client.method8834();
            String var43 = client.method2393().method8389(client.method2393().field5135);
            if (var39 != -1L) {
                var36 = var36.replaceAll("%userid%", Long.toString(var39));
            }
            if (var41 != -1L) {
                var36 = var36.replaceAll("%userhash%", Long.toString(var41));
            }
            if (!var43.isEmpty()) {
                var36 = var36.replaceAll("%deviceid%", var43);
            }
            var4.method6541(var36, var37, var38, var43, Long.toString(var41), Statics.field71);
            return 1;
        } else if (arg0 != 1152) {
            return 2;
        } else if (var4.field3855 == 11) {
            class217 var44 = var4.method6589();
            boolean var45 = var44 != null && var44.method4057() && class226.method2488().method4143(var44.method4038());
            field870[++Statics.field3297 - 1] = var45 ? 1 : 0;
            return 1;
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ce.at(ILdt;ZS)I")
    public static int method2200(int arg0, class82 arg1, boolean arg2) {
        class363 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field2371.method6131(field870[--Statics.field3297]);
        } else {
            var3 = arg2 ? Statics.field880 : Statics.field4945;
        }
        client.method2361(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field3297 -= 2;
            int var9 = field870[Statics.field3297];
            int var10 = field870[Statics.field3297 + 1];
            var3.field3960 = var9;
            var3.field3989 = var10;
            class211 var11 = class211.method2414(var9);
            var3.field3916 = var11.field2242;
            var3.field3915 = var11.field2243;
            var3.field3907 = var11.field2244;
            var3.field3903 = var11.field2245;
            var3.field3992 = var11.field2250;
            var3.field3908 = var11.field2241;
            if (arg0 == 1205) {
                var3.field3914 = 0;
            } else if (arg0 == 1212 | var11.field2247 == 1) {
                var3.field3914 = 1;
            } else {
                var3.field3914 = 2;
            }
            if (var3.field3909 > 0) {
                var3.field3908 = var3.field3908 * 32 / var3.field3909;
            } else if (var3.field3850 > 0) {
                var3.field3908 = var3.field3908 * 32 / var3.field3850;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3897 = 2;
            var3.field3898 = field870[--Statics.field3297];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3897 = 3;
            var3.field3898 = Statics.field4826.field1170.method6179();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field870[--Statics.field3297] == 1;
            var3.method6564(Statics.field4826.field1170, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field870[--Statics.field3297];
            if (var3.field3911 == null) {
                throw new RuntimeException("");
            }
            var3.field3911.method6184(var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field3297 -= 2;
            int var6 = field870[Statics.field3297];
            int var7 = field870[Statics.field3297 + 1];
            if (var3.field3911 == null) {
                throw new RuntimeException("");
            }
            var3.field3911.method6183(var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field870[--Statics.field3297];
            if (var3.field3911 == null) {
                throw new RuntimeException("");
            }
            var3.field3911.method6181(Statics.field4826.field1170.field3796, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fy.au(ILdt;ZI)I")
    public static int method3272(int arg0, class82 arg1, boolean arg2) {
        boolean var3 = true;
        class363 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.field2371.method6131(field870[--Statics.field3297]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field880 : Statics.field4945;
        }
        if (arg0 == 1300) {
            int var5 = field870[--Statics.field3297] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method6537(var5, field877[--Statics.field4953]);
                return 1;
            } else {
                Statics.field4953--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field3297 -= 2;
            int var6 = field870[Statics.field3297];
            int var7 = field870[Statics.field3297 + 1];
            var4.field3937 = Statics.field2371.method6130(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3923 = field870[--Statics.field3297] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3938 = field870[--Statics.field3297];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3941 = field870[--Statics.field3297];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3946 = field877[--Statics.field4953];
            return 1;
        } else if (arg0 == 1306) {
            var4.field4004 = field877[--Statics.field4953];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3934 = null;
            var4.field3899 = (String[][]) null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3924 = field870[--Statics.field3297] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field3297--;
            return 1;
        } else if (arg0 == 1310) {
            int var8 = field870[--Statics.field3297] - 1;
            if (var8 < 0 || var8 > 9 || var4.field3899 == null) {
                return 1;
            } else {
                var4.field3899[var8] = null;
                return 1;
            }
        } else if (arg0 == 1311) {
            int var9 = field870[--Statics.field3297] - 1;
            int var10 = field870[--Statics.field3297] - 1;
            if (var10 < 0 || var10 > 9 || var9 < 0) {
                throw new RuntimeException();
            }
            var4.method6655(var10, var9, field877[--Statics.field4953]);
            return 1;
        } else if (arg0 == 1312) {
            int var11 = field870[--Statics.field3297];
            if (var11 == -1) {
                var4.field3969 = 4;
            } else if (var11 >= 1 && var11 <= 10) {
                var4.field3969 = var11 - 1;
            }
            return 1;
        } else if (arg0 == 1350) {
            byte[] var12 = null;
            byte[] var13 = null;
            if (var3) {
                Statics.field3297 -= 10;
                int var14;
                for (var14 = 0; var14 < 10 && field870[Statics.field3297 + var14] >= 0; var14 += 2) {
                }
                if (var14 > 0) {
                    var12 = new byte[var14 / 2];
                    var13 = new byte[var14 / 2];
                    for (var14 -= 2; var14 >= 0; var14 -= 2) {
                        var12[var14 / 2] = (byte) field870[Statics.field3297 + var14];
                        var13[var14 / 2] = (byte) field870[Statics.field3297 + var14 + 1];
                    }
                }
            } else {
                Statics.field3297 -= 2;
                var12 = new byte[] { (byte) field870[Statics.field3297] };
                var13 = new byte[] { (byte) field870[Statics.field3297 + 1] };
            }
            int var15 = field870[--Statics.field3297] - 1;
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method2360(var4, var15, var12, var13);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field3297 -= 2;
            byte var16 = 10;
            byte[] var17 = new byte[] { (byte) field870[Statics.field3297] };
            byte[] var18 = new byte[] { (byte) field870[Statics.field3297 + 1] };
            method2360(var4, var16, var17, var18);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field3297 -= 3;
            int var19 = field870[Statics.field3297] - 1;
            int var20 = field870[Statics.field3297 + 1];
            int var21 = field870[Statics.field3297 + 2];
            if (var19 < 0 || var19 > 9) {
                throw new RuntimeException();
            }
            method2416(var4, var19, var20, var21);
            return 1;
        } else if (arg0 == 1353) {
            byte var22 = 10;
            int var23 = field870[--Statics.field3297];
            int var24 = field870[--Statics.field3297];
            method2416(var4, var22, var23, var24);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field3297--;
            int var25 = field870[Statics.field3297] - 1;
            if (var25 < 0 || var25 > 9) {
                throw new RuntimeException();
            }
            method2721(var4, var25);
            return 1;
        } else if (arg0 == 1355) {
            byte var26 = 10;
            method2721(var4, var26);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("db.ar(Lny;I[B[BI)V")
    public static final void method2360(class363 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3929 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3929 = new byte[11][];
            arg0.field3930 = new byte[11][];
            arg0.field3932 = new int[11];
            arg0.field3998 = new int[11];
        }
        arg0.field3929[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3853 = false;
            for (int var4 = 0; var4 < arg0.field3929.length; var4++) {
                if (arg0.field3929[var4] != null) {
                    arg0.field3853 = true;
                    break;
                }
            }
        } else {
            arg0.field3853 = true;
        }
        arg0.field3930[arg1] = arg3;
    }

    @ObfuscatedName("dm.al(Lny;IIII)V")
    public static final void method2416(class363 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3932 == null) {
            throw new RuntimeException();
        }
        arg0.field3932[arg1] = arg2;
        arg0.field3998[arg1] = arg3;
    }

    @ObfuscatedName("dd.ad(Lny;IB)V")
    public static final void method2721(class363 arg0, int arg1) {
        if (arg0.field3929 == null) {
            throw new RuntimeException();
        }
        if (arg0.field4001 == null) {
            arg0.field4001 = new int[arg0.field3929.length];
        }
        arg0.field4001[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("na.ah(ILdt;ZB)I")
    public static int method6143(int arg0, class82 arg1, boolean arg2) {
        class363 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field2371.method6131(field870[--Statics.field3297]);
        } else {
            var3 = arg2 ? Statics.field880 : Statics.field4945;
        }
        String var4 = field877[--Statics.field4953];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field870[--Statics.field3297];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field870[--Statics.field3297];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field877[--Statics.field4953];
            } else {
                var7[var8] = Integer.valueOf(field870[--Statics.field3297]);
            }
        }
        int var9 = field870[--Statics.field3297];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3944 = var7;
        } else if (arg0 == 1401) {
            var3.field3977 = var7;
        } else if (arg0 == 1402) {
            var3.field3933 = var7;
        } else if (arg0 == 1403) {
            var3.field3948 = var7;
        } else if (arg0 == 1404) {
            var3.field3950 = var7;
        } else if (arg0 == 1405) {
            var3.field3847 = var7;
        } else if (arg0 == 1406) {
            var3.field3904 = var7;
        } else if (arg0 == 1407) {
            var3.field3958 = var7;
            var3.field3956 = var5;
        } else if (arg0 == 1408) {
            var3.field3961 = var7;
        } else if (arg0 == 1409) {
            var3.field3962 = var7;
        } else if (arg0 == 1410) {
            var3.field3931 = var7;
        } else if (arg0 == 1411) {
            var3.field3945 = var7;
        } else if (arg0 == 1412) {
            var3.field3949 = var7;
        } else if (arg0 == 1414) {
            var3.field3957 = var7;
            var3.field3905 = var5;
        } else if (arg0 == 1415) {
            var3.field3959 = var7;
            var3.field3928 = var5;
        } else if (arg0 == 1416) {
            var3.field3953 = var7;
        } else if (arg0 == 1417) {
            var3.field3963 = var7;
        } else if (arg0 == 1418) {
            var3.field3867 = var7;
        } else if (arg0 == 1419) {
            var3.field3966 = var7;
        } else if (arg0 == 1420) {
            var3.field3990 = var7;
        } else if (arg0 == 1421) {
            var3.field3970 = var7;
        } else if (arg0 == 1422) {
            var3.field3848 = var7;
        } else if (arg0 == 1423) {
            var3.field3974 = var7;
        } else if (arg0 == 1424) {
            var3.field3975 = var7;
        } else if (arg0 == 1425) {
            var3.field3902 = var7;
        } else if (arg0 == 1426) {
            var3.field3964 = var7;
        } else if (arg0 == 1427) {
            var3.field3895 = var7;
        } else if (arg0 == 1428) {
            var3.field3971 = var7;
        } else if (arg0 == 1429) {
            var3.field3972 = var7;
        } else if (arg0 == 1430) {
            var3.field3967 = var7;
        } else if (arg0 == 1431) {
            var3.field3968 = var7;
        } else if (arg0 == 1434) {
            var3.field3906 = var7;
        } else if (arg0 == 1435) {
            var3.field3983 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class359 var10 = var3.method6561();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3788 = var7;
                } else if (arg0 == 1437) {
                    var10.field3785 = var7;
                } else if (arg0 == 1438) {
                    var10.field3789 = var7;
                } else if (arg0 == 1439) {
                    var10.field3787 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3942 = true;
        return 1;
    }

    @ObfuscatedName("cj.ap(ILdt;ZI)I")
    public static int method1073(int arg0, class82 arg1, boolean arg2) {
        class363 var3 = arg2 ? Statics.field880 : Statics.field4945;
        if (arg0 == 1500) {
            field870[++Statics.field3297 - 1] = var3.field3866;
            return 1;
        } else if (arg0 == 1501) {
            field870[++Statics.field3297 - 1] = var3.field3863;
            return 1;
        } else if (arg0 == 1502) {
            field870[++Statics.field3297 - 1] = var3.field3868;
            return 1;
        } else if (arg0 == 1503) {
            field870[++Statics.field3297 - 1] = var3.field3869;
            return 1;
        } else if (arg0 == 1504) {
            field870[++Statics.field3297 - 1] = var3.field3927 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field870[++Statics.field3297 - 1] = var3.field3872;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cr.ab(ILdt;ZI)I")
    public static int method1879(int arg0, class82 arg1, boolean arg2) {
        class363 var3 = arg2 ? Statics.field880 : Statics.field4945;
        if (arg0 == 1600) {
            field870[++Statics.field3297 - 1] = var3.field3874;
            return 1;
        } else if (arg0 == 1601) {
            field870[++Statics.field3297 - 1] = var3.field3875;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3855 == 12) {
                class361 var4 = var3.method6558();
                if (var4 != null) {
                    field877[++Statics.field4953 - 1] = var4.method6338().method7599();
                    return 1;
                }
            }
            field877[++Statics.field4953 - 1] = var3.field3947;
            return 1;
        } else if (arg0 == 1603) {
            field870[++Statics.field3297 - 1] = var3.field3876;
            return 1;
        } else if (arg0 == 1604) {
            field870[++Statics.field3297 - 1] = var3.field3877;
            return 1;
        } else if (arg0 == 1605) {
            field870[++Statics.field3297 - 1] = var3.field3908;
            return 1;
        } else if (arg0 == 1606) {
            field870[++Statics.field3297 - 1] = var3.field3916;
            return 1;
        } else if (arg0 == 1607) {
            field870[++Statics.field3297 - 1] = var3.field3907;
            return 1;
        } else if (arg0 == 1608) {
            field870[++Statics.field3297 - 1] = var3.field3915;
            return 1;
        } else if (arg0 == 1609) {
            field870[++Statics.field3297 - 1] = var3.field3884;
            return 1;
        } else if (arg0 == 1610) {
            field870[++Statics.field3297 - 1] = var3.field3885;
            return 1;
        } else if (arg0 == 1611) {
            field870[++Statics.field3297 - 1] = var3.field3997;
            return 1;
        } else if (arg0 == 1612) {
            field870[++Statics.field3297 - 1] = var3.field3879;
            return 1;
        } else if (arg0 == 1613) {
            field870[++Statics.field3297 - 1] = var3.field3883.method32();
            return 1;
        } else if (arg0 == 1614) {
            field870[++Statics.field3297 - 1] = var3.field3913 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class355 var5 = var3.method6593();
                field870[++Statics.field3297 - 1] = var5 == null ? 0 : var5.field3775;
            }
            if (arg0 == 1618) {
                class355 var6 = var3.method6593();
                field870[++Statics.field3297 - 1] = var6 == null ? 0 : var6.field3772;
                return 1;
            } else if (arg0 == 1619) {
                class361 var7 = var3.method6558();
                field877[++Statics.field4953 - 1] = var7 == null ? "" : var7.method6292().method7599();
                return 1;
            } else if (arg0 == 1620) {
                class355 var8 = var3.method6593();
                field870[++Statics.field3297 - 1] = var8 == null ? 0 : var8.field3773;
                return 1;
            } else if (arg0 == 1621) {
                class361 var9 = var3.method6558();
                field870[++Statics.field3297 - 1] = var9 == null ? 0 : var9.method6413();
                return 1;
            } else if (arg0 == 1622) {
                class361 var10 = var3.method6558();
                field870[++Statics.field3297 - 1] = var10 == null ? 0 : var10.method6303();
                return 1;
            } else if (arg0 == 1623) {
                class361 var11 = var3.method6558();
                field870[++Statics.field3297 - 1] = var11 == null ? 0 : var11.method6501();
                return 1;
            } else if (arg0 == 1624) {
                class361 var12 = var3.method6558();
                field870[++Statics.field3297 - 1] = var12 != null && var12.method6294() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class361 var13 = var3.method6558();
                field870[++Statics.field3297 - 1] = var13 != null && var13.method6295() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class361 var14 = var3.method6558();
                field877[++Statics.field4953 - 1] = var14 == null ? "" : var14.method6293().method7771();
                return 1;
            } else if (arg0 == 1627) {
                class361 var15 = var3.method6558();
                int var16 = var15 == null ? 0 : var15.method6377();
                int var17 = var15 == null ? 0 : var15.method6297();
                field870[++Statics.field3297 - 1] = Math.min(var16, var17);
                field870[++Statics.field3297 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class361 var18 = var3.method6558();
                field870[++Statics.field3297 - 1] = var18 == null ? 0 : var18.method6297();
                return 1;
            } else if (arg0 == 1629) {
                class361 var19 = var3.method6558();
                field870[++Statics.field3297 - 1] = var19 == null ? 0 : var19.method6383();
                return 1;
            } else if (arg0 == 1630) {
                class361 var20 = var3.method6558();
                field870[++Statics.field3297 - 1] = var20 == null ? 0 : var20.method6305();
                return 1;
            } else if (arg0 == 1631) {
                class361 var21 = var3.method6558();
                field870[++Statics.field3297 - 1] = var21 == null ? 0 : var21.method6307();
                return 1;
            } else if (arg0 == 1632) {
                class361 var22 = var3.method6558();
                field870[++Statics.field3297 - 1] = var22 == null ? 0 : var22.method6342();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method6560();
                field870[Statics.field3297 - 1] = var23 == null ? 0 : var23.method374(field870[Statics.field3297 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method6560();
                field870[Statics.field3297 - 1] = var24 == null ? 0 : var24.method385((char) field870[Statics.field3297 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("cr.az(ILdt;ZI)I")
    public static int method1847(int arg0, class82 arg1, boolean arg2) {
        class363 var3 = arg2 ? Statics.field880 : Statics.field4945;
        if (arg0 == 1700) {
            field870[++Statics.field3297 - 1] = var3.field3960;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3960 == -1) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = var3.field3989;
            }
            return 1;
        } else if (arg0 == 1702) {
            field870[++Statics.field3297 - 1] = var3.field3991;
            return 1;
        } else if (arg0 == 1707) {
            field870[++Statics.field3297 - 1] = var3.method6547() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method4129(var3);
        } else if (arg0 == 1709) {
            return Statics.method6966(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iv.aa(Lny;I)I")
    public static int method4129(class363 arg0) {
        if (arg0.field3855 == 11) {
            String var1 = field877[--Statics.field4953];
            field870[++Statics.field3297 - 1] = arg0.method6548(var1);
            return 1;
        } else {
            Statics.field4953--;
            field870[++Statics.field3297 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("jn.ao(ILdt;ZI)I")
    public static int method4736(int arg0, class82 arg1, boolean arg2) {
        class363 var3 = arg2 ? Statics.field880 : Statics.field4945;
        if (arg0 == 1800) {
            field870[++Statics.field3297 - 1] = Statics.method8637(client.method5697(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field870[--Statics.field3297];
            int var5 = var4 - 1;
            if (var3.field3934 == null || var5 >= var3.field3934.length || var3.field3934[var5] == null) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = var3.field3934[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3946 == null) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = var3.field3946;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.as(ILdt;ZI)I")
    public static int method1184(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field886 >= 10) {
                throw new RuntimeException();
            }
            class363 var10;
            if (arg0 >= 2000) {
                var10 = Statics.field2371.method6131(field870[--Statics.field3297]);
            } else {
                var10 = arg2 ? Statics.field880 : Statics.field4945;
            }
            if (var10.field3895 == null) {
                return 0;
            }
            class91 var11 = new class91();
            var11.field1112 = var10;
            var11.field1111 = var10.field3895;
            var11.field1100 = field886 + 1;
            client.field724.method7051(var11);
            return 1;
        } else if (arg0 == 1928) {
            class363 var3 = arg2 ? Statics.field880 : Statics.field4945;
            int var4 = field870[--Statics.field3297];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class108 var5 = new class108(var4, var3.field3852, var3.field3991, var3.field3960);
            field871.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field3297 -= 3;
            int var6 = field870[Statics.field3297];
            int var7 = field870[Statics.field3297 + 1];
            int var8 = field870[Statics.field3297 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class108 var9 = new class108(var8, var6, var7, Statics.field2371.method6131(var6).field3960);
            field871.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kx.ay(ILdt;ZI)I")
    public static int method5139(int arg0, class82 arg1, boolean arg2) {
        class363 var3 = Statics.field2371.method6131(field870[--Statics.field3297]);
        if (arg0 == 2500) {
            field870[++Statics.field3297 - 1] = var3.field3866;
            return 1;
        } else if (arg0 == 2501) {
            field870[++Statics.field3297 - 1] = var3.field3863;
            return 1;
        } else if (arg0 == 2502) {
            field870[++Statics.field3297 - 1] = var3.field3868;
            return 1;
        } else if (arg0 == 2503) {
            field870[++Statics.field3297 - 1] = var3.field3869;
            return 1;
        } else if (arg0 == 2504) {
            field870[++Statics.field3297 - 1] = var3.field3927 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field870[++Statics.field3297 - 1] = var3.field3872;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cy.aj(ILdt;ZB)I")
    public static int method1123(int arg0, class82 arg1, boolean arg2) {
        class363 var3 = Statics.field2371.method6131(field870[--Statics.field3297]);
        if (arg0 == 2600) {
            field870[++Statics.field3297 - 1] = var3.field3874;
            return 1;
        } else if (arg0 == 2601) {
            field870[++Statics.field3297 - 1] = var3.field3875;
            return 1;
        } else if (arg0 == 2602) {
            field877[++Statics.field4953 - 1] = var3.field3947;
            return 1;
        } else if (arg0 == 2603) {
            field870[++Statics.field3297 - 1] = var3.field3876;
            return 1;
        } else if (arg0 == 2604) {
            field870[++Statics.field3297 - 1] = var3.field3877;
            return 1;
        } else if (arg0 == 2605) {
            field870[++Statics.field3297 - 1] = var3.field3908;
            return 1;
        } else if (arg0 == 2606) {
            field870[++Statics.field3297 - 1] = var3.field3916;
            return 1;
        } else if (arg0 == 2607) {
            field870[++Statics.field3297 - 1] = var3.field3907;
            return 1;
        } else if (arg0 == 2608) {
            field870[++Statics.field3297 - 1] = var3.field3915;
            return 1;
        } else if (arg0 == 2609) {
            field870[++Statics.field3297 - 1] = var3.field3884;
            return 1;
        } else if (arg0 == 2610) {
            field870[++Statics.field3297 - 1] = var3.field3885;
            return 1;
        } else if (arg0 == 2611) {
            field870[++Statics.field3297 - 1] = var3.field3997;
            return 1;
        } else if (arg0 == 2612) {
            field870[++Statics.field3297 - 1] = var3.field3879;
            return 1;
        } else if (arg0 == 2613) {
            field870[++Statics.field3297 - 1] = var3.field3883.method32();
            return 1;
        } else if (arg0 == 2614) {
            field870[++Statics.field3297 - 1] = var3.field3913 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class355 var4 = var3.method6593();
                field870[++Statics.field3297 - 1] = var4 == null ? 0 : var4.field3775;
            }
            if (arg0 == 2618) {
                class355 var5 = var3.method6593();
                field870[++Statics.field3297 - 1] = var5 == null ? 0 : var5.field3772;
                return 1;
            } else if (arg0 == 2619) {
                class361 var6 = var3.method6558();
                field877[++Statics.field4953 - 1] = var6 == null ? "" : var6.method6292().method7599();
                return 1;
            } else if (arg0 == 2620) {
                class355 var7 = var3.method6593();
                field870[++Statics.field3297 - 1] = var7 == null ? 0 : var7.field3773;
                return 1;
            } else if (arg0 == 2621) {
                class361 var8 = var3.method6558();
                field870[++Statics.field3297 - 1] = var8 == null ? 0 : var8.method6413();
                return 1;
            } else if (arg0 == 2622) {
                class361 var9 = var3.method6558();
                field870[++Statics.field3297 - 1] = var9 == null ? 0 : var9.method6303();
                return 1;
            } else if (arg0 == 2623) {
                class361 var10 = var3.method6558();
                field870[++Statics.field3297 - 1] = var10 == null ? 0 : var10.method6501();
                return 1;
            } else if (arg0 == 2624) {
                class361 var11 = var3.method6558();
                field870[++Statics.field3297 - 1] = var11 != null && var11.method6294() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class361 var12 = var3.method6558();
                field870[++Statics.field3297 - 1] = var12 != null && var12.method6295() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class361 var13 = var3.method6558();
                field877[++Statics.field4953 - 1] = var13 == null ? "" : var13.method6293().method7771();
                return 1;
            } else if (arg0 == 2627) {
                class361 var14 = var3.method6558();
                int var15 = var14 == null ? 0 : var14.method6377();
                int var16 = var14 == null ? 0 : var14.method6297();
                field870[++Statics.field3297 - 1] = Math.min(var15, var16);
                field870[++Statics.field3297 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class361 var17 = var3.method6558();
                field870[++Statics.field3297 - 1] = var17 == null ? 0 : var17.method6297();
                return 1;
            } else if (arg0 == 2629) {
                class361 var18 = var3.method6558();
                field870[++Statics.field3297 - 1] = var18 == null ? 0 : var18.method6383();
                return 1;
            } else if (arg0 == 2630) {
                class361 var19 = var3.method6558();
                field870[++Statics.field3297 - 1] = var19 == null ? 0 : var19.method6305();
                return 1;
            } else if (arg0 == 2631) {
                class361 var20 = var3.method6558();
                field870[++Statics.field3297 - 1] = var20 == null ? 0 : var20.method6307();
                return 1;
            } else if (arg0 == 2632) {
                class361 var21 = var3.method6558();
                field870[++Statics.field3297 - 1] = var21 == null ? 0 : var21.method6342();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method6560();
                field870[Statics.field3297 - 1] = var22 == null ? 0 : var22.method374(field870[Statics.field3297 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method6560();
                field870[Statics.field3297 - 1] = var23 == null ? 0 : var23.method385((char) field870[Statics.field3297 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("cj.av(ILdt;ZI)I")
    public static int method1088(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class363 var3 = Statics.field2371.method6131(field870[--Statics.field3297]);
            field870[++Statics.field3297 - 1] = var3.field3960;
            return 1;
        } else if (arg0 == 2701) {
            class363 var4 = Statics.field2371.method6131(field870[--Statics.field3297]);
            if (var4.field3960 == -1) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = var4.field3989;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field870[--Statics.field3297];
            class90 var6 = (class90) client.field682.method8688((long) var5);
            if (var6 == null) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field870[++Statics.field3297 - 1] = client.field681;
            return 1;
        } else if (arg0 == 2707) {
            class363 var7 = Statics.field2371.method6131(field870[--Statics.field3297]);
            field870[++Statics.field3297 - 1] = var7.method6547() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class363 var8 = Statics.field2371.method6131(field870[--Statics.field3297]);
            return method4129(var8);
        } else if (arg0 == 2709) {
            class363 var9 = Statics.field2371.method6131(field870[--Statics.field3297]);
            return Statics.method6966(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nt.aw(ILdt;ZB)I")
    public static int method6023(int arg0, class82 arg1, boolean arg2) {
        class363 var3 = Statics.field2371.method6131(field870[--Statics.field3297]);
        if (arg0 == 2800) {
            field870[++Statics.field3297 - 1] = Statics.method8637(client.method5697(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field870[--Statics.field3297];
            int var5 = var4 - 1;
            if (var3.field3934 == null || var5 >= var3.field3934.length || var3.field3934[var5] == null) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = var3.field3934[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3946 == null) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = var3.field3946;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lh.an(ILdt;ZI)I")
    public static int method5643(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field877[--Statics.field4953];
            class116.method3755(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field3297 -= 2;
            client.method5196(Statics.field4826, field870[Statics.field3297], field870[Statics.field3297 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field887) {
                field883 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field877[--Statics.field4953];
            int var5 = 0;
            if (class419.method4011(var4)) {
                var5 = class419.method4086(var4);
            }
            class326 var6 = class326.method3199(class324.field3399, client.field582.field1486);
            var6.field3426.method8960(var5);
            client.field582.method2943(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field877[--Statics.field4953];
            class326 var8 = class326.method3199(class324.field3343, client.field582.field1486);
            var8.field3426.method9022(var7.length() + 1);
            var8.field3426.method8964(var7);
            client.field582.method2943(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field877[--Statics.field4953];
            class326 var10 = class326.method3199(class324.field3320, client.field582.field1486);
            var10.field3426.method9022(var9.length() + 1);
            var10.field3426.method8964(var9);
            client.field582.method2943(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field870[--Statics.field3297];
            String var12 = field877[--Statics.field4953];
            Statics.method3411(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field3297 -= 3;
            int var13 = field870[Statics.field3297];
            int var14 = field870[Statics.field3297 + 1];
            int var15 = field870[Statics.field3297 + 2];
            class363 var16 = Statics.field2371.method6131(var15);
            client.method1208(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field3297 -= 2;
            int var17 = field870[Statics.field3297];
            int var18 = field870[Statics.field3297 + 1];
            class363 var19 = arg2 ? Statics.field880 : Statics.field4945;
            client.method1208(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1474 = field870[--Statics.field3297] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field870[++Statics.field3297 - 1] = Statics.field4929.method2695() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field4929.method2597(field870[--Statics.field3297] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field877[--Statics.field4953];
            boolean var21 = field870[--Statics.field3297] == 1;
            class32.method3941(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field870[--Statics.field3297];
            class326 var23 = class326.method3199(class324.field3379, client.field582.field1486);
            var23.field3426.method8958(var22);
            client.field582.method2943(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field870[--Statics.field3297];
            Statics.field4953 -= 2;
            String var25 = field877[Statics.field4953];
            String var26 = field877[Statics.field4953 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class326 var27 = class326.method3199(class324.field3365, client.field582.field1486);
                var27.field3426.method8958(1 + class551.method8819(var25) + class551.method8819(var26));
                var27.field3426.method8964(var25);
                var27.field3426.method8964(var26);
                var27.field3426.method9069(var24);
                client.field582.method2943(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field3297--;
            return 1;
        } else if (arg0 == 3118) {
            client.field669 = field870[--Statics.field3297] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field651 = field870[--Statics.field3297] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field870[--Statics.field3297] == 1) {
                client.field584 |= 0x1;
            } else {
                client.field584 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field870[--Statics.field3297] == 1) {
                client.field584 |= 0x2;
            } else {
                client.field584 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field870[--Statics.field3297] == 1) {
                client.field584 |= 0x4;
            } else {
                client.field584 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field870[--Statics.field3297] == 1) {
                client.field584 |= 0x8;
            } else {
                client.field584 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field584 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field642 = field870[--Statics.field3297] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field644 = field870[--Statics.field3297] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3413(field870[--Statics.field3297] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field870[++Statics.field3297 - 1] = client.method3284() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field3297 -= 2;
            client.field617 = field870[Statics.field3297];
            client.field623 = field870[Statics.field3297 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field3297 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field3297--;
            return 1;
        } else if (arg0 == 3132) {
            field870[++Statics.field3297 - 1] = Statics.field1721;
            field870[++Statics.field3297 - 1] = Statics.field1500;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field3297--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field3297 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field683 = 3;
            client.field630 = field870[--Statics.field3297];
            return 1;
        } else if (arg0 == 3137) {
            client.field683 = 2;
            client.field630 = field870[--Statics.field3297];
            return 1;
        } else if (arg0 == 3138) {
            client.field683 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field683 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field683 = 3;
            client.field630 = arg2 ? Statics.field880.field3852 : Statics.field4945.field3852;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field870[--Statics.field3297] == 1;
            Statics.field4929.method2656(var28);
            return 1;
        } else if (arg0 == 3142) {
            field870[++Statics.field3297 - 1] = Statics.field4929.method2604() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field870[--Statics.field3297] == 1;
            client.field573 = var29;
            if (!var29) {
                Statics.field4929.method2620("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field870[++Statics.field3297 - 1] = client.field573 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field870[--Statics.field3297] == 1;
            Statics.field4929.method2605(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field870[++Statics.field3297 - 1] = Statics.field4929.method2632() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field870[++Statics.field3297 - 1] = class79.field953;
            return 1;
        } else if (arg0 == 3154) {
            field870[++Statics.field3297 - 1] = client.method2851();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field4953--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field3297 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field3297--;
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field3297--;
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field4953--;
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field3297--;
            field877[++Statics.field4953 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field3297--;
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field3297 -= 2;
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field3297 -= 2;
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field3297 -= 2;
            field877[++Statics.field4953 - 1] = "";
            field877[++Statics.field4953 - 1] = "";
            field877[++Statics.field4953 - 1] = "";
            field877[++Statics.field4953 - 1] = "";
            field877[++Statics.field4953 - 1] = "";
            field877[++Statics.field4953 - 1] = "";
            field877[++Statics.field4953 - 1] = "";
            field877[++Statics.field4953 - 1] = "";
            field877[++Statics.field4953 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field3297--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field3297--;
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field3297--;
            return 1;
        } else if (arg0 == 3175) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field4953--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field4953--;
            return 1;
        } else if (arg0 == 3181) {
            client.method3038(field870[--Statics.field3297]);
            return 1;
        } else if (arg0 == 3182) {
            field870[++Statics.field3297 - 1] = client.method3263();
            return 1;
        } else if (arg0 == 3185) {
            int var31 = field870[--Statics.field3297];
            Statics.field4929.method2630(var31);
            return 1;
        } else if (arg0 == 3186) {
            int var32 = Statics.field4929.method2672();
            field870[++Statics.field3297 - 1] = var32;
            return 1;
        } else if (arg0 == 3189) {
            int var33 = field870[--Statics.field3297];
            client.method75(var33);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.ak(ILdt;ZI)I")
    public static int method2180(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field3297 -= 3;
            client.method2199(field870[Statics.field3297], field870[Statics.field3297 + 1], field870[Statics.field3297 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field3297 -= 5;
            int var3 = field870[Statics.field3297];
            int var4 = field870[Statics.field3297 + 1];
            int var5 = field870[Statics.field3297 + 2];
            int var6 = field870[Statics.field3297 + 3];
            int var7 = field870[Statics.field3297 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method2388(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field3297 -= 2;
            client.method2257(field870[Statics.field3297], field870[Statics.field3297 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class94 var50 = class94.field1138;
            class93 var51 = class93.field1129;
            int var52 = field870[--Statics.field3297];
            if (arg0 == 3212) {
                int var53 = field870[--Statics.field3297];
                var50 = (class94) class405.method6719(class94.method3659(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field870[--Statics.field3297];
                var51 = (class93) class405.method6719(class93.method698(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field870[--Statics.field3297];
                var50 = (class94) class405.method6719(class94.method3659(), var55);
                if (var50 == null) {
                    var51 = (class93) class405.method6719(class93.method698(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class94.field1136;
            } else if (arg0 == 3203) {
                var51 = class93.field1127;
            } else if (arg0 == 3205) {
                var51 = class93.field1128;
            } else if (arg0 == 3207) {
                var51 = class93.field1125;
            }
            if (class93.field1129 == var51) {
                switch(var50.field1139) {
                    case 1:
                        Statics.field4929.method2656(var52 == 1);
                        break;
                    case 2:
                        Statics.field4929.method2605(var52 == 1);
                        break;
                    case 3:
                        Statics.field4929.method2607(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field4929.method2610(var52);
                        break;
                    case 5:
                        client.method3038(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1130) {
                    case 1:
                        Statics.field4929.method2597(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method3709(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method1206(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        Statics.method1194(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class94 var38 = class94.field1138;
            class93 var39 = class93.field1129;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field870[--Statics.field3297];
                var38 = (class94) class405.method6719(class94.method3659(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field870[--Statics.field3297];
                var39 = (class93) class405.method6719(class93.method698(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field870[--Statics.field3297];
                var38 = (class94) class405.method6719(class94.method3659(), var43);
                if (var38 == null) {
                    var39 = (class93) class405.method6719(class93.method698(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class94.field1136;
            } else if (arg0 == 3204) {
                var39 = class93.field1127;
            } else if (arg0 == 3206) {
                var39 = class93.field1128;
            } else if (arg0 == 3208) {
                var39 = class93.field1125;
            }
            int var45;
            if (class93.field1129 == var39) {
                switch(var38.field1139) {
                    case 1:
                        var45 = Statics.field4929.method2604() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field4929.method2632() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field4929.method2619() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field4929.method2611();
                        break;
                    case 5:
                        var45 = client.method3263();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1130) {
                    case 1:
                        var45 = Statics.field4929.method2695() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field4929.method2615();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field4929.method2617();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field4929.method2677();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field870[++Statics.field3297 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field870[--Statics.field3297];
            int var10 = 0;
            class94 var11 = (class94) class405.method6719(class94.method3659(), var9);
            if (var11 != null) {
                var10 = class94.field1138 == var11 ? 0 : 1;
            }
            field870[++Statics.field3297 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field870[--Statics.field3297];
            int var13 = 0;
            class93 var14 = (class93) class405.method6719(class93.method698(), var12);
            if (var14 != null) {
                var13 = class93.field1129 == var14 ? 0 : 1;
            }
            field870[++Statics.field3297 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class94 var28 = class94.field1138;
            class93 var29 = class93.field1129;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field870[--Statics.field3297];
                var28 = (class94) class405.method6719(class94.method3659(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field870[--Statics.field3297];
                var29 = (class93) class405.method6719(class93.method698(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class93.field1129 == var29) {
                switch(var28.field1139) {
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
                switch(var29.field1130) {
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
            field870[++Statics.field3297 - 1] = var35;
            field870[++Statics.field3297 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field3297 -= 2;
            int var15 = field870[Statics.field3297];
            int var16 = field870[Statics.field3297 + 1];
            class335.method5635(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field3297 -= 6;
            int var17 = field870[Statics.field3297];
            int var18 = field870[Statics.field3297 + 1];
            int var19 = field870[Statics.field3297 + 2];
            int var20 = field870[Statics.field3297 + 3];
            int var21 = field870[Statics.field3297 + 4];
            int var22 = field870[Statics.field3297 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method2388(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field3297 -= 4;
            int var24 = field870[Statics.field3297];
            int var25 = field870[Statics.field3297 + 1];
            int var26 = field870[Statics.field3297 + 2];
            int var27 = field870[Statics.field3297 + 3];
            class335.method3369(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mn.bn(ILdt;ZB)I")
    public static int method5744(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field870[++Statics.field3297 - 1] = client.field609;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field3297 -= 2;
            int var3 = field870[Statics.field3297];
            int var4 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = class88.method2387(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field3297 -= 2;
            int var5 = field870[Statics.field3297];
            int var6 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = class88.method51(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field3297 -= 2;
            int var7 = field870[Statics.field3297];
            int var8 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = class88.method1150(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class177.method1718(var9).field1873;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = client.field547[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = client.field661[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = client.field662[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1342.field1356;
            int var14 = (Statics.field4826.field1300 >> 7) + Statics.field1342.field1350;
            int var15 = (Statics.field4826.field1225 >> 7) + Statics.field1342.field1357;
            field870[++Statics.field3297 - 1] = class352.method6076(var13, var14, var15);
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = Statics.method6112(var16);
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class352.method6081(var17);
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class352.method6083(var18);
            return 1;
        } else if (arg0 == 3312) {
            field870[++Statics.field3297 - 1] = client.field640 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field3297 -= 2;
            int var19 = field870[Statics.field3297] + 32768;
            int var20 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = class88.method2387(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field3297 -= 2;
            int var21 = field870[Statics.field3297] + 32768;
            int var22 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = class88.method51(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field3297 -= 2;
            int var23 = field870[Statics.field3297] + 32768;
            int var24 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = class88.method1150(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field689 >= 2) {
                field870[++Statics.field3297 - 1] = client.field689;
            } else {
                field870[++Statics.field3297 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field870[++Statics.field3297 - 1] = client.field539;
            return 1;
        } else if (arg0 == 3318) {
            field870[++Statics.field3297 - 1] = client.field516;
            return 1;
        } else if (arg0 == 3321) {
            field870[++Statics.field3297 - 1] = client.field687 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field870[++Statics.field3297 - 1] = client.field688;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field691) {
                field870[++Statics.field3297 - 1] = 1;
            } else {
                field870[++Statics.field3297 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field870[++Statics.field3297 - 1] = client.field517;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field3297 -= 4;
            int var25 = field870[Statics.field3297];
            int var26 = field870[Statics.field3297 + 1];
            int var27 = field870[Statics.field3297 + 2];
            int var28 = field870[Statics.field3297 + 3];
            int var29 = class352.method6076(var27, var26, var28);
            field870[++Statics.field3297 - 1] = var25 + var29;
            return 1;
        } else if (arg0 == 3326) {
            field870[++Statics.field3297 - 1] = client.field649;
            return 1;
        } else if (arg0 == 3327) {
            field870[++Statics.field3297 - 1] = client.field536;
            return 1;
        } else if (arg0 == 3331) {
            field870[++Statics.field3297 - 1] = client.field687;
            return 1;
        } else if (arg0 == 3332) {
            int var30 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = client.field663[var30];
            return 1;
        } else if (arg0 == 3333) {
            field877[++Statics.field4953 - 1] = client.field598;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nc.bh(ILdt;ZI)I")
    public static int method6031(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field3297 -= 2;
            int var3 = field870[Statics.field3297];
            int var4 = field870[Statics.field3297 + 1];
            class190 var5 = class190.method2196(var3);
            if (var5.field1968 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1971; var6++) {
                if (var5.field1973[var6] == var4) {
                    field877[++Statics.field4953 - 1] = var5.field1965[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field877[++Statics.field4953 - 1] = var5.field1969;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field3297 -= 4;
            int var7 = field870[Statics.field3297];
            int var8 = field870[Statics.field3297 + 1];
            int var9 = field870[Statics.field3297 + 2];
            int var10 = field870[Statics.field3297 + 3];
            class190 var11 = class190.method2196(var9);
            if (var11.field1967 != var7 || var11.field1968 != var8) {
                if (var8 == 115) {
                    field877[++Statics.field4953 - 1] = class382.field4298;
                } else {
                    field870[++Statics.field3297 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1971; var12++) {
                if (var11.field1973[var12] == var10) {
                    if (var8 == 115) {
                        field877[++Statics.field4953 - 1] = var11.field1965[var12];
                    } else {
                        field870[++Statics.field3297 - 1] = var11.field1974[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field877[++Statics.field4953 - 1] = var11.field1969;
                } else {
                    field870[++Statics.field3297 - 1] = var11.field1970;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field870[--Statics.field3297];
            class190 var14 = class190.method2196(var13);
            field870[++Statics.field3297 - 1] = var14.method3568();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bp.bd(ILdt;ZB)I")
    public static int method699(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = client.field664.method5077(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = client.field664.method5076(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = client.field664.method5078(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ja.bx(ILdt;ZI)I")
    public static int method4735(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field4723.field844 == 0) {
                field870[++Statics.field3297 - 1] = -2;
            } else if (Statics.field4723.field844 == 1) {
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = Statics.field4723.field845.method8109();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field870[--Statics.field3297];
            if (Statics.field4723.method1883() && var3 >= 0 && var3 < Statics.field4723.field845.method8109()) {
                class471 var4 = (class471) Statics.field4723.field845.method8097(var3);
                field877[++Statics.field4953 - 1] = var4.method8065();
                field877[++Statics.field4953 - 1] = var4.method8066();
            } else {
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field870[--Statics.field3297];
            if (Statics.field4723.method1883() && var5 >= 0 && var5 < Statics.field4723.field845.method8109()) {
                field870[++Statics.field3297 - 1] = ((class478) Statics.field4723.field845.method8097(var5)).field4998;
            } else {
                field870[++Statics.field3297 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field870[--Statics.field3297];
            if (Statics.field4723.method1883() && var6 >= 0 && var6 < Statics.field4723.field845.method8109()) {
                field870[++Statics.field3297 - 1] = ((class478) Statics.field4723.field845.method8097(var6)).field4999;
            } else {
                field870[++Statics.field3297 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field877[--Statics.field4953];
            int var8 = field870[--Statics.field3297];
            class71.method3020(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field877[--Statics.field4953];
            Statics.field4723.method1890(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field877[--Statics.field4953];
            Statics.field4723.method1909(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field877[--Statics.field4953];
            Statics.field4723.method1900(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field877[--Statics.field4953];
            boolean var13 = true;
            Statics.field4723.method1895(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field877[--Statics.field4953];
            String var15 = client.method3296(var14);
            field870[++Statics.field3297 - 1] = Statics.field4723.method1888(new class574(var15, Statics.field127), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1824 == null) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = Statics.field1824.field4968;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1824 == null) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = Statics.field1824.method8109();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field870[--Statics.field3297];
            if (Statics.field1824 == null || var16 >= Statics.field1824.method8109()) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = Statics.field1824.method8097(var16).method8064().method9621();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field870[--Statics.field3297];
            if (Statics.field1824 == null || var17 >= Statics.field1824.method8109()) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = ((class478) Statics.field1824.method8097(var17)).method8159();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field870[--Statics.field3297];
            if (Statics.field1824 == null || var18 >= Statics.field1824.method8109()) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = ((class478) Statics.field1824.method8097(var18)).field4999;
            }
            return 1;
        } else if (arg0 == 3616) {
            field870[++Statics.field3297 - 1] = Statics.field1824 == null ? 0 : Statics.field1824.field4972;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field877[--Statics.field4953];
            client.method861(var19);
            return 1;
        } else if (arg0 == 3618) {
            field870[++Statics.field3297 - 1] = Statics.field1824 == null ? 0 : Statics.field1824.field4971;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field877[--Statics.field4953];
            client.method6716(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method7291();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field4723.method1883()) {
                field870[++Statics.field3297 - 1] = Statics.field4723.field846.method8109();
            } else {
                field870[++Statics.field3297 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field870[--Statics.field3297];
            if (Statics.field4723.method1883() && var21 >= 0 && var21 < Statics.field4723.field846.method8109()) {
                class477 var22 = (class477) Statics.field4723.field846.method8097(var21);
                field877[++Statics.field4953 - 1] = var22.method8065();
                field877[++Statics.field4953 - 1] = var22.method8066();
            } else {
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field877[--Statics.field4953];
            String var24 = client.method3296(var23);
            field870[++Statics.field3297 - 1] = Statics.field4723.method1889(new class574(var24, Statics.field127)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field870[--Statics.field3297];
            if (Statics.field1824 == null || var25 >= Statics.field1824.method8109() || !Statics.field1824.method8097(var25).method8064().equals(Statics.field4826.field1168)) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1824 == null || Statics.field1824.field4967 == null) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = Statics.field1824.field4967;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field870[--Statics.field3297];
            if (Statics.field1824 == null || var26 >= Statics.field1824.method8109() || !((class473) Statics.field1824.method8097(var26)).method8038()) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field870[--Statics.field3297];
            if (Statics.field1824 == null || var27 >= Statics.field1824.method8109() || !((class473) Statics.field1824.method8097(var27)).method8043()) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field4723.field845.method8105();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class557(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class558(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class126(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class122(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class125(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class130(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class124(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class123(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class127(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class128(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field4723.field845.method8098();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field4723.field846.method8105();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field870[--Statics.field3297] == 1;
            Statics.field4723.field846.method8107(new class557(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field870[--Statics.field3297] == 1;
            Statics.field4723.field846.method8107(new class558(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field4723.field846.method8098();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1824 != null) {
                Statics.field1824.method8105();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class557(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class558(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class126(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class122(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class125(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class130(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class124(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class123(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class127(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class128(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1824 != null) {
                Statics.field1824.method8098();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field870[--Statics.field3297] == 1;
            Statics.field4723.field845.method8107(new class129(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field870[--Statics.field3297] == 1;
            if (Statics.field1824 != null) {
                Statics.field1824.method8107(new class129(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lp.bf(ILdt;ZI)I")
    public static int method5606(int arg0, class82 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("pz.bm(ILdt;ZI)I")
    public static int method6914(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field3189 == null) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = 1;
                Statics.field4027 = Statics.field3189;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field870[--Statics.field3297];
            if (client.field755[var3] == null) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = 1;
                Statics.field4027 = client.field755[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field877[++Statics.field4953 - 1] = Statics.field4027.field1767;
            return 1;
        } else if (arg0 == 3803) {
            field870[++Statics.field3297 - 1] = Statics.field4027.field1769 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field870[++Statics.field3297 - 1] = Statics.field4027.field1770;
            return 1;
        } else if (arg0 == 3805) {
            field870[++Statics.field3297 - 1] = Statics.field4027.field1771;
            return 1;
        } else if (arg0 == 3806) {
            field870[++Statics.field3297 - 1] = Statics.field4027.field1772;
            return 1;
        } else if (arg0 == 3807) {
            field870[++Statics.field3297 - 1] = Statics.field4027.field1773;
            return 1;
        } else if (arg0 == 3809) {
            field870[++Statics.field3297 - 1] = Statics.field4027.field1774;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field870[--Statics.field3297];
            field877[++Statics.field4953 - 1] = Statics.field4027.field1789[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = Statics.field4027.field1776[var5];
            return 1;
        } else if (arg0 == 3812) {
            field870[++Statics.field3297 - 1] = Statics.field4027.field1783;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field870[--Statics.field3297];
            field877[++Statics.field4953 - 1] = Statics.field4027.field1790[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field3297 -= 3;
            int var7 = field870[Statics.field3297];
            int var8 = field870[Statics.field3297 + 1];
            int var9 = field870[Statics.field3297 + 2];
            field870[++Statics.field3297 - 1] = Statics.field4027.method3303(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field870[++Statics.field3297 - 1] = Statics.field4027.field1781;
            return 1;
        } else if (arg0 == 3816) {
            field870[++Statics.field3297 - 1] = Statics.field4027.field1782;
            return 1;
        } else if (arg0 == 3817) {
            field870[++Statics.field3297 - 1] = Statics.field4027.method3330(field877[--Statics.field4953]);
            return 1;
        } else if (arg0 == 3818) {
            field870[Statics.field3297 - 1] = Statics.field4027.method3305()[field870[Statics.field3297 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field3297 -= 2;
            int var10 = field870[Statics.field3297];
            int var11 = field870[Statics.field3297 + 1];
            client.method4024(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = Statics.field4027.field1779[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field3297 -= 3;
                int var13 = field870[Statics.field3297];
                boolean var14 = field870[Statics.field3297 + 1] == 1;
                int var15 = field870[Statics.field3297 + 2];
                client.method862(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field870[--Statics.field3297];
                field870[++Statics.field3297 - 1] = Statics.field4027.field1780[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1813 == null) {
                    field870[++Statics.field3297 - 1] = 0;
                } else {
                    field870[++Statics.field3297 - 1] = 1;
                    Statics.field1221 = Statics.field1813;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field870[--Statics.field3297];
                if (client.field704[var17] == null) {
                    field870[++Statics.field3297 - 1] = 0;
                } else {
                    field870[++Statics.field3297 - 1] = 1;
                    Statics.field1221 = client.field704[var17];
                    Statics.field429 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field877[++Statics.field4953 - 1] = Statics.field1221.field1841;
                return 1;
            } else if (arg0 == 3853) {
                field870[++Statics.field3297 - 1] = Statics.field1221.field1834;
                return 1;
            } else if (arg0 == 3854) {
                field870[++Statics.field3297 - 1] = Statics.field1221.field1840;
                return 1;
            } else if (arg0 == 3855) {
                field870[++Statics.field3297 - 1] = Statics.field1221.method3391();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field870[--Statics.field3297];
                field877[++Statics.field4953 - 1] = ((class153) Statics.field1221.field1836.get(var18)).field1711.method9621();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field870[--Statics.field3297];
                field870[++Statics.field3297 - 1] = ((class153) Statics.field1221.field1836.get(var19)).field1712;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field870[--Statics.field3297];
                field870[++Statics.field3297 - 1] = ((class153) Statics.field1221.field1836.get(var20)).field1713;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field870[--Statics.field3297];
                client.method5243(Statics.field429, var21);
                return 1;
            } else if (arg0 == 3860) {
                field870[++Statics.field3297 - 1] = Statics.field1221.method3392(field877[--Statics.field4953]);
                return 1;
            } else if (arg0 == 3861) {
                field870[Statics.field3297 - 1] = Statics.field1221.method3388()[field870[Statics.field3297 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field870[++Statics.field3297 - 1] = Statics.field3065 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("os.bw(ILdt;ZB)I")
    public static int method6694(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field3297 -= 2;
            int var3 = field870[Statics.field3297];
            int var4 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field3297 -= 2;
            int var5 = field870[Statics.field3297];
            int var6 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field3297 -= 2;
            int var7 = field870[Statics.field3297];
            int var8 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field3297 -= 2;
            int var9 = field870[Statics.field3297];
            int var10 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field3297 -= 5;
            int var13 = field870[Statics.field3297];
            int var14 = field870[Statics.field3297 + 1];
            int var15 = field870[Statics.field3297 + 2];
            int var16 = field870[Statics.field3297 + 3];
            int var17 = field870[Statics.field3297 + 4];
            field870[++Statics.field3297 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field3297 -= 2;
            int var18 = field870[Statics.field3297];
            int var19 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field3297 -= 2;
            int var20 = field870[Statics.field3297];
            int var21 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field3297 -= 2;
            int var22 = field870[Statics.field3297];
            int var23 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field3297 -= 2;
            int var24 = field870[Statics.field3297];
            int var25 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field3297 -= 2;
            int var26 = field870[Statics.field3297];
            int var27 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field3297 -= 2;
            int var28 = field870[Statics.field3297];
            int var29 = field870[Statics.field3297 + 1];
            if (var28 == 0) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field3297 -= 2;
            int var30 = field870[Statics.field3297];
            int var31 = field870[Statics.field3297 + 1];
            if (var30 == 0) {
                field870[++Statics.field3297 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field870[++Statics.field3297 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field870[++Statics.field3297 - 1] = var30;
                    break;
                case 2:
                    field870[++Statics.field3297 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field870[++Statics.field3297 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field870[++Statics.field3297 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field870[++Statics.field3297 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field3297 -= 2;
            int var32 = field870[Statics.field3297];
            int var33 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field3297 -= 2;
            int var34 = field870[Statics.field3297];
            int var35 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field3297 -= 2;
            int var36 = field870[Statics.field3297];
            int var37 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field3297 -= 2;
            int var38 = field870[Statics.field3297];
            int var39 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field3297 -= 3;
            long var40 = (long) field870[Statics.field3297];
            long var42 = (long) field870[Statics.field3297 + 1];
            long var44 = (long) field870[Statics.field3297 + 2];
            field870[++Statics.field3297 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class333.method693(field870[--Statics.field3297]);
            field870[++Statics.field3297 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field3297 -= 2;
            int var47 = field870[Statics.field3297];
            int var48 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field3297 -= 3;
            int var49 = field870[Statics.field3297];
            int var50 = field870[Statics.field3297 + 1];
            int var51 = field870[Statics.field3297 + 2];
            field870[++Statics.field3297 - 1] = class333.method33(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field3297 -= 3;
            int var52 = field870[Statics.field3297];
            int var53 = field870[Statics.field3297 + 1];
            int var54 = field870[Statics.field3297 + 2];
            field870[++Statics.field3297 - 1] = class333.method3655(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field3297 -= 3;
            int var55 = field870[Statics.field3297];
            int var56 = field870[Statics.field3297 + 1];
            int var57 = field870[Statics.field3297 + 2];
            int var58 = 31 - var57;
            field870[++Statics.field3297 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field3297 -= 4;
            int var59 = field870[Statics.field3297];
            int var60 = field870[Statics.field3297 + 1];
            int var61 = field870[Statics.field3297 + 2];
            int var62 = field870[Statics.field3297 + 3];
            int var63 = class333.method3655(var59, var61, var62);
            int var64 = class333.method6147(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field870[++Statics.field3297 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field870[Statics.field3297 - 1] = class500.method7011(field870[Statics.field3297 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field870[Statics.field3297 - 1] = class500.method702(field870[Statics.field3297 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field3297 -= 2;
            int var65 = field870[Statics.field3297];
            int var66 = field870[Statics.field3297 + 1];
            int var67 = class500.method8333(var65, var66);
            field870[++Statics.field3297 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field870[Statics.field3297 - 1] = Math.abs(field870[Statics.field3297 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field877[--Statics.field4953];
            int var69 = -1;
            if (class419.method4011(var68)) {
                var69 = class419.method4086(var68);
            }
            field870[++Statics.field3297 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pp.ba(ILdt;ZI)I")
    public static int method6893(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field877[--Statics.field4953];
            int var4 = field870[--Statics.field3297];
            field877[++Statics.field4953 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field4953 -= 2;
            String var5 = field877[Statics.field4953];
            String var6 = field877[Statics.field4953 + 1];
            field877[++Statics.field4953 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field877[--Statics.field4953];
            int var8 = field870[--Statics.field3297];
            field877[++Statics.field4953 - 1] = var7 + class419.method3344(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field877[--Statics.field4953];
            field877[++Statics.field4953 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field870[--Statics.field3297];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field888.setTime(new Date(var11));
            int var13 = field888.get(5);
            int var14 = field888.get(2);
            int var15 = field888.get(1);
            field877[++Statics.field4953 - 1] = var13 + "-" + field884[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field4953 -= 2;
            String var16 = field877[Statics.field4953];
            String var17 = field877[Statics.field4953 + 1];
            if (Statics.field4826.field1170 == null || Statics.field4826.field1170.field3796 == 0) {
                field877[++Statics.field4953 - 1] = var16;
            } else {
                field877[++Statics.field4953 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field870[--Statics.field3297];
            field877[++Statics.field4953 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field4953 -= 2;
            field870[++Statics.field3297 - 1] = class419.method275(class420.method701(field877[Statics.field4953], field877[Statics.field4953 + 1], Statics.field1329));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field877[--Statics.field4953];
            Statics.field3297 -= 2;
            int var20 = field870[Statics.field3297];
            int var21 = field870[Statics.field3297 + 1];
            byte[] var22 = Statics.field1540.method6782(var21, 0);
            class435 var23 = new class435(var22);
            field870[++Statics.field3297 - 1] = var23.method7659(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field877[--Statics.field4953];
            Statics.field3297 -= 2;
            int var25 = field870[Statics.field3297];
            int var26 = field870[Statics.field3297 + 1];
            byte[] var27 = Statics.field1540.method6782(var26, 0);
            class435 var28 = new class435(var27);
            field870[++Statics.field3297 - 1] = var28.method7686(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field4953 -= 2;
            String var29 = field877[Statics.field4953];
            String var30 = field877[Statics.field4953 + 1];
            if (field870[--Statics.field3297] == 1) {
                field877[++Statics.field4953 - 1] = var29;
            } else {
                field877[++Statics.field4953 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field877[--Statics.field4953];
            field877[++Statics.field4953 - 1] = class439.method7660(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field877[--Statics.field4953];
            int var33 = field870[--Statics.field3297];
            field877[++Statics.field4953 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class419.method837((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class419.method3257((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class419.method6160((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class419.method2557((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field877[--Statics.field4953];
            if (var38 == null) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field877[--Statics.field4953];
            Statics.field3297 -= 2;
            int var40 = field870[Statics.field3297];
            int var41 = field870[Statics.field3297 + 1];
            field877[++Statics.field4953 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field877[--Statics.field4953];
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
            field877[++Statics.field4953 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field877[--Statics.field4953];
            int var48 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field4953 -= 2;
            String var49 = field877[Statics.field4953];
            String var50 = field877[Statics.field4953 + 1];
            int var51 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field877[--Statics.field4953];
            field877[++Statics.field4953 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field4953 -= 3;
            String var53 = field877[Statics.field4953];
            String var54 = field877[Statics.field4953 + 1];
            String var55 = field877[Statics.field4953 + 2];
            if (Statics.field4826.field1170 == null) {
                field877[++Statics.field4953 - 1] = var55;
                return 1;
            }
            switch(Statics.field4826.field1170.field3795) {
                case 0:
                    field877[++Statics.field4953 - 1] = var53;
                    break;
                case 1:
                    field877[++Statics.field4953 - 1] = var54;
                    break;
                case 2:
                default:
                    field877[++Statics.field4953 - 1] = var55;
            }
            return 1;
        } else if (arg0 == 4124) {
            field870[++Statics.field3297 - 1] = Statics.field4826.field1170 == null ? -1 : Statics.field4826.field1170.field3795;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hk.bj(ILdt;ZI)I")
    public static int method3552(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field870[--Statics.field3297];
            field877[++Statics.field4953 - 1] = class211.method2414(var3).field2225;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field3297 -= 2;
            int var4 = field870[Statics.field3297];
            int var5 = field870[Statics.field3297 + 1];
            class211 var6 = class211.method2414(var4);
            if (var5 < 1 || var5 > 5 || var6.field2253[var5 - 1] == null) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = var6.field2253[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field3297 -= 2;
            int var7 = field870[Statics.field3297];
            int var8 = field870[Statics.field3297 + 1];
            class211 var9 = class211.method2414(var7);
            if (var8 < 1 || var8 > 5 || var9.field2254[var8 - 1] == null) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = var9.field2254[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4222) {
            Statics.field3297 -= 3;
            int var10 = field870[Statics.field3297];
            int var11 = field870[Statics.field3297 + 1];
            int var12 = field870[Statics.field3297 + 2];
            class211 var13 = class211.method2414(var10);
            String var14 = null;
            if (var11 >= 1 && var11 <= 5 && var13.field2254[var11 - 1] != null && var13.field2255 != null && var13.field2255[var11 - 1] != null && var12 >= 1 && var12 <= var13.field2255[var11 - 1].length) {
                var14 = var13.field2255[var11 - 1][var12 - 1];
            }
            field877[++Statics.field4953 - 1] = var14 == null ? "" : var14;
            return 1;
        } else if (arg0 == 4203) {
            int var15 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class211.method2414(var15).field2226;
            return 1;
        } else if (arg0 == 4204) {
            int var16 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class211.method2414(var16).field2247 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var17 = field870[--Statics.field3297];
            class211 var18 = class211.method2414(var17);
            if (var18.field2248 == -1 && var18.field2271 >= 0) {
                field870[++Statics.field3297 - 1] = var18.field2271;
            } else {
                field870[++Statics.field3297 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var19 = field870[--Statics.field3297];
            class211 var20 = class211.method2414(var19);
            if (var20.field2248 >= 0 && var20.field2271 >= 0) {
                field870[++Statics.field3297 - 1] = var20.field2271;
            } else {
                field870[++Statics.field3297 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var21 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class211.method2414(var21).field2252 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var22 = field870[--Statics.field3297];
            class211 var23 = class211.method2414(var22);
            if (var23.field2285 == -1 && var23.field2235 >= 0) {
                field870[++Statics.field3297 - 1] = var23.field2235;
            } else {
                field870[++Statics.field3297 - 1] = var22;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var24 = field870[--Statics.field3297];
            class211 var25 = class211.method2414(var24);
            if (var25.field2285 >= 0 && var25.field2235 >= 0) {
                field870[++Statics.field3297 - 1] = var25.field2235;
            } else {
                field870[++Statics.field3297 - 1] = var24;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var26 = field877[--Statics.field4953];
            int var27 = field870[--Statics.field3297];
            client.method2486(var26, var27 == 1);
            field870[++Statics.field3297 - 1] = Statics.field3113;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1810 == null || Statics.field1658 >= Statics.field3113) {
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = Statics.field1810[++Statics.field1658 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field1658 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var28 = field870[--Statics.field3297];
            int var29 = class211.method2414(var28).method3846();
            if (var29 == -1) {
                field870[++Statics.field3297 - 1] = var29;
            } else {
                field870[++Statics.field3297 - 1] = var29 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var30 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class211.method2414(var30).field2229;
            return 1;
        } else if (arg0 == 4215) {
            int var31 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class211.method2414(var31).field2231;
            return 1;
        } else if (arg0 == 4216) {
            int var32 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class211.method2414(var32).field2278;
            return 1;
        } else if (arg0 == 4217) {
            int var33 = field870[--Statics.field3297];
            class211 var34 = class211.method2414(var33);
            field870[++Statics.field3297 - 1] = var34.field2279;
            return 1;
        } else if (arg0 == 4218) {
            int var35 = field870[--Statics.field3297];
            field877[++Statics.field4953 - 1] = class211.method2414(var35).field2236;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dk.bp(ILdt;ZS)I")
    public static int method2291(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field870[++Statics.field3297 - 1] = client.field744;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field3297 -= 3;
            client.field744 = field870[Statics.field3297];
            Statics.field1758 = class571.method2301(field870[Statics.field3297 + 1]);
            if (Statics.field1758 == null) {
                Statics.field1758 = class571.field5570;
            }
            client.field745 = field870[Statics.field3297 + 2];
            class326 var3 = class326.method3199(class324.field3384, client.field582.field1486);
            var3.field3426.method9022(client.field744);
            var3.field3426.method9022(Statics.field1758.field5568);
            var3.field3426.method9022(client.field745);
            client.field582.method2943(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field877[--Statics.field4953];
            Statics.field3297 -= 2;
            int var5 = field870[Statics.field3297];
            int var6 = field870[Statics.field3297 + 1];
            class326 var7 = class326.method3199(class324.field3340, client.field582.field1486);
            var7.field3426.method9022(class551.method8819(var4) + 2);
            var7.field3426.method8964(var4);
            var7.field3426.method9022(var5 - 1);
            var7.field3426.method9022(var6);
            client.field582.method2943(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field3297 -= 2;
            int var8 = field870[Statics.field3297];
            int var9 = field870[Statics.field3297 + 1];
            class65 var10 = class116.method2411(var8, var9);
            if (var10 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = var10.field470;
                field870[++Statics.field3297 - 1] = var10.field467;
                field877[++Statics.field4953 - 1] = var10.field469 == null ? "" : var10.field469;
                field877[++Statics.field4953 - 1] = var10.field473 == null ? "" : var10.field473;
                field877[++Statics.field4953 - 1] = var10.field466 == null ? "" : var10.field466;
                field870[++Statics.field3297 - 1] = var10.method1167() ? 1 : (var10.method1149() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field870[--Statics.field3297];
            class65 var12 = class116.method1180(var11);
            if (var12 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = var12.field476;
                field870[++Statics.field3297 - 1] = var12.field467;
                field877[++Statics.field4953 - 1] = var12.field469 == null ? "" : var12.field469;
                field877[++Statics.field4953 - 1] = var12.field473 == null ? "" : var12.field473;
                field877[++Statics.field4953 - 1] = var12.field466 == null ? "" : var12.field466;
                field870[++Statics.field3297 - 1] = var12.method1167() ? 1 : (var12.method1149() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1758 == null) {
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = Statics.field1758.field5568;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field877[--Statics.field4953];
            int var14 = field870[--Statics.field3297];
            class326 var15 = class575.method7261(var14, var13, Statics.field1329, -1);
            client.field582.method2943(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field4953 -= 2;
            String var16 = field877[Statics.field4953];
            String var17 = field877[Statics.field4953 + 1];
            class326 var18 = class326.method3199(class324.field3335, client.field582.field1486);
            var18.field3426.method8958(0);
            int var19 = var18.field3426.field5415;
            var18.field3426.method8964(var16);
            class366.method5607(var18.field3426, var17);
            var18.field3426.method8970(var18.field3426.field5415 - var19);
            client.field582.method2943(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field877[--Statics.field4953];
            Statics.field3297 -= 2;
            int var21 = field870[Statics.field3297];
            int var22 = field870[Statics.field3297 + 1];
            class326 var23 = class575.method7261(var21, var20, Statics.field1329, var22);
            client.field582.method2943(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field4826 == null || Statics.field4826.field1168 == null) {
                var24 = "";
            } else {
                var24 = Statics.field4826.field1168.method9621();
            }
            field877[++Statics.field4953 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field870[++Statics.field3297 - 1] = client.field745;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class116.method3465(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class116.method3365(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = class116.method1209(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field877[--Statics.field4953];
            client.method3431(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field746 = field877[--Statics.field4953].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field877[++Statics.field4953 - 1] = client.field746;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field877[--Statics.field4953];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field3297 -= 2;
            int var30 = field870[Statics.field3297];
            int var31 = field870[Statics.field3297 + 1];
            class65 var32 = class116.method2411(var30, var31);
            if (var32 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = var32.field470;
                field870[++Statics.field3297 - 1] = var32.field467;
                field877[++Statics.field4953 - 1] = var32.field469 == null ? "" : var32.field469;
                field877[++Statics.field4953 - 1] = var32.field473 == null ? "" : var32.field473;
                field877[++Statics.field4953 - 1] = var32.field466 == null ? "" : var32.field466;
                field870[++Statics.field3297 - 1] = var32.method1167() ? 1 : (var32.method1149() ? 2 : 0);
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field870[--Statics.field3297];
            class65 var34 = class116.method1180(var33);
            if (var34 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = var34.field476;
                field870[++Statics.field3297 - 1] = var34.field467;
                field877[++Statics.field4953 - 1] = var34.field469 == null ? "" : var34.field469;
                field877[++Statics.field4953 - 1] = var34.field473 == null ? "" : var34.field473;
                field877[++Statics.field4953 - 1] = var34.field466 == null ? "" : var34.field466;
                field870[++Statics.field3297 - 1] = var34.method1167() ? 1 : (var34.method1149() ? 2 : 0);
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cr.by(ILdt;ZI)I")
    public static int method1881(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field870[++Statics.field3297 - 1] = client.method2290();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field870[--Statics.field3297];
            if (var3 == 1 || var3 == 2) {
                client.method90(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field870[++Statics.field3297 - 1] = Statics.field4929.method2625();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field870[--Statics.field3297];
            if (var4 == 1 || var4 == 2) {
                Statics.field4929.method2624(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field3297--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("uy.bb(ILdt;ZI)I")
    public static int method8811(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field3297 -= 2;
            int var3 = field870[Statics.field3297];
            int var4 = field870[Statics.field3297 + 1];
            if (!client.field706) {
                client.field781 = var3;
                client.field672 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field870[++Statics.field3297 - 1] = client.field781;
            return 1;
        } else if (arg0 == 5506) {
            field870[++Statics.field3297 - 1] = client.field672;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field870[--Statics.field3297];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field720 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field870[++Statics.field3297 - 1] = client.field720;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hj.bi(ILdt;ZB)I")
    public static int method3586(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field583 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hj.bg(II)I")
    public static int method3583(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("db.bl(II)I")
    public static int method2348(int arg0) {
        return (int) ((Math.log((double) arg0) / field891 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("ro.bz(ILdt;ZI)I")
    public static int method7899(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field3297 -= 2;
            client.field786 = (short) method3583(field870[Statics.field3297]);
            if (client.field786 <= 0) {
                client.field786 = 256;
            }
            client.field787 = (short) method3583(field870[Statics.field3297 + 1]);
            if (client.field787 <= 0) {
                client.field787 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field3297 -= 2;
            client.field788 = (short) field870[Statics.field3297];
            if (client.field788 <= 0) {
                client.field788 = 256;
            }
            client.field789 = (short) field870[Statics.field3297 + 1];
            if (client.field789 <= 0) {
                client.field789 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field3297 -= 4;
            client.field728 = (short) field870[Statics.field3297];
            if (client.field728 <= 0) {
                client.field728 = 1;
            }
            client.field791 = (short) field870[Statics.field3297 + 1];
            if (client.field791 <= 0) {
                client.field791 = 32767;
            } else if (client.field791 < client.field728) {
                client.field791 = client.field728;
            }
            client.field792 = (short) field870[Statics.field3297 + 2];
            if (client.field792 <= 0) {
                client.field792 = 1;
            }
            client.field793 = (short) field870[Statics.field3297 + 3];
            if (client.field793 <= 0) {
                client.field793 = 32767;
            } else if (client.field793 < client.field792) {
                client.field793 = client.field792;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field580 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = -1;
            } else {
                client.method3591(0, 0, client.field580.field3868, client.field580.field3869, false);
                field870[++Statics.field3297 - 1] = client.field796;
                field870[++Statics.field3297 - 1] = client.field797;
            }
            return 1;
        } else if (arg0 == 6204) {
            field870[++Statics.field3297 - 1] = client.field788;
            field870[++Statics.field3297 - 1] = client.field789;
            return 1;
        } else if (arg0 == 6205) {
            field870[++Statics.field3297 - 1] = method2348(client.field786);
            field870[++Statics.field3297 - 1] = method2348(client.field787);
            return 1;
        } else if (arg0 == 6220) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field870[++Statics.field3297 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field870[++Statics.field3297 - 1] = Statics.field1721;
            return 1;
        } else if (arg0 == 6223) {
            field870[++Statics.field3297 - 1] = Statics.field1500;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dz.bu(ILdt;ZI)I")
    public static int method2490(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field870[++Statics.field3297 - 1] = class70.method3386() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class70 var3 = class70.method3553();
            if (var3 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
            } else {
                field870[++Statics.field3297 - 1] = var3.field828;
                field870[++Statics.field3297 - 1] = var3.field829;
                field877[++Statics.field4953 - 1] = var3.field832;
                field870[++Statics.field3297 - 1] = var3.field833;
                field870[++Statics.field3297 - 1] = var3.field830;
                field877[++Statics.field4953 - 1] = var3.field831;
            }
            return 1;
        } else if (arg0 == 6502) {
            class70 var4 = class70.method867();
            if (var4 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
            } else {
                field870[++Statics.field3297 - 1] = var4.field828;
                field870[++Statics.field3297 - 1] = var4.field829;
                field877[++Statics.field4953 - 1] = var4.field832;
                field870[++Statics.field3297 - 1] = var4.field833;
                field870[++Statics.field3297 - 1] = var4.field830;
                field877[++Statics.field4953 - 1] = var4.field831;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field870[--Statics.field3297];
            class70 var6 = null;
            for (int var7 = 0; var7 < class70.field824; var7++) {
                if (Statics.field293[var7].field828 == var5) {
                    var6 = Statics.field293[var7];
                    break;
                }
            }
            if (var6 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
            } else {
                field870[++Statics.field3297 - 1] = var6.field828;
                field870[++Statics.field3297 - 1] = var6.field829;
                field877[++Statics.field4953 - 1] = var6.field832;
                field870[++Statics.field3297 - 1] = var6.field833;
                field870[++Statics.field3297 - 1] = var6.field830;
                field877[++Statics.field4953 - 1] = var6.field831;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field3297 -= 4;
            int var8 = field870[Statics.field3297];
            boolean var9 = field870[Statics.field3297 + 1] == 1;
            int var10 = field870[Statics.field3297 + 2];
            boolean var11 = field870[Statics.field3297 + 3] == 1;
            class70.method2265(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field870[--Statics.field3297];
            if (var12 >= 0 && var12 < class70.field824) {
                class70 var13 = Statics.field293[var12];
                field870[++Statics.field3297 - 1] = var13.field828;
                field870[++Statics.field3297 - 1] = var13.field829;
                field877[++Statics.field4953 - 1] = var13.field832;
                field870[++Statics.field3297 - 1] = var13.field833;
                field870[++Statics.field3297 - 1] = var13.field830;
                field877[++Statics.field4953 - 1] = var13.field831;
            } else {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
                field870[++Statics.field3297 - 1] = 0;
                field870[++Statics.field3297 - 1] = 0;
                field877[++Statics.field4953 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field535 = field870[--Statics.field3297] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field3297 -= 2;
            int var14 = field870[Statics.field3297];
            int var15 = field870[Statics.field3297 + 1];
            class206 var16 = class206.method7467(var15);
            if (var16.method3714()) {
                field877[++Statics.field4953 - 1] = class195.method3383(var14).method3606(var15, var16.field2129);
            } else {
                field870[++Statics.field3297 - 1] = class195.method3383(var14).method3644(var15, var16.field2128);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field3297 -= 2;
            int var17 = field870[Statics.field3297];
            int var18 = field870[Statics.field3297 + 1];
            class206 var19 = class206.method7467(var18);
            if (var19.method3714()) {
                field877[++Statics.field4953 - 1] = class210.method5152(var17).method3802(var18, var19.field2129);
            } else {
                field870[++Statics.field3297 - 1] = class210.method5152(var17).method3801(var18, var19.field2128);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field3297 -= 2;
            int var20 = field870[Statics.field3297];
            int var21 = field870[Statics.field3297 + 1];
            class206 var22 = class206.method7467(var21);
            if (var22.method3714()) {
                field877[++Statics.field4953 - 1] = class211.method2414(var20).method3861(var21, var22.field2129);
            } else {
                field870[++Statics.field3297 - 1] = class211.method2414(var20).method3918(var21, var22.field2128);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field3297 -= 2;
            int var23 = field870[Statics.field3297];
            int var24 = field870[Statics.field3297 + 1];
            class206 var25 = class206.method7467(var24);
            if (var25.method3714()) {
                field877[++Statics.field4953 - 1] = class207.method5825(var23).method3735(var24, var25.field2129);
            } else {
                field870[++Statics.field3297 - 1] = class207.method5825(var23).method3734(var24, var25.field2128);
            }
            return 1;
        } else if (arg0 == 6518) {
            field870[++Statics.field3297 - 1] = client.field524 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field870[++Statics.field3297 - 1] = client.field522;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field4953--;
            Statics.field3297--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field4953--;
            Statics.field3297--;
            return 1;
        } else if (arg0 == 6524) {
            field870[++Statics.field3297 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field870[++Statics.field3297 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field870[++Statics.field3297 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field870[++Statics.field3297 - 1] = client.field523;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("do.br(ILdt;ZI)I")
    public static int method2410(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1342.field1356;
            int var4 = (Statics.field4826.field1300 >> 7) + Statics.field1342.field1350;
            int var5 = (Statics.field4826.field1225 >> 7) + Statics.field1342.field1357;
            client.method3255().method8429(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field870[--Statics.field3297];
            String var7 = "";
            class286 var8 = client.method3255().method8460(var6);
            if (var8 != null) {
                var7 = var8.method5335();
            }
            field877[++Statics.field4953 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field870[--Statics.field3297];
            client.method3255().method8537(var9);
            return 1;
        } else if (arg0 == 6603) {
            field870[++Statics.field3297 - 1] = client.method3255().method8457();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field870[--Statics.field3297];
            client.method3255().method8625(var10);
            return 1;
        } else if (arg0 == 6605) {
            field870[++Statics.field3297 - 1] = client.method3255().method8459() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class352 var11 = new class352(field870[--Statics.field3297]);
            client.method3255().method8620(var11.field3754, var11.field3756);
            return 1;
        } else if (arg0 == 6607) {
            class352 var12 = new class352(field870[--Statics.field3297]);
            client.method3255().method8462(var12.field3754, var12.field3756);
            return 1;
        } else if (arg0 == 6608) {
            class352 var13 = new class352(field870[--Statics.field3297]);
            client.method3255().method8463(var13.field3755, var13.field3754, var13.field3756);
            return 1;
        } else if (arg0 == 6609) {
            class352 var14 = new class352(field870[--Statics.field3297]);
            client.method3255().method8464(var14.field3755, var14.field3754, var14.field3756);
            return 1;
        } else if (arg0 == 6610) {
            field870[++Statics.field3297 - 1] = client.method3255().method8465();
            field870[++Statics.field3297 - 1] = client.method3255().method8448();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field870[--Statics.field3297];
            class286 var16 = client.method3255().method8460(var15);
            if (var16 == null) {
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = var16.method5312().method6079();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field870[--Statics.field3297];
            class286 var18 = client.method3255().method8460(var17);
            if (var18 == null) {
                field870[++Statics.field3297 - 1] = 0;
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = (var18.method5306() - var18.method5305() + 1) * 64;
                field870[++Statics.field3297 - 1] = (var18.method5308() - var18.method5309() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field870[--Statics.field3297];
            class286 var20 = client.method3255().method8460(var19);
            if (var20 == null) {
                field870[++Statics.field3297 - 1] = 0;
                field870[++Statics.field3297 - 1] = 0;
                field870[++Statics.field3297 - 1] = 0;
                field870[++Statics.field3297 - 1] = 0;
            } else {
                field870[++Statics.field3297 - 1] = var20.method5305() * 64;
                field870[++Statics.field3297 - 1] = var20.method5309() * 64;
                field870[++Statics.field3297 - 1] = var20.method5306() * 64 + 64 - 1;
                field870[++Statics.field3297 - 1] = var20.method5308() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field870[--Statics.field3297];
            class286 var22 = client.method3255().method8460(var21);
            if (var22 == null) {
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var22.method5348();
            }
            return 1;
        } else if (arg0 == 6615) {
            class352 var23 = client.method3255().method8467();
            if (var23 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var23.field3754;
                field870[++Statics.field3297 - 1] = var23.field3756;
            }
            return 1;
        } else if (arg0 == 6616) {
            field870[++Statics.field3297 - 1] = client.method3255().method8443();
            return 1;
        } else if (arg0 == 6617) {
            class352 var24 = new class352(field870[--Statics.field3297]);
            class286 var25 = client.method3255().method8444();
            if (var25 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method5301(var24.field3755, var24.field3754, var24.field3756);
            if (var26 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var26[0];
                field870[++Statics.field3297 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class352 var27 = new class352(field870[--Statics.field3297]);
            class286 var28 = client.method3255().method8444();
            if (var28 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = -1;
                return 1;
            }
            class352 var29 = var28.method5296(var27.field3754, var27.field3756);
            if (var29 == null) {
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var29.method6079();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field3297 -= 2;
            int var30 = field870[Statics.field3297];
            class352 var31 = new class352(field870[Statics.field3297 + 1]);
            Statics.method53(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field3297 -= 2;
            int var32 = field870[Statics.field3297];
            class352 var33 = new class352(field870[Statics.field3297 + 1]);
            Statics.method53(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field3297 -= 2;
            int var34 = field870[Statics.field3297];
            class352 var35 = new class352(field870[Statics.field3297 + 1]);
            class286 var36 = client.method3255().method8460(var34);
            if (var36 == null) {
                field870[++Statics.field3297 - 1] = 0;
                return 1;
            } else {
                field870[++Statics.field3297 - 1] = var36.method5293(var35.field3755, var35.field3754, var35.field3756) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field870[++Statics.field3297 - 1] = client.method3255().method8489();
            field870[++Statics.field3297 - 1] = client.method3255().method8469();
            return 1;
        } else if (arg0 == 6623) {
            class352 var37 = new class352(field870[--Statics.field3297]);
            class286 var38 = client.method3255().method8440(var37.field3755, var37.field3754, var37.field3756);
            if (var38 == null) {
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var38.method5298();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method3255().method8532(field870[--Statics.field3297]);
            return 1;
        } else if (arg0 == 6625) {
            client.method3255().method8471();
            return 1;
        } else if (arg0 == 6626) {
            client.method3255().method8570(field870[--Statics.field3297]);
            return 1;
        } else if (arg0 == 6627) {
            client.method3255().method8473();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field870[--Statics.field3297] == 1;
            client.method3255().method8474(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field870[--Statics.field3297];
            client.method3255().method8475(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field870[--Statics.field3297];
            client.method3255().method8494(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method3255().method8477();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field870[--Statics.field3297] == 1;
            client.method3255().method8478(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field3297 -= 2;
            int var43 = field870[Statics.field3297];
            boolean var44 = field870[Statics.field3297 + 1] == 1;
            client.method3255().method8479(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field3297 -= 2;
            int var45 = field870[Statics.field3297];
            boolean var46 = field870[Statics.field3297 + 1] == 1;
            client.method3255().method8480(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field870[++Statics.field3297 - 1] = client.method3255().method8452() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = client.method3255().method8581(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field870[--Statics.field3297];
            field870[++Statics.field3297 - 1] = client.method3255().method8483(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field3297 -= 2;
            int var49 = field870[Statics.field3297];
            class352 var50 = new class352(field870[Statics.field3297 + 1]);
            class352 var51 = client.method3255().method8482(var49, var50);
            if (var51 == null) {
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var51.method6079();
            }
            return 1;
        } else if (arg0 == 6639) {
            class304 var52 = client.method3255().method8556();
            if (var52 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var52.method5246();
                field870[++Statics.field3297 - 1] = var52.field3256.method6079();
            }
            return 1;
        } else if (arg0 == 6640) {
            class304 var53 = client.method3255().method8528();
            if (var53 == null) {
                field870[++Statics.field3297 - 1] = -1;
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var53.method5246();
                field870[++Statics.field3297 - 1] = var53.field3256.method6079();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field870[--Statics.field3297];
            class184 var55 = class184.method3200(var54);
            if (var55.field1900 == null) {
                field877[++Statics.field4953 - 1] = "";
            } else {
                field877[++Statics.field4953 - 1] = var55.field1900;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field870[--Statics.field3297];
            class184 var57 = class184.method3200(var56);
            field870[++Statics.field3297 - 1] = var57.field1906;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field870[--Statics.field3297];
            class184 var59 = class184.method3200(var58);
            if (var59 == null) {
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var59.field1908;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field870[--Statics.field3297];
            class184 var61 = class184.method3200(var60);
            if (var61 == null) {
                field870[++Statics.field3297 - 1] = -1;
            } else {
                field870[++Statics.field3297 - 1] = var61.field1902;
            }
            return 1;
        } else if (arg0 == 6697) {
            field870[++Statics.field3297 - 1] = Statics.field1799.field3278;
            return 1;
        } else if (arg0 == 6698) {
            field870[++Statics.field3297 - 1] = Statics.field1799.field3275.method6079();
            return 1;
        } else if (arg0 == 6699) {
            field870[++Statics.field3297 - 1] = Statics.field1799.field3276.method6079();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jc.bo(ILdt;ZI)I")
    public static int method4984(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field870[--Statics.field3297];
            class195 var4 = class195.method3383(var3);
            field877[++Statics.field4953 - 1] = var4 == null ? "" : var4.field2009;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field3297 -= 2;
            class195 var5 = class195.method3383(field870[Statics.field3297]);
            int var6 = field870[Statics.field3297 + 1];
            field870[++Statics.field3297 - 1] = var5.method3642(var6);
            field870[++Statics.field3297 - 1] = var5.method3641(var6);
            return 1;
        } else if (arg0 == 6765) {
            class195 var7 = class195.method3383(field870[--Statics.field3297]);
            field870[++Statics.field3297 - 1] = var7 == null ? 0 : var7.field2034;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cg.bv(ILdt;ZB)I")
    public static int method1142(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field870[--Statics.field3297];
            class210 var4 = class210.method5152(var3);
            field877[++Statics.field4953 - 1] = var4 == null ? "" : var4.field2186;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rh.bt(ILdt;ZI)I")
    public static int method7808(int arg0, class82 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("nc.bq(ILdt;ZB)I")
    public static int method6033(int arg0, class82 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("hg.bk(ILdt;ZB)I")
    public static int method3592(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field870[++Statics.field3297 - 1] = client.method5849() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hf.be(ILdt;ZB)I")
    public static int method3484(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field870[--Statics.field3297] == 1;
            client.method6777(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.bc(ILdt;ZI)I")
    public static int method2201(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field870[--Statics.field3297];
            Object var45 = method3227(var44);
            int var46 = field870[--Statics.field3297];
            class542 var47 = client.method2248(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class544.method7198(var46);
            Statics.field4612 = var47.method8862(var45, var48);
            if (Statics.field4612 == null) {
                client.field808 = -1;
                Statics.field5264 = null;
                if (arg0 == 7500) {
                    field870[++Statics.field3297 - 1] = 0;
                }
            } else {
                client.field808 = class544.method5604(var46);
                Statics.field5264 = Statics.field4612.iterator();
                if (arg0 == 7500) {
                    field870[++Statics.field3297 - 1] = Statics.field4612.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field5264 != null && Statics.field5264.hasNext()) {
                field870[++Statics.field3297 - 1] = (Integer) Statics.field5264.next();
            } else {
                field870[++Statics.field3297 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field3297 -= 3;
            int var3 = field870[Statics.field3297];
            int var4 = field870[Statics.field3297 + 1];
            int var5 = field870[Statics.field3297 + 2];
            int var6 = class544.method5604(var4);
            int var7 = class544.method3441(var4);
            int var8 = class544.method7198(var4);
            class543 var9 = class543.method1026(var3);
            class541 var10 = class541.method8722(var6);
            int[] var11 = var10.field5347[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8866(var7);
            if (var14 == null && var10.field5346 != null) {
                var14 = var10.field5346[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class538 var17 = class536.method2596(var16);
                    if (class538.field5332 == var17) {
                        field877[++Statics.field4953 - 1] = "";
                    } else {
                        field870[++Statics.field3297 - 1] = class536.method3416(var16);
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
                class538 var21 = class536.method2596(var11[var19]);
                if (class538.field5332 == var21) {
                    field877[++Statics.field4953 - 1] = (String) var14[var20];
                } else {
                    field870[++Statics.field3297 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field3297 -= 2;
            int var22 = field870[Statics.field3297];
            int var23 = field870[Statics.field3297 + 1];
            int var24 = 0;
            int var25 = class544.method5604(var23);
            int var26 = class544.method3441(var23);
            class543 var27 = class543.method1026(var22);
            class541 var28 = class541.method8722(var25);
            int[] var29 = var28.field5347[var26];
            Object[] var30 = var27.method8866(var26);
            if (var30 == null && var28.field5346 != null) {
                var30 = var28.field5346[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field870[++Statics.field3297 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field3297--;
            int var41 = field870[Statics.field3297];
            class542 var42 = client.method6778(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field4612 = var42.method8862(0, 0);
            int var43 = 0;
            if (Statics.field4612 != null) {
                client.field808 = var41;
                Statics.field5264 = Statics.field4612.iterator();
                var43 = Statics.field4612.size();
            }
            if (arg0 == 7504) {
                field870[++Statics.field3297 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field870[--Statics.field3297];
            class543 var32 = class543.method1026(var31);
            field870[++Statics.field3297 - 1] = var32.field5359;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field870[--Statics.field3297];
            int var34 = -1;
            if (Statics.field4612 != null && var33 >= 0 && var33 < Statics.field4612.size()) {
                var34 = (Integer) Statics.field4612.get(var33);
            }
            field870[++Statics.field3297 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field870[--Statics.field3297];
            Object var36 = method3227(var35);
            int var37 = field870[--Statics.field3297];
            class542 var38 = client.method2248(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class544.method5604(var37) != client.field808) {
                throw new RuntimeException();
            } else if (Statics.field4612 == null && Statics.field4612.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class544.method7198(var37);
                List var40 = var38.method8862(var36, var39);
                Statics.field4612 = new LinkedList(Statics.field4612);
                if (var40 == null) {
                    Statics.field4612.clear();
                } else {
                    Statics.field4612.retainAll(var40);
                }
                Statics.field5264 = Statics.field4612.iterator();
                if (arg0 == 7507) {
                    field870[++Statics.field3297 - 1] = Statics.field4612.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("if.cn(ILdt;ZB)I")
    public static int method3993(int arg0, class82 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ds.ch(ILdt;ZB)I")
    public static int method2556(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 7900) {
            int var3 = field870[--Statics.field3297];
            client.field812 = Math.max(var3, 0);
            return 1;
        } else if (arg0 == 7901) {
            field870[++Statics.field3297 - 1] = client.field812;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ft.cf(ILdt;ZI)I")
    public static int method3104(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field3297--;
            int var3 = field870[Statics.field3297];
            int var4 = field874[var3];
            class545.method3086(field875[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field3297 -= 3;
            int var5 = field870[Statics.field3297];
            int var6 = field870[Statics.field3297 + 1];
            int var7 = field870[Statics.field3297 + 2];
            int var8 = field874[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class451.method7834(field875[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("li.cu(II)V")
    public static void method5693(int arg0) {
        if (arg0 == -1 || !Statics.field2371.method6146(arg0)) {
            return;
        }
        class363[] var1 = Statics.field2371.field3764[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class363 var3 = var1[var2];
            if (var3.field3943 != null) {
                class91 var4 = new class91();
                var4.field1112 = var3;
                var4.field1111 = var3.field3943;
                method2397(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("kg.cj(Lux;I)Ljava/lang/Object;")
    public static Object method5054(class538 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5331) {
            case 1:
                return field877[--Statics.field4953];
            case 2:
                return field870[--Statics.field3297];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("fo.cx(II)Ljava/lang/Object;")
    public static Object method3227(int arg0) {
        return method5054((class538) class405.method6719(class538.method8833(), arg0));
    }
}
